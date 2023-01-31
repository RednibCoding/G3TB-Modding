import javax.microedition.lcdui.Displayable;
import java.util.Random;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.microedition.midlet.MIDlet;
import javax.microedition.lcdui.Display;
import java.util.Hashtable;
import java.util.Vector;
import java.io.DataInputStream;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Canvas;

// 
// Decompiled by Procyon v0.5.36
// 

public class A extends Canvas implements Runnable
{
    static HG a;
    static boolean b;
    static boolean c;
    static long d;
    static Thread e;
    static int f;
    static int g;
    static long h;
    static int[] i;
    static Font[] j;
    static long k;
    static long l;
    static Image m;
    static int n;
    static int o;
    static boolean p;
    static boolean q;
    static C r;
    static int s;
    static final byte[][] t;
    static int u;
    static byte[] v;
    static byte[] w;
    static byte[] x;
    static short[] y;
    static short[] z;
    static short[] aa;
    static String[] ba;
    static int[] ca;
    static int[][][] da;
    static int[][] ea;
    static int[][] fa;
    static int[][] ga;
    static int[][] ha;
    static int[][] ia;
    static int[][] ja;
    static int[][] ka;
    static int[][] la;
    static int[][] ma;
    static int[] na;
    static int[][] oa;
    static int[][] pa;
    static int[][] qa;
    static int[][] ra;
    static int[][] sa;
    static int[][] ta;
    static int[][] ua;
    static int[][] va;
    static int[] wa;
    static int[][] xa;
    static int[][] ya;
    static int[] za;
    static int[] aA;
    static int[] bA;
    static int[] cA;
    static int[] dA;
    static int[] eA;
    static int[] fA;
    static int[] gA;
    static int[] hA;
    static int[][] iA;
    static int[][] jA;
    static short[][] kA;
    static int lA;
    static int mA;
    public static int nA;
    public static int oA;
    static boolean pA;
    private static int[] qA;
    private static String rA;
    private static String sA;
    static Image tA;
    static Graphics uA;
    static int vA;
    static int wA;
    static int xA;
    static int yA;
    static boolean zA;
    static int[] ab;
    private static int[] bb;
    static int[] cb;
    static boolean db;
    static boolean eb;
    static boolean fb;
    static int gb;
    static int hb;
    static short[] ib;
    static short jb;
    static short kb;
    static short lb;
    static short mb;
    static String nb;
    static String ob;
    static int pb;
    static int qb;
    static int rb;
    static int sb;
    static int tb;
    static int ub;
    static int vb;
    static int wb;
    static String xb;
    public static int yb;
    static int[] zb;
    public static boolean aB;
    public static boolean bB;
    public static boolean cB;
    public static boolean dB;
    public static boolean eB;
    public static boolean fB;
    private static int gB;
    private static boolean hB;
    private static int iB;
    private static boolean jB;
    private static boolean kB;
    private static int lB;
    private static int mB;
    public static int[] nB;
    public static int[] oB;
    public static int[] pB;
    public static int[] qB;
    public static int[] rB;
    public static int[] sB;
    static int tB;
    static int uB;
    static int vB;
    static int wB;
    static int[] xB;
    static int[] yB;
    static int[] zB;
    private static int[] ac;
    static boolean bc;
    public static short[] cc;
    public static short[][] dc;
    public static Image[][] ec;
    public static int[] fc;
    private static int gc;
    private static int hc;
    private static byte[] ic;
    private static DataInputStream jc;
    static byte[] kc;
    static byte[] lc;
    public static short[] mc;
    public static byte[] nc;
    public static byte[][] oc;
    public static byte[][][][] pc;
    public static byte[][][][] qc;
    public static byte[][][] rc;
    public static short[][][][][] sc;
    public static short[][] tc;
    public static byte[][][] uc;
    public static int[][][][] vc;
    public static byte[][] wc;
    public static Image[][][] xc;
    public static byte[][][] yc;
    private static short[] zc;
    public static int[][][] aC;
    static int[] bC;
    static byte[][] cC;
    static int[][] dC;
    static int[][] eC;
    static int fC;
    static int gC;
    static int hC;
    static int iC;
    static int jC;
    static int[] kC;
    public static int[] lC;
    private static int[] mC;
    private static int[] nC;
    static boolean oC;
    static boolean pC;
    static String[] qC;
    static String rC;
    static String sC;
    static int tC;
    static int uC;
    static int vC;
    static int wC;
    static int xC;
    static int yC;
    static int zC;
    static int ad;
    static int bd;
    static int cd;
    static int dd;
    static int ed;
    static int fd;
    static int[] gd;
    static int hd;
    static boolean id;
    static Vector jd;
    static String[] kd;
    static int ld;
    static int md;
    static int nd;
    static int od;
    static int pd;
    static int[] qd;
    static boolean rd;
    static boolean sd;
    static long td;
    static int ud;
    static int vd;
    static int wd;
    static int xd;
    static int yd;
    static int zd;
    static int aD;
    static int bD;
    static int cD;
    static int dD;
    static int eD;
    static boolean fD;
    static boolean gD;
    private static Hashtable hD;
    private static byte iD;
    static int jD;
    static int kD;
    static int lD;
    static int mD;
    static int nD;
    static boolean oD;
    static String pD;
    public static int[][] qD;
    public static int[][] rD;
    public static boolean sD;
    private static int[] tD;
    public static int[] uD;
    public static int[] vD;
    public static int wD;
    static String xD;
    static int yD;
    public static int zD;
    public static int ae;
    public static int be;
    public static int ce;
    static int[] de;
    static int[] ee;
    static int[] fe;
    static int[] ge;
    static int[] he;
    private static int[] ie;
    private static int[] je;
    static int[] ke;
    static int[] le;
    static int[] me;
    static int[] ne;
    private static int[] oe;
    private static int[] pe;
    private static int[] qe;
    private static int[] re;
    private static int[] se;
    private static int[] te;
    private static int[] ue;
    private static int[] ve;
    static int[] we;
    private static int[] xe;
    private static int[] ye;
    private static int[] ze;
    private static int[] aE;
    private static int[] bE;
    private static int[] cE;
    private static int[] dE;
    private static int[] eE;
    private static int[] fE;
    public static int[] gE;
    private static int[] hE;
    private static int[] iE;
    private static final int[] jE;
    private static int[] kE;
    private static int[] lE;
    private static int[] mE;
    private static int[] nE;
    private static int[] oE;
    private static int[] pE;
    private static int[] qE;
    private static int[] rE;
    private static int[] sE;
    public static long tE;
    public static long uE;
    
    public void A(final int s) {
        this.B();
        A.s = s;
        this.A();
    }
    
    public void A() {
        switch (A.s) {
            case 1: {
                G();
                break;
            }
            case 5: {
                HG.LA(0);
                W(159);
                break;
            }
            case 2: {
                A.m = null;
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                D();
                HG.M(0);
                break;
            }
        }
    }
    
    public void B() {
    }
    
    public void C() {
        switch (A.s) {
            case 1: {
                if ((System.currentTimeMillis() >= A.k + 3000L || A.k == 0L) && A.n < 2) {
                    A.k = System.currentTimeMillis();
                    try {
                        A.m = Image.createImage("/s0" + A.n + "." + "png");
                    }
                    catch (Exception ex) {}
                    ++A.n;
                    if (A.n == 2) {
                        A.k = 0L;
                        (A.r = new C()).A(HG.eb, 1);
                        new Thread((Runnable)A.r).start();
                        A.l = -1L;
                    }
                }
                if (A.r == null || C.c < 100) {
                    break;
                }
                if (A.l < 0L) {
                    A.l = System.currentTimeMillis() + 1000L;
                }
                if (A.l < System.currentTimeMillis()) {
                    this.A(5);
                    HG.iA = true;
                    HG.LA(17);
                    break;
                }
                break;
            }
            case 2: {
                if (System.currentTimeMillis() >= A.k + 3000L || A.k == 0L) {
                    A.k = System.currentTimeMillis();
                    try {
                        if (A.n < 10) {
                            A.m = Image.createImage("/s0" + A.n + "." + "png");
                        }
                        else {
                            A.m = Image.createImage("/s" + A.n + "." + "png");
                        }
                        ++A.n;
                    }
                    catch (Exception ex2) {
                        if (!A.p) {
                            W(159);
                            A.m = A.ec[159][0];
                            A.p = true;
                            ++A.n;
                        }
                        else {
                            A.m = null;
                            this.A(5);
                            HG.LA(0);
                            HG.iA = true;
                        }
                    }
                    break;
                }
                break;
            }
            case 4: {
                HG.fb.destroyApp(false);
                break;
            }
            case 6: {
                synchronized (A.r.h) {
                    if (!HG.iA || HG.jA > 17) {
                        TA();
                        if (!A.oC && !A.id) {
                            KA();
                        }
                        HA();
                        JA();
                        WA();
                        NB();
                        QB();
                        JB();
                    }
                }
                break;
            }
        }
    }
    
    protected void keyPressed(int n) {
        if (this.hasPointerEvents()) {
            switch (n) {
                case 101:
                case 114: {
                    n = 49;
                    break;
                }
                case 116:
                case 121:
                case 122: {
                    n = 50;
                    break;
                }
                case 105:
                case 117: {
                    n = 51;
                    break;
                }
                case 100:
                case 102: {
                    n = 52;
                    break;
                }
                case 103:
                case 104: {
                    n = 53;
                    break;
                }
                case 106:
                case 107: {
                    n = 54;
                    break;
                }
                case 99:
                case 120: {
                    n = 55;
                    break;
                }
                case 98:
                case 118: {
                    n = 56;
                    break;
                }
                case 109:
                case 110: {
                    n = 57;
                    break;
                }
                case 32: {
                    n = 48;
                    break;
                }
                case -4: {
                    n = 35;
                    break;
                }
                case -3: {
                    n = 42;
                    break;
                }
            }
        }
        D();
        E();
        int n2 = -1;
        switch (n) {
            case -1: {
                n2 = 0;
                break;
            }
            case -3: {
                n2 = 1;
                break;
            }
            case -4: {
                n2 = 2;
                break;
            }
            case -2: {
                n2 = 3;
                break;
            }
            case -5: {
                n2 = 4;
                break;
            }
            case 48: {
                n2 = 5;
                break;
            }
            case 49: {
                n2 = 6;
                break;
            }
            case 50: {
                n2 = 7;
                break;
            }
            case 51: {
                n2 = 8;
                break;
            }
            case 52: {
                n2 = 9;
                break;
            }
            case 53: {
                n2 = 10;
                break;
            }
            case 54: {
                n2 = 11;
                break;
            }
            case 55: {
                n2 = 12;
                break;
            }
            case 56: {
                n2 = 13;
                break;
            }
            case 57: {
                n2 = 14;
                break;
            }
            case 35: {
                n2 = 15;
                break;
            }
            case 42: {
                n2 = 16;
                break;
            }
            case -7: {
                n2 = 17;
                break;
            }
            case -6: {
                n2 = 18;
                break;
            }
        }
        if (n2 >= 0) {
            if (A.s == 2 || A.s == 1) {
                A.k = 0L;
            }
            else if (A.s != 3) {
                A.w[n2] = 20;
                A.x[n2] = 0;
            }
        }
    }
    
    protected void keyRepeated(final int n) {
    }
    
    protected void keyReleased(int n) {
        if (this.hasPointerEvents()) {
            switch (n) {
                case 101:
                case 114: {
                    n = 49;
                    break;
                }
                case 116:
                case 121:
                case 122: {
                    n = 50;
                    break;
                }
                case 105:
                case 117: {
                    n = 51;
                    break;
                }
                case 100:
                case 102: {
                    n = 52;
                    break;
                }
                case 103:
                case 104: {
                    n = 53;
                    break;
                }
                case 106:
                case 107: {
                    n = 54;
                    break;
                }
                case 99:
                case 120: {
                    n = 55;
                    break;
                }
                case 98:
                case 118: {
                    n = 56;
                    break;
                }
                case 109:
                case 110: {
                    n = 57;
                    break;
                }
                case 32: {
                    n = 48;
                    break;
                }
                case -4: {
                    n = 35;
                    break;
                }
                case -3: {
                    n = 42;
                    break;
                }
            }
        }
        switch (n) {
            case -1: {
                A.x[0] = 10;
                break;
            }
            case -3: {
                A.x[1] = 10;
                break;
            }
            case -4: {
                A.x[2] = 10;
                break;
            }
            case -2: {
                A.x[3] = 10;
                break;
            }
            case -5: {
                A.x[4] = 10;
                break;
            }
            case 48: {
                A.x[5] = 10;
                break;
            }
            case 49: {
                A.x[6] = 10;
                break;
            }
            case 50: {
                A.x[7] = 10;
                break;
            }
            case 51: {
                A.x[8] = 10;
                break;
            }
            case 52: {
                A.x[9] = 10;
                break;
            }
            case 53: {
                A.x[10] = 10;
                break;
            }
            case 54: {
                A.x[11] = 10;
                break;
            }
            case 55: {
                A.x[12] = 10;
                break;
            }
            case 56: {
                A.x[13] = 10;
                break;
            }
            case 57: {
                A.x[14] = 10;
                break;
            }
            case 35: {
                A.x[15] = 10;
                break;
            }
            case 42: {
                A.x[16] = 10;
                break;
            }
            case -7: {
                A.x[17] = 10;
                break;
            }
            case -6: {
                A.x[18] = 10;
                break;
            }
        }
    }
    
    static void D() {
        for (int i = 0; i < 20; ++i) {
            A.x[i] = 10;
        }
    }
    
    static void E() {
        for (int i = 0; i < 20; ++i) {
            if (A.w[i] == 30 && (A.x[i] == 10 || A.x[i] == 40)) {
                A.w[i] = 10;
                A.x[i] = 0;
            }
        }
        for (int j = 0; j < A.u; ++j) {
            final byte[] array = A.t[j];
            final int b = B(array[0]);
            final int length = array.length;
            boolean b2 = false;
            boolean b3 = false;
            for (int k = 2; k < length; ++k) {
                final byte b4 = array[k];
                if (A.w[b4] == 20) {
                    b3 = true;
                }
                else if (A.w[b4] == 30) {
                    b2 = true;
                }
            }
            if (b3) {
                A.v[b] = 5;
            }
            else if (b2) {
                A.v[b] = 10;
            }
            else {
                A.v[b] = 0;
            }
        }
        for (int l = 0; l < 20; ++l) {
            if (A.w[l] == 20) {
                A.w[l] = 30;
            }
        }
    }
    
    static int B(final int n) {
        int n2 = -1;
        for (int i = A.u - 1; i >= 0; --i) {
            if (n == A.t[i][0]) {
                n2 = i;
                break;
            }
        }
        return n2;
    }
    
    static boolean C(int b) {
        boolean b2 = false;
        b = B(b);
        if (b >= 0) {
            b2 = (A.v[b] == 5);
            if (!b2) {
                final byte[] array = A.t[b];
                b = ((A.v[b] == 10) ? 1 : 0);
                if (b != 0) {
                    b = ((b2 = (array[1] == 15)) ? 1 : 0);
                }
            }
        }
        return b2;
    }
    
    static void F() {
        for (int length = A.v.length, i = 0; i < length; ++i) {
            A.v[i] = 0;
        }
    }
    
    public static void A(final String s, int n, int n2, int n3, int n4, final Graphics graphics) {
        n += 0;
        n2 += 0;
        final short n5 = A.y[n3 * 11 + 4];
        short n6 = A.y[n3 * 11 + 0];
        short n7 = A.y[n3 * 11 + 1];
        int n8 = A.y[n3 * 11 + 2];
        int n9 = A.y[n3 * 11 + 3];
        n4 = (((n5 & 0x100) == 0x100) ? 1 : 0);
        final boolean b = (n5 & 0x80) == 0x80;
        final boolean b2 = (n5 & 0x200) == 0x200;
        if (n4 != 0) {
            final short n10 = A.y[n3 * 11 + 6];
            final short n11 = A.y[n3 * 11 + 7];
            n4 = n10 + A.y[n3 * 11 + 8];
            final int n12 = n11 + A.y[n3 * 11 + 9];
            final int n13 = n6 + n8;
            n3 = n7 + n9;
            if (n6 < n10) {
                n6 = n10;
            }
            if (n7 < n11) {
                n7 = n11;
            }
            if (n13 > n4) {
                n8 = n4 - n6;
            }
            if (n3 > n12) {
                n9 = n12 - n7;
            }
        }
        if (n8 <= 0 || n9 <= 0) {
            return;
        }
        graphics.setClip((int)n6, (int)n7, n8, n9);
        if (b) {
            n3 = graphics.getColor();
            graphics.setColor(3);
            graphics.drawString(s, n + 2, n2 + 1, 20);
            graphics.drawString(s, n + 2, n2, 20);
            graphics.drawString(s, n + 2, n2 - 1, 20);
            graphics.drawString(s, n + 1, n2 + 1, 20);
            graphics.drawString(s, n + 1, n2 - 1, 20);
            graphics.drawString(s, n, n2 + 1, 20);
            graphics.drawString(s, n, n2, 20);
            graphics.drawString(s, n, n2 - 1, 20);
            graphics.setColor(n3);
            graphics.drawString(s, n + 1, n2, 20);
        }
        else if (b2) {
            n3 = graphics.getColor();
            graphics.setColor(3);
            graphics.drawString(s, n + 2, n2 + 1, 20);
            graphics.setColor(n3);
            graphics.drawString(s, n + 1, n2, 20);
        }
        else {
            graphics.drawString(s, n + 1, n2, 20);
        }
    }
    
    public static void A(final int n, final boolean b) {
        if (b) {
            A.y[n * 11 + 5] = 1;
        }
        else {
            A.y[n * 11 + 5] = 0;
        }
    }
    
    public static void A(final int n, final int n2, final int n3, final int n4, final int n5) {
        A.y[n * 11 + 6] = (short)n2;
        A.y[n * 11 + 7] = (short)n3;
        A.y[n * 11 + 8] = (short)n4;
        A.y[n * 11 + 9] = (short)n5;
    }
    
    public static void A(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        A.y[n * 11 + 0] = (short)n2;
        A.y[n * 11 + 1] = (short)n3;
        A.y[n * 11 + 2] = (short)n4;
        A.y[n * 11 + 3] = (short)n5;
        A.y[n * 11 + 4] = (short)n6;
        A(n, true);
    }
    
    public static void A(final int n, final int n2, final int n3) {
        A.z[n * 3 + 0] = (short)n2;
        A.z[n * 3 + 1] = (short)n3;
        A.z[n * 3 + 2] = 0;
    }
    
    public static void A(final int n, final int n2) {
        A.y[n * 11 + 10] = (short)n2;
    }
    
    public static void A(final String s, final int n, final int n2, final Graphics graphics) {
        if (A.y[n * 11 + 5] == 1) {
            String[] array;
            if ((A.y[n * 11 + 4] & 0x20) == 0x20) {
                array = HG.A(s, A.j[n2], (int)A.y[n * 11 + 2], 0);
            }
            else {
                array = A.ba;
                array[0] = s;
            }
            A(array, n, n2, graphics);
        }
    }
    
    public static void A(final String[] array, final int n, final int n2, final Graphics graphics) {
        if (A.y[n * 11 + 5] == 1) {
            final short n3 = A.y[n * 11 + 4];
            final short n4 = A.y[n * 11 + 0];
            int n5 = A.y[n * 11 + 1];
            final short n6 = A.y[n * 11 + 2];
            final short n7 = A.y[n * 11 + 3];
            final Font font = A.j[n2];
            final int height = A.j[n2].getHeight();
            if ((n3 & 0x8) == 0x8) {
                n5 += (n7 - height) / 2;
            }
            final int n8 = array.length * height + A.y[n * 11 + 10];
            final int stringWidth = font.stringWidth(array[0]);
            final boolean b = (n3 & 0x1) == 0x1;
            final boolean b2 = (n3 & 0x2) == 0x2;
            final boolean b3 = (n3 & 0x4) == 0x4;
            final boolean b4 = (n3 & 0x10) == 0x10;
            final boolean b5 = (n3 & 0x40) == 0x40;
            if ((n3 & 0x80) == 0x80) {}
            if ((n3 & 0x200) == 0x200) {}
            if ((n3 & 0x20) == 0x20) {}
            int n9 = 0;
            final boolean b6 = A.z[n * 3 + 0] != 0;
            short n10 = 0;
            short n11 = A.z[n * 3 + 0];
            short n12 = A.z[n * 3 + 1];
            boolean b7 = false;
            int n13 = -1;
            if (!b5) {
                if (b4) {
                    final int n14 = stringWidth - n6 + 20;
                    short n15 = A.z[n * 3 + 2];
                    if (n15 < 0) {
                        n15 = (short)(-n15);
                    }
                    if (stringWidth > n6) {
                        b7 = true;
                        if (n15 >= n14) {
                            n13 = stringWidth + 20;
                        }
                    }
                    else if (n12 == 0) {
                        A.z[n * 3 + 2] = 0;
                    }
                    if (n8 > n7) {
                        b7 = true;
                        if (n8 <= n15) {
                            A.z[n * 3 + 2] = n7;
                        }
                    }
                    else if (n11 == 0) {
                        A.z[n * 3 + 2] = 0;
                    }
                }
            }
            else if (b4) {
                if (stringWidth > n6) {
                    b7 = true;
                }
                else if (n12 == 0) {
                    A.z[n * 3 + 2] = 0;
                }
                if (n8 > n7) {
                    b7 = true;
                }
                else if (n11 == 0) {
                    A.z[n * 3 + 2] = 0;
                }
            }
            if (b5 && b7) {
                final short n16 = A.z[n * 3 + 2];
                final int n17 = n7 - n8;
                A.aa[n * 1 + 0] = 0;
                if (n16 < n17) {
                    A.z[n * 3 + 2] = (short)n17;
                    A.aa[n * 1 + 0] = 1;
                }
                if (n16 > 0) {
                    A.z[n * 3 + 2] = 0;
                    A.aa[n * 1 + 0] = 2;
                }
            }
            graphics.setFont(font);
            for (short n18 = 0; n18 < array.length; ++n18) {
                final int stringWidth2 = font.stringWidth(array[n18]);
                if (stringWidth2 > n10) {
                    n10 = (short)stringWidth2;
                }
                if (b) {
                    n9 = n4;
                }
                else if (b2) {
                    n9 = n4 + (n6 - stringWidth2);
                }
                else if (b3) {
                    n9 = n4 + (n6 - stringWidth2 >> 1);
                    if (n9 < A.y[n * 11 + 0]) {
                        n9 = A.y[n * 11 + 0];
                    }
                }
                int n19 = n5;
                if (b6) {
                    n11 = A.z[n * 3 + 0];
                    if (n11 != 0) {
                        n9 += A.z[n * 3 + 2];
                        if (stringWidth2 > n6 && n9 + n13 <= A.y[n * 11 + 0] && n13 != -1) {
                            A.z[n * 3 + 2] = 0;
                        }
                    }
                }
                else {
                    n12 = A.z[n * 3 + 1];
                    if (n12 != 0) {
                        n19 += A.z[n * 3 + 2];
                        if (n8 <= n7 || n19 - 1 <= A.y[n * 11 + 1]) {}
                    }
                }
                A(array[n18], n9, n19 + n18 * height, n, n2, graphics);
                if (n13 > 0) {
                    A(array[n18], n9 + n13, n19 + n18 * height, n, n2, graphics);
                }
            }
            if (b7) {
                font.stringWidth(array[0]);
                if (!b5) {
                    if (n11 != 0) {
                        final short[] z = A.z;
                        final int n20 = n * 3 + 2;
                        z[n20] += n11;
                    }
                    else {
                        final short[] z2 = A.z;
                        final int n21 = n * 3 + 2;
                        z2[n21] += n12;
                    }
                }
            }
        }
    }
    
    static boolean G() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aconst_null    
        //     4: astore_0       
        //     5: iconst_0       
        //     6: istore_2       
        //     7: new             Ljava/io/DataInputStream;
        //    10: dup            
        //    11: getstatic       HG.fb:LHG;
        //    14: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    17: ldc             "/a"
        //    19: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //    22: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //    25: astore_0       
        //    26: aload_0        
        //    27: invokevirtual   java/io/DataInputStream.readShort:()S
        //    30: newarray        S
        //    32: putstatic       A.cc:[S
        //    35: iconst_0       
        //    36: istore_1       
        //    37: iload_1        
        //    38: getstatic       A.cc:[S
        //    41: arraylength    
        //    42: if_icmpge       60
        //    45: getstatic       A.cc:[S
        //    48: iload_1        
        //    49: aload_0        
        //    50: invokevirtual   java/io/DataInputStream.readShort:()S
        //    53: sastore        
        //    54: iinc            1, 1
        //    57: goto            37
        //    60: aload_0        
        //    61: invokevirtual   java/io/DataInputStream.readShort:()S
        //    64: anewarray       [S
        //    67: putstatic       HG.hA:[[S
        //    70: iconst_0       
        //    71: istore_3       
        //    72: iload_3        
        //    73: getstatic       HG.hA:[[S
        //    76: arraylength    
        //    77: if_icmpge       126
        //    80: getstatic       HG.hA:[[S
        //    83: iload_3        
        //    84: aload_0        
        //    85: invokevirtual   java/io/DataInputStream.readShort:()S
        //    88: newarray        S
        //    90: aastore        
        //    91: iconst_0       
        //    92: istore_1       
        //    93: iload_1        
        //    94: getstatic       HG.hA:[[S
        //    97: iload_3        
        //    98: aaload         
        //    99: arraylength    
        //   100: if_icmpge       120
        //   103: getstatic       HG.hA:[[S
        //   106: iload_3        
        //   107: aaload         
        //   108: iload_1        
        //   109: aload_0        
        //   110: invokevirtual   java/io/DataInputStream.readShort:()S
        //   113: sastore        
        //   114: iinc            1, 1
        //   117: goto            93
        //   120: iinc            3, 1
        //   123: goto            72
        //   126: aload_0        
        //   127: invokevirtual   java/io/DataInputStream.readShort:()S
        //   130: newarray        I
        //   132: putstatic       A.qA:[I
        //   135: iconst_0       
        //   136: istore_1       
        //   137: iload_1        
        //   138: getstatic       A.qA:[I
        //   141: arraylength    
        //   142: if_icmpge       160
        //   145: getstatic       A.qA:[I
        //   148: iload_1        
        //   149: aload_0        
        //   150: invokevirtual   java/io/DataInputStream.readShort:()S
        //   153: iastore        
        //   154: iinc            1, 1
        //   157: goto            137
        //   160: aload_0        
        //   161: invokevirtual   java/io/DataInputStream.close:()V
        //   164: aconst_null    
        //   165: astore_0       
        //   166: aload_0        
        //   167: ifnull          174
        //   170: aload_0        
        //   171: invokevirtual   java/io/DataInputStream.close:()V
        //   174: goto            178
        //   177: pop            
        //   178: goto            214
        //   181: pop            
        //   182: iconst_1       
        //   183: istore_2       
        //   184: aload_0        
        //   185: ifnull          192
        //   188: aload_0        
        //   189: invokevirtual   java/io/DataInputStream.close:()V
        //   192: goto            196
        //   195: pop            
        //   196: goto            214
        //   199: astore_2       
        //   200: aload_0        
        //   201: ifnull          208
        //   204: aload_0        
        //   205: invokevirtual   java/io/DataInputStream.close:()V
        //   208: goto            212
        //   211: pop            
        //   212: aload_2        
        //   213: athrow         
        //   214: invokestatic    java/lang/System.gc:()V
        //   217: iload_2        
        //   218: ireturn        
        //    StackMap: 00 14 00 25 00 03 07 03 46 01 01 00 00 00 3C 00 03 07 03 46 01 01 00 00 00 48 00 04 07 03 46 01 01 01 00 00 00 5D 00 04 07 03 46 01 01 01 00 00 00 78 00 04 07 03 46 01 01 01 00 00 00 7E 00 04 07 03 46 01 01 01 00 00 00 89 00 04 07 03 46 01 01 01 00 00 00 A0 00 04 07 03 46 01 01 01 00 00 00 AE 00 04 05 01 01 01 00 00 00 B1 00 04 05 01 01 01 00 01 07 02 F2 00 B2 00 04 05 01 01 01 00 00 00 B5 00 03 07 03 46 00 01 00 01 07 02 F2 00 C0 00 03 07 03 46 00 01 00 00 00 C3 00 03 07 03 46 00 01 00 01 07 02 F2 00 C4 00 03 07 03 46 00 01 00 00 00 C7 00 03 07 03 46 00 01 00 01 07 06 AB 00 D0 00 03 07 03 46 00 07 06 AB 00 00 00 D3 00 03 07 03 46 00 07 06 AB 00 01 07 02 F2 00 D4 00 03 07 03 46 00 07 06 AB 00 00 00 D6 00 03 07 03 46 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      166    181    199    Ljava/lang/Exception;
        //  7      166    199    214    Any
        //  181    184    199    214    Any
        //  199    200    199    214    Any
        //  200    208    211    212    Ljava/lang/Exception;
        //  184    192    195    196    Ljava/lang/Exception;
        //  166    174    177    178    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void H() {
        A.ca = new int[55];
        A.da = new int[6][15][];
        for (int i = 0; i < 15; ++i) {
            A.da[0][i] = new int[9];
            A.da[1][i] = new int[9];
            A.da[2][i] = new int[7];
            A.da[3][i] = new int[8];
            A.da[4][i] = new int[6];
            A.da[5][i] = new int[6];
        }
        A.na = new int[23];
        A.ya = new int[19][4];
        A.za = null;
        A.aA = null;
        A.cA = null;
        A.bA = null;
        A.dA = null;
        A.eA = null;
        A.fA = null;
        A.gA = null;
    }
    
    public static boolean I() {
        if (A.h == 2579220938L) {
            A.pA = !A.pA;
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
            return true;
        }
        if (A.h == 2578033336L) {
            final int[] ca = A.ca;
            final int n = 12;
            ca[n] &= 0xFFFF0000;
            final int[] ca2 = A.ca;
            final int n2 = 12;
            ca2[n2] |= 0x0;
            J(A.ca[4], A.ca[5], 4096);
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
            return true;
        }
        if (A.h == 41284439224L) {
            A(4, 5, true, false, A.ca);
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
            return true;
        }
        if (A.h == 659427265720L) {
            A(5, 5, true, false, A.ca);
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
            return true;
        }
        if (A.h == 10555380766664L) {
            A(2, 10, true, false, A.ca);
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
            return true;
        }
        if (A.h == 41297607096L) {
            A(24, 10, true, false, A.ca);
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
        }
        else {
            if (A.h == 41217071517L) {
                A(3, 10, true, false, A.ca);
                if (HG.MA(3)) {
                    Display.getDisplay((MIDlet)A.a).vibrate(500);
                }
                return true;
            }
            if (A.h == 659437426872L) {
                if (A.gB >= 0) {
                    A(10000, A.ea[A.gB], A.ca);
                }
                if (HG.MA(3)) {
                    Display.getDisplay((MIDlet)A.a).vibrate(500);
                }
                return true;
            }
            if (A.h == 41230911865L) {
                K(1000);
                if (HG.MA(3)) {
                    Display.getDisplay((MIDlet)A.a).vibrate(500);
                }
                return true;
            }
        }
        return false;
    }
    
    static boolean B(final int n, final int n2, final int n3) {
        return n3 >= n && n3 < n2;
    }
    
    static int A(final int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i][4] < 0) {
                return i;
            }
        }
        return -1;
    }
    
    static int D(int i) {
        int n = 1;
        if ((i & 0x20) != 0x0) {
            n = 1;
        }
        else if ((i & 0x1000) != 0x0) {
            n = 1 + A.ea.length;
        }
        else if ((i & 0x40) != 0x0) {
            n = 1 + (A.ea.length + A.pa.length);
        }
        else if ((i & 0x80) != 0x0) {
            n = 1 + (A.ea.length + A.pa.length + A.ga.length);
        }
        else if ((i & 0x100) != 0x0) {
            n = 1 + (A.ea.length + A.pa.length + A.ga.length + A.ia.length);
        }
        else if ((i & 0x200) != 0x0) {
            n = 1 + (A.ea.length + A.pa.length + A.ga.length + A.ia.length + A.ka.length);
        }
        else if ((i & 0x2000) != 0x0) {
            n = 1 + (A.ea.length + A.pa.length + A.ga.length + A.ia.length + A.ka.length + A.ma.length);
        }
        else if ((i & 0x400) != 0x0) {
            n = 1 + (A.ea.length + A.pa.length + A.ga.length + A.ia.length + A.ka.length + A.ma.length + A.sa.length);
        }
        for (i = n; i < B.a.length; ++i) {
            if (B.a[i][4] < 0) {
                return i;
            }
        }
        return -1;
    }
    
    static int[] B(final int n, final int n2) {
        switch (n) {
            case 6: {
                return A.ea[n2];
            }
            case 2: {
                return A.ka[n2];
            }
            case 0: {
                return A.ga[n2];
            }
            case 1: {
                return A.ia[n2];
            }
            case 3: {
                return A.sa[n2];
            }
            case 7: {
                return A.pa[n2];
            }
            case 5: {
                return A.ma[n2];
            }
            case 4: {
                return A.ua[n2];
            }
            default: {
                return null;
            }
        }
    }
    
    static int[] A(final int[] array) {
        if ((array[3] & 0x20) != 0x0) {
            return A.fa[array[11]];
        }
        if ((array[3] & 0x40) != 0x0) {
            return A.ha[array[4]];
        }
        if ((array[3] & 0x80) != 0x0) {
            return A.ja[array[4]];
        }
        if ((array[3] & 0x100) != 0x0) {
            return A.la[array[4]];
        }
        if ((array[3] & 0x200) != 0x0) {
            return A.oa[array[4]];
        }
        if ((array[3] & 0x1000) != 0x0) {
            return A.qa[array[4]];
        }
        if ((array[3] & 0x2000) != 0x0) {
            return A.ta[array[4]];
        }
        if ((array[3] & 0x400) != 0x0) {
            return A.va[array[4]];
        }
        return null;
    }
    
    static void B(final int[][] array) {
        for (int i = 0; i < array.length; ++i) {
            array[i][4] = -1;
            array[i][0] = -1;
        }
    }
    
    static void A(final int[] array, final boolean b) {
        if (A.wa == null) {
            return;
        }
        final int n = array[3];
        if ((n & 0x10) != 0x0) {
            final int f = F(array);
            final short n2 = (short)(f & 0xFFFF);
            final short n3 = (short)((f & 0xFFFF0000) >> 16);
            final int n4 = n2 + 1;
            final int n5 = n3 + 1;
            int n6 = 16384;
            if (b) {
                n6 = 0;
            }
            for (int i = n3; i <= n5; ++i) {
                for (int j = n2; j <= n4; ++j) {
                    if (i >= 0 && j >= 0 && i <= B.c * 2) {
                        if (j < B.b * 2) {
                            if ((A.wa[i * B.b * 2 * 3 + j * 3 + 2] & 0xC000) != 0x8000) {
                                final int[] wa = A.wa;
                                final int n7 = i * B.b * 2 * 3 + j * 3 + 2;
                                wa[n7] &= 0xFFFF3FFF;
                                final int[] wa2 = A.wa;
                                final int n8 = i * B.b * 2 * 3 + j * 3 + 2;
                                wa2[n8] |= (n6 & 0xC000);
                            }
                        }
                    }
                }
            }
            array[3] = n;
        }
        else if ((n & 0x20) != 0x0) {
            final int[] a = A(array);
            final int f2 = F(array);
            final short n9 = (short)(f2 & 0xFFFF);
            final short n10 = (short)((f2 & 0xFFFF0000) >> 16);
            final int n11 = n9 + ((short)(a[3] & 0xFFFF) - (short)(a[2] & 0xFFFF) >> 11);
            final int n12 = n10 + ((short)((a[3] & 0xFFFF0000) >> 16) - (short)((a[2] & 0xFFFF0000) >> 16) >> 11);
            int n13 = 16384;
            if (b || (n & 0x8000) != 0x0) {
                n13 = 0;
            }
            for (int k = n10; k <= n12; ++k) {
                for (int l = n9; l <= n11; ++l) {
                    if (k >= 0 && l >= 0 && k <= B.c * 2) {
                        if (l < B.b * 2) {
                            if ((A.wa[k * B.b * 2 * 3 + l * 3 + 2] & 0xC000) != 0x8000) {
                                final int[] wa3 = A.wa;
                                final int n14 = k * B.b * 2 * 3 + l * 3 + 2;
                                wa3[n14] &= 0xFFFF3FFF;
                                final int[] wa4 = A.wa;
                                final int n15 = k * B.b * 2 * 3 + l * 3 + 2;
                                wa4[n15] |= (n13 & 0xC000);
                            }
                        }
                    }
                }
            }
        }
        else {
            if ((n & 0x1000) == 0x0) {
                return;
            }
            final int[] a2 = A(array);
            B.A(array, B.y);
            final int n16 = B.y[0] + (short)(a2[2] & 0xFFFF) >> 11;
            final int n17 = B.y[1] + (short)((a2[2] & 0xFFFF0000) >> 16) >> 11;
            final int n18 = B.y[0] + (short)(a2[3] & 0xFFFF) >> 11;
            final int n19 = B.y[1] + (short)((a2[3] & 0xFFFF0000) >> 16) >> 11;
            int n20 = 32768;
            if (b || (n & 0x8000) != 0x0) {
                n20 = 16384;
            }
            for (int n21 = n17; n21 <= n19; ++n21) {
                for (int n22 = n16; n22 <= n18; ++n22) {
                    if (n21 >= 0 && n22 >= 0 && n21 <= B.c * 2) {
                        if (n22 < B.b * 2) {
                            final int[] wa5 = A.wa;
                            final int n23 = n21 * B.b * 2 * 3 + n22 * 3 + 2;
                            wa5[n23] &= 0xFFFF3FFF;
                            final int[] wa6 = A.wa;
                            final int n24 = n21 * B.b * 2 * 3 + n22 * 3 + 2;
                            wa6[n24] |= (n20 & 0xC000);
                        }
                    }
                }
            }
            array[3] = n;
        }
    }
    
    static void A(int i, int n, int n2, int n3, final boolean b) {
        if (A.wa == null) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (n < 0) {
            n = 0;
        }
        if (n2 > B.b * 2) {
            n2 = B.b * 2;
        }
        if (n3 > B.c * 2) {
            n3 = B.c * 2;
        }
        for (int j = i; j < n2; ++j) {
            for (int k = n; k < n3; ++k) {
                final int[] wa = A.wa;
                final int n4 = k * B.b * 2 * 3 + j * 3 + 2;
                wa[n4] &= 0xFFFF3FFF;
                final int[] wa2 = A.wa;
                final int n5 = k * B.b * 2 * 3 + j * 3 + 2;
                wa2[n5] |= 0x0;
                if (b) {
                    final int[] wa3 = A.wa;
                    final int n6 = k * B.b * 2 * 3 + j * 3 + 2;
                    wa3[n6] &= 0xFFFF;
                    final int[] wa4 = A.wa;
                    final int n7 = k * B.b * 2 * 3 + j * 3 + 2;
                    wa4[n7] |= 0xFFFF0000;
                }
                if ((B.g[k >> 1][j >> 1] & 0x8000) == 0x0 || (B.g[k >> 1][j >> 1] & 0xFF) == 0xFF) {
                    final int[] wa5 = A.wa;
                    final int n8 = k * B.b * 2 * 3 + j * 3 + 2;
                    wa5[n8] &= 0xFFFF3FFF;
                    final int[] wa6 = A.wa;
                    final int n9 = k * B.b * 2 * 3 + j * 3 + 2;
                    wa6[n9] |= 0x8000;
                }
                else {
                    B.t[0] = j << 11;
                    B.t[2] = (j << 11) + 2048;
                    B.t[1] = k << 11;
                    B.t[3] = (k << 11) + 2048;
                    int[] wa7;
                    int n10;
                    int[] wa8;
                    int n11;
                    for (i = B.A(B.t, 4144); i != -1; i = (short)((B.a[i][1] & 0xFFFF0000) >> 16)) {
                        if ((B.a[i][3] & 0x1000) != 0x0) {
                            if ((B.a[i][3] & 0x8000) == 0x0) {
                                wa7 = A.wa;
                                n10 = k * B.b * 2 * 3 + j * 3 + 2;
                                wa7[n10] &= 0xFFFF3FFF;
                                wa8 = A.wa;
                                n11 = k * B.b * 2 * 3 + j * 3 + 2;
                                wa8[n11] |= 0x8000;
                            }
                        }
                        else if ((A.wa[k * B.b * 2 * 3 + j * 3 + 2] & 0xC000) != 0x8000 && ((B.a[i][3] & 0x20) != 0x0 || (B.a[i][3] & 0x10) != 0x0) && (B.a[i][3] & 0x8000) == 0x0) {
                            A(B.a[i], false);
                        }
                    }
                }
            }
        }
    }
    
    static boolean C(final int n, final int n2) {
        return n >= 0 && n2 >= 0 && n2 < B.g.length && n < B.g[n2].length && (B.g[n2][n] & 0x8000) != 0x0 && (B.g[n2][n] & 0xFF) != 0xFF;
    }
    
    static boolean A(final int n, final int n2, int n3, final int n4, final boolean b, final boolean b2) {
        if (n3 < 0 || n4 < 0 || n4 >= B.c * 2 || n3 >= B.b * 2 || (A.wa[n4 * B.b * 2 * 3 + n3 * 3 + 2] & 0xC000) == 0x8000) {
            return false;
        }
        if ((A.wa[n4 * B.b * 2 * 3 + n3 * 3 + 2] & 0xC000) == 0x4000) {
            return false;
        }
        if (b) {
            B.A(A.ea[n], B.y);
            final int[] a = A(A.ea[n]);
            final int n5 = n3 + ((short)(a[3] & 0xFFFF) - (short)(a[2] & 0xFFFF) >> 11);
            final int n6 = n4 + ((short)((a[3] & 0xFFFF0000) >> 16) - (short)((a[2] & 0xFFFF0000) >> 16) >> 11);
            for (int i = n3; i <= n5; ++i) {
                for (int j = n4; j <= n6; ++j) {
                    if (!A(n, n2, i, j, false, b2)) {
                        return false;
                    }
                }
            }
        }
        if (b2 && (short)((A.wa[n4 * B.b * 2 * 3 + n3 * 3 + 2] & 0xFFFF0000) >> 16) >= 0) {
            final byte b3 = (byte)(A.wa[n4 * B.b * 2 * 3 + n3 * 3 + 2] >> 16 & 0xFF);
            n3 = (byte)(A.wa[n4 * B.b * 2 * 3 + n3 * 3 + 2] >> 24 & 0xFF) - A.ea[b3][24];
            if (b3 == n || n3 < 0) {
                return true;
            }
            if (n3 >= n2 && n3 <= n2) {
                return false;
            }
        }
        return true;
    }
    
    public static final int B(final int[] array) {
        if (array.length > 2) {
            return C(array);
        }
        final long n = array[0];
        final long n2 = array[1];
        final long n3 = n * n + n2 * n2;
        int n4 = (int)n3;
        boolean b = false;
        if (n3 != n4) {
            n4 = (int)(n3 + 128L >> 8);
            b = true;
        }
        int f = F(n4);
        if (b) {
            f <<= 4;
        }
        return f;
    }
    
    public static final int C(final int[] array) {
        if (array.length <= 2) {
            return B(array);
        }
        final long n = array[0];
        final long n2 = array[1];
        final long n3 = array[2];
        final long n4 = n * n + n2 * n2 + n3 * n3;
        int n5 = (int)n4;
        boolean b = false;
        if (n4 != n5) {
            n5 = (int)(n4 + 512L >> 10);
            b = true;
        }
        int f = F(n5);
        if (b) {
            f <<= 5;
        }
        return f;
    }
    
    public static final long A(final int[] array, final int[] array2) {
        final long n = array[0] - array2[0];
        final long n2 = array[1] - array2[1];
        return n * n + n2 * n2;
    }
    
    public static final void B(final int[] array, final int[] array2) {
        final int b = B(array);
        if (b != 0) {
            for (int i = 0; i < array.length; ++i) {
                array2[i] = (array[i] << 8) / b;
            }
        }
        else {
            for (int j = 0; j < array.length; ++j) {
                array2[j] = 0;
            }
        }
    }
    
    public static final void A(final int[] array, final int n, final int[] array2) {
        B(array, array2);
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = array2[i] * n >> 8;
        }
    }
    
    public static final int E(final int n) {
        return (n > 0) ? n : (-n);
    }
    
    public static int F(int n) {
        final int n2 = n;
        if (n2 >= 65536) {
            if (n2 >= 16777216) {
                if (n2 >= 268435456) {
                    if (n2 >= 1073741824) {
                        n = A.qA[n2 >> 24] << 8;
                    }
                    else {
                        n = A.qA[n2 >> 22] << 7;
                    }
                }
                else if (n2 >= 67108864) {
                    n = A.qA[n2 >> 20] << 6;
                }
                else {
                    n = A.qA[n2 >> 18] << 5;
                }
                n = n + 1 + n2 / n >> 1;
                n = n + 1 + n2 / n >> 1;
                return (n * n > n2) ? (--n) : n;
            }
            if (n2 >= 1048576) {
                if (n2 >= 4194304) {
                    n = A.qA[n2 >> 16] << 4;
                }
                else {
                    n = A.qA[n2 >> 14] << 3;
                }
            }
            else if (n2 >= 262144) {
                n = A.qA[n2 >> 12] << 2;
            }
            else {
                n = A.qA[n2 >> 10] << 1;
            }
            n = n + 1 + n2 / n >> 1;
            return (n * n > n2) ? (--n) : n;
        }
        else {
            if (n2 >= 256) {
                if (n2 >= 4096) {
                    if (n2 >= 16384) {
                        n = A.qA[n2 >> 8] + 1;
                    }
                    else {
                        n = (A.qA[n2 >> 6] >> 1) + 1;
                    }
                }
                else if (n2 >= 1024) {
                    n = (A.qA[n2 >> 4] >> 2) + 1;
                }
                else {
                    n = (A.qA[n2 >> 2] >> 3) + 1;
                }
                return (n * n > n2) ? (--n) : n;
            }
            if (n2 >= 0) {
                return A.qA[n2] >> 4;
            }
            return -1;
        }
    }
    
    public static void A(final Graphics graphics) {
        graphics.setClip(0, 0, A.f, A.g);
        graphics.setColor(A.i[3]);
        graphics.fillRect(0, 0, A.f, A.g);
        graphics.setColor(A.i[0]);
        A(3, 0, 0, A.f, A.g, 44);
        A(A.sA, 3, 1, graphics);
    }
    
    public static void B(final Graphics graphics) {
        try {
            graphics.setColor(A.i[27 + A.n - 1]);
        }
        catch (Exception ex) {
            graphics.setColor(16777215);
        }
        graphics.fillRect(0, 0, A.f, A.g);
        if (A.m != null) {
            graphics.drawImage(A.m, A.f / 2, A.g / 2, 3);
        }
    }
    
    public static void C(final Graphics graphics) {
        if (A.c) {
            A(graphics);
            return;
        }
        graphics.setClip(0, 0, A.f, A.g);
        graphics.setColor(0);
        graphics.fillRect(0, 0, A.f, A.g);
        switch (A.s) {
            case 2: {
                B(graphics);
                break;
            }
            case 1:
            case 3: {
                if (A.r != null) {
                    final int n = A.f >> 1;
                    final int height = A.j[1].getHeight();
                    int c = C.c;
                    if (c > 100) {
                        c = 100;
                    }
                    graphics.setFont(A.j[1]);
                    graphics.setClip(0, 0, A.f, A.g);
                    try {
                        if (A.m != null) {
                            graphics.setColor(A.i[27]);
                        }
                        else {
                            graphics.setColor(A.i[8]);
                        }
                    }
                    catch (Exception ex) {
                        graphics.setColor(16777215);
                    }
                    graphics.fillRect(0, 0, A.f, A.g);
                    int n2;
                    if (A.m != null) {
                        graphics.drawImage(A.m, A.f / 2, A.g / 2, 3);
                        graphics.setColor(A.i[3]);
                        n2 = A.g - height - 20 + 0;
                    }
                    else {
                        graphics.setColor(A.i[5]);
                        n2 = A.g >> 1;
                    }
                    try {
                        graphics.drawString(A.rA, n + 0, n2 - height + 0, 17);
                    }
                    catch (Exception ex2) {}
                    n2 += 5;
                    graphics.drawRect(n - (A.f >> 1) / 2, n2, A.f >> 1, 10);
                    graphics.fillRect(n + 2 - (A.f >> 1) / 2, n2 + 2, ((A.f >> 1) - 3) * c / 100, 7);
                    break;
                }
                if (A.s == 1) {
                    B(graphics);
                    break;
                }
                break;
            }
            case 6: {
                synchronized (A.r.h) {
                    if (A.ca[11] != 0) {
                        D(graphics);
                    }
                    else {
                        E(graphics);
                    }
                }
                break;
            }
        }
    }
    
    static void J() {
        System.gc();
        A.xA = A.f / B.d + 2;
        A.yA = A.g / B.e + 2;
        A.tA = Image.createImage(A.xA * B.d, A.yA * B.e);
        A.uA = A.tA.getGraphics();
        A.vA = -1;
        A.wA = -1;
        A.zA = true;
    }
    
    static void K() {
        A.tA = null;
        A.uA = null;
    }
    
    static void L() {
        for (int i = 0; i < B.g[0].length; ++i) {
            for (int j = 0; j < B.g.length; ++j) {
                final int[] array = B.g[j];
                final int n = i;
                array[n] &= Integer.MAX_VALUE;
                B.g[j][i] = ((B.g[j][i] & 0xFFFF8FFF) | 0x0);
            }
        }
        for (int k = 0; k < B.g[0].length; ++k) {
            for (int l = 0; l < B.g.length; ++l) {
                int n2 = -1;
                for (int n3 = 0; n3 < 7 && l - n3 >= 0; ++n3) {
                    if ((B.g[l - n3][k] & Integer.MIN_VALUE) == 0x0) {
                        if ((B.g[l - n3][k] >> 28 & 0x7) == n3) {
                            if (n2 == -1) {
                                B.g[l][k] = ((B.g[l][k] & 0xFFFF8FFF) | (n3 & 0x7) << 12);
                            }
                            else {
                                B.g[l - n2][k] = ((B.g[l - n2][k] & 0x8FFFFFFF) | (n3 & 0x7) << 28);
                                final int[] array2 = B.g[l - n2];
                                final int n4 = k;
                                array2[n4] |= Integer.MIN_VALUE;
                            }
                            n2 = n3;
                        }
                    }
                }
                if (n2 == -1) {
                    B.g[l][k] = ((B.g[l][k] & 0xFFFF8FFF) | 0x7000);
                }
                else {
                    B.g[l - n2][k] = ((B.g[l - n2][k] & 0x8FFFFFFF) | 0x70000000);
                }
            }
        }
        for (int n5 = 0; n5 < B.g[0].length; ++n5) {
            for (int n6 = 0; n6 < B.g.length; ++n6) {
                if ((B.g[n6][n5] & Integer.MIN_VALUE) == 0x0) {
                    B.g[n6][n5] = ((B.g[n6][n5] & 0x8FFFFFFF) | 0x70000000);
                }
                final int[] array3 = B.g[n6];
                final int n7 = n5;
                array3[n7] &= Integer.MAX_VALUE;
            }
        }
    }
    
    public static void A(final int[] array, final boolean b, final Graphics graphics) {
        int[] array2 = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        if ((array[3] & 0x100000) != 0x0) {
            return;
        }
        if ((array[3] & 0x40) != 0x0) {
            array2 = A.ha[array[4]];
            n = (short)(array[5] & 0xFFFF);
            n2 = (B.d >> 1) - (short)((array[5] & 0xFFFF0000) >> 16);
        }
        else if ((array[3] & 0x80) != 0x0) {
            array2 = A.ja[array[4]];
            n = (short)(array[5] & 0xFFFF);
            n2 = (B.d >> 1) - (short)((array[5] & 0xFFFF0000) >> 16);
        }
        else if ((array[3] & 0x100) != 0x0) {
            array2 = A.la[array[4]];
            n = (short)(array[5] & 0xFFFF);
            n2 = (B.d >> 1) - (short)((array[5] & 0xFFFF0000) >> 16);
        }
        else if ((array[3] & 0x2000) != 0x0) {
            array2 = A.ta[array[4]];
            n = (short)(array[5] & 0xFFFF);
            n2 = (B.d >> 1) - (short)((array[5] & 0xFFFF0000) >> 16);
        }
        else if ((array[3] & 0x400) != 0x0) {
            array2 = A.va[array[4]];
            n = (short)(array[5] & 0xFFFF);
            n2 = (B.d >> 1) - (short)((array[5] & 0xFFFF0000) >> 16);
            n3 = A.o % A.cc[1223];
        }
        else if ((array[3] & 0x1000) != 0x0) {
            array2 = A.qa[array[4]];
            n4 = array[7];
            if (!b) {
                n3 = (short)(array[10] & 0xFFFF);
                R(array);
            }
        }
        else if ((array[3] & 0x200) != 0x0) {
            array2 = A.oa[array[4]];
            n = (short)(array[5] & 0xFFFF);
            n2 = (B.d >> 1) - (short)((array[5] & 0xFFFF0000) >> 16);
        }
        if (array2 != null) {
            B.B(array, A.ab);
            final int n5 = A.ab[0] * B.d >> 12;
            final int n6 = (A.ab[1] - A.ab[2]) * B.d >> 12;
            int n7 = (short)(array2[1] & 0xFFFF);
            final short n8 = (short)((array2[1] & 0xFFFF0000) >> 16);
            if ((array[3] & 0x80000) != 0x0) {
                n7 = 112;
            }
            if (n7 != -1) {
                if (b) {
                    if ((array[3] & 0x1000) == 0x0) {
                        return;
                    }
                    n7 -= 8;
                    n7 += 185;
                }
                if (!W(n7)) {
                    return;
                }
                A(n5 + n, n6 + n2, n7, n8, n3, n4, graphics);
            }
            else {
                graphics.setColor(16711680);
                graphics.drawString(HG.I(array2[0]), n5 - A.tB, n6 - A.uB, 20);
            }
        }
        if (((array[3] & 0x10) != 0x0 || (array[3] & 0x20) != 0x0) && !b) {
            B(array, graphics);
        }
        if ((array[3] & 0x800) != 0x0 && !b) {
            C(array, graphics);
        }
        if ((array[3] & 0x4000) != 0x0 && !b) {
            D(array, graphics);
        }
        if ((array[3] & 0x40000) != 0x0 && !b) {
            E(array, graphics);
        }
    }
    
    public static void A(final int[] array, final Graphics graphics) {
        B.A(array, A.bb);
        final int n = A.bb[0] * B.d >> 12;
        final int n2 = A.bb[1] * B.d >> 12;
        final short n3 = (short)(B.f & 0xFFFF);
        int n4;
        int n5;
        if (!HG.d) {
            n4 = 171;
            if (n3 == 0) {
                n5 = 0;
            }
            else {
                n5 = 1;
            }
        }
        else {
            n4 = 172;
            n5 = 0;
        }
        if (!L(n4, n5)) {
            return;
        }
        A(n, n2, n4, n5, 0, 0, graphics);
    }
    
    public static void A(int n, int n2, int n3, final Graphics graphics) {
        short n4 = 0;
        switch (n3) {
            case 0: {
                n4 = (short)(B.f & 0xFFFF);
                break;
            }
            case 1: {
                n4 = (short)((B.f & 0xFFFF0000) >> 16);
                break;
            }
            default: {
                return;
            }
        }
        int k = 0;
        if (A.cc[n4 * 11 + 4] == 5) {
            k = B.k;
        }
        if (A.ec[n4][k] == null) {
            return;
        }
        final int n5 = n * B.d - A.tB;
        final int n6 = n2 * B.e - A.uB;
        final byte b = (byte)(B.g[n2][n] >> (n3 << 4) & 0xFF);
        final byte b2 = (byte)(B.g[n2][n] >> 8 + (n3 << 4) & 0xF);
        if (b >= 0) {
            n3 = A.cc[n4 * 11 + 5];
            n2 = A.cc[n4 * 11 + 6];
            n = b % n3 * B.d;
            n2 = b / n3 % n2 * B.e;
            graphics.drawRegion(A.ec[n4][k], n, n2, B.d, B.e, (int)b2, n5, n6, 20);
        }
    }
    
    public static boolean C(final int n, final int n2, final int n3) {
        return (n3 == -1 || D(n3, n2)) && D(n, n2);
    }
    
    public static boolean D(int n, final int n2) {
        int n3 = -1;
        int i = n;
        while (true) {
            while (i != -1) {
                if (B.A(B.a[n2]) < B.A(B.a[i])) {
                    if (n3 == -1) {
                        final int[] array = B.a[n2];
                        final int n4 = 1;
                        array[n4] &= 0xFFFF;
                        final int[] array2 = B.a[n2];
                        final int n5 = 1;
                        array2[n5] |= ((short)n << 16 & 0xFFFF0000);
                        return true;
                    }
                    n = (short)((B.a[n3][1] & 0xFFFF0000) >> 16);
                    final int[] array3 = B.a[n2];
                    final int n6 = 1;
                    array3[n6] &= 0xFFFF;
                    final int[] array4 = B.a[n2];
                    final int n7 = 1;
                    array4[n7] |= ((short)n << 16 & 0xFFFF0000);
                    final int[] array5 = B.a[n3];
                    final int n8 = 1;
                    array5[n8] &= 0xFFFF;
                    final int[] array6 = B.a[n3];
                    final int n9 = 1;
                    array6[n9] |= ((short)n2 << 16 & 0xFFFF0000);
                    return false;
                }
                else {
                    n3 = i;
                    i = (short)((B.a[i][1] & 0xFFFF0000) >> 16);
                }
            }
            continue;
        }
    }
    
    public static void D(final Graphics graphics) {
        if (((HG.iA && HG.jA > 17) || !HG.iA) && !A.id && HG.fA == 0) {
            int n = A.tB / B.d;
            int n2 = A.uB / B.e;
            int b = A.f / B.d + 2 + n;
            int c = A.g / B.e + 2 + n2;
            if (n < 0) {
                n = 0;
            }
            if (n2 < 0) {
                n2 = 0;
            }
            if (b > B.b) {
                b = B.b;
            }
            if (c > B.c) {
                c = B.c;
            }
            int n3 = n - 6;
            int n4 = n2;
            int b2 = b + 6;
            int c2 = c + 7;
            if (n3 < 0) {
                n3 = 0;
            }
            if (n4 < 0) {
                n4 = 0;
            }
            if (b2 > B.b) {
                b2 = B.b;
            }
            if (c2 > B.c) {
                c2 = B.c;
            }
            graphics.setClip(0, 0, A.f, A.g);
            int n5 = -1;
            int n6 = -1;
            int n7 = -1;
            int n8 = -1;
            F(graphics);
            for (int i = n4; i < c2; ++i) {
                final int n9 = n7;
                final int n10 = n8;
                for (int j = n3; j < b2; ++j) {
                    for (int k = B.u[i][j]; k != -1; k = (short)(B.a[k][1] & 0xFFFF)) {
                        final int[] array = B.a[k];
                        final int n11 = 1;
                        array[n11] &= 0xFFFF;
                        final int[] array2 = B.a[k];
                        final int n12 = 1;
                        array2[n12] |= 0xFFFF0000;
                        boolean b3 = false;
                        if ((B.a[k][3] & 0x1000) != 0x0 && B.a[k][6] != 0) {
                            if (C(n6, k, n10)) {
                                n6 = k;
                            }
                            b3 = true;
                            n8 = k;
                        }
                        if (!b3) {
                            if (C(n5, k, n9)) {
                                n5 = k;
                            }
                            n7 = k;
                        }
                    }
                }
            }
            for (int l = n5; l != -1; l = (short)((B.a[l][1] & 0xFFFF0000) >> 16)) {
                A(B.a[l], true, graphics);
            }
            A(A.ca, graphics);
            for (int n13 = 0; n13 < A.ea.length; ++n13) {
                if ((A.ea[n13][3] & 0x10000) == 0x0) {
                    A(A.ea[n13], graphics);
                }
            }
            int n14 = Integer.MAX_VALUE;
            int n15 = n5;
            if (n15 != -1) {
                n14 = B.A(B.a[n15]);
            }
            for (int n16 = n4; n16 < c2; ++n16) {
                while (n15 != -1 && n14 <= (n16 + 1) * 4096) {
                    A(B.a[n15], false, graphics);
                    n15 = (short)((B.a[n15][1] & 0xFFFF0000) >> 16);
                    if (n15 == -1) {
                        n14 = Integer.MAX_VALUE;
                    }
                    else {
                        n14 = B.A(B.a[n15]);
                    }
                }
                for (int n17 = n3; n17 < b2; ++n17) {
                    for (int n18 = B.g[n16][n17] >> 12 & 0x7; n18 != 7; n18 = (B.g[n16 - n18][n17] >> 28 & 0x7)) {
                        if (n17 >= n && n16 - n18 >= n2 && n17 < b && n16 - n18 < c) {
                            A(n17, n16 - n18, 1, graphics);
                        }
                    }
                }
            }
            while (n15 != -1) {
                A(B.a[n15], false, graphics);
                n15 = (short)((B.a[n15][1] & 0xFFFF0000) >> 16);
            }
            for (int n19 = n6; n19 != -1; n19 = (short)((B.a[n19][1] & 0xFFFF0000) >> 16)) {
                A(B.a[n19], true, graphics);
                A(B.a[n19], false, graphics);
            }
        }
        if (!HG.iA) {
            if (A.gB == -1) {
                K(graphics);
            }
            J(graphics);
            U(graphics);
            S(graphics);
            if (A.id) {
                Q(graphics);
            }
            else if (A.oD) {
                R(graphics);
            }
            if (A.oC) {
                N(graphics);
            }
        }
        graphics.setClip(0, 0, A.f, A.g);
    }
    
    public static void E(final Graphics graphics) {
        F(graphics);
        B.A(A.ca, A.cb);
        final int n = A.cb[0] * B.d >> 12;
        final int n2 = A.cb[1] * B.d >> 12;
        if (W(134)) {
            A(n, n2, 134, 0, 0, 0, graphics);
        }
        V(graphics);
        if (!HG.iA) {
            if (A.db || A.eb) {
                A(graphics, 0);
                G(graphics);
            }
            if (A.oC) {
                N(graphics);
            }
        }
        graphics.setClip(0, 0, A.f, A.g);
    }
    
    static void A(int n, final int n2, final int n3, final int n4) {
        A.uA.setColor(0);
        for (int i = n; i < n3; ++i) {
            for (int j = n2; j < n4; ++j) {
                final int n5 = i % A.xA * B.d;
                final int n6 = j % A.yA * B.e;
                A.uA.fillRect(n5, n6, B.d, B.e);
                if (i >= 0 && i < B.g[0].length && j >= 0) {
                    if (j < B.g.length) {
                        short n7 = (short)(B.f & 0xFFFF);
                        for (int k = 0; k < ((A.ca[11] == 0) ? 2 : 1); ++k) {
                            final byte b = (byte)(B.g[j][i] >> (k << 4) & 0xFF);
                            final byte b2 = (byte)(B.g[j][i] >> 8 + (k << 4) & 0xF);
                            if (b >= 0) {
                                final short n8 = A.cc[n7 * 11 + 5];
                                final short n9 = A.cc[n7 * 11 + 6];
                                n = b % n8 * B.d;
                                final int n10 = b / n8 % n9 * B.e;
                                int l = 0;
                                if (A.cc[n7 * 11 + 4] == 5) {
                                    l = B.k;
                                }
                                A.uA.drawRegion(A.ec[n7][l], n, n10, B.d, B.e, (int)b2, n5, n6, 20);
                            }
                            n7 = (short)((B.f & 0xFFFF0000) >> 16);
                        }
                    }
                }
            }
        }
    }
    
    static void M() {
        int n = A.vA;
        int wa = A.wA;
        A.vA = A.tB / B.d;
        if (A.tB < 0) {
            --A.vA;
        }
        A.wA = A.uB / B.e;
        if (A.uB < 0) {
            --A.wA;
        }
        if (A.zA) {
            A(A.vA, A.wA, A.vA + A.xA, A.wA + A.yA);
            A.zA = false;
        }
        else {
            if (A.vA != n) {
                if (n < A.vA) {
                    while (n + A.xA < A.vA) {
                        n += A.xA;
                    }
                    A(n + A.xA, wa, A.vA + A.xA, wa + A.yA);
                }
                else {
                    while (n - A.xA > A.vA) {
                        n -= A.xA;
                    }
                    A(A.vA, wa, n, wa + A.yA);
                }
                n = A.vA;
            }
            if (A.wA != wa) {
                if (wa < A.wA) {
                    while (wa + A.yA < A.wA) {
                        wa += A.yA;
                    }
                    A(n, wa + A.yA, n + A.xA, A.wA + A.yA);
                }
                else {
                    while (wa - A.yA > A.wA) {
                        wa -= A.yA;
                    }
                    A(n, A.wA, n + A.xA, wa);
                }
            }
        }
    }
    
    static void F(final Graphics graphics) {
        M();
        final int n = -A.vA % A.xA * B.d;
        final int n2 = -A.wA % A.yA * B.e;
        int n3;
        if (A.tB >= 0) {
            n3 = A.tB % B.d;
        }
        else {
            n3 = B.d + A.tB % B.d;
        }
        int n4;
        if (A.uB >= 0) {
            n4 = A.uB % B.e;
        }
        else {
            n4 = B.e + A.uB % B.e;
        }
        graphics.drawRegion(A.tA, 0, 0, A.tA.getWidth(), A.tA.getHeight(), 0, n - n3, n2 - n4, 20);
        graphics.drawRegion(A.tA, 0, 0, A.tA.getWidth(), A.tA.getHeight(), 0, n - n3 + A.xA * B.d, n2 - n4, 20);
        graphics.drawRegion(A.tA, 0, 0, A.tA.getWidth(), A.tA.getHeight(), 0, n - n3, n2 - n4 + A.yA * B.e, 20);
        graphics.drawRegion(A.tA, 0, 0, A.tA.getWidth(), A.tA.getHeight(), 0, n - n3 + A.xA * B.d, n2 - n4 + A.yA * B.e, 20);
    }
    
    public static void N() {
        A.ib = new short[16];
        P();
    }
    
    public static void O() {
        A.nb = null;
    }
    
    public static void P() {
        int n = 0;
        A.gb = A.f - (A.dc[126][3] << 1) - A.dc[150][3] * 4;
        A.gb /= 5;
        if (A.gb < 4) {
            A.gb = 4;
        }
        A.hb = A.cc[1530] + A.cc[1607] - (A.dc[150][4] << 1) >> 1;
        if (A.hb < 4) {
            A.hb = 4;
        }
        int n2 = A.f - A.dc[150][3] * 4 - A.gb * 3 >> 1;
        int n3 = A.g - A.cc[1530];
        final int n4 = A.g - (A.dc[150][4] + A.hb) * 2;
        if (n3 > n4) {
            n3 = n4;
        }
        final int n5 = n2;
        final short n6 = (short)n3;
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 4; ++j) {
                A.ib[(n << 1) + 0] = (short)n2;
                A.ib[(n << 1) + 1] = (short)n3;
                ++n;
                n2 += A.dc[150][3] + A.gb;
            }
            n2 = n5;
            n3 += A.dc[150][4] + A.hb;
        }
        A.lb = (short)((A.dc[150][3] + A.gb) * 4 - A.gb);
        A.mb = (short)(A.j[1].getHeight() + 4);
        A.jb = (short)n5;
        A.kb = (short)(n6 - A.mb - A.hb);
        A(5, A.jb, A.kb, A.lb, A.mb, 156);
        A(5, -2, 0);
    }
    
    public static void Q() {
        final int n = A.ca[40];
        if ((A.ca[39] & 1 << n) == 0x0) {
            A.nb = HG.I(429);
        }
        else {
            final short n2 = (short)(A.ca[31 + n] & 0xFFFF);
            final short n3 = (short)((A.ca[31 + n] & 0xFFFF0000) >> 16);
            final int[][] array = A.da[n2];
            int[][] array2 = null;
            int n4 = -1;
            int n5 = -1;
            switch (n2) {
                case 0: {
                    array2 = A.ha;
                    for (int i = 6; i <= 7; ++i) {
                        if (array[n3][i] > 0) {
                            if (A.ra[(short)((array[n3][i] & 0xFFFF0000) >> 16)][1] == 0) {
                                n4 = A.ra[(short)((array[n3][i] & 0xFFFF0000) >> 16)][0];
                            }
                            else {
                                n5 = A.ra[(short)((array[n3][i] & 0xFFFF0000) >> 16)][0];
                            }
                        }
                    }
                    break;
                }
                case 1: {
                    array2 = A.ja;
                    break;
                }
                case 2: {
                    array2 = A.la;
                    break;
                }
                case 3: {
                    array2 = A.ta;
                    break;
                }
                case 4: {
                    array2 = A.va;
                    break;
                }
            }
            A.nb = "";
            if (n4 >= 0) {
                A.nb = A.nb + HG.I(n4) + " ";
            }
            A.nb += HG.I(array2[array[n3][4]][0]);
            if (n5 >= 0) {
                A.nb = A.nb + " " + HG.I(n5);
            }
        }
    }
    
    public static int R() {
        final int n = A.ca[40];
        if ((A.ca[39] & 1 << n) == 0x0) {
            return -1;
        }
        return (short)(A.ca[31 + n] & 0xFFFF);
    }
    
    public static int S() {
        final int n = A.ca[40];
        if ((A.ca[39] & 1 << n) == 0x0) {
            return -1;
        }
        return (short)((A.ca[31 + n] & 0xFFFF0000) >> 16);
    }
    
    public static int G(int n) {
        A.fb = false;
        if (C(61) && ((n < 4 && n > 0) || n > 4)) {
            --n;
        }
        if (C(62) && (n < 3 || (n >= 4 && n < 7))) {
            ++n;
        }
        if (C(55) && n >= 4) {
            n -= 4;
        }
        if (C(60) && n < 4) {
            n += 4;
        }
        if (C(101)) {
            n = 0;
            A.fb = true;
        }
        if (C(102)) {
            n = 1;
            A.fb = true;
        }
        if (C(103)) {
            n = 2;
            A.fb = true;
        }
        if (C(104)) {
            n = 3;
            A.fb = true;
        }
        if (C(105)) {
            n = 4;
            A.fb = true;
        }
        if (C(106)) {
            n = 5;
            A.fb = true;
        }
        if (C(107)) {
            n = 6;
            A.fb = true;
        }
        if (C(108)) {
            n = 7;
            A.fb = true;
        }
        return n;
    }
    
    public static void T() {
        final int g = G(A.ca[40]);
        boolean b = false;
        if (C(65) || A.fb) {
            final int n = ((short)HG.za & 0xFFFF) | ((short)HG.aA << 16 & 0xFFFF0000);
            A.ca[31 + g] = n;
            final int[] ca = A.ca;
            final int n2 = 39;
            ca[n2] |= 1 << g;
            for (int i = 0; i < 8; ++i) {
                if (i != g && n == A.ca[31 + i]) {
                    A.ca[31 + i] = -1;
                    final int[] ca2 = A.ca;
                    final int n3 = 39;
                    ca2[n3] &= ~(1 << i);
                }
            }
            b = true;
        }
        if (C(95) || C(85) || b) {
            A.eb = false;
            D();
            if (HG.jA != 19 && HG.jA != 21) {
                HG.U();
            }
            else {
                HG.B(HG.jA);
            }
            HG.iA = true;
        }
        A.ca[40] = g;
        Q();
    }
    
    public static void U() {
        final int n = A.ca[40];
        if (C(95) || C(85)) {
            A.db = false;
            D();
        }
        if (C(65)) {
            A.db = false;
            G(R(), S());
            D();
        }
        A.ca[40] = G(n);
        Q();
        if (A.fb) {
            A.db = false;
            G(R(), S());
            D();
        }
    }
    
    public static void G(final Graphics graphics) {
        final int n = A.ca[40];
        for (int i = 0; i < 8; ++i) {
            final short n2 = (short)(A.ca[31 + i] & 0xFFFF);
            final short n3 = (short)((A.ca[31 + i] & 0xFFFF0000) >> 16);
            if (n2 != -1 && n3 != -1 && (A.ca[39] & 1 << i) != 0x0 && A.da[n2][n3][4] != -1) {
                B(A.ib[(i << 1) + 0], A.ib[(i << 1) + 1], 150, A(A.da[n2][n3])[2], graphics);
            }
            else {
                B(A.ib[(i << 1) + 0], A.ib[(i << 1) + 1], 150, 49, graphics);
            }
        }
        B(A.ib[(n << 1) + 0], A.ib[(n << 1) + 1], 150, 59, graphics);
        H(graphics);
    }
    
    public static void H(final Graphics graphics) {
        graphics.setColor(A.i[22]);
        graphics.drawRect(A.jb - 1, A.kb - 1, A.lb + 2, A.mb + 2);
        graphics.setColor(A.i[23]);
        graphics.drawRect(A.jb - 2, A.kb - 2, A.lb + 2, A.mb + 2);
        graphics.setColor(A.i[24]);
        graphics.fillRect((int)A.jb, (int)A.kb, (int)A.lb, (int)A.mb);
        graphics.setColor(A.i[25]);
        A(A.nb, 5, 1, graphics);
    }
    
    static void V() {
        X();
    }
    
    static void W() {
        A.ob = null;
    }
    
    static void X() {
        final int pb = A.f >> 3;
        final int n = A.f - (pb << 1);
        final int sb = A.j[2].getHeight() + 4;
        A(4, pb + 4, 4, n - 8, sb, 156);
        A(4, -2, 0);
        A.pb = pb;
        A.qb = A.f - (pb << 1);
        A.sb = sb;
    }
    
    static void H(int n) {
        if (n == -1) {
            A.ob = null;
            return;
        }
        A.ob = HG.I(A.fa[A.ea[n][11]][0]);
        final short n2 = (short)(A.ea[n][12] & 0xFFFF);
        n = (short)((A.ea[n][12] & 0xFFFF0000) >> 16);
        if (n != 0) {
            A.rb = A.qb * n2 / n;
        }
        else {
            A.rb = A.qb;
        }
        if (A.rb < 0) {
            A.rb = 0;
        }
        if (A.rb > A.qb) {
            A.rb = 0;
        }
    }
    
    static void I(final Graphics graphics) {
        if (A.ob == null) {
            return;
        }
        graphics.setClip(0, 0, A.f, A.g);
        graphics.setColor(A.i[15]);
        graphics.drawRect(A.pb - 1, 3, A.qb + 2, A.sb + 2);
        graphics.setColor(A.i[14]);
        graphics.drawRect(A.pb - 2, 2, A.qb + 2, A.sb + 2);
        graphics.setColor(A.i[17]);
        graphics.fillRect(A.pb, 4, A.qb, A.sb);
        graphics.setColor(A.i[16]);
        graphics.fillRect(A.pb, 4, A.rb, A.sb);
        graphics.setColor(A.i[18]);
        A(A.ob, 4, 2, graphics);
    }
    
    public static void J(final Graphics graphics) {
        if (A.gB == -1) {
            return;
        }
        final int n = A.ea[A.gB][4] * B.d >> 12;
        final int n2 = A.ea[A.gB][5] * B.d >> 12;
        int n3;
        if (A.hB) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final short[] d = D(A.ea[A.gB], true);
        A(n + d[0], n2 + d[1], 151, 0, n3, 0, graphics);
        A(n + d[2], n2 + d[1], 151, 0, n3, 2, graphics);
        A(n + d[2], n2 + d[3], 151, 0, n3, 3, graphics);
        A(n + d[0], n2 + d[3], 151, 0, n3, 1, graphics);
    }
    
    static void Y() {
        A.tb = -1;
        A.ub = -1;
        A.xb = "";
        final int n = A.cc[1518] + A.cc[1386] + 5;
        final int n2 = A.j[1].getHeight() + 4 + 5;
        int n3 = A.g - (A.cc[1387] + A.cc[1607] - 7);
        final int n4 = A.f - 2 * n - 1;
        final int n5 = A.g - (n2 + 5);
        if (n3 > n5) {
            n3 = n5;
        }
        A(6, n + 4, n3 + 4, n4 - 8, n2, 532);
    }
    
    static int[] E(int n, int i) {
        if (n >= 0 && n < B.b && i >= 0 && i < B.c) {
            int j;
            byte b;
            byte b2;
            for (n = (j = B.u[i][n]); j != -1; j = (short)(B.a[j][1] & 0xFFFF)) {
                if ((B.a[j][3] & 0x100000) == 0x0) {
                    if ((B.a[j][3] & 0x80000) != 0x0) {
                        A.tb = j;
                        A.ub = 7;
                        A.vb = 1;
                        return A(B.a[j]);
                    }
                    if ((B.a[j][3] & 0x100) != 0x0) {
                        A.tb = j;
                        A.ub = 0;
                        A.vb = 3;
                        return A.la[B.a[j][4]];
                    }
                    if ((B.a[j][3] & 0x40) != 0x0) {
                        A.tb = j;
                        A.ub = 0;
                        A.vb = 3;
                        return A.ha[B.a[j][4]];
                    }
                    if ((B.a[j][3] & 0x80) != 0x0) {
                        A.tb = j;
                        A.ub = 0;
                        A.vb = 3;
                        return A.ja[B.a[j][4]];
                    }
                    if ((B.a[j][3] & 0x2000) != 0x0) {
                        A.tb = j;
                        A.ub = 0;
                        A.vb = 3;
                        return A.ta[B.a[j][4]];
                    }
                    if ((B.a[j][3] & 0x400) != 0x0) {
                        A.tb = j;
                        A.ub = 0;
                        A.vb = 3;
                        return A.va[B.a[j][4]];
                    }
                    if ((B.a[j][3] & 0x200) != 0x0) {
                        A.tb = j;
                        A.ub = 0;
                        A.vb = 3;
                        return A.oa[B.a[j][4]];
                    }
                    if ((B.a[j][3] & 0x20) != 0x0) {
                        if (N((short)((B.a[j][2] & 0xFFFF0000) >> 16)) && (B.a[j][13] & 0x2) == 0x0 && (B.a[j][3] & 0x10000) == 0x0) {
                            A.tb = j;
                            A.ub = 1;
                            A.vb = 2;
                            return A.fa[B.a[j][11]];
                        }
                        if ((B.a[j][13] & 0x2) != 0x0) {
                            n = (short)(B.a[j][17] & 0xFFFF);
                            n = (short)((A.hA[n] & 0xFFFF0000) >> 16);
                            if (n > 0) {
                                A.tb = j;
                                A.ub = 7;
                                A.vb = 1;
                                return A.fa[B.a[j][11]];
                            }
                        }
                    }
                    else if ((B.a[j][3] & 0x1000) != 0x0) {
                        b = (byte)(B.a[j][8] & 0xFF);
                        switch (b) {
                            case 1: {}
                            case 2: {}
                            case 8: {
                                n = B.A(j, (int[])null);
                                if ((short)((A.hA[n] & 0xFFFF0000) >> 16) == 0) {
                                    break;
                                }
                                A.ub = 7;
                                A.vb = 1;
                                A.tb = j;
                                return A.qa[B.a[j][4]];
                            }
                            case 4:
                            case 5: {
                                i = (byte)(B.a[j][8] >> 8 & 0xFF);
                                n = B.E();
                                if ((n & 1 << i) != 0x0) {
                                    if (b != 4) {
                                        break;
                                    }
                                    A.ub = 7;
                                    A.vb = 1;
                                }
                                else if ((n & 1 << i + 1) != 0x0) {
                                    b2 = (byte)(B.a[j][8] >> 16 & 0xFF);
                                    n = (byte)(B.a[j][8] >> 24 & 0xFF);
                                    A.ub = 6;
                                    A.vb = 0;
                                    if (n > 0) {
                                        A.ub = 4;
                                        A.vb = 6;
                                    }
                                    if (b2 > 0) {
                                        for (i = 0; i < A.da[5].length; ++i) {
                                            n = A.da[5][i][4];
                                            if (n >= 0 && A.oa[n][4] == b2) {
                                                A.ub = 5;
                                                A.vb = 5;
                                                break;
                                            }
                                        }
                                    }
                                }
                                else {
                                    A.ub = 3;
                                    A.vb = 4;
                                }
                                A.tb = j;
                                return A.qa[B.a[j][4]];
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    static void F(int n, int n2) {
        int n3 = 0;
        boolean b = false;
        final int tb = A.tb;
        final int ub = A.ub;
        int[] e = null;
        A.tb = -1;
        A.ub = -1;
        A.vb = -1;
        A.wb = -1;
        final int n4 = A.ca[30];
        for (int i = -1; i < 2; ++i) {
            for (int j = -1; j < 2; ++j) {
                int wb;
                if ((n4 == 0 && j < 0) || (n4 == 2 && j > 0) || (n4 == 3 && i < 0) || (n4 == 1 && i > 0)) {
                    wb = 2;
                }
                else if (((n4 == 0 || n4 == 2) && j == 0) || ((n4 == 3 || n4 == 1) && i == 0)) {
                    wb = 1;
                }
                else {
                    wb = 0;
                }
                final int[] e2;
                if (wb >= A.wb && (e2 = E(n + i, n2 + j)) != null) {
                    if (wb > A.wb) {
                        n3 = 0;
                        b = false;
                    }
                    if (n3 != 0 && wb == A.wb) {
                        b = true;
                    }
                    else {
                        A.wb = wb;
                        e = e2;
                        n3 = 1;
                    }
                }
            }
        }
        if (b) {
            A.tb = -1;
            A.ub = -1;
            switch (A.ca[30]) {
                case 0: {
                    --n2;
                    break;
                }
                case 1: {
                    ++n;
                    break;
                }
                case 2: {
                    ++n2;
                    break;
                }
                case 3: {
                    --n;
                    break;
                }
            }
            if (n < 0 || n >= B.b || n2 < 0 || n2 >= B.c) {
                A.tb = -1;
                A.ub = -1;
                return;
            }
            for (int k = B.u[n2][n]; k != -1; k = (short)(B.a[k][1] & 0xFFFF)) {
                e = E(n, n2);
            }
        }
        if ((tb != A.tb || ub != A.ub) && A.tb >= 0) {
            A.xb = "";
            if ((B.a[A.tb][3] & 0x1000) == 0x0 && (B.a[A.tb][3] & 0x80000) == 0x0) {
                if ((B.a[A.tb][3] & 0x100) != 0x0 && B.a[A.tb][6] > 1) {
                    A.xb = B.a[A.tb][6] + "x ";
                }
                A.xb += HG.I(e[0]);
            }
            A(6, -2, 0);
        }
    }
    
    static void K(final Graphics graphics) {
        if (A.ub >= 0) {
            final int[] array = B.a[A.tb];
            if ((array[3] & 0x4) != 0x0) {
                B((array[4] * B.d >> 12) - A.tB, (array[5] * B.d >> 12) - A.uB + (D(array, true)[1] - 5), 137, A.vb, graphics);
            }
            else {
                B.B(array, A.ab);
                int n = A.ab[0] * B.d >> 12;
                final int n2 = (A.ab[1] - A.ab[2]) * B.d >> 12;
                int n3 = A.cc[(short)(A(array)[1] & 0xFFFF) * 11 + 1] + 5;
                if ((array[3] & 0x1000) == 0x0) {
                    n3 += (short)((array[5] & 0xFFFF0000) >> 16);
                    n += (short)(array[5] & 0xFFFF);
                }
                A(n, n2 - n3, 137, A.vb, graphics);
            }
        }
    }
    
    static void L(final Graphics graphics) {
        if (A.ub >= 0 && A.xb.length() > 0) {
            graphics.setClip(0, 0, A.f, A.g);
            final int n = A.cc[1518] + A.cc[1386] + 5;
            final int n2 = A.j[1].getHeight() + 4 + 5 - 1;
            int n3 = A.g - (A.cc[1387] + A.cc[1607] - 7);
            final int n4 = A.f - 2 * n - 1;
            final int n5 = A.g - (n2 + 5);
            if (n3 > n5) {
                n3 = n5;
            }
            graphics.setColor(A.i[8]);
            graphics.fillRect(n, n3, n4, n2);
            graphics.setColor(A.i[5]);
            graphics.drawLine(n, n3, n + n4, n3);
            graphics.drawLine(n, n3, n, n3 + n2);
            graphics.setColor(A.i[6]);
            graphics.drawLine(n + 1, n3 + 1, n + n4, n3 + 1);
            graphics.drawLine(n + 1, n3 + 1, n + 1, n3 + n2 - 1);
            graphics.drawLine(n + n4 + 1, n3, n + n4 + 1, n3 + n2 + 1);
            graphics.drawLine(n, n3 + n2 + 1, n + n4 + 1, n3 + n2 + 1);
            graphics.setColor(A.i[7]);
            graphics.drawLine(n + 1, n3 + n2, n + n4, n3 + n2);
            graphics.drawLine(n + n4, n3 + 1, n + n4, n3 + n2);
            graphics.setColor(A.i[5]);
            A(A.xb, 6, 1, graphics);
        }
    }
    
    static boolean I(int n) {
        if ((B.a[n][3] & 0x40) != 0x0 && B(0, B.a[n])) {
            n = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
            if (A.ca[11] >= 0) {
                final int[] da = A.dA;
                final int n2 = A.ca[11];
                da[n2] |= 1 << n;
            }
            return true;
        }
        if ((B.a[n][3] & 0x80) != 0x0 && B(1, B.a[n])) {
            n = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
            if (A.ca[11] >= 0) {
                final int[] ea = A.eA;
                final int n3 = A.ca[11];
                ea[n3] |= 1 << n;
            }
            return true;
        }
        if ((B.a[n][3] & 0x100) != 0x0 && B(2, B.a[n])) {
            n = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
            if (A.ca[11] >= 0) {
                final int[] aa = A.aA;
                final int n4 = A.ca[11];
                aa[n4] |= 1 << n;
            }
            return true;
        }
        if ((B.a[n][3] & 0x2000) != 0x0 && B(3, B.a[n])) {
            n = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
            if (A.ca[11] >= 0) {
                final int[] fa = A.fA;
                final int n5 = A.ca[11];
                fa[n5] |= 1 << n;
            }
            return true;
        }
        if ((B.a[n][3] & 0x200) != 0x0 && B(5, B.a[n])) {
            n = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
            if (A.ca[11] >= 0) {
                final int[] ba = A.bA;
                final int n6 = A.ca[11];
                ba[n6] |= 1 << n;
            }
            return true;
        }
        if ((B.a[n][3] & 0x400) != 0x0 && B(4, B.a[n])) {
            n = (short)((B.a[n][2] & 0xFFFF0000) >> 16);
            if (A.ca[11] >= 0) {
                final int[] ga = A.gA;
                final int n7 = A.ca[11];
                ga[n7] |= 1 << n;
            }
            return true;
        }
        D(241, 230, 101, 106);
        return false;
    }
    
    static boolean A(final int n, final int[] array) {
        final int[][] array2 = A.da[n];
        for (int i = 0; i < array2.length; ++i) {
            if (n == 2 && array2[i][4] == array[4]) {
                return true;
            }
            if (array2[i][4] == -1) {
                return true;
            }
        }
        return false;
    }
    
    static boolean A(int n, final int n2, final boolean b) {
        final short n3 = (short)(A.da[n][n2][8] & 0xFFFF);
        n = (short)((A.da[n][n2][8] & 0xFFFF0000) >> 16);
        if (n3 == 0) {
            if (B(4, false) < n) {
                if (b) {
                    A(HG.I(80), HG.I(230), 101, 106);
                }
                return false;
            }
        }
        else if (n3 == 1 && B(5, false) < n) {
            if (b) {
                A(HG.I(79), HG.I(230), 101, 106);
            }
            return false;
        }
        return true;
    }
    
    static boolean D(final int[] array) {
        final short n = (short)(array[8] & 0xFFFF);
        final short n2 = (short)((array[8] & 0xFFFF0000) >> 16);
        int n3 = 0;
        switch (n) {
            case 0: {
                n3 = B(4, false);
                break;
            }
            case 1: {
                n3 = B(5, false);
                break;
            }
            default: {
                return true;
            }
        }
        return n3 >= n2;
    }
    
    static void G(final int n, int n2) {
        switch (n) {
            case 0: {
                if (A.ca[42] != n2) {
                    if (A(n, n2, true)) {
                        if (A.ca[42] != -1) {
                            B(n, A.ca[42], false);
                            A.ca[42] = -1;
                        }
                        A.ca[42] = n2;
                        A.ca[45] = -1;
                        B(n, A.ca[42], true);
                    }
                }
                else {
                    B(n, A.ca[42], false);
                    A.ca[42] = -1;
                }
                HG.M(12);
                break;
            }
            case 1: {
                if (A.ca[41] != n2) {
                    if (A(n, n2, true)) {
                        if (A.ca[41] != -1) {
                            B(n, A.ca[41], false);
                            A.ca[41] = -1;
                        }
                        B(n, A.ca[41] = n2, true);
                    }
                }
                else {
                    B(n, A.ca[41], false);
                    A.ca[41] = -1;
                }
                HG.M(11);
                break;
            }
            case 4: {
                if (A.ca[42] != -1) {
                    B(0, A.ca[42], false);
                    A.ca[42] = -1;
                }
                if (A.ca[45] != n2) {
                    A.ca[45] = n2;
                    break;
                }
                A.ca[45] = -1;
                break;
            }
            case 2: {
                E(A.da[n][n2]);
                if (A.da[n][n2][6] <= 1) {
                    final int n3 = ((short)n & 0xFFFF) | ((short)n2 << 16 & 0xFFFF0000);
                    for (int i = 0; i < 8; ++i) {
                        if (n3 == A.ca[31 + i]) {
                            final int[] ca = A.ca;
                            final int n4 = 39;
                            ca[n4] &= ~(1 << i);
                            final int[] ca2 = A.ca;
                            final int n5 = 31 + i;
                            ca2[n5] &= 0xFFFF;
                            final int[] ca3 = A.ca;
                            final int n6 = 31 + i;
                            ca3[n6] |= ((short)A.da[n][n2][4] << 16 & 0xFFFF0000);
                        }
                    }
                    A.da[n][n2][4] = -1;
                    break;
                }
                final int[] array = A.da[n][n2];
                final int n7 = 6;
                --array[n7];
                break;
            }
            case 3: {
                final int n8 = A.ta[A.da[n][n2][4]][10];
                if (n8 == 1) {
                    if (A.ca[44] != -1) {
                        B(n, A.ca[44], false);
                    }
                    if (A.ca[44] != n2) {
                        B(n, A.ca[44] = n2, true);
                        break;
                    }
                    A.ca[44] = -1;
                    break;
                }
                else {
                    if (n8 != 0) {
                        break;
                    }
                    final int n9 = A.ca[43];
                    if ((short)(n9 & 0xFFFF) == n2) {
                        B(n, (short)(n9 & 0xFFFF), false);
                        final int[] ca4 = A.ca;
                        final int n10 = 43;
                        ca4[n10] &= 0xFFFF0000;
                        final int[] ca5 = A.ca;
                        final int n11 = 43;
                        ca5[n11] |= 0xFFFF;
                        break;
                    }
                    if ((short)((n9 & 0xFFFF0000) >> 16) == n2) {
                        B(n, (short)((n9 & 0xFFFF0000) >> 16), false);
                        final int[] ca6 = A.ca;
                        final int n12 = 43;
                        ca6[n12] &= 0xFFFF;
                        final int[] ca7 = A.ca;
                        final int n13 = 43;
                        ca7[n13] |= 0xFFFF0000;
                        break;
                    }
                    if ((short)(n9 & 0xFFFF) == -1) {
                        final int[] ca8 = A.ca;
                        final int n14 = 43;
                        ca8[n14] &= 0xFFFF0000;
                        final int[] ca9 = A.ca;
                        final int n15 = 43;
                        ca9[n15] |= ((short)n2 & 0xFFFF);
                        B(n, (short)(A.ca[43] & 0xFFFF), true);
                        break;
                    }
                    if ((short)((n9 & 0xFFFF0000) >> 16) == -1) {
                        final int[] ca10 = A.ca;
                        final int n16 = 43;
                        ca10[n16] &= 0xFFFF;
                        final int[] ca11 = A.ca;
                        final int n17 = 43;
                        ca11[n17] |= ((short)n2 << 16 & 0xFFFF0000);
                        B(n, (short)((A.ca[43] & 0xFFFF0000) >> 16), true);
                        break;
                    }
                    break;
                }
                break;
            }
        }
        boolean b = false;
        n2 = 0;
        while (true) {
            if (A.ca[42] != -1 && !A(0, A.ca[42], false)) {
                B(0, A.ca[42], false);
                A.ca[42] = -1;
                b = true;
            }
            else {
                if (A.ca[41] == -1 || A(1, A.ca[41], false)) {
                    break;
                }
                B(0, A.ca[41], false);
                A.ca[41] = -1;
                n2 = 1;
            }
        }
        if (b || n2 != 0) {
            String str = "";
            if (b) {
                str = "" + HG.I(88) + "\n";
            }
            if (n2 != 0) {
                str += HG.I(87);
            }
            A(str, HG.I(230), 101, 106);
        }
    }
    
    static void A(final boolean b) {
        int cd = 1;
        if ((A.da[HG.za][HG.aA][3] & 0x100) != 0x0) {
            cd = A.cd;
        }
        final int a = A(HG.za, HG.aA, cd, false, false);
        int n;
        if (b) {
            n = B.A(A.tb, B.a[a]);
        }
        else {
            n = B.A(A.tb, (int[])null);
        }
        final short n2 = (short)(A.hA[n] & 0xFFFF);
        boolean b2 = true;
        if ((B.a[a][3] & 0x100) != 0x0) {
            for (short n3 = n2; n3 != -1; n3 = (short)(B.a[n3][1] & 0xFFFF)) {
                if (B.a[n3][4] == B.a[a][4]) {
                    final int[] array = B.a[n3];
                    final int n4 = 6;
                    array[n4] += cd;
                    b2 = false;
                    break;
                }
            }
        }
        if (b2) {
            final int[] ha = A.hA;
            final int n5 = n;
            ha[n5] &= 0xFFFF0000;
            final int[] ha2 = A.hA;
            final int n6 = n;
            ha2[n6] |= ((short)a & 0xFFFF);
            final int[] array2 = B.a[a];
            final int n7 = 1;
            array2[n7] &= 0xFFFF0000;
            final int[] array3 = B.a[a];
            final int n8 = 1;
            array3[n8] |= (n2 & 0xFFFF);
            final int n9 = (short)((A.hA[n] & 0xFFFF0000) >> 16) + 1;
            final int[] ha3 = A.hA;
            final int n10 = n;
            ha3[n10] &= 0xFFFF;
            final int[] ha4 = A.hA;
            final int n11 = n;
            ha4[n11] |= ((short)n9 << 16 & 0xFFFF0000);
        }
        if (b) {
            int n12 = B.G(B.a[a]) * cd;
            if (n12 % 2 != 0) {
                ++n12;
            }
            K(n12 * 40 / 100);
        }
        HG.B(HG.jA);
    }
    
    static boolean B(final boolean b) {
        final int n = B.A(A.tb, (int[])null) + HG.bA;
        short n2 = (short)(A.hA[n] & 0xFFFF);
        int n3 = -1;
        int n4 = 0;
        int n5 = -1;
        while (n2 != -1) {
            if (HG.cA == n4) {
                n5 = (short)(B.a[n2][2] & 0xFFFF);
                break;
            }
            ++n4;
            n3 = n2;
            n2 = (short)(B.a[n2][1] & 0xFFFF);
        }
        if (n5 >= 0) {
            int n6 = 0;
            int n7 = -1;
            final boolean b2 = (B.a[n5][3] & 0x100) != 0x0;
            if (b) {
                int g = B.G(B.a[n5]);
                if (b2) {
                    g *= A.cd;
                    n6 = B.a[n5][6];
                    n7 = B.a[n5][4];
                    B.a[n5][6] = A.cd;
                }
                if (!K(-g)) {
                    D(240, 230, 101, 106);
                    if (b2) {
                        B.a[n5][6] = n6;
                    }
                    return true;
                }
            }
            if (I(n5)) {
                if (b && b2) {
                    n6 -= A.cd;
                    if (n6 > 0) {
                        B.a[n5][4] = n7;
                        B.a[n5][6] = n6;
                    }
                }
                if (n6 == 0) {
                    final short n8 = (short)(B.a[n2][1] & 0xFFFF);
                    if (n3 == -1) {
                        final int[] ha = A.hA;
                        final int n9 = n;
                        ha[n9] &= 0xFFFF0000;
                        final int[] ha2 = A.hA;
                        final int n10 = n;
                        ha2[n10] |= (n8 & 0xFFFF);
                    }
                    else {
                        final int[] array = B.a[n3];
                        final int n11 = 1;
                        array[n11] &= 0xFFFF0000;
                        final int[] array2 = B.a[n3];
                        final int n12 = 1;
                        array2[n12] |= (n8 & 0xFFFF);
                    }
                    final int n13 = (short)((A.hA[n] & 0xFFFF0000) >> 16) - 1;
                    final int[] ha3 = A.hA;
                    final int n14 = n;
                    ha3[n14] &= 0xFFFF;
                    final int[] ha4 = A.hA;
                    final int n15 = n;
                    ha4[n15] |= ((short)n13 << 16 & 0xFFFF0000);
                    if (n13 == 0 && A.ca[11] == -1) {
                        B.a[A.tb][8] = 0;
                    }
                }
                HG.W(21);
            }
        }
        else if (b) {
            K(0);
        }
        return b || (short)((A.hA[n] & 0xFFFF0000) >> 16) > 0;
    }
    
    static int H(final int n, final int n2) {
        int n3 = 0;
        for (int i = 0; i < A.da[n].length; ++i) {
            if (A.da[n][i][4] == n2) {
                if (n == 2) {
                    n3 += A.da[n][i][6];
                    break;
                }
                ++n3;
            }
        }
        return n3;
    }
    
    static void I(int i, final int n) {
        final short n2 = (short)((i & 0xFFFF0000) >> 16);
        final short n3 = (short)(i & 0xFFFF);
        int h = H(n2, n3);
        if (n2 == 2) {
            int[] array;
            int n4;
            for (i = 0; i < A.da[n2].length; ++i) {
                if (A.da[n2][i][4] == n3) {
                    if (h > n) {
                        array = A.da[n2][i];
                        n4 = 6;
                        array[n4] -= n;
                    }
                    else if (h == n) {
                        A(n2, i, h, true, false);
                    }
                    return;
                }
            }
        }
        else {
            for (i = 0; i < A.da[n2].length; ++i) {
                if (A.da[n2][i][4] == n3) {
                    A(n2, i, 1, true, false);
                    if (--h == 0) {
                        return;
                    }
                }
            }
        }
    }
    
    static int A(int n, int n2, int i, final boolean b, final boolean b2) {
        int n3 = -1;
        int n4 = -1;
        switch (n) {
            case 0: {
                if (!b) {
                    i = A(A.ga);
                    n3 = D(A.da[n][n2][3]);
                    if (i >= 0 && n3 >= 0) {
                        System.arraycopy(A.da[n][n2], 0, A.ga[i], 0, A.da[n][n2].length);
                        B.a[n3] = A.ga[i];
                        final int[] array = B.a[n3];
                        final int n5 = 2;
                        array[n5] &= 0xFFFF0000;
                        final int[] array2 = B.a[n3];
                        final int n6 = 2;
                        array2[n6] |= ((short)n3 & 0xFFFF);
                        final int[] array3 = B.a[n3];
                        final int n7 = 2;
                        array3[n7] &= 0xFFFF;
                        final int[] array4 = B.a[n3];
                        final int n8 = 2;
                        array4[n8] |= ((short)i << 16 & 0xFFFF0000);
                        B.a[n3][1] = -1;
                        final int[] array5 = B.a[n3];
                        final int n9 = 3;
                        array5[n9] |= 0x40;
                        if (b2) {
                            B.A(A.ga[i], (int)(short)(A.ca[0] & 0xFFFF), (int)(short)((A.ca[0] & 0xFFFF0000) >> 16));
                        }
                    }
                }
                if (A.ca[42] == n2) {
                    B(n, A.ca[42], false);
                    A.ca[42] = -1;
                    break;
                }
                break;
            }
            case 1: {
                if (!b) {
                    i = A(A.ia);
                    n3 = D(A.da[n][n2][3]);
                    if (i >= 0 && n3 >= 0) {
                        System.arraycopy(A.da[n][n2], 0, A.ia[i], 0, A.da[n][n2].length);
                        B.a[n3] = A.ia[i];
                        final int[] array6 = B.a[n3];
                        final int n10 = 2;
                        array6[n10] &= 0xFFFF0000;
                        final int[] array7 = B.a[n3];
                        final int n11 = 2;
                        array7[n11] |= ((short)n3 & 0xFFFF);
                        final int[] array8 = B.a[n3];
                        final int n12 = 2;
                        array8[n12] &= 0xFFFF;
                        final int[] array9 = B.a[n3];
                        final int n13 = 2;
                        array9[n13] |= ((short)i << 16 & 0xFFFF0000);
                        B.a[n3][1] = -1;
                        final int[] array10 = B.a[n3];
                        final int n14 = 3;
                        array10[n14] |= 0x80;
                        if (b2) {
                            B.A(A.ia[i], (int)(short)(A.ca[0] & 0xFFFF), (int)(short)((A.ca[0] & 0xFFFF0000) >> 16));
                        }
                    }
                }
                if (A.ca[41] == n2) {
                    B(n, A.ca[41], false);
                    A.ca[41] = -1;
                    break;
                }
                break;
            }
            case 2: {
                if (b) {
                    break;
                }
                final int a = A(A.ka);
                n3 = D(A.da[n][n2][3]);
                if (a < 0 || n3 < 0) {
                    break;
                }
                System.arraycopy(A.da[n][n2], 0, A.ka[a], 0, A.da[n][n2].length);
                A.ka[a][6] = i;
                n4 = A.da[n][n2][6] - i;
                A.da[n][n2][6] = n4;
                B.a[n3] = A.ka[a];
                final int[] array11 = B.a[n3];
                final int n15 = 2;
                array11[n15] &= 0xFFFF0000;
                final int[] array12 = B.a[n3];
                final int n16 = 2;
                array12[n16] |= ((short)n3 & 0xFFFF);
                final int[] array13 = B.a[n3];
                final int n17 = 2;
                array13[n17] &= 0xFFFF;
                final int[] array14 = B.a[n3];
                final int n18 = 2;
                array14[n18] |= ((short)a << 16 & 0xFFFF0000);
                B.a[n3][1] = -1;
                final int[] array15 = B.a[n3];
                final int n19 = 3;
                array15[n19] |= 0x100;
                if (b2) {
                    B.A(A.ka[a], (int)(short)(A.ca[0] & 0xFFFF), (int)(short)((A.ca[0] & 0xFFFF0000) >> 16));
                    break;
                }
                break;
            }
            case 3: {
                if (b) {
                    break;
                }
                i = A(A.sa);
                n3 = D(A.da[n][n2][3]);
                if (i >= 0 && n3 >= 0) {
                    System.arraycopy(A.da[n][n2], 0, A.sa[i], 0, A.da[n][n2].length);
                    B.a[n3] = A.sa[i];
                    final int[] array16 = B.a[n3];
                    final int n20 = 2;
                    array16[n20] &= 0xFFFF0000;
                    final int[] array17 = B.a[n3];
                    final int n21 = 2;
                    array17[n21] |= ((short)n3 & 0xFFFF);
                    final int[] array18 = B.a[n3];
                    final int n22 = 2;
                    array18[n22] &= 0xFFFF;
                    final int[] array19 = B.a[n3];
                    final int n23 = 2;
                    array19[n23] |= ((short)i << 16 & 0xFFFF0000);
                    B.a[n3][1] = -1;
                    final int[] array20 = B.a[n3];
                    final int n24 = 3;
                    array20[n24] |= 0x2000;
                    if (b2) {
                        B.A(A.sa[i], (int)(short)(A.ca[0] & 0xFFFF), (int)(short)((A.ca[0] & 0xFFFF0000) >> 16));
                    }
                }
                if ((short)(A.ca[43] & 0xFFFF) == n2) {
                    B(n, (short)(A.ca[43] & 0xFFFF), false);
                    final int[] ca = A.ca;
                    final int n25 = 43;
                    ca[n25] &= 0xFFFF0000;
                    final int[] ca2 = A.ca;
                    final int n26 = 43;
                    ca2[n26] |= 0xFFFF;
                    break;
                }
                if ((short)((A.ca[43] & 0xFFFF0000) >> 16) == n2) {
                    B(n, (short)((A.ca[43] & 0xFFFF0000) >> 16), false);
                    final int[] ca3 = A.ca;
                    final int n27 = 43;
                    ca3[n27] &= 0xFFFF;
                    final int[] ca4 = A.ca;
                    final int n28 = 43;
                    ca4[n28] |= 0xFFFF0000;
                    break;
                }
                if (A.ca[44] == n2) {
                    B(n, A.ca[44], false);
                    A.ca[44] = -1;
                    break;
                }
                break;
            }
        }
        if (n4 <= 0) {
            final int n29 = ((short)n & 0xFFFF) | ((short)n2 << 16 & 0xFFFF0000);
            int[] ca5;
            int n30;
            int[] ca6;
            int n31;
            int[] ca7;
            int n32;
            for (i = 0; i < 8; ++i) {
                if (n29 == A.ca[31 + i]) {
                    ca5 = A.ca;
                    n30 = 39;
                    ca5[n30] &= ~(1 << i);
                    ca6 = A.ca;
                    n31 = 31 + i;
                    ca6[n31] &= 0xFFFF;
                    ca7 = A.ca;
                    n32 = 31 + i;
                    ca7[n32] |= ((short)A.da[n][n2][4] << 16 & 0xFFFF0000);
                }
            }
            A.da[n][n2][4] = -1;
        }
        if (b2) {
            n2 = (short)(A.ca[0] & 0xFFFF);
            n = (short)((A.ca[0] & 0xFFFF0000) >> 16);
            int j = B.u[n][n2];
            i = 0;
            while (j != -1) {
                n2 = B.a[j][3];
                if ((n2 & 0x27C0) > 0 && j != n3) {
                    final int[] array21 = B.a[j];
                    final int n33 = 3;
                    array21[n33] |= 0x80000;
                    i = 1;
                    break;
                }
                j = (short)(B.a[j][1] & 0xFFFF);
            }
            if (i != 0) {
                final int[] array22 = B.a[n3];
                final int n34 = 3;
                array22[n34] |= 0x80000;
                final int[] array23 = B.a[n3];
                final int n35 = 3;
                array23[n35] |= 0x100000;
            }
            F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
        }
        return n3;
    }
    
    static void E(int[] array) {
        array = A.la[array[4]];
        A(array[6], array[3], true, false, A.ca);
        HG.M(33);
    }
    
    public static void B(final int n, final int n2, final boolean b) {
        if (n == -1) {
            return;
        }
        if (n2 == -1) {
            return;
        }
        if (A.da[n][n2][4] == -1) {
            return;
        }
        B(A.da[n][n2], b);
    }
    
    public static void B(final int[] array, final boolean b) {
        final int[] a = A(array);
        if ((array[3] & 0x80) != 0x0) {
            if (b) {
                final int[] ca = A.ca;
                final int n = 27;
                ca[n] += a[11];
                final int[] ca2 = A.ca;
                final int n2 = 28;
                ca2[n2] += a[12];
                final int[] ca3 = A.ca;
                final int n3 = 29;
                ca3[n3] += a[13];
            }
            else {
                final int[] ca4 = A.ca;
                final int n4 = 27;
                ca4[n4] -= a[11];
                final int[] ca5 = A.ca;
                final int n5 = 28;
                ca5[n5] -= a[12];
                final int[] ca6 = A.ca;
                final int n6 = 29;
                ca6[n6] -= a[13];
            }
        }
        for (int i = 0; i < A.zb.length; ++i) {
            A.zb[i] = -1;
        }
        if ((array[3] & 0x40) != 0x0 || (array[3] & 0x80) != 0x0 || (array[3] & 0x2000) != 0x0) {
            for (int j = 0; j < 2; ++j) {
                if (array[6 + j] != -1) {
                    A.zb[j] = (((short)A.ra[(short)((array[6 + j] & 0xFFFF0000) >> 16)][3] & 0xFFFF) | ((short)(array[6 + j] & 0xFFFF) << 16 & 0xFFFF0000));
                }
            }
            for (int k = 0; k < 5; ++k) {
                if (a[5 + k] != -1) {
                    A.zb[2 + k] = a[5 + k];
                }
            }
        }
        for (int l = 0; l < A.zb.length; ++l) {
            if (A.zb[l] != -1) {
                final short n7 = (short)(A.zb[l] & 0xFFFF);
                int n8 = (short)((A.zb[l] & 0xFFFF0000) >> 16);
                if (!b) {
                    n8 *= -1;
                }
                A(n7, n8, true, true, A.ca);
            }
        }
    }
    
    static int B(final int n, final boolean b) {
        switch (n) {
            case 0: {
                return (short)(A.ca[12] & 0xFFFF);
            }
            case 1: {
                return (short)(A.ca[13] & 0xFFFF);
            }
            case 2: {
                if (b) {
                    return (short)(A.ca[54] & 0xFFFF);
                }
                return (short)(A.ca[54] & 0xFFFF);
            }
            case 3: {
                if (b) {
                    return (short)((A.ca[54] & 0xFFFF0000) >> 16);
                }
                return (short)((A.ca[54] & 0xFFFF0000) >> 16);
            }
            case 4: {
                if (b) {
                    return (short)((A.ca[14] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[14] & 0xFFFF);
            }
            case 5: {
                if (b) {
                    return (short)((A.ca[15] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[15] & 0xFFFF);
            }
            case 22: {
                return A.ca[16];
            }
            case 24: {
                return A.ca[19];
            }
            case 6: {
                return A.ca[47];
            }
            case 23: {
                return A.ca[48];
            }
            case 7: {
                return A.ca[49];
            }
            case 8: {
                return A.ca[50];
            }
            case 9: {
                return (short)(A.ca[26] & 0xFFFF);
            }
            case 16: {
                return A.ca[51];
            }
            case 12: {
                if (b) {
                    return (short)((A.ca[20] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[20] & 0xFFFF);
            }
            case 13: {
                if (b) {
                    return (short)((A.ca[21] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[21] & 0xFFFF);
            }
            case 14: {
                if (b) {
                    return (short)((A.ca[22] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[22] & 0xFFFF);
            }
            case 15: {
                if (b) {
                    return (short)((A.ca[23] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[23] & 0xFFFF);
            }
            case 18: {
                return (short)(A.ca[24] & 0xFFFF);
            }
            case 17: {
                if (b) {
                    return (short)((A.ca[25] & 0xFFFF0000) >> 16);
                }
                return (short)(A.ca[25] & 0xFFFF);
            }
            case 10: {
                return A.ca[27];
            }
            case 11: {
                return A.ca[28];
            }
            case 19: {
                return A.ca[29];
            }
            case 21: {
                return A.ca[46];
            }
            case 25: {
                return A.ca[17];
            }
            default: {
                return 0;
            }
        }
    }
    
    static void A(int n, int n2, final boolean b, final boolean b2, final int[] array) {
        int n3 = -1;
        int n4 = -1;
        boolean b3 = false;
        boolean b4 = true;
        boolean b5 = false;
        boolean b6 = false;
        boolean b7 = false;
        boolean b8 = false;
        boolean b9 = false;
        if ((array[3] & 0x20) != 0x0) {
            switch (n) {
                case 0: {
                    n3 = 12;
                    b5 = true;
                    n4 = 12;
                    b3 = true;
                    break;
                }
            }
        }
        if ((array[3] & 0x10) != 0x0) {
            switch (n) {
                case 0: {
                    if (A.pA) {
                        return;
                    }
                    n3 = 12;
                    b5 = true;
                    n4 = 12;
                    b3 = true;
                    break;
                }
                case 1: {
                    n3 = 13;
                    b5 = true;
                    n4 = 13;
                    b3 = true;
                    break;
                }
                case 2: {
                    n3 = 12;
                    if (!b2) {
                        n4 = 54;
                        b3 = false;
                        b4 = false;
                        b5 = true;
                        b6 = true;
                        b7 = true;
                        break;
                    }
                    n4 = 12;
                    b3 = true;
                    b5 = true;
                    b7 = true;
                    b8 = true;
                    break;
                }
                case 3: {
                    n3 = 13;
                    if (!b2) {
                        n4 = 54;
                        b3 = true;
                        b4 = false;
                        b5 = true;
                        b6 = true;
                        b7 = true;
                        break;
                    }
                    n4 = 13;
                    b3 = true;
                    b5 = true;
                    b7 = true;
                    b8 = true;
                    break;
                }
                case 4: {
                    n3 = 14;
                    b9 = true;
                    break;
                }
                case 5: {
                    n3 = 15;
                    b9 = true;
                    break;
                }
                case 22: {
                    n3 = 16;
                    break;
                }
                case 24: {
                    n3 = 19;
                    break;
                }
                case 6: {
                    n3 = 47;
                    break;
                }
                case 23: {
                    n3 = 48;
                    break;
                }
                case 7: {
                    n3 = 49;
                    break;
                }
                case 8: {
                    n3 = 50;
                    break;
                }
                case 9: {
                    n3 = 26;
                    b9 = true;
                    break;
                }
                case 16: {
                    n3 = 51;
                    break;
                }
                case 12: {
                    n3 = 20;
                    b9 = true;
                    break;
                }
                case 13: {
                    n3 = 21;
                    b9 = true;
                    break;
                }
                case 14: {
                    n3 = 22;
                    b9 = true;
                    break;
                }
                case 15: {
                    n3 = 23;
                    b9 = true;
                    break;
                }
                case 18: {
                    n3 = 24;
                    b9 = true;
                    break;
                }
                case 17: {
                    n3 = 25;
                    b9 = true;
                    break;
                }
                case 10: {
                    n3 = 27;
                    break;
                }
                case 11: {
                    n3 = 28;
                    break;
                }
                case 19: {
                    n3 = 29;
                    break;
                }
                case 20: {
                    n3 = 25;
                    b9 = true;
                    break;
                }
                case 21: {
                    n3 = 46;
                    break;
                }
                case 25: {
                    n3 = 17;
                    break;
                }
            }
        }
        if (b9) {
            if (b2) {
                b5 = true;
                b6 = false;
            }
            else {
                b5 = true;
                b6 = true;
            }
        }
        if (n3 < 0) {
            return;
        }
        n = -1;
        if (n4 != -1) {
            if (!b3) {
                n = (short)(array[n4] & 0xFFFF);
            }
            else {
                n = (short)((array[n4] & 0xFFFF0000) >> 16);
            }
            if (b7) {
                if (b) {
                    n += n2;
                }
                else {
                    n = n2;
                }
                if (!b3) {
                    final int n5 = n4;
                    array[n5] &= 0xFFFF0000;
                    final int n6 = n4;
                    array[n6] |= ((short)n & 0xFFFF);
                }
                else {
                    final int n7 = n4;
                    array[n7] &= 0xFFFF;
                    final int n8 = n4;
                    array[n8] |= ((short)n << 16 & 0xFFFF0000);
                }
            }
        }
        if (b) {
            if (b5) {
                int n9 = (short)(array[n3] & 0xFFFF) + n2;
                if (n9 > n && n >= 0 && b4) {
                    n9 = n;
                }
                if (n9 <= 0 && b8) {
                    n9 = 1;
                }
                final int n10 = n3;
                array[n10] &= 0xFFFF0000;
                final int n11 = n3;
                array[n11] |= ((short)n9 & 0xFFFF);
            }
            if (b6) {
                int n12 = (short)((array[n3] & 0xFFFF0000) >> 16) + n2;
                if (n12 > n && n >= 0 && b4) {
                    n12 = n;
                }
                if (n12 <= 0 && b8) {
                    n12 = 1;
                }
                final int n13 = n3;
                array[n13] &= 0xFFFF;
                final int n14 = n3;
                array[n14] |= ((short)n12 << 16 & 0xFFFF0000);
            }
            if (!b6 && !b5) {
                n2 += array[n3];
                if (n2 > n && n >= 0 && b4) {
                    n2 = n;
                }
                if (n2 <= 0 && b8) {
                    n2 = 1;
                }
                array[n3] = n2;
            }
        }
        else {
            n2 = n2;
            if (n2 > n && n >= 0 && b4) {
                n2 = n;
            }
            if (n2 <= 0 && b8) {
                n2 = 1;
            }
            if (b5) {
                final int n15 = n3;
                array[n15] &= 0xFFFF0000;
                final int n16 = n3;
                array[n16] |= ((short)n2 & 0xFFFF);
            }
            if (b6) {
                final int n17 = n3;
                array[n17] &= 0xFFFF;
                final int n18 = n3;
                array[n18] |= ((short)n2 << 16 & 0xFFFF0000);
            }
            if (!b6 && !b5) {
                array[n3] = n2;
            }
        }
    }
    
    public static void A(final Graphics graphics, final boolean b, final boolean b2, final boolean b3, final int n) {
        graphics.setClip(0, 0, A.f, A.g);
        final int g = A.g;
        graphics.setColor(A.i[3]);
        graphics.fillRect(0, 0, A.f, A.g);
        B(0, g, 146, 0, graphics);
        B(A.f, g, 146, 0, 0, 2, graphics);
        final int n2 = g - A.cc[1607];
        B(0, n2, 138, 0, graphics);
        final int n3 = 0 + A.cc[1518];
        B(n3, n2, n, 0, graphics);
        if (n == 126) {
            T(graphics);
        }
        final int n4 = n3 + A.cc[1386];
        final int n5 = n2 - A.cc[1387];
        graphics.setColor(A.i[8]);
        graphics.fillRect(n4, n5, A.f - n4, A.g - n5);
        graphics.setColor(A.i[5]);
        graphics.drawLine(n4, n5, A.f, n5);
        graphics.setColor(A.i[6]);
        graphics.drawLine(n4, n5 + 1, A.f - 1, n5 + 1);
        graphics.drawLine(A.f - 1, n5 + 1, A.f - 1, A.g - 1);
        graphics.setColor(A.i[7]);
        graphics.drawLine(n4, A.g - 1, A.f - 2, A.g - 1);
        graphics.drawLine(A.f - 2, n5 + 2, A.f - 2, A.g - 1);
        if (b3) {
            B(A.f, A.g, 146, 0, 0, 2, graphics);
        }
        final int n6 = A.g - (A.cc[1607] + A.cc[1387]);
        graphics.setColor(A.i[5]);
        graphics.drawRect(0, 0, A.f - 2, n6 - 2);
        graphics.setColor(A.i[6]);
        graphics.drawRect(1, 1, A.f - 2, n6 - 2);
        final int n7 = A.cc[1617] / A.cc[1622];
        final int n8 = A.cc[1618] / A.cc[1623];
        B(0, 0, 147, 0, graphics);
        B(A.f - n7, 0, 147, 1, graphics);
        B(0, n6 - n8, 147, 2, graphics);
        B(A.f - n7, n6 - n8, 147, 3, graphics);
        final int n9 = n7 >> 1;
        int c;
        if (b) {
            c = C(false);
        }
        else {
            c = n8;
        }
        final int n10 = A.f - 2 * n9;
        int n11 = A.g - (A.cc[1607] + A.cc[1387] + n8 + c);
        if (!b2) {
            n11 -= 4;
        }
        graphics.setColor(A.i[8]);
        graphics.fillRect(n9, c, n10, n11);
        if (b2) {
            graphics.setColor(A.i[3]);
            graphics.fillRect(HG.va, HG.wa, HG.xa - 1, HG.ya);
        }
        graphics.setColor(A.i[6]);
        graphics.drawRect(n9, c, n10, n11);
        graphics.drawRect(n9 + 1, c + 1, n10 - 1, n11 - 1);
        graphics.setColor(A.i[5]);
        graphics.drawRect(n9, c, n10 - 1, n11 - 1);
        if (b2) {
            graphics.drawRect(HG.va, HG.wa, HG.xa - 1, HG.ya);
        }
        final Font font = A.j[2];
        final int height = A.j[2].getHeight();
        if (b) {
            graphics.setFont(font);
            final int n12 = (A.f - font.stringWidth("" + A.ca[46]) >> 1) - 4 - A.cc[1628];
            final short n13 = A.cc[1629];
            int n14 = 4;
            int n15 = 3;
            if (n13 > height) {
                n15 = 3 + (n13 - height >> 1);
            }
            else {
                n14 = 4 + (height - n13 >> 1);
            }
            B(n12, n14, 148, 0, graphics);
            graphics.drawString("" + A.ca[46], n12 + A.cc[1628] + 4 + 0, n15 + 0, 20);
        }
        final int n16 = A.cc[1639] / A.cc[1644];
        final short n17 = A.cc[1640];
        final int n18 = (HG.wa - c - n16 >> 1) + 1;
        if (b2) {
            final int n19 = HG.ta - HG.wa;
            if (n19 < 0) {
                B((A.f >> 1) - n16, HG.wa + HG.ya + 2, 149, 0, graphics);
            }
            if (n19 > HG.ya - HG.ua) {
                B(A.f >> 1, HG.wa + HG.ya + 2, 149, 1, graphics);
            }
            if (HG.ma) {
                B(HG.va, c + n18, 160, 1, graphics);
                B(HG.va + HG.xa - n17, c + n18, 160, 0, graphics);
            }
            int n20;
            if (HG.ma) {
                n20 = HG.va + n16 + 2;
            }
            else {
                n20 = HG.va + 2;
            }
            A(2, n20, c + 1, A.f - 2 * n20, height + 6, 540);
            A(HG.la, 2, 2, graphics);
        }
        if (n == 126 && HG.iA && !A.id && (HG.jA == 19 || HG.jA == 20)) {
            graphics.setClip(0, 0, A.f, A.g);
            graphics.setColor(A.i[5]);
            graphics.drawRect(A.f - A.dc[138][3] - A.dc[126][3] + 2 + 30 - 2, A.g - A.dc[146][4] - A.dc[139][4] + 2 - 1, 7, 34);
            B(graphics, 30);
        }
    }
    
    public static int C(final boolean b) {
        int n = A.cc[1629];
        final int height = A.j[2].getHeight();
        if (height > n) {
            n = height;
        }
        if (b) {
            n += height + 6;
        }
        return n + 6;
    }
    
    public void Z() {
        int n = (short)(A.ca[53] & 0xFFFF);
        int n2 = (short)((A.ca[53] & 0xFFFF0000) >> 16);
        boolean b = false;
        boolean b2 = false;
        for (int i = 0; i < 15; ++i) {
            if (A.da[2][i][4] >= 0) {
                final int[] a = A(A.da[2][i]);
                int n3 = 0;
                if (a[6] == 26) {
                    n3 = A.da[2][i][6] - n;
                    if (n3 < 0) {
                        final int n4 = n + n3;
                        final int[] ca = A.ca;
                        final int n5 = 53;
                        ca[n5] &= 0xFFFF0000;
                        final int[] ca2 = A.ca;
                        final int n6 = 53;
                        ca2[n6] |= ((short)n4 & 0xFFFF);
                    }
                    n = 0;
                    b2 = true;
                }
                else if (a[6] == 27) {
                    n3 = A.da[2][i][6] - n2;
                    if (n3 < 0) {
                        final int n7 = n2 + n3;
                        final int[] ca3 = A.ca;
                        final int n8 = 53;
                        ca3[n8] &= 0xFFFF;
                        final int[] ca4 = A.ca;
                        final int n9 = 53;
                        ca4[n9] |= ((short)n7 << 16 & 0xFFFF0000);
                    }
                    n2 = 0;
                    b = true;
                }
                if (n3 > 0) {
                    I(((short)A.da[2][i][4] & 0xFFFF) | 0x20000, n3);
                }
            }
        }
        if (!b) {
            final int[] ca5 = A.ca;
            final int n10 = 53;
            ca5[n10] &= 0xFFFF;
            final int[] ca6 = A.ca;
            final int n11 = 53;
            ca6[n11] |= 0x0;
        }
        if (!b2) {
            final int[] ca7 = A.ca;
            final int n12 = 53;
            ca7[n12] &= 0xFFFF0000;
            final int[] ca8 = A.ca;
            final int n13 = 53;
            ca8[n13] |= 0x0;
        }
    }
    
    public static void AA() {
        for (int i = 0; i < A.ca.length; ++i) {
            A.ca[i] = -1;
        }
        A.ca[4] = 2048;
        A.ca[5] = 2048;
        A.ca[12] = 3276850;
        A.ca[13] = 1310740;
        A.ca[16] = 1024;
        A.ca[30] = 2;
        A.ca[14] = 1310740;
        A.ca[15] = 983055;
        A.ca[27] = 0;
        A.ca[28] = 0;
        A.ca[27] = 0;
        A.ca[17] = 0;
        A.ca[19] = 0;
        A.ca[20] = 327685;
        A.ca[21] = 327685;
        A.ca[22] = 327685;
        A.ca[23] = 327685;
        A.ca[24] = 0;
        A.ca[25] = 327685;
        A.ca[26] = 327685;
        A.ca[46] = 50;
        A.ca[40] = 0;
        A.ca[47] = 0;
        A.ca[48] = 0;
        A.ca[49] = 0;
        A.ca[50] = 0;
        A.ca[51] = 0;
        A.ca[53] = 0;
        A.ca[54] = 1310770;
        A.ca[41] = -1;
        A.ca[42] = -1;
        A.ca[43] = -1;
        A.ca[44] = -1;
        A.ca[45] = -1;
        A.ca[18] = 1;
        A.ca[11] = 13;
        A.ca[39] = 0;
        for (int j = 0; j < A.da.length; ++j) {
            for (int k = 0; k < A.da[j].length; ++k) {
                for (int l = 0; l < A.da[j][k].length; ++l) {
                    A.da[j][k][l] = -1;
                }
            }
        }
    }
    
    public static int J(final int n) {
        if (n >= 30) {
            return -1;
        }
        return n * n * 60;
    }
    
    public static boolean K(final int n) {
        if (A.ca[46] + n < 0) {
            return false;
        }
        final int[] ca = A.ca;
        final int n2 = 46;
        ca[n2] += n;
        return true;
    }
    
    public static int[] BA() {
        final int n = A.ca[42];
        if (n != -1 && A.da[0][n][4] != -1) {
            return A.da[0][n];
        }
        return null;
    }
    
    public static void J(final int n, final int n2) {
        A.ca[4] = (n << 12) + 2048;
        A.ca[5] = (n2 << 12) + 2048;
        if (B.h >= 0) {
            A.ca[30] = B.h;
            B.h = -1;
        }
        A.gB = -1;
        A.iB = -1;
        A.lB = -1;
        A.kB = true;
        D(A.ca, 0);
        E(A.ca, 0);
        F(A.ca, 0);
        for (int i = 0; i < O(A.ca); ++i) {
            B(A.ca, i, 0);
        }
        for (int j = 0; j < P(A.ca); ++j) {
            C(A.ca, j, 0);
        }
        for (int k = 0; k < Q(A.ca); ++k) {
            D(A.ca, k, 0);
        }
        N(A.ca, 0);
        B.A(A.ca, n, n2);
    }
    
    public static void CA() {
        int n = 0;
        final int z = Z(BA());
        final int n2 = A.ca[42];
        int n3 = 0;
        switch (z) {
            case 0: {
                n3 = A.oc[0][1];
                n = A(A.da[0][n2])[16];
                break;
            }
            case 1: {
                n = A(A.da[0][n2])[16];
                final int j = J(A.ca);
                int length = 0;
                if (A.oc[0][2] < A.qc[j].length) {
                    length = A.qc[j][A.oc[0][2]].length;
                }
                if (n > length) {
                    n3 = A.oc[0][1];
                    break;
                }
                n3 = A.oc[0][2];
                break;
            }
            case 2: {
                n3 = A.oc[0][3];
                n = A(A.da[0][n2])[16];
                break;
            }
            case 3: {
                n3 = A.oc[0][4];
                n = A(A.da[0][n2])[16];
                break;
            }
            case 4: {
                n3 = A.oc[0][5];
                break;
            }
            default: {
                n3 = A.oc[0][0];
                break;
            }
        }
        if (A.ca[45] != -1) {
            n3 = A.oc[0][5];
            n = 0;
        }
        if (n3 < 0 || n3 >= K(A.ca)) {
            n3 = 0;
        }
        if (n < 0 || n >= M(A.ca)) {
            n = 0;
        }
        if (L(A.ca) != n3) {
            E(A.ca, n3);
        }
        if (N(A.ca) != n) {
            F(A.ca, n);
        }
    }
    
    public static boolean DA() {
        return A.ca[45] == -1 || A.da[4][A.ca[45]][4] == -1 || A.va[A.da[4][A.ca[45]][4]][6] != 0;
    }
    
    public static int EA() {
        int n = -1;
        int n2 = -1;
        for (int i = 0; i < A.ea.length; ++i) {
            if (L(i) && M(i)) {
                final int n3 = (A.ea[i][4] - A.ca[4]) * B.d >> 12;
                final int n4 = (A.ea[i][5] - A.ca[5]) * B.d >> 12;
                final int n5 = n3 * n3 + n4 * n4;
                if (n5 < n2 || n2 == -1) {
                    n2 = n5;
                    n = i;
                }
            }
        }
        return n;
    }
    
    public static void FA() {
        if (A.ea.length == 0) {
            A.gB = -1;
            return;
        }
        int gb;
        if (A.gB == -1) {
            gb = 0;
        }
        else {
            gb = A.gB + 1;
        }
        A.gB = -1;
        for (int i = 0; i < A.ea.length; ++i) {
            if (gb == A.ea.length) {
                A.kB = true;
                break;
            }
            if (L(gb)) {
                A.gB = gb;
                A.kB = false;
                break;
            }
            ++gb;
        }
    }
    
    public static boolean L(int n) {
        if (n < 0 || n >= A.ea.length) {
            return false;
        }
        if (A.ea[n][11] == -1) {
            return false;
        }
        if ((A.ea[n][13] & 0x2) != 0x0 || (A.ea[n][3] & 0x10000) != 0x0 || N(n)) {
            return false;
        }
        final int n2 = (A.ea[n][4] * B.d >> 12) - A.tB;
        n = (A.ea[n][5] * B.d >> 12) - A.uB;
        return n2 >= 0 && n2 <= A.f && n >= 0 && n <= A.g;
    }
    
    public static boolean M(int n) {
        if (n < 0 || n > A.ea.length) {
            return false;
        }
        int v = V(BA());
        if (A.ca[45] != -1 && A.da[4][A.ca[45]][4] != -1) {
            final int[] array = A.va[A.da[4][A.ca[45]][4]];
            if (array[6] > 0) {
                v = array[7] * 4096 / 10;
            }
        }
        if (B.A(A.ca, A.ea[n], v) && B.F(A.ca, A.ea[n])) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n != 0;
    }
    
    public static boolean B(int n, final int[] array) {
        final int[][] array2 = A.da[n];
        final int n2 = 3;
        array[n2] &= 0xFFEFFFFF;
        if (n == 2 && array[4] == 0) {
            K(array[6]);
            if ((array[3] & 0x2) != 0x0) {
                B.D(array);
            }
            if (!A(3, n, (short)((array[2] & 0xFFFF0000) >> 16), 0, 0, false)) {
                A(11, n, array[4], 0, 0, false);
            }
            array[4] = -1;
            HG.M(10);
            return true;
        }
        if (n == 2) {
            for (int i = 0; i < array2.length; ++i) {
                if (array2[i][4] == array[4]) {
                    if (array[6] > 0) {
                        final int[] array3 = array2[i];
                        final int n3 = 6;
                        array3[n3] += array[6];
                    }
                    else {
                        final int[] array4 = array2[i];
                        final int n4 = 6;
                        ++array4[n4];
                    }
                    if ((array[3] & 0x2) != 0x0) {
                        B.D(array);
                    }
                    if (!A(3, n, (short)((array[2] & 0xFFFF0000) >> 16), 0, 0, false)) {
                        A(11, n, array[4], 0, 0, false);
                    }
                    if (array[4] == 1) {
                        n = (short)(A.ca[53] & 0xFFFF);
                        n += array[6];
                        final int[] ca = A.ca;
                        final int n5 = 53;
                        ca[n5] &= 0xFFFF0000;
                        final int[] ca2 = A.ca;
                        final int n6 = 53;
                        ca2[n6] |= ((short)n & 0xFFFF);
                    }
                    else if (array[4] == 2) {
                        n = (short)((A.ca[53] & 0xFFFF0000) >> 16);
                        n += array[6];
                        final int[] ca3 = A.ca;
                        final int n7 = 53;
                        ca3[n7] &= 0xFFFF;
                        final int[] ca4 = A.ca;
                        final int n8 = 53;
                        ca4[n8] |= ((short)n << 16 & 0xFFFF0000);
                    }
                    array[4] = -1;
                    HG.M(10);
                    return true;
                }
            }
        }
        for (int j = 0; j < array2.length; ++j) {
            if (array2[j][4] == -1) {
                if ((array[3] & 0x2) != 0x0) {
                    B.D(array);
                }
                for (int k = 0; k < array2[j].length; ++k) {
                    array2[j][k] = array[k];
                }
                array2[j][2] = -1;
                array2[j][1] = -1;
                array2[j][0] = -1;
                if (!A(3, n, (short)((array[2] & 0xFFFF0000) >> 16), 0, 0, false)) {
                    A(11, n, array[4], 0, 0, false);
                }
                if (n == 2) {
                    if (array[4] == 1) {
                        final int n9 = (short)(A.ca[53] & 0xFFFF) + array[6];
                        final int[] ca5 = A.ca;
                        final int n10 = 53;
                        ca5[n10] &= 0xFFFF0000;
                        final int[] ca6 = A.ca;
                        final int n11 = 53;
                        ca6[n11] |= ((short)n9 & 0xFFFF);
                    }
                    else if (array[4] == 2) {
                        final int n12 = (short)((A.ca[53] & 0xFFFF0000) >> 16) + array[6];
                        final int[] ca7 = A.ca;
                        final int n13 = 53;
                        ca7[n13] &= 0xFFFF;
                        final int[] ca8 = A.ca;
                        final int n14 = 53;
                        ca8[n14] |= ((short)n12 << 16 & 0xFFFF0000);
                    }
                }
                for (int l = 0; l < 8; ++l) {
                    final short n15 = (short)(A.ca[31 + l] & 0xFFFF);
                    final short n16 = (short)((A.ca[31 + l] & 0xFFFF0000) >> 16);
                    if ((A.ca[39] & 1 << l) == 0x0 && n15 == n && n16 == array[4]) {
                        final int[] ca9 = A.ca;
                        final int n17 = 31 + l;
                        ca9[n17] &= 0xFFFF;
                        final int[] ca10 = A.ca;
                        final int n18 = 31 + l;
                        ca10[n18] |= ((short)j << 16 & 0xFFFF0000);
                        final int[] ca11 = A.ca;
                        final int n19 = 39;
                        ca11[n19] |= 1 << l;
                    }
                }
                array[4] = -1;
                HG.M(10);
                return true;
            }
        }
        return false;
    }
    
    public static boolean GA() {
        if (A.ca[11] != 0) {
            return false;
        }
        if ((short)(B.f & 0xFFFF) != 1 || (short)((B.f & 0xFFFF0000) >> 16) != 2) {
            return false;
        }
        if (HG.A(10) != 0) {
            return false;
        }
        final short n = (short)(A.ca[0] & 0xFFFF);
        final short n2 = (short)((A.ca[0] & 0xFFFF0000) >> 16);
        final int n3 = (short)((B.g[n2][n] & 0xFFFF0000) >> 16) & 0xFF;
        for (short n4 = -2; n4 <= 2; ++n4) {
            for (short n5 = -2; n5 <= 2; ++n5) {
                if (n + n4 >= 0) {
                    if (n + n4 < B.b) {
                        if (n2 + n5 >= 0) {
                            if (n2 + n5 < B.c) {
                                final int n6 = (short)((B.g[n2 + n5][n + n4] & 0xFFFF0000) >> 16) & 0xFF;
                                for (int i = 0; i < A.sB.length; ++i) {
                                    if (n6 == A.sB[i]) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 4;
        for (int j = 0; j < A.qB.length; ++j) {
            if (n3 == A.qB[j]) {
                n7 = 1;
            }
        }
        if (HG.A(2) == 0) {
            for (int k = 0; k < A.rB.length; ++k) {
                if (n3 == A.rB[k]) {
                    n7 = 2;
                }
            }
        }
        for (int l = 0; l < A.oB.length; ++l) {
            if (n3 == A.oB[l]) {
                n8 = 2;
            }
        }
        for (int n10 = 0; n10 < A.nB.length; ++n10) {
            if (n3 == A.nB[n10]) {
                n8 = 1;
            }
        }
        for (int n11 = 0; n11 < A.pB.length; ++n11) {
            if (n3 == A.pB[n11]) {
                switch (A.ca[30]) {
                }
                n8 = 1;
            }
        }
        switch (A.ca[30]) {
            case 0: {
                n9 = 2;
                break;
            }
            case 1: {
                n9 = 3;
                break;
            }
            case 2: {
                n9 = 0;
                break;
            }
            case 3: {
                n9 = 1;
                break;
            }
        }
        B.M();
        String str = HG.I(432);
        for (int n12 = 0; n12 < B.xA; ++n12) {
            String str2 = "";
            switch (B.yA[n12]) {
                case 0: {
                    str2 = HG.I(175);
                    break;
                }
                case 1: {
                    str2 = HG.I(176);
                    break;
                }
                case 2: {
                    str2 = HG.I(177);
                    break;
                }
                case 3: {
                    str2 = HG.I(178);
                    break;
                }
                case 5: {
                    str2 = HG.I(179);
                    break;
                }
                case 4: {
                    str2 = HG.I(180);
                    break;
                }
            }
            str = str + " " + str2 + " ";
            if (n12 + 1 < B.xA) {
                str += HG.I(433);
            }
        }
        final String string = str + HG.I(434);
        I(n7, n8, n9);
        A(string, HG.I(314), 102, 101);
        return true;
    }
    
    public static void HA() {
        boolean b = false;
        int n = 0;
        if (A.ca[11] == 0) {
            A.eB = false;
        }
        if ((short)(A.ca[12] & 0xFFFF) <= 0) {
            N(A.ca, 16);
            if ((A.ca[3] & 0x800000) == 0x0) {
                A(17, 0, 0, 0, 0, true);
                HG.M(30);
                if (HG.MA(3)) {
                    Display.getDisplay((MIDlet)A.a).vibrate(1000);
                }
                final int[] ca = A.ca;
                final int n2 = 3;
                ca[n2] |= 0x800000;
                final int[] ca2 = A.ca;
                final int n3 = 3;
                ca2[n3] |= 0x8000;
                A(A.ca, true);
                A.gB = -1;
                A.tb = -1;
                A.ub = -1;
                A.vb = -1;
                A.db = false;
                A.eb = false;
                A.sD = false;
                for (int i = 0; i < A.qD.length; ++i) {
                    if ((byte)(A.qD[i][6] >> 16 & 0xFF) == 0) {
                        A.qD[i][6] = -1;
                    }
                }
                for (int j = 0; j < A.eC.length; ++j) {
                    A.eC[j][0] = 0;
                }
                if (HG.iA) {
                    HG.DA(11);
                }
                H(A.gB);
            }
            if (C(A.ca, false) && A.eB) {
                if (HA(2) || HA(3)) {
                    int n4 = 30;
                    int n5 = 312;
                    if (A.tE >= 0L && A.uE >= 0L) {
                        if (A.tE > A.uE) {
                            n4 = 39;
                            n5 = 313;
                        }
                    }
                    else if (A.tE >= 0L) {
                        n4 = 39;
                        n5 = 313;
                    }
                    D(n5, 382, n4, 34);
                }
                else {
                    D(390, 382, 1, 34);
                }
            }
            A.cB = false;
            A.dB = false;
            A.aB = false;
            A.bB = false;
            A.eB = false;
            A.fB = false;
            return;
        }
        if (A.o % 20 == 0 && !A.sD) {
            int n6 = (short)((A.ca[13] & 0xFFFF0000) >> 16) * 3 / 100;
            if (n6 == 0) {
                n6 = 1;
            }
            A(1, n6, true, false, A.ca);
        }
        final int k = J(A.ca[18]);
        if (k >= 0 && k <= A.ca[17]) {
            final int[] ca3 = A.ca;
            final int n7 = 18;
            ++ca3[n7];
            HG.M(7);
            N(A.ca[4], A.ca[5], (short)(A.ca[2] & 0xFFFF));
            A(24, 10, true, false, A.ca);
            A(2, 10, true, false, A.ca);
        }
        if (G(A.ca) == 8 || G(A.ca) == 9 || G(A.ca) == 10 || G(A.ca) == 11) {
            if (!C(A.ca, true)) {
                n = 1;
            }
            else if (A.ca[45] == -1) {
                final int[] ba = BA();
                if (A.iB != -1 && A.jB) {
                    A.lB = A(A.ca, A.ea[A.iB], ba);
                }
                else {
                    A.lB = 10;
                }
                A.iB = -1;
                A.jB = false;
                H(A.gB);
            }
        }
        if (n == 0 && !A.sD) {
            int f;
            if ((A.cB || A.dB) && (A.aB || A.bB)) {
                f = F(A.ca[52] * A.ca[52] >> 1);
            }
            else {
                f = A.ca[52];
            }
            int n8 = A.ca[4];
            int n9 = A.ca[5];
            if (A.cB) {
                n9 -= f;
                A.ca[30] = 0;
                b = true;
            }
            if (A.dB) {
                n9 += f;
                A.ca[30] = 2;
                b = true;
            }
            if (A.aB) {
                n8 -= f;
                A.ca[30] = 3;
                b = true;
            }
            if (A.bB) {
                n8 += f;
                A.ca[30] = 1;
                b = true;
            }
            if (b) {
                --A.mB;
                if (A.mB == 2 && (short)(B.f & 0xFFFF) == 0) {
                    F(A.ca, true);
                }
                if (A.mB <= 0) {
                    A.mB = 4;
                    if ((short)(B.f & 0xFFFF) == 0) {
                        F(A.ca, false);
                    }
                }
                final int n10 = A.ca[0];
                if (B.A(A.ca, n8, n9, 4128) == -2) {
                    final int[] ca4 = A.ca;
                    final int n11 = 52;
                    ca4[n11] += A.ca[16] >> 3;
                    if (A.ca[52] > A.ca[16]) {
                        A.ca[52] = A.ca[16];
                    }
                }
                else {
                    A.ca[52] = A.ca[16] >> 1;
                }
                if (A.ca[0] != n10) {
                    final boolean a = A(8, (short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16), (short)(n10 & 0xFFFF), (short)((n10 & 0xFFFF0000) >> 16), false);
                    final boolean a2 = A(13, (short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16), (short)(n10 & 0xFFFF), (short)((n10 & 0xFFFF0000) >> 16), false);
                    final boolean b2 = A.ca[11] == 0 && A(18, (short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16), 0, 0, false);
                    if (!b2) {
                        A.zD = -1;
                    }
                    if (!a && !a2 && !b2 && GA()) {
                        return;
                    }
                }
            }
            else {
                A.ca[52] = A.ca[16] >> 1;
            }
        }
        if (DA()) {
            if (A.fB) {
                FA();
                H(A.gB);
            }
            if (!L(A.gB)) {
                H(A.gB = -1);
            }
            A.hB = M(A.gB);
            if ((A.gB == -1 && !A.kB) || (!A.hB && A.eB)) {
                final int ea = EA();
                if (ea != -1) {
                    if (A.eB) {
                        A.kB = false;
                    }
                    H(A.gB = ea);
                    A.hB = true;
                }
            }
            final int z = Z(BA());
            if (z == 3 && (short)((A.ca[53] & 0xFFFF0000) >> 16) <= 0) {
                A.hB = false;
            }
            else if (z == 2 && (short)(A.ca[53] & 0xFFFF) <= 0) {
                A.hB = false;
            }
        }
        else {
            A.gB = -1;
            A.hB = false;
            H(A.gB);
        }
        --A.lB;
        if (A.ca[45] == -1) {
            A.sD = false;
        }
        if (A.eB && A.lB < 0) {
            if (A.ca[45] >= 0) {
                DA(A.ca[45]);
                N(A.ca, 12 + A.ca[30]);
            }
            else if (A.gB != -1) {
                if (A.hB) {
                    A.ca[30] = N(A.ea[A.gB][4] - A.ca[4], A.ea[A.gB][5] - A.ca[5]);
                    N(A.ca, 8 + A.ca[30]);
                    A.iB = A.gB;
                    A.jB = A.hB;
                    A.lB = Integer.MAX_VALUE;
                }
            }
            else {
                N(A.ca, 8 + A.ca[30]);
                A.iB = -1;
                A.jB = false;
                A.lB = Integer.MAX_VALUE;
            }
            n = 1;
        }
        if (n == 0) {
            if (!A.sD) {
                if (b) {
                    N(A.ca, 4 + A.ca[30]);
                }
                else {
                    N(A.ca, 0 + A.ca[30]);
                }
            }
            C(A.ca, true);
        }
        CA();
        F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
        A.cB = false;
        A.dB = false;
        A.aB = false;
        A.bB = false;
        A.eB = false;
        A.fB = false;
    }
    
    public static void IA() {
        A.tB = (A.ca[4] * B.d >> 12) - (A.f >> 1);
        A.uB = (A.ca[5] * B.d >> 12) - (A.g >> 1);
        JA();
    }
    
    public static void JA() {
        boolean b = true;
        if (A.gB != -1) {
            final int n = A.ca[4] - A.ea[A.gB][4];
            final int n2 = A.ca[5] - A.ea[A.gB][5];
            if (E(n) * 4 / 3 < (A.f << 12) / B.d && E(n2) * 4 / 3 < (A.g << 12) / B.d) {
                b = false;
                final int n3 = A.ca[4] + A.ea[A.gB][4] >> 1;
                final int n4 = A.ca[5] + A.ea[A.gB][5] >> 1;
                A.vB = (n3 * B.d >> 12) - (A.f >> 1);
                A.wB = (n4 * B.d >> 12) - (A.g >> 1);
            }
        }
        if (b) {
            A.vB = (A.ca[4] * B.d >> 12) - (A.f >> 1);
            A.wB = (A.ca[5] * B.d >> 12) - (A.g >> 1);
            switch (A.ca[30]) {
                case 0: {
                    A.wB -= 1 * B.e;
                    break;
                }
                case 1: {
                    A.vB += 1 * B.d;
                    break;
                }
                case 2: {
                    A.wB += 1 * B.e;
                    break;
                }
                case 3: {
                    A.vB -= 1 * B.d;
                    break;
                }
            }
        }
        A.tB = A.tB * 100 + A.vB * 28 >> 7;
        A.uB = A.uB * 100 + A.wB * 28 >> 7;
        if (A.ca[11] != 0) {
            if (A.tB < -(0 * B.e)) {
                A.tB = -(0 * B.e);
            }
            if (A.uB < -(3 * B.e)) {
                A.uB = -(3 * B.e);
            }
            if (A.tB > (B.b + 0) * B.d - A.f) {
                A.tB = (B.b + 0) * B.d - A.f;
            }
            if (A.uB > (B.c + 3) * B.e - A.g) {
                A.uB = (B.c + 3) * B.e - A.g;
            }
            if ((B.b + 0) * B.d < A.f) {
                A.tB = (B.b * B.d >> 1) - (A.f >> 1);
            }
            if ((B.c + 6) * B.e < A.g) {
                A.uB = (B.c * B.e >> 1) - (A.g >> 1);
            }
        }
        else {
            if (A.tB < -(0 * B.e)) {
                A.tB = -(0 * B.e);
            }
            if (A.uB < -(0 * B.e) - A.yD) {
                A.uB = -(0 * B.e) - A.yD;
            }
            if (A.tB > (B.b + 0) * B.d - A.f) {
                A.tB = (B.b + 0) * B.d - A.f;
            }
            if (A.uB > (B.c + 5) * B.e - A.g) {
                A.uB = (B.c + 5) * B.e - A.g;
            }
            if ((B.b + 0) * B.d < A.f) {
                A.tB = (B.b * B.d >> 1) - (A.f >> 1);
            }
            if ((B.c + 5) * B.e < A.g) {
                A.uB = (B.c * B.e >> 1) - (A.g >> 1);
            }
        }
    }
    
    static void KA() {
        for (int i = 0; i < A.ea.length; ++i) {
            final int[] array = A.ea[i];
            final int[] array2 = A.fa[array[11]];
            final int n = A.ea[i][13];
            if ((A.ea[i][3] & 0x10000) == 0x0) {
                if (!P(i)) {
                    final boolean n2 = N(i);
                    final boolean b = (n & 0x80) != 0x0;
                    final boolean b2 = (n & 0x8) != 0x0;
                    final boolean b3 = (short)(A.ea[i][20] & 0xFFFF) >= 0;
                    int n3 = (A.ea[i][22] >= 0 || (n & 0x40) != 0x0) ? 1 : 0;
                    if ((n & 0x10) != 0x0) {}
                    final boolean b4 = ((array2[13] & 0x1) != 0x0 || (array2[13] & 0x2) != 0x0 || (array2[13] & 0x4) != 0x0) && array2[27] == 0;
                    final boolean b5 = (short)((A.ea[i][12] & 0xFFFF0000) >> 16) > 0 && (short)(A.ea[i][12] & 0xFFFF) * 100 / (short)((A.ea[i][12] & 0xFFFF0000) >> 16) < 50;
                    final boolean b6 = (short)((A.ea[i][12] & 0xFFFF0000) >> 16) > 0 && (short)(A.ea[i][12] & 0xFFFF) * 100 / (short)((A.ea[i][12] & 0xFFFF0000) >> 16) < 20;
                    boolean b7 = false;
                    final boolean b8 = (array2[13] & 0x80) != 0x0;
                    if (A.ea[i][21] >= 0) {
                        final int[] array3 = A.ea[i];
                        final int n4 = 21;
                        --array3[n4];
                    }
                    int n5 = (short)((A.ea[i][26] & 0xFFFF0000) >> 16);
                    int n6 = (short)(A.ea[i][26] & 0xFFFF);
                    if (n5 >= 0 && b3) {
                        if (--n5 < 0) {
                            n5 = 20;
                            ++n6;
                        }
                        A.ea[i][26] = (((short)n6 & 0xFFFF) | ((short)n5 << 16 & 0xFFFF0000));
                    }
                    if (b) {
                        if (A.ea[i][25] <= 0) {
                            final int[] array4 = A.ea[i];
                            final int n7 = 13;
                            array4[n7] &= 0xFFFFFF7F;
                            final short n8 = (short)(A.ea[i][20] & 0xFFFF);
                            if (n8 >= 0) {
                                B.a[n8][20] = -1;
                                B.a[n8][22] = -1;
                                A.ea[i][20] = -1;
                                A.ea[i][22] = -1;
                                continue;
                            }
                        }
                        final int[] array5 = A.ea[i];
                        final int n9 = 25;
                        --array5[n9];
                    }
                    if ((n & 0x200) != 0x0 && (A.bc || A.ea[i][30] > 0)) {
                        final int[] array6 = A.ea[i];
                        final int n10 = 30;
                        --array6[n10];
                        if (A.bc || A.ea[i][30] <= 0) {
                            final int[] array7 = A.ea[i];
                            final int n11 = 13;
                            array7[n11] &= 0xFFFFFDFF;
                            A.ea[i][20] = -1;
                            A.ea[i][22] = -1;
                            A.ea[i][30] = 0;
                            continue;
                        }
                    }
                    if (!b2) {
                        if ((array2[13] & 0x200) != 0x0) {
                            if (b6 && HG.A(100) < 60) {
                                b7 = true;
                            }
                            else if (b5 && HG.A(100) < 25) {
                                b7 = true;
                            }
                            if (b7) {
                                boolean b9 = false;
                                for (int j = 0; j < 2; ++j) {
                                    final short n12 = (short)((A.ea[i][17 + j] & 0xFFFF0000) >> 16);
                                    if ((short)(A.ea[i][17 + j] & 0xFFFF) == 2 && n12 >= 0) {
                                        final int[] a = A(A.ka[n12]);
                                        if (a[6] == 0 && a[3] > 0) {
                                            A(a[6], a[3], true, false, A.ea[i]);
                                            A.ea[i][17 + j] = -1;
                                            b9 = true;
                                            H(A.gB);
                                            L(A.ea[i][4], A.ea[i][5], (short)(A.ea[i][2] & 0xFFFF));
                                            A.ea[i][21] = 20;
                                            break;
                                        }
                                    }
                                }
                                if (b9) {
                                    continue;
                                }
                            }
                        }
                        if (b3) {
                            final short n13 = (short)(array[20] & 0xFFFF);
                            if (D(i, B.a[n13])) {
                                final int f = F(array);
                                final int f2 = F(B.a[n13]);
                                A.xB[0] = (short)(f & 0xFFFF) << 11;
                                A.xB[1] = (short)((f & 0xFFFF0000) >> 16) << 11;
                                A.yB[0] = (short)(f2 & 0xFFFF) << 11;
                                A.yB[1] = (short)((f2 & 0xFFFF0000) >> 16) << 11;
                                int v = array2[29];
                                int n14 = array2[29] * array2[29];
                                if (array[14] >= 0) {
                                    v = V(A.ga[array[14]]);
                                    final int z = Z(A.ga[array[14]]);
                                    if (z == 0 || z == 1) {
                                        n14 = v * v;
                                    }
                                }
                                if (array[15] >= 0) {
                                    final int v2 = V(A.ga[array[15]]);
                                    final int z2 = Z(A.ga[array[15]]);
                                    if (z2 == 0 || z2 == 1) {
                                        n14 = v2 * v2;
                                    }
                                    if (v2 > v) {
                                        v = v2;
                                    }
                                }
                                final long a2 = A(A.xB, A.yB);
                                final boolean b10 = a2 <= n14;
                                boolean b11 = false;
                                if ((array2[13] & 0x1) != 0x0 || (array2[13] & 0x2) != 0x0) {
                                    n6 = 10;
                                }
                                if (b10 || (a2 <= v * v && n6 > 3)) {
                                    A.ea[i][26] = 10;
                                    if (Q(i)) {
                                        continue;
                                    }
                                    if (A.ea[i][21] < 0) {
                                        if (C(i, n13, b10) != -1) {
                                            final int n15 = N(B.a[n13][4] - A.ea[i][4], B.a[n13][5] - A.ea[i][5]);
                                            A.ea[i][27] = (((short)n15 & 0xFFFF) | ((short)n15 << 16 & 0xFFFF0000));
                                            N(A.ea[i], 8 + n15);
                                            final int[] array8 = A.ea[i];
                                            final int n16 = 13;
                                            array8[n16] |= 0x10;
                                            if (b8) {
                                                D(i, true);
                                            }
                                            T(i);
                                            final int[] array9 = A.ea[i];
                                            final int n17 = 13;
                                            array9[n17] &= 0xFFFFFFBF;
                                            A.ea[i][22] = -1;
                                            continue;
                                        }
                                    }
                                    else {
                                        N(A.ea[i], 0 + (short)(A.ea[i][27] & 0xFFFF));
                                        n3 = 0;
                                        b11 = true;
                                    }
                                }
                                if (!b11) {
                                    final int n18 = array2[11] * 4096;
                                    if (B.A(A.ea[i], B.a[n13], n18)) {
                                        if ((array2[13] & 0x1) == 0x0 && (array2[13] & 0x2) == 0x0 && (A.ea[i][13] & 0x80) == 0x0 && !n2 && ((short)(A.ea[i][20] & 0xFFFF) != (short)((A.ea[i][20] & 0xFFFF0000) >> 16) || A.ea[i][20] == -1) && (short)(A.ea[i][26] & 0xFFFF) < 3) {
                                            if (b8) {
                                                D(i, false);
                                            }
                                            if ((short)((A.ea[i][26] & 0xFFFF0000) >> 16) == 20) {
                                                final int n19 = N(B.a[n13][4] - A.ea[i][4], B.a[n13][5] - A.ea[i][5]);
                                                A.ea[i][27] = (((short)n19 & 0xFFFF) | ((short)n19 << 16 & 0xFFFF0000));
                                                N(A.ea[i], 12 + (short)(A.ea[i][27] & 0xFFFF));
                                            }
                                            if (C(A.ea[i], true)) {
                                                N(A.ea[i], 0 + (short)(A.ea[i][27] & 0xFFFF));
                                            }
                                            continue;
                                        }
                                        else if (n3 == 0) {
                                            A.ea[i][22] = F(B.a[n13]);
                                            n3 = 1;
                                        }
                                    }
                                    else if ((array2[13] & 0x1) == 0x0 && (array2[13] & 0x2) == 0x0 && (short)(A.ea[i][26] & 0xFFFF) <= 3) {
                                        if ((A.ea[i][13] & 0x8000) == 0x0) {
                                            final int[] array10 = A.ea[i];
                                            final int n20 = 20;
                                            array10[n20] &= 0xFFFF0000;
                                            final int[] array11 = A.ea[i];
                                            final int n21 = 20;
                                            array11[n21] |= 0xFFFF;
                                            A.ea[i][22] = A.ea[i][23];
                                            A.ea[i][26] = 1376256;
                                        }
                                    }
                                    else if (A.ea[i][22] == -1) {
                                        A.ea[i][22] = F(B.a[n13]);
                                        final int[] array12 = A.ea[i];
                                        final int n22 = 13;
                                        array12[n22] &= 0xFFFFFFBF;
                                        final int[] array13 = A.ea[i];
                                        final int n23 = 13;
                                        array13[n23] &= 0xFFFFFDFF;
                                    }
                                    else {
                                        A.xB[0] = A.ea[i][4];
                                        A.xB[1] = A.ea[i][5];
                                        long n24 = n18;
                                        if ((array2[13] & 0x1) == 0x0 && (A.ea[i][13] & 0x8000) == 0x0) {
                                            if ((array2[13] & 0x2) != 0x0) {
                                                n24 *= 4L;
                                            }
                                            else if ((array2[13] & 0x4) != 0x0) {
                                                n24 *= 3L;
                                            }
                                            else if ((array2[13] & 0x8) != 0x0) {
                                                n24 *= 2L;
                                            }
                                            A.yB[0] = ((short)(A.ea[i][23] & 0xFFFF) << 11) + 2048;
                                            A.yB[1] = ((short)((A.ea[i][23] & 0xFFFF0000) >> 16) << 11) + 2048;
                                            if (A(A.xB, A.yB) > n24 * n24 || (A.ea[i][13] & 0x4000) != 0x0) {
                                                if ((A.ea[i][13] & 0x40) != 0x0) {
                                                    final int[] array14 = A.ea[i];
                                                    final int n25 = 13;
                                                    array14[n25] &= 0xFFFFFFBF;
                                                    T(i);
                                                }
                                                final int[] array15 = A.ea[i];
                                                final int n26 = 13;
                                                array15[n26] |= 0x4000;
                                                if (F(A.ea[i]) != A.ea[i][23]) {
                                                    A.ea[i][22] = A.ea[i][23];
                                                    n3 = 1;
                                                }
                                                final int[] array16 = A.ea[i];
                                                final int n27 = 20;
                                                array16[n27] &= 0xFFFF0000;
                                                final int[] array17 = A.ea[i];
                                                final int n28 = 20;
                                                array17[n28] |= 0xFFFF;
                                                final int[] array18 = A.ea[i];
                                                final int n29 = 20;
                                                array18[n29] &= 0xFFFF;
                                                final int[] array19 = A.ea[i];
                                                final int n30 = 20;
                                                array19[n30] |= (n13 << 16 & 0xFFFF0000);
                                            }
                                        }
                                    }
                                }
                            }
                            else if ((A.fa[A.ea[i][11]][13] & 0x8) == 0x0) {
                                if ((A.ea[i][13] & 0x20000) == 0x0) {
                                    C(i, b4);
                                }
                            }
                            else {
                                final int[] array20 = A.ea[i];
                                final int n31 = 20;
                                array20[n31] &= 0xFFFF0000;
                                final int[] array21 = A.ea[i];
                                final int n32 = 20;
                                array21[n32] |= 0xFFFF;
                            }
                        }
                        if (n3 != 0 && (A.ea[i][13] & 0x200) == 0x0) {
                            if ((A.ea[i][13] & 0x4000) == 0x0 && A.o % A.ea.length == i) {
                                final int n33 = A.ea[i][29];
                                final short n34 = (short)(array[20] & 0xFFFF);
                                if (n34 >= 0) {
                                    A.xB[0] = ((short)(A.ea[i][0] & 0xFFFF) << 12) + 2048;
                                    A.xB[1] = ((short)((A.ea[i][0] & 0xFFFF0000) >> 16) << 12) + 2048;
                                    A.yB[0] = ((short)(B.a[n34][0] & 0xFFFF) << 12) + 2048;
                                    A.yB[1] = ((short)((B.a[n34][0] & 0xFFFF0000) >> 16) << 12) + 2048;
                                    final long a3 = A(A.xB, A.yB);
                                    A.yB[0] = ((short)(A.ea[i][22] & 0xFFFF) / 2 << 12) + 2048;
                                    A.yB[1] = ((short)((A.ea[i][22] & 0xFFFF0000) >> 16) / 2 << 12) + 2048;
                                    final long a4 = A(A.xB, A.yB);
                                    A.xB[0] = ((short)(B.a[n34][0] & 0xFFFF) << 12) + 2048;
                                    A.xB[1] = ((short)((B.a[n34][0] & 0xFFFF0000) >> 16) << 12) + 2048;
                                    final long n35 = A(A.xB, A.yB) - n33 * n33;
                                    if ((a3 < a4 + n35 && n35 > n33 * n33) || F(A.ea[i]) == A.ea[i][22]) {
                                        A.ea[i][22] = F(B.a[n34]);
                                        final int[] array22 = A.ea[i];
                                        final int n36 = 13;
                                        array22[n36] &= 0xFFFFFFBF;
                                        final int[] array23 = A.ea[i];
                                        final int n37 = 13;
                                        array23[n37] &= 0xFFFFFDFF;
                                        T(i);
                                        n3 = 1;
                                    }
                                }
                            }
                            O(i);
                        }
                        if (!b3) {
                            if ((A.fa[A.ea[i][11]][13] & 0x8) == 0x0 && (A.ea[i][13] & 0x20000) == 0x0) {
                                C(i, b4);
                            }
                            if (n3 == 0 && (short)(A.ea[i][20] & 0xFFFF) == -1) {
                                N(A.ea[i], 0 + (short)(A.ea[i][27] & 0xFFFF));
                                final int[] array24 = A.ea[i];
                                final int n38 = 13;
                                array24[n38] &= 0xFFFFBFFF;
                                if (array2[27] == 0 || array2[27] == 9) {
                                    final int[] array25 = A.ea[i];
                                    final int n39 = 31;
                                    --array25[n39];
                                    if (A.ea[i][31] <= 0) {
                                        A.ea[i][31] = HG.A(20, 50);
                                        final int f3 = F(A.ea[i]);
                                        final int n40 = (short)(f3 & 0xFFFF) + HG.A(-5, 5);
                                        final int n41 = (short)((f3 & 0xFFFF0000) >> 16) + HG.A(-5, 5);
                                        if (A(i, 0, n40, n41, true, false)) {
                                            A.ea[i][22] = (((short)n40 & 0xFFFF) | ((short)n41 << 16 & 0xFFFF0000));
                                        }
                                    }
                                }
                            }
                        }
                        C(A.ea[i], true);
                    }
                }
            }
        }
        A.bc = false;
    }
    
    static void LA() {
        A.nA = 0;
        int n = 0;
        for (int i = 0; i < A.ea.length; ++i) {
            A.ea[i][21] = -1;
            A.ea[i][20] = -1;
            A.ea[i][16] = -1;
            A.ea[i][22] = -1;
            A.ea[i][26] = 1376256;
            A.ea[i][31] = HG.A(20, 50);
            A.ea[i][29] = A.fa[A.ea[i][11]][29];
            A.ea[i][23] = F(A.ea[i]);
            final short n2 = (short)(A.ea[i][12] & 0xFFFF);
            if (A.ca[11] >= 0) {
                int n3 = 0;
                for (int j = 0; j < 2; ++j) {
                    if ((short)(A.ea[i][17 + j] & 0xFFFF) == 5) {
                        if ((A.bA[A.ca[11]] & 1 << B.j + n) == 0x0) {
                            ++n3;
                        }
                        ++n;
                    }
                }
                if (n3 == 0 && n2 < 0) {
                    final int[] array = A.ea[i];
                    final int n4 = 3;
                    array[n4] |= 0x10000;
                    if ((A.ea[i][3] & 0x2) != 0x0) {
                        B.D(A.ea[i]);
                    }
                    A.ea[i][0] = -1;
                    final int[] ca = A.cA;
                    final int n5 = A.ca[11];
                    ca[n5] |= 1 << i;
                }
            }
            if (A.ca[11] == -1 || (A.cA[A.ca[11]] & 1 << i) == 0x0) {
                if ((A.ea[i][3] & 0x10000) == 0x0 && !N(i) && n2 > 0) {
                    ++A.nA;
                }
                final int n6 = A.ea[i][11];
                final short n7 = (short)(A.fa[n6][1] & 0xFFFF);
                final short n8 = (short)((A.fa[n6][1] & 0xFFFF0000) >> 16);
                final byte b = (byte)(A.fa[n6][4] & 0xFF);
                final byte b2 = (byte)(A.fa[n6][4] >> 8 & 0xFF);
                int n9 = (byte)(A.fa[n6][4] >> 16 & 0xFF);
                D(A.ea[i], 1 + n7 - 134);
                E(A.ea[i], A.oc[0][0]);
                F(A.ea[i], 0);
                final int o = O(A.ea[i]);
                if (O(A.ea[i]) > 0) {
                    B(A.ea[i], 0, n8);
                }
                if (A.fa[n6][4] != -1) {
                    if (o >= 1) {
                        B(A.ea[i], 1, b);
                    }
                    if (n9 < 0) {
                        n9 = n9 * -1 - 1;
                        if (Q(A.ea[i]) > 0) {
                            D(A.ea[i], 0, 1);
                        }
                    }
                    else if (o >= 2) {
                        B(A.ea[i], 2, b2);
                    }
                    if (J(A.ea[i], 0) > 0) {
                        C(A.ea[i], 0, n9);
                    }
                }
                if (A.fa[A.ea[i][11]][27] != 7 && A.fa[A.ea[i][11]][27] != 8) {
                    B.G(i);
                }
                final int n10 = A.ea[i][14];
                if (n10 >= 0) {
                    A.ea[i][29] = V(A.ga[n10]);
                    C(i, A(A.ga[n10]));
                }
                N(A.ea[i], 0 + (short)(A.ea[i][27] & 0xFFFF));
            }
        }
    }
    
    static boolean N(final int n) {
        final int n2 = A.fa[A.ea[n][11]][27];
        return A.ea[n][11] >= 0 && (n2 == 6 || n2 == 7 || n2 == 8 || n2 == 9);
    }
    
    static void C(final int n, final int[] array) {
        if (array == null) {
            return;
        }
        final int j = J(A.ea[n]);
        int n2 = A.oc[j][0];
        switch (array[15]) {
            case 0: {
                n2 = A.oc[j][1];
                break;
            }
            case 1: {
                int length = 0;
                if (A.oc[j][2] < A.qc[j].length) {
                    length = A.qc[j][A.oc[j][2]].length;
                }
                if (array[16] > length) {
                    n2 = A.oc[j][1];
                    break;
                }
                n2 = A.oc[j][2];
                break;
            }
            case 2: {
                n2 = A.oc[j][3];
                break;
            }
            case 3: {
                n2 = A.oc[j][4];
                break;
            }
        }
        int n3 = array[16];
        if (n2 >= K(A.ea[n])) {
            n2 = 0;
        }
        E(A.ea[n], n2);
        if (n3 >= M(A.ea[n])) {
            n3 = 0;
        }
        F(A.ea[n], n3);
    }
    
    static boolean D(final int n, final int[] array) {
        if ((array[3] & 0x10) != 0x0) {
            return (A.ea[n][13] & 0x80) == 0x0 && (short)(A.ca[12] & 0xFFFF) > 0;
        }
        return (array[3] & 0x20) != 0x0 && (array[13] & 0x2) == 0x0 && (array[3] & 0x10000) == 0x0 && ((A.ea[n][13] & 0x80) == 0x0 || (array[13] & 0x80) == 0x0);
    }
    
    static int F(final int[] array) {
        int n;
        int n2;
        if ((array[3] & 0x10) != 0x0) {
            n = -1024;
            n2 = -2048;
        }
        else {
            final int[] a = A(array);
            n = (short)(a[2] & 0xFFFF);
            n2 = (short)((a[2] & 0xFFFF0000) >> 16);
        }
        return ((short)(array[4] + n >> 11) & 0xFFFF) | ((short)(array[5] + n2 >> 11) << 16 & 0xFFFF0000);
    }
    
    static void C(final int n, final boolean b) {
        final int[] array = A.fa[A.ea[n][11]];
        final long n2 = array[11] * 4096;
        short n3 = -1;
        A.xB[0] = A.ea[n][4];
        A.xB[1] = A.ea[n][5];
        if ((A.ea[n][13] & 0x80) == 0x0 && !N(n)) {
            A.yB[0] = A.ca[4];
            A.yB[1] = A.ca[5];
            if (A(A.xB, A.yB) <= n2 * n2 && (short)(A.ca[12] & 0xFFFF) > 0) {
                A.ea[n][22] = F(A.ca);
                n3 = (short)(A.ca[2] & 0xFFFF);
            }
        }
        if (b && (A.ea[n][13] & 0x80) == 0x0) {
            for (int i = 0; i < A.ea.length; ++i) {
                if (i != n && ((A.fa[A.ea[i][11]][13] & 0x8) != 0x0 || N(i))) {
                    if ((short)(A.fa[A.ea[i][11]][1] & 0xFFFF) != (short)(array[1] & 0xFFFF) || (A.ea[n][13] & 0x80) != 0x0) {
                        A.yB[0] = A.ea[i][4];
                        A.yB[1] = A.ea[i][5];
                        if (A(A.xB, A.yB) <= n2 * n2 && D(n, A.ea[i])) {
                            A.ea[n][22] = F(A.ea[i]);
                            n3 = (short)(A.ea[i][2] & 0xFFFF);
                            break;
                        }
                    }
                }
            }
        }
        else if (N(n) || (A.ea[n][13] & 0x80) != 0x0) {
            for (int j = 0; j < A.ea.length; ++j) {
                if (j != n) {
                    if (!N(j)) {
                        A.yB[0] = A.ea[j][4];
                        A.yB[1] = A.ea[j][5];
                        if (A(A.xB, A.yB) <= n2 * n2 && D(n, A.ea[j])) {
                            A.ea[n][22] = F(A.ea[j]);
                            n3 = (short)(A.ea[j][2] & 0xFFFF);
                            break;
                        }
                    }
                }
            }
        }
        if (n3 >= 0) {
            final int[] array2 = A.ea[n];
            final int n4 = 13;
            array2[n4] &= 0xFFFFFDFF;
            final int[] array3 = A.ea[n];
            final int n5 = 20;
            array3[n5] &= 0xFFFF0000;
            final int[] array4 = A.ea[n];
            final int n6 = 20;
            array4[n6] |= (n3 & 0xFFFF);
        }
        else {
            final int[] array5 = A.ea[n];
            final int n7 = 20;
            array5[n7] &= 0xFFFF0000;
            final int[] array6 = A.ea[n];
            final int n8 = 20;
            array6[n8] |= 0xFFFF;
            final int[] array7 = A.ea[n];
            final int n9 = 13;
            array7[n9] &= 0xFFFF7FFF;
        }
        if (n3 != (short)((A.ea[n][20] & 0xFFFF0000) >> 16)) {
            final int n10 = A.ea[n][14];
            if (n10 >= 0) {
                A.ea[n][29] = V(A.ga[n10]);
            }
            A.ea[n][26] = 1376256;
            final int[] array8 = A.ea[n];
            final int n11 = 13;
            array8[n11] &= 0xFFFF7FFF;
        }
    }
    
    static void O(final int n) {
        int n2 = ((short)(A.ea[n][22] & 0xFFFF) << 11) + 2048;
        int n3 = ((short)((A.ea[n][22] & 0xFFFF0000) >> 16) << 11) + 2048;
        final int[] a = A(A.ea[n]);
        if ((A.ea[n][13] & 0x40) != 0x0) {
            final int n4 = A.ea[n][24];
            final int n5 = (short)(A.xa[n][n4] & 0xFFFF) << 11;
            final int n6 = (short)((A.xa[n][n4] & 0xFFFF0000) >> 16) << 11;
            n2 = n5 - (short)(a[2] & 0xFFFF);
            n3 = n6 - (short)((a[2] & 0xFFFF0000) >> 16);
        }
        final int n7 = A.ea[n][4];
        final int n8 = A.ea[n][5];
        final int n9 = n2;
        final int n10 = n3;
        if ((A.ea[n][13] & 0x40) == 0x0 && B.A(n7, n8, n9, n10, 4128, A.ac) != -2) {
            S(n);
            return;
        }
        final int n11 = a[9];
        A.xB[0] = n7;
        A.xB[1] = n8;
        A.yB[0] = n9 - n7;
        A.yB[1] = n10 - n8;
        A.zB[0] = n9;
        A.zB[1] = n10;
        if (A(A.xB, A.zB) <= n11 * n11) {
            B.A(A.ea[n], n9, n10, 0);
            if ((A.ea[n][13] & 0x40) != 0x0) {
                final int n12 = (short)(A.ea[n][0] & 0xFFFF) * 2;
                final int n13 = (short)((A.ea[n][0] & 0xFFFF0000) >> 16) * 2;
                final int n14 = n12 + ((short)(a[3] & 0xFFFF) - (short)(a[2] & 0xFFFF) >> 11);
                for (int n15 = n13 + ((short)((a[3] & 0xFFFF0000) >> 16) - (short)((a[2] & 0xFFFF0000) >> 16) >> 11), i = n13; i <= n15; ++i) {
                    for (int j = n12; j <= n14; ++j) {
                        if (B(0, B.c * 2, i) && B(0, B.b * 2, j) && (byte)(A.wa[i * B.b * 2 * 3 + j * 3 + 2] >> 16 & 0xFF) == n) {
                            final int[] wa = A.wa;
                            final int n16 = i * B.b * 2 * 3 + j * 3 + 2;
                            wa[n16] &= 0xFFFF;
                            final int[] wa2 = A.wa;
                            final int n17 = i * B.b * 2 * 3 + j * 3 + 2;
                            wa2[n17] |= 0xFFFF0000;
                        }
                    }
                }
                final int[] array = A.ea[n];
                final int n18 = 24;
                ++array[n18];
                if (A.ea[n][24] >= A.xa[n].length) {
                    A.ea[n][22] = -1;
                    final int[] array2 = A.ea[n];
                    final int n19 = 13;
                    array2[n19] &= 0xFFFFFFBF;
                    T(n);
                    if ((A.ea[n][13] & 0x10000) != 0x0) {
                        final int[] array3 = A.ea[n];
                        final int n20 = 13;
                        array3[n20] &= 0xFFFEFFFF;
                        final int[] array4 = A.ea[n];
                        final int n21 = 13;
                        array4[n21] &= 0xFFFDFFFF;
                        A(14, n, (short)(A.ea[n][0] & 0xFFFF), (short)((A.ea[n][0] & 0xFFFF0000) >> 16), 0, false);
                    }
                }
                else {
                    final short n22 = (short)(A.xa[n][A.ea[n][24]] & 0xFFFF);
                    final short n23 = (short)((A.xa[n][A.ea[n][24]] & 0xFFFF0000) >> 16);
                    A(A.ea[n], true);
                    if (!A(n, 1, n22, n23, true, false)) {
                        A.ea[n][22] = A.xa[n][A.xa[n].length - 1];
                        S(n);
                    }
                    A(A.ea[n], false);
                }
            }
            else {
                A.ea[n][22] = -1;
                if ((A.ea[n][13] & 0x10000) != 0x0) {
                    final int[] array5 = A.ea[n];
                    final int n24 = 13;
                    array5[n24] &= 0xFFFEFFFF;
                    final int[] array6 = A.ea[n];
                    final int n25 = 13;
                    array6[n25] &= 0xFFFDFFFF;
                    A(14, n, (short)(A.ea[n][0] & 0xFFFF), (short)((A.ea[n][0] & 0xFFFF0000) >> 16), 0, false);
                }
            }
        }
        else {
            if ((A.ea[n][3] & 0x2) != 0x0) {
                B.D(A.ea[n]);
            }
            A(A.yB, n11, A.zB);
            final int[] array7 = A.ea[n];
            final int n26 = 4;
            array7[n26] += A.zB[0];
            final int[] array8 = A.ea[n];
            final int n27 = 5;
            array8[n27] += A.zB[1];
            final int f = F(A.ea[n]);
            final short n28 = (short)(f & 0xFFFF);
            final short n29 = (short)((f & 0xFFFF0000) >> 16);
            A.ea[n][0] = (((short)(A.ea[n][4] >> 12) & 0xFFFF) | ((short)(A.ea[n][5] >> 12) << 16 & 0xFFFF0000));
            if ((A.ea[n][13] & 0x40) == 0x0 && !A(n, 0, n28, n29, true, false)) {
                final int[] array9 = A.ea[n];
                final int n30 = 4;
                array9[n30] -= A.zB[0];
                final int[] array10 = A.ea[n];
                final int n31 = 5;
                array10[n31] -= A.zB[1];
                A.ea[n][0] = (((short)(A.ea[n][4] >> 12) & 0xFFFF) | ((short)(A.ea[n][5] >> 12) << 16 & 0xFFFF0000));
                A(A.ea[n], false);
                B.C(A.ea[n]);
                N(A.ea[n], 0 + (short)(A.ea[n][27] & 0xFFFF));
                S(n);
                return;
            }
            B.C(A.ea[n]);
            final int n32 = N(A.yB[0], A.yB[1]);
            if ((short)((A.ea[n][27] & 0xFFFF0000) >> 16) == n32) {
                final int[] array11 = A.ea[n];
                final int n33 = 27;
                array11[n33] &= 0xFFFF0000;
                final int[] array12 = A.ea[n];
                final int n34 = 27;
                array12[n34] |= ((short)n32 & 0xFFFF);
            }
            final int[] array13 = A.ea[n];
            final int n35 = 27;
            array13[n35] &= 0xFFFF;
            final int[] array14 = A.ea[n];
            final int n36 = 27;
            array14[n36] |= ((short)n32 << 16 & 0xFFFF0000);
            N(A.ea[n], 4 + (short)(A.ea[n][27] & 0xFFFF));
        }
    }
    
    static int C(final int n, final int n2, final boolean b) {
        final int[] array = A.ea[n];
        final int n3 = 20;
        array[n3] &= 0xFFFF;
        final int[] array2 = A.ea[n];
        final int n4 = 20;
        array2[n4] |= ((short)n2 << 16 & 0xFFFF0000);
        final long a = A(A.xB, A.yB);
        if (A.ea[n][14] >= 0) {
            final int n5 = A.ea[n][14];
            final int v = V(A.ga[n5]);
            A.ea[n][29] = v;
            if (a <= v * v) {
                boolean b2 = true;
                final int z = Z(A.ga[n5]);
                if (z == 2 || z == 3) {
                    if (!B.F(A.ea[n], B.a[n2]) || A.ea[n][28] <= 0 || b) {
                        b2 = false;
                    }
                    else {
                        final int[] array3 = A.ea[n];
                        final int n6 = 28;
                        --array3[n6];
                    }
                }
                if (b2) {
                    C(n, A(A.ga[n5]));
                    final int[] array4 = A.ea[n];
                    final int n7 = 13;
                    array4[n7] &= 0xFFFFDFFF;
                    return z;
                }
            }
        }
        if (A.ea[n][15] >= 0) {
            final int n8 = A.ea[n][15];
            final int v2 = V(A.ga[n8]);
            A.ea[n][29] = v2;
            if (a <= v2 * v2) {
                boolean b3 = true;
                final int z2 = Z(A.ga[n8]);
                if (z2 == 2 || z2 == 3) {
                    if (!B.F(A.ea[n], B.a[n2]) || A.ea[n][28] <= 0 || b) {
                        b3 = false;
                    }
                    else {
                        final int[] array5 = A.ea[n];
                        final int n9 = 28;
                        --array5[n9];
                    }
                }
                if (b3) {
                    C(n, A(A.ga[n8]));
                    final int[] array6 = A.ea[n];
                    final int n10 = 13;
                    array6[n10] |= 0x2000;
                    return z2;
                }
            }
        }
        if (A.ea[n][14] == -1 && A.ea[n][15] == -1) {
            A.ea[n][29] = A.fa[A.ea[n][11]][29];
            return 5;
        }
        return -1;
    }
    
    static boolean P(final int n) {
        if ((short)(A.ea[n][12] & 0xFFFF) > 0) {
            return false;
        }
        N(A.ea[n], 16);
        C(A.ea[n], false);
        if ((A.ea[n][13] & 0x2) == 0x0) {
            final int[] array = A.ea[n];
            final int n2 = 13;
            array[n2] |= 0x2;
            final int[] array2 = A.ea[n];
            final int n3 = 3;
            array2[n3] |= 0x8000;
            A(A.ea[n], true);
            if (A.ca[11] >= 0) {
                final int[] ca = A.cA;
                final int n4 = A.ca[11];
                ca[n4] |= 1 << n;
            }
            U(n);
            HG.M(A.fa[A.ea[n][11]][28]);
            if (!N(n)) {
                --A.nA;
                if (A.nA <= 0) {
                    HG.L();
                    HG.M(A.oA);
                    A(15, 0, 0, 0, 0, false);
                }
            }
            A(4, n, 0, 0, 0, false);
        }
        return true;
    }
    
    static boolean Q(final int n) {
        if ((A.ea[n][13] & 0x10) == 0x0) {
            return false;
        }
        if (C(A.ea[n], true)) {
            int[] array = null;
            int n2;
            if ((A.ea[n][13] & 0x2000) == 0x0) {
                n2 = A.ea[n][14];
            }
            else {
                n2 = A.ea[n][15];
            }
            if (n2 >= 0) {
                array = A.ga[n2];
            }
            A.ea[n][21] = A(A.ea[n], B.a[(short)(A.ea[n][20] & 0xFFFF)], array);
            final int[] array2 = A.ea[n];
            final int n3 = 13;
            array2[n3] &= 0xFFFFFFEF;
            return false;
        }
        return true;
    }
    
    static boolean R(final int n) {
        final short n2 = (short)(A.ea[n][20] & 0xFFFF);
        final int n3 = A.ea[n][29];
        final int n4 = n3 >> 11;
        final int n5 = n3 * n3;
        int n6 = -1;
        long n7 = -1L;
        if (n2 >= 0) {
            final int f = F(A.ea[n]);
            final int f2 = F(B.a[n2]);
            A.xB[0] = (short)(f & 0xFFFF) << 11;
            A.xB[1] = (short)((f & 0xFFFF0000) >> 16) << 11;
            int n8;
            int n9;
            if ((B.a[n2][3] & 0x10) != 0x0) {
                n8 = 1;
                n9 = 1;
            }
            else {
                final int[] a = A(B.a[n2]);
                n8 = (short)(a[3] & 0xFFFF) - (short)(a[2] & 0xFFFF) >> 11;
                n9 = (short)((a[3] & 0xFFFF0000) >> 16) - (short)((a[2] & 0xFFFF0000) >> 16) >> 11;
            }
            A.zB[0] = (short)(f2 & 0xFFFF) << 11;
            A.zB[1] = (short)((f2 & 0xFFFF0000) >> 16) << 11;
            for (short n10 = (short)(-n4); n10 <= n4 + n8; ++n10) {
                for (short n11 = (short)(-n4); n11 <= n4 + n9; ++n11) {
                    if (n11 != 0 || n10 != 0) {
                        final int n12 = (short)(f2 & 0xFFFF) + n10;
                        final int n13 = (short)((f2 & 0xFFFF0000) >> 16) + n11;
                        A.yB[0] = n12 << 11;
                        A.yB[1] = n13 << 11;
                        final long a2 = A(A.yB, A.xB);
                        if (A(A.yB, A.zB) <= n5 && A(n, 1, n12, n13, true, false) && (a2 < n7 || n7 == -1L)) {
                            n6 = (((short)n12 & 0xFFFF) | ((short)n13 << 16 & 0xFFFF0000));
                            n7 = a2;
                        }
                    }
                }
            }
        }
        if (n6 >= 0) {
            A.ea[n][22] = n6;
            return true;
        }
        return false;
    }
    
    static boolean S(final int n) {
        for (int i = 0; i < B.c * 2; ++i) {
            for (int j = 0; j < B.b * 2; ++j) {
                final int[] wa = A.wa;
                final int n2 = i * B.b * 2 * 3 + j * 3 + 1;
                wa[n2] &= 0xFFFF;
                final int[] wa2 = A.wa;
                final int n3 = i * B.b * 2 * 3 + j * 3 + 1;
                wa2[n3] |= 0x0;
            }
        }
        A(A.ea[n], true);
        if ((short)(A.ea[n][20] & 0xFFFF) == 0) {
            A(A.ca, true);
        }
        final int f = F(A.ea[n]);
        short n4 = (short)(f & 0xFFFF);
        short n5 = (short)((f & 0xFFFF0000) >> 16);
        short n6 = (short)(A.ea[n][22] & 0xFFFF);
        short n7 = (short)((A.ea[n][22] & 0xFFFF0000) >> 16);
        if (!A(n, 1, n6, n7, true, false)) {
            if ((short)(A.ea[n][20] & 0xFFFF) < 0) {
                if ((A.ea[n][13] & 0x10000) != 0x0) {
                    final int[] array = A.ea[n];
                    final int n8 = 13;
                    array[n8] &= 0xFFFEFFFF;
                    final int[] array2 = A.ea[n];
                    final int n9 = 13;
                    array2[n9] &= 0xFFFDFFFF;
                    A(14, n, n6 / 2, n7 / 2, 0, false);
                }
                A.ea[n][22] = -1;
                return false;
            }
            if (!R(n)) {
                A(A.ea[n], false);
                A(A.ca, false);
                A.ea[n][22] = -1;
                A.ea[n][20] = -1;
                return false;
            }
            n6 = (short)(A.ea[n][22] & 0xFFFF);
            n7 = (short)((A.ea[n][22] & 0xFFFF0000) >> 16);
        }
        int n10 = 0;
        final int n11 = (Math.abs(n6 - n4) + Math.abs(n7 - n5)) * 10;
        final int n12 = 0 + n11;
        int b = B.b;
        int c = B.c;
        short n13 = -1;
        short n14 = -1;
        int k = 0;
        A(n4, n5, n12, 0, n11, 2, -1, -1);
        if (n4 == n6 && n5 == n7) {
            if ((A.ea[n][13] & 0x10000) != 0x0) {
                final int[] array3 = A.ea[n];
                final int n15 = 13;
                array3[n15] &= 0xFFFEFFFF;
                final int[] array4 = A.ea[n];
                final int n16 = 13;
                array4[n16] &= 0xFFFDFFFF;
                A(14, n, n6 / 2, n7 / 2, 0, false);
            }
            A.ea[n][22] = -1;
            return false;
        }
        int n17 = 0;
        while (k == 0) {
            for (short n18 = -1; n18 < 2; ++n18) {
                for (short n19 = -1; n19 < 2; ++n19) {
                    final int n20 = n4 + n18;
                    final int n21 = n5 + n19;
                    if (A(n, n10 / 6 + 1, n20, n21, true, true) && (short)((A.wa[n21 * B.b * 2 * 3 + n20 * 3 + 1] & 0xFFFF0000) >> 16) != 2) {
                        if (n18 != 0 && n19 != 0) {
                            n10 = (short)((A.wa[n5 * B.b * 2 * 3 + n4 * 3 + 0] & 0xFFFF0000) >> 16) + 7;
                        }
                        else {
                            n10 = (short)((A.wa[n5 * B.b * 2 * 3 + n4 * 3 + 0] & 0xFFFF0000) >> 16) + 5;
                        }
                        if ((short)((A.wa[n21 * B.b * 2 * 3 + n20 * 3 + 1] & 0xFFFF0000) >> 16) != 1 || n10 <= (short)((A.wa[n21 * B.b * 2 * 3 + n20 * 3 + 0] & 0xFFFF0000) >> 16)) {
                            final int n22 = (Math.abs(n6 - n20) + Math.abs(n7 - n21)) * 10;
                            final int n23 = n10 + n22;
                            if (n20 < b) {
                                b = n20;
                            }
                            else if (n20 > n13) {
                                n13 = (short)n20;
                            }
                            if (n21 < c) {
                                c = n21;
                            }
                            else if (n21 > n14) {
                                n14 = (short)n21;
                            }
                            A(n20, n21, n23, n10, n22, 1, n4, n5);
                        }
                    }
                }
            }
            short n24 = -1;
            for (short n25 = (short)b; n25 <= n13; ++n25) {
                for (short n26 = (short)c; n26 <= n14; ++n26) {
                    if ((short)((A.wa[n26 * B.b * 2 * 3 + n25 * 3 + 1] & 0xFFFF0000) >> 16) == 1 && (n24 > (short)(A.wa[n26 * B.b * 2 * 3 + n25 * 3 + 0] & 0xFFFF) || n24 < 0)) {
                        n24 = (short)(A.wa[n26 * B.b * 2 * 3 + n25 * 3 + 0] & 0xFFFF);
                        n4 = n25;
                        n5 = n26;
                    }
                }
            }
            if (n24 == -1 || n17 > 250) {
                final int[] array5 = A.ea[n];
                final int n27 = 13;
                array5[n27] &= 0xFFFFFEFF;
                final int[] array6 = A.ea[n];
                final int n28 = 13;
                array6[n28] |= 0x200;
                A.ea[n][30] = 20;
                A(A.ea[n], false);
                A(A.ca, false);
                if ((A.ea[n][13] & 0x10000) != 0x0) {
                    final int[] array7 = A.ea[n];
                    final int n29 = 13;
                    array7[n29] &= 0xFFFEFFFF;
                    final int[] array8 = A.ea[n];
                    final int n30 = 13;
                    array8[n30] &= 0xFFFDFFFF;
                    A(14, n, n6 / 2, n7 / 2, 0, false);
                }
                return false;
            }
            D(n4, n5, 2);
            if (n4 == n6 && n5 == n7) {
                k = 1;
            }
            ++n17;
        }
        int l;
        int n31;
        for (l = 0, n31 = 0; l < 8323199; l = B.A((int)n4, (int)n5), n4 = (short)(l & 0xFFFF), n5 = (short)((l & 0xFFFF0000) >> 16), ++n31) {}
        T(n);
        if (A.xa[n] == null || A.xa[n].length != n31 - 1) {
            if (n31 <= 1) {
                A(A.ea[n], false);
                A(A.ca, false);
                if ((A.ea[n][13] & 0x10000) != 0x0) {
                    final int[] array9 = A.ea[n];
                    final int n32 = 13;
                    array9[n32] &= 0xFFFEFFFF;
                    final int[] array10 = A.ea[n];
                    final int n33 = 13;
                    array10[n33] &= 0xFFFDFFFF;
                    A(14, n, n6 / 2, n7 / 2, 0, false);
                }
                A.ea[n][22] = -1;
                return false;
            }
            A.xa[n] = new int[n31 - 1];
        }
        short n34 = n6;
        short n35 = n7;
        final int[] a = A(A.ea[n]);
        final int n36 = (short)(a[3] & 0xFFFF) - (short)(a[2] & 0xFFFF) >> 11;
        final int n37 = (short)((a[3] & 0xFFFF0000) >> 16) - (short)((a[2] & 0xFFFF0000) >> 16) >> 11;
        while (n31 > 1) {
            A.xa[n][n31 - 2] = ((n34 & 0xFFFF) | (n35 << 16 & 0xFFFF0000));
            for (int n38 = n35; n38 <= n35 + n37; ++n38) {
                for (int n39 = n34; n39 <= n34 + n36; ++n39) {
                    final int[] wa3 = A.wa;
                    final int n40 = n38 * B.b * 2 * 3 + n39 * 3 + 2;
                    wa3[n40] &= 0xFF00FFFF;
                    final int[] wa4 = A.wa;
                    final int n41 = n38 * B.b * 2 * 3 + n39 * 3 + 2;
                    wa4[n41] |= ((byte)n << 16 & 0xFF0000);
                    final int[] wa5 = A.wa;
                    final int n42 = n38 * B.b * 2 * 3 + n39 * 3 + 2;
                    wa5[n42] &= 0xFFFFFF;
                    final int[] wa6 = A.wa;
                    final int n43 = n38 * B.b * 2 * 3 + n39 * 3 + 2;
                    wa6[n43] |= ((byte)(n31 - 2) << 24 & 0xFF000000);
                }
            }
            final int a2 = B.A((int)n34, (int)n35);
            n34 = (short)(a2 & 0xFFFF);
            n35 = (short)((a2 & 0xFFFF0000) >> 16);
            --n31;
        }
        A.ea[n][24] = 0;
        final int[] array11 = A.ea[n];
        final int n44 = 13;
        array11[n44] |= 0x40;
        if (A.ea[n][22] == -1) {
            A.ea[n][22] = A.xa[n][0];
        }
        A(A.ea[n], false);
        return true;
    }
    
    static void T(final int n) {
        if (A.xa[n] != null) {
            final int[] a = A(A.ea[n]);
            final int n2 = (short)(a[3] & 0xFFFF) - (short)(a[2] & 0xFFFF) >> 11;
            final int n3 = (short)((a[3] & 0xFFFF0000) >> 16) - (short)((a[2] & 0xFFFF0000) >> 16) >> 11;
            for (int i = 0; i < A.xa[n].length; ++i) {
                final short n4 = (short)(A.xa[n][i] & 0xFFFF);
                int j = 0;
                while (j <= (j = (short)((A.xa[n][i] & 0xFFFF0000) >> 16)) + n3) {
                    for (int k = n4; k <= n4 + n2; ++k) {
                        if ((byte)(A.wa[j * B.b * 2 * 3 + k * 3 + 2] >> 16 & 0xFF) == n) {
                            final int[] wa = A.wa;
                            final int n5 = j * B.b * 2 * 3 + k * 3 + 2;
                            wa[n5] &= 0xFFFF;
                            final int[] wa2 = A.wa;
                            final int n6 = j * B.b * 2 * 3 + k * 3 + 2;
                            wa2[n6] |= 0xFFFF0000;
                        }
                    }
                    ++j;
                }
            }
        }
    }
    
    static void D(final int n, final int n2, final int n3) {
        if (n < 0 || n2 < 0 || n2 >= B.c * 2 || n >= B.b * 2) {
            return;
        }
        final int[] wa = A.wa;
        final int n4 = n2 * B.b * 2 * 3 + n * 3 + 1;
        wa[n4] &= 0xFFFF;
        final int[] wa2 = A.wa;
        final int n5 = n2 * B.b * 2 * 3 + n * 3 + 1;
        wa2[n5] |= ((short)n3 << 16 & 0xFFFF0000);
    }
    
    static void A(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        if (n < 0 || n2 < 0 || n2 >= B.c * 2 || n >= B.b * 2) {
            return;
        }
        final int[] wa = A.wa;
        final int n9 = n2 * B.b * 2 * 3 + n * 3 + 0;
        wa[n9] &= 0xFFFF0000;
        final int[] wa2 = A.wa;
        final int n10 = n2 * B.b * 2 * 3 + n * 3 + 0;
        wa2[n10] |= ((short)n3 & 0xFFFF);
        final int[] wa3 = A.wa;
        final int n11 = n2 * B.b * 2 * 3 + n * 3 + 0;
        wa3[n11] &= 0xFFFF;
        final int[] wa4 = A.wa;
        final int n12 = n2 * B.b * 2 * 3 + n * 3 + 0;
        wa4[n12] |= ((short)n4 << 16 & 0xFFFF0000);
        final int[] wa5 = A.wa;
        final int n13 = n2 * B.b * 2 * 3 + n * 3 + 1;
        wa5[n13] &= 0xFFFF0000;
        final int[] wa6 = A.wa;
        final int n14 = n2 * B.b * 2 * 3 + n * 3 + 1;
        wa6[n14] |= ((short)n5 & 0xFFFF);
        final int[] wa7 = A.wa;
        final int n15 = n2 * B.b * 2 * 3 + n * 3 + 1;
        wa7[n15] &= 0xFFFF;
        final int[] wa8 = A.wa;
        final int n16 = n2 * B.b * 2 * 3 + n * 3 + 1;
        wa8[n16] |= ((short)n6 << 16 & 0xFFFF0000);
        B.A(n, n2, n7, n8);
    }
    
    static void U(final int n) {
        final int s = B.s;
        int n2 = 0;
        final int[] ha = A.hA;
        final int n3 = s;
        ha[n3] &= 0xFFFF0000;
        final int[] ha2 = A.hA;
        final int n4 = s;
        ha2[n4] |= 0xFFFF;
        final int[] ha3 = A.hA;
        final int n5 = s;
        ha3[n5] &= 0xFFFF;
        final int[] ha4 = A.hA;
        final int n6 = s;
        ha4[n6] |= 0x0;
        ++B.s;
        final int n7 = A.ea[n][14];
        if (n7 >= 0 && ((A.ha[A.ga[n7][4]][3] & 0x1) != 0x0 || (A.ga[n7][3] & 0x20000) != 0x0 || HG.A(100) >= 50)) {
            final short n8 = (short)(A.ga[n7][2] & 0xFFFF);
            final short n9 = (short)(A.hA[s] & 0xFFFF);
            final int[] array = B.a[n8];
            final int n10 = 1;
            array[n10] &= 0xFFFF0000;
            final int[] array2 = B.a[n8];
            final int n11 = 1;
            array2[n11] |= (n9 & 0xFFFF);
            final int[] ha5 = A.hA;
            final int n12 = s;
            ha5[n12] &= 0xFFFF0000;
            final int[] ha6 = A.hA;
            final int n13 = s;
            ha6[n13] |= (n8 & 0xFFFF);
            ++n2;
        }
        final int n14 = A.ea[n][15];
        if (n14 >= 0 && ((A.ha[A.ga[n14][4]][3] & 0x1) != 0x0 || (A.ga[n14][3] & 0x20000) != 0x0 || HG.A(100) >= 50)) {
            final short n15 = (short)(A.ga[n14][2] & 0xFFFF);
            final short n16 = (short)(A.hA[s] & 0xFFFF);
            final int[] array3 = B.a[n15];
            final int n17 = 1;
            array3[n17] &= 0xFFFF0000;
            final int[] array4 = B.a[n15];
            final int n18 = 1;
            array4[n18] |= (n16 & 0xFFFF);
            final int[] ha7 = A.hA;
            final int n19 = s;
            ha7[n19] &= 0xFFFF0000;
            final int[] ha8 = A.hA;
            final int n20 = s;
            ha8[n20] |= (n15 & 0xFFFF);
            ++n2;
        }
        final int n21 = A.ea[n][16];
        if (n21 >= 0 && ((A.ja[A.ia[n21][4]][3] & 0x1) != 0x0 || (A.ia[n21][3] & 0x20000) != 0x0 || HG.A(100) >= 50)) {
            final short n22 = (short)(A.ia[n21][2] & 0xFFFF);
            final short n23 = (short)(A.hA[s] & 0xFFFF);
            final int[] array5 = B.a[n22];
            final int n24 = 1;
            array5[n24] &= 0xFFFF0000;
            final int[] array6 = B.a[n22];
            final int n25 = 1;
            array6[n25] |= (n23 & 0xFFFF);
            final int[] ha9 = A.hA;
            final int n26 = s;
            ha9[n26] &= 0xFFFF0000;
            final int[] ha10 = A.hA;
            final int n27 = s;
            ha10[n27] |= (n22 & 0xFFFF);
            ++n2;
        }
        for (int i = 0; i < 2; ++i) {
            final short n28 = (short)(A.ea[n][17 + i] & 0xFFFF);
            final short n29 = (short)((A.ea[n][17 + i] & 0xFFFF0000) >> 16);
            if (n28 >= 0 && n29 >= 0) {
                int n30 = -1;
                if (n28 == 2) {
                    n30 = (short)(A.ka[n29][2] & 0xFFFF);
                }
                else if (n28 == 3) {
                    n30 = (short)(A.sa[n29][2] & 0xFFFF);
                }
                else if (n28 == 5) {
                    n30 = (short)(A.ma[n29][2] & 0xFFFF);
                }
                if (n30 >= 0) {
                    final short n31 = (short)(A.hA[s] & 0xFFFF);
                    final int[] array7 = B.a[n30];
                    final int n32 = 1;
                    array7[n32] &= 0xFFFF0000;
                    final int[] array8 = B.a[n30];
                    final int n33 = 1;
                    array8[n33] |= (n31 & 0xFFFF);
                    final int[] ha11 = A.hA;
                    final int n34 = s;
                    ha11[n34] &= 0xFFFF0000;
                    final int[] ha12 = A.hA;
                    final int n35 = s;
                    ha12[n35] |= ((short)n30 & 0xFFFF);
                    ++n2;
                }
            }
        }
        if (A.ea[n][19] > 0) {
            final short n36 = (short)(A.ka[A.ea[n][19]][2] & 0xFFFF);
            final short n37 = (short)(A.hA[s] & 0xFFFF);
            final int[] array9 = B.a[n36];
            final int n38 = 1;
            array9[n38] &= 0xFFFF0000;
            final int[] array10 = B.a[n36];
            final int n39 = 1;
            array10[n39] |= (n37 & 0xFFFF);
            final int[] ha13 = A.hA;
            final int n40 = s;
            ha13[n40] &= 0xFFFF0000;
            final int[] ha14 = A.hA;
            final int n41 = s;
            ha14[n41] |= (n36 & 0xFFFF);
            ++n2;
        }
        if (A.ea[n][28] > 0) {
            final int a = A(A.ka);
            A.ka[a][6] = A.ea[n][28];
            for (int j = 0; j < 2; ++j) {
                if (A.ea[n][14 + j] >= 0) {
                    final int z = Z(A.ga[A.ea[n][14 + j]]);
                    if (z == 2) {
                        A.ka[a][4] = 1;
                        break;
                    }
                    if (z == 3) {
                        A.ka[a][4] = 2;
                        break;
                    }
                }
            }
            final short n42 = (short)(A.ka[a][2] & 0xFFFF);
            final short n43 = (short)(A.hA[s] & 0xFFFF);
            final int[] array11 = B.a[n42];
            final int n44 = 1;
            array11[n44] &= 0xFFFF0000;
            final int[] array12 = B.a[n42];
            final int n45 = 1;
            array12[n45] |= (n43 & 0xFFFF);
            final int[] ha15 = A.hA;
            final int n46 = s;
            ha15[n46] &= 0xFFFF0000;
            final int[] ha16 = A.hA;
            final int n47 = s;
            ha16[n47] |= (n42 & 0xFFFF);
            ++n2;
        }
        final int[] array13 = A.ea[n];
        final int n48 = 17;
        array13[n48] &= 0xFFFF0000;
        final int[] array14 = A.ea[n];
        final int n49 = 17;
        array14[n49] |= ((short)s & 0xFFFF);
        final int[] ha17 = A.hA;
        final int n50 = s;
        ha17[n50] &= 0xFFFF;
        final int[] ha18 = A.hA;
        final int n51 = s;
        ha18[n51] |= ((short)n2 << 16 & 0xFFFF0000);
    }
    
    public static void D(final int n, final boolean b) {
        final int[] a = A(A.ea[n]);
        final int n2 = A.ea[n][4];
        final int n3 = A.ea[n][5];
        final int n4 = a[11] * 4096;
        final short n5 = (short)(A.ea[n][20] & 0xFFFF);
        final int n6 = n4 << 1;
        B.aa[0] = n2 - n6;
        B.aa[2] = n2 + n6;
        B.aa[1] = n3 - n6;
        B.aa[3] = n3 + n6;
        final int n7 = (n6 >> 1) - 2048;
        for (int i = B.A(B.aa, 32); i != -1; i = (short)((B.a[i][1] & 0xFFFF0000) >> 16)) {
            if ((B.a[i][3] & 0x10000) == 0x0 && (B.a[i][13] & 0x2) == 0x0) {
                final int[] a2 = A(B.a[i]);
                if (!N((short)((B.a[i][2] & 0xFFFF0000) >> 16)) && (B.a[i][11] == A.ea[n][11] || a2[1] == a[1])) {
                    final int n8 = B.a[i][29];
                    if (b) {
                        A.ea[n][26] = 10;
                    }
                    else {
                        B.a[i][29] = n7;
                    }
                    if ((short)(B.a[i][20] & 0xFFFF) != n5) {
                        final int[] array = B.a[i];
                        final int n9 = 13;
                        array[n9] |= 0x8000;
                        final int[] array2 = B.a[i];
                        final int n10 = 20;
                        array2[n10] &= 0xFFFF0000;
                        final int[] array3 = B.a[i];
                        final int n11 = 20;
                        array3[n11] |= (n5 & 0xFFFF);
                        R((short)((B.a[i][2] & 0xFFFF0000) >> 16));
                    }
                    B.a[i][29] = n8;
                }
            }
        }
    }
    
    public static int V(int n) {
        n = A.ea[n][11];
        if ((A.fa[n][13] & 0x800) != 0x0) {
            n = A.fa[n][12] / 5;
            if (n > 2500) {
                n = 2500;
            }
            n /= 20;
            final int n2 = (HG.A(n) >> 2) + HG.A(2) + ((HG.A(n) >> 2) + HG.A(2)) + ((HG.A(n) >> 2) + HG.A(2));
            n = (n >> 2) + 2;
            ++B.n;
            return n + n2;
        }
        return 0;
    }
    
    public static void MA() {
        A.dc = new short[273][];
        A.ec = new Image[273][];
        A.fc = new int[273];
        int n = 0;
        for (int i = 0; i < 273; ++i) {
            if ((A.cc[i * 11 + 9] & 0x2) != 0x0) {
                ++n;
            }
        }
        A.ic = null;
        A.gc = -1;
        try {
            System.gc();
            A.jc = new DataInputStream(HG.fb.getClass().getResourceAsStream("/i"));
            A.ic = new byte[A.jc.readShort()];
            for (short short1 = A.jc.readShort(), n2 = 0; n2 < short1; ++n2) {
                final short short2 = A.jc.readShort();
                for (int j = 0; j < 273; ++j) {
                    if (short2 == A.cc[j * 11 + 3]) {
                        final short[] cc = A.cc;
                        final int n3 = j * 11 + 9;
                        cc[n3] |= 0x4;
                    }
                }
            }
        }
        catch (Exception ex) {
            A.ic = new byte[32767];
        }
        for (int k = 0; k < 273; ++k) {
            if ((A.cc[k * 11 + 9] & 0x2) != 0x0) {
                final short n4 = A.cc[k * 11 + 4];
                for (int l = 0; l < ((n4 == -1) ? 1 : (1 + A.aC[n4][1].length / A.aC[n4][0].length)); ++l) {
                    K(k, l);
                }
            }
        }
        A(true, 0, 75);
        try {
            if (A.jc != null) {
                A.jc.close();
            }
        }
        catch (Exception ex2) {}
        A.jc = null;
        System.gc();
    }
    
    public static void NA() {
        for (int i = 0; i < A.fc.length; ++i) {
            A.fc[0] = 0;
        }
        for (int j = 0; j < A.ec.length; ++j) {
            if ((A.cc[j * 11 + 9] & 0x2) == 0x0) {
                A.ec[j] = null;
                A.dc[j] = null;
            }
        }
        A.kc = null;
        A.lc = null;
    }
    
    public static void K(final int n, final int n2) {
        if (n < 0 && n >= 273) {
            return;
        }
        final int[] fc = A.fc;
        fc[n] |= 0x1;
        if (n2 < 15) {
            final int[] fc2 = A.fc;
            fc2[n] |= 1 << 1 + n2;
        }
    }
    
    public static void A(final boolean b, final int n, final int n2) {
        int n3 = 0;
        int n4 = 0;
        for (int i = 0; i < 273; ++i) {
            if ((A.fc[i] & 0x1) != 0x0) {
                final int[] fc = A.fc;
                final int n5 = i;
                fc[n5] &= 0xFFFF;
                final int[] fc2 = A.fc;
                final int n6 = i;
                fc2[n6] |= ((short)i << 16 & 0xFFFF0000);
                A.fc[n3++] = A.fc[i];
            }
        }
        int n7 = 1;
        while (true) {
            if (n7 == 0) {
                ++n7;
            }
            else {
                if (n7 >= n3) {
                    break;
                }
                if (A.cc[(short)((A.fc[n7] & 0xFFFF0000) >> 16) * 11 + 3] < A.cc[(short)((A.fc[n7 - 1] & 0xFFFF0000) >> 16) * 11 + 3]) {
                    final int n8 = A.fc[n7];
                    A.fc[n7] = A.fc[n7 - 1];
                    A.fc[n7 - 1] = n8;
                    --n7;
                }
                else {
                    ++n7;
                }
            }
        }
        OA();
        for (int j = 0; j < n3; ++j) {
            final short n9 = (short)((A.fc[j] & 0xFFFF0000) >> 16);
            if (b) {
                C.c = (n2 - n) * n4 / n3 + n;
            }
            for (int k = 0; k < 15; ++k) {
                if ((A.fc[j] & 1 << 1 + k) != 0x0) {
                    L(n9, k);
                }
            }
            ++n4;
        }
        PA();
        for (int l = 0; l < 273; ++l) {
            A.fc[l] = 0;
        }
    }
    
    public static void A(final int n, final int n2, final int n3, final int n4, final Graphics graphics) {
        A(n, n2, n3, 0, n4, 0, graphics);
    }
    
    public static void A(int n, int n2, final int n3, final int n4, final int n5, final int n6, final Graphics graphics) {
        n -= A.tB;
        n2 -= A.uB;
        B(n, n2, n3, n4, n5, n6, graphics);
    }
    
    public static void B(final int n, final int n2, final int n3, final int n4, final Graphics graphics) {
        B(n, n2, n3, 0, n4, 0, graphics);
    }
    
    public static void B(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final Graphics graphics) {
        A(n, n2, n3, n4, n5, n6, 0, 0, graphics);
    }
    
    public static void A(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Graphics graphics) {
        A(n, n2, n3, n4, n5 << 2, 0, n6, n7, graphics);
    }
    
    private static void A(final int n, final int n2, final int n3, int k, int n4, int i, final int n5, final int n6, final Graphics graphics) {
        n4 *= 7;
        if (A.cc[n3 * 11 + 4] == 5) {
            k = B.k;
        }
        if (A.dc == null) {
            return;
        }
        if (A.cc == null) {
            return;
        }
        if (A.cc[n3 * 11 + 3] == -1) {
            return;
        }
        if (n3 < 0 || n3 >= A.dc.length) {
            return;
        }
        if (A.dc[n3] == null) {
            return;
        }
        if (n4 < 0 || n4 >= A.dc[n3].length) {
            return;
        }
        if (k < 0 && k >= A.ec[n3].length) {
            return;
        }
        if (A.ec[n3][k] == null) {
            return;
        }
        if (n5 == 0 && n6 == 0) {
            switch (i) {
                case 2: {
                    graphics.drawRegion(A.ec[n3][k], (int)A.dc[n3][n4 + 1], (int)A.dc[n3][n4 + 2], (int)A.dc[n3][n4 + 3], (int)A.dc[n3][n4 + 4], i, n - A.dc[n3][n4 + 3] - A.dc[n3][n4 + 5], n2 + A.dc[n3][n4 + 6], 20);
                    break;
                }
                default: {
                    graphics.drawRegion(A.ec[n3][k], (int)A.dc[n3][n4 + 1], (int)A.dc[n3][n4 + 2], (int)A.dc[n3][n4 + 3], (int)A.dc[n3][n4 + 4], i, n + A.dc[n3][n4 + 5], n2 + A.dc[n3][n4 + 6], 20);
                    break;
                }
            }
        }
        else {
            final short n7 = A.dc[n3][n4 + 3];
            final short n8 = A.dc[n3][n4 + 4];
            final int n9 = n4 + N(n5, n6) * 7;
            if (n9 < 0 || n9 >= A.dc[n3].length) {
                return;
            }
            if (E(n5) > E(n6)) {
                final int n10 = n7 * n6 / n5;
                for (i = 0; i < n7; ++i) {
                    n4 = i * n6 / n5 - (n10 >> 1);
                    graphics.drawRegion(A.ec[n3][k], A.dc[n3][n9 + 1] + i, (int)A.dc[n3][n9 + 2], 1, (int)A.dc[n3][n9 + 4], 0, n + i - (n7 >> 1), n2 + n4 - (n8 >> 1), 20);
                }
            }
            else {
                final int n11 = n8 * n5 / n6;
                for (i = 0; i < n8; ++i) {
                    n4 = i * n5 / n6 - (n11 >> 1);
                    graphics.drawRegion(A.ec[n3][k], (int)A.dc[n3][n9 + 1], A.dc[n3][n9 + 2] + i, (int)A.dc[n3][n9 + 3], 1, 0, n + n4 - (n7 >> 1), n2 + i - (n8 >> 1), 20);
                }
            }
        }
    }
    
    public static boolean W(final int n) {
        return L(n, 0);
    }
    
    public static boolean L(final int n, int i) {
        boolean b = false;
        if (A.cc[n * 11 + 4] == 5) {
            i = B.k;
        }
        if (n < 0 || n >= A.ec.length) {
            return false;
        }
        final short j = A.cc[n * 11 + 3];
        int n2 = A.cc[n * 11 + 4];
        if (n2 < -1 || n2 >= A.aC.length) {
            n2 = -1;
        }
        if (i < 0 || i >= ((n2 == -1) ? 1 : (1 + A.aC[n2][1].length / A.aC[n2][0].length))) {
            return false;
        }
        if (A.ec[n] == null) {
            A.ec[n] = new Image[(n2 == -1) ? 1 : (1 + A.aC[n2][1].length / A.aC[n2][0].length)];
        }
        if (A.ec[n][i] != null) {
            return true;
        }
        if ((A.cc[n * 11 + 9] & 0x1) != 0x0) {
            return false;
        }
        System.gc();
        if (j == -1) {
            return false;
        }
        String s = "/";
        if (j < 10) {
            s = "/" + "0";
        }
        if (j < 100) {
            s += "0";
        }
        final String string = s + "" + j;
        DataInputStream dataInputStream = null;
        try {
            if ((A.cc[n * 11 + 9] & 0x4) != 0x0 && (A.gc == n || M(n, j))) {
                if (i == 0 || n2 == -1) {
                    A.ec[n][i] = Image.createImage(A.ic, 0, A.hc);
                }
                else {
                    final byte[] array = new byte[A.hc];
                    System.arraycopy(A.ic, 0, array, 0, A.hc);
                    A(array, A.hc, i - 1, A.aC[n2][0], A.aC[n2][1]);
                    A.ec[n][i] = Image.createImage(array, 0, A.hc);
                }
            }
            if (A.ec[n][i] == null) {
                throw new Exception();
            }
            System.gc();
            A.cc[n * 11 + 0] = (short)A.ec[n][i].getWidth();
            A.cc[n * 11 + 1] = (short)A.ec[n][i].getHeight();
            if (A.dc[n] != null) {
                return true;
            }
            final InputStream resourceAsStream = HG.fb.getClass().getResourceAsStream(string + ".off");
            if (resourceAsStream == null) {
                A.cc[n * 11 + 2] = (short)(A.cc[n * 11 + 5] * A.cc[n * 11 + 6]);
                A.dc[n] = new short[A.cc[n * 11 + 2] * 7];
                int n3 = 0;
                int n4 = 0;
                switch (A.cc[n * 11 + 7]) {
                    case 0: {
                        n3 = 0;
                        break;
                    }
                    case 1: {
                        n3 = -A.cc[n * 11 + 0] / A.cc[n * 11 + 5];
                        break;
                    }
                    case 2: {
                        n3 = -(A.cc[n * 11 + 0] / A.cc[n * 11 + 5] >> 1);
                        break;
                    }
                }
                switch (A.cc[n * 11 + 8]) {
                    case 0: {
                        n4 = 0;
                        break;
                    }
                    case 1: {
                        n4 = -A.cc[n * 11 + 1] / A.cc[n * 11 + 6];
                        break;
                    }
                    case 2: {
                        n4 = -(A.cc[n * 11 + 1] / A.cc[n * 11 + 6] >> 1);
                        break;
                    }
                }
                int n5 = 0;
                for (short n6 = 0; n6 < A.cc[n * 11 + 6]; ++n6) {
                    for (short n7 = 0; n7 < A.cc[n * 11 + 5]; ++n7) {
                        A.dc[n][n5 + 0] = (short)n;
                        A.dc[n][n5 + 1] = (short)(A.cc[n * 11 + 0] * n7 / A.cc[n * 11 + 5]);
                        A.dc[n][n5 + 2] = (short)(A.cc[n * 11 + 1] * n6 / A.cc[n * 11 + 6]);
                        A.dc[n][n5 + 3] = (short)(A.cc[n * 11 + 0] / A.cc[n * 11 + 5]);
                        A.dc[n][n5 + 4] = (short)(A.cc[n * 11 + 1] / A.cc[n * 11 + 6]);
                        A.dc[n][n5 + 5] = (short)n3;
                        A.dc[n][n5 + 6] = (short)n4;
                        n5 += 7;
                    }
                }
            }
            else {
                dataInputStream = new DataInputStream(resourceAsStream);
                final byte byte1 = dataInputStream.readByte();
                A.cc[n * 11 + 2] = byte1;
                A.dc[n] = new short[byte1 * 7];
                for (int k = 0; k < byte1 * 7; ++k) {
                    A.dc[n][k] = dataInputStream.readByte();
                }
                dataInputStream.close();
                dataInputStream = null;
            }
        }
        catch (Exception ex) {
            A.ec[n][i] = null;
            A.dc[n] = null;
            b = true;
            final short[] cc = A.cc;
            final int n8 = n * 11 + 9;
            cc[n8] |= 0x1;
        }
        finally {
            try {
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            }
            catch (Exception ex2) {}
        }
        if (!b) {
            return true;
        }
        final short n9 = A.cc[n * 11 + 10];
        if (n9 != -1 && L(n9, 0)) {
            A.ec[n][i] = A.ec[n9][0];
            A.dc[n] = A.dc[n9];
            final short n10 = A.cc[n * 11 + 4];
            for (i = 0; i < 11; ++i) {
                A.cc[n * 11 + i] = A.cc[n9 * 11 + i];
            }
            A.cc[n * 11 + 10] = n9;
            A.cc[n * 11 + 4] = n10;
            final short[] cc2 = A.cc;
            final int n11 = n * 11 + 9;
            cc2[n11] &= 0xFFFFFFFE;
            return true;
        }
        return false;
    }
    
    public static boolean X(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: iconst_0       
        //     3: istore_1       
        //     4: aconst_null    
        //     5: putstatic       A.kc:[B
        //     8: aconst_null    
        //     9: putstatic       A.lc:[B
        //    12: invokestatic    java/lang/System.gc:()V
        //    15: iconst_m1      
        //    16: iload_0        
        //    17: invokestatic    A.M:(II)Z
        //    20: ifeq            25
        //    23: iconst_1       
        //    24: ireturn        
        //    25: ldc             "/"
        //    27: astore_3       
        //    28: iload_0        
        //    29: bipush          10
        //    31: if_icmpge       55
        //    34: new             Ljava/lang/StringBuffer;
        //    37: dup            
        //    38: invokespecial   java/lang/StringBuffer.<init>:()V
        //    41: ldc             "/"
        //    43: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //    46: ldc             "0"
        //    48: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //    51: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //    54: astore_3       
        //    55: iload_0        
        //    56: bipush          100
        //    58: if_icmpge       81
        //    61: new             Ljava/lang/StringBuffer;
        //    64: dup            
        //    65: invokespecial   java/lang/StringBuffer.<init>:()V
        //    68: aload_3        
        //    69: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //    72: ldc             "0"
        //    74: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //    77: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //    80: astore_3       
        //    81: new             Ljava/lang/StringBuffer;
        //    84: dup            
        //    85: invokespecial   java/lang/StringBuffer.<init>:()V
        //    88: aload_3        
        //    89: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //    92: ldc             ""
        //    94: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //    97: iload_0        
        //    98: invokevirtual   java/lang/StringBuffer.append:(I)Ljava/lang/StringBuffer;
        //   101: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   104: astore_3       
        //   105: getstatic       HG.fb:LHG;
        //   108: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   111: new             Ljava/lang/StringBuffer;
        //   114: dup            
        //   115: invokespecial   java/lang/StringBuffer.<init>:()V
        //   118: aload_3        
        //   119: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   122: ldc             ".png"
        //   124: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   127: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   130: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   133: astore_0       
        //   134: aload_0        
        //   135: ifnonnull       152
        //   138: aload_2        
        //   139: ifnull          146
        //   142: aload_2        
        //   143: invokevirtual   java/io/DataInputStream.close:()V
        //   146: goto            150
        //   149: pop            
        //   150: iconst_0       
        //   151: ireturn        
        //   152: new             Ljava/io/DataInputStream;
        //   155: dup            
        //   156: aload_0        
        //   157: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   160: astore_2       
        //   161: aload_2        
        //   162: invokevirtual   java/io/DataInputStream.available:()I
        //   165: newarray        B
        //   167: putstatic       A.kc:[B
        //   170: aload_2        
        //   171: getstatic       A.kc:[B
        //   174: iconst_0       
        //   175: getstatic       A.kc:[B
        //   178: arraylength    
        //   179: invokevirtual   java/io/DataInputStream.read:([BII)I
        //   182: pop            
        //   183: iconst_1       
        //   184: istore_1       
        //   185: aload_2        
        //   186: invokevirtual   java/io/DataInputStream.close:()V
        //   189: aconst_null    
        //   190: astore_2       
        //   191: getstatic       HG.fb:LHG;
        //   194: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   197: new             Ljava/lang/StringBuffer;
        //   200: dup            
        //   201: invokespecial   java/lang/StringBuffer.<init>:()V
        //   204: aload_3        
        //   205: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   208: ldc             ".off"
        //   210: invokevirtual   java/lang/StringBuffer.append:(Ljava/lang/String;)Ljava/lang/StringBuffer;
        //   213: invokevirtual   java/lang/StringBuffer.toString:()Ljava/lang/String;
        //   216: invokevirtual   java/lang/Class.getResourceAsStream:(Ljava/lang/String;)Ljava/io/InputStream;
        //   219: astore_0       
        //   220: aload_0        
        //   221: ifnonnull       238
        //   224: aload_2        
        //   225: ifnull          232
        //   228: aload_2        
        //   229: invokevirtual   java/io/DataInputStream.close:()V
        //   232: goto            236
        //   235: pop            
        //   236: iconst_1       
        //   237: ireturn        
        //   238: new             Ljava/io/DataInputStream;
        //   241: dup            
        //   242: aload_0        
        //   243: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   246: astore_2       
        //   247: aload_2        
        //   248: invokevirtual   java/io/DataInputStream.readByte:()B
        //   251: pop            
        //   252: aload_2        
        //   253: invokevirtual   java/io/DataInputStream.available:()I
        //   256: newarray        B
        //   258: putstatic       A.lc:[B
        //   261: aload_2        
        //   262: getstatic       A.lc:[B
        //   265: iconst_0       
        //   266: getstatic       A.lc:[B
        //   269: arraylength    
        //   270: invokevirtual   java/io/DataInputStream.read:([BII)I
        //   273: pop            
        //   274: aload_2        
        //   275: invokevirtual   java/io/DataInputStream.close:()V
        //   278: aconst_null    
        //   279: astore_2       
        //   280: aload_2        
        //   281: ifnull          288
        //   284: aload_2        
        //   285: invokevirtual   java/io/DataInputStream.close:()V
        //   288: goto            292
        //   291: pop            
        //   292: goto            337
        //   295: pop            
        //   296: aconst_null    
        //   297: putstatic       A.kc:[B
        //   300: aconst_null    
        //   301: putstatic       A.lc:[B
        //   304: invokestatic    java/lang/System.gc:()V
        //   307: aload_2        
        //   308: ifnull          315
        //   311: aload_2        
        //   312: invokevirtual   java/io/DataInputStream.close:()V
        //   315: goto            319
        //   318: pop            
        //   319: goto            337
        //   322: astore_1       
        //   323: aload_2        
        //   324: ifnull          331
        //   327: aload_2        
        //   328: invokevirtual   java/io/DataInputStream.close:()V
        //   331: goto            335
        //   334: pop            
        //   335: aload_1        
        //   336: athrow         
        //   337: invokestatic    java/lang/System.gc:()V
        //   340: iload_1        
        //   341: ireturn        
        //    StackMap: 00 17 00 19 00 03 01 01 05 00 00 00 37 00 04 01 01 05 07 05 0B 00 00 00 51 00 04 01 01 05 07 05 0B 00 00 00 92 00 04 07 08 42 01 05 07 05 0B 00 00 00 95 00 04 07 08 42 01 05 07 05 0B 00 01 07 02 F2 00 96 00 04 07 08 42 01 05 07 05 0B 00 00 00 98 00 04 07 08 42 01 05 07 05 0B 00 00 00 E8 00 04 07 08 42 01 05 07 05 0B 00 00 00 EB 00 04 07 08 42 01 05 07 05 0B 00 01 07 02 F2 00 EC 00 04 07 08 42 01 05 07 05 0B 00 00 00 EE 00 04 07 08 42 01 05 07 05 0B 00 00 01 20 00 04 07 08 42 01 05 07 05 0B 00 00 01 23 00 04 07 08 42 01 05 07 05 0B 00 01 07 02 F2 01 24 00 04 07 08 42 01 05 07 05 0B 00 00 01 27 00 04 00 01 07 03 46 07 05 0B 00 01 07 02 F2 01 3B 00 04 00 01 07 03 46 07 05 0B 00 00 01 3E 00 04 00 01 07 03 46 07 05 0B 00 01 07 02 F2 01 3F 00 04 00 01 07 03 46 07 05 0B 00 00 01 42 00 04 00 01 07 03 46 07 05 0B 00 01 07 06 AB 01 4B 00 04 00 07 06 AB 07 03 46 07 05 0B 00 00 01 4E 00 04 00 07 06 AB 07 03 46 07 05 0B 00 01 07 02 F2 01 4F 00 04 00 07 06 AB 07 03 46 07 05 0B 00 00 01 51 00 04 00 01 07 03 46 07 05 0B 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  105    138    295    322    Ljava/lang/Exception;
        //  152    224    295    322    Ljava/lang/Exception;
        //  238    280    295    322    Ljava/lang/Exception;
        //  105    138    322    337    Any
        //  152    224    322    337    Any
        //  238    280    322    337    Any
        //  295    307    322    337    Any
        //  322    323    322    337    Any
        //  323    331    334    335    Ljava/lang/Exception;
        //  307    315    318    319    Ljava/lang/Exception;
        //  280    288    291    292    Ljava/lang/Exception;
        //  224    232    235    236    Ljava/lang/Exception;
        //  138    146    149    150    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.ast.AstBuilder.convertLocalVariables(AstBuilder.java:2895)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2445)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:144)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static void OA() {
        if (A.jc != null) {
            return;
        }
        QA();
    }
    
    public static void PA() {
        try {
            A.jc.close();
        }
        catch (Exception ex) {}
        finally {
            A.jc = null;
        }
    }
    
    private static void QA() {
        if (A.jc != null) {
            try {
                if (A.jc.markSupported()) {
                    A.jc.reset();
                    A.jc.readShort();
                    for (short short1 = A.jc.readShort(), n = 0; n < short1; ++n) {
                        A.jc.readShort();
                    }
                    return;
                }
                A.jc.close();
                A.jc = null;
            }
            catch (Exception ex) {}
        }
        A.jc = null;
        final InputStream resourceAsStream = HG.fb.getClass().getResourceAsStream("/i");
        if (resourceAsStream == null) {
            return;
        }
        try {
            (A.jc = new DataInputStream(resourceAsStream)).readShort();
            for (short short2 = A.jc.readShort(), n2 = 0; n2 < short2; ++n2) {
                A.jc.readShort();
            }
        }
        catch (Exception ex2) {
            try {
                A.jc.close();
            }
            catch (Exception ex3) {}
            A.jc = null;
        }
    }
    
    public static boolean M(final int gc, int i) {
        boolean b = false;
        boolean b2 = false;
        if (A.ic == null) {
            return false;
        }
        A.kc = null;
        A.lc = null;
        try {
            int n = 1;
            if (A.jc == null) {
                QA();
                b2 = true;
                n = 0;
            }
            while (true) {
                short n2 = A.jc.readShort();
                A.hc = A.jc.readShort();
                short n3 = A.jc.readShort();
                if (n2 > i && n != 0) {
                    QA();
                    n2 = A.jc.readShort();
                    A.hc = A.jc.readShort();
                    n3 = A.jc.readShort();
                }
                if (n2 < i) {
                    n = 0;
                }
                if (n2 > i) {
                    break;
                }
                if (n2 == 32767) {
                    break;
                }
                if (n2 == i) {
                    if (gc == -1) {
                        System.gc();
                        A.kc = new byte[A.hc];
                        A.jc.read(A.kc, 0, A.kc.length);
                        if (n3 != 0) {
                            A.jc.readByte();
                            A.lc = new byte[n3 - 1];
                            A.jc.read(A.lc, 0, A.lc.length);
                        }
                        b = true;
                        break;
                    }
                    A.gc = gc;
                    A.jc.read(A.ic, 0, A.hc);
                    if (n3 != 0 && A.dc[gc] == null) {
                        int n4 = 0;
                        final byte byte1 = A.jc.readByte();
                        ++n4;
                        A.cc[gc * 11 + 2] = byte1;
                        System.gc();
                        A.dc[gc] = new short[byte1 * 7];
                        for (i = 0; i < byte1 * 7; ++i) {
                            A.dc[gc][i] = A.jc.readByte();
                            ++n4;
                        }
                    }
                    else {
                        A.jc.skip(n3);
                    }
                    b = true;
                    break;
                }
                else {
                    A.jc.skip(A.hc + n3);
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if (b2) {
                try {
                    A.jc.close();
                    A.jc = null;
                }
                catch (Exception ex2) {}
            }
        }
        return b;
    }
    
    public static void RA() {
        A.pc = new byte[8][][][];
        A.xc = new Image[8][][];
        A.rc = new byte[8][][];
        A.qc = new byte[8][][][];
        A.yc = new byte[8][][];
        A.tc = new short[8][];
        A.vc = new int[8][][][];
        A.wc = new byte[8][];
        A.uc = new byte[8][][];
        A.sc = new short[8][][][][];
    }
    
    public static void SA() {
        for (int i = 0; i < A.pc.length; ++i) {
            if ((A.mc[i * 2 + 1] & 0x1) == 0x0) {
                A.pc[i] = null;
                A.xc[i] = null;
                A.rc[i] = null;
                A.qc[i] = null;
                A.yc[i] = null;
                A.tc[i] = null;
                A.vc[i] = null;
                A.wc[i] = null;
                A.uc[i] = null;
                A.sc[i] = null;
            }
        }
        System.gc();
    }
    
    public static int N(final int n, final int n2) {
        if (E(n) >= E(n2)) {
            if (n < 0) {
                return 3;
            }
            return 1;
        }
        else {
            if (n2 < 0) {
                return 0;
            }
            return 2;
        }
    }
    
    public static void A(final int[] array, final int n) {
        final int n2 = 6;
        array[n2] &= 0xFFFF0000;
        final int n3 = 6;
        array[n3] |= ((short)n & 0xFFFF);
    }
    
    public static void B(final int[] array, final int n) {
        final int n2 = 6;
        array[n2] &= 0xFFFF;
        final int n3 = 6;
        array[n3] |= ((short)n << 16 & 0xFFFF0000);
    }
    
    public static void C(final int[] array, final int n) {
        final int n2 = 7;
        array[n2] &= 0xFFFF0000;
        final int n3 = 7;
        array[n3] |= ((short)n & 0xFFFF);
    }
    
    public static void D(final int[] array, final int n) {
        if ((array[3] & 0x4) == 0x0) {
            return;
        }
        if (n < 0 || n >= 8) {
            return;
        }
        if (A.pc[n] == null) {
            Y(n);
        }
        final int n2 = 7;
        array[n2] &= 0xFFFF;
        final int n3 = 7;
        array[n3] |= ((short)n << 16 & 0xFFFF0000);
    }
    
    public static int G(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        final short n = (short)(array[6] & 0xFFFF);
        if (n < 0 || n > 17) {
            return -1;
        }
        return n;
    }
    
    public static int H(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        return (short)((array[6] & 0xFFFF0000) >> 16);
    }
    
    public static int I(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        return (short)(array[7] & 0xFFFF);
    }
    
    public static int J(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        final short n = (short)((array[7] & 0xFFFF0000) >> 16);
        if (n < 0 || n >= A.pc.length) {
            return -1;
        }
        return (short)((array[7] & 0xFFFF0000) >> 16);
    }
    
    public static int K(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        return A.pc[j].length;
    }
    
    public static int L(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        return (short)(array[8] & 0xFFFF);
    }
    
    public static void E(final int[] array, final int n) {
        if ((array[3] & 0x4) == 0x0) {
            return;
        }
        K(array);
        final int n2 = 8;
        array[n2] &= 0xFFFF0000;
        final int n3 = 8;
        array[n3] |= ((short)n & 0xFFFF);
        F(array, 0);
        B(array, 0);
        C(array, 0);
    }
    
    public static int M(final int[] array) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        final int l = L(array);
        if (l < 0 || l >= A.qc[j].length) {
            return -1;
        }
        return A.qc[j][l].length;
    }
    
    public static int N(final int[] array) {
        if ((array[3] & 0x4) == 0x0) {
            return -1;
        }
        return (short)((array[8] & 0xFFFF0000) >> 16);
    }
    
    public static void F(final int[] array, final int n) {
        if ((array[3] & 0x4) == 0x0) {
            return;
        }
        M(array);
        final int n2 = 8;
        array[n2] &= 0xFFFF;
        final int n3 = 8;
        array[n3] |= ((short)n << 16 & 0xFFFF0000);
    }
    
    public static void A(final int[] array, int n, final int n2) {
        if (n < 0 || n >= 8) {
            return;
        }
        final int n3 = n >> 2;
        n &= 0x3;
        final int n4 = 9 + n3;
        array[n4] &= ~(255 << (n << 3));
        final int n5 = 9 + n3;
        array[n5] |= (n2 & 0xFF) << (n << 3);
    }
    
    public static int G(final int[] array, int n) {
        if (n < 0 || n >= 8) {
            return 0;
        }
        final int n2 = n >> 2;
        n &= 0x3;
        return array[9 + n2] >> (n << 3) & 0xFF;
    }
    
    public static int O(final int[] array) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        return A.vc[j].length;
    }
    
    public static int H(final int[] array, final int n) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        if (n < 0 || n >= A.vc[j].length) {
            return -1;
        }
        return A.vc[j][n].length;
    }
    
    public static int I(final int[] array, final int n) {
        if (J(array) == -1) {
            return -1;
        }
        final int o = O(array);
        if (n < 0 && n >= o) {
            return -1;
        }
        final int g = G(array, n);
        if (g < 0 || g >= H(array, n)) {
            return -1;
        }
        return g;
    }
    
    public static void B(final int[] array, final int n, final int n2) {
        final int j = J(array);
        if (j == -1) {
            return;
        }
        final int o = O(array);
        if (n < 0 && n >= o) {
            return;
        }
        A(array, n, n2);
        for (int i = 0; i < A.xc[j].length; ++i) {
            final short n3 = A.tc[j][i * 6 + 1];
            final short n4 = A.tc[j][i * 6 + 0];
            if (n3 == n) {
                if (A.xc[j][i][n2] == null) {
                    byte[] array2 = A.yc[j][i];
                    int n5 = 0;
                    if (array2 != null) {
                        n5 = array2.length;
                    }
                    if (array2 == null) {
                        array2 = P(j, n4);
                        if (array2 != null) {
                            n5 = array2.length;
                            A.yc[j][i] = array2;
                        }
                        if (array2 == null) {
                            if (!X(n4)) {
                                continue;
                            }
                            if (A.lc != null) {
                                continue;
                            }
                            array2 = A.kc;
                            n5 = array2.length;
                        }
                    }
                    if (n2 == 0) {
                        A.xc[j][i][n2] = Image.createImage(array2, 0, n5);
                    }
                    else {
                        A(array2, n5, 0, A.vc[j][n][0], A.vc[j][n][n2]);
                        A.xc[j][i][n2] = Image.createImage(array2, 0, n5);
                        A(array2, n5, 0, A.vc[j][n][n2], A.vc[j][n][0]);
                    }
                }
            }
        }
    }
    
    public static int P(final int[] array) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        return A.wc[j].length;
    }
    
    public static int J(final int[] array, final int n) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        if (n < 0 || n >= A.wc[j].length) {
            return -1;
        }
        return A.wc[j][n];
    }
    
    public static int K(final int[] array, final int n) {
        if (J(array) == -1) {
            return -1;
        }
        final int p2 = P(array);
        if (n < 0 && n >= p2) {
            return -1;
        }
        final int g = G(array, O(array) + n);
        if (g < 0 || g >= J(array, n)) {
            return -1;
        }
        return g;
    }
    
    public static void C(final int[] array, int n, final int n2) {
        if (J(array) == -1) {
            return;
        }
        final int p3 = P(array);
        if (n < 0 || n >= p3) {
            return;
        }
        final int j = J(array, n);
        if (n2 < 0 || n2 >= j) {
            return;
        }
        n += O(array);
        A(array, n, n2);
    }
    
    public static int Q(final int[] array) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        return A.uc[j].length;
    }
    
    public static int L(final int[] array, final int n) {
        final int j = J(array);
        if (j == -1) {
            return -1;
        }
        if (n < 0 || n >= A.uc[j].length) {
            return -1;
        }
        return A.uc[j][n].length;
    }
    
    public static int M(final int[] array, final int n) {
        if (J(array) == -1) {
            return -1;
        }
        final int q = Q(array);
        if (n < 0 && n >= q) {
            return -1;
        }
        final int g = G(array, O(array) + P(array) + n);
        if (g < 0 || g >= L(array, n)) {
            return -1;
        }
        return g;
    }
    
    public static void D(final int[] array, int n, final int n2) {
        if (J(array) == -1) {
            return;
        }
        final int q = Q(array);
        if (n < 0 || n >= q) {
            return;
        }
        final int l = L(array, n);
        if (n2 < 0 || n2 >= l) {
            return;
        }
        n += O(array) + P(array);
        A(array, n, n2);
    }
    
    public static void N(final int[] array, final int n) {
        J(array);
        if ((array[3] & 0x4) == 0x0) {
            return;
        }
        if (G(array) == n) {
            return;
        }
        B(array, 0);
        C(array, 0);
        A(array, n);
    }
    
    public static boolean C(final int[] array, final boolean b) {
        boolean b2 = false;
        int h = H(array);
        final int g = G(array);
        final int j = J(array);
        if (j < 0 || j >= 8) {
            return true;
        }
        if (A.pc[j] == null) {
            return true;
        }
        if (g < 0 || g >= 17) {
            return true;
        }
        int l = L(array);
        if (l == -1 || l >= A.pc[j].length) {
            l = 0;
        }
        ++h;
        int n = 0;
        for (int n2 = 0, i = A.pc[j][l][g][0]; i < h; i += A.pc[j][l][g][n2], ++n) {
            n2 += 5;
            if (n2 >= A.pc[j][l][g].length) {
                if (b) {
                    h = 1;
                    n = 0;
                }
                b2 = true;
                break;
            }
        }
        B(array, h);
        C(array, n);
        return b2;
    }
    
    public static void B(final int[] array, final Graphics graphics) {
        try {
            final int i = I(array);
            final int g = G(array);
            final int j = J(array);
            int l = L(array);
            int n = N(array);
            if ((array[3] & 0x4) == 0x0) {
                return;
            }
            if (j == -1) {
                return;
            }
            if (j < 0 || j >= A.pc.length) {
                return;
            }
            if (A.pc[j] == null) {
                return;
            }
            if (l >= A.pc[j].length || l < 0) {
                l = 0;
            }
            if (n >= A.qc[j][l].length || n < 0) {
                n = 0;
            }
            if (g < 0 || g >= 17) {
                return;
            }
            if (i * 5 < -A.pc[j][l][g].length || i * 5 >= A.pc[j][l][g].length) {
                return;
            }
            final int n2 = 1 + i * 5;
            for (int k = 0; k < 4; ++k) {
                byte b = A.qc[j][l][n][g * 4 + k];
                if (b != -1) {
                    final short n3 = A.tc[j][b * 6 + 2];
                    int m = 0;
                    if (n3 != -1) {
                        m = K(array, n3);
                        if (m == -1) {
                            m = 0;
                        }
                    }
                    final short n4 = A.tc[j][b * 6 + 3];
                    final short n5 = A.tc[j][b * 6 + 5];
                    if (n5 != -1) {
                        int m2 = M(array, n5);
                        if (m2 == -1) {
                            m2 = 0;
                        }
                        b = A.uc[j][n5][m2];
                    }
                    final short n6 = A.tc[j][b * 6 + 1];
                    int i2 = 0;
                    if (n6 != -1) {
                        i2 = I(array, n6);
                        if (i2 == -1) {
                            i2 = 0;
                        }
                    }
                    final byte b2 = A.pc[j][l][g][n2 + k];
                    if (i2 >= A.xc[j][b].length) {
                        i2 = 0;
                    }
                    if (A.xc[j][b][i2] == null) {
                        B(array, n6, i2);
                    }
                    if (A.xc[j][b][i2] == null) {
                        return;
                    }
                    final int n7 = array[4] * B.d >> 12;
                    final int n8 = array[5] * B.d >> 12;
                    final int n9 = n7 - A.tB;
                    final int n10 = n8 - A.uB;
                    if (b2 >= 0) {
                        int n11 = b2 * 7 + m * n4 * 7;
                        if (n11 < 0 || n11 >= A.rc[j][b].length) {
                            n11 = 0;
                        }
                        graphics.drawRegion(A.xc[j][b][i2], (int)A.rc[j][b][n11 + 1], (int)A.rc[j][b][n11 + 2], (int)A.rc[j][b][n11 + 3], (int)A.rc[j][b][n11 + 4], 0, n9 + A.rc[j][b][n11 + 5], n10 + A.rc[j][b][n11 + 6], 20);
                    }
                    else {
                        int n12 = (-b2 - 1) * 7 + m * n4 * 7;
                        if (n12 < 0 || n12 >= A.rc[j][b].length) {
                            n12 = 0;
                        }
                        graphics.drawRegion(A.xc[j][b][i2], (int)A.rc[j][b][n12 + 1], (int)A.rc[j][b][n12 + 2], (int)A.rc[j][b][n12 + 3], (int)A.rc[j][b][n12 + 4], 2, n9 - A.rc[j][b][n12 + 3] - A.rc[j][b][n12 + 5], n10 + A.rc[j][b][n12 + 6], 20);
                    }
                }
            }
        }
        catch (Exception ex) {}
    }
    
    public static short[] D(final int[] array, final boolean b) {
        if ((array[3] & 0x4) == 0x0) {
            A.zc[0] = 0;
            A.zc[1] = 0;
            A.zc[2] = 0;
            A.zc[3] = 0;
            return null;
        }
        final int j = J(array);
        if (j == -1) {
            return null;
        }
        if (A.xc[j] == null) {
            return null;
        }
        int l = L(array);
        int n = N(array);
        int g = G(array);
        int i = I(array);
        if (b) {
            if (A.nc[g] != -1) {
                g = A.nc[g];
            }
            i = 0;
        }
        if (l < 0 || l >= A.sc[j].length) {
            l = 0;
        }
        if (n < 0 || n >= A.sc[j][l].length) {
            n = 0;
        }
        for (int k = 0; k < 4; ++k) {
            A.zc[k] = A.sc[j][l][n][g][i * 4 + k];
        }
        return A.zc;
    }
    
    public static void Y(final int n) {
        if (A.pc[n] != null) {
            return;
        }
        final short i = A.mc[n * 2 + 0];
        System.gc();
        DataInputStream dataInputStream = null;
        String s = "/";
        if (i < 10) {
            s = "/" + "0";
        }
        if (i < 100) {
            s += "0";
        }
        final String string = s + "" + i + ".mdl";
        try {
            dataInputStream = new DataInputStream(HG.fb.getClass().getResourceAsStream(string));
            dataInputStream.readInt();
            final byte byte1 = dataInputStream.readByte();
            final byte byte2 = dataInputStream.readByte();
            final byte byte3 = dataInputStream.readByte();
            if (byte1 != 4 || byte2 != 17 || byte3 != 7) {
                A.pc[n] = null;
                return;
            }
            final byte byte4 = dataInputStream.readByte();
            A.pc[n] = new byte[byte4][17][];
            for (byte b = 0; b < byte4; ++b) {
                for (int j = 0; j < 17; ++j) {
                    dataInputStream.read(A.pc[n][b][j] = new byte[dataInputStream.readByte() * 5], 0, A.pc[n][b][j].length);
                }
            }
            A.qc[n] = new byte[A.pc[n].length][][];
            for (int k = 0; k < A.qc[n].length; ++k) {
                final byte byte5 = dataInputStream.readByte();
                A.qc[n][k] = new byte[byte5][68];
                for (byte b2 = 0; b2 < byte5; ++b2) {
                    for (int l = 0; l < 17; ++l) {
                        for (int n2 = 0; n2 < 4; ++n2) {
                            A.qc[n][k][b2][l * 4 + n2] = dataInputStream.readByte();
                        }
                    }
                }
            }
            final byte byte6 = dataInputStream.readByte();
            A.tc[n] = new short[byte6 * 6];
            for (byte b3 = 0; b3 < byte6; ++b3) {
                for (int n3 = 0; n3 < 6; ++n3) {
                    A.tc[n][b3 * 6 + n3] = dataInputStream.readShort();
                }
            }
            final int int1 = dataInputStream.readInt();
            A.uc[n] = new byte[int1][];
            for (int n4 = 0; n4 < int1; ++n4) {
                dataInputStream.read(A.uc[n][n4] = new byte[dataInputStream.readByte()], 0, A.uc[n][n4].length);
            }
            final byte byte7 = dataInputStream.readByte();
            A.vc[n] = new int[byte7][][];
            for (byte b4 = 0; b4 < byte7; ++b4) {
                final byte byte8 = dataInputStream.readByte();
                final byte byte9 = dataInputStream.readByte();
                A.vc[n][b4] = new int[byte8][byte9];
                for (byte b5 = 0; b5 < byte8; ++b5) {
                    for (byte b6 = 0; b6 < byte9; ++b6) {
                        A.vc[n][b4][b5][b6] = dataInputStream.readInt();
                    }
                }
            }
            final byte byte10 = dataInputStream.readByte();
            A.wc[n] = new byte[byte10];
            for (byte b7 = 0; b7 < byte10; ++b7) {
                A.wc[n][b7] = dataInputStream.readByte();
            }
            A.xc[n] = new Image[byte6][];
            A.yc[n] = new byte[byte6][];
            A.rc[n] = new byte[byte6][];
            dataInputStream.readInt();
            OA();
            for (byte b8 = 0; b8 < byte6; ++b8) {
                dataInputStream.readInt();
                int n5 = dataInputStream.readInt();
                final int int2 = dataInputStream.readInt();
                if (O(n, b8)) {
                    dataInputStream.skip(n5);
                    dataInputStream.read(A.rc[n][b8] = new byte[int2], 0, A.rc[n][b8].length);
                }
                else {
                    final short n6 = A.tc[n][b8 * 6 + 1];
                    byte[] kc;
                    if (n5 == 0) {
                        if (!X(A.tc[n][b8 * 6 + 0]) || A.lc != null) {
                            A.pc[n] = null;
                            throw new Exception("");
                        }
                        kc = A.kc;
                        n5 = kc.length;
                    }
                    else {
                        kc = new byte[n5];
                        dataInputStream.read(kc, 0, kc.length);
                    }
                    dataInputStream.read(A.rc[n][b8] = new byte[int2], 0, A.rc[n][b8].length);
                    if (n6 == -1) {
                        (A.xc[n][b8] = new Image[1])[0] = Image.createImage(kc, 0, n5);
                        A.yc[n][b8] = null;
                    }
                    else {
                        A.yc[n][b8] = kc;
                        A.xc[n][b8] = new Image[A.vc[n][n6].length];
                    }
                    System.gc();
                }
            }
            PA();
            for (byte b9 = 0; b9 < byte6; ++b9) {
                if (A.xc[n][b9][0] != null) {
                    final int width = A.xc[n][b9][0].getWidth();
                    final int height = A.xc[n][b9][0].getHeight();
                    for (int n7 = 0; n7 < A.rc[n][b9].length; n7 += 7) {
                        if (A.rc[n][b9][n7 + 1] < 0 || A.rc[n][b9][n7 + 1] >= width) {
                            A.rc[n][b9][n7 + 1] = 0;
                        }
                        if (A.rc[n][b9][n7 + 2] < 0 || A.rc[n][b9][n7 + 2] >= height) {
                            A.rc[n][b9][n7 + 2] = 0;
                        }
                        if (A.rc[n][b9][n7 + 1] + A.rc[n][b9][n7 + 3] > width) {
                            A.rc[n][b9][n7 + 3] = 1;
                        }
                        if (A.rc[n][b9][n7 + 2] + A.rc[n][b9][n7 + 4] > height) {
                            A.rc[n][b9][n7 + 4] = 1;
                        }
                    }
                }
            }
            A.sc[n] = new short[A.qc[n].length][][][];
            for (int n8 = 0; n8 < A.qc[n].length; ++n8) {
                A.sc[n][n8] = new short[A.qc[n][n8].length][][];
                for (int n9 = 0; n9 < A.qc[n][n8].length; ++n9) {
                    A.sc[n][n8][n9] = new short[17][];
                    for (int n10 = 0; n10 < 17; ++n10) {
                        final int n11 = A.pc[n][n8][n10].length / 5;
                        A.sc[n][n8][n9][n10] = new short[n11 * 4];
                        for (int n12 = 0; n12 < n11; ++n12) {
                            short n13 = 32767;
                            short n14 = -32768;
                            short n15 = 32767;
                            short n16 = -32768;
                            for (int n17 = 0; n17 < 4; ++n17) {
                                final byte b10 = A.qc[n][n8][n9][n10 * 4 + n17];
                                int n18 = A.pc[n][n8][n10][5 * n12 + n17 + 1];
                                if (b10 != -1) {
                                    boolean b11 = false;
                                    if (n18 < 0) {
                                        n18 *= -1;
                                        --n18;
                                        b11 = true;
                                    }
                                    short n19 = A.rc[n][b10][n18 * 7 + 5];
                                    final short n20 = A.rc[n][b10][n18 * 7 + 6];
                                    final short n21 = A.rc[n][b10][n18 * 7 + 3];
                                    final short n22 = A.rc[n][b10][n18 * 7 + 4];
                                    if (b11) {
                                        n19 = (short)((short)(n19 * -1) - n21);
                                    }
                                    if (n13 > n19) {
                                        n13 = n19;
                                    }
                                    if (n14 < n19 + n21) {
                                        n14 = (short)(n19 + n21);
                                    }
                                    if (n15 > n20) {
                                        n15 = n20;
                                    }
                                    if (n16 < n20 + n22) {
                                        n16 = (short)(n20 + n22);
                                    }
                                }
                            }
                            A.sc[n][n8][n9][n10][n12 * 4 + 0] = n13;
                            A.sc[n][n8][n9][n10][n12 * 4 + 2] = n14;
                            A.sc[n][n8][n9][n10][n12 * 4 + 1] = n15;
                            A.sc[n][n8][n9][n10][n12 * 4 + 3] = n16;
                        }
                    }
                }
            }
            for (int n23 = 0; n23 < 8; ++n23) {
                if (n23 != n) {
                    if (A.mc[n23 * 2 + 0] == A.mc[n * 2 + 0]) {
                        A.pc[n23] = A.pc[n];
                        A.xc[n23] = A.xc[n];
                        A.rc[n23] = A.rc[n];
                        A.qc[n23] = A.qc[n];
                        A.yc[n23] = A.yc[n];
                        A.tc[n23] = A.tc[n];
                        A.vc[n23] = A.vc[n];
                        A.wc[n23] = A.wc[n];
                        A.uc[n23] = A.uc[n];
                        A.sc[n23] = A.sc[n];
                    }
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            A.pc[n] = null;
        }
        finally {
            try {
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            }
            catch (Exception ex2) {}
        }
    }
    
    private static boolean O(final int n, final int n2) {
        final short n3 = A.tc[n][n2 * 6 + 0];
        final short n4 = A.tc[n][n2 * 6 + 1];
        for (int i = 0; i < 8; ++i) {
            if (i != n) {
                if (A.pc[i] != null) {
                    for (int j = 0; j < A.xc[i].length; ++j) {
                        if (n3 == A.tc[i][j * 6 + 0]) {
                            if (A.tc[i][j * 6 + 1] == -1) {
                                if (n4 == -1) {
                                    (A.xc[n][n2] = new Image[1])[0] = A.xc[i][j][0];
                                    A.yc[n][n2] = A.yc[i][j];
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private static byte[] P(int n, final int n2) {
        final short i = A.mc[n * 2 + 0];
        byte[] b = null;
        System.gc();
        DataInputStream dataInputStream = null;
        String s = "/";
        if (i < 10) {
            s = "/" + "0";
        }
        if (i < 100) {
            s += "0";
        }
        final String string = s + "" + i + ".mdl";
        try {
            dataInputStream = new DataInputStream(HG.fb.getClass().getResourceAsStream(string));
            n = dataInputStream.readInt();
            dataInputStream.skip(n);
            for (int int1 = dataInputStream.readInt(), j = 0; j < int1; ++j) {
                final int int2 = dataInputStream.readInt();
                final int int3 = dataInputStream.readInt();
                n = dataInputStream.readInt();
                if (int2 == n2 && int3 != 0) {
                    b = new byte[int3];
                    dataInputStream.read(b, 0, int3);
                    break;
                }
                dataInputStream.skip(int3 + n);
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            try {
                if (dataInputStream != null) {
                    dataInputStream.close();
                }
            }
            catch (Exception ex2) {}
        }
        return b;
    }
    
    public static void E(final int[] array, final boolean b) {
        final int n = 10;
        array[n] |= 0x10000;
        if (b) {
            final int n2 = 10;
            array[n2] |= 0x20000;
        }
    }
    
    public static void R(final int[] array) {
        if ((array[10] & 0x10000) != 0x0) {
            int n = (byte)(array[10] >> 24 & 0xFF);
            if (n >= 2) {
                int n2 = (short)(array[10] & 0xFFFF);
                if (++n2 >= A.cc[A.qa[array[4]][1] * 11 + 5]) {
                    if ((array[10] & 0x20000) != 0x0) {
                        final int n3 = 10;
                        array[n3] &= 0xFFFF0000;
                        final int n4 = 10;
                        array[n4] |= 0x0;
                    }
                    else {
                        final int n5 = 10;
                        array[n5] &= 0xFFFEFFFF;
                    }
                }
                else {
                    final int n6 = 10;
                    array[n6] &= 0xFFFF0000;
                    final int n7 = 10;
                    array[n7] |= ((short)n2 & 0xFFFF);
                }
                final int n8 = 10;
                array[n8] &= 0xFFFFFF;
                final int n9 = 10;
                array[n9] |= 0x1000000;
            }
            else {
                ++n;
                final int n10 = 10;
                array[n10] &= 0xFFFFFF;
                final int n11 = 10;
                array[n11] |= ((byte)n << 24 & 0xFF000000);
            }
        }
    }
    
    private static boolean A(final byte[] array) {
        boolean b = true;
        final byte[] array2 = { -119, 80, 78, 71, 13, 10, 26, 10 };
        for (int i = 0; i < 8; ++i) {
            if (array2[i] != array[i]) {
                b = false;
            }
        }
        return b;
    }
    
    private static int A(final byte[] array, final int n) {
        int n2 = (array[n + 0] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8 | (array[n + 3] & 0xFF);
        if (n2 < 0) {
            n2 = 0;
        }
        return n2;
    }
    
    private static boolean B(final byte[] array, final int n) {
        return (array[n + 4 + 0] & 0xFFFFFFDF) == 0x50 && (array[n + 4 + 1] & 0xFFFFFFDF) == 0x4C && (array[n + 4 + 2] & 0xFFFFFFDF) == 0x54 && (array[n + 4 + 3] & 0xFFFFFFDF) == 0x45;
    }
    
    private static int A(final byte[] array, final int n, final int n2) {
        if (A.bC == null) {
            A.bC = new int[256];
            for (int i = 0; i < 256; ++i) {
                int n3 = i;
                for (int j = 0; j < 8; ++j) {
                    if ((n3 & 0x1) == 0x1) {
                        n3 = (0xEDB88320 ^ n3 >>> 1);
                    }
                    else {
                        n3 >>>= 1;
                    }
                }
                A.bC[i] = n3;
            }
        }
        int n4 = -1;
        for (int k = n; k < n + n2; ++k) {
            n4 = (A.bC[(n4 ^ array[k]) & 0xFF] ^ n4 >>> 8);
        }
        return ~n4;
    }
    
    private static boolean C(final byte[] array, final int n) {
        final int a = A(array, n);
        return ((array[n + 8 + a + 0] & 0xFF) << 24 | (array[n + 8 + a + 1] & 0xFF) << 16 | (array[n + 8 + a + 2] & 0xFF) << 8 | (array[n + 8 + a + 3] & 0xFF)) == A(array, n + 4, a + 4);
    }
    
    private static void D(final byte[] array, final int n) {
        final int n2 = (array[n + 0] & 0xFF) << 24 | (array[n + 1] & 0xFF) << 16 | (array[n + 2] & 0xFF) << 8 | (array[n + 3] & 0xFF);
        final int a = A(array, n + 4, n2 + 4);
        array[n + 8 + n2 + 0] = (byte)(a >>> 24 & 0xFF);
        array[n + 8 + n2 + 1] = (byte)(a >>> 16 & 0xFF);
        array[n + 8 + n2 + 2] = (byte)(a >>> 8 & 0xFF);
        array[n + 8 + n2 + 3] = (byte)(a >>> 0 & 0xFF);
    }
    
    public static boolean A(final byte[] array, final int n, final int n2, final int[] array2, final int[] array3) {
        try {
            if (!A(array)) {
                return false;
            }
            int a;
            for (int i = 8; i < n; i += a + 12) {
                a = A(array, i);
                if (a > 0) {
                    if (C(array, i)) {
                        if (B(array, i)) {
                            A(array, i + 8, a, n2, array2, array3);
                            D(array, i);
                        }
                    }
                }
            }
            return true;
        }
        catch (Exception ex) {
            return false;
        }
    }
    
    private static void A(final byte[] array, final int n, final int n2, final int n3, final int[] array2, final int[] array3) {
        try {
            int n4 = 0;
            int n5 = 0;
            for (int i = n; i < n + n2; i += 3) {
                int n6 = 0;
                for (int j = 0; j < array2.length; ++j) {
                    if (n6 == 0 && (array[i + 0] & 0xFF) == (array2[j] >> 16 & 0xFF) && (array[i + 1] & 0xFF) == (array2[j] >> 8 & 0xFF) && (array[i + 2] & 0xFF) == (array2[j] >> 0 & 0xFF)) {
                        final int n7 = array2.length * n3 + j;
                        n6 = 1;
                        ++n5;
                        array[i + 0] = (byte)(array3[n7] >> 16 & 0xFF);
                        array[i + 1] = (byte)(array3[n7] >> 8 & 0xFF);
                        array[i + 2] = (byte)(array3[n7] >> 0 & 0xFF);
                    }
                }
                ++n4;
            }
        }
        catch (Exception ex) {}
    }
    
    public static void E(int n, final int n2, final int n3) {
        final int[] b = B(6, n);
        if ((b[3] & 0x2) != 0x0) {
            B.D(b);
            b[0] = (((short)n2 & 0xFFFF) | ((short)n3 << 16 & 0xFFFF0000));
            b[4] = n2 * 4096 + 2048;
            b[5] = n3 * 4096 + 2048;
            B.C(b);
        }
        else {
            b[0] = (((short)n2 & 0xFFFF) | ((short)n3 << 16 & 0xFFFF0000));
            b[4] = n2 * 4096 + 2048;
            b[5] = n3 * 4096 + 2048;
        }
        if ((b[3] & 0x20) != 0x0) {
            final int[] array = b;
            final int n4 = 13;
            array[n4] &= 0xFFFFFFBF;
            final int[] array2 = b;
            final int n5 = 13;
            array2[n5] &= 0xFFFFFDFF;
            b[24] = 0;
            n = (short)((b[2] & 0xFFFF0000) >> 16);
            T(n);
        }
    }
    
    public static final boolean A(final int n, final int n2, final int n3, final int n4, final int n5, final boolean b) {
        if ((A.ca[3] & 0x800000) != 0x0 || (short)(A.ca[12] & 0xFFFF) <= 0) {
            return false;
        }
        boolean b2 = false;
        int length = A.dC.length;
        while (--length >= 0) {
            final int[] array = A.dC[length];
            boolean b3;
            if (array[0] == 13) {
                b3 = (array[0] == n && (n2 < array[2] || n2 > array[3] || n3 < array[4] || n3 > array[5]) && n4 >= array[2] && n4 <= array[3] && n5 >= array[4] && n5 <= array[5] && array[1] == 1);
            }
            else if (array[0] == 8) {
                b3 = (array[0] == n && n2 >= array[2] && n2 <= array[3] && n3 >= array[4] && n3 <= array[5] && (n4 < array[2] || n4 > array[3] || n5 < array[4] || n5 > array[5]) && array[1] == 1);
            }
            else if (array[0] == 18) {
                b3 = (array[0] == n && n2 >= array[2] && n2 <= array[3] && n3 >= array[4] && n3 <= array[5] && array[1] == 1);
            }
            else {
                b3 = (array[0] == n && array[2] == n2 && array[3] == n3 && array[4] == n4 && array[1] == 1);
            }
            if (b3) {
                int[] array2 = null;
                int n6 = -1;
                int n7 = 4;
                while (--n7 >= 0) {
                    if (A.eC[n7][0] == 0) {
                        array2 = A.eC[n7];
                        n6 = n7;
                        break;
                    }
                }
                if (array2 == null) {
                    return b2;
                }
                array2[array2[0] = 1] = length;
                array2[2] = array[6];
                array2[4] = (array2[3] = 0);
                array2[9] = 16;
                if (b) {
                    O(array2, n6);
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public static final void TA() {
        if (A.dC != null && A.dC.length > 0) {
            int n = 4;
            while (--n >= 0) {
                final int[] array = A.eC[n];
                if (array[0] != 0) {
                    O(array, n);
                }
            }
        }
    }
    
    public static final void O(final int[] gd, final int hd) {
        final int[] array = A.dC[gd[1]];
        final byte[] array2 = A.cC[gd[2]];
        int cd = gd[3];
        int n = gd[4];
        int n2 = gd[5];
        int yd = gd[6];
        int n3 = gd[7];
        int ce = gd[8];
        int n4 = gd[9];
        boolean b = false;
        boolean b2 = false;
        while (gd[0] != 2) {
            Label_4889: {
                if (n == 0) {
                    if (cd >= array2.length) {
                        b = true;
                        break Label_4889;
                    }
                    n = array2[cd++];
                    switch (n) {
                        case 1:
                        case 4:
                        case 5:
                        case 33:
                        case 46:
                        case 72:
                        case 73: {
                            n2 = array2[cd++];
                            break;
                        }
                        case 17:
                        case 18:
                        case 19:
                        case 27: {
                            n2 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            break;
                        }
                        case 48: {
                            n2 = array2[cd++];
                            break;
                        }
                        case 20:
                        case 21:
                        case 22: {
                            n2 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            yd = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            break;
                        }
                        case 2: {
                            n2 = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            yd = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            n3 = array2[cd++];
                            break;
                        }
                        case 34:
                        case 35: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            break;
                        }
                        case 54: {
                            A.cD = cd - 1;
                            n2 = array2[cd++];
                            yd = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            n3 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            break;
                        }
                        case 51: {
                            n2 = array2[cd++];
                            yd = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            break;
                        }
                        case 40: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            break;
                        }
                        case 39: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            break;
                        }
                        case 41:
                        case 45: {
                            n2 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            yd = array2[cd++];
                            n3 = array2[cd++];
                            break;
                        }
                        case 49: {
                            n2 = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            break;
                        }
                        case 50: {
                            n2 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            yd = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            break;
                        }
                        case 53: {
                            n2 = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            break;
                        }
                        case 44: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            n3 = array2[cd++];
                            ce = array2[cd++];
                            break;
                        }
                        case 42:
                        case 43:
                        case 74: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            n3 = array2[cd++];
                            break;
                        }
                        case 36:
                        case 37:
                        case 38: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            break;
                        }
                        case 64:
                        case 65: {
                            n2 = array2[cd++];
                            yd = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            break;
                        }
                        case 47:
                        case 66:
                        case 67: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            break;
                        }
                        case 68:
                        case 69: {
                            n2 = array2[cd++];
                            yd = array2[cd++];
                            n3 = array2[cd++];
                            break;
                        }
                        case 81: {
                            n2 = array2[cd++];
                            yd = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            break;
                        }
                        case 80: {
                            n2 = array2[cd++];
                            yd = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            n3 = ((array2[cd++] << 16 & 0xFF0000) | (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF)));
                            ce = array2[cd++];
                            break;
                        }
                        case 75: {
                            n2 = array2[cd++];
                            yd = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            n3 = array2[cd++];
                            ce = array2[cd++];
                            break;
                        }
                        case 55: {
                            n2 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            yd = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            n3 = (short)((array2[cd++] << 8 & 0xFF00) | (array2[cd++] & 0xFF));
                            break;
                        }
                    }
                }
                boolean b3 = true;
                Label_3352: {
                    switch (n) {
                        case 1: {
                            if (--n2 >= 0) {
                                b3 = false;
                                b2 = true;
                                A.sd = true;
                                break;
                            }
                            break;
                        }
                        case 17: {
                            cd = n2;
                            break;
                        }
                        case 18: {
                            if (gd[--n4] != 0) {
                                cd = n2;
                                break;
                            }
                            break;
                        }
                        case 19: {
                            if (gd[--n4] == 0) {
                                cd = n2;
                                break;
                            }
                            break;
                        }
                        case 20: {
                            if (gd[--n4] < n2) {
                                cd = yd;
                                break;
                            }
                            break;
                        }
                        case 21: {
                            if (gd[--n4] > n2) {
                                cd = yd;
                                break;
                            }
                            break;
                        }
                        case 22: {
                            if (gd[--n4] == n2) {
                                cd = yd;
                                break;
                            }
                            break;
                        }
                        case 23: {
                            if (gd[--n4] != n2) {
                                cd = yd;
                                break;
                            }
                            break;
                        }
                        case 51: {
                            if (A.ld == n2) {
                                cd = yd;
                                break;
                            }
                            break;
                        }
                        case 26: {
                            n2 = gd[--n4];
                        }
                        case 27: {
                            yd = gd[--n4];
                            int n5 = 0;
                            if (yd > n2) {
                                n5 = 1;
                            }
                            else if (yd < n2) {
                                n5 = -1;
                            }
                            gd[n4++] = n5;
                            break;
                        }
                        case 33: {
                            switch (n2) {
                                case 0: {
                                    gd[n4++] = A.fC;
                                    break;
                                }
                                case 1: {
                                    gd[n4++] = A.gC;
                                    break;
                                }
                                case 2: {
                                    gd[n4++] = A.hC;
                                    break;
                                }
                                case 3: {
                                    gd[n4++] = A.iC;
                                    break;
                                }
                                case 4: {
                                    gd[n4++] = A.jC;
                                    break;
                                }
                            }
                            break;
                        }
                        case 34: {
                            switch (n2) {
                                case 0: {
                                    A.fC = yd;
                                    break;
                                }
                                case 1: {
                                    A.gC = yd;
                                    break;
                                }
                                case 2: {
                                    A.hC = yd;
                                    break;
                                }
                                case 3: {
                                    A.iC = yd;
                                    break;
                                }
                                case 4: {
                                    A.jC = yd;
                                    break;
                                }
                            }
                            break;
                        }
                        case 35: {
                            switch (n2) {
                                case 0: {
                                    A.fC += yd;
                                    break;
                                }
                                case 1: {
                                    A.gC += yd;
                                    break;
                                }
                                case 2: {
                                    A.hC += yd;
                                    break;
                                }
                                case 3: {
                                    A.iC += yd;
                                    break;
                                }
                                case 4: {
                                    A.jC += yd;
                                    break;
                                }
                            }
                            break;
                        }
                        case 47: {
                            final int[] b4 = B(n2, yd);
                            if ((b4[3] & 0x1000) != 0x0 && (byte)(b4[8] & 0xFF) == 5) {
                                final int e = B.E();
                                final byte b5 = (byte)(b4[8] >> 8 & 0xFF);
                                final int n6 = e | 1 << b5 | 1 << b5 + 1;
                                E(b4, false);
                                final int[] array3 = b4;
                                final int n7 = 3;
                                array3[n7] |= 0x8000;
                                A(b4, true);
                                A.bc = true;
                                B.B(n6);
                                F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
                                break;
                            }
                            break;
                        }
                        case 3: {
                            array[1] = 0;
                            break;
                        }
                        case 4: {
                            A.dC[n2][1] = 0;
                            break;
                        }
                        case 5: {
                            A.dC[n2][1] = 1;
                            break;
                        }
                        case 2: {
                            I(hd, 0, 0);
                            gd[0] = 2;
                            if (n3 == 1) {
                                D(n2, yd, 103, 104);
                            }
                            else {
                                D(n2, yd, 105, 105);
                            }
                            b2 = true;
                            break;
                        }
                        case 45: {
                            A(10, 0, 0, 0, 0, true);
                            A.r.A(HG.eb, n2, yd, n3, false);
                            new Thread((Runnable)A.r).start();
                            b = true;
                            break;
                        }
                        case 41: {
                            I(n2, yd, n3);
                            String s;
                            int n8;
                            if (A.ca[11] == -1) {
                                s = HG.I(85) + " " + HG.I(86);
                                if (B.wA == 2) {
                                    n8 = 435;
                                }
                                else {
                                    n8 = 436;
                                }
                            }
                            else if (A.ca[11] <= n2) {
                                s = HG.I(84);
                                n8 = 315 + n2;
                            }
                            else {
                                s = HG.I(85);
                                n8 = 315 + A.ca[11];
                            }
                            A(s, HG.I(n8), 100, 101);
                            gd[0] = 2;
                            A.gd = gd;
                            A.hd = hd;
                            b2 = true;
                            break;
                        }
                        case 46: {
                            A.ca[30] = n2;
                            B.h = n2;
                            break;
                        }
                        case 48: {
                            final int[] array4 = A.ea[n2];
                            final int n9 = 12;
                            array4[n9] &= 0xFFFF0000;
                            final int[] array5 = A.ea[n2];
                            final int n10 = 12;
                            array5[n10] |= 0xFFFF;
                            break;
                        }
                        case 40: {
                            final int[] b6;
                            final int[] array6 = b6 = B(n2, yd);
                            final int n11 = 3;
                            b6[n11] |= 0x10000;
                            if ((array6[3] & 0x2) != 0x0) {
                                B.D(array6);
                            }
                            if ((array6[3] & 0x20) == 0x0 || N((short)((array6[2] & 0xFFFF0000) >> 16))) {
                                break;
                            }
                            --A.nA;
                            if (A.nA <= 0 && HG.S(A.oA) != 0) {
                                HG.L();
                                HG.M(A.oA);
                                break;
                            }
                            break;
                        }
                        case 39: {
                            final int[] b7 = B(n2, yd);
                            final int[] a = A(b7);
                            boolean b8 = true;
                            if (a != null && A.ca[11] >= 0) {
                                final int n12 = b7[3];
                                final int n13 = A.ca[11];
                                final short n14 = (short)((b7[2] & 0xFFFF0000) >> 16);
                                if (((n12 & 0x80) != 0x0 && (A.eA[n13] & 1 << n14) != 0x0) || ((n12 & 0x40) != 0x0 && (A.dA[n13] & 1 << n14) != 0x0) || ((n12 & 0x20) != 0x0 && (A.cA[n13] & 1 << n14) != 0x0) || ((n12 & 0x100) != 0x0 && (A.aA[n13] & 1 << n14) != 0x0) || ((n12 & 0x200) != 0x0 && (A.bA[n13] & 1 << n14) != 0x0) || ((n12 & 0x400) != 0x0 && (A.gA[n13] & 1 << n14) != 0x0) || ((n12 & 0x2000) != 0x0 && (A.fA[n13] & 1 << n14) != 0x0)) {
                                    b8 = false;
                                }
                            }
                            if (b8) {
                                final int[] array7 = b7;
                                final int n15 = 3;
                                array7[n15] &= 0xFFFEFFFF;
                                if ((b7[3] & 0x2) == 0x0) {
                                    B.C(b7);
                                }
                            }
                            if ((b7[3] & 0x20) == 0x0 || N((short)((b7[2] & 0xFFFF0000) >> 16))) {
                                break;
                            }
                            ++A.nA;
                            if (HG.S(2) != 0) {
                                HG.L();
                                HG.M(2);
                                break;
                            }
                            break;
                        }
                        case 49: {
                            AA(n2);
                            break;
                        }
                        case 53: {
                            A.pd = n2;
                            break;
                        }
                        case 50: {
                            A(n2, yd, gd);
                            A.sd = false;
                            b2 = true;
                            break;
                        }
                        case 74: {
                            if (A.wa != null) {
                                final int[] array8 = A.ea[n2];
                                final int n16 = 13;
                                array8[n16] |= 0x20000;
                                final int[] array9 = A.ea[n2];
                                final int n17 = 20;
                                array9[n17] &= 0xFFFF0000;
                                final int[] array10 = A.ea[n2];
                                final int n18 = 20;
                                array10[n18] |= 0xFFFF;
                                break Label_3352;
                            }
                            E(n2, yd, n3);
                            A(14, n2, yd, n3, 0, false);
                            break Label_3352;
                        }
                        case 42: {
                            if (A.wa != null) {
                                A.ea[n2][22] = (((short)(yd * 2) & 0xFFFF) | ((short)(n3 * 2) << 16 & 0xFFFF0000));
                                final int[] array11 = A.ea[n2];
                                final int n19 = 13;
                                array11[n19] |= 0x10000;
                                break;
                            }
                            E(n2, yd, n3);
                            A(14, n2, yd, n3, 0, false);
                            break;
                        }
                        case 43: {
                            E(n2, yd, n3);
                            break;
                        }
                        case 44: {
                            final int[] b9 = B(n3, ce);
                            final int[] b10 = B(n2, yd);
                            if ((b10[3] & 0x2) != 0x0) {
                                B.A(b10, (int)(short)(b9[0] & 0xFFFF), (int)(short)((b9[0] & 0xFFFF0000) >> 16));
                                break;
                            }
                            b10[0] = (((short)(b9[0] & 0xFFFF) & 0xFFFF) | ((short)((b9[0] & 0xFFFF0000) >> 16) << 16 & 0xFFFF0000));
                            break;
                        }
                        case 36: {
                            if ((A.na[n2] & 1 << yd) != 0x0) {
                                gd[n4++] = 1;
                                break;
                            }
                            gd[n4++] = 0;
                            break;
                        }
                        case 37: {
                            final int[] na = A.na;
                            final int n20 = n2;
                            na[n20] |= 1 << yd;
                            break;
                        }
                        case 38: {
                            final int[] na2 = A.na;
                            final int n21 = n2;
                            na2[n21] &= ~(1 << yd);
                            break;
                        }
                        case 64: {
                            A(n2, yd, true, false, A.ca);
                            break;
                        }
                        case 65: {
                            A(n2, yd, false, false, A.ca);
                            break;
                        }
                        case 72: {
                            gd[n4++] = B(n2, false);
                            break;
                        }
                        case 66: {
                            final int[] b11 = B(n2, yd);
                            if (A(n2, b11)) {
                                final int[] array12 = b11;
                                final int n22 = 3;
                                array12[n22] &= 0xFFFEFFFF;
                                B(n2, b11);
                                break;
                            }
                            A(HG.I(227), HG.I(230), 101, 106);
                            final int[] array13 = b11;
                            final int n23 = 3;
                            array13[n23] &= 0xFFFEFFFF;
                            B.A(b11, (int)(short)(A.ca[0] & 0xFFFF), (int)(short)((A.ca[0] & 0xFFFF0000) >> 16));
                            break;
                        }
                        case 68: {
                            if (H(n2, yd) >= n3) {
                                gd[n4++] = 1;
                                break;
                            }
                            gd[n4++] = 0;
                            break;
                        }
                        case 70: {
                            if (A.ca[42] >= 0) {
                                gd[n4++] = 1;
                                break;
                            }
                            gd[n4++] = 0;
                            break;
                        }
                        case 71: {
                            if (A.ca[41] >= 0) {
                                gd[n4++] = 1;
                                break;
                            }
                            gd[n4++] = 0;
                            break;
                        }
                        case 69: {
                            I(((short)yd & 0xFFFF) | ((short)n2 << 16 & 0xFFFF0000), n3);
                            break;
                        }
                        case 67: {
                            if (A(n2, B(n2, yd))) {
                                gd[n4++] = 1;
                                break;
                            }
                            gd[n4++] = 0;
                            break;
                        }
                        case 52: {
                            HG.bA = B.Q();
                            HG.lA.removeAllElements();
                            HG.LA(21);
                            HG.iA = true;
                            break;
                        }
                        case 73: {
                            HG.M(n2);
                            break;
                        }
                        case 80: {
                            A.ya[n2][1] = yd;
                            final int n24 = n3 - yd;
                            if (n24 > A.ya[n2][2]) {
                                A.ya[n2][2] = n24;
                            }
                            if ((short)(A.ya[n2][0] & 0xFFFF) == 0) {
                                final int[] array14 = A.ya[n2];
                                final int n25 = 0;
                                array14[n25] &= 0xFFFF0000;
                                final int[] array15 = A.ya[n2];
                                final int n26 = 0;
                                array15[n26] |= 0x1;
                            }
                            final int[] array16 = A.ya[n2];
                            final int n27 = 0;
                            array16[n27] &= 0xFFFF;
                            final int[] array17 = A.ya[n2];
                            final int n28 = 0;
                            array17[n28] |= ((short)ce << 16 & 0xFFFF0000);
                            break;
                        }
                        case 81: {
                            final int[] array18 = A.ya[n2];
                            final int n29 = 0;
                            array18[n29] &= 0xFFFF0000;
                            final int[] array19 = A.ya[n2];
                            final int n30 = 0;
                            array19[n30] |= 0x2;
                            if (yd > A.ya[n2][2]) {
                                A.ya[n2][2] = yd - A.ya[n2][1];
                                break;
                            }
                            break;
                        }
                        case 75: {
                            if (A.zD != n2) {
                                A(10, -2, 0);
                            }
                            A.zD = n2;
                            A.ae = yd;
                            A.be = n3;
                            A.ce = ce;
                            break;
                        }
                        case 55: {
                            if (A.ld < A.dD && A.bD == -1) {
                                int n31 = 1;
                                if (A.aD == 2 || A.aD == 3) {
                                    n31 = 2;
                                }
                                int n32 = 1;
                                for (int i = 0; i < A.ld; ++i) {
                                    if (n32 == 1) {
                                        n32 = 5;
                                    }
                                    else {
                                        n32 += 5;
                                    }
                                }
                                final int n33 = n32 * A.eD;
                                final int n34 = n32 * A.zd * A.eD;
                                A(A.aD, n32 * n31, true, false, A.ca);
                                A(24, -n33, true, false, A.ca);
                                if (A.zd > 0) {
                                    if (A.yd > 0) {
                                        I(((short)A.yd & 0xFFFF) | 0x20000, n34);
                                    }
                                    else {
                                        K(-n34);
                                    }
                                }
                                A.fD = true;
                            }
                            if (A.bD == 1) {
                                cd = yd;
                                A.fD = false;
                            }
                            else if (A.bD == 2) {
                                cd = n3;
                                A.fD = false;
                            }
                            else if (A.ld >= A.dD || A.bD == 0) {
                                cd = n2;
                                A.fD = false;
                            }
                            else {
                                cd = A.cD;
                            }
                            A.bD = -1;
                            A.aD = -1;
                            A.yd = -1;
                            A.zd = 0;
                            break;
                        }
                        case 54: {
                            A.aD = n2;
                            A.yd = yd;
                            A.zd = n3;
                            final int b12 = B(A.aD, true);
                            int ed = 1;
                            int n35 = 1;
                            if (A.aD == 2 || A.aD == 3) {
                                n35 = 2;
                            }
                            int n36 = 0;
                            if (A.aD == 2) {
                                n36 = 50 + A.ca[18] * 10;
                            }
                            if (b12 - n36 >= 80 * n35) {
                                ed = 4;
                            }
                            else if (b12 - n36 >= 65 * n35) {
                                ed = 3;
                            }
                            else if (b12 - n36 >= 50 * n35) {
                                ed = 2;
                            }
                            if (A.ca[19] >= (A.eD = ed)) {
                                int h = 0;
                                if (A.zd > 0) {
                                    if (A.yd > 0) {
                                        h = H(2, A.yd);
                                    }
                                    else {
                                        h = A.ca[46];
                                    }
                                    if (h < A.zd) {
                                        if (A.fD) {
                                            A.bD = 0;
                                            break;
                                        }
                                        A.bD = 2;
                                        break;
                                    }
                                }
                                String j = "";
                                if (A.zd > 0) {
                                    j = HG.I(A.la[A.yd][0]);
                                }
                                int n37 = 1;
                                A.dD = 0;
                                for (int k = 0; k < 3; ++k) {
                                    final int l = n37 * ed;
                                    final int m = n37 * A.zd * ed;
                                    if (A.ca[19] < l || h < m) {
                                        break;
                                    }
                                    String s2 = HG.I(A.aD + 29) + " +" + n37 * n35 + "\n(LP: " + l;
                                    if (A.zd > 0) {
                                        s2 = s2 + " " + j + ": " + m;
                                    }
                                    A(s2 + " )");
                                    ++A.dD;
                                    if (n37 == 1) {
                                        n37 = 5;
                                    }
                                    else {
                                        n37 += 5;
                                    }
                                }
                                AA(83);
                                A(A.od, 471, gd);
                                if (A.fD) {
                                    A(A.od, 472, gd);
                                }
                                b2 = true;
                                break;
                            }
                            if (A.fD) {
                                A.bD = 0;
                                break;
                            }
                            A.bD = 1;
                            break;
                        }
                        case 76: {
                            A.q = true;
                            HG.lA.removeAllElements();
                            HG.iA = false;
                            HG.fA = 0;
                            HG.kA = -1;
                            break;
                        }
                    }
                }
                if (b3) {
                    n = 0;
                }
                if (!b2 && !b) {
                    continue;
                }
            }
            if (b) {
                gd[0] = 0;
                A.pd = -1;
                A.sd = true;
                A.q = false;
            }
            else {
                gd[3] = cd;
                gd[4] = n;
                gd[5] = n2;
                gd[6] = yd;
            }
        }
    }
    
    static int S(final int[] array) {
        if ((array[3] & 0x10) != 0x0) {
            return (short)(A.ca[14] & 0xFFFF);
        }
        if ((array[3] & 0x20) != 0x0) {
            return A.fa[array[11]][7];
        }
        return 0;
    }
    
    static int T(final int[] array) {
        if ((array[3] & 0x10) != 0x0) {
            return (short)(A.ca[15] & 0xFFFF);
        }
        if ((array[3] & 0x20) != 0x0) {
            return A.fa[array[11]][8];
        }
        return 0;
    }
    
    static int U(final int[] array) {
        if ((array[3] & 0x10) != 0x0) {
            return (short)(A.ca[26] & 0xFFFF);
        }
        if ((array[3] & 0x20) != 0x0) {
            return 0;
        }
        return 0;
    }
    
    static int E(final int n, final int[] array) {
        if ((array[3] & 0x10) != 0x0) {
            switch (n) {
                case 0: {
                    return (short)(A.ca[20] & 0xFFFF) + A.ca[51];
                }
                case 1: {
                    return (short)(A.ca[21] & 0xFFFF) + A.ca[51];
                }
                case 2: {
                    return (short)(A.ca[22] & 0xFFFF) + A.ca[51];
                }
                case 3: {
                    return (short)(A.ca[23] & 0xFFFF) + A.ca[51];
                }
                case 4: {
                    return (short)(A.ca[24] & 0xFFFF) + A.ca[51];
                }
                case 5: {
                    return 10 + A.ca[51];
                }
            }
        }
        if ((array[3] & 0x20) != 0x0) {
            final int n2 = array[11];
            switch (n) {
                case 0: {
                    return A.fa[n2][17];
                }
                case 1: {
                    return A.fa[n2][18];
                }
                case 2: {
                    return A.fa[n2][19];
                }
                case 3: {
                    return A.fa[n2][20];
                }
                case 4: {
                    return 0;
                }
                case 5: {
                    return 10;
                }
            }
        }
        return 0;
    }
    
    public static int F(final int n, final int[] array) {
        if ((array[3] & 0x10) != 0x0) {
            switch (n) {
                case 0:
                case 1:
                case 5: {
                    return A.ca[27];
                }
                case 2:
                case 3: {
                    return A.ca[28];
                }
                case 4: {
                    return A.ca[29];
                }
            }
        }
        if ((array[3] & 0x20) != 0x0) {
            final int n2 = array[11];
            int n3 = 0;
            switch (n) {
                case 0:
                case 1:
                case 5: {
                    if (array[16] != -1) {
                        n3 = A.ja[A.ia[array[16]][4]][11];
                    }
                    return A.fa[n2][14] + n3;
                }
                case 2:
                case 3: {
                    if (array[16] != -1) {
                        n3 = A.ja[A.ia[array[16]][4]][12];
                    }
                    return A.fa[n2][15] + n3;
                }
                case 4: {
                    if (array[16] != -1) {
                        n3 = A.ja[A.ia[array[16]][4]][13];
                    }
                    return A.fa[n2][16] + n3;
                }
            }
        }
        return 0;
    }
    
    public static boolean A(final int n, final int[] array, final int[] array2) {
        boolean b = false;
        boolean b2 = false;
        short n2 = 0;
        if ((array[3] & 0x10) != 0x0) {
            final short n4;
            int n3 = n4 = (short)(array[12] & 0xFFFF);
            if (!A.pA) {
                n3 -= n;
                final int n5 = 12;
                array[n5] &= 0xFFFF0000;
                final int n6 = 12;
                array[n6] |= ((short)n3 & 0xFFFF);
            }
            if (n4 > 0 && n3 <= 0) {
                b = true;
            }
            b2 = true;
            n2 = 0;
        }
        if ((array[3] & 0x20) != 0x0) {
            final short n8;
            final int n7 = (n8 = (short)(array[12] & 0xFFFF)) - n;
            final int n9 = 12;
            array[n9] &= 0xFFFF0000;
            final int n10 = 12;
            array[n10] |= ((short)n7 & 0xFFFF);
            if (n8 > 0 && n7 <= 0) {
                b = true;
            }
            final int n11 = 13;
            array[n11] &= 0xFFFFFFF7;
            b2 = true;
            n2 = 1;
            H(A.gB);
        }
        if (b2 && n != 0) {
            A((short)(array[2] & 0xFFFF), (short)n, n2);
            J(array[4], array[5], 4096);
        }
        if (array2 != null && b && (array2[3] & 0x10) != 0x0 && (array[3] & 0x20) != 0x0) {
            A(25, A(array)[12], true, false, A.ca);
        }
        return b;
    }
    
    public static int F(int n, int n2, final int n3) {
        n = n + n2 + (n3 << 1);
        n2 = 0 * n;
        n *= 100;
        n += n2;
        n /= 200;
        return n;
    }
    
    public static int G(int n, int n2, final int n3) {
        n = n + n2 + (n3 << 1);
        n2 = -20 * n;
        n *= 100;
        n += n2;
        n /= 200;
        return n;
    }
    
    public static int A(final int n, final int n2, final int n3, final int n4, int n5, final int n6, int n7, final boolean b) {
        if (!R(n3, n2)) {
            return 0;
        }
        final int g = G(n, n3, n7);
        n7 = F(n, n3, n7);
        n7 = HG.A(g, n7);
        if (b) {
            n7 += A.ca[48];
            n7 += A.ca[49];
            n7 += A.ca[50];
        }
        n5 = n7 - n5;
        if (b && C(n6 + n4, n, n2, n3)) {
            n5 <<= 1;
            if (n5 < 10) {
                n5 = 10;
            }
            if (HG.MA(3)) {
                Display.getDisplay((MIDlet)A.a).vibrate(500);
            }
        }
        if (n5 < 1) {
            n5 = 1;
        }
        return n5;
    }
    
    public static int H(int n, final int n2, final int n3) {
        n = (n3 << 1) + n3 + n + n2;
        if (n < 1) {
            n = 1;
        }
        n = 5000 / n;
        return n;
    }
    
    public static int B(int n, final int n2, final int n3, final int n4) {
        n = n * 30 + n2 * 2 + n3 * 2 + n4 * 3;
        n /= 30;
        return n;
    }
    
    public static boolean C(final int n, final int n2, final int n3, final int n4) {
        return B(n, n2, n3, n4) > HG.A(100);
    }
    
    public static int Q(final int n, final int n2) {
        return 200 + (n << 1) + n2 >> 2;
    }
    
    public static boolean R(final int n, final int n2) {
        return Q(n, n2) > HG.A(100);
    }
    
    public static int A(final int[] array, final int[] array2, final int[] array3) {
        int[] a = null;
        int v;
        int w;
        int x;
        int y;
        int z;
        if (array3 == null) {
            if ((array[3] & 0x20) != 0x0) {
                v = A.fa[array[11]][29];
            }
            else {
                v = 1024;
            }
            w = 2;
            x = 0;
            y = 100;
            z = 5;
        }
        else {
            a = A(array3);
            v = V(array3);
            w = W(array3);
            x = X(array3);
            y = Y(array3);
            z = Z(array3);
        }
        int h = H(T(array), -1, y);
        if ((array[3] & 0x10) != 0x0) {
            h -= A.ca[47];
            if (h < 10) {
                h = 10;
            }
        }
        if (B.A(array, array2, v)) {
            final int a2 = A(S(array), T(array), E(z, array), U(array), F(z, array2), x, w, (array[3] & 0x10) != 0x0);
            if (z == 2 || z == 3) {
                int n = 0;
                if (A(array3, a, 8) != 0) {
                    n = 2;
                }
                if (A(array3, a, 7) != 0) {
                    n ^= 0x1;
                }
                switch (z) {
                    case 2: {
                        A(array, array2, V(array3), 0, a2, n);
                        break;
                    }
                    case 3: {
                        A(array, array2, V(array3), 1, a2, n);
                        break;
                    }
                }
            }
            else {
                if ((array[3] & 0x10) != 0x0) {
                    if (a2 > 0) {
                        HG.M(18);
                    }
                    else {
                        HG.M(19);
                    }
                }
                else if ((array2[3] & 0x10) != 0x0 && a2 > 0) {
                    HG.M(22);
                }
                if ((array2[3] & 0x20) != 0x0 && ((short)(array2[20] & 0xFFFF) == -1 || (short)(array2[26] & 0xFFFF) < 3)) {
                    final short n2 = (short)(array[2] & 0xFFFF);
                    final int n3 = 20;
                    array2[n3] &= 0xFFFF0000;
                    final int n4 = 20;
                    array2[n4] |= (n2 & 0xFFFF);
                    array2[22] = F(array);
                    array2[26] = 10;
                    if ((A.fa[array2[11]][13] & 0x80) != 0x0) {
                        D((short)((array2[2] & 0xFFFF0000) >> 16), true);
                    }
                }
                A(a2, array2, array);
                if (a2 > 0) {
                    if (A(array3, a, 8) != 0) {
                        C(array2[4], B.A(array2) + 1, 4096, 0, 0, 512);
                    }
                    if (A(array3, a, 7) != 0) {
                        E(array2[4], B.A(array2) + 1, 4096, 0, 0, 2048);
                    }
                }
            }
        }
        return h;
    }
    
    public static int V(final int[] array) {
        if (array == null) {
            return 1024;
        }
        return A.ha[array[4]][13];
    }
    
    public static int W(final int[] array) {
        if (array == null) {
            return 2;
        }
        return A.ha[array[4]][11];
    }
    
    public static int A(final int[] array, final int[] array2, final int n) {
        int n2 = 0;
        if (array == null || array2 == null) {
            return 0;
        }
        final int[] c = C(array, array2);
        for (int i = 0; i < c.length; ++i) {
            final short n3 = (short)(c[i] & 0xFFFF);
            final short n4 = (short)((c[i] & 0xFFFF0000) >> 16);
            if (n3 == n) {
                n2 += n4;
            }
        }
        return n2;
    }
    
    public static int X(final int[] array) {
        if (array == null) {
            return 0;
        }
        return A.ha[array[4]][14];
    }
    
    public static int Y(final int[] array) {
        if (array == null) {
            return 100;
        }
        return A.ha[array[4]][12];
    }
    
    public static int Z(final int[] array) {
        if (array == null) {
            return 5;
        }
        return A.ha[array[4]][15];
    }
    
    public static int[] C(final int[] array, final int[] array2) {
        for (int i = 0; i < A.kC.length; ++i) {
            A.kC[i] = -1;
        }
        for (int j = 0; j < 2; ++j) {
            if (array[6 + j] != -1) {
                A.kC[j] = (((short)A.ra[(short)((array[6 + j] & 0xFFFF0000) >> 16)][3] & 0xFFFF) | ((short)(array[6 + j] & 0xFFFF) << 16 & 0xFFFF0000));
            }
        }
        for (int k = 0; k < 5; ++k) {
            A.kC[2 + k] = array2[5 + k];
        }
        return A.kC;
    }
    
    public static void UA() {
        A.iA = new int[1 + A.ea.length][15];
        for (int i = 0; i < A.iA.length; ++i) {
            for (int j = 0; j < A.iA[i].length; ++j) {
                A.iA[i][j] = -1;
            }
            A.iA[i][0] = -1;
            A.iA[i][4] = -1;
            A.iA[i][5] = -1;
            A.iA[i][3] = 65536;
        }
    }
    
    public static void VA() {
        A.iA = null;
    }
    
    public static void A(final int[] array, final int[] array2, final int n, final int n2, int n3, final int n4) {
        final short n5 = (short)(array[2] & 0xFFFF);
        A.iA[n5][0] = array[0];
        A.iA[n5][4] = array[4];
        A.iA[n5][5] = array[5];
        A.iA[n5][6] = array[4];
        A.iA[n5][7] = array[5];
        A.iA[n5][9] = array[4];
        A.iA[n5][10] = array[5];
        A.iA[n5][11] = (((short)(array[2] & 0xFFFF) & 0xFFFF) | ((short)(array2[2] & 0xFFFF) << 16 & 0xFFFF0000));
        A.iA[n5][12] = (0x0 | ((short)n3 << 16 & 0xFFFF0000));
        n3 = array[4] - array2[4];
        final int n6 = array[5] - array2[5];
        int n7;
        if (n3 > 32767 || n3 < -32768 || n6 > 32767 || n6 < -32768) {
            n7 = 10;
        }
        else {
            n7 = 10 * F(n3 * n3 + n6 * n6) / (n + 1) + 1;
        }
        A.iA[n5][13] = (((short)n7 & 0xFFFF) | ((short)n7 << 16 & 0xFFFF0000));
        A.iA[n5][8] = (((short)A.lC[n2 * 7 + 5] & 0xFFFF) | ((short)A.lC[n2 * 7 + 5] << 16 & 0xFFFF0000));
        A.iA[n5][14] = (((short)n2 & 0xFFFF) | ((short)n4 << 16 & 0xFFFF0000));
        final int[] array3 = A.iA[n5];
        final int n8 = 3;
        array3[n8] &= 0xFFFEFFFF;
        B.C(A.iA[n5]);
        if ((array[3] & 0x10) != 0x0) {
            final int z = Z(BA());
            if (z == 2) {
                int n9 = (short)(A.ca[53] & 0xFFFF);
                --n9;
                final int[] ca = A.ca;
                final int n10 = 53;
                ca[n10] &= 0xFFFF0000;
                final int[] ca2 = A.ca;
                final int n11 = 53;
                ca2[n11] |= ((short)n9 & 0xFFFF);
            }
            else if (z == 3) {
                int n12 = (short)((A.ca[53] & 0xFFFF0000) >> 16);
                --n12;
                final int[] ca3 = A.ca;
                final int n13 = 53;
                ca3[n13] &= 0xFFFF;
                final int[] ca4 = A.ca;
                final int n14 = 53;
                ca4[n14] |= ((short)n12 << 16 & 0xFFFF0000);
            }
        }
    }
    
    private static void P(final int[] array, int n) {
        final int[] array2 = B.a[(short)(array[11] & 0xFFFF)];
        int[] array3 = null;
        if (n == -1) {
            HG.M(21);
        }
        else {
            if ((array2[3] & 0x10) != 0x0) {
                if ((short)((array[12] & 0xFFFF0000) >> 16) > 0) {
                    HG.M(20);
                }
                else {
                    HG.M(21);
                }
            }
            else if ((B.a[n][3] & 0x10) != 0x0 && (short)((array[12] & 0xFFFF0000) >> 16) > 0) {
                HG.M(22);
            }
            if ((B.a[n][3] & 0x20) != 0x0 && ((short)(B.a[n][20] & 0xFFFF) == -1 || (short)(B.a[n][26] & 0xFFFF) < 3)) {
                final short n2 = (short)(array2[2] & 0xFFFF);
                final int[] array4 = B.a[n];
                final int n3 = 20;
                array4[n3] &= 0xFFFF0000;
                final int[] array5 = B.a[n];
                final int n4 = 20;
                array5[n4] |= (n2 & 0xFFFF);
                B.a[n][22] = F(array2);
                B.a[n][26] = 10;
                if ((A.fa[B.a[n][11]][13] & 0x80) != 0x0) {
                    D((short)((B.a[n][2] & 0xFFFF0000) >> 16), true);
                }
            }
        }
        if (n != -1 && ((B.a[n][3] & 0x10) != 0x0 || (B.a[n][3] & 0x20) != 0x0)) {
            array3 = B.a[n];
            B.D(array3, A.mC);
            final int n5 = array[4] - array[6];
            final int n6 = array[5] - array[7];
            array[6] = A.mC[0];
            array[7] = A.mC[1];
            array[4] = array[6] + n5;
            array[5] = array[7] + n6;
        }
        boolean a = false;
        if (array3 != null) {
            a = A((short)((array[12] & 0xFFFF0000) >> 16), array3, array2);
        }
        if ((array2[3] & 0x10) != 0x0) {
            H(A.gB);
        }
        final int n7 = (short)(array[8] & 0xFFFF) - (short)((array[8] & 0xFFFF0000) >> 16);
        if (a || (short)((array[12] & 0xFFFF0000) >> 16) == 0) {
            array[8] = (((short)n7 & 0xFFFF) | 0x0);
            n = -1;
        }
        Q(array, n);
        final int n8 = 3;
        array[n8] |= 0x10000;
        B.D(array);
    }
    
    public static void WA() {
        for (int i = 0; i < A.iA.length; ++i) {
            if ((A.iA[i][3] & 0x10000) == 0x0) {
                final short n = (short)(A.iA[i][14] & 0xFFFF);
                final int[] array = B.a[(short)((A.iA[i][11] & 0xFFFF0000) >> 16)];
                final short n2 = (short)((A.iA[i][13] & 0xFFFF0000) >> 16);
                int n3 = (short)(A.iA[i][13] & 0xFFFF);
                if (--n3 == 0) {
                    P(A.iA[i], (short)((A.iA[i][11] & 0xFFFF0000) >> 16));
                }
                else {
                    final int[] array2 = A.iA[i];
                    final int n4 = 13;
                    array2[n4] &= 0xFFFF0000;
                    final int[] array3 = A.iA[i];
                    final int n5 = 13;
                    array3[n5] |= ((short)n3 & 0xFFFF);
                    final int n6 = A.iA[i][9] - array[4];
                    final int n7 = A.iA[i][10] - array[5];
                    final int f = F(n6 * n6 + n7 * n7);
                    if (f == 0) {
                        final int[] array4 = A.iA[i];
                        final int n8 = 3;
                        array4[n8] |= 0x10000;
                        B.D(A.iA[i]);
                    }
                    else {
                        final int n9 = A.iA[i][6];
                        final int n10 = A.iA[i][7];
                        A.iA[i][6] = n6 * n3 / n2 + array[4];
                        A.iA[i][7] = n7 * n3 / n2 + array[5];
                        final int a = B.A(n9, n10, A.iA[i][6], A.iA[i][7], 4144, A.nC, true);
                        if (a != -2 && a != (short)(A.iA[i][11] & 0xFFFF)) {
                            if (a == -1) {
                                P(A.iA[i], -1);
                            }
                            else {
                                P(A.iA[i], a);
                            }
                        }
                        else {
                            A.iA[i][4] = A.iA[i][6] + n6 * A.lC[n * 7 + 4] / f;
                            A.iA[i][5] = A.iA[i][7] + n7 * A.lC[n * 7 + 4] / f;
                            final short n11 = (short)((A.iA[i][8] & 0xFFFF0000) >> 16);
                            final int n12 = n11 + A.lC[n * 7 + 6] * (n3 - (n2 >> 1));
                            if (((short)((A.iA[i][14] & 0xFFFF0000) >> 16) & 0x1) != 0x0) {
                                B(n9, n10, n11, A.nC[0] - n9, A.nC[1] - n10, n12 - n11, 2);
                            }
                            if (((short)((A.iA[i][14] & 0xFFFF0000) >> 16) & 0x2) != 0x0) {
                                A(n9, n10, n11, A.nC[0] - n9, A.nC[1] - n10, n12 - n11, 2);
                            }
                            A.iA[i][8] = ((n11 & 0xFFFF) | ((short)n12 << 16 & 0xFFFF0000));
                            B.D(A.iA[i]);
                            A.iA[i][0] = (((short)(A.iA[i][4] >> 12) & 0xFFFF) | ((short)(A.iA[i][5] >> 12) << 16 & 0xFFFF0000));
                            B.C(A.iA[i]);
                        }
                    }
                }
            }
        }
    }
    
    public static void C(final int[] array, final Graphics graphics) {
        switch ((short)(array[14] & 0xFFFF)) {
            case 0: {
                B(array[4], array[5], array[6], array[7], array[8], graphics);
                break;
            }
            case 1: {
                A(array[4], array[5], array[6], array[7], array[8], graphics);
                break;
            }
        }
    }
    
    public static void A(int n, int n2, int n3, int n4, int n5, final Graphics graphics) {
        n = (n * B.d >> 12) - A.tB;
        n2 = (n2 * B.d >> 12) - A.uB;
        n3 = (n3 * B.d >> 12) - A.tB;
        final int n6 = (n4 * B.d >> 12) - A.uB;
        graphics.setColor(A.lC[8]);
        graphics.drawLine(n, n2, n3, n6);
        n4 = (short)(n5 & 0xFFFF);
        n5 = (short)((n5 & 0xFFFF0000) >> 16);
        n2 -= n4 * B.d >> 12;
        n4 = n6 - (n5 * B.d >> 12);
        graphics.setColor(A.lC[7]);
        graphics.drawLine(n, n2, n3, n4);
        if (E(n - n3) > E(E(n2 - n4))) {
            graphics.drawLine(n, n2 + 1, n3, n4 + 1);
        }
        else {
            graphics.drawLine(n + 1, n2, n3 + 1, n4);
        }
    }
    
    public static void B(int n, int n2, int n3, int n4, int n5, final Graphics graphics) {
        n = (n * B.d >> 12) - A.tB;
        final int n6 = (n2 * B.d >> 12) - A.uB;
        n2 = (n3 * B.d >> 12) - A.tB;
        n3 = (n4 * B.d >> 12) - A.uB;
        graphics.setColor(A.lC[1]);
        graphics.drawLine(n, n6, n2, n3);
        final short n7 = (short)(n5 & 0xFFFF);
        n4 = (short)((n5 & 0xFFFF0000) >> 16);
        final int n8 = n6 - (n7 * B.d >> 12);
        final int n9 = n3 - (n4 * B.d >> 12);
        graphics.setColor(A.lC[0]);
        graphics.drawLine(n, n8, n2, n9);
        final int n10 = (n * 26 + n2 * 6) / 32;
        final int n11 = (n8 * 26 + n9 * 6) / 32;
        final int n12 = (n * 28 + n2 * 4) / 32;
        final int n13 = (n8 * 28 + n9 * 4) / 32;
        final int n14 = (n * 30 + n2 * 2) / 32;
        n5 = (n8 * 30 + n9 * 2) / 32;
        n4 = (n * 2 + n2 * 30) / 32;
        n3 = (n8 * 2 + n9 * 30) / 32;
        graphics.setColor(A.lC[2]);
        graphics.drawLine(n4, n3, n2, n9);
        graphics.setColor(A.lC[3]);
        graphics.drawLine(n10, n11, n12, n13);
        graphics.drawLine(n14, n5, n, n8);
    }
    
    public static void I(final int tc, final int uc, final int vc) {
        A.tC = tc;
        A.uC = uc;
        A.vC = vc;
    }
    
    public static void A(final String s, final String s2, final int n, final int n2, final int ad, final int bd, final int ed) {
        A(s, s2, n, n2);
        A.pC = true;
        A.ad = ad;
        A.bd = bd;
        A.cd = A.ad;
        A.sC = "";
        A.ed = ed;
        for (int i = 0; i < A.qC.length; ++i) {
            if (A.qC[i].indexOf("@1") >= 0) {
                A.fd = i;
            }
            else if (A.qC[i].indexOf("@x") >= 0) {
                A.dd = i;
            }
        }
    }
    
    public static void A(final String s, final String rc, final int wc, final int xc) {
        A.pC = false;
        A.dd = -1;
        A.fd = -1;
        A.qC = HG.A(s, A.j[2], A.f - 5 - 5, 0);
        A.rC = rc;
        int n = A.j[2].getHeight() * A.qC.length + 4;
        if (n < A.g >> 2) {
            n = A.g >> 2;
        }
        else if (n > A.g * 2 / 3) {
            n = A.g * 2 / 3;
        }
        final int n2 = A.j[2].getHeight() + 3;
        A.yC = n + n2 + A.cc[1486] + 3 + 2;
        A.zC = A.g - A.yC >> 1;
        A(8, 5, A.zC + 2, A.f - 5 - 5, n2 + 5, 532);
        A(7, 5, A.zC + n2 + 2, A.f - 5 - 5, n + 5, 33);
        A(8, -2, 0);
        A.wC = wc;
        A.xC = xc;
        A.oC = true;
    }
    
    public static void D(final int n, final int n2, final int n3, final int n4) {
        A(HG.I(n), HG.I(n2), n3, n4);
    }
    
    public static void M(final Graphics graphics) {
        final int n = A.cc[1486] + 5;
        final int n2 = A.j[2].getHeight() + 3;
        graphics.setColor(A.i[6]);
        graphics.fillRect(0, A.zC, A.f, A.yC);
        graphics.setColor(A.i[3]);
        graphics.fillRect(3, A.zC + n2 + 2, A.f - 6, A.yC - (n + n2) - 2);
        graphics.fillRect(3, A.zC + A.yC + 2 - n, A.f - 6, n - 5);
        graphics.setColor(A.i[8]);
        graphics.fillRect(3, A.zC + 3, A.f - 6, n2 - 3);
        graphics.setColor(A.i[5]);
        graphics.drawRect(1, A.zC + 1, A.f - 3, A.yC - 3);
        graphics.drawRect(1, A.zC + n2, A.f - 3, A.yC - (n + n2));
        B(1, A.zC + 1, 152, 0, graphics);
        B(A.f - 1, A.zC + 1, 152, 0, 0, 2, graphics);
        if (A.pC) {
            B((A.f >> 1) - A.cc[1639] / A.cc[1644], A.zC + A.yC - n + 4, 149, 0, graphics);
            B(A.f >> 1, A.zC + A.yC - n + 4, 149, 1, graphics);
        }
        final int n3 = A.cc[1485] / A.cc[1490];
        if (A.wC != 106) {
            B(4 + (n3 >> 1), A.zC + A.yC - 3, 135, 0, graphics);
        }
        if (A.xC != 106) {
            B(A.f - 2 - (n3 >> 1), A.zC + A.yC - 3, 135, 1, graphics);
        }
    }
    
    public static void N(final Graphics graphics) {
        graphics.setClip(0, 0, A.f, A.g);
        M(graphics);
        A(A.rC, 8, 2, graphics);
        if (A.pC) {
            String s = "";
            String s2 = "";
            if (A.fd >= 0) {
                s = A.qC[A.fd];
                final int index = s.indexOf("@1");
                int lastIndex = s.lastIndexOf(64);
                if (lastIndex <= index) {
                    lastIndex = index + 1;
                }
                A.qC[A.fd] = s.substring(0, index) + A.ed * A.cd + s.substring(lastIndex + 1);
            }
            if (A.dd >= 0) {
                s2 = A.qC[A.dd];
                final int index2 = s2.indexOf("@x");
                int lastIndex2 = s2.lastIndexOf(64);
                if (lastIndex2 <= index2) {
                    lastIndex2 = index2 + 1;
                }
                A.qC[A.dd] = s2.substring(0, index2) + A.cd + s2.substring(lastIndex2 + 1);
            }
            A(A.qC, 7, 2, graphics);
            if (A.dd >= 0) {
                A.qC[A.dd] = s2;
            }
            if (A.fd >= 0) {
                A.qC[A.fd] = s;
            }
        }
        else {
            A(A.qC, 7, 2, graphics);
        }
    }
    
    public static void XA() {
        if (C(80) && A.wC != 106) {
            A.oC = false;
            A.pC = false;
            HG.DA(A.wC);
        }
        if (C(85) && A.xC != 106) {
            A.oC = false;
            A.pC = false;
            HG.DA(A.xC);
        }
        if (A.pC) {
            boolean b = false;
            if (C(116)) {
                ++A.cd;
                if (A.cd > A.bd) {
                    A.cd = A.ad;
                }
                A.sC = "";
            }
            if (C(117)) {
                --A.cd;
                if (A.cd < A.ad) {
                    A.cd = A.bd;
                }
                A.sC = "";
            }
            if (C(118)) {
                A.sC += "0";
                b = true;
            }
            if (C(101)) {
                A.sC += "1";
                b = true;
            }
            if (C(102)) {
                A.sC += "2";
                b = true;
            }
            if (C(103)) {
                A.sC += "3";
                b = true;
            }
            if (C(104)) {
                A.sC += "4";
                b = true;
            }
            if (C(115)) {
                A.sC += "5";
                b = true;
            }
            if (C(105)) {
                A.sC += "6";
                b = true;
            }
            if (C(106)) {
                A.sC += "7";
                b = true;
            }
            if (C(107)) {
                A.sC += "8";
                b = true;
            }
            if (C(108)) {
                A.sC += "9";
                b = true;
            }
            if (C(95)) {
                A.sC = "";
                A.cd = 0;
            }
            if (b) {
                int int1 = 0;
                try {
                    int1 = Integer.parseInt(A.sC);
                }
                catch (Exception ex) {}
                A.cd = int1;
                if (A.cd < A.ad) {
                    A.cd = A.ad;
                    A.sC = "";
                }
                else if (A.cd > A.bd) {
                    A.cd = A.bd;
                    A.sC = "";
                }
            }
        }
        D();
    }
    
    public static void YA() {
    }
    
    public static String Z(int i) {
        final int n = ((i & 0xFF0000) >> 16) - 1;
        if (n < 0 || n >= 3) {
            return HG.I(i);
        }
        final byte[] bytes = A.hD.get(new Integer(i));
        String s = null;
        if (bytes != null) {
            switch (A.iD) {
                case 0: {
                    s = new String(bytes, 0, bytes.length).replace('\r', '\n');
                    break;
                }
                case 1: {
                    final StringBuffer sb = new StringBuffer(bytes.length / 2);
                    for (i = 0; i < bytes.length - 1; i += 2) {
                        sb.append((char)((bytes[i + 1] & 0xFF) << 8 | (bytes[i] & 0xFF)));
                    }
                    s = sb.toString().replace('\r', '\n');
                    break;
                }
                case 2: {
                    final byte[] buf = new byte[bytes.length + 2];
                    buf[0] = (byte)(bytes.length >>> 8);
                    buf[1] = (byte)bytes.length;
                    System.arraycopy(bytes, 0, buf, 2, bytes.length);
                    try {
                        s = new DataInputStream(new ByteArrayInputStream(buf)).readUTF().replace('\r', '\n');
                    }
                    catch (Exception ex) {}
                    break;
                }
            }
            return s;
        }
        return "lol :D";
    }
    
    public static void ZA() {
        System.gc();
        if (A.cC == null) {
            return;
        }
        A.hD.clear();
        final Vector vector = new Vector<Integer>();
        for (int i = 0; i < A.cC.length; ++i) {
            final byte[] array = A.cC[i];
            int j = 0;
            while (j < array.length) {
                switch (array[j++]) {
                    case 1:
                    case 4:
                    case 5:
                    case 33:
                    case 46:
                    case 72:
                    case 73: {
                        ++j;
                        continue;
                    }
                    case 17:
                    case 18:
                    case 19:
                    case 27: {
                        ++j;
                        ++j;
                        continue;
                    }
                    case 48: {
                        ++j;
                        continue;
                    }
                    case 20:
                    case 21:
                    case 22: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 2: {
                        vector.addElement(new Integer((array[j++] << 16 & 0xFF0000) | (short)((array[j++] << 8 & 0xFF00) | (array[j++] & 0xFF))));
                        vector.addElement(new Integer((array[j++] << 16 & 0xFF0000) | (short)((array[j++] << 8 & 0xFF00) | (array[j++] & 0xFF))));
                        ++j;
                        continue;
                    }
                    case 34:
                    case 35: {
                        ++j;
                        ++j;
                        continue;
                    }
                    case 54: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 51: {
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 40: {
                        ++j;
                        ++j;
                        continue;
                    }
                    case 39: {
                        ++j;
                        ++j;
                        continue;
                    }
                    case 41:
                    case 45: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 49: {
                        vector.addElement(new Integer((array[j++] << 16 & 0xFF0000) | (short)((array[j++] << 8 & 0xFF00) | (array[j++] & 0xFF))));
                        continue;
                    }
                    case 50: {
                        ++j;
                        ++j;
                        vector.addElement(new Integer((array[j++] << 16 & 0xFF0000) | (short)((array[j++] << 8 & 0xFF00) | (array[j++] & 0xFF))));
                        continue;
                    }
                    case 53: {
                        vector.addElement(new Integer((array[j++] << 16 & 0xFF0000) | (short)((array[j++] << 8 & 0xFF00) | (array[j++] & 0xFF))));
                        continue;
                    }
                    case 44: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 42:
                    case 43:
                    case 74: {
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 36:
                    case 37:
                    case 38: {
                        ++j;
                        ++j;
                        continue;
                    }
                    case 64:
                    case 65: {
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 47:
                    case 66:
                    case 67: {
                        ++j;
                        ++j;
                        continue;
                    }
                    case 68:
                    case 69: {
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 81: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 80: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 75: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                    case 55: {
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        ++j;
                        continue;
                    }
                }
            }
        }
        int n = 1;
        while (true) {
            if (n == 0) {
                ++n;
            }
            else {
                if (n >= vector.size()) {
                    break;
                }
                final Integer obj = vector.elementAt(n);
                final Integer obj2 = vector.elementAt(n - 1);
                if ((obj & 0xFFFF) < (obj2 & 0xFFFF)) {
                    vector.setElementAt(obj, n - 1);
                    vector.setElementAt(obj2, n);
                    --n;
                }
                else {
                    ++n;
                }
            }
        }
        for (int k = 0; k < 3; ++k) {
            try {
                final InputStream resourceAsStream = HG.fb.getClass().getResourceAsStream("/" + HG.t + "." + HG.l[1 + k] + "." + "lng");
                if (resourceAsStream == null) {
                    System.err.println("couldn't open lang file");
                }
                else {
                    final int available = resourceAsStream.available();
                    final byte[] array2 = new byte[5];
                    resourceAsStream.read(array2, 0, 5);
                    A.iD = array2[2];
                    final int n2 = (array2[4] & 0xFF) << 8 | (array2[3] & 0xFF);
                    final int[] array3 = new int[n2 + 1];
                    for (int l = 0; l < n2 + 1; ++l) {
                        resourceAsStream.read(array2, 0, 2);
                        array3[l] = ((array2[1] & 0xFF) << 8 | (array2[0] & 0xFF)) + 2;
                    }
                    int n3 = 5 + 2 * (n2 + 1);
                    for (int n4 = 0; n4 < vector.size(); ++n4) {
                        final int intValue = vector.elementAt(n4);
                        final int n5 = intValue & 0xFFFF;
                        if (((intValue & 0xFF0000) >> 16) - 1 == k) {
                            if (n5 >= 0) {
                                if (n5 < n2) {
                                    final int n6 = array3[n5];
                                    final int n7 = array3[n5 + 1];
                                    if (n6 >= n3) {
                                        if (n7 >= n6 && n6 >= 0) {
                                            if (n7 <= available) {
                                                final byte[] array4 = new byte[n7 - n6];
                                                resourceAsStream.skip(n6 - n3);
                                                resourceAsStream.read(array4, 0, array4.length);
                                                n3 = n7;
                                                A.hD.put(vector.elementAt(n4), array4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    resourceAsStream.close();
                    System.gc();
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        System.gc();
        Thread.yield();
        System.gc();
        Thread.yield();
        System.gc();
    }
    
    public static void AB() {
        A.hD.clear();
    }
    
    public static void BB() {
        A.ud = A.cc[1617] / A.cc[1622] >> 1;
        A.vd = A.cc[1618] / A.cc[1623];
        A.wd = A.f - (2 * A.ud + 8 + 8);
        A.xd = A.g - (A.cc[1607] + A.cc[1387] + 2 * A.vd + 5 + 4);
        A.ud += 8;
        A.vd += 5;
        A.pd = -1;
    }
    
    public static void AA(final int n) {
        A(Z(n));
    }
    
    public static void A(final String s) {
        A.jd.addElement(HG.A(s, A.j[2], A.wd - (A.cc[1683] + 16), 0));
    }
    
    public static void A(final int od, final int n, final int[] qd) {
        A(10, -2, 0);
        if (A.pd < 0) {
            if (A.ub == 1 && A.tb >= 0) {
                final int[] a = A(B.a[A.tb]);
                if (a != null) {
                    A.pd = a[0];
                }
            }
            if (A.pd < 0) {
                A.pd = 0;
            }
        }
        final Font font = A.j[2];
        final int height = A.j[2].getHeight();
        A.kd = HG.A(Z(n), font, A.wd, 0);
        A(9, A.ud, A.vd, A.wd, A.xd, 113);
        A(9, 0, -2);
        A(9, 15 + A.cc[1695]);
        A.nd = 0;
        for (int i = 0; i < A.jd.size(); ++i) {
            A.nd += height * ((String[])A.jd.elementAt(i)).length + 10;
        }
        A.ld = 0;
        A.id = true;
        A.qd = qd;
        A.md = 0;
        A.od = od;
        if (A.qd != null) {
            A.qd[0] = 2;
        }
        A.nd += 10 + A.cc[1695];
        A.rd = false;
        if (A.qd != null && A.sd) {
            A.td = System.currentTimeMillis() + 500L;
        }
        else {
            A.td = -1L;
        }
    }
    
    public static void O(final Graphics graphics) {
        A(9, A.ud, A.vd, A.wd, A.xd);
        A(A.kd, 9, 2, graphics);
        final int n = A.vd + A.j[2].getHeight() * A.kd.length + 10 + A.z[29];
        graphics.setClip(A.ud, A.vd, A.wd, A.xd - 1);
        B(A.f >> 1, n, 154, 0, graphics);
        B(A.f >> 1, n, 154, 0, 0, 2, graphics);
    }
    
    public static void P(final Graphics graphics) {
        A(10, A.ud, A.vd, A.wd, A.xd);
        int md = A.md;
        final int height = A.j[2].getHeight();
        final int n = A.cc[1683] + 16;
        final int n2 = (height - A.cc[1684] >> 1) + 5;
        for (int i = 0; i < A.jd.size(); ++i) {
            A(10, A.ud + n, A.vd + md + 5, A.wd - n, A.xd - md + 5, 305);
            final String[] array = A.jd.elementAt(i);
            graphics.setClip(A.ud, A.vd, A.wd, A.xd - 1);
            if (i == A.ld) {
                graphics.setColor(A.i[13]);
                graphics.fillRect(A.ud, A.vd + md, A.wd, height * array.length + 10);
                graphics.setColor(A.i[5]);
            }
            B(A.ud + 8, A.vd + md + n2, 153, 0, graphics);
            md += height * array.length + 10;
            A(array, 10, 2, graphics);
        }
        graphics.setClip(A.ud, A.vd, A.wd, A.xd - 1);
        B(A.f >> 1, A.vd + md + 5, 154, 0, graphics);
        B(A.f >> 1, A.vd + md + 5, 154, 0, 0, 2, graphics);
    }
    
    public static void Q(final Graphics graphics) {
        graphics.setClip(0, 0, A.f, A.g);
        boolean b = false;
        boolean b2 = false;
        if (A.rd) {
            A(graphics, false, false, false, 126);
        }
        else {
            A(graphics, false, false, false, A.od);
        }
        graphics.setClip(A.ud, A.vd, A.wd, A.xd - 1);
        graphics.setColor(A.i[5]);
        final int n = A.cc[1639] / A.cc[1644];
        final short n2 = A.cc[1640];
        final int n3 = A.vd + A.xd + 3;
        if (A.rd) {
            P(graphics);
            if (A.md > A.xd - A.nd) {
                b = true;
            }
            if (A.md < 0) {
                b2 = true;
            }
            graphics.setClip(0, 0, A.f, A.g);
            B(A.ud, n3, 160, 1, graphics);
            B(A.cc[1606] >> 1, A.g, 136, 3, graphics);
            A(graphics, 126, HG.I(174));
        }
        else {
            O(graphics);
            final int n4 = A.kd.length * A.j[2].getHeight() + A.y[109];
            final short n5 = A.z[29];
            if (n5 > A.xd - n4) {
                b = true;
            }
            if (n5 < 0) {
                b2 = true;
            }
            graphics.setClip(0, 0, A.f, A.g);
            if (!A.jd.isEmpty()) {
                B(A.ud + A.wd - n2, n3, 160, 0, graphics);
            }
            B(A.cc[1606] >> 1, A.g, 136, 3, graphics);
            A(graphics, A.od, HG.I(A.pd));
        }
        graphics.setClip(0, 0, A.f, A.g);
        final int n6 = n3 + (n - n2 >> 1);
        if (b2) {
            B((A.f >> 1) - n, n6, 149, 0, graphics);
        }
        if (b) {
            B(A.f >> 1, n6, 149, 1, graphics);
        }
    }
    
    public static void A(final Graphics graphics, int height, final String s) {
        height = A.j[2].getHeight();
        final int n = A.cc[1518] + A.cc[1386] - 1;
        final int n2 = A.f - n - 1;
        final int n3 = height + 5 + 5;
        height = A.g - n3 - (A.cc[1387] + A.cc[1607] - n3 >> 1);
        graphics.setColor(A.i[8]);
        graphics.fillRect(n, height, n2, n3);
        graphics.setColor(A.i[6]);
        graphics.drawRect(n, height + 1, n2 - 1, n3 - 1);
        graphics.setColor(A.i[5]);
        graphics.drawRect(n, height, n2 - 1, n3 - 1);
        B(n, height, 152, 0, graphics);
        B(A.f - 1, height, 152, 0, 0, 2, graphics);
        A(10, n + 4, height + 4, n2 - 8, n3 - 8, 156);
        A(s, 10, 2, graphics);
    }
    
    public static void CB() {
        if (A.qd != null) {
            A.qd[0] = 1;
        }
        A.id = false;
        A.jd.removeAllElements();
        A.qd = null;
        if (A.gD) {
            A.pd = -1;
        }
        A.gD = false;
    }
    
    public static void DB() {
        if (C(80) || C(65)) {
            if (A.rd || A.jd.isEmpty()) {
                if (A.td < 0L || System.currentTimeMillis() >= A.td) {
                    CB();
                }
            }
            else {
                A.rd = true;
            }
        }
        if (C(55)) {
            if (A.rd) {
                final int height = A.j[2].getHeight();
                final boolean b = A.nd > A.xd;
                if (b) {
                    int n = A.vd + A.md;
                    boolean b2 = false;
                    if (A.ld - 1 < 0) {
                        for (int i = 0; i < A.ld; ++i) {
                            n += ((String[])A.jd.elementAt(i)).length * height + 10;
                        }
                        if (n >= A.vd) {
                            --A.ld;
                        }
                        b2 = true;
                    }
                    else {
                        for (int j = 0; j < A.ld; ++j) {
                            n += ((String[])A.jd.elementAt(j)).length * height + 10;
                        }
                        final String[] array = A.jd.elementAt(A.ld);
                        if (n > A.xd / 2) {
                            --A.ld;
                            b2 = true;
                        }
                    }
                    A.md += height;
                    if (A.md > 0) {
                        A.md = 0;
                        if (!b2) {
                            --A.ld;
                        }
                    }
                }
                else {
                    --A.ld;
                }
                if (A.ld < 0) {
                    A.ld = A.jd.size() - 1;
                    if (b) {
                        A.md = A.xd - A.nd;
                    }
                }
            }
            else {
                final short[] z = A.z;
                final int n2 = 29;
                z[n2] += (short)A.j[2].getHeight();
            }
        }
        if (C(60)) {
            if (A.rd) {
                final int height2 = A.j[2].getHeight();
                if (A.nd > A.xd) {
                    int n3 = A.vd + A.md;
                    boolean b3 = false;
                    final int index = A.ld + 1;
                    if (index >= A.jd.size()) {
                        for (int k = 0; k < A.ld; ++k) {
                            n3 += ((String[])A.jd.elementAt(k)).length * height2 + 10;
                        }
                        if (n3 + ((String[])A.jd.elementAt(A.ld)).length * height2 + 20 + A.cc[1695] <= A.vd + A.xd) {
                            ++A.ld;
                        }
                        b3 = true;
                    }
                    else {
                        for (int l = 0; l < index; ++l) {
                            n3 += ((String[])A.jd.elementAt(l)).length * height2;
                        }
                        final String[] array2 = A.jd.elementAt(index);
                        if (n3 < A.vd + A.xd / 2) {
                            ++A.ld;
                            b3 = true;
                        }
                    }
                    A.md -= height2;
                    if (A.md < A.xd - A.nd) {
                        A.md = A.xd - A.nd;
                        if (!b3) {
                            ++A.ld;
                        }
                    }
                }
                else {
                    ++A.ld;
                }
                if (A.ld >= A.jd.size()) {
                    A.ld = 0;
                    A.md = 0;
                }
            }
            else {
                final short[] z2 = A.z;
                final int n4 = 29;
                z2[n4] -= (short)A.j[2].getHeight();
            }
        }
        if (A.rd && C(61)) {
            A.rd = false;
        }
        if (!A.rd && C(62) && !A.jd.isEmpty()) {
            A.rd = true;
        }
        D();
    }
    
    static void BA(final int n) {
        A.lD = 0;
        for (int i = 0; i < A.da[2].length; ++i) {
            final int n2 = A.da[2][i][4];
            if (n2 >= 0 && A.la[n2][6] == 20) {
                A.lD += A.da[2][i][6];
            }
        }
        if (A.lD > 0) {
            A.mD = A.lD;
            A.jD = (byte)(B.a[n][8] >> 24 & 0xFF);
            A.nD = (((short)((B.a[n][9] & 0xFFFF0000) >> 16) & 0xFFFF) | ((short)n << 16 & 0xFFFF0000));
            A.kD = 0;
            A.oD = true;
            A.pD = " x " + A.lD;
        }
        else {
            D(239, 230, 101, 106);
        }
    }
    
    static void R(final Graphics graphics) {
        if ((A.na[2] & 0x80) == 0x0 && (A.na[2] & 0x1) != 0x0) {
            A.pd = 174;
            A.gD = true;
            A(126, 463, null);
            final int[] na = A.na;
            final int n = 2;
            na[n] |= 0x80;
            return;
        }
        graphics.setClip(0, 0, A.f, A.g);
        graphics.setColor(A.i[3]);
        graphics.fillRect(0, 0, A.f, A.g);
        final int n2 = A.f >> 1;
        final int n3 = A.cc[1838] + 5;
        final int n4 = n3 * A.jD + A.cc[1772] + A.cc[1794] + (A.cc[1805] >> 1);
        final int n5 = n4 + (A.g - (n4 + A.cc[1607] + A.cc[1387]) >> 1);
        final int n6 = A.cc[1760] / A.cc[1765];
        B((A.f >> 1) + 3 * n6, n5, 160, 0, graphics);
        B((A.f >> 1) - 4 * n6, n5, 160, 1, graphics);
        graphics.setClip(10, 0, A.f - 20, A.f);
        B(n2, n5, 161, 0, graphics);
        int n7 = n5 - A.cc[1772];
        for (int i = 0; i < A.jD; ++i) {
            boolean b = false;
            if ((A.nD & 1 << i) != 0x0) {
                b = true;
            }
            int n8;
            if (A.kD > i) {
                n8 = (A.f - A.cc[1782] >> 1) - A.cc[1837] - 10 >> 1;
            }
            else {
                n8 = (A.f - A.cc[1782] >> 1) - A.cc[1837] - 10;
            }
            for (int j = 0; j < n3; j += A.cc[1805]) {
                B(A.f >> 1, n7 - j, 162, 0, graphics);
                if (A.kD > i) {
                    B(A.f >> 1, n7 - j, 164, 0, graphics);
                }
                else if (A.kD == i) {
                    B(A.f >> 1, n7, 168, 0, graphics);
                }
            }
            int n9 = A.cc[1782] >> 1;
            int k = 0;
            if (A.kD > i) {
                while (k < n8) {
                    if (b) {
                        B((A.f >> 1) + n9, n7, 165, 0, graphics);
                    }
                    else {
                        B((A.f >> 1) - n9, n7, 165, 0, 0, 2, graphics);
                    }
                    n9 += A.cc[1815];
                    k += A.cc[1815];
                }
            }
            int n10 = 0;
            int n11 = 0;
            if (A.kD > i) {
                if (b) {
                    n11 = n9 - (A.cc[1782] >> 1);
                }
                else {
                    n10 = n9 - (A.cc[1782] >> 1);
                }
            }
            B((A.f >> 1) + n9 - n10, n7, 167, 0, graphics);
            B((A.f >> 1) - n9 + n11, n7, 167, 0, 0, 2, graphics);
            int n12 = n9 + A.cc[1837];
            for (int l = 0; l < n8; l += A.cc[1826]) {
                if (A.kD > i) {
                    if (b) {
                        B((A.f >> 1) - l - (A.cc[1782] >> 1) - A.cc[1837], n7, 166, 0, 0, 2, graphics);
                    }
                    else {
                        B((A.f >> 1) + l + (A.cc[1782] >> 1) + A.cc[1837], n7, 166, 0, graphics);
                    }
                }
                B((A.f >> 1) + n12, n7, 166, 0, graphics);
                B((A.f >> 1) - n12, n7, 166, 0, 0, 2, graphics);
                n12 += A.cc[1826];
            }
            n7 -= n3;
        }
        B(A.f >> 1, n7 - (A.cc[1805] >> 1), 163, 0, graphics);
        graphics.setClip(0, 0, A.f, A.g);
        int height = A.cc[1508];
        if (height < A.j[2].getHeight()) {
            height = A.j[2].getHeight();
        }
        final int n13 = A.g - A.cc[1607] - (height >> 1) - 5;
        final int n14 = A.f - A.j[2].stringWidth(A.pD) - (A.cc[1507] / A.cc[1512] >> 1) - 5;
        B(n14, n13, 137, 6, graphics);
        final int n15 = n14 + (A.cc[1507] / A.cc[1512] >> 1);
        final int n16 = n13 - (height >> 1);
        graphics.setColor(A.i[5]);
        graphics.setFont(A.j[2]);
        graphics.drawString(A.pD, n15 + 0, n16 + 0, 20);
        A(graphics, 1);
        B(A.f - (A.cc[1606] >> 1), A.g, 136, 1, graphics);
    }
    
    static boolean EB() {
        final int n = 100 - (short)(A.ca[25] & 0xFFFF);
        return n >= 0 && HG.A(100) <= n;
    }
    
    static void FB() {
        final int n = A.mD - A.lD;
        for (int i = 0; i < A.da[2].length; ++i) {
            final int n2 = A.da[2][i][4];
            if (n2 >= 0 && A.la[n2][6] == 20) {
                I(((short)n2 & 0xFFFF) | 0x20000, n);
                break;
            }
        }
    }
    
    static void GB() {
        if (C(61)) {
            if ((A.nD & 1 << A.kD) != 0x0) {
                A.kD = 0;
                if (EB()) {
                    --A.lD;
                    HG.M(32);
                    A.pD = " x " + A.lD;
                }
            }
            else {
                ++A.kD;
            }
        }
        else if (C(62)) {
            if ((A.nD & 1 << A.kD) == 0x0) {
                A.kD = 0;
                if (EB()) {
                    --A.lD;
                    HG.M(32);
                    A.pD = " x " + A.lD;
                }
            }
            else {
                ++A.kD;
            }
        }
        else if (C(85)) {
            A.oD = false;
            FB();
        }
        if (A.kD >= A.jD) {
            final short n = (short)((A.nD & 0xFFFF0000) >> 16);
            final byte b = (byte)(B.a[n][8] >> 8 & 0xFF);
            final byte b2 = (byte)(B.a[n][8] & 0xFF);
            A(12, 7, (short)((B.a[n][2] & 0xFFFF0000) >> 16), b2, 0, false);
            if (b2 == 5) {
                final int[] array = B.a[n];
                final int n2 = 3;
                array[n2] |= 0x8000;
                A(B.a[n], true);
                A.bc = true;
            }
            B.B(B.E() | 1 << b);
            E(B.a[n], false);
            HG.M(9);
            A.oD = false;
            FB();
            F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
        }
        if (A.lD <= 0) {
            D(239, 230, 101, 106);
            FB();
            A.oD = false;
        }
        D();
    }
    
    static int CA(final int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            if (HG.A(2) == 1) {
                n2 |= 1 << i;
            }
        }
        return n2;
    }
    
    public static void HB() {
    }
    
    public static void S(final Graphics graphics) {
        A(graphics, 0);
        if (A.db || A.eb) {
            G(graphics);
        }
        else if (A.gB == -1) {
            L(graphics);
        }
        I(graphics);
        graphics.setClip(0, 0, A.f, A.g);
        B(A.cc[1606] >> 1, A.g, 136, 2, graphics);
        B(A.f - (A.cc[1606] >> 1), A.g, 136, 1, graphics);
    }
    
    public static void A(final Graphics graphics, int n) {
        final boolean b = n == 0 || n == 1;
        final boolean b2 = n == 0 || n == 2;
        graphics.setClip(0, 0, A.f, A.g);
        if (b) {
            n = A.g;
            B(0, n, 146, 0, graphics);
            final int n2 = n - A.cc[1607];
            B(0, n2, 138, 0, graphics);
            n = 0 + A.cc[1518];
            B(n, n2, 126, 0, graphics);
            T(graphics);
        }
        B(A.f, A.g, 146, 0, 0, 2, graphics);
        if (b2) {
            n = A.f;
            final int n3 = A.g - A.cc[1607];
            B(n, n3, 138, 0, 0, 2, graphics);
            final int n4 = n - A.cc[1518];
            n = Z(BA());
            switch (n) {
                case 0:
                case 1: {
                    n = 140;
                    break;
                }
                case 2: {
                    if ((short)(A.ca[53] & 0xFFFF) == 0) {
                        n = 143;
                        break;
                    }
                    if ((short)(A.ca[53] & 0xFFFF) <= 10) {
                        n = 142;
                        break;
                    }
                    n = 141;
                    break;
                }
                case 3: {
                    if ((short)((A.ca[53] & 0xFFFF0000) >> 16) == 0) {
                        n = 143;
                        break;
                    }
                    if ((short)((A.ca[53] & 0xFFFF0000) >> 16) <= 10) {
                        n = 142;
                        break;
                    }
                    n = 141;
                    break;
                }
                default: {
                    n = 139;
                    break;
                }
            }
            if (A.ca[45] != -1) {
                if (A(A.da[4][A.ca[45]])[8] == 0) {
                    n = 145;
                }
                else {
                    n = 144;
                }
            }
            B(n4, n3, n, 0, graphics);
            B(graphics, 0);
        }
    }
    
    public static void T(final Graphics graphics) {
        final int g = A.g;
        if (!W(146) || !W(139)) {
            return;
        }
        final int n = g - A.dc[146][4] - A.dc[139][4];
        final short n2 = (short)(A.ca[12] & 0xFFFF);
        final short n3 = (short)((A.ca[12] & 0xFFFF0000) >> 16);
        int n4;
        if (n3 == 0) {
            n4 = 32;
        }
        else {
            n4 = 32 * n2 / n3;
        }
        graphics.setColor(16711680);
        graphics.fillRect(33, n + 2 + 32 - n4, 5, n4);
    }
    
    public static void B(final Graphics graphics, final int n) {
        if (!W(138) || !W(126) || !W(146) || !W(139)) {
            return;
        }
        final int n2 = A.f - A.dc[138][3] - A.dc[126][3];
        final int n3 = A.g - A.dc[146][4] - A.dc[139][4];
        final short n4 = (short)(A.ca[13] & 0xFFFF);
        final short n5 = (short)((A.ca[13] & 0xFFFF0000) >> 16);
        int n6;
        if (n5 == 0) {
            n6 = 32;
        }
        else {
            n6 = 32 * n4 / n5;
        }
        graphics.setColor(8421631);
        graphics.fillRect(n2 + 2 + n, n3 + 2 + 32 - n6, 5, n6);
    }
    
    public static void IB() {
        if (A.qD == null) {
            A.qD = new int[10][11];
            A.rD = new int[10][];
        }
        for (int i = 0; i < A.qD.length; ++i) {
            A.qD[i][6] = -1;
            A.qD[i][0] = -1;
            A.qD[i][4] = -1;
            A.qD[i][5] = -1;
            A.qD[i][3] = 0;
        }
    }
    
    public static void DA(int n) {
        if (!A.sD) {
            final int kb = KB();
            if (kb >= 0) {
                final int n2 = A.da[4][n][4];
                final int[] array = A.va[n2];
                n = array[4] * (short)((A.ca[13] & 0xFFFF0000) >> 16) / 100;
                if (n > (short)(A.ca[13] & 0xFFFF)) {
                    return;
                }
                if ((short)((array[6] & 0xFFFF0000) >> 16) > 0) {
                    A.rD[kb] = null;
                }
                else if ((short)(array[6] & 0xFFFF) == 0) {
                    A.rD[kb] = A.ca;
                }
                else if (A.gB >= 0) {
                    A.rD[kb] = A.ea[A.gB];
                }
                else {
                    A.rD[kb] = null;
                    n = array[7] * 4096 / 10;
                    switch (A.ca[30]) {
                        case 0: {
                            A.qD[kb][9] = A.ca[4];
                            A.qD[kb][10] = A.ca[5] - n;
                            break;
                        }
                        case 1: {
                            A.qD[kb][9] = A.ca[4] + n;
                            A.qD[kb][10] = A.ca[5];
                            break;
                        }
                        case 2: {
                            A.qD[kb][9] = A.ca[4];
                            A.qD[kb][10] = A.ca[5] + n;
                            break;
                        }
                        case 3: {
                            A.qD[kb][9] = A.ca[4] - n;
                            A.qD[kb][10] = A.ca[5];
                            break;
                        }
                    }
                }
                final int[] array2 = A.qD[kb];
                final int n3 = 6;
                array2[n3] &= 0xFFFFFF00;
                final int[] array3 = A.qD[kb];
                final int n4 = 6;
                array3[n4] |= ((byte)n2 & 0xFF);
                final int[] array4 = A.qD[kb];
                final int n5 = 6;
                array4[n5] &= 0xFFFF00FF;
                final int[] array5 = A.qD[kb];
                final int n6 = 6;
                array5[n6] |= 0x100;
                final int[] array6 = A.qD[kb];
                final int n7 = 6;
                array6[n7] &= 0xFF00FFFF;
                final int[] array7 = A.qD[kb];
                final int n8 = 6;
                array7[n8] |= 0x0;
                final int[] array8 = A.qD[kb];
                final int n9 = 6;
                array8[n9] &= 0xFFFFFF;
                final int[] array9 = A.qD[kb];
                final int n10 = 6;
                array9[n10] |= 0x2000000;
                if (array[5] == -1 && !A.sD) {
                    HG.M(array[9]);
                }
                A.qD[kb][7] = 0;
                A.qD[kb][8] = 655360;
                A.qD[kb][4] = A.ca[4];
                A.qD[kb][5] = A.ca[5];
                A.sD = true;
                D();
                F();
            }
        }
        else {
            A.sD = false;
            D();
            F();
        }
    }
    
    public static void JB() {
        for (int i = 0; i < A.qD.length; ++i) {
            if (A.qD[i][6] != -1) {
                final int[] array = A.va[(byte)(A.qD[i][6] & 0xFF)];
                int n = array[4] * (short)((A.ca[13] & 0xFFFF0000) >> 16) / 100;
                if (n < 1) {
                    n = 1;
                }
                if ((byte)(A.qD[i][6] >> 16 & 0xFF) == 0) {
                    if ((short)(array[6] & 0xFFFF) != 0 && A.gB >= 0 && !B.A(A.ca, A.ea[A.gB], array[7] * 4096 / 10)) {
                        A(1, n * ((byte)(A.qD[i][6] >> 8 & 0xFF) - 1), true, false, A.ca);
                        A.qD[i][6] = -1;
                        A.sD = false;
                    }
                    else {
                        int n2 = (byte)(A.qD[i][6] >> 8 & 0xFF);
                        final int n3 = array[5];
                        int n4 = (byte)(A.qD[i][6] >> 24 & 0xFF);
                        if (n4 < 0 || !A.sD) {
                            if ((short)(A.ca[13] & 0xFFFF) - n >= 0 && A.sD) {
                                if (n3 == -1) {
                                    if (!B(i, n2, A.rD[i])) {
                                        A(1, -n, true, false, A.ca);
                                        A.lB = 10;
                                        A.qD[i][6] = -1;
                                        A.sD = false;
                                        continue;
                                    }
                                    n2 = 0;
                                }
                                A(1, -n, true, false, A.ca);
                                ++n2;
                                final int[] array2 = A.qD[i];
                                final int n5 = 6;
                                array2[n5] &= 0xFFFF00FF;
                                final int[] array3 = A.qD[i];
                                final int n6 = 6;
                                array3[n6] |= ((byte)n2 << 8 & 0xFF00);
                                final int[] array4 = A.qD[i];
                                final int n7 = 6;
                                array4[n7] &= 0xFFFFFF;
                                final int[] array5 = A.qD[i];
                                final int n8 = 6;
                                array5[n8] |= 0x2000000;
                            }
                            else {
                                if ((short)((array[6] & 0xFFFF0000) >> 16) > 0) {
                                    if ((short)(array[6] & 0xFFFF) == 0) {
                                        A.qD[i][0] = (((short)(A.ca[0] & 0xFFFF) & 0xFFFF) | ((short)((A.ca[0] & 0xFFFF0000) >> 16) << 16 & 0xFFFF0000));
                                        A.qD[i][4] = A.ca[4];
                                        A.qD[i][5] = A.ca[5];
                                        A.qD[i][9] = A.ca[4];
                                        A.qD[i][10] = A.ca[5];
                                    }
                                    else if (A.gB >= 0 && A.rD[i] == null) {
                                        A.qD[i][0] = (((short)(A.ea[A.gB][0] & 0xFFFF) & 0xFFFF) | ((short)((A.ea[A.gB][0] & 0xFFFF0000) >> 16) << 16 & 0xFFFF0000));
                                        A.qD[i][4] = A.ea[A.gB][4];
                                        A.qD[i][5] = A.ea[A.gB][5];
                                        A.qD[i][9] = A.ea[A.gB][4];
                                        A.qD[i][10] = A.ea[A.gB][5];
                                    }
                                    else {
                                        A.qD[i][4] = A.ca[4];
                                        A.qD[i][5] = A.ca[5];
                                        A.qD[i][9] = A.ca[4];
                                        A.qD[i][10] = A.ca[5];
                                    }
                                }
                                if (n3 != -1) {
                                    A(1, -n, true, false, A.ca);
                                    N(A.ca, 8 + A.ca[30]);
                                    final int[] array6 = A.qD[i];
                                    final int n9 = 6;
                                    array6[n9] &= 0xFF00FFFF;
                                    final int[] array7 = A.qD[i];
                                    final int n10 = 6;
                                    array7[n10] |= 0x20000;
                                    HG.M(array[9]);
                                    B.A(A.qD[i], (int)(short)(A.ca[0] & 0xFFFF), (int)(short)((A.ca[0] & 0xFFFF0000) >> 16));
                                }
                                else {
                                    A.qD[i][6] = -1;
                                    N(A.ca, 0 + A.ca[30]);
                                }
                                A.sD = false;
                                A.lB = 10;
                            }
                        }
                        else {
                            if (A.gB != -1) {
                                A.ca[30] = N(A.ea[A.gB][4] - A.ca[4], A.ea[A.gB][5] - A.ca[5]);
                                N(A.ca, 12 + A.ca[30]);
                            }
                            --n4;
                            final int[] array8 = A.qD[i];
                            final int n11 = 6;
                            array8[n11] &= 0xFFFFFF;
                            final int[] array9 = A.qD[i];
                            final int n12 = 6;
                            array9[n12] |= ((byte)n4 << 24 & 0xFF000000);
                        }
                    }
                }
                else if ((byte)(A.qD[i][6] >> 16 & 0xFF) == 3) {
                    final byte b = (byte)(A.qD[i][6] >> 8 & 0xFF);
                    final int n13 = array[5];
                    int n14;
                    if (array[3] > 0) {
                        n14 = n13 * (b >> 1);
                    }
                    else {
                        n14 = n13 * b;
                    }
                    if (n14 <= 0) {
                        final int[] array10 = A.qD[i];
                        final int n15 = 6;
                        array10[n15] &= 0xFF00FFFF;
                        final int[] array11 = A.qD[i];
                        final int n16 = 6;
                        array11[n16] |= 0x40000;
                    }
                    else {
                        int n17 = (byte)(A.qD[i][6] >> 24 & 0xFF);
                        if (n17 < 0) {
                            final int[] array12 = A.qD[i];
                            final int n18 = 6;
                            array12[n18] &= 0xFFFFFF;
                            final int[] array13 = A.qD[i];
                            final int n19 = 6;
                            array13[n19] |= 0xA000000;
                            B(i, b, A.rD[i]);
                            final int[] array14 = A.qD[i];
                            final int n20 = 7;
                            array14[n20] += 10;
                            if (A.qD[i][7] >= n14 * n) {
                                if (array[8] == 3) {
                                    B(i, b, A.rD[i]);
                                }
                                final int[] array15 = A.qD[i];
                                final int n21 = 6;
                                array15[n21] &= 0xFF00FFFF;
                                final int[] array16 = A.qD[i];
                                final int n22 = 6;
                                array16[n22] |= 0x40000;
                            }
                        }
                        else {
                            --n17;
                            final int[] array17 = A.qD[i];
                            final int n23 = 6;
                            array17[n23] &= 0xFFFFFF;
                            final int[] array18 = A.qD[i];
                            final int n24 = 6;
                            array18[n24] |= ((byte)n17 << 24 & 0xFF000000);
                        }
                        E(i, true);
                    }
                }
                else if ((byte)(A.qD[i][6] >> 16 & 0xFF) == 2) {
                    if (!EA(i)) {
                        final int[] array19 = A.qD[i];
                        final int n25 = 6;
                        array19[n25] &= 0xFF00FFFF;
                        final int[] array20 = A.qD[i];
                        final int n26 = 6;
                        array20[n26] |= 0x30000;
                        final int[] array21 = A.qD[i];
                        final int n27 = 6;
                        array21[n27] &= 0xFFFFFF;
                        final int[] array22 = A.qD[i];
                        final int n28 = 6;
                        array22[n28] |= 0xA000000;
                        B(i, (byte)(A.qD[i][6] >> 8 & 0xFF), A.rD[i]);
                    }
                }
                else if ((byte)(A.qD[i][6] >> 16 & 0xFF) == 4 && !E(i, false)) {
                    A.qD[i][6] = -1;
                    B.A(A.qD[i], -1, -1);
                }
            }
        }
    }
    
    public static boolean E(final int n, final boolean b) {
        int n2 = (short)(A.qD[n][8] & 0xFFFF);
        if (++n2 >= (short)((A.qD[n][8] & 0xFFFF0000) >> 16)) {
            if (!b) {
                return false;
            }
            n2 = 0;
        }
        final int[] array = A.qD[n];
        final int n3 = 8;
        array[n3] &= 0xFFFF0000;
        final int[] array2 = A.qD[n];
        final int n4 = 8;
        array2[n4] |= ((short)n2 & 0xFFFF);
        return true;
    }
    
    public static boolean B(int n, int n2, final int[] array) {
        final int[] array2 = A.va[(byte)(A.qD[n][6] & 0xFF)];
        final int n3 = array2[5];
        final int n4 = (short)((array2[6] & 0xFFFF0000) >> 16) * 4096;
        final short n5 = (short)(array2[6] & 0xFFFF);
        int n6 = array2[4] * (short)((A.ca[13] & 0xFFFF0000) >> 16) / 100;
        if (n6 < 1) {
            n6 = 1;
        }
        if (array != null) {
            G(n, array);
        }
        if ((short)((array2[6] & 0xFFFF0000) >> 16) > 0 && array == null) {
            if (n5 == 0 || n5 == 2) {
                B(n, n2, A.ca);
            }
            A.tD[0] = A.qD[n][9] - n4;
            A.tD[2] = A.qD[n][9] + n4;
            A.tD[1] = A.qD[n][10] - n4;
            A.tD[3] = A.qD[n][10] + n4;
            for (int i = B.A(A.tD, 32); i != -1; i = (short)((B.a[i][1] & 0xFFFF0000) >> 16)) {
                if ((B.a[i][13] & 0x2) == 0x0 && (B.a[i][3] & 0x10000) == 0x0) {
                    B(n, n2, B.a[i]);
                }
            }
            return true;
        }
        if (array == null) {
            return false;
        }
        final boolean b = (array[3] & 0x10) != 0x0 && (n5 == 0 || n5 == 2);
        final boolean b2 = (array[3] & 0x20) != 0x0 && (n5 == 2 || (n5 == 1 && !N((short)((array[2] & 0xFFFF0000) >> 16))) || (n5 == 4 && (N((short)((array[2] & 0xFFFF0000) >> 16)) || (array[13] & 0x80) != 0x0)) || (n5 == 3 && !N((short)((array[2] & 0xFFFF0000) >> 16)) && (array[13] & 0x80) == 0x0));
        switch (array2[8]) {
            case 0: {
                if (b) {
                    if (n3 < 0 && (short)(A.ca[12] & 0xFFFF) == (short)((A.ca[12] & 0xFFFF0000) >> 16)) {
                        return false;
                    }
                    A(0, array2[3] * n2 * n6, true, false, array);
                    break;
                }
                else {
                    if (!b2) {
                        break;
                    }
                    if (n3 < 0 && (short)(array[12] & 0xFFFF) == (short)((array[12] & 0xFFFF0000) >> 16)) {
                        return false;
                    }
                    A(0, array2[3] * n2 * n6, true, false, array);
                    H(A.gB);
                    break;
                }
                break;
            }
            case 1: {
                n = array2[3] * n6;
                if (n3 >= 0) {
                    n *= n2 >> 1;
                }
                else {
                    n *= n2;
                }
                n -= F(4, array);
                if (n <= 0) {
                    n = 1;
                }
                if (b) {
                    if (n3 < 0 && (short)(A.ca[12] & 0xFFFF) <= 0) {
                        return false;
                    }
                    A(0, -n, true, false, array);
                }
                if (b2) {
                    if ((short)(array[20] & 0xFFFF) == -1 || (short)(array[26] & 0xFFFF) < 3) {
                        n2 = (short)(A.ca[2] & 0xFFFF);
                        final int n7 = 20;
                        array[n7] &= 0xFFFF0000;
                        final int n8 = 20;
                        array[n8] |= ((short)n2 & 0xFFFF);
                        array[22] = F(A.ca);
                        array[26] = 10;
                        if ((A.fa[array[11]][13] & 0x80) != 0x0) {
                            D((short)((array[2] & 0xFFFF0000) >> 16), true);
                        }
                    }
                    A(n, array, A.ca);
                    H(A.gB);
                    break;
                }
                break;
            }
            case 2: {
                if (b2 && A.qD[n][7] == 0 && A.fa[array[11]][27] != 4) {
                    final int n9 = 13;
                    array[n9] |= 0x80;
                    array[20] = -1;
                    array[22] = F(array);
                    array[25] = n3 * n2 * n6 * (100 - F(4, array)) / 100;
                }
                if (array[25] <= 0) {
                    final int[] array3 = A.qD[n];
                    final int n10 = 6;
                    array3[n10] &= 0xFF00FFFF;
                    final int[] array4 = A.qD[n];
                    final int n11 = 6;
                    array4[n11] |= 0x40000;
                    break;
                }
                break;
            }
            case 3: {
                if (!b2) {
                    break;
                }
                if (A.qD[n][7] >= n3 * n2 * n6 * (100 - F(4, array)) / 100) {
                    final int n12 = 13;
                    array[n12] &= 0xFFFFFFF7;
                    N(array, 0 + (short)(array[27] & 0xFFFF));
                    final int[] array5 = A.qD[n];
                    final int n13 = 6;
                    array5[n13] &= 0xFF00FFFF;
                    final int[] array6 = A.qD[n];
                    final int n14 = 6;
                    array6[n14] |= 0x40000;
                    break;
                }
                if (A.qD[n][7] != 0 || A.fa[array[11]][27] == 4) {
                    break;
                }
                final int n15 = 13;
                array[n15] |= 0x8;
                N(array, 16);
                n = (short)(A.ca[2] & 0xFFFF);
                final int n16 = 20;
                array[n16] &= 0xFFFF0000;
                final int n17 = 20;
                array[n17] |= ((short)n & 0xFFFF);
                if ((A.fa[array[11]][13] & 0x80) != 0x0) {
                    D((short)((array[2] & 0xFFFF0000) >> 16), true);
                    break;
                }
                break;
            }
        }
        return true;
    }
    
    public static int KB() {
        for (int i = 0; i < A.qD.length; ++i) {
            if (A.qD[i][6] == -1) {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean EA(final int n) {
        final int n2 = A.qD[n][4];
        final int n3 = A.qD[n][5];
        int n4;
        int n5;
        if (A.rD[n] != null) {
            n4 = A.rD[n][4];
            n5 = A.rD[n][5];
        }
        else {
            n4 = A.qD[n][9];
            n5 = A.qD[n][10];
        }
        A.yB[0] = n4 - n2;
        A.yB[1] = n5 - n3;
        if (B(A.yB) <= 2048) {
            return false;
        }
        A(A.yB, 2048, A.zB);
        int a = B.A(n2, n3, n2 + A.zB[0], n3 + A.zB[1], 4128, A.uD, true);
        A.qD[n][4] = A.uD[0];
        A.qD[n][5] = A.uD[1];
        int n6 = A.uD[0] >> 12;
        if (A.uD[0] < 0) {
            --n6;
        }
        int n7 = A.uD[1] >> 12;
        if (A.uD[1] < 0) {
            --n7;
        }
        B.A(A.qD[n], n6, n7);
        if (n6 < 0 || n6 >= B.b || n7 < 0 || n7 >= B.c) {
            a = -1;
        }
        if (a != -2) {
            if (a != -1) {
                if ((B.a[a][3] & 0x20) != 0x0) {
                    A.rD[n] = B.a[a];
                }
                else {
                    A.rD[n] = null;
                }
            }
            else {
                A.rD[n] = null;
            }
            return false;
        }
        AA(A.qD[n]);
        return true;
    }
    
    public static void D(final int[] array, final Graphics graphics) {
        final int[] array2 = A.va[(byte)(array[6] & 0xFF)];
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        int n2 = 0;
        int n3 = -1;
        int n4 = -1;
        int n5 = -1;
        switch (array2[0]) {
            case 452: {
                n5 = 4096;
                n3 = 173;
                n4 = 0;
                n2 = 1;
            }
            case 458: {
                if (n2 == 0) {
                    n3 = 173;
                    n4 = 1;
                    n5 = 4096;
                    n2 = 1;
                }
            }
            case 448: {
                if (n2 == 0) {
                    n3 = 173;
                    n4 = 2;
                    n5 = 4096;
                }
                if ((byte)(array[6] >> 16 & 0xFF) == 2) {
                    if (A.rD[n] != null) {
                        B.A(A.rD[n], A.vD);
                    }
                    else {
                        A.vD[0] = array[9];
                        A.vD[1] = array[10];
                    }
                    final int n6 = A.vD[0] - array[4];
                    final int n7 = A.vD[1] - array[5];
                    final int n8 = (array[4] * B.d >> 12) - A.tB;
                    final int n9 = (array[5] * B.d >> 12) - A.uB - (n5 * B.d >> 12);
                    if (L(n3, n4)) {
                        A(n8, n9, n3, n4, 0, n6, n7, graphics);
                    }
                }
            }
            default: {}
        }
    }
    
    public static void LB() {
        final short[][] array = null;
    }
    
    public static void MB() {
        final short[][] array = null;
    }
    
    public static void A(final short n, final short n2, final short n3) {
    }
    
    public static void NB() {
    }
    
    public static void U(final Graphics graphics) {
    }
    
    public static void OB() {
        A.jA = new int[64][13];
        A.kA = new short[64][60];
        for (int i = 0; i < A.jA.length; ++i) {
            for (int j = 0; j < A.jA[i].length; ++j) {
                A.jA[i][j] = -1;
            }
            A.jA[i][0] = -1;
            A.jA[i][3] = 0;
        }
        A.wD = 0;
    }
    
    public static void PB() {
        A.jA = null;
        A.kA = null;
    }
    
    public static void QB() {
        for (int i = 0; i < A.jA.length; ++i) {
            if ((A.jA[i][3] & 0x10000) == 0x0) {
                final int[] array = A.jA[i];
                final int n = 10;
                --array[n];
                if (A.jA[i][10] <= 0) {
                    final int[] array2 = A.jA[i];
                    final int n2 = 3;
                    array2[n2] |= 0x10000;
                    B.A(A.jA[i], -1, -1);
                }
                else {
                    switch (A.jA[i][11]) {
                        case 0: {
                            BA(A.jA[i]);
                            break;
                        }
                        case 1: {
                            GA(A.jA[i]);
                            break;
                        }
                        case 2: {
                            DA(A.jA[i]);
                            break;
                        }
                        case 3: {
                            EA(A.jA[i]);
                            break;
                        }
                        case 4: {
                            FA(A.jA[i]);
                            break;
                        }
                        case 5: {
                            HA(A.jA[i]);
                            break;
                        }
                        case 6: {
                            IA(A.jA[i]);
                            break;
                        }
                        case 7: {
                            JA(A.jA[i]);
                            break;
                        }
                        case 8: {
                            KA(A.jA[i]);
                            break;
                        }
                        case 9: {
                            LA(A.jA[i]);
                            break;
                        }
                        case 10: {
                            MA(A.jA[i]);
                            break;
                        }
                        case 11: {
                            NA(A.jA[i]);
                            break;
                        }
                        case 12: {
                            OA(A.jA[i]);
                            break;
                        }
                        case 13: {
                            PA(A.jA[i]);
                            break;
                        }
                        case 14: {
                            CA(A.jA[i]);
                            break;
                        }
                    }
                }
            }
        }
    }
    
    public static void E(final int[] array, final Graphics graphics) {
        switch (array[11]) {
            case 0: {
                F(array, graphics);
                break;
            }
            case 1: {
                K(array, graphics);
                break;
            }
            case 2: {
                H(array, graphics);
                break;
            }
            case 3: {
                I(array, graphics);
                break;
            }
            case 4: {
                J(array, graphics);
                break;
            }
            case 5: {
                L(array, graphics);
                break;
            }
            case 6: {
                M(array, graphics);
                break;
            }
            case 7: {
                N(array, graphics);
                break;
            }
            case 8: {
                O(array, graphics);
                break;
            }
            case 9: {
                P(array, graphics);
                break;
            }
            case 10: {
                Q(array, graphics);
                break;
            }
            case 11: {
                R(array, graphics);
                break;
            }
            case 12: {
                S(array, graphics);
                break;
            }
            case 13: {
                T(array, graphics);
                break;
            }
            case 14: {
                G(array, graphics);
                break;
            }
        }
    }
    
    static void RB() {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        A.xD = HG.I(315);
        if (W(155) && W(152)) {
            n = A.cc[1705];
            n2 = A.cc[1706];
            n3 = A.cc[1672];
            n4 = A.cc[1673];
        }
        final int n5 = (n > n3) ? n : n3;
        if (n2 > n4) {}
        final int n6 = 4 + n5;
        int height = A.j[2].getHeight();
        int n7;
        int n8;
        if (A.j[2].stringWidth(A.xD) >= A.f - (n6 << 1)) {
            n7 = 4;
            n8 = 4 + n4;
            A.yD = height + (n4 << 1) + 8;
        }
        else {
            n7 = 4 + n5;
            n8 = 4;
            if (height < n4) {
                height = n4;
            }
            A.yD = height + 8;
        }
        A(11, n7, n8, A.f - (n7 << 1), height, 156);
        A(11, -2, 0);
    }
    
    static void SB() {
        A.xD = null;
    }
    
    static void V(final Graphics graphics) {
        graphics.setClip(0, 0, A.f, A.g);
        graphics.setColor(A.i[21]);
        graphics.drawRect(0, 0, A.f - 1, A.yD - 1);
        graphics.setColor(A.i[20]);
        graphics.drawRect(1, 1, A.f - 3, A.yD - 3);
        graphics.setColor(A.i[19]);
        graphics.fillRect(2, 2, A.f - 4, A.yD - 4);
        graphics.setColor(A.i[18]);
        A(A.xD, 11, 2, graphics);
        graphics.setClip(0, 0, A.f, A.g);
        if (W(155) && W(152)) {
            B(1, 1, 152, 0, graphics);
            B(A.f - 1, 1, 152, 0, 0, 2, graphics);
            B(0, A.yD - A.cc[1673], 155, 0, 0, 0, graphics);
            B(A.f - A.cc[1672] - 1, A.yD - A.cc[1673] - 1, 152, 0, 0, 3, graphics);
        }
        if (A.zD >= 0 && !A.eb && !A.db) {
            W(A.ae);
            if (A.ae >= 0) {}
            B(0, A.g, 146, 0, graphics);
            B(A.cc[1606] >> 1, A.g, 136, 3, graphics);
            final int n = A.g - A.cc[1607];
            if (A.ae >= 0) {
                B(0, n, 138, 0, graphics);
                B(0 + A.cc[1518], n, A.ae, 0, graphics);
            }
            A(graphics, A.ae, HG.I(315 + A.zD));
        }
    }
    
    public static void G(final int n, final int[] array) {
        final int[] array2 = A.va[(byte)(A.qD[n][6] & 0xFF)];
        B(n, array, A.ee);
        int n2 = -1;
        if (array != null) {
            n2 = (short)(array[2] & 0xFFFF);
        }
        switch (array2[0]) {
            case 452: {
                H(n, A.de);
                E(A.qD[n][4], A.qD[n][5], 4096, A.de[0], A.de[1], 0);
                break;
            }
            case 458: {
                H(n, A.de);
                C(A.qD[n][4], A.qD[n][5], 4096, A.de[0], A.de[1], 0);
                break;
            }
            case 448: {
                E(A.ee[0], A.ee[1], 4096, n2);
                break;
            }
            case 456: {
                L(A.ee[0], A.ee[1], n2);
                if (HG.d) {
                    L(A.ee[0], A.ee[1], n2);
                    break;
                }
                break;
            }
            case 454: {
                S(A.ee[0], A.ee[1]);
                break;
            }
            case 460: {
                M(A.ee[0], A.ee[1], n2);
                T(A.qD[n][4], A.qD[n][5]);
                break;
            }
            case 450: {
                K(A.ee[0], A.ee[1], n2);
                break;
            }
        }
    }
    
    public static void AA(final int[] array) {
        final int[] array2 = A.va[(byte)(array[6] & 0xFF)];
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        switch (array2[0]) {
            case 452: {
                H(n, A.fe);
                D(array[4], array[5], 4096, A.fe[0], A.fe[1], 0);
                break;
            }
            case 458: {
                H(n, A.fe);
                B(array[4], array[5], 4096, A.fe[0], A.fe[1], 0);
                break;
            }
            case 448: {
                H(n, A.de);
                F(array[4], array[5], 4096, A.de[0], A.de[1], 0);
                break;
            }
        }
    }
    
    public static void H(final int n, final int[] array) {
        if (A.rD[n] != null) {
            B.A(A.rD[n], A.he);
        }
        else {
            A.he[0] = A.qD[n][9];
            A.he[1] = A.qD[n][10];
        }
        A.ge[0] = A.he[0] - A.qD[n][4];
        A.ge[1] = A.he[1] - A.qD[n][5];
        final int b = B(A.ge);
        array[0] = A.ge[0] * 2048 / (b + 1);
        array[1] = A.ge[1] * 2048 / (b + 1);
    }
    
    public static void B(final int n, final int[] array, final int[] array2) {
        if (array != null) {
            B.A(array, array2);
            array2[1] = B.A(array) + 1;
        }
        else {
            array2[0] = A.qD[n][9];
            array2[1] = A.qD[n][10];
        }
    }
    
    public static void J(final int n, final int n2, int i) {
        final int[] array = A.jA[A.wD];
        final int n3 = 3;
        array[n3] &= 0xFFFEFFFF;
        final int n4 = HG.A(512) - 256;
        final int n5 = HG.A(512) - 256;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = i;
        A.jA[A.wD][7] = n4;
        A.jA[A.wD][8] = n5;
        A.jA[A.wD][9] = 512;
        A.jA[A.wD][10] = 128;
        A.jA[A.wD][11] = 0;
        A.jA[A.wD][12] = HG.A();
        for (i = 0; i < 60; i += 6) {
            A.kA[A.wD][i + 0] = 0;
            A.kA[A.wD][i + 1] = 0;
            A.kA[A.wD][i + 2] = 0;
            A.kA[A.wD][i + 3] = (short)(HG.A(128) - 64);
            A.kA[A.wD][i + 4] = (short)(HG.A(128) - 64);
            A.kA[A.wD][i + 5] = (short)(HG.A(128) - 64);
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void BA(final int[] array) {
        if (array[6] < 0) {
            return;
        }
        final int n = 4;
        array[n] += array[7];
        final int n2 = 5;
        array[n2] += array[8];
        final int n3 = 6;
        array[n3] += array[9];
        final int n4 = 9;
        array[n4] -= 128;
        final short n5 = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int i = 0; i < 60; i += 6) {
            final short[] array2 = A.kA[n5];
            final int n6 = i + 0;
            array2[n6] += A.kA[n5][i + 3];
            final short[] array3 = A.kA[n5];
            final int n7 = i + 1;
            array3[n7] += A.kA[n5][i + 4];
        }
    }
    
    public static void F(final int[] array, final Graphics graphics) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        final int n2 = (array[4] * B.d >> 12) - A.tB;
        final int n3 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        if (!HG.d) {
            graphics.setColor(124 * array[10] / 128 << 16 | 0 * array[10] / 128 << 8 | 0 * array[10] / 128);
            for (int i = 0; i < 60; i += 6) {
                graphics.fillRect(n2 + (A.kA[n][i + 0] * B.d >> 12), n3 + (A.kA[n][i + 1] * B.d >> 12) - (A.kA[n][i + 2] * B.d >> 12), 2, 2);
            }
        }
        else {
            final int n4 = array[10] * 255 / 128 << 24 | 0x7C0000 | 0x0 | 0x0;
            for (int j = 0; j < A.ie.length; ++j) {
                A.ie[j] = n4;
            }
            for (int k = 0; k < 60; k += 6) {
                graphics.drawRGB(A.ie, 0, 2, n2 + (A.kA[n][k + 0] * B.d >> 12), n3 + (A.kA[n][k + 1] * B.d >> 12) - (A.kA[n][k + 2] * B.d >> 12), 2, 2, true);
            }
        }
    }
    
    public static void K(final int n, final int n2, final int n3) {
        final int[] array = A.jA[A.wD];
        final int n4 = 3;
        array[n4] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = 0;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 20;
        A.jA[A.wD][11] = 14;
        A.jA[A.wD][12] = n3;
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        CA(A.jA[A.wD]);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void CA(final int[] array) {
        if (array[12] != -1) {
            B.A(B.a[array[12]], A.je);
            A.je[1] = B.A(B.a[array[12]]) + 1;
            array[4] = A.je[0];
            array[5] = A.je[1] + 1;
            int n = 8192;
            if ((B.a[array[12]][3] & 0x4) != 0x0) {
                n = -((D(B.a[array[12]], true)[1] << 12) / B.d);
            }
            array[6] = n;
        }
    }
    
    public static void G(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        int n3 = 0;
        switch (A.o >> 1 & 0x3) {
            case 0: {
                n3 = 0;
                break;
            }
            case 1: {
                n3 = 5;
                break;
            }
            case 2: {
                n3 = 3;
                break;
            }
            default: {
                n3 = 6;
                break;
            }
        }
        if (W(184)) {
            B(n, n2, 184, 0, 0, n3, graphics);
        }
    }
    
    public static void F(final int[] array, final boolean b) {
        final int[] array2 = A.jA[A.wD];
        final int n = 3;
        array2[n] &= 0xFFFEFFFF;
        B.C(array, A.oe);
        final int n2 = A.oe[0] + A.oe[2] >> 1;
        final int n3 = A.oe[1] + A.oe[3] >> 1;
        int n4 = 0;
        if ((array[3] & 0x4) != 0x0) {
            n4 = (G(array) & 0x3);
        }
        int n5 = 0;
        int n6 = 0;
        switch (n4) {
            case 0: {
                if (b) {
                    A.jA[A.wD][4] = A.oe[0];
                }
                else {
                    A.jA[A.wD][4] = A.oe[2];
                }
                A.jA[A.wD][5] = n3;
                n5 = 3;
                n6 = 6;
                break;
            }
            case 1: {
                A.jA[A.wD][4] = n2;
                if (b) {
                    A.jA[A.wD][5] = A.oe[3];
                }
                else {
                    A.jA[A.wD][5] = A.oe[1];
                    final int[] array3 = A.jA[A.wD];
                    final int n7 = 5;
                    array3[n7] += 12288 / B.d;
                }
                n5 = 6;
                n6 = 3;
                break;
            }
            case 2: {
                if (b) {
                    A.jA[A.wD][4] = A.oe[2];
                }
                else {
                    A.jA[A.wD][4] = A.oe[0];
                }
                A.jA[A.wD][5] = n3;
                n5 = 3;
                n6 = 6;
                break;
            }
            case 3: {
                A.jA[A.wD][4] = n2;
                if (b) {
                    A.jA[A.wD][5] = A.oe[1];
                    final int[] array4 = A.jA[A.wD];
                    final int n8 = 5;
                    array4[n8] += 12288 / B.d;
                }
                else {
                    A.jA[A.wD][5] = A.oe[3];
                }
                n5 = 6;
                n6 = 3;
                break;
            }
            default: {
                final int[] array5 = A.jA[A.wD];
                final int n9 = 3;
                array5[n9] |= 0x10000;
                return;
            }
        }
        final int n10 = 1 - HG.A(3);
        final int n11 = 1 - HG.A(3);
        final int[] array6 = A.jA[A.wD];
        final int n12 = 4;
        array6[n12] += (n10 << 12) / B.d;
        final int[] array7 = A.jA[A.wD];
        final int n13 = 5;
        array7[n13] += (n11 << 12) / B.d;
        A.jA[A.wD][6] = 0;
        A.jA[A.wD][7] = n4;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 64;
        A.jA[A.wD][11] = 2;
        A.jA[A.wD][12] = (((short)n5 & 0xFFFF) | ((short)n6 << 16 & 0xFFFF0000));
        B.A(A.jA[A.wD], (int)(short)(array[0] & 0xFFFF), (int)(short)((array[0] & 0xFFFF0000) >> 16));
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void DA(final int[] array) {
    }
    
    public static void H(final int[] array, final Graphics graphics) {
        int n = (short)(array[12] & 0xFFFF);
        int n2 = (short)((array[12] & 0xFFFF0000) >> 16);
        final int n3 = array[7];
        final int n4 = (array[4] * B.d >> 12) - A.tB;
        final int n5 = (array[5] * B.d >> 12) - A.uB;
        if (HG.d) {
            int[] array2 = null;
            switch (n3) {
                case 0: {
                    n = 3;
                    n2 = 6;
                    array2 = A.ke;
                    break;
                }
                case 1: {
                    n = 6;
                    n2 = 3;
                    array2 = A.le;
                    break;
                }
                case 2: {
                    n = 3;
                    n2 = 6;
                    array2 = A.me;
                    break;
                }
                case 3: {
                    n = 6;
                    n2 = 3;
                    array2 = A.ne;
                    break;
                }
            }
            for (int i = 0; i < array2.length; ++i) {
                A.pe[i] = (array[10] * (array2[i] & 0xFF) / 64 << 24 | (array2[i] >> 8 & 0xFFFFFF));
            }
            graphics.drawRGB(A.pe, 0, n, n4 - (n >> 1), n5 - (n2 >> 1), n, n2, true);
        }
        else {
            graphics.setColor((96 * array[10] + 147 * (64 - array[10])) / 64 << 16 | (101 * array[10] + 151 * (64 - array[10])) / 64 << 8 | (111 * array[10] + 162 * (64 - array[10])) / 64);
            graphics.fillRect(n4, n5, n, n2);
        }
    }
    
    public static void B(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        A(n, n2, n3, n4, n5, n6, 10);
    }
    
    public static void A(final int n, final int n2, int i, final int n3, final int n4, final int n5, int n6) {
        if (n6 > 10) {
            n6 = 10;
        }
        final int[] array = A.jA[A.wD];
        final int n7 = 3;
        array[n7] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = i;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 10;
        A.jA[A.wD][11] = 3;
        A.jA[A.wD][12] = n6;
        A.qe[0] = n3;
        A.qe[1] = n4;
        A.qe[2] = n5;
        final int b = B(A.qe);
        for (i = 0; i < n6 * 6; i += 6) {
            A.kA[A.wD][i + 0] = (short)(n3 * i / 60);
            A.kA[A.wD][i + 1] = (short)(n4 * i / 60);
            A.kA[A.wD][i + 2] = (short)(n5 * i / 60);
            A.kA[A.wD][i + 3] = (short)(HG.A(b >> 3) - (b >> 4));
            A.kA[A.wD][i + 4] = (short)(HG.A(b >> 3) - (b >> 4));
            A.kA[A.wD][i + 5] = (short)(HG.A(b >> 3) - (b >> 4));
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void EA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int n2 = array[12], i = 0; i < n2 * 6; i += 6) {
            final short[] array2 = A.kA[n];
            final int n3 = i + 0;
            array2[n3] += (short)(HG.A(128) - 64 + A.kA[n][i + 3]);
            final short[] array3 = A.kA[n];
            final int n4 = i + 1;
            array3[n4] += (short)(HG.A(128) - 64 + A.kA[n][i + 4]);
            final short[] array4 = A.kA[n];
            final int n5 = i + 2;
            array4[n5] += (short)(HG.A(128) - 64 + A.kA[n][i + 5]);
        }
    }
    
    public static void I(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        final int n4 = array[12];
        if (!HG.d) {
            if (!W(175)) {
                return;
            }
            for (int i = 0; i < n4 * 6; i += 6) {
                B(n + (A.kA[n3][i + 0] * B.d >> 12), n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12), 175, HG.A((int)A.cc[1927]), graphics);
            }
        }
        else {
            for (int j = 0; j < A.se.length; ++j) {
                A.re[j] = (array[10] * (A.se[j] & 0xFF) / 10 << 24 | (A.se[j] >> 8 & 0xFFFFFF));
            }
            for (int k = 0; k < n4 * 6; k += 6) {
                graphics.drawRGB(A.re, 0, 3, n + (A.kA[n3][k + 0] * B.d >> 12), n2 + (A.kA[n3][k + 1] * B.d >> 12) - (A.kA[n3][k + 2] * B.d >> 12), 3, 3, true);
            }
        }
    }
    
    public static void C(final int n, final int n2, int i, final int n3, final int n4, final int n5) {
        final int[] array = A.jA[A.wD];
        final int n6 = 3;
        array[n6] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = i;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 15;
        A.jA[A.wD][11] = 4;
        A.jA[A.wD][12] = HG.A();
        A.te[0] = n3;
        A.te[1] = n4;
        A.te[2] = n5;
        for (i = 0; i < 60; i += 6) {
            A.kA[A.wD][i + 0] = (short)HG.A(2048);
            A.kA[A.wD][i + 1] = (short)HG.A(2048);
            A.kA[A.wD][i + 2] = (short)HG.A(2048);
            A.kA[A.wD][i + 3] = (short)((n3 >> 2) + (HG.A(512) - 256));
            A.kA[A.wD][i + 4] = (short)((n4 >> 2) + (HG.A(512) - 256));
            A.kA[A.wD][i + 5] = (short)((n5 >> 2) + (HG.A(512) - 256));
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void FA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int i = 0; i < 60; i += 6) {
            final short[] array2 = A.kA[n];
            final int n2 = i + 0;
            array2[n2] += (short)(HG.A(128) - 64 + A.kA[n][i + 3]);
            final short[] array3 = A.kA[n];
            final int n3 = i + 1;
            array3[n3] += (short)(HG.A(128) - 64 + A.kA[n][i + 4]);
            final short[] array4 = A.kA[n];
            final int n4 = i + 2;
            array4[n4] += (short)(HG.A(128) - 64 + A.kA[n][i + 5]);
        }
    }
    
    public static void J(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        if (!HG.d) {
            if (!W(175)) {
                return;
            }
            for (int i = 0; i < 60; i += 6) {
                B(n + (A.kA[n3][i + 0] * B.d >> 12), n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12), 175, HG.A((int)A.cc[1927]), graphics);
            }
        }
        else {
            for (int j = 0; j < A.ve.length; ++j) {
                A.ue[j] = (array[10] * (A.ve[j] & 0xFF) / 15 << 24 | (A.ve[j] >> 8 & 0xFFFFFF));
            }
            for (int k = 0; k < 60; k += 6) {
                graphics.drawRGB(A.ue, 0, 3, n + (A.kA[n3][k + 0] * B.d >> 12), n2 + (A.kA[n3][k + 1] * B.d >> 12) - (A.kA[n3][k + 2] * B.d >> 12), 3, 3, true);
            }
        }
    }
    
    public static void Q(final int[] array, final int n) {
        final int[] array2 = A.jA[A.wD];
        final int n2 = 3;
        array2[n2] &= 0xFFFEFFFF;
        if (n != -1 && (B.a[n][3] & 0x4) != 0x0) {
            final int[] array3 = A.jA[A.wD];
            final int n3 = 3;
            array3[n3] |= 0x10000;
            return;
        }
        A.jA[A.wD][4] = array[4];
        A.jA[A.wD][5] = array[5];
        A.jA[A.wD][6] = array[8];
        A.jA[A.wD][7] = array[6];
        A.jA[A.wD][8] = array[7];
        A.jA[A.wD][9] = n;
        A.jA[A.wD][10] = 128;
        A.jA[A.wD][11] = 1;
        A.jA[A.wD][12] = (short)(array[14] & 0xFFFF);
        B.A(A.jA[A.wD], array[4] >> 12, array[5] >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void GA(final int[] array) {
        final short n = (short)(array[9] & 0xFFFF);
        if (n != -1) {
            B.A(array, (int)(short)(B.a[n][0] & 0xFFFF), (int)(short)((B.a[n][0] & 0xFFFF0000) >> 16));
        }
    }
    
    public static void K(final int[] array, final Graphics graphics) {
        int n = array[4];
        int n2 = array[5];
        int n3 = array[7];
        int n4 = array[8];
        final short n5 = (short)(array[9] & 0xFFFF);
        if (n5 != -1 && (B.a[n5][3] & 0x4) != 0x0) {
            B.A(B.a[n5], A.we);
            int n6 = 0;
            int n7 = 0;
            int n8 = 0;
            int n9 = 0;
            switch (G(B.a[n5]) & 0x3) {
                case 0: {
                    n6 = array[4];
                    n7 = array[5];
                    n8 = array[7];
                    n9 = array[8];
                    break;
                }
                case 1: {
                    n6 = -array[5];
                    n7 = array[4];
                    n8 = -array[8];
                    n9 = array[7];
                    break;
                }
                case 2: {
                    n6 = -array[4];
                    n7 = -array[5];
                    n8 = -array[7];
                    n9 = -array[8];
                    break;
                }
                case 3: {
                    n6 = array[5];
                    n7 = -array[4];
                    n8 = array[8];
                    n9 = -array[7];
                    break;
                }
            }
            final int n10 = n6 + A.we[0];
            final int n11 = n7 + A.we[1];
            final int n12 = n8 + A.we[0];
            final int n13 = n9 + A.we[1];
            n = n10;
            n2 = n11;
            n3 = n12;
            n4 = n13;
        }
        switch (array[12]) {
            case 0: {
                B(n, n2, n3, n4, array[6], graphics);
                break;
            }
            case 1: {
                A(n, n2, n3, n4, array[6], graphics);
                break;
            }
        }
    }
    
    public static void D(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        B(n, n2, n3, n4, n5, n6, 10);
    }
    
    public static void B(final int n, final int n2, int i, final int n3, final int n4, final int n5, int n6) {
        if (n6 > 10) {
            n6 = 10;
        }
        final int[] array = A.jA[A.wD];
        final int n7 = 3;
        array[n7] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = i;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 16;
        A.jA[A.wD][11] = 5;
        A.jA[A.wD][12] = n6;
        A.xe[0] = n3;
        A.xe[1] = n4;
        A.xe[2] = n5;
        final int b = B(A.xe);
        for (i = 0; i < n6 * 6; i += 6) {
            A.kA[A.wD][i + 0] = (short)(n3 * i / 60 + HG.A(b >> 1));
            A.kA[A.wD][i + 1] = (short)(n4 * i / 60 + HG.A(b >> 1));
            A.kA[A.wD][i + 2] = (short)(n5 * i / 60 + HG.A(b >> 1));
            A.kA[A.wD][i + 3] = (short)(160 - HG.A(10));
            A.kA[A.wD][i + 4] = 0;
            A.kA[A.wD][i + 5] = 0;
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void HA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int n2 = array[12], i = 0; i < n2 * 6; i += 6) {
            final short[] array2 = A.kA[n];
            final int n3 = i + 0;
            array2[n3] += (short)(HG.A(256) - 128);
            final short[] array3 = A.kA[n];
            final int n4 = i + 1;
            array3[n4] += (short)(HG.A(256) - 128);
            final short[] array4 = A.kA[n];
            final int n5 = i + 2;
            array4[n5] += (short)HG.A(256);
            final short[] array5 = A.kA[n];
            final int n6 = i + 3;
            array5[n6] -= (short)(10 + HG.A(10));
        }
    }
    
    public static void L(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        int n4 = 0;
        for (int n5 = array[12], i = 0; i < n5 * 6; i += 6) {
            final short n6 = A.kA[n3][i + 3];
            if (n6 >= 0) {
                int color;
                if (n6 > 80) {
                    color = (0xFF0000 | 255 - 255 * (n6 - 80) / 160 << 8);
                }
                else if (!HG.d) {
                    final int n7 = 255 * n6 / 160;
                    color = (n7 << 16 | n7 << 8 | n7);
                }
                else {
                    color = 0;
                }
                final int n8 = n + (A.kA[n3][i + 0] * B.d >> 12);
                final int n9 = n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12);
                if (!HG.d) {
                    graphics.setColor(color);
                    graphics.fillRect(n8, n9, 2, 2);
                }
                else {
                    for (int j = 0; j < A.ze.length; ++j) {
                        A.ye[j] = (n6 * (A.ze[j] & 0xFF) / 160 << 24 | (color & 0xFFFFFF));
                    }
                    graphics.drawRGB(A.ye, 0, 3, n8, n9, 3, 3, true);
                }
                ++n4;
            }
        }
    }
    
    public static void E(final int n, final int n2, int i, final int n3, final int n4, final int n5) {
        final int[] array = A.jA[A.wD];
        final int n6 = 3;
        array[n6] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = i;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 24;
        A.jA[A.wD][11] = 6;
        A.jA[A.wD][12] = 0;
        A.aE[0] = n3;
        A.aE[1] = n4;
        A.aE[2] = n5;
        for (i = 0; i < 60; i += 6) {
            A.kA[A.wD][i + 0] = (short)HG.A(2048);
            A.kA[A.wD][i + 1] = (short)HG.A(2048);
            A.kA[A.wD][i + 2] = (short)HG.A(2048);
            A.kA[A.wD][i + 3] = (short)(HG.A(512) - 256);
            A.kA[A.wD][i + 4] = (short)(HG.A(512) - 256);
            A.kA[A.wD][i + 5] = (short)(240 - HG.A(10));
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void IA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        if (A.jA[n][10] > 12) {
            for (int i = 0; i < 60; i += 6) {
                final short[] array2 = A.kA[n];
                final int n2 = i + 0;
                array2[n2] += (short)((A.jA[n][10] - 12) * (HG.A(512) - 256 + A.kA[n][i + 3]) / 12);
                final short[] array3 = A.kA[n];
                final int n3 = i + 1;
                array3[n3] += (short)((A.jA[n][10] - 12) * (HG.A(512) - 256 + A.kA[n][i + 4]) / 12);
                final short[] array4 = A.kA[n];
                final int n4 = i + 2;
                array4[n4] += (short)HG.A(256);
                final short[] array5 = A.kA[n];
                final int n5 = i + 5;
                array5[n5] -= 10;
            }
        }
        else {
            for (int j = 0; j < 60; j += 6) {
                final short[] array6 = A.kA[n];
                final int n6 = j + 2;
                array6[n6] += (short)HG.A(256);
                final short[] array7 = A.kA[n];
                final int n7 = j + 5;
                array7[n7] -= 10;
            }
        }
    }
    
    public static void M(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        int n4 = 0;
        for (int i = 0; i < 60; i += 6) {
            final short n5 = A.kA[n3][i + 5];
            if (n5 >= 0) {
                int color;
                if (n5 > 120) {
                    color = (0xFF0000 | 255 - 255 * (n5 - 120) / 240 << 8);
                }
                else if (!HG.d) {
                    final int n6 = 255 * n5 / 240;
                    color = (n6 << 16 | n6 << 8 | n6);
                }
                else {
                    color = 0;
                }
                final int n7 = n + (A.kA[n3][i + 0] * B.d >> 12);
                final int n8 = n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12);
                if (!HG.d) {
                    graphics.setColor(color);
                    graphics.fillRect(n7, n8, 2, 2);
                }
                else {
                    for (int j = 0; j < A.cE.length; ++j) {
                        A.bE[j] = (n5 * (A.cE[j] & 0xFF) / 240 << 24 | (color & 0xFFFFFF));
                    }
                    graphics.drawRGB(A.bE, 0, 3, n7, n8, 3, 3, true);
                }
                ++n4;
            }
        }
    }
    
    public static void F(final int n, final int n2, int i, final int n3, final int n4, final int n5) {
        final int[] array = A.jA[A.wD];
        final int n6 = 3;
        array[n6] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = i;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 16;
        A.jA[A.wD][11] = 7;
        A.jA[A.wD][12] = HG.A(10);
        A.dE[0] = n3;
        A.dE[1] = n4;
        A.dE[2] = n5;
        B(A.dE);
        for (i = 0; i < 30; i += 6) {
            A.kA[A.wD][i + 0] = (short)(n3 * i / 30 + (HG.A(4096) - 2048));
            A.kA[A.wD][i + 1] = (short)(n4 * i / 30 + (HG.A(4096) - 2048));
            A.kA[A.wD][i + 2] = (short)(n5 * i / 30 + (HG.A(4096) - 2048));
            A.kA[A.wD][i + 3] = (short)(80 - HG.A(5));
            A.kA[A.wD][i + 4] = 0;
            A.kA[A.wD][i + 5] = 0;
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void JA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int i = 0; i < 30; i += 6) {
            final short[] array2 = A.kA[n];
            final int n2 = i + 0;
            array2[n2] += (short)(HG.A(256) - 128);
            final short[] array3 = A.kA[n];
            final int n3 = i + 1;
            array3[n3] += (short)(HG.A(256) - 128);
            final short[] array4 = A.kA[n];
            final int n4 = i + 2;
            array4[n4] += (short)HG.A(256);
            final short[] array5 = A.kA[n];
            final int n5 = i + 3;
            array5[n5] -= (short)(5 + HG.A(5));
        }
    }
    
    public static void N(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        int n4 = 0;
        for (int i = 0; i < 30; i += 6) {
            final short n5 = A.kA[n3][i + 3];
            if (n5 >= 0) {
                final int n6 = n + (A.kA[n3][i + 0] * B.d >> 12);
                final int n7 = n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12);
                if (!HG.d) {
                    graphics.setColor((0 * n5 + 0 * (80 - n5)) / 80 << 16 | (190 * n5 + 76 * (80 - n5)) / 80 << 8 | (0 * n5 + 0 * (80 - n5)) / 80);
                    graphics.fillRect(n6, n7, 3, 3);
                }
                else {
                    for (int j = 0; j < A.fE.length; ++j) {
                        final int n8 = A.fE[j] >> 8 & 0xFF;
                        A.eE[j] = (n5 * (A.fE[j] & 0xFF) / 80 << 24 | ((n8 * 0 >> 8 << 16 | n8 * 190 >> 8 << 8 | n8 * 0 >> 8) & 0xFFFFFF));
                    }
                    graphics.drawRGB(A.eE, 0, 5, n6, n7, 5, 6, true);
                }
                ++n4;
            }
        }
    }
    
    public static void E(final int n, final int n2, final int n3, final int n4) {
        final int[] array = A.jA[A.wD];
        final int n5 = 3;
        array[n5] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = n3;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 16;
        A.jA[A.wD][11] = 8;
        A.jA[A.wD][12] = n4;
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void KA(final int[] array) {
        if (array[12] != -1) {
            B.A(B.a[array[12]], A.gE);
            A.gE[1] = B.A(B.a[array[12]]) + 1;
            array[4] = A.gE[0];
            array[5] = A.gE[1] + 1;
        }
    }
    
    public static void O(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        if (!HG.d) {
            if (W(177)) {
                B(n, n2, 177, 0, graphics);
            }
        }
        else {
            for (int i = 0; i < A.iE.length; ++i) {
                final int n3 = A.iE[i] >> 8 & 0xFF;
                A.hE[i] = ((255 - 255 * E(8 - array[10]) / 8) * (A.iE[i] & 0xFF) >> 8 << 24 | ((n3 * 0 >> 8 << 16 | n3 * 190 >> 8 << 8 | n3 * 0 >> 8) & 0xFFFFFF));
            }
            graphics.drawRGB(A.hE, 0, 16, n - 8, n2 - 8, 16, 16, true);
        }
    }
    
    public static void L(final int n, final int n2, int i) {
        final int[] array = A.jA[A.wD];
        final int n3 = 3;
        array[n3] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = 0;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 24;
        A.jA[A.wD][11] = 9;
        A.jA[A.wD][12] = i;
        for (i = 0; i < 60; i += 6) {
            A.kA[A.wD][i + 0] = (short)(HG.A(4096) - 2048);
            A.kA[A.wD][i + 1] = (short)(HG.A(4096) - 2048);
            A.kA[A.wD][i + 2] = (short)(HG.A(8192) + 0);
            A.kA[A.wD][i + 3] = 0;
            A.kA[A.wD][i + 4] = 0;
            A.kA[A.wD][i + 5] = 0;
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void LA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int i = 0; i < 60; i += 6) {
            final short[] array2 = A.kA[n];
            final int n2 = i + 2;
            array2[n2] += 256;
            if (A.kA[n][i + 2] > 8192) {
                A.kA[n][i + 2] = (short)(0 + HG.A(256));
            }
        }
        if (array[12] != -1) {
            B.A(B.a[array[12]], A.jE);
            A.jE[1] = B.A(B.a[array[12]]) + 1;
            array[4] = A.jE[0];
            array[5] = A.jE[1] + 1;
        }
    }
    
    public static void P(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        if (!HG.d) {
            for (int i = 0; i < 60; i += 6) {
                final int n4 = (8192 - A.kA[n3][i + 2] - 0) * array[10];
                graphics.setColor((210 * n4 + 113 * (196608 - n4)) / 196608 << 16 | (255 * n4 + 141 * (196608 - n4)) / 196608 << 8 | (253 * n4 + 140 * (196608 - n4)) / 196608);
                graphics.fillRect(n + (A.kA[n3][i + 0] * B.d >> 12), n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12), 1, 8);
            }
        }
        else {
            for (int j = 0; j < 60; j += 6) {
                for (int k = 0; k < A.lE.length; ++k) {
                    A.kE[k] = ((8192 - A.kA[n3][j + 2] - 0) * array[10] * (A.lE[k] & 0xFF) / 196608 << 24 | (A.lE[k] >> 8 & 0xFFFFFF));
                }
                graphics.drawRGB(A.kE, 0, 1, n + (A.kA[n3][j + 0] * B.d >> 12), n2 + (A.kA[n3][j + 1] * B.d >> 12) - (A.kA[n3][j + 2] * B.d >> 12) - 8, 1, 8, true);
            }
        }
    }
    
    public static void S(final int n, final int n2) {
        final int[] array = A.jA[A.wD];
        final int n3 = 3;
        array[n3] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n + HG.A(8192) - 4096;
        A.jA[A.wD][5] = n2 + HG.A(8192) - 4096;
        A.jA[A.wD][6] = 16384;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 40;
        A.jA[A.wD][11] = 10;
        A.jA[A.wD][12] = 0;
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void MA(final int[] array) {
        if (array[6] < 0) {
            return;
        }
        final int n = array[4] + (array[6] >> 1);
        final int n2 = array[5];
        final int n3 = array[6];
        final int n4 = 6;
        array[n4] -= 2048;
        D(n, n2, n3, array[4] + (array[6] >> 1) - n, array[5] - n2, array[6] - n3);
        if (array[6] < 0) {
            E(n, n2, n3, array[4] - n, array[5] - n2, array[6] - n3);
        }
    }
    
    public static void Q(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) + (array[6] * B.d >> 12 >> 1) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        if (array[6] < 0) {
            return;
        }
        final int n3 = n;
        final int n4 = n2;
        final int n5 = n + (-2048 * B.d >> 12 >> 1);
        final int n6 = n2 - (-2048 * B.d >> 12);
        if (W(173)) {
            A(n3, n4, 173, 0, 0, n5 - n3, n6 - n4, graphics);
        }
    }
    
    public static void M(final int n, final int n2, final int n3) {
        int n4 = 8192;
        if (n3 != -1 && (B.a[n3][3] & 0x4) != 0x0) {
            n4 = -((D(B.a[n3], true)[1] << 12) / B.d);
        }
        final int[] array = A.jA[A.wD];
        final int n5 = 3;
        array[n5] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = n4;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 512;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 20;
        A.jA[A.wD][11] = 11;
        A.jA[A.wD][12] = n3;
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void NA(final int[] array) {
        final int n = 6;
        array[n] += 512;
        final int n2 = 7;
        array[n2] += array[8];
        if (array[7] < 0) {
            final int n3 = 8;
            array[n3] += 128;
        }
        else {
            final int n4 = 8;
            array[n4] -= 128;
        }
    }
    
    public static void R(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) + (array[7] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        if (!HG.d) {
            if (W(178)) {
                B(n, n2, 178, 0, graphics);
            }
        }
        else {
            for (int i = 0; i < A.nE.length; ++i) {
                final int n3 = A.nE[i] >> 8 & 0xFF;
                A.mE[i] = ((255 - 255 * E(10 - array[10]) / 10) * (A.nE[i] & 0xFF) >> 8 << 24 | ((n3 * 84 >> 8 << 16 | n3 * 76 >> 8 << 8 | n3 * 255 >> 8) & 0xFFFFFF));
            }
            graphics.drawRGB(A.mE, 0, 4, n - 2, n2 - 2, 4, 4, true);
        }
    }
    
    public static void T(final int n, final int n2) {
        final int[] array = A.jA[A.wD];
        final int n3 = 3;
        array[n3] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2 - 8192;
        if (A.jA[A.wD][5] < 0) {
            A.jA[A.wD][5] = 0;
        }
        A.jA[A.wD][6] = 0;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 10;
        A.jA[A.wD][11] = 12;
        A.jA[A.wD][12] = 0;
        for (int i = 0; i < 60; i += 6) {
            A.kA[A.wD][i + 0] = (short)(HG.A(16384) - 8192);
            A.kA[A.wD][i + 1] = (short)HG.A(16384);
            A.kA[A.wD][i + 2] = 0;
            A.kA[A.wD][i + 3] = 0;
            A.kA[A.wD][i + 4] = 0;
            A.kA[A.wD][i + 5] = 0;
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void OA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int i = 0; i < 60; i += 6) {
            final short[] array2 = A.kA[n];
            final int n2 = i + 0;
            array2[n2] += (short)((HG.A(2) == 0) ? (4096 / B.d) : (-(4096 / B.d)));
        }
    }
    
    public static void S(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        if (!HG.d) {
            if (W(179)) {
                for (int i = 0; i < 60; i += 6) {
                    B(n + (A.kA[n3][i + 0] * B.d >> 12), n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12), 179, 0, graphics);
                }
            }
        }
        else {
            for (int j = 0; j < A.pE.length; ++j) {
                final int n4 = A.pE[j] >> 8 & 0xFF;
                A.oE[j] = ((255 - 255 * E(5 - array[10]) / 5) * (A.pE[j] & 0xFF) >> 8 << 24 | ((n4 * 84 >> 8 << 16 | n4 * 76 >> 8 << 8 | n4 * 255 >> 8) & 0xFFFFFF));
            }
            for (int k = 0; k < 60; k += 6) {
                graphics.drawRGB(A.oE, 0, 8, n + (A.kA[n3][k + 0] * B.d >> 12) - 4, n2 + (A.kA[n3][k + 1] * B.d >> 12) - (A.kA[n3][k + 2] * B.d >> 12) - 2, 8, 4, true);
            }
        }
    }
    
    public static void N(final int n, final int n2, int i) {
        final int[] array = A.jA[A.wD];
        final int n3 = 3;
        array[n3] &= 0xFFFEFFFF;
        A.jA[A.wD][4] = n;
        A.jA[A.wD][5] = n2;
        A.jA[A.wD][6] = 0;
        A.jA[A.wD][7] = 0;
        A.jA[A.wD][8] = 0;
        A.jA[A.wD][9] = 0;
        A.jA[A.wD][10] = 20;
        A.jA[A.wD][11] = 13;
        A.jA[A.wD][12] = i;
        for (i = 0; i < 60; i += 6) {
            A.kA[A.wD][i + 0] = (short)(HG.A(4096) - 2048);
            A.kA[A.wD][i + 1] = (short)(HG.A(4096) - 2048);
            A.kA[A.wD][i + 2] = (short)(HG.A(12288) + 0);
            A.kA[A.wD][i + 3] = 0;
            A.kA[A.wD][i + 4] = 0;
            A.kA[A.wD][i + 5] = 0;
        }
        B.A(A.jA[A.wD], n >> 12, n2 >> 12);
        ++A.wD;
        A.wD %= 64;
    }
    
    public static void PA(final int[] array) {
        final short n = (short)((array[2] & 0xFFFF0000) >> 16);
        for (int i = 0; i < 60; i += 6) {
            final short[] array2 = A.kA[n];
            final int n2 = i + 2;
            array2[n2] += 1024;
            if (A.kA[n][i + 2] > 12288) {
                A.kA[n][i + 2] = (short)(0 + HG.A(256));
            }
        }
        if (array[12] != -1) {
            B.A(B.a[array[12]], A.qE);
            A.qE[1] = B.A(B.a[array[12]]) + 1;
            array[4] = A.qE[0];
            array[5] = A.qE[1] + 1;
        }
    }
    
    public static void T(final int[] array, final Graphics graphics) {
        final int n = (array[4] * B.d >> 12) - A.tB;
        final int n2 = (array[5] * B.d >> 12) - (array[6] * B.d >> 12) - A.uB;
        final short n3 = (short)((array[2] & 0xFFFF0000) >> 16);
        if (!HG.d) {
            for (int i = 0; i < 60; i += 6) {
                final int n4 = (12288 - A.kA[n3][i + 2] - 0) * array[10];
                graphics.setColor((255 * n4 + 128 * (245760 - n4)) / 245760 << 16 | (255 * n4 + 128 * (245760 - n4)) / 245760 << 8 | (0 * n4 + 0 * (245760 - n4)) / 245760);
                graphics.fillRect(n + (A.kA[n3][i + 0] * B.d >> 12), n2 + (A.kA[n3][i + 1] * B.d >> 12) - (A.kA[n3][i + 2] * B.d >> 12), 1, 8);
            }
        }
        else {
            for (int j = 0; j < 60; j += 6) {
                for (int k = 0; k < A.sE.length; ++k) {
                    A.rE[k] = ((12288 - A.kA[n3][j + 2] - 0) * array[10] * (A.sE[k] & 0xFF) / 245760 << 24 | (A.sE[k] >> 8 & 0xFFFFFF));
                }
                graphics.drawRGB(A.rE, 0, 3, n + (A.kA[n3][j + 0] * B.d >> 12), n2 + (A.kA[n3][j + 1] * B.d >> 12) - (A.kA[n3][j + 2] * B.d >> 12) - 8, 3, 8, true);
            }
        }
    }
    
    public static void TB() {
        if (HA(3)) {
            try {
                HG.F(3);
                A.tE = HG.k.readLong();
                HG.h = null;
                HG.i = null;
                HG.j = null;
                HG.k = null;
            }
            catch (Exception ex) {
                HG.h = null;
                HG.i = null;
                HG.j = null;
                HG.k = null;
            }
        }
        if (HA(2)) {
            try {
                HG.F(2);
                A.uE = HG.k.readLong();
                HG.h = null;
                HG.i = null;
                HG.j = null;
                HG.k = null;
            }
            catch (Exception ex2) {
                HG.h = null;
                HG.i = null;
                HG.j = null;
                HG.k = null;
            }
        }
    }
    
    public static boolean FA(final int n) {
        try {
            HG.H();
            if (n == 3) {
                A.tE = System.currentTimeMillis();
                HG.i.writeLong(A.tE);
            }
            else {
                A.uE = System.currentTimeMillis();
                HG.i.writeLong(A.uE);
            }
            if (A.ca[11] == -1) {
                A.ca[11] = 0;
                A.ca[0] = ((A.cC[0][3] & 0xFFFF) | (A.cC[0][4] << 16 & 0xFFFF0000));
            }
            HG.A(A.ca);
            HG.A(A.na);
            HG.A(A.za);
            HG.A(A.aA);
            HG.A(A.bA);
            HG.A(A.cA);
            HG.A(A.dA);
            HG.A(A.eA);
            HG.A(A.fA);
            HG.A(A.gA);
            for (int i = 0; i < 6; ++i) {
                for (int j = 0; j < 15; ++j) {
                    HG.A(A.da[i][j]);
                }
            }
            for (int k = 0; k < 19; ++k) {
                HG.A(A.ya[k]);
            }
            HG.E(n);
        }
        catch (Exception ex) {
            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
            return false;
        }
        HG.h = null;
        HG.i = null;
        HG.j = null;
        HG.k = null;
        return true;
    }
    
    public static boolean GA(int i) {
        if (HA(i)) {
            try {
                HG.F(i);
                HG.k.readLong();
                A.ca = HG.G();
                A.na = HG.G();
                A.za = HG.G();
                A.aA = HG.G();
                A.bA = HG.G();
                A.cA = HG.G();
                A.dA = HG.G();
                A.eA = HG.G();
                A.fA = HG.G();
                A.gA = HG.G();
                A.da = new int[6][15][];
                for (int j = 0; j < 6; ++j) {
                    for (i = 0; i < 15; ++i) {
                        A.da[j][i] = HG.G();
                    }
                }
                A.ya = new int[19][];
                for (i = 0; i < 19; ++i) {
                    A.ya[i] = HG.G();
                }
                HG.h = null;
                HG.i = null;
                HG.j = null;
                HG.k = null;
                return true;
            }
            catch (Exception ex) {
                HG.h = null;
                HG.i = null;
                HG.j = null;
                HG.k = null;
                return false;
            }
        }
        return false;
    }
    
    public static boolean HA(final int n) {
        return HG.B(n);
    }
    
    public A(final HG a) {
        A.a = a;
        this.setFullScreenMode(true);
        A.f = ((Displayable)this).getWidth();
        A.g = ((Displayable)this).getHeight();
    }
    
    public void paint(final Graphics graphics) {
        C(graphics);
        if (HG.iA) {
            HG.C(graphics);
            if (!A.c) {
                if (A.id) {
                    Q(graphics);
                }
                if (A.oC) {
                    N(graphics);
                }
            }
        }
    }
    
    static void UB() {
        if (C(90) && (!A.pC || (A.pC && A.c))) {
            A.c = !A.c;
            if (A.c) {
                WB();
            }
            else {
                VB();
            }
        }
        if (A.c) {
            for (int i = 0; i < 20; ++i) {
                if (A.w[i] == 20) {
                    A.h = (A.h << 4) + i;
                    if (I()) {
                        A.h = 0L;
                    }
                }
            }
        }
        else if (A.oC) {
            XA();
        }
        else if (A.id) {
            DB();
        }
        else if (A.oD && !A.q) {
            GB();
        }
        else if (A.eb && !A.q) {
            T();
        }
        else if (A.db && !A.q) {
            U();
        }
        else if (HG.iA) {
            if (HG.jA >= 0 && HG.kA >= 0) {
                final short n = HG.hA[HG.jA][(HG.kA << 2) + 2];
                if (n == 107 || n == 106) {
                    if (C(61)) {
                        HG.S();
                    }
                    if (C(62)) {
                        HG.R();
                    }
                }
                else {
                    if (C(60)) {
                        HG.R();
                    }
                    if (C(55)) {
                        HG.S();
                    }
                }
            }
            if (HG.jA == 19) {
                if (C(61)) {
                    --HG.za;
                    if (HG.za < 0) {
                        HG.za = 5;
                    }
                    HG.kA = -1;
                    HG.B(HG.jA);
                }
                if (C(62)) {
                    ++HG.za;
                    if (HG.za >= 6) {
                        HG.za = 0;
                    }
                    HG.kA = -1;
                    HG.B(HG.jA);
                }
                if (HG.MA(6)) {
                    if (C(110) && HG.kA >= 0) {
                        HG.aA = (HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF);
                        HG.ra = A.da[HG.za][HG.aA];
                        boolean b = true;
                        if (HG.za == 2 && A.la[HG.ra[4]][3] == 0) {
                            b = false;
                        }
                        if (b) {
                            HG.DA(14);
                        }
                    }
                    if (C(111)) {
                        int n2;
                        if (HG.za == 5 || HG.za == 4 || A.ca[11] == 0) {
                            n2 = -1;
                        }
                        else if ((HG.fA & 0x1) != 0x0) {
                            n2 = 22;
                        }
                        else {
                            n2 = 13;
                        }
                        if (HG.kA >= 0 && n2 >= 0) {
                            HG.aA = (HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF);
                            HG.ra = A.da[HG.za][HG.aA];
                            HG.DA(n2);
                        }
                    }
                    if (C(112) && HG.kA >= 0) {
                        HG.aA = (HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF);
                        HG.ra = A.da[HG.za][HG.aA];
                        HG.la = B.F(HG.ra);
                        HG.DA(27);
                    }
                    if (C(114) && HG.kA >= 0) {
                        HG.aA = (HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF);
                        HG.ra = A.da[HG.za][HG.aA];
                        if (HG.za != 1 && HG.za != 5 && (HG.fA & 0x1) == 0x0 && (HG.za != 2 || A.la[HG.ra[4]][3] != 0)) {
                            HG.DA(15);
                        }
                    }
                }
            }
            else if (HG.jA == 21) {
                if (HG.MA(6)) {
                    if (C(112) && HG.kA >= 0) {
                        HG.ra = B.a[HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF];
                        HG.cA = HG.kA - 1;
                        HG.DA(27);
                    }
                    if (C(113) && HG.kA >= 0) {
                        HG.ra = B.a[HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF];
                        HG.cA = HG.kA - 1;
                        HG.DA(19);
                    }
                }
                if (HG.ma) {
                    if (C(61)) {
                        B.S();
                        HG.kA = -1;
                        HG.B(HG.jA);
                    }
                    if (C(62)) {
                        B.R();
                        HG.kA = -1;
                        HG.B(HG.jA);
                    }
                }
            }
            else if (HG.jA == 24) {
                if (HG.MA(6) && C(112)) {
                    HG.DA(6);
                    if (HG.jA == 20) {
                        HG.DA(6);
                    }
                }
            }
            else if (HG.jA == 23) {
                if (C(61)) {
                    --HG.na;
                    if (HG.na < 0) {
                        HG.na = 3;
                    }
                    HG.B(HG.jA);
                }
                if (C(62)) {
                    ++HG.na;
                    if (HG.na >= 4) {
                        HG.na = 0;
                    }
                    HG.B(HG.jA);
                }
            }
            else if (HG.jA == 25) {
                if (C(61)) {
                    --HG.dA;
                    if (HG.dA < 1) {
                        HG.dA = 2;
                    }
                    HG.B(HG.jA);
                }
                if (C(62)) {
                    ++HG.dA;
                    if (HG.dA >= 3) {
                        HG.dA = 1;
                    }
                    HG.B(HG.jA);
                }
            }
            if (C(80)) {
                if (HG.rA >= 0) {
                    HG.DA(HG.rA);
                }
                else {
                    HG.T();
                }
            }
            if (C(65)) {
                HG.T();
            }
            if (C(85)) {
                if (HG.sA >= 0) {
                    HG.DA(HG.sA);
                }
                else {
                    HG.U();
                }
            }
            if (C(109) && ((HG.fA & 0x2) != 0x0 || (HG.fA & 0x1) != 0x0)) {
                if (HG.jA == 21) {
                    HG.LA(19);
                }
                else if ((HG.fA & 0x1) != 0x0) {
                    HG.LA(21);
                }
            }
        }
        else if (C(50)) {
            HG.lA.removeAllElements();
            HG.LA(14);
            HG.iA = true;
        }
        else if (!A.q) {
            switch (A.s) {
                case 6: {
                    if (C(45)) {
                        if (A.zD >= 0) {
                            A(10, 0, 0, 0, 0, true);
                            A.r.A(HG.eb, A.zD, A.be, A.ce, false);
                            new Thread((Runnable)A.r).start();
                            break;
                        }
                        if ((short)(A.ca[12] & 0xFFFF) > 0) {
                            HG.lA.removeAllElements();
                            HG.LA(18);
                            HG.iA = true;
                            break;
                        }
                        break;
                    }
                    else {
                        if (C(65)) {
                            if (A.zD >= 0) {
                                A(10, 0, 0, 0, 0, true);
                                A.r.A(HG.eb, A.zD, A.be, A.ce, false);
                                new Thread((Runnable)A.r).start();
                                break;
                            }
                            if (A.ub >= 0 && A.gB == -1) {
                                switch (A.ub) {
                                    case 0: {
                                        I(A.tb);
                                        A.ub = -1;
                                        A.tb = -1;
                                        F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
                                        break;
                                    }
                                    case 1: {
                                        final short n3 = (short)((B.a[A.tb][2] & 0xFFFF0000) >> 16);
                                        final short n4 = (short)(A.ca[0] & 0xFFFF);
                                        final short n5 = (short)((A.ca[0] & 0xFFFF0000) >> 16);
                                        final short n6 = (short)(A.ea[n3][0] & 0xFFFF);
                                        final short n7 = (short)((A.ea[n3][0] & 0xFFFF0000) >> 16);
                                        if (n5 > n7) {
                                            final int[] array = A.ea[n3];
                                            final int n8 = 27;
                                            array[n8] &= 0xFFFF0000;
                                            final int[] array2 = A.ea[n3];
                                            final int n9 = 27;
                                            array2[n9] |= 0x2;
                                        }
                                        else if (n5 < n7) {
                                            final int[] array3 = A.ea[n3];
                                            final int n10 = 27;
                                            array3[n10] &= 0xFFFF0000;
                                            final int[] array4 = A.ea[n3];
                                            final int n11 = 27;
                                            array4[n11] |= 0x0;
                                        }
                                        else if (n4 < n6) {
                                            final int[] array5 = A.ea[n3];
                                            final int n12 = 27;
                                            array5[n12] &= 0xFFFF0000;
                                            final int[] array6 = A.ea[n3];
                                            final int n13 = 27;
                                            array6[n13] |= 0x3;
                                        }
                                        else {
                                            final int[] array7 = A.ea[n3];
                                            final int n14 = 27;
                                            array7[n14] &= 0xFFFF0000;
                                            final int[] array8 = A.ea[n3];
                                            final int n15 = 27;
                                            array8[n15] |= 0x1;
                                        }
                                        if (!A(9, n3, 0, 0, 0, false)) {
                                            final int n16 = A(B.a[A.tb])[13];
                                            int n17 = 0;
                                            int n18 = 114;
                                            A.pd = -1;
                                            if ((n16 & 0x8) != 0x0) {
                                                n17 = HG.A(114, 116);
                                                n18 = 125;
                                            }
                                            else if ((n16 & 0x4) != 0x0) {
                                                n17 = HG.A(111, 113);
                                                n18 = 114;
                                            }
                                            else if ((n16 & 0x2) != 0x0) {
                                                n17 = HG.A(108, 110);
                                                n18 = 116;
                                            }
                                            else if ((n16 & 0x1) != 0x0) {
                                                n17 = HG.A(104, 107);
                                                n18 = 116;
                                            }
                                            if (A(A.ea[n3])[0] == 149) {
                                                n18 = 123;
                                            }
                                            A.gD = true;
                                            A(n18, n17, null);
                                            break;
                                        }
                                        break;
                                    }
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6: {
                                        int e = B.E();
                                        final byte b2 = (byte)(B.a[A.tb][8] >> 8 & 0xFF);
                                        if ((e & 1 << b2) == 0x0) {
                                            final byte b3 = (byte)(B.a[A.tb][8] >> 16 & 0xFF);
                                            byte b4 = (byte)(B.a[A.tb][8] >> 24 & 0xFF);
                                            if ((e & 1 << b2 + 1) != 0x0) {
                                                if (b3 > 0) {
                                                    for (int j = 0; j < A.da[5].length; ++j) {
                                                        final int n19 = A.da[5][j][4];
                                                        if (n19 >= 0 && A.oa[n19][4] == b3) {
                                                            e |= 1 << b2;
                                                            A(12, 7, (short)((B.a[A.tb][2] & 0xFFFF0000) >> 16), (byte)(B.a[A.tb][8] & 0xFF), 0, false);
                                                            E(B.a[A.tb], false);
                                                            if ((byte)(B.a[A.tb][8] & 0xFF) == 5) {
                                                                final int[] array9 = B.a[A.tb];
                                                                final int n20 = 3;
                                                                array9[n20] |= 0x8000;
                                                                A(B.a[A.tb], true);
                                                                A.bc = true;
                                                            }
                                                            HG.M(9);
                                                            b4 = 0;
                                                            B.B(e);
                                                            break;
                                                        }
                                                    }
                                                    if ((e & 1 << b2) == 0x0) {
                                                        HG.M(31);
                                                        A(12, 7, (short)((B.a[A.tb][2] & 0xFFFF0000) >> 16), 1, 0, false);
                                                    }
                                                }
                                                if (b4 > 0) {
                                                    BA(A.tb);
                                                    if (A.mD == 0) {
                                                        HG.M(31);
                                                    }
                                                }
                                            }
                                            else if (b3 > 0 || b4 > 0) {
                                                e |= 1 << b2 + 1;
                                                A(12, 7, (short)((B.a[A.tb][2] & 0xFFFF0000) >> 16), 1, 0, false);
                                                HG.M(31);
                                            }
                                            else {
                                                e |= 1 << b2;
                                                A(12, 7, (short)((B.a[A.tb][2] & 0xFFFF0000) >> 16), (byte)(B.a[A.tb][8] & 0xFF), 0, false);
                                                E(B.a[A.tb], false);
                                                if ((byte)(B.a[A.tb][8] & 0xFF) == 5) {
                                                    final int[] array10 = B.a[A.tb];
                                                    final int n21 = 3;
                                                    array10[n21] |= 0x8000;
                                                    A(B.a[A.tb], true);
                                                    A.bc = true;
                                                }
                                                HG.M(9);
                                            }
                                        }
                                        B.B(e);
                                        F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
                                        break;
                                    }
                                    case 7: {
                                        if (!A(12, 7, (short)((B.a[A.tb][2] & 0xFFFF0000) >> 16), 8, 0, false)) {
                                            if ((B.a[A.tb][3] & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) == 0x0) {
                                                HG.bA = B.Q();
                                            }
                                            else {
                                                HG.bA = 0;
                                            }
                                            HG.lA.removeAllElements();
                                            HG.LA(21);
                                            HG.iA = true;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                D();
                                F();
                            }
                        }
                        if (C(35)) {
                            A.eB = true;
                        }
                        if (C(15)) {
                            A.cB = true;
                        }
                        if (C(20)) {
                            A.dB = true;
                        }
                        if (C(25)) {
                            A.aB = true;
                        }
                        if (C(30)) {
                            A.bB = true;
                        }
                        if (C(33)) {
                            A.aB = true;
                            A.cB = true;
                        }
                        if (C(34)) {
                            A.aB = true;
                            A.dB = true;
                        }
                        if (C(31)) {
                            A.bB = true;
                            A.cB = true;
                        }
                        if (C(32)) {
                            A.bB = true;
                            A.dB = true;
                        }
                        if (C(100)) {
                            A.fB = true;
                        }
                        if (C(95) && (short)(A.ca[12] & 0xFFFF) > 0) {
                            A.db = true;
                            Q();
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
        }
        E();
    }
    
    public void hideNotify() {
        WB();
    }
    
    public void showNotify() {
    }
    
    public static void VB() {
        A.c = false;
        HG.N();
        A.h = 0L;
    }
    
    public static void WB() {
        if (A.s > 3) {
            A.c = true;
        }
        if (HG.MA(1)) {
            HG.M();
        }
        else {
            HG.L();
        }
    }
    
    public void run() {
        while (A.b) {
            UB();
            if (!A.c) {
                this.C();
            }
            this.repaint();
            this.serviceRepaints();
            final long n = System.currentTimeMillis() - A.d;
            ++A.o;
            if (A.o == 100000) {
                A.o = 0;
            }
            if (n < 80L) {
                try {
                    Thread.sleep(80L - n);
                }
                catch (Exception ex) {}
            }
            A.d = System.currentTimeMillis();
        }
        for (int i = 0; i < A.u; ++i) {
            final int b = B(A.t[i][0]);
            if (A.v[b] == 5) {
                A.v[b] = 10;
            }
        }
    }
    
    public void sizeChanged(final int f, final int g) {
        A.f = f;
        A.g = g;
    }
    
    public void IA(final int n) {
        Runtime.getRuntime();
        HG.I();
        HG.n[4] = true;
        String s = System.getProperty("microedition.locale");
        if (s != null) {
            s = s.toUpperCase();
        }
        HG.B(s);
        YA();
        A.rA = HG.I(396);
        A.sA = HG.I(407);
        A.sA = A.sA + "\n" + HG.I(408);
        A.sA = A.sA + " " + HG.I(298);
        HG.B();
        TB();
        switch (n) {
            case 1: {
                MA();
                RA();
                HG.K();
                W(159);
                break;
            }
        }
    }
    
    static {
        A.b = true;
        A.c = false;
        A.e = null;
        A.f = 0;
        A.g = 0;
        A.h = 0L;
        A.k = 0L;
        A.l = -1L;
        A.m = null;
        A.n = 0;
        A.o = 0;
        A.p = false;
        A.q = false;
        A.s = -1;
        t = new byte[][] { { 15, 15, 0, 7 }, { 20, 15, 3, 13 }, { 25, 15, 1, 9 }, { 30, 15, 2, 11 }, { 31, 15, 8 }, { 32, 15, 14 }, { 33, 15, 6 }, { 34, 15, 12 }, { 35, 15, 4, 10 }, { 50, 0, 17 }, { 45, 0, 18 }, { 40, 0, 5 }, { 55, 0, 0, 7 }, { 60, 0, 3, 13 }, { 61, 0, 1, 9 }, { 62, 0, 2, 11 }, { 65, 0, 4, 10 }, { 85, 0, 17 }, { 80, 0, 18 }, { 90, 0, 5 }, { 95, 0, 15 }, { 100, 0, 16 }, { 101, 0, 6 }, { 102, 0, 7 }, { 103, 0, 8 }, { 104, 0, 9 }, { 115, 0, 10 }, { 105, 0, 11 }, { 106, 0, 12 }, { 107, 0, 13 }, { 108, 0, 14 }, { 109, 0, 16 }, { 110, 0, 6 }, { 111, 0, 8 }, { 112, 0, 12 }, { 113, 0, 14 }, { 114, 0, 15 }, { 116, 15, 0 }, { 117, 15, 3 }, { 118, 0, 5 } };
        A.u = A.t.length;
        A.v = new byte[A.u];
        A.w = new byte[20];
        A.x = new byte[20];
        A.y = new short[165];
        A.z = new short[45];
        A.aa = new short[15];
        A.ba = new String[1];
        A.ca = null;
        A.da = null;
        A.ea = null;
        A.fa = null;
        A.ga = null;
        A.ha = null;
        A.ia = null;
        A.ja = null;
        A.ka = null;
        A.la = null;
        A.ma = null;
        A.na = null;
        A.oa = null;
        A.pa = null;
        A.qa = null;
        A.ra = null;
        A.sa = null;
        A.ta = null;
        A.ua = null;
        A.va = null;
        A.wa = null;
        A.xa = null;
        A.ya = null;
        A.za = null;
        A.aA = null;
        A.bA = null;
        A.cA = null;
        A.dA = null;
        A.eA = null;
        A.fA = null;
        A.gA = null;
        A.hA = null;
        A.iA = null;
        final short[][] array = null;
        A.jA = null;
        A.kA = null;
        A.lA = 0;
        A.mA = 0;
        A.nA = 0;
        A.oA = 3;
        A.pA = false;
        A.qA = null;
        A.rA = null;
        A.sA = null;
        A.zA = false;
        A.ab = new int[3];
        A.bb = new int[2];
        A.cb = new int[2];
        A.db = false;
        A.eb = false;
        A.fb = false;
        A.gb = 4;
        A.hb = 4;
        A.pb = 0;
        A.qb = 0;
        A.rb = 0;
        A.sb = 0;
        A.tb = -1;
        A.ub = -1;
        A.vb = -1;
        A.wb = 0;
        A.xb = "";
        A.yb = 126;
        A.zb = new int[7];
        A.aB = false;
        A.bB = false;
        A.cB = false;
        A.dB = false;
        A.eB = false;
        A.fB = false;
        A.gB = 0;
        A.hB = false;
        A.iB = 0;
        A.jB = false;
        A.kB = false;
        A.lB = -1;
        A.mB = -1;
        A.nB = new int[] { 2, 3, 4 };
        A.oB = new int[] { 5 };
        A.pB = new int[] { 6, 7 };
        A.qB = new int[] { 0, 1, 31, 32, 33 };
        A.rB = new int[] { 34, 35 };
        A.sB = new int[] { 9, 10, 13, 14, 17, 18, 22, 23, 24, 25, 26, 28, 29, 30 };
        A.xB = new int[] { 0, 0 };
        A.yB = new int[] { 0, 0 };
        A.zB = new int[] { 0, 0 };
        A.ac = new int[2];
        A.bc = false;
        A.jc = null;
        A.mc = new short[] { 100, 1, 101, 0, 102, 0, 103, 0, 104, 0, 105, 0, 106, 0, 107, 0 };
        A.nc = new byte[] { 4, 5, 6, 7, -1, -1, -1, -1, 4, 5, 6, 7, 4, 5, 6, 7, 4 };
        A.oc = new byte[][] { { 0, 1, 5, 4, 2, 3, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 5, 4, 2, 3, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 5, 4, 2, 3, 0 }, { 0, 1, 5, 4, 2, 3, 0 } };
        A.zc = new short[4];
        A.aC = new int[][][] { { { 3407872, 9372162, 13107714, 16646401 }, { 13312, 167682, 182274, 130561, 52, 131727, 131784, 66046 } }, { { 14421004, 7143424, 3217682 }, { 842764, 27904, 1650962 } }, { { 6317423, 8357007, 9672610 }, { 1052939, 2170388, 3287581 } }, { { 16777215, 16776643, 16775223, 16756224, 16730112 }, { 16777215, 16185851, 15463158, 13557993, 11455450, 6198098, 5211714, 2514711, 3238946, 999951 } }, { { 11796479, 65535, 185083, 239096 }, { 14869247, 11315711, 9404927, 7559679, 11140522, 1242901, 1299989, 1291541, 16776839, 16764434, 16742162, 16719104 } }, { { 2833446, 2504478, 2239772, 1581331 }, { 6172198, 5971226, 4660764, 3478289, 3292493, 2701384, 2436922, 1712939, 2829099, 1973790, 1118481, 131586, 6441004, 4337950, 3220502, 2234383, 7251627, 5339517, 3823450, 2175540 } } };
        A.bC = null;
        A.cC = null;
        A.dC = null;
        A.eC = new int[4][20];
        A.fC = 0;
        A.gC = 0;
        A.hC = 0;
        A.iC = 0;
        A.jC = 0;
        A.kC = new int[7];
        A.lC = new int[] { 9133598, 0, 11908783, 4474695, 2048, 4096, 256, 9133598, 0, 4474695, 11908783, 1024, 4096, 128 };
        A.mC = new int[2];
        A.nC = new int[2];
        A.oC = false;
        A.pC = false;
        A.qC = null;
        A.rC = "";
        A.sC = "";
        A.tC = -1;
        A.uC = -1;
        A.vC = -1;
        A.wC = -1;
        A.xC = -1;
        A.yC = 0;
        A.zC = 0;
        A.ad = 0;
        A.bd = 0;
        A.cd = 0;
        A.dd = -1;
        A.ed = 0;
        A.fd = -1;
        A.gd = null;
        A.hd = -1;
        A.id = false;
        A.jd = new Vector();
        A.kd = null;
        A.ld = 0;
        A.md = 0;
        A.nd = 0;
        A.od = 0;
        A.pd = -1;
        A.qd = null;
        A.rd = false;
        A.sd = true;
        A.td = -1L;
        A.ud = 0;
        A.vd = 0;
        A.wd = 0;
        A.xd = 0;
        A.yd = -1;
        A.zd = 0;
        A.aD = -1;
        A.bD = -1;
        A.cD = 0;
        A.dD = 0;
        A.eD = 1;
        A.fD = false;
        A.gD = false;
        A.hD = new Hashtable();
        A.iD = 0;
        A.jD = 0;
        A.kD = 0;
        A.lD = 0;
        A.mD = 0;
        A.nD = 0;
        A.oD = false;
        A.pD = "";
        A.qD = null;
        A.rD = null;
        A.sD = false;
        A.tD = new int[4];
        A.uD = new int[2];
        A.vD = new int[2];
        A.wD = 0;
        new Random();
        A.zD = -1;
        A.ae = -1;
        A.be = -1;
        A.ce = -1;
        A.de = new int[2];
        A.ee = new int[2];
        A.fe = new int[2];
        A.ge = new int[2];
        A.he = new int[2];
        A.ie = new int[4];
        A.je = new int[2];
        A.ke = new int[] { 2088005690, 2088005795, 2088005702, 2088005753, 2088005704, 2088005832, 2088005741, 2088005694, 2088005753, 2088005757, 2088005706, 2088005753, 2088005763, 2088005718, 2088005832, 2088005733, 2088005847, 2088005753 };
        A.le = new int[] { 2088005753, 2088005832, 2088005753, 2088005753, 2088005832, 2088005702, 2088005847, 2088005718, 2088005706, 2088005694, 2088005704, 2088005795, 2088005733, 2088005763, 2088005757, 2088005741, 2088005753, 2088005690 };
        A.me = new int[] { 2088005702, 2088005795, 2088005690, 2088005832, 2088005704, 2088005753, 2088005753, 2088005694, 2088005741, 2088005753, 2088005706, 2088005757, 2088005832, 2088005718, 2088005763, 2088005753, 2088005847, 2088005733 };
        A.ne = new int[] { 2088005702, 2088005832, 2088005753, 2088005753, 2088005832, 2088005753, 2088005795, 2088005704, 2088005694, 2088005706, 2088005718, 2088005847, 2088005690, 2088005753, 2088005741, 2088005757, 2088005763, 2088005733 };
        A.oe = new int[4];
        A.pe = new int[18];
        A.qe = new int[3];
        A.re = new int[9];
        A.se = new int[] { -553648665, -671089408, -822084154, -687866624, -452985351, -553648896, -1023410986, -738198272, -1040188194 };
        A.te = new int[3];
        A.ue = new int[9];
        A.ve = new int[] { -553648665, -671089408, -822084154, -687866624, -452985351, -553648896, -1023410986, -738198272, -1040188194 };
        A.we = new int[2];
        A.xe = new int[3];
        A.ye = new int[9];
        A.ze = new int[] { 64, 128, 64, 128, 160, 128, 160, 240, 160 };
        A.aE = new int[3];
        A.bE = new int[9];
        A.cE = new int[] { 64, 128, 64, 128, 160, 128, 160, 240, 160 };
        A.dE = new int[3];
        A.eE = new int[30];
        A.fE = new int[] { 0, 44748, 48844, 43468, 0, 43724, 48895, 48895, 47615, 35276, 44492, 21122, 48895, 21122, 34508, 38348, 40959, 31999, 40959, 28620, 0, 28620, 38348, 28620, 0, 0, 38307, 28620, 38307, 24320 };
        A.gE = new int[2];
        A.hE = new int[256];
        A.iE = new int[] { 0, 0, 0, 0, 0, 14151, 14193, 14193, 14193, 14193, 14193, 14151, 0, 0, 0, 0, 0, 0, 0, 24330, 24346, 19853, 19410, 19410, 19410, 19410, 19410, 19853, 24346, 24330, 0, 0, 0, 0, 0, 24377, 24473, 36817, 41714, 41714, 41714, 41714, 41714, 36817, 24473, 24377, 0, 0, 0, 24330, 24377, 31107, 35039, 44019, 48895, 48895, 48895, 48895, 48895, 41715, 28127, 26755, 24377, 24330, 0, 24346, 24473, 35039, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 43007, 33023, 28127, 24473, 24346, 0, 39450, 39577, 43743, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 46591, 43007, 35551, 29849, 29722, 0, 48666, 48793, 48863, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 39903, 32921, 32794, 0, 48666, 48793, 48863, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 39903, 32921, 32794, 0, 48666, 48793, 43726, 35281, 37086, 40940, 47612, 48895, 47612, 40940, 37086, 35281, 33998, 32921, 32794, 0, 48666, 48793, 37823, 15784, 20923, 30419, 44786, 47353, 44786, 30419, 20923, 15784, 27327, 32921, 32794, 0, 48666, 48793, 39112, 22466, 19381, 23224, 35539, 37593, 35539, 23224, 19381, 22466, 29128, 32921, 32794, 0, 39450, 39577, 37843, 35039, 32719, 29891, 27326, 30148, 32715, 31431, 29903, 28127, 31187, 32921, 32794, 0, 24346, 24473, 35039, 48895, 48895, 42728, 20654, 24760, 35282, 45554, 43007, 33023, 32991, 32921, 32794, 0, 24330, 24377, 31107, 35039, 44019, 46838, 40673, 41700, 42990, 40186, 34815, 27647, 29327, 32825, 32778, 0, 0, 0, 24377, 24473, 42193, 48882, 48882, 48882, 46834, 36850, 30175, 24511, 24392, 0, 0, 0, 0, 0, 24330, 24346, 47245, 48850, 48850, 48850, 46802, 37074, 32143, 24352, 24332, 0, 0 };
        jE = new int[2];
        A.kE = new int[8];
        A.lE = new int[] { -671089168, -452985392, -738198096, -738198128, -738198160, -738198192, -738198224, -738198256 };
        A.mE = new int[16];
        A.nE = new int[] { 55280, 55280, 55280, 55280, 0, 0, 55280, 0, 0, 55280, 0, 0, 55280, 55280, 55280, 55280 };
        A.oE = new int[32];
        A.pE = new int[] { 65296, 65306, 65314, 65319, 65314, 65307, 65296, 65287, 65329, 65352, 65374, 65382, 65375, 65357, 65333, 65309, 65382, 65414, 65437, 65448, 65441, 65423, 65390, 65347, 65428, 65456, 65474, 65486, 65482, 65468, 65437, 65389 };
        A.qE = new int[2];
        A.rE = new int[24];
        A.sE = new int[] { -65360, -65296, -65360, -65392, -65328, -65392, -65424, -65360, -65424, -65456, -65392, -65456, -65472, -65424, -65472, -65488, -65456, -65488, -65504, -65488, -65504, -65520, -65520, -65520 };
        A.tE = -1L;
        A.uE = -1L;
    }
}
