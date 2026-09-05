package p000;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class e61 {

    /* renamed from: a */
    public final Context f2178a;

    /* renamed from: b */
    public final fr1 f2179b = new fr1(new C0046b3(11, this));

    /* renamed from: c */
    public final Handler f2180c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public volatile boolean f2181d;

    /* renamed from: e */
    public volatile ServerSocket f2182e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public e61(Context context) {
        this.f2178a = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: b */
    public static void m1309b(InputStream inputStream, OutputStream outputStream, long j) throws IOException {
        byte[] bArr = new byte[65536];
        while (j > 0) {
            int i = inputStream.read(bArr, 0, (int) Math.min(65536L, j));
            if (i < 0) {
                throw new EOFException("Transfer ended early");
            }
            outputStream.write(bArr, 0, i);
            j -= i;
        }
        outputStream.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: c */
    public static LinkedHashMap m1310c(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            int iIndexOf = str.indexOf(58, 0);
            if (iIndexOf > 0) {
                String lowerCase = cp1.m889s(str.substring(0, iIndexOf)).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                linkedHashMap.put(lowerCase, cp1.m889s(str.substring(iIndexOf + 1)).toString());
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: d */
    public static String m1311d(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] bArr = {13, 10, 13, 10};
        while (true) {
            int i = 0;
            while (byteArrayOutputStream.size() < 32768) {
                int i2 = inputStream.read();
                if (i2 < 0) {
                    throw new EOFException("Connection closed before headers");
                }
                byteArrayOutputStream.write(i2);
                byte b = (byte) i2;
                if (b == bArr[i]) {
                    i++;
                    if (i == 4) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        string.getClass();
                        return string;
                    }
                } else if (b == bArr[0]) {
                    i = 1;
                }
            }
            km0.m2611d("Request headers were too large.");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: e */
    public static String m1312e(String str) {
        CharSequence charSequenceSubSequence;
        char[] cArr = {'/', '\\', ':', '*', '?', '\"', '<', '>', '|'};
        String string = cp1.m889s(str).toString();
        for (int i = 0; i < 9; i++) {
            char c = cArr[i];
            string.getClass();
            string = string.replace(c, '_');
            string.getClass();
        }
        String string2 = cp1.m889s(string).toString();
        char[] cArr2 = {'.'};
        string2.getClass();
        int length = string2.length() - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                char cCharAt = string2.charAt(length);
                int i3 = 0;
                while (true) {
                    if (i3 >= 1) {
                        i3 = -1;
                        break;
                    }
                    if (cCharAt == cArr2[i3]) {
                        break;
                    }
                    i3++;
                }
                if (!(i3 >= 0)) {
                    charSequenceSubSequence = string2.subSequence(0, length + 1);
                    break;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        String string3 = charSequenceSubSequence.toString();
        if (cp1.m880j(string3)) {
            string3 = "SmartLife_" + System.currentTimeMillis();
        }
        return string3.length() <= 180 ? string3 : cp1.m888r(180, string3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: h */
    public static void m1313h(OutputStream outputStream, int i, String str) throws IOException {
        String str2 = i != 200 ? i != 404 ? i != 400 ? i != 401 ? "Internal Server Error" : "Unauthorized" : "Bad Request" : "Not Found" : "OK";
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int length = bytes.length;
        StringBuilder sb = new StringBuilder("HTTP/1.1 ");
        sb.append(i);
        sb.append(" ");
        sb.append(str2);
        sb.append("\r\nContent-Type: text/plain; charset=utf-8\r\nContent-Length: ");
        String strM1773m = g71.m1773m(sb, length, "\r\nConnection: close\r\n\r\n");
        Charset charset2 = StandardCharsets.US_ASCII;
        charset2.getClass();
        byte[] bytes2 = strM1773m.getBytes(charset2);
        bytes2.getClass();
        outputStream.write(bytes2);
        outputStream.write(bytes);
        outputStream.flush();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: a */
    public final void m1314a() throws UnknownHostException {
        if (!this.f2181d) {
            return;
        }
        String string = ((SharedPreferences) this.f2179b.getValue()).getString("host", "");
        String string2 = string != null ? cp1.m889s(string).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        String string3 = ((SharedPreferences) this.f2179b.getValue()).getString("code", "");
        String string4 = string3 != null ? cp1.m889s(string3).toString() : null;
        String str = string4 != null ? string4 : "";
        if (cp1.m880j(string2) || cp1.m880j(str)) {
            return;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        String strReplace = str2.replace('|', ' ');
        strReplace.getClass();
        String string5 = cp1.m889s(strReplace).toString();
        if (cp1.m880j(string5)) {
            string5 = "Android phone";
        }
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = ("SMARTLIFE|" + str + "|8766|" + string5).getBytes(charset);
        bytes.getClass();
        try {
            InetAddress byName = InetAddress.getByName(string2);
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                datagramSocket.send(new DatagramPacket(bytes, bytes.length, byName, 8767));
                datagramSocket.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* renamed from: f */
    public final String m1315f(String str, String str2, InputStream inputStream, long j) throws Exception {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentResolver contentResolver = this.f2178a.getContentResolver();
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", str2);
            contentValues.put("relative_path", Environment.DIRECTORY_DOWNLOADS + "/Smart Life");
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
            if (uriInsert == null) {
                C0000a.m5g("Could not create the received file.");
                return null;
            }
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert, "w");
                if (outputStreamOpenOutputStream == null) {
                    throw new IllegalStateException("Could not open the received file.");
                }
                try {
                    m1309b(inputStream, outputStreamOpenOutputStream, j);
                    outputStreamOpenOutputStream.close();
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    contentResolver.update(uriInsert, contentValues, null, null);
                    return str;
                } finally {
                }
            } catch (Exception e) {
                contentResolver.delete(uriInsert, null, null);
                throw e;
            }
        } else {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "Smart Life");
            if (!file.exists() && !file.mkdirs()) {
                C0000a.m5g("Could not create Downloads/Smart Life.");
                return null;
            }
            File file2 = new File(file, str);
            if (file2.exists()) {
                int iM881k = cp1.m881k(str);
                String strSubstring = iM881k > 0 ? str.substring(0, iM881k) : str;
                String strSubstring2 = iM881k > 0 ? str.substring(iM881k) : "";
                int i = 2;
                while (true) {
                    if (i >= 10000) {
                        file2 = new File(file, strSubstring + "_" + System.currentTimeMillis() + strSubstring2);
                        break;
                    }
                    File file3 = new File(file, strSubstring + " " + i + strSubstring2);
                    if (!file3.exists()) {
                        file2 = file3;
                        break;
                    }
                    i++;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                m1309b(inputStream, fileOutputStream, j);
                fileOutputStream.close();
                String name = file2.getName();
                name.getClass();
                return name;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: g */
    public final void m1316g() {
        new Thread(new d61(this, 2), "SmartLifePhoneHeartbeat").start();
    }
}
