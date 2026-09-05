package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class km0 implements yh0, InterfaceC0953zb {

    /* renamed from: l */
    public final /* synthetic */ int f5512l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [sr1.c():void] */
    public /* synthetic */ km0(int i) {
        this.f5512l = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap:java.util.NoSuchElementException:0x0002: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:3) call: java.util.NoSuchElementException.<init>():void type: CONSTRUCTOR)
     (LINE:46) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: a */
    public static /* synthetic */ void m2608a() {
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: THROW 
      (wrap:java.lang.UnsupportedOperationException:0x001d: CONSTRUCTOR 
      (wrap:java.lang.String:STR_CONCAT 
      ("Provided data element number (")
      (r2v0 int)
      (wrap:java.lang.Object:?: CAST (java.lang.Object) (") should be multiple of the Mat channels count ("))
      (r3v0 int)
      (wrap:java.lang.Object:?: CAST (java.lang.Object) (")"))
     A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:24))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:30) call: java.lang.UnsupportedOperationException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:81) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: b */
    public static /* synthetic */ void m2609b(int i, int i2) {
        throw new UnsupportedOperationException("Provided data element number (" + i + ((Object) ") should be multiple of the Mat channels count (") + i2 + ((Object) ")"));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
      (wrap:java.lang.IllegalArgumentException:0x000e: CONSTRUCTOR 
      (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:81) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: c */
    public static /* synthetic */ void m2610c(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap:java.lang.IllegalArgumentException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:62) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: d */
    public static /* synthetic */ void m2611d(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: THROW 
      (wrap:pu:0x0011: CONSTRUCTOR 
      (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object), (r4v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:14))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:18) call: pu.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:241) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: e */
    public static /* synthetic */ void m2612e(String str, Object obj, Object obj2) {
        throw new C0602pu(str + obj + obj2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: THROW 
      (wrap:java.lang.IllegalArgumentException:0x0014: CONSTRUCTOR 
      (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r3v0 java.lang.Object), (r4v0 java.lang.Object), (r5v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:17))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:21) call: java.lang.IllegalArgumentException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:586) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: f */
    public static /* synthetic */ void m2613f(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: g */
    public static /* synthetic */ void m2614g(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
      (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
      (wrap:java.lang.String:0x000e: INVOKE 
      (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
     VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:81) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: h */
    public static /* synthetic */ void m2615h(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap:java.lang.UnsupportedOperationException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.UnsupportedOperationException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:62) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: i */
    public static /* synthetic */ void m2616i(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
      (wrap:java.lang.IllegalStateException:0x000e: CONSTRUCTOR 
      (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:15) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:81) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: j */
    public static /* synthetic */ void m2617j(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: THROW 
      (wrap:java.lang.NullPointerException:0x0002: CONSTRUCTOR (r1v0 java.lang.String) A[MD:(java.lang.String):void (c), WRAPPED] (LINE:3) call: java.lang.NullPointerException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:62) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: k */
    public static /* synthetic */ void m2618k(String str) {
        throw new NullPointerException(str);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: THROW 
      (wrap:java.lang.AssertionError:0x000e: CONSTRUCTOR 
      (wrap:java.lang.String:STR_CONCAT (r3v0 java.lang.String), (r2v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:11))
     A[MD:(java.lang.Object):void (c), WRAPPED] (LINE:15) call: java.lang.AssertionError.<init>(java.lang.Object):void type: CONSTRUCTOR)
     (LINE:81) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: m */
    public static /* synthetic */ void m2619m(Object obj, String str) {
        throw new AssertionError(str + obj);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: THROW 
      (wrap:java.lang.IllegalStateException:0x0012: CONSTRUCTOR 
      (wrap:java.lang.String:0x000e: INVOKE 
      (wrap:java.lang.String:STR_CONCAT (r2v0 java.lang.String), (r1v0 java.lang.Object) A[MD:():java.lang.String (c), SYNTHETIC, WRAPPED] (LINE:9))
     VIRTUAL call: java.lang.Object.toString():java.lang.String A[MD:():java.lang.String (c), WRAPPED] (LINE:15))
     A[MD:(java.lang.String):void (c), WRAPPED] (LINE:19) call: java.lang.IllegalStateException.<init>(java.lang.String):void type: CONSTRUCTOR)
     (LINE:81) */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: n */
    public static /* synthetic */ void m2620n(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.yh0
    public Object apply(Object obj) {
        switch (this.f5512l) {
            case 0:
                lm0 lm0Var = nm0.f6753C;
                return null;
            default:
                return g91.f3168b;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0953zb
    /* renamed from: l */
    public void mo131l(Object obj, C0660re c0660re) {
        List listM4090c;
        List listM4090c2;
        List listM4090c3;
        List listM4090c4;
        List listM4090c5;
        List listM4090c6;
        List listM4090c7;
        List listM4090c8;
        List listM4090c9;
        List listM4090c10;
        List listM4090c11;
        switch (this.f5512l) {
            case 9:
                obj.getClass();
                Object obj2 = ((List) obj).get(0);
                obj2.getClass();
                try {
                    listM4090c = AbstractC0675rt.m4089b(((InterfaceC0553oi) obj2).mo58b());
                } catch (Throwable th) {
                    if (th instanceof C0411ko) {
                        C0411ko c0411ko = th;
                        listM4090c = AbstractC0675rt.m4090c(c0411ko.f5532l, c0411ko.f5533m, c0411ko.f5534n);
                    } else {
                        listM4090c = AbstractC0675rt.m4090c(th.getClass().getSimpleName(), th.toString(), g71.m1772l("Cause: ", th.getCause(), ", Stacktrace: ", Log.getStackTraceString(th)));
                    }
                }
                c0660re.mo171e(listM4090c);
                break;
            case 10:
                obj.getClass();
                Object obj3 = ((List) obj).get(0);
                obj3.getClass();
                try {
                    listM4090c2 = AbstractC0675rt.m4089b(new pt0(((InterfaceC0064bl) obj3).mo238N(), qt0.f8290n));
                } catch (Throwable th2) {
                    if (th2 instanceof C0411ko) {
                        C0411ko c0411ko2 = th2;
                        listM4090c2 = AbstractC0675rt.m4090c(c0411ko2.f5532l, c0411ko2.f5533m, c0411ko2.f5534n);
                    } else {
                        listM4090c2 = AbstractC0675rt.m4090c(th2.getClass().getSimpleName(), th2.toString(), g71.m1772l("Cause: ", th2.getCause(), ", Stacktrace: ", Log.getStackTraceString(th2)));
                    }
                }
                c0660re.mo171e(listM4090c2);
                break;
            case 11:
                obj.getClass();
                Object obj4 = ((List) obj).get(0);
                obj4.getClass();
                try {
                    listM4090c3 = AbstractC0675rt.m4089b(new pt0(((InterfaceC0064bl) obj4).mo236I(), qt0.f8291o));
                } catch (Throwable th3) {
                    if (th3 instanceof C0411ko) {
                        C0411ko c0411ko3 = th3;
                        listM4090c3 = AbstractC0675rt.m4090c(c0411ko3.f5532l, c0411ko3.f5533m, c0411ko3.f5534n);
                    } else {
                        listM4090c3 = AbstractC0675rt.m4090c(th3.getClass().getSimpleName(), th3.toString(), g71.m1772l("Cause: ", th3.getCause(), ", Stacktrace: ", Log.getStackTraceString(th3)));
                    }
                }
                c0660re.mo171e(listM4090c3);
                break;
            case 12:
                obj.getClass();
                List list = (List) obj;
                Object obj5 = list.get(0);
                obj5.getClass();
                C0783uq c0783uq = (C0783uq) obj5;
                Object obj6 = list.get(1);
                obj6.getClass();
                try {
                    listM4090c4 = AbstractC0675rt.m4089b(c0783uq.f9964N.mo2858c(up2.m4672a((CaptureRequest.Key) obj6), null));
                } catch (Throwable th4) {
                    if (th4 instanceof C0411ko) {
                        C0411ko c0411ko4 = th4;
                        listM4090c4 = AbstractC0675rt.m4090c(c0411ko4.f5532l, c0411ko4.f5533m, c0411ko4.f5534n);
                    } else {
                        listM4090c4 = AbstractC0675rt.m4090c(th4.getClass().getSimpleName(), th4.toString(), g71.m1772l("Cause: ", th4.getCause(), ", Stacktrace: ", Log.getStackTraceString(th4)));
                    }
                }
                c0660re.mo171e(listM4090c4);
                break;
            case 13:
                obj.getClass();
                Object obj7 = ((List) obj).get(0);
                obj7.getClass();
                try {
                    listM4090c5 = AbstractC0675rt.m4089b(Arrays.asList(((bn0) obj7).mo561d()));
                } catch (Throwable th5) {
                    if (th5 instanceof C0411ko) {
                        C0411ko c0411ko5 = th5;
                        listM4090c5 = AbstractC0675rt.m4090c(c0411ko5.f5532l, c0411ko5.f5533m, c0411ko5.f5534n);
                    } else {
                        listM4090c5 = AbstractC0675rt.m4090c(th5.getClass().getSimpleName(), th5.toString(), g71.m1772l("Cause: ", th5.getCause(), ", Stacktrace: ", Log.getStackTraceString(th5)));
                    }
                }
                c0660re.mo171e(listM4090c5);
                break;
            case 14:
                obj.getClass();
                Object obj8 = ((List) obj).get(0);
                obj8.getClass();
                try {
                    ((bn0) obj8).close();
                    listM4090c6 = AbstractC0675rt.m4089b(null);
                } catch (Throwable th6) {
                    if (th6 instanceof C0411ko) {
                        C0411ko c0411ko6 = th6;
                        listM4090c6 = AbstractC0675rt.m4090c(c0411ko6.f5532l, c0411ko6.f5533m, c0411ko6.f5534n);
                    } else {
                        listM4090c6 = AbstractC0675rt.m4090c(th6.getClass().getSimpleName(), th6.toString(), g71.m1772l("Cause: ", th6.getCause(), ", Stacktrace: ", Log.getStackTraceString(th6)));
                    }
                }
                c0660re.mo171e(listM4090c6);
                break;
            case 15:
                obj.getClass();
                List list2 = (List) obj;
                Object obj9 = list2.get(0);
                obj9.getClass();
                long jLongValue = ((Long) obj9).longValue();
                Object obj10 = list2.get(1);
                obj10.getClass();
                long jLongValue2 = ((Long) obj10).longValue();
                Object obj11 = list2.get(2);
                obj11.getClass();
                try {
                    listM4090c7 = AbstractC0675rt.m4089b(e23.m1235k(jLongValue, jLongValue2, (List) obj11));
                } catch (Throwable th7) {
                    if (th7 instanceof C0411ko) {
                        C0411ko c0411ko7 = th7;
                        listM4090c7 = AbstractC0675rt.m4090c(c0411ko7.f5532l, c0411ko7.f5533m, c0411ko7.f5534n);
                    } else {
                        listM4090c7 = AbstractC0675rt.m4090c(th7.getClass().getSimpleName(), th7.toString(), g71.m1772l("Cause: ", th7.getCause(), ", Stacktrace: ", Log.getStackTraceString(th7)));
                    }
                }
                c0660re.mo171e(listM4090c7);
                break;
            case 16:
                obj.getClass();
                ((List) obj).get(0).getClass();
                try {
                    listM4090c8 = AbstractC0675rt.m4089b(Double.valueOf(((yw0) r9).f11889c));
                } catch (Throwable th8) {
                    if (th8 instanceof C0411ko) {
                        C0411ko c0411ko8 = th8;
                        listM4090c8 = AbstractC0675rt.m4090c(c0411ko8.f5532l, c0411ko8.f5533m, c0411ko8.f5534n);
                    } else {
                        listM4090c8 = AbstractC0675rt.m4090c(th8.getClass().getSimpleName(), th8.toString(), g71.m1772l("Cause: ", th8.getCause(), ", Stacktrace: ", Log.getStackTraceString(th8)));
                    }
                }
                c0660re.mo171e(listM4090c8);
                break;
            case 17:
                obj.getClass();
                List list3 = (List) obj;
                Object obj12 = list3.get(0);
                obj12.getClass();
                r30 r30Var = (r30) obj12;
                Object obj13 = list3.get(1);
                obj13.getClass();
                double dDoubleValue = ((Double) obj13).doubleValue();
                Object obj14 = list3.get(2);
                obj14.getClass();
                try {
                    listM4090c9 = AbstractC0675rt.m4089b(r30Var.m3898a((float) dDoubleValue, (float) ((Double) obj14).doubleValue(), 0.15f));
                } catch (Throwable th9) {
                    if (th9 instanceof C0411ko) {
                        C0411ko c0411ko9 = th9;
                        listM4090c9 = AbstractC0675rt.m4090c(c0411ko9.f5532l, c0411ko9.f5533m, c0411ko9.f5534n);
                    } else {
                        listM4090c9 = AbstractC0675rt.m4090c(th9.getClass().getSimpleName(), th9.toString(), g71.m1772l("Cause: ", th9.getCause(), ", Stacktrace: ", Log.getStackTraceString(th9)));
                    }
                }
                c0660re.mo171e(listM4090c9);
                break;
            case 18:
                obj.getClass();
                List list4 = (List) obj;
                Object obj15 = list4.get(0);
                obj15.getClass();
                r30 r30Var2 = (r30) obj15;
                Object obj16 = list4.get(1);
                obj16.getClass();
                double dDoubleValue2 = ((Double) obj16).doubleValue();
                Object obj17 = list4.get(2);
                obj17.getClass();
                double dDoubleValue3 = ((Double) obj17).doubleValue();
                Object obj18 = list4.get(3);
                obj18.getClass();
                try {
                    listM4090c10 = AbstractC0675rt.m4089b(r30Var2.m3898a((float) dDoubleValue2, (float) dDoubleValue3, (float) ((Double) obj18).doubleValue()));
                } catch (Throwable th10) {
                    if (th10 instanceof C0411ko) {
                        C0411ko c0411ko10 = th10;
                        listM4090c10 = AbstractC0675rt.m4090c(c0411ko10.f5532l, c0411ko10.f5533m, c0411ko10.f5534n);
                    } else {
                        listM4090c10 = AbstractC0675rt.m4090c(th10.getClass().getSimpleName(), th10.toString(), g71.m1772l("Cause: ", th10.getCause(), ", Stacktrace: ", Log.getStackTraceString(th10)));
                    }
                }
                c0660re.mo171e(listM4090c10);
                break;
            default:
                obj.getClass();
                Object obj19 = ((List) obj).get(0);
                obj19.getClass();
                try {
                    listM4090c11 = AbstractC0675rt.m4089b(((re1) obj19).f8572a);
                } catch (Throwable th11) {
                    if (th11 instanceof C0411ko) {
                        C0411ko c0411ko11 = th11;
                        listM4090c11 = AbstractC0675rt.m4090c(c0411ko11.f5532l, c0411ko11.f5533m, c0411ko11.f5534n);
                    } else {
                        listM4090c11 = AbstractC0675rt.m4090c(th11.getClass().getSimpleName(), th11.toString(), g71.m1772l("Cause: ", th11.getCause(), ", Stacktrace: ", Log.getStackTraceString(th11)));
                    }
                }
                c0660re.mo171e(listM4090c11);
                break;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [je0.c(vb0, dx0):void] */
    public /* synthetic */ km0(int i, Object obj) {
        this.f5512l = i;
    }
}
