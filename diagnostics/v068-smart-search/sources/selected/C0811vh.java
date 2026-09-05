package p000;

import android.hardware.camera2.CaptureRequest;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* renamed from: vh */
/* loaded from: classes.dex */
public final class C0811vh {

    /* renamed from: a */
    public final InterfaceC0406kj f10233a;

    /* renamed from: b */
    public final dt1 f10234b;

    /* renamed from: c */
    public final int f10235c;

    /* renamed from: d */
    public final Map f10236d;

    /* renamed from: e */
    public final Map f10237e;

    /* renamed from: f */
    public final no1 f10238f;

    /* renamed from: g */
    public final vo1 f10239g;

    /* renamed from: h */
    public final boolean f10240h;

    /* renamed from: i */
    public final int f10241i;

    /* renamed from: j */
    public final Object f10242j;

    /* renamed from: k */
    public boolean f10243k;

    /* renamed from: l */
    public C0737th f10244l;

    /* renamed from: m */
    public final C0428l4 f10245m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0811vh(InterfaceC0406kj interfaceC0406kj, dt1 dt1Var, int i, Map map, Map map2, no1 no1Var, vo1 vo1Var, boolean z) {
        interfaceC0406kj.getClass();
        dt1Var.getClass();
        map.getClass();
        map2.getClass();
        vo1Var.getClass();
        this.f10233a = interfaceC0406kj;
        this.f10234b = dt1Var;
        this.f10235c = i;
        this.f10236d = map;
        this.f10237e = map2;
        this.f10238f = no1Var;
        this.f10239g = vo1Var;
        this.f10240h = z;
        C0763u6 c0763u6 = AbstractC0848wh.f10644a;
        c0763u6.getClass();
        this.f10241i = C0763u6.f9727b.incrementAndGet(c0763u6);
        this.f10242j = new Object();
        List list = no1Var.f6802q;
        C0428l4 c0428l4M4825a = null;
        if (!list.isEmpty()) {
            ko1 ko1Var = (ko1) AbstractC0638qt.m3825n(list);
            Surface inputSurface = interfaceC0406kj.getInputSurface();
            if (inputSurface == null) {
                C0000a.m5g("inputSurface is required to create instance of imageWriter.");
                throw null;
            }
            try {
                c0428l4M4825a = vo2.m4825a(inputSurface, ko1Var.f5535a, new jo1(ko1Var.f5536b), dt1Var.m1186a());
            } catch (RuntimeException e) {
                Log.e("CXCP", "Failed to create ImageWriter for session " + this.f10233a + "! Reprocessing will not be supported!", e);
            }
            if (c0428l4M4825a != null) {
                Log.d("CXCP", "Created ImageWriter " + c0428l4M4825a + " for session " + this.f10233a);
            }
        }
        this.f10245m = c0428l4M4825a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: a */
    public static final void m4807a(C0811vh c0811vh, C0737th c0737th) {
        Log.d("CXCP", "Waiting for the last repeating request sequence: " + c0737th);
        if (((wu1) c0811vh.f10234b.m1187b(2000L, new C0774uh(c0737th, null, 0))) == null) {
            Log.e("CXCP", c0811vh + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + c0737th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0301, code lost:
    
        if (r0 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0304, code lost:
    
        r13 = r34.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x030c, code lost:
    
        if (r13.hasNext() == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x030e, code lost:
    
        r10 = (p000.ce1) r13.next();
        android.util.Log.d("CXCP", "Building CaptureRequest for " + r10);
        r0 = r10.f1323e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x032a, code lost:
    
        if (r0 == null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x032c, code lost:
    
        r0 = r0.f5824a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x032f, code lost:
    
        r0 = r32.f10235c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0331, code lost:
    
        r4 = r32.f10233a;
        r6 = r10.f1324f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0337, code lost:
    
        if (r6 == null) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0339, code lost:
    
        r9 = (android.hardware.camera2.TotalCaptureResult) r6.f3733b.mo253s(p000.nd1.m3196a(android.hardware.camera2.TotalCaptureResult.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0347, code lost:
    
        if (r9 == null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0349, code lost:
    
        r4 = r4.mo2585a0().mo1150y(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0352, code lost:
    
        p000.C0000a.m23y("Failed to unwrap FrameInfo ", r6.f3733b, " as TotalCaptureResult");
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x035b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x035c, code lost:
    
        r4 = r4.mo2585a0().mo1144V(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0364, code lost:
    
        if (r4 != null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0366, code lost:
    
        if (r6 == null) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0368, code lost:
    
        android.util.Log.i("CXCP", "Failed to create a ReprocessingCaptureRequest.Builder from " + r6.f3733b + '!');
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0381, code lost:
    
        android.util.Log.i("CXCP", "Failed to create a CaptureRequest.Builder from " + ((java.lang.Object) p000.le1.m2772b(r0)) + '!');
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x039b, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03a0, code lost:
    
        if (r4 != null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03a4, code lost:
    
        r0 = p000.AbstractC0815vl.f10311b;
        r3 = r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03aa, code lost:
    
        if (r3 != null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03ac, code lost:
    
        r3 = r5.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x03b0, code lost:
    
        r4.setTag(r3);
        r0 = r10.f1319a.size();
        r3 = 0;
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03bb, code lost:
    
        if (r3 >= r0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x03bd, code lost:
    
        r11 = (android.view.Surface) r8.get(r10.f1319a.get(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03c9, code lost:
    
        if (r11 == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x03cb, code lost:
    
        r4.addTarget(r11);
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03d0, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x03d3, code lost:
    
        if (r9 == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x03d5, code lost:
    
        r0 = r10.f1324f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03d7, code lost:
    
        if (r0 == null) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x03db, code lost:
    
        if (r32.f10245m != null) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x03dd, code lost:
    
        android.util.Log.e("CXCP", "Failed to queue request to ImageWriter - No ImageWriter available!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03e6, code lost:
    
        r3 = r0.f3732a;
        r9 = r32.f10242j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x03ea, code lost:
    
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03ed, code lost:
    
        if (r32.f10243k == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x03ef, code lost:
    
        android.util.Log.w("CXCP", r32 + " disconnected. " + r3 + " can't be queued to " + r32.f10245m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0412, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0418, code lost:
    
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0419, code lost:
    
        android.util.Log.d("CXCP", "Queuing image " + r3 + " for reprocessing to ImageWriter " + r32.f10245m);
        r9 = r32.f10245m;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x043f, code lost:
    
        r12 = (android.media.Image) r3.mo253s(p000.nd1.m3196a(android.media.Image.class));
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x044b, code lost:
    
        if (r12 != null) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x044d, code lost:
    
        android.util.Log.w("CXCP", "Failed to unwrap image wrapper " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x045c, code lost:
    
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x045d, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0460, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0462, code lost:
    
        r9.f5695l.queueInputImage(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0467, code lost:
    
        r12 = r8;
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x046c, code lost:
    
        android.util.Log.w("CXCP", "Failed to queue image to " + r9 + " due to error " + r0.getMessage() + ". Ignoring failure and closing " + r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0493, code lost:
    
        if ((r3 instanceof java.lang.AutoCloseable) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0495, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x049b, code lost:
    
        if ((r3 instanceof java.util.concurrent.ExecutorService) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x049d, code lost:
    
        r0 = (java.util.concurrent.ExecutorService) r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x04a4, code lost:
    
        if (r0 != java.util.concurrent.ForkJoinPool.commonPool()) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04ad, code lost:
    
        r0.shutdown();
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04b5, code lost:
    
        r12 = r8;
        r34 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04ba, code lost:
    
        r6 = r0.awaitTermination(1, java.util.concurrent.TimeUnit.DAYS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04be, code lost:
    
        r9 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04c0, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x04c2, code lost:
    
        r12 = r8;
        r34 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x04c5, code lost:
    
        if (r34 == false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x04c7, code lost:
    
        r0.shutdownNow();
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x04cd, code lost:
    
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x04d0, code lost:
    
        if (r9 != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x04d2, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x04da, code lost:
    
        if (r0 == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x04dc, code lost:
    
        android.util.Log.d("CXCP", "Failed to queue image " + r3 + " for reprocessing to ImageWriter " + r32.f10245m);
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x04fb, code lost:
    
        p000.ng3.m3210b(r4, r10.f1320b);
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0503, code lost:
    
        p000.C0000a.m0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0506, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0509, code lost:
    
        r12 = r8;
        p000.ng3.m3210b(r4, r5);
        r6 = r36;
        p000.ng3.m3210b(r4, r6);
        p000.ng3.m3210b(r4, r10.f1320b);
        p000.ng3.m3210b(r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x051a, code lost:
    
        r0 = p000.AbstractC0848wh.f10646c;
        r0.getClass();
        r8 = p000.C0800v6.f10126b.incrementAndGet(r0);
        r4 = r4.build();
        r4.getClass();
        r3 = r32.f10233a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0530, code lost:
    
        if ((r3 instanceof p000.C0538o3) != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0532, code lost:
    
        r3 = (p000.C0538o3) r3;
        r20 = r2;
        r2 = r3.f6518l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x053e, code lost:
    
        android.os.Trace.beginSection("CXCP#createHighSpeedRequestList");
        r0 = r3.f6939p.createHighSpeedRequestList(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0547, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x054b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x054c, code lost:
    
        android.os.Trace.endSection();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x054f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0550, code lost:
    
        android.util.Log.w("CXCP", "Failed to createHighSpeedRequestList from " + r2 + " because the output surface was not available.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0565, code lost:
    
        android.util.Log.w("CXCP", "Failed to createHighSpeedRequestList from " + r2 + " because the output surface was destroyed before calling createHighSpeedRequestList.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x057a, code lost:
    
        android.util.Log.w("CXCP", "Failed to createHighSpeedRequestList. " + r2 + " may be closed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0590, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0592, code lost:
    
        if (r0 != null) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0596, code lost:
    
        r2 = r10.f1319a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0598, code lost:
    
        if (r2 == null) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05a0, code lost:
    
        r2 = false;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05a5, code lost:
    
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x05ad, code lost:
    
        if (r2.hasNext() != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x05af, code lost:
    
        ((p000.oo1) r2.next()).getClass();
        r3 = r32.f10238f.f6804s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x05bc, code lost:
    
        if (r3 == null) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x05c4, code lost:
    
        r34 = r2;
        r2 = false;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x05ca, code lost:
    
        r4 = r3.size();
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x05cf, code lost:
    
        if (r5 < r4) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x05d1, code lost:
    
        r11 = r3.get(r5);
        r5 = r5 + 1;
        r11 = (p000.mo1) r11;
        r34 = r2;
        r2 = r11.f6344g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05dd, code lost:
    
        if (r2 == null) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x05df, code lost:
    
        r25 = r3;
        r26 = r4;
        r27 = r5;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x05e9, code lost:
    
        r25 = r3;
        r26 = r4;
        r27 = r5;
        r2 = p000.i21.m2065a(r2.f3852a, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x05f7, code lost:
    
        if (r2 == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x05f9, code lost:
    
        r2 = r11.f6346i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x05fb, code lost:
    
        if (r2 == null) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x05fd, code lost:
    
        r2 = false;
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0601, code lost:
    
        r4 = 1;
        r2 = p000.j21.m2289a(r2.f4635a, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0609, code lost:
    
        if (r2 != false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x060c, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x060e, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0610, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0612, code lost:
    
        if (r2 == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0614, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0617, code lost:
    
        r2 = r34;
        r3 = r25;
        r4 = r26;
        r5 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0620, code lost:
    
        r34 = r2;
        r4 = 1;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0625, code lost:
    
        if (r2 != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0627, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x062a, code lost:
    
        r2 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x062e, code lost:
    
        r4 = 1;
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0631, code lost:
    
        if (r2 == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0633, code lost:
    
        r5 = r35;
        r8 = r12;
        r2 = new p000.C0516ni(r32.f10233a, r0.get(0), r5, r6, r7, r8, r33, r10, r8);
        r14.add(r0.get(0));
        r28.add(r2);
        r13 = r13;
        r7 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0665, code lost:
    
        r2 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0669, code lost:
    
        r8 = r12;
        r34 = r13;
        r3 = r28;
        r2 = r0.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0680, code lost:
    
        r5 = r2;
        r28 = r3;
        r26 = r15;
        r15 = r4;
        r2 = new p000.C0516ni(r32.f10233a, r0.get(r4), r35, r36, r37, r8, r33, r10, r8);
        r14.add(r0.get(r15));
        r28.add(r2);
        r4 = r15 + 1;
        r3 = r28;
        r2 = r5;
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x06b3, code lost:
    
        r13 = r34;
        r5 = r35;
        r7 = r37;
        r28 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x06bc, code lost:
    
        r8 = r12;
        r20 = r2;
        r5 = r35;
        r7 = r37;
        r2 = new p000.C0516ni(r3, r4, r5, r36, r7, r8, r33, r10, r8);
        r14.add(r4);
        r28.add(r2);
        r2 = r20;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x06e8, code lost:
    
        p000.C0000a.m5g("Check failed.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x06ed, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0716, code lost:
    
        return new p000.C0737th(r32.f10233a.mo2585a0().mo1149u(), r33, r14, r28, r39, r38, r15, r2, r32.f10238f, r32.f10239g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:?, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x021e A[LOOP:0: B:7:0x0052->B:100:0x021e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0617 A[LOOP:8: B:256:0x05cf->B:273:0x0617, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0716 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6 A[LOOP:14: B:24:0x009e->B:40:0x00e6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a1 A[LOOP:12: B:63:0x0161->B:79:0x01a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af A[LOOP:11: B:55:0x013f->B:82:0x01af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0737th m4808b(boolean z, List list, Map map, Map map2, Map map3, tc0 tc0Var, List list2) throws InterruptedException {
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        Iterator it;
        Iterator it2;
        ArrayList arrayList2;
        int i;
        boolean zM2065a;
        boolean z4;
        boolean z5;
        boolean z6;
        Boolean boolValueOf;
        List list3;
        Iterator it3;
        int i2;
        Boolean bool;
        int i3;
        boolean zM2065a2;
        boolean z7;
        boolean z8;
        boolean z9;
        Boolean bool2;
        ArrayList arrayList3;
        int size;
        int i4;
        boolean z10;
        Map map4 = map;
        Map map5 = map3;
        map4.getClass();
        map2.getClass();
        map5.getClass();
        tc0Var.getClass();
        list2.getClass();
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = new ArrayMap();
        ArrayMap arrayMap3 = new ArrayMap();
        InterfaceC0406kj interfaceC0406kj = this.f10233a;
        no1 no1Var = this.f10238f;
        if (list.isEmpty()) {
            C0000a.m5g("build(...) should never be called with an empty request list!");
            return null;
        }
        if (interfaceC0406kj instanceof C0538o3) {
            Iterator it4 = list.iterator();
            Boolean bool3 = null;
            Boolean bool4 = null;
            while (it4.hasNext()) {
                ce1 ce1Var = (ce1) it4.next();
                List list4 = ce1Var.f1319a;
                if (list4 == null || !list4.isEmpty()) {
                    Iterator it5 = list4.iterator();
                    while (it5.hasNext()) {
                        ((oo1) it5.next()).getClass();
                        ArrayList arrayList6 = no1Var.f6804s;
                        if (arrayList6 == null || !arrayList6.isEmpty()) {
                            int size2 = arrayList6.size();
                            it = it4;
                            int i5 = 0;
                            while (i5 < size2) {
                                Object obj = arrayList6.get(i5);
                                int i6 = i5 + 1;
                                mo1 mo1Var = (mo1) obj;
                                it2 = it5;
                                i21 i21Var = mo1Var.f6344g;
                                j21 j21Var = mo1Var.f6346i;
                                if (i21Var == null) {
                                    arrayList2 = arrayList6;
                                    i = size2;
                                    arrayList = arrayList4;
                                    zM2065a = false;
                                } else {
                                    arrayList2 = arrayList6;
                                    i = size2;
                                    arrayList = arrayList4;
                                    zM2065a = i21.m2065a(i21Var.f3852a, 1L);
                                }
                                if (zM2065a) {
                                    z4 = true;
                                    if (!z4) {
                                        z5 = true;
                                        break;
                                    }
                                    it5 = it2;
                                    i5 = i6;
                                    arrayList6 = arrayList2;
                                    arrayList4 = arrayList;
                                    size2 = i;
                                } else {
                                    if (!(j21Var == null ? false : j21.m2289a(j21Var.f4635a, 0L)) && j21Var != null) {
                                        z4 = false;
                                    }
                                    if (!z4) {
                                    }
                                }
                            }
                        } else {
                            it = it4;
                        }
                        it2 = it5;
                        arrayList = arrayList4;
                        z5 = false;
                        if (z5) {
                            z6 = true;
                            break;
                        }
                        it4 = it;
                        it5 = it2;
                        arrayList4 = arrayList;
                    }
                    it = it4;
                    arrayList = arrayList4;
                    z6 = false;
                    boolValueOf = Boolean.valueOf(z6);
                    if (bool3 != null && !bool3.equals(boolValueOf)) {
                        Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool3.booleanValue() + ". Current request contains preview stream use case or hint: " + z6 + '.');
                    }
                    list3 = ce1Var.f1319a;
                    if (list3 == null && list3.isEmpty()) {
                        bool = boolValueOf;
                        z9 = false;
                        Object objValueOf = Boolean.valueOf(z9);
                        bool2 = bool4;
                        if (bool2 != null) {
                            Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool2.booleanValue() + ". Current request contains video stream use case: " + z9 + '.');
                        }
                        arrayList3 = no1Var.f6804s;
                        if (arrayList3 == null) {
                            size = arrayList3.size();
                            i4 = 0;
                            while (i4 < size) {
                            }
                            z10 = true;
                            if (!z10) {
                            }
                        }
                    } else {
                        it3 = list3.iterator();
                        while (it3.hasNext()) {
                            ((oo1) it3.next()).getClass();
                            ArrayList arrayList7 = no1Var.f6804s;
                            if (arrayList7 == null || !arrayList7.isEmpty()) {
                                int size3 = arrayList7.size();
                                int i7 = 0;
                                while (i7 < size3) {
                                    Object obj2 = arrayList7.get(i7);
                                    int i8 = i7 + 1;
                                    mo1 mo1Var2 = (mo1) obj2;
                                    i21 i21Var2 = mo1Var2.f6344g;
                                    if (i21Var2 == null) {
                                        i2 = size3;
                                        bool = boolValueOf;
                                        i3 = i8;
                                        zM2065a2 = false;
                                    } else {
                                        i2 = size3;
                                        bool = boolValueOf;
                                        i3 = i8;
                                        zM2065a2 = i21.m2065a(i21Var2.f3852a, 3L);
                                    }
                                    if (zM2065a2) {
                                        z7 = true;
                                        if (!z7) {
                                            z8 = true;
                                            break;
                                        }
                                        boolValueOf = bool;
                                        size3 = i2;
                                        i7 = i3;
                                    } else {
                                        j21 j21Var2 = mo1Var2.f6346i;
                                        if (!(j21Var2 == null ? false : j21.m2289a(j21Var2.f4635a, 1L))) {
                                            z7 = false;
                                        }
                                        if (!z7) {
                                        }
                                    }
                                }
                                bool = boolValueOf;
                                z8 = false;
                                if (!z8) {
                                    z9 = true;
                                    break;
                                }
                                boolValueOf = bool;
                            } else {
                                bool = boolValueOf;
                                z8 = false;
                                if (!z8) {
                                }
                            }
                        }
                        bool = boolValueOf;
                        z9 = false;
                        Object objValueOf2 = Boolean.valueOf(z9);
                        bool2 = bool4;
                        if (bool2 != null && !bool2.equals(objValueOf2)) {
                            Log.e("CXCP", "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: " + bool2.booleanValue() + ". Current request contains video stream use case: " + z9 + '.');
                        }
                        arrayList3 = no1Var.f6804s;
                        if (arrayList3 == null || !arrayList3.isEmpty()) {
                            size = arrayList3.size();
                            i4 = 0;
                            while (i4 < size) {
                                Object obj3 = arrayList3.get(i4);
                                i4++;
                                if (!((mo1) obj3).m3047a()) {
                                    z10 = false;
                                    break;
                                }
                            }
                            z10 = true;
                            if (!z10) {
                                Log.e("CXCP", "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + no1Var.f6804s);
                                z2 = false;
                                break;
                            }
                            bool4 = objValueOf2;
                            it4 = it;
                            bool3 = bool;
                            arrayList4 = arrayList;
                        } else {
                            z10 = true;
                            if (!z10) {
                            }
                        }
                    }
                } else {
                    it = it4;
                    arrayList = arrayList4;
                    z6 = false;
                    boolValueOf = Boolean.valueOf(z6);
                    if (bool3 != null) {
                        Log.e("CXCP", "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: " + bool3.booleanValue() + ". Current request contains preview stream use case or hint: " + z6 + '.');
                    }
                    list3 = ce1Var.f1319a;
                    if (list3 == null) {
                        it3 = list3.iterator();
                        while (it3.hasNext()) {
                        }
                        bool = boolValueOf;
                        z9 = false;
                        Object objValueOf22 = Boolean.valueOf(z9);
                        bool2 = bool4;
                        if (bool2 != null) {
                        }
                        arrayList3 = no1Var.f6804s;
                        if (arrayList3 == null) {
                        }
                    }
                }
            }
            arrayList = arrayList4;
            z2 = true;
        } else {
            arrayList = arrayList4;
            z2 = true;
        }
        if (z2) {
            String str = "Required value was null.";
            if (!list.isEmpty()) {
                Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        z3 = true;
                        break;
                    }
                    ce1 ce1Var2 = (ce1) it6.next();
                    Iterator it7 = ce1Var2.f1319a.iterator();
                    boolean z11 = false;
                    while (it7.hasNext()) {
                        int i9 = ((oo1) it7.next()).f7257a;
                        if (!arrayMap3.containsKey(new oo1(i9))) {
                            Surface surface = (Surface) this.f10236d.get(new oo1(i9));
                            if (surface != null) {
                                arrayMap.put(surface, new oo1(i9));
                                arrayMap3.put(new oo1(i9), surface);
                                C0521nn c0521nnM3266a = this.f10238f.m3266a(i9);
                                if (c0521nnM3266a == null) {
                                    C0000a.m5g(str);
                                    return null;
                                }
                                ArrayList arrayList8 = c0521nnM3266a.f6771b;
                                int size4 = arrayList8.size();
                                int i10 = 0;
                                while (i10 < size4) {
                                    Object obj4 = arrayList8.get(i10);
                                    i10++;
                                    mo1 mo1Var3 = (mo1) obj4;
                                    String str2 = str;
                                    Iterator it8 = it6;
                                    Object obj5 = this.f10237e.get(new x11(mo1Var3.f6338a));
                                    if (obj5 == null) {
                                        C0000a.m5g(str2);
                                        return null;
                                    }
                                    arrayMap2.put((Surface) obj5, new x11(mo1Var3.f6338a));
                                    str = str2;
                                    it6 = it8;
                                }
                            } else {
                                continue;
                            }
                        }
                        z11 = true;
                    }
                    String str3 = str;
                    Iterator it9 = it6;
                    if (!z11) {
                        Log.i("CXCP", "  Failed to bind any surfaces for " + ce1Var2 + '!');
                        z3 = false;
                        break;
                    }
                    if (!z11) {
                        C0000a.m5g("Check failed.");
                        return null;
                    }
                    str = str3;
                    it6 = it9;
                }
            } else {
                C0000a.m5g("build(...) should never be called with an empty request list!");
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: c */
    public final void m4809c() {
        C0737th c0737th;
        try {
            Trace.beginSection(this + "#disconnect");
            synchronized (this.f10242j) {
                try {
                    if (this.f10243k) {
                        c0737th = null;
                    } else {
                        this.f10243k = true;
                        C0428l4 c0428l4 = this.f10245m;
                        if (c0428l4 != null) {
                            g71.m1779s(c0428l4);
                        }
                        Surface inputSurface = this.f10233a.getInputSurface();
                        if (inputSurface != null) {
                            inputSurface.release();
                        }
                        c0737th = this.f10244l;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f10240h && c0737th != null) {
                m4807a(this, c0737th);
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x002a, B:14:0x0033, B:16:0x0039, B:18:0x003e, B:20:0x0042, B:21:0x0044, B:22:0x0051, B:23:0x005e, B:26:0x0066, B:27:0x006b), top: B:32:0x0003 }] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer m4810d(C0737th c0737th) {
        Integer numMo2588p;
        synchronized (this.f10242j) {
            if (this.f10243k) {
                Log.w("CXCP", this + " disconnected. " + c0737th + " won't be submitted");
                return null;
            }
            if (c0737th.f9451c.size() == 1) {
                InterfaceC0406kj interfaceC0406kj = this.f10233a;
                if (interfaceC0406kj instanceof C0538o3) {
                    boolean z = c0737th.f9450b;
                    InterfaceC0406kj interfaceC0406kj2 = this.f10233a;
                    ArrayList arrayList = c0737th.f9451c;
                    numMo2588p = z ? interfaceC0406kj2.mo2588p(arrayList, c0737th) : interfaceC0406kj2.mo2587g(arrayList, c0737th);
                } else if (c0737th.f9450b) {
                    if (this.f10240h) {
                        this.f10244l = c0737th;
                    }
                    numMo2588p = interfaceC0406kj.mo2586f((CaptureRequest) c0737th.f9451c.get(0), c0737th);
                } else {
                    numMo2588p = interfaceC0406kj.mo2584S((CaptureRequest) c0737th.f9451c.get(0), c0737th);
                }
            }
            return numMo2588p;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.f10241i;
    }
}
