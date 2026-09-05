package p000;

import com.example.smart_life.MainActivity;
import java.io.File;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class tu0 implements Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f9597l;

    /* renamed from: m */
    public final /* synthetic */ MainActivity f9598m;

    /* renamed from: n */
    public final /* synthetic */ String f9599n;

    /* renamed from: o */
    public final /* synthetic */ dx0 f9600o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ tu0(String str, MainActivity mainActivity, dx0 dx0Var) {
        this.f9597l = 5;
        this.f9599n = str;
        this.f9598m = mainActivity;
        this.f9600o = dx0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9597l;
        int i2 = 5;
        int i3 = 2;
        int i4 = 1;
        int i5 = 6;
        dx0 dx0Var = this.f9600o;
        String str = this.f9599n;
        MainActivity mainActivity = this.f9598m;
        switch (i) {
            case 0:
                int i6 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new tl0(dx0Var, 6, om1.m3403k(mainActivity, str)));
                    break;
                } catch (Exception e) {
                    mainActivity.runOnUiThread(new b40(dx0Var, e, i5));
                    return;
                }
            case 1:
                int i7 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new tl0(dx0Var, 5, om1.m3405m(mainActivity, new File(str))));
                    break;
                } catch (Exception unused) {
                    mainActivity.runOnUiThread(new c40(1, dx0Var));
                    return;
                }
            case w81.FLOAT_FIELD_NUMBER /* 2 */:
                int i8 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new xu0(dx0Var, th3.m4443e(mainActivity, new File(str)), i4));
                    break;
                } catch (Exception e2) {
                    mainActivity.runOnUiThread(new b40(dx0Var, e2, 4));
                    return;
                }
            case w81.INTEGER_FIELD_NUMBER /* 3 */:
                int i9 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new wu0(dx0Var, th3.m4444f(mainActivity, new File(str)), 1));
                    break;
                } catch (Exception e3) {
                    mainActivity.runOnUiThread(new b40(dx0Var, e3, i3));
                    return;
                }
            case w81.LONG_FIELD_NUMBER /* 4 */:
                int i10 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new xu0(dx0Var, th3.m4441c(mainActivity, new File(str)), i5));
                    break;
                } catch (Exception e4) {
                    mainActivity.runOnUiThread(new b40(dx0Var, e4, 11));
                    return;
                }
            case w81.STRING_FIELD_NUMBER /* 5 */:
                int i11 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new xu0(dx0Var, tb3.m4382a(mainActivity, new File(str)), 3));
                    break;
                } catch (Exception e5) {
                    mainActivity.runOnUiThread(new b40(dx0Var, e5, 8));
                    return;
                }
            default:
                int i12 = MainActivity.f1409S;
                try {
                    mainActivity.runOnUiThread(new xu0(dx0Var, mainActivity.m828N(new File(str)), i3));
                    break;
                } catch (Exception e6) {
                    mainActivity.runOnUiThread(new b40(dx0Var, e6, i2));
                }
        }
    }

    public /* synthetic */ tu0(MainActivity mainActivity, String str, dx0 dx0Var, int i) {
        this.f9597l = i;
        this.f9598m = mainActivity;
        this.f9599n = str;
        this.f9600o = dx0Var;
    }
}
