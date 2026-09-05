package p000;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.text.latin.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final class os1 {

    /* renamed from: c */
    public static final os1 f7301c = new os1();

    /* renamed from: a */
    public final AtomicReference f7302a = new AtomicReference();

    /* renamed from: b */
    public final String f7303b = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: a */
    public final boolean m3466a() {
        AtomicReference atomicReference = this.f7302a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = g50.m1742a(mx0.m3113c().m3116b(), ModuleDescriptor.MODULE_ID) > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* renamed from: b */
    public final String m3467b() {
        return true != m3466a() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof os1) {
            return qb3.m3706a(null, null);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}
