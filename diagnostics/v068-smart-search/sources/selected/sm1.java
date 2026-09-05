package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Parcel;
import android.provider.MediaStore;
import android.util.Size;
import com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class sm1 implements qw1, jn0, sd1, y01, w01, InterfaceC0722t2 {

    /* renamed from: l */
    public Object f9089l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sm1(hy0 hy0Var) {
        this.f9089l = hy0Var;
        C0543o8 c0543o8 = tr1.f9584u;
        Class cls = (Class) hy0Var.mo2858c(c0543o8, null);
        if (cls != null && !cls.equals(qo1.class)) {
            km0.m2613f("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        hy0Var.m2031A(rw1.f8777H, tw1.f9618p);
        hy0Var.m2031A(c0543o8, qo1.class);
        C0543o8 c0543o82 = tr1.f9583t;
        if (hy0Var.mo2858c(c0543o82, null) == null) {
            hy0Var.m2031A(c0543o82, qo1.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: b */
    public static double m4272b(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 64, 64, true);
        bitmapCreateScaledBitmap.getClass();
        int[] iArr = new int[4096];
        int i = 0;
        for (int i2 = 0; i2 < 64; i2++) {
            for (int i3 = 0; i3 < 64; i3++) {
                try {
                    int pixel = bitmapCreateScaledBitmap.getPixel(i3, i2);
                    iArr[(i2 * 64) + i3] = ((Color.blue(pixel) * 114) + ((Color.green(pixel) * 587) + (Color.red(pixel) * 299))) / 1000;
                } finally {
                    if (bitmapCreateScaledBitmap != bitmap) {
                        bitmapCreateScaledBitmap.recycle();
                    }
                }
            }
        }
        double dAbs = 0.0d;
        for (int i4 = 1; i4 < 63; i4++) {
            for (int i5 = 1; i5 < 63; i5++) {
                int i6 = (i4 * 64) + i5;
                dAbs += Math.abs(((((iArr[i6] * 4) - iArr[i6 - 1]) - iArr[i6 + 1]) - iArr[((i4 - 1) * 64) + i5]) - iArr[((i4 + 1) * 64) + i5]);
                i++;
            }
        }
        if (i == 0) {
            return 0.0d;
        }
        return dAbs / i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: c */
    public static long m4273c(ArrayList arrayList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((Map) obj).get("group");
            Number number = obj2 instanceof Number ? (Number) obj2 : null;
            Integer numValueOf = Integer.valueOf(number != null ? number.intValue() : -1);
            Object arrayList2 = linkedHashMap.get(numValueOf);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        long size2 = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            if (iIntValue >= 0 && list.size() >= 2) {
                Object obj3 = ((Map) AbstractC0638qt.m3825n(list)).get("size");
                Number number2 = obj3 instanceof Number ? (Number) obj3 : null;
                size2 += (list.size() - 1) * (number2 != null ? number2.longValue() : 0L);
            }
        }
        return size2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: l */
    public static LinkedHashMap m4274l(qm1 qm1Var, Map map) {
        p51[] p51VarArr = {new p51("uri", qm1Var.f8207a), new p51("path", qm1Var.f8208b), new p51("name", qm1Var.f8209c), new p51("folder", qm1Var.f8210d), new p51("size", Long.valueOf(qm1Var.f8211e)), new p51("modifiedMs", Long.valueOf(qm1Var.f8212f)), new p51("width", Integer.valueOf(qm1Var.f8213g)), new p51("height", Integer.valueOf(qm1Var.f8214h)), new p51("mediaKind", qm1Var.f8215i)};
        LinkedHashMap linkedHashMap = new LinkedHashMap(sv0.m4311b(9));
        sv0.m4314e(linkedHashMap, p51VarArr);
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.y01
    /* renamed from: a */
    public void mo3624a(Object obj) {
        ((CountDownLatch) this.f9089l).countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.sd1
    public void accept(Object obj, Object obj2) {
        o32 o32Var = new o32((vr1) obj2);
        c32 c32Var = (c32) ((s32) obj).m862q();
        C0273h5 c0273h5 = (C0273h5) this.f9089l;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(c32Var.f2674c);
        int i = s22.f8847a;
        parcelObtain.writeStrongBinder(o32Var);
        parcelObtain.writeInt(1);
        c0273h5.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(null);
        c32Var.m1540a(parcelObtain, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.w01
    /* renamed from: d */
    public void mo1329d(Exception exc) {
        ((CountDownLatch) this.f9089l).countDown();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.a90
    /* renamed from: e */
    public hy0 mo147e() {
        return (hy0) this.f9089l;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: f */
    public ArrayList m4275f(ArrayList arrayList) throws NoSuchAlgorithmException, IOException {
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (((qm1) obj).f8211e > 0) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList3.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            Long lValueOf = Long.valueOf(((qm1) obj2).f8211e);
            Object arrayList4 = linkedHashMap.get(lValueOf);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList4);
            }
            ((List) arrayList4).add(obj2);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        int size3 = linkedHashMap2.size();
        List listM4089b = d60.f1716l;
        if (size3 != 0) {
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it.next();
                if (it.hasNext()) {
                    ArrayList arrayList5 = new ArrayList(linkedHashMap2.size());
                    arrayList5.add(new p51(entry2.getKey(), entry2.getValue()));
                    do {
                        Map.Entry entry3 = (Map.Entry) it.next();
                        arrayList5.add(new p51(entry3.getKey(), entry3.getValue()));
                    } while (it.hasNext());
                    listM4089b = arrayList5;
                } else {
                    listM4089b = AbstractC0675rt.m4089b(new p51(entry2.getKey(), entry2.getValue()));
                }
            }
        }
        Iterator it2 = AbstractC0638qt.m3833v(listM4089b, new j22(9)).iterator();
        int i4 = 1;
        while (it2.hasNext()) {
            List<qm1> list = (List) ((p51) it2.next()).f7457m;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (qm1 qm1Var : list) {
                String strM2312g = null;
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    try {
                        InputStream inputStreamOpenInputStream = ((ContentResolver) this.f9089l).openInputStream(Uri.parse(qm1Var.f8207a));
                        if (inputStreamOpenInputStream == null) {
                            tr2.m4488a(inputStreamOpenInputStream, null);
                        } else {
                            try {
                                byte[] bArr = new byte[1048576];
                                while (true) {
                                    int i5 = inputStreamOpenInputStream.read(bArr);
                                    if (i5 <= 0) {
                                        break;
                                    }
                                    messageDigest.update(bArr, i, i5);
                                }
                                inputStreamOpenInputStream.close();
                                byte[] bArrDigest = messageDigest.digest();
                                bArrDigest.getClass();
                                strM2312g = AbstractC0356j6.m2312g(bArrDigest, "", new C0308i3(12), 30);
                            } finally {
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                if (strM2312g != null) {
                    Object arrayList6 = linkedHashMap3.get(strM2312g);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap3.put(strM2312g, arrayList6);
                    }
                    ((List) arrayList6).add(qm1Var);
                }
            }
            Collection collectionValues = linkedHashMap3.values();
            collectionValues.getClass();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj3 : collectionValues) {
                if (((List) obj3).size() > 1) {
                    arrayList7.add(obj3);
                }
            }
            int size4 = arrayList7.size();
            int i6 = i;
            while (i6 < size4) {
                Object obj4 = arrayList7.get(i6);
                i6++;
                obj4.getClass();
                List listM3833v = AbstractC0638qt.m3833v((List) obj4, new j22(10));
                int i7 = i4 + 1;
                Iterator it3 = listM3833v.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(m4274l((qm1) it3.next(), sv0.m4312c(new p51("group", Integer.valueOf(i4)), new p51("groupCount", Integer.valueOf(listM3833v.size())))));
                    i = 0;
                }
                i4 = i7;
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0722t2
    /* renamed from: g */
    public void mo2341g(Object obj) {
        C0685s2 c0685s2 = (C0685s2) obj;
        GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity = (GmsDocumentScanningDelegateActivity) this.f9089l;
        C0074bv c0074bv = new C0074bv(gmsDocumentScanningDelegateActivity.getApplicationContext());
        int i = c0685s2.f8835l;
        Intent intent = c0685s2.f8836m;
        vr1 vr1Var = new vr1();
        j53.f4663l.execute(new mv1(c0074bv, i, intent, vr1Var));
        zm1 zm1Var = new zm1(6, gmsDocumentScanningDelegateActivity);
        d14 d14Var = vr1Var.f10368a;
        d14Var.getClass();
        d14Var.m984b(wr1.f10747a, zm1Var);
        d14Var.m983a(new t91(11, gmsDocumentScanningDelegateActivity));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: h */
    public Bitmap m4276h(qm1 qm1Var) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Bitmap bitmapDecodeStream;
        Bitmap bitmapLoadThumbnail;
        Uri uri = Uri.parse(qm1Var.f8207a);
        int i = Build.VERSION.SDK_INT;
        ContentResolver contentResolver = (ContentResolver) this.f9089l;
        if (i >= 29) {
            bitmapLoadThumbnail = contentResolver.loadThumbnail(uri, new Size(96, 96), null);
        } else {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                bitmapDecodeStream = null;
            } else {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream);
                } finally {
                }
            }
            tr2.m4488a(inputStreamOpenInputStream, null);
            bitmapLoadThumbnail = bitmapDecodeStream;
        }
        if (bitmapLoadThumbnail == null) {
            return null;
        }
        if (bitmapLoadThumbnail.getWidth() <= 96 && bitmapLoadThumbnail.getHeight() <= 96) {
            return bitmapLoadThumbnail;
        }
        double dMin = Math.min(96.0d / bitmapLoadThumbnail.getWidth(), 96.0d / bitmapLoadThumbnail.getHeight());
        int width = (int) (bitmapLoadThumbnail.getWidth() * dMin);
        if (width < 1) {
            width = 1;
        }
        int height = (int) (bitmapLoadThumbnail.getHeight() * dMin);
        if (height < 1) {
            height = 1;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapLoadThumbnail, width, height, true);
        bitmapCreateScaledBitmap.getClass();
        if (bitmapCreateScaledBitmap != bitmapLoadThumbnail) {
            bitmapLoadThumbnail.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ArrayList m4277i(boolean z) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        String string;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String string2;
        String string3;
        int i6;
        Uri contentUri = z ? Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external") : MediaStore.Video.Media.EXTERNAL_CONTENT_URI : Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        String str = Build.VERSION.SDK_INT >= 29 ? "relative_path" : "_data";
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = ((ContentResolver) this.f9089l).query(contentUri, new String[]{"_id", "_display_name", "_size", "date_modified", "width", "height", "datetaken", "bucket_display_name", str}, null, null, "datetaken".concat(" DESC, date_modified DESC"));
        if (cursorQuery == null) {
            return arrayList;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            int columnIndex2 = cursorQuery.getColumnIndex("_size");
            int columnIndex3 = cursorQuery.getColumnIndex("date_modified");
            int columnIndex4 = cursorQuery.getColumnIndex("width");
            int columnIndex5 = cursorQuery.getColumnIndex("height");
            int columnIndex6 = cursorQuery.getColumnIndex("datetaken");
            int columnIndex7 = cursorQuery.getColumnIndex("bucket_display_name");
            int columnIndex8 = cursorQuery.getColumnIndex(str);
            while (cursorQuery.moveToNext()) {
                long j2 = cursorQuery.getLong(columnIndexOrThrow);
                if (columnIndex < 0 || (string = cursorQuery.getString(columnIndex)) == null) {
                    string = "Media";
                }
                long j3 = 0;
                if (columnIndex2 >= 0) {
                    j = cursorQuery.getLong(columnIndex2);
                    if (j < 0) {
                        j = 0;
                    }
                }
                long j4 = columnIndex3 >= 0 ? cursorQuery.getLong(columnIndex3) : 0L;
                long j5 = columnIndex6 >= 0 ? cursorQuery.getLong(columnIndex6) : 0L;
                if (j5 > 0) {
                    j3 = j5;
                } else if (j4 > 0) {
                    j3 = 1000 * j4;
                }
                int i7 = 0;
                if (columnIndex4 < 0 || (i = cursorQuery.getInt(columnIndex4)) < 0) {
                    i = 0;
                }
                if (columnIndex5 >= 0 && (i6 = cursorQuery.getInt(columnIndex5)) >= 0) {
                    i7 = i6;
                }
                int i8 = i7;
                String str2 = "Other";
                if (columnIndex7 >= 0 && (string3 = cursorQuery.getString(columnIndex7)) != null) {
                    if (cp1.m880j(string3)) {
                        string3 = null;
                    }
                    if (string3 != null) {
                        str2 = string3;
                    }
                }
                String absolutePath = "";
                String str3 = (columnIndex8 < 0 || (string2 = cursorQuery.getString(columnIndex8)) == null) ? "" : string2;
                if (cp1.m880j(str3)) {
                    i2 = columnIndex5;
                    i3 = columnIndexOrThrow;
                    i4 = columnIndex;
                    i5 = columnIndex2;
                } else {
                    i2 = columnIndex5;
                    i3 = columnIndexOrThrow;
                    if (Build.VERSION.SDK_INT >= 29) {
                        File externalStorageDirectory = Environment.getExternalStorageDirectory();
                        i4 = columnIndex;
                        StringBuilder sb = new StringBuilder();
                        i5 = columnIndex2;
                        sb.append(str3);
                        sb.append(string);
                        absolutePath = new File(externalStorageDirectory, sb.toString()).getAbsolutePath();
                    } else {
                        i4 = columnIndex;
                        i5 = columnIndex2;
                        absolutePath = str3;
                    }
                }
                String string4 = ContentUris.withAppendedId(contentUri, j2).toString();
                string4.getClass();
                absolutePath.getClass();
                arrayList.add(new qm1(string4, absolutePath, string, str2, j, j3, i, i8, z ? "video" : "photo"));
                columnIndex5 = i2;
                columnIndexOrThrow = i3;
                columnIndex = i4;
                columnIndex2 = i5;
            }
            cursorQuery.close();
            return arrayList;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: j */
    public LinkedHashMap m4278j() throws IllegalAccessException, NoSuchAlgorithmException, IOException, IllegalArgumentException, InvocationTargetException {
        e60 e60Var;
        ArrayList arrayListM4277i = m4277i(false);
        boolean z = true;
        ArrayList arrayListM4277i2 = m4277i(true);
        ArrayList arrayListM4275f = m4275f(arrayListM4277i);
        ArrayList arrayListM4275f2 = m4275f(arrayListM4277i2);
        ArrayList arrayList = new ArrayList();
        int size = arrayListM4277i.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4277i.get(i);
            i++;
            if (((qm1) obj).f8211e >= 5242880) {
                arrayList.add(obj);
            }
        }
        List listM3833v = AbstractC0638qt.m3833v(arrayList, new j22(12));
        ArrayList arrayList2 = new ArrayList(AbstractC0712st.m4299g(listM3833v, 10));
        Iterator it = listM3833v.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            e60Var = e60.f2177l;
            if (!zHasNext) {
                break;
            }
            arrayList2.add(m4274l((qm1) it.next(), e60Var));
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayListM4277i2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayListM4277i2.get(i2);
            i2++;
            if (((qm1) obj2).f8211e >= 104857600) {
                arrayList3.add(obj2);
            }
        }
        List listM3833v2 = AbstractC0638qt.m3833v(arrayList3, new j22(13));
        ArrayList arrayList4 = new ArrayList(AbstractC0712st.m4299g(listM3833v2, 10));
        Iterator it2 = listM3833v2.iterator();
        while (it2.hasNext()) {
            arrayList4.add(m4274l((qm1) it2.next(), e60Var));
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - 7776000000L;
        ArrayList arrayList5 = new ArrayList();
        int size3 = arrayListM4277i.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayListM4277i.get(i3);
            i3++;
            boolean z2 = z;
            qm1 qm1Var = (qm1) obj3;
            ArrayList arrayList6 = arrayListM4277i;
            ArrayList arrayList7 = arrayListM4277i2;
            String lowerCase = (qm1Var.f8208b + "/" + qm1Var.f8210d + "/" + qm1Var.f8209c).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (cp1.m876f(lowerCase, "screenshot", false)) {
                long j = qm1Var.f8212f;
                if (j >= 1 && j < jCurrentTimeMillis) {
                    arrayList5.add(obj3);
                }
            }
            z = z2;
            arrayListM4277i = arrayList6;
            arrayListM4277i2 = arrayList7;
        }
        ArrayList arrayList8 = arrayListM4277i;
        boolean z3 = z;
        ArrayList arrayList9 = arrayListM4277i2;
        List listM3833v3 = AbstractC0638qt.m3833v(arrayList5, new j22(11));
        ArrayList arrayList10 = new ArrayList(AbstractC0712st.m4299g(listM3833v3, 10));
        Iterator it3 = listM3833v3.iterator();
        while (it3.hasNext()) {
            arrayList10.add(m4274l((qm1) it3.next(), e60Var));
        }
        long jM4273c = m4273c(arrayListM4275f2) + m4273c(arrayListM4275f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List[] listArr = new List[5];
        listArr[0] = arrayListM4275f;
        listArr[z3 ? 1 : 0] = arrayListM4275f2;
        listArr[2] = arrayList2;
        listArr[3] = arrayList4;
        listArr[4] = arrayList10;
        Iterator it4 = AbstractC0675rt.m4090c(listArr).iterator();
        while (it4.hasNext()) {
            Iterator it5 = ((List) it4.next()).iterator();
            while (it5.hasNext()) {
                Object obj4 = ((Map) it5.next()).get("uri");
                String str = obj4 instanceof String ? (String) obj4 : null;
                if (str != null && !cp1.m880j(str)) {
                    linkedHashSet.add(str);
                }
            }
        }
        p51[] p51VarArr = {new p51("duplicatePhotos", arrayListM4275f), new p51("oldScreenshots", arrayList10), new p51("largePhotos", arrayList2), new p51("duplicateVideos", arrayListM4275f2), new p51("largeVideos", arrayList4), new p51("duplicateSavingsBytes", Long.valueOf(jM4273c)), new p51("reviewCount", Integer.valueOf(linkedHashSet.size())), new p51("photoCount", Integer.valueOf(arrayList8.size())), new p51("videoCount", Integer.valueOf(arrayList9.size()))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(sv0.m4311b(9));
        sv0.m4314e(linkedHashMap, p51VarArr);
        return linkedHashMap;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[IF]}, finally: {[IF, INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: k */
    public LinkedHashMap m4279k() {
        Object obj;
        int[] iArr;
        int i;
        int i2;
        int i3;
        int i4;
        Bitmap bitmapM4276h;
        int i5 = 0;
        List<qm1> listM3833v = AbstractC0638qt.m3833v(m4277i(false), new j22(15));
        ArrayList arrayList = new ArrayList(listM3833v.size());
        for (qm1 qm1Var : listM3833v) {
            try {
                bitmapM4276h = m4276h(qm1Var);
            } catch (Exception unused) {
                bitmapM4276h = null;
            }
            if (bitmapM4276h != null) {
                try {
                    int i6 = 8;
                    Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapM4276h, 8, 8, true);
                    bitmapCreateScaledBitmap.getClass();
                    int[] iArr2 = new int[64];
                    int i7 = i5;
                    int i8 = i7;
                    long j = 0;
                    while (i7 < i6) {
                        int i9 = i5;
                        while (i9 < i6) {
                            try {
                                int pixel = bitmapCreateScaledBitmap.getPixel(i9, i7);
                                int iBlue = ((Color.blue(pixel) * 114) + ((Color.green(pixel) * 587) + (Color.red(pixel) * 299))) / 1000;
                                int i10 = i8 + 1;
                                iArr2[i8] = iBlue;
                                j += iBlue;
                                i9++;
                                i8 = i10;
                                iArr2 = iArr2;
                                i6 = 8;
                            } finally {
                            }
                        }
                        i7++;
                        i5 = 0;
                        i6 = 8;
                    }
                    int[] iArr3 = iArr2;
                    if (bitmapCreateScaledBitmap != bitmapM4276h) {
                        bitmapCreateScaledBitmap.recycle();
                    }
                    double d = j / 64.0d;
                    long j2 = 0;
                    for (int i11 = 0; i11 < 64; i11++) {
                        if (iArr3[i11] >= d) {
                            j2 |= 1 << i11;
                        }
                    }
                    arrayList.add(new rm1(qm1Var, j2, m4272b(bitmapM4276h)));
                    bitmapM4276h.recycle();
                    i5 = 0;
                } catch (Throwable th) {
                    bitmapM4276h.recycle();
                    throw th;
                }
            }
        }
        if (arrayList.size() < 2) {
            obj = d60.f1716l;
        } else {
            int size = arrayList.size();
            int[] iArr4 = new int[size];
            for (int i12 = 0; i12 < size; i12++) {
                iArr4[i12] = i12;
            }
            int size2 = arrayList.size();
            int i13 = 0;
            while (i13 < size2) {
                rm1 rm1Var = (rm1) arrayList.get(i13);
                int iMin = Math.min(arrayList.size(), i13 + 19);
                int i14 = i13 + 1;
                int i15 = i14;
                while (i15 < iMin) {
                    rm1 rm1Var2 = (rm1) arrayList.get(i15);
                    long j3 = rm1Var.f8658a.f8212f;
                    if (j3 > 0) {
                        long j4 = rm1Var2.f8658a.f8212f;
                        if (j4 > 0 && Math.abs(j3 - j4) > 600000) {
                            break;
                        }
                    }
                    qm1 qm1Var2 = rm1Var.f8658a;
                    qm1 qm1Var3 = rm1Var2.f8658a;
                    int i16 = qm1Var2.f8213g;
                    if (i16 <= 0 || (i2 = qm1Var2.f8214h) <= 0 || (i3 = qm1Var3.f8213g) <= 0 || (i4 = qm1Var3.f8214h) <= 0) {
                        iArr = iArr4;
                        i = i14;
                    } else {
                        iArr = iArr4;
                        i = i14;
                        if (Math.abs((i16 / i2) - (i3 / i4)) <= 0.12d) {
                        }
                        i15++;
                        iArr4 = iArr;
                        i14 = i;
                    }
                    if (Long.bitCount(rm1Var.f8659b ^ rm1Var2.f8659b) <= 6) {
                        int i17 = i13;
                        while (true) {
                            int i18 = iArr[i17];
                            if (i18 == i17) {
                                break;
                            }
                            int i19 = iArr[i18];
                            iArr[i17] = i19;
                            i17 = i19;
                        }
                        int i20 = i15;
                        while (true) {
                            int i21 = iArr[i20];
                            if (i21 == i20) {
                                break;
                            }
                            int i22 = iArr[i21];
                            iArr[i20] = i22;
                            i20 = i22;
                        }
                        if (i17 != i20) {
                            iArr[i20] = i17;
                        }
                    }
                    i15++;
                    iArr4 = iArr;
                    i14 = i;
                }
                iArr4 = iArr4;
                i13 = i14;
            }
            int[] iArr5 = iArr4;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size3 = arrayList.size();
            for (int i23 = 0; i23 < size3; i23++) {
                int i24 = i23;
                while (true) {
                    int i25 = iArr5[i24];
                    if (i25 == i24) {
                        break;
                    }
                    int i26 = iArr5[i25];
                    iArr5[i24] = i26;
                    i24 = i26;
                }
                Integer numValueOf = Integer.valueOf(i24);
                Object arrayList2 = linkedHashMap.get(numValueOf);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(numValueOf, arrayList2);
                }
                ((List) arrayList2).add(Integer.valueOf(i23));
            }
            ArrayList arrayList3 = new ArrayList();
            Collection collectionValues = linkedHashMap.values();
            collectionValues.getClass();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (((List) obj2).size() > 1) {
                    arrayList4.add(obj2);
                }
            }
            int size4 = arrayList4.size();
            int i27 = 1;
            int i28 = 0;
            while (i28 < size4) {
                Object obj3 = arrayList4.get(i28);
                i28++;
                obj3.getClass();
                List listM3833v2 = AbstractC0638qt.m3833v((List) obj3, new yi0(2, arrayList));
                int i29 = i27 + 1;
                Iterator it = listM3833v2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(m4274l(((rm1) arrayList.get(((Number) it.next()).intValue())).f8658a, sv0.m4312c(new p51("group", Integer.valueOf(i27)), new p51("groupCount", Integer.valueOf(listM3833v2.size())))));
                }
                i27 = i29;
            }
            obj = arrayList3;
        }
        ArrayList arrayList5 = new ArrayList();
        int size5 = arrayList.size();
        int i30 = 0;
        while (i30 < size5) {
            Object obj4 = arrayList.get(i30);
            i30++;
            rm1 rm1Var3 = (rm1) obj4;
            qm1 qm1Var4 = rm1Var3.f8658a;
            String str = qm1Var4.f8208b;
            String str2 = qm1Var4.f8210d;
            String lowerCase = (str + "/" + str2 + "/" + qm1Var4.f8209c).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (cp1.m876f(lowerCase, "/dcim/camera/", false) || str2.equalsIgnoreCase("camera")) {
                if (!cp1.m876f(lowerCase, "screenshot", false) && qm1Var4.f8213g >= 640 && qm1Var4.f8214h >= 480 && rm1Var3.f8660c < 8.5d) {
                    arrayList5.add(obj4);
                }
            }
        }
        List<rm1> listM3834w = AbstractC0638qt.m3834w(300, AbstractC0638qt.m3833v(arrayList5, new j22(14)));
        ArrayList arrayList6 = new ArrayList(AbstractC0712st.m4299g(listM3834w, 10));
        for (rm1 rm1Var4 : listM3834w) {
            qm1 qm1Var5 = rm1Var4.f8658a;
            Map mapSingletonMap = Collections.singletonMap("blurScore", Double.valueOf(rm1Var4.f8660c));
            mapSingletonMap.getClass();
            arrayList6.add(m4274l(qm1Var5, mapSingletonMap));
        }
        p51[] p51VarArr = {new p51("similarPhotos", obj), new p51("blurryPhotos", arrayList6), new p51("analyzedPhotos", Integer.valueOf(arrayList.size()))};
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(sv0.m4311b(3));
        sv0.m4314e(linkedHashMap2, p51VarArr);
        return linkedHashMap2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qw1
    /* renamed from: n */
    public rw1 mo2193n() {
        return new ro1(m11.m2921w((hy0) this.f9089l));
    }

    public sm1(Context context) {
        this.f9089l = context.getContentResolver();
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ae0.onAttachedToWindow():void, com.google.mlkit.vision.documentscanner.internal.GmsDocumentScanningDelegateActivity.onCreate(android.os.Bundle):void, io.flutter.plugin.editing.b.<init>(android.view.View, cg1, tc0, d81, c81):void, m22.q():void] */
    public /* synthetic */ sm1(Object obj) {
        this.f9089l = obj;
    }
}
