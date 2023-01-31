// 
// Decompiled by Procyon v0.5.36
// 

public class C implements Runnable
{
    A a;
    int b;
    public static int c;
    int d;
    int e;
    int f;
    boolean g;
    public Object h;
    
    public C() {
        this.b = -1;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = false;
        this.h = new Object();
    }
    
    public void A(final A a, final int d, final int e, final int f, final boolean g) {
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.b = -1;
        this.g = g;
        C.c = 0;
    }
    
    public void A(final A a, final int b) {
        this.a = a;
        this.b = b;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.g = false;
        C.c = 0;
    }
    
    public void run() {
        if (this.b > 0) {
            this.a.IA(this.b);
        }
        else {
            this.a.A(3);
            Thread.yield();
            synchronized (this.h) {
                System.gc();
                if (this.g) {
                    final short n = (short)(A.ca[0] & 0xFFFF);
                    final short n2 = (short)((A.ca[0] & 0xFFFF0000) >> 16);
                    if (!B.E(this.d, this.e, this.f)) {
                        System.gc();
                        B.A(0, n, n2);
                    }
                }
                else {
                    B.A(this.d, this.e, this.f);
                }
                if (A.nA > 0) {
                    if (HG.S(2) != 0) {
                        HG.L();
                        HG.M(2);
                    }
                }
                else if (HG.S(A.oA) != 0) {
                    HG.L();
                    HG.M(A.oA);
                }
            }
            final C c;
            c.a.A(6);
        }
        C.c = 100;
    }
    
    static {
        C.c = 0;
    }
}
