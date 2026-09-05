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

    public MainActivity() {
        final int i = 0;
        this.f1425P = new fr1(new ah0(this) { // from class: qu0

            /* renamed from: m */
            public final /* synthetic */ MainActivity f8301m;

            {
                this.f8301m = this;
            }

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

            {
                this.f8301m = this;
            }

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

            {
                this.f8301m = this;
            }

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

    /* renamed from: E */
    public static Map m812E(File file, String str) {
        return sv0.m4312c(new p51("path", file.getAbsolutePath()), new p51("name", file.getName()), new p51("size", Long.valueOf(file.length())), new p51("modifiedMs", Long.valueOf(file.lastModified())), new p51("category", str));
    }

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

    /* renamed from: Q */
    public static String m815Q() {
        String str = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US).format(new Date());
        str.getClass();
        return str;
    }

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
            Method dump skipped, instructions count: 4024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.smart_life.MainActivity.m817w(com.example.smart_life.MainActivity, vb0, dx0):void");
    }

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

    /* JADX WARN: Type inference failed for: r3v5, types: [zu0] */
    /* renamed from: D */
    public final Bitmap m820D(Uri uri, final int i) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(getContentResolver(), uri);
            sourceCreateSource.getClass();
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(sourceCreateSource, new ImageDecoder.OnHeaderDecodedListener() { // from class: zu0
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

    /* renamed from: H */
    public final SharedPreferences m823H() {
        return (SharedPreferences) this.f1425P.getValue();
    }

    /* renamed from: I */
    public final SharedPreferences m824I() {
        return (SharedPreferences) this.f1426Q.getValue();
    }

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
