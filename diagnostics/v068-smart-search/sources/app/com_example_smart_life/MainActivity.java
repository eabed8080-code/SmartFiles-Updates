package com.example.smart_life;

import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Size;
import com.example.smart_life.MainActivity;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import p000.AbstractC0638qt;
import p000.AbstractC0675rt;
import p000.AbstractC0712st;
import p000.C0000a;
import p000.C0641qw;
import p000.C0910y5;
import p000.ad0;
import p000.ah0;
import p000.bd0;
import p000.cp1;
import p000.d60;
import p000.d61;
import p000.dx0;
import p000.e61;
import p000.fr1;
import p000.j22;
import p000.km0;
import p000.m63;
import p000.mc0;
import p000.on1;
import p000.p51;
import p000.qf0;
import p000.rp2;
import p000.sv0;
import p000.za0;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class MainActivity extends bd0 {

    /* renamed from: S */
    public static final /* synthetic */ int f1409S = 0;

    /* renamed from: E */
    public dx0 f1414E;

    /* renamed from: G */
    public dx0 f1416G;

    /* renamed from: H */
    public dx0 f1417H;

    /* renamed from: I */
    public dx0 f1418I;

    /* renamed from: J */
    public dx0 f1419J;

    /* renamed from: N */
    public int f1423N;

    /* renamed from: O */
    public File f1424O;

    /* renamed from: P */
    public final fr1 f1425P;

    /* renamed from: Q */
    public final fr1 f1426Q;

    /* renamed from: R */
    public final fr1 f1427R;

    /* renamed from: z */
    public final String f1428z = "smart_life/native";

    /* renamed from: A */
    public final int f1410A = 4401;

    /* renamed from: B */
    public final int f1411B = 4404;

    /* renamed from: C */
    public final int f1412C = 4402;

    /* renamed from: D */
    public final int f1413D = 4402;

    /* renamed from: F */
    public final int f1415F = 4402;

    /* renamed from: K */
    public String f1420K = "general";

    /* renamed from: L */
    public String f1421L = on1.f7216a;

    /* renamed from: M */
    public int f1422M = 1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MainActivity() {
        final int i = 0;
        this.f1425P = new fr1(new ah0(this) { // from class: qu0

            /* renamed from: m */
            public final /* synthetic */ MainActivity f8301m;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8301m = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.ah0
            /* renamed from: a */
            public final Object mo39a() {
                int i2 = i;
                MainActivity mainActivity = this.f8301m;
                switch (i2) {
                    case 0:
                        int i3 = MainActivity.f1409S;
                        return mainActivity.getSharedPreferences("smart_life_documents", 0);
                    case 1:
                        int i4 = MainActivity.f1409S;
                        return mainActivity.getSharedPreferences("smart_life_pc_receiver", 0);
                    default:
                        int i5 = MainActivity.f1409S;
                        return new e61(mainActivity);
                }
            }
        });
        final int i2 = 1;
        this.f1426Q = new fr1(new ah0(this) { // from class: qu0

            /* renamed from: m */
            public final /* synthetic */ MainActivity f8301m;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8301m = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.ah0
            /* renamed from: a */
            public final Object mo39a() {
                int i22 = i2;
                MainActivity mainActivity = this.f8301m;
                switch (i22) {
                    case 0:
                        int i3 = MainActivity.f1409S;
                        return mainActivity.getSharedPreferences("smart_life_documents", 0);
                    case 1:
                        int i4 = MainActivity.f1409S;
                        return mainActivity.getSharedPreferences("smart_life_pc_receiver", 0);
                    default:
                        int i5 = MainActivity.f1409S;
                        return new e61(mainActivity);
                }
            }
        });
        final int i3 = 2;
        this.f1427R = new fr1(new ah0(this) { // from class: qu0

            /* renamed from: m */
            public final /* synthetic */ MainActivity f8301m;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f8301m = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.ah0
            /* renamed from: a */
            public final Object mo39a() {
                int i22 = i3;
                MainActivity mainActivity = this.f8301m;
                switch (i22) {
                    case 0:
                        int i32 = MainActivity.f1409S;
                        return mainActivity.getSharedPreferences("smart_life_documents", 0);
                    case 1:
                        int i4 = MainActivity.f1409S;
                        return mainActivity.getSharedPreferences("smart_life_pc_receiver", 0);
                    default:
                        int i5 = MainActivity.f1409S;
                        return new e61(mainActivity);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: C */
    public static Bitmap m811C(File file) {
        int i;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        int i2 = options.outWidth;
        if (i2 <= 0 || (i = options.outHeight) <= 0) {
            return null;
        }
        int iMax = Math.max(i2, i);
        int i3 = 1;
        while (iMax / i3 > 2400) {
            i3 *= 2;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = Math.max(1, i3);
        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options2.inDither = false;
        return BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: E */
    public static Map m812E(File file, String str) {
        return sv0.m4312c(new p51("path", file.getAbsolutePath()), new p51("name", file.getName()), new p51("size", Long.valueOf(file.length())), new p51("modifiedMs", Long.valueOf(file.lastModified())), new p51("category", str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: M */
    public static boolean m813M(int i, String str, String str2) throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL("http://" + str + ":" + i + "/ping").openConnection();
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setConnectTimeout(4000);
        httpURLConnection.setReadTimeout(4000);
        boolean z = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty("X-Smart-Life-Code", str2);
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (200 <= responseCode && responseCode < 300) {
                z = true;
            }
            return z;
        } finally {
            httpURLConnection.disconnect();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: O */
    public static String m814O(String str) {
        String string = cp1.m889s(str).toString();
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]+");
        patternCompile.getClass();
        string.getClass();
        String strReplaceAll = patternCompile.matcher(string).replaceAll(" ");
        strReplaceAll.getClass();
        Pattern patternCompile2 = Pattern.compile("\\s+");
        patternCompile2.getClass();
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll(" ");
        strReplaceAll2.getClass();
        String string2 = cp1.m889s(strReplaceAll2).toString();
        return cp1.m880j(string2) ? on1.f7216a : cp1.m888r(80, string2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: Q */
    public static String m815Q() {
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US).format(new Date());
        str.getClass();
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: S */
    public static File m816S(File file, String str) {
        File file2 = new File(file, str.concat(".jpg"));
        int i = 2;
        while (file2.exists()) {
            file2 = new File(file, str + " " + i + ".jpg");
            i++;
        }
        return file2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:389:0x079a
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1178)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:389:0x079a) to fix multi-entry loop: BACK_EDGE: B:389:0x079a -> B:830:0x0f21 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Type inference failed for r0v230. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r11v6. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x09a8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x09dc  */
    /* JADX WARN: Type inference failed for: r0v211, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v241, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v34, types: [java.io.File] */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m817w(final com.example.smart_life.MainActivity r37, p000.vb0 r38, final p000.dx0 r39) {
        /*
            r1 = r37
            r0 = r38
            r7 = r39
            java.lang.String r2 = "Could not delete document."
            java.lang.String r3 = "Could not rename document."
            java.lang.String r4 = "."
            d60 r5 = p000.d60.f1716l
            java.lang.String r6 = "package:"
            r0.getClass()
            java.lang.Object r8 = r0.f10199m
            java.lang.String r8 = (java.lang.String) r8
            int r9 = r8.hashCode()
            java.lang.String r10 = "Missing PDF file path."
            java.lang.String r13 = "android.speech.extra.MAX_RESULTS"
            java.lang.String r14 = "android.speech.extra.PROMPT"
            java.lang.String r15 = "free_form"
            java.lang.String r11 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r12 = "android.speech.action.RECOGNIZE_SPEECH"
            r16 = r5
            java.lang.String r5 = "android.intent.action.VIEW"
            r17 = r9
            java.lang.String r9 = ".fileProvider"
            java.lang.String r18 = "Document"
            r19 = r2
            java.lang.String r2 = "label"
            r20 = r10
            java.lang.String r10 = "category"
            r21 = r13
            java.lang.String r13 = "id"
            r22 = r14
        */
        //  java.lang.String r14 = "*/*"
        /*
            r23 = r11
            java.lang.String r11 = "name"
            r24 = r15
            java.lang.String r15 = "modifiedMs"
            r25 = r12
            java.lang.String r12 = "general"
            r26 = r12
            java.lang.String r12 = "uri"
            r27 = r6
            java.lang.String r6 = "TASK_REMINDER"
            r28 = r6
            java.lang.String r6 = "port"
            r29 = r3
            java.lang.String r3 = "code"
            r30 = r4
            java.lang.String r4 = "host"
            r31 = r11
            r32 = 0
            java.lang.String r11 = "path"
            r34 = r5
            java.lang.String r5 = ""
            r36 = r6
            r6 = 0
            switch(r17) {
                case -2083052259: goto Lea0;
                case -2051985736: goto Le53;
                case -2003722063: goto Lde5;
                case -1998510622: goto Ldb0;
                case -1961850330: goto Ld5f;
                case -1818764724: goto Lbbf;
                case -1256422350: goto Lb8d;
                case -1191256090: goto Lb28;
                case -1052051588: goto Laf6;
                case -989479540: goto Ladc;
                case -904246662: goto Laaa;
                case -661911355: goto La3a;
                case -542127308: goto L97d;
                case -525900343: goto L921;
                case -157421553: goto L884;
                case -139329693: goto L83a;
                case -73595526: goto L7ec;
                case 46485560: goto L7c6;
                case 181834682: goto L7a1;
                case 231766290: goto L6ee;
                case 285736742: goto L6d4;
                case 293033852: goto L6ba;
                case 454709213: goto L688;
                case 552488569: goto L575;
                case 654368484: goto L52b;
                case 775464034: goto L503;
                case 812421067: goto L4df;
                case 900412033: goto L3e0;
                case 914557658: goto L3ae;
                case 1059305772: goto L377;
                case 1093347211: goto L25d;
                case 1105594216: goto L22b;
                case 1348419894: goto L1fa;
                case 1581927041: goto L15a;
                case 1642053966: goto Lea;
                case 1981629240: goto L96;
                case 2000322392: goto L74;
                default: goto L71;
            }
        L71:
            r11 = r7
            goto Leb4
        L74:
            java.lang.String r0 = "updateApkPath"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L7d
            goto L71
        L7d:
            java.io.File r0 = r1.getExternalCacheDir()
            if (r0 != 0) goto L87
            java.io.File r0 = r1.getCacheDir()
        L87:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "Smart-Life-Update.apk"
            r1.<init>(r0, r2)
            java.lang.String r0 = r1.getAbsolutePath()
            r7.m1212d(r0)
            return
        L96:
            java.lang.String r2 = "pickConverterFiles"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L9f
            goto L71
        L9f:
            dx0 r2 = r1.f1414E
            if (r2 == 0) goto Lab
            java.lang.String r0 = "CONVERTER_PICK_BUSY"
            java.lang.String r1 = "A file picker is already open."
            r7.m1210a(r0, r1, r6)
            return
        Lab:
            java.lang.String r2 = "allowMultiple"
            java.lang.Object r0 = r0.m4787F(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto Lba
            boolean r5 = r0.booleanValue()
            goto Lbb
        Lba:
            r5 = 0
        Lbb:
            r1.f1414E = r7
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> Ld8
            java.lang.String r2 = "android.intent.action.OPEN_DOCUMENT"
            r0.<init>(r2)     // Catch: java.lang.Exception -> Ld8
            java.lang.String r2 = "android.intent.category.OPENABLE"
            r0.addCategory(r2)     // Catch: java.lang.Exception -> Ld8
            r0.setType(r14)     // Catch: java.lang.Exception -> Ld8
            java.lang.String r2 = "android.intent.extra.ALLOW_MULTIPLE"
            r0.putExtra(r2, r5)     // Catch: java.lang.Exception -> Ld8
            int r2 = r1.f1413D     // Catch: java.lang.Exception -> Ld8
            r1.startActivityForResult(r0, r2)     // Catch: java.lang.Exception -> Ld8
            goto Lf21
        Ld8:
            r0 = move-exception
            r1.f1414E = r6
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Le3
            java.lang.String r0 = "Could not open the Android file picker."
        Le3:
            java.lang.String r1 = "CONVERTER_PICK"
            r7.m1210a(r1, r0, r6)
            goto Lf21
        Lea:
            java.lang.String r2 = "scheduleTaskReminder"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Lf4
            goto L71
        Lf4:
            java.lang.Object r2 = r0.m4787F(r13)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "title"
            java.lang.Object r3 = r0.m4787F(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "whenMs"
            java.lang.Object r0 = r0.m4787F(r4)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L115
            long r4 = r0.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            goto L116
        L115:
            r0 = r6
        L116:
            if (r2 == 0) goto L12a
            boolean r4 = p000.cp1.m880j(r2)
            if (r4 == 0) goto L11f
            goto L12a
        L11f:
            if (r3 == 0) goto L12a
            boolean r4 = p000.cp1.m880j(r3)
            if (r4 == 0) goto L128
            goto L12a
        L128:
            if (r0 != 0) goto L12e
        L12a:
            r12 = r6
            r9 = r28
            goto L154
        L12e:
            long r4 = r0.longValue()     // Catch: java.lang.Exception -> L143
            r8 = r6
            r6 = 1
            r12 = r8
            r9 = r28
            p000.yi3.m5241a(r1, r2, r3, r4, r6)     // Catch: java.lang.Exception -> L141
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L141
            r7.m1212d(r0)     // Catch: java.lang.Exception -> L141
            goto Lf21
        L141:
            r0 = move-exception
            goto L147
        L143:
            r0 = move-exception
            r12 = r6
            r9 = r28
        L147:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L14f
            java.lang.String r0 = "Could not schedule this reminder."
        L14f:
            r7.m1210a(r9, r0, r12)
            goto Lf21
        L154:
            java.lang.String r0 = "Missing reminder information."
            r7.m1210a(r9, r0, r12)
            return
        L15a:
            r12 = r6
            java.lang.String r2 = "savePcReceiverConfig"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L165
            goto L71
        L165:
            java.lang.Object r2 = r0.m4787F(r4)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L176
            java.lang.CharSequence r2 = p000.cp1.m889s(r2)
            java.lang.String r6 = r2.toString()
            goto L177
        L176:
            r6 = r12
        L177:
            if (r6 != 0) goto L17a
            r6 = r5
        L17a:
            java.lang.Object r2 = r0.m4787F(r3)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L18b
            java.lang.CharSequence r2 = p000.cp1.m889s(r2)
            java.lang.String r2 = r2.toString()
            goto L18c
        L18b:
            r2 = r12
        L18c:
            if (r2 != 0) goto L191
        L18e:
            r2 = r36
            goto L193
        L191:
            r5 = r2
            goto L18e
        L193:
            java.lang.Object r0 = r0.m4787F(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L1a4
            int r0 = r0.intValue()
        L19f:
            r8 = 65535(0xffff, float:9.1834E-41)
            r9 = 1
            goto L1a7
        L1a4:
            r0 = 8765(0x223d, float:1.2282E-41)
            goto L19f
        L1a7:
            int r0 = p000.eg3.m1439b(r0, r9, r8)
            boolean r8 = p000.cp1.m880j(r6)
            if (r8 != 0) goto L1f2
            boolean r8 = p000.cp1.m880j(r5)
            if (r8 == 0) goto L1b8
            goto L1f2
        L1b8:
            android.content.SharedPreferences r8 = r1.m824I()
            android.content.SharedPreferences$Editor r8 = r8.edit()
            android.content.SharedPreferences$Editor r4 = r8.putString(r4, r6)
            android.content.SharedPreferences$Editor r0 = r4.putInt(r2, r0)
            android.content.SharedPreferences$Editor r0 = r0.putString(r3, r5)
            r0.apply()
            fr1 r0 = r1.f1427R
            java.lang.Object r0 = r0.getValue()
            e61 r0 = (p000.e61) r0
            boolean r1 = r0.f2181d
            if (r1 != 0) goto L1dc
            goto L1ec
        L1dc:
            java.lang.Thread r1 = new java.lang.Thread
            d61 r2 = new d61
            r9 = 1
            r2.<init>(r0, r9)
            java.lang.String r0 = "SmartLifePhoneRegister"
            r1.<init>(r2, r0)
            r1.start()
        L1ec:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.m1212d(r0)
            return
        L1f2:
            java.lang.String r0 = "PC_CONFIG"
            java.lang.String r1 = "PC address and pairing code are required."
            r7.m1210a(r0, r1, r12)
            return
        L1fa:
            java.lang.String r2 = "photoPreview"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L204
            goto L71
        L204:
            java.lang.Object r2 = r0.m4787F(r12)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L20d
            r2 = r5
        L20d:
            java.lang.Object r0 = r0.m4787F(r15)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L219
            long r32 = r0.longValue()
        L219:
            r3 = r32
            java.lang.Thread r8 = new java.lang.Thread
            ru0 r0 = new ru0
            r6 = 0
            r5 = r7
            r0.<init>(r1)
            r8.<init>(r0)
            r8.start()
            return
        L22b:
            r12 = r6
            r4 = r7
            java.lang.String r2 = "convertOfficeToPdf"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L238
        L235:
            r11 = r4
            goto Leb4
        L238:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L255
            boolean r2 = p000.cp1.m880j(r0)
            if (r2 == 0) goto L247
            goto L255
        L247:
            java.lang.Thread r2 = new java.lang.Thread
            tu0 r3 = new tu0
            r3.<init>(r0, r1, r4)
            r2.<init>(r3)
            r2.start()
            return
        L255:
            java.lang.String r0 = "OFFICE_PDF"
            java.lang.String r1 = "Missing Office file path."
            r4.m1210a(r0, r1, r12)
            return
        L25d:
            r12 = r6
            r4 = r7
            java.lang.String r3 = "saveLocalScan"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L268
        L267:
            goto L235
        L268:
            java.lang.String r3 = "frontPath"
            java.lang.Object r3 = r0.m4787F(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r5 = "backPath"
            java.lang.Object r5 = r0.m4787F(r5)
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r0.m4787F(r10)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L283
            r5 = r26
        L283:
            java.lang.Object r0 = r0.m4787F(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L28d
            r0 = r18
        L28d:
            java.lang.String r2 = "LOCAL_SCAN_SAVE"
            if (r3 == 0) goto L371
            boolean r7 = p000.cp1.m880j(r3)
            if (r7 == 0) goto L299
            goto L371
        L299:
            java.io.File r7 = new java.io.File     // Catch: java.lang.Exception -> L2c1
            r7.<init>(r3)     // Catch: java.lang.Exception -> L2c1
            boolean r3 = r7.isFile()     // Catch: java.lang.Exception -> L2c1
            if (r3 == 0) goto L35e
            long r8 = r7.length()     // Catch: java.lang.Exception -> L2c1
            int r3 = (r8 > r32 ? 1 : (r8 == r32 ? 0 : -1))
            if (r3 > 0) goto L2ae
            goto L35e
        L2ae:
            if (r6 == 0) goto L2c4
            boolean r3 = p000.cp1.m880j(r6)     // Catch: java.lang.Exception -> L2c1
            if (r3 != 0) goto L2b7
            goto L2b8
        L2b7:
            r6 = r12
        L2b8:
            if (r6 == 0) goto L2c4
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L2c1
            r3.<init>(r6)     // Catch: java.lang.Exception -> L2c1
            r6 = r3
            goto L2c5
        L2c1:
            r0 = move-exception
            goto L364
        L2c4:
            r6 = r12
        L2c5:
            if (r6 == 0) goto L2e4
            boolean r3 = r6.isFile()     // Catch: java.lang.Exception -> L2c1
            if (r3 == 0) goto L2e4
            long r8 = r6.length()     // Catch: java.lang.Exception -> L2c1
            int r3 = (r8 > r32 ? 1 : (r8 == r32 ? 0 : -1))
            if (r3 <= 0) goto L2e4
            java.lang.String r3 = r1.f1421L     // Catch: java.lang.Exception -> L2c1
            r1.f1421L = r0     // Catch: java.lang.Throwable -> L2e0
            java.io.File r0 = r1.m833y(r7, r6)     // Catch: java.lang.Throwable -> L2e0
            r1.f1421L = r3     // Catch: java.lang.Exception -> L2c1
            goto L329
        L2e0:
            r0 = move-exception
            r1.f1421L = r3     // Catch: java.lang.Exception -> L2c1
            throw r0     // Catch: java.lang.Exception -> L2c1
        L2e4:
            java.io.File r3 = r1.m821F()     // Catch: java.lang.Exception -> L2c1
            java.lang.String r0 = m814O(r0)     // Catch: java.lang.Exception -> L2c1
            java.lang.String r6 = m815Q()     // Catch: java.lang.Exception -> L2c1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2c1
            r8.<init>()     // Catch: java.lang.Exception -> L2c1
            r8.append(r0)     // Catch: java.lang.Exception -> L2c1
            java.lang.String r0 = "_"
            r8.append(r0)     // Catch: java.lang.Exception -> L2c1
            r8.append(r6)     // Catch: java.lang.Exception -> L2c1
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Exception -> L2c1
            java.io.File r0 = m816S(r3, r0)     // Catch: java.lang.Exception -> L2c1
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L2c1
            r3.<init>(r7)     // Catch: java.lang.Exception -> L2c1
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L34d
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L34d
            p000.rp2.m4054b(r3, r6)     // Catch: java.lang.Throwable -> L350
            p000.tr2.m4488a(r6, r12)     // Catch: java.lang.Throwable -> L34d
            p000.tr2.m4488a(r3, r12)     // Catch: java.lang.Exception -> L2c1
            boolean r3 = r0.isFile()     // Catch: java.lang.Exception -> L2c1
            if (r3 == 0) goto L345
            long r6 = r0.length()     // Catch: java.lang.Exception -> L2c1
            int r3 = (r6 > r32 ? 1 : (r6 == r32 ? 0 : -1))
            if (r3 <= 0) goto L345
        L329:
            android.content.SharedPreferences r1 = r1.m823H()     // Catch: java.lang.Exception -> L2c1
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L2c1
            java.lang.String r3 = r0.getAbsolutePath()     // Catch: java.lang.Exception -> L2c1
            android.content.SharedPreferences$Editor r1 = r1.putString(r3, r5)     // Catch: java.lang.Exception -> L2c1
            r1.apply()     // Catch: java.lang.Exception -> L2c1
            java.util.Map r0 = m812E(r0, r5)     // Catch: java.lang.Exception -> L2c1
            r4.m1212d(r0)     // Catch: java.lang.Exception -> L2c1
            goto Lf21
        L345:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L2c1
            java.lang.String r1 = "Saved scan was empty."
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2c1
            throw r0     // Catch: java.lang.Exception -> L2c1
        L34d:
            r0 = move-exception
            r1 = r0
            goto L358
        L350:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L353
        L353:
            r0 = move-exception
            p000.tr2.m4488a(r6, r1)     // Catch: java.lang.Throwable -> L34d
            throw r0     // Catch: java.lang.Throwable -> L34d
        L358:
            throw r1     // Catch: java.lang.Throwable -> L359
        L359:
            r0 = move-exception
            p000.tr2.m4488a(r3, r1)     // Catch: java.lang.Exception -> L2c1
            throw r0     // Catch: java.lang.Exception -> L2c1
        L35e:
            java.lang.String r0 = "The scanned image was empty."
            r4.m1210a(r2, r0, r12)     // Catch: java.lang.Exception -> L2c1
            return
        L364:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L36c
            java.lang.String r0 = "Could not save this scan."
        L36c:
            r4.m1210a(r2, r0, r12)
            goto Lf21
        L371:
            java.lang.String r0 = "The scanned image was missing."
            r4.m1210a(r2, r0, r12)
            return
        L377:
            r12 = r6
            r4 = r7
            java.lang.String r2 = "convertImagesToPdf"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L383
            goto L267
        L383:
            java.lang.String r2 = "paths"
            java.lang.Object r0 = r0.m4787F(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L390
            r5 = r16
            goto L391
        L390:
            r5 = r0
        L391:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L39f
            java.lang.String r0 = "CONVERTER_IMAGES_PDF"
            java.lang.String r1 = "Choose at least one image."
            r4.m1210a(r0, r1, r12)
            return
        L39f:
            java.lang.Thread r0 = new java.lang.Thread
            su0 r2 = new su0
            r9 = 1
            r2.<init>(r1)
            r0.<init>(r2)
            r0.start()
            return
        L3ae:
            r4 = r7
            java.lang.String r2 = "photoThumbnail"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L3b9
            goto L235
        L3b9:
            java.lang.Object r2 = r0.m4787F(r12)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L3c2
            r2 = r5
        L3c2:
            java.lang.Object r0 = r0.m4787F(r15)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L3ce
            long r32 = r0.longValue()
        L3ce:
            java.lang.Thread r7 = new java.lang.Thread
            ru0 r0 = new ru0
            r6 = 1
            r5 = r4
            r3 = r32
            r0.<init>(r1)
            r7.<init>(r0)
            r7.start()
            return
        L3e0:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "installApk"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L3ed
        L3ea:
            r11 = r10
            goto Leb4
        L3ed:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "INSTALL_APK"
            if (r0 == 0) goto L4d9
            boolean r3 = p000.cp1.m880j(r0)
            if (r3 == 0) goto L3ff
            goto L4d9
        L3ff:
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: java.lang.Exception -> L42f
            boolean r3 = r3.canRequestPackageInstalls()     // Catch: java.lang.Exception -> L42f
            if (r3 != 0) goto L432
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L42f
            java.lang.String r3 = "android.settings.MANAGE_UNKNOWN_APP_SOURCES"
            java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.Exception -> L42f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42f
            r6 = r27
            r5.<init>(r6)     // Catch: java.lang.Exception -> L42f
            r5.append(r4)     // Catch: java.lang.Exception -> L42f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Exception -> L42f
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch: java.lang.Exception -> L42f
            r0.<init>(r3, r4)     // Catch: java.lang.Exception -> L42f
            r1.startActivity(r0)     // Catch: java.lang.Exception -> L42f
            java.lang.String r0 = "permission_required"
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L42f
            return
        L42f:
            r0 = move-exception
            goto L4cc
        L432:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> L42f
            r3.<init>(r0)     // Catch: java.lang.Exception -> L42f
            boolean r0 = r3.exists()     // Catch: java.lang.Exception -> L42f
            if (r0 != 0) goto L443
            java.lang.String r0 = "Downloaded APK was not found."
            r10.m1210a(r2, r0, r12)     // Catch: java.lang.Exception -> L42f
            return
        L443:
            java.lang.String r0 = r1.getPackageName()     // Catch: java.lang.Exception -> L42f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L42f
            r4.<init>()     // Catch: java.lang.Exception -> L42f
            r4.append(r0)     // Catch: java.lang.Exception -> L42f
            r4.append(r9)     // Catch: java.lang.Exception -> L42f
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Exception -> L42f
            android.net.Uri r0 = androidx.core.content.FileProvider.m309d(r1, r0, r3)     // Catch: java.lang.Exception -> L42f
            android.content.Intent r3 = new android.content.Intent     // Catch: java.lang.Exception -> L42f
            r4 = r34
            r3.<init>(r4)     // Catch: java.lang.Exception -> L42f
            java.lang.String r4 = "application/vnd.android.package-archive"
            r3.setDataAndType(r0, r4)     // Catch: java.lang.Exception -> L42f
            r9 = 1
            r3.addFlags(r9)     // Catch: java.lang.Exception -> L42f
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.addFlags(r0)     // Catch: java.lang.Exception -> L42f
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Exception -> L42f
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentActivities(r3, r4)     // Catch: java.lang.Exception -> L42f
            r0.getClass()     // Catch: java.lang.Exception -> L42f
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L42f
        L480:
            boolean r4 = r0.hasNext()     // Catch: java.lang.Exception -> L42f
            if (r4 == 0) goto L4b6
            java.lang.Object r6 = r0.next()     // Catch: java.lang.Exception -> L42f
            r4 = r6
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4     // Catch: java.lang.Exception -> L42f
            android.content.pm.ActivityInfo r4 = r4.activityInfo     // Catch: java.lang.Exception -> L42f
            java.lang.String r4 = r4.packageName     // Catch: java.lang.Exception -> L42f
            r4.getClass()     // Catch: java.lang.Exception -> L42f
            java.util.Locale r5 = java.util.Locale.ROOT     // Catch: java.lang.Exception -> L42f
            java.lang.String r4 = r4.toLowerCase(r5)     // Catch: java.lang.Exception -> L42f
            r4.getClass()     // Catch: java.lang.Exception -> L42f
            java.lang.String r5 = "packageinstaller"
            boolean r5 = p000.cp1.m877g(r4, r5)     // Catch: java.lang.Exception -> L42f
            if (r5 != 0) goto L4b7
            java.lang.String r5 = "permissioncontroller"
            boolean r5 = p000.cp1.m877g(r4, r5)     // Catch: java.lang.Exception -> L42f
            if (r5 != 0) goto L4b7
            java.lang.String r5 = "installer"
            boolean r4 = p000.cp1.m877g(r4, r5)     // Catch: java.lang.Exception -> L42f
            if (r4 == 0) goto L480
            goto L4b7
        L4b6:
            r6 = r12
        L4b7:
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6     // Catch: java.lang.Exception -> L42f
            if (r6 == 0) goto L4c2
            android.content.pm.ActivityInfo r0 = r6.activityInfo     // Catch: java.lang.Exception -> L42f
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Exception -> L42f
            r3.setPackage(r0)     // Catch: java.lang.Exception -> L42f
        L4c2:
            r1.startActivity(r3)     // Catch: java.lang.Exception -> L42f
            java.lang.String r0 = "installer_opened"
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L42f
            goto Lf21
        L4cc:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L4d4
            java.lang.String r0 = "Could not open Android installer."
        L4d4:
            r10.m1210a(r2, r0, r12)
            goto Lf21
        L4d9:
            java.lang.String r0 = "Missing APK path."
            r10.m1210a(r2, r0, r12)
            return
        L4df:
            r10 = r7
            java.lang.String r2 = "smartRenameSuggestion"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L4ea
            goto L3ea
        L4ea:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L4f3
            goto L4f4
        L4f3:
            r5 = r0
        L4f4:
            java.lang.Thread r0 = new java.lang.Thread
            tu0 r2 = new tu0
            r9 = 1
            r2.<init>(r1, r5, r10, r9)
            r0.<init>(r2)
            r0.start()
            return
        L503:
            r10 = r7
            java.lang.String r2 = "indexSmartContent"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L50e
            goto L3ea
        L50e:
            java.lang.String r2 = "files"
            java.lang.Object r0 = r0.m4787F(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L51b
            r5 = r16
            goto L51c
        L51b:
            r5 = r0
        L51c:
            java.lang.Thread r0 = new java.lang.Thread
            su0 r2 = new su0
            r3 = 0
            r2.<init>(r1)
            r0.<init>(r2)
            r0.start()
            return
        L52b:
            r10 = r7
            r2 = r36
            java.lang.String r0 = "pcReceiverConfig"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L538
            goto L3ea
        L538:
            android.content.SharedPreferences r0 = r1.m824I()
            java.lang.String r0 = r0.getString(r4, r5)
            if (r0 != 0) goto L543
            r0 = r5
        L543:
            p51 r0 = p000.kj3.m2591a(r0, r4)
            android.content.SharedPreferences r4 = r1.m824I()
            r6 = 8765(0x223d, float:1.2282E-41)
            int r4 = r4.getInt(r2, r6)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            p51 r2 = p000.kj3.m2591a(r4, r2)
            android.content.SharedPreferences r1 = r1.m824I()
            java.lang.String r1 = r1.getString(r3, r5)
            if (r1 != 0) goto L564
            goto L565
        L564:
            r5 = r1
        L565:
            p51 r1 = p000.kj3.m2591a(r5, r3)
            p51[] r0 = new p000.p51[]{r0, r2, r1}
            java.util.Map r0 = p000.sv0.m4312c(r0)
            r10.m1212d(r0)
            return
        L575:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "renameDocument"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L581
            goto L3ea
        L581:
            java.lang.Object r2 = r0.m4787F(r11)
            java.lang.String r2 = (java.lang.String) r2
            r3 = r31
            java.lang.Object r0 = r0.m4787F(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "RENAME_DOCUMENT"
            if (r2 == 0) goto L682
            boolean r4 = p000.cp1.m880j(r2)
            if (r4 == 0) goto L59b
            goto L682
        L59b:
            if (r0 == 0) goto L682
            boolean r4 = p000.cp1.m880j(r0)
            if (r4 == 0) goto L5a5
            goto L682
        L5a5:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L5b6
            r4.<init>(r2)     // Catch: java.lang.Exception -> L5b6
            boolean r2 = r4.isFile()     // Catch: java.lang.Exception -> L5b6
            if (r2 != 0) goto L5bb
            java.lang.String r0 = "Document no longer exists."
            r10.m1210a(r3, r0, r12)     // Catch: java.lang.Exception -> L5b6
            return
        L5b6:
            r0 = move-exception
            r2 = r29
            goto L676
        L5bb:
            java.lang.String r0 = m814O(r0)     // Catch: java.lang.Exception -> L5b6
            java.lang.String r2 = p000.za0.m5409a(r4)     // Catch: java.lang.Exception -> L5b6
            boolean r5 = p000.cp1.m880j(r2)     // Catch: java.lang.Exception -> L5b6
            if (r5 == 0) goto L5cb
            java.lang.String r2 = "pdf"
        L5cb:
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L5b6
            java.io.File r6 = r4.getParentFile()     // Catch: java.lang.Exception -> L5b6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b6
            r7.<init>()     // Catch: java.lang.Exception -> L5b6
            r7.append(r0)     // Catch: java.lang.Exception -> L5b6
            r8 = r30
            r7.append(r8)     // Catch: java.lang.Exception -> L5b6
            r7.append(r2)     // Catch: java.lang.Exception -> L5b6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L5b6
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L5b6
            r11 = 2
        L5e9:
            boolean r6 = r5.exists()     // Catch: java.lang.Exception -> L5b6
            if (r6 == 0) goto L623
            java.lang.String r6 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L5b6
            java.lang.String r7 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L5b6
            boolean r6 = p000.wo0.m4989a(r6, r7)     // Catch: java.lang.Exception -> L5b6
            if (r6 != 0) goto L623
            java.io.File r5 = new java.io.File     // Catch: java.lang.Exception -> L5b6
            java.io.File r6 = r4.getParentFile()     // Catch: java.lang.Exception -> L5b6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b6
            r7.<init>()     // Catch: java.lang.Exception -> L5b6
            r7.append(r0)     // Catch: java.lang.Exception -> L5b6
            java.lang.String r9 = " "
            r7.append(r9)     // Catch: java.lang.Exception -> L5b6
            r7.append(r11)     // Catch: java.lang.Exception -> L5b6
            r7.append(r8)     // Catch: java.lang.Exception -> L5b6
            r7.append(r2)     // Catch: java.lang.Exception -> L5b6
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Exception -> L5b6
            r5.<init>(r6, r7)     // Catch: java.lang.Exception -> L5b6
            int r11 = r11 + 1
            goto L5e9
        L623:
            java.lang.String r0 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L5b6
            java.lang.String r2 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L5b6
            boolean r0 = p000.wo0.m4989a(r0, r2)     // Catch: java.lang.Exception -> L5b6
            if (r0 != 0) goto L63f
            boolean r0 = r4.renameTo(r5)     // Catch: java.lang.Exception -> L5b6
            if (r0 != 0) goto L63f
            r2 = r29
            r10.m1210a(r3, r2, r12)     // Catch: java.lang.Exception -> L63d
            return
        L63d:
            r0 = move-exception
            goto L676
        L63f:
            r2 = r29
            android.content.SharedPreferences r0 = r1.m823H()     // Catch: java.lang.Exception -> L63d
            java.lang.String r6 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L63d
            r7 = r26
            java.lang.String r0 = r0.getString(r6, r7)     // Catch: java.lang.Exception -> L63d
            if (r0 != 0) goto L652
            r0 = r7
        L652:
            android.content.SharedPreferences r1 = r1.m823H()     // Catch: java.lang.Exception -> L63d
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L63d
            java.lang.String r4 = r4.getAbsolutePath()     // Catch: java.lang.Exception -> L63d
            android.content.SharedPreferences$Editor r1 = r1.remove(r4)     // Catch: java.lang.Exception -> L63d
            java.lang.String r4 = r5.getAbsolutePath()     // Catch: java.lang.Exception -> L63d
            android.content.SharedPreferences$Editor r1 = r1.putString(r4, r0)     // Catch: java.lang.Exception -> L63d
            r1.apply()     // Catch: java.lang.Exception -> L63d
            java.util.Map r0 = m812E(r5, r0)     // Catch: java.lang.Exception -> L63d
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L63d
            goto Lf21
        L676:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L67d
            r0 = r2
        L67d:
            r10.m1210a(r3, r0, r12)
            goto Lf21
        L682:
            java.lang.String r0 = "Missing document path or name."
            r10.m1210a(r3, r0, r12)
            return
        L688:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "preparePhotoPreview"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L694
            goto L3ea
        L694:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L6b2
            boolean r2 = p000.cp1.m880j(r0)
            if (r2 == 0) goto L6a3
            goto L6b2
        L6a3:
            java.lang.Thread r2 = new java.lang.Thread
            tu0 r3 = new tu0
            r4 = 6
            r3.<init>(r1, r0, r10, r4)
            r2.<init>(r3)
            r2.start()
            return
        L6b2:
            java.lang.String r0 = "PHOTO_PREVIEW"
            java.lang.String r1 = "Missing photo path."
            r10.m1210a(r0, r1, r12)
            return
        L6ba:
            r10 = r7
            java.lang.String r0 = "listPhotosMediaStore"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L6c5
            goto L3ea
        L6c5:
            java.lang.Thread r0 = new java.lang.Thread
            uu0 r2 = new uu0
            r3 = 2
            r2.<init>(r1)
            r0.<init>(r2)
            r0.start()
            return
        L6d4:
            r10 = r7
            java.lang.String r0 = "scanSmartPhotoVisual"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L6df
            goto L3ea
        L6df:
            java.lang.Thread r0 = new java.lang.Thread
            uu0 r2 = new uu0
            r9 = 1
            r2.<init>(r1)
            r0.<init>(r2)
            r0.start()
            return
        L6ee:
            r10 = r7
            r3 = r31
            r4 = r34
            java.lang.String r2 = "openSmartMediaCleanupItem"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L6fd
        L6fb:
            goto L3ea
        L6fd:
            java.lang.Object r2 = r0.m4787F(r12)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L706
            r2 = r5
        L706:
            java.lang.String r6 = "mediaKind"
            java.lang.Object r6 = r0.m4787F(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 != 0) goto L711
            r6 = r5
        L711:
            java.lang.Object r0 = r0.m4787F(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L71b
            java.lang.String r0 = "Media"
        L71b:
            java.lang.String r3 = "content://"
            boolean r3 = p000.kp1.m2635e(r2, r3)
            if (r3 != 0) goto L729
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.m1212d(r0)
            return
        L729:
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r3)
            r6.getClass()
            java.lang.String r7 = "photo"
            boolean r7 = p000.wo0.m4989a(r6, r7)
            if (r7 == 0) goto L73d
            java.lang.String r14 = "image/*"
            goto L76f
        L73d:
            java.lang.String r7 = "video"
            boolean r6 = p000.wo0.m4989a(r6, r7)
            if (r6 == 0) goto L748
            java.lang.String r14 = "video/*"
            goto L76f
        L748:
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()
            int r7 = p000.cp1.m881k(r0)
            r8 = -1
            if (r7 != r8) goto L754
            goto L760
        L754:
            r35 = 1
            int r7 = r7 + 1
            int r5 = r0.length()
            java.lang.String r5 = r0.substring(r7, r5)
        L760:
            java.lang.String r0 = r5.toLowerCase(r3)
            r0.getClass()
            java.lang.String r0 = r6.getMimeTypeFromExtension(r0)
            if (r0 != 0) goto L76e
            goto L76f
        L76e:
            r14 = r0
        L76f:
            android.content.Intent r0 = new android.content.Intent     // Catch: java.lang.Exception -> L79a
            r0.<init>(r4)     // Catch: java.lang.Exception -> L79a
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Exception -> L79a
            r0.setDataAndType(r2, r14)     // Catch: java.lang.Exception -> L79a
            r9 = 1
            r0.addFlags(r9)     // Catch: java.lang.Exception -> L79a
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: java.lang.Exception -> L79a
            android.content.ComponentName r2 = r0.resolveActivity(r2)     // Catch: java.lang.Exception -> L79a
            if (r2 != 0) goto L790
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L79a
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L79a
            goto Lf21
        L790:
            r1.startActivity(r0)     // Catch: java.lang.Exception -> L79a
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> L79a
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L79a
            goto Lf21
        L79a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.m1212d(r0)
            goto Lf21
        L7a1:
            r12 = r6
            r10 = r7
            java.lang.String r0 = "listDocuments"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L7ad
            goto L3ea
        L7ad:
            java.util.ArrayList r0 = r1.m827L()     // Catch: java.lang.Exception -> L7b6
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L7b6
            goto Lf21
        L7b6:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L7bf
            java.lang.String r0 = "Could not load saved documents."
        L7bf:
            java.lang.String r1 = "LIST_DOCUMENTS"
            r10.m1210a(r1, r0, r12)
            goto Lf21
        L7c6:
            r10 = r7
            java.lang.String r2 = "searchSmartContent"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L7d1
            goto L3ea
        L7d1:
            java.lang.String r2 = "query"
            java.lang.Object r0 = r0.m4787F(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L7dc
            goto L7dd
        L7dc:
            r5 = r0
        L7dd:
            java.lang.Thread r0 = new java.lang.Thread
            tu0 r2 = new tu0
            r3 = 0
            r2.<init>(r1, r5, r10, r3)
            r0.<init>(r2)
            r0.start()
            return
        L7ec:
            r12 = r6
            r10 = r7
            java.lang.String r0 = "voiceSearch"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L7f8
            goto L3ea
        L7f8:
            dx0 r0 = r1.f1419J
            if (r0 == 0) goto L804
            java.lang.String r0 = "VOICE_BUSY"
            java.lang.String r1 = "Voice search is already open."
            r10.m1210a(r0, r1, r12)
            return
        L804:
            android.content.Intent r0 = new android.content.Intent
            r2 = r25
            r0.<init>(r2)
            r4 = r23
            r3 = r24
            r0.putExtra(r4, r3)
            java.lang.String r2 = "Say a file name"
            r5 = r22
            r0.putExtra(r5, r2)
            r6 = r21
            r2 = 3
            r0.putExtra(r6, r2)
            r1.f1419J = r10     // Catch: java.lang.Exception -> L828
            int r2 = r1.f1412C     // Catch: java.lang.Exception -> L828
            r1.startActivityForResult(r0, r2)     // Catch: java.lang.Exception -> L828
            goto Lf21
        L828:
            r0 = move-exception
            r1.f1419J = r12
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L833
            java.lang.String r0 = "Voice search is not available on this phone."
        L833:
            java.lang.String r1 = "VOICE_SEARCH"
            r10.m1210a(r1, r0, r12)
            goto Lf21
        L83a:
            r12 = r6
            r10 = r7
            java.lang.String r0 = "installedAppsCount"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L846
            goto L3ea
        L846:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L85d
            r2 = 33
            if (r0 < r2) goto L85f
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Exception -> L85d
            android.content.pm.PackageManager$ApplicationInfoFlags r1 = p000.AbstractC0126d5.m1056b()     // Catch: java.lang.Exception -> L85d
            java.util.List r0 = p000.AbstractC0126d5.m1067m(r0, r1)     // Catch: java.lang.Exception -> L85d
            int r0 = r0.size()     // Catch: java.lang.Exception -> L85d
            goto L86c
        L85d:
            r0 = move-exception
            goto L875
        L85f:
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Exception -> L85d
            r3 = 0
            java.util.List r0 = r0.getInstalledApplications(r3)     // Catch: java.lang.Exception -> L85d
            int r0 = r0.size()     // Catch: java.lang.Exception -> L85d
        L86c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L85d
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L85d
            goto Lf21
        L875:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L87d
            java.lang.String r0 = "Could not read installed apps."
        L87d:
            java.lang.String r1 = "APP_COUNT"
            r10.m1210a(r1, r0, r12)
            goto Lf21
        L884:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "trashSmartMediaCleanupItems"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto L890
            goto L3ea
        L890:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 >= r3) goto L89e
            java.lang.String r0 = "MEDIA_TRASH_UNSUPPORTED"
            java.lang.String r1 = "Smart media trash requires Android 11 or newer."
            r10.m1210a(r0, r1, r12)
            return
        L89e:
            dx0 r2 = r1.f1416G
            if (r2 == 0) goto L8aa
            java.lang.String r0 = "MEDIA_TRASH_BUSY"
            java.lang.String r1 = "Another trash confirmation is already open."
            r10.m1210a(r0, r1, r12)
            return
        L8aa:
            java.lang.String r2 = "uris"
            java.lang.Object r0 = r0.m4787F(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L8b7
            r5 = r16
            goto L8b8
        L8b7:
            r5 = r0
        L8b8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r5.iterator()
        L8c1:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8e5
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri r6 = android.net.Uri.parse(r3)     // Catch: java.lang.Exception -> L8de
            java.lang.String r3 = r6.getScheme()     // Catch: java.lang.Exception -> L8de
            java.lang.String r4 = "content"
            boolean r3 = p000.wo0.m4989a(r3, r4)     // Catch: java.lang.Exception -> L8de
            if (r3 == 0) goto L8de
            goto L8df
        L8de:
            r6 = r12
        L8df:
            if (r6 == 0) goto L8c1
            r0.add(r6)
            goto L8c1
        L8e5:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L8f3
            java.lang.String r0 = "MEDIA_TRASH_EMPTY"
            java.lang.String r1 = "No media was selected."
            r10.m1210a(r0, r1, r12)
            return
        L8f3:
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Exception -> L90f
            android.app.PendingIntent r0 = p000.AbstractC0650r4.m3910c(r2, r0)     // Catch: java.lang.Exception -> L90f
            r0.getClass()     // Catch: java.lang.Exception -> L90f
            r1.f1416G = r10     // Catch: java.lang.Exception -> L90f
            android.content.IntentSender r2 = r0.getIntentSender()     // Catch: java.lang.Exception -> L90f
            int r3 = r1.f1415F     // Catch: java.lang.Exception -> L90f
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r1.startIntentSenderForResult(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L90f
            goto Lf21
        L90f:
            r0 = move-exception
            r1.f1416G = r12
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L91a
            java.lang.String r0 = "Could not open Android trash confirmation."
        L91a:
            java.lang.String r1 = "MEDIA_TRASH"
            r10.m1210a(r1, r0, r12)
            goto Lf21
        L921:
            r12 = r6
            r10 = r7
            java.lang.String r0 = "storageInfo"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L92d
            goto L3ea
        L92d:
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.lang.Exception -> L96d
            android.os.StatFs r1 = new android.os.StatFs     // Catch: java.lang.Exception -> L96d
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Exception -> L96d
            r1.<init>(r0)     // Catch: java.lang.Exception -> L96d
            long r2 = r1.getBlockCountLong()     // Catch: java.lang.Exception -> L96d
            long r4 = r1.getBlockSizeLong()     // Catch: java.lang.Exception -> L96d
            long r2 = r2 * r4
            long r4 = r1.getAvailableBlocksLong()     // Catch: java.lang.Exception -> L96d
            long r0 = r1.getBlockSizeLong()     // Catch: java.lang.Exception -> L96d
            long r4 = r4 * r0
            java.lang.String r0 = "totalBytes"
            java.lang.Long r1 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> L96d
            p51 r0 = p000.kj3.m2591a(r1, r0)     // Catch: java.lang.Exception -> L96d
            java.lang.String r1 = "freeBytes"
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Exception -> L96d
            p51 r1 = p000.kj3.m2591a(r2, r1)     // Catch: java.lang.Exception -> L96d
            p51[] r0 = new p000.p51[]{r0, r1}     // Catch: java.lang.Exception -> L96d
            java.util.Map r0 = p000.sv0.m4312c(r0)     // Catch: java.lang.Exception -> L96d
            r10.m1212d(r0)     // Catch: java.lang.Exception -> L96d
            goto Lf21
        L96d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L976
            java.lang.String r0 = "Could not read storage information."
        L976:
            java.lang.String r1 = "STORAGE_INFO"
            r10.m1210a(r1, r0, r12)
            goto Lf21
        L97d:
            r12 = r6
            r10 = r7
            r2 = r36
            java.lang.String r6 = "testPcReceiver"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L98b
            goto L3ea
        L98b:
            java.lang.Object r6 = r0.m4787F(r4)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L9a8
            java.lang.CharSequence r6 = p000.cp1.m889s(r6)
            java.lang.String r6 = r6.toString()
            if (r6 == 0) goto L9a8
            boolean r7 = p000.cp1.m880j(r6)
            if (r7 != 0) goto L9a4
            goto L9a5
        L9a4:
            r6 = r12
        L9a5:
            if (r6 == 0) goto L9a8
            goto L9bf
        L9a8:
            android.content.SharedPreferences r6 = r1.m824I()
            java.lang.String r4 = r6.getString(r4, r5)
            if (r4 == 0) goto L9bb
            java.lang.CharSequence r4 = p000.cp1.m889s(r4)
            java.lang.String r6 = r4.toString()
            goto L9bc
        L9bb:
            r6 = r12
        L9bc:
            if (r6 != 0) goto L9bf
            r6 = r5
        L9bf:
            java.lang.Object r4 = r0.m4787F(r3)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L9dc
            java.lang.CharSequence r4 = p000.cp1.m889s(r4)
            java.lang.String r4 = r4.toString()
            if (r4 == 0) goto L9dc
            boolean r7 = p000.cp1.m880j(r4)
            if (r7 != 0) goto L9d8
            goto L9d9
        L9d8:
            r4 = r12
        L9d9:
            if (r4 == 0) goto L9dc
            goto L9f5
        L9dc:
            android.content.SharedPreferences r4 = r1.m824I()
            java.lang.String r3 = r4.getString(r3, r5)
            if (r3 == 0) goto L9ef
            java.lang.CharSequence r3 = p000.cp1.m889s(r3)
            java.lang.String r3 = r3.toString()
            goto L9f0
        L9ef:
            r3 = r12
        L9f0:
            if (r3 != 0) goto L9f4
            r4 = r5
            goto L9f5
        L9f4:
            r4 = r3
        L9f5:
            java.lang.Object r0 = r0.m4787F(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto La06
            int r0 = r0.intValue()
        La01:
            r8 = 65535(0xffff, float:9.1834E-41)
            r9 = 1
            goto La11
        La06:
            android.content.SharedPreferences r0 = r1.m824I()
            r3 = 8765(0x223d, float:1.2282E-41)
            int r0 = r0.getInt(r2, r3)
            goto La01
        La11:
            int r3 = p000.eg3.m1439b(r0, r9, r8)
            boolean r0 = p000.cp1.m880j(r6)
            if (r0 != 0) goto La32
            boolean r0 = p000.cp1.m880j(r4)
            if (r0 == 0) goto La22
            goto La32
        La22:
            java.lang.Thread r7 = new java.lang.Thread
            vu0 r0 = new vu0
            r2 = r6
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r7.<init>(r0)
            r7.start()
            return
        La32:
            java.lang.String r0 = "PC_TEST"
            java.lang.String r1 = "Set the PC address and pairing code first."
            r10.m1210a(r0, r1, r12)
            return
        La3a:
            r12 = r6
            r10 = r7
            java.lang.String r0 = "appVersionInfo"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto La46
            goto L6fb
        La46:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La5d
            r2 = 33
            if (r0 < r2) goto La5f
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: java.lang.Exception -> La5d
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> La5d
            android.content.pm.PackageManager$PackageInfoFlags r3 = p000.AbstractC0126d5.m1057c()     // Catch: java.lang.Exception -> La5d
            android.content.pm.PackageInfo r1 = p000.AbstractC0126d5.m1055a(r2, r1, r3)     // Catch: java.lang.Exception -> La5d
            goto La6c
        La5d:
            r0 = move-exception
            goto La9b
        La5f:
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch: java.lang.Exception -> La5d
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Exception -> La5d
            r3 = 0
            android.content.pm.PackageInfo r1 = r2.getPackageInfo(r1, r3)     // Catch: java.lang.Exception -> La5d
        La6c:
            r2 = 28
            if (r0 < r2) goto La75
            long r2 = p000.qm0.m3762a(r1)     // Catch: java.lang.Exception -> La5d
            goto La78
        La75:
            int r0 = r1.versionCode     // Catch: java.lang.Exception -> La5d
            long r2 = (long) r0     // Catch: java.lang.Exception -> La5d
        La78:
            java.lang.String r0 = "versionName"
            java.lang.String r1 = r1.versionName     // Catch: java.lang.Exception -> La5d
            if (r1 != 0) goto La80
            java.lang.String r1 = "Unknown"
        La80:
            p51 r0 = p000.kj3.m2591a(r1, r0)     // Catch: java.lang.Exception -> La5d
            java.lang.String r1 = "versionCode"
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Exception -> La5d
            p51 r1 = p000.kj3.m2591a(r2, r1)     // Catch: java.lang.Exception -> La5d
            p51[] r0 = new p000.p51[]{r0, r1}     // Catch: java.lang.Exception -> La5d
            java.util.Map r0 = p000.sv0.m4312c(r0)     // Catch: java.lang.Exception -> La5d
            r10.m1212d(r0)     // Catch: java.lang.Exception -> La5d
            goto Lf21
        La9b:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Laa3
            java.lang.String r0 = "Could not read app version."
        Laa3:
            java.lang.String r1 = "APP_VERSION"
            r10.m1210a(r1, r0, r12)
            goto Lf21
        Laaa:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "convertPdfToDocx"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Lab6
            goto L3ea
        Lab6:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lad4
            boolean r2 = p000.cp1.m880j(r0)
            if (r2 == 0) goto Lac5
            goto Lad4
        Lac5:
            java.lang.Thread r2 = new java.lang.Thread
            tu0 r3 = new tu0
            r4 = 2
            r3.<init>(r1, r0, r10, r4)
            r2.<init>(r3)
            r2.start()
            return
        Lad4:
            java.lang.String r0 = "CONVERTER_PDF_WORD"
            r2 = r20
            r10.m1210a(r0, r2, r12)
            return
        Ladc:
            r10 = r7
            java.lang.String r0 = "scanSmartMediaCleanup"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto Lae7
            goto L3ea
        Lae7:
            java.lang.Thread r0 = new java.lang.Thread
            uu0 r2 = new uu0
            r3 = 0
            r2.<init>(r1)
            r0.<init>(r2)
            r0.start()
            return
        Laf6:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "extractVideoAudio"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Lb02
            goto L3ea
        Lb02:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lb20
            boolean r2 = p000.cp1.m880j(r0)
            if (r2 == 0) goto Lb11
            goto Lb20
        Lb11:
            java.lang.Thread r2 = new java.lang.Thread
            tu0 r3 = new tu0
            r4 = 4
            r3.<init>(r1, r0, r10, r4)
            r2.<init>(r3)
            r2.start()
            return
        Lb20:
            java.lang.String r0 = "CONVERTER_VIDEO_AUDIO"
            java.lang.String r1 = "Missing video file path."
            r10.m1210a(r0, r1, r12)
            return
        Lb28:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "deleteDocument"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Lb34
            goto L3ea
        Lb34:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "DELETE_DOCUMENT"
            if (r0 == 0) goto Lb87
            boolean r3 = p000.cp1.m880j(r0)
            if (r3 == 0) goto Lb45
            goto Lb87
        Lb45:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> Lb61
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lb61
            boolean r4 = r3.exists()     // Catch: java.lang.Exception -> Lb61
            if (r4 == 0) goto Lb56
            boolean r3 = r3.delete()     // Catch: java.lang.Exception -> Lb61
            if (r3 == 0) goto Lb59
        Lb56:
            r3 = r19
            goto Lb65
        Lb59:
            r3 = r19
            r10.m1210a(r2, r3, r12)     // Catch: java.lang.Exception -> Lb5f
            return
        Lb5f:
            r0 = move-exception
            goto Lb7b
        Lb61:
            r0 = move-exception
            r3 = r19
            goto Lb7b
        Lb65:
            android.content.SharedPreferences r1 = r1.m823H()     // Catch: java.lang.Exception -> Lb5f
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> Lb5f
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch: java.lang.Exception -> Lb5f
            r0.apply()     // Catch: java.lang.Exception -> Lb5f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lb5f
            r10.m1212d(r0)     // Catch: java.lang.Exception -> Lb5f
            goto Lf21
        Lb7b:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lb82
            r0 = r3
        Lb82:
            r10.m1210a(r2, r0, r12)
            goto Lf21
        Lb87:
            java.lang.String r0 = "Missing document path."
            r10.m1210a(r2, r0, r12)
            return
        Lb8d:
            r12 = r6
            r10 = r7
            r2 = r20
            java.lang.String r3 = "convertPdfToImages"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto Lb9b
            goto L3ea
        Lb9b:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Lbb9
            boolean r3 = p000.cp1.m880j(r0)
            if (r3 == 0) goto Lbaa
            goto Lbb9
        Lbaa:
            java.lang.Thread r2 = new java.lang.Thread
            tu0 r3 = new tu0
            r4 = 3
            r3.<init>(r1, r0, r10, r4)
            r2.<init>(r3)
            r2.start()
            return
        Lbb9:
            java.lang.String r0 = "CONVERTER_PDF_IMAGES"
            r10.m1210a(r0, r2, r12)
            return
        Lbbf:
            r12 = r6
            r10 = r7
            java.lang.String r2 = "shareToWhatsApp"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Lbcb
            goto L3ea
        Lbcb:
            java.lang.Object r0 = r0.m4787F(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "WHATSAPP_SHARE"
            if (r0 == 0) goto Ld59
            boolean r3 = p000.cp1.m880j(r0)
            if (r3 == 0) goto Lbdd
            goto Ld59
        Lbdd:
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> Lbee
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lbee
            boolean r0 = r3.isFile()     // Catch: java.lang.Exception -> Lbee
            if (r0 != 0) goto Lbf1
            java.lang.String r0 = "The selected file no longer exists."
            r10.m1210a(r2, r0, r12)     // Catch: java.lang.Exception -> Lbee
            return
        Lbee:
            r0 = move-exception
            goto Ld4c
        Lbf1:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> Lbee
            java.io.File r4 = r1.getCacheDir()     // Catch: java.lang.Exception -> Lbee
            java.lang.String r6 = "whatsapp_share"
            r0.<init>(r4, r6)     // Catch: java.lang.Exception -> Lbee
            r0.mkdirs()     // Catch: java.lang.Exception -> Lbee
            java.io.File[] r4 = r0.listFiles()     // Catch: java.lang.Exception -> Lbee
            if (r4 == 0) goto Lc17
            int r6 = r4.length     // Catch: java.lang.Exception -> Lbee
            r7 = 0
        Lc07:
            if (r7 >= r6) goto Lc17
            r8 = r4[r7]     // Catch: java.lang.Exception -> Lbee
            boolean r11 = r8.isFile()     // Catch: java.lang.Exception -> Lc14
            if (r11 == 0) goto Lc14
            r8.delete()     // Catch: java.lang.Exception -> Lc14
        Lc14:
            int r7 = r7 + 1
            goto Lc07
        Lc17:
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> Lbee
            java.lang.String r6 = r3.getName()     // Catch: java.lang.Exception -> Lbee
            r4.<init>(r0, r6)     // Catch: java.lang.Exception -> Lbee
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Exception -> Lbee
            r6.<init>(r3)     // Catch: java.lang.Exception -> Lbee
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Ld3b
            r7.<init>(r4)     // Catch: java.lang.Throwable -> Ld3b
            p000.rp2.m4054b(r6, r7)     // Catch: java.lang.Throwable -> Ld3e
            p000.tr2.m4488a(r7, r12)     // Catch: java.lang.Throwable -> Ld3b
            p000.tr2.m4488a(r6, r12)     // Catch: java.lang.Exception -> Lbee
            java.lang.String r0 = r1.getPackageName()     // Catch: java.lang.Exception -> Lbee
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbee
            r6.<init>()     // Catch: java.lang.Exception -> Lbee
            r6.append(r0)     // Catch: java.lang.Exception -> Lbee
            r6.append(r9)     // Catch: java.lang.Exception -> Lbee
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Exception -> Lbee
            android.net.Uri r0 = androidx.core.content.FileProvider.m309d(r1, r0, r4)     // Catch: java.lang.Exception -> Lbee
            java.lang.String r4 = p000.za0.m5409a(r3)     // Catch: java.lang.Exception -> Lbee
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Exception -> Lbee
            r6.getClass()     // Catch: java.lang.Exception -> Lbee
            java.lang.String r4 = r4.toLowerCase(r6)     // Catch: java.lang.Exception -> Lbee
            r4.getClass()     // Catch: java.lang.Exception -> Lbee
            android.webkit.MimeTypeMap r6 = android.webkit.MimeTypeMap.getSingleton()     // Catch: java.lang.Exception -> Lbee
            java.lang.String r4 = r6.getMimeTypeFromExtension(r4)     // Catch: java.lang.Exception -> Lbee
            if (r4 != 0) goto Lc66
            java.lang.String r4 = "application/octet-stream"
        Lc66:
            android.content.Intent r6 = new android.content.Intent     // Catch: java.lang.Exception -> Lbee
            java.lang.String r7 = "android.intent.action.SEND"
            r6.<init>(r7)     // Catch: java.lang.Exception -> Lbee
            r6.setType(r4)     // Catch: java.lang.Exception -> Lbee
            java.lang.String r4 = "android.intent.extra.STREAM"
            r6.putExtra(r4, r0)     // Catch: java.lang.Exception -> Lbee
            java.lang.String r4 = "android.intent.extra.TITLE"
            java.lang.String r7 = r3.getName()     // Catch: java.lang.Exception -> Lbee
            r6.putExtra(r4, r7)     // Catch: java.lang.Exception -> Lbee
            android.content.ContentResolver r4 = r1.getContentResolver()     // Catch: java.lang.Exception -> Lbee
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> Lbee
            android.content.ClipData r3 = android.content.ClipData.newUri(r4, r3, r0)     // Catch: java.lang.Exception -> Lbee
            r6.setClipData(r3)     // Catch: java.lang.Exception -> Lbee
            r9 = 1
            r6.addFlags(r9)     // Catch: java.lang.Exception -> Lbee
            java.lang.String r3 = "com.whatsapp"
            java.lang.String r4 = "com.whatsapp.w4b"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Exception -> Lbee
            java.util.List r3 = p000.AbstractC0675rt.m4090c(r3)     // Catch: java.lang.Exception -> Lbee
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> Lbee
        Lca1:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> Lbee
            if (r4 == 0) goto Ld32
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> Lbee
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lbee
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Exception -> Lbee
            r7.<init>(r6)     // Catch: java.lang.Exception -> Lbee
            r7.setPackage(r4)     // Catch: java.lang.Exception -> Lbee
            android.content.pm.PackageManager r8 = r1.getPackageManager()     // Catch: java.lang.Exception -> Lbee
            r9 = 65536(0x10000, float:9.18355E-41)
            java.util.List r8 = r8.queryIntentActivities(r7, r9)     // Catch: java.lang.Exception -> Lbee
            r8.getClass()     // Catch: java.lang.Exception -> Lbee
            java.util.Iterator r11 = r8.iterator()     // Catch: java.lang.Exception -> Lbee
        Lcc6:
            boolean r13 = r11.hasNext()     // Catch: java.lang.Exception -> Lbee
            if (r13 == 0) goto Lcf7
            java.lang.Object r13 = r11.next()     // Catch: java.lang.Exception -> Lbee
            r14 = r13
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14     // Catch: java.lang.Exception -> Lbee
            android.content.pm.ActivityInfo r14 = r14.activityInfo     // Catch: java.lang.Exception -> Lbee
            java.lang.String r14 = r14.name     // Catch: java.lang.Exception -> Lbee
            if (r14 != 0) goto Lcda
            r14 = r5
        Lcda:
            java.lang.String r15 = "ContactPicker"
            r9 = 1
            boolean r15 = p000.cp1.m876f(r14, r15, r9)     // Catch: java.lang.Exception -> Lbee
            if (r15 != 0) goto Lcf8
            java.lang.String r15 = "Share"
            boolean r15 = p000.cp1.m876f(r14, r15, r9)     // Catch: java.lang.Exception -> Lbee
            if (r15 != 0) goto Lcf8
            java.lang.String r15 = "Picker"
            boolean r14 = p000.cp1.m876f(r14, r15, r9)     // Catch: java.lang.Exception -> Lbee
            if (r14 == 0) goto Lcf4
            goto Lcf8
        Lcf4:
            r9 = 65536(0x10000, float:9.18355E-41)
            goto Lcc6
        Lcf7:
            r13 = r12
        Lcf8:
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch: java.lang.Exception -> Lbee
            if (r13 != 0) goto Ld03
            java.lang.Object r8 = p000.AbstractC0638qt.m3826o(r8)     // Catch: java.lang.Exception -> Lbee
            r13 = r8
            android.content.pm.ResolveInfo r13 = (android.content.pm.ResolveInfo) r13     // Catch: java.lang.Exception -> Lbee
        Ld03:
            if (r13 == 0) goto Ld24
            android.content.Intent r8 = new android.content.Intent     // Catch: java.lang.Exception -> Lbee
            r8.<init>(r6)     // Catch: java.lang.Exception -> Lbee
            android.content.ComponentName r9 = new android.content.ComponentName     // Catch: java.lang.Exception -> Lbee
            android.content.pm.ActivityInfo r11 = r13.activityInfo     // Catch: java.lang.Exception -> Lbee
            java.lang.String r14 = r11.packageName     // Catch: java.lang.Exception -> Lbee
            java.lang.String r11 = r11.name     // Catch: java.lang.Exception -> Lbee
            r9.<init>(r14, r11)     // Catch: java.lang.Exception -> Lbee
            r8.setComponent(r9)     // Catch: java.lang.Exception -> Lbee
            android.content.pm.ActivityInfo r9 = r13.activityInfo     // Catch: java.lang.Exception -> Lbee java.lang.Throwable -> Ld24
            java.lang.String r9 = r9.packageName     // Catch: java.lang.Exception -> Lbee java.lang.Throwable -> Ld24
            r11 = 1
            r1.grantUriPermission(r9, r0, r11)     // Catch: java.lang.Exception -> Lbee java.lang.Throwable -> Ld24
            r1.startActivity(r8)     // Catch: java.lang.Exception -> Lbee java.lang.Throwable -> Ld24
            goto Ld2b
        Ld24:
            r9 = 1
            r1.grantUriPermission(r4, r0, r9)     // Catch: java.lang.Exception -> Lbee java.lang.Throwable -> Lca1
            r1.startActivity(r7)     // Catch: java.lang.Exception -> Lbee java.lang.Throwable -> Lca1
        Ld2b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lbee
            r10.m1212d(r0)     // Catch: java.lang.Exception -> Lbee
            goto Lf21
        Ld32:
            java.lang.String r0 = "WHATSAPP_NOT_FOUND"
            java.lang.String r1 = "WhatsApp is not installed on this phone."
            r10.m1210a(r0, r1, r12)     // Catch: java.lang.Exception -> Lbee
            goto Lf21
        Ld3b:
            r0 = move-exception
            r1 = r0
            goto Ld46
        Ld3e:
            r0 = move-exception
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> Ld41
        Ld41:
            r0 = move-exception
            p000.tr2.m4488a(r7, r1)     // Catch: java.lang.Throwable -> Ld3b
            throw r0     // Catch: java.lang.Throwable -> Ld3b
        Ld46:
            throw r1     // Catch: java.lang.Throwable -> Ld47
        Ld47:
            r0 = move-exception
            p000.tr2.m4488a(r6, r1)     // Catch: java.lang.Exception -> Lbee
            throw r0     // Catch: java.lang.Exception -> Lbee
        Ld4c:
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Ld54
            java.lang.String r0 = "Could not share this file to WhatsApp."
        Ld54:
            r10.m1210a(r2, r0, r12)
            goto Lf21
        Ld59:
            java.lang.String r0 = "Missing file path."
            r10.m1210a(r2, r0, r12)
            return
        Ld5f:
            r10 = r7
            java.lang.String r2 = "smartContentMovePath"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Ld6a
            goto L3ea
        Ld6a:
            java.lang.String r2 = "oldPath"
            java.lang.Object r2 = r0.m4787F(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Ld75
            r2 = r5
        Ld75:
            java.lang.String r3 = "newPath"
            java.lang.Object r3 = r0.m4787F(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto Ld80
            r3 = r5
        Ld80:
            java.lang.Object r4 = r0.m4787F(r15)
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 == 0) goto Ld8d
            long r4 = r4.longValue()
            goto Ld8f
        Ld8d:
            r4 = r32
        Ld8f:
            java.lang.String r6 = "sizeBytes"
            java.lang.Object r0 = r0.m4787F(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Ld9d
            long r32 = r0.longValue()
        Ld9d:
            r6 = r32
            p000.om1.m3401i(r1, r2, r3, r4, r6)     // Catch: java.lang.Exception -> Lda9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lda9
            r10.m1212d(r0)     // Catch: java.lang.Exception -> Lda9
            goto Lf21
        Lda9:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r10.m1212d(r0)
            goto Lf21
        Ldb0:
            r10 = r7
            r3 = r31
            java.lang.String r1 = "photoShareCopy"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto Ldbd
            goto L3ea
        Ldbd:
            java.lang.Object r1 = r0.m4787F(r12)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto Ldc7
            r2 = r5
            goto Ldc8
        Ldc7:
            r2 = r1
        Ldc8:
            java.lang.Object r0 = r0.m4787F(r3)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Ldd2
            java.lang.String r0 = "Photo.jpg"
        Ldd2:
            r3 = r0
            java.lang.Thread r6 = new java.lang.Thread
            ui r0 = new ui
            r5 = 4
            r1 = r37
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r6.<init>(r0)
            r6.start()
            return
        Lde5:
            r12 = r6
            r11 = r7
            r9 = r28
            java.lang.String r2 = "cancelTaskReminder"
            boolean r2 = r8.equals(r2)
            if (r2 != 0) goto Ldf3
            goto Leb4
        Ldf3:
            java.lang.Object r0 = r0.m4787F(r13)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto Le4d
            boolean r2 = p000.cp1.m880j(r0)
            if (r2 == 0) goto Le02
            goto Le4d
        Le02:
            java.lang.String r2 = "alarm"
            java.lang.Object r2 = r1.getSystemService(r2)     // Catch: java.lang.Exception -> Le3f
            r2.getClass()     // Catch: java.lang.Exception -> Le3f
            android.app.AlarmManager r2 = (android.app.AlarmManager) r2     // Catch: java.lang.Exception -> Le3f
            int r3 = r0.hashCode()     // Catch: java.lang.Exception -> Le3f
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> Le3f
            java.lang.Class<com.example.smart_life.TaskReminderReceiver> r5 = com.example.smart_life.TaskReminderReceiver.class
            r4.<init>(r1, r5)     // Catch: java.lang.Exception -> Le3f
            r5 = 603979776(0x24000000, float:2.7755576E-17)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r1, r3, r4, r5)     // Catch: java.lang.Exception -> Le3f
            if (r3 == 0) goto Le26
            r2.cancel(r3)     // Catch: java.lang.Exception -> Le3f
            r3.cancel()     // Catch: java.lang.Exception -> Le3f
        Le26:
            java.lang.String r2 = "smart_life_task_reminders"
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)     // Catch: java.lang.Exception -> Le3f
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> Le3f
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)     // Catch: java.lang.Exception -> Le3f
            r0.apply()     // Catch: java.lang.Exception -> Le3f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Le3f
            r11.m1212d(r0)     // Catch: java.lang.Exception -> Le3f
            goto Lf21
        Le3f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Le48
            java.lang.String r0 = "Could not cancel this reminder."
        Le48:
            r11.m1210a(r9, r0, r12)
            goto Lf21
        Le4d:
            java.lang.String r0 = "Missing reminder id."
            r11.m1210a(r9, r0, r12)
            return
        Le53:
            r12 = r6
            r11 = r7
            r7 = r26
            java.lang.String r3 = "scanDocument"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto Le60
            goto Leb4
        Le60:
            dx0 r3 = r1.f1417H
            if (r3 == 0) goto Le6c
            java.lang.String r0 = "SCAN_BUSY"
            java.lang.String r1 = "A document scan is already open."
            r11.m1210a(r0, r1, r12)
            return
        Le6c:
            java.lang.Object r3 = r0.m4787F(r10)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto Le76
            r12 = r7
            goto Le77
        Le76:
            r12 = r3
        Le77:
            r1.f1420K = r12
            java.lang.Object r2 = r0.m4787F(r2)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto Le83
            r2 = r18
        Le83:
            r1.f1421L = r2
            java.lang.String r2 = "pageLimit"
            java.lang.Object r0 = r0.m4787F(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto Le96
            int r9 = r0.intValue()
        Le93:
            r0 = 1
            r3 = 2
            goto Le98
        Le96:
            r9 = 1
            goto Le93
        Le98:
            int r0 = p000.eg3.m1439b(r9, r0, r3)
            r1.m830R(r0, r11)
            return
        Lea0:
            r12 = r6
            r11 = r7
            r6 = r21
            r5 = r22
            r4 = r23
            r3 = r24
            r2 = r25
            java.lang.String r7 = "taskVoiceInput"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto Leb8
        Leb4:
            r11.m1211b()
            return
        Leb8:
            dx0 r7 = r1.f1418I
            if (r7 == 0) goto Lec4
            java.lang.String r0 = "TASK_VOICE_BUSY"
            java.lang.String r1 = "Voice input is already open."
            r11.m1210a(r0, r1, r12)
            return
        Lec4:
            java.lang.String r7 = "language"
            java.lang.Object r0 = r0.m4787F(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r7 = "ar-JO"
            if (r0 == 0) goto Lee3
            boolean r8 = p000.wo0.m4989a(r0, r7)
            if (r8 != 0) goto Lee0
            java.lang.String r8 = "en-US"
            boolean r8 = p000.wo0.m4989a(r0, r8)
            if (r8 == 0) goto Ledf
            goto Lee0
        Ledf:
            r0 = r12
        Lee0:
            if (r0 == 0) goto Lee3
            r7 = r0
        Lee3:
            java.lang.String r0 = "ar"
            boolean r0 = p000.kp1.m2635e(r7, r0)
            if (r0 == 0) goto Leee
            java.lang.String r0 = "احكِ ما تريد أن تتذكره"
            goto Lef0
        Leee:
            java.lang.String r0 = "What do you need to remember?"
        Lef0:
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r2)
            r8.putExtra(r4, r3)
            java.lang.String r2 = "android.speech.extra.LANGUAGE"
            r8.putExtra(r2, r7)
            java.lang.String r2 = "android.speech.extra.LANGUAGE_PREFERENCE"
            r8.putExtra(r2, r7)
            r8.putExtra(r5, r0)
            r2 = 3
            r8.putExtra(r6, r2)
            r1.f1418I = r11     // Catch: java.lang.Exception -> Lf11
            int r0 = r1.f1411B     // Catch: java.lang.Exception -> Lf11
            r1.startActivityForResult(r8, r0)     // Catch: java.lang.Exception -> Lf11
            goto Lf21
        Lf11:
            r0 = move-exception
            r1.f1418I = r12
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto Lf1c
            java.lang.String r0 = "Voice input is not available on this phone."
        Lf1c:
            java.lang.String r1 = "TASK_VOICE"
            r11.m1210a(r1, r0, r12)
        Lf21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.smart_life.MainActivity.m817w(com.example.smart_life.MainActivity, vb0, dx0):void");
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: A */
    public final File m818A(String str, String str2) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (cp1.m880j(str)) {
            km0.m2611d("Photo URI was missing.");
            return null;
        }
        Uri uri = Uri.parse(str);
        File file = new File(getCacheDir(), "SmartLifePhotoShare");
        if (!file.exists() && !file.mkdirs()) {
            C0000a.m5g("Could not prepare photo sharing storage.");
            return null;
        }
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str2).replaceAll("_");
        strReplaceAll.getClass();
        String strM888r = cp1.m888r(120, strReplaceAll);
        if (cp1.m880j(strM888r)) {
            strM888r = "Photo.jpg";
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = String.valueOf(str.hashCode());
        }
        Pattern patternCompile2 = Pattern.compile("[^A-Za-z0-9._-]");
        patternCompile2.getClass();
        lastPathSegment.getClass();
        String strReplaceAll2 = patternCompile2.matcher(lastPathSegment).replaceAll("_");
        strReplaceAll2.getClass();
        File file2 = new File(file, strReplaceAll2 + "_" + strM888r);
        if (!file2.isFile() || file2.length() <= 0) {
            InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException("Could not read this photo.");
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    rp2.m4053a(inputStreamOpenInputStream, fileOutputStream);
                    fileOutputStream.close();
                    inputStreamOpenInputStream.close();
                    if (!file2.isFile() || file2.length() <= 0) {
                        C0000a.m5g("Shared photo copy was empty.");
                        return null;
                    }
                } finally {
                }
            } finally {
            }
        }
        return file2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: B */
    public final File m819B(String str, long j) {
        if (cp1.m880j(str)) {
            km0.m2611d("Photo URI was missing.");
            return null;
        }
        Uri uri = Uri.parse(str);
        File file = new File(getCacheDir(), "SmartLifePhotoThumbs");
        if (!file.exists() && !file.mkdirs()) {
            C0000a.m5g("Could not prepare photo thumbnail storage.");
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = String.valueOf(str.hashCode());
        }
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9._-]");
        patternCompile.getClass();
        lastPathSegment.getClass();
        String strReplaceAll = patternCompile.matcher(lastPathSegment).replaceAll("_");
        strReplaceAll.getClass();
        File file2 = new File(file, strReplaceAll + "_" + j + ".jpg");
        if (!file2.isFile() || file2.length() <= 0) {
            Bitmap bitmapLoadThumbnail = Build.VERSION.SDK_INT >= 29 ? getContentResolver().loadThumbnail(uri, new Size(360, 360), null) : m820D(uri, 720);
            bitmapLoadThumbnail.getClass();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (!bitmapLoadThumbnail.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream)) {
                        throw new IllegalStateException("Could not encode photo thumbnail.");
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bitmapLoadThumbnail.recycle();
                    if (!file2.isFile() || file2.length() <= 0) {
                        C0000a.m5g("Photo thumbnail was empty.");
                        return null;
                    }
                } finally {
                }
            } catch (Throwable th) {
                bitmapLoadThumbnail.recycle();
                throw th;
            }
        }
        return file2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Type inference failed for: r3v5, types: [zu0] */
    /* renamed from: D */
    public final Bitmap m820D(Uri uri, final int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(getContentResolver(), uri);
            sourceCreateSource.getClass();
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(sourceCreateSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: zu0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    int i2 = i;
                    int i3 = MainActivity.f1409S;
                    imageDecoder.getClass();
                    imageInfo.getClass();
                    source.getClass();
                    imageDecoder.setAllocator(1);
                    int width = imageInfo.getSize().getWidth();
                    if (width < 1) {
                        width = 1;
                    }
                    int height = imageInfo.getSize().getHeight();
                    if (height < 1) {
                        height = 1;
                    }
                    int iMax = Math.max(width, height);
                    if (iMax > i2) {
                        float f = i2 / iMax;
                        int i4 = (int) (width * f);
                        if (i4 < 1) {
                            i4 = 1;
                        }
                        int i5 = (int) (height * f);
                        imageDecoder.setTargetSize(i4, i5 >= 1 ? i5 : 1);
                    }
                }
            });
            bitmapDecodeBitmap.getClass();
            return bitmapDecodeBitmap;
        }
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        try {
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException("Could not read this photo.");
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
            if (bitmapDecodeStream == null) {
                throw new IllegalStateException("Android could not decode this photo.");
            }
            inputStreamOpenInputStream.close();
            return bitmapDecodeStream;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: F */
    public final File m821F() {
        File externalFilesDir = getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS);
        if (externalFilesDir == null) {
            externalFilesDir = getFilesDir();
        }
        File file = new File(externalFilesDir, "SmartLifeDocuments");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        C0000a.m5g("Could not create document folder.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: G */
    public final void m822G(String str, String str2) {
        dx0 dx0Var = this.f1417H;
        File file = this.f1424O;
        if (file != null) {
            file.delete();
        }
        this.f1424O = null;
        this.f1417H = null;
        this.f1422M = 1;
        this.f1423N = 0;
        if (dx0Var != null) {
            dx0Var.m1210a(str, str2, null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: H */
    public final SharedPreferences m823H() {
        return (SharedPreferences) this.f1425P.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: I */
    public final SharedPreferences m824I() {
        return (SharedPreferences) this.f1426Q.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: J */
    public final void m825J() {
        try {
            startActivityForResult(new Intent().setClassName(this, "com.filesearch.app.SmartFilesActivity"), this.f1410A);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Could not open Google document scanner.";
            }
            m822G("SCAN_START", message);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: K */
    public final ArrayList m826K() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        long j;
        long j2;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string;
        int i6 = Build.VERSION.SDK_INT;
        Uri contentUri = i6 >= 29 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        ArrayList arrayListM4091d = AbstractC0675rt.m4091d("_id", "_display_name", "bucket_display_name", "datetaken", "date_modified");
        if (i6 >= 29) {
            arrayListM4091d.add("relative_path");
        } else {
            arrayListM4091d.add("_data");
        }
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = getContentResolver().query(contentUri, (String[]) arrayListM4091d.toArray(new String[0]), null, null, "datetaken DESC, date_modified DESC");
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("_display_name");
            int columnIndex = cursorQuery.getColumnIndex("bucket_display_name");
            int columnIndex2 = cursorQuery.getColumnIndex("datetaken");
            int columnIndex3 = cursorQuery.getColumnIndex("date_modified");
            int columnIndex4 = i6 >= 29 ? cursorQuery.getColumnIndex("relative_path") : cursorQuery.getColumnIndex("_data");
            while (cursorQuery.moveToNext()) {
                long j3 = cursorQuery.getLong(columnIndexOrThrow);
                String string2 = cursorQuery.getString(columnIndexOrThrow2);
                if (string2 == null) {
                    string2 = "Photo";
                }
                String str = "Other";
                if (columnIndex >= 0 && (string = cursorQuery.getString(columnIndex)) != null) {
                    if (cp1.m880j(string)) {
                        string = null;
                    }
                    if (string != null) {
                        str = string;
                    }
                }
                long j4 = columnIndex2 >= 0 ? cursorQuery.getLong(columnIndex2) : 0L;
                long j5 = columnIndex3 >= 0 ? cursorQuery.getLong(columnIndex3) : 0L;
                long j6 = j5 > 0 ? j5 * 1000 : 0L;
                if (j4 > 0) {
                    long j7 = j4;
                    j = 0;
                    j2 = j7;
                } else {
                    j = 0;
                    j2 = j6;
                }
                if (j2 > j) {
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j2);
                    i = columnIndexOrThrow;
                    i2 = calendar.get(1);
                } else {
                    i = columnIndexOrThrow;
                    i2 = 0;
                }
                String str2 = "";
                if (columnIndex4 >= 0) {
                    i4 = i2;
                    String string3 = cursorQuery.getString(columnIndex4);
                    if (string3 == null || cp1.m880j(string3)) {
                        i3 = columnIndex4;
                    } else {
                        i3 = columnIndex4;
                        if (Build.VERSION.SDK_INT >= 29) {
                            i5 = columnIndexOrThrow2;
                            String absolutePath = new File(Environment.getExternalStorageDirectory(), string3 + string2).getAbsolutePath();
                            absolutePath.getClass();
                            str2 = absolutePath;
                        } else {
                            i5 = columnIndexOrThrow2;
                            str2 = string3;
                        }
                        arrayList.add(sv0.m4312c(new p51("uri", Uri.withAppendedPath(contentUri, String.valueOf(j3)).toString()), new p51("path", str2), new p51("name", string2), new p51("folder", str), new p51("year", Integer.valueOf(i4)), new p51("modifiedMs", Long.valueOf(j2))));
                        columnIndexOrThrow = i;
                        columnIndex4 = i3;
                        columnIndexOrThrow2 = i5;
                    }
                } else {
                    i3 = columnIndex4;
                    i4 = i2;
                }
                i5 = columnIndexOrThrow2;
                arrayList.add(sv0.m4312c(new p51("uri", Uri.withAppendedPath(contentUri, String.valueOf(j3)).toString()), new p51("path", str2), new p51("name", string2), new p51("folder", str), new p51("year", Integer.valueOf(i4)), new p51("modifiedMs", Long.valueOf(j2))));
                columnIndexOrThrow = i;
                columnIndex4 = i3;
                columnIndexOrThrow2 = i5;
            }
            cursorQuery.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: L */
    public final ArrayList m827L() {
        Iterable<File> iterableM3833v;
        File[] fileArrListFiles = m821F().listFiles();
        if (fileArrListFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file : fileArrListFiles) {
                if (file.isFile() && (za0.m5409a(file).equalsIgnoreCase("pdf") || za0.m5409a(file).equalsIgnoreCase("jpg") || za0.m5409a(file).equalsIgnoreCase("jpeg"))) {
                    arrayList.add(file);
                }
            }
            iterableM3833v = AbstractC0638qt.m3833v(arrayList, new j22(3));
        } else {
            iterableM3833v = d60.f1716l;
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0712st.m4299g(iterableM3833v, 10));
        for (File file2 : iterableM3833v) {
            String str = "general";
            String string = m823H().getString(file2.getAbsolutePath(), "general");
            if (string != null) {
                str = string;
            }
            arrayList2.add(m812E(file2, str));
        }
        return arrayList2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: N */
    public final File m828N(File file) {
        Bitmap bitmapDecodeFile;
        if (!file.isFile()) {
            C0000a.m5g("Photo file was not found.");
            return null;
        }
        String strM5409a = za0.m5409a(file);
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strM5409a.toLowerCase(locale);
        lowerCase.getClass();
        if (!lowerCase.equals("heic") && !lowerCase.equals("heif")) {
            return file;
        }
        File file2 = new File(getCacheDir(), "SmartLifePhotoPreview");
        if (!file2.exists() && !file2.mkdirs()) {
            C0000a.m5g("Could not prepare photo preview storage.");
            return null;
        }
        String name = file.getName();
        name.getClass();
        int iLastIndexOf = name.lastIndexOf(".", name.length() - 1);
        if (iLastIndexOf != -1) {
            name = name.substring(0, iLastIndexOf);
        }
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9._ -]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(name).replaceAll("_");
        strReplaceAll.getClass();
        File file3 = new File(file2, strReplaceAll + "_" + file.lastModified() + ".jpg");
        if (!file3.isFile() || file3.length() <= 0) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(file.getAbsolutePath(), options);
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                bitmapDecodeFile = null;
            } else {
                int i = 1;
                while (true) {
                    int i2 = i * 2;
                    if (options.outWidth / i2 < 2048) {
                        break;
                    }
                    i = i2;
                }
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inSampleSize = i >= 1 ? i : 1;
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath(), options2);
            }
            if (bitmapDecodeFile == null) {
                C0000a.m5g("Android could not decode this HEIC/HEIF photo.");
                return null;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3);
                try {
                    if (!bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 94, fileOutputStream)) {
                        throw new IllegalStateException("Could not create the photo preview.");
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bitmapDecodeFile.recycle();
                    if (!file3.isFile() || file3.length() <= 0) {
                        C0000a.m5g("Photo preview was empty.");
                        return null;
                    }
                } finally {
                }
            } catch (Throwable th) {
                bitmapDecodeFile.recycle();
                throw th;
            }
        }
        return file3;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: P */
    public final void m829P() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File file = this.f1424O;
        if (file == null) {
            C0000a.m5g("Front side was not available.");
            return;
        }
        File fileM816S = m816S(m821F(), m814O(this.f1421L) + "_" + m815Q());
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileM816S);
            try {
                rp2.m4053a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                m831v(fileM816S);
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: R */
    public final void m830R(int i, dx0 dx0Var) {
        this.f1417H = dx0Var;
        int i2 = i <= 1 ? 1 : 2;
        this.f1422M = i2;
        this.f1423N = i2 != 2 ? 0 : 1;
        File file = this.f1424O;
        if (file != null) {
            file.delete();
        }
        this.f1424O = null;
        m825J();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.nc0
    /* renamed from: g */
    public final void mo186g(mc0 mc0Var) {
        mc0Var.getClass();
        ad0 ad0Var = this.f884x;
        if (ad0Var == null) {
            ad0Var = (ad0) ((qf0) this.f8579s.f9403m).f8129d.m1389D("flutter_fragment");
        }
        if (ad0Var == null || !ad0Var.f262V.f3974g) {
            m63.m2949a(mc0Var);
        }
        new C0910y5(mc0Var.f6186c.f5628p, this.f1428z).m5211U(new C0641qw(15, this));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[INVOKE, INVOKE]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0224  */
    @Override // p000.bd0, p000.rf0, p000.AbstractActivityC0972zu, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityResult(int i, int i2, Intent intent) throws IOException {
        String stringExtra;
        String stringExtra2;
        File file;
        String str;
        String str2;
        super.onActivityResult(i, i2, intent);
        String string = null;
        if (i == this.f1411B) {
            dx0 dx0Var = this.f1418I;
            this.f1418I = null;
            if (i2 != -1 || intent == null) {
                if (dx0Var != null) {
                    dx0Var.m1212d("");
                    return;
                }
                return;
            }
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (dx0Var != null) {
                if (stringArrayListExtra != null && (str2 = (String) AbstractC0638qt.m3826o(stringArrayListExtra)) != null) {
                    string = cp1.m889s(str2).toString();
                }
                dx0Var.m1212d(string != null ? string : "");
                return;
            }
            return;
        }
        if (i == this.f1412C) {
            dx0 dx0Var2 = this.f1419J;
            this.f1419J = null;
            if (i2 != -1 || intent == null) {
                if (dx0Var2 != null) {
                    dx0Var2.m1212d("");
                    return;
                }
                return;
            }
            ArrayList<String> stringArrayListExtra2 = intent.getStringArrayListExtra("android.speech.extra.RESULTS");
            if (dx0Var2 != null) {
                if (stringArrayListExtra2 != null && (str = (String) AbstractC0638qt.m3826o(stringArrayListExtra2)) != null) {
                    string = cp1.m889s(str).toString();
                }
                dx0Var2.m1212d(string != null ? string : "");
                return;
            }
            return;
        }
        int i3 = 0;
        if (i == this.f1413D) {
            dx0 dx0Var3 = this.f1414E;
            this.f1414E = null;
            if (dx0Var3 == null) {
                return;
            }
            if (i2 != -1 || intent == null) {
                dx0Var3.m1212d(d60.f1716l);
                return;
            }
            try {
                ArrayList arrayList = new ArrayList();
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        Uri uri = clipData.getItemAt(i4).getUri();
                        uri.getClass();
                        arrayList.add(uri);
                    }
                } else {
                    Uri data = intent.getData();
                    if (data != null) {
                        arrayList.add(data);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0712st.m4299g(arrayList, 10));
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj = arrayList.get(i5);
                    i5++;
                    int i6 = i3 + 1;
                    if (i3 < 0) {
                        AbstractC0675rt.m4093f();
                        throw null;
                    }
                    File fileM832x = m832x((Uri) obj, i3);
                    arrayList2.add(sv0.m4312c(new p51("path", fileM832x.getAbsolutePath()), new p51("name", fileM832x.getName())));
                    i3 = i6;
                }
                dx0Var3.m1212d(arrayList2);
                return;
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "Could not read the selected file.";
                }
                dx0Var3.m1210a("CONVERTER_PICK", message, null);
                return;
            }
        }
        if (i == this.f1415F) {
            dx0 dx0Var4 = this.f1416G;
            this.f1416G = null;
            if (dx0Var4 != null) {
                dx0Var4.m1212d(Boolean.valueOf(i2 == -1));
                return;
            }
            return;
        }
        if (i != this.f1410A) {
            return;
        }
        if (i2 == 0) {
            if (this.f1422M != 2 || this.f1423N != 2 || (file = this.f1424O) == null || !file.isFile()) {
                m822G("SCAN_CANCELLED", "Document scan was cancelled.");
                return;
            }
            try {
                m829P();
                return;
            } catch (Exception e2) {
                String message2 = e2.getMessage();
                m822G("SCAN_SAVE", message2 != null ? message2 : "Could not save scanned document.");
                return;
            }
        }
        if (i2 != -1 || intent == null) {
            if (intent == null || (stringExtra = intent.getStringExtra("smart_life_scan_error")) == null) {
                stringExtra = "Could not open Google document scanner.";
            }
            m822G("SCAN_START", stringExtra);
            return;
        }
        try {
            stringExtra2 = intent.getStringExtra("smart_life_scan_path");
        } catch (Exception e3) {
            String message3 = e3.getMessage();
            m822G("SCAN_SAVE", message3 != null ? message3 : "Could not save scanned document.");
        }
        if (stringExtra2 == null) {
            throw new IllegalStateException("Scanner returned no saved page.");
        }
        File file2 = new File(stringExtra2);
        if (!file2.isFile() || file2.length() <= 0) {
            throw new IllegalStateException("Scanned page was empty.");
        }
        int i7 = this.f1422M;
        if (i7 == 2 && this.f1423N == 1) {
            File file3 = this.f1424O;
            if (file3 != null) {
                file3.delete();
            }
            this.f1424O = file2;
            this.f1423N = 2;
            m825J();
            return;
        }
        if (i7 == 2 && this.f1423N == 2) {
            File file4 = this.f1424O;
            if (file4 == null) {
                throw new IllegalStateException("Front side was not available.");
            }
            try {
                m831v(m833y(file4, file2));
                return;
            } finally {
                file2.delete();
            }
        }
        File fileM816S = m816S(m821F(), m814O(this.f1421L) + "_" + m815Q());
        FileInputStream fileInputStream = new FileInputStream(file2);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileM816S);
            try {
                rp2.m4053a(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
                file2.delete();
                m831v(fileM816S);
                return;
            } finally {
            }
        } finally {
        }
        String message32 = e3.getMessage();
        m822G("SCAN_SAVE", message32 != null ? message32 : "Could not save scanned document.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.rf0, android.app.Activity
    public final void onPause() {
        e61 e61Var = (e61) this.f1427R.getValue();
        synchronized (e61Var) {
            e61Var.f2181d = false;
            try {
                ServerSocket serverSocket = e61Var.f2182e;
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (Exception unused) {
            }
            e61Var.f2182e = null;
        }
        super.onPause();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.rf0, android.app.Activity
    public final void onResume() {
        super.onResume();
        e61 e61Var = (e61) this.f1427R.getValue();
        synchronized (e61Var) {
            int i = 1;
            if (e61Var.f2181d) {
                if (e61Var.f2181d) {
                    new Thread(new d61(e61Var, i), "SmartLifePhoneRegister").start();
                }
            } else {
                e61Var.f2181d = true;
                new Thread(new d61(e61Var, 0), "SmartLifePhoneReceiver").start();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: v */
    public final void m831v(File file) {
        String str = this.f1420K;
        m823H().edit().putString(file.getAbsolutePath(), str).apply();
        dx0 dx0Var = this.f1417H;
        File file2 = this.f1424O;
        if (file2 != null) {
            file2.delete();
        }
        this.f1424O = null;
        this.f1417H = null;
        this.f1422M = 1;
        this.f1423N = 0;
        if (dx0Var != null) {
            dx0Var.m1212d(m812E(file, str));
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: x */
    public final File m832x(Uri uri, int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String string;
        File file = new File(getCacheDir(), "SmartLifeConverterInput");
        if (!file.exists() && !file.mkdirs()) {
            C0000a.m5g("Could not prepare Converter storage.");
            return null;
        }
        Cursor cursorQuery = getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                string = (columnIndex < 0 || !cursorQuery.moveToFirst()) ? null : cursorQuery.getString(columnIndex);
                cursorQuery.close();
            } finally {
            }
        } else {
            string = null;
        }
        String str = "converter_" + System.currentTimeMillis() + "_" + i;
        if (string == null) {
            string = str;
        }
        Pattern patternCompile = Pattern.compile("[\\\\/:*?\"<>|]+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(string).replaceAll("_");
        strReplaceAll.getClass();
        String strM888r = cp1.m888r(120, cp1.m889s(strReplaceAll).toString());
        if (!cp1.m880j(strM888r)) {
            str = strM888r;
        }
        File file2 = new File(file, str);
        int iM881k = cp1.m881k(str);
        String strSubstring = iM881k > 0 ? str.substring(0, iM881k) : str;
        String strSubstring2 = iM881k > 0 ? str.substring(iM881k) : "";
        int i2 = 2;
        while (file2.exists()) {
            file2 = new File(file, strSubstring + "_" + i2 + strSubstring2);
            i2++;
        }
        InputStream inputStreamOpenInputStream = getContentResolver().openInputStream(uri);
        try {
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException("Could not read the selected file.");
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                rp2.m4053a(inputStreamOpenInputStream, fileOutputStream);
                fileOutputStream.close();
                inputStreamOpenInputStream.close();
                if (file2.isFile() && file2.length() > 0) {
                    return file2;
                }
                C0000a.m5g("Selected file was empty.");
                return null;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: y */
    public final File m833y(File file, File file2) throws Throwable {
        int i;
        Bitmap bitmapM811C = m811C(file);
        Bitmap bitmap = null;
        if (bitmapM811C == null) {
            C0000a.m5g("Could not read the front scan.");
            return null;
        }
        Bitmap bitmapM811C2 = m811C(file2);
        if (bitmapM811C2 == null) {
            bitmapM811C.recycle();
            C0000a.m5g("Could not read the back scan.");
            return null;
        }
        File fileM816S = m816S(m821F(), m814O(this.f1421L) + "_" + m815Q() + "_Front_Back");
        try {
            int iMax = Math.max(1, (int) Math.rint((1800.0f / bitmapM811C.getWidth()) * bitmapM811C.getHeight()));
            int iMax2 = Math.max(1, (int) Math.rint((1800.0f / bitmapM811C2.getWidth()) * bitmapM811C2.getHeight()));
            if (iMax + iMax2 > 2734) {
                int iMax3 = Math.max(1, (int) Math.rint((2734.0f / r5) * 1800.0f));
                float f = iMax3;
                int iMax4 = Math.max(1, (int) Math.rint((f / bitmapM811C.getWidth()) * bitmapM811C.getHeight()));
                iMax2 = Math.max(1, (int) Math.rint((f / bitmapM811C2.getWidth()) * bitmapM811C2.getHeight()));
                i = iMax3;
                iMax = iMax4;
            } else {
                i = 1800;
            }
            int iMax5 = Math.max(260, (3394 - ((iMax + 140) + iMax2)) / 2);
            int i2 = (2400 - i) / 2;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(2400, 3394, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawColor(-1);
                Paint paint = new Paint(7);
                float f2 = i2;
                float f3 = iMax5;
                float f4 = i2 + i;
                int i3 = iMax5 + iMax;
                canvas.drawBitmap(bitmapM811C, (Rect) null, new RectF(f2, f3, f4, i3), paint);
                canvas.drawBitmap(bitmapM811C2, (Rect) null, new RectF(f2, i3 + 140, f4, r3 + iMax2), paint);
                FileOutputStream fileOutputStream = new FileOutputStream(fileM816S);
                try {
                    if (!bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 96, fileOutputStream)) {
                        throw new IllegalStateException("Could not encode front/back scan.");
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bitmapCreateBitmap.recycle();
                    bitmapM811C.recycle();
                    bitmapM811C2.recycle();
                    if (fileM816S.isFile() && fileM816S.length() > 0) {
                        return fileM816S;
                    }
                    C0000a.m5g("Combined front/back scan was empty.");
                    return null;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                bitmapM811C.recycle();
                bitmapM811C2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: z */
    public final File m834z(String str, long j) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (cp1.m880j(str)) {
            km0.m2611d("Photo URI was missing.");
            return null;
        }
        Uri uri = Uri.parse(str);
        File file = new File(getCacheDir(), "SmartLifePhotoPreviewMediaStore");
        if (!file.exists() && !file.mkdirs()) {
            C0000a.m5g("Could not prepare photo preview storage.");
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = String.valueOf(str.hashCode());
        }
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9._-]");
        patternCompile.getClass();
        lastPathSegment.getClass();
        String strReplaceAll = patternCompile.matcher(lastPathSegment).replaceAll("_");
        strReplaceAll.getClass();
        File file2 = new File(file, strReplaceAll + "_" + j + ".jpg");
        if (!file2.isFile() || file2.length() <= 0) {
            Bitmap bitmapM820D = m820D(uri, 2400);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    if (!bitmapM820D.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream)) {
                        throw new IllegalStateException("Could not encode photo preview.");
                    }
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    bitmapM820D.recycle();
                    if (!file2.isFile() || file2.length() <= 0) {
                        C0000a.m5g("Photo preview was empty.");
                        return null;
                    }
                } finally {
                }
            } catch (Throwable th) {
                bitmapM820D.recycle();
                throw th;
            }
        }
        return file2;
    }
}
