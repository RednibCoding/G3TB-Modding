package p000;

/* renamed from: b */
public final class C0002b implements Runnable {

    /* renamed from: a */
    public static int f170a = 0;

    /* renamed from: a */
    public C0003c f171a;

    /* renamed from: a */
    public Object f172a = new Object();

    /* renamed from: a */
    public boolean f173a = false;

    /* renamed from: b */
    public int f174b = -1;

    /* renamed from: c */
    public int f175c = -1;

    /* renamed from: d */
    public int f176d = -1;

    /* renamed from: e */
    public int f177e = -1;

    /* renamed from: a */
    public final void mo6a(C0003c cVar, int i) {
        this.f171a = cVar;
        this.f175c = i;
        this.f177e = -1;
        this.f174b = -1;
        this.f176d = -1;
        this.f173a = false;
        f170a = 0;
    }

    /* renamed from: a */
    public final void mo7a(C0003c cVar, int i, int i2, int i3, boolean z) {
        this.f171a = cVar;
        this.f177e = i;
        this.f174b = i2;
        this.f176d = i3;
        this.f175c = -1;
        this.f173a = z;
        f170a = 0;
    }

    public final void run() {
        if (this.f175c > 0) {
            this.f171a.mo13i(this.f175c);
        } else {
            this.f171a.mo11g(3);
            Thread.yield();
            synchronized (this.f172a) {
                System.gc();
                if (this.f173a) {
                    short s = (short) (C0003c.f414w[0] & 65535);
                    short s2 = (short) ((C0003c.f414w[0] & -65536) >> 16);
                    if (!C0001a.m97a(this.f177e, this.f174b, this.f176d)) {
                        System.gc();
                        C0001a.m151c(0, s, s2);
                    }
                } else {
                    C0001a.m151c(this.f177e, this.f174b, this.f176d);
                }
                if (C0003c.f326e > 0) {
                    if (C0000HG.m39b(2) != 0) {
                        C0000HG.m76k();
                        C0000HG.m81m(2);
                    }
                } else if (C0000HG.m39b(C0003c.f264ad) != 0) {
                    C0000HG.m76k();
                    C0000HG.m81m(C0003c.f264ad);
                }
            }
            this.f171a.mo11g(6);
        }
        f170a = 100;
    }
}
