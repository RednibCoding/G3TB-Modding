import java.io.IOException;
import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.5.36
// 

public class B
{
    public static int[][] a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    static int[][] g;
    public static int h;
    public static boolean i;
    public static int j;
    public static int k;
    private static int[][][] l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    public static int r;
    public static int s;
    public static int[] t;
    public static int[][] u;
    private static int[] v;
    private static int[] w;
    private static int[] x;
    public static int[] y;
    public static int[] z;
    public static int[] aa;
    private static int[] ba;
    public static int[] ca;
    public static int[] da;
    public static int[] ea;
    public static int[] fa;
    public static int[] ga;
    public static int[] ha;
    public static int[] ia;
    private static int[] ja;
    private static int[] ka;
    private static int[] la;
    private static int[] ma;
    private static int[] na;
    public static int[][] oa;
    public static byte[] pa;
    public static byte[][] qa;
    public static byte[] ra;
    public static byte[][] sa;
    public static byte[][] ta;
    public static int[][] ua;
    public static int[][][] va;
    public static int[][][] wa;
    public static int xa;
    public static int ya;
    public static int za;
    public static int aA;
    public static int bA;
    public static int cA;
    public static int dA;
    public static int eA;
    public static int fA;
    public static int gA;
    public static int hA;
    public static int iA;
    public static int jA;
    public static int kA;
    public static int lA;
    public static int[][] mA;
    public static int nA;
    public static int oA;
    public static int pA;
    public static int qA;
    public static int rA;
    public static int[] sA;
    public static int tA;
    public static int uA;
    public static int vA;
    public static int wA;
    public static int xA;
    public static int[] yA;
    public static int[] zA;
    public static int[] ab;
    public static int[][] bb;
    public static int cb;
    public static int[] db;
    public static final int[] eb;
    
    public static void A() {
        B.a = new int[1 + A.ea.length + A.pa.length + A.ga.length + A.ia.length + A.ka.length + A.ma.length + A.sa.length + A.ua.length + A.iA.length + A.jA.length + A.qD.length][];
        int n = 0;
        B.a[0] = A.ca;
        final int[] ca = A.ca;
        final int n2 = 2;
        ca[n2] &= 0xFFFF0000;
        final int[] ca2 = A.ca;
        final int n3 = 2;
        ca2[n3] |= 0x0;
        final int[] ca3 = A.ca;
        final int n4 = 2;
        ca3[n4] &= 0xFFFF;
        final int[] ca4 = A.ca;
        final int n5 = 2;
        ca4[n5] |= 0x0;
        A.ca[1] = -1;
        A.ca[3] = 0;
        final int[] ca5 = A.ca;
        final int n6 = 3;
        ca5[n6] |= 0x10;
        final int[] ca6 = A.ca;
        final int n7 = 3;
        ca6[n7] |= 0x4;
        final int[] ca7 = A.ca;
        final int n8 = 3;
        ca7[n8] |= 0x8;
        ++n;
        for (int i = 0; i < A.ea.length; ++i) {
            B.a[n] = A.ea[i];
            final int[] array = B.a[n];
            final int n9 = 2;
            array[n9] &= 0xFFFF0000;
            final int[] array2 = B.a[n];
            final int n10 = 2;
            array2[n10] |= ((short)n & 0xFFFF);
            final int[] array3 = B.a[n];
            final int n11 = 2;
            array3[n11] &= 0xFFFF;
            final int[] array4 = B.a[n];
            final int n12 = 2;
            array4[n12] |= ((short)i << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array5 = B.a[n];
            final int n13 = 3;
            array5[n13] |= 0x20;
            final int[] array6 = B.a[n];
            final int n14 = 3;
            array6[n14] |= 0x8;
            final int[] array7 = B.a[n];
            final int n15 = 3;
            array7[n15] |= 0x4;
            ++n;
        }
        for (int j = 0; j < A.pa.length; ++j) {
            B.a[n] = A.pa[j];
            final int[] array8 = B.a[n];
            final int n16 = 2;
            array8[n16] &= 0xFFFF0000;
            final int[] array9 = B.a[n];
            final int n17 = 2;
            array9[n17] |= ((short)n & 0xFFFF);
            final int[] array10 = B.a[n];
            final int n18 = 2;
            array10[n18] &= 0xFFFF;
            final int[] array11 = B.a[n];
            final int n19 = 2;
            array11[n19] |= ((short)j << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array12 = B.a[n];
            final int n20 = 3;
            array12[n20] |= 0x1000;
            ++n;
        }
        for (int k = 0; k < A.ga.length; ++k) {
            B.a[n] = A.ga[k];
            final int[] array13 = B.a[n];
            final int n21 = 2;
            array13[n21] &= 0xFFFF0000;
            final int[] array14 = B.a[n];
            final int n22 = 2;
            array14[n22] |= ((short)n & 0xFFFF);
            final int[] array15 = B.a[n];
            final int n23 = 2;
            array15[n23] &= 0xFFFF;
            final int[] array16 = B.a[n];
            final int n24 = 2;
            array16[n24] |= ((short)k << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array17 = B.a[n];
            final int n25 = 3;
            array17[n25] |= 0x40;
            ++n;
        }
        for (int l = 0; l < A.ia.length; ++l) {
            B.a[n] = A.ia[l];
            final int[] array18 = B.a[n];
            final int n26 = 2;
            array18[n26] &= 0xFFFF0000;
            final int[] array19 = B.a[n];
            final int n27 = 2;
            array19[n27] |= ((short)n & 0xFFFF);
            final int[] array20 = B.a[n];
            final int n28 = 2;
            array20[n28] &= 0xFFFF;
            final int[] array21 = B.a[n];
            final int n29 = 2;
            array21[n29] |= ((short)l << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array22 = B.a[n];
            final int n30 = 3;
            array22[n30] |= 0x80;
            ++n;
        }
        for (int n31 = 0; n31 < A.ka.length; ++n31) {
            B.a[n] = A.ka[n31];
            final int[] array23 = B.a[n];
            final int n32 = 2;
            array23[n32] &= 0xFFFF0000;
            final int[] array24 = B.a[n];
            final int n33 = 2;
            array24[n33] |= ((short)n & 0xFFFF);
            final int[] array25 = B.a[n];
            final int n34 = 2;
            array25[n34] &= 0xFFFF;
            final int[] array26 = B.a[n];
            final int n35 = 2;
            array26[n35] |= ((short)n31 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array27 = B.a[n];
            final int n36 = 3;
            array27[n36] |= 0x100;
            ++n;
        }
        for (int n37 = 0; n37 < A.ma.length; ++n37) {
            B.a[n] = A.ma[n37];
            final int[] array28 = B.a[n];
            final int n38 = 2;
            array28[n38] &= 0xFFFF0000;
            final int[] array29 = B.a[n];
            final int n39 = 2;
            array29[n39] |= ((short)n & 0xFFFF);
            final int[] array30 = B.a[n];
            final int n40 = 2;
            array30[n40] &= 0xFFFF;
            final int[] array31 = B.a[n];
            final int n41 = 2;
            array31[n41] |= ((short)n37 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array32 = B.a[n];
            final int n42 = 3;
            array32[n42] |= 0x200;
            ++n;
        }
        for (int n43 = 0; n43 < A.sa.length; ++n43) {
            B.a[n] = A.sa[n43];
            final int[] array33 = B.a[n];
            final int n44 = 2;
            array33[n44] &= 0xFFFF0000;
            final int[] array34 = B.a[n];
            final int n45 = 2;
            array34[n45] |= ((short)n & 0xFFFF);
            final int[] array35 = B.a[n];
            final int n46 = 2;
            array35[n46] &= 0xFFFF;
            final int[] array36 = B.a[n];
            final int n47 = 2;
            array36[n47] |= ((short)n43 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array37 = B.a[n];
            final int n48 = 3;
            array37[n48] |= 0x2000;
            ++n;
        }
        for (int n49 = 0; n49 < A.ua.length; ++n49) {
            B.a[n] = A.ua[n49];
            final int[] array38 = B.a[n];
            final int n50 = 2;
            array38[n50] &= 0xFFFF0000;
            final int[] array39 = B.a[n];
            final int n51 = 2;
            array39[n51] |= ((short)n & 0xFFFF);
            final int[] array40 = B.a[n];
            final int n52 = 2;
            array40[n52] &= 0xFFFF;
            final int[] array41 = B.a[n];
            final int n53 = 2;
            array41[n53] |= ((short)n49 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array42 = B.a[n];
            final int n54 = 3;
            array42[n54] |= 0x400;
            ++n;
        }
        for (int n55 = 0; n55 < A.iA.length; ++n55) {
            B.a[n] = A.iA[n55];
            final int[] array43 = B.a[n];
            final int n56 = 2;
            array43[n56] &= 0xFFFF0000;
            final int[] array44 = B.a[n];
            final int n57 = 2;
            array44[n57] |= ((short)n & 0xFFFF);
            final int[] array45 = B.a[n];
            final int n58 = 2;
            array45[n58] &= 0xFFFF;
            final int[] array46 = B.a[n];
            final int n59 = 2;
            array46[n59] |= ((short)n55 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array47 = B.a[n];
            final int n60 = 3;
            array47[n60] |= 0x800;
            final int[] array48 = B.a[n];
            final int n61 = 3;
            array48[n61] |= 0x8;
            final int[] array49 = B.a[n];
            final int n62 = 3;
            array49[n62] |= 0x10000;
            ++n;
        }
        for (int n63 = 0; n63 < A.jA.length; ++n63) {
            B.a[n] = A.jA[n63];
            final int[] array50 = B.a[n];
            final int n64 = 2;
            array50[n64] &= 0xFFFF0000;
            final int[] array51 = B.a[n];
            final int n65 = 2;
            array51[n65] |= ((short)n & 0xFFFF);
            final int[] array52 = B.a[n];
            final int n66 = 2;
            array52[n66] &= 0xFFFF;
            final int[] array53 = B.a[n];
            final int n67 = 2;
            array53[n67] |= ((short)n63 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array54 = B.a[n];
            final int n68 = 3;
            array54[n68] |= 0x40000;
            final int[] array55 = B.a[n];
            final int n69 = 3;
            array55[n69] |= 0x8;
            final int[] array56 = B.a[n];
            final int n70 = 3;
            array56[n70] |= 0x8000;
            final int[] array57 = B.a[n];
            final int n71 = 3;
            array57[n71] |= 0x10000;
            ++n;
        }
        for (int n72 = 0; n72 < A.qD.length; ++n72) {
            B.a[n] = A.qD[n72];
            final int[] array58 = B.a[n];
            final int n73 = 2;
            array58[n73] &= 0xFFFF0000;
            final int[] array59 = B.a[n];
            final int n74 = 2;
            array59[n74] |= ((short)n & 0xFFFF);
            final int[] array60 = B.a[n];
            final int n75 = 2;
            array60[n75] &= 0xFFFF;
            final int[] array61 = B.a[n];
            final int n76 = 2;
            array61[n76] |= ((short)n72 << 16 & 0xFFFF0000);
            B.a[n][1] = -1;
            final int[] array62 = B.a[n];
            final int n77 = 3;
            array62[n77] |= 0x4000;
            final int[] array63 = B.a[n];
            final int n78 = 3;
            array63[n78] |= 0x8;
            ++n;
        }
        for (int n79 = 0; n79 < n; ++n79) {
            if ((B.a[n79][3] & 0x10000) == 0x0) {
                final int b = B(B.a[n79]);
                A(B.a[n79], (short)(b & 0xFFFF), (short)((b & 0xFFFF0000) >> 16));
            }
        }
    }
    
    public static void B() {
        B.a = null;
    }
    
    public static void A(int n, final int n2, int n3, final int n4) {
        n3 = ((n3 & 0x7F) | (n4 & 0x7F) << 7);
        n = n2 * B.b * 2 * 3 + n * 3;
        final int[] wa = A.wa;
        final int n5 = n + 2;
        wa[n5] &= 0xFFFFC000;
        final int[] wa2 = A.wa;
        final int n6 = n + 2;
        wa2[n6] |= (n3 & 0x3FFF);
    }
    
    public static int A(int n, int n2) {
        n = A.wa[n2 * B.b * 2 * 3 + n * 3 + 2];
        n2 = (n & 0x7F);
        n = (n >> 7 & 0x7F);
        return ((short)n2 & 0xFFFF) | ((short)n << 16 & 0xFFFF0000);
    }
    
    public static void C() {
        A.K((short)(B.f & 0xFFFF), 0);
        A.K((short)((B.f & 0xFFFF0000) >> 16), 0);
        for (int i = 0; i < A.pa.length; ++i) {
            A.K(A.qa[A.pa[i][4]][1], 0);
            A.K(A.qa[A.pa[i][4]][1] - 8 + 185, 0);
        }
        B.l[0] = A.ha;
        B.l[1] = A.ja;
        B.l[2] = A.ta;
        B.l[3] = A.la;
        B.l[4] = A.va;
        B.l[5] = A.oa;
        for (int j = 0; j < 6; ++j) {
            for (int k = 0; k < B.l[j].length; ++k) {
                A.K((short)(B.l[j][k][1] & 0xFFFF), (short)((B.l[j][k][1] & 0xFFFF0000) >> 16));
            }
        }
    }
    
    public static void D() {
        A.SB();
        A.O();
        A.VA();
        A.PB();
        A.MB();
        G();
        B();
        A.NA();
        A.SA();
        A.W();
        A.K();
        A.AB();
        B.b = -1;
        B.c = -1;
        B.g = null;
        A.wa = null;
        A.xa = null;
        A.ea = null;
        A.ga = null;
        A.ia = null;
        A.ka = null;
        A.ma = null;
        A.pa = null;
        A.sa = null;
        A.ua = null;
        A.hA = null;
        B.s = 0;
        B.r = 0;
        A.cC = null;
        A.dC = null;
        A.ca[11] = -1;
        A.oA = 3;
        A.id = false;
        A.oC = false;
        for (int i = 0; i < A.eC.length; ++i) {
            A.eC[i][0] = 0;
        }
        B.j = 0;
        A.sD = false;
        A.q = false;
        System.gc();
    }
    
    public static void B(int n, final int n2) {
        C.c = 25;
        if (B.i) {
            A.wa = new int[B.c * 2 * (B.b * 2) * 3];
            for (int i = 0; i < A.wa.length; i += 3) {
                final int[] wa = A.wa;
                final int n3 = i;
                wa[n3] &= 0xFFFF0000;
                final int[] wa2 = A.wa;
                final int n4 = i;
                wa2[n4] |= 0xFFFF;
            }
        }
        A.L();
        A.J();
        A.UA();
        A.OB();
        A.LB();
        A.IB();
        F();
        A();
        C.c = 50;
        C.c = 50;
        A.J(n, n2);
        A.LA();
        C();
        A.A(true, 50, 75);
        C.c = 75;
        C.c = 75;
        A.HB();
        C.c = 77;
        A.RB();
        C.c = 79;
        A.N();
        C.c = 81;
        A.Y();
        C.c = 84;
        A.V();
        C.c = 86;
        A.BB();
        C.c = 88;
        A.IA();
        C.c = 90;
        U();
        C.c = 93;
        T();
        C.c = 95;
        A.A(0, 0, B.g[0].length * 2, B.g.length * 2, true);
        C.c = 97;
        C.c = 100;
        n = (short)((B.f & 0xFFFF0000) >> 16);
        switch (n) {
            case 3:
            case 5: {
                A.oA = 4;
                break;
            }
            case 4:
            case 6: {
                A.oA = 5;
                break;
            }
            case 7: {
                A.oA = 6;
                break;
            }
            default: {
                A.oA = 3;
                break;
            }
        }
        A.zD = -1;
        A.c = false;
        System.gc();
    }
    
    public static int[][] A(final int n, final DataInputStream dataInputStream) throws IOException {
        B.k = 0;
        if (n == 4 || n == 15) {
            B.k = 1;
        }
        if (n == 5 || n == 16) {
            B.k = 0;
        }
        if (n == 6 || n == 17) {
            B.k = 2;
        }
        if (n == 7 || n == 18) {
            B.k = 3;
        }
        if (n == 12 || n == 48) {
            B.k = 4;
        }
        if (n == 3 || n == 24) {
            B.k = 0;
        }
        B.m = 0;
        B.n = 0;
        B.q = 0;
        B.o = 0;
        B.p = 0;
        B.r = 0;
        B.s = 0;
        dataInputStream.readShort();
        final short short1 = dataInputStream.readShort();
        if (A.za == null) {
            A.za = new int[short1];
            A.aA = new int[short1];
            A.cA = new int[short1];
            A.bA = new int[short1];
            A.dA = new int[short1];
            A.eA = new int[short1];
            A.fA = new int[short1];
            A.gA = new int[short1];
        }
        for (short n2 = 0; n2 < short1; ++n2) {
            final short short2 = dataInputStream.readShort();
            if (n2 == n) {
                final int[][] a = A(dataInputStream, true);
                B(dataInputStream);
                return a;
            }
            dataInputStream.skip(short2);
        }
        return null;
    }
    
    public static void A(final int n, final int n2, final int n3) {
        if ((short)(A.ca[12] & 0xFFFF) <= 0) {
            return;
        }
        if (A.ca[11] != n) {
            if (n == 14) {
                A.ca[0] = 2031633;
            }
            A.FA(3);
        }
        H();
        D();
        C.c = 0;
        A.ca[11] = n;
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(HG.fb.getClass().getResourceAsStream("d"));
            A(dataInputStream);
            B.g = A(n, dataInputStream);
        }
        catch (Exception ex) {
            return;
        }
        finally {
            try {
                dataInputStream.close();
            }
            catch (Exception ex2) {}
        }
        System.gc();
        C.c = 25;
        A.ZA();
        B(n2, n3);
        A.A(2, 0, 0, 0, 0, true);
        A.A(18, n2, n3, 0, 0, false);
    }
    
    public static boolean A(final int n) {
        DataInputStream dataInputStream = null;
        boolean b = false;
        int n2 = 0;
        try {
            dataInputStream = new DataInputStream(HG.fb.getClass().getResourceAsStream("d"));
            A(dataInputStream);
            dataInputStream.readShort();
            for (short short1 = dataInputStream.readShort(), n3 = 0; n3 < short1; ++n3) {
                final short short2 = dataInputStream.readShort();
                if (n3 < 53) {
                    dataInputStream.skip(short2);
                }
                else {
                    B.va[n2] = A(dataInputStream, false);
                    B(dataInputStream);
                    B.wa[n2] = A.pa;
                    D();
                    ++n2;
                    C.c = 15 * n2 / n + 0;
                    if (n2 == n) {
                        b = true;
                        break;
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            try {
                dataInputStream.close();
            }
            catch (Exception ex2) {}
        }
        finally {
            try {
                dataInputStream.close();
            }
            catch (Exception ex3) {}
        }
        System.gc();
        return b;
    }
    
    public static void A(final DataInputStream dataInputStream) throws IOException {
        C(dataInputStream);
        D(dataInputStream);
        E(dataInputStream);
        F(dataInputStream);
        G(dataInputStream);
        H(dataInputStream);
        I(dataInputStream);
        J(dataInputStream);
        K(dataInputStream);
    }
    
    public static void B(final DataInputStream dataInputStream) throws IOException {
        L(dataInputStream);
        M(dataInputStream);
        N(dataInputStream);
        A(dataInputStream, 0);
        A(dataInputStream, 1);
        O(dataInputStream);
        A(dataInputStream, 2);
        P(dataInputStream);
        Q(dataInputStream);
        R(dataInputStream);
    }
    
    public static int[][] A(final DataInputStream dataInputStream, final int n, int[][] array, final boolean b) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        final byte byte1 = dataInputStream.readByte();
        if (A.ca[11] == 0) {
            B.d = 8;
            B.e = 8;
        }
        else {
            B.d = 16;
            B.e = 16;
        }
        if (b) {
            if (n == 0) {
                B.f &= 0xFFFF0000;
                B.f |= (byte1 & 0xFFFF);
            }
            else {
                B.f &= 0xFFFF;
                B.f |= (byte1 << 16 & 0xFFFF0000);
            }
        }
        switch (dataInputStream.readByte()) {
            case 0: {
                if (array == null) {
                    array = new int[short2][short1];
                }
                for (short n2 = 0; n2 < short2; ++n2) {
                    for (short n3 = 0; n3 < short1; ++n3) {
                        final int n4 = (dataInputStream.readByte() | dataInputStream.readByte() << 8) << 16 * n;
                        final int[] array2 = array[n2];
                        final short n5 = n3;
                        array2[n5] |= (n4 & 65535 << 16 * n);
                    }
                }
                break;
            }
            case 1: {
                if (array == null) {
                    array = new int[short2][short1];
                }
                int n6 = 0;
                short n7 = 0;
                while (n7 < short2) {
                    int byte2 = dataInputStream.readByte();
                    if (byte2 < 0) {
                        while (++byte2 <= 0) {
                            final int n8 = -1 << 16 * n;
                            final int[] array3 = array[n7];
                            final int n9 = n6;
                            array3[n9] |= (n8 & 65535 << 16 * n);
                            if (++n6 >= short1) {
                                n6 = 0;
                                ++n7;
                            }
                        }
                    }
                    else {
                        while (--byte2 >= 0) {
                            final int n10 = (dataInputStream.readByte() | dataInputStream.readByte() << 8) << 16 * n;
                            final int[] array4 = array[n7];
                            final int n11 = n6;
                            array4[n11] |= (n10 & 65535 << 16 * n);
                            if (++n6 >= short1) {
                                n6 = 0;
                                ++n7;
                            }
                        }
                    }
                }
                break;
            }
            default: {
                throw new IOException();
            }
        }
        return array;
    }
    
    public static void C(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.fa == null) {
            A.fa = new int[short2][30];
            for (short n = 0; n < short2; ++n) {
                A.fa[n][13] = 0;
                A.fa[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.fa[n][6] = dataInputStream.readShort();
                A.fa[n][12] = dataInputStream.readShort();
                A.fa[n][5] = dataInputStream.readByte();
                A.fa[n][7] = dataInputStream.readByte();
                A.fa[n][8] = dataInputStream.readByte();
                A.fa[n][10] = dataInputStream.readByte();
                A.fa[n][17] = dataInputStream.readByte();
                A.fa[n][18] = dataInputStream.readByte();
                A.fa[n][19] = dataInputStream.readByte();
                A.fa[n][20] = dataInputStream.readByte();
                A.fa[n][11] = dataInputStream.readByte();
                A.fa[n][14] = dataInputStream.readByte();
                A.fa[n][15] = dataInputStream.readByte();
                A.fa[n][16] = dataInputStream.readByte();
                A.fa[n][25] = dataInputStream.readByte();
                A.fa[n][27] = dataInputStream.readByte();
                A.fa[n][23] = dataInputStream.readByte();
                A.fa[n][24] = dataInputStream.readByte();
                A.fa[n][26] = dataInputStream.readByte();
                A.fa[n][21] = dataInputStream.readByte();
                A.fa[n][22] = dataInputStream.readByte();
                A.fa[n][28] = dataInputStream.readByte();
                A.fa[n][9] = 4096 / dataInputStream.readByte();
                A.fa[n][29] = dataInputStream.readByte() * 4096 / 10;
                final int[] array = A.fa[n];
                final int n2 = 13;
                array[n2] |= 1 << dataInputStream.readByte();
                final byte byte1 = dataInputStream.readByte();
                if ((byte1 & 0x1) != 0x0) {
                    final int[] array2 = A.fa[n];
                    final int n3 = 13;
                    array2[n3] |= 0x200;
                }
                if ((byte1 & 0x2) != 0x0) {
                    final int[] array3 = A.fa[n];
                    final int n4 = 13;
                    array3[n4] |= 0x400;
                }
                if ((byte1 & 0x4) != 0x0) {
                    final int[] array4 = A.fa[n];
                    final int n5 = 13;
                    array4[n5] |= 0x800;
                }
                if ((byte1 & 0x8) != 0x0) {
                    final int[] array5 = A.fa[n];
                    final int n6 = 13;
                    array5[n6] |= 0x80;
                }
                final int int1 = dataInputStream.readInt();
                A.fa[n][2] = (((short)(((byte)(int1 >> 24 & 0xFF) << 12) / B.d) & 0xFFFF) | ((short)(((byte)(int1 >> 8 & 0xFF) << 12) / B.d) << 16 & 0xFFFF0000));
                A.fa[n][3] = (((short)(((byte)(int1 >> 16 & 0xFF) << 12) / B.d) & 0xFFFF) | ((short)(((byte)(int1 & 0xFF) << 12) / B.d) << 16 & 0xFFFF0000));
                A.fa[n][1] = ((dataInputStream.readShort() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                A.fa[n][4] = -1;
                if (dataInputStream.readByte() == 1) {
                    final int[] array6 = A.fa[n];
                    final int n7 = 4;
                    array6[n7] &= 0xFFFFFF00;
                    final int[] array7 = A.fa[n];
                    final int n8 = 4;
                    array7[n8] |= (dataInputStream.readByte() & 0xFF);
                    final int[] array8 = A.fa[n];
                    final int n9 = 4;
                    array8[n9] &= 0xFFFF00FF;
                    final int[] array9 = A.fa[n];
                    final int n10 = 4;
                    array9[n10] |= (dataInputStream.readByte() << 8 & 0xFF00);
                    final int[] array10 = A.fa[n];
                    final int n11 = 4;
                    array10[n11] &= 0xFF00FFFF;
                    final int[] array11 = A.fa[n];
                    final int n12 = 4;
                    array11[n12] |= (dataInputStream.readByte() << 16 & 0xFF0000);
                }
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void D(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.la == null) {
            A.la = new int[short2][7];
            for (short n = 0; n < short2; ++n) {
                A.la[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.la[n][5] = dataInputStream.readByte();
                A.la[n][3] = dataInputStream.readByte();
                A.la[n][6] = dataInputStream.readByte();
                A.la[n][4] = dataInputStream.readShort();
                final int[] array = A.la[n];
                final int n2 = 1;
                array[n2] &= 0xFFFF0000;
                final int[] array2 = A.la[n];
                final int n3 = 1;
                array2[n3] |= (dataInputStream.readShort() & 0xFFFF);
                A.la[n][2] = dataInputStream.readByte();
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void E(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.oa == null) {
            A.oa = new int[short2][5];
            for (short n = 0; n < short2; ++n) {
                A.oa[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.oa[n][3] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.oa[n][4] = dataInputStream.readByte();
                final int[] array = A.oa[n];
                final int n2 = 1;
                array[n2] &= 0xFFFF0000;
                final int[] array2 = A.oa[n];
                final int n3 = 1;
                array2[n3] |= (dataInputStream.readShort() & 0xFFFF);
                A.oa[n][2] = dataInputStream.readByte();
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void F(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.ha == null) {
            A.ha = new int[short2][17];
            for (short n = 0; n < short2; ++n) {
                A.ha[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.ha[n][15] = dataInputStream.readByte();
                A.ha[n][11] = dataInputStream.readByte();
                A.ha[n][10] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                A.ha[n][13] = dataInputStream.readByte() * 4096 / 10;
                A.ha[n][12] = dataInputStream.readByte();
                A.ha[n][4] = dataInputStream.readShort();
                A.ha[n][14] = dataInputStream.readByte();
                for (int i = 0; i < 5; ++i) {
                    A.ha[n][5 + i] = -1;
                }
                final byte byte1 = dataInputStream.readByte();
                if (byte1 >= 1) {
                    final int[] array = A.ha[n];
                    final int n2 = 3;
                    array[n2] |= 0x1;
                    for (byte b = 0; b < byte1; ++b) {
                        A.ha[n][5 + b] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                    }
                }
                final int[] array2 = A.ha[n];
                final int n3 = 1;
                array2[n3] &= 0xFFFF0000;
                final int[] array3 = A.ha[n];
                final int n4 = 1;
                array3[n4] |= (dataInputStream.readShort() & 0xFFFF);
                A.ha[n][2] = dataInputStream.readByte();
                A.ha[n][16] = dataInputStream.readByte();
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void G(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.ja == null) {
            A.ja = new int[short2][14];
            for (short n = 0; n < short2; ++n) {
                A.ja[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.ja[n][10] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                A.ja[n][11] = dataInputStream.readByte();
                A.ja[n][12] = dataInputStream.readByte();
                A.ja[n][13] = dataInputStream.readByte();
                A.ja[n][4] = dataInputStream.readShort();
                for (int i = 0; i < 5; ++i) {
                    A.ja[n][5 + i] = -1;
                }
                final byte byte1 = dataInputStream.readByte();
                if (byte1 >= 1) {
                    final int[] array = A.ja[n];
                    final int n2 = 3;
                    array[n2] |= 0x1;
                    for (byte b = 0; b < byte1; ++b) {
                        A.ja[n][5 + b] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                    }
                }
                final int[] array2 = A.ja[n];
                final int n3 = 1;
                array2[n3] &= 0xFFFF0000;
                final int[] array3 = A.ja[n];
                final int n4 = 1;
                array3[n4] |= (dataInputStream.readShort() & 0xFFFF);
                A.ja[n][2] = dataInputStream.readByte();
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void H(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.qa == null) {
            A.qa = new int[short2][6];
            for (short n = 0; n < short2; ++n) {
                final int int1 = dataInputStream.readInt();
                A.qa[n][2] = (((short)(((byte)(int1 >> 24 & 0xFF) << 12) / B.d) & 0xFFFF) | ((short)(((byte)(int1 >> 8 & 0xFF) << 12) / B.d) << 16 & 0xFFFF0000));
                A.qa[n][3] = (((short)(((byte)(int1 >> 16 & 0xFF) << 12) / B.d) & 0xFFFF) | ((short)(((byte)(int1 & 0xFF) << 12) / B.d) << 16 & 0xFFFF0000));
                A.qa[n][4] = (dataInputStream.readByte() << 12) / B.d;
                final short short3 = dataInputStream.readShort();
                byte byte1 = dataInputStream.readByte();
                if ((byte1 & 0x80) == 0x80) {
                    A.qa[n][5] = 1;
                    byte1 &= 0x7F;
                }
                A.qa[n][1] = ((short3 & 0xFFFF) | (byte1 << 16 & 0xFFFF0000));
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void I(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.ta == null) {
            A.ta = new int[short2][12];
            for (short n = 0; n < short2; ++n) {
                A.ta[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.ta[n][10] = dataInputStream.readByte();
                A.ta[n][11] = dataInputStream.readByte();
                A.ta[n][4] = dataInputStream.readShort();
                for (int i = 0; i < 5; ++i) {
                    A.ta[n][5 + i] = -1;
                }
                final byte byte1 = dataInputStream.readByte();
                if (byte1 >= 1) {
                    final int[] array = A.ta[n];
                    final int n2 = 3;
                    array[n2] |= 0x1;
                    for (byte b = 0; b < byte1; ++b) {
                        A.ta[n][5 + b] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                    }
                }
                final int[] array2 = A.ta[n];
                final int n3 = 1;
                array2[n3] &= 0xFFFF0000;
                final int[] array3 = A.ta[n];
                final int n4 = 1;
                array3[n4] |= (dataInputStream.readShort() & 0xFFFF);
                A.ta[n][2] = dataInputStream.readByte();
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void J(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.va == null) {
            A.va = new int[short2][11];
            for (short n = 0; n < short2; ++n) {
                A.va[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.va[n][10] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.va[n][8] = dataInputStream.readByte();
                A.va[n][3] = dataInputStream.readByte();
                A.va[n][4] = dataInputStream.readByte();
                A.va[n][5] = dataInputStream.readByte();
                A.va[n][6] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                A.va[n][7] = dataInputStream.readByte();
                A.va[n][9] = dataInputStream.readByte();
                A.va[n][1] = ((dataInputStream.readShort() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                A.va[n][2] = dataInputStream.readByte();
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static void K(final DataInputStream dataInputStream) throws IOException {
        final short short1 = dataInputStream.readShort();
        final short short2 = dataInputStream.readShort();
        if (A.ra == null) {
            A.ra = new int[short2][5];
            for (short n = 0; n < short2; ++n) {
                A.ra[n][0] = (dataInputStream.readByte() << 16 | dataInputStream.readShort());
                A.ra[n][1] = dataInputStream.readByte();
                A.ra[n][3] = dataInputStream.readByte();
                A.ra[n][2] = dataInputStream.readByte();
                A.ra[n][4] = dataInputStream.readByte();
                if (A.ra[n][1] == 0) {
                    ++A.lA;
                }
                else if (A.ra[n][1] == 1) {
                    ++A.mA;
                }
            }
        }
        else {
            dataInputStream.skip(short1 - 2);
        }
    }
    
    public static int[][] A(final DataInputStream dataInputStream, final boolean b) throws IOException {
        B.b = dataInputStream.readShort();
        B.c = dataInputStream.readShort();
        final byte byte1 = dataInputStream.readByte();
        int[][] a = null;
        for (byte b2 = 0; b2 < byte1; ++b2) {
            a = A(dataInputStream, b2, a, b);
        }
        return a;
    }
    
    public static void L(final DataInputStream dataInputStream) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        A.ea = new int[byte1][32];
        A.xa = new int[byte1][];
        for (byte b = 0; b < byte1; ++b) {
            A.ea[b][11] = dataInputStream.readByte();
            final int n = A.fa[A.ea[b][11]][27];
            if (n < 6 || n > 8) {
                B.i = true;
            }
            final byte byte2 = dataInputStream.readByte();
            final byte byte3 = dataInputStream.readByte();
            A.ea[b][4] = byte2 * 4096 + 2048;
            A.ea[b][5] = byte3 * 4096 + 4095;
            A.ea[b][12] = (((short)A.fa[A.ea[b][11]][6] & 0xFFFF) | ((short)A.fa[A.ea[b][11]][6] << 16 & 0xFFFF0000));
            A.ea[b][14] = dataInputStream.readByte();
            A.ea[b][15] = dataInputStream.readByte();
            final byte byte4 = dataInputStream.readByte();
            if ((byte4 & 0x1) != 0x0) {
                final int[] array = A.ea[b];
                final int n2 = 13;
                array[n2] |= 0x400;
            }
            if ((byte4 & 0x2) != 0x0) {
                final int[] array2 = A.ea[b];
                final int n3 = 13;
                array2[n3] |= 0x800;
            }
            if ((byte4 & 0x4) != 0x0) {
                final int[] array3 = A.ea[b];
                final int n4 = 13;
                array3[n4] |= 0x1000;
            }
            if (A.ea[b][14] >= 0 || (A.fa[A.ea[b][11]][23] >= 0 && A.ea[b][14] != -2)) {
                ++B.m;
            }
            if (A.ea[b][15] >= 0 || (A.fa[A.ea[b][11]][24] >= 0 && A.ea[b][15] != -2)) {
                ++B.m;
            }
            if (A.fa[A.ea[b][11]][26] >= 0) {
                ++B.q;
            }
            int n5 = -1;
            if (A.ea[b][14] >= 0) {
                n5 = A.ha[A.ea[b][14]][15];
            }
            if (A.ea[b][15] >= 0 && n5 != 2 && n5 != 3) {
                n5 = A.ha[A.ea[b][15]][15];
            }
            if (A.fa[A.ea[b][11]][23] >= 0 && n5 != 2 && n5 != 3) {
                n5 = A.fa[A.ea[b][11]][23];
            }
            if (A.fa[A.ea[b][11]][24] >= 0 && n5 != 2 && n5 != 3) {
                n5 = A.fa[A.ea[b][11]][24];
            }
            if (n5 == 2 || n5 == 3) {
                ++B.n;
            }
            boolean b2 = false;
            for (int i = 0; i < 2; ++i) {
                final byte byte5 = dataInputStream.readByte();
                switch (byte5) {
                    case 2: {
                        A.ea[b][17 + i] = ((byte5 & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                        ++B.n;
                        break;
                    }
                    case 3: {
                        A.ea[b][17 + i] = ((byte5 & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                        ++B.o;
                        break;
                    }
                    case 5: {
                        A.ea[b][17 + i] = ((byte5 & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
                        b2 = true;
                        ++B.p;
                        break;
                    }
                    default: {
                        A.ea[b][17 + i] = -1;
                        break;
                    }
                }
                if (A.ea[b][17 + i] == -1 && A.fa[A.ea[b][11]][21 + i] != -1) {
                    ++B.n;
                }
            }
            A.ea[b][19] = A.V(b);
            A.ea[b][21] = -1;
            if (A.fa[A.ea[b][11]][27] == 7 || A.fa[A.ea[b][11]][27] == 8) {
                B.m += 25;
                B.n += 25;
                B.q += 25;
                B.o += 25;
                B.s += 4;
            }
            else {
                ++B.s;
            }
            if ((A.cA[A.ca[11]] & 1 << b) != 0x0) {
                if (b2) {
                    A.ea[b][14] = -1;
                    A.ea[b][15] = -1;
                    A.ea[b][19] = 0;
                    if ((short)(A.ea[b][17] & 0xFFFF) != 5) {
                        A.ea[b][17] = -1;
                    }
                    if ((short)(A.ea[b][18] & 0xFFFF) != 5) {
                        A.ea[b][18] = -1;
                    }
                    final int[] array4 = A.ea[b];
                    final int n6 = 12;
                    array4[n6] &= 0xFFFF0000;
                    final int[] array5 = A.ea[b];
                    final int n7 = 12;
                    array5[n7] |= 0xFFFF;
                    final int[] ca = A.cA;
                    final int n8 = A.ca[11];
                    ca[n8] &= ~(1 << b);
                }
                else {
                    final int[] array6 = A.ea[b];
                    final int n9 = 3;
                    array6[n9] |= 0x10000;
                    A.ea[b][0] = -1;
                }
            }
            final int[] array7 = A.ea[b];
            final int n10 = 27;
            array7[n10] &= 0xFFFF0000;
            final int[] array8 = A.ea[b];
            final int n11 = 27;
            array8[n11] |= (dataInputStream.readByte() & 0xFFFF);
        }
    }
    
    public static void M(final DataInputStream dataInputStream) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        A.B(A.ka = new int[byte1 + B.n + 15][7]);
        for (byte b = 0; b < byte1; ++b) {
            A.ka[b][4] = dataInputStream.readByte();
            A.ka[b][0] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            A.ka[b][5] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            A.ka[b][6] = dataInputStream.readByte();
            if (A.ca[11] >= 0 && (A.aA[A.ca[11]] & 1 << b) != 0x0) {
                final int[] array = A.ka[b];
                final int n = 3;
                array[n] |= 0x10000;
            }
        }
    }
    
    public static void N(final DataInputStream dataInputStream) throws IOException {
        final int n = B.j = dataInputStream.readByte();
        A.B(A.ma = new int[n + B.p][6]);
        for (int i = 0; i < n; ++i) {
            A.ma[i][4] = dataInputStream.readByte();
            A.ma[i][0] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            A.ma[i][5] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            if (A.ca[11] >= 0 && (A.bA[A.ca[11]] & 1 << i) != 0x0) {
                final int[] array = A.ma[i];
                final int n2 = 3;
                array[n2] |= 0x10000;
            }
        }
    }
    
    public static void A(final DataInputStream dataInputStream, int i) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        int[][] array = null;
        int[] array2 = null;
        final int[][] array3 = null;
        int n = 0;
        switch (i) {
            case 0: {
                A.ga = new int[byte1 + B.m + 15][9];
                array = A.ga;
                n = 6;
                array2 = A.dA;
                break;
            }
            case 1: {
                A.ia = new int[byte1 + B.q + 15][9];
                array = A.ia;
                n = 7;
                array2 = A.eA;
                break;
            }
            case 2: {
                A.sa = new int[byte1 + B.o + 15][8];
                array = A.sa;
                n = 13;
                array2 = A.fA;
                break;
            }
        }
        A.B(array);
        int[] array4;
        int n2;
        int[] array5;
        int n3;
        int[] array6;
        int n4;
        for (i = 0; i < byte1; ++i) {
            array[i][4] = dataInputStream.readByte();
            array[i][0] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            array[i][5] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            if (dataInputStream.readByte() == 1) {
                array4 = array[i];
                n2 = 3;
                array4[n2] |= 0x20000;
            }
            array5 = array[i];
            n3 = 3;
            array5[n3] |= 1 << n;
            A(array[i][4], (array[i][3] & 0x20000) != 0x0, array[i]);
            if (A.ca[11] >= 0 && (array2[A.ca[11]] & 1 << i) != 0x0) {
                array6 = array[i];
                n4 = 3;
                array6[n4] |= 0x10000;
            }
        }
    }
    
    public static void O(final DataInputStream dataInputStream) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        A.pa = new int[byte1][11];
        for (byte b = 0; b < byte1; ++b) {
            A.pa[b][4] = dataInputStream.readByte();
            final byte byte2 = dataInputStream.readByte();
            final byte byte3 = dataInputStream.readByte();
            final byte byte4 = dataInputStream.readByte();
            final byte byte5 = dataInputStream.readByte();
            A.pa[b][6] = dataInputStream.readByte();
            A.pa[b][7] = dataInputStream.readByte();
            final byte byte6 = dataInputStream.readByte();
            A.pa[b][8] = ((byte6 & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            if (byte6 > 0) {
                if (byte6 == 4 || byte6 == 5) {
                    final int n = A.pa[b][6];
                    final int[] array = A.pa[b];
                    final int n2 = 8;
                    array[n2] &= 0xFFFFFF;
                    final int[] array2 = A.pa[b];
                    final int n3 = 8;
                    array2[n3] |= ((byte)n << 24 & 0xFF000000);
                    A.pa[b][6] = 0;
                    ++B.s;
                    final int ca = A.CA(n);
                    final int[] array3 = A.pa[b];
                    final int n4 = 9;
                    array3[n4] &= 0xFFFF;
                    final int[] array4 = A.pa[b];
                    final int n5 = 9;
                    array4[n5] |= ((short)ca << 16 & 0xFFFF0000);
                    if (A.ca[11] >= 0 && (A.za[A.ca[11]] & 1 << B.r) != 0x0) {
                        final int n6 = A.cc[A.qa[A.pa[b][4]][1] * 11 + 5] - 1;
                        final int[] array5 = A.pa[b];
                        final int n7 = 10;
                        array5[n7] &= 0xFFFF0000;
                        final int[] array6 = A.pa[b];
                        final int n8 = 10;
                        array6[n8] |= ((short)n6 & 0xFFFF);
                        if (byte6 == 5) {
                            final int[] array7 = A.pa[b];
                            final int n9 = 3;
                            array7[n9] |= 0x8000;
                            A.bc = true;
                        }
                    }
                    final int[] array8 = A.pa[b];
                    final int n10 = 8;
                    array8[n10] &= 0xFFFF00FF;
                    final int[] array9 = A.pa[b];
                    final int n11 = 8;
                    array9[n11] |= ((byte)B.r << 8 & 0xFF00);
                    B.r += 2;
                }
                else if (byte6 == 8) {
                    ++B.s;
                }
            }
            else {
                final short n12 = A.cc[A.qa[A.pa[b][4]][1] * 11 + 5];
                if (n12 > 1) {
                    final int[] array10 = A.pa[b];
                    final int n13 = 10;
                    array10[n13] &= 0xFFFF0000;
                    final int[] array11 = A.pa[b];
                    final int n14 = 10;
                    array11[n14] |= ((short)HG.A((int)n12) & 0xFFFF);
                    A.E(A.pa[b], true);
                }
            }
            final int[] array12 = A.pa[b];
            final int n15 = 10;
            array12[n15] &= 0xFFFFFF;
            final int[] array13 = A.pa[b];
            final int n16 = 10;
            array13[n16] |= 0x1000000;
            final int n17 = (byte2 << 12) + (byte4 << 12) / B.d + 2048;
            final int n18 = (byte3 << 12) - (byte5 << 12) / B.d + 4096 + A.pa[b][6] * 4096 - 1;
            A.pa[b][0] = (((short)(n17 >> 12) & 0xFFFF) | ((short)(n18 >> 12) << 16 & 0xFFFF0000));
            A.pa[b][5] = (((short)(n17 % 4096) & 0xFFFF) | ((short)(n18 % 4096) << 16 & 0xFFFF0000));
            if (A.qa[A.pa[b][4]][2] == A.qa[A.pa[b][4]][3]) {
                final int[] array14 = A.pa[b];
                final int n19 = 3;
                array14[n19] |= 0x8000;
            }
        }
    }
    
    public static void P(final DataInputStream dataInputStream) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        A.B(A.ua = new int[byte1][6]);
        for (byte b = 0; b < byte1; ++b) {
            A.ua[b][4] = dataInputStream.readByte();
            A.ua[b][0] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            A.ua[b][5] = ((dataInputStream.readByte() & 0xFFFF) | (dataInputStream.readByte() << 16 & 0xFFFF0000));
            if (A.ca[11] >= 0 && (A.gA[A.ca[11]] & 1 << b) != 0x0) {
                final int[] array = A.ua[b];
                final int n = 3;
                array[n] |= 0x10000;
            }
        }
    }
    
    public static void Q(final DataInputStream dataInputStream) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        A.dC = new int[byte1][7];
        for (byte b = 0; b < byte1; ++b) {
            A.dC[b][0] = dataInputStream.readByte();
            A.dC[b][1] = 1;
            switch (A.dC[b][0]) {
                case 8:
                case 13:
                case 18: {
                    A.dC[b][2] = dataInputStream.readByte();
                    A.dC[b][3] = dataInputStream.readByte();
                    A.dC[b][4] = dataInputStream.readByte();
                    A.dC[b][5] = dataInputStream.readByte();
                    break;
                }
                case 3:
                case 11: {
                    A.dC[b][2] = dataInputStream.readByte();
                    A.dC[b][3] = dataInputStream.readShort();
                    break;
                }
                case 12: {
                    A.dC[b][2] = dataInputStream.readByte();
                    A.dC[b][3] = dataInputStream.readShort();
                    A.dC[b][4] = dataInputStream.readByte();
                    break;
                }
                case 4:
                case 9: {
                    A.dC[b][2] = dataInputStream.readShort();
                    break;
                }
                case 14: {
                    A.dC[b][2] = dataInputStream.readShort();
                    A.dC[b][3] = dataInputStream.readByte();
                    A.dC[b][4] = dataInputStream.readByte();
                    break;
                }
            }
            A.dC[b][6] = dataInputStream.readByte();
        }
    }
    
    public static void R(final DataInputStream dataInputStream) throws IOException {
        final byte byte1 = dataInputStream.readByte();
        A.cC = new byte[byte1][];
        for (byte b = 0; b < byte1; ++b) {
            final short short1 = dataInputStream.readShort();
            dataInputStream.read(A.cC[b] = new byte[short1], 0, short1);
        }
    }
    
    static int E() {
        int cb;
        if (A.ca[11] == -1) {
            cb = B.cb;
        }
        else {
            cb = A.za[A.ca[11]];
        }
        return cb;
    }
    
    static void B(final int cb) {
        if (A.ca[11] == -1) {
            B.cb = cb;
        }
        else {
            A.za[A.ca[11]] = cb;
        }
    }
    
    public static void F() {
        B.u = new int[B.c][B.b];
        for (int i = 0; i < B.u.length; ++i) {
            for (int j = 0; j < B.u[i].length; ++j) {
                B.u[i][j] = -1;
            }
        }
    }
    
    public static void G() {
        B.u = null;
    }
    
    public static void A(final int[] array, final int[] array2) {
        if ((array[3] & 0x800) != 0x0) {
            array2[0] = array[4] + array[6] >> 1;
            array2[1] = array[5] + array[7] >> 1;
            return;
        }
        if ((array[3] & 0x8) != 0x0) {
            array2[0] = array[4];
            array2[1] = array[5];
            return;
        }
        array2[0] = (short)(array[0] & 0xFFFF) << 12;
        array2[1] = (short)((array[0] & 0xFFFF0000) >> 16) << 12;
        if ((array[3] & 0x1000) != 0x0) {
            final int n = 0;
            array2[n] += (short)(array[5] & 0xFFFF);
            final int n2 = 1;
            array2[n2] += (short)((array[5] & 0xFFFF0000) >> 16);
        }
        else {
            final int n3 = 0;
            array2[n3] += 2048;
            final int n4 = 1;
            array2[n4] += 2048;
        }
    }
    
    public static void B(final int[] array, final int[] array2) {
        A(array, array2);
        array2[2] = 0;
        if ((array[3] & 0x1000) != 0x0) {
            array2[2] = array[6] * 4096;
        }
    }
    
    public static int A(int[] a) {
        if ((a[3] & 0x1000) != 0x0) {
            A(a, B.v);
            final int n = B.v[1];
            a = A.A(a);
            return n + a[4];
        }
        C(a, B.w);
        return B.w[3];
    }
    
    public static int B(final int[] array) {
        if ((array[3] & 0x8) == 0x0) {
            return array[0];
        }
        A(array, B.x);
        if (B.x[0] < 0) {
            final int[] x = B.x;
            final int n = 0;
            x[n] -= 4096;
        }
        if (B.x[1] < 0) {
            final int[] x2 = B.x;
            final int n2 = 1;
            x2[n2] -= 4096;
        }
        return ((short)(B.x[0] >> 12) & 0xFFFF) | ((short)(B.x[1] >> 12) << 16 & 0xFFFF0000);
    }
    
    public static void C(int[] array, final int[] array2) {
        A(array, B.y);
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if ((array[3] & 0x10) != 0x0) {
            n = -1024;
            n2 = 1024;
            n3 = -2048;
            n4 = 256;
        }
        if ((array[3] & 0x20) != 0x0) {
            final int[] array3 = A.fa[array[11]];
            n = (short)(array3[2] & 0xFFFF);
            n3 = (short)((array3[2] & 0xFFFF0000) >> 16);
            n2 = (short)(array3[3] & 0xFFFF);
            n4 = (short)((array3[3] & 0xFFFF0000) >> 16);
        }
        if ((array[3] & 0x1000) != 0x0) {
            array = A.qa[array[4]];
            n = (short)(array[2] & 0xFFFF);
            n3 = (short)((array[2] & 0xFFFF0000) >> 16);
            n2 = (short)(array[3] & 0xFFFF);
            n4 = (short)((array[3] & 0xFFFF0000) >> 16);
        }
        array2[0] = B.y[0] + n;
        array2[1] = B.y[1] + n3;
        array2[2] = B.y[0] + n2;
        array2[3] = B.y[1] + n4;
    }
    
    public static void D(final int[] array, final int[] array2) {
        C(array, B.z);
        array2[0] = B.z[2] + B.z[0] >> 1;
        array2[1] = B.z[3] + B.z[1] >> 1;
    }
    
    public static boolean E(final int[] array, final int[] array2) {
        return array[0] <= array2[2] && array[1] <= array2[3] && array[2] >= array2[0] && array[3] >= array2[1];
    }
    
    public static boolean A(int n, final int n2, int n3, int n4, final int[] array, final int[] array2) {
        int n5 = 0;
        int n6 = 0;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        final int n7 = n3 - n;
        if (n7 < 0 && array[2] <= n && array[2] >= n3) {
            n5 = array[2] - n;
            b = true;
        }
        if (n7 > 0 && array[0] >= n && array[0] <= n3) {
            n5 = array[0] - n;
            b = true;
        }
        if (b) {
            final int n8 = n2 + (int)((n4 - n2) * (long)n5 / (n3 - n));
            if (n8 >= array[1] && n8 <= array[3]) {
                n3 = n + n5;
                n4 = n8;
                b3 = true;
            }
        }
        final int n9 = n4 - n2;
        if (n9 < 0 && array[3] <= n2 && array[3] >= n4) {
            n6 = array[3] - n2;
            b2 = true;
        }
        if (n9 > 0 && array[1] >= n2 && array[1] <= n4) {
            n6 = array[1] - n2;
            b2 = true;
        }
        if (b2) {
            n += (int)((n3 - n) * (long)n6 / (n4 - n2));
            if (n >= array[0] && n <= array[2]) {
                n3 = n;
                n4 = n2 + n6;
                b3 = true;
            }
        }
        array2[0] = n3;
        array2[1] = n4;
        return b3;
    }
    
    public static void C(final int[] array) {
        final int n = array[0];
        final short n2 = (short)(n & 0xFFFF);
        final short n3 = (short)((n & 0xFFFF0000) >> 16);
        final int n4 = 3;
        array[n4] |= 0x2;
        final int n5 = 1;
        array[n5] &= 0xFFFF0000;
        final int n6 = 1;
        array[n6] |= ((short)B.u[n3][n2] & 0xFFFF);
        B.u[n3][n2] = (short)(array[2] & 0xFFFF);
        A.A(array, false);
    }
    
    public static void D(final int[] array) {
        final int n = array[0];
        final short n2 = (short)(n & 0xFFFF);
        final short n3 = (short)((n & 0xFFFF0000) >> 16);
        final int n4 = 3;
        array[n4] &= 0xFFFFFFFD;
        int n5 = B.u[n3][n2];
        int n6 = -1;
        while (n5 != -1 && B.a[n5] != array) {
            n6 = n5;
            n5 = (short)(B.a[n5][1] & 0xFFFF);
        }
        final short n7 = (short)(array[1] & 0xFFFF);
        if (n6 != -1) {
            final int[] array2 = B.a[n6];
            final int n8 = 1;
            array2[n8] &= 0xFFFF0000;
            final int[] array3 = B.a[n6];
            final int n9 = 1;
            array3[n9] |= (n7 & 0xFFFF);
        }
        else {
            B.u[n3][n2] = n7;
        }
        final int n10 = 1;
        array[n10] &= 0xFFFF0000;
        final int n11 = 1;
        array[n11] |= 0xFFFF;
        A.A(array, true);
    }
    
    public static int A(final int[] array, final int n) {
        if (n == 0) {
            return -1;
        }
        int n2 = -1;
        int n3 = (array[0] >> 12) - 6;
        int n4 = (array[1] >> 12) - 6;
        int b = (array[2] >> 12) + 6;
        int c = (array[3] >> 12) + 6;
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 < 0) {
            n4 = 0;
        }
        if (b > B.b) {
            b = B.b;
        }
        if (c > B.c) {
            c = B.c;
        }
        for (int i = n4; i < c; ++i) {
            for (int j = n3; j < b; ++j) {
                for (int k = B.u[i][j]; k != -1; k = (short)(B.a[k][1] & 0xFFFF)) {
                    C(B.a[k], B.aa);
                    if ((n & B.a[k][3]) != 0x0) {
                        if (!(!E(array, B.aa))) {
                            final int[] array2 = B.a[k];
                            final int n5 = 1;
                            array2[n5] &= 0xFFFF;
                            final int[] array3 = B.a[k];
                            final int n6 = 1;
                            array3[n6] |= ((short)n2 << 16 & 0xFFFF0000);
                            n2 = k;
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public static int A(final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        return A(n, n2, n3, n4, n5, array, false);
    }
    
    public static int A(final int n, final int n2, int n3, int n4, int i, final int[] array, final boolean b) {
        boolean b2 = false;
        boolean b3 = false;
        int n5 = -2;
        if (n4 - n2 > 0) {
            for (int j = n2 + (4096 - n2 % 4096); j < n4; j += 4096) {
                final int n6 = n + (int)((n3 - n) * (long)(j - n2) / (n4 - n2));
                if (!A.C(n6 >> 12, j >> 12)) {
                    n3 = n6;
                    n4 = j;
                    b2 = true;
                    break;
                }
            }
        }
        if (n4 - n2 < 0) {
            for (int k = n2 - n2 % 4096 - 1; k > n4; k -= 4096) {
                final int n7 = n + (int)((n3 - n) * (long)(k - n2) / (n4 - n2));
                if (!A.C(n7 >> 12, k >> 12)) {
                    n3 = n7;
                    n4 = k;
                    b2 = true;
                    break;
                }
            }
        }
        if (n3 - n > 0) {
            for (int l = n + (4096 - n % 4096); l < n3; l += 4096) {
                final int n8 = n2 + (int)((n4 - n2) * (long)(l - n) / (n3 - n));
                if (!A.C(l >> 12, n8 >> 12)) {
                    n3 = l;
                    n4 = n8;
                    b2 = true;
                    break;
                }
            }
        }
        if (n3 - n < 0) {
            for (int n9 = n - n % 4096 - 1; n9 > n3; n9 -= 4096) {
                final int n10 = n2 + (int)((n4 - n2) * (long)(n9 - n) / (n3 - n));
                if (!A.C(n9 >> 12, n10 >> 12)) {
                    n3 = n9;
                    n4 = n10;
                    b2 = true;
                    break;
                }
            }
        }
        if (n < n3) {
            B.ba[0] = n;
            B.ba[2] = n3;
        }
        else {
            B.ba[0] = n3;
            B.ba[2] = n;
        }
        if (n2 < n4) {
            B.ba[1] = n2;
            B.ba[3] = n4;
        }
        else {
            B.ba[1] = n4;
            B.ba[3] = n2;
        }
        i = A(B.ba, i);
        array[0] = n3;
        array[1] = n4;
        while (i != -1) {
            if ((B.a[i][3] & 0x8000) != 0x0) {
                i = (short)((B.a[i][1] & 0xFFFF0000) >> 16);
            }
            else if (b && (B.a[i][3] & 0x1000) != 0x0 && A.qa[B.a[i][4]][5] != 0) {
                i = (short)((B.a[i][1] & 0xFFFF0000) >> 16);
            }
            else {
                C(B.a[i], B.ba);
                if (A(n, n2, array[0], array[1], B.ba, array)) {
                    b3 = true;
                    n5 = i;
                }
                i = (short)((B.a[i][1] & 0xFFFF0000) >> 16);
            }
        }
        if (!b2 && !b3) {
            return -2;
        }
        if (b2) {
            return -1;
        }
        return n5;
    }
    
    public static void A(final int[] array, final int n, final int n2) {
        if ((array[3] & 0x2) != 0x0) {
            D(array);
        }
        array[0] = (((short)n & 0xFFFF) | ((short)n2 << 16 & 0xFFFF0000));
        if (n >= 0 && n < B.b && n2 >= 0 && n2 < B.c) {
            C(array);
        }
    }
    
    public static int A(final int[] array, int a, final int n, final int n2, final int n3) {
        int n4 = -2;
        final int n5 = array[n];
        C(array, B.ea);
        B.ca[0] = B.fa[0] + B.fa[2] >> 1;
        B.ca[1] = B.fa[1] + B.fa[3] >> 1;
        array[n] = a;
        C(array, B.fa);
        if (B.fa[0] < 0 || B.fa[1] < 0 || B.fa[2] >= B.b * 4096 || B.fa[3] >= B.c * 4096) {
            array[n] = n5;
            return -1;
        }
        final int n6 = B.fa[0] >> 12;
        final int n7 = B.fa[1] >> 12;
        final int n8 = B.fa[2] >> 12;
        final int n9 = B.fa[3] >> 12;
        for (int i = n6; i <= n8; ++i) {
            for (int j = n7; j <= n9; ++j) {
                if (!A.C(i, j)) {
                    array[n] = n5;
                    return -1;
                }
            }
        }
        for (int k = A(B.ea, n2); k != -1; k = (short)((B.a[k][1] & 0xFFFF0000) >> 16)) {
            D(B.a[k], B.da);
            if ((n5 < a && B.da[n3] <= B.ca[n3]) || (n5 > a && B.da[n3] >= B.ca[n3])) {
                final int[] array2 = B.a[k];
                final int n10 = 3;
                array2[n10] |= 0x200000;
            }
        }
        for (a = A(B.fa, n2); a != -1 && ((B.a[a][3] & 0x8000) != 0x0 || (B.a[a][3] & 0x200000) != 0x0); a = (short)((B.a[a][1] & 0xFFFF0000) >> 16)) {}
        if (a != -1) {
            n4 = a;
            array[n] = n5;
        }
        for (int l = A(B.ea, n2); l != -1; l = (short)((B.a[l][1] & 0xFFFF0000) >> 16)) {
            final int[] array3 = B.a[l];
            final int n11 = 3;
            array3[n11] &= 0xFFDFFFFF;
        }
        return n4;
    }
    
    public static int A(final int[] array, final boolean b, final boolean b2) {
        int n = 0;
        final int n2 = array[0] + array[2] >> 1;
        final int n3 = array[1] + array[3] >> 1;
        int n4 = array[0] >> 12;
        int n5 = array[1] >> 12;
        int n6 = array[2] >> 12;
        int n7 = array[3] >> 12;
        if (n4 < 0) {
            n4 = 0;
        }
        if (n5 < 0) {
            n5 = 0;
        }
        if (n6 >= B.b) {
            n6 = B.b - 1;
        }
        if (n7 >= B.c) {
            n7 = B.c - 1;
        }
        if (b) {
            int n8;
            if (b2) {
                n8 = n6;
            }
            else {
                n8 = n4;
            }
            for (int i = n5; i <= n7; ++i) {
                if (!A.C(n8, i)) {
                    if (n3 < i * 4096 + 2048) {
                        if (A.C(n8, i - 1)) {
                            n |= 0x1;
                        }
                    }
                    else if (A.C(n8, i + 1)) {
                        n |= 0x2;
                    }
                }
            }
        }
        else {
            int n9;
            if (b2) {
                n9 = n7;
            }
            else {
                n9 = n5;
            }
            for (int j = n4; j <= n6; ++j) {
                if (!A.C(j, n9)) {
                    if (n2 < j * 4096 + 2048) {
                        if (A.C(j - 1, n9)) {
                            n |= 0x1;
                        }
                    }
                    else if (A.C(j + 1, n9)) {
                        n |= 0x2;
                    }
                }
            }
        }
        return n;
    }
    
    public static int A(final int[] array, int n, int n2, final int n3) {
        if ((array[3] & 0x8) == 0x0) {
            return -2;
        }
        final int n4 = array[4];
        final int n5 = array[5];
        if (n4 == n && n5 == n2) {
            return -2;
        }
        boolean b = false;
        int n6 = -1;
        D(array);
        int n7 = 0;
        boolean b2 = false;
        if (n4 != n && n5 != n2) {
            n7 = 1;
            b2 = true;
        }
        else {
            boolean b3 = true;
            boolean b4 = true;
            boolean b5 = false;
            C(array, B.ga);
            for (int i = A(B.ga, n3); i != -1; i = (short)((B.a[i][1] & 0xFFFF0000) >> 16)) {
                final int[] array2 = B.a[i];
                final int n8 = 3;
                array2[n8] |= 0x200000;
            }
            B.ha[0] = B.ga[0] + B.ga[2] >> 1;
            B.ha[1] = B.ga[1] + B.ga[3] >> 1;
            int n10;
            if (n != n4) {
                if (n < n4) {
                    final int[] ga = B.ga;
                    final int n9 = 0;
                    ga[n9] += n - n4;
                    n10 = A(B.ga, true, false);
                }
                else {
                    final int[] ga2 = B.ga;
                    final int n11 = 2;
                    ga2[n11] += n - n4;
                    n10 = A(B.ga, true, true);
                }
                n7 = 1;
            }
            else {
                if (n2 < n5) {
                    final int[] ga3 = B.ga;
                    final int n12 = 1;
                    ga3[n12] += n2 - n5;
                    n10 = A(B.ga, false, false);
                }
                else {
                    final int[] ga4 = B.ga;
                    final int n13 = 3;
                    ga4[n13] += n2 - n5;
                    n10 = A(B.ga, false, true);
                }
                b2 = true;
            }
            switch (n10) {
                case 0: {
                    break;
                }
                case 1: {
                    b5 = true;
                    b3 = false;
                    break;
                }
                case 2: {
                    b5 = true;
                    b4 = false;
                    break;
                }
                default: {
                    b5 = true;
                    b3 = false;
                    b4 = false;
                    break;
                }
            }
            int j = A(B.ga, n3);
            if (j != -1) {
                while (j != -1) {
                    if ((B.a[j][3] & 0x200000) != 0x0) {
                        final int[] array3 = B.a[j];
                        final int n14 = 3;
                        array3[n14] &= 0xFFDFFFFF;
                        j = (short)((B.a[j][1] & 0xFFFF0000) >> 16);
                    }
                    else if ((B.a[j][3] & 0x8000) != 0x0) {
                        j = (short)((B.a[j][1] & 0xFFFF0000) >> 16);
                    }
                    else if ((B.a[j][3] & 0x1000) != 0x0 && (short)(B.a[j][8] & 0xFFFF) > 0) {
                        j = (short)((B.a[j][1] & 0xFFFF0000) >> 16);
                    }
                    else {
                        b5 = true;
                        D(B.a[j], B.ia);
                        if (n7 != 0) {
                            if (B.ia[1] > B.ha[1]) {
                                b3 = false;
                            }
                            else {
                                b4 = false;
                            }
                        }
                        else if (B.ia[0] > B.ha[0]) {
                            b3 = false;
                        }
                        else {
                            b4 = false;
                        }
                        j = (short)((B.a[j][1] & 0xFFFF0000) >> 16);
                    }
                }
            }
            if (b5) {
                if (b3) {
                    if (n7 != 0) {
                        n7 = 0;
                        b2 = true;
                        n2 += Math.abs(n - n4);
                        n = n4;
                    }
                    else {
                        n7 = 1;
                        b2 = false;
                        n += Math.abs(n2 - n5);
                        n2 = n5;
                    }
                }
                if (b4) {
                    if (n7 != 0) {
                        n7 = 0;
                        b2 = true;
                        n2 -= Math.abs(n - n4);
                        n = n4;
                    }
                    else {
                        n7 = 1;
                        b2 = false;
                        n -= Math.abs(n2 - n5);
                        n2 = n5;
                    }
                }
            }
        }
        if (n < 0 || n2 < 0 || n >= B.b * 4096 || n2 >= B.c * 4096) {
            C(array);
            return -1;
        }
        if (n7 != 0) {
            n = A(array, n, 4, n3, 0);
            if (n == -1) {
                b = true;
            }
            else if (n >= 0) {
                n6 = n;
            }
        }
        if (b2) {
            n = A(array, n2, 5, n3, 1);
            if (n == -1) {
                b = true;
            }
            else if (n >= 0) {
                n6 = n;
            }
        }
        array[0] = (((short)(array[4] >> 12) & 0xFFFF) | ((short)(array[5] >> 12) << 16 & 0xFFFF0000));
        C(array);
        if (n6 != -1) {
            return n6;
        }
        if (b) {
            return -1;
        }
        return -2;
    }
    
    public static boolean A(final int[] array, final int[] array2, final int n) {
        C(array, B.ja);
        C(array2, B.ka);
        final int[] ja = B.ja;
        final int n2 = 0;
        ja[n2] -= n;
        final int[] ja2 = B.ja;
        final int n3 = 1;
        ja2[n3] -= n;
        final int[] ja3 = B.ja;
        final int n4 = 2;
        ja3[n4] += n;
        final int[] ja4 = B.ja;
        final int n5 = 3;
        ja4[n5] += n;
        return E(B.ja, B.ka);
    }
    
    public static boolean F(final int[] array, final int[] array2) {
        A(array, B.la);
        A(array2, B.ma);
        final int a = A(B.la[0], B.la[1], B.ma[0], B.ma[1], 4144, B.na, true);
        final short n = (short)(array2[2] & 0xFFFF);
        return a == -2 || a == n;
    }
    
    public static boolean C(final int n, final int n2) {
        System.gc();
        int n3 = 0;
        for (int i = 0; i < B.oa.length; ++i) {
            for (int j = 0; j < B.oa[i].length; ++j) {
                n3 += B.oa[i][j];
            }
        }
        if (B.va == null || B.wa == null) {
            B.va = new int[n3][][];
            B.wa = new int[n3][][];
            if (!A(n3)) {
                B.va = null;
                B.wa = null;
                return false;
            }
        }
        int n4 = 0;
        for (int k = 0; k < B.oa.length; ++k) {
            for (int l = 0; l < B.oa[k][0]; ++l) {}
            for (int n5 = 0; n5 < B.oa[k].length; ++n5) {
                if (B.oa[k][n5] != 0) {
                    if (B.va[n4] == null) {
                        return false;
                    }
                    final int length = B.va[n4][0].length;
                    final int length2 = B.va[n4].length;
                    for (int n6 = 0; n6 < B.oa[k][n5]; ++n6) {
                        final int n7 = n4 + n6;
                        if (B.va[n7] == null) {
                            return false;
                        }
                        final int length3 = B.va[n7][0].length;
                        final int length4 = B.va[n7].length;
                        if (length3 != length || length4 != length2) {
                            return false;
                        }
                    }
                    n4 += B.oa[k][n5];
                }
            }
        }
        for (int n8 = 0; n8 < B.wa.length; ++n8) {
            int n9 = 0;
            while (n9 < B.wa[n8].length) {
                switch ((byte)(B.wa[n8][n9][8] & 0xFF)) {
                    default: {
                        ++n9;
                        continue;
                    }
                }
            }
        }
        B.sa = new byte[n2][n];
        B.ta = new byte[n2][n];
        B.ua = new int[n2][n];
        B.sA = new int[n * n2];
        B.za = n >> 1;
        B.aA = n2 >> 1;
        B.bA = n >> 1;
        B.cA = 0;
        B.dA = n - 1;
        B.eA = n2 >> 1;
        B.fA = n >> 1;
        B.gA = n2 - 1;
        B.hA = 0;
        B.iA = n2 >> 1;
        B.lA = 0;
        B.nA = 0;
        B.oA = 0;
        B.pA = 0;
        B.qA = 0;
        B.mA = new int[64][11];
        return true;
    }
    
    public static void H() {
        B.sa = null;
        B.ta = null;
        B.ua = null;
        B.sA = null;
        B.yA = null;
        B.zA = null;
        B.ab = null;
        B.bb = null;
        System.gc();
    }
    
    public static int D(final int n, final int n2) {
        return B(n, n2, F(n, n2));
    }
    
    public static int B(final int n, final int n2, final int n3) {
        int n4 = 0;
        if (n == 0) {
            n4 = 1;
        }
        else if (F(n - 1, n2) == n3 || (F(n - 1, n2) & 0xFFFFFFFE) == n3) {
            n4 = 1;
        }
        if (n2 == 0) {
            n4 |= 0x2;
        }
        else if (F(n, n2 - 1) == n3 || (F(n, n2 - 1) & 0xFFFFFFFE) == n3) {
            n4 |= 0x2;
        }
        if (n == B.sa[0].length - 1) {
            n4 |= 0x4;
        }
        else if (F(n + 1, n2) == n3 || (F(n + 1, n2) & 0xFFFFFFFE) == n3) {
            n4 |= 0x4;
        }
        if (n2 == B.sa.length - 1) {
            n4 |= 0x8;
        }
        else if (F(n, n2 + 1) == n3 || (F(n, n2 + 1) & 0xFFFFFFFE) == n3) {
            n4 |= 0x8;
        }
        return n4;
    }
    
    public static int E(final int n, final int n2) {
        return C(n, n2, F(n, n2));
    }
    
    public static int C(int n, final int n2, final int n3) {
        int n4 = 0;
        if (n == 0) {
            n4 = 9;
        }
        else {
            if (n2 == 0) {
                n4 = 1;
            }
            else if (F(n - 1, n2 - 1) == n3 || (F(n - 1, n2 - 1) & 0xFFFFFFFE) == n3) {
                n4 = 1;
            }
            if (n2 == B.sa.length - 1) {
                n4 |= 0x8;
            }
            else if (F(n - 1, n2 + 1) == n3 || (F(n - 1, n2 + 1) & 0xFFFFFFFE) == n3) {
                n4 |= 0x8;
            }
        }
        if (n == B.sa[0].length - 1) {
            n = (n4 | 0x2);
            n4 = (n | 0x4);
        }
        else {
            if (n2 == 0) {
                n4 |= 0x2;
            }
            else if (F(n + 1, n2 - 1) == n3 || (F(n + 1, n2 - 1) & 0xFFFFFFFE) == n3) {
                n4 |= 0x2;
            }
            if (n2 == B.sa.length - 1) {
                n4 |= 0x4;
            }
            else if (F(n + 1, n2 + 1) == n3 || (F(n + 1, n2 + 1) & 0xFFFFFFFE) == n3) {
                n4 |= 0x4;
            }
        }
        return n4;
    }
    
    public static int B(final int n, final int n2, final int n3, final int n4) {
        final int n5 = n - (n4 >> 1) - 1;
        final int n6 = n2 - (n4 >> 1) - 1;
        final int n7 = n + (n4 >> 1) + 1;
        final int n8 = n2 + (n4 >> 1) + 1;
        int n9 = 0;
        for (int i = n5; i <= n7; ++i) {
            for (int j = n6; j <= n8; ++j) {
                int n10 = i;
                int n11 = j;
                if ((n4 & 0x1) != 0x0 || n10 == n || n11 == n2) {
                    if (n10 < 0) {
                        n10 = 0;
                    }
                    if (n10 >= B.sa[0].length) {
                        n10 = B.sa[0].length - 1;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n11 >= B.sa.length) {
                        n11 = B.sa.length - 1;
                    }
                    if (B.sa[n11][n10] == n3) {
                        ++n9;
                    }
                }
            }
        }
        return n9;
    }
    
    public static int F(final int n, final int n2) {
        int n3 = B.sa[n2][n];
        if (B(n, n2, n3, 1) == 9) {
            ++n3;
        }
        return n3;
    }
    
    public static void A(final int n, int i, final int n2, int j, int k, final int n3, final int n4, final int n5, final int n6) {
        for (int l = 0; l < B.sa.length; ++l) {
            for (int n7 = 0; n7 < B.sa[0].length; ++n7) {
                if (B.sa[l][n7] != n) {
                    B.ta[l][n7] = B.sa[l][n7];
                }
                else if (B(n7, l, i, j) >= k) {
                    B.ta[l][n7] = (byte)n2;
                }
            }
        }
        final byte[][] sa = B.sa;
        B.sa = B.ta;
        B.ta = sa;
        byte[][] sa2;
        for (k = 0; k < n6; ++k) {
            for (j = 0; j < B.sa.length; ++j) {
                for (i = 0; i < B.sa[0].length; ++i) {
                    if (B.sa[j][i] != n) {
                        B.ta[j][i] = B.sa[j][i];
                    }
                    else if (B(i, j, n2, n3) >= n4 && HG.A(n5) == 0) {
                        B.ta[j][i] = (byte)n2;
                    }
                }
            }
            sa2 = B.sa;
            B.sa = B.ta;
            B.ta = sa2;
        }
    }
    
    public static void G(final int n, final int n2) {
        for (int i = 0; i < B.sa.length; ++i) {
            for (int j = 0; j < B.sa[0].length; ++j) {
                if (B.sa[i][j] == n2) {
                    B.sa[i][j] = (byte)n;
                }
            }
        }
    }
    
    public static void H(final int n, final int n2) {
        int i = 1;
        while (i != 0) {
            i = 0;
            for (int j = 0; j < B.sa.length; ++j) {
                for (int k = 0; k < B.sa[0].length; ++k) {
                    final int f = F(k, j);
                    if (f == n2) {
                        if (B.qa[B.pa[f * 6 + 4]][(D(k, j) << 1) + 1] == 3) {
                            B.sa[j][k] = (byte)n;
                            i = 1;
                        }
                    }
                }
            }
        }
    }
    
    public static void I(final int n, final int n2) {
        for (int i = 0; i < n2; ++i) {
            B.sa[HG.A(B.sa.length)][HG.A(B.sa[0].length)] = (byte)n;
        }
    }
    
    public static void A(final boolean b) {
        int n;
        int n2;
        if (b) {
            n = B.sa.length;
            n2 = B.sa[0].length;
        }
        else {
            n = B.sa[0].length;
            n2 = B.sa.length;
        }
        int n3 = 1 + HG.A(3);
        int n4 = HG.A(n >> 1) + (n >> 2);
        if (b) {
            B.hA = 1;
            B.iA = n4;
        }
        else {
            B.bA = n4;
            B.cA = 1;
        }
        for (int i = 0; i < n2; ++i) {
            if (i == n2 >> 1) {
                if (b) {
                    B.za = i;
                    B.aA = n4;
                }
                else {
                    B.za = n4;
                    B.aA = i;
                }
            }
            if (b) {
                for (int j = 0; j < n3; ++j) {
                    B.sa[n4 - 1 + j][i] = 4;
                }
            }
            else {
                for (int k = 0; k < n3; ++k) {
                    B.sa[i][n4 - 1 + k] = 4;
                }
            }
            final int n5 = 1 - HG.A(3);
            if (n4 + n5 >= n >> 2 && n4 + n5 < n - (n >> 2)) {
                n4 += n5;
            }
            final int n6 = 1 - HG.A(3);
            if (n3 + n6 >= 1 && n3 + n6 <= 3) {
                n3 += n6;
            }
        }
        if (b) {
            B.dA = B.sa[0].length - 2;
            B.eA = n4;
        }
        else {
            B.fA = n4;
            B.gA = B.sa.length - 2;
        }
    }
    
    public static void B(final boolean b) {
        int n;
        int n2;
        if (b) {
            n = B.sa.length;
            n2 = B.sa[0].length;
        }
        else {
            n = B.sa[0].length;
            n2 = B.sa.length;
        }
        int n3 = 3;
        int n5;
        int n4 = n5 = HG.A(n >> 1) + (n >> 2);
        if (b) {
            B.hA = 1;
            B.iA = n4;
        }
        else {
            B.bA = n4;
            B.cA = 1;
        }
        for (int i = 0; i < n2; ++i) {
            if (b) {
                for (int j = 0; j < n3; ++j) {
                    B.sa[n4 - 1 + j][i] = 12;
                }
                B.sa[n5 - 1][i] = 12;
                B.sa[n5 - 1 + n3 - 1][i] = 12;
            }
            else {
                for (int k = 0; k < n3; ++k) {
                    B.sa[i][n4 - 1 + k] = 12;
                }
                B.sa[i][n5 - 1] = 12;
                B.sa[i][n5 - 1 + n3 - 1] = 12;
            }
            if ((i & 0x1) == 0x0) {
                n5 = n4;
                if ((i & 0x2) == 0x0) {
                    final int n6 = 1 - HG.A(3);
                    if (n4 + n6 >= n >> 2 && n4 + n6 < n - (n >> 2)) {
                        n4 += n6;
                    }
                    final int n7 = 1 - HG.A(3);
                    if (n3 + n7 >= 3 && n3 + n7 <= 4) {
                        n3 += n7;
                    }
                }
            }
        }
    }
    
    private static void I() {
        for (int i = 0; i < B.sa.length; ++i) {
            B.sa[i][0] = 14;
            B.sa[i][B.sa[0].length - 1] = 14;
        }
        for (int j = 0; j < B.sa[0].length; ++j) {
            B.sa[0][j] = 14;
            B.sa[B.sa.length - 1][j] = 14;
        }
    }
    
    public static void J() {
        for (int i = 0; i < B.sa[0].length; ++i) {
            for (int j = 0; j < B.sa.length; ++j) {
                final int f = F(i, j);
                final int d = D(i, j);
                final byte b = B.pa[f * 6 + 4];
                byte b2;
                if (d == 15 && B.pa[f * 6 + 5] != 0) {
                    b2 = B.ra[E(i, j) ^ 0xF];
                }
                else {
                    b2 = B.qa[b][(d << 1) + 0];
                }
                B.ua[j][i] = (((short)(B.pa[f * 6 + B.qa[b][(d << 1) + 1]] | b2 << 8) & 0xFFFF) | 0xFFFF0000);
                if (f != 0 && f != 1) {
                    final int[] array = B.ua[j];
                    final int n = i;
                    array[n] |= 0x8000;
                    final int[] array2 = B.ua[j];
                    final int n2 = i;
                    array2[n2] &= Integer.MAX_VALUE;
                }
                else {
                    final int[] array3 = B.ua[j];
                    final int n3 = i;
                    array3[n3] &= 0xFFFF7FFF;
                    final int[] array4 = B.ua[j];
                    final int n4 = i;
                    array4[n4] |= Integer.MIN_VALUE;
                }
            }
        }
    }
    
    public static void C(int i) {
        B.tA = -1;
        B.uA = -1;
        switch (i) {
            case 0: {
                B.vA = 3;
                break;
            }
            case 1: {
                B.vA = 9;
                break;
            }
            case 2: {
                B.vA = 11;
                break;
            }
            default: {
                return;
            }
        }
        int n = 0;
        i = B.sa[0].length >> 2;
        final int n2 = B.sa[0].length - (B.sa[0].length >> 2);
        final int n3 = B.sa.length >> 2;
        final int n4 = B.sa.length - (B.sa.length >> 2);
        for (int j = i; j < n2 - 10; ++j) {
            for (int k = n3; k < n4 - 10; ++k) {
                boolean b = true;
                for (int l = 0; l < 10; ++l) {
                    for (int n5 = 0; n5 < 10; ++n5) {
                        i = F(j + l, k + n5);
                        if (i != B.vA) {
                            b = false;
                            break;
                        }
                    }
                    if (!b) {
                        break;
                    }
                }
                if (b) {
                    B.sA[n++] = (((short)j & 0xFFFF) | ((short)k << 16 & 0xFFFF0000));
                }
            }
        }
        if (n == 0) {
            return;
        }
        i = HG.A(n);
        B.tA = (short)(B.sA[i] & 0xFFFF);
        B.uA = (short)((B.sA[i] & 0xFFFF0000) >> 16);
        for (int ta = B.tA; ta < B.tA + 10; ++ta) {
            for (i = B.uA; i < B.uA + 10; ++i) {
                B.sa[ta][i] = 14;
            }
        }
    }
    
    public static void K() {
        if (B.va == null || B.wa == null) {
            A.pa = new int[0][0];
            return;
        }
        int n = 0;
        for (int i = 0; i < B.oa.length; ++i) {
            for (int j = 0; j < B.oa[i].length; ++j) {
                if (j == 0 && (i ^ 0x1) != B.vA) {
                    n += B.oa[i][j];
                }
                else if (B.oa[i][j] != 0) {
                    do {
                        final int n2 = n + HG.A(B.oa[i][j]);
                        if (n2 < 0) {
                            break;
                        }
                        if (n2 >= B.va.length) {
                            break;
                        }
                        final int length = B.va[n2][0].length;
                        final int length2 = B.va[n2].length;
                        int a = HG.A(B.sa[0].length - length);
                        int a2 = HG.A(B.sa.length - length2);
                        int n3 = 0;
                        if (j == 0) {
                            if (B.tA != -1 && B.uA != -1) {
                                B.sA[0] = (((short)B.tA & 0xFFFF) | ((short)B.uA << 16 & 0xFFFF0000));
                                n3 = 1;
                            }
                        }
                        else {
                            n3 = 0;
                            for (int k = 0; k < B.sa[0].length - length; ++k) {
                                for (int l = 0; l < B.sa.length - length2; ++l) {
                                    boolean b = true;
                                    for (short n4 = 0; n4 < length; ++n4) {
                                        for (short n5 = 0; n5 < length2; ++n5) {
                                            final int f = F(a + n4, a2 + n5);
                                            if ((((i ^ 0x1) & 0x1) != 0x0 && f != (i ^ 0x1)) || (((i ^ 0x1) & 0x1) == 0x0 && (f & 0xFFFFFFFE) != (i ^ 0x1))) {
                                                b = false;
                                                break;
                                            }
                                        }
                                        if (!b) {
                                            break;
                                        }
                                    }
                                    if (b) {
                                        B.sA[n3] = (((short)a & 0xFFFF) | ((short)a2 << 16 & 0xFFFF0000));
                                        ++n3;
                                        break;
                                    }
                                    a2 = ++a2 % (B.sa.length - length2);
                                }
                                if (n3 != 0) {
                                    break;
                                }
                                a = ++a % (B.sa[0].length - length);
                            }
                        }
                        if (n3 == 0) {
                            break;
                        }
                        final int a3 = HG.A(n3);
                        final short n6 = (short)(B.sA[a3] & 0xFFFF);
                        final short n7 = (short)((B.sA[a3] & 0xFFFF0000) >> 16);
                        for (short n8 = 0; n8 < length; ++n8) {
                            for (short n9 = 0; n9 < length2; ++n9) {
                                final int n10 = n6 + n8;
                                final int n11 = n7 + n9;
                                if ((B.va[n2][n9][n8] & 0x8000) == 0x0) {
                                    final int[] array = B.ua[n11];
                                    final int n12 = n10;
                                    array[n12] &= 0xFFFF7FFF;
                                }
                                boolean b2 = false;
                                int n13 = (short)(B.ua[n11][n10] & 0xFFFF);
                                int n14 = (short)((B.ua[n11][n10] & 0xFFFF0000) >> 16);
                                if ((byte)(B.va[n2][n9][n8] & 0xFF) != -1) {
                                    n13 = (B.va[n2][n9][n8] & 0xFFFF);
                                    b2 = true;
                                }
                                if ((byte)(B.va[n2][n9][n8] >> 16 & 0xFF) != -1) {
                                    n14 = B.va[n2][n9][n8] >> 16;
                                    b2 = true;
                                }
                                if (b2) {
                                    B.ua[n11][n10] = (((short)n13 & 0xFFFF) | ((short)n14 << 16 & 0xFFFF0000));
                                    final int[] array2 = B.ua[n11];
                                    final int n15 = n10;
                                    array2[n15] |= Integer.MIN_VALUE;
                                }
                                B.sa[n11][n10] = 14;
                            }
                        }
                        for (int n16 = 0; n16 < B.wa[n2].length && B.lA != B.mA.length; ++n16) {
                            for (int n17 = 0; n17 < B.wa[n2][n16].length; ++n17) {
                                B.mA[B.lA][n17] = B.wa[n2][n16][n17];
                            }
                            B.mA[B.lA][0] = (((short)((short)(B.wa[n2][n16][0] & 0xFFFF) + n6) & 0xFFFF) | ((short)((short)((B.wa[n2][n16][0] & 0xFFFF0000) >> 16) + n7) << 16 & 0xFFFF0000));
                            if ((byte)(B.mA[B.lA][8] & 0xFF) == 4 || (byte)(B.mA[B.lA][8] & 0xFF) == 8) {
                                B.nA += 2;
                                B.oA += 2;
                                B.pA += 5;
                                B.qA += 2;
                            }
                            ++B.lA;
                        }
                    } while (j != 0);
                    n += B.oa[i][j];
                }
            }
        }
        A.pa = new int[B.lA][11];
        for (int n18 = 0; n18 < B.lA; ++n18) {
            for (int n19 = 0; n19 < 11; ++n19) {
                A.pa[n18][n19] = B.mA[n18][n19];
            }
        }
        B.mA = null;
    }
    
    public static void L() {
        B.cb = 0;
        for (int i = 0; i < A.pa.length; ++i) {
            final byte b = (byte)(A.pa[i][8] & 0xFF);
            if (b > 0) {
                if (B.r >= 30) {
                    A.pa[i][8] = 0;
                }
                else {
                    switch (b) {
                        case 4: {
                            final int[] array = A.pa[i];
                            final int n = 8;
                            array[n] &= 0xFF00FFFF;
                            final int[] array2 = A.pa[i];
                            final int n2 = 8;
                            array2[n2] |= 0xFF0000;
                            final int a = HG.A(6);
                            final int[] array3 = A.pa[i];
                            final int n3 = 8;
                            array3[n3] &= 0xFFFFFF;
                            final int[] array4 = A.pa[i];
                            final int n4 = 8;
                            array4[n4] |= ((byte)a << 24 & 0xFF000000);
                            final int ca = A.CA(a);
                            final int[] array5 = A.pa[i];
                            final int n5 = 9;
                            array5[n5] &= 0xFFFF;
                            final int[] array6 = A.pa[i];
                            final int n6 = 9;
                            array6[n6] |= ((short)ca << 16 & 0xFFFF0000);
                            final int[] array7 = A.pa[i];
                            final int n7 = 8;
                            array7[n7] &= 0xFFFF00FF;
                            final int[] array8 = A.pa[i];
                            final int n8 = 8;
                            array8[n8] |= ((byte)B.r << 8 & 0xFF00);
                            B.r += 2;
                        }
                        case 8: {
                            if (b == 8 && HG.A(2) != 0) {
                                A.pa[i][8] = 0;
                                break;
                            }
                            ++B.s;
                            int n9 = A.ca[17] / 5 + A.la[0][4];
                            if (n9 > 2500) {
                                n9 = 2500;
                            }
                            for (int j = 0; j < 4; ++j) {
                                int[][] array9 = null;
                                int[][] array10 = null;
                                int n10 = -1;
                                int n11 = -1;
                                int n12 = -1;
                                int n13 = -1;
                                int n14 = -1;
                                int n15 = -1;
                                int n16 = -1;
                                int n17 = -1;
                                int n18 = 0;
                                boolean b2 = false;
                                switch (j) {
                                    case 0: {
                                        array10 = A.ga;
                                        array9 = A.ha;
                                        n10 = 10;
                                        n11 = 10;
                                        n12 = 12;
                                        n13 = 0;
                                        n14 = 2;
                                        n16 = 4;
                                        n18 = 64;
                                        b2 = true;
                                        break;
                                    }
                                    case 1: {
                                        array10 = A.ia;
                                        array9 = A.ja;
                                        n10 = 10;
                                        n11 = 10;
                                        n12 = 12;
                                        n13 = 0;
                                        n14 = 2;
                                        n16 = 4;
                                        n18 = 128;
                                        b2 = true;
                                        break;
                                    }
                                    case 2: {
                                        array10 = A.sa;
                                        array9 = A.ta;
                                        n10 = 10;
                                        n11 = 10;
                                        n12 = 12;
                                        n13 = 0;
                                        n14 = 2;
                                        n16 = 4;
                                        n18 = 8192;
                                        b2 = true;
                                        break;
                                    }
                                    case 3: {
                                        array10 = A.ka;
                                        array9 = A.la;
                                        n10 = 10;
                                        n13 = 1;
                                        n14 = 5;
                                        n16 = 4;
                                        n17 = 6;
                                        n18 = 256;
                                        n15 = 0;
                                        b2 = false;
                                        break;
                                    }
                                }
                                for (int k = 0; k < n14; ++k) {
                                    if (k < n13 || HG.A(n10) == 0) {
                                        boolean b3 = false;
                                        boolean b4 = false;
                                        if (n11 != -1) {
                                            b3 = (HG.A(n11) == 0);
                                        }
                                        if (n12 != -1 && b3) {
                                            b4 = (HG.A(n12) == 0);
                                        }
                                        int n19 = -1;
                                        int n20 = -1;
                                        int n21 = 0;
                                        int n22 = 0;
                                        for (int l = 0; l < array9.length; ++l) {
                                            if (array9[l][n16] <= n9) {
                                                if (n11 != -1 && n12 != -1) {
                                                    if ((array9[l][3] & 0x1) != 0x0) {
                                                        ++n22;
                                                    }
                                                    else {
                                                        ++n21;
                                                    }
                                                }
                                                else {
                                                    ++n21;
                                                }
                                            }
                                        }
                                        if (n21 == 0) {
                                            break;
                                        }
                                        final int a2 = HG.A(n22);
                                        final int a3 = HG.A(n21);
                                        int n23 = 0;
                                        int n24 = 0;
                                        for (int n25 = 0; n25 < array9.length; ++n25) {
                                            if (array9[n25][n16] <= n9) {
                                                if (n11 != -1 && n12 != -1) {
                                                    if ((array9[n25][3] & 0x1) != 0x0) {
                                                        if (a2 == n23) {
                                                            n20 = n25;
                                                        }
                                                        ++n23;
                                                    }
                                                    else {
                                                        if (a3 == n24) {
                                                            n19 = n25;
                                                        }
                                                        ++n24;
                                                    }
                                                }
                                                else {
                                                    if (a3 == n24) {
                                                        n19 = n25;
                                                    }
                                                    ++n24;
                                                }
                                            }
                                        }
                                        if (b4 && n20 != -1) {
                                            b3 = false;
                                            n19 = n20;
                                        }
                                        int a4 = A.A(array10);
                                        if (a4 != -1) {
                                            if (k == 0 && n15 != -1) {
                                                n19 = n15;
                                            }
                                            array10[a4][0] = A.pa[i][0];
                                            array10[a4][3] = n18;
                                            if (b2) {
                                                A(n19, b3, array10[a4]);
                                            }
                                            else {
                                                int n26 = -1;
                                                for (int n27 = 0; n27 < array10.length; ++n27) {
                                                    if (array10[n27][4] == n19 && array10[n27][0] == array10[a4][0]) {
                                                        n26 = n27;
                                                        break;
                                                    }
                                                }
                                                if (n26 >= 0) {
                                                    a4 = n26;
                                                }
                                                else {
                                                    array10[a4][4] = n19;
                                                    array10[a4][5] = 0;
                                                    array10[a4][n17] = 0;
                                                }
                                            }
                                            if (!b2 && n19 == 0 && n17 != -1) {
                                                final int n28 = n9 / 20;
                                                final int n29 = (HG.A(n28) >> 2) + HG.A(2) + ((HG.A(n28) >> 2) + HG.A(2)) + ((HG.A(n28) >> 2) + HG.A(2));
                                                final int n30 = (n28 >> 2) + 2;
                                                final int[] array11 = array10[a4];
                                                final int n31 = n17;
                                                array11[n31] += n30 + n29;
                                            }
                                            else if (n17 != -1) {
                                                final int[] array12 = array10[a4];
                                                final int n32 = n17;
                                                array12[n32] += HG.A(8) + 1;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public static int J(final int n, final int n2) {
        for (int i = 0; i < 15; ++i) {
            for (int j = n2 - i; j <= n2 + i; ++j) {
                for (int k = n - i; k <= n + i; ++k) {
                    if (k >= 0) {
                        if (k < B.ua[0].length) {
                            if (j >= 0) {
                                if (j < B.ua.length) {
                                    if ((B.ua[j][k] & 0x8000) != 0x0 && (B.ua[j][k] & Integer.MIN_VALUE) == 0x0) {
                                        return ((short)k & 0xFFFF) | ((short)j << 16 & 0xFFFF0000);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }
    
    public static void M() {
        System.gc();
        B.yA = new int[A.fa.length];
        B.zA = new int[A.fa.length];
        B.ab = new int[A.fa.length];
        B.bb = new int[2][A.fa.length];
        int n = 0;
        for (int i = 0; i < A.fa.length; ++i) {
            if (A.fa[i][5] - 3 <= A.ca[18]) {
                if (A.fa[i][27] < 5) {
                    int n2;
                    for (n2 = 0; n2 < n && B.yA[n2] != A.fa[i][27]; ++n2) {}
                    if (n2 == n) {
                        B.yA[n++] = A.fa[i][27];
                    }
                }
            }
        }
        if (n == 0) {
            B.yA[n++] = A.fa[0][27];
        }
        for (int j = 0; j < n; ++j) {
            final int a = HG.A(n);
            final int a2 = HG.A(n);
            final int n3 = B.yA[a];
            B.yA[a] = B.yA[a2];
            B.yA[a2] = n3;
        }
        B.xA = 1;
        if (n > 1 && HG.A(5) == 0) {
            ++B.xA;
        }
        if (B.xA > 2) {
            B.xA = 2;
        }
        for (int k = 0; k < B.xA; ++k) {
            final int n4 = B.yA[k];
            int n5 = 0;
            for (int l = 0; l < A.fa.length; ++l) {
                if (A.fa[l][27] == n4 && A.fa[l][5] - 3 <= A.ca[18]) {
                    B.bb[k][n5++] = l;
                }
            }
            if (n5 == 0) {
                B.bb[k][n5++] = 0;
            }
            for (int n6 = 0; n6 < n5; ++n6) {
                final int a3 = HG.A(n5);
                final int a4 = HG.A(n5);
                final int n7 = B.bb[k][a3];
                B.bb[k][a3] = B.bb[k][a4];
                B.bb[k][a4] = n7;
            }
            if (n5 > 2) {
                n5 = 2;
            }
            B.ab[k] = n5;
            int n8 = 0;
            for (int n9 = 0; n9 < n5; ++n9) {
                n8 += A.fa[B.bb[k][n9]][5];
            }
            int n10 = n8 / n5;
            ++n10;
            int n11 = A.ca[18] * 5 / n10;
            if (++n11 < 3) {
                n11 = 3;
            }
            if (n11 > 6) {
                n11 = 6;
            }
            B.zA[k] = n11;
        }
    }
    
    public static int D(int n) {
        while (true) {
            int i;
            for (i = 0; i < n; ++i) {
                B.sA[B.rA + i] = J(HG.A(B.xa >> 1) + (B.xa >> 2), HG.A(B.ya >> 1) + (B.ya >> 2));
                if (B.sA[B.rA + i] == -1) {
                    break;
                }
                final int[] array = B.ua[(short)((B.sA[B.rA + i] & 0xFFFF0000) >> 16)];
                final short n2 = (short)(B.sA[B.rA + i] & 0xFFFF);
                array[n2] &= 0xFFFF7FFF;
            }
            for (int j = 0; j < i; ++j) {
                final int[] array2 = B.ua[(short)((B.sA[B.rA + j] & 0xFFFF0000) >> 16)];
                final short n3 = (short)(B.sA[B.rA + j] & 0xFFFF);
                array2[n3] |= 0x8000;
            }
            if (i == n) {
                break;
            }
            --n;
        }
        for (int k = 0; k < n; ++k) {
            final int[] array3 = B.ua[(short)((B.sA[B.rA + k] & 0xFFFF0000) >> 16)];
            final short n4 = (short)(B.sA[B.rA + k] & 0xFFFF);
            array3[n4] |= Integer.MIN_VALUE;
        }
        return n;
    }
    
    public static void C(final boolean b) {
        if (A.fa.length == 0) {
            A.ea = new int[0][0];
            return;
        }
        B.rA = 0;
        for (int i = 0; i < B.xA; ++i) {
            B.zA[i] = D(B.zA[i]);
            B.rA += B.zA[i];
        }
        A.ea = new int[B.rA][32];
        B.rA = 0;
        for (int j = 0; j < B.xA; ++j) {
            for (int k = 0; k < B.zA[j]; ++k) {
                final int n = B.bb[j][HG.A(B.ab[j])];
                final int ra = B.rA;
                final int n2 = B.sA[B.rA++];
                final int[] array = A.ea[ra];
                array[0] = n2;
                array[2] = (array[1] = -1);
                array[3] = 0;
                array[4] = ((short)(n2 & 0xFFFF) << 12) + 2048;
                array[5] = ((short)((n2 & 0xFFFF0000) >> 16) << 12) + 2048;
                array[6] = 0;
                array[8] = (array[7] = 0);
                array[10] = (array[9] = 0);
                array[11] = n;
                array[12] = (((short)A.fa[n][6] & 0xFFFF) | ((short)A.fa[n][6] << 16 & 0xFFFF0000));
                array[13] = 0;
                array[15] = (array[14] = -1);
                array[18] = (array[17] = -1);
                array[21] = (array[20] = -1);
                array[24] = (array[22] = -1);
                array[19] = A.V(ra);
                B.nA += 2;
                B.oA += 2;
                B.pA += 4;
                B.qA += 2;
                ++B.s;
            }
        }
    }
    
    public static void N() {
        final int[] array = B.ua[B.kA];
        final int ja = B.jA;
        array[ja] |= 0x8000;
        for (int i = 0; i < A.ea.length; ++i) {
            final int[] array2 = B.ua[(short)((A.ea[i][0] & 0xFFFF0000) >> 16)];
            final short n = (short)(A.ea[i][0] & 0xFFFF);
            array2[n] |= 0x8000;
        }
    }
    
    public static void D(int n, final int n2, int n3) {
        final int n4 = HG.A(B.sa.length + B.sa[0].length >> 1 >> 4) + 1;
        if (n2 == 2) {
            F(n);
            O();
            G(10, 2);
            H(2, 0);
            return;
        }
        if (n3 != 0) {
            if (n3 == 1) {
                n = B.sa[0].length >> 4;
                A(true);
            }
            else {
                n = B.sa.length >> 4;
                A(false);
            }
            A(0, 4, 4, 0, 1, 0, 1, 1, 0);
            A(0, 4, 2, 0, 1, 0, 1, 2, n);
        }
        else {
            if (n2 == 0) {
                n3 = HG.A(B.sa.length * B.sa[0].length >> 7) + 1;
                I(6, n3);
                A(0, 6, 6, 0, 1, 0, 1, 2, n4);
                n3 = HG.A(B.sa.length * B.sa[0].length >> 7) + 1;
                I(2, n3);
                A(0, 2, 2, 0, 1, 0, 1, 2, n4);
            }
            if (HG.A(6) == 0) {
                if (n == 0 || n == 2) {
                    B(true);
                }
                else {
                    B(false);
                }
            }
        }
        switch (n2) {
            case 0: {
                G(2, 0);
                break;
            }
            case 1: {
                G(8, 0);
                break;
            }
        }
        H(2, 8);
        H(2, 4);
    }
    
    public static void E(int i) {
        boolean b = false;
        switch (i) {
            case 4: {
                i = J(B.za, B.aA);
                b = true;
                break;
            }
            case 0: {
                i = J(B.bA, B.cA + 2);
                break;
            }
            case 1: {
                i = J(B.dA - 2, B.eA);
                break;
            }
            case 2: {
                i = J(B.fA, B.gA - 2);
                break;
            }
            default: {
                i = J(B.hA + 2, B.iA);
                break;
            }
        }
        if (i != -1) {
            B.jA = (short)(i & 0xFFFF);
            B.kA = (short)((i & 0xFFFF0000) >> 16);
        }
        else {
            boolean b2 = false;
            for (int j = 0; j < B.ua.length; ++j) {
                for (i = 0; i < B.ua[0].length; ++i) {
                    if ((B.ua[j][i] & 0x8000) != 0x0 && (B.ua[j][i] & Integer.MIN_VALUE) == 0x0) {
                        B.jA = i;
                        B.kA = j;
                        b2 = true;
                        break;
                    }
                }
                if (b2) {
                    break;
                }
            }
            if (!b2) {
                for (int k = 0; k < B.ua.length; ++k) {
                    int[] array;
                    int n;
                    int[] array2;
                    int n2;
                    for (i = 0; i < B.ua[0].length; ++i) {
                        B.ua[k][i] = -65536;
                        array = B.ua[k];
                        n = i;
                        array[n] |= 0x8000;
                        array2 = B.ua[k];
                        n2 = i;
                        array2[n2] &= Integer.MAX_VALUE;
                    }
                }
                B.jA = B.ua[0].length >> 1;
                B.kA = B.ua.length >> 1;
                A.pa = new int[0][0];
            }
        }
        final int[] array3 = B.ua[B.kA];
        final int ja = B.jA;
        array3[ja] |= Integer.MIN_VALUE;
        C(b);
    }
    
    public static void K(final int n, final int n2) {
        A.dC = new int[4][7];
        A.dC[0][0] = 8;
        A.dC[0][1] = 1;
        A.dC[0][2] = 0;
        A.dC[0][3] = B.xa - 1;
        A.dC[0][4] = 0;
        A.dC[0][5] = 1;
        A.dC[0][6] = 0;
        A.dC[1][0] = 8;
        A.dC[1][1] = 1;
        A.dC[1][2] = 0;
        A.dC[1][3] = B.xa - 1;
        A.dC[1][4] = B.ya - 2;
        A.dC[1][5] = B.ya - 1;
        A.dC[1][6] = 0;
        A.dC[2][0] = 8;
        A.dC[2][1] = 1;
        A.dC[2][2] = 0;
        A.dC[2][3] = 1;
        A.dC[2][4] = 0;
        A.dC[2][5] = B.ya - 1;
        A.dC[2][6] = 0;
        A.dC[3][0] = 8;
        A.dC[3][1] = 1;
        A.dC[3][2] = B.xa - 2;
        A.dC[3][3] = B.xa - 1;
        A.dC[3][4] = 0;
        A.dC[3][5] = B.ya - 1;
        A.dC[3][6] = 0;
        A.cC = new byte[1][5];
        A.cC[0][0] = 41;
        A.cC[0][1] = 0;
        A.cC[0][2] = 0;
        A.cC[0][3] = (byte)n;
        A.cC[0][4] = (byte)n2;
    }
    
    public static boolean E(final int wa, final int n, final int n2) {
        try {
            A.FA(3);
            System.currentTimeMillis();
            if (A.ca == null) {
                return false;
            }
            C.c = 0;
            B.wA = wa;
            final short n3 = (short)(A.ca[0] & 0xFFFF);
            final short n4 = (short)((A.ca[0] & 0xFFFF0000) >> 16);
            D();
            B.xa = 32;
            B.ya = 32;
            if (wa == 2) {
                A.W(7);
                B.f = 458759;
            }
            else {
                A.W(0);
                A.W(3);
                B.f = 196608;
            }
            B.d = A.cc[(short)(B.f & 0xFFFF) * 11 + 0] / A.cc[(short)(B.f & 0xFFFF) * 11 + 5];
            B.e = A.cc[(short)(B.f & 0xFFFF) * 11 + 1] / A.cc[(short)(B.f & 0xFFFF) * 11 + 6];
            if (!C(B.xa, B.ya)) {
                return false;
            }
            C.c = 15;
            C.c = 15;
            System.currentTimeMillis();
            if (wa == 2) {
                A.W(7);
                B.f = 458759;
            }
            else {
                A.W(0);
                A.W(3);
                B.f = 196608;
            }
            D(n2, wa, n);
            System.currentTimeMillis();
            J();
            C.c = 20;
            C.c = 20;
            if (wa == 2) {
                P();
            }
            I();
            System.currentTimeMillis();
            C(wa);
            K();
            System.currentTimeMillis();
            E(n2);
            System.currentTimeMillis();
            N();
            System.currentTimeMillis();
            B.b = B.xa;
            B.c = B.ya;
            A.ca[11] = -1;
            B.g = B.ua;
            H();
            A.wa = new int[B.c * 2 * (B.b * 2) * 3];
            A.xa = new int[A.ea.length][];
            A.ga = new int[B.nA + 15][9];
            A.ia = new int[B.oA + 15][9];
            A.ka = new int[B.pA + 15][7];
            A.ma = new int[0][0];
            A.ua = new int[0][0];
            A.sa = new int[B.qA + 15][8];
            A.B(A.ga);
            A.B(A.ia);
            A.B(A.ka);
            A.B(A.sa);
            L();
            System.currentTimeMillis();
            K(n3, n4);
            C.c = 25;
            B(B.jA, B.kA);
            System.currentTimeMillis();
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
        return true;
    }
    
    public static void F(int i) {
        int ha = 0;
        int ca = 0;
        int da = 0;
        int ga = 0;
        switch (i) {
            case 0: {
                ha = HG.A((B.sa[0].length >> 1) - 3 & 0x1) + (B.sa[0].length >> 2);
                ca = 0;
                da = ha + 6 - 1;
                ga = 5;
                if (ha < 0) {
                    ha = 0;
                }
                if (da >= B.sa[0].length) {
                    da = B.sa[0].length - 1;
                }
                break;
            }
            case 1: {
                ha = B.sa[0].length - 6;
                ca = HG.A((B.sa.length >> 1) - 3 & 0x1) + (B.sa.length >> 2);
                da = ha + 6 - 1;
                ga = ca + 6 - 1;
                if (ca < 0) {
                    ca = 0;
                }
                if (ga >= B.sa.length) {
                    ga = B.sa.length - 1;
                }
                break;
            }
            case 2: {
                ha = HG.A((B.sa[0].length >> 1) - 3 & 0x1) + (B.sa[0].length >> 2);
                ca = B.sa.length - 6;
                da = ha + 6 - 1;
                ga = ca + 6 - 1;
                if (ha < 0) {
                    ha = 0;
                }
                if (da >= B.sa[0].length) {
                    da = B.sa[0].length - 1;
                }
                break;
            }
            default: {
                ha = 0;
                ca = HG.A((B.sa.length >> 1) - 3 & 0x1) + (B.sa.length >> 2);
                da = 5;
                ga = ca + 6 - 1;
                if (ca < 0) {
                    ca = 0;
                }
                if (ga >= B.sa.length) {
                    ga = B.sa.length - 1;
                    break;
                }
                break;
            }
        }
        for (int j = ca; j <= ga; ++j) {
            for (i = ha; i <= da; ++i) {
                B.sa[j][i] = 2;
            }
        }
        B.za = ha + da >> 1;
        B.aA = ca + ga >> 1;
        B.bA = ha + da >> 1;
        B.cA = ca;
        B.dA = da;
        B.eA = ca + ga >> 1;
        B.fA = ha + da >> 1;
        B.gA = ga;
        B.hA = ha;
        B.iA = ca + ga >> 1;
    }
    
    public static int A(final int n, final int n2, final byte[] array) {
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        if (array[5 * n + 2] - 1 == array[5 * n2 + 3]) {
            B.eb[1] = array[5 * n2 + 3];
            B.eb[3] = array[5 * n + 2];
            b = true;
        }
        if (array[5 * n + 3] + 1 == array[5 * n2 + 2]) {
            B.eb[1] = array[5 * n + 3];
            B.eb[3] = array[5 * n2 + 2];
            b2 = true;
        }
        if (array[5 * n + 0] - 1 == array[5 * n2 + 1]) {
            B.eb[0] = array[5 * n2 + 1];
            B.eb[2] = array[5 * n + 0];
            b3 = true;
        }
        if (array[5 * n + 1] + 1 == array[5 * n2 + 0]) {
            B.eb[0] = array[5 * n + 1];
            B.eb[2] = array[5 * n2 + 0];
            b4 = true;
        }
        if ((b || b2) && ((array[5 * n + 0] > array[5 * n2 + 0] && array[5 * n + 0] < array[5 * n2 + 1]) || (array[5 * n + 1] > array[5 * n2 + 0] && array[5 * n + 1] < array[5 * n2 + 1]) || (array[5 * n2 + 0] > array[5 * n + 0] && array[5 * n2 + 0] < array[5 * n + 1]) || (array[5 * n2 + 1] > array[5 * n + 0] && array[5 * n2 + 1] < array[5 * n + 1]) || (array[5 * n + 0] == array[5 * n2 + 0] && array[5 * n + 1] == array[5 * n2 + 1]))) {
            if (array[5 * n + 0] < array[5 * n2 + 0]) {
                B.eb[0] = array[5 * n2 + 0];
            }
            else {
                B.eb[0] = array[5 * n + 0];
            }
            if (array[5 * n + 1] < array[5 * n2 + 1]) {
                B.eb[2] = array[5 * n + 1];
            }
            else {
                B.eb[2] = array[5 * n2 + 1];
            }
            return 0;
        }
        if ((b3 || b4) && ((array[5 * n + 2] > array[5 * n2 + 2] && array[5 * n + 2] < array[5 * n2 + 3]) || (array[5 * n + 3] > array[5 * n2 + 2] && array[5 * n + 3] < array[5 * n2 + 3]) || (array[5 * n2 + 2] > array[5 * n + 2] && array[5 * n2 + 2] < array[5 * n + 3]) || (array[5 * n2 + 3] > array[5 * n + 2] && array[5 * n2 + 3] < array[5 * n + 3]) || (array[5 * n + 2] == array[5 * n2 + 2] && array[5 * n + 3] == array[5 * n2 + 3]))) {
            if (array[5 * n + 2] < array[5 * n2 + 2]) {
                B.eb[1] = array[5 * n2 + 2];
            }
            else {
                B.eb[1] = array[5 * n + 2];
            }
            if (array[5 * n + 3] < array[5 * n2 + 3]) {
                B.eb[3] = array[5 * n + 3];
            }
            else {
                B.eb[3] = array[5 * n2 + 3];
            }
            return 1;
        }
        return -1;
    }
    
    public static void O() {
        byte b = 0;
        final int n = (B.sa.length >> 1) / 2 * ((B.sa[0].length >> 1) / 2) + 1;
        final byte[] array = new byte[n * 2];
        int n2 = 0;
        final int n3 = (B.sa.length >> 1) * (B.sa[0].length >> 1);
        final byte[] array2 = new byte[n3 * 3];
        array[0] = 2;
        array[1] = (byte)((B.sa[0].length >> 1) - 2);
        array[2] = 2;
        array[3] = (byte)((B.sa.length >> 1) - 2);
        array[4] = 0;
        ++b;
        int n4 = 1;
        while (n4 != 0 && b != n) {
            n4 = 0;
            for (byte b2 = 0; b2 < b; ++b2) {
                if ((array[5 * b + 4] & 0x2) == 0x0) {
                    int a = HG.A(2);
                    for (int i = 0; i < 2; ++i) {
                        a = (++a & 0x1);
                        final int n5 = array[5 * b2 + (a << 1) + 1] - array[5 * b2 + (a << 1) + 0];
                        if (n5 > 4) {
                            final byte b3 = array[5 * b2 + (a << 1) + 0];
                            final byte b4 = array[5 * b2 + (a << 1) + 1];
                            final byte b5 = (byte)(HG.A(n5 - 4) + 2 + b3);
                            array[5 * b2 + (a << 1) + 1] = b5;
                            array[5 * b + (a << 1) + 0] = (byte)(b5 + 1);
                            array[5 * b + (a << 1) + 1] = b4;
                            array[5 * b + ((a << 1) + 2) % 4] = array[5 * b2 + ((a << 1) + 2) % 4];
                            array[5 * b + ((a << 1) + 3) % 4] = array[5 * b2 + ((a << 1) + 3) % 4];
                            boolean b6 = false;
                            int n6 = 1;
                            for (int j = 0; j < n2; ++j) {
                                int n7 = -1;
                                if (array2[3 * j + 0] == b2) {
                                    n7 = array2[3 * j + 1];
                                }
                                if (array2[3 * j + 1] == b2) {
                                    n7 = array2[3 * j + 0];
                                }
                                if (n7 != -1) {
                                    if (A(b2, n7, array) == -1 && A(b, n7, array) == -1) {
                                        b6 = true;
                                    }
                                    else {
                                        n6 += 2;
                                    }
                                }
                            }
                            if (n2 + n6 > n3) {
                                b6 = true;
                            }
                            if (!b6) {
                                int n8 = 0;
                                boolean b7 = false;
                                for (int k = 0; k < n2; ++k) {
                                    int n9 = -1;
                                    int n10 = -1;
                                    if (array2[3 * k + 0] == b2) {
                                        n10 = 0;
                                        n9 = 1;
                                    }
                                    if (array2[3 * k + 1] == b2) {
                                        n10 = 1;
                                        n9 = 0;
                                    }
                                    if (n10 != -1) {
                                        final byte b8 = array2[3 * k + n9];
                                        if (A(b2, b8, array) == -1) {
                                            b7 = true;
                                            if (A(b, b8, array) != -1) {
                                                array2[3 * k + n10] = b;
                                            }
                                        }
                                        else if (A(b, b8, array) != -1) {
                                            array2[3 * (n2 + n8) + 0] = b;
                                            array2[3 * (n2 + n8) + 1] = b8;
                                            array2[3 * (n2 + n8) + 2] = 0;
                                            ++n8;
                                        }
                                    }
                                }
                                array2[3 * (n2 + n8) + 0] = b;
                                array2[3 * (n2 + n8) + 1] = b2;
                                array2[3 * (n2 + n8) + 2] = 0;
                                ++n8;
                                boolean b9 = false;
                                for (int l = 0; l < (n8 >> 1) + 1; ++l) {
                                    final int n11 = n2 + HG.A(n8);
                                    if (HG.A(4) == 0) {
                                        final byte[] array3 = array2;
                                        final int n12 = 3 * n11 + 2;
                                        array3[n12] |= 0x4;
                                    }
                                    else {
                                        final byte[] array4 = array2;
                                        final int n13 = 3 * n11 + 2;
                                        array4[n13] |= 0x2;
                                    }
                                    b9 = true;
                                }
                                if (!b9 || b7) {
                                    final byte[] array5 = array2;
                                    final int n14 = 3 * (n2 + n8 - 1) + 2;
                                    array5[n14] |= 0x2;
                                }
                                if (array[5 * b + 1] - array[5 * b + 0] <= 4 && array[5 * b + 3] - array[5 * b + 2] <= 4 && HG.A(2) == 0) {
                                    final byte[] array6 = array;
                                    final int n15 = 5 * b + 4;
                                    array6[n15] |= 0x2;
                                }
                                n2 += n8;
                                ++b;
                                n4 = 1;
                                break;
                            }
                            array[5 * b2 + (a << 1) + 1] = b4;
                        }
                    }
                }
            }
        }
        for (int n16 = 0; n16 < n2; ++n16) {
            final int a2 = A(array2[3 * n16 + 0], array2[3 * n16 + 1], array);
            if ((array2[3 * n16 + 2] & 0x2) != 0x0) {
                if (a2 == 1) {
                    final int n17 = B.eb[0] << 1;
                    int n18 = B.eb[1] + HG.A(B.eb[3] - B.eb[1]);
                    int n19 = B.eb[1] + HG.A(B.eb[3] - B.eb[1]);
                    if (n18 > n19) {
                        final int n20 = n18;
                        n18 = n19;
                        n19 = n20;
                    }
                    if (n18 == B.eb[3]) {
                        --n18;
                    }
                    if (n18 == n19) {
                        ++n19;
                    }
                    for (int n21 = n18 << 1; n21 < n19 << 1; ++n21) {
                        B.sa[n21][n17] = 2;
                        B.sa[n21][n17 + 1] = 2;
                    }
                }
                else {
                    int n22 = B.eb[0] + HG.A(B.eb[2] - B.eb[0]);
                    int n23 = B.eb[0] + HG.A(B.eb[2] - B.eb[0]);
                    if (n22 > n23) {
                        final int n24 = n22;
                        n22 = n23;
                        n23 = n24;
                    }
                    if (n22 == B.eb[2]) {
                        --n22;
                    }
                    if (n22 == n23) {
                        ++n23;
                    }
                    final int n25 = B.eb[1] << 1;
                    for (int n26 = n22 << 1; n26 < n23 << 1; ++n26) {
                        B.sa[n25][n26] = 2;
                        B.sa[n25 + 1][n26] = 2;
                    }
                }
            }
            if ((array2[3 * n16 + 2] & 0x4) != 0x0) {
                if (a2 == 1) {
                    final int n27 = B.eb[0] << 1;
                    for (int n28 = B.eb[1] << 1; n28 < B.eb[3] << 1; ++n28) {
                        B.sa[n28][n27] = 2;
                        B.sa[n28][n27 + 1] = 2;
                    }
                }
                else {
                    final int n29 = B.eb[1] << 1;
                    for (int n30 = B.eb[0] << 1; n30 < B.eb[2] << 1; ++n30) {
                        B.sa[n29][n30] = 2;
                        B.sa[n29 + 1][n30] = 2;
                    }
                }
            }
        }
        for (byte b10 = 0; b10 < b; ++b10) {
            for (int n31 = array[5 * b10 + 2] << 1; n31 < array[5 * b10 + 3] << 1; ++n31) {
                for (int n32 = array[5 * b10 + 0] << 1; n32 < array[5 * b10 + 1] << 1; ++n32) {
                    B.sa[n31][n32] = 2;
                }
            }
        }
    }
    
    public static void P() {
        for (int i = 0; i < B.sa.length; ++i) {
            for (int j = 0; j < B.sa[0].length; ++j) {
                if (B.sa[i][j] == 0) {
                    int b = B(j, i, 10);
                    if (i == 0) {
                        b &= 0xFFFFFFFD;
                    }
                    if (i == B.sa.length - 1) {
                        b &= 0xFFFFFFF7;
                    }
                    if (j == 0) {
                        b &= 0xFFFFFFFE;
                    }
                    if (j == B.sa[0].length - 1) {
                        b &= 0xFFFFFFFB;
                    }
                    final int n = b * 6;
                    for (int n2 = 0; n2 < 3 && i - n2 >= 0; ++n2) {
                        int n3 = B.db[n + n2 * 2 + 0];
                        if (b == 8) {
                            n3 += (j & 0x1) * 3;
                        }
                        if (n3 != -1) {
                            final int n4 = B.db[n + n2 * 2 + 1];
                            int n5 = (short)(B.ua[i - n2][j] & 0xFFFF);
                            if ((n5 & 0xFF) == 0xFF) {
                                n5 = 0;
                            }
                            B.ua[i - n2][j] = (((short)n5 & 0xFFFF) | ((short)(n3 | n4 << 8 | n2 << 12) << 16 & 0xFFFF0000));
                        }
                    }
                    final int[] array = B.ua[i];
                    final int n6 = j;
                    array[n6] |= Integer.MIN_VALUE;
                    final int[] array2 = B.ua[i];
                    final int n7 = j;
                    array2[n7] &= 0xFFFF7FFF;
                }
            }
        }
    }
    
    public static int A(int n, final int[] array) {
        final short n2 = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
        if ((B.a[n][3] & 0x1000) != 0x0) {
            return (short)(A.pa[n2][9] & 0xFFFF);
        }
        if ((B.a[n][3] & 0x20) != 0x0) {
            n = (short)(A.ea[n2][17] & 0xFFFF);
            if (array != null) {
                if ((array[3] & 0x80) != 0x0) {
                    ++n;
                }
                else if ((array[3] & 0x100) != 0x0) {
                    n += 2;
                }
                else if ((array[3] & 0x2000) != 0x0) {
                    n += 3;
                }
            }
            return n;
        }
        return -1;
    }
    
    public static int Q() {
        final int a = A(A.tb, (int[])null);
        for (int i = 0; i < 4; ++i) {
            if ((short)((A.hA[a + i] & 0xFFFF0000) >> 16) > 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static void R() {
        final int a = A(A.tb, (int[])null);
        ++HG.bA;
        if (HG.bA >= 4) {
            HG.bA = 0;
        }
        if ((short)((A.hA[a + HG.bA] & 0xFFFF0000) >> 16) <= 0) {
            if (Q() < 0) {
                HG.bA = 0;
                return;
            }
            R();
        }
    }
    
    public static void S() {
        final int a = A(A.tb, (int[])null);
        --HG.bA;
        if (HG.bA < 0) {
            HG.bA = 3;
        }
        if ((short)((A.hA[a + HG.bA] & 0xFFFF0000) >> 16) <= 0) {
            if (Q() < 0) {
                HG.bA = 0;
                return;
            }
            S();
        }
    }
    
    public static void T() {
        if (A.hA == null) {
            A.hA = new int[B.s];
            B.s = 0;
        }
        for (int i = 0; i < A.ea.length; ++i) {
            if (A.fa[A.ea[i][11]][27] == 7 || A.fa[A.ea[i][11]][27] == 8) {
                final int[] array = A.ea[i];
                final int n = 17;
                array[n] &= 0xFFFF0000;
                final int[] array2 = A.ea[i];
                final int n2 = 17;
                array2[n2] |= ((short)B.s & 0xFFFF);
                int n3 = (short)(A.ea[i][17] & 0xFFFF);
                final int[] ha = A.hA;
                final int n4 = n3;
                ha[n4] &= 0xFFFF0000;
                final int[] ha2 = A.hA;
                final int n5 = n3;
                ha2[n5] |= 0xFFFF;
                final int[] ha3 = A.hA;
                final int n6 = n3;
                ha3[n6] &= 0xFFFF;
                final int[] ha4 = A.hA;
                final int n7 = n3;
                ha4[n7] |= 0x0;
                ++B.s;
                if (A.fa[A.ea[i][11]][27] == 7) {
                    final int n8 = A.fa[A.ea[i][11]][25];
                    final int a = HG.A(5, 15);
                    final int[] ha5 = A.hA;
                    final int n9 = n3;
                    ha5[n9] &= 0xFFFF;
                    final int[] ha6 = A.hA;
                    final int n10 = n3;
                    ha6[n10] |= ((short)a << 16 & 0xFFFF0000);
                    int length = A.ha.length;
                    for (int j = 0; j < A.ha.length; ++j) {
                        if ((A.ha[j][3] & 0x1) != 0x0) {
                            length = j - 1;
                            break;
                        }
                    }
                    for (int k = 0; k < a; ++k) {
                        final int a2 = A.A(A.ga);
                        if (a2 >= 0) {
                            final int a3 = HG.A(length);
                            final boolean b = HG.A(100) < n8;
                            final short n11 = (short)(A.ga[a2][2] & 0xFFFF);
                            A(a3, b, B.a[n11]);
                            final int[] array3 = B.a[n11];
                            final int n12 = 3;
                            array3[n12] |= 0x10000;
                            if ((B.a[n11][3] & 0x2) != 0x0) {
                                D(B.a[n11]);
                            }
                            short n14;
                            final short n13 = n14 = (short)(A.hA[n3] & 0xFFFF);
                            boolean b2 = false;
                            while (n14 != -1) {
                                if (B.a[n14][4] == B.a[n11][4] && B.a[n14][6] == -1 && B.a[n14][7] == -1 && B.a[n11][6] == -1 && B.a[n11][7] == -1) {
                                    B.a[n11][4] = -1;
                                    b2 = true;
                                    break;
                                }
                                n14 = (short)(B.a[n14][1] & 0xFFFF);
                            }
                            if (!b2) {
                                final int[] array4 = B.a[n11];
                                final int n15 = 1;
                                array4[n15] &= 0xFFFF0000;
                                final int[] array5 = B.a[n11];
                                final int n16 = 1;
                                array5[n16] |= (n13 & 0xFFFF);
                                final int[] ha7 = A.hA;
                                final int n17 = n3;
                                ha7[n17] &= 0xFFFF0000;
                                final int[] ha8 = A.hA;
                                final int n18 = n3;
                                ha8[n18] |= (n11 & 0xFFFF);
                            }
                        }
                    }
                }
                ++n3;
                final int[] ha9 = A.hA;
                final int n19 = n3;
                ha9[n19] &= 0xFFFF0000;
                final int[] ha10 = A.hA;
                final int n20 = n3;
                ha10[n20] |= 0xFFFF;
                final int[] ha11 = A.hA;
                final int n21 = n3;
                ha11[n21] &= 0xFFFF;
                final int[] ha12 = A.hA;
                final int n22 = n3;
                ha12[n22] |= 0x0;
                ++B.s;
                if (A.fa[A.ea[i][11]][27] == 7) {
                    final int n23 = A.fa[A.ea[i][11]][25];
                    final int a4 = HG.A(5, 15);
                    final int[] ha13 = A.hA;
                    final int n24 = n3;
                    ha13[n24] &= 0xFFFF;
                    final int[] ha14 = A.hA;
                    final int n25 = n3;
                    ha14[n25] |= ((short)a4 << 16 & 0xFFFF0000);
                    int length2 = A.ja.length;
                    for (int l = 0; l < A.ja.length; ++l) {
                        if ((A.ja[l][3] & 0x1) != 0x0) {
                            length2 = l - 1;
                            break;
                        }
                    }
                    for (int n26 = 0; n26 < a4; ++n26) {
                        final int a5 = A.A(A.ia);
                        if (a5 >= 0) {
                            final int a6 = HG.A(length2);
                            final boolean b3 = HG.A(100) < n23;
                            final short n27 = (short)(A.ia[a5][2] & 0xFFFF);
                            A(a6, b3, B.a[n27]);
                            final int[] array6 = B.a[n27];
                            final int n28 = 3;
                            array6[n28] |= 0x10000;
                            if ((B.a[n27][3] & 0x2) != 0x0) {
                                D(B.a[n27]);
                            }
                            short n30;
                            final short n29 = n30 = (short)(A.hA[n3] & 0xFFFF);
                            boolean b4 = false;
                            while (n30 != -1) {
                                if (B.a[n30][4] == B.a[n27][4] && B.a[n30][6] == -1 && B.a[n30][7] == -1 && B.a[n27][6] == -1 && B.a[n27][7] == -1) {
                                    B.a[n27][4] = -1;
                                    b4 = true;
                                    break;
                                }
                                n30 = (short)(B.a[n30][1] & 0xFFFF);
                            }
                            if (!b4) {
                                final int[] array7 = B.a[n27];
                                final int n31 = 1;
                                array7[n31] &= 0xFFFF0000;
                                final int[] array8 = B.a[n27];
                                final int n32 = 1;
                                array8[n32] |= (n29 & 0xFFFF);
                                final int[] ha15 = A.hA;
                                final int n33 = n3;
                                ha15[n33] &= 0xFFFF0000;
                                final int[] ha16 = A.hA;
                                final int n34 = n3;
                                ha16[n34] |= (n27 & 0xFFFF);
                            }
                        }
                    }
                }
                ++n3;
                final int[] ha17 = A.hA;
                final int n35 = n3;
                ha17[n35] &= 0xFFFF0000;
                final int[] ha18 = A.hA;
                final int n36 = n3;
                ha18[n36] |= 0xFFFF;
                final int[] ha19 = A.hA;
                final int n37 = n3;
                ha19[n37] &= 0xFFFF;
                final int[] ha20 = A.hA;
                final int n38 = n3;
                ha20[n38] |= 0x0;
                ++B.s;
                int n39 = 3;
                int n40 = A.la.length - 1;
                if (A.fa[A.ea[i][11]][27] == 7) {
                    n39 = 1;
                    n40 = 2;
                }
                final int a7 = HG.A(5, 15);
                final int[] ha21 = A.hA;
                final int n41 = n3;
                ha21[n41] &= 0xFFFF;
                final int[] ha22 = A.hA;
                final int n42 = n3;
                ha22[n42] |= ((short)a7 << 16 & 0xFFFF0000);
                for (int n43 = n39; n43 <= n40; ++n43) {
                    if (A.la[n43][5] != 0) {
                        if (A.ca[18] >= A.la[n43][5]) {
                            final int a8 = A.A(A.ka);
                            if (a8 >= 0) {
                                final int n44 = n43;
                                final short n45 = (short)(A.ka[a8][2] & 0xFFFF);
                                A.ka[a8][4] = n44;
                                if (A.fa[A.ea[i][11]][27] == 7) {
                                    A.ka[a8][6] = HG.A(100, 300);
                                }
                                else {
                                    A.ka[a8][6] = HG.A(5, 10);
                                }
                                final int[] array9 = B.a[n45];
                                final int n46 = 3;
                                array9[n46] |= 0x10000;
                                if ((B.a[n45][3] & 0x2) != 0x0) {
                                    D(B.a[n45]);
                                }
                                final short n47 = (short)(A.hA[n3] & 0xFFFF);
                                final int[] array10 = B.a[n45];
                                final int n48 = 1;
                                array10[n48] &= 0xFFFF0000;
                                final int[] array11 = B.a[n45];
                                final int n49 = 1;
                                array11[n49] |= (n47 & 0xFFFF);
                                final int[] ha23 = A.hA;
                                final int n50 = n3;
                                ha23[n50] &= 0xFFFF0000;
                                final int[] ha24 = A.hA;
                                final int n51 = n3;
                                ha24[n51] |= (n45 & 0xFFFF);
                            }
                        }
                    }
                }
                ++n3;
                final int[] ha25 = A.hA;
                final int n52 = n3;
                ha25[n52] &= 0xFFFF0000;
                final int[] ha26 = A.hA;
                final int n53 = n3;
                ha26[n53] |= 0xFFFF;
                final int[] ha27 = A.hA;
                final int n54 = n3;
                ha27[n54] &= 0xFFFF;
                final int[] ha28 = A.hA;
                final int n55 = n3;
                ha28[n55] |= 0x0;
                ++B.s;
                if (A.fa[A.ea[i][11]][27] == 8) {
                    final int n56 = A.fa[A.ea[i][11]][25];
                    final int a9 = HG.A(5, 15);
                    final int[] ha29 = A.hA;
                    final int n57 = n3;
                    ha29[n57] &= 0xFFFF;
                    final int[] ha30 = A.hA;
                    final int n58 = n3;
                    ha30[n58] |= ((short)a9 << 16 & 0xFFFF0000);
                    int length3 = A.ta.length;
                    for (int n59 = 0; n59 < A.ta.length; ++n59) {
                        if ((A.ta[n59][3] & 0x1) != 0x0) {
                            length3 = n59 - 1;
                            break;
                        }
                    }
                    for (int n60 = 0; n60 < a9; ++n60) {
                        final int a10 = A.A(A.sa);
                        if (a10 >= 0) {
                            final int a11 = HG.A(length3);
                            final boolean b5 = HG.A(100) < n56;
                            final short n61 = (short)(A.sa[a10][2] & 0xFFFF);
                            A(a11, b5, B.a[n61]);
                            final int[] array12 = B.a[n61];
                            final int n62 = 3;
                            array12[n62] |= 0x10000;
                            if ((B.a[n61][3] & 0x2) != 0x0) {
                                D(B.a[n61]);
                            }
                            short n64;
                            final short n63 = n64 = (short)(A.hA[n3] & 0xFFFF);
                            boolean b6 = false;
                            while (n64 != -1) {
                                if (B.a[n64][4] == B.a[n61][4] && B.a[n64][6] == -1 && B.a[n64][7] == -1 && B.a[n61][6] == -1 && B.a[n61][7] == -1) {
                                    B.a[n61][4] = -1;
                                    b6 = true;
                                    break;
                                }
                                n64 = (short)(B.a[n64][1] & 0xFFFF);
                            }
                            if (!b6) {
                                final int[] array13 = B.a[n61];
                                final int n65 = 1;
                                array13[n65] &= 0xFFFF0000;
                                final int[] array14 = B.a[n61];
                                final int n66 = 1;
                                array14[n66] |= (n63 & 0xFFFF);
                                final int[] ha31 = A.hA;
                                final int n67 = n3;
                                ha31[n67] &= 0xFFFF0000;
                                final int[] ha32 = A.hA;
                                final int n68 = n3;
                                ha32[n68] |= (n61 & 0xFFFF);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static void U() {
        if (A.hA == null) {
            A.hA = new int[B.s];
            B.s = 0;
        }
        for (int i = 0; i < A.pa.length; ++i) {
            final byte b = (byte)(A.pa[i][8] & 0xFF);
            if (b == 4 || b == 8) {
                final int[] array = A.pa[i];
                final int n = 9;
                array[n] &= 0xFFFF0000;
                final int[] array2 = A.pa[i];
                final int n2 = 9;
                array2[n2] |= ((short)B.s & 0xFFFF);
                final short n3 = (short)(A.pa[i][9] & 0xFFFF);
                final int[] ha = A.hA;
                final short n4 = n3;
                ha[n4] &= 0xFFFF0000;
                final int[] ha2 = A.hA;
                final short n5 = n3;
                ha2[n5] |= 0xFFFF;
                ++B.s;
                int j = B.u[(short)((A.pa[i][0] & 0xFFFF0000) >> 16)][(short)(A.pa[i][0] & 0xFFFF)];
                int n6 = 0;
                while (j != -1) {
                    final short n7 = (short)(B.a[j][1] & 0xFFFF);
                    if ((B.a[j][3] & 0x100) != 0x0 || (B.a[j][3] & 0x200) != 0x0 || (B.a[j][3] & 0x40) != 0x0 || (B.a[j][3] & 0x80) != 0x0 || (B.a[j][3] & 0x400) != 0x0 || (B.a[j][3] & 0x2000) != 0x0) {
                        final int[] array3 = B.a[j];
                        final int n8 = 3;
                        array3[n8] |= 0x10000;
                        if ((B.a[j][3] & 0x2) != 0x0) {
                            D(B.a[j]);
                        }
                        final short n9 = (short)(A.pa[i][9] & 0xFFFF);
                        final short n10 = (short)(A.hA[n9] & 0xFFFF);
                        final int[] array4 = B.a[j];
                        final int n11 = 1;
                        array4[n11] &= 0xFFFF0000;
                        final int[] array5 = B.a[j];
                        final int n12 = 1;
                        array5[n12] |= (n10 & 0xFFFF);
                        final int[] ha3 = A.hA;
                        final short n13 = n9;
                        ha3[n13] &= 0xFFFF0000;
                        final int[] ha4 = A.hA;
                        final short n14 = n9;
                        ha4[n14] |= ((short)j & 0xFFFF);
                        ++n6;
                    }
                    j = n7;
                }
                final int[] ha5 = A.hA;
                final short n15 = n3;
                ha5[n15] &= 0xFFFF;
                final int[] ha6 = A.hA;
                final short n16 = n3;
                ha6[n16] |= ((short)n6 << 16 & 0xFFFF0000);
            }
        }
    }
    
    static void G(final int n) {
        final int[] array = A.ea[n];
        final int[] array2 = A.fa[array[11]];
        if ((short)(array[12] & 0xFFFF) > 0) {
            for (int i = 0; i < 2; ++i) {
                int a = A.A(A.ga);
                if (array[14 + i] >= 0) {
                    A(array[14 + i], (array[13] & 1 << 10 + i) != 0x0, A.ga[a]);
                }
                else if (array2[23 + i] >= 0 && array[14 + i] != -2) {
                    if (!A(n, array2[23 + i], (array[13] & 1 << 10 + i) != 0x0, a)) {
                        a = -1;
                    }
                }
                else {
                    a = -1;
                }
                if (a >= 0 && (A.ha[A.ga[a][4]][15] == 2 || A.ha[A.ga[a][4]][15] == 3)) {
                    array[28] = 20;
                }
                array[14 + i] = a;
            }
            if (array2[26] >= 0) {
                final int a2 = A.A(A.ia);
                A(array2[26], (array[13] & 0x1000) != 0x0, A.ia[a2]);
                array[16] = a2;
            }
        }
        for (int j = 0; j < 2; ++j) {
            if (array[17 + j] >= 0) {
                final short n2 = (short)(array[17 + j] & 0xFFFF);
                final short n3 = (short)((array[17 + j] & 0xFFFF0000) >> 16);
                if (n2 == 3) {
                    F(n, 17 + j, n3);
                }
                else if (n2 == 2) {
                    C(n, 17 + j, n3, 1);
                }
                else if (n2 == 5) {
                    final int a3 = A.A(A.ma);
                    A.ma[a3][4] = n3;
                    final int[] array3 = array;
                    final int n4 = 17 + j;
                    array3[n4] &= 0xFFFF;
                    final int[] array4 = array;
                    final int n5 = 17 + j;
                    array4[n5] |= ((short)a3 << 16 & 0xFFFF0000);
                }
            }
            else if ((short)(array[12] & 0xFFFF) > 0 && array[17 + j] != -2) {
                if (array2[21 + j] >= 0) {
                    C(n, 17 + j, array2[21 + j], 1);
                }
                else if (array2[21 + j] == -2) {
                    final boolean b = (array2[13] & 0x400) != 0x0;
                    final boolean b2 = (array2[13] & 0x200) != 0x0;
                    if (b2 && b) {
                        final int a4 = HG.A(100);
                        if (a4 >= 70) {
                            F(n, 17 + j, HG.A(A.ta.length - 1));
                        }
                        else if (a4 >= 40) {
                            C(n, 17 + j, HG.A(3, A.la.length - 1), 1);
                        }
                        else {
                            array[17 + j] = -1;
                        }
                    }
                    else if (b2) {
                        C(n, 17 + j, HG.A(3, A.la.length - 1), 1);
                    }
                    else if (b) {
                        int n6 = 0;
                        for (int k = A.ta.length - 1; k >= 0; --k) {
                            if ((A.ta[k][3] & 0x1) == 0x0) {
                                n6 = k;
                                break;
                            }
                        }
                        F(n, 17 + j, HG.A(n6));
                    }
                }
            }
        }
        if (A.ea[n][19] > 0 && (short)(array[12] & 0xFFFF) > 0) {
            A.ea[n][19] = C(n, 19, 0, A.ea[n][19]);
        }
    }
    
    static int C(final int n, final int n2, final int n3, final int n4) {
        final int a = A.A(A.ka);
        A.ka[a][4] = n3;
        A.ka[a][6] = n4;
        final int[] array = A.ea[n];
        array[n2] &= 0xFFFF;
        final int[] array2 = A.ea[n];
        array2[n2] |= ((short)a << 16 & 0xFFFF0000);
        final int[] array3 = A.ea[n];
        array3[n2] &= 0xFFFF0000;
        final int[] array4 = A.ea[n];
        array4[n2] |= 0x2;
        return a;
    }
    
    static void F(final int n, final int n2, final int n3) {
        final int a = A.A(A.sa);
        A.sa[a][4] = n3;
        A.sa[a][6] = -1;
        A.sa[a][7] = -1;
        final int[] array = A.ea[n];
        array[n2] &= 0xFFFF;
        final int[] array2 = A.ea[n];
        array2[n2] |= ((short)a << 16 & 0xFFFF0000);
        if (HG.A(100) <= A.fa[A.ea[n][11]][25]) {
            E(A.sa[a]);
        }
    }
    
    static void A(final int n, final boolean b, final int[] array) {
        array[4] = n;
        array[7] = (array[6] = -1);
        if ((array[3] & 0x40) != 0x0 || (array[3] & 0x80) != 0x0) {
            array[8] = A.A(array)[10];
        }
        if (b) {
            E(array);
        }
    }
    
    static boolean A(final int n, final int n2, final boolean b, final int n3) {
        if (n2 < 0) {
            return false;
        }
        int n4 = 0;
        for (int i = 0; i < A.ha.length; ++i) {
            boolean b2 = false;
            if ((A.ha[i][3] & 0x1) != 0x0) {
                b2 = false;
            }
            else if ((short)(A.ha[i][10] & 0xFFFF) == 0) {
                b2 = (A.fa[A.ea[n][11]][7] >= (short)((A.ha[i][10] & 0xFFFF0000) >> 16));
            }
            else if ((short)(A.ha[i][10] & 0xFFFF) == 1) {
                b2 = (A.fa[A.ea[n][11]][8] >= (short)((A.ha[i][10] & 0xFFFF0000) >> 16));
            }
            if (A.ha[i][15] == n2 && b2) {
                ++n4;
            }
        }
        if (n4 > 0) {
            final int a = HG.A(1, n4);
            int n5 = 1;
            for (int j = 0; j < A.ha.length; ++j) {
                boolean b3 = false;
                if ((A.ha[j][3] & 0x1) != 0x0) {
                    b3 = false;
                }
                else if ((short)(A.ha[j][10] & 0xFFFF) == 0) {
                    b3 = (A.fa[A.ea[n][11]][7] >= (short)((A.ha[j][10] & 0xFFFF0000) >> 16));
                }
                else if ((short)(A.ha[j][10] & 0xFFFF) == 1) {
                    b3 = (A.fa[A.ea[n][11]][8] >= (short)((A.ha[j][10] & 0xFFFF0000) >> 16));
                }
                if (A.ha[j][15] == n2 && b3) {
                    if (n5 == a) {
                        A.ga[n3][4] = j;
                        A.ga[n3][6] = -1;
                        A.ga[n3][7] = -1;
                        A.ga[n3][8] = A.ha[j][10];
                        if (b) {
                            E(A.ga[n3]);
                        }
                    }
                    ++n5;
                }
            }
            return true;
        }
        return false;
    }
    
    static int B(final int[] array, final int n, int n2, final int n3, final int n4) {
        int n5 = 0;
        int n6 = n;
        if (n6 > 10) {
            n6 = 10;
        }
        else if (n6 <= 0) {
            return 0;
        }
        for (int i = 0; i < A.ra.length; ++i) {
            if ((A.ra[i][4] & 1 << n3) != 0x0 && A.ra[i][1] == n2) {
                ++n5;
            }
        }
        if (n5 > 0) {
            final int a = HG.A(1, n5);
            int n7 = 0;
            for (int j = 0; j < A.ra.length; ++j) {
                if ((A.ra[j][4] & 1 << n3) != 0x0 && A.ra[j][1] == n2 && ++n7 == a) {
                    n2 = HG.A(1, n6) * A.ra[j][2];
                    array[n4] = (((short)n2 & 0xFFFF) | ((short)j << 16 & 0xFFFF0000));
                    return n - n2;
                }
            }
        }
        return 0;
    }
    
    static void E(final int[] array) {
        int n = A.ca[18];
        if (n < 5) {
            n = 5;
        }
        A.A(array);
        int n2 = 0;
        if ((array[3] & 0x40) != 0x0) {
            n2 = 0;
        }
        else if ((array[3] & 0x80) != 0x0) {
            n2 = 1;
        }
        else if ((array[3] & 0x2000) != 0x0) {
            n2 = 2;
        }
        final int a = HG.A(0, 100);
        if (a < 50) {
            B(array, n, 1, n2, 6);
        }
        else if (a < 75) {
            B(array, n, 0, n2, 7);
        }
        else {
            B(array, B(array, n, 1, n2, 6), 0, n2, 7);
        }
        final int n3 = 3;
        array[n3] |= 0x20000;
    }
    
    static String F(final int[] array) {
        final int[] a = A.A(array);
        if (a == null) {
            return null;
        }
        String s = HG.I(a[0]);
        if ((array[3] & 0x20000) != 0x0) {
            if (array[7] >= 0) {
                s = HG.I(A.ra[(short)((array[7] & 0xFFFF0000) >> 16)][0]) + " " + s;
            }
            if (array[6] >= 0) {
                s = s + " " + HG.I(A.ra[(short)((array[6] & 0xFFFF0000) >> 16)][0]);
            }
        }
        return s;
    }
    
    static int G(final int[] array) {
        int n = A.A(array)[4];
        if ((array[3] & 0x20000) != 0x0) {
            int n2 = 0;
            if (array[6] > 0) {
                n2 = 0 + (short)(array[6] & 0xFFFF);
            }
            if (array[7] > 0) {
                n2 += (short)(array[7] & 0xFFFF);
            }
            n += n * 150 / 100 * (n2 >> 2);
        }
        return n;
    }
    
    static {
        B.a = null;
        B.b = -1;
        B.c = -1;
        B.d = 16;
        B.e = 16;
        B.f = 0;
        B.g = null;
        B.h = -1;
        B.i = true;
        B.j = 0;
        B.k = 0;
        B.l = new int[6][][];
        B.m = 0;
        B.n = 0;
        B.o = 0;
        B.p = 0;
        B.q = 0;
        B.r = 0;
        B.s = 0;
        B.t = new int[4];
        B.v = new int[2];
        B.w = new int[4];
        B.x = new int[2];
        B.y = new int[2];
        B.z = new int[4];
        B.aa = new int[4];
        B.ba = new int[4];
        B.ca = new int[2];
        B.da = new int[2];
        B.ea = new int[4];
        B.fa = new int[4];
        B.ga = new int[4];
        B.ha = new int[2];
        B.ia = new int[2];
        B.ja = new int[4];
        B.ka = new int[4];
        B.la = new int[2];
        B.ma = new int[2];
        B.na = new int[2];
        B.oa = new int[][] { { 0, 0 }, { 0, 0 }, { 11, 15, 8 }, { 0, 0 }, { 0, 0 }, { 0, 0 }, { 0, 2 }, { 0, 0 }, { 10, 9, 13 }, { 0, 0 }, { 1, 6, 5, 6 }, { 0, 0 }, { 0, 0 }, { 0, 5 } };
        B.pa = new byte[] { -1, -1, -1, -1, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 23, 23, 24, 1, 1, 0, 9, 10, 11, 23, 2, 0, 2, 2, 2, 2, 3, 0, 2, 2, 2, 2, 3, 0, 17, 15, 16, 2, 0, 1, 12, 12, 12, 12, 0, 1, 4, 2, 3, 0, 0, 1, 1, 1, 1, 1, 0, 1, 33, 31, 32, 33, 0, 1, 6, 6, 6, 6, 0, 1 };
        B.qa = new byte[][] { { 0, 3, 0, 3, 0, 3, 1, 2, 0, 3, 0, 3, 3, 2, 5, 1, 0, 3, 0, 2, 0, 3, 0, 1, 2, 2, 6, 1, 2, 1, 0, 0 }, { 0, 3, 0, 3, 0, 3, 1, 2, 0, 3, 0, 3, 3, 2, 0, 0, 0, 3, 0, 2, 0, 3, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0 }, { 0, 3, 0, 1, 0, 3, 0, 1, 2, 1, 0, 0, 2, 1, 0, 0, 0, 3, 0, 1, 0, 3, 0, 1, 2, 1, 0, 0, 2, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
        B.ra = new byte[] { 0, 3, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0 };
        B.db = new int[] { -1, 0, -1, 0, 14, 0, -1, 0, -1, 0, 15, 2, -1, 0, -1, 0, 15, 6, -1, 0, -1, 0, 16, 2, -1, 0, -1, 0, 15, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 16, 0, -1, 0, -1, 0, -1, 0, 10, 0, 9, 0, 8, 0, 7, 2, 6, 2, 5, 2, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, 7, 0, 6, 0, 5, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0, -1, 0 };
        eb = new int[4];
    }
}
