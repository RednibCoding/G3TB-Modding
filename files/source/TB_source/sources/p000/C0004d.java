package p000;

import java.util.Vector;

/* renamed from: d */
public class C0004d extends Thread {

    /* renamed from: a */
    public static int f427a = 0;

    /* renamed from: a */
    public static Vector f428a;

    /* renamed from: a */
    public static boolean f429a = false;

    /* renamed from: b */
    public static boolean f430b = false;

    /* renamed from: c */
    public static boolean f431c = false;

    /* renamed from: a */
    public static final void m488a(int i) {
        if (f428a == null) {
            f428a = new Vector(1, 1);
        }
        if (f431c) {
            f429a = false;
        }
        f428a.addElement(new Integer(i));
    }

    /* renamed from: b */
    public static final void m489b(int i) {
        if (i >= 0) {
            C0000HG.m92t(i);
        }
    }

    public final void run() {
        while (true) {
            try {
                f427a++;
                f431c = false;
                f430b = true;
                int i = f428a != null ? f428a.size() : 0;
                if (C0000HG.f66j) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (int i2 = 0; i2 < C0000HG.f83u; i2++) {
                        if (C0000HG.f26a[i2] > 0 && currentTimeMillis >= C0000HG.f26a[i2] && C0000HG.f37b[i2] != 1) {
                            C0000HG.f26a[i2] = -1;
                            int i3 = C0000HG.f30a[i2][0];
                            if (C0000HG.f37b[i2] == 0) {
                                C0000HG.m91s(i3);
                                C0000HG.f37b[i2] = 2;
                                C0000HG.m0a(i2);
                            }
                        }
                    }
                }
                if (i > 0 && !C0000HG.f44c && !f429a) {
                    for (int i4 = 0; i4 < i; i4++) {
                        int intValue = ((Integer) f428a.elementAt(0)).intValue();
                        if (!f429a) {
                            C0000HG.m93u(intValue);
                        }
                        f428a.removeElementAt(0);
                    }
                }
                if (C0000HG.f44c) {
                    C0000HG.m86p();
                }
                f431c = true;
                sleep(110);
            } catch (Exception e) {
            }
        }
    }
}
