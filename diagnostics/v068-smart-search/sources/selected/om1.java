package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import android.provider.MediaStore;
import com.example.smart_life.MainActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public abstract class om1 {

    /* renamed from: a */
    public static final HashSet f7171a = new HashSet(Arrays.asList("pdf", "jpg", "jpeg", "png", "webp", "heic", "heif"));

    /* renamed from: b */
    public static final HashSet f7172b = new HashSet(Arrays.asList("pdf", "jpg", "jpeg", "png", "webp", "heic", "heif", "docx", "xlsx", "xlsm", "pptx", "ppsx", "rtf", "ods", "odp", "txt", "csv"));

    /* renamed from: c */
    public static final HashSet f7173c = new HashSet(Arrays.asList("the", "and", "for", "with", "from", "this", "that", "your", "you", "are", "was", "were", "document", "documents", "copy", "scan", "scanned", "file", "files", "final", "new", "page", "of", "to", "in", p41.f7450w, "at", "a", "an", "is", "be", "by", "or", "as", "it", "هذا", "هذه", "على", "في", "من", "إلى", "الى", "عن", "مع", "هو", "هي", "تم", "ملف", "نسخة", "مستند", "صفحة", "نهائي", "الجديد", "جديد"));

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: a */
    public static int m3393a(String str) {
        String lowerCase = str == null ? "" : str.toLowerCase(Locale.ROOT);
        if (lowerCase.contains("whatsapp images") || lowerCase.contains("/whatsapp/media/")) {
            return 0;
        }
        if (lowerCase.contains("screenshot")) {
            return 1;
        }
        if (lowerCase.contains("/download/") || lowerCase.contains("/downloads/")) {
            return 2;
        }
        return (lowerCase.contains("/dcim/") || lowerCase.contains("/pictures/")) ? 3 : 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: b */
    public static String m3394b(String str, String str2) {
        int i = 0;
        char c = ' ';
        String strTrim = str.replace((char) 0, ' ').trim();
        if (strTrim.isEmpty()) {
            return m3395c(str2);
        }
        String[] strArrSplit = strTrim.split("\\r?\\n");
        ArrayList arrayList = new ArrayList();
        int length = strArrSplit.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = strArrSplit[i2];
            if (i3 > 80) {
                break;
            }
            String strTrim2 = str3 == null ? "" : str3.replace((char) 0, c).replaceAll("\\s+", " ").trim();
            i3++;
            if (strTrim2.length() >= 4 && strTrim2.length() <= 120) {
                String lowerCase = strTrim2.toLowerCase(Locale.ROOT);
                if (!lowerCase.matches(".*\\b[0-9]{6,}\\b.*") && (!lowerCase.contains("@") || !lowerCase.contains("."))) {
                    String[] strArr = {"passport no", "passport number", "account number", "iban", "swift", "ssn", "social security", "national id", "identity number", "card number", "رقم الجواز", "رقم الحساب", "رقم الهوية", "آيبان"};
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 14) {
                            ArrayList arrayListM3407o = m3407o(strTrim2);
                            if (arrayListM3407o.size() >= 2 && arrayListM3407o.size() <= 14) {
                                double dMin = 35.0d - (Math.min(30, i3) * 0.6d);
                                if (arrayListM3407o.size() <= 6) {
                                    dMin += 15.0d;
                                }
                                if (strTrim2.length() <= 55) {
                                    dMin += 8.0d;
                                }
                                if (!strTrim2.endsWith(".") && !strTrim2.endsWith(":")) {
                                    int i5 = 0;
                                    int i6 = 0;
                                    for (int i7 = 0; i7 < strTrim2.length(); i7++) {
                                        char cCharAt = strTrim2.charAt(i7);
                                        if (Character.isLetter(cCharAt)) {
                                            i5++;
                                        } else if (Character.isDigit(cCharAt)) {
                                            i6++;
                                        }
                                    }
                                    if (i5 >= 4 && i6 <= Math.max(2, i5 / 3)) {
                                        dMin += 12.0d;
                                    }
                                }
                                String str4 = " " + String.join(" ", arrayListM3407o).toLowerCase(Locale.ROOT) + " ";
                                String[] strArr2 = {" test ", " exam ", " assessment ", " diagnostic ", " invoice ", " statement ", " report ", " newsletter ", " lesson ", " plan ", " goals ", " contract ", " agreement ", " receipt ", " اختبار ", " تشخيصي ", " تقييم ", " فاتورة ", " كشف ", " تقرير ", " نشرة ", " خطة ", " أهداف ", " عقد "};
                                double d = 0.0d;
                                for (int i8 = 0; i8 < 24; i8++) {
                                    if (str4.contains(strArr2[i8])) {
                                        d += 6.0d;
                                    }
                                }
                                arrayList.add(new mm1(arrayListM3407o, dMin + d));
                            }
                        } else {
                            if (lowerCase.contains(strArr[i4])) {
                                break;
                            }
                            i4++;
                        }
                    }
                }
            }
            i2++;
            c = ' ';
        }
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList, new j22(7));
            String strM3396d = m3396d(((mm1) arrayList.get(0)).f6315a);
            if (!strM3396d.isEmpty()) {
                return strM3396d;
            }
        }
        HashMap map = new HashMap();
        ArrayList arrayListM3407o2 = m3407o(strTrim.substring(0, Math.min(strTrim.length(), 5000)));
        int size = arrayListM3407o2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayListM3407o2.get(i10);
            i10++;
            String str5 = (String) obj;
            if (str5.length() >= 2) {
                if (!f7173c.contains(str5.toLowerCase(Locale.ROOT)) && !m3399g(str5)) {
                    double dMax = Math.max(0.0d, 4.0d - (i9 / 20.0d)) + 1.0d;
                    if (map.containsKey(str5)) {
                        dMax += ((Double) map.get(str5)).doubleValue();
                    }
                    map.put(str5, Double.valueOf(dMax));
                    i9++;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(map.entrySet());
        Collections.sort(arrayList2, new j22(8));
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            arrayList3.add((String) ((Map.Entry) obj2).getKey());
            if (arrayList3.size() >= 4) {
                break;
            }
        }
        return !arrayList3.isEmpty() ? m3406n(arrayList3) : m3395c(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: c */
    public static String m3395c(String str) {
        if (str == null) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf > 0) {
            str = str.substring(0, iLastIndexOf);
        }
        return m3396d(m3407o(str.replaceAll("(?i)^copy\\s+of\\s+", "").replaceAll("(?i)^(doc|document|scan|img)[-_ ]*\\d+[-_0-9a-z]*", "").replace('_', ' ').replace('-', ' ').replaceAll("\\s+", " ").trim()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: d */
    public static String m3396d(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str = (String) obj;
            if (str != null) {
                String strTrim = str.trim();
                if (strTrim.isEmpty()) {
                    continue;
                } else {
                    if (!f7173c.contains(strTrim.toLowerCase(Locale.ROOT)) && !m3399g(strTrim)) {
                        linkedHashSet.add(strTrim);
                        if (linkedHashSet.size() >= 5) {
                            break;
                        }
                    }
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                String str2 = (String) obj2;
                if (str2 != null && !str2.trim().isEmpty() && !m3399g(str2)) {
                    linkedHashSet.add(str2.trim());
                    if (linkedHashSet.size() >= 5) {
                        break;
                    }
                }
            }
        }
        return m3406n(new ArrayList(linkedHashSet));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION, THROW, IF] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039d A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x03bc A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03c0 A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c7 A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03cb A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03d2 A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03d6 A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03de A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03e9 A[Catch: FileNotFoundException -> 0x0358, TryCatch #5 {FileNotFoundException -> 0x0358, blocks: (B:213:0x0338, B:215:0x033e, B:217:0x034a, B:246:0x03a3, B:247:0x03b6, B:258:0x03e9, B:260:0x03f7, B:249:0x03bc, B:250:0x03c0, B:251:0x03c7, B:252:0x03cb, B:253:0x03d2, B:254:0x03d6, B:256:0x03de, B:245:0x039d, B:242:0x038d, B:268:0x0426, B:269:0x042d), top: B:303:0x0338 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0473 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f8  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m3397e(Context context, File file, String str, tm3 tm3Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        char c;
        String string;
        x80 x80Var;
        int iM5086d;
        Matrix matrix;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        hs1 hs1Var;
        String strSubstring;
        ArrayList arrayListM4386e;
        int size;
        int i;
        str.getClass();
        c = 4;
        switch (str) {
            case "csv":
            case "txt":
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line != null && sb.length() < 300000) {
                            sb.append(line);
                            sb.append('\n');
                        }
                    } finally {
                    }
                }
                bufferedReader.close();
                string = sb.toString();
                return string != null ? "" : string.length() > 300000 ? string.substring(0, 300000) : string;
            case "jpg":
            case "png":
            case "heic":
            case "heif":
            case "jpeg":
            case "webp":
                Uri uriFromFile = Uri.fromFile(file);
                df3.m1135e(uriFromFile, "Please provide a valid imageUri");
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                hn0 hn0Var = hn0.f3708b;
                ContentResolver contentResolver = context.getContentResolver();
                hn0Var.getClass();
                jj0 jj0Var = hn0.f3707a;
                try {
                    Bitmap bitmap2 = MediaStore.Images.Media.getBitmap(contentResolver, uriFromFile);
                    if (bitmap2 == null) {
                        throw new IOException("The image Uri could not be resolved.");
                    }
                    if ("content".equals(uriFromFile.getScheme()) || "file".equals(uriFromFile.getScheme())) {
                        try {
                            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uriFromFile);
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    x80Var = new x80(inputStreamOpenInputStream);
                                } catch (Throwable th) {
                                    try {
                                        inputStreamOpenInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                            throw th;
                                        } catch (Exception unused) {
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                x80Var = null;
                            }
                            if (inputStreamOpenInputStream != null) {
                                try {
                                    inputStreamOpenInputStream.close();
                                } catch (IOException e) {
                                    e = e;
                                    jj0Var.m2358a("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uriFromFile)), e);
                                    if (x80Var == null) {
                                    }
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            x80Var = null;
                            jj0Var.m2358a("MLKitImageUtils", "failed to open file to read rotation meta data: ".concat(String.valueOf(uriFromFile)), e);
                            if (x80Var == null) {
                            }
                        }
                        if (x80Var == null) {
                            iM5086d = 0;
                            Matrix matrix2 = new Matrix();
                            int width = bitmap2.getWidth();
                            int height = bitmap2.getHeight();
                            switch (iM5086d) {
                                case w81.FLOAT_FIELD_NUMBER /* 2 */:
                                    matrix2 = new Matrix();
                                    matrix2.postScale(-1.0f, 1.0f);
                                    matrix = matrix2;
                                    break;
                                case w81.INTEGER_FIELD_NUMBER /* 3 */:
                                    matrix2.postRotate(180.0f);
                                    matrix = matrix2;
                                    break;
                                case w81.LONG_FIELD_NUMBER /* 4 */:
                                    matrix2.postScale(1.0f, -1.0f);
                                    matrix = matrix2;
                                    break;
                                case w81.STRING_FIELD_NUMBER /* 5 */:
                                    matrix2.postRotate(90.0f);
                                    matrix2.postScale(-1.0f, 1.0f);
                                    matrix = matrix2;
                                    break;
                                case w81.STRING_SET_FIELD_NUMBER /* 6 */:
                                    matrix2.postRotate(90.0f);
                                    matrix = matrix2;
                                    break;
                                case w81.DOUBLE_FIELD_NUMBER /* 7 */:
                                    matrix2.postRotate(-90.0f);
                                    matrix2.postScale(-1.0f, 1.0f);
                                    matrix = matrix2;
                                    break;
                                case w81.BYTES_FIELD_NUMBER /* 8 */:
                                    matrix2.postRotate(-90.0f);
                                    matrix = matrix2;
                                    break;
                                default:
                                    matrix = null;
                                    break;
                            }
                            if (matrix != null) {
                                bitmapCreateBitmap = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, true);
                                bitmap = bitmap2;
                                if (bitmap != bitmapCreateBitmap) {
                                    bitmap.recycle();
                                }
                                go0 go0Var = new go0(bitmapCreateBitmap);
                                go0.m1843a(jElapsedRealtime, 4, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount());
                                hs1Var = (hs1) bj3.m507a(tm3Var.m4462c(go0Var));
                                if (hs1Var != null) {
                                    strSubstring = hs1Var.f3769a;
                                    string = strSubstring;
                                }
                                string = "";
                            } else {
                                bitmap = bitmap2;
                            }
                            bitmapCreateBitmap = bitmap;
                            go0 go0Var2 = new go0(bitmapCreateBitmap);
                            go0.m1843a(jElapsedRealtime, 4, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount());
                            hs1Var = (hs1) bj3.m507a(tm3Var.m4462c(go0Var2));
                            if (hs1Var != null) {
                            }
                            string = "";
                        } else {
                            iM5086d = x80Var.m5086d(1, "Orientation");
                            Matrix matrix22 = new Matrix();
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            switch (iM5086d) {
                            }
                            if (matrix != null) {
                            }
                            bitmapCreateBitmap = bitmap;
                            go0 go0Var22 = new go0(bitmapCreateBitmap);
                            go0.m1843a(jElapsedRealtime, 4, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount());
                            hs1Var = (hs1) bj3.m507a(tm3Var.m4462c(go0Var22));
                            if (hs1Var != null) {
                            }
                            string = "";
                        }
                    } else {
                        iM5086d = 0;
                        Matrix matrix222 = new Matrix();
                        int width22 = bitmap2.getWidth();
                        int height22 = bitmap2.getHeight();
                        switch (iM5086d) {
                        }
                        if (matrix != null) {
                        }
                        bitmapCreateBitmap = bitmap;
                        go0 go0Var222 = new go0(bitmapCreateBitmap);
                        go0.m1843a(jElapsedRealtime, 4, bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getAllocationByteCount());
                        hs1Var = (hs1) bj3.m507a(tm3Var.m4462c(go0Var222));
                        if (hs1Var != null) {
                        }
                        string = "";
                    }
                    if (string != null) {
                    }
                } catch (FileNotFoundException e3) {
                    jj0Var.m2358a("MLKitImageUtils", "Could not open file: ".concat(String.valueOf(uriFromFile)), e3);
                    throw e3;
                }
                break;
            case "odp":
            case "ods":
            case "rtf":
            case "docx":
            case "ppsx":
            case "pptx":
            case "xlsm":
            case "xlsx":
                if (!file.isFile()) {
                    km0.m2611d("Office file is unavailable.");
                    return null;
                }
                String strM4383b = tb3.m4383b(file);
                switch (strM4383b.hashCode()) {
                    case 109883:
                        if (strM4383b.equals("odp")) {
                            c = 0;
                            break;
                        } else {
                            c = 65535;
                            break;
                        }
                    case 109886:
                        if (strM4383b.equals("ods")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 113252:
                        if (strM4383b.equals("rtf")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3088960:
                        if (strM4383b.equals("docx")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3447909:
                        if (!strM4383b.equals("ppsx")) {
                        }
                        break;
                    case 3447940:
                        if (strM4383b.equals("pptx")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3682382:
                        if (strM4383b.equals("xlsm")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 3682393:
                        if (strM4383b.equals("xlsx")) {
                            c = 7;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                        arrayListM4386e = tb3.m4386e(file, "odp".equals(strM4383b));
                        StringBuilder sb2 = new StringBuilder();
                        size = arrayListM4386e.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                                Object obj = arrayListM4386e.get(i);
                                i++;
                                h01 h01Var = (h01) obj;
                                String str2 = h01Var.f3494a;
                                if (str2 != null && !str2.trim().isEmpty()) {
                                    sb2.append(h01Var.f3494a.trim());
                                    sb2.append('\n');
                                }
                                ArrayList arrayList = h01Var.f3495b;
                                int size2 = arrayList.size();
                                int i2 = 0;
                                while (i2 < size2) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    String str3 = (String) obj2;
                                    if (str3 != null) {
                                        String strTrim = str3.trim();
                                        if (strTrim.isEmpty()) {
                                            continue;
                                        } else {
                                            sb2.append(strTrim);
                                            sb2.append('\n');
                                            if (sb2.length() >= 300000) {
                                                strSubstring = sb2.substring(0, 300000);
                                            }
                                        }
                                    }
                                }
                            } else {
                                strSubstring = sb2.length() > 300000 ? sb2.substring(0, 300000) : sb2.toString();
                            }
                        }
                        string = strSubstring;
                        break;
                    case w81.FLOAT_FIELD_NUMBER /* 2 */:
                        arrayListM4386e = tb3.m4388g(file);
                        StringBuilder sb22 = new StringBuilder();
                        size = arrayListM4386e.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                            }
                        }
                        string = strSubstring;
                        break;
                    case w81.INTEGER_FIELD_NUMBER /* 3 */:
                        arrayListM4386e = tb3.m4385d(file);
                        StringBuilder sb222 = new StringBuilder();
                        size = arrayListM4386e.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                            }
                        }
                        string = strSubstring;
                        break;
                    case w81.LONG_FIELD_NUMBER /* 4 */:
                    case w81.STRING_FIELD_NUMBER /* 5 */:
                        arrayListM4386e = tb3.m4387f(file);
                        StringBuilder sb2222 = new StringBuilder();
                        size = arrayListM4386e.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                            }
                        }
                        string = strSubstring;
                        break;
                    case w81.STRING_SET_FIELD_NUMBER /* 6 */:
                    case w81.DOUBLE_FIELD_NUMBER /* 7 */:
                        arrayListM4386e = tb3.m4391j(file);
                        StringBuilder sb22222 = new StringBuilder();
                        size = arrayListM4386e.size();
                        i = 0;
                        while (true) {
                            if (i < size) {
                            }
                        }
                        string = strSubstring;
                        break;
                    default:
                        string = "";
                        break;
                }
                if (string != null) {
                }
                break;
            case "pdf":
                bc3.f881a = context.getApplicationContext().getApplicationContext().getAssets();
                c31 c31VarM673a = c31.m673a(file);
                try {
                    string = new n31().m3161l(c31VarM673a);
                    c31VarM673a.close();
                    if (string == null || m3402j(string).length() < 12) {
                        if (string == null) {
                            string = "";
                        }
                        StringBuilder sb3 = new StringBuilder(string);
                        ParcelFileDescriptor parcelFileDescriptorOpen = ParcelFileDescriptor.open(file, 268435456);
                        try {
                            PdfRenderer pdfRenderer = new PdfRenderer(parcelFileDescriptorOpen);
                            try {
                                int iMin = Math.min(pdfRenderer.getPageCount(), 4);
                                for (int i3 = 0; i3 < iMin && sb3.length() < 300000; i3++) {
                                    PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(i3);
                                    try {
                                        int iMax = Math.max(1, pageOpenPage.getWidth());
                                        int iMax2 = Math.max(1, pageOpenPage.getHeight());
                                        float fMax = Math.max(1.0f, Math.min(2.0f, 1800.0f / Math.max(iMax, iMax2)));
                                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(Math.max(1, Math.round(iMax * fMax)), Math.max(1, Math.round(iMax2 * fMax)), Bitmap.Config.ARGB_8888);
                                        try {
                                            pageOpenPage.render(bitmapCreateBitmap2, null, null, 1);
                                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                                            go0 go0Var3 = new go0(bitmapCreateBitmap2);
                                            go0.m1843a(jElapsedRealtime2, 1, bitmapCreateBitmap2.getHeight(), bitmapCreateBitmap2.getWidth(), bitmapCreateBitmap2.getAllocationByteCount());
                                            hs1 hs1Var2 = (hs1) bj3.m507a(tm3Var.m4462c(go0Var3));
                                            if (hs1Var2 != null) {
                                                String str4 = hs1Var2.f3769a;
                                                if (!str4.trim().isEmpty()) {
                                                    if (sb3.length() > 0) {
                                                        sb3.append('\n');
                                                    }
                                                    sb3.append(str4);
                                                }
                                            }
                                            bitmapCreateBitmap2.recycle();
                                            pageOpenPage.close();
                                        } catch (Throwable th3) {
                                            bitmapCreateBitmap2.recycle();
                                            throw th3;
                                        }
                                    } catch (Throwable th4) {
                                        if (pageOpenPage == null) {
                                            throw th4;
                                        }
                                        try {
                                            pageOpenPage.close();
                                            throw th4;
                                        } catch (Throwable th5) {
                                            th4.addSuppressed(th5);
                                            throw th4;
                                        }
                                    }
                                }
                                pdfRenderer.close();
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                string = sb3.toString();
                            } finally {
                            }
                        } finally {
                        }
                    }
                    if (string != null) {
                    }
                } finally {
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Incorrect finally slice insn: 0x0110: MOVE (r10v8 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19v0 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:273), expected: 0x016e: INVOKE (r7v10 ?? I:android.database.Cursor) INTERFACE call: android.database.Cursor.close():void A[Catch: all -> 0x0172, MD:():void (c), TRY_ENTER] (LINE:367) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap m3398f(Context context, ArrayList arrayList) throws Throwable {
        tm3 tm3Var;
        tm3 tm3Var2;
        int i;
        Object obj;
        int i2;
        int i3;
        ContentValues contentValues;
        SQLiteDatabase writableDatabase = new nm1(context.getApplicationContext()).getWritableDatabase();
        Object obj2 = null;
        writableDatabase.delete("content_index", "extension NOT IN ('pdf','jpg','jpeg','png','webp','heic','heif')", null);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj3 = arrayList.get(i5);
            i5++;
            Map map = (Map) obj3;
            if (map != null) {
                arrayList2.add(map);
            }
        }
        Collections.sort(arrayList2, new j22(6));
        tm3 tm3VarM1450a = ej3.m1450a(os1.f7301c);
        try {
            int size2 = arrayList2.size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < size2) {
                int i10 = i6 + 1;
                Map map2 = (Map) arrayList2.get(i6);
                String strM3404l = m3404l(map2.get("path"));
                String strM3404l2 = m3404l(map2.get("extension"));
                Locale locale = Locale.ROOT;
                String lowerCase = strM3404l2.toLowerCase(locale);
                long jM3400h = m3400h(map2.get("modifiedMs"));
                long jM3400h2 = m3400h(map2.get("size"));
                if (!strM3404l.isEmpty() && lowerCase != null && f7171a.contains(lowerCase.toLowerCase(locale))) {
                    File file = new File(strM3404l);
                    if (file.isFile()) {
                        tm3Var = tm3VarM1450a;
                        try {
                            i = size2;
                            tm3Var = null;
                            i2 = i4;
                        } catch (Throwable th) {
                            th = th;
                            tm3Var.close();
                            throw th;
                        }
                        try {
                            Cursor cursorQuery = writableDatabase.query("content_index", new String[]{"modified_ms", "size_bytes"}, "path=?", new String[]{strM3404l}, null, null, null, "1");
                            try {
                                if (cursorQuery.moveToFirst() && cursorQuery.getLong(i2) == jM3400h) {
                                    i3 = 1;
                                    if (cursorQuery.getLong(1) != jM3400h2) {
                                    }
                                    cursorQuery.close();
                                    if (i3 == 0) {
                                    }
                                } else {
                                    i3 = i2;
                                    cursorQuery.close();
                                    if (i3 == 0) {
                                        i8++;
                                        i4 = i2;
                                        i6 = i10;
                                        size2 = i;
                                        tm3VarM1450a = tm3Var;
                                        obj2 = null;
                                    } else {
                                        tm3Var2 = tm3Var;
                                        try {
                                            String strM3397e = m3397e(context, file, lowerCase, tm3Var2);
                                            contentValues = new ContentValues();
                                            contentValues.put("path", strM3404l);
                                            contentValues.put("modified_ms", Long.valueOf(jM3400h));
                                            contentValues.put("size_bytes", Long.valueOf(jM3400h2));
                                            contentValues.put("extension", lowerCase);
                                            contentValues.put("content", m3402j(strM3397e));
                                            contentValues.put("suggestion", m3394b(strM3397e, file.getName()));
                                            obj = null;
                                        } catch (Throwable unused) {
                                            obj = null;
                                        }
                                        try {
                                            writableDatabase.insertWithOnConflict("content_index", null, contentValues, 5);
                                            i7++;
                                        } catch (Throwable unused2) {
                                            i9++;
                                            tm3VarM1450a = tm3Var2;
                                            i4 = i2;
                                            i6 = i10;
                                            obj2 = obj;
                                            size2 = i;
                                        }
                                        tm3VarM1450a = tm3Var2;
                                        i4 = i2;
                                        i6 = i10;
                                        obj2 = obj;
                                        size2 = i;
                                    }
                                }
                            } catch (Throwable th2) {
                                tm3Var = tm3Var;
                                cursorQuery.close();
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            tm3Var = tm3Var;
                            tm3Var.close();
                            throw th;
                        }
                    } else {
                        writableDatabase.delete("content_index", "path=?", new String[]{strM3404l});
                    }
                }
                tm3Var2 = tm3VarM1450a;
                i = size2;
                obj = obj2;
                i2 = i4;
                tm3VarM1450a = tm3Var2;
                i4 = i2;
                i6 = i10;
                obj2 = obj;
                size2 = i;
            }
            tm3VarM1450a.close();
            HashMap map3 = new HashMap();
            map3.put("indexed", Integer.valueOf(i7));
            map3.put("reused", Integer.valueOf(i8));
            map3.put("failed", Integer.valueOf(i9));
            map3.put("total", Integer.valueOf(i7 + i8));
            return map3;
        } catch (Throwable th4) {
            th = th4;
            tm3Var = tm3VarM1450a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: g */
    public static boolean m3399g(String str) {
        if (str.isEmpty() || str.matches(".*@.*") || str.matches("[0-9]{6,}")) {
            return true;
        }
        return str.matches("[A-Za-z0-9]{12,}") && str.matches(".*[0-9].*") && str.matches(".*[A-Za-z].*");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: h */
    public static long m3400h(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        try {
            return Long.parseLong(m3404l(obj));
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: i */
    public static void m3401i(MainActivity mainActivity, String str, String str2, long j, long j2) {
        if (str.isEmpty() || str2.isEmpty()) {
            return;
        }
        SQLiteDatabase writableDatabase = new nm1(mainActivity.getApplicationContext()).getWritableDatabase();
        Cursor cursorQuery = writableDatabase.query("content_index", new String[]{"extension", "content", "suggestion"}, "path=?", new String[]{str}, null, null, null, "1");
        try {
            if (cursorQuery.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("path", str2);
                contentValues.put("modified_ms", Long.valueOf(j));
                contentValues.put("size_bytes", Long.valueOf(j2));
                contentValues.put("extension", cursorQuery.getString(0));
                contentValues.put("content", cursorQuery.getString(1));
                contentValues.put("suggestion", cursorQuery.getString(2));
                writableDatabase.insertWithOnConflict("content_index", null, contentValues, 5);
                writableDatabase.delete("content_index", "path=?", new String[]{str});
            }
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: j */
    public static String m3402j(String str) {
        return str.toLowerCase(Locale.ROOT).replace((char) 0, ' ').replace((char) 1571, (char) 1575).replace((char) 1573, (char) 1575).replace((char) 1570, (char) 1575).replace((char) 1609, (char) 1610).replace((char) 1572, (char) 1608).replace((char) 1574, (char) 1610).replace((char) 1577, (char) 1607).replaceAll("[ً-ٰٟ]", "").replaceAll("\\s+", " ").trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: k */
    public static List m3403k(Context context, String str) {
        String strM3402j = m3402j(str);
        if (strM3402j.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String[] strArrSplit = strM3402j.split("\\s+");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            String strTrim = str2.trim();
            if (strTrim.length() >= 2) {
                arrayList.add(strTrim);
                if (arrayList.size() >= 6) {
                    break;
                }
            }
        }
        if (arrayList.isEmpty() && strM3402j.length() >= 1) {
            arrayList.add(strM3402j);
        }
        if (arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        StringBuilder sb = new StringBuilder("extension IN ('pdf','jpg','jpeg','png','webp','heic','heif')");
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append(" AND instr(content, ?) > 0");
            arrayList2.add((String) obj);
        }
        Cursor cursorQuery = new nm1(context.getApplicationContext()).getReadableDatabase().query("content_index", new String[]{"path"}, sb.toString(), (String[]) arrayList2.toArray(new String[0]), null, null, "modified_ms DESC", Integer.toString(5000));
        ArrayList arrayList3 = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                String string = cursorQuery.getString(0);
                if (string != null && new File(string).isFile()) {
                    arrayList3.add(string);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: l */
    public static String m3404l(Object obj) {
        return obj == null ? "" : obj.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: m */
    public static String m3405m(Context context, File file) {
        int iLastIndexOf;
        if (file.isFile()) {
            String name = file.getName();
            String lowerCase = (name == null || (iLastIndexOf = name.lastIndexOf(46)) < 0 || iLastIndexOf == name.length() - 1) ? "" : name.substring(iLastIndexOf + 1).toLowerCase(Locale.ROOT);
            if (lowerCase != null) {
                if (f7172b.contains(lowerCase.toLowerCase(Locale.ROOT))) {
                    Cursor cursorQuery = new nm1(context.getApplicationContext()).getReadableDatabase().query("content_index", new String[]{"modified_ms", "size_bytes", "suggestion"}, "path=?", new String[]{file.getAbsolutePath()}, null, null, null, "1");
                    try {
                        if (cursorQuery.moveToFirst()) {
                            long j = cursorQuery.getLong(0);
                            long j2 = cursorQuery.getLong(1);
                            String string = cursorQuery.getString(2);
                            if (j == file.lastModified() && j2 == file.length() && string != null && !string.trim().isEmpty()) {
                                String strTrim = string.trim();
                                cursorQuery.close();
                                return strTrim;
                            }
                        }
                        cursorQuery.close();
                        tm3 tm3VarM1450a = ej3.m1450a(os1.f7301c);
                        try {
                            String strM3397e = m3397e(context, file, lowerCase, tm3VarM1450a);
                            tm3VarM1450a.close();
                            String strM3394b = m3394b(strM3397e, file.getName());
                            SQLiteDatabase writableDatabase = new nm1(context.getApplicationContext()).getWritableDatabase();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("path", file.getAbsolutePath());
                            contentValues.put("modified_ms", Long.valueOf(file.lastModified()));
                            contentValues.put("size_bytes", Long.valueOf(file.length()));
                            contentValues.put("extension", lowerCase);
                            contentValues.put("content", m3402j(strM3397e));
                            contentValues.put("suggestion", strM3394b != null ? strM3394b : "");
                            writableDatabase.insertWithOnConflict("content_index", null, contentValues, 5);
                            return strM3394b;
                        } catch (Throwable th) {
                            tm3VarM1450a.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        cursorQuery.close();
                        throw th2;
                    }
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: n */
    public static String m3406n(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str != null && !str.isEmpty()) {
                if (str.matches("[A-Za-z].*")) {
                    str = str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1);
                }
                if (sb.length() > 0) {
                    sb.append(' ');
                }
                sb.append(str);
            }
        }
        return sb.toString().replaceAll("[\\/:*?\"<>|]", " ").replaceAll("\\s+", " ").trim();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: o */
    public static ArrayList m3407o(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.replaceAll("[\\p{Punct}&&[^'-]]+", " ").split("\\s+")) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty() && !m3399g(strTrim) && strTrim.length() <= 30) {
                    arrayList.add(strTrim);
                }
            }
        }
        return arrayList;
    }
}
