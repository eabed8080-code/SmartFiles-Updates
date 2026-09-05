package p000;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class km1 implements Iterator {

    /* renamed from: l */
    public final /* synthetic */ int f5513l;

    /* renamed from: m */
    public int f5514m = -1;

    /* renamed from: n */
    public boolean f5515n;

    /* renamed from: o */
    public Iterator f5516o;

    /* renamed from: p */
    public final /* synthetic */ AbstractMap f5517p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ km1(AbstractMap abstractMap, int i) {
        this.f5513l = i;
        this.f5517p = abstractMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: a */
    public Iterator m2621a() {
        if (this.f5516o == null) {
            this.f5516o = ((im1) this.f5517p).f4125m.entrySet().iterator();
        }
        return this.f5516o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: b */
    public Iterator m2622b() {
        if (this.f5516o == null) {
            this.f5516o = ((bk2) this.f5517p).f955n.entrySet().iterator();
        }
        return this.f5516o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f5513l;
        AbstractMap abstractMap = this.f5517p;
        switch (i) {
            case 0:
                im1 im1Var = (im1) abstractMap;
                if (this.f5514m + 1 >= im1Var.f4124l.size()) {
                    if (im1Var.f4125m.isEmpty() || !m2621a().hasNext()) {
                        break;
                    }
                }
                break;
            default:
                bk2 bk2Var = (bk2) abstractMap;
                if (this.f5514m + 1 >= bk2Var.f954m) {
                    if (bk2Var.f955n.isEmpty() || !m2622b().hasNext()) {
                        break;
                    }
                }
                break;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f5513l;
        AbstractMap abstractMap = this.f5517p;
        switch (i) {
            case 0:
                this.f5515n = true;
                int i2 = this.f5514m + 1;
                this.f5514m = i2;
                im1 im1Var = (im1) abstractMap;
                return i2 < im1Var.f4124l.size() ? (Map.Entry) im1Var.f4124l.get(this.f5514m) : (Map.Entry) m2621a().next();
            default:
                this.f5515n = true;
                int i3 = this.f5514m + 1;
                this.f5514m = i3;
                bk2 bk2Var = (bk2) abstractMap;
                return i3 < bk2Var.f954m ? (ck2) bk2Var.f953l[i3] : (Map.Entry) m2622b().next();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f5513l;
        AbstractMap abstractMap = this.f5517p;
        switch (i) {
            case 0:
                im1 im1Var = (im1) abstractMap;
                if (!this.f5515n) {
                    C0000a.m5g("remove() was called before next()");
                    break;
                } else {
                    this.f5515n = false;
                    int i2 = im1.f4123q;
                    im1Var.m2184b();
                    if (this.f5514m >= im1Var.f4124l.size()) {
                        m2621a().remove();
                        break;
                    } else {
                        int i3 = this.f5514m;
                        this.f5514m = i3 - 1;
                        im1Var.m2189h(i3);
                        break;
                    }
                }
            default:
                bk2 bk2Var = (bk2) abstractMap;
                if (!this.f5515n) {
                    C0000a.m5g("remove() was called before next()");
                    break;
                } else {
                    this.f5515n = false;
                    int i4 = bk2.f952r;
                    bk2Var.m535g();
                    int i5 = this.f5514m;
                    if (i5 >= bk2Var.f954m) {
                        m2622b().remove();
                        break;
                    } else {
                        this.f5514m = i5 - 1;
                        bk2Var.m533e(i5);
                        break;
                    }
                }
        }
    }
}
