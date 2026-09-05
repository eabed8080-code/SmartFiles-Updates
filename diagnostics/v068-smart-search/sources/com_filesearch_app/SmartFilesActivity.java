package com.filesearch.app;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Arrays;
import p000.cw2;
import p000.d14;
import p000.f23;
import p000.fo2;
import p000.hj0;
import p000.ij0;
import p000.pm1;
import p000.wr1;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public class SmartFilesActivity extends Activity {

    /* renamed from: a */
    public static final /* synthetic */ int f1431a = 0;

    /* renamed from: a */
    public static String m838a(String str, Throwable th) {
        StackTraceElement stackTraceElement;
        String str2;
        String message = th.getMessage();
        if (message == null || message.trim().isEmpty()) {
            message = th.getClass().getSimpleName();
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                stackTraceElement = null;
                break;
            }
            stackTraceElement = stackTrace[i];
            String className = stackTraceElement.getClassName();
            if (className.startsWith("com.google.mlkit") || className.startsWith("com.google.android.gms")) {
                break;
            }
            i++;
        }
        if (stackTraceElement == null && th.getStackTrace().length > 0) {
            stackTraceElement = th.getStackTrace()[0];
        }
        if (stackTraceElement == null) {
            str2 = "";
        } else {
            str2 = " @ " + stackTraceElement.getClassName().substring(stackTraceElement.getClassName().lastIndexOf(46) + 1) + "." + stackTraceElement.getMethodName() + ":" + stackTraceElement.getLineNumber();
        }
        return "Google document scanner " + str + " failed: " + message + str2;
    }

    /* renamed from: b */
    public final void m839b(String str) {
        setResult(1, new Intent().putExtra("smart_life_scan_error", str));
        finish();
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 2204) {
            return;
        }
        if (i2 != -1 || intent == null) {
            setResult(0);
            finish();
            return;
        }
        try {
            cw2 cw2Var = (cw2) intent.getParcelableExtra("extra_scanning_result");
            if (cw2Var == null || cw2Var.f1594l == null || cw2Var.f1594l.isEmpty()) {
                throw new IllegalStateException("Scanner returned no saved page.");
            }
            Uri uri = ((f23) cw2Var.f1594l.get(0)).f2675l;
            File file = new File(getCacheDir(), "SmartLifeScannerBridge");
            if (!file.exists() && !file.mkdirs()) {
                throw new IllegalStateException("Could not prepare scanner storage.");
            }
            File file2 = new File(file, "scan_" + System.currentTimeMillis() + ".jpg");
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("Could not read scanned page.");
                    }
                    byte[] bArr = new byte[65536];
                    while (true) {
                        int i3 = inputStreamOpenInputStream.read(bArr);
                        if (i3 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i3);
                        }
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    if (!file2.isFile() || file2.length() <= 0) {
                        throw new IllegalStateException("Scanned page was empty.");
                    }
                    setResult(-1, new Intent().putExtra("smart_life_scan_path", file2.getAbsolutePath()));
                    finish();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            m839b(m838a("save", th));
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            hj0 hj0Var = new hj0();
            hj0Var.f3677a = false;
            hj0Var.f3678b = 1;
            int[] iArrCopyOf = Arrays.copyOf(new int[0], 1);
            hj0Var.f3679c = iArrCopyOf;
            iArrCopyOf[0] = 101;
            hj0Var.f3680d = true;
            hj0Var.f3681e = true;
            hj0Var.f3682f = true;
            hj0Var.f3683g = true;
            try {
                d14 d14VarM1671b = new fo2(new ij0(hj0Var)).m1671b(this);
                d14VarM1671b.m984b(wr1.f10747a, new pm1(this));
                d14VarM1671b.m983a(new pm1(this));
            } catch (Throwable th) {
                m839b(m838a("create", th));
            }
        }
    }
}
