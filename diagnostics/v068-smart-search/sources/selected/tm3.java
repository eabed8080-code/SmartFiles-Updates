package p000;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class tm3 extends px0 implements ns1 {

    /* renamed from: q */
    public final os1 f9530q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tm3(ps1 ps1Var, Executor executor, f04 f04Var, os1 os1Var) {
        super(ps1Var, executor);
        this.f9530q = os1Var;
        C0429l5 c0429l5 = new C0429l5();
        c0429l5.f5707n = os1Var.m3466a() ? eq3.f2536n : eq3.f2535m;
        bl1 bl1Var = new bl1(13, false);
        zm1 zm1Var = new zm1(8);
        zm1Var.f12238m = yw3.f11915m;
        bl1Var.f967o = new bx3(zm1Var);
        c0429l5.f5708o = new tw3(bl1Var);
        j53.f4663l.execute(new rz3(f04Var, new C0079c0(c0429l5, 1), iq3.f4475s, f04Var.m1527c(), 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j11
    /* renamed from: a */
    public final w90[] mo1670a() {
        return this.f9530q.m3466a() ? k11.f5330a : new w90[]{k11.f5331b};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: c */
    public final d14 m4462c(go0 go0Var) {
        synchronized (this) {
            if (this.f7765l.get()) {
                return bj3.m508b(new nx0(14, "This detector is already closed!"));
            }
            if (go0Var.f3347b < 32 || go0Var.f3348c < 32) {
                return bj3.m508b(new nx0(3, "InputImage width and height should be at least 32!"));
            }
            return this.f7766m.m3645a(this.f7768o, new hd0(this, go0Var), (hj1) this.f7767n.f4765m);
        }
    }
}
