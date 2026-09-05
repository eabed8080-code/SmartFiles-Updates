package p000;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketException;

/* compiled from: r8-map-id-3bb661786d9cf04bdd4db94c51e681f9f2d4a8de231340567142ca45c28020b0 */
/* loaded from: classes.dex */
public final /* synthetic */ class d61 implements Runnable {

    /* renamed from: l */
    public final /* synthetic */ int f1717l;

    /* renamed from: m */
    public final /* synthetic */ e61 f1718m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ d61(e61 e61Var, int i) {
        this.f1717l = i;
        this.f1718m = e61Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws Throwable {
        ServerSocket serverSocket;
        int i = this.f1717l;
        e61 e61Var = this.f1718m;
        switch (i) {
            case 0:
                ServerSocket serverSocket2 = null;
                try {
                    try {
                        serverSocket = new ServerSocket();
                        serverSocket.setReuseAddress(true);
                        serverSocket.bind(new InetSocketAddress(8766));
                        try {
                            e61Var.f2182e = serverSocket;
                            e61Var.m1316g();
                            while (e61Var.f2181d) {
                                new Thread(new tl0(e61Var, 10, serverSocket.accept()), "SmartLifePhoneClient").start();
                            }
                            e61Var.f2181d = false;
                            e61Var.f2182e = null;
                        } catch (SocketException e) {
                            e = e;
                            if (e61Var.f2181d) {
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "network error";
                                }
                                e61Var.f2180c.post(new tl0(e61Var, 11, "Phone receiver stopped: " + message));
                            }
                            e61Var.f2181d = false;
                            e61Var.f2182e = null;
                            if (serverSocket == null) {
                                return;
                            }
                            serverSocket.close();
                            return;
                        } catch (Exception e2) {
                            e = e2;
                            if (e61Var.f2181d) {
                                String message2 = e.getMessage();
                                if (message2 == null) {
                                    message2 = "unknown error";
                                }
                                e61Var.f2180c.post(new tl0(e61Var, 11, "Phone receiver could not start: " + message2));
                            }
                            e61Var.f2181d = false;
                            e61Var.f2182e = null;
                            if (serverSocket == null) {
                                return;
                            }
                            serverSocket.close();
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        e61Var.f2181d = false;
                        e61Var.f2182e = null;
                        if (0 != 0) {
                            try {
                                serverSocket2.close();
                            } catch (Exception unused) {
                            }
                        }
                        throw th;
                    }
                } catch (SocketException e3) {
                    e = e3;
                    serverSocket = null;
                } catch (Exception e4) {
                    e = e4;
                    serverSocket = null;
                } catch (Throwable th2) {
                    th = th2;
                    e61Var.f2181d = false;
                    e61Var.f2182e = null;
                    if (0 != 0) {
                    }
                    throw th;
                }
                try {
                    serverSocket.close();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 1:
                e61Var.m1314a();
                return;
        }
        while (e61Var.f2181d) {
            e61Var.m1314a();
            try {
                Thread.sleep(2000L);
            } catch (InterruptedException unused3) {
                return;
            }
        }
    }
}
