package com.example.smart_life;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p000.AbstractC0148ds;
import p000.AbstractC0638qt;
import p000.AbstractC0675rt;
import p000.C0000a;
import p000.C0046b3;
import p000.cp1;
import p000.d60;
import p000.fr1;
import p000.rp2;
import p000.tr2;
import p000.vu0;
import p000.y51;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class PcShareActivity extends Activity {

    /* renamed from: b */
    public static final /* synthetic */ int f1429b = 0;

    /* renamed from: a */
    public final fr1 f1430a = new fr1(new C0046b3(10, this));

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: all -> 0x00b6, TryCatch #2 {all -> 0x00b6, blocks: (B:3:0x005c, B:7:0x006e, B:15:0x0082, B:17:0x0088, B:22:0x00b2, B:33:0x00c2, B:38:0x00e1, B:39:0x00e6, B:37:0x00cb, B:29:0x00bb, B:30:0x00be, B:49:0x00f2, B:50:0x00f5, B:47:0x00f0, B:4:0x0061, B:6:0x006b, B:45:0x00ec, B:46:0x00ef), top: B:57:0x005c, inners: #0, #3 }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m835c(String str, int i, String str2, File file, String str3, String str4) throws IOException {
        String string;
        String str5;
        InputStream errorStream;
        URLConnection uRLConnectionOpenConnection = new URL("http://" + str + ":" + i + "/upload").openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setConnectTimeout(6000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("Content-Type", str4);
        httpURLConnection.setRequestProperty("X-Smart-Life-Code", str2);
        httpURLConnection.setRequestProperty("X-Smart-Life-FileName", URLEncoder.encode(str3, "UTF-8"));
        httpURLConnection.setFixedLengthStreamingMode(file.length());
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.getClass();
                    rp2.m4053a(fileInputStream, outputStream);
                    outputStream.close();
                    fileInputStream.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (200 > responseCode || responseCode >= 300) {
                        try {
                            errorStream = httpURLConnection.getErrorStream();
                        } catch (Exception unused) {
                        }
                        if (errorStream != null) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, AbstractC0148ds.f1981a), 8192);
                            try {
                                StringWriter stringWriter = new StringWriter();
                                char[] cArr = new char[8192];
                                for (int i2 = bufferedReader.read(cArr); i2 >= 0; i2 = bufferedReader.read(cArr)) {
                                    stringWriter.write(cArr, 0, i2);
                                }
                                string = stringWriter.toString();
                                string.getClass();
                                bufferedReader.close();
                            } finally {
                            }
                        } else {
                            string = null;
                        }
                        if (string == null) {
                            str5 = "PC receiver returned " + responseCode + ".";
                        } else {
                            str5 = cp1.m880j(string) ? null : string;
                            if (str5 == null) {
                            }
                        }
                        throw new IllegalStateException(str5);
                    }
                } finally {
                }
            } finally {
            }
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* renamed from: a */
    public final void m836a(Intent intent) {
        String action = intent.getAction();
        List listM4089b = d60.f1716l;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1173264947) {
                if (iHashCode == -58484670 && action.equals("android.intent.action.SEND_MULTIPLE")) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM", Uri.class);
                        if (parcelableArrayListExtra != null) {
                            listM4089b = AbstractC0638qt.m3836y(parcelableArrayListExtra);
                        }
                    } else {
                        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
                        if (parcelableArrayListExtra2 != null) {
                            listM4089b = AbstractC0638qt.m3836y(parcelableArrayListExtra2);
                        }
                    }
                }
            } else if (action.equals("android.intent.action.SEND")) {
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) intent.getParcelableExtra("android.intent.extra.STREAM", Uri.class) : (Uri) intent.getParcelableExtra("android.intent.extra.STREAM");
                if (uri != null) {
                    listM4089b = AbstractC0675rt.m4089b(uri);
                }
            }
        }
        List list = listM4089b;
        if (list.isEmpty()) {
            Toast.makeText(this, "No file was received from Android Share.", 1).show();
            finish();
            return;
        }
        fr1 fr1Var = this.f1430a;
        String string = ((SharedPreferences) fr1Var.getValue()).getString("host", "");
        String string2 = string != null ? cp1.m889s(string).toString() : null;
        String str = string2 == null ? "" : string2;
        int i = ((SharedPreferences) fr1Var.getValue()).getInt("port", 8765);
        String string3 = ((SharedPreferences) fr1Var.getValue()).getString("code", "");
        String string4 = string3 != null ? cp1.m889s(string3).toString() : null;
        String str2 = string4 == null ? "" : string4;
        if (!cp1.m880j(str) && !cp1.m880j(str2)) {
            new Thread(new vu0(list, this, str, i, str2)).start();
        } else {
            Toast.makeText(this, "Open Smart Life > Settings > Connect to PC first.", 1).show();
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100 A[LOOP:0: B:53:0x00fa->B:55:0x0100, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0127 A[Catch: all -> 0x0154, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0154, blocks: (B:58:0x0127, B:60:0x012f, B:75:0x015b, B:76:0x015e, B:77:0x015f, B:78:0x0166, B:59:0x012c, B:73:0x0159), top: B:87:0x0125, inners: #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f A[Catch: all -> 0x0154, TryCatch #2 {all -> 0x0154, blocks: (B:58:0x0127, B:60:0x012f, B:75:0x015b, B:76:0x015e, B:77:0x015f, B:78:0x0166, B:59:0x012c, B:73:0x0159), top: B:87:0x0125, inners: #4, #6 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y51 m837b(Uri uri) {
        Uri uri2;
        Throwable th;
        Cursor cursorQuery;
        String string;
        String string2;
        String strM888r;
        String type;
        File file;
        File file2;
        InputStream inputStreamOpenInputStream;
        int columnIndex;
        Cursor cursor = null;
        try {
            try {
                uri2 = uri;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused) {
            uri2 = uri;
        }
        try {
            cursorQuery = getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) ? null : cursorQuery.getString(columnIndex);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Exception unused2) {
                    if (cursorQuery != null) {
                    }
                    string = null;
                    if (string == null) {
                    }
                    String string3 = cp1.m889s(string).toString();
                    Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]+");
                    patternCompile.getClass();
                    string3.getClass();
                    String strReplaceAll = patternCompile.matcher(string3).replaceAll("_");
                    strReplaceAll.getClass();
                    Pattern patternCompile2 = Pattern.compile("\\s+");
                    patternCompile2.getClass();
                    String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
                    strReplaceAll2.getClass();
                    string2 = cp1.m889s(strReplaceAll2).toString();
                    if (cp1.m880j(string2)) {
                    }
                    type = getContentResolver().getType(uri2);
                    if (type == null) {
                    }
                    file = new File(getCacheDir(), "pc_share");
                    if (file.exists()) {
                    }
                    int iM881k = cp1.m881k(strM888r);
                    if (iM881k > 0) {
                    }
                    if (iM881k > 0) {
                    }
                    file2 = new File(file, strM888r);
                    int i = 2;
                    while (file2.exists()) {
                    }
                    inputStreamOpenInputStream = getContentResolver().openInputStream(uri2);
                    try {
                        if (inputStreamOpenInputStream == null) {
                        }
                    } catch (Throwable th3) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            tr2.m4488a(inputStreamOpenInputStream, th3);
                            throw th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cursor = cursorQuery;
                    if (cursor == null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            }
        } catch (Exception unused3) {
            cursorQuery = null;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            string = null;
            if (string == null) {
            }
            String string32 = cp1.m889s(string).toString();
            Pattern patternCompile3 = Pattern.compile("[\\\\/:*?\"<>|]+");
            patternCompile3.getClass();
            string32.getClass();
            String strReplaceAll3 = patternCompile3.matcher(string32).replaceAll("_");
            strReplaceAll3.getClass();
            Pattern patternCompile22 = Pattern.compile("\\s+");
            patternCompile22.getClass();
            String strReplaceAll22 = patternCompile22.matcher(strReplaceAll3).replaceAll(" ");
            strReplaceAll22.getClass();
            string2 = cp1.m889s(strReplaceAll22).toString();
            if (cp1.m880j(string2)) {
            }
            type = getContentResolver().getType(uri2);
            if (type == null) {
            }
            file = new File(getCacheDir(), "pc_share");
            if (file.exists()) {
            }
            int iM881k2 = cp1.m881k(strM888r);
            if (iM881k2 > 0) {
            }
            if (iM881k2 > 0) {
            }
            file2 = new File(file, strM888r);
            int i2 = 2;
            while (file2.exists()) {
            }
            inputStreamOpenInputStream = getContentResolver().openInputStream(uri2);
            if (inputStreamOpenInputStream == null) {
            }
        }
        if (string == null) {
            string = "SmartLife_" + System.currentTimeMillis();
        }
        String string322 = cp1.m889s(string).toString();
        Pattern patternCompile32 = Pattern.compile("[\\\\/:*?\"<>|]+");
        patternCompile32.getClass();
        string322.getClass();
        String strReplaceAll32 = patternCompile32.matcher(string322).replaceAll("_");
        strReplaceAll32.getClass();
        Pattern patternCompile222 = Pattern.compile("\\s+");
        patternCompile222.getClass();
        String strReplaceAll222 = patternCompile222.matcher(strReplaceAll32).replaceAll(" ");
        strReplaceAll222.getClass();
        string2 = cp1.m889s(strReplaceAll222).toString();
        if (cp1.m880j(string2)) {
            strM888r = "SmartLife_" + System.currentTimeMillis();
        } else {
            strM888r = cp1.m888r(160, string2);
        }
        type = getContentResolver().getType(uri2);
        if (type == null) {
            type = "application/octet-stream";
        }
        file = new File(getCacheDir(), "pc_share");
        if (file.exists() && !file.mkdirs()) {
            C0000a.m5g("Could not prepare temporary transfer storage.");
            return null;
        }
        int iM881k22 = cp1.m881k(strM888r);
        String strSubstring = iM881k22 > 0 ? strM888r.substring(0, iM881k22) : strM888r;
        String strSubstring2 = iM881k22 > 0 ? strM888r.substring(iM881k22) : "";
        file2 = new File(file, strM888r);
        int i22 = 2;
        while (file2.exists()) {
            file2 = new File(file, strSubstring + " " + i22 + strSubstring2);
            i22++;
        }
        inputStreamOpenInputStream = getContentResolver().openInputStream(uri2);
        if (inputStreamOpenInputStream == null) {
            throw new IllegalStateException("Could not read the shared file.");
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            rp2.m4053a(inputStreamOpenInputStream, fileOutputStream);
            fileOutputStream.close();
            inputStreamOpenInputStream.close();
            if (file2.isFile() && file2.length() > 0) {
                return new y51(file2, strM888r, type);
            }
            file2.delete();
            C0000a.m5g("The shared file was empty.");
            return null;
        } finally {
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        m836a(intent);
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            m836a(intent);
        }
    }
}
