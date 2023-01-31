package p000;

import com.nokia.mid.ui.DeviceControl;
import com.nokia.mid.ui.DirectGraphics;
import com.nokia.mid.ui.DirectUtils;
import com.nokia.mid.ui.FullCanvas;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

/* renamed from: c */
public final class C0003c extends FullCanvas implements Runnable {

    /* renamed from: A */
    public static int f178A = 0;

    /* renamed from: A */
    public static boolean f179A = false;

    /* renamed from: A */
    public static int[] f180A = {9, 10, 13, 14, 17, 18, 22, 23, 24, 25, 26, 28, 29, 30};

    /* renamed from: B */
    public static int f181B = 0;

    /* renamed from: B */
    public static boolean f182B = false;

    /* renamed from: B */
    private static int[] f183B = null;

    /* renamed from: C */
    private static int f184C = 0;

    /* renamed from: C */
    public static int[] f185C = {5};

    /* renamed from: D */
    public static int f186D = 0;

    /* renamed from: D */
    public static int[] f187D = null;

    /* renamed from: E */
    private static int f188E;

    /* renamed from: E */
    public static int[] f189E = new int[3];

    /* renamed from: F */
    public static int f190F;

    /* renamed from: F */
    public static int[] f191F;

    /* renamed from: G */
    public static int f192G = 0;

    /* renamed from: G */
    private static int[] f193G = new int[2];

    /* renamed from: H */
    public static int f194H;

    /* renamed from: H */
    private static int[] f195H = new int[4];

    /* renamed from: I */
    public static int f196I = -1;

    /* renamed from: I */
    public static int[] f197I = {34, 35};

    /* renamed from: J */
    public static int f198J = 0;

    /* renamed from: J */
    public static int[] f199J = null;

    /* renamed from: K */
    public static int f200K = 0;

    /* renamed from: K */
    public static int[] f201K = null;

    /* renamed from: L */
    public static int f202L = -1;

    /* renamed from: L */
    public static int[] f203L = new int[2];

    /* renamed from: M */
    public static int f204M = -1;

    /* renamed from: M */
    public static int[] f205M = null;

    /* renamed from: N */
    public static int f206N = 0;

    /* renamed from: N */
    public static int[] f207N = new int[2];

    /* renamed from: O */
    public static int f208O = 0;

    /* renamed from: O */
    public static int[] f209O = null;

    /* renamed from: P */
    public static int f210P = 0;

    /* renamed from: P */
    public static int[] f211P = new int[2];

    /* renamed from: Q */
    public static int f212Q = -1;

    /* renamed from: Q */
    public static int[] f213Q = null;

    /* renamed from: R */
    public static int f214R = -1;

    /* renamed from: R */
    public static int[] f215R = new int[7];

    /* renamed from: S */
    public static int f216S = 4;

    /* renamed from: S */
    public static int[] f217S = null;

    /* renamed from: T */
    public static int f218T = -1;

    /* renamed from: T */
    public static int[] f219T = {2, 3, 4};

    /* renamed from: U */
    private static int f220U;

    /* renamed from: U */
    private static int[] f221U = new int[3];

    /* renamed from: V */
    public static int f222V = -1;

    /* renamed from: V */
    public static int[] f223V = new int[2];

    /* renamed from: W */
    public static int f224W = 0;

    /* renamed from: W */
    public static int[] f225W = {9133598, 0, 11908783, 4474695, 2048, 4096, 256, 9133598, 0, 4474695, 11908783, 1024, 4096, 128};

    /* renamed from: X */
    public static int f226X;

    /* renamed from: Y */
    public static int f227Y = -1;

    /* renamed from: Z */
    public static int f228Z = 0;

    /* renamed from: a */
    private static byte f229a = 0;

    /* renamed from: a */
    public static int f230a = 0;

    /* renamed from: a */
    public static long f231a = -1;

    /* renamed from: a */
    public static C0000HG f232a;

    /* renamed from: a */
    public static C0002b f233a;

    /* renamed from: a */
    private static DataInputStream f234a = null;

    /* renamed from: a */
    public static String f235a;

    /* renamed from: a */
    public static Thread f236a = null;

    /* renamed from: a */
    private static Hashtable f237a = new Hashtable();

    /* renamed from: a */
    public static Vector f238a = new Vector();

    /* renamed from: a */
    public static Graphics f239a;

    /* renamed from: a */
    public static Image f240a;

    /* renamed from: a */
    public static short f241a;

    /* renamed from: a */
    public static boolean f242a = false;

    /* renamed from: a */
    public static byte[] f243a = {4, 5, 6, 7, -1, -1, -1, -1, 4, 5, 6, 7, 4, 5, 6, 7, 4};

    /* renamed from: a */
    private static final int[] f244a = new int[2];

    /* renamed from: a */
    public static String[] f245a = new String[1];

    /* renamed from: a */
    public static Font[] f246a;

    /* renamed from: a */
    private static short[] f247a = new short[4];

    /* renamed from: a */
    public static byte[][] f248a = {new byte[]{0, 1, 1, 3, 3, 2, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 1, 1, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0}, new byte[]{0, 0, 0, 1, 1, 0, 0}, new byte[]{0, 0, 0, 1, 1, 0, 0}};

    /* renamed from: a */
    public static int[][] f249a = null;

    /* renamed from: a */
    public static Image[][] f250a;

    /* renamed from: a */
    public static short[][] f251a;

    /* renamed from: a */
    public static byte[][][] f252a;

    /* renamed from: a */
    public static int[][][] f253a = null;

    /* renamed from: a */
    public static Image[][][] f254a;

    /* renamed from: a */
    public static byte[][][][] f255a;

    /* renamed from: a */
    public static int[][][][] f256a;

    /* renamed from: a */
    public static short[][][][][] f257a;

    /* renamed from: aA */
    private static int f258aA = -1;

    /* renamed from: aB */
    public static int f259aB = -1;

    /* renamed from: aC */
    public static int f260aC = 0;

    /* renamed from: aa */
    public static int f261aa = 0;

    /* renamed from: ab */
    public static int f262ab = 0;

    /* renamed from: ac */
    public static int f263ac = 1;

    /* renamed from: ad */
    public static int f264ad = 3;

    /* renamed from: ae */
    private static int f265ae = 0;

    /* renamed from: af */
    public static int f266af;

    /* renamed from: ag */
    public static int f267ag = -1;

    /* renamed from: ah */
    public static int f268ah = 0;

    /* renamed from: ai */
    public static int f269ai = -1;

    /* renamed from: aj */
    public static int f270aj = 0;

    /* renamed from: ak */
    public static int f271ak = 0;

    /* renamed from: al */
    public static int f272al = f324d.length;

    /* renamed from: am */
    public static int f273am = 126;

    /* renamed from: an */
    public static int f274an = 0;

    /* renamed from: ao */
    public static int f275ao = 0;

    /* renamed from: ap */
    public static int f276ap = 0;

    /* renamed from: aq */
    public static int f277aq = 0;

    /* renamed from: ar */
    public static int f278ar = 0;

    /* renamed from: as */
    public static int f279as = 0;

    /* renamed from: at */
    public static int f280at = -1;

    /* renamed from: au */
    public static int f281au = 0;

    /* renamed from: av */
    public static int f282av = -1;

    /* renamed from: aw */
    public static int f283aw = -1;

    /* renamed from: ax */
    public static int f284ax = -1;

    /* renamed from: ay */
    public static int f285ay = -1;

    /* renamed from: az */
    public static int f286az = 0;

    /* renamed from: b */
    public static int f287b = -1;

    /* renamed from: b */
    public static long f288b = -1;

    /* renamed from: b */
    public static String f289b = "";

    /* renamed from: b */
    public static Image f290b = null;

    /* renamed from: b */
    public static short f291b;

    /* renamed from: b */
    public static boolean f292b = false;

    /* renamed from: b */
    public static byte[] f293b;

    /* renamed from: b */
    public static int[] f294b = new int[2];

    /* renamed from: b */
    public static String[] f295b = null;

    /* renamed from: b */
    public static short[] f296b;

    /* renamed from: b */
    public static byte[][] f297b = null;

    /* renamed from: b */
    public static int[][] f298b = null;

    /* renamed from: b */
    public static short[][] f299b = null;

    /* renamed from: b */
    public static byte[][][] f300b;

    /* renamed from: b */
    public static int[][][] f301b = new int[0][][];

    /* renamed from: b */
    public static byte[][][][] f302b;

    /* renamed from: c */
    public static int f303c;

    /* renamed from: c */
    public static long f304c = -1;

    /* renamed from: c */
    public static String f305c;

    /* renamed from: c */
    public static short f306c;

    /* renamed from: c */
    public static boolean f307c = false;

    /* renamed from: c */
    public static byte[] f308c = new byte[20];

    /* renamed from: c */
    public static int[] f309c = null;

    /* renamed from: c */
    public static String[] f310c = null;

    /* renamed from: c */
    public static short[] f311c = new short[15];

    /* renamed from: c */
    public static byte[][] f312c;

    /* renamed from: c */
    public static int[][] f313c = null;

    /* renamed from: c */
    public static short[][] f314c;

    /* renamed from: c */
    public static byte[][][] f315c;

    /* renamed from: d */
    private static int f316d = -1;

    /* renamed from: d */
    public static long f317d = -1;

    /* renamed from: d */
    public static String f318d;

    /* renamed from: d */
    public static short f319d;

    /* renamed from: d */
    public static boolean f320d = false;

    /* renamed from: d */
    public static byte[] f321d = new byte[20];

    /* renamed from: d */
    public static int[] f322d = new int[2];

    /* renamed from: d */
    public static short[] f323d = {100, 1, 101, 0, 102, 0, 103, 0, 104, 0, 105, 0, 106, 0, 107, 0};

    /* renamed from: d */
    public static final byte[][] f324d = {new byte[]{15, 15, 0, 7}, new byte[]{20, 15, 3, 13}, new byte[]{25, 15, 1, 9}, new byte[]{30, 15, 2, 11}, new byte[]{31, 15, 8}, new byte[]{32, 15, 14}, new byte[]{33, 15, 6}, new byte[]{34, 15, 12}, new byte[]{35, 15, 4, 10}, new byte[]{50, 0, 17}, new byte[]{45, 0, 18}, new byte[]{40, 0, 5}, new byte[]{55, 0, 0, 7}, new byte[]{60, 0, 3, 13}, new byte[]{61, 0, 1, 9}, new byte[]{62, 0, 2, 11}, new byte[]{65, 0, 4, 10}, new byte[]{85, 0, 17}, new byte[]{80, 0, 18}, new byte[]{90, 0, 5}, new byte[]{95, 0, 15}, new byte[]{100, 0, 16}, new byte[]{101, 0, 6}, new byte[]{102, 0, 7}, new byte[]{103, 0, 8}, new byte[]{104, 0, 9}, new byte[]{115, 0, 10}, new byte[]{105, 0, 11}, new byte[]{106, 0, 12}, new byte[]{107, 0, 13}, new byte[]{108, 0, 14}, new byte[]{109, 0, 16}, new byte[]{110, 0, 6}, new byte[]{111, 0, 8}, new byte[]{112, 0, 12}, new byte[]{113, 0, 14}, new byte[]{114, 0, 15}, new byte[]{116, 15, 0}, new byte[]{117, 15, 3}, new byte[]{118, 0, 5}};

    /* renamed from: d */
    public static int[][] f325d = null;

    /* renamed from: e */
    public static int f326e = 0;

    /* renamed from: e */
    public static long f327e = 0;

    /* renamed from: e */
    private static String f328e = null;

    /* renamed from: e */
    public static boolean f329e = false;

    /* renamed from: e */
    public static byte[] f330e = new byte[f272al];

    /* renamed from: e */
    private static int[] f331e = new int[2];

    /* renamed from: e */
    public static short[] f332e;

    /* renamed from: e */
    public static int[][] f333e = null;

    /* renamed from: f */
    public static int f334f;

    /* renamed from: f */
    public static long f335f = 0;

    /* renamed from: f */
    public static String f336f = "";

    /* renamed from: f */
    public static boolean f337f = false;

    /* renamed from: f */
    public static byte[] f338f;

    /* renamed from: f */
    public static int[] f339f;

    /* renamed from: f */
    public static short[] f340f = new short[165];

    /* renamed from: f */
    public static int[][] f341f = null;

    /* renamed from: g */
    public static int f342g = -1;

    /* renamed from: g */
    public static long f343g;

    /* renamed from: g */
    private static String f344g = null;

    /* renamed from: g */
    private static boolean f345g = false;

    /* renamed from: g */
    private static byte[] f346g;

    /* renamed from: g */
    private static int[] f347g = new int[2];

    /* renamed from: g */
    public static short[] f348g = new short[45];

    /* renamed from: g */
    public static int[][] f349g = null;

    /* renamed from: h */
    public static int f350h = 0;

    /* renamed from: h */
    public static String f351h = "";

    /* renamed from: h */
    public static boolean f352h = false;

    /* renamed from: h */
    public static int[] f353h = new int[7];

    /* renamed from: h */
    public static int[][] f354h = null;

    /* renamed from: i */
    public static int f355i = 0;

    /* renamed from: i */
    public static String f356i = "";

    /* renamed from: i */
    private static boolean f357i = false;

    /* renamed from: i */
    private static int[] f358i = new int[2];

    /* renamed from: i */
    public static int[][] f359i = null;

    /* renamed from: j */
    public static int f360j = 0;

    /* renamed from: j */
    public static boolean f361j = false;

    /* renamed from: j */
    public static int[] f362j;

    /* renamed from: j */
    public static int[][] f363j = null;

    /* renamed from: k */
    public static int f364k = 0;

    /* renamed from: k */
    public static boolean f365k = true;

    /* renamed from: k */
    public static int[] f366k = new int[2];

    /* renamed from: k */
    public static int[][] f367k = ((int[][]) Array.newInstance(Integer.TYPE, new int[]{4, 20}));

    /* renamed from: l */
    public static int f368l = 0;

    /* renamed from: l */
    public static boolean f369l = false;

    /* renamed from: l */
    public static int[] f370l = {6, 7};

    /* renamed from: l */
    public static int[][] f371l = null;

    /* renamed from: m */
    public static int f372m = 0;

    /* renamed from: m */
    private static boolean f373m = false;

    /* renamed from: m */
    public static int[] f374m = new int[2];

    /* renamed from: m */
    public static int[][] f375m = null;

    /* renamed from: n */
    public static int f376n = -1;

    /* renamed from: n */
    public static boolean f377n = false;

    /* renamed from: n */
    public static int[] f378n = null;

    /* renamed from: n */
    public static int[][] f379n = null;

    /* renamed from: o */
    public static int f380o = 0;

    /* renamed from: o */
    public static boolean f381o = true;

    /* renamed from: o */
    public static int[] f382o = {0, 1, 31, 32, 33};

    /* renamed from: o */
    public static int[][] f383o = null;

    /* renamed from: p */
    public static int f384p = 0;

    /* renamed from: p */
    public static boolean f385p = false;

    /* renamed from: p */
    public static int[] f386p = null;

    /* renamed from: p */
    public static int[][] f387p = null;

    /* renamed from: q */
    public static int f388q;

    /* renamed from: q */
    public static boolean f389q = false;

    /* renamed from: q */
    public static int[] f390q = {0, 0};

    /* renamed from: q */
    public static int[][] f391q = null;

    /* renamed from: r */
    public static int f392r = 0;

    /* renamed from: r */
    public static boolean f393r = false;

    /* renamed from: r */
    private static int[] f394r = new int[3];

    /* renamed from: r */
    public static int[][] f395r = null;

    /* renamed from: s */
    public static int f396s;

    /* renamed from: s */
    public static boolean f397s = false;

    /* renamed from: s */
    public static int[] f398s = null;

    /* renamed from: s */
    public static int[][] f399s = null;

    /* renamed from: t */
    public static int f400t = 0;

    /* renamed from: t */
    public static boolean f401t = false;

    /* renamed from: t */
    public static int[] f402t = null;

    /* renamed from: t */
    public static int[][] f403t = null;

    /* renamed from: u */
    public static int f404u;

    /* renamed from: u */
    public static boolean f405u = false;

    /* renamed from: u */
    private static int[] f406u = new int[2];

    /* renamed from: u */
    public static int[][] f407u = null;

    /* renamed from: v */
    public static int f408v = -1;

    /* renamed from: v */
    public static boolean f409v = false;

    /* renamed from: v */
    public static int[] f410v = {0, 0};

    /* renamed from: v */
    public static int[][] f411v = null;

    /* renamed from: w */
    public static int f412w = 0;

    /* renamed from: w */
    public static boolean f413w = false;

    /* renamed from: w */
    public static int[] f414w = null;

    /* renamed from: w */
    public static int[][] f415w = null;

    /* renamed from: x */
    public static int f416x = 4;

    /* renamed from: x */
    public static boolean f417x = false;

    /* renamed from: x */
    public static int[] f418x = new int[2];

    /* renamed from: x */
    public static int[][] f419x = null;

    /* renamed from: y */
    public static int f420y = 0;

    /* renamed from: y */
    public static boolean f421y = false;

    /* renamed from: y */
    public static int[] f422y = {0, 0};

    /* renamed from: y */
    public static int[][] f423y = null;

    /* renamed from: z */
    public static int f424z = 0;

    /* renamed from: z */
    public static boolean f425z = false;

    /* renamed from: z */
    public static int[] f426z = null;

    static {
        new Random();
    }

    public C0003c(C0000HG hg) {
        f232a = hg;
        f260aC = getWidth();
        f368l = getHeight();
    }

    /* renamed from: A */
    public static final void m193A() {
        for (int i = 0; i < 20; i++) {
            f308c[i] = 10;
        }
    }

    /* renamed from: B */
    public static final void m194B() {
        if (m220a(61)) {
            if ((f276ap & (1 << f210P)) != 0) {
                f210P = 0;
                if (m337c()) {
                    f364k--;
                    C0000HG.m81m(32);
                    f336f = new StringBuffer().append(" x ").append(f364k).toString();
                }
            } else {
                f210P++;
            }
        } else if (m220a(62)) {
            if ((f276ap & (1 << f210P)) == 0) {
                f210P = 0;
                if (m337c()) {
                    f364k--;
                    C0000HG.m81m(32);
                    f336f = new StringBuffer().append(" x ").append(f364k).toString();
                }
            } else {
                f210P++;
            }
        } else if (m220a(85)) {
            f361j = false;
            m205M();
        }
        if (f210P >= f186D) {
            short s = (short) ((f276ap & -65536) >> 16);
            byte b = (byte) ((C0001a.f124d[s][8] >> 8) & 255);
            byte b2 = (byte) (C0001a.f124d[s][8] & 255);
            m285a(12, 7, (int) (short) ((C0001a.f124d[s][2] & -65536) >> 16), (int) b2, 0, false);
            if (b2 == 5) {
                int[] iArr = C0001a.f124d[s];
                iArr[3] = iArr[3] | 32768;
                m330b(C0001a.f124d[s], true);
                f377n = true;
            }
            C0001a.m95a(C0001a.m131b() | (1 << b));
            m274a(C0001a.f124d[s], false);
            C0000HG.m81m(9);
            f361j = false;
            m205M();
            m339c((int) (short) (f414w[0] & 65535), (int) (short) ((f414w[0] & -65536) >> 16));
        }
        if (f364k <= 0) {
            m317b(239, 230, 101, 106);
            m205M();
            f361j = false;
        }
        m193A();
    }

    /* renamed from: C */
    public static final void m195C() {
        int length = f330e.length;
        for (int i = 0; i < length; i++) {
            f330e[i] = 0;
        }
    }

    /* renamed from: D */
    public static final void m196D() {
        f240a = null;
        f239a = null;
    }

    /* renamed from: E */
    public static final void m197E() {
        int i = f194H;
        int i2 = f266af;
        f194H = f388q / C0001a.f136i;
        if (f388q < 0) {
            f194H--;
        }
        f266af = f303c / C0001a.f150p;
        if (f303c < 0) {
            f266af--;
        }
        if (f242a) {
            m347c(f194H, f266af, f194H + f226X, f266af + f396s);
            f242a = false;
            return;
        }
        if (f194H != i) {
            if (i < f194H) {
                while (f226X + i < f194H) {
                    i += f226X;
                }
                m347c(i + f226X, i2, f194H + f226X, f396s + i2);
            } else {
                while (i - f226X > f194H) {
                    i -= f226X;
                }
                m347c(f194H, i2, i, f396s + i2);
            }
            i = f194H;
        }
        if (f266af == i2) {
            return;
        }
        if (i2 < f266af) {
            while (f396s + i2 < f266af) {
                i2 += f396s;
            }
            m347c(i, i2 + f396s, f226X + i, f266af + f396s);
            return;
        }
        while (i2 - f396s > f266af) {
            i2 -= f396s;
        }
        m347c(i, f266af, f226X + i, i2);
    }

    /* renamed from: F */
    public static final void m198F() {
        f363j = null;
    }

    /* renamed from: G */
    public static final void m199G() {
        for (int i = 0; i < f362j.length; i++) {
            f362j[0] = 0;
        }
        for (int i2 = 0; i2 < f250a.length; i2++) {
            if ((f296b[(i2 * 11) + 9] & 2) == 0) {
                f250a[i2] = null;
                f314c[i2] = null;
            }
        }
        f338f = null;
        f293b = null;
    }

    /* renamed from: H */
    public static final void m200H() {
        if (f309c != null) {
            f309c[0] = 1;
        }
        f389q = false;
        f238a.removeAllElements();
        f309c = null;
        if (f329e) {
            f376n = -1;
        }
        f329e = false;
    }

    /* renamed from: I */
    public static final void m201I() {
        if (f196I > 3) {
            f421y = true;
        }
        if (C0000HG.m39b(1)) {
            C0000HG.m86p();
        } else {
            C0000HG.m76k();
        }
    }

    /* renamed from: J */
    public static final void m202J() {
        f318d = null;
    }

    /* renamed from: K */
    public static final void m203K() {
        System.gc();
        f226X = (f260aC / C0001a.f136i) + 2;
        f396s = (f368l / C0001a.f150p) + 2;
        f240a = Image.createImage(f226X * C0001a.f136i, f396s * C0001a.f150p);
        f239a = f240a.getGraphics();
        f194H = -1;
        f266af = -1;
        f242a = true;
    }

    /* renamed from: L */
    public static final void m204L() {
        if (f403t != null && f403t.length > 0) {
            int i = 4;
            while (true) {
                i--;
                if (i >= 0) {
                    int[] iArr = f367k[i];
                    if (iArr[0] != 0) {
                        m406g(iArr, i);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: M */
    public static final void m205M() {
        int i = f198J - f364k;
        int i2 = 0;
        while (i2 < f253a[2].length) {
            int i3 = f253a[2][i2][4];
            if (i3 < 0 || f395r[i3][6] != 20) {
                i2++;
            } else {
                m221a((int) (((short) i3) & 65535) | 131072, i);
                return;
            }
        }
    }

    /* renamed from: N */
    public static final void m206N() {
        try {
            f234a.close();
        } catch (Exception e) {
        } finally {
            f234a = null;
        }
    }

    /* renamed from: O */
    public static final void m207O() {
        f305c = null;
    }

    /* renamed from: P */
    public static final void m208P() {
        for (int i = 0; i < 20; i++) {
            if (f321d[i] == 30 && (f308c[i] == 10 || f308c[i] == 40)) {
                f321d[i] = 10;
                f308c[i] = 0;
            }
        }
        for (int i2 = 0; i2 < f272al; i2++) {
            byte[] bArr = f324d[i2];
            int b = m307b((int) bArr[0]);
            int length = bArr.length;
            boolean z = false;
            boolean z2 = false;
            for (int i3 = 2; i3 < length; i3++) {
                byte b2 = bArr[i3];
                if (f321d[b2] == 20) {
                    z = true;
                } else if (f321d[b2] == 30) {
                    z2 = true;
                }
            }
            if (z) {
                f330e[b] = 5;
            } else if (z2) {
                f330e[b] = 10;
            } else {
                f330e[b] = 0;
            }
        }
        for (int i4 = 0; i4 < 20; i4++) {
            if (f321d[i4] == 20) {
                f321d[i4] = 30;
            }
        }
    }

    /* renamed from: Q */
    public static final void m209Q() {
        if (f391q.length == 0) {
            f265ae = -1;
            return;
        }
        int i = f265ae == -1 ? 0 : f265ae + 1;
        f265ae = -1;
        int i2 = 0;
        int i3 = i;
        while (i2 < f391q.length) {
            if (i3 == f391q.length) {
                f373m = true;
                return;
            } else if (m307b(i3)) {
                f265ae = i3;
                f373m = false;
                return;
            } else {
                i3++;
                i2++;
            }
        }
    }

    /* renamed from: R */
    public static final void m210R() {
        f332e = new short[16];
        m361d();
    }

    /* JADX WARNING: type inference failed for: r0v34, types: [int] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m211S() {
        /*
            r11 = 0
            r1 = 1
            r10 = -1
            r9 = 273(0x111, float:3.83E-43)
            r3 = 0
            r0 = r3
        L_0x0007:
            if (r0 >= r9) goto L_0x0014
            short[] r2 = f296b
            int r4 = r0 * 11
            int r4 = r4 + 4
            r2[r4] = r10
            int r0 = r0 + 1
            goto L_0x0007
        L_0x0014:
            short[][] r0 = new short[r9][]
            f314c = r0
            javax.microedition.lcdui.Image[][] r0 = new javax.microedition.lcdui.Image[r9][]
            f250a = r0
            int[] r0 = new int[r9]
            f362j = r0
            f346g = r11
            f220U = r10
            java.lang.System.gc()     // Catch:{ Exception -> 0x0074 }
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0074 }
            HG r2 = p000.C0000HG.f10a     // Catch:{ Exception -> 0x0074 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r4 = "/i"
            java.io.InputStream r2 = r2.getResourceAsStream(r4)     // Catch:{ Exception -> 0x0074 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0074 }
            f234a = r0     // Catch:{ Exception -> 0x0074 }
            java.io.DataInputStream r0 = f234a     // Catch:{ Exception -> 0x0074 }
            short r0 = r0.readShort()     // Catch:{ Exception -> 0x0074 }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x0074 }
            f346g = r0     // Catch:{ Exception -> 0x0074 }
            java.io.DataInputStream r0 = f234a     // Catch:{ Exception -> 0x0074 }
            short r4 = r0.readShort()     // Catch:{ Exception -> 0x0074 }
            r2 = r3
        L_0x004b:
            if (r2 >= r4) goto L_0x007b
            java.io.DataInputStream r0 = f234a     // Catch:{ Exception -> 0x0074 }
            short r5 = r0.readShort()     // Catch:{ Exception -> 0x0074 }
            r0 = r3
        L_0x0054:
            if (r0 >= r9) goto L_0x0070
            short[] r6 = f296b     // Catch:{ Exception -> 0x0074 }
            int r7 = r0 * 11
            int r7 = r7 + 3
            short r6 = r6[r7]     // Catch:{ Exception -> 0x0074 }
            if (r5 != r6) goto L_0x006d
            short[] r6 = f296b     // Catch:{ Exception -> 0x0074 }
            int r7 = r0 * 11
            int r7 = r7 + 9
            short r8 = r6[r7]     // Catch:{ Exception -> 0x0074 }
            r8 = r8 | 4
            short r8 = (short) r8     // Catch:{ Exception -> 0x0074 }
            r6[r7] = r8     // Catch:{ Exception -> 0x0074 }
        L_0x006d:
            int r0 = r0 + 1
            goto L_0x0054
        L_0x0070:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x004b
        L_0x0074:
            r0 = move-exception
            r0 = 32767(0x7fff, float:4.5916E-41)
            byte[] r0 = new byte[r0]
            f346g = r0
        L_0x007b:
            r4 = r3
        L_0x007c:
            if (r4 >= r9) goto L_0x00b5
            short[] r0 = f296b
            int r2 = r4 * 11
            int r2 = r2 + 9
            short r0 = r0[r2]
            r0 = r0 & 2
            if (r0 != 0) goto L_0x008e
        L_0x008a:
            int r0 = r4 + 1
            r4 = r0
            goto L_0x007c
        L_0x008e:
            short[] r0 = f296b
            int r2 = r4 * 11
            int r2 = r2 + 4
            short r5 = r0[r2]
            r2 = r3
        L_0x0097:
            if (r5 != r10) goto L_0x00a3
            r0 = r1
        L_0x009a:
            if (r2 >= r0) goto L_0x008a
            m407g(r4, r2)
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0097
        L_0x00a3:
            int[][][] r0 = f301b
            r0 = r0[r5]
            r0 = r0[r1]
            int r0 = r0.length
            int[][][] r6 = f301b
            r6 = r6[r5]
            r6 = r6[r3]
            int r6 = r6.length
            int r0 = r0 / r6
            int r0 = r0 + 1
            goto L_0x009a
        L_0x00b5:
            r0 = 75
            m268a(r1, r3, r0)
            java.io.DataInputStream r0 = f234a     // Catch:{ Exception -> 0x00c9 }
            if (r0 == 0) goto L_0x00c3
            java.io.DataInputStream r0 = f234a     // Catch:{ Exception -> 0x00c9 }
            r0.close()     // Catch:{ Exception -> 0x00c9 }
        L_0x00c3:
            f234a = r11
            java.lang.System.gc()
            return
        L_0x00c9:
            r0 = move-exception
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m211S():void");
    }

    /* renamed from: T */
    public static final void m212T() {
        f383o = (int[][]) Array.newInstance(Integer.TYPE, new int[]{8, 13});
        f299b = (short[][]) Array.newInstance(Short.TYPE, new int[]{8, 60});
        for (int i = 0; i < f383o.length; i++) {
            for (int i2 = 0; i2 < f383o[i].length; i2++) {
                f383o[i][i2] = -1;
            }
            f383o[i][0] = -1;
            f383o[i][3] = 0;
        }
        f412w = 0;
    }

    /* renamed from: U */
    public static final void m213U() {
        boolean z;
        boolean z2;
        if (m220a(80) || m220a(65)) {
            if (!f182B && !f238a.isEmpty()) {
                f182B = true;
            } else if (f288b < 0 || System.currentTimeMillis() >= f288b) {
                m200H();
            }
        }
        if (m220a(55)) {
            if (f182B) {
                byte b = (byte) ((f339f[2] >> 16) & 255);
                boolean z3 = f192G > f424z;
                if (z3) {
                    int i = f281au + f355i;
                    if (f286az - 1 < 0) {
                        int i2 = i;
                        for (int i3 = 0; i3 < f286az; i3++) {
                            i2 += (((String[]) f238a.elementAt(i3)).length * b) + 10;
                        }
                        if (i2 >= f281au) {
                            f286az--;
                        }
                        z2 = true;
                    } else {
                        int i4 = i;
                        for (int i5 = 0; i5 < f286az; i5++) {
                            i4 += (((String[]) f238a.elementAt(i5)).length * b) + 10;
                        }
                        f238a.elementAt(f286az);
                        if (i4 > f424z / 2) {
                            f286az--;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    f355i += b;
                    if (f355i > 0) {
                        f355i = 0;
                        if (!z2) {
                            f286az--;
                        }
                    }
                } else {
                    f286az--;
                }
                if (f286az < 0) {
                    f286az = f238a.size() - 1;
                    if (z3) {
                        f355i = f424z - f192G;
                    }
                }
            } else {
                short[] sArr = f348g;
                sArr[29] = (short) (sArr[29] + ((byte) ((f339f[2] >> 16) & 255)));
            }
        }
        if (m220a(60)) {
            if (f182B) {
                byte b2 = (byte) ((f339f[2] >> 16) & 255);
                if (f192G > f424z) {
                    int i6 = f281au + f355i;
                    int i7 = f286az + 1;
                    if (i7 >= f238a.size()) {
                        int i8 = i6;
                        for (int i9 = 0; i9 < f286az; i9++) {
                            i8 += (((String[]) f238a.elementAt(i9)).length * b2) + 10;
                        }
                        if ((((String[]) f238a.elementAt(f286az)).length * b2) + i8 + 20 + f296b[1695] <= f281au + f424z) {
                            f286az++;
                        }
                        z = true;
                    } else {
                        int i10 = i6;
                        for (int i11 = 0; i11 < i7; i11++) {
                            i10 += ((String[]) f238a.elementAt(i11)).length * b2;
                        }
                        f238a.elementAt(i7);
                        if (i10 < f281au + (f424z / 2)) {
                            f286az++;
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    f355i -= b2;
                    if (f355i < f424z - f192G) {
                        f355i = f424z - f192G;
                        if (!z) {
                            f286az++;
                        }
                    }
                } else {
                    f286az++;
                }
                if (f286az >= f238a.size()) {
                    f286az = 0;
                    f355i = 0;
                }
            } else {
                short[] sArr2 = f348g;
                sArr2[29] = (short) (sArr2[29] - ((byte) ((f339f[2] >> 16) & 255)));
            }
        }
        if (f182B && m220a(61)) {
            f182B = false;
        }
        if (!f182B && m220a(62) && !f238a.isEmpty()) {
            f182B = true;
        }
        m193A();
    }

    /* renamed from: V */
    public static final void m214V() {
        for (int i = 0; i < C0001a.f115b[0].length; i++) {
            for (int i2 = 0; i2 < C0001a.f115b.length; i2++) {
                int[] iArr = C0001a.f115b[i2];
                iArr[i] = iArr[i] & Integer.MAX_VALUE;
                C0001a.f115b[i2][i] = (C0001a.f115b[i2][i] & -28673) | 0;
            }
        }
        for (int i3 = 0; i3 < C0001a.f115b[0].length; i3++) {
            int i4 = 0;
            while (i4 < C0001a.f115b.length) {
                int i5 = 0;
                int i6 = -1;
                while (i5 < 7 && i4 - i5 >= 0) {
                    if ((C0001a.f115b[i4 - i5][i3] & Integer.MIN_VALUE) == 0 && ((C0001a.f115b[i4 - i5][i3] >> 28) & 7) == i5) {
                        if (i6 == -1) {
                            C0001a.f115b[i4][i3] = (C0001a.f115b[i4][i3] & -28673) | ((i5 & 7) << 12);
                        } else {
                            C0001a.f115b[i4 - i6][i3] = (C0001a.f115b[i4 - i6][i3] & -1879048193) | ((i5 & 7) << 28);
                            int[] iArr2 = C0001a.f115b[i4 - i6];
                            iArr2[i3] = iArr2[i3] | Integer.MIN_VALUE;
                        }
                        i6 = i5;
                    }
                    i5++;
                }
                if (i6 == -1) {
                    C0001a.f115b[i4][i3] = (C0001a.f115b[i4][i3] & -28673) | 28672;
                } else {
                    C0001a.f115b[i4 - i6][i3] = (C0001a.f115b[i4 - i6][i3] & -1879048193) | 1879048192;
                }
                i4++;
            }
        }
        for (int i7 = 0; i7 < C0001a.f115b[0].length; i7++) {
            for (int i8 = 0; i8 < C0001a.f115b.length; i8++) {
                if ((C0001a.f115b[i8][i7] & Integer.MIN_VALUE) == 0) {
                    C0001a.f115b[i8][i7] = (C0001a.f115b[i8][i7] & -1879048193) | 1879048192;
                }
                int[] iArr3 = C0001a.f115b[i8];
                iArr3[i7] = iArr3[i7] & Integer.MAX_VALUE;
            }
        }
    }

    /* renamed from: W */
    public static final void m215W() {
        f383o = null;
        f299b = null;
    }

    /* renamed from: X */
    public static final void m216X() {
        byte b;
        int i;
        int i2 = 0;
        int l = m442l(m219a());
        int i3 = f414w[42];
        switch (l) {
            case 0:
                b = f248a[0][1];
                i = m230a(f253a[0][i3])[16];
                break;
            case 1:
                i = m230a(f253a[0][i3])[16];
                int q = m463q(f414w);
                if (i <= (f248a[0][2] < f255a[q].length ? f255a[q][f248a[0][2]].length : 0)) {
                    b = f248a[0][2];
                    break;
                } else {
                    b = f248a[0][1];
                    break;
                }
            case 2:
                b = f248a[0][3];
                i = m230a(f253a[0][i3])[16];
                break;
            case 3:
                b = f248a[0][4];
                i = m230a(f253a[0][i3])[16];
                break;
            case 4:
                b = f248a[0][5];
                i = 0;
                break;
            default:
                b = f248a[0][0];
                i = 0;
                break;
        }
        if (f414w[45] != -1) {
            b = f248a[0][5];
            i = 0;
        }
        if (b < 0 || b >= m341c(f414w)) {
            b = 0;
        }
        if (i >= 0 && i < m363d(f414w)) {
            i2 = i;
        }
        if (m378e(f414w) != b) {
            m379e(f414w, (int) b);
        }
        if (m469s(f414w) != i2) {
            m428i(f414w, i2);
        }
    }

    /* renamed from: Y */
    public static final void m217Y() {
        int i;
        byte b;
        int i2;
        int i3 = 0;
        if (m220a(90) && (!f179A || (f179A && f421y))) {
            f421y = !f421y;
            if (f421y) {
                m201I();
            } else {
                m219a();
            }
        }
        if (f421y) {
            while (i3 < 20) {
                if (f321d[i3] == 20) {
                    f327e = (f327e << 4) + ((long) i3);
                    if (m361d()) {
                        f327e = 0;
                    }
                }
                i3++;
            }
        } else if (f401t) {
            m305af();
        } else if (f389q) {
            m213U();
        } else if (f361j && !f385p) {
            m194B();
        } else if (f393r && !f385p) {
            m481y();
        } else if (!f352h || f385p) {
            if (!C0000HG.f70l) {
                if (!m220a(50)) {
                    if (!f385p) {
                        switch (f196I) {
                            case 6:
                                if (m220a(45)) {
                                    if (f212Q < 0) {
                                        if (((short) (f414w[12] & 65535)) > 0) {
                                            C0000HG.f19a.removeAllElements();
                                            C0000HG.m64g(18);
                                            C0000HG.f70l = true;
                                            break;
                                        }
                                    } else {
                                        m285a(10, 0, 0, 0, 0, true);
                                        f233a.mo7a(C0000HG.f11a, f212Q, f227Y, f283aw, false);
                                        new Thread(f233a).start();
                                        break;
                                    }
                                } else {
                                    if (m220a(65)) {
                                        if (f212Q >= 0) {
                                            m285a(10, 0, 0, 0, 0, true);
                                            f233a.mo7a(C0000HG.f11a, f212Q, f227Y, f283aw, false);
                                            new Thread(f233a).start();
                                            break;
                                        } else if (f287b >= 0 && f265ae == -1) {
                                            switch (f287b) {
                                                case 0:
                                                    mo13i(f269ai);
                                                    f287b = -1;
                                                    f269ai = -1;
                                                    m339c((int) (short) (f414w[0] & 65535), (int) (short) ((f414w[0] & -65536) >> 16));
                                                    break;
                                                case 1:
                                                    short s = (short) ((C0001a.f124d[f269ai][2] & -65536) >> 16);
                                                    short s2 = (short) (f414w[0] & 65535);
                                                    short s3 = (short) ((f414w[0] & -65536) >> 16);
                                                    short s4 = (short) (f391q[s][0] & 65535);
                                                    short s5 = (short) ((f391q[s][0] & -65536) >> 16);
                                                    if (s3 > s5) {
                                                        int[] iArr = f391q[s];
                                                        iArr[27] = iArr[27] & -65536;
                                                        int[] iArr2 = f391q[s];
                                                        iArr2[27] = iArr2[27] | 2;
                                                    } else if (s3 < s5) {
                                                        int[] iArr3 = f391q[s];
                                                        iArr3[27] = iArr3[27] & -65536;
                                                        int[] iArr4 = f391q[s];
                                                        iArr4[27] = iArr4[27] | 0;
                                                    } else if (s2 < s4) {
                                                        int[] iArr5 = f391q[s];
                                                        iArr5[27] = iArr5[27] & -65536;
                                                        int[] iArr6 = f391q[s];
                                                        iArr6[27] = iArr6[27] | 3;
                                                    } else {
                                                        int[] iArr7 = f391q[s];
                                                        iArr7[27] = iArr7[27] & -65536;
                                                        int[] iArr8 = f391q[s];
                                                        iArr8[27] = iArr8[27] | 1;
                                                    }
                                                    if (!m285a(9, (int) s, 0, 0, 0, false)) {
                                                        int i4 = m230a(C0001a.f124d[f269ai])[13];
                                                        int i5 = 114;
                                                        f376n = -1;
                                                        if ((i4 & 8) != 0) {
                                                            i2 = C0000HG.m40b(114, 116);
                                                            i5 = 125;
                                                        } else if ((i4 & 4) != 0) {
                                                            i2 = C0000HG.m40b(111, 113);
                                                            i5 = 114;
                                                        } else if ((i4 & 2) != 0) {
                                                            i2 = C0000HG.m40b(108, 110);
                                                            i5 = 116;
                                                        } else if ((i4 & 1) != 0) {
                                                            i2 = C0000HG.m40b(104, 107);
                                                            i5 = 116;
                                                        } else {
                                                            i2 = 0;
                                                        }
                                                        if (m230a(f391q[s])[0] == 149) {
                                                            i5 = 123;
                                                        }
                                                        f329e = true;
                                                        m254a(i5, i2, (int[]) null);
                                                        break;
                                                    }
                                                    break;
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                    int b2 = C0001a.m131b();
                                                    byte b3 = (byte) ((C0001a.f124d[f269ai][8] >> 8) & 255);
                                                    if (((1 << b3) & b2) == 0) {
                                                        byte b4 = (byte) ((C0001a.f124d[f269ai][8] >> 16) & 255);
                                                        byte b5 = (byte) ((C0001a.f124d[f269ai][8] >> 24) & 255);
                                                        if (((1 << (b3 + 1)) & b2) != 0) {
                                                            if (b4 > 0) {
                                                                int i6 = 0;
                                                                while (true) {
                                                                    if (i6 < f253a[5].length) {
                                                                        int i7 = f253a[5][i6][4];
                                                                        if (i7 < 0 || f313c[i7][4] != b4) {
                                                                            i6++;
                                                                        } else {
                                                                            i = (1 << b3) | b2;
                                                                            m285a(12, 7, (int) (short) ((C0001a.f124d[f269ai][2] & -65536) >> 16), (int) (byte) (C0001a.f124d[f269ai][8] & 255), 0, false);
                                                                            m274a(C0001a.f124d[f269ai], false);
                                                                            if (((byte) (C0001a.f124d[f269ai][8] & 255)) == 5) {
                                                                                int[] iArr9 = C0001a.f124d[f269ai];
                                                                                iArr9[3] = iArr9[3] | 32768;
                                                                                m330b(C0001a.f124d[f269ai], true);
                                                                                f377n = true;
                                                                            }
                                                                            C0000HG.m81m(9);
                                                                            C0001a.m95a(i);
                                                                            b = 0;
                                                                        }
                                                                    } else {
                                                                        b = b5;
                                                                        i = b2;
                                                                    }
                                                                }
                                                                if (((1 << b3) & i) == 0) {
                                                                    C0000HG.m81m(31);
                                                                    m285a(12, 7, (int) (short) ((C0001a.f124d[f269ai][2] & -65536) >> 16), 1, 0, false);
                                                                }
                                                                b5 = b;
                                                            } else {
                                                                i = b2;
                                                            }
                                                            if (b5 > 0) {
                                                                m414h(f269ai);
                                                                if (f198J == 0) {
                                                                    C0000HG.m81m(31);
                                                                }
                                                            }
                                                        } else if (b4 > 0 || b5 > 0) {
                                                            i = (1 << (b3 + 1)) | b2;
                                                            m285a(12, 7, (int) (short) ((C0001a.f124d[f269ai][2] & -65536) >> 16), 1, 0, false);
                                                            C0000HG.m81m(31);
                                                        } else {
                                                            i = (1 << b3) | b2;
                                                            m285a(12, 7, (int) (short) ((C0001a.f124d[f269ai][2] & -65536) >> 16), (int) (byte) (C0001a.f124d[f269ai][8] & 255), 0, false);
                                                            m274a(C0001a.f124d[f269ai], false);
                                                            if (((byte) (C0001a.f124d[f269ai][8] & 255)) == 5) {
                                                                int[] iArr10 = C0001a.f124d[f269ai];
                                                                iArr10[3] = iArr10[3] | 32768;
                                                                m330b(C0001a.f124d[f269ai], true);
                                                                f377n = true;
                                                            }
                                                            C0000HG.m81m(9);
                                                        }
                                                    } else {
                                                        i = b2;
                                                    }
                                                    C0001a.m95a(i);
                                                    m339c((int) (short) (f414w[0] & 65535), (int) (short) ((f414w[0] & -65536) >> 16));
                                                    break;
                                                case 7:
                                                    if (!m285a(12, 7, (int) (short) ((C0001a.f124d[f269ai][2] & -65536) >> 16), 8, 0, false)) {
                                                        if ((C0001a.f124d[f269ai][3] & 32) == 0 || (C0001a.f124d[f269ai][13] & 2) != 0) {
                                                            C0000HG.f6G = 0;
                                                        } else {
                                                            C0000HG.f6G = C0001a.m94a();
                                                        }
                                                        C0000HG.f19a.removeAllElements();
                                                        C0000HG.m64g(21);
                                                        C0000HG.f70l = true;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            m193A();
                                            m195C();
                                        }
                                    }
                                    if (m220a(35)) {
                                        f337f = true;
                                    }
                                    if (m220a(15)) {
                                        f320d = true;
                                    }
                                    if (m220a(20)) {
                                        f405u = true;
                                    }
                                    if (m220a(25)) {
                                        f369l = true;
                                    }
                                    if (m220a(30)) {
                                        f292b = true;
                                    }
                                    if (m220a(33)) {
                                        f369l = true;
                                        f320d = true;
                                    }
                                    if (m220a(34)) {
                                        f369l = true;
                                        f405u = true;
                                    }
                                    if (m220a(31)) {
                                        f292b = true;
                                        f320d = true;
                                    }
                                    if (m220a(32)) {
                                        f292b = true;
                                        f405u = true;
                                    }
                                    if (m220a(100)) {
                                        f307c = true;
                                    }
                                    if (m220a(95) && ((short) (f414w[12] & 65535)) > 0) {
                                        f352h = true;
                                        m394f();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                } else {
                    C0000HG.f19a.removeAllElements();
                    C0000HG.m64g(14);
                    C0000HG.f70l = true;
                }
            } else {
                if (C0000HG.f21a >= 0 && C0000HG.f65j >= 0) {
                    short s6 = C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j << 2) + 2];
                    if (s6 == 107 || s6 == 106) {
                        if (m220a(61)) {
                            C0000HG.m84o();
                        }
                        if (m220a(62)) {
                            C0000HG.m59e();
                        }
                    } else {
                        if (m220a(60)) {
                            C0000HG.m59e();
                        }
                        if (m220a(55)) {
                            C0000HG.m84o();
                        }
                    }
                }
                if (C0000HG.f21a == 19) {
                    if (m220a(61)) {
                        C0000HG.f8a--;
                        if (C0000HG.f8a < 0) {
                            C0000HG.f8a = 5;
                        }
                        C0000HG.f65j = -1;
                        C0000HG.m26a(C0000HG.f21a);
                    }
                    if (m220a(62)) {
                        C0000HG.f8a++;
                        if (C0000HG.f8a >= 6) {
                            C0000HG.f8a = 0;
                        }
                        C0000HG.f65j = -1;
                        C0000HG.m26a(C0000HG.f21a);
                    }
                    if (C0000HG.m39b(6)) {
                        if (m220a(110) && C0000HG.f65j >= 0) {
                            C0000HG.f42c = C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j * 4) + 3] & Short.MAX_VALUE;
                            C0000HG.f38b = f253a[C0000HG.f8a][C0000HG.f42c];
                            if (!(C0000HG.f8a == 2 && f395r[C0000HG.f38b[4]][3] == 0)) {
                                i3 = 1;
                            }
                            if (i3 != 0) {
                                C0000HG.m89q(14);
                            }
                        }
                        if (m220a(111)) {
                            int i8 = (C0000HG.f8a == 5 || C0000HG.f8a == 4 || f414w[11] == 0) ? -1 : (C0000HG.f84v & 1) != 0 ? 22 : 13;
                            if (C0000HG.f65j >= 0 && i8 >= 0) {
                                C0000HG.f42c = C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j * 4) + 3] & Short.MAX_VALUE;
                                C0000HG.f38b = f253a[C0000HG.f8a][C0000HG.f42c];
                                C0000HG.m89q(i8);
                            }
                        }
                        if (m220a(112) && C0000HG.f65j >= 0) {
                            C0000HG.f42c = C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j * 4) + 3] & Short.MAX_VALUE;
                            C0000HG.f38b = f253a[C0000HG.f8a][C0000HG.f42c];
                            C0000HG.f50d = C0001a.m102a(C0000HG.f38b);
                            C0000HG.m89q(27);
                        }
                        if (m220a(114) && C0000HG.f65j >= 0) {
                            C0000HG.f42c = C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j * 4) + 3] & Short.MAX_VALUE;
                            C0000HG.f38b = f253a[C0000HG.f8a][C0000HG.f42c];
                            if (!(C0000HG.f8a == 1 || C0000HG.f8a == 5 || (C0000HG.f84v & 1) != 0 || (C0000HG.f8a == 2 && f395r[C0000HG.f38b[4]][3] == 0))) {
                                C0000HG.m89q(15);
                            }
                        }
                    }
                } else if (C0000HG.f21a == 21) {
                    if (C0000HG.m39b(6)) {
                        if (m220a(112) && C0000HG.f65j >= 0) {
                            C0000HG.f38b = C0001a.f124d[C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j * 4) + 3] & Short.MAX_VALUE];
                            C0000HG.f1B = C0000HG.f65j - 1;
                            C0000HG.m89q(27);
                        }
                        if (m220a(113) && C0000HG.f65j >= 0) {
                            C0000HG.f38b = C0001a.f124d[C0000HG.f32a[C0000HG.f21a][(C0000HG.f65j * 4) + 3] & Short.MAX_VALUE];
                            C0000HG.f1B = C0000HG.f65j - 1;
                            C0000HG.m89q(19);
                        }
                    }
                    if (C0000HG.f51d) {
                        if (m220a(61)) {
                            C0001a.m157d();
                            C0000HG.f65j = -1;
                            C0000HG.m26a(C0000HG.f21a);
                        }
                        if (m220a(62)) {
                            C0001a.m168g();
                            C0000HG.f65j = -1;
                            C0000HG.m26a(C0000HG.f21a);
                        }
                    }
                } else if (C0000HG.f21a == 24) {
                    if (C0000HG.m39b(6) && m220a(112)) {
                        C0000HG.m89q(6);
                        if (C0000HG.f21a == 20) {
                            C0000HG.m89q(6);
                        }
                    }
                } else if (C0000HG.f21a == 23) {
                    if (m220a(61)) {
                        C0000HG.f71m--;
                        if (C0000HG.f71m < 0) {
                            C0000HG.f71m = 3;
                        }
                        C0000HG.m26a(C0000HG.f21a);
                    }
                    if (m220a(62)) {
                        C0000HG.f71m++;
                        if (C0000HG.f71m >= 4) {
                            C0000HG.f71m = 0;
                        }
                        C0000HG.m26a(C0000HG.f21a);
                    }
                } else if (C0000HG.f21a == 25) {
                    if (m220a(61)) {
                        C0000HG.f61h--;
                        if (C0000HG.f61h < 1) {
                            C0000HG.f61h = 2;
                        }
                        C0000HG.m26a(C0000HG.f21a);
                    }
                    if (m220a(62)) {
                        C0000HG.f61h++;
                        if (C0000HG.f61h >= 3) {
                            C0000HG.f61h = 1;
                        }
                        C0000HG.m26a(C0000HG.f21a);
                    }
                }
                if (m220a(80)) {
                    if (C0000HG.f4E >= 0) {
                        C0000HG.m89q(C0000HG.f4E);
                    } else {
                        C0000HG.m71i();
                    }
                }
                if (m220a(65)) {
                    C0000HG.m71i();
                }
                if (m220a(85)) {
                    if (C0000HG.f81s >= 0) {
                        C0000HG.m89q(C0000HG.f81s);
                    } else {
                        C0000HG.m82n();
                    }
                }
                if (m220a(109) && !((C0000HG.f84v & 2) == 0 && (C0000HG.f84v & 1) == 0)) {
                    if (C0000HG.f21a == 21) {
                        C0000HG.m64g(19);
                    } else if ((C0000HG.f84v & 1) != 0) {
                        C0000HG.m64g(21);
                    }
                }
            }
        } else {
            m304ae();
        }
        m208P();
    }

    /* JADX WARNING: Removed duplicated region for block: B:123:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0469  */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m218Z() {
        /*
            r15 = 65535(0xffff, float:9.1834E-41)
            r12 = 30
            r14 = -1
            r5 = 1
            r1 = 0
            int[] r0 = f414w
            r2 = 11
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0012
            f337f = r1
        L_0x0012:
            int[] r0 = f414w
            r2 = 12
            r0 = r0[r2]
            r0 = r0 & r15
            short r0 = (short) r0
            if (r0 > 0) goto L_0x0111
            int[] r0 = f414w
            r2 = 16
            m393f(r0, r2)
            int[] r0 = f414w
            r2 = 3
            r0 = r0[r2]
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00ae
            r0 = 17
            r2 = r1
            r3 = r1
            r4 = r1
            m285a(r0, r1, r2, r3, r4, r5)
            p000.C0000HG.m81m(r12)
            r0 = 3
            boolean r0 = p000.C0000HG.m39b(r0)
            if (r0 == 0) goto L_0x0046
            r0 = 50
            r2 = 1000(0x3e8, double:4.94E-321)
            com.nokia.mid.ui.DeviceControl.startVibra(r0, r2)     // Catch:{ Exception -> 0x008c }
        L_0x0046:
            int[] r0 = f414w
            r2 = 3
            r3 = r0[r2]
            r4 = 8388608(0x800000, float:1.17549435E-38)
            r3 = r3 | r4
            r0[r2] = r3
            int[] r0 = f414w
            r2 = 3
            r3 = r0[r2]
            r4 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r4
            r0[r2] = r3
            int[] r0 = f414w
            m330b(r0, r5)
            f265ae = r14
            f269ai = r14
            f287b = r14
            f222V = r14
            f352h = r1
            f393r = r1
            f397s = r1
            r0 = r1
        L_0x006f:
            int[][] r2 = f411v
            int r2 = r2.length
            if (r0 >= r2) goto L_0x0091
            int[][] r2 = f411v
            r2 = r2[r0]
            r3 = 6
            r2 = r2[r3]
            int r2 = r2 >> 16
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            if (r2 != 0) goto L_0x0089
            int[][] r2 = f411v
            r2 = r2[r0]
            r3 = 6
            r2[r3] = r14
        L_0x0089:
            int r0 = r0 + 1
            goto L_0x006f
        L_0x008c:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x0046
        L_0x0091:
            r0 = r1
        L_0x0092:
            int[][] r2 = f367k
            int r2 = r2.length
            if (r0 >= r2) goto L_0x00a0
            int[][] r2 = f367k
            r2 = r2[r0]
            r2[r1] = r1
            int r0 = r0 + 1
            goto L_0x0092
        L_0x00a0:
            boolean r0 = p000.C0000HG.f70l
            if (r0 == 0) goto L_0x00a9
            r0 = 11
            p000.C0000HG.m89q(r0)
        L_0x00a9:
            int r0 = f265ae
            m362d(r0)
        L_0x00ae:
            int[] r0 = f414w
            boolean r0 = m274a(r0, r1)
            if (r0 == 0) goto L_0x00ed
            boolean r0 = f337f
            if (r0 == 0) goto L_0x00ed
            r0 = 2
            boolean r0 = m458o(r0)
            if (r0 != 0) goto L_0x00c8
            r0 = 3
            boolean r0 = m458o(r0)
            if (r0 == 0) goto L_0x0107
        L_0x00c8:
            r0 = 312(0x138, float:4.37E-43)
            long r2 = f317d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00fa
            long r2 = f231a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x00fa
            long r2 = f317d
            long r4 = f231a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x049d
            r2 = 39
            r0 = 313(0x139, float:4.39E-43)
        L_0x00e6:
            r3 = 382(0x17e, float:5.35E-43)
            r4 = 34
            m317b(r0, r3, r2, r4)
        L_0x00ed:
            f320d = r1
            f405u = r1
            f369l = r1
            f292b = r1
            f337f = r1
            f307c = r1
        L_0x00f9:
            return
        L_0x00fa:
            long r2 = f317d
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x049d
            r2 = 39
            r0 = 313(0x139, float:4.39E-43)
            goto L_0x00e6
        L_0x0107:
            r0 = 390(0x186, float:5.47E-43)
            r2 = 382(0x17e, float:5.35E-43)
            r3 = 34
            m317b(r0, r2, r5, r3)
            goto L_0x00ed
        L_0x0111:
            int r0 = f420y
            int r0 = r0 % 20
            if (r0 != 0) goto L_0x0133
            boolean r0 = f397s
            if (r0 != 0) goto L_0x0133
            int[] r0 = f414w
            r2 = 13
            r0 = r0[r2]
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r2
            int r0 = r0 >> 16
            short r0 = (short) r0
            int r0 = r0 * 3
            int r0 = r0 / 100
            if (r0 != 0) goto L_0x012e
            r0 = r5
        L_0x012e:
            int[] r2 = f414w
            m253a(r5, r0, r5, r1, r2)
        L_0x0133:
            int[] r0 = f414w
            r2 = 18
            r0 = r0[r2]
            int r0 = m391f(r0)
            if (r0 < 0) goto L_0x017a
            int[] r2 = f414w
            r3 = 17
            r2 = r2[r3]
            if (r0 > r2) goto L_0x017a
            int[] r0 = f414w
            r2 = 18
            r3 = r0[r2]
            int r3 = r3 + 1
            r0[r2] = r3
            r0 = 7
            p000.C0000HG.m81m(r0)
            int[] r0 = f414w
            r2 = 4
            r0 = r0[r2]
            int[] r2 = f414w
            r3 = 5
            r2 = r2[r3]
            int[] r3 = f414w
            r4 = 2
            r3 = r3[r4]
            r3 = r3 & r15
            short r3 = (short) r3
            m408g(r0, r2, r3)
            r0 = 24
            r2 = 10
            int[] r3 = f414w
            m253a(r0, r2, r5, r1, r3)
            r0 = 2
            r2 = 10
            int[] r3 = f414w
            m253a(r0, r2, r5, r1, r3)
        L_0x017a:
            int[] r0 = f414w
            int r0 = m459p(r0)
            r2 = 8
            if (r0 == r2) goto L_0x01a2
            int[] r0 = f414w
            int r0 = m459p(r0)
            r2 = 9
            if (r0 == r2) goto L_0x01a2
            int[] r0 = f414w
            int r0 = m459p(r0)
            r2 = 10
            if (r0 == r2) goto L_0x01a2
            int[] r0 = f414w
            int r0 = m459p(r0)
            r2 = 11
            if (r0 != r2) goto L_0x03bc
        L_0x01a2:
            int[] r0 = f414w
            boolean r0 = m274a(r0, r5)
            if (r0 != 0) goto L_0x0391
            r13 = r5
        L_0x01ab:
            if (r13 != 0) goto L_0x049a
            boolean r0 = f397s
            if (r0 != 0) goto L_0x049a
            boolean r0 = f320d
            if (r0 != 0) goto L_0x01b9
            boolean r0 = f405u
            if (r0 == 0) goto L_0x03c4
        L_0x01b9:
            boolean r0 = f369l
            if (r0 != 0) goto L_0x01c1
            boolean r0 = f292b
            if (r0 == 0) goto L_0x03c4
        L_0x01c1:
            int[] r0 = f414w
            r2 = 52
            r0 = r0[r2]
            int[] r2 = f414w
            r3 = 52
            r2 = r2[r3]
            int r0 = r0 * r2
            int r0 = r0 >> 1
            int r0 = mo11g(r0)
        L_0x01d4:
            int[] r2 = f414w
            r3 = 4
            r4 = r2[r3]
            int[] r2 = f414w
            r3 = 5
            r2 = r2[r3]
            boolean r3 = f320d
            if (r3 == 0) goto L_0x0497
            int r2 = r2 - r0
            int[] r3 = f414w
            r3[r12] = r1
            r3 = r5
        L_0x01e8:
            boolean r6 = f405u
            if (r6 == 0) goto L_0x01f3
            int r2 = r2 + r0
            int[] r3 = f414w
            r6 = 2
            r3[r12] = r6
            r3 = r5
        L_0x01f3:
            boolean r6 = f369l
            if (r6 == 0) goto L_0x0494
            int r3 = r4 - r0
            int[] r4 = f414w
            r6 = 3
            r4[r12] = r6
            r4 = r3
            r6 = r5
        L_0x0200:
            boolean r3 = f292b
            if (r3 == 0) goto L_0x0491
            int r4 = r4 + r0
            int[] r0 = f414w
            r0[r12] = r5
            r0 = r5
        L_0x020a:
            if (r0 == 0) goto L_0x03df
            int r3 = f258aA
            int r3 = r3 + -1
            f258aA = r3
            int r3 = f258aA
            if (r3 > 0) goto L_0x0219
            r3 = 4
            f258aA = r3
        L_0x0219:
            int[] r3 = f414w
            r3 = r3[r1]
            int[] r6 = f414w
            r7 = 4128(0x1020, float:5.785E-42)
            int r2 = p000.C0001a.m104a(r6, r4, r2, r7)
            r4 = -2
            if (r2 != r4) goto L_0x03cc
            int[] r2 = f414w
            r4 = 52
            r6 = r2[r4]
            int[] r7 = f414w
            r8 = 16
            r7 = r7[r8]
            int r7 = r7 >> 3
            int r6 = r6 + r7
            r2[r4] = r6
            int[] r2 = f414w
            r4 = 52
            r2 = r2[r4]
            int[] r4 = f414w
            r6 = 16
            r4 = r4[r6]
            if (r2 <= r4) goto L_0x0253
            int[] r2 = f414w
            r4 = 52
            int[] r6 = f414w
            r7 = 16
            r6 = r6[r7]
            r2[r4] = r6
        L_0x0253:
            int[] r2 = f414w
            r2 = r2[r1]
            if (r2 == r3) goto L_0x02cd
            r6 = 8
            int[] r2 = f414w
            r2 = r2[r1]
            r2 = r2 & r15
            short r7 = (short) r2
            int[] r2 = f414w
            r2 = r2[r1]
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r4
            int r2 = r2 >> 16
            short r8 = (short) r2
            r2 = r3 & r15
            short r9 = (short) r2
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r10 = (short) r2
            r11 = r1
            boolean r4 = m285a(r6, r7, r8, r9, r10, r11)
            r6 = 13
            int[] r2 = f414w
            r2 = r2[r1]
            r2 = r2 & r15
            short r7 = (short) r2
            int[] r2 = f414w
            r2 = r2[r1]
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r8
            int r2 = r2 >> 16
            short r8 = (short) r2
            r2 = r3 & r15
            short r9 = (short) r2
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r10 = (short) r2
            r11 = r1
            boolean r3 = m285a(r6, r7, r8, r9, r10, r11)
            int[] r2 = f414w
            r6 = 11
            r2 = r2[r6]
            if (r2 != 0) goto L_0x03dc
            r6 = 18
            int[] r2 = f414w
            r2 = r2[r1]
            r2 = r2 & r15
            short r7 = (short) r2
            int[] r2 = f414w
            r2 = r2[r1]
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r8
            int r2 = r2 >> 16
            short r8 = (short) r2
            r9 = r1
            r10 = r1
            r11 = r1
            boolean r2 = m285a(r6, r7, r8, r9, r10, r11)
            if (r2 == 0) goto L_0x03dc
            r2 = r5
        L_0x02bd:
            if (r2 != 0) goto L_0x02c1
            f212Q = r14
        L_0x02c1:
            if (r4 != 0) goto L_0x02cd
            if (r3 != 0) goto L_0x02cd
            if (r2 != 0) goto L_0x02cd
            boolean r2 = m380e()
            if (r2 != 0) goto L_0x00f9
        L_0x02cd:
            boolean r2 = m219a()
            if (r2 == 0) goto L_0x0400
            boolean r2 = f307c
            if (r2 == 0) goto L_0x02df
            m209Q()
            int r2 = f265ae
            m362d(r2)
        L_0x02df:
            int r2 = f265ae
            boolean r2 = m307b(r2)
            if (r2 != 0) goto L_0x02ee
            f265ae = r14
            int r2 = f265ae
            m362d(r2)
        L_0x02ee:
            int r2 = f265ae
            boolean r2 = m462p(r2)
            f345g = r2
            int r2 = f265ae
            if (r2 != r14) goto L_0x02fe
            boolean r2 = f373m
            if (r2 == 0) goto L_0x0306
        L_0x02fe:
            boolean r2 = f345g
            if (r2 != 0) goto L_0x031b
            boolean r2 = f337f
            if (r2 == 0) goto L_0x031b
        L_0x0306:
            int r2 = m306b()
            if (r2 == r14) goto L_0x031b
            boolean r3 = f337f
            if (r3 == 0) goto L_0x0312
            f373m = r1
        L_0x0312:
            f265ae = r2
            int r2 = f265ae
            m362d(r2)
            f345g = r5
        L_0x031b:
            int[] r2 = m219a()
            int r2 = m442l(r2)
            r3 = 3
            if (r2 != r3) goto L_0x03ef
            int[] r3 = f414w
            r4 = 53
            r3 = r3[r4]
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r4
            int r3 = r3 >> 16
            short r3 = (short) r3
            if (r3 > 0) goto L_0x03ef
            f345g = r1
        L_0x0336:
            int r2 = f316d
            int r2 = r2 + -1
            f316d = r2
            int[] r2 = f414w
            r3 = 45
            r2 = r2[r3]
            if (r2 != r14) goto L_0x0346
            f397s = r1
        L_0x0346:
            boolean r2 = f337f
            if (r2 == 0) goto L_0x048e
            int r2 = f316d
            if (r2 >= 0) goto L_0x048e
            int[] r2 = f414w
            r3 = 45
            r2 = r2[r3]
            if (r2 < 0) goto L_0x040b
            int[] r2 = f414w
            r3 = 45
            r2 = r2[r3]
            m433j(r2)
            int[] r2 = f414w
            int[] r3 = f414w
            r3 = r3[r12]
            int r3 = r3 + 12
            m393f(r2, r3)
        L_0x036a:
            r2 = r5
        L_0x036b:
            if (r2 == 0) goto L_0x0469
        L_0x036d:
            m216X()
            int[] r0 = f414w
            r0 = r0[r1]
            r0 = r0 & r15
            short r0 = (short) r0
            int[] r2 = f414w
            r2 = r2[r1]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r2 = (short) r2
            m339c(r0, r2)
            f320d = r1
            f405u = r1
            f369l = r1
            f292b = r1
            f337f = r1
            f307c = r1
            goto L_0x00f9
        L_0x0391:
            int[] r0 = f414w
            r2 = 45
            r0 = r0[r2]
            if (r0 != r14) goto L_0x03bc
            int[] r0 = m219a()
            int r2 = f184C
            if (r2 == r14) goto L_0x03bf
            boolean r2 = f357i
            if (r2 == 0) goto L_0x03bf
            int[] r2 = f414w
            int[][] r3 = f391q
            int r4 = f184C
            r3 = r3[r4]
            int r0 = m233a(r2, r3, r0)
            f316d = r0
        L_0x03b3:
            f184C = r14
            f357i = r1
            int r0 = f265ae
            m362d(r0)
        L_0x03bc:
            r13 = r1
            goto L_0x01ab
        L_0x03bf:
            r0 = 10
            f316d = r0
            goto L_0x03b3
        L_0x03c4:
            int[] r0 = f414w
            r2 = 52
            r0 = r0[r2]
            goto L_0x01d4
        L_0x03cc:
            int[] r2 = f414w
            r4 = 52
            int[] r6 = f414w
            r7 = 16
            r6 = r6[r7]
            int r6 = r6 >> 1
            r2[r4] = r6
            goto L_0x0253
        L_0x03dc:
            r2 = r1
            goto L_0x02bd
        L_0x03df:
            int[] r2 = f414w
            r3 = 52
            int[] r4 = f414w
            r6 = 16
            r4 = r4[r6]
            int r4 = r4 >> 1
            r2[r3] = r4
            goto L_0x02cd
        L_0x03ef:
            r3 = 2
            if (r2 != r3) goto L_0x0336
            int[] r2 = f414w
            r3 = 53
            r2 = r2[r3]
            r2 = r2 & r15
            short r2 = (short) r2
            if (r2 > 0) goto L_0x0336
            f345g = r1
            goto L_0x0336
        L_0x0400:
            f265ae = r14
            f345g = r1
            int r2 = f265ae
            m362d(r2)
            goto L_0x0336
        L_0x040b:
            int r2 = f265ae
            if (r2 == r14) goto L_0x0453
            boolean r2 = f345g
            if (r2 == 0) goto L_0x036a
            int[][] r2 = f391q
            int r3 = f265ae
            r2 = r2[r3]
            r3 = 4
            r2 = r2[r3]
            int[] r3 = f414w
            r4 = 4
            r3 = r3[r4]
            int r2 = r2 - r3
            int[][] r3 = f391q
            int r4 = f265ae
            r3 = r3[r4]
            r4 = 5
            r3 = r3[r4]
            int[] r4 = f414w
            r6 = 5
            r4 = r4[r6]
            int r3 = r3 - r4
            int[] r4 = f414w
            int r2 = m308b(r2, r3)
            r4[r12] = r2
            int[] r2 = f414w
            int[] r3 = f414w
            r3 = r3[r12]
            int r3 = r3 + 8
            m393f(r2, r3)
            int r2 = f265ae
            f184C = r2
            boolean r2 = f345g
            f357i = r2
            r2 = 2147483647(0x7fffffff, float:NaN)
            f316d = r2
            goto L_0x036a
        L_0x0453:
            int[] r2 = f414w
            int[] r3 = f414w
            r3 = r3[r12]
            int r3 = r3 + 8
            m393f(r2, r3)
            f184C = r14
            f357i = r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            f316d = r2
            goto L_0x036a
        L_0x0469:
            boolean r2 = f397s
            if (r2 == 0) goto L_0x0474
        L_0x046d:
            int[] r0 = f414w
            m274a(r0, r5)
            goto L_0x036d
        L_0x0474:
            if (r0 == 0) goto L_0x0482
            int[] r0 = f414w
            int[] r2 = f414w
            r2 = r2[r12]
            int r2 = r2 + 4
            m393f(r0, r2)
            goto L_0x046d
        L_0x0482:
            int[] r0 = f414w
            int[] r2 = f414w
            r2 = r2[r12]
            int r2 = r2 + 0
            m393f(r0, r2)
            goto L_0x046d
        L_0x048e:
            r2 = r13
            goto L_0x036b
        L_0x0491:
            r0 = r6
            goto L_0x020a
        L_0x0494:
            r6 = r3
            goto L_0x0200
        L_0x0497:
            r3 = r1
            goto L_0x01e8
        L_0x049a:
            r0 = r1
            goto L_0x02cd
        L_0x049d:
            r2 = r12
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m218Z():void");
    }

    /* renamed from: a */
    public static final int m219a() {
        for (int i = 0; i < f411v.length; i++) {
            if (f411v[i][6] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final int m220a(int i) {
        return i > 0 ? i : -i;
    }

    /* renamed from: a */
    public static final int m221a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i3;
            if (i4 >= f253a[i].length) {
                return i5;
            }
            if (f253a[i][i4][4] != i2) {
                i3 = i5;
            } else if (i == 2) {
                return i5 + f253a[i][i4][6];
            } else {
                i3 = i5 + 1;
            }
            i4++;
        }
    }

    /* renamed from: a */
    public static final int m222a(int i, int i2, int i3) {
        int i4 = i + i2 + (i3 << 1);
        return ((i4 * 100) + (i4 * -20)) / 200;
    }

    /* renamed from: a */
    public static final int m223a(int i, int i2, int i3, int i4) {
        return ((((i * 30) + (i2 * 2)) + (i3 * 2)) + (i4 * 3)) / 30;
    }

    /* renamed from: a */
    public static final int m224a(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        int i8 = 10;
        if (!m221a(i3, i2)) {
            return 0;
        }
        int b = C0000HG.m40b(m222a(i, i3, i7), m340c(i, i3, i7));
        if (z) {
            b = b + f414w[48] + f414w[49] + f414w[50];
        }
        int i9 = b - i5;
        if (!z || !m223a(i6 + i4, i, i2, i3)) {
            i8 = i9;
        } else {
            int i10 = i9 << 1;
            if (i10 >= 10) {
                i8 = i10;
            }
            if (C0000HG.m39b(3)) {
                try {
                    DeviceControl.startVibra(50, 500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        if (i8 < 1) {
            return 1;
        }
        return i8;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m225a(int r8, int r9, int r10, boolean r11, boolean r12) {
        /*
            r0 = -1
            r1 = -1
            switch(r8) {
                case 0: goto L_0x0055;
                case 1: goto L_0x0111;
                case 2: goto L_0x01cd;
                case 3: goto L_0x028a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r2 = r0
        L_0x0006:
            if (r1 > 0) goto L_0x03bd
            short r0 = (short) r8
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r1 = (short) r9
            int r1 = r1 << 16
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r3
            r1 = r1 | r0
            r0 = 0
        L_0x0015:
            r3 = 8
            if (r0 >= r3) goto L_0x03b3
            int[] r3 = f414w
            int r4 = r0 + 31
            r3 = r3[r4]
            if (r1 != r3) goto L_0x0052
            int[] r3 = f414w
            r4 = 39
            r5 = r3[r4]
            r6 = 1
            int r6 = r6 << r0
            r6 = r6 ^ -1
            r5 = r5 & r6
            r3[r4] = r5
            int[] r3 = f414w
            int r4 = r0 + 31
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r3[r4] = r5
            int[] r3 = f414w
            int r4 = r0 + 31
            r5 = r3[r4]
            int[][][] r6 = f253a
            r6 = r6[r8]
            r6 = r6[r9]
            r7 = 4
            r6 = r6[r7]
            short r6 = (short) r6
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
        L_0x0052:
            int r0 = r0 + 1
            goto L_0x0015
        L_0x0055:
            if (r11 != 0) goto L_0x00f5
            int[][] r0 = f359i
            int r2 = m234a(r0)
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r3 = 3
            r0 = r0[r3]
            int r0 = m377e(r0)
            if (r2 < 0) goto L_0x00f5
            if (r0 < 0) goto L_0x00f5
            int[][][] r3 = f253a
            r3 = r3[r8]
            r3 = r3[r9]
            r4 = 0
            int[][] r5 = f359i
            r5 = r5[r2]
            r6 = 0
            int[][][] r7 = f253a
            r7 = r7[r8]
            r7 = r7[r9]
            int r7 = r7.length
            java.lang.System.arraycopy(r3, r4, r5, r6, r7)
            int[][] r3 = p000.C0001a.f124d
            int[][] r4 = f359i
            r4 = r4[r2]
            r3[r0] = r4
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            short r6 = (short) r0
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            short r6 = (short) r2
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 1
            r5 = -1
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 3
            r5 = r3[r4]
            r5 = r5 | 64
            r3[r4] = r5
            if (r12 == 0) goto L_0x00f5
            int[][] r3 = f359i
            r2 = r3[r2]
            int[] r3 = f414w
            r4 = 0
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            int[] r4 = f414w
            r5 = 0
            r4 = r4[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            int r4 = r4 >> 16
            short r4 = (short) r4
            p000.C0001a.m119a(r2, r3, r4)
        L_0x00f5:
            int[] r2 = f414w
            r3 = 42
            r2 = r2[r3]
            if (r2 != r9) goto L_0x0005
            int[] r2 = f414w
            r3 = 42
            r2 = r2[r3]
            r3 = 0
            m226a(r8, r2, r3)
            int[] r2 = f414w
            r3 = 42
            r4 = -1
            r2[r3] = r4
            r2 = r0
            goto L_0x0006
        L_0x0111:
            if (r11 != 0) goto L_0x01b1
            int[][] r0 = f379n
            int r2 = m234a(r0)
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r3 = 3
            r0 = r0[r3]
            int r0 = m377e(r0)
            if (r2 < 0) goto L_0x01b1
            if (r0 < 0) goto L_0x01b1
            int[][][] r3 = f253a
            r3 = r3[r8]
            r3 = r3[r9]
            r4 = 0
            int[][] r5 = f379n
            r5 = r5[r2]
            r6 = 0
            int[][][] r7 = f253a
            r7 = r7[r8]
            r7 = r7[r9]
            int r7 = r7.length
            java.lang.System.arraycopy(r3, r4, r5, r6, r7)
            int[][] r3 = p000.C0001a.f124d
            int[][] r4 = f379n
            r4 = r4[r2]
            r3[r0] = r4
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            short r6 = (short) r0
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            short r6 = (short) r2
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 1
            r5 = -1
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 3
            r5 = r3[r4]
            r5 = r5 | 128(0x80, float:1.794E-43)
            r3[r4] = r5
            if (r12 == 0) goto L_0x01b1
            int[][] r3 = f379n
            r2 = r3[r2]
            int[] r3 = f414w
            r4 = 0
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            int[] r4 = f414w
            r5 = 0
            r4 = r4[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            int r4 = r4 >> 16
            short r4 = (short) r4
            p000.C0001a.m119a(r2, r3, r4)
        L_0x01b1:
            int[] r2 = f414w
            r3 = 41
            r2 = r2[r3]
            if (r2 != r9) goto L_0x0005
            int[] r2 = f414w
            r3 = 41
            r2 = r2[r3]
            r3 = 0
            m226a(r8, r2, r3)
            int[] r2 = f414w
            r3 = 41
            r4 = -1
            r2[r3] = r4
            r2 = r0
            goto L_0x0006
        L_0x01cd:
            if (r11 != 0) goto L_0x0005
            int[][] r0 = f371l
            int r3 = m234a(r0)
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r2 = 3
            r0 = r0[r2]
            int r2 = m377e(r0)
            if (r3 < 0) goto L_0x0006
            if (r2 < 0) goto L_0x0006
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r1 = 0
            int[][] r4 = f371l
            r4 = r4[r3]
            r5 = 0
            int[][][] r6 = f253a
            r6 = r6[r8]
            r6 = r6[r9]
            int r6 = r6.length
            java.lang.System.arraycopy(r0, r1, r4, r5, r6)
            int[][] r0 = f371l
            r0 = r0[r3]
            r1 = 6
            r0[r1] = r10
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r1 = 6
            r0 = r0[r1]
            int r0 = r0 - r10
            int[][][] r1 = f253a
            r1 = r1[r8]
            r1 = r1[r9]
            r4 = 6
            r1[r4] = r0
            int[][] r1 = p000.C0001a.f124d
            int[][] r4 = f371l
            r4 = r4[r3]
            r1[r2] = r4
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r2]
            r4 = 2
            r5 = r1[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r1[r4] = r5
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r2]
            r4 = 2
            r5 = r1[r4]
            short r6 = (short) r2
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r5 = r5 | r6
            r1[r4] = r5
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r2]
            r4 = 2
            r5 = r1[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r1[r4] = r5
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r2]
            r4 = 2
            r5 = r1[r4]
            short r6 = (short) r3
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r1[r4] = r5
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r2]
            r4 = 1
            r5 = -1
            r1[r4] = r5
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r2]
            r4 = 3
            r5 = r1[r4]
            r5 = r5 | 256(0x100, float:3.59E-43)
            r1[r4] = r5
            if (r12 == 0) goto L_0x0438
            int[][] r1 = f371l
            r1 = r1[r3]
            int[] r3 = f414w
            r4 = 0
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            int[] r4 = f414w
            r5 = 0
            r4 = r4[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            int r4 = r4 >> 16
            short r4 = (short) r4
            p000.C0001a.m119a(r1, r3, r4)
            r1 = r0
            goto L_0x0006
        L_0x028a:
            if (r11 != 0) goto L_0x0005
            int[][] r0 = f423y
            int r2 = m234a(r0)
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r3 = 3
            r0 = r0[r3]
            int r0 = m377e(r0)
            if (r2 < 0) goto L_0x032a
            if (r0 < 0) goto L_0x032a
            int[][][] r3 = f253a
            r3 = r3[r8]
            r3 = r3[r9]
            r4 = 0
            int[][] r5 = f423y
            r5 = r5[r2]
            r6 = 0
            int[][][] r7 = f253a
            r7 = r7[r8]
            r7 = r7[r9]
            int r7 = r7.length
            java.lang.System.arraycopy(r3, r4, r5, r6, r7)
            int[][] r3 = p000.C0001a.f124d
            int[][] r4 = f423y
            r4 = r4[r2]
            r3[r0] = r4
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            short r6 = (short) r0
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 2
            r5 = r3[r4]
            short r6 = (short) r2
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 1
            r5 = -1
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r4 = 3
            r5 = r3[r4]
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r3[r4] = r5
            if (r12 == 0) goto L_0x032a
            int[][] r3 = f423y
            r2 = r3[r2]
            int[] r3 = f414w
            r4 = 0
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            int[] r4 = f414w
            r5 = 0
            r4 = r4[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            int r4 = r4 >> 16
            short r4 = (short) r4
            p000.C0001a.m119a(r2, r3, r4)
        L_0x032a:
            int[] r2 = f414w
            r3 = 43
            r2 = r2[r3]
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            short r2 = (short) r2
            if (r2 != r9) goto L_0x0360
            int[] r2 = f414w
            r3 = 43
            r2 = r2[r3]
            r3 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r3
            short r2 = (short) r2
            r3 = 0
            m226a(r8, r2, r3)
            int[] r2 = f414w
            r3 = 43
            r4 = r2[r3]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            r2[r3] = r4
            int[] r2 = f414w
            r3 = 43
            r4 = r2[r3]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 | r5
            r2[r3] = r4
            r2 = r0
            goto L_0x0006
        L_0x0360:
            int[] r2 = f414w
            r3 = 43
            r2 = r2[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r2 = (short) r2
            if (r2 != r9) goto L_0x0398
            int[] r2 = f414w
            r3 = 43
            r2 = r2[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r2 = (short) r2
            r3 = 0
            m226a(r8, r2, r3)
            int[] r2 = f414w
            r3 = 43
            r4 = r2[r3]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            r2[r3] = r4
            int[] r2 = f414w
            r3 = 43
            r4 = r2[r3]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 | r5
            r2[r3] = r4
            r2 = r0
            goto L_0x0006
        L_0x0398:
            int[] r2 = f414w
            r3 = 44
            r2 = r2[r3]
            if (r2 != r9) goto L_0x0005
            int[] r2 = f414w
            r3 = 44
            r2 = r2[r3]
            r3 = 0
            m226a(r8, r2, r3)
            int[] r2 = f414w
            r3 = 44
            r4 = -1
            r2[r3] = r4
            goto L_0x0005
        L_0x03b3:
            int[][][] r0 = f253a
            r0 = r0[r8]
            r0 = r0[r9]
            r1 = 4
            r3 = -1
            r0[r1] = r3
        L_0x03bd:
            if (r12 == 0) goto L_0x042a
            int[] r0 = f414w
            r1 = 0
            r0 = r0[r1]
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            int[] r1 = f414w
            r3 = 0
            r1 = r1[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r3
            int r1 = r1 >> 16
            short r1 = (short) r1
            int[][] r3 = p000.C0001a.f109a
            r1 = r3[r1]
            r1 = r1[r0]
            r0 = 0
        L_0x03db:
            r3 = -1
            if (r1 == r3) goto L_0x03f8
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r1]
            r4 = 3
            r3 = r3[r4]
            r3 = r3 & 10176(0x27c0, float:1.426E-41)
            if (r3 <= 0) goto L_0x042b
            if (r1 == r2) goto L_0x042b
            int[][] r0 = p000.C0001a.f124d
            r0 = r0[r1]
            r1 = 3
            r3 = r0[r1]
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r4
            r0[r1] = r3
            r0 = 1
        L_0x03f8:
            if (r0 == 0) goto L_0x0412
            int[][] r0 = p000.C0001a.f124d
            r0 = r0[r2]
            r1 = 3
            r3 = r0[r1]
            r4 = 524288(0x80000, float:7.34684E-40)
            r3 = r3 | r4
            r0[r1] = r3
            int[][] r0 = p000.C0001a.f124d
            r0 = r0[r2]
            r1 = 3
            r3 = r0[r1]
            r4 = 1048576(0x100000, float:1.469368E-39)
            r3 = r3 | r4
            r0[r1] = r3
        L_0x0412:
            int[] r0 = f414w
            r1 = 0
            r0 = r0[r1]
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            int[] r1 = f414w
            r3 = 0
            r1 = r1[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r3
            int r1 = r1 >> 16
            short r1 = (short) r1
            m339c(r0, r1)
        L_0x042a:
            return r2
        L_0x042b:
            int[][] r3 = p000.C0001a.f124d
            r1 = r3[r1]
            r3 = 1
            r1 = r1[r3]
            r3 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r3
            short r1 = (short) r1
            goto L_0x03db
        L_0x0438:
            r1 = r0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m225a(int, int, int, boolean, boolean):int");
    }

    /* renamed from: a */
    public static final int m226a(int i, int i2, boolean z) {
        int[] iArr = f391q[i];
        iArr[20] = iArr[20] & 65535;
        int[] iArr2 = f391q[i];
        iArr2[20] = iArr2[20] | ((((short) i2) << 16) & -65536);
        long a = m235a(f410v, f422y);
        if (f391q[i][14] >= 0) {
            int i3 = f391q[i][14];
            int k = m437k(f359i[i3]);
            f391q[i][29] = k;
            if (a <= ((long) (k * k))) {
                boolean z2 = true;
                int l = m442l(f359i[i3]);
                if (l == 2 || l == 3) {
                    if (!C0001a.m144b(f391q[i], C0001a.f124d[i2]) || f391q[i][28] <= 0 || z) {
                        z2 = false;
                    } else {
                        int[] iArr3 = f391q[i];
                        iArr3[28] = iArr3[28] - 1;
                    }
                }
                if (z2) {
                    m310b(i, m230a(f359i[i3]));
                    int[] iArr4 = f391q[i];
                    iArr4[13] = iArr4[13] & -8193;
                    return l;
                }
            }
        }
        if (f391q[i][15] >= 0) {
            int i4 = f391q[i][15];
            int k2 = m437k(f359i[i4]);
            f391q[i][29] = k2;
            if (a <= ((long) (k2 * k2))) {
                boolean z3 = true;
                int l2 = m442l(f359i[i4]);
                if (l2 == 2 || l2 == 3) {
                    if (!C0001a.m144b(f391q[i], C0001a.f124d[i2]) || f391q[i][28] <= 0 || z) {
                        z3 = false;
                    } else {
                        int[] iArr5 = f391q[i];
                        iArr5[28] = iArr5[28] - 1;
                    }
                }
                if (z3) {
                    m310b(i, m230a(f359i[i4]));
                    int[] iArr6 = f391q[i];
                    iArr6[13] = iArr6[13] | 8192;
                    return l2;
                }
            }
        }
        if (f391q[i][14] != -1 || f391q[i][15] != -1) {
            return -1;
        }
        f391q[i][29] = f249a[f391q[i][11]][29];
        return 5;
    }

    /* renamed from: a */
    public static final int m227a(int i, boolean z) {
        switch (i) {
            case 0:
                return (short) (f414w[12] & 65535);
            case 1:
                return (short) (f414w[13] & 65535);
            case 2:
                return z ? (short) (f414w[54] & 65535) : (short) (f414w[54] & 65535);
            case 3:
                return z ? (short) ((f414w[54] & -65536) >> 16) : (short) ((f414w[54] & -65536) >> 16);
            case 4:
                return z ? (short) ((f414w[14] & -65536) >> 16) : (short) (f414w[14] & 65535);
            case 5:
                return z ? (short) ((f414w[15] & -65536) >> 16) : (short) (f414w[15] & 65535);
            case 6:
                return f414w[47];
            case 7:
                return f414w[49];
            case 8:
                return f414w[50];
            case 9:
                return (short) (f414w[26] & 65535);
            case 10:
                return f414w[27];
            case 11:
                return f414w[28];
            case 12:
                return z ? (short) ((f414w[20] & -65536) >> 16) : (short) (f414w[20] & 65535);
            case 13:
                return z ? (short) ((f414w[21] & -65536) >> 16) : (short) (f414w[21] & 65535);
            case 14:
                return z ? (short) ((f414w[22] & -65536) >> 16) : (short) (f414w[22] & 65535);
            case 15:
                return z ? (short) ((f414w[23] & -65536) >> 16) : (short) (f414w[23] & 65535);
            case 16:
                return f414w[51];
            case 17:
                return z ? (short) ((f414w[25] & -65536) >> 16) : (short) (f414w[25] & 65535);
            case 18:
                return (short) (f414w[24] & 65535);
            case 19:
                return f414w[29];
            case 21:
                return f414w[46];
            case 22:
                return f414w[16];
            case 23:
                return f414w[48];
            case 24:
                return f414w[19];
            case 25:
                return f414w[17];
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static final int m228a(int i, int[] iArr) {
        if ((iArr[3] & 16) != 0) {
            switch (i) {
                case 0:
                    return ((short) (f414w[20] & 65535)) + f414w[51];
                case 1:
                    return ((short) (f414w[21] & 65535)) + f414w[51];
                case 2:
                    return ((short) (f414w[22] & 65535)) + f414w[51];
                case 3:
                    return ((short) (f414w[23] & 65535)) + f414w[51];
                case 4:
                    return ((short) (f414w[24] & 65535)) + f414w[51];
                case 5:
                    return f414w[51] + 10;
            }
        }
        if ((iArr[3] & 32) == 0) {
            return 0;
        }
        int i2 = iArr[11];
        switch (i) {
            case 0:
                return f249a[i2][17];
            case 1:
                return f249a[i2][18];
            case 2:
                return f249a[i2][19];
            case 3:
                return f249a[i2][20];
            case 5:
                return 10;
            default:
                return 0;
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r0v1, types: [short] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m229a(boolean r3) {
        /*
            short[] r0 = f296b
            r1 = 1629(0x65d, float:2.283E-42)
            short r0 = r0[r1]
            int[] r1 = f339f
            r2 = 2
            r1 = r1[r2]
            int r1 = r1 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            if (r1 <= r0) goto L_0x0013
            r0 = r1
        L_0x0013:
            if (r3 == 0) goto L_0x0018
            int r1 = r1 + 6
            int r0 = r0 + r1
        L_0x0018:
            int r0 = r0 + 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m229a(boolean):int");
    }

    /* renamed from: a */
    public static final int m230a(int[] iArr) {
        int q = m463q(iArr);
        if (q == -1) {
            return -1;
        }
        return f300b[q].length;
    }

    /* renamed from: a */
    public static final int m231a(int[] iArr, int i) {
        int q = m463q(iArr);
        if (q != -1 && i >= 0 && i < f300b[q].length) {
            return f300b[q][i].length;
        }
        return -1;
    }

    /* renamed from: a */
    public static final int m232a(int[] iArr, int[] iArr2, int i) {
        int i2 = 0;
        if (iArr == null || iArr2 == null) {
            return 0;
        }
        int[] a = m235a(iArr, iArr2);
        int i3 = 0;
        while (true) {
            int i4 = i2;
            if (i3 >= a.length) {
                return i4;
            }
            i2 = ((short) (a[i3] & 65535)) == i ? i4 + ((short) ((a[i3] & -65536) >> 16)) : i4;
            i3++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m233a(int[] r11, int[] r12, int[] r13) {
        /*
            r1 = 0
            if (r13 != 0) goto L_0x0082
            r0 = 3
            r0 = r11[r0]
            r0 = r0 & 32
            if (r0 == 0) goto L_0x007f
            int[][] r0 = f249a
            r2 = 11
            r2 = r11[r2]
            r0 = r0[r2]
            r2 = 29
            r0 = r0[r2]
        L_0x0016:
            r6 = 2
            r5 = 0
            r3 = 100
            r2 = 5
            r8 = r1
            r9 = r2
            r4 = r0
        L_0x001e:
            int r0 = m447m(r11)
            r1 = -1
            int r0 = m309b(r0, r1, r3)
            r1 = 3
            r1 = r11[r1]
            r1 = r1 & 16
            if (r1 == 0) goto L_0x017f
            int[] r1 = f414w
            r2 = 47
            r1 = r1[r2]
            int r0 = r0 - r1
            r1 = 10
            if (r0 >= r1) goto L_0x017f
            r0 = 10
            r10 = r0
        L_0x003c:
            boolean r0 = p000.C0001a.m127a(r11, r12, r4)
            if (r0 == 0) goto L_0x007e
            int r2 = m228a(r9, r11)
            int r4 = m310b(r9, r12)
            r0 = 3
            r0 = r11[r0]
            r0 = r0 & 16
            if (r0 == 0) goto L_0x009e
            r7 = 1
        L_0x0052:
            int r0 = m392f(r11)
            int r1 = m447m(r11)
            int r3 = m424i(r11)
            int r4 = m224a(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 2
            if (r9 == r0) goto L_0x0068
            r0 = 3
            if (r9 != r0) goto L_0x00b6
        L_0x0068:
            r0 = 0
            r1 = 8
            int r1 = m232a(r13, r8, r1)
            if (r1 == 0) goto L_0x0072
            r0 = 2
        L_0x0072:
            r1 = 7
            int r1 = m232a(r13, r8, r1)
            if (r1 == 0) goto L_0x017c
            r5 = r0 ^ 1
        L_0x007b:
            switch(r9) {
                case 2: goto L_0x00a0;
                case 3: goto L_0x00ab;
                default: goto L_0x007e;
            }
        L_0x007e:
            return r10
        L_0x007f:
            r0 = 1024(0x400, float:1.435E-42)
            goto L_0x0016
        L_0x0082:
            int[] r0 = m230a(r13)
            int r4 = m437k(r13)
            int r6 = m451n(r13)
            int r5 = m455o(r13)
            int r2 = m477v(r13)
            int r1 = m442l(r13)
            r8 = r0
            r9 = r1
            r3 = r2
            goto L_0x001e
        L_0x009e:
            r7 = 0
            goto L_0x0052
        L_0x00a0:
            int r2 = m437k(r13)
            r3 = 0
            r0 = r11
            r1 = r12
            m277a(r0, r1, r2, r3, r4, r5)
            goto L_0x007e
        L_0x00ab:
            int r2 = m437k(r13)
            r3 = 1
            r0 = r11
            r1 = r12
            m277a(r0, r1, r2, r3, r4, r5)
            goto L_0x007e
        L_0x00b6:
            r0 = 3
            r0 = r11[r0]
            r0 = r0 & 16
            if (r0 == 0) goto L_0x016c
            if (r4 <= 0) goto L_0x0165
            r0 = 18
            p000.C0000HG.m81m(r0)
        L_0x00c4:
            r0 = 3
            r0 = r12[r0]
            r0 = r0 & 32
            if (r0 == 0) goto L_0x012b
            r0 = 20
            r0 = r12[r0]
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            r1 = -1
            if (r0 == r1) goto L_0x00e3
            r0 = 26
            r0 = r12[r0]
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            r1 = 3
            if (r0 >= r1) goto L_0x012b
        L_0x00e3:
            r0 = 2
            r0 = r11[r0]
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            short r0 = (short) r0
            r1 = 20
            r2 = r12[r1]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            r12[r1] = r2
            r1 = 20
            r2 = r12[r1]
            short r0 = (short) r0
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            r0 = r0 | r2
            r12[r1] = r0
            r0 = 22
            int r1 = m311b(r11)
            r12[r0] = r1
            r0 = 26
            r1 = 10
            r12[r0] = r1
            int[][] r0 = f249a
            r1 = 11
            r1 = r12[r1]
            r0 = r0[r1]
            r1 = 13
            r0 = r0[r1]
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x012b
            r0 = 2
            r0 = r12[r0]
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r0 = r0 >> 16
            short r0 = (short) r0
            r1 = 1
            m227a(r0, r1)
        L_0x012b:
            m257a(r4, r12, r11)
            if (r4 <= 0) goto L_0x007e
            r0 = 8
            int r0 = m232a(r13, r8, r0)
            if (r0 == 0) goto L_0x014a
            r0 = 4
            r0 = r12[r0]
            int r1 = p000.C0001a.m147c(r12)
            int r1 = r1 + 1
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            r4 = 0
            r5 = 512(0x200, float:7.175E-43)
            m318b(r0, r1, r2, r3, r4, r5)
        L_0x014a:
            r0 = 7
            int r0 = m232a(r13, r8, r0)
            if (r0 == 0) goto L_0x007e
            r0 = 4
            r0 = r12[r0]
            int r1 = p000.C0001a.m147c(r12)
            int r1 = r1 + 1
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            r4 = 0
            r5 = 2048(0x800, float:2.87E-42)
            m243a(r0, r1, r2, r3, r4, r5)
            goto L_0x007e
        L_0x0165:
            r0 = 19
            p000.C0000HG.m81m(r0)
            goto L_0x00c4
        L_0x016c:
            r0 = 3
            r0 = r12[r0]
            r0 = r0 & 16
            if (r0 == 0) goto L_0x00c4
            if (r4 <= 0) goto L_0x00c4
            r0 = 22
            p000.C0000HG.m81m(r0)
            goto L_0x00c4
        L_0x017c:
            r5 = r0
            goto L_0x007b
        L_0x017f:
            r10 = r0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m233a(int[], int[], int[]):int");
    }

    /* renamed from: a */
    public static final int m234a(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i][4] < 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final long m235a(int[] iArr, int[] iArr2) {
        long j = (long) (iArr[0] - iArr2[0]);
        long j2 = (long) (iArr[1] - iArr2[1]);
        return (j * j) + (j2 * j2);
    }

    /* renamed from: a */
    public static final String m236a(int i) {
        int i2 = ((16711680 & i) >> 16) - 1;
        if (i2 < 0 || i2 >= 3) {
            return C0000HG.m0a(i);
        }
        byte[] bArr = (byte[]) f237a.get(new Integer(i));
        if (bArr == null) {
            return "lol :D";
        }
        switch (f229a) {
            case 0:
                return new String(bArr, 0, bArr.length).replace(13, 10);
            case 1:
                StringBuffer stringBuffer = new StringBuffer(bArr.length / 2);
                for (int i3 = 0; i3 < bArr.length - 1; i3 += 2) {
                    stringBuffer.append((char) (((bArr[i3 + 1] & 255) << 8) | (bArr[i3] & 255)));
                }
                return stringBuffer.toString().replace(13, 10);
            case 2:
                byte[] bArr2 = new byte[(bArr.length + 2)];
                bArr2[0] = (byte) (bArr.length >>> 8);
                bArr2[1] = (byte) bArr.length;
                System.arraycopy(bArr, 0, bArr2, 2, bArr.length);
                try {
                    return new DataInputStream(new ByteArrayInputStream(bArr2)).readUTF().replace(13, 10);
                } catch (Exception e) {
                    break;
                }
        }
        return null;
    }

    /* renamed from: a */
    public static final void m237a() {
        f421y = false;
        C0000HG.m62f();
        f327e = 0;
    }

    /* renamed from: a */
    public static final void m238a(int i) {
        int i2 = C0001a.f117c;
        int i3 = 0;
        int[] iArr = f213Q;
        iArr[i2] = iArr[i2] & -65536;
        int[] iArr2 = f213Q;
        iArr2[i2] = iArr2[i2] | 65535;
        int[] iArr3 = f213Q;
        iArr3[i2] = iArr3[i2] & 65535;
        int[] iArr4 = f213Q;
        iArr4[i2] = iArr4[i2] | 0;
        C0001a.f117c++;
        int i4 = f391q[i][14];
        if (i4 >= 0 && !((f333e[f359i[i4][4]][3] & 1) == 0 && (f359i[i4][3] & 131072) == 0 && C0000HG.m58e(100) < 50)) {
            short s = (short) (f359i[i4][2] & 65535);
            short s2 = (short) (f213Q[i2] & 65535);
            int[] iArr5 = C0001a.f124d[s];
            iArr5[1] = iArr5[1] & -65536;
            int[] iArr6 = C0001a.f124d[s];
            iArr6[1] = (((short) s2) & 65535) | iArr6[1];
            int[] iArr7 = f213Q;
            iArr7[i2] = iArr7[i2] & -65536;
            int[] iArr8 = f213Q;
            iArr8[i2] = (((short) s) & 65535) | iArr8[i2];
            i3 = 1;
        }
        int i5 = f391q[i][15];
        if (i5 >= 0 && !((f333e[f359i[i5][4]][3] & 1) == 0 && (f359i[i5][3] & 131072) == 0 && C0000HG.m58e(100) < 50)) {
            short s3 = (short) (f359i[i5][2] & 65535);
            short s4 = (short) (f213Q[i2] & 65535);
            int[] iArr9 = C0001a.f124d[s3];
            iArr9[1] = iArr9[1] & -65536;
            int[] iArr10 = C0001a.f124d[s3];
            iArr10[1] = (((short) s4) & 65535) | iArr10[1];
            int[] iArr11 = f213Q;
            iArr11[i2] = iArr11[i2] & -65536;
            int[] iArr12 = f213Q;
            iArr12[i2] = (((short) s3) & 65535) | iArr12[i2];
            i3++;
        }
        int i6 = f391q[i][16];
        if (i6 >= 0 && !((f387p[f379n[i6][4]][3] & 1) == 0 && (f379n[i6][3] & 131072) == 0 && C0000HG.m58e(100) < 50)) {
            short s5 = (short) (f379n[i6][2] & 65535);
            short s6 = (short) (f213Q[i2] & 65535);
            int[] iArr13 = C0001a.f124d[s5];
            iArr13[1] = iArr13[1] & -65536;
            int[] iArr14 = C0001a.f124d[s5];
            iArr14[1] = (((short) s6) & 65535) | iArr14[1];
            int[] iArr15 = f213Q;
            iArr15[i2] = iArr15[i2] & -65536;
            int[] iArr16 = f213Q;
            iArr16[i2] = (((short) s5) & 65535) | iArr16[i2];
            i3++;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            short s7 = (short) (f391q[i][i7 + 17] & 65535);
            short s8 = (short) ((f391q[i][i7 + 17] & -65536) >> 16);
            if (s7 >= 0 && s8 >= 0) {
                short s9 = -1;
                if (s7 == 2) {
                    s9 = (short) (f371l[s8][2] & 65535);
                } else if (s7 == 3) {
                    s9 = (short) (f423y[s8][2] & 65535);
                } else if (s7 == 5) {
                    s9 = (short) (f325d[s8][2] & 65535);
                }
                if (s9 >= 0) {
                    short s10 = (short) (f213Q[i2] & 65535);
                    int[] iArr17 = C0001a.f124d[s9];
                    iArr17[1] = iArr17[1] & -65536;
                    int[] iArr18 = C0001a.f124d[s9];
                    iArr18[1] = (((short) s10) & 65535) | iArr18[1];
                    int[] iArr19 = f213Q;
                    iArr19[i2] = iArr19[i2] & -65536;
                    int[] iArr20 = f213Q;
                    iArr20[i2] = (((short) s9) & 65535) | iArr20[i2];
                    i3++;
                }
            }
        }
        if (f391q[i][19] > 0) {
            short s11 = (short) (f371l[f391q[i][19]][2] & 65535);
            short s12 = (short) (f213Q[i2] & 65535);
            int[] iArr21 = C0001a.f124d[s11];
            iArr21[1] = iArr21[1] & -65536;
            int[] iArr22 = C0001a.f124d[s11];
            iArr22[1] = (((short) s12) & 65535) | iArr22[1];
            int[] iArr23 = f213Q;
            iArr23[i2] = iArr23[i2] & -65536;
            int[] iArr24 = f213Q;
            iArr24[i2] = (((short) s11) & 65535) | iArr24[i2];
            i3++;
        }
        if (f391q[i][28] > 0) {
            int a = m234a(f371l);
            f371l[a][6] = f391q[i][28];
            int i8 = 0;
            while (true) {
                if (i8 >= 2) {
                    break;
                }
                if (f391q[i][i8 + 14] >= 0) {
                    int l = m442l(f359i[f391q[i][i8 + 14]]);
                    if (l == 2) {
                        f371l[a][4] = 1;
                        break;
                    } else if (l == 3) {
                        f371l[a][4] = 2;
                        break;
                    }
                }
                i8++;
            }
            short s13 = (short) (f371l[a][2] & 65535);
            short s14 = (short) (f213Q[i2] & 65535);
            int[] iArr25 = C0001a.f124d[s13];
            iArr25[1] = iArr25[1] & -65536;
            int[] iArr26 = C0001a.f124d[s13];
            iArr26[1] = (((short) s14) & 65535) | iArr26[1];
            int[] iArr27 = f213Q;
            iArr27[i2] = iArr27[i2] & -65536;
            int[] iArr28 = f213Q;
            iArr28[i2] = (((short) s13) & 65535) | iArr28[i2];
            i3++;
        }
        int[] iArr29 = f391q[i];
        iArr29[17] = iArr29[17] & -65536;
        int[] iArr30 = f391q[i];
        iArr30[17] = iArr30[17] | (((short) i2) & 65535);
        int[] iArr31 = f213Q;
        iArr31[i2] = iArr31[i2] & 65535;
        int[] iArr32 = f213Q;
        iArr32[i2] = ((((short) i3) << 16) & -65536) | iArr32[i2];
    }

    /* renamed from: a */
    public static final void m239a(int i, int i2) {
        short s = (short) ((-65536 & i) >> 16);
        short s2 = (short) (65535 & i);
        int a = m221a((int) s, (int) s2);
        if (s == 2) {
            int i3 = 0;
            while (i3 < f253a[s].length) {
                if (f253a[s][i3][4] != s2) {
                    i3++;
                } else if (a > i2) {
                    int[] iArr = f253a[s][i3];
                    iArr[6] = iArr[6] - i2;
                    return;
                } else if (a == i2) {
                    m225a((int) s, i3, a, true, false);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        for (int i4 = 0; i4 < f253a[s].length; i4++) {
            if (f253a[s][i4][4] == s2) {
                m225a((int) s, i4, 1, true, false);
                a--;
                if (a == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m240a(int i, int i2, int i3) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = 0;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 20;
        f383o[f412w][11] = 14;
        f383o[f412w][12] = i3;
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        m230a(f383o[f412w]);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: a */
    public static final void m241a(int i, int i2, int i3, int i4) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = i3;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 16;
        f383o[f412w][11] = 8;
        f383o[f412w][12] = i4;
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: a */
    public static final void m242a(int i, int i2, int i3, int i4, int i5) {
        f340f[(i * 11) + 6] = (short) i2;
        f340f[(i * 11) + 7] = (short) i3;
        f340f[(i * 11) + 8] = (short) i4;
        f340f[(i * 11) + 9] = (short) i5;
    }

    /* renamed from: a */
    public static final void m243a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = i3;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 24;
        f383o[f412w][11] = 6;
        f383o[f412w][12] = 0;
        f221U[0] = i4;
        f221U[1] = i5;
        f221U[2] = i6;
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: a */
    public static final void m244a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i >= 0 && i2 >= 0 && i2 < C0001a.f94F * 2 && i < C0001a.f154r * 2) {
            int[] iArr = f217S;
            int i9 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 0;
            iArr[i9] = iArr[i9] & -65536;
            int[] iArr2 = f217S;
            int i10 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 0;
            iArr2[i10] = iArr2[i10] | (((short) i3) & 65535);
            int[] iArr3 = f217S;
            int i11 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 0;
            iArr3[i11] = iArr3[i11] & 65535;
            int[] iArr4 = f217S;
            int i12 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 0;
            iArr4[i12] = iArr4[i12] | ((((short) i4) << 16) & -65536);
            int[] iArr5 = f217S;
            int i13 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 1;
            iArr5[i13] = iArr5[i13] & -65536;
            int[] iArr6 = f217S;
            int i14 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 1;
            iArr6[i14] = iArr6[i14] | (((short) i5) & 65535);
            int[] iArr7 = f217S;
            int i15 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 1;
            iArr7[i15] = iArr7[i15] & 65535;
            int[] iArr8 = f217S;
            int i16 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 1;
            iArr8[i16] = iArr8[i16] | ((((short) i6) << 16) & -65536);
            C0001a.m98a(i, i2, i7, i8);
        }
    }

    /* renamed from: a */
    private static final void m245a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Graphics graphics) {
        short s;
        short s2;
        short s3;
        short s4;
        int i9 = i5 * 7;
        if (f314c != null && f296b != null && f296b[(i3 * 11) + 3] != -1 && i3 >= 0 && i3 < f314c.length && f314c[i3] != null && i9 >= 0 && i9 < f314c[i3].length && f250a[i3][0] != null) {
            if (i7 == 0 && i8 == 0) {
                switch (i6) {
                    case 2:
                        DirectGraphics directGraphics = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
                        short s5 = f314c[i3][i9 + 1];
                        short s6 = f314c[i3][i9 + 2];
                        int clipX = graphics.getClipX();
                        int clipY = graphics.getClipY();
                        int clipWidth = graphics.getClipWidth();
                        int clipHeight = graphics.getClipHeight();
                        int i10 = 0;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = (i - f314c[i3][i9 + 3]) - f314c[i3][i9 + 5];
                        int i14 = i2 + f314c[i3][i9 + 6];
                        int width = f250a[i3][0].getWidth();
                        int height = f250a[i3][0].getHeight();
                        short s7 = f314c[i3][i9 + 3];
                        short s8 = f314c[i3][i9 + 4];
                        switch (i6) {
                            case 0:
                                i11 = -s5;
                                i12 = -s6;
                                s = s8;
                                s2 = s7;
                                break;
                            case 1:
                                i11 = -s5;
                                i12 = -((height - s6) - s8);
                                i10 = 8372;
                                s = s8;
                                s2 = s7;
                                break;
                            case 2:
                                i11 = -((width - s5) - s7);
                                i12 = -s6;
                                i10 = 8192;
                                s = s8;
                                s2 = s7;
                                break;
                            case 3:
                                i11 = -((width - s5) - s7);
                                i12 = -((height - s6) - s8);
                                i10 = 180;
                                s = s8;
                                s2 = s7;
                                break;
                            case 4:
                                i11 = -s6;
                                i12 = -s5;
                                i10 = 16474;
                                s = s7;
                                s2 = s8;
                                break;
                            case 5:
                                i11 = -((height - s6) - s8);
                                i12 = -s5;
                                i10 = 270;
                                s = s7;
                                s2 = s8;
                                break;
                            case 6:
                                i11 = -s6;
                                i12 = -((width - s5) - s7);
                                i10 = 90;
                                s = s7;
                                s2 = s8;
                                break;
                            case 7:
                                i11 = -((height - s6) - s8);
                                i12 = -((width - s5) - s7);
                                i10 = 16654;
                                s = s7;
                                s2 = s8;
                                break;
                            default:
                                s = s8;
                                s2 = s7;
                                break;
                        }
                        graphics.clipRect(i13, i14, s2, s);
                        directGraphics.drawImage(f250a[i3][0], ((i - f314c[i3][i9 + 3]) - f314c[i3][i9 + 5]) + i11, f314c[i3][i9 + 6] + i2 + i12, 20, i10);
                        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
                        return;
                    default:
                        DirectGraphics directGraphics2 = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
                        short s9 = f314c[i3][i9 + 1];
                        short s10 = f314c[i3][i9 + 2];
                        int clipX2 = graphics.getClipX();
                        int clipY2 = graphics.getClipY();
                        int clipWidth2 = graphics.getClipWidth();
                        int clipHeight2 = graphics.getClipHeight();
                        int i15 = 0;
                        int i16 = 0;
                        int i17 = 0;
                        int i18 = i + f314c[i3][i9 + 5];
                        int i19 = i2 + f314c[i3][i9 + 6];
                        int width2 = f250a[i3][0].getWidth();
                        int height2 = f250a[i3][0].getHeight();
                        short s11 = f314c[i3][i9 + 3];
                        short s12 = f314c[i3][i9 + 4];
                        switch (i6) {
                            case 0:
                                i16 = -s9;
                                i17 = -s10;
                                s3 = s12;
                                s4 = s11;
                                break;
                            case 1:
                                i16 = -s9;
                                i17 = -((height2 - s10) - s12);
                                i15 = 8372;
                                s3 = s12;
                                s4 = s11;
                                break;
                            case 2:
                                i16 = -((width2 - s9) - s11);
                                i17 = -s10;
                                i15 = 8192;
                                s3 = s12;
                                s4 = s11;
                                break;
                            case 3:
                                i16 = -((width2 - s9) - s11);
                                i17 = -((height2 - s10) - s12);
                                i15 = 180;
                                s3 = s12;
                                s4 = s11;
                                break;
                            case 4:
                                i16 = -s10;
                                i17 = -s9;
                                i15 = 16474;
                                s3 = s11;
                                s4 = s12;
                                break;
                            case 5:
                                i16 = -((height2 - s10) - s12);
                                i17 = -s9;
                                i15 = 270;
                                s3 = s11;
                                s4 = s12;
                                break;
                            case 6:
                                i16 = -s10;
                                i17 = -((width2 - s9) - s11);
                                i15 = 90;
                                s3 = s11;
                                s4 = s12;
                                break;
                            case 7:
                                i16 = -((height2 - s10) - s12);
                                i17 = -((width2 - s9) - s11);
                                i15 = 16654;
                                s3 = s11;
                                s4 = s12;
                                break;
                            default:
                                s3 = s12;
                                s4 = s11;
                                break;
                        }
                        graphics.clipRect(i18, i19, s4, s3);
                        directGraphics2.drawImage(f250a[i3][0], f314c[i3][i9 + 5] + i + i16, f314c[i3][i9 + 6] + i2 + i17, 20, i15);
                        graphics.setClip(clipX2, clipY2, clipWidth2, clipHeight2);
                        return;
                }
            } else {
                short s13 = f314c[i3][i9 + 3];
                short s14 = f314c[i3][i9 + 4];
                int b = i9 + (m308b(i7, i8) * 7);
                if (b >= 0 && b < f314c[i3].length) {
                    if (m220a(i7) > m220a(i8)) {
                        int i20 = (s13 * i8) / i7;
                        for (int i21 = 0; i21 < s13; i21++) {
                            int i22 = ((i21 * i8) / i7) - (i20 >> 1);
                            DirectGraphics directGraphics3 = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
                            int i23 = f314c[i3][b + 1] + i21;
                            short s15 = f314c[i3][b + 2];
                            int clipX3 = graphics.getClipX();
                            int clipY3 = graphics.getClipY();
                            int clipWidth3 = graphics.getClipWidth();
                            int clipHeight3 = graphics.getClipHeight();
                            int i24 = (i + i21) - (s13 >> 1);
                            int i25 = (i2 + i22) - (s14 >> 1);
                            f250a[i3][0].getWidth();
                            f250a[i3][0].getHeight();
                            int i26 = -i23;
                            int i27 = -s15;
                            graphics.clipRect(i24, i25, 1, f314c[i3][b + 4]);
                            directGraphics3.drawImage(f250a[i3][0], ((i + i21) - (s13 >> 1)) + i26, ((i22 + i2) - (s14 >> 1)) + i27, 20, 0);
                            graphics.setClip(clipX3, clipY3, clipWidth3, clipHeight3);
                        }
                        return;
                    }
                    int i28 = (s14 * i7) / i8;
                    for (int i29 = 0; i29 < s14; i29++) {
                        int i30 = ((i29 * i7) / i8) - (i28 >> 1);
                        DirectGraphics directGraphics4 = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
                        short s16 = f314c[i3][b + 1];
                        int i31 = f314c[i3][b + 2] + i29;
                        int clipX4 = graphics.getClipX();
                        int clipY4 = graphics.getClipY();
                        int clipWidth4 = graphics.getClipWidth();
                        int clipHeight4 = graphics.getClipHeight();
                        int i32 = (i + i30) - (s13 >> 1);
                        int i33 = (i2 + i29) - (s14 >> 1);
                        f250a[i3][0].getWidth();
                        f250a[i3][0].getHeight();
                        int i34 = -s16;
                        int i35 = -i31;
                        graphics.clipRect(i32, i33, f314c[i3][b + 3], 1);
                        directGraphics4.drawImage(f250a[i3][0], ((i30 + i) - (s13 >> 1)) + i34, i35 + ((i2 + i29) - (s14 >> 1)), 20, 0);
                        graphics.setClip(clipX4, clipY4, clipWidth4, clipHeight4);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m246a(int i, int i2, int i3, int i4, int i5, int i6, int i7, Graphics graphics) {
        m245a(i, i2, i3, i4, i5 << 2, 0, i6, i7, graphics);
    }

    /* renamed from: a */
    public static final void m247a(int i, int i2, int i3, int i4, int i5, int i6, Graphics graphics) {
        m245a(i, i2, i3, i4, i5, i6, 0, 0, graphics);
    }

    /* renamed from: a */
    public static final void m248a(int i, int i2, int i3, int i4, int i5, Graphics graphics) {
        int i6 = ((C0001a.f136i * i) >> 12) - f388q;
        int i7 = ((C0001a.f136i * i2) >> 12) - f303c;
        int i8 = ((C0001a.f136i * i3) >> 12) - f388q;
        int i9 = ((C0001a.f136i * i4) >> 12) - f303c;
        graphics.setColor(f225W[1]);
        graphics.drawLine(i6, i7, i8, i9);
        int i10 = i7 - ((((short) (65535 & i5)) * C0001a.f136i) >> 12);
        int i11 = i9 - ((C0001a.f136i * ((short) ((-65536 & i5) >> 16))) >> 12);
        graphics.setColor(f225W[0]);
        graphics.drawLine(i6, i10, i8, i11);
        int i12 = ((i6 * 26) + (i8 * 6)) / 32;
        int i13 = ((i10 * 26) + (i11 * 6)) / 32;
        int i14 = ((i6 * 28) + (i8 * 4)) / 32;
        int i15 = ((i10 * 28) + (i11 * 4)) / 32;
        int i16 = ((i6 * 30) + (i8 * 2)) / 32;
        int i17 = ((i10 * 30) + (i11 * 2)) / 32;
        int i18 = ((i6 * 2) + (i8 * 30)) / 32;
        int i19 = ((i10 * 2) + (i11 * 30)) / 32;
        graphics.setColor(f225W[2]);
        graphics.drawLine(i18, i19, i8, i11);
        graphics.setColor(f225W[3]);
        graphics.drawLine(i12, i13, i14, i15);
        graphics.drawLine(i16, i17, i6, i10);
    }

    /* renamed from: a */
    public static final void m249a(int i, int i2, int i3, int i4, Graphics graphics) {
        m247a(i, i2, i3, 0, i4, 0, graphics);
    }

    /* renamed from: a */
    public static final void m250a(int i, int i2, int i3, int i4, boolean z) {
        if (f217S != null) {
            int i5 = i < 0 ? 0 : i;
            if (i2 < 0) {
                i2 = 0;
            }
            if (i3 > C0001a.f154r * 2) {
                i3 = C0001a.f154r * 2;
            }
            if (i4 > C0001a.f94F * 2) {
                i4 = C0001a.f94F * 2;
            }
            for (int i6 = i5; i6 < i3; i6++) {
                for (int i7 = i2; i7 < i4; i7++) {
                    int[] iArr = f217S;
                    int i8 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                    iArr[i8] = iArr[i8] & -49153;
                    int[] iArr2 = f217S;
                    int i9 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                    iArr2[i9] = iArr2[i9] | 0;
                    if (z) {
                        int[] iArr3 = f217S;
                        int i10 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                        iArr3[i10] = iArr3[i10] & 65535;
                        int[] iArr4 = f217S;
                        int i11 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                        iArr4[i11] = iArr4[i11] | -65536;
                    }
                    if ((C0001a.f115b[i7 >> 1][i6 >> 1] & 32768) == 0 || (C0001a.f115b[i7 >> 1][i6 >> 1] & 255) == 255) {
                        int[] iArr5 = f217S;
                        int i12 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                        iArr5[i12] = iArr5[i12] & -49153;
                        int[] iArr6 = f217S;
                        int i13 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                        iArr6[i13] = iArr6[i13] | 32768;
                    } else {
                        C0001a.f126e[0] = i6 << 11;
                        C0001a.f126e[2] = (i6 << 11) + 2048;
                        C0001a.f126e[1] = i7 << 11;
                        C0001a.f126e[3] = (i7 << 11) + 2048;
                        for (int a = C0001a.m103a(C0001a.f126e, 4144); a != -1; a = (short) ((C0001a.f124d[a][1] & -65536) >> 16)) {
                            if ((C0001a.f124d[a][3] & 4096) != 0) {
                                if ((C0001a.f124d[a][3] & 32768) == 0) {
                                    int[] iArr7 = f217S;
                                    int i14 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                                    iArr7[i14] = iArr7[i14] & -49153;
                                    int[] iArr8 = f217S;
                                    int i15 = (C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2;
                                    iArr8[i15] = iArr8[i15] | 32768;
                                }
                            } else if ((f217S[(C0001a.f154r * i7 * 2 * 3) + (i6 * 3) + 2] & 49152) != 32768 && (!((C0001a.f124d[a][3] & 32) == 0 && (C0001a.f124d[a][3] & 16) == 0) && (C0001a.f124d[a][3] & 32768) == 0)) {
                                m330b(C0001a.f124d[a], false);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m251a(int i, int i2, int i3, Graphics graphics) {
        short s;
        int i4;
        int i5;
        switch (i3) {
            case 0:
                s = (short) (C0001a.f102N & 65535);
                break;
            case 1:
                s = (short) ((C0001a.f102N & -65536) >> 16);
                break;
            default:
                return;
        }
        int i6 = f296b[(s * 11) + 4] == 5 ? C0001a.f111b : 0;
        if (f250a[s][i6] != null) {
            int i7 = (C0001a.f136i * i) - f388q;
            int i8 = (C0001a.f150p * i2) - f303c;
            byte b = (byte) ((C0001a.f115b[i2][i] >> (i3 << 4)) & 255);
            byte b2 = (byte) ((C0001a.f115b[i2][i] >> ((i3 << 4) + 8)) & 15);
            if (b >= 0) {
                short s2 = f296b[(s * 11) + 5];
                int i9 = C0001a.f136i * (b % s2);
                int i10 = ((b / s2) % f296b[(s * 11) + 6]) * C0001a.f150p;
                DirectGraphics directGraphics = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
                int clipX = graphics.getClipX();
                int clipY = graphics.getClipY();
                int clipWidth = graphics.getClipWidth();
                int clipHeight = graphics.getClipHeight();
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int width = f250a[s][i6].getWidth();
                int height = f250a[s][i6].getHeight();
                int i14 = C0001a.f136i;
                int i15 = C0001a.f150p;
                switch (b2) {
                    case 0:
                        i12 = -i9;
                        i13 = -i10;
                        i4 = i15;
                        i5 = i14;
                        break;
                    case 1:
                        i12 = -i9;
                        i13 = -((height - i10) - i15);
                        i11 = 8372;
                        i4 = i15;
                        i5 = i14;
                        break;
                    case 2:
                        i12 = -((width - i9) - i14);
                        i13 = -i10;
                        i11 = 8192;
                        i4 = i15;
                        i5 = i14;
                        break;
                    case 3:
                        i12 = -((width - i9) - i14);
                        i13 = -((height - i10) - i15);
                        i11 = 180;
                        i4 = i15;
                        i5 = i14;
                        break;
                    case 4:
                        i12 = -i10;
                        i13 = -i9;
                        i11 = 16474;
                        i4 = i14;
                        i5 = i15;
                        break;
                    case 5:
                        i12 = -((height - i10) - i15);
                        i13 = -i9;
                        i11 = 270;
                        i4 = i14;
                        i5 = i15;
                        break;
                    case 6:
                        i12 = -i10;
                        i13 = -((width - i9) - i14);
                        i11 = 90;
                        i4 = i14;
                        i5 = i15;
                        break;
                    case 7:
                        i12 = -((height - i10) - i15);
                        i13 = -((width - i9) - i14);
                        i11 = 16654;
                        i4 = i14;
                        i5 = i15;
                        break;
                    default:
                        i4 = i15;
                        i5 = i14;
                        break;
                }
                graphics.clipRect(i7, i8, i5, i4);
                directGraphics.drawImage(f250a[s][i6], i7 + i12, i8 + i13, 20, i11);
                graphics.setClip(clipX, clipY, clipWidth, clipHeight);
            }
        }
    }

    /* renamed from: a */
    public static final void m252a(int i, int i2, boolean z) {
        if (i != -1 && i2 != -1 && f253a[i][i2][4] != -1) {
            m356c(f253a[i][i2], z);
        }
    }

    /* renamed from: a */
    public static final void m253a(int i, int i2, boolean z, boolean z2, int[] iArr) {
        char c;
        char c2;
        boolean z3;
        boolean z4;
        boolean z5;
        char c3 = 65535;
        char c4 = 65535;
        boolean z6 = false;
        boolean z7 = true;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        if ((iArr[3] & 32) != 0) {
            switch (i) {
                case 0:
                    c3 = 12;
                    z8 = true;
                    c4 = 12;
                    z6 = true;
                    break;
            }
        }
        if ((iArr[3] & 16) != 0) {
            switch (i) {
                case 0:
                    if (!f409v) {
                        z8 = true;
                        z3 = true;
                        c2 = 12;
                        c = 12;
                        break;
                    } else {
                        return;
                    }
                case 1:
                    z8 = true;
                    z3 = true;
                    c2 = 13;
                    c = 13;
                    break;
                case 2:
                    c = 12;
                    if (z2) {
                        c2 = 12;
                        z8 = true;
                        z11 = true;
                        z10 = true;
                        z3 = true;
                        break;
                    } else {
                        c2 = '6';
                        z8 = true;
                        z9 = true;
                        z10 = true;
                        z7 = false;
                        z3 = false;
                        break;
                    }
                case 3:
                    c = 13;
                    if (z2) {
                        c2 = 13;
                        z8 = true;
                        z11 = true;
                        z10 = true;
                        z3 = true;
                        break;
                    } else {
                        c2 = '6';
                        z8 = true;
                        z9 = true;
                        z10 = true;
                        z7 = false;
                        z3 = true;
                        break;
                    }
                case 4:
                    c = 14;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 5:
                    c = 15;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 6:
                    z3 = z6;
                    c2 = c4;
                    c = '/';
                    break;
                case 7:
                    z3 = z6;
                    c2 = c4;
                    c = '1';
                    break;
                case 8:
                    z3 = z6;
                    c2 = c4;
                    c = '2';
                    break;
                case 9:
                    c = 26;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 10:
                    z3 = z6;
                    c2 = c4;
                    c = 27;
                    break;
                case 11:
                    z3 = z6;
                    c2 = c4;
                    c = 28;
                    break;
                case 12:
                    c = 20;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 13:
                    c = 21;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 14:
                    c = 22;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 15:
                    c = 23;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 16:
                    z3 = z6;
                    c2 = c4;
                    c = '3';
                    break;
                case 17:
                    c = 25;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 18:
                    c = 24;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 19:
                    z3 = z6;
                    c2 = c4;
                    c = 29;
                    break;
                case 20:
                    c = 25;
                    z12 = true;
                    z3 = z6;
                    c2 = c4;
                    break;
                case 21:
                    z3 = z6;
                    c2 = c4;
                    c = '.';
                    break;
                case 22:
                    z3 = z6;
                    c2 = c4;
                    c = 16;
                    break;
                case 23:
                    z3 = z6;
                    c2 = c4;
                    c = '0';
                    break;
                case 24:
                    z3 = z6;
                    c2 = c4;
                    c = 19;
                    break;
                case 25:
                    z3 = z6;
                    c2 = c4;
                    c = 17;
                    break;
            }
        }
        z3 = z6;
        c2 = c4;
        c = c3;
        if (!z12) {
            z4 = z9;
            z5 = z8;
        } else if (z2) {
            z4 = false;
            z5 = true;
        } else {
            z4 = true;
            z5 = true;
        }
        if (c >= 0) {
            int i3 = -1;
            if (c2 != 65535) {
                i3 = !z3 ? (short) (iArr[c2] & 65535) : (short) ((iArr[c2] & -65536) >> 16);
                if (z10) {
                    i3 = z ? i3 + i2 : i2;
                    if (!z3) {
                        iArr[c2] = iArr[c2] & -65536;
                        iArr[c2] = iArr[c2] | (((short) i3) & 65535);
                    } else {
                        iArr[c2] = iArr[c2] & 65535;
                        iArr[c2] = iArr[c2] | ((((short) i3) << 16) & -65536);
                    }
                }
            }
            if (z) {
                if (z5) {
                    int i4 = ((short) (iArr[c] & 65535)) + i2;
                    if (i4 > i3 && i3 >= 0 && z7) {
                        i4 = i3;
                    }
                    if (i4 <= 0 && z11) {
                        i4 = 1;
                    }
                    iArr[c] = iArr[c] & -65536;
                    iArr[c] = (((short) i4) & 65535) | iArr[c];
                }
                if (z4) {
                    int i5 = ((short) ((iArr[c] & -65536) >> 16)) + i2;
                    if (i5 > i3 && i3 >= 0 && z7) {
                        i5 = i3;
                    }
                    if (i5 <= 0 && z11) {
                        i5 = 1;
                    }
                    iArr[c] = iArr[c] & 65535;
                    iArr[c] = ((((short) i5) << 16) & -65536) | iArr[c];
                }
                if (!z4 && !z5) {
                    int i6 = iArr[c] + i2;
                    if (i6 > i3 && i3 >= 0 && z7) {
                        i6 = i3;
                    }
                    if (i6 <= 0 && z11) {
                        i6 = 1;
                    }
                    iArr[c] = i6;
                    return;
                }
                return;
            }
            int i7 = (i2 <= i3 || i3 < 0 || !z7) ? i2 : i3;
            if (i7 <= 0 && z11) {
                i7 = 1;
            }
            if (z5) {
                iArr[c] = iArr[c] & -65536;
                iArr[c] = iArr[c] | (((short) i7) & 65535);
            }
            if (z4) {
                iArr[c] = iArr[c] & 65535;
                iArr[c] = iArr[c] | ((((short) i7) << 16) & -65536);
            }
            if (!z4 && !z5) {
                iArr[c] = i7;
            }
        }
    }

    /* renamed from: a */
    public static final void m254a(int i, int i2, int[] iArr) {
        m397f(10, -2, 0);
        if (f376n < 0) {
            if (f287b == 1 && f269ai >= 0) {
                int[] a = m230a(C0001a.f124d[f269ai]);
                if (a != null) {
                    f376n = a[0];
                }
            }
            if (f376n < 0) {
                f376n = 0;
            }
        }
        byte b = (byte) ((f339f[2] >> 16) & 255);
        f295b = C0000HG.m36a(m220a(i2), f246a[2], f392r, 0);
        m348c(9, f270aj, f281au, f392r, f424z, 113);
        m397f(9, 0, -2);
        m308b(9, f296b[1695] + 15);
        f192G = 0;
        for (int i3 = 0; i3 < f238a.size(); i3++) {
            String[] strArr = (String[]) f238a.elementAt(i3);
            f192G = (strArr.length * b) + 10 + f192G;
        }
        f286az = 0;
        f389q = true;
        f309c = iArr;
        f355i = 0;
        f274an = i;
        if (f309c != null) {
            f309c[0] = 2;
        }
        f192G += f296b[1695] + 10;
        f182B = false;
        if (f309c == null || !f381o) {
            f288b = -1;
        } else {
            f288b = System.currentTimeMillis() + 500;
        }
    }

    /* renamed from: a */
    public static final void m255a(int i, boolean z) {
        int[] a = m230a(f391q[i]);
        int i2 = f391q[i][4];
        int i3 = f391q[i][5];
        short s = (short) (f391q[i][20] & 65535);
        int i4 = (a[11] * 4096) << 1;
        C0001a.f107a[0] = i2 - i4;
        C0001a.f107a[2] = i2 + i4;
        C0001a.f107a[1] = i3 - i4;
        C0001a.f107a[3] = i3 + i4;
        int i5 = (i4 >> 1) - 2048;
        for (int a2 = C0001a.m103a(C0001a.f107a, 32); a2 != -1; a2 = (short) ((C0001a.f124d[a2][1] & -65536) >> 16)) {
            if ((C0001a.f124d[a2][3] & 65536) == 0 && (C0001a.f124d[a2][13] & 2) == 0) {
                int[] a3 = m230a(C0001a.f124d[a2]);
                if (!m433j((int) (short) ((C0001a.f124d[a2][2] & -65536) >> 16)) && (C0001a.f124d[a2][11] == f391q[i][11] || a3[1] == a[1])) {
                    int i6 = C0001a.f124d[a2][29];
                    if (z) {
                        f391q[i][26] = 10;
                    } else {
                        C0001a.f124d[a2][29] = i5;
                    }
                    if (((short) (C0001a.f124d[a2][20] & 65535)) != s) {
                        int[] iArr = C0001a.f124d[a2];
                        iArr[13] = iArr[13] | 32768;
                        int[] iArr2 = C0001a.f124d[a2];
                        iArr2[20] = iArr2[20] & -65536;
                        int[] iArr3 = C0001a.f124d[a2];
                        iArr3[20] = iArr3[20] | (((short) s) & 65535);
                        m391f((int) (short) ((C0001a.f124d[a2][2] & -65536) >> 16));
                    }
                    C0001a.f124d[a2][29] = i6;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m256a(int i, int[] iArr) {
        int[] iArr2 = f407u[(byte) (f411v[i][6] & 255)];
        m257a(i, iArr, f366k);
        short s = -1;
        if (iArr != null) {
            s = (short) (iArr[2] & 65535);
        }
        switch (iArr2[0]) {
            case 448:
                m223a(f366k[0], f366k[1], 4096, (int) s);
                return;
            case 450:
                m222a(f366k[0], f366k[1], (int) s);
                return;
            case 452:
                m350c(i, f418x);
                m243a(f411v[i][4], f411v[i][5], 4096, f418x[0], f418x[1], 0);
                return;
            case 454:
                m382e(f366k[0], f366k[1]);
                return;
            case 456:
                m418h(f366k[0], f366k[1], s);
                return;
            case 458:
                m350c(i, f418x);
                m318b(f411v[i][4], f411v[i][5], 4096, f418x[0], f418x[1], 0);
                return;
            case 460:
                m368d(f366k[0], f366k[1], (int) s);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public static final void m257a(int i, int[] iArr, int[] iArr2) {
        if (iArr != null) {
            C0001a.m155c(iArr, iArr2);
            iArr2[1] = C0001a.m147c(iArr) + 1;
            return;
        }
        iArr2[0] = f411v[i][9];
        iArr2[1] = f411v[i][10];
    }

    /* renamed from: a */
    public static final void m258a(String str) {
        f238a.addElement(C0000HG.m36a(str, f246a[2], f392r - (f296b[1683] + 16), 0));
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [int] */
    /* JADX WARNING: type inference failed for: r1v15, types: [int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r1v14, types: [short, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r2v8, types: [short, int] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m259a(java.lang.String r15, int r16, int r17, int r18, int r19, javax.microedition.lcdui.Graphics r20) {
        /*
            int[] r1 = f339f
            r1 = r1[r19]
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r9 = r16 + r1
            int[] r1 = f339f
            r1 = r1[r19]
            int r1 = r1 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            int r10 = r17 + r1
            short[] r1 = f340f
            int r2 = r18 * 11
            int r2 = r2 + 4
            short r7 = r1[r2]
            short[] r1 = f340f
            int r2 = r18 * 11
            int r2 = r2 + 0
            short r4 = r1[r2]
            short[] r1 = f340f
            int r2 = r18 * 11
            int r2 = r2 + 1
            short r3 = r1[r2]
            short[] r1 = f340f
            int r2 = r18 * 11
            int r2 = r2 + 2
            short r2 = r1[r2]
            short[] r1 = f340f
            int r5 = r18 * 11
            int r5 = r5 + 3
            short r1 = r1[r5]
            r5 = r7 & 256(0x100, float:3.59E-43)
            r6 = 256(0x100, float:3.59E-43)
            if (r5 != r6) goto L_0x008f
            r5 = 1
            r6 = r5
        L_0x0044:
            r5 = r7 & 128(0x80, float:1.794E-43)
            r8 = 128(0x80, float:1.794E-43)
            if (r5 != r8) goto L_0x0092
            r5 = 1
            r8 = r5
        L_0x004c:
            r5 = r7 & 512(0x200, float:7.175E-43)
            r7 = 512(0x200, float:7.175E-43)
            if (r5 != r7) goto L_0x0095
            r5 = 1
            r7 = r5
        L_0x0054:
            if (r6 == 0) goto L_0x008a
            short[] r5 = f340f
            int r6 = r18 * 11
            int r6 = r6 + 6
            short r6 = r5[r6]
            short[] r5 = f340f
            int r11 = r18 * 11
            int r11 = r11 + 7
            short r5 = r5[r11]
            short[] r11 = f340f
            int r12 = r18 * 11
            int r12 = r12 + 8
            short r11 = r11[r12]
            int r11 = r11 + r6
            short[] r12 = f340f
            int r13 = r18 * 11
            int r13 = r13 + 9
            short r12 = r12[r13]
            int r12 = r12 + r5
            int r13 = r4 + r2
            int r14 = r3 + r1
            if (r4 >= r6) goto L_0x007f
            r4 = r6
        L_0x007f:
            if (r3 >= r5) goto L_0x0082
            r3 = r5
        L_0x0082:
            if (r13 <= r11) goto L_0x0086
            int r2 = r11 - r4
        L_0x0086:
            if (r14 <= r12) goto L_0x008a
            int r1 = r12 - r3
        L_0x008a:
            if (r2 <= 0) goto L_0x008e
            if (r1 > 0) goto L_0x0098
        L_0x008e:
            return
        L_0x008f:
            r5 = 0
            r6 = r5
            goto L_0x0044
        L_0x0092:
            r5 = 0
            r8 = r5
            goto L_0x004c
        L_0x0095:
            r5 = 0
            r7 = r5
            goto L_0x0054
        L_0x0098:
            r0 = r20
            r0.setClip(r4, r3, r2, r1)
            if (r8 == 0) goto L_0x0106
            int r1 = r20.getColor()
            r2 = 3
            r0 = r20
            r0.setColor(r2)
            int r2 = r9 + 2
            int r3 = r10 + 1
            r4 = 20
            r0 = r20
            r0.drawString(r15, r2, r3, r4)
            int r2 = r9 + 2
            r3 = 20
            r0 = r20
            r0.drawString(r15, r2, r10, r3)
            int r2 = r9 + 2
            int r3 = r10 + -1
            r4 = 20
            r0 = r20
            r0.drawString(r15, r2, r3, r4)
            int r2 = r9 + 1
            int r3 = r10 + 1
            r4 = 20
            r0 = r20
            r0.drawString(r15, r2, r3, r4)
            int r2 = r9 + 1
            int r3 = r10 + -1
            r4 = 20
            r0 = r20
            r0.drawString(r15, r2, r3, r4)
            int r2 = r10 + 1
            r3 = 20
            r0 = r20
            r0.drawString(r15, r9, r2, r3)
            r2 = 20
            r0 = r20
            r0.drawString(r15, r9, r10, r2)
            int r2 = r10 + -1
            r3 = 20
            r0 = r20
            r0.drawString(r15, r9, r2, r3)
            r0 = r20
            r0.setColor(r1)
            int r1 = r9 + 1
            r2 = 20
            r0 = r20
            r0.drawString(r15, r1, r10, r2)
            goto L_0x008e
        L_0x0106:
            if (r7 == 0) goto L_0x012d
            int r1 = r20.getColor()
            r2 = 3
            r0 = r20
            r0.setColor(r2)
            int r2 = r9 + 2
            int r3 = r10 + 1
            r4 = 20
            r0 = r20
            r0.drawString(r15, r2, r3, r4)
            r0 = r20
            r0.setColor(r1)
            int r1 = r9 + 1
            r2 = 20
            r0 = r20
            r0.drawString(r15, r1, r10, r2)
            goto L_0x008e
        L_0x012d:
            int r1 = r9 + 1
            r2 = 20
            r0 = r20
            r0.drawString(r15, r1, r10, r2)
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m259a(java.lang.String, int, int, int, int, javax.microedition.lcdui.Graphics):void");
    }

    /* renamed from: a */
    public static final void m260a(String str, int i, int i2, Graphics graphics) {
        String[] strArr;
        boolean z = true;
        if (f340f[(i * 11) + 5] == 1) {
            if ((f340f[(i * 11) + 4] & 32) != 32) {
                z = false;
            }
            if (z) {
                strArr = C0000HG.m36a(str, f246a[i2], (int) f340f[(i * 11) + 2], 0);
            } else {
                strArr = f245a;
                strArr[0] = str;
            }
            m278a(strArr, i, i2, graphics);
        }
    }

    /* renamed from: a */
    public static final void m261a(String str, String str2, int i, int i2) {
        f179A = false;
        f285ay = -1;
        f218T = -1;
        f310c = C0000HG.m36a(str, f246a[2], (f260aC - 5) - 5, 0);
        f351h = str2;
        int length = (((byte) ((f339f[2] >> 16) & 255)) * f310c.length) + 4;
        int i3 = length < (f368l >> 2) ? f368l >> 2 : length > (f368l * 2) / 3 ? (f368l * 2) / 3 : length;
        int i4 = ((byte) ((f339f[2] >> 16) & 255)) + 3;
        f230a = i3 + i4 + f296b[1486] + 3 + 2;
        f360j = (f368l - f230a) >> 1;
        m348c(8, 5, f360j + 2, (f260aC - 5) - 5, i4 + 5, 532);
        m348c(7, 5, f360j + i4 + 2, (f260aC - 5) - 5, i3 + 5, 33);
        m397f(8, -2, 0);
        f202L = i;
        f259aB = i2;
        f401t = true;
    }

    /* renamed from: a */
    public static final void m262a(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        m261a(str, str2, i, i2);
        f179A = true;
        f278ar = i3;
        f200K = i4;
        f208O = f278ar;
        f289b = "";
        f224W = i5;
        for (int i6 = 0; i6 < f310c.length; i6++) {
            if (f310c[i6].indexOf("@1") >= 0) {
                f218T = i6;
            } else if (f310c[i6].indexOf("@x") >= 0) {
                f285ay = i6;
            }
        }
    }

    /* renamed from: a */
    public static final void m263a(Graphics graphics) {
        graphics.setClip(0, 0, f260aC, f368l);
        graphics.setColor(f191F[21]);
        graphics.drawRect(0, 0, f260aC - 1, f404u - 1);
        graphics.setColor(f191F[20]);
        graphics.drawRect(1, 1, f260aC - 3, f404u - 3);
        graphics.setColor(f191F[19]);
        graphics.fillRect(2, 2, f260aC - 4, f404u - 4);
        graphics.setColor(f191F[18]);
        m260a(f318d, 11, 2, graphics);
        graphics.setClip(0, 0, f260aC, f368l);
        if (m446l(155) && m446l(152)) {
            m249a(1, 1, 152, 0, graphics);
            m247a(f260aC - 1, 1, 152, 0, 0, 2, graphics);
            m247a(0, f404u - f296b[1673], 155, 0, 0, 0, graphics);
            m247a((f260aC - f296b[1672]) - 1, (f404u - f296b[1673]) - 1, 152, 0, 0, 3, graphics);
        }
        if (f212Q >= 0 && !f393r && !f352h) {
            m446l(f284ax);
            m249a(0, f368l, 146, 0, graphics);
            m249a(f296b[1606] >> 1, f368l, 136, 3, graphics);
            int i = f368l - f296b[1607];
            if (f284ax >= 0) {
                m249a(0, i, 138, 0, graphics);
                m249a(f296b[1518] + 0, i, f284ax, 0, graphics);
            }
            m265a(graphics, f284ax, C0000HG.m0a(f212Q + 315));
        }
    }

    /* renamed from: a */
    public static final void m264a(Graphics graphics, int i) {
        if (m446l(138) && m446l(126) && m446l(146) && m446l(139)) {
            int i2 = (f260aC - f314c[138][3]) - f314c[126][3];
            int i3 = (f368l - f314c[146][4]) - f314c[139][4];
            short s = (short) ((f414w[13] & -65536) >> 16);
            int i4 = s == 0 ? 32 : (((short) (f414w[13] & 65535)) * 32) / s;
            graphics.setColor(8421631);
            graphics.fillRect(i2 + 2 + i, ((i3 + 2) + 32) - i4, 5, i4);
        }
    }

    /* renamed from: a */
    public static final void m265a(Graphics graphics, int i, String str) {
        int i2 = (f296b[1518] + f296b[1386]) - 1;
        int i3 = (f260aC - i2) - 1;
        int i4 = ((byte) ((f339f[2] >> 16) & 255)) + 5 + 5;
        int i5 = (f368l - i4) - (((f296b[1387] + f296b[1607]) - i4) >> 1);
        graphics.setColor(f191F[8]);
        graphics.fillRect(i2, i5, i3, i4);
        graphics.setColor(f191F[6]);
        graphics.drawRect(i2, i5 + 1, i3 - 1, i4 - 1);
        graphics.setColor(f191F[5]);
        graphics.drawRect(i2, i5, i3 - 1, i4 - 1);
        m249a(i2, i5, 152, 0, graphics);
        m247a(f260aC - 1, i5, 152, 0, 0, 2, graphics);
        m348c(10, i2 + 4, i5 + 4, i3 - 8, i4 - 8, 156);
        m260a(str, 10, 2, graphics);
    }

    /* renamed from: a */
    public static final void m266a(Graphics graphics, boolean z, boolean z2, boolean z3, int i) {
        graphics.setClip(0, 0, f260aC, f368l);
        int i2 = f368l;
        graphics.setColor(f191F[3]);
        graphics.fillRect(0, 0, f260aC, f368l);
        m249a(0, i2, 146, 0, graphics);
        m247a(f260aC, i2, 146, 0, 0, 2, graphics);
        int i3 = i2 - f296b[1607];
        m249a(0, i3, 138, 0, graphics);
        int i4 = f296b[1518] + 0;
        m249a(i4, i3, i, 0, graphics);
        if (i == 126) {
            m449m(graphics);
        }
        int i5 = i4 + f296b[1386];
        int i6 = i3 - f296b[1387];
        graphics.setColor(f191F[8]);
        graphics.fillRect(i5, i6, f260aC - i5, f368l - i6);
        graphics.setColor(f191F[5]);
        graphics.drawLine(i5, i6, f260aC, i6);
        graphics.setColor(f191F[6]);
        graphics.drawLine(i5, i6 + 1, f260aC - 1, i6 + 1);
        graphics.drawLine(f260aC - 1, i6 + 1, f260aC - 1, f368l - 1);
        graphics.setColor(f191F[7]);
        graphics.drawLine(i5, f368l - 1, f260aC - 2, f368l - 1);
        graphics.drawLine(f260aC - 2, i6 + 2, f260aC - 2, f368l - 1);
        if (z3) {
            m247a(f260aC, f368l, 146, 0, 0, 2, graphics);
        }
        int i7 = f368l - (f296b[1607] + f296b[1387]);
        graphics.setColor(f191F[5]);
        graphics.drawRect(0, 0, f260aC - 2, i7 - 2);
        graphics.setColor(f191F[6]);
        graphics.drawRect(1, 1, f260aC - 2, i7 - 2);
        int i8 = f296b[1617] / f296b[1622];
        int i9 = f296b[1618] / f296b[1623];
        m249a(0, 0, 147, 0, graphics);
        m249a(f260aC - i8, 0, 147, 1, graphics);
        m249a(0, i7 - i9, 147, 2, graphics);
        m249a(f260aC - i8, i7 - i9, 147, 3, graphics);
        int i10 = i8 >> 1;
        int i11 = z ? m229a(false) : i9;
        int i12 = f260aC - (i10 * 2);
        int i13 = f368l - ((i9 + (f296b[1607] + f296b[1387])) + i11);
        if (!z2) {
            i13 -= 4;
        }
        graphics.setColor(f191F[8]);
        graphics.fillRect(i10, i11, i12, i13);
        if (z2) {
            graphics.setColor(f191F[3]);
            graphics.fillRect(C0000HG.f5F, C0000HG.f0A, C0000HG.f73n - 1, C0000HG.f57f);
        }
        graphics.setColor(f191F[6]);
        graphics.drawRect(i10, i11, i12, i13);
        graphics.drawRect(i10 + 1, i11 + 1, i12 - 1, i13 - 1);
        graphics.setColor(f191F[5]);
        graphics.drawRect(i10, i11, i12 - 1, i13 - 1);
        if (z2) {
            graphics.drawRect(C0000HG.f5F, C0000HG.f0A, C0000HG.f73n - 1, C0000HG.f57f);
        }
        Font font = f246a[2];
        byte b = (byte) ((f339f[2] >> 16) & 255);
        if (z) {
            graphics.setFont(font);
            int stringWidth = (((f260aC - font.stringWidth(new StringBuffer().append("").append(f414w[46]).toString())) >> 1) - 4) - f296b[1628];
            short s = f296b[1629];
            int i14 = 4;
            int i15 = 3;
            if (s > b) {
                i15 = ((s - b) >> 1) + 3;
            } else {
                i14 = ((b - s) >> 1) + 4;
            }
            m249a(stringWidth, i14, 148, 0, graphics);
            graphics.drawString(new StringBuffer().append("").append(f414w[46]).toString(), stringWidth + f296b[1628] + 4 + ((byte) (f339f[2] & 255)), i15 + ((byte) ((f339f[2] >> 8) & 255)), 20);
        }
        int i16 = f296b[1639] / f296b[1644];
        short s2 = f296b[1640];
        int i17 = (((C0000HG.f0A - i11) - i16) >> 1) + 1;
        if (z2) {
            int i18 = C0000HG.f69l - C0000HG.f0A;
            if (i18 < 0) {
                m249a((f260aC >> 1) - i16, C0000HG.f0A + C0000HG.f57f + 2, 149, 0, graphics);
            }
            if (i18 > C0000HG.f57f - C0000HG.f79q) {
                m249a(f260aC >> 1, C0000HG.f0A + C0000HG.f57f + 2, 149, 1, graphics);
            }
            if (C0000HG.f51d) {
                m249a(C0000HG.f5F, i11 + i17, 160, 1, graphics);
                m249a((C0000HG.f5F + C0000HG.f73n) - s2, i17 + i11, 160, 0, graphics);
            }
            int i19 = C0000HG.f51d ? i16 + C0000HG.f5F + 2 : C0000HG.f5F + 2;
            m348c(2, i19, i11 + 1, f260aC - (i19 * 2), b + 6, 540);
            m260a(C0000HG.f50d, 2, 2, graphics);
        }
        if (i == 126 && C0000HG.f70l && !f389q) {
            if (C0000HG.f21a == 19 || C0000HG.f21a == 20) {
                graphics.setClip(0, 0, f260aC, f368l);
                graphics.setColor(f191F[5]);
                graphics.drawRect(((((f260aC - f314c[138][3]) - f314c[126][3]) + 2) + 30) - 2, (((f368l - f314c[146][4]) - f314c[139][4]) + 2) - 1, 7, 34);
                m264a(graphics, 30);
            }
        }
    }

    /* renamed from: a */
    public static final void m267a(boolean z) {
        boolean z2 = false;
        int i = (f253a[C0000HG.f8a][C0000HG.f42c][3] & 256) != 0 ? f208O : 1;
        int a = m225a(C0000HG.f8a, C0000HG.f42c, i, false, false);
        int a2 = z ? C0001a.m101a(f269ai, C0001a.f124d[a]) : C0001a.m101a(f269ai, (int[]) null);
        short s = (short) (f213Q[a2] & 65535);
        if ((C0001a.f124d[a][3] & 256) != 0) {
            short s2 = s;
            while (true) {
                if (s2 == -1) {
                    break;
                } else if (C0001a.f124d[s2][4] == C0001a.f124d[a][4]) {
                    int[] iArr = C0001a.f124d[s2];
                    iArr[6] = iArr[6] + i;
                    break;
                } else {
                    s2 = (short) (C0001a.f124d[s2][1] & 65535);
                }
            }
        }
        z2 = true;
        if (z2) {
            int[] iArr2 = f213Q;
            iArr2[a2] = iArr2[a2] & -65536;
            int[] iArr3 = f213Q;
            iArr3[a2] = iArr3[a2] | (((short) a) & 65535);
            int[] iArr4 = C0001a.f124d[a];
            iArr4[1] = iArr4[1] & -65536;
            int[] iArr5 = C0001a.f124d[a];
            iArr5[1] = iArr5[1] | (((short) s) & 65535);
            int i2 = ((short) ((f213Q[a2] & -65536) >> 16)) + 1;
            int[] iArr6 = f213Q;
            iArr6[a2] = iArr6[a2] & 65535;
            int[] iArr7 = f213Q;
            iArr7[a2] = ((((short) i2) << 16) & -65536) | iArr7[a2];
        }
        if (z) {
            int a3 = i * C0001a.m102a(C0001a.f124d[a]);
            if (a3 % 2 != 0) {
                a3++;
            }
            m441k((a3 * 40) / 100);
        }
        C0000HG.m26a(C0000HG.f21a);
    }

    /* renamed from: a */
    public static final void m268a(boolean z, int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = 0;
        while (i4 < 273) {
            if ((f362j[i4] & 1) != 0) {
                int[] iArr = f362j;
                iArr[i4] = iArr[i4] & 65535;
                int[] iArr2 = f362j;
                iArr2[i4] = iArr2[i4] | ((((short) i4) << 16) & -65536);
                i3 = i5 + 1;
                f362j[i5] = f362j[i4];
            } else {
                i3 = i5;
            }
            i4++;
            i5 = i3;
        }
        int i6 = 1;
        while (true) {
            if (i6 == 0) {
                i6++;
            } else if (i6 >= i5) {
                break;
            } else if (f296b[(((short) ((f362j[i6] & -65536) >> 16)) * 11) + 3] < f296b[(((short) ((f362j[i6 - 1] & -65536) >> 16)) * 11) + 3]) {
                int i7 = f362j[i6];
                f362j[i6] = f362j[i6 - 1];
                f362j[i6 - 1] = i7;
                i6--;
            } else {
                i6++;
            }
        }
        m416h();
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            short s = (short) ((f362j[i9] & -65536) >> 16);
            if (z) {
                C0002b.f170a = (((i2 - i) * i8) / i5) + i;
            }
            for (int i10 = 0; i10 < 15; i10++) {
                if ((f362j[i9] & (1 << (i10 + 1))) != 0) {
                    m339c((int) s, i10);
                }
            }
            i8++;
        }
        m206N();
        for (int i11 = 0; i11 < 273; i11++) {
            f362j[i11] = 0;
        }
    }

    /* renamed from: a */
    public static final void m269a(int[] iArr) {
        if (iArr[12] != -1) {
            C0001a.m155c(C0001a.f124d[iArr[12]], f358i);
            f358i[1] = C0001a.m147c(C0001a.f124d[iArr[12]]) + 1;
            iArr[4] = f358i[0];
            iArr[5] = f358i[1] + 1;
            int i = 8192;
            if ((C0001a.f124d[iArr[12]][3] & 4) != 0) {
                i = -((m274a(C0001a.f124d[iArr[12]], true)[1] << 12) / C0001a.f136i);
            }
            iArr[6] = i;
        }
    }

    /* renamed from: a */
    public static final void m270a(int[] iArr, int i) {
        iArr[6] = iArr[6] & 65535;
        iArr[6] = iArr[6] | ((((short) i) << 16) & -65536);
    }

    /* renamed from: a */
    public static final void m271a(int[] iArr, int i, int i2) {
        if (m463q(iArr) != -1) {
            int a = m230a(iArr);
            if (i >= 0 && i < a) {
                int a2 = m231a(iArr, i);
                if (i2 >= 0 && i2 < a2) {
                    m354c(iArr, m415h(iArr) + m431j(iArr) + i, i2);
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m272a(int[] iArr, int i, int[] iArr2) {
        m235a(iArr, iArr2);
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            iArr2[i2] = (iArr2[i2] * i) >> 8;
        }
    }

    /* renamed from: a */
    public static final void m273a(int[] iArr, Graphics graphics) {
        int i = (((iArr[4] * C0001a.f136i) >> 12) + (((iArr[6] * C0001a.f136i) >> 12) >> 1)) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        if (iArr[6] >= 0) {
            int i3 = (((C0001a.f136i * -2048) >> 12) >> 1) + i;
            int i4 = i2 - ((C0001a.f136i * -2048) >> 12);
            if (m446l(173)) {
                m246a(i, i2, 173, 0, 0, i3 - i, i4 - i2, graphics);
            }
        }
    }

    /* renamed from: a */
    public static final void m274a(int[] iArr, boolean z) {
        iArr[10] = iArr[10] | 65536;
        if (z) {
            iArr[10] = iArr[10] | 131072;
        }
    }

    /* renamed from: a */
    public static final void m275a(int[] iArr, boolean z, Graphics graphics) {
        int i;
        int i2;
        int[] iArr2;
        int i3 = 0;
        int i4 = 0;
        if ((iArr[3] & 1048576) == 0) {
            if ((iArr[3] & 64) != 0) {
                i = (C0001a.f136i >> 1) - ((short) ((iArr[5] & -65536) >> 16));
                i2 = (short) (iArr[5] & 65535);
                iArr2 = f333e[iArr[4]];
            } else if ((iArr[3] & 128) != 0) {
                i = (C0001a.f136i >> 1) - ((short) ((iArr[5] & -65536) >> 16));
                i2 = (short) (iArr[5] & 65535);
                iArr2 = f387p[iArr[4]];
            } else if ((iArr[3] & 256) != 0) {
                i = (C0001a.f136i >> 1) - ((short) ((iArr[5] & -65536) >> 16));
                i2 = (short) (iArr[5] & 65535);
                iArr2 = f395r[iArr[4]];
            } else if ((iArr[3] & 8192) != 0) {
                i = (C0001a.f136i >> 1) - ((short) ((iArr[5] & -65536) >> 16));
                i2 = (short) (iArr[5] & 65535);
                iArr2 = f354h[iArr[4]];
            } else if ((iArr[3] & 1024) != 0) {
                i3 = f420y % f296b[1223];
                i = (C0001a.f136i >> 1) - ((short) ((iArr[5] & -65536) >> 16));
                i2 = (short) (iArr[5] & 65535);
                iArr2 = f407u[iArr[4]];
            } else if ((iArr[3] & 4096) != 0) {
                int[] iArr3 = f415w[iArr[4]];
                i4 = iArr[7];
                if (!z) {
                    i3 = (short) (iArr[10] & 65535);
                    m405g(iArr);
                    i = 0;
                    i2 = 0;
                    iArr2 = iArr3;
                } else {
                    i = 0;
                    i2 = 0;
                    iArr2 = iArr3;
                }
            } else if ((iArr[3] & 512) != 0) {
                i = (C0001a.f136i >> 1) - ((short) ((iArr[5] & -65536) >> 16));
                i2 = (short) (iArr[5] & 65535);
                iArr2 = f313c[iArr[4]];
            } else {
                i = 0;
                i2 = 0;
                iArr2 = null;
            }
            if (iArr2 != null) {
                C0001a.m120a(iArr, f189E);
                int i5 = (f189E[0] * C0001a.f136i) >> 12;
                int i6 = ((f189E[1] - f189E[2]) * C0001a.f136i) >> 12;
                int i7 = (short) (iArr2[1] & 65535);
                short s = (short) ((iArr2[1] & -65536) >> 16);
                if ((iArr[3] & 524288) != 0) {
                    i7 = 112;
                }
                if (i7 != -1) {
                    if (z) {
                        if ((iArr[3] & 4096) != 0) {
                            i7 = (i7 - 8) + 185;
                        } else {
                            return;
                        }
                    }
                    if (m446l(i7)) {
                        m319b(i5 + i2, i + i6, i7, s, i3, i4, graphics);
                    } else {
                        return;
                    }
                } else {
                    graphics.setColor(16711680);
                    graphics.drawString(C0000HG.m0a(iArr2[0]), i5 - f388q, i6 - f303c, 20);
                }
            }
            if (!((iArr[3] & 16) == 0 && (iArr[3] & 32) == 0) && !z) {
                m373d(iArr, graphics);
            }
            if ((iArr[3] & 2048) != 0 && !z) {
                m355c(iArr, graphics);
            }
            if ((iArr[3] & 16384) != 0 && !z) {
                m387e(iArr, graphics);
            }
            if ((iArr[3] & 262144) != 0 && !z) {
                m445l(iArr, graphics);
            }
        }
    }

    /* renamed from: a */
    public static final void m276a(int[] iArr, int[] iArr2) {
        int r = m466r(iArr);
        if (r != 0) {
            for (int i = 0; i < iArr.length; i++) {
                iArr2[i] = (iArr[i] << 8) / r;
            }
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = 0;
        }
    }

    /* renamed from: a */
    public static final void m277a(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4) {
        short s = (short) (iArr[2] & 65535);
        f363j[s][0] = iArr[0];
        f363j[s][4] = iArr[4];
        f363j[s][5] = iArr[5];
        f363j[s][6] = iArr[4];
        f363j[s][7] = iArr[5];
        f363j[s][9] = iArr[4];
        f363j[s][10] = iArr[5];
        f363j[s][11] = (((short) (iArr[2] & 65535)) & 65535) | ((((short) (iArr2[2] & 65535)) << 16) & -65536);
        f363j[s][12] = ((((short) i3) << 16) & -65536) | 0;
        int i5 = iArr[4] - iArr2[4];
        int i6 = iArr[5] - iArr2[5];
        int g = (i5 > 32767 || i5 < -32768 || i6 > 32767 || i6 < -32768) ? 10 : ((mo11g((i5 * i5) + (i6 * i6)) * 10) / (i + 1)) + 1;
        f363j[s][13] = ((((short) g) << 16) & -65536) | (((short) g) & 65535);
        f363j[s][8] = (((short) f225W[(i2 * 7) + 5]) & 65535) | ((((short) f225W[(i2 * 7) + 5]) << 16) & -65536);
        f363j[s][14] = (((short) i2) & 65535) | ((((short) i4) << 16) & -65536);
        int[] iArr3 = f363j[s];
        iArr3[3] = iArr3[3] & -65537;
        C0001a.m102a(f363j[s]);
        if ((iArr[3] & 16) != 0) {
            int l = m442l(m219a());
            if (l == 2) {
                int i7 = ((short) (f414w[53] & 65535)) - 1;
                int[] iArr4 = f414w;
                iArr4[53] = iArr4[53] & -65536;
                int[] iArr5 = f414w;
                iArr5[53] = (((short) i7) & 65535) | iArr5[53];
            } else if (l == 3) {
                int i8 = ((short) ((f414w[53] & -65536) >> 16)) - 1;
                int[] iArr6 = f414w;
                iArr6[53] = iArr6[53] & 65535;
                int[] iArr7 = f414w;
                iArr7[53] = ((((short) i8) << 16) & -65536) | iArr7[53];
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v38, types: [int] */
    /* JADX WARNING: type inference failed for: r8v2 */
    /* JADX WARNING: type inference failed for: r2v40, types: [int] */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r7v22 */
    /* JADX WARNING: type inference failed for: r7v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m278a(java.lang.String[] r25, int r26, int r27, javax.microedition.lcdui.Graphics r28) {
        /*
            short[] r2 = f340f
            int r3 = r26 * 11
            int r3 = r3 + 5
            short r2 = r2[r3]
            r3 = 1
            if (r2 != r3) goto L_0x024f
            short[] r2 = f340f
            int r3 = r26 * 11
            int r3 = r3 + 4
            short r3 = r2[r3]
            short[] r2 = f340f
            int r4 = r26 * 11
            int r4 = r4 + 0
            short r16 = r2[r4]
            short[] r2 = f340f
            int r4 = r26 * 11
            int r4 = r4 + 1
            short r2 = r2[r4]
            short[] r4 = f340f
            int r5 = r26 * 11
            int r5 = r5 + 2
            short r22 = r4[r5]
            short[] r4 = f340f
            int r5 = r26 * 11
            int r5 = r5 + 3
            short r8 = r4[r5]
            javax.microedition.lcdui.Font[] r4 = f246a
            r23 = r4[r27]
            int[] r4 = f339f
            r4 = r4[r27]
            int r4 = r4 >> 16
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r4
            r24 = r0
            r4 = r3 & 8
            r5 = 8
            if (r4 != r5) goto L_0x0265
            int r4 = r8 - r24
            int r4 = r4 / 2
            int r2 = r2 + r4
            r10 = r2
        L_0x004e:
            r0 = r25
            int r2 = r0.length
            int r2 = r2 * r24
            short[] r4 = f340f
            int r5 = r26 * 11
            int r5 = r5 + 10
            short r4 = r4[r5]
            int r9 = r2 + r4
            r2 = 0
            r2 = r25[r2]
            r0 = r23
            int r13 = r0.stringWidth(r2)
            r2 = r3 & 1
            r4 = 1
            if (r2 != r4) goto L_0x0193
            r2 = 1
            r21 = r2
        L_0x006e:
            r2 = r3 & 2
            r4 = 2
            if (r2 != r4) goto L_0x0198
            r2 = 1
            r20 = r2
        L_0x0076:
            r2 = r3 & 4
            r4 = 4
            if (r2 != r4) goto L_0x019d
            r2 = 1
            r19 = r2
        L_0x007e:
            r2 = r3 & 16
            r4 = 16
            if (r2 != r4) goto L_0x01a2
            r2 = 1
            r7 = r2
        L_0x0086:
            r2 = r3 & 64
            r3 = 64
            if (r2 != r3) goto L_0x01a6
            r2 = 1
            r11 = r2
        L_0x008e:
            r6 = 0
            short[] r2 = f348g
            int r3 = r26 * 3
            int r3 = r3 + 0
            short r2 = r2[r3]
            if (r2 == 0) goto L_0x01aa
            r2 = 1
            r12 = r2
        L_0x009b:
            short[] r2 = f348g
            int r3 = r26 * 3
            int r3 = r3 + 0
            short r5 = r2[r3]
            short[] r2 = f348g
            int r3 = r26 * 3
            int r3 = r3 + 1
            short r3 = r2[r3]
            r4 = 0
            r2 = -1
            if (r11 != 0) goto L_0x01cc
            if (r7 == 0) goto L_0x01f3
            int r7 = r13 - r22
            int r14 = r7 + 20
            short[] r7 = f348g
            int r15 = r26 * 3
            int r15 = r15 + 2
            short r7 = r7[r15]
            if (r7 >= 0) goto L_0x00c0
            int r7 = -r7
        L_0x00c0:
            r0 = r22
            if (r13 <= r0) goto L_0x01ae
            r4 = 1
            if (r7 < r14) goto L_0x00c9
            int r2 = r13 + 20
        L_0x00c9:
            if (r9 <= r8) goto L_0x01bb
            r4 = 1
            if (r9 > r7) goto L_0x01f3
            short[] r7 = f348g
            int r13 = r26 * 3
            int r13 = r13 + 2
            short r14 = (short) r8
            r7[r13] = r14
            r17 = r2
            r18 = r4
        L_0x00db:
            if (r11 == 0) goto L_0x011a
            if (r18 == 0) goto L_0x011a
            short[] r2 = f348g
            int r4 = r26 * 3
            int r4 = r4 + 2
            short r2 = r2[r4]
            int r4 = r8 - r9
            short[] r7 = f311c
            int r8 = r26 * 1
            int r8 = r8 + 0
            r9 = 0
            r7[r8] = r9
            if (r2 >= r4) goto L_0x0106
            short[] r7 = f348g
            int r8 = r26 * 3
            int r8 = r8 + 2
            short r4 = (short) r4
            r7[r8] = r4
            short[] r4 = f311c
            int r7 = r26 * 1
            int r7 = r7 + 0
            r8 = 1
            r4[r7] = r8
        L_0x0106:
            if (r2 <= 0) goto L_0x011a
            short[] r2 = f348g
            int r4 = r26 * 3
            int r4 = r4 + 2
            r7 = 0
            r2[r4] = r7
            short[] r2 = f311c
            int r4 = r26 * 1
            int r4 = r4 + 0
            r7 = 2
            r2[r4] = r7
        L_0x011a:
            r0 = r28
            r1 = r23
            r0.setFont(r1)
            r2 = 0
            r13 = r2
            r4 = r3
        L_0x0124:
            r0 = r25
            int r2 = r0.length
            if (r13 >= r2) goto L_0x0235
            r2 = r25[r13]
            r0 = r23
            int r2 = r0.stringWidth(r2)
            if (r21 == 0) goto L_0x01f9
            r3 = r16
        L_0x0135:
            if (r12 == 0) goto L_0x021d
            short[] r5 = f348g
            int r6 = r26 * 3
            int r6 = r6 + 0
            short r5 = r5[r6]
            if (r5 == 0) goto L_0x025d
            short[] r6 = f348g
            int r7 = r26 * 3
            int r7 = r7 + 2
            short r6 = r6[r7]
            int r3 = r3 + r6
            r0 = r22
            if (r2 <= r0) goto L_0x025d
            int r2 = r3 + r17
            short[] r6 = f340f
            int r7 = r26 * 11
            int r7 = r7 + 0
            short r6 = r6[r7]
            if (r2 > r6) goto L_0x025d
            r2 = -1
            r0 = r17
            if (r0 == r2) goto L_0x025d
            short[] r2 = f348g
            int r6 = r26 * 3
            int r6 = r6 + 2
            r7 = 0
            r2[r6] = r7
            r14 = r4
            r15 = r5
            r8 = r10
        L_0x016b:
            r2 = r25[r13]
            int r4 = r13 * r24
            int r4 = r4 + r8
            r5 = r26
            r6 = r27
            r7 = r28
            m259a(r2, r3, r4, r5, r6, r7)
            if (r17 <= 0) goto L_0x018c
            r4 = r25[r13]
            int r5 = r3 + r17
            int r2 = r13 * r24
            int r6 = r8 + r2
            r7 = r26
            r8 = r27
            r9 = r28
            m259a(r4, r5, r6, r7, r8, r9)
        L_0x018c:
            int r2 = r13 + 1
            r13 = r2
            r4 = r14
            r5 = r15
            r6 = r3
            goto L_0x0124
        L_0x0193:
            r2 = 0
            r21 = r2
            goto L_0x006e
        L_0x0198:
            r2 = 0
            r20 = r2
            goto L_0x0076
        L_0x019d:
            r2 = 0
            r19 = r2
            goto L_0x007e
        L_0x01a2:
            r2 = 0
            r7 = r2
            goto L_0x0086
        L_0x01a6:
            r2 = 0
            r11 = r2
            goto L_0x008e
        L_0x01aa:
            r2 = 0
            r12 = r2
            goto L_0x009b
        L_0x01ae:
            if (r3 != 0) goto L_0x00c9
            short[] r13 = f348g
            int r14 = r26 * 3
            int r14 = r14 + 2
            r15 = 0
            r13[r14] = r15
            goto L_0x00c9
        L_0x01bb:
            if (r5 != 0) goto L_0x01f3
            short[] r7 = f348g
            int r13 = r26 * 3
            int r13 = r13 + 2
            r14 = 0
            r7[r13] = r14
            r17 = r2
            r18 = r4
            goto L_0x00db
        L_0x01cc:
            if (r7 == 0) goto L_0x01f3
            r0 = r22
            if (r13 <= r0) goto L_0x01dc
            r4 = 1
        L_0x01d3:
            if (r9 <= r8) goto L_0x01e8
            r4 = 1
            r17 = r2
            r18 = r4
            goto L_0x00db
        L_0x01dc:
            if (r3 != 0) goto L_0x01d3
            short[] r7 = f348g
            int r13 = r26 * 3
            int r13 = r13 + 2
            r14 = 0
            r7[r13] = r14
            goto L_0x01d3
        L_0x01e8:
            if (r5 != 0) goto L_0x01f3
            short[] r7 = f348g
            int r13 = r26 * 3
            int r13 = r13 + 2
            r14 = 0
            r7[r13] = r14
        L_0x01f3:
            r17 = r2
            r18 = r4
            goto L_0x00db
        L_0x01f9:
            if (r20 == 0) goto L_0x0201
            int r3 = r22 - r2
            int r3 = r3 + r16
            goto L_0x0135
        L_0x0201:
            if (r19 == 0) goto L_0x0262
            int r3 = r22 - r2
            int r3 = r3 >> 1
            int r3 = r3 + r16
            short[] r6 = f340f
            int r7 = r26 * 11
            int r7 = r7 + 0
            short r6 = r6[r7]
            if (r3 >= r6) goto L_0x0135
            short[] r3 = f340f
            int r6 = r26 * 11
            int r6 = r6 + 0
            short r3 = r3[r6]
            goto L_0x0135
        L_0x021d:
            short[] r2 = f348g
            int r4 = r26 * 3
            int r4 = r4 + 1
            short r4 = r2[r4]
            if (r4 == 0) goto L_0x025d
            short[] r2 = f348g
            int r6 = r26 * 3
            int r6 = r6 + 2
            short r2 = r2[r6]
            int r2 = r2 + r10
            r14 = r4
            r15 = r5
            r8 = r2
            goto L_0x016b
        L_0x0235:
            if (r18 == 0) goto L_0x024f
            r2 = 0
            r2 = r25[r2]
            r0 = r23
            r0.stringWidth(r2)
            if (r11 != 0) goto L_0x024f
            if (r5 == 0) goto L_0x0250
            short[] r2 = f348g
            int r3 = r26 * 3
            int r3 = r3 + 2
            short r4 = r2[r3]
            int r4 = r4 + r5
            short r4 = (short) r4
            r2[r3] = r4
        L_0x024f:
            return
        L_0x0250:
            short[] r2 = f348g
            int r3 = r26 * 3
            int r3 = r3 + 2
            short r5 = r2[r3]
            int r4 = r4 + r5
            short r4 = (short) r4
            r2[r3] = r4
            goto L_0x024f
        L_0x025d:
            r14 = r4
            r15 = r5
            r8 = r10
            goto L_0x016b
        L_0x0262:
            r3 = r6
            goto L_0x0135
        L_0x0265:
            r10 = r2
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m278a(java.lang.String[], int, int, javax.microedition.lcdui.Graphics):void");
    }

    /* renamed from: a */
    public static final void m279a(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            iArr[i][4] = -1;
            iArr[i][0] = -1;
        }
    }

    /* renamed from: a */
    public static final boolean m280a() {
        return f414w[45] == -1 || f253a[4][f414w[45]][4] == -1 || f407u[f253a[4][f414w[45]][4]][6] != 0;
    }

    /* renamed from: a */
    public static final boolean m281a(int i) {
        int b = m307b(i);
        if (b < 0) {
            return false;
        }
        boolean z = f330e[b] == 5;
        if (!z) {
            byte[] bArr = f324d[b];
            if (f330e[b] == 10) {
                return bArr[1] == 15;
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m282a(int i, int i2) {
        return m339c(i, i2) > C0000HG.m58e(100);
    }

    /* renamed from: a */
    public static final boolean m283a(int i, int i2, int i3) {
        return i3 >= i && i3 < i2;
    }

    /* renamed from: a */
    public static final boolean m284a(int i, int i2, int i3, int i4) {
        return m223a(i, i2, i3, i4) > C0000HG.m58e(100);
    }

    /* renamed from: a */
    public static final boolean m285a(int i, int i2, int i3, int i4, int i5, boolean z) {
        if ((f414w[3] & 8388608) != 0 || ((short) (f414w[12] & 65535)) <= 0) {
            return false;
        }
        boolean z2 = false;
        int length = f403t.length;
        while (true) {
            int i6 = length - 1;
            if (i6 < 0) {
                return z2;
            }
            int[] iArr = f403t[i6];
            boolean z3 = iArr[0] == 13 ? iArr[0] == i && (i2 < iArr[2] || i2 > iArr[3] || i3 < iArr[4] || i3 > iArr[5]) && i4 >= iArr[2] && i4 <= iArr[3] && i5 >= iArr[4] && i5 <= iArr[5] && iArr[1] == 1 : iArr[0] == 8 ? iArr[0] == i && i2 >= iArr[2] && i2 <= iArr[3] && i3 >= iArr[4] && i3 <= iArr[5] && (i4 < iArr[2] || i4 > iArr[3] || i5 < iArr[4] || i5 > iArr[5]) && iArr[1] == 1 : iArr[0] == 18 ? iArr[0] == i && i2 >= iArr[2] && i2 <= iArr[3] && i3 >= iArr[4] && i3 <= iArr[5] && iArr[1] == 1 : iArr[0] == i && iArr[2] == i2 && iArr[3] == i3 && iArr[4] == i4 && iArr[1] == 1;
            if (z3) {
                int[] iArr2 = null;
                int i7 = 4;
                while (true) {
                    i7--;
                    if (i7 >= 0) {
                        if (f367k[i7][0] == 0) {
                            iArr2 = f367k[i7];
                            break;
                        }
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (iArr2 == null) {
                    return z2;
                }
                iArr2[0] = 1;
                iArr2[1] = i6;
                iArr2[2] = iArr[6];
                iArr2[3] = 0;
                iArr2[4] = 0;
                iArr2[9] = 16;
                if (z) {
                    m406g(iArr2, i7);
                }
                z2 = true;
                length = i6;
            } else {
                length = i6;
            }
        }
    }

    /* renamed from: a */
    public static final boolean m286a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        if (i3 < 0 || i4 < 0 || i4 >= C0001a.f94F * 2 || i3 >= C0001a.f154r * 2 || (f217S[(C0001a.f154r * i4 * 2 * 3) + (i3 * 3) + 2] & 49152) == 32768 || (f217S[(C0001a.f154r * i4 * 2 * 3) + (i3 * 3) + 2] & 49152) == 16384) {
            return false;
        }
        if (z) {
            C0001a.m155c(f391q[i], C0001a.f153q);
            int[] a = m230a(f391q[i]);
            int i5 = i3 + ((((short) (a[3] & 65535)) - ((short) (a[2] & 65535))) >> 11);
            int i6 = i4 + ((((short) ((a[3] & -65536) >> 16)) - ((short) ((a[2] & -65536) >> 16))) >> 11);
            for (int i7 = i3; i7 <= i5; i7++) {
                for (int i8 = i4; i8 <= i6; i8++) {
                    if (!m286a(i, i2, i7, i8, false, z2)) {
                        return false;
                    }
                }
            }
        }
        if (z2 && ((short) ((f217S[((((C0001a.f154r * i4) * 2) * 3) + (i3 * 3)) + 2] & -65536) >> 16)) >= 0) {
            byte b = (byte) ((f217S[((((C0001a.f154r * i4) * 2) * 3) + (i3 * 3)) + 2] >> 16) & 255);
            int i9 = ((byte) ((f217S[((((C0001a.f154r * i4) * 2) * 3) + (i3 * 3)) + 2] >> 24) & 255)) - f391q[b][24];
            if (b == i || i9 < 0) {
                return true;
            }
            if (i9 >= i2 && i9 <= i2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m287a(int i, int i2, boolean z) {
        short s = (short) (f253a[i][i2][8] & 65535);
        short s2 = (short) ((f253a[i][i2][8] & -65536) >> 16);
        if (s == 0) {
            if (m227a(4, false) < s2) {
                if (!z) {
                    return false;
                }
                m261a(C0000HG.m0a(80), C0000HG.m0a(230), 101, 106);
                return false;
            }
        } else if (s == 1 && m227a(5, false) < s2) {
            if (!z) {
                return false;
            }
            m261a(C0000HG.m0a(79), C0000HG.m0a(230), 101, 106);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m288a(int i, int i2, int[] iArr) {
        int[] iArr2 = f407u[(byte) (f411v[i][6] & 255)];
        int i3 = iArr2[5];
        int i4 = ((short) ((iArr2[6] & -65536) >> 16)) * 4096;
        short s = (short) (iArr2[6] & 65535);
        int i5 = (iArr2[4] * ((short) ((f414w[13] & -65536) >> 16))) / 100;
        int i6 = i5 < 1 ? 1 : i5;
        if (iArr != null) {
            m228a(i, iArr);
        }
        if (((short) ((iArr2[6] & -65536) >> 16)) > 0 && iArr == null) {
            if (s == 0 || s == 2) {
                m254a(i, i2, f414w);
            }
            f195H[0] = f411v[i][9] - i4;
            f195H[2] = f411v[i][9] + i4;
            f195H[1] = f411v[i][10] - i4;
            f195H[3] = i4 + f411v[i][10];
            for (int a = C0001a.m103a(f195H, 32); a != -1; a = (short) ((C0001a.f124d[a][1] & -65536) >> 16)) {
                if ((C0001a.f124d[a][13] & 2) == 0 && (C0001a.f124d[a][3] & 65536) == 0) {
                    m254a(i, i2, C0001a.f124d[a]);
                }
            }
            return true;
        } else if (iArr == null) {
            return false;
        } else {
            boolean z = (iArr[3] & 16) != 0 && (s == 0 || s == 2);
            boolean z2 = (iArr[3] & 32) != 0 && (s == 2 || ((s == 1 && !m433j((int) (short) ((iArr[2] & -65536) >> 16))) || ((s == 4 && (m433j((int) (short) ((iArr[2] & -65536) >> 16)) || (iArr[13] & 128) != 0)) || (s == 3 && !m433j((int) (short) ((iArr[2] & -65536) >> 16)) && (iArr[13] & 128) == 0))));
            switch (iArr2[8]) {
                case 0:
                    if (z) {
                        if (i3 >= 0 || ((short) (f414w[12] & 65535)) != ((short) ((f414w[12] & -65536) >> 16))) {
                            m253a(0, iArr2[3] * i2 * i6, true, false, iArr);
                            break;
                        } else {
                            return false;
                        }
                    } else if (z2) {
                        if (i3 >= 0 || ((short) (iArr[12] & 65535)) != ((short) ((iArr[12] & -65536) >> 16))) {
                            m253a(0, iArr2[3] * i2 * i6, true, false, iArr);
                            m362d(f265ae);
                            break;
                        } else {
                            return false;
                        }
                    }
                    break;
                case 1:
                    int i7 = i6 * iArr2[3];
                    int b = (i3 >= 0 ? i7 * (i2 >> 1) : i7 * i2) - m310b(4, iArr);
                    if (b <= 0) {
                        b = 1;
                    }
                    if (z) {
                        if (i3 < 0 && ((short) (f414w[12] & 65535)) <= 0) {
                            return false;
                        }
                        m253a(0, -b, true, false, iArr);
                    }
                    if (z2) {
                        if (((short) (iArr[20] & 65535)) == -1 || ((short) (iArr[26] & 65535)) < 3) {
                            short s2 = (short) (f414w[2] & 65535);
                            iArr[20] = iArr[20] & -65536;
                            iArr[20] = (((short) s2) & 65535) | iArr[20];
                            iArr[22] = m311b(f414w);
                            iArr[26] = 10;
                            if ((f249a[iArr[11]][13] & 128) != 0) {
                                m227a((int) (short) ((iArr[2] & -65536) >> 16), true);
                            }
                        }
                        m257a(b, iArr, f414w);
                        m362d(f265ae);
                        break;
                    }
                    break;
                case 2:
                    if (z2 && f411v[i][7] == 0 && f249a[iArr[11]][27] != 4) {
                        iArr[13] = iArr[13] | 128;
                        iArr[20] = -1;
                        iArr[22] = m311b(iArr);
                        iArr[25] = (((i3 * i2) * i6) * (100 - m310b(4, iArr))) / 100;
                    }
                    if (iArr[25] <= 0) {
                        int[] iArr3 = f411v[i];
                        iArr3[6] = iArr3[6] & -16711681;
                        int[] iArr4 = f411v[i];
                        iArr4[6] = iArr4[6] | 262144;
                        break;
                    }
                    break;
                case 3:
                    if (z2) {
                        if (f411v[i][7] < (((i3 * i2) * i6) * (100 - m310b(4, iArr))) / 100) {
                            if (f411v[i][7] == 0 && f249a[iArr[11]][27] != 4) {
                                iArr[13] = iArr[13] | 8;
                                m393f(iArr, 16);
                                short s3 = (short) (f414w[2] & 65535);
                                iArr[20] = iArr[20] & -65536;
                                iArr[20] = (((short) s3) & 65535) | iArr[20];
                                if ((f249a[iArr[11]][13] & 128) != 0) {
                                    m227a((int) (short) ((iArr[2] & -65536) >> 16), true);
                                    break;
                                }
                            }
                        } else {
                            iArr[13] = iArr[13] & -9;
                            m393f(iArr, ((short) (iArr[27] & 65535)) + 0);
                            int[] iArr5 = f411v[i];
                            iArr5[6] = iArr5[6] & -16711681;
                            int[] iArr6 = f411v[i];
                            iArr6[6] = iArr6[6] | 262144;
                            break;
                        }
                    }
                    break;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m289a(int i, boolean z) {
        int i2 = 0;
        int i3 = ((short) (f411v[i][8] & 65535)) + 1;
        if (i3 < ((short) ((f411v[i][8] & -65536) >> 16))) {
            i2 = i3;
        } else if (!z) {
            return false;
        }
        int[] iArr = f411v[i];
        iArr[8] = iArr[8] & -65536;
        int[] iArr2 = f411v[i];
        iArr2[8] = (((short) i2) & 65535) | iArr2[8];
        return true;
    }

    /* renamed from: a */
    public static final boolean m290a(int i, int[] iArr) {
        if ((iArr[3] & 16) != 0) {
            return (f391q[i][13] & 128) == 0 && ((short) (f414w[12] & 65535)) > 0;
        }
        if ((iArr[3] & 32) == 0) {
            return false;
        }
        if ((iArr[13] & 2) == 0 && (iArr[3] & 65536) == 0) {
            return (f391q[i][13] & 128) == 0 || (iArr[13] & 128) == 0;
        }
        return false;
    }

    /* renamed from: a */
    public static final boolean m291a(int i, int[] iArr, int[] iArr2) {
        int i2;
        boolean z = false;
        if ((iArr[3] & 16) != 0) {
            int i3 = (short) (iArr[12] & 65535);
            if (!f409v) {
                i2 = i3 - i;
                iArr[12] = iArr[12] & -65536;
                iArr[12] = iArr[12] | (((short) i2) & 65535);
            } else {
                i2 = i3;
            }
            if (i3 > 0 && i2 <= 0) {
                z = true;
            }
        }
        if ((iArr[3] & 32) != 0) {
            short s = (short) (iArr[12] & 65535);
            int i4 = s - i;
            iArr[12] = iArr[12] & -65536;
            iArr[12] = iArr[12] | (((short) i4) & 65535);
            if (s > 0 && i4 <= 0) {
                z = true;
            }
            iArr[13] = iArr[13] & -9;
            m362d(f265ae);
        }
        if (!(iArr2 == null || !z || (iArr2[3] & 16) == 0 || (iArr[3] & 32) == 0)) {
            m253a(25, m230a(iArr)[12], true, false, f414w);
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m292a(boolean z) {
        int i;
        int a = C0001a.m101a(f269ai, (int[]) null) + C0000HG.f6G;
        short s = (short) (f213Q[a] & 65535);
        int i2 = 0;
        short s2 = -1;
        while (true) {
            if (s == -1) {
                i = -1;
                break;
            } else if (C0000HG.f1B == i2) {
                i = (short) (C0001a.f124d[s][2] & 65535);
                break;
            } else {
                i2++;
                s2 = s;
                s = (short) (C0001a.f124d[s][1] & 65535);
            }
        }
        if (i >= 0) {
            int i3 = 0;
            int i4 = -1;
            boolean z2 = (C0001a.f124d[i][3] & 256) != 0;
            if (z) {
                int a2 = C0001a.m102a(C0001a.f124d[i]);
                if (z2) {
                    a2 *= f208O;
                    i3 = C0001a.f124d[i][6];
                    i4 = C0001a.f124d[i][4];
                    C0001a.f124d[i][6] = f208O;
                }
                if (!m441k(-a2)) {
                    m317b(240, 230, 101, 106);
                    if (z2) {
                        C0001a.f124d[i][6] = i3;
                    }
                    return true;
                }
            }
            if (mo13i(i)) {
                if (z && z2) {
                    i3 -= f208O;
                    if (i3 > 0) {
                        C0001a.f124d[i][4] = i4;
                        C0001a.f124d[i][6] = i3;
                    }
                }
                if (i3 == 0) {
                    short s3 = (short) (C0001a.f124d[s][1] & 65535);
                    if (s2 == -1) {
                        int[] iArr = f213Q;
                        iArr[a] = iArr[a] & -65536;
                        int[] iArr2 = f213Q;
                        iArr2[a] = (((short) s3) & 65535) | iArr2[a];
                    } else {
                        int[] iArr3 = C0001a.f124d[s2];
                        iArr3[1] = iArr3[1] & -65536;
                        int[] iArr4 = C0001a.f124d[s2];
                        iArr4[1] = (((short) s3) & 65535) | iArr4[1];
                    }
                    int i5 = ((short) ((f213Q[a] & -65536) >> 16)) - 1;
                    int[] iArr5 = f213Q;
                    iArr5[a] = iArr5[a] & 65535;
                    int[] iArr6 = f213Q;
                    iArr6[a] = iArr6[a] | ((((short) i5) << 16) & -65536);
                    if (i5 == 0 && f414w[11] == -1) {
                        C0001a.f124d[f269ai][8] = 0;
                    }
                }
                C0000HG.m61f(21);
            }
        } else if (z) {
            m441k(0);
        }
        return z || ((short) ((f213Q[a] & -65536) >> 16)) > 0;
    }

    /* renamed from: a */
    public static final boolean m293a(int[] iArr) {
        int a;
        short s = (short) ((iArr[8] & -65536) >> 16);
        switch ((short) (iArr[8] & 65535)) {
            case 0:
                a = m227a(4, false);
                break;
            case 1:
                a = m227a(5, false);
                break;
            default:
                return true;
        }
        return a >= s;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [byte[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m294a(int[] r10, boolean r11) {
        /*
            r3 = 1
            r1 = 0
            int r2 = m405g(r10)
            int r7 = m459p(r10)
            int r8 = m463q(r10)
            if (r8 < 0) goto L_0x0014
            r0 = 8
            if (r8 < r0) goto L_0x0015
        L_0x0014:
            return r3
        L_0x0015:
            byte[][][][] r0 = f302b
            r0 = r0[r8]
            if (r0 == 0) goto L_0x0014
            if (r7 < 0) goto L_0x0014
            r0 = 17
            if (r7 >= r0) goto L_0x0014
            int r0 = m378e(r10)
            r4 = -1
            if (r0 == r4) goto L_0x002f
            byte[][][][] r4 = f302b
            r4 = r4[r8]
            int r4 = r4.length
            if (r0 < r4) goto L_0x0030
        L_0x002f:
            r0 = r1
        L_0x0030:
            int r4 = r2 + 1
            byte[][][][] r2 = f302b
            r2 = r2[r8]
            r2 = r2[r0]
            r2 = r2[r7]
            byte r6 = r2[r1]
            r5 = r1
            r2 = r1
        L_0x003e:
            if (r6 >= r4) goto L_0x0069
            int r5 = r5 + 5
            byte[][][][] r9 = f302b
            r9 = r9[r8]
            r9 = r9[r0]
            r9 = r9[r7]
            int r9 = r9.length
            if (r5 < r9) goto L_0x0058
            if (r11 == 0) goto L_0x0066
            r0 = r3
        L_0x0050:
            r2 = r1
        L_0x0051:
            m231a(r10, r0)
            m342c(r10, r2)
            goto L_0x0014
        L_0x0058:
            byte[][][][] r9 = f302b
            r9 = r9[r8]
            r9 = r9[r0]
            r9 = r9[r7]
            byte r9 = r9[r5]
            int r6 = r6 + r9
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0066:
            r1 = r2
            r0 = r4
            goto L_0x0050
        L_0x0069:
            r0 = r4
            r3 = r1
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m294a(int[], boolean):boolean");
    }

    /* renamed from: a */
    public static final int[] m295a() {
        int i = f414w[42];
        if (i == -1 || f253a[0][i][4] == -1) {
            return null;
        }
        return f253a[0][i];
    }

    /* renamed from: a */
    public static final int[] m296a(int i, int i2) {
        int i3 = 0;
        if (i >= 0 && i < C0001a.f154r && i2 >= 0 && i2 < C0001a.f94F) {
            int i4 = C0001a.f109a[i2][i];
            while (i4 != -1) {
                if ((C0001a.f124d[i4][3] & 1048576) != 0) {
                    i4 = (short) (C0001a.f124d[i4][1] & 65535);
                } else if ((C0001a.f124d[i4][3] & 524288) != 0) {
                    f269ai = i4;
                    f287b = 7;
                    f222V = 1;
                    return m230a(C0001a.f124d[i4]);
                } else if ((C0001a.f124d[i4][3] & 256) != 0) {
                    f269ai = i4;
                    f287b = 0;
                    f222V = 3;
                    return f395r[C0001a.f124d[i4][4]];
                } else if ((C0001a.f124d[i4][3] & 64) != 0) {
                    f269ai = i4;
                    f287b = 0;
                    f222V = 3;
                    return f333e[C0001a.f124d[i4][4]];
                } else if ((C0001a.f124d[i4][3] & 128) != 0) {
                    f269ai = i4;
                    f287b = 0;
                    f222V = 3;
                    return f387p[C0001a.f124d[i4][4]];
                } else if ((C0001a.f124d[i4][3] & 8192) != 0) {
                    f269ai = i4;
                    f287b = 0;
                    f222V = 3;
                    return f354h[C0001a.f124d[i4][4]];
                } else if ((C0001a.f124d[i4][3] & 1024) != 0) {
                    f269ai = i4;
                    f287b = 0;
                    f222V = 3;
                    return f407u[C0001a.f124d[i4][4]];
                } else if ((C0001a.f124d[i4][3] & 512) != 0) {
                    f269ai = i4;
                    f287b = 0;
                    f222V = 3;
                    return f313c[C0001a.f124d[i4][4]];
                } else {
                    if ((C0001a.f124d[i4][3] & 32) == 0) {
                        if ((C0001a.f124d[i4][3] & 4096) != 0) {
                            byte b = (byte) (C0001a.f124d[i4][8] & 255);
                            switch (b) {
                                case 4:
                                case 5:
                                    byte b2 = (byte) ((C0001a.f124d[i4][8] >> 8) & 255);
                                    int b3 = C0001a.m131b();
                                    if (((1 << b2) & b3) != 0) {
                                        if (b == 4) {
                                            f287b = 7;
                                            f222V = 1;
                                        }
                                    } else if (((1 << (b2 + 1)) & b3) != 0) {
                                        byte b4 = (byte) ((C0001a.f124d[i4][8] >> 16) & 255);
                                        byte b5 = (byte) ((C0001a.f124d[i4][8] >> 24) & 255);
                                        f287b = 6;
                                        f222V = 0;
                                        if (b5 > 0) {
                                            f287b = 4;
                                            f222V = 6;
                                        }
                                        if (b4 > 0) {
                                            while (true) {
                                                if (i3 < f253a[5].length) {
                                                    int i5 = f253a[5][i3][4];
                                                    if (i5 < 0 || f313c[i5][4] != b4) {
                                                        i3++;
                                                    } else {
                                                        f287b = 5;
                                                        f222V = 5;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        f287b = 3;
                                        f222V = 4;
                                    }
                                    f269ai = i4;
                                    return f415w[C0001a.f124d[i4][4]];
                                case 8:
                                    if (((short) ((f213Q[C0001a.m101a(i4, (int[]) null)] & -65536) >> 16)) != 0) {
                                        f287b = 7;
                                        f222V = 1;
                                        f269ai = i4;
                                        return f415w[C0001a.f124d[i4][4]];
                                    }
                                    break;
                            }
                        }
                    } else if (m433j((int) (short) ((C0001a.f124d[i4][2] & -65536) >> 16)) && (C0001a.f124d[i4][13] & 2) == 0 && (C0001a.f124d[i4][3] & 65536) == 0) {
                        f269ai = i4;
                        f287b = 1;
                        f222V = 2;
                        return f249a[C0001a.f124d[i4][11]];
                    } else if ((C0001a.f124d[i4][13] & 2) != 0) {
                        if (((short) ((f213Q[(short) (C0001a.f124d[i4][17] & 65535)] & -65536) >> 16)) > 0) {
                            f269ai = i4;
                            f287b = 7;
                            f222V = 1;
                            return f249a[C0001a.f124d[i4][11]];
                        }
                    }
                    i4 = (short) (C0001a.f124d[i4][1] & 65535);
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final int[] m297a(int[] iArr) {
        if ((iArr[3] & 32) != 0) {
            return f249a[iArr[11]];
        }
        if ((iArr[3] & 64) != 0) {
            return f333e[iArr[4]];
        }
        if ((iArr[3] & 128) != 0) {
            return f387p[iArr[4]];
        }
        if ((iArr[3] & 256) != 0) {
            return f395r[iArr[4]];
        }
        if ((iArr[3] & 512) != 0) {
            return f313c[iArr[4]];
        }
        if ((iArr[3] & 4096) != 0) {
            return f415w[iArr[4]];
        }
        if ((iArr[3] & 8192) != 0) {
            return f354h[iArr[4]];
        }
        if ((iArr[3] & 1024) != 0) {
            return f407u[iArr[4]];
        }
        return null;
    }

    /* renamed from: a */
    public static final int[] m298a(int[] iArr, int[] iArr2) {
        for (int i = 0; i < f215R.length; i++) {
            f215R[i] = -1;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            if (iArr[i2 + 6] != -1) {
                f215R[i2] = (((short) f349g[(short) ((iArr[i2 + 6] & -65536) >> 16)][3]) & 65535) | ((((short) (iArr[i2 + 6] & 65535)) << 16) & -65536);
            }
        }
        for (int i3 = 0; i3 < 5; i3++) {
            f215R[i3 + 2] = iArr2[i3 + 5];
        }
        return f215R;
    }

    /* renamed from: a */
    public static final short[] m299a(int[] iArr, boolean z) {
        int i;
        if ((iArr[3] & 4) == 0) {
            f247a[0] = 0;
            f247a[1] = 0;
            f247a[2] = 0;
            f247a[3] = 0;
            return null;
        }
        int q = m463q(iArr);
        if (q == -1 || f254a[q] == null) {
            return null;
        }
        int e = m378e(iArr);
        int s = m469s(iArr);
        int p = m459p(iArr);
        int u = m474u(iArr);
        if (z) {
            if (f243a[p] != -1) {
                p = f243a[p];
            }
            u = 0;
            i = p;
        } else {
            i = p;
        }
        if (e < 0 || e >= f257a[q].length) {
            e = 0;
        }
        int i2 = (s < 0 || s >= f257a[q][e].length) ? 0 : s;
        for (int i3 = 0; i3 < 4; i3++) {
            f247a[i3] = f257a[q][e][i2][i][(u * 4) + i3];
        }
        return f247a;
    }

    /* renamed from: aa */
    public static final void m300aa() {
        f237a.clear();
    }

    /* renamed from: ab */
    public static final void m301ab() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < f302b.length) {
                if ((f323d[(i2 * 2) + 1] & 1) == 0) {
                    f302b[i2] = null;
                    f254a[i2] = null;
                    f315c[i2] = null;
                    f255a[i2] = null;
                    f252a[i2] = null;
                    f251a[i2] = null;
                    f256a[i2] = null;
                    f312c[i2] = null;
                    f300b[i2] = null;
                    f257a[i2] = null;
                }
                i = i2 + 1;
            } else {
                System.gc();
                return;
            }
        }
    }

    /* renamed from: ac */
    public static final void m302ac() {
        if (m458o(3)) {
            try {
                C0000HG.m67h(3);
                f317d = C0000HG.f15a.readLong();
                C0000HG.f14a = null;
                C0000HG.f16a = null;
                C0000HG.f13a = null;
                C0000HG.f15a = null;
            } catch (Exception e) {
                C0000HG.f14a = null;
                C0000HG.f16a = null;
                C0000HG.f13a = null;
                C0000HG.f15a = null;
            }
        }
        if (m458o(2)) {
            try {
                C0000HG.m67h(2);
                f231a = C0000HG.f15a.readLong();
                C0000HG.f14a = null;
                C0000HG.f16a = null;
                C0000HG.f13a = null;
                C0000HG.f15a = null;
            } catch (Exception e2) {
                C0000HG.f14a = null;
                C0000HG.f16a = null;
                C0000HG.f13a = null;
                C0000HG.f15a = null;
            }
        }
    }

    /* renamed from: ad */
    public static final void m303ad() {
        f388q = ((f414w[4] * C0001a.f136i) >> 12) - (f260aC >> 1);
        f303c = ((f414w[5] * C0001a.f136i) >> 12) - (f368l >> 1);
        m438k();
    }

    /* renamed from: ae */
    public static final void m304ae() {
        int i = f414w[40];
        if (m220a(95) || m220a(85)) {
            f352h = false;
            m193A();
        }
        if (m220a(65)) {
            f352h = false;
            m367d(m361d(), m337c());
            m193A();
        }
        f414w[40] = m362d(i);
        m394f();
        if (f425z) {
            f352h = false;
            m367d(m361d(), m337c());
            m193A();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v14 */
    /* JADX WARNING: type inference failed for: r0v15 */
    /* JADX WARNING: type inference failed for: r0v16 */
    /* JADX WARNING: type inference failed for: r0v17 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: type inference failed for: r0v19 */
    /* JADX WARNING: type inference failed for: r0v20 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r0v40 */
    /* JADX WARNING: type inference failed for: r0v45 */
    /* JADX WARNING: type inference failed for: r0v50 */
    /* JADX WARNING: type inference failed for: r0v55 */
    /* JADX WARNING: type inference failed for: r0v60 */
    /* JADX WARNING: type inference failed for: r0v65 */
    /* JADX WARNING: type inference failed for: r0v70 */
    /* JADX WARNING: type inference failed for: r0v75 */
    /* JADX WARNING: type inference failed for: r0v80 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: af */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m305af() {
        /*
            r4 = 106(0x6a, float:1.49E-43)
            r2 = 0
            r1 = 1
            r0 = 80
            boolean r0 = m220a(r0)
            if (r0 == 0) goto L_0x0019
            int r0 = f202L
            if (r0 == r4) goto L_0x0019
            f401t = r2
            f179A = r2
            int r0 = f202L
            p000.C0000HG.m89q(r0)
        L_0x0019:
            r0 = 85
            boolean r0 = m220a(r0)
            if (r0 == 0) goto L_0x002e
            int r0 = f259aB
            if (r0 == r4) goto L_0x002e
            f401t = r2
            f179A = r2
            int r0 = f259aB
            p000.C0000HG.m89q(r0)
        L_0x002e:
            boolean r0 = f179A
            if (r0 == 0) goto L_0x01cd
            r0 = 116(0x74, float:1.63E-43)
            boolean r0 = m220a(r0)
            if (r0 == 0) goto L_0x004e
            int r0 = f208O
            int r0 = r0 + 1
            f208O = r0
            int r0 = f208O
            int r3 = f200K
            if (r0 <= r3) goto L_0x004a
            int r0 = f278ar
            f208O = r0
        L_0x004a:
            java.lang.String r0 = ""
            f289b = r0
        L_0x004e:
            r0 = 117(0x75, float:1.64E-43)
            boolean r0 = m220a(r0)
            if (r0 == 0) goto L_0x006a
            int r0 = f208O
            int r0 = r0 + -1
            f208O = r0
            int r0 = f208O
            int r3 = f278ar
            if (r0 >= r3) goto L_0x0066
            int r0 = f200K
            f208O = r0
        L_0x0066:
            java.lang.String r0 = ""
            f289b = r0
        L_0x006a:
            r0 = 118(0x76, float:1.65E-43)
            boolean r0 = m220a(r0)
            if (r0 == 0) goto L_0x01e4
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "0"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x008a:
            r3 = 101(0x65, float:1.42E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x00aa
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "1"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x00aa:
            r3 = 102(0x66, float:1.43E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x00ca
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "2"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x00ca:
            r3 = 103(0x67, float:1.44E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x00ea
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "3"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x00ea:
            r3 = 104(0x68, float:1.46E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x010a
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "4"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x010a:
            r3 = 115(0x73, float:1.61E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x012a
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "5"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x012a:
            r3 = 105(0x69, float:1.47E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x014a
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "6"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x014a:
            boolean r3 = m220a(r4)
            if (r3 == 0) goto L_0x0168
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "7"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x0168:
            r3 = 107(0x6b, float:1.5E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x0188
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "8"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
            r0 = r1
        L_0x0188:
            r3 = 108(0x6c, float:1.51E-43)
            boolean r3 = m220a(r3)
            if (r3 == 0) goto L_0x01e2
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r3 = f289b
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r3 = "9"
            java.lang.StringBuffer r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            f289b = r0
        L_0x01a7:
            r0 = 95
            boolean r0 = m220a(r0)
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = ""
            f289b = r0
            f208O = r2
        L_0x01b5:
            if (r1 == 0) goto L_0x01cd
            java.lang.String r0 = f289b     // Catch:{ Exception -> 0x01e0 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x01e0 }
        L_0x01bd:
            f208O = r2
            int r0 = f208O
            int r1 = f278ar
            if (r0 >= r1) goto L_0x01d1
            int r0 = f278ar
            f208O = r0
            java.lang.String r0 = ""
            f289b = r0
        L_0x01cd:
            m193A()
            return
        L_0x01d1:
            int r0 = f208O
            int r1 = f200K
            if (r0 <= r1) goto L_0x01cd
            int r0 = f200K
            f208O = r0
            java.lang.String r0 = ""
            f289b = r0
            goto L_0x01cd
        L_0x01e0:
            r0 = move-exception
            goto L_0x01bd
        L_0x01e2:
            r1 = r0
            goto L_0x01a7
        L_0x01e4:
            r0 = r2
            goto L_0x008a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m305af():void");
    }

    /* renamed from: b */
    public static final int m306b() {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < f391q.length; i3++) {
            if (m307b(i3) && m462p(i3)) {
                int i4 = ((f391q[i3][4] - f414w[4]) * C0001a.f136i) >> 12;
                int i5 = ((f391q[i3][5] - f414w[5]) * C0001a.f136i) >> 12;
                int i6 = (i4 * i4) + (i5 * i5);
                if (i6 < i || i == -1) {
                    i = i6;
                    i2 = i3;
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static final int m307b(int i) {
        for (int i2 = f272al - 1; i2 >= 0; i2--) {
            if (i == f324d[i2][0]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m308b(int i, int i2) {
        return m220a(i) >= m220a(i2) ? i < 0 ? 3 : 1 : i2 < 0 ? 0 : 2;
    }

    /* renamed from: b */
    public static final int m309b(int i, int i2, int i3) {
        int i4 = 1;
        int i5 = (i3 << 1) + i3 + i + i2;
        if (i5 >= 1) {
            i4 = i5;
        }
        return 5000 / i4;
    }

    /* renamed from: b */
    public static final int m310b(int i, int[] iArr) {
        int i2 = 0;
        if ((iArr[3] & 16) != 0) {
            switch (i) {
                case 0:
                case 1:
                case 5:
                    return f414w[27];
                case 2:
                case 3:
                    return f414w[28];
                case 4:
                    return f414w[29];
            }
        }
        if ((iArr[3] & 32) == 0) {
            return 0;
        }
        int i3 = iArr[11];
        switch (i) {
            case 0:
            case 1:
            case 5:
                if (iArr[16] != -1) {
                    i2 = f387p[f379n[iArr[16]][4]][11];
                }
                return i2 + f249a[i3][14];
            case 2:
            case 3:
                if (iArr[16] != -1) {
                    i2 = f387p[f379n[iArr[16]][4]][12];
                }
                return i2 + f249a[i3][15];
            case 4:
                if (iArr[16] != -1) {
                    i2 = f387p[f379n[iArr[16]][4]][13];
                }
                return i2 + f249a[i3][16];
            default:
                return 0;
        }
    }

    /* renamed from: b */
    public static final int m311b(int[] iArr) {
        short s;
        short s2;
        if ((iArr[3] & 16) != 0) {
            s = -1024;
            s2 = -2048;
        } else {
            int[] a = m230a(iArr);
            s = (short) (a[2] & 65535);
            s2 = (short) ((a[2] & -65536) >> 16);
        }
        return ((((short) ((s2 + iArr[5]) >> 11)) << 16) & -65536) | (((short) ((s + iArr[4]) >> 11)) & 65535);
    }

    /* renamed from: b */
    public static final int m312b(int[] iArr, int i) {
        if (m463q(iArr) == -1) {
            return -1;
        }
        int j = m431j(iArr);
        if (i < 0 && i >= j) {
            return -1;
        }
        int d = m364d(iArr, m415h(iArr) + i);
        if (d < 0 || d >= m393f(iArr, i)) {
            return -1;
        }
        return d;
    }

    /* renamed from: b */
    public static final void m313b() {
        int i = f260aC >> 3;
        int i2 = ((byte) ((f339f[2] >> 16) & 255)) + 4;
        m348c(4, i + 4, 4, (f260aC - (i << 1)) - 8, i2, 156);
        m397f(4, -2, 0);
        f384p = i;
        f261aa = f260aC - (i << 1);
        f275ao = i2;
    }

    /* renamed from: b */
    public static final void m314b(int i) {
        if (f298b[i] != null) {
            int[] a = m230a(f391q[i]);
            int i2 = (((short) (a[3] & 65535)) - ((short) (a[2] & 65535))) >> 11;
            int i3 = (((short) ((a[3] & -65536) >> 16)) - ((short) ((a[2] & -65536) >> 16))) >> 11;
            for (int i4 = 0; i4 < f298b[i].length; i4++) {
                int i5 = (short) (f298b[i][i4] & 65535);
                short s = (short) ((f298b[i][i4] & -65536) >> 16);
                for (int i6 = s; i6 <= s + i3; i6++) {
                    for (int i7 = i5; i7 <= i5 + i2; i7++) {
                        if (((byte) ((f217S[((((C0001a.f154r * i6) * 2) * 3) + (i7 * 3)) + 2] >> 16) & 255)) == i) {
                            int[] iArr = f217S;
                            int i8 = (C0001a.f154r * i6 * 2 * 3) + (i7 * 3) + 2;
                            iArr[i8] = iArr[i8] & 65535;
                            int[] iArr2 = f217S;
                            int i9 = (C0001a.f154r * i6 * 2 * 3) + (i7 * 3) + 2;
                            iArr2[i9] = iArr2[i9] | -65536;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static final void m315b(int i, int i2) {
        f340f[(i * 11) + 10] = (short) i2;
    }

    /* renamed from: b */
    public static final void m316b(int i, int i2, int i3) {
        int[] b = m308b(6, i);
        if ((b[3] & 2) != 0) {
            C0001a.m135b(b);
            b[0] = (((short) i2) & 65535) | ((((short) i3) << 16) & -65536);
            b[4] = (i2 * 4096) + 2048;
            b[5] = (i3 * 4096) + 2048;
            C0001a.m102a(b);
        } else {
            b[0] = (((short) i2) & 65535) | ((((short) i3) << 16) & -65536);
            b[4] = (i2 * 4096) + 2048;
            b[5] = (i3 * 4096) + 2048;
        }
        if ((b[3] & 32) != 0) {
            b[13] = b[13] & -65;
            b[13] = b[13] & -513;
            b[24] = 0;
            m307b((int) (short) ((b[2] & -65536) >> 16));
        }
    }

    /* renamed from: b */
    public static final void m317b(int i, int i2, int i3, int i4) {
        m261a(C0000HG.m0a(i), C0000HG.m0a(i2), i3, i4);
    }

    /* renamed from: b */
    public static final void m318b(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = i3;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 15;
        f383o[f412w][11] = 4;
        f383o[f412w][12] = C0000HG.m48c();
        f394r[0] = i4;
        f394r[1] = i5;
        f394r[2] = i6;
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: b */
    public static final void m319b(int i, int i2, int i3, int i4, int i5, int i6, Graphics graphics) {
        m247a(i - f388q, i2 - f303c, i3, i4, i5, i6, graphics);
    }

    /* renamed from: b */
    public static final void m320b(int i, int i2, int i3, int i4, int i5, Graphics graphics) {
        int i6 = ((C0001a.f136i * i) >> 12) - f388q;
        int i7 = ((C0001a.f136i * i2) >> 12) - f303c;
        int i8 = ((C0001a.f136i * i3) >> 12) - f388q;
        int i9 = ((C0001a.f136i * i4) >> 12) - f303c;
        graphics.setColor(f225W[8]);
        graphics.drawLine(i6, i7, i8, i9);
        int i10 = i7 - ((((short) (65535 & i5)) * C0001a.f136i) >> 12);
        int i11 = i9 - ((C0001a.f136i * ((short) ((-65536 & i5) >> 16))) >> 12);
        graphics.setColor(f225W[7]);
        graphics.drawLine(i6, i10, i8, i11);
        if (m220a(i6 - i8) > m220a(m220a(i10 - i11))) {
            graphics.drawLine(i6, i10 + 1, i8, i11 + 1);
        } else {
            graphics.drawLine(i6 + 1, i10, i8 + 1, i11);
        }
    }

    /* renamed from: b */
    public static final void m321b(int i, int i2, int i3, int i4, Graphics graphics) {
        m319b(i, i2, i3, 0, i4, 0, graphics);
    }

    /* renamed from: b */
    public static final void m322b(int i, boolean z) {
        short s;
        int[] iArr = f249a[f391q[i][11]];
        long j = (long) (iArr[11] * 4096);
        short s2 = -1;
        f410v[0] = f391q[i][4];
        f410v[1] = f391q[i][5];
        if ((f391q[i][13] & 128) == 0 && !m433j(i)) {
            f422y[0] = f414w[4];
            f422y[1] = f414w[5];
            if (m235a(f410v, f422y) <= j * j && ((short) (f414w[12] & 65535)) > 0) {
                f391q[i][22] = m311b(f414w);
                s2 = (short) (f414w[2] & 65535);
            }
        }
        if (z && (f391q[i][13] & 128) == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= f391q.length) {
                    break;
                }
                if (i2 != i && (((f249a[f391q[i2][11]][13] & 8) != 0 || m433j(i2)) && !(((short) (f249a[f391q[i2][11]][1] & 65535)) == ((short) (iArr[1] & 65535)) && (f391q[i][13] & 128) == 0))) {
                    f422y[0] = f391q[i2][4];
                    f422y[1] = f391q[i2][5];
                    if (m235a(f410v, f422y) <= j * j && m228a(i, f391q[i2])) {
                        f391q[i][22] = m311b(f391q[i2]);
                        s = (short) (f391q[i2][2] & 65535);
                        break;
                    }
                }
                i2++;
            }
        } else {
            if (m433j(i) || (f391q[i][13] & 128) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= f391q.length) {
                        break;
                    }
                    if (i3 != i && !m433j(i3)) {
                        f422y[0] = f391q[i3][4];
                        f422y[1] = f391q[i3][5];
                        if (m235a(f410v, f422y) <= j * j && m228a(i, f391q[i3])) {
                            f391q[i][22] = m311b(f391q[i3]);
                            s = (short) (f391q[i3][2] & 65535);
                            break;
                        }
                    }
                    i3++;
                }
            }
            s = s2;
        }
        if (s >= 0) {
            int[] iArr2 = f391q[i];
            iArr2[13] = iArr2[13] & -513;
            int[] iArr3 = f391q[i];
            iArr3[20] = iArr3[20] & -65536;
            int[] iArr4 = f391q[i];
            iArr4[20] = iArr4[20] | (((short) s) & 65535);
        } else {
            int[] iArr5 = f391q[i];
            iArr5[20] = iArr5[20] & -65536;
            int[] iArr6 = f391q[i];
            iArr6[20] = iArr6[20] | 65535;
            int[] iArr7 = f391q[i];
            iArr7[13] = iArr7[13] & -32769;
        }
        if (s != ((short) ((f391q[i][20] & -65536) >> 16))) {
            int i4 = f391q[i][14];
            if (i4 >= 0) {
                f391q[i][29] = m437k(f359i[i4]);
            }
            f391q[i][26] = 1376256;
            int[] iArr8 = f391q[i];
            iArr8[13] = iArr8[13] & -32769;
        }
    }

    /* renamed from: b */
    public static final void m323b(int i, int[] iArr) {
        int i2 = 0;
        if (iArr != null) {
            int q = m463q(f391q[i]);
            byte b = f248a[q][0];
            switch (iArr[15]) {
                case 0:
                    b = f248a[q][1];
                    break;
                case 1:
                    if (iArr[16] <= (f248a[q][2] < f255a[q].length ? f255a[q][f248a[q][2]].length : 0)) {
                        b = f248a[q][2];
                        break;
                    } else {
                        b = f248a[q][1];
                        break;
                    }
                case 2:
                    b = f248a[q][3];
                    break;
                case 3:
                    b = f248a[q][4];
                    break;
            }
            int i3 = iArr[16];
            if (b >= m341c(f391q[i])) {
                b = 0;
            }
            m379e(f391q[i], (int) b);
            if (i3 < m363d(f391q[i])) {
                i2 = i3;
            }
            m428i(f391q[i], i2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v61, types: [int] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: type inference failed for: r0v83, types: [int] */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m324b(javax.microedition.lcdui.Graphics r13) {
        /*
            int[] r0 = f187D
            r1 = 2
            r0 = r0[r1]
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x002b
            int[] r0 = f187D
            r1 = 2
            r0 = r0[r1]
            r0 = r0 & 1
            if (r0 == 0) goto L_0x002b
            r0 = 174(0xae, float:2.44E-43)
            f376n = r0
            r0 = 1
            f329e = r0
            r0 = 126(0x7e, float:1.77E-43)
            r1 = 463(0x1cf, float:6.49E-43)
            r2 = 0
            m254a(r0, r1, r2)
            int[] r0 = f187D
            r1 = 2
            r2 = r0[r1]
            r2 = r2 | 128(0x80, float:1.794E-43)
            r0[r1] = r2
        L_0x002a:
            return
        L_0x002b:
            r0 = 0
            r1 = 0
            int r2 = f260aC
            int r3 = f368l
            r13.setClip(r0, r1, r2, r3)
            int[] r0 = f191F
            r1 = 3
            r0 = r0[r1]
            r13.setColor(r0)
            r0 = 0
            r1 = 0
            int r2 = f260aC
            int r3 = f368l
            r13.fillRect(r0, r1, r2, r3)
            int r0 = f260aC
            int r0 = r0 >> 1
            short[] r1 = f296b
            r2 = 1838(0x72e, float:2.576E-42)
            short r1 = r1[r2]
            int r12 = r1 + 5
            int r1 = f186D
            int r1 = r1 * r12
            short[] r2 = f296b
            r3 = 1772(0x6ec, float:2.483E-42)
            short r2 = r2[r3]
            int r1 = r1 + r2
            short[] r2 = f296b
            r3 = 1794(0x702, float:2.514E-42)
            short r2 = r2[r3]
            int r1 = r1 + r2
            short[] r2 = f296b
            r3 = 1805(0x70d, float:2.53E-42)
            short r2 = r2[r3]
            int r2 = r2 >> 1
            int r1 = r1 + r2
            int r2 = f368l
            short[] r3 = f296b
            r4 = 1607(0x647, float:2.252E-42)
            short r3 = r3[r4]
            int r3 = r3 + r1
            short[] r4 = f296b
            r5 = 1387(0x56b, float:1.944E-42)
            short r4 = r4[r5]
            int r3 = r3 + r4
            int r2 = r2 - r3
            int r2 = r2 >> 1
            int r1 = r1 + r2
            short[] r2 = f296b
            r3 = 1760(0x6e0, float:2.466E-42)
            short r2 = r2[r3]
            short[] r3 = f296b
            r4 = 1765(0x6e5, float:2.473E-42)
            short r3 = r3[r4]
            int r2 = r2 / r3
            int r3 = f260aC
            int r3 = r3 >> 1
            int r4 = r2 * 3
            int r3 = r3 + r4
            r4 = 160(0xa0, float:2.24E-43)
            r5 = 0
            m249a(r3, r1, r4, r5, r13)
            int r3 = f260aC
            int r3 = r3 >> 1
            int r2 = r2 * 4
            int r2 = r3 - r2
            r3 = 160(0xa0, float:2.24E-43)
            r4 = 1
            m249a(r2, r1, r3, r4, r13)
            r2 = 10
            r3 = 0
            int r4 = f260aC
            int r4 = r4 + -20
            int r5 = f260aC
            r13.setClip(r2, r3, r4, r5)
            r2 = 161(0xa1, float:2.26E-43)
            r3 = 0
            m249a(r0, r1, r2, r3, r13)
            short[] r0 = f296b
            r2 = 1772(0x6ec, float:2.483E-42)
            short r0 = r0[r2]
            int r1 = r1 - r0
            r0 = 0
            r7 = r0
        L_0x00c2:
            int r0 = f186D
            if (r7 >= r0) goto L_0x022d
            r0 = 0
            int r2 = f276ap
            r3 = 1
            int r3 = r3 << r7
            r2 = r2 & r3
            if (r2 == 0) goto L_0x02f1
            r0 = 1
            r8 = r0
        L_0x00d0:
            int r0 = f210P
            if (r0 <= r7) goto L_0x0112
            int r0 = f260aC
            short[] r2 = f296b
            r3 = 1782(0x6f6, float:2.497E-42)
            short r2 = r2[r3]
            int r0 = r0 - r2
            int r0 = r0 >> 1
            short[] r2 = f296b
            r3 = 1837(0x72d, float:2.574E-42)
            short r2 = r2[r3]
            int r0 = r0 - r2
            int r0 = r0 + -10
            int r0 = r0 >> 1
            r9 = r0
        L_0x00eb:
            r0 = 0
        L_0x00ec:
            if (r0 >= r12) goto L_0x0137
            int r2 = f260aC
            int r2 = r2 >> 1
            int r3 = r1 - r0
            r4 = 162(0xa2, float:2.27E-43)
            r5 = 0
            m249a(r2, r3, r4, r5, r13)
            int r2 = f210P
            if (r2 <= r7) goto L_0x0128
            int r2 = f260aC
            int r2 = r2 >> 1
            int r3 = r1 - r0
            r4 = 164(0xa4, float:2.3E-43)
            r5 = 0
            m249a(r2, r3, r4, r5, r13)
        L_0x010a:
            short[] r2 = f296b
            r3 = 1805(0x70d, float:2.53E-42)
            short r2 = r2[r3]
            int r0 = r0 + r2
            goto L_0x00ec
        L_0x0112:
            int r0 = f260aC
            short[] r2 = f296b
            r3 = 1782(0x6f6, float:2.497E-42)
            short r2 = r2[r3]
            int r0 = r0 - r2
            int r0 = r0 >> 1
            short[] r2 = f296b
            r3 = 1837(0x72d, float:2.574E-42)
            short r2 = r2[r3]
            int r0 = r0 - r2
            int r0 = r0 + -10
            r9 = r0
            goto L_0x00eb
        L_0x0128:
            int r2 = f210P
            if (r2 != r7) goto L_0x010a
            int r2 = f260aC
            int r2 = r2 >> 1
            r3 = 168(0xa8, float:2.35E-43)
            r4 = 0
            m249a(r2, r1, r3, r4, r13)
            goto L_0x010a
        L_0x0137:
            short[] r0 = f296b
            r2 = 1782(0x6f6, float:2.497E-42)
            short r0 = r0[r2]
            int r0 = r0 >> 1
            r2 = 0
            int r3 = f210P
            if (r3 <= r7) goto L_0x0174
            r11 = r2
            r10 = r0
        L_0x0146:
            if (r11 >= r9) goto L_0x0175
            if (r8 == 0) goto L_0x0165
            int r0 = f260aC
            int r0 = r0 >> 1
            int r0 = r0 + r10
            r2 = 165(0xa5, float:2.31E-43)
            r3 = 0
            m249a(r0, r1, r2, r3, r13)
        L_0x0155:
            short[] r0 = f296b
            r2 = 1815(0x717, float:2.543E-42)
            short r0 = r0[r2]
            int r10 = r10 + r0
            short[] r0 = f296b
            r2 = 1815(0x717, float:2.543E-42)
            short r0 = r0[r2]
            int r0 = r0 + r11
            r11 = r0
            goto L_0x0146
        L_0x0165:
            int r0 = f260aC
            int r0 = r0 >> 1
            int r0 = r0 - r10
            r2 = 165(0xa5, float:2.31E-43)
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = r13
            m247a(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0155
        L_0x0174:
            r10 = r0
        L_0x0175:
            r2 = 0
            r0 = 0
            int r3 = f210P
            if (r3 <= r7) goto L_0x0187
            if (r8 == 0) goto L_0x01ff
            short[] r0 = f296b
            r3 = 1782(0x6f6, float:2.497E-42)
            short r0 = r0[r3]
            int r0 = r0 >> 1
            int r0 = r10 - r0
        L_0x0187:
            int r3 = f260aC
            int r3 = r3 >> 1
            int r3 = r3 + r10
            int r2 = r3 - r2
            r3 = 167(0xa7, float:2.34E-43)
            r4 = 0
            m249a(r2, r1, r3, r4, r13)
            int r2 = f260aC
            int r2 = r2 >> 1
            int r2 = r2 - r10
            int r0 = r0 + r2
            r2 = 167(0xa7, float:2.34E-43)
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = r13
            m247a(r0, r1, r2, r3, r4, r5, r6)
            short[] r0 = f296b
            r2 = 1837(0x72d, float:2.574E-42)
            short r0 = r0[r2]
            int r2 = r10 + r0
            r0 = 0
            r10 = r0
            r11 = r2
        L_0x01ae:
            if (r10 >= r9) goto L_0x0227
            int r0 = f210P
            if (r0 <= r7) goto L_0x01d4
            if (r8 == 0) goto L_0x020b
            int r0 = f260aC
            int r0 = r0 >> 1
            int r0 = r0 - r10
            short[] r2 = f296b
            r3 = 1782(0x6f6, float:2.497E-42)
            short r2 = r2[r3]
            int r2 = r2 >> 1
            int r0 = r0 - r2
            short[] r2 = f296b
            r3 = 1837(0x72d, float:2.574E-42)
            short r2 = r2[r3]
            int r0 = r0 - r2
            r2 = 166(0xa6, float:2.33E-43)
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = r13
            m247a(r0, r1, r2, r3, r4, r5, r6)
        L_0x01d4:
            int r0 = f260aC
            int r0 = r0 >> 1
            int r0 = r0 + r11
            r2 = 166(0xa6, float:2.33E-43)
            r3 = 0
            m249a(r0, r1, r2, r3, r13)
            int r0 = f260aC
            int r0 = r0 >> 1
            int r0 = r0 - r11
            r2 = 166(0xa6, float:2.33E-43)
            r3 = 0
            r4 = 0
            r5 = 2
            r6 = r13
            m247a(r0, r1, r2, r3, r4, r5, r6)
            short[] r0 = f296b
            r2 = 1826(0x722, float:2.559E-42)
            short r0 = r0[r2]
            int r2 = r11 + r0
            short[] r0 = f296b
            r3 = 1826(0x722, float:2.559E-42)
            short r0 = r0[r3]
            int r0 = r0 + r10
            r10 = r0
            r11 = r2
            goto L_0x01ae
        L_0x01ff:
            short[] r2 = f296b
            r3 = 1782(0x6f6, float:2.497E-42)
            short r2 = r2[r3]
            int r2 = r2 >> 1
            int r2 = r10 - r2
            goto L_0x0187
        L_0x020b:
            int r0 = f260aC
            int r0 = r0 >> 1
            int r0 = r0 + r10
            short[] r2 = f296b
            r3 = 1782(0x6f6, float:2.497E-42)
            short r2 = r2[r3]
            int r2 = r2 >> 1
            int r0 = r0 + r2
            short[] r2 = f296b
            r3 = 1837(0x72d, float:2.574E-42)
            short r2 = r2[r3]
            int r0 = r0 + r2
            r2 = 166(0xa6, float:2.33E-43)
            r3 = 0
            m249a(r0, r1, r2, r3, r13)
            goto L_0x01d4
        L_0x0227:
            int r1 = r1 - r12
            int r0 = r7 + 1
            r7 = r0
            goto L_0x00c2
        L_0x022d:
            int r0 = f260aC
            int r0 = r0 >> 1
            short[] r2 = f296b
            r3 = 1805(0x70d, float:2.53E-42)
            short r2 = r2[r3]
            int r2 = r2 >> 1
            int r1 = r1 - r2
            r2 = 163(0xa3, float:2.28E-43)
            r3 = 0
            m249a(r0, r1, r2, r3, r13)
            r0 = 0
            r1 = 0
            int r2 = f260aC
            int r3 = f368l
            r13.setClip(r0, r1, r2, r3)
            short[] r0 = f296b
            r1 = 1508(0x5e4, float:2.113E-42)
            short r0 = r0[r1]
            int[] r1 = f339f
            r2 = 2
            r1 = r1[r2]
            int r1 = r1 >> 16
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            if (r0 >= r1) goto L_0x0265
            int[] r0 = f339f
            r1 = 2
            r0 = r0[r1]
            int r0 = r0 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
        L_0x0265:
            int r1 = f368l
            short[] r2 = f296b
            r3 = 1607(0x647, float:2.252E-42)
            short r2 = r2[r3]
            int r1 = r1 - r2
            int r2 = r0 >> 1
            int r1 = r1 - r2
            int r1 = r1 + -5
            int r2 = f260aC
            javax.microedition.lcdui.Font[] r3 = f246a
            r4 = 2
            r3 = r3[r4]
            java.lang.String r4 = f336f
            int r3 = r3.stringWidth(r4)
            int r2 = r2 - r3
            short[] r3 = f296b
            r4 = 1507(0x5e3, float:2.112E-42)
            short r3 = r3[r4]
            short[] r4 = f296b
            r5 = 1512(0x5e8, float:2.119E-42)
            short r4 = r4[r5]
            int r3 = r3 / r4
            int r3 = r3 >> 1
            int r2 = r2 - r3
            int r2 = r2 + -5
            r3 = 137(0x89, float:1.92E-43)
            r4 = 6
            m249a(r2, r1, r3, r4, r13)
            short[] r3 = f296b
            r4 = 1507(0x5e3, float:2.112E-42)
            short r3 = r3[r4]
            short[] r4 = f296b
            r5 = 1512(0x5e8, float:2.119E-42)
            short r4 = r4[r5]
            int r3 = r3 / r4
            int r3 = r3 >> 1
            int r2 = r2 + r3
            int r0 = r0 >> 1
            int r0 = r1 - r0
            int[] r1 = f191F
            r3 = 5
            r1 = r1[r3]
            r13.setColor(r1)
            javax.microedition.lcdui.Font[] r1 = f246a
            r3 = 2
            r1 = r1[r3]
            r13.setFont(r1)
            java.lang.String r1 = f336f
            int[] r3 = f339f
            r4 = 2
            r3 = r3[r4]
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            int r2 = r2 + r3
            int[] r3 = f339f
            r4 = 2
            r3 = r3[r4]
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            int r0 = r0 + r3
            r3 = 20
            r13.drawString(r1, r2, r0, r3)
            r0 = 1
            m325b(r13, r0)
            int r0 = f260aC
            short[] r1 = f296b
            r2 = 1606(0x646, float:2.25E-42)
            short r1 = r1[r2]
            int r1 = r1 >> 1
            int r0 = r0 - r1
            int r1 = f368l
            r2 = 136(0x88, float:1.9E-43)
            r3 = 1
            m249a(r0, r1, r2, r3, r13)
            goto L_0x002a
        L_0x02f1:
            r8 = r0
            goto L_0x00d0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m324b(javax.microedition.lcdui.Graphics):void");
    }

    /* renamed from: b */
    public static final void m325b(Graphics graphics, int i) {
        int i2;
        boolean z = i == 0 || i == 1;
        boolean z2 = i == 0 || i == 2;
        graphics.setClip(0, 0, f260aC, f368l);
        if (z) {
            int i3 = f368l;
            m249a(0, i3, 146, 0, graphics);
            int i4 = i3 - f296b[1607];
            m249a(0, i4, 138, 0, graphics);
            m249a(f296b[1518] + 0, i4, 126, 0, graphics);
            m449m(graphics);
        }
        m247a(f260aC, f368l, 146, 0, 0, 2, graphics);
        if (z2) {
            int i5 = f260aC;
            int i6 = f368l - f296b[1607];
            m247a(i5, i6, 138, 0, 0, 2, graphics);
            int i7 = i5 - f296b[1518];
            switch (m442l(m219a())) {
                case 0:
                case 1:
                    i2 = 140;
                    break;
                case 2:
                    if (((short) (f414w[53] & 65535)) != 0) {
                        if (((short) (f414w[53] & 65535)) > 10) {
                            i2 = 141;
                            break;
                        } else {
                            i2 = 142;
                            break;
                        }
                    } else {
                        i2 = 143;
                        break;
                    }
                case 3:
                    if (((short) ((f414w[53] & -65536) >> 16)) != 0) {
                        if (((short) ((f414w[53] & -65536) >> 16)) > 10) {
                            i2 = 141;
                            break;
                        } else {
                            i2 = 142;
                            break;
                        }
                    } else {
                        i2 = 143;
                        break;
                    }
                default:
                    i2 = 139;
                    break;
            }
            if (f414w[45] != -1) {
                i2 = m230a(f253a[4][f414w[45]])[8] == 0 ? 145 : 144;
            }
            m249a(i7, i6, i2, 0, graphics);
            m264a(graphics, 0);
        }
    }

    /* renamed from: b */
    public static final void m326b(int[] iArr) {
        iArr[6] = iArr[6] + 512;
        iArr[7] = iArr[7] + iArr[8];
        if (iArr[7] < 0) {
            iArr[8] = iArr[8] + 128;
        } else {
            iArr[8] = iArr[8] - 128;
        }
    }

    /* renamed from: b */
    public static final void m327b(int[] iArr, int i) {
        iArr[6] = iArr[6] & -65536;
        iArr[6] = iArr[6] | (((short) i) & 65535);
    }

    /* renamed from: b */
    public static final void m328b(int[] iArr, int i, int i2) {
        if (m463q(iArr) != -1) {
            int h = m415h(iArr);
            if (i >= 0 || i < h) {
                m354c(iArr, i, i2);
            }
        }
    }

    /* renamed from: b */
    public static final void m329b(int[] iArr, Graphics graphics) {
        int i = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        if (m339c(183, 0)) {
            int i3 = 16 - iArr[10];
            if (i3 < f296b[2015]) {
                m247a(i, i2, 183, 0, i3, 0, graphics);
            }
        }
    }

    /* renamed from: b */
    public static final void m330b(int[] iArr, boolean z) {
        if (f217S != null) {
            int i = iArr[3];
            if ((i & 16) != 0) {
                int b = m311b(iArr);
                int i2 = (short) (b & 65535);
                int i3 = (short) ((b & -65536) >> 16);
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                int i6 = 16384;
                if (z) {
                    i6 = 0;
                }
                for (int i7 = i3; i7 <= i5; i7++) {
                    for (int i8 = i2; i8 <= i4; i8++) {
                        if (i7 >= 0 && i8 >= 0 && i7 <= C0001a.f94F * 2 && i8 < C0001a.f154r * 2 && (f217S[(C0001a.f154r * i7 * 2 * 3) + (i8 * 3) + 2] & 49152) != 32768) {
                            int[] iArr2 = f217S;
                            int i9 = (C0001a.f154r * i7 * 2 * 3) + (i8 * 3) + 2;
                            iArr2[i9] = iArr2[i9] & -49153;
                            int[] iArr3 = f217S;
                            int i10 = (C0001a.f154r * i7 * 2 * 3) + (i8 * 3) + 2;
                            iArr3[i10] = iArr3[i10] | (i6 & 49152);
                        }
                    }
                }
                iArr[3] = i;
            } else if ((i & 32) != 0) {
                int[] a = m230a(iArr);
                int b2 = m311b(iArr);
                int i11 = (short) (b2 & 65535);
                int i12 = (short) ((b2 & -65536) >> 16);
                int i13 = i11 + ((((short) (a[3] & 65535)) - ((short) (a[2] & 65535))) >> 11);
                int i14 = i12 + ((((short) ((a[3] & -65536) >> 16)) - ((short) ((a[2] & -65536) >> 16))) >> 11);
                int i15 = 16384;
                if (z || (i & 32768) != 0) {
                    i15 = 0;
                }
                for (int i16 = i12; i16 <= i14; i16++) {
                    for (int i17 = i11; i17 <= i13; i17++) {
                        if (i16 >= 0 && i17 >= 0 && i16 <= C0001a.f94F * 2 && i17 < C0001a.f154r * 2 && (f217S[(C0001a.f154r * i16 * 2 * 3) + (i17 * 3) + 2] & 49152) != 32768) {
                            int[] iArr4 = f217S;
                            int i18 = (C0001a.f154r * i16 * 2 * 3) + (i17 * 3) + 2;
                            iArr4[i18] = iArr4[i18] & -49153;
                            int[] iArr5 = f217S;
                            int i19 = (C0001a.f154r * i16 * 2 * 3) + (i17 * 3) + 2;
                            iArr5[i19] = iArr5[i19] | (i15 & 49152);
                        }
                    }
                }
            } else if ((i & 4096) != 0) {
                int[] a2 = m230a(iArr);
                C0001a.m155c(iArr, C0001a.f153q);
                int i20 = (C0001a.f153q[0] + ((short) (a2[2] & 65535))) >> 11;
                int i21 = (C0001a.f153q[0] + ((short) (a2[3] & 65535))) >> 11;
                int i22 = (((short) ((a2[3] & -65536) >> 16)) + C0001a.f153q[1]) >> 11;
                int i23 = (z || (i & 32768) != 0) ? 16384 : 32768;
                for (int i24 = (C0001a.f153q[1] + ((short) ((a2[2] & -65536) >> 16))) >> 11; i24 <= i22; i24++) {
                    for (int i25 = i20; i25 <= i21; i25++) {
                        if (i24 >= 0 && i25 >= 0 && i24 <= C0001a.f94F * 2 && i25 < C0001a.f154r * 2) {
                            int[] iArr6 = f217S;
                            int i26 = (C0001a.f154r * i24 * 2 * 3) + (i25 * 3) + 2;
                            iArr6[i26] = iArr6[i26] & -49153;
                            int[] iArr7 = f217S;
                            int i27 = (C0001a.f154r * i24 * 2 * 3) + (i25 * 3) + 2;
                            iArr7[i27] = iArr7[i27] | (i23 & 49152);
                        }
                    }
                }
                iArr[3] = i;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b A[SYNTHETIC, Splitter:B:31:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0095 A[SYNTHETIC, Splitter:B:37:0x0095] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m331b() {
        /*
            r2 = 0
            r0 = 0
            java.lang.System.gc()
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0086, all -> 0x0091 }
            HG r3 = p000.C0000HG.f10a     // Catch:{ Exception -> 0x0086, all -> 0x0091 }
            java.lang.Class r3 = r3.getClass()     // Catch:{ Exception -> 0x0086, all -> 0x0091 }
            java.lang.String r4 = "/a"
            java.io.InputStream r3 = r3.getResourceAsStream(r4)     // Catch:{ Exception -> 0x0086, all -> 0x0091 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0086, all -> 0x0091 }
            short r3 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short[] r3 = new short[r3]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            f296b = r3     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r3 = r0
        L_0x001f:
            short[] r4 = f296b     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r4 = r4.length     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            if (r3 >= r4) goto L_0x002f
            short[] r4 = f296b     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short r5 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r4[r3] = r5     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r3 = r3 + 1
            goto L_0x001f
        L_0x002f:
            short r3 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short[][] r3 = new short[r3][]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            p000.C0000HG.f32a = r3     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r4 = r0
        L_0x0038:
            short[][] r3 = p000.C0000HG.f32a     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r3 = r3.length     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            if (r4 >= r3) goto L_0x0060
            short[][] r3 = p000.C0000HG.f32a     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short r5 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short[] r5 = new short[r5]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r3[r4] = r5     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r3 = r0
        L_0x0048:
            short[][] r5 = p000.C0000HG.f32a     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5 = r5[r4]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r5 = r5.length     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            if (r3 >= r5) goto L_0x005c
            short[][] r5 = p000.C0000HG.f32a     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5 = r5[r4]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short r6 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r5[r3] = r6     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r3 = r3 + 1
            goto L_0x0048
        L_0x005c:
            int r3 = r4 + 1
            r4 = r3
            goto L_0x0038
        L_0x0060:
            short r3 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int[] r3 = new int[r3]     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            f183B = r3     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r3 = r0
        L_0x0069:
            int[] r4 = f183B     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r4 = r4.length     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            if (r3 >= r4) goto L_0x0079
            int[] r4 = f183B     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            short r5 = r1.readShort()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r4[r3] = r5     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            int r3 = r3 + 1
            goto L_0x0069
        L_0x0079:
            r1.close()     // Catch:{ Exception -> 0x009f, all -> 0x009d }
            r1 = 0
            if (r2 == 0) goto L_0x0082
            r1.close()     // Catch:{ Exception -> 0x0099 }
        L_0x0082:
            java.lang.System.gc()
            return r0
        L_0x0086:
            r0 = move-exception
            r1 = r2
        L_0x0088:
            r0 = 1
            if (r1 == 0) goto L_0x0082
            r1.close()     // Catch:{ Exception -> 0x008f }
            goto L_0x0082
        L_0x008f:
            r1 = move-exception
            goto L_0x0082
        L_0x0091:
            r0 = move-exception
            r1 = r2
        L_0x0093:
            if (r1 == 0) goto L_0x0098
            r1.close()     // Catch:{ Exception -> 0x009b }
        L_0x0098:
            throw r0
        L_0x0099:
            r1 = move-exception
            goto L_0x0082
        L_0x009b:
            r1 = move-exception
            goto L_0x0098
        L_0x009d:
            r0 = move-exception
            goto L_0x0093
        L_0x009f:
            r0 = move-exception
            goto L_0x0088
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m331b():boolean");
    }

    /* renamed from: b */
    public static final boolean m332b(int i) {
        if (i < 0 || i >= f391q.length || f391q[i][11] == -1 || (f391q[i][13] & 2) != 0 || (f391q[i][3] & 65536) != 0 || m433j(i)) {
            return false;
        }
        int i2 = ((f391q[i][4] * C0001a.f136i) >> 12) - f388q;
        int i3 = ((f391q[i][5] * C0001a.f136i) >> 12) - f303c;
        return i2 >= 0 && i2 <= f260aC && i3 >= 0 && i3 <= f368l;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r8 != -1) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.System.gc();
        f338f = new byte[f188E];
        f234a.read(f338f, 0, f338f.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r4 == 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        f234a.readByte();
        f293b = new byte[(r4 - 1)];
        f234a.read(f293b, 0, f293b.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008d, code lost:
        f220U = r8;
        f234a.read(f346g, 0, f188E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0099, code lost:
        if (r4 == 0) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (f314c[r8] != null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        r4 = f234a.readByte();
        f296b[(r8 * 11) + 2] = (short) r4;
        java.lang.System.gc();
        f314c[r8] = new short[(r4 * 7)];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00be, code lost:
        if (r3 >= (r4 * 7)) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c0, code lost:
        f314c[r8][r3] = (short) f234a.readByte();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d0, code lost:
        f234a.skip((long) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ea A[SYNTHETIC, Splitter:B:46:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fb A[SYNTHETIC, Splitter:B:52:0x00fb] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m333b(int r8, int r9) {
        /*
            r1 = 1
            r3 = 0
            r0 = 0
            byte[] r2 = f346g
            if (r2 != 0) goto L_0x0008
        L_0x0007:
            return r0
        L_0x0008:
            f338f = r3
            f293b = r3
            java.io.DataInputStream r2 = f234a     // Catch:{ Exception -> 0x0109, all -> 0x00f7 }
            if (r2 != 0) goto L_0x010c
            m475u()     // Catch:{ Exception -> 0x0109, all -> 0x00f7 }
            r3 = r0
            r2 = r1
        L_0x0015:
            java.io.DataInputStream r4 = f234a     // Catch:{ Exception -> 0x00e4 }
            short r5 = r4.readShort()     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r4 = f234a     // Catch:{ Exception -> 0x00e4 }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x00e4 }
            f188E = r4     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r4 = f234a     // Catch:{ Exception -> 0x00e4 }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x00e4 }
            if (r5 <= r9) goto L_0x0044
            if (r3 == 0) goto L_0x0044
            m475u()     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r4 = f234a     // Catch:{ Exception -> 0x00e4 }
            short r5 = r4.readShort()     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r4 = f234a     // Catch:{ Exception -> 0x00e4 }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x00e4 }
            f188E = r4     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r4 = f234a     // Catch:{ Exception -> 0x00e4 }
            short r4 = r4.readShort()     // Catch:{ Exception -> 0x00e4 }
        L_0x0044:
            if (r5 >= r9) goto L_0x0047
            r3 = r0
        L_0x0047:
            if (r5 <= r9) goto L_0x0056
        L_0x0049:
            if (r2 == 0) goto L_0x0007
            java.io.DataInputStream r1 = f234a     // Catch:{ Exception -> 0x0054 }
            r1.close()     // Catch:{ Exception -> 0x0054 }
            r1 = 0
            f234a = r1     // Catch:{ Exception -> 0x0054 }
            goto L_0x0007
        L_0x0054:
            r1 = move-exception
            goto L_0x0007
        L_0x0056:
            r6 = 32767(0x7fff, float:4.5916E-41)
            if (r5 == r6) goto L_0x0049
            if (r5 != r9) goto L_0x00d9
            r3 = -1
            if (r8 != r3) goto L_0x008d
            java.lang.System.gc()     // Catch:{ Exception -> 0x00e4 }
            int r3 = f188E     // Catch:{ Exception -> 0x00e4 }
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00e4 }
            f338f = r3     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r3 = f234a     // Catch:{ Exception -> 0x00e4 }
            byte[] r5 = f338f     // Catch:{ Exception -> 0x00e4 }
            r6 = 0
            byte[] r7 = f338f     // Catch:{ Exception -> 0x00e4 }
            int r7 = r7.length     // Catch:{ Exception -> 0x00e4 }
            r3.read(r5, r6, r7)     // Catch:{ Exception -> 0x00e4 }
            if (r4 == 0) goto L_0x008b
            java.io.DataInputStream r3 = f234a     // Catch:{ Exception -> 0x00e4 }
            r3.readByte()     // Catch:{ Exception -> 0x00e4 }
            int r3 = r4 + -1
            byte[] r3 = new byte[r3]     // Catch:{ Exception -> 0x00e4 }
            f293b = r3     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r3 = f234a     // Catch:{ Exception -> 0x00e4 }
            byte[] r4 = f293b     // Catch:{ Exception -> 0x00e4 }
            r5 = 0
            byte[] r6 = f293b     // Catch:{ Exception -> 0x00e4 }
            int r6 = r6.length     // Catch:{ Exception -> 0x00e4 }
            r3.read(r4, r5, r6)     // Catch:{ Exception -> 0x00e4 }
        L_0x008b:
            r0 = r1
            goto L_0x0049
        L_0x008d:
            f220U = r8     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r3 = f234a     // Catch:{ Exception -> 0x00e4 }
            byte[] r5 = f346g     // Catch:{ Exception -> 0x00e4 }
            r6 = 0
            int r7 = f188E     // Catch:{ Exception -> 0x00e4 }
            r3.read(r5, r6, r7)     // Catch:{ Exception -> 0x00e4 }
            if (r4 == 0) goto L_0x00d0
            short[][] r3 = f314c     // Catch:{ Exception -> 0x00e4 }
            r3 = r3[r8]     // Catch:{ Exception -> 0x00e4 }
            if (r3 != 0) goto L_0x00d0
            java.io.DataInputStream r3 = f234a     // Catch:{ Exception -> 0x00e4 }
            byte r4 = r3.readByte()     // Catch:{ Exception -> 0x00e4 }
            short[] r3 = f296b     // Catch:{ Exception -> 0x00e4 }
            int r5 = r8 * 11
            int r5 = r5 + 2
            short r6 = (short) r4     // Catch:{ Exception -> 0x00e4 }
            r3[r5] = r6     // Catch:{ Exception -> 0x00e4 }
            java.lang.System.gc()     // Catch:{ Exception -> 0x00e4 }
            short[][] r3 = f314c     // Catch:{ Exception -> 0x00e4 }
            int r5 = r4 * 7
            short[] r5 = new short[r5]     // Catch:{ Exception -> 0x00e4 }
            r3[r8] = r5     // Catch:{ Exception -> 0x00e4 }
            r3 = r0
        L_0x00bc:
            int r5 = r4 * 7
            if (r3 >= r5) goto L_0x00d6
            short[][] r5 = f314c     // Catch:{ Exception -> 0x00e4 }
            r5 = r5[r8]     // Catch:{ Exception -> 0x00e4 }
            java.io.DataInputStream r6 = f234a     // Catch:{ Exception -> 0x00e4 }
            byte r6 = r6.readByte()     // Catch:{ Exception -> 0x00e4 }
            short r6 = (short) r6     // Catch:{ Exception -> 0x00e4 }
            r5[r3] = r6     // Catch:{ Exception -> 0x00e4 }
            int r3 = r3 + 1
            goto L_0x00bc
        L_0x00d0:
            java.io.DataInputStream r3 = f234a     // Catch:{ Exception -> 0x00e4 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x00e4 }
            r3.skip(r4)     // Catch:{ Exception -> 0x00e4 }
        L_0x00d6:
            r0 = r1
            goto L_0x0049
        L_0x00d9:
            java.io.DataInputStream r5 = f234a     // Catch:{ Exception -> 0x00e4 }
            int r6 = f188E     // Catch:{ Exception -> 0x00e4 }
            int r4 = r4 + r6
            long r6 = (long) r4     // Catch:{ Exception -> 0x00e4 }
            r5.skip(r6)     // Catch:{ Exception -> 0x00e4 }
            goto L_0x0015
        L_0x00e4:
            r1 = move-exception
        L_0x00e5:
            r1.printStackTrace()     // Catch:{ all -> 0x0106 }
            if (r2 == 0) goto L_0x0007
            java.io.DataInputStream r1 = f234a     // Catch:{ Exception -> 0x00f4 }
            r1.close()     // Catch:{ Exception -> 0x00f4 }
            r1 = 0
            f234a = r1     // Catch:{ Exception -> 0x00f4 }
            goto L_0x0007
        L_0x00f4:
            r1 = move-exception
            goto L_0x0007
        L_0x00f7:
            r1 = move-exception
            r2 = r0
        L_0x00f9:
            if (r2 == 0) goto L_0x0103
            java.io.DataInputStream r0 = f234a     // Catch:{ Exception -> 0x0104 }
            r0.close()     // Catch:{ Exception -> 0x0104 }
            r0 = 0
            f234a = r0     // Catch:{ Exception -> 0x0104 }
        L_0x0103:
            throw r1
        L_0x0104:
            r0 = move-exception
            goto L_0x0103
        L_0x0106:
            r0 = move-exception
            r1 = r0
            goto L_0x00f9
        L_0x0109:
            r1 = move-exception
            r2 = r0
            goto L_0x00e5
        L_0x010c:
            r3 = r1
            r2 = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m333b(int, int):boolean");
    }

    /* renamed from: b */
    public static final boolean m334b(int i, int i2, int i3) {
        if (i3 == -1 || m367d(i3, i2)) {
            return m367d(i, i2);
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m335b(int i, int[] iArr) {
        int[][] iArr2 = f253a[i];
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            if (i == 2 && iArr2[i2][4] == iArr[4]) {
                return true;
            }
            if (iArr2[i2][4] == -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final int[] m336b(int i, int i2) {
        switch (i) {
            case 0:
                return f359i[i2];
            case 1:
                return f379n[i2];
            case 2:
                return f371l[i2];
            case 3:
                return f423y[i2];
            case 4:
                return f341f[i2];
            case 5:
                return f325d[i2];
            case 6:
                return f391q[i2];
            case 7:
                return f419x[i2];
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static final int m337c() {
        int i = f414w[40];
        if ((f414w[39] & (1 << i)) == 0) {
            return -1;
        }
        return (short) ((f414w[i + 31] & -65536) >> 16);
    }

    /* renamed from: c */
    public static final int m338c(int i) {
        int i2 = 2500;
        int i3 = f391q[i][11];
        if ((f249a[i3][13] & 2048) == 0) {
            return 0;
        }
        int i4 = f249a[i3][12] / 5;
        if (i4 <= 2500) {
            i2 = i4;
        }
        int i5 = i2 / 20;
        int e = (C0000HG.m58e(i5) >> 2) + C0000HG.m58e(2) + (C0000HG.m58e(i5) >> 2) + C0000HG.m58e(2) + (C0000HG.m58e(i5) >> 2) + C0000HG.m58e(2);
        int i6 = (i5 >> 2) + 2;
        C0001a.f98J++;
        return i6 + e;
    }

    /* renamed from: c */
    public static final int m339c(int i, int i2) {
        return (((i << 1) + 200) + i2) >> 2;
    }

    /* renamed from: c */
    public static final int m340c(int i, int i2, int i3) {
        int i4 = i + i2 + (i3 << 1);
        return ((i4 * 100) + (i4 * 0)) / 200;
    }

    /* renamed from: c */
    public static final int m341c(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        int q = m463q(iArr);
        if (q != -1) {
            return f302b[q].length;
        }
        return -1;
    }

    /* renamed from: c */
    public static final int m342c(int[] iArr, int i) {
        if (m463q(iArr) == -1) {
            return -1;
        }
        int h = m415h(iArr);
        if (i < 0 && i >= h) {
            return -1;
        }
        int d = m364d(iArr, i);
        if (d < 0 || d >= m379e(iArr, i)) {
            return -1;
        }
        return d;
    }

    /* renamed from: c */
    public static final void m343c() {
        f235a = null;
    }

    /* JADX WARNING: type inference failed for: r7v17, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v97, types: [int] */
    /* JADX WARNING: type inference failed for: r3v63 */
    /* JADX WARNING: type inference failed for: r2v129, types: [int] */
    /* JADX WARNING: type inference failed for: r4v53 */
    /* JADX WARNING: type inference failed for: r2v142, types: [int] */
    /* JADX WARNING: type inference failed for: r4v56 */
    /* JADX WARNING: type inference failed for: r2v145, types: [int] */
    /* JADX WARNING: type inference failed for: r3v79 */
    /* JADX WARNING: type inference failed for: r2v150, types: [int] */
    /* JADX WARNING: type inference failed for: r3v80 */
    /* JADX WARNING: type inference failed for: r2v161, types: [int] */
    /* JADX WARNING: type inference failed for: r4v70 */
    /* JADX WARNING: type inference failed for: r2v168, types: [int] */
    /* JADX WARNING: type inference failed for: r3v85 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0291 A[SYNTHETIC, Splitter:B:88:0x0291] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02de A[SYNTHETIC, Splitter:B:99:0x02de] */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m344c(int r20) {
        /*
            byte[][][][] r2 = f302b
            r2 = r2[r20]
            if (r2 == 0) goto L_0x0007
        L_0x0006:
            return
        L_0x0007:
            short[] r2 = f323d
            int r3 = r20 * 2
            int r3 = r3 + 0
            short r4 = r2[r3]
            java.lang.System.gc()
            r3 = 0
            java.lang.String r2 = "/"
            r5 = 10
            if (r4 >= r5) goto L_0x002c
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.StringBuffer r2 = r5.append(r2)
            java.lang.String r5 = "0"
            java.lang.StringBuffer r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x002c:
            r5 = 100
            if (r4 >= r5) goto L_0x0043
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.StringBuffer r2 = r5.append(r2)
            java.lang.String r5 = "0"
            java.lang.StringBuffer r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x0043:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.StringBuffer r2 = r5.append(r2)
            java.lang.String r5 = ""
            java.lang.StringBuffer r2 = r2.append(r5)
            java.lang.StringBuffer r2 = r2.append(r4)
            java.lang.String r4 = ".mdl"
            java.lang.StringBuffer r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0590, all -> 0x0588 }
            HG r4 = p000.C0000HG.f10a     // Catch:{ Exception -> 0x0590, all -> 0x0588 }
            java.lang.Class r4 = r4.getClass()     // Catch:{ Exception -> 0x0590, all -> 0x0588 }
            java.io.InputStream r2 = r4.getResourceAsStream(r2)     // Catch:{ Exception -> 0x0590, all -> 0x0588 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0590, all -> 0x0588 }
            r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte r2 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte r3 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte r4 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = 4
            if (r2 != r5) goto L_0x0088
            r2 = 17
            if (r3 != r2) goto L_0x0088
            r2 = 7
            if (r4 == r2) goto L_0x0099
        L_0x0088:
            byte[][][][] r3 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            byte[][][] r2 = (byte[][][]) r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r20] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r6 == 0) goto L_0x0006
            r6.close()     // Catch:{ Exception -> 0x0096 }
            goto L_0x0006
        L_0x0096:
            r2 = move-exception
            goto L_0x0006
        L_0x0099:
            byte r4 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r3 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 17
            int[] r2 = new int[]{r4, r2}     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.Class<byte[]> r5 = byte[].class
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r5, r2)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = (byte[][][]) r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r20] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r3 = r2
        L_0x00b1:
            if (r3 >= r4) goto L_0x00e4
            r2 = 0
        L_0x00b4:
            r5 = 17
            if (r2 >= r5) goto L_0x00e0
            byte r5 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r7 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r5 = r5 * 5
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7[r2] = r5     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r5 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r2]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = 0
            byte[][][][] r8 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r8.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.read(r5, r7, r8)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2 + 1
            goto L_0x00b4
        L_0x00e0:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x00b1
        L_0x00e4:
            byte[][][][] r2 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r3 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r3.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r3 = new byte[r3][][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r5 = r2
        L_0x00f1:
            byte[][][][] r2 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r5 >= r2) goto L_0x013e
            byte r7 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r2 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 68
            int[] r2 = new int[]{r7, r2}     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.Class r4 = java.lang.Byte.TYPE     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r4, r2)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r2 = (byte[][]) r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r5] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r4 = r2
        L_0x0112:
            if (r4 >= r7) goto L_0x013a
            r2 = 0
            r3 = r2
        L_0x0116:
            r2 = 17
            if (r3 >= r2) goto L_0x0136
            r2 = 0
        L_0x011b:
            r8 = 4
            if (r2 >= r8) goto L_0x0132
            byte[][][][] r8 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r5]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r3 * 4
            int r9 = r9 + r2
            byte r10 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8[r9] = r10     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2 + 1
            goto L_0x011b
        L_0x0132:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x0116
        L_0x0136:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x0112
        L_0x013a:
            int r2 = r5 + 1
            r5 = r2
            goto L_0x00f1
        L_0x013e:
            byte r5 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][] r2 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r5 * 6
            short[] r3 = new short[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r3 = r2
        L_0x014c:
            if (r3 >= r5) goto L_0x0171
            r2 = 0
        L_0x014f:
            r4 = 6
            if (r2 >= r4) goto L_0x016d
            short[][] r4 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r7 = r3 * 6
            int r7 = r7 + r2
            short r8 = r6.readShort()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4[r7] = r8     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][] r4 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r7 = r3 * 6
            int r7 = r7 + 1
            r8 = -1
            r4[r7] = r8     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2 + 1
            goto L_0x014f
        L_0x016d:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x014c
        L_0x0171:
            int r3 = r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = f300b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r4 = new byte[r3][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
        L_0x017c:
            if (r2 >= r3) goto L_0x019e
            byte[][][] r4 = f300b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte r7 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4[r2] = r7     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r4 = f300b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r2]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = 0
            byte[][][] r8 = f300b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r2]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r8.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.read(r4, r7, r8)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2 + 1
            goto L_0x017c
        L_0x019e:
            byte r7 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[][][][] r2 = f256a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[][][] r3 = new int[r7][][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r4 = r2
        L_0x01aa:
            if (r4 >= r7) goto L_0x01e6
            byte r8 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte r9 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[][][][] r2 = f256a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[] r2 = new int[]{r8, r9}     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r10, r2)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[][] r2 = (int[][]) r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r4] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r3 = r2
        L_0x01c8:
            if (r3 >= r8) goto L_0x01e2
            r2 = 0
        L_0x01cb:
            if (r2 >= r9) goto L_0x01de
            int[][][][] r10 = f256a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r10 = r10[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r10 = r10[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r10 = r10[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r11 = r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r10[r2] = r11     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2 + 1
            goto L_0x01cb
        L_0x01de:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x01c8
        L_0x01e2:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x01aa
        L_0x01e6:
            byte r3 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r2 = f312c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[] r4 = new byte[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
        L_0x01f1:
            if (r2 >= r3) goto L_0x0200
            byte[][] r4 = f312c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte r7 = r6.readByte()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4[r2] = r7     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2 + 1
            goto L_0x01f1
        L_0x0200:
            javax.microedition.lcdui.Image[][][] r2 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[][] r3 = new javax.microedition.lcdui.Image[r5][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = f252a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r3 = new byte[r5][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r3 = new byte[r5][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            m416h()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r4 = r2
        L_0x021a:
            if (r4 >= r5) goto L_0x02ff
            r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r7 = r6.readInt()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r0 = r20
            boolean r8 = m382e(r0, r4)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r8 == 0) goto L_0x0251
            long r2 = (long) r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.skip(r2)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[] r3 = new byte[r7]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r4] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = 0
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r7 = r7.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.read(r2, r3, r7)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x024d:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x021a
        L_0x0251:
            short[][] r8 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r4 * 6
            int r9 = r9 + 1
            short r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = -1
            if (r8 != r9) goto L_0x02ea
            if (r3 != 0) goto L_0x02e2
            short[][] r2 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r4 * 6
            int r3 = r3 + 0
            short r2 = r2[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            boolean r2 = m454n(r2)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r2 == 0) goto L_0x0274
            byte[] r2 = f293b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r2 == 0) goto L_0x0299
        L_0x0274:
            byte[][][][] r3 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            byte[][][] r2 = (byte[][][]) r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r20] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            java.lang.String r3 = ""
            r2.<init>(r3)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            throw r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x0283:
            r2 = move-exception
            r3 = r6
        L_0x0285:
            r2.printStackTrace()     // Catch:{ all -> 0x058c }
            byte[][][][] r4 = f302b     // Catch:{ all -> 0x058c }
            r2 = 0
            byte[][][] r2 = (byte[][][]) r2     // Catch:{ all -> 0x058c }
            r4[r20] = r2     // Catch:{ all -> 0x058c }
            if (r3 == 0) goto L_0x0006
            r3.close()     // Catch:{ Exception -> 0x0296 }
            goto L_0x0006
        L_0x0296:
            r2 = move-exception
            goto L_0x0006
        L_0x0299:
            byte[] r2 = f338f     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x029c:
            byte[][][] r9 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = r9[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9[r4] = r7     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = 0
            byte[][][] r10 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r10 = r10[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r10 = r10[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r10 = r10.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.read(r7, r9, r10)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = -1
            if (r8 != r7) goto L_0x02ef
            javax.microedition.lcdui.Image[][][] r7 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = 1
            javax.microedition.lcdui.Image[] r8 = new javax.microedition.lcdui.Image[r8]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7[r4] = r8     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[][][] r7 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = 0
            r9 = 0
            javax.microedition.lcdui.Image r2 = javax.microedition.lcdui.Image.createImage(r2, r9, r3)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7[r8] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r2 = f252a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x02d6:
            java.lang.System.gc()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            goto L_0x024d
        L_0x02db:
            r2 = move-exception
        L_0x02dc:
            if (r6 == 0) goto L_0x02e1
            r6.close()     // Catch:{ Exception -> 0x0585 }
        L_0x02e1:
            throw r2
        L_0x02e2:
            byte[] r2 = new byte[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = 0
            int r10 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.read(r2, r9, r10)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            goto L_0x029c
        L_0x02ea:
            long r10 = (long) r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r6.skip(r10)     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            goto L_0x029c
        L_0x02ef:
            int[][][][] r2 = f256a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r8]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[][][] r3 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[] r2 = new javax.microedition.lcdui.Image[r2]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r4] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            goto L_0x02d6
        L_0x02ff:
            m206N()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r3 = r2
        L_0x0304:
            if (r3 >= r5) goto L_0x03c8
            javax.microedition.lcdui.Image[][][] r2 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = 0
            r2 = r2[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r2 == 0) goto L_0x03c3
            javax.microedition.lcdui.Image[][][] r2 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = 0
            r2 = r2[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r4 = r2.getWidth()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[][][] r2 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = 0
            r2 = r2[r7]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r7 = r2.getHeight()     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
        L_0x032c:
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r8.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r2 >= r8) goto L_0x03c3
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 1
            byte r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r8 < 0) goto L_0x034d
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 1
            byte r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r8 < r4) goto L_0x0358
        L_0x034d:
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 1
            r10 = 0
            r8[r9] = r10     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x0358:
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 2
            byte r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r8 < 0) goto L_0x0370
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 2
            byte r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r8 < r7) goto L_0x037b
        L_0x0370:
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 2
            r10 = 0
            r8[r9] = r10     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x037b:
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 1
            byte r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r9 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = r9[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = r9[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r10 = r2 + 3
            byte r9 = r9[r10]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r8 + r9
            if (r8 <= r4) goto L_0x039d
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 3
            r10 = 1
            r8[r9] = r10     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x039d:
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 2
            byte r8 = r8[r9]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r9 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = r9[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r9 = r9[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r10 = r2 + 4
            byte r9 = r9[r10]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r8 + r9
            if (r8 <= r7) goto L_0x03bf
            byte[][][] r8 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r8 = r8[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r9 = r2 + 4
            r10 = 1
            r8[r9] = r10     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x03bf:
            int r2 = r2 + 7
            goto L_0x032c
        L_0x03c3:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x0304
        L_0x03c8:
            short[][][][][] r2 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r3 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r3.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][][] r3 = new short[r3][][][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r20] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r15 = r2
        L_0x03d5:
            byte[][][][] r2 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r15 >= r2) goto L_0x050c
            short[][][][][] r2 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r3 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r3.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][] r3 = new short[r3][][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r15] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r14 = r2
        L_0x03ed:
            byte[][][][] r2 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r14 >= r2) goto L_0x0507
            short[][][][][] r2 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = 17
            short[][] r3 = new short[r3][]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r14] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r13 = r2
        L_0x0404:
            r2 = 17
            if (r13 >= r2) goto L_0x0502
            byte[][][][] r2 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r13]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r2.length     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r16 = r2 / 5
            short[][][][][] r2 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = r2[r14]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r3 = r16 * 4
            short[] r3 = new short[r3]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2[r13] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r2 = 0
            r12 = r2
        L_0x0423:
            r0 = r16
            if (r12 >= r0) goto L_0x04fd
            r5 = 32767(0x7fff, float:4.5916E-41)
            r4 = -32768(0xffffffffffff8000, float:NaN)
            r3 = 32767(0x7fff, float:4.5916E-41)
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r7 = 0
            r11 = r7
        L_0x0431:
            r7 = 4
            if (r11 >= r7) goto L_0x04b8
            byte[][][][] r7 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r14]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r13 * 4
            int r8 = r8 + r11
            byte r17 = r7[r8]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r7 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r13]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r12 * 5
            int r8 = r8 + r11
            int r8 = r8 + 1
            byte r8 = r7[r8]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = -1
            r0 = r17
            if (r0 != r7) goto L_0x0459
        L_0x0455:
            int r7 = r11 + 1
            r11 = r7
            goto L_0x0431
        L_0x0459:
            r7 = 0
            if (r8 >= 0) goto L_0x0593
            int r7 = r8 * -1
            int r8 = r7 + -1
            r7 = 1
            r9 = r7
            r10 = r8
        L_0x0463:
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r17]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r10 * 7
            int r8 = r8 + 5
            byte r7 = r7[r8]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short r8 = (short) r7     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r17]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r18 = r10 * 7
            int r18 = r18 + 6
            byte r7 = r7[r18]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short r7 = (short) r7     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r18 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r18 = r18[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r18 = r18[r17]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r19 = r10 * 7
            int r19 = r19 + 3
            byte r18 = r18[r19]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r0 = r18
            short r0 = (short) r0     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r18 = r0
            byte[][][] r19 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r19 = r19[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r17 = r19[r17]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r10 = r10 * 7
            int r10 = r10 + 4
            byte r10 = r17[r10]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short r10 = (short) r10     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r9 == 0) goto L_0x04a3
            int r8 = r8 * -1
            short r8 = (short) r8     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r8 - r18
            short r8 = (short) r8     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x04a3:
            if (r5 <= r8) goto L_0x04a6
            r5 = r8
        L_0x04a6:
            int r9 = r8 + r18
            if (r4 >= r9) goto L_0x04ad
            int r4 = r8 + r18
            short r4 = (short) r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
        L_0x04ad:
            if (r3 <= r7) goto L_0x04b0
            r3 = r7
        L_0x04b0:
            int r8 = r7 + r10
            if (r2 >= r8) goto L_0x0455
            int r2 = r7 + r10
            short r2 = (short) r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            goto L_0x0455
        L_0x04b8:
            short[][][][][] r7 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r14]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r7 = r7[r13]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r8 = r12 * 4
            int r8 = r8 + 0
            r7[r8] = r5     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][][][] r5 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r14]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r5 = r5[r13]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r7 = r12 * 4
            int r7 = r7 + 2
            r5[r7] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][][][] r4 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r14]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r13]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r5 = r12 * 4
            int r5 = r5 + 1
            r4[r5] = r3     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][][][] r3 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r15]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r14]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3 = r3[r13]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r4 = r12 * 4
            int r4 = r4 + 3
            r3[r4] = r2     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r2 = r12 + 1
            r12 = r2
            goto L_0x0423
        L_0x04fd:
            int r2 = r13 + 1
            r13 = r2
            goto L_0x0404
        L_0x0502:
            int r2 = r14 + 1
            r14 = r2
            goto L_0x03ed
        L_0x0507:
            int r2 = r15 + 1
            r15 = r2
            goto L_0x03d5
        L_0x050c:
            r2 = 0
        L_0x050d:
            r3 = 8
            if (r2 >= r3) goto L_0x057b
            r0 = r20
            if (r2 != r0) goto L_0x0518
        L_0x0515:
            int r2 = r2 + 1
            goto L_0x050d
        L_0x0518:
            short[] r3 = f323d     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r4 = r2 * 2
            int r4 = r4 + 0
            short r3 = r3[r4]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[] r4 = f323d     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int r5 = r20 * 2
            int r5 = r5 + 0
            short r4 = r4[r5]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            if (r3 != r4) goto L_0x0515
            byte[][][][] r3 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r4 = f302b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[][][] r3 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            javax.microedition.lcdui.Image[][][] r4 = f254a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r3 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r4 = f315c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r3 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][][] r4 = f255a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r3 = f252a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r4 = f252a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][] r3 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][] r4 = f251a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[][][][] r3 = f256a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            int[][][][] r4 = f256a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r3 = f312c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][] r4 = f312c     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r3 = f300b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            byte[][][] r4 = f300b     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][][][] r3 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            short[][][][][] r4 = f257a     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r4 = r4[r20]     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            r3[r2] = r4     // Catch:{ Exception -> 0x0283, all -> 0x02db }
            goto L_0x0515
        L_0x057b:
            if (r6 == 0) goto L_0x0006
            r6.close()     // Catch:{ Exception -> 0x0582 }
            goto L_0x0006
        L_0x0582:
            r2 = move-exception
            goto L_0x0006
        L_0x0585:
            r3 = move-exception
            goto L_0x02e1
        L_0x0588:
            r2 = move-exception
            r6 = r3
            goto L_0x02dc
        L_0x058c:
            r2 = move-exception
            r6 = r3
            goto L_0x02dc
        L_0x0590:
            r2 = move-exception
            goto L_0x0285
        L_0x0593:
            r9 = r7
            r10 = r8
            goto L_0x0463
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m344c(int):void");
    }

    /* renamed from: c */
    public static final void m345c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        int i3 = f269ai;
        int i4 = f287b;
        int[] iArr = null;
        f269ai = -1;
        f287b = -1;
        f222V = -1;
        f380o = -1;
        int i5 = f414w[30];
        int i6 = -1;
        while (true) {
            int i7 = i6;
            if (i7 >= 2) {
                break;
            }
            int i8 = -1;
            while (true) {
                int i9 = i8;
                if (i9 >= 2) {
                    break;
                }
                int i10 = ((i5 != 0 || i9 >= 0) && (i5 != 2 || i9 <= 0) && ((i5 != 3 || i7 >= 0) && (i5 != 1 || i7 <= 0))) ? (((i5 == 0 || i5 == 2) && i9 == 0) || ((i5 == 3 || i5 == 1) && i7 == 0)) ? 1 : 0 : 2;
                if (i10 >= f380o) {
                    int[] a = m221a(i + i7, i2 + i9);
                    if (a != null) {
                        if (i10 > f380o) {
                            z = false;
                            z2 = false;
                        }
                        if (!z || i10 != f380o) {
                            f380o = i10;
                            z = true;
                            iArr = a;
                        } else {
                            z2 = true;
                        }
                    }
                }
                i8 = i9 + 1;
            }
            i6 = i7 + 1;
        }
        if (z2) {
            f269ai = -1;
            f287b = -1;
            switch (f414w[30]) {
                case 0:
                    i2--;
                    break;
                case 1:
                    i++;
                    break;
                case 2:
                    i2++;
                    break;
                case 3:
                    i--;
                    break;
            }
            if (i < 0 || i >= C0001a.f154r || i2 < 0 || i2 >= C0001a.f94F) {
                f269ai = -1;
                f287b = -1;
                return;
            }
            for (int i11 = C0001a.f109a[i2][i]; i11 != -1; i11 = (short) (C0001a.f124d[i11][1] & 65535)) {
                iArr = m221a(i, i2);
            }
        }
        if (!(i3 == f269ai && i4 == f287b) && f269ai >= 0) {
            f356i = "";
            if ((C0001a.f124d[f269ai][3] & 4096) == 0 && (C0001a.f124d[f269ai][3] & 524288) == 0) {
                if ((C0001a.f124d[f269ai][3] & 256) != 0 && C0001a.f124d[f269ai][6] > 1) {
                    f356i = new StringBuffer().append(C0001a.f124d[f269ai][6]).append("x ").toString();
                }
                f356i = new StringBuffer().append(f356i).append(C0000HG.m0a(iArr[0])).toString();
            }
            m397f(6, -2, 0);
        }
    }

    /* renamed from: c */
    public static final void m346c(int i, int i2, int i3) {
        f204M = i;
        f214R = i2;
        f267ag = i3;
    }

    /* renamed from: c */
    public static final void m347c(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        f239a.setColor(0);
        while (i < i3) {
            for (int i7 = i2; i7 < i4; i7++) {
                int i8 = (i % f226X) * C0001a.f136i;
                int i9 = (i7 % f396s) * C0001a.f150p;
                f239a.fillRect(i8, i9, C0001a.f136i, C0001a.f150p);
                if (i >= 0 && i < C0001a.f115b[0].length && i7 >= 0 && i7 < C0001a.f115b.length) {
                    short s = (short) (C0001a.f102N & 65535);
                    int i10 = 0;
                    while (true) {
                        int i11 = i10;
                        if (i11 < (f414w[11] == 0 ? 2 : 1)) {
                            byte b = (byte) ((C0001a.f115b[i7][i] >> (i11 << 4)) & 255);
                            byte b2 = (byte) ((C0001a.f115b[i7][i] >> ((i11 << 4) + 8)) & 15);
                            if (b >= 0) {
                                short s2 = f296b[(s * 11) + 5];
                                int i12 = (b % s2) * C0001a.f136i;
                                int i13 = ((b / s2) % f296b[(s * 11) + 6]) * C0001a.f150p;
                                int i14 = f296b[(s * 11) + 4] == 5 ? C0001a.f111b : 0;
                                DirectGraphics directGraphics = f239a instanceof DirectGraphics ? (DirectGraphics) f239a : DirectUtils.getDirectGraphics(f239a);
                                int clipX = f239a.getClipX();
                                int clipY = f239a.getClipY();
                                int clipWidth = f239a.getClipWidth();
                                int clipHeight = f239a.getClipHeight();
                                int i15 = 0;
                                int i16 = 0;
                                int i17 = 0;
                                int width = f250a[s][i14].getWidth();
                                int height = f250a[s][i14].getHeight();
                                int i18 = C0001a.f136i;
                                int i19 = C0001a.f150p;
                                switch (b2) {
                                    case 0:
                                        i16 = -i12;
                                        i17 = -i13;
                                        i5 = i19;
                                        i6 = i18;
                                        break;
                                    case 1:
                                        i16 = -i12;
                                        i17 = -((height - i13) - i19);
                                        i15 = 8372;
                                        i5 = i19;
                                        i6 = i18;
                                        break;
                                    case 2:
                                        i16 = -((width - i12) - i18);
                                        i17 = -i13;
                                        i15 = 8192;
                                        i5 = i19;
                                        i6 = i18;
                                        break;
                                    case 3:
                                        i16 = -((width - i12) - i18);
                                        i17 = -((height - i13) - i19);
                                        i15 = 180;
                                        i5 = i19;
                                        i6 = i18;
                                        break;
                                    case 4:
                                        i16 = -i13;
                                        i17 = -i12;
                                        i15 = 16474;
                                        i5 = i18;
                                        i6 = i19;
                                        break;
                                    case 5:
                                        i16 = -((height - i13) - i19);
                                        i17 = -i12;
                                        i15 = 270;
                                        i5 = i18;
                                        i6 = i19;
                                        break;
                                    case 6:
                                        i16 = -i13;
                                        i17 = -((width - i12) - i18);
                                        i15 = 90;
                                        i5 = i18;
                                        i6 = i19;
                                        break;
                                    case 7:
                                        i16 = -((height - i13) - i19);
                                        i17 = -((width - i12) - i18);
                                        i15 = 16654;
                                        i5 = i18;
                                        i6 = i19;
                                        break;
                                    default:
                                        i5 = i19;
                                        i6 = i18;
                                        break;
                                }
                                f239a.clipRect(i8, i9, i6, i5);
                                directGraphics.drawImage(f250a[s][i14], i8 + i16, i9 + i17, 20, i15);
                                f239a.setClip(clipX, clipY, clipWidth, clipHeight);
                            }
                            s = (short) ((C0001a.f102N & -65536) >> 16);
                            i10 = i11 + 1;
                        }
                    }
                }
            }
            i++;
        }
    }

    /* renamed from: c */
    public static final void m348c(int i, int i2, int i3, int i4, int i5, int i6) {
        f340f[(i * 11) + 0] = (short) i2;
        f340f[(i * 11) + 1] = (short) i3;
        f340f[(i * 11) + 2] = (short) i4;
        f340f[(i * 11) + 3] = (short) i5;
        f340f[(i * 11) + 4] = (short) i6;
        m349c(i, true);
    }

    /* renamed from: c */
    public static final void m349c(int i, boolean z) {
        if (z) {
            f340f[(i * 11) + 5] = 1;
        } else {
            f340f[(i * 11) + 5] = 0;
        }
    }

    /* renamed from: c */
    public static final void m350c(int i, int[] iArr) {
        if (f375m[i] != null) {
            C0001a.m155c(f375m[i], f322d);
        } else {
            f322d[0] = f411v[i][9];
            f322d[1] = f411v[i][10];
        }
        f294b[0] = f322d[0] - f411v[i][4];
        f294b[1] = f322d[1] - f411v[i][5];
        int r = m466r(f294b);
        iArr[0] = (f294b[0] * 2048) / (r + 1);
        iArr[1] = (f294b[1] * 2048) / (r + 1);
    }

    /* renamed from: c */
    public static final void m351c(Graphics graphics) {
        m325b(graphics, 0);
        if (f352h || f393r) {
            m426i(graphics);
        } else if (f265ae == -1) {
            m434j(graphics);
        }
        m439k(graphics);
        graphics.setClip(0, 0, f260aC, f368l);
        m249a(f296b[1606] >> 1, f368l, 136, 2, graphics);
        m249a(f260aC - (f296b[1606] >> 1), f368l, 136, 1, graphics);
    }

    /* renamed from: c */
    public static final void m352c(int[] iArr) {
        if (iArr[6] >= 0) {
            int i = iArr[4] + (iArr[6] >> 1);
            int i2 = iArr[5];
            int i3 = iArr[6];
            iArr[6] = iArr[6] - 2048;
            if (iArr[6] < 0) {
                m243a(i, i2, i3, iArr[4] - i, iArr[5] - i2, iArr[6] - i3);
            }
        }
    }

    /* renamed from: c */
    public static final void m353c(int[] iArr, int i) {
        iArr[7] = iArr[7] & -65536;
        iArr[7] = iArr[7] | (((short) i) & 65535);
    }

    /* renamed from: c */
    public static final void m354c(int[] iArr, int i, int i2) {
        if (i >= 0 && i < 8) {
            int i3 = i >> 2;
            int i4 = i & 3;
            int i5 = i3 + 9;
            iArr[i5] = iArr[i5] & ((255 << (i4 << 3)) ^ -1);
            int i6 = i3 + 9;
            iArr[i6] = ((i2 & 255) << (i4 << 3)) | iArr[i6];
        }
    }

    /* renamed from: c */
    public static final void m355c(int[] iArr, Graphics graphics) {
        switch ((short) (iArr[14] & 65535)) {
            case 0:
                m248a(iArr[4], iArr[5], iArr[6], iArr[7], iArr[8], graphics);
                return;
            case 1:
                m320b(iArr[4], iArr[5], iArr[6], iArr[7], iArr[8], graphics);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public static final void m356c(int[] iArr, boolean z) {
        int[] a = m230a(iArr);
        if ((iArr[3] & 128) != 0) {
            if (z) {
                int[] iArr2 = f414w;
                iArr2[27] = iArr2[27] + a[11];
                int[] iArr3 = f414w;
                iArr3[28] = iArr3[28] + a[12];
                int[] iArr4 = f414w;
                iArr4[29] = iArr4[29] + a[13];
            } else {
                int[] iArr5 = f414w;
                iArr5[27] = iArr5[27] - a[11];
                int[] iArr6 = f414w;
                iArr6[28] = iArr6[28] - a[12];
                int[] iArr7 = f414w;
                iArr7[29] = iArr7[29] - a[13];
            }
        }
        for (int i = 0; i < f353h.length; i++) {
            f353h[i] = -1;
        }
        if (!((iArr[3] & 64) == 0 && (iArr[3] & 128) == 0 && (iArr[3] & 8192) == 0)) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (iArr[i2 + 6] != -1) {
                    f353h[i2] = (((short) f349g[(short) ((iArr[i2 + 6] & -65536) >> 16)][3]) & 65535) | ((((short) (iArr[i2 + 6] & 65535)) << 16) & -65536);
                }
            }
            for (int i3 = 0; i3 < 5; i3++) {
                if (a[i3 + 5] != -1) {
                    f353h[i3 + 2] = a[i3 + 5];
                }
            }
        }
        for (int i4 = 0; i4 < f353h.length; i4++) {
            if (f353h[i4] != -1) {
                short s = (short) (f353h[i4] & 65535);
                int i5 = (short) ((f353h[i4] & -65536) >> 16);
                if (!z) {
                    i5 *= -1;
                }
                m253a((int) s, i5, true, true, f414w);
            }
        }
    }

    /* renamed from: c */
    public static final boolean m357c() {
        int i = 100 - ((short) (f414w[25] & 65535));
        return i >= 0 && C0000HG.m58e(100) <= i;
    }

    /* renamed from: c */
    public static final boolean m358c(int i) {
        if (((short) (f391q[i][12] & 65535)) > 0) {
            return false;
        }
        m393f(f391q[i], 16);
        m274a(f391q[i], false);
        if ((f391q[i][13] & 2) == 0) {
            int[] iArr = f391q[i];
            iArr[13] = iArr[13] | 2;
            int[] iArr2 = f391q[i];
            iArr2[3] = iArr2[3] | 32768;
            m330b(f391q[i], true);
            if (f414w[11] >= 0) {
                int[] iArr3 = f398s;
                int i2 = f414w[11];
                iArr3[i2] = iArr3[i2] | (1 << i);
            }
            m220a(i);
            C0000HG.m81m(f249a[f391q[i][11]][28]);
            if (!m433j(i)) {
                f326e--;
                if (f326e <= 0) {
                    C0000HG.m76k();
                    C0000HG.m81m(f264ad);
                    m285a(15, 0, 0, 0, 0, false);
                }
            }
            m285a(4, i, 0, 0, 0, false);
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r4v65, types: [int] */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0333 A[SYNTHETIC, Splitter:B:108:0x0333] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0112 A[SYNTHETIC, Splitter:B:51:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0118  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m359c(int r14, int r15) {
        /*
            r3 = 0
            r8 = -1
            r1 = 1
            r2 = 0
            if (r14 < 0) goto L_0x000b
            javax.microedition.lcdui.Image[][] r0 = f250a
            int r0 = r0.length
            if (r14 < r0) goto L_0x000c
        L_0x000b:
            return r2
        L_0x000c:
            short[] r0 = f296b
            int r4 = r14 * 11
            int r4 = r4 + 3
            short r5 = r0[r4]
            short[] r0 = f296b
            int r4 = r14 * 11
            int r4 = r4 + 4
            short r0 = r0[r4]
            if (r0 < r8) goto L_0x0023
            int[][][] r4 = f301b
            int r4 = r4.length
            if (r0 < r4) goto L_0x036e
        L_0x0023:
            r4 = r8
        L_0x0024:
            if (r4 != r8) goto L_0x0042
            r0 = r1
        L_0x0027:
            if (r0 <= 0) goto L_0x000b
            javax.microedition.lcdui.Image[][] r0 = f250a
            r0 = r0[r14]
            if (r0 != 0) goto L_0x0038
            javax.microedition.lcdui.Image[][] r6 = f250a
            if (r4 != r8) goto L_0x0054
            r0 = r1
        L_0x0034:
            javax.microedition.lcdui.Image[] r0 = new javax.microedition.lcdui.Image[r0]
            r6[r14] = r0
        L_0x0038:
            javax.microedition.lcdui.Image[][] r0 = f250a
            r0 = r0[r14]
            r0 = r0[r2]
            if (r0 == 0) goto L_0x0066
            r2 = r1
            goto L_0x000b
        L_0x0042:
            int[][][] r0 = f301b
            r0 = r0[r4]
            r0 = r0[r1]
            int r0 = r0.length
            int[][][] r6 = f301b
            r6 = r6[r4]
            r6 = r6[r2]
            int r6 = r6.length
            int r0 = r0 / r6
            int r0 = r0 + 1
            goto L_0x0027
        L_0x0054:
            int[][][] r0 = f301b
            r0 = r0[r4]
            r0 = r0[r1]
            int r0 = r0.length
            int[][][] r7 = f301b
            r4 = r7[r4]
            r4 = r4[r2]
            int r4 = r4.length
            int r0 = r0 / r4
            int r0 = r0 + 1
            goto L_0x0034
        L_0x0066:
            short[] r0 = f296b
            int r4 = r14 * 11
            int r4 = r4 + 9
            short r0 = r0[r4]
            r0 = r0 & 1
            if (r0 != 0) goto L_0x000b
            java.lang.System.gc()
            if (r5 == r8) goto L_0x000b
            java.lang.String r0 = "/"
            r4 = 10
            if (r5 >= r4) goto L_0x0090
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r0 = r4.append(r0)
            java.lang.String r4 = "0"
            java.lang.StringBuffer r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x0090:
            r4 = 100
            if (r5 >= r4) goto L_0x00a7
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r0 = r4.append(r0)
            java.lang.String r4 = "0"
            java.lang.StringBuffer r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
        L_0x00a7:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            java.lang.StringBuffer r0 = r4.append(r0)
            java.lang.String r4 = ""
            java.lang.StringBuffer r0 = r0.append(r4)
            java.lang.StringBuffer r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            r4 = 0
            short[] r6 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r7 = r14 * 11
            int r7 = r7 + 9
            short r6 = r6[r7]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r6 = r6 & 4
            if (r6 == 0) goto L_0x00e5
            int r6 = f220U     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r6 == r14) goto L_0x00d5
            boolean r5 = m308b(r14, r5)     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r5 == 0) goto L_0x00e5
        L_0x00d5:
            javax.microedition.lcdui.Image[][] r5 = f250a     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5 = r5[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r6 = 0
            byte[] r7 = f346g     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = 0
            int r10 = f188E     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            javax.microedition.lcdui.Image r7 = javax.microedition.lcdui.Image.createImage(r7, r9, r10)     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5[r6] = r7     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
        L_0x00e5:
            javax.microedition.lcdui.Image[][] r5 = f250a     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5 = r5[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r6 = 0
            r5 = r5[r6]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r5 != 0) goto L_0x0159
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r0.<init>()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            throw r0     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
        L_0x00f4:
            r0 = move-exception
            r0 = r3
        L_0x00f6:
            javax.microedition.lcdui.Image[][] r3 = f250a     // Catch:{ all -> 0x0366 }
            r3 = r3[r14]     // Catch:{ all -> 0x0366 }
            r4 = 0
            r5 = 0
            r3[r4] = r5     // Catch:{ all -> 0x0366 }
            short[][] r3 = f314c     // Catch:{ all -> 0x0366 }
            r4 = 0
            r3[r14] = r4     // Catch:{ all -> 0x0366 }
            short[] r3 = f296b     // Catch:{ all -> 0x0366 }
            int r4 = r14 * 11
            int r4 = r4 + 9
            short r5 = r3[r4]     // Catch:{ all -> 0x0366 }
            r5 = r5 | 1
            short r5 = (short) r5     // Catch:{ all -> 0x0366 }
            r3[r4] = r5     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0115
            r0.close()     // Catch:{ Exception -> 0x0361 }
        L_0x0115:
            r0 = r1
        L_0x0116:
            if (r0 == 0) goto L_0x0359
            short[] r0 = f296b
            int r3 = r14 * 11
            int r3 = r3 + 10
            short r0 = r0[r3]
            if (r0 == r8) goto L_0x000b
            boolean r3 = m339c(r0, r2)
            if (r3 == 0) goto L_0x000b
            javax.microedition.lcdui.Image[][] r3 = f250a
            r3 = r3[r14]
            javax.microedition.lcdui.Image[][] r4 = f250a
            r4 = r4[r0]
            r4 = r4[r2]
            r3[r2] = r4
            short[][] r3 = f314c
            short[][] r4 = f314c
            r4 = r4[r0]
            r3[r14] = r4
            short[] r3 = f296b
            int r4 = r14 * 11
            int r4 = r4 + 4
            short r3 = r3[r4]
        L_0x0144:
            r4 = 11
            if (r2 >= r4) goto L_0x0337
            short[] r4 = f296b
            int r5 = r14 * 11
            int r5 = r5 + r2
            short[] r6 = f296b
            int r7 = r0 * 11
            int r7 = r7 + r2
            short r6 = r6[r7]
            r4[r5] = r6
            int r2 = r2 + 1
            goto L_0x0144
        L_0x0159:
            java.lang.System.gc()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r5 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r6 = r14 * 11
            int r6 = r6 + 0
            javax.microedition.lcdui.Image[][] r7 = f250a     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r7 = r7[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = 0
            r7 = r7[r9]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r7 = r7.getWidth()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short r7 = (short) r7     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5[r6] = r7     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r5 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r6 = r14 * 11
            int r6 = r6 + 1
            javax.microedition.lcdui.Image[][] r7 = f250a     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r7 = r7[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = 0
            r7 = r7[r9]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r7 = r7.getHeight()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short r7 = (short) r7     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5[r6] = r7     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r5 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5 = r5[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r5 == 0) goto L_0x0192
            if (r3 == 0) goto L_0x018f
            r4.close()     // Catch:{ Exception -> 0x035c }
        L_0x018f:
            r2 = r1
            goto L_0x000b
        L_0x0192:
            HG r4 = p000.C0000HG.f10a     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            java.lang.Class r4 = r4.getClass()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r5.<init>()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            java.lang.StringBuffer r0 = r5.append(r0)     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            java.lang.String r5 = ".off"
            java.lang.StringBuffer r0 = r0.append(r5)     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            java.io.InputStream r4 = r4.getResourceAsStream(r0)     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r4 != 0) goto L_0x02f6
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 2
            short[] r5 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r6 = r14 * 11
            int r6 = r6 + 5
            short r5 = r5[r6]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r6 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r7 = r14 * 11
            int r7 = r7 + 6
            short r6 = r6[r7]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r5 * r6
            short r5 = (short) r5     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r0[r4] = r5     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r0 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r4 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r14 * 11
            int r5 = r5 + 2
            short r4 = r4[r5]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r4 * 7
            short[] r4 = new short[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r0[r14] = r4     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 7
            short r0 = r0[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            switch(r0) {
                case 0: goto L_0x0295;
                case 1: goto L_0x0298;
                case 2: goto L_0x02ad;
                default: goto L_0x01e6;
            }     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
        L_0x01e6:
            r7 = r2
        L_0x01e7:
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 8
            short r0 = r0[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            switch(r0) {
                case 0: goto L_0x02c4;
                case 1: goto L_0x02c7;
                case 2: goto L_0x02db;
                default: goto L_0x01f2;
            }     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
        L_0x01f2:
            r0 = r2
        L_0x01f3:
            r6 = r2
            r5 = r2
        L_0x01f5:
            short[] r4 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r9 = r14 * 11
            int r9 = r9 + 6
            short r4 = r4[r9]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r6 >= r4) goto L_0x036c
            r4 = r2
        L_0x0200:
            short[] r9 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r14 * 11
            int r10 = r10 + 5
            short r9 = r9[r10]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            if (r4 >= r9) goto L_0x02f1
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 0
            short r11 = (short) r14     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 1
            short[] r11 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r12 = r14 * 11
            int r12 = r12 + 0
            short r11 = r11[r12]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r11 = r11 * r4
            short[] r12 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r13 = r14 * 11
            int r13 = r13 + 5
            short r12 = r12[r13]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r11 = r11 / r12
            short r11 = (short) r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 2
            short[] r11 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r12 = r14 * 11
            int r12 = r12 + 1
            short r11 = r11[r12]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r11 = r11 * r6
            short[] r12 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r13 = r14 * 11
            int r13 = r13 + 6
            short r12 = r12[r13]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r11 = r11 / r12
            short r11 = (short) r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 3
            short[] r11 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r12 = r14 * 11
            int r12 = r12 + 0
            short r11 = r11[r12]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r12 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r13 = r14 * 11
            int r13 = r13 + 5
            short r12 = r12[r13]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r11 = r11 / r12
            short r11 = (short) r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 4
            short[] r11 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r12 = r14 * 11
            int r12 = r12 + 1
            short r11 = r11[r12]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r12 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r13 = r14 * 11
            int r13 = r13 + 6
            short r12 = r12[r13]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r11 = r11 / r12
            short r11 = (short) r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 5
            short r11 = (short) r7     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[][] r9 = f314c     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9 = r9[r14]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r10 = r5 + 6
            short r11 = (short) r0     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r9[r10] = r11     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r5 + 7
            int r4 = r4 + 1
            goto L_0x0200
        L_0x0295:
            r7 = r2
            goto L_0x01e7
        L_0x0298:
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 0
            short r0 = r0[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r0 = -r0
            short[] r4 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r14 * 11
            int r5 = r5 + 5
            short r4 = r4[r5]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r0 = r0 / r4
            r7 = r0
            goto L_0x01e7
        L_0x02ad:
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 0
            short r0 = r0[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r4 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r14 * 11
            int r5 = r5 + 5
            short r4 = r4[r5]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r0 = r0 / r4
            int r0 = r0 >> 1
            int r0 = -r0
            r7 = r0
            goto L_0x01e7
        L_0x02c4:
            r0 = r2
            goto L_0x01f3
        L_0x02c7:
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 1
            short r0 = r0[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r0 = -r0
            short[] r4 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r14 * 11
            int r5 = r5 + 6
            short r4 = r4[r5]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r0 = r0 / r4
            goto L_0x01f3
        L_0x02db:
            short[] r0 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r4 = r14 * 11
            int r4 = r4 + 1
            short r0 = r0[r4]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            short[] r4 = f296b     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r5 = r14 * 11
            int r5 = r5 + 6
            short r4 = r4[r5]     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            int r0 = r0 / r4
            int r0 = r0 >> 1
            int r0 = -r0
            goto L_0x01f3
        L_0x02f1:
            int r4 = r6 + 1
            r6 = r4
            goto L_0x01f5
        L_0x02f6:
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00f4, all -> 0x032f }
            byte r5 = r0.readByte()     // Catch:{ Exception -> 0x0369 }
            short[] r4 = f296b     // Catch:{ Exception -> 0x0369 }
            int r6 = r14 * 11
            int r6 = r6 + 2
            short r7 = (short) r5     // Catch:{ Exception -> 0x0369 }
            r4[r6] = r7     // Catch:{ Exception -> 0x0369 }
            short[][] r4 = f314c     // Catch:{ Exception -> 0x0369 }
            int r6 = r5 * 7
            short[] r6 = new short[r6]     // Catch:{ Exception -> 0x0369 }
            r4[r14] = r6     // Catch:{ Exception -> 0x0369 }
            r4 = r2
        L_0x0311:
            int r6 = r5 * 7
            if (r4 >= r6) goto L_0x0323
            short[][] r6 = f314c     // Catch:{ Exception -> 0x0369 }
            r6 = r6[r14]     // Catch:{ Exception -> 0x0369 }
            byte r7 = r0.readByte()     // Catch:{ Exception -> 0x0369 }
            short r7 = (short) r7     // Catch:{ Exception -> 0x0369 }
            r6[r4] = r7     // Catch:{ Exception -> 0x0369 }
            int r4 = r4 + 1
            goto L_0x0311
        L_0x0323:
            r0.close()     // Catch:{ Exception -> 0x0369 }
            r0 = r3
        L_0x0327:
            if (r3 == 0) goto L_0x032c
            r0.close()     // Catch:{ Exception -> 0x035f }
        L_0x032c:
            r0 = r2
            goto L_0x0116
        L_0x032f:
            r0 = move-exception
            r1 = r0
        L_0x0331:
            if (r3 == 0) goto L_0x0336
            r3.close()     // Catch:{ Exception -> 0x0364 }
        L_0x0336:
            throw r1
        L_0x0337:
            short[] r2 = f296b
            int r4 = r14 * 11
            int r4 = r4 + 10
            short r0 = (short) r0
            r2[r4] = r0
            short[] r0 = f296b
            int r2 = r14 * 11
            int r2 = r2 + 4
            short r3 = (short) r3
            r0[r2] = r3
            short[] r0 = f296b
            int r2 = r14 * 11
            int r2 = r2 + 9
            short r3 = r0[r2]
            r3 = r3 & -2
            short r3 = (short) r3
            r0[r2] = r3
            r2 = r1
            goto L_0x000b
        L_0x0359:
            r2 = r1
            goto L_0x000b
        L_0x035c:
            r0 = move-exception
            goto L_0x018f
        L_0x035f:
            r0 = move-exception
            goto L_0x032c
        L_0x0361:
            r0 = move-exception
            goto L_0x0115
        L_0x0364:
            r0 = move-exception
            goto L_0x0336
        L_0x0366:
            r1 = move-exception
            r3 = r0
            goto L_0x0331
        L_0x0369:
            r3 = move-exception
            goto L_0x00f6
        L_0x036c:
            r0 = r3
            goto L_0x0327
        L_0x036e:
            r4 = r0
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m359c(int, int):boolean");
    }

    /* renamed from: c */
    public static final boolean m360c(int i, int[] iArr) {
        int[][] iArr2 = f253a[i];
        iArr[3] = iArr[3] & -1048577;
        if (i == 2 && iArr[4] == 0) {
            m441k(iArr[6]);
            if ((iArr[3] & 2) != 0) {
                C0001a.m135b(iArr);
            }
            if (!m285a(3, i, (int) (short) ((iArr[2] & -65536) >> 16), 0, 0, false)) {
                m285a(11, i, iArr[4], 0, 0, false);
            }
            iArr[4] = -1;
            C0000HG.m81m(10);
            return true;
        }
        if (i == 2) {
            for (int i2 = 0; i2 < iArr2.length; i2++) {
                if (iArr2[i2][4] == iArr[4]) {
                    if (iArr[6] > 0) {
                        int[] iArr3 = iArr2[i2];
                        iArr3[6] = iArr3[6] + iArr[6];
                    } else {
                        int[] iArr4 = iArr2[i2];
                        iArr4[6] = iArr4[6] + 1;
                    }
                    if ((iArr[3] & 2) != 0) {
                        C0001a.m135b(iArr);
                    }
                    if (!m285a(3, i, (int) (short) ((iArr[2] & -65536) >> 16), 0, 0, false)) {
                        m285a(11, i, iArr[4], 0, 0, false);
                    }
                    if (iArr[4] == 1) {
                        int i3 = ((short) (f414w[53] & 65535)) + iArr[6];
                        int[] iArr5 = f414w;
                        iArr5[53] = iArr5[53] & -65536;
                        int[] iArr6 = f414w;
                        iArr6[53] = (((short) i3) & 65535) | iArr6[53];
                    } else if (iArr[4] == 2) {
                        int i4 = ((short) ((f414w[53] & -65536) >> 16)) + iArr[6];
                        int[] iArr7 = f414w;
                        iArr7[53] = iArr7[53] & 65535;
                        int[] iArr8 = f414w;
                        iArr8[53] = ((((short) i4) << 16) & -65536) | iArr8[53];
                    }
                    iArr[4] = -1;
                    C0000HG.m81m(10);
                    return true;
                }
            }
        }
        for (int i5 = 0; i5 < iArr2.length; i5++) {
            if (iArr2[i5][4] == -1) {
                if ((iArr[3] & 2) != 0) {
                    C0001a.m135b(iArr);
                }
                for (int i6 = 0; i6 < iArr2[i5].length; i6++) {
                    iArr2[i5][i6] = iArr[i6];
                }
                iArr2[i5][2] = -1;
                iArr2[i5][1] = -1;
                iArr2[i5][0] = -1;
                if (!m285a(3, i, (int) (short) ((iArr[2] & -65536) >> 16), 0, 0, false)) {
                    m285a(11, i, iArr[4], 0, 0, false);
                }
                if (i == 2) {
                    if (iArr[4] == 1) {
                        int i7 = ((short) (f414w[53] & 65535)) + iArr[6];
                        int[] iArr9 = f414w;
                        iArr9[53] = iArr9[53] & -65536;
                        int[] iArr10 = f414w;
                        iArr10[53] = (((short) i7) & 65535) | iArr10[53];
                    } else if (iArr[4] == 2) {
                        int i8 = ((short) ((f414w[53] & -65536) >> 16)) + iArr[6];
                        int[] iArr11 = f414w;
                        iArr11[53] = iArr11[53] & 65535;
                        int[] iArr12 = f414w;
                        iArr12[53] = ((((short) i8) << 16) & -65536) | iArr12[53];
                    }
                }
                for (int i9 = 0; i9 < 8; i9++) {
                    short s = (short) (f414w[i9 + 31] & 65535);
                    short s2 = (short) ((f414w[i9 + 31] & -65536) >> 16);
                    if ((f414w[39] & (1 << i9)) == 0 && s == i && s2 == iArr[4]) {
                        int[] iArr13 = f414w;
                        int i10 = i9 + 31;
                        iArr13[i10] = iArr13[i10] & 65535;
                        int[] iArr14 = f414w;
                        int i11 = i9 + 31;
                        iArr14[i11] = iArr14[i11] | ((((short) i5) << 16) & -65536);
                        int[] iArr15 = f414w;
                        iArr15[39] = iArr15[39] | (1 << i9);
                    }
                }
                iArr[4] = -1;
                C0000HG.m81m(10);
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static final int m361d() {
        int i = f414w[40];
        if ((f414w[39] & (1 << i)) == 0) {
            return -1;
        }
        return (short) (f414w[i + 31] & 65535);
    }

    /* renamed from: d */
    public static final int m362d(int i) {
        f425z = false;
        if (m220a(61) && ((i < 4 && i > 0) || i > 4)) {
            i--;
        }
        if (m220a(62) && (i < 3 || (i >= 4 && i < 7))) {
            i++;
        }
        if (m220a(55) && i >= 4) {
            i -= 4;
        }
        if (m220a(60) && i < 4) {
            i += 4;
        }
        if (m220a(101)) {
            f425z = true;
            i = 0;
        }
        if (m220a(102)) {
            f425z = true;
            i = 1;
        }
        if (m220a(103)) {
            i = 2;
            f425z = true;
        }
        if (m220a(104)) {
            f425z = true;
            i = 3;
        }
        if (m220a(105)) {
            f425z = true;
            i = 4;
        }
        if (m220a(106)) {
            i = 5;
            f425z = true;
        }
        if (m220a(107)) {
            i = 6;
            f425z = true;
        }
        if (!m220a(108)) {
            return i;
        }
        f425z = true;
        return 7;
    }

    /* renamed from: d */
    public static final int m363d(int[] iArr) {
        int q = m463q(iArr);
        if (q == -1) {
            return -1;
        }
        int e = m378e(iArr);
        if (e < 0 || e >= f255a[q].length) {
            return -1;
        }
        return f255a[q][e].length;
    }

    /* renamed from: d */
    public static final int m364d(int[] iArr, int i) {
        if (i < 0 || i >= 8) {
            return 0;
        }
        return (iArr[(i >> 2) + 9] >> ((i & 3) << 3)) & 255;
    }

    /* renamed from: d */
    public static final void m365d() {
        f216S = (f260aC - (f314c[126][3] << 1)) - (f314c[150][3] * 4);
        f216S /= 5;
        if (f216S < 4) {
            f216S = 4;
        }
        f416x = ((f296b[1530] + f296b[1607]) - (f314c[150][4] << 1)) >> 1;
        if (f416x < 4) {
            f416x = 4;
        }
        int i = ((f260aC - (f314c[150][3] * 4)) - (f216S * 3)) >> 1;
        int i2 = f368l - f296b[1530];
        int i3 = f368l - ((f314c[150][4] + f416x) * 2);
        if (i2 <= i3) {
            i3 = i2;
        }
        int i4 = 0;
        int i5 = i3;
        int i6 = i;
        int i7 = 0;
        while (i4 < 2) {
            for (int i8 = 0; i8 < 4; i8++) {
                f332e[(i7 << 1) + 0] = (short) i6;
                f332e[(i7 << 1) + 1] = (short) i5;
                i7++;
                i6 += f314c[150][3] + f216S;
            }
            i5 += f314c[150][4] + f416x;
            i4++;
            i6 = i;
        }
        f306c = (short) (((f314c[150][3] + f216S) * 4) - f216S);
        f241a = (short) (((byte) ((f339f[1] >> 16) & 255)) + 4);
        f319d = (short) i;
        f291b = (short) ((i3 - f241a) - f416x);
        m348c(5, f319d, f291b, f306c, f241a, 156);
        m397f(5, -2, 0);
    }

    /* renamed from: d */
    public static final void m366d(int i) {
        if (i == -1) {
            f305c = null;
            return;
        }
        f305c = C0000HG.m0a(f249a[f391q[i][11]][0]);
        short s = (short) (f391q[i][12] & 65535);
        short s2 = (short) ((f391q[i][12] & -65536) >> 16);
        if (s2 != 0) {
            f228Z = (s * f261aa) / s2;
        } else {
            f228Z = f261aa;
        }
        if (f228Z < 0) {
            f228Z = 0;
        }
        if (f228Z > f261aa) {
            f228Z = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02b5  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m367d(int r12, int r13) {
        /*
            r11 = 41
            r2 = 1
            r10 = 42
            r1 = 0
            r9 = -1
            switch(r12) {
                case 0: goto L_0x0029;
                case 1: goto L_0x0069;
                case 2: goto L_0x00cd;
                case 3: goto L_0x0148;
                case 4: goto L_0x00a4;
                default: goto L_0x000a;
            }
        L_0x000a:
            r0 = r1
            r3 = r1
        L_0x000c:
            int[] r4 = f414w
            r4 = r4[r10]
            if (r4 == r9) goto L_0x024b
            int[] r4 = f414w
            r4 = r4[r10]
            boolean r4 = m226a(r1, r4, r1)
            if (r4 != 0) goto L_0x024b
            int[] r3 = f414w
            r3 = r3[r10]
            m226a(r1, r3, r1)
            int[] r3 = f414w
            r3[r10] = r9
            r3 = r2
            goto L_0x000c
        L_0x0029:
            int[] r0 = f414w
            r0 = r0[r10]
            if (r0 == r13) goto L_0x005d
            boolean r0 = m226a(r12, r13, r2)
            if (r0 == 0) goto L_0x0057
            int[] r0 = f414w
            r0 = r0[r10]
            if (r0 == r9) goto L_0x0046
            int[] r0 = f414w
            r0 = r0[r10]
            m226a(r12, r0, r1)
            int[] r0 = f414w
            r0[r10] = r9
        L_0x0046:
            int[] r0 = f414w
            r0[r10] = r13
            int[] r0 = f414w
            r3 = 45
            r0[r3] = r9
            int[] r0 = f414w
            r0 = r0[r10]
            m226a(r12, r0, r2)
        L_0x0057:
            r0 = 12
            p000.C0000HG.m81m(r0)
            goto L_0x000a
        L_0x005d:
            int[] r0 = f414w
            r0 = r0[r10]
            m226a(r12, r0, r1)
            int[] r0 = f414w
            r0[r10] = r9
            goto L_0x0057
        L_0x0069:
            int[] r0 = f414w
            r0 = r0[r11]
            if (r0 == r13) goto L_0x0098
            boolean r0 = m226a(r12, r13, r2)
            if (r0 == 0) goto L_0x0091
            int[] r0 = f414w
            r0 = r0[r11]
            if (r0 == r9) goto L_0x0086
            int[] r0 = f414w
            r0 = r0[r11]
            m226a(r12, r0, r1)
            int[] r0 = f414w
            r0[r11] = r9
        L_0x0086:
            int[] r0 = f414w
            r0[r11] = r13
            int[] r0 = f414w
            r0 = r0[r11]
            m226a(r12, r0, r2)
        L_0x0091:
            r0 = 11
            p000.C0000HG.m81m(r0)
            goto L_0x000a
        L_0x0098:
            int[] r0 = f414w
            r0 = r0[r11]
            m226a(r12, r0, r1)
            int[] r0 = f414w
            r0[r11] = r9
            goto L_0x0091
        L_0x00a4:
            int[] r0 = f414w
            r0 = r0[r10]
            if (r0 == r9) goto L_0x00b5
            int[] r0 = f414w
            r0 = r0[r10]
            m226a(r1, r0, r1)
            int[] r0 = f414w
            r0[r10] = r9
        L_0x00b5:
            int[] r0 = f414w
            r3 = 45
            r0 = r0[r3]
            if (r0 == r13) goto L_0x00c5
            int[] r0 = f414w
            r3 = 45
            r0[r3] = r13
            goto L_0x000a
        L_0x00c5:
            int[] r0 = f414w
            r3 = 45
            r0[r3] = r9
            goto L_0x000a
        L_0x00cd:
            int[][][] r0 = f253a
            r0 = r0[r12]
            r0 = r0[r13]
            m363d(r0)
            int[][][] r0 = f253a
            r0 = r0[r12]
            r0 = r0[r13]
            r3 = 6
            r0 = r0[r3]
            if (r0 > r2) goto L_0x0139
            short r0 = (short) r12
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            short r3 = (short) r13
            int r3 = r3 << 16
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r4
            r3 = r3 | r0
            r0 = r1
        L_0x00ee:
            r4 = 8
            if (r0 >= r4) goto L_0x012e
            int[] r4 = f414w
            int r5 = r0 + 31
            r4 = r4[r5]
            if (r3 != r4) goto L_0x012b
            int[] r4 = f414w
            r5 = 39
            r6 = r4[r5]
            int r7 = r2 << r0
            r7 = r7 ^ -1
            r6 = r6 & r7
            r4[r5] = r6
            int[] r4 = f414w
            int r5 = r0 + 31
            r6 = r4[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r4[r5] = r6
            int[] r4 = f414w
            int r5 = r0 + 31
            r6 = r4[r5]
            int[][][] r7 = f253a
            r7 = r7[r12]
            r7 = r7[r13]
            r8 = 4
            r7 = r7[r8]
            short r7 = (short) r7
            int r7 = r7 << 16
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            r6 = r6 | r7
            r4[r5] = r6
        L_0x012b:
            int r0 = r0 + 1
            goto L_0x00ee
        L_0x012e:
            int[][][] r0 = f253a
            r0 = r0[r12]
            r0 = r0[r13]
            r3 = 4
            r0[r3] = r9
            goto L_0x000a
        L_0x0139:
            int[][][] r0 = f253a
            r0 = r0[r12]
            r0 = r0[r13]
            r3 = 6
            r4 = r0[r3]
            int r4 = r4 + -1
            r0[r3] = r4
            goto L_0x000a
        L_0x0148:
            int[][] r0 = f354h
            int[][][] r3 = f253a
            r3 = r3[r12]
            r3 = r3[r13]
            r4 = 4
            r3 = r3[r4]
            r0 = r0[r3]
            r3 = 10
            r0 = r0[r3]
            if (r0 != r2) goto L_0x018d
            int[] r0 = f414w
            r3 = 44
            r0 = r0[r3]
            if (r0 == r9) goto L_0x016c
            int[] r0 = f414w
            r3 = 44
            r0 = r0[r3]
            m226a(r12, r0, r1)
        L_0x016c:
            int[] r0 = f414w
            r3 = 44
            r0 = r0[r3]
            if (r0 == r13) goto L_0x0185
            int[] r0 = f414w
            r3 = 44
            r0[r3] = r13
            int[] r0 = f414w
            r3 = 44
            r0 = r0[r3]
            m226a(r12, r0, r2)
            goto L_0x000a
        L_0x0185:
            int[] r0 = f414w
            r3 = 44
            r0[r3] = r9
            goto L_0x000a
        L_0x018d:
            if (r0 != 0) goto L_0x000a
            int[] r0 = f414w
            r3 = 43
            r0 = r0[r3]
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            short r3 = (short) r3
            if (r3 != r13) goto L_0x01bd
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            short r0 = (short) r0
            m226a(r12, r0, r1)
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            r0[r3] = r4
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 | r5
            r0[r3] = r4
            goto L_0x000a
        L_0x01bd:
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r0
            int r3 = r3 >> 16
            short r3 = (short) r3
            if (r3 != r13) goto L_0x01e7
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            short r0 = (short) r0
            m226a(r12, r0, r1)
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            r0[r3] = r4
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 | r5
            r0[r3] = r4
            goto L_0x000a
        L_0x01e7:
            r3 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            short r3 = (short) r3
            if (r3 != r9) goto L_0x0217
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            r0[r3] = r4
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            short r5 = (short) r13
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r4 = r4 | r5
            r0[r3] = r4
            int[] r0 = f414w
            r3 = 43
            r0 = r0[r3]
            r3 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r3
            short r0 = (short) r0
            m226a(r12, r0, r2)
            goto L_0x000a
        L_0x0217:
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            short r0 = (short) r0
            if (r0 != r9) goto L_0x000a
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            r0[r3] = r4
            int[] r0 = f414w
            r3 = 43
            r4 = r0[r3]
            short r5 = (short) r13
            int r5 = r5 << 16
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r4 = r4 | r5
            r0[r3] = r4
            int[] r0 = f414w
            r3 = 43
            r0 = r0[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            short r0 = (short) r0
            m226a(r12, r0, r2)
            goto L_0x000a
        L_0x024b:
            int[] r4 = f414w
            r4 = r4[r11]
            if (r4 == r9) goto L_0x0269
            int[] r4 = f414w
            r4 = r4[r11]
            boolean r4 = m226a(r2, r4, r1)
            if (r4 != 0) goto L_0x0269
            int[] r0 = f414w
            r0 = r0[r11]
            m226a(r1, r0, r1)
            int[] r0 = f414w
            r0[r11] = r9
            r0 = r2
            goto L_0x000c
        L_0x0269:
            if (r3 != 0) goto L_0x026d
            if (r0 == 0) goto L_0x02b4
        L_0x026d:
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x028e
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.StringBuffer r1 = r2.append(r1)
            r2 = 88
            java.lang.String r2 = p000.C0000HG.m0a(r2)
            java.lang.StringBuffer r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuffer r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x028e:
            if (r0 == 0) goto L_0x02b5
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 87
            java.lang.String r1 = p000.C0000HG.m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x02a7:
            r1 = 230(0xe6, float:3.22E-43)
            java.lang.String r1 = p000.C0000HG.m0a(r1)
            r2 = 101(0x65, float:1.42E-43)
            r3 = 106(0x6a, float:1.49E-43)
            m261a(r0, r1, r2, r3)
        L_0x02b4:
            return
        L_0x02b5:
            r0 = r1
            goto L_0x02a7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m367d(int, int):void");
    }

    /* renamed from: d */
    public static final void m368d(int i, int i2, int i3) {
        int i4 = 8192;
        if (!(i3 == -1 || (C0001a.f124d[i3][3] & 4) == 0)) {
            i4 = -((m274a(C0001a.f124d[i3], true)[1] << 12) / C0001a.f136i);
        }
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = i4;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 512;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 20;
        f383o[f412w][11] = 11;
        f383o[f412w][12] = i3;
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: d */
    public static final void m369d(Graphics graphics) {
        int i;
        if (((C0000HG.f70l && C0000HG.f21a > 17) || !C0000HG.f70l) && !f389q && C0000HG.f84v == 0) {
            int i2 = f388q / C0001a.f136i;
            int i3 = f303c / C0001a.f150p;
            int i4 = (f260aC / C0001a.f136i) + 2 + i2;
            int i5 = (f368l / C0001a.f150p) + 2 + i3;
            int i6 = i2 < 0 ? 0 : i2;
            if (i3 < 0) {
                i3 = 0;
            }
            if (i4 > C0001a.f154r) {
                i4 = C0001a.f154r;
            }
            int i7 = i5 > C0001a.f94F ? C0001a.f94F : i5;
            int i8 = i6 - 6;
            int i9 = i4 + 6;
            int i10 = i7 + 7;
            if (i8 < 0) {
                i8 = 0;
            }
            int i11 = i3 < 0 ? 0 : i3;
            if (i9 > C0001a.f154r) {
                i9 = C0001a.f154r;
            }
            if (i10 > C0001a.f94F) {
                i10 = C0001a.f94F;
            }
            graphics.setClip(0, 0, f260aC, f368l);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            m461p(graphics);
            int i16 = i11;
            while (i16 < i10) {
                int i17 = i15;
                int i18 = i14;
                int i19 = i13;
                for (int i20 = i8; i20 < i9; i20++) {
                    int i21 = C0001a.f109a[i16][i20];
                    while (i21 != -1) {
                        int[] iArr = C0001a.f124d[i21];
                        iArr[1] = iArr[1] & 65535;
                        int[] iArr2 = C0001a.f124d[i21];
                        iArr2[1] = iArr2[1] | -65536;
                        boolean z = false;
                        if ((C0001a.f124d[i21][3] & 4096) == 0 || C0001a.f124d[i21][6] == 0) {
                            i = i19;
                        } else {
                            if (m309b(i19, i21, i15)) {
                                i19 = i21;
                            }
                            z = true;
                            i17 = i21;
                            i = i19;
                        }
                        if (!z) {
                            i18 = i21;
                            i12 = m309b(i12, i21, i14) ? i21 : i12;
                        }
                        i21 = (short) (C0001a.f124d[i21][1] & 65535);
                        i19 = i;
                    }
                }
                i16++;
                i15 = i17;
                i14 = i18;
                i13 = i19;
            }
            for (int i22 = i12; i22 != -1; i22 = (short) ((C0001a.f124d[i22][1] & -65536) >> 16)) {
                m275a(C0001a.f124d[i22], true, graphics);
            }
            int i23 = Integer.MAX_VALUE;
            if (i12 != -1) {
                i23 = C0001a.m147c(C0001a.f124d[i12]);
            }
            int i24 = i11;
            while (i24 < i10) {
                int i25 = i23;
                while (i12 != -1 && i25 <= (i24 + 1) * 4096) {
                    m275a(C0001a.f124d[i12], false, graphics);
                    i12 = (short) ((C0001a.f124d[i12][1] & -65536) >> 16);
                    i25 = i12 == -1 ? Integer.MAX_VALUE : C0001a.m147c(C0001a.f124d[i12]);
                }
                for (int i26 = i8; i26 < i9; i26++) {
                    int i27 = C0001a.f115b[i24][i26] >> 12;
                    while (true) {
                        int i28 = i27 & 7;
                        if (i28 == 7) {
                            break;
                        }
                        if (i26 >= i6 && i24 - i28 >= i3 && i26 < i4 && i24 - i28 < i7) {
                            m251a(i26, i24 - i28, 1, graphics);
                        }
                        i27 = C0001a.f115b[i24 - i28][i26] >> 28;
                    }
                }
                i24++;
                i23 = i25;
            }
            for (int i29 = i12; i29 != -1; i29 = (short) ((C0001a.f124d[i29][1] & -65536) >> 16)) {
                m275a(C0001a.f124d[i29], false, graphics);
            }
            for (int i30 = i13; i30 != -1; i30 = (short) ((C0001a.f124d[i30][1] & -65536) >> 16)) {
                m275a(C0001a.f124d[i30], true, graphics);
                m275a(C0001a.f124d[i30], false, graphics);
            }
        }
        if (!C0000HG.f70l) {
            if (f265ae == -1) {
                m457o(graphics);
            }
            m384e(graphics);
            m351c(graphics);
            if (f389q) {
                m476u(graphics);
            } else if (f361j) {
                m324b(graphics);
            }
            if (f401t) {
                m444l(graphics);
            }
        }
        graphics.setClip(0, 0, f260aC, f368l);
    }

    /* renamed from: d */
    public static final void m370d(int[] iArr) {
        int[] iArr2 = f395r[iArr[4]];
        m253a(iArr2[6], iArr2[3], true, false, f414w);
        C0000HG.m81m(33);
    }

    /* renamed from: d */
    public static final void m371d(int[] iArr, int i) {
        if ((iArr[3] & 4) != 0 && i >= 0 && i < 8) {
            if (f302b[i] == null) {
                m338c(i);
            }
            iArr[7] = iArr[7] & 65535;
            iArr[7] = iArr[7] | ((((short) i) << 16) & -65536);
        }
    }

    /* renamed from: d */
    public static final void m372d(int[] iArr, int i, int i2) {
        if (m463q(iArr) != -1) {
            int j = m431j(iArr);
            if (i >= 0 && i < j) {
                int f = m393f(iArr, i);
                if (i2 >= 0 && i2 < f) {
                    m354c(iArr, m415h(iArr) + i, i2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b2 A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d3 A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f2 A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010d A[Catch:{ Exception -> 0x01f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x001b A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m373d(int[] r29, javax.microedition.lcdui.Graphics r30) {
        /*
            int r7 = m474u(r29)     // Catch:{ Exception -> 0x01f6 }
            int r14 = m459p(r29)     // Catch:{ Exception -> 0x01f6 }
            int r15 = m463q(r29)     // Catch:{ Exception -> 0x01f6 }
            int r6 = m378e(r29)     // Catch:{ Exception -> 0x01f6 }
            int r5 = m469s(r29)     // Catch:{ Exception -> 0x01f6 }
            r8 = 3
            r8 = r29[r8]     // Catch:{ Exception -> 0x01f6 }
            r8 = r8 & 4
            if (r8 != 0) goto L_0x001c
        L_0x001b:
            return
        L_0x001c:
            r8 = -1
            if (r15 == r8) goto L_0x001b
            if (r15 < 0) goto L_0x001b
            byte[][][][] r8 = f302b     // Catch:{ Exception -> 0x01f6 }
            int r8 = r8.length     // Catch:{ Exception -> 0x01f6 }
            if (r15 >= r8) goto L_0x001b
            byte[][][][] r8 = f302b     // Catch:{ Exception -> 0x01f6 }
            r8 = r8[r15]     // Catch:{ Exception -> 0x01f6 }
            if (r8 == 0) goto L_0x001b
            byte[][][][] r8 = f302b     // Catch:{ Exception -> 0x01f6 }
            r8 = r8[r15]     // Catch:{ Exception -> 0x01f6 }
            int r8 = r8.length     // Catch:{ Exception -> 0x01f6 }
            if (r6 >= r8) goto L_0x0035
            if (r6 >= 0) goto L_0x0309
        L_0x0035:
            r6 = 0
            r13 = r6
        L_0x0037:
            byte[][][][] r6 = f255a     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r13]     // Catch:{ Exception -> 0x01f6 }
            int r6 = r6.length     // Catch:{ Exception -> 0x01f6 }
            if (r5 >= r6) goto L_0x0042
            if (r5 >= 0) goto L_0x0306
        L_0x0042:
            r5 = 0
            r12 = r5
        L_0x0044:
            if (r14 < 0) goto L_0x001b
            r5 = 17
            if (r14 >= r5) goto L_0x001b
            int r5 = r7 * 5
            byte[][][][] r6 = f302b     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r13]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r14]     // Catch:{ Exception -> 0x01f6 }
            int r6 = r6.length     // Catch:{ Exception -> 0x01f6 }
            int r6 = -r6
            if (r5 < r6) goto L_0x001b
            int r5 = r7 * 5
            byte[][][][] r6 = f302b     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r13]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r14]     // Catch:{ Exception -> 0x01f6 }
            int r6 = r6.length     // Catch:{ Exception -> 0x01f6 }
            if (r5 >= r6) goto L_0x001b
            int r5 = r7 * 5
            int r16 = r5 + 1
            r5 = 0
            r11 = r5
        L_0x006b:
            r5 = 4
            if (r11 >= r5) goto L_0x001b
            byte[][][][] r5 = f255a     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r15]     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r13]     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r12]     // Catch:{ Exception -> 0x01f6 }
            int r6 = r14 * 4
            int r6 = r6 + r11
            byte r5 = r5[r6]     // Catch:{ Exception -> 0x01f6 }
            r6 = -1
            if (r5 != r6) goto L_0x0082
        L_0x007e:
            int r5 = r11 + 1
            r11 = r5
            goto L_0x006b
        L_0x0082:
            short[][] r6 = f251a     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            int r7 = r5 * 6
            int r7 = r7 + 2
            short r7 = r6[r7]     // Catch:{ Exception -> 0x01f6 }
            r6 = 0
            r8 = -1
            if (r7 == r8) goto L_0x0303
            r0 = r29
            int r6 = m312b(r0, r7)     // Catch:{ Exception -> 0x01f6 }
            r7 = -1
            if (r6 != r7) goto L_0x0303
            r6 = 0
            r7 = r6
        L_0x009b:
            short[][] r6 = f251a     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            int r8 = r5 * 6
            int r8 = r8 + 3
            short r8 = r6[r8]     // Catch:{ Exception -> 0x01f6 }
            short[][] r6 = f251a     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            int r9 = r5 * 6
            int r9 = r9 + 5
            short r6 = r6[r9]     // Catch:{ Exception -> 0x01f6 }
            r9 = -1
            if (r6 == r9) goto L_0x0300
            r0 = r29
            int r5 = m406g(r0, r6)     // Catch:{ Exception -> 0x01f6 }
            r9 = -1
            if (r5 != r9) goto L_0x00bc
            r5 = 0
        L_0x00bc:
            byte[][][] r9 = f300b     // Catch:{ Exception -> 0x01f6 }
            r9 = r9[r15]     // Catch:{ Exception -> 0x01f6 }
            r6 = r9[r6]     // Catch:{ Exception -> 0x01f6 }
            byte r5 = r6[r5]     // Catch:{ Exception -> 0x01f6 }
            r9 = r5
        L_0x00c5:
            short[][] r5 = f251a     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r15]     // Catch:{ Exception -> 0x01f6 }
            int r6 = r9 * 6
            int r6 = r6 + 1
            short r10 = r5[r6]     // Catch:{ Exception -> 0x01f6 }
            r5 = 0
            r6 = -1
            if (r10 == r6) goto L_0x00dd
            r0 = r29
            int r5 = m342c(r0, r10)     // Catch:{ Exception -> 0x01f6 }
            r6 = -1
            if (r5 != r6) goto L_0x00dd
            r5 = 0
        L_0x00dd:
            byte[][][][] r6 = f302b     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r13]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r14]     // Catch:{ Exception -> 0x01f6 }
            int r17 = r16 + r11
            byte r17 = r6[r17]     // Catch:{ Exception -> 0x01f6 }
            javax.microedition.lcdui.Image[][][] r6 = f254a     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r15]     // Catch:{ Exception -> 0x01f6 }
            r6 = r6[r9]     // Catch:{ Exception -> 0x01f6 }
            int r6 = r6.length     // Catch:{ Exception -> 0x01f6 }
            if (r5 < r6) goto L_0x02fd
            r5 = 0
            r6 = r5
        L_0x00f4:
            javax.microedition.lcdui.Image[][][] r5 = f254a     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r15]     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r9]     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r6]     // Catch:{ Exception -> 0x01f6 }
            if (r5 != 0) goto L_0x0103
            r0 = r29
            m328b(r0, r10, r6)     // Catch:{ Exception -> 0x01f6 }
        L_0x0103:
            javax.microedition.lcdui.Image[][][] r5 = f254a     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r15]     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r9]     // Catch:{ Exception -> 0x01f6 }
            r5 = r5[r6]     // Catch:{ Exception -> 0x01f6 }
            if (r5 == 0) goto L_0x001b
            r5 = 4
            r5 = r29[r5]     // Catch:{ Exception -> 0x01f6 }
            int r10 = p000.C0001a.f136i     // Catch:{ Exception -> 0x01f6 }
            int r5 = r5 * r10
            int r5 = r5 >> 12
            r10 = 5
            r10 = r29[r10]     // Catch:{ Exception -> 0x01f6 }
            int r18 = p000.C0001a.f136i     // Catch:{ Exception -> 0x01f6 }
            int r10 = r10 * r18
            int r10 = r10 >> 12
            int r18 = f388q     // Catch:{ Exception -> 0x01f6 }
            int r18 = r5 - r18
            int r5 = f303c     // Catch:{ Exception -> 0x01f6 }
            int r10 = r10 - r5
            if (r17 < 0) goto L_0x01ff
            int r5 = r17 * 7
            int r7 = r7 * r8
            int r7 = r7 * 7
            int r5 = r5 + r7
            if (r5 < 0) goto L_0x0138
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r15]     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r9]     // Catch:{ Exception -> 0x01f6 }
            int r7 = r7.length     // Catch:{ Exception -> 0x01f6 }
            if (r5 < r7) goto L_0x02fa
        L_0x0138:
            r5 = 0
            r8 = r5
        L_0x013a:
            r0 = r30
            boolean r5 = r0 instanceof com.nokia.mid.ui.DirectGraphics     // Catch:{ Exception -> 0x01f6 }
            if (r5 == 0) goto L_0x01f9
            r0 = r30
            com.nokia.mid.ui.DirectGraphics r0 = (com.nokia.mid.ui.DirectGraphics) r0     // Catch:{ Exception -> 0x01f6 }
            r5 = r0
        L_0x0145:
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r15]     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r9]     // Catch:{ Exception -> 0x01f6 }
            int r17 = r8 + 1
            byte r7 = r7[r17]     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r17 = f315c     // Catch:{ Exception -> 0x01f6 }
            r17 = r17[r15]     // Catch:{ Exception -> 0x01f6 }
            r17 = r17[r9]     // Catch:{ Exception -> 0x01f6 }
            int r19 = r8 + 2
            byte r17 = r17[r19]     // Catch:{ Exception -> 0x01f6 }
            int r19 = r30.getClipX()     // Catch:{ Exception -> 0x01f6 }
            int r20 = r30.getClipY()     // Catch:{ Exception -> 0x01f6 }
            int r21 = r30.getClipWidth()     // Catch:{ Exception -> 0x01f6 }
            int r22 = r30.getClipHeight()     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r23 = f315c     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r8 + 5
            byte r23 = r23[r24]     // Catch:{ Exception -> 0x01f6 }
            int r23 = r23 + r18
            byte[][][] r24 = f315c     // Catch:{ Exception -> 0x01f6 }
            r24 = r24[r15]     // Catch:{ Exception -> 0x01f6 }
            r24 = r24[r9]     // Catch:{ Exception -> 0x01f6 }
            int r25 = r8 + 6
            byte r24 = r24[r25]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r24 + r10
            javax.microedition.lcdui.Image[][][] r25 = f254a     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r15]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r9]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r6]     // Catch:{ Exception -> 0x01f6 }
            r25.getWidth()     // Catch:{ Exception -> 0x01f6 }
            javax.microedition.lcdui.Image[][][] r25 = f254a     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r15]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r9]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r6]     // Catch:{ Exception -> 0x01f6 }
            r25.getHeight()     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r25 = f315c     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r15]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r9]     // Catch:{ Exception -> 0x01f6 }
            int r26 = r8 + 3
            byte r25 = r25[r26]     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r26 = f315c     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r15]     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r9]     // Catch:{ Exception -> 0x01f6 }
            int r27 = r8 + 4
            byte r26 = r26[r27]     // Catch:{ Exception -> 0x01f6 }
            int r7 = -r7
            r0 = r17
            int r0 = -r0
            r17 = r0
            r0 = r30
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r0.clipRect(r1, r2, r3, r4)     // Catch:{ Exception -> 0x01f6 }
            javax.microedition.lcdui.Image[][][] r23 = f254a     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            r6 = r23[r6]     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r23 = f315c     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r8 + 5
            byte r23 = r23[r24]     // Catch:{ Exception -> 0x01f6 }
            int r18 = r18 + r23
            int r7 = r7 + r18
            byte[][][] r18 = f315c     // Catch:{ Exception -> 0x01f6 }
            r18 = r18[r15]     // Catch:{ Exception -> 0x01f6 }
            r9 = r18[r9]     // Catch:{ Exception -> 0x01f6 }
            int r8 = r8 + 6
            byte r8 = r9[r8]     // Catch:{ Exception -> 0x01f6 }
            int r8 = r8 + r10
            int r8 = r8 + r17
            r9 = 20
            r10 = 0
            r5.drawImage(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01f6 }
            r0 = r30
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r0.setClip(r1, r2, r3, r4)     // Catch:{ Exception -> 0x01f6 }
            goto L_0x007e
        L_0x01f6:
            r5 = move-exception
            goto L_0x001b
        L_0x01f9:
            com.nokia.mid.ui.DirectGraphics r5 = com.nokia.mid.ui.DirectUtils.getDirectGraphics(r30)     // Catch:{ Exception -> 0x01f6 }
            goto L_0x0145
        L_0x01ff:
            r0 = r17
            int r5 = -r0
            int r5 = r5 + -1
            int r5 = r5 * 7
            int r7 = r7 * r8
            int r7 = r7 * 7
            int r5 = r5 + r7
            if (r5 < 0) goto L_0x0215
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r15]     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r9]     // Catch:{ Exception -> 0x01f6 }
            int r7 = r7.length     // Catch:{ Exception -> 0x01f6 }
            if (r5 < r7) goto L_0x02f7
        L_0x0215:
            r5 = 0
            r8 = r5
        L_0x0217:
            r0 = r30
            boolean r5 = r0 instanceof com.nokia.mid.ui.DirectGraphics     // Catch:{ Exception -> 0x01f6 }
            if (r5 == 0) goto L_0x02f1
            r0 = r30
            com.nokia.mid.ui.DirectGraphics r0 = (com.nokia.mid.ui.DirectGraphics) r0     // Catch:{ Exception -> 0x01f6 }
            r5 = r0
        L_0x0222:
            byte[][][] r7 = f315c     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r15]     // Catch:{ Exception -> 0x01f6 }
            r7 = r7[r9]     // Catch:{ Exception -> 0x01f6 }
            int r17 = r8 + 1
            byte r7 = r7[r17]     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r17 = f315c     // Catch:{ Exception -> 0x01f6 }
            r17 = r17[r15]     // Catch:{ Exception -> 0x01f6 }
            r17 = r17[r9]     // Catch:{ Exception -> 0x01f6 }
            int r19 = r8 + 2
            byte r17 = r17[r19]     // Catch:{ Exception -> 0x01f6 }
            int r19 = r30.getClipX()     // Catch:{ Exception -> 0x01f6 }
            int r20 = r30.getClipY()     // Catch:{ Exception -> 0x01f6 }
            int r21 = r30.getClipWidth()     // Catch:{ Exception -> 0x01f6 }
            int r22 = r30.getClipHeight()     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r23 = f315c     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r8 + 3
            byte r23 = r23[r24]     // Catch:{ Exception -> 0x01f6 }
            int r23 = r18 - r23
            byte[][][] r24 = f315c     // Catch:{ Exception -> 0x01f6 }
            r24 = r24[r15]     // Catch:{ Exception -> 0x01f6 }
            r24 = r24[r9]     // Catch:{ Exception -> 0x01f6 }
            int r25 = r8 + 5
            byte r24 = r24[r25]     // Catch:{ Exception -> 0x01f6 }
            int r23 = r23 - r24
            byte[][][] r24 = f315c     // Catch:{ Exception -> 0x01f6 }
            r24 = r24[r15]     // Catch:{ Exception -> 0x01f6 }
            r24 = r24[r9]     // Catch:{ Exception -> 0x01f6 }
            int r25 = r8 + 6
            byte r24 = r24[r25]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r24 + r10
            javax.microedition.lcdui.Image[][][] r25 = f254a     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r15]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r9]     // Catch:{ Exception -> 0x01f6 }
            r25 = r25[r6]     // Catch:{ Exception -> 0x01f6 }
            int r25 = r25.getWidth()     // Catch:{ Exception -> 0x01f6 }
            javax.microedition.lcdui.Image[][][] r26 = f254a     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r15]     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r9]     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r6]     // Catch:{ Exception -> 0x01f6 }
            r26.getHeight()     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r26 = f315c     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r15]     // Catch:{ Exception -> 0x01f6 }
            r26 = r26[r9]     // Catch:{ Exception -> 0x01f6 }
            int r27 = r8 + 3
            byte r26 = r26[r27]     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r27 = f315c     // Catch:{ Exception -> 0x01f6 }
            r27 = r27[r15]     // Catch:{ Exception -> 0x01f6 }
            r27 = r27[r9]     // Catch:{ Exception -> 0x01f6 }
            int r28 = r8 + 4
            byte r27 = r27[r28]     // Catch:{ Exception -> 0x01f6 }
            int r7 = r25 - r7
            int r7 = r7 - r26
            int r7 = -r7
            r0 = r17
            int r0 = -r0
            r17 = r0
            r0 = r30
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r27
            r0.clipRect(r1, r2, r3, r4)     // Catch:{ Exception -> 0x01f6 }
            javax.microedition.lcdui.Image[][][] r23 = f254a     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            r6 = r23[r6]     // Catch:{ Exception -> 0x01f6 }
            byte[][][] r23 = f315c     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r8 + 3
            byte r23 = r23[r24]     // Catch:{ Exception -> 0x01f6 }
            int r18 = r18 - r23
            byte[][][] r23 = f315c     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r15]     // Catch:{ Exception -> 0x01f6 }
            r23 = r23[r9]     // Catch:{ Exception -> 0x01f6 }
            int r24 = r8 + 5
            byte r23 = r23[r24]     // Catch:{ Exception -> 0x01f6 }
            int r18 = r18 - r23
            int r7 = r7 + r18
            byte[][][] r18 = f315c     // Catch:{ Exception -> 0x01f6 }
            r18 = r18[r15]     // Catch:{ Exception -> 0x01f6 }
            r9 = r18[r9]     // Catch:{ Exception -> 0x01f6 }
            int r8 = r8 + 6
            byte r8 = r9[r8]     // Catch:{ Exception -> 0x01f6 }
            int r8 = r8 + r10
            int r8 = r8 + r17
            r9 = 20
            r10 = 8192(0x2000, float:1.14794E-41)
            r5.drawImage(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x01f6 }
            r0 = r30
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r0.setClip(r1, r2, r3, r4)     // Catch:{ Exception -> 0x01f6 }
            goto L_0x007e
        L_0x02f1:
            com.nokia.mid.ui.DirectGraphics r5 = com.nokia.mid.ui.DirectUtils.getDirectGraphics(r30)     // Catch:{ Exception -> 0x01f6 }
            goto L_0x0222
        L_0x02f7:
            r8 = r5
            goto L_0x0217
        L_0x02fa:
            r8 = r5
            goto L_0x013a
        L_0x02fd:
            r6 = r5
            goto L_0x00f4
        L_0x0300:
            r9 = r5
            goto L_0x00c5
        L_0x0303:
            r7 = r6
            goto L_0x009b
        L_0x0306:
            r12 = r5
            goto L_0x0044
        L_0x0309:
            r13 = r6
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m373d(int[], javax.microedition.lcdui.Graphics):void");
    }

    /* renamed from: d */
    public static final boolean m374d() {
        boolean z = false;
        if (f327e == 2579220938L) {
            if (!f409v) {
                z = true;
            }
            f409v = z;
            if (!C0000HG.m39b(3)) {
                return true;
            }
            try {
                DeviceControl.startVibra(50, 500);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        } else if (f327e == 2578033336L) {
            int[] iArr = f414w;
            iArr[12] = iArr[12] & -65536;
            int[] iArr2 = f414w;
            iArr2[12] = iArr2[12] | 0;
            if (!C0000HG.m39b(3)) {
                return true;
            }
            try {
                DeviceControl.startVibra(50, 500);
                return true;
            } catch (Exception e2) {
                e2.printStackTrace();
                return true;
            }
        } else if (f327e == 41284439224L) {
            m253a(4, 5, true, false, f414w);
            if (!C0000HG.m39b(3)) {
                return true;
            }
            try {
                DeviceControl.startVibra(50, 500);
                return true;
            } catch (Exception e3) {
                e3.printStackTrace();
                return true;
            }
        } else if (f327e == 659427265720L) {
            m253a(5, 5, true, false, f414w);
            if (!C0000HG.m39b(3)) {
                return true;
            }
            try {
                DeviceControl.startVibra(50, 500);
                return true;
            } catch (Exception e4) {
                e4.printStackTrace();
                return true;
            }
        } else if (f327e == 10555380766664L) {
            m253a(2, 10, true, false, f414w);
            if (!C0000HG.m39b(3)) {
                return true;
            }
            try {
                DeviceControl.startVibra(50, 500);
                return true;
            } catch (Exception e5) {
                e5.printStackTrace();
                return true;
            }
        } else {
            if (f327e == 41297607096L) {
                m253a(24, 10, true, false, f414w);
                if (C0000HG.m39b(3)) {
                    try {
                        DeviceControl.startVibra(50, 500);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                }
            } else if (f327e == 41217071517L) {
                m253a(3, 10, true, false, f414w);
                if (!C0000HG.m39b(3)) {
                    return true;
                }
                try {
                    DeviceControl.startVibra(50, 500);
                    return true;
                } catch (Exception e7) {
                    e7.printStackTrace();
                    return true;
                }
            } else if (f327e == 659437426872L) {
                if (f265ae >= 0) {
                    m257a(10000, f391q[f265ae], f414w);
                }
                if (!C0000HG.m39b(3)) {
                    return true;
                }
                try {
                    DeviceControl.startVibra(50, 500);
                    return true;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return true;
                }
            } else if (f327e == 41230911865L) {
                m441k(1000);
                if (!C0000HG.m39b(3)) {
                    return true;
                }
                try {
                    DeviceControl.startVibra(50, 500);
                    return true;
                } catch (Exception e9) {
                    e9.printStackTrace();
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: d */
    public static final boolean m375d(int i) {
        if (!m458o(i)) {
            return false;
        }
        try {
            C0000HG.m67h(i);
            C0000HG.f15a.readLong();
            f414w = C0000HG.m38b();
            f187D = C0000HG.m38b();
            f378n = C0000HG.m38b();
            f209O = C0000HG.m38b();
            f201K = C0000HG.m38b();
            f398s = C0000HG.m38b();
            f402t = C0000HG.m38b();
            f205M = C0000HG.m38b();
            f199J = C0000HG.m38b();
            f386p = C0000HG.m38b();
            f253a = (int[][][]) Array.newInstance(int[].class, new int[]{6, 15});
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 15; i3++) {
                    f253a[i2][i3] = C0000HG.m38b();
                }
            }
            f399s = new int[19][];
            for (int i4 = 0; i4 < 19; i4++) {
                f399s[i4] = C0000HG.m38b();
            }
            C0000HG.f14a = null;
            C0000HG.f16a = null;
            C0000HG.f13a = null;
            C0000HG.f15a = null;
            return true;
        } catch (Exception e) {
            C0000HG.f14a = null;
            C0000HG.f16a = null;
            C0000HG.f13a = null;
            C0000HG.f15a = null;
            return false;
        }
    }

    /* renamed from: d */
    public static final boolean m376d(int i, int i2) {
        int i3 = i;
        int i4 = -1;
        while (i3 != -1 && C0001a.m147c(C0001a.f124d[i2]) >= C0001a.m147c(C0001a.f124d[i3])) {
            i4 = i3;
            i3 = (short) ((C0001a.f124d[i3][1] & -65536) >> 16);
        }
        if (i4 == -1) {
            int[] iArr = C0001a.f124d[i2];
            iArr[1] = iArr[1] & 65535;
            int[] iArr2 = C0001a.f124d[i2];
            iArr2[1] = iArr2[1] | ((((short) i) << 16) & -65536);
            return true;
        }
        short s = (short) ((C0001a.f124d[i4][1] & -65536) >> 16);
        int[] iArr3 = C0001a.f124d[i2];
        iArr3[1] = iArr3[1] & 65535;
        int[] iArr4 = C0001a.f124d[i2];
        iArr4[1] = ((((short) s) << 16) & -65536) | iArr4[1];
        int[] iArr5 = C0001a.f124d[i4];
        iArr5[1] = iArr5[1] & 65535;
        int[] iArr6 = C0001a.f124d[i4];
        iArr6[1] = iArr6[1] | ((((short) i2) << 16) & -65536);
        return false;
    }

    /* renamed from: e */
    public static final int m377e(int i) {
        int i2 = 1;
        if ((i & 32) == 0) {
            if ((i & 4096) != 0) {
                i2 = f391q.length + 1;
            } else if ((i & 64) != 0) {
                i2 = f391q.length + f419x.length + 1;
            } else if ((i & 128) != 0) {
                i2 = f391q.length + f419x.length + f359i.length + 1;
            } else if ((i & 256) != 0) {
                i2 = f391q.length + f419x.length + f359i.length + f379n.length + 1;
            } else if ((i & 512) != 0) {
                i2 = f391q.length + f419x.length + f359i.length + f379n.length + f371l.length + 1;
            } else if ((i & 8192) != 0) {
                i2 = f391q.length + f419x.length + f359i.length + f379n.length + f371l.length + f325d.length + 1;
            } else if ((i & 1024) != 0) {
                i2 = f391q.length + f419x.length + f359i.length + f379n.length + f371l.length + f325d.length + f423y.length + 1;
            }
        }
        while (i2 < C0001a.f124d.length) {
            if (C0001a.f124d[i2][4] < 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: e */
    public static final int m378e(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        return (short) (iArr[8] & 65535);
    }

    /* renamed from: e */
    public static final int m379e(int[] iArr, int i) {
        int q = m463q(iArr);
        if (q != -1 && i >= 0 && i < f256a[q].length) {
            return f256a[q][i].length;
        }
        return -1;
    }

    /* renamed from: e */
    public static final void m380e() {
        int i;
        f326e = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < f391q.length; i3++) {
            f391q[i3][21] = -1;
            f391q[i3][20] = -1;
            f391q[i3][16] = -1;
            f391q[i3][22] = -1;
            f391q[i3][26] = 1376256;
            f391q[i3][31] = C0000HG.m40b(20, 50);
            f391q[i3][29] = f249a[f391q[i3][11]][29];
            f391q[i3][23] = m311b(f391q[i3]);
            short s = (short) (f391q[i3][12] & 65535);
            if (f414w[11] >= 0) {
                int i4 = 0;
                int i5 = 0;
                int i6 = i2;
                while (i4 < 2) {
                    if (((short) (f391q[i3][i4 + 17] & 65535)) == 5) {
                        i = (f201K[f414w[11]] & (1 << (C0001a.f138j + i6))) == 0 ? i5 + 1 : i5;
                        i6++;
                    } else {
                        i = i5;
                    }
                    i4++;
                    i5 = i;
                }
                if (i5 == 0 && s < 0) {
                    int[] iArr = f391q[i3];
                    iArr[3] = iArr[3] | 65536;
                    if ((f391q[i3][3] & 2) != 0) {
                        C0001a.m135b(f391q[i3]);
                    }
                    f391q[i3][0] = -1;
                    int[] iArr2 = f398s;
                    int i7 = f414w[11];
                    iArr2[i7] = iArr2[i7] | (1 << i3);
                }
                i2 = i6;
            }
            if (f414w[11] == -1 || (f398s[f414w[11]] & (1 << i3)) == 0) {
                if ((f391q[i3][3] & 65536) == 0 && !m433j(i3) && s > 0) {
                    f326e++;
                }
                int i8 = f391q[i3][11];
                short s2 = (short) ((f249a[i8][1] & -65536) >> 16);
                byte b = (byte) (f249a[i8][4] & 255);
                byte b2 = (byte) ((f249a[i8][4] >> 8) & 255);
                int i9 = (byte) ((f249a[i8][4] >> 16) & 255);
                m364d(f391q[i3], (((short) (f249a[i8][1] & 65535)) + 1) - 134);
                m379e(f391q[i3], (int) f248a[0][0]);
                m428i(f391q[i3], 0);
                int h = m415h(f391q[i3]);
                if (m415h(f391q[i3]) > 0) {
                    m328b(f391q[i3], 0, (int) s2);
                }
                if (f249a[i8][4] != -1) {
                    if (h >= 1) {
                        m328b(f391q[i3], 1, (int) b);
                    }
                    if (i9 < 0) {
                        i9 = (i9 * -1) - 1;
                        if (m230a(f391q[i3]) > 0) {
                            m271a(f391q[i3], 0, 1);
                        }
                    } else if (h >= 2) {
                        m328b(f391q[i3], 2, (int) b2);
                    }
                    if (m393f(f391q[i3], 0) > 0) {
                        m372d(f391q[i3], 0, i9);
                    }
                }
                if (!(f249a[f391q[i3][11]][27] == 7 || f249a[f391q[i3][11]][27] == 8)) {
                    C0001a.m138b(i3);
                }
                int i10 = f391q[i3][14];
                if (i10 >= 0) {
                    f391q[i3][29] = m437k(f359i[i10]);
                    m310b(i3, m230a(f359i[i10]));
                }
                m393f(f391q[i3], ((short) (f391q[i3][27] & 65535)) + 0);
            }
        }
    }

    /* renamed from: e */
    public static final void m381e(int i) {
        int i2 = (((short) (f391q[i][22] & 65535)) << 11) + 2048;
        int i3 = (((short) ((f391q[i][22] & -65536) >> 16)) << 11) + 2048;
        int[] a = m230a(f391q[i]);
        if ((f391q[i][13] & 64) != 0) {
            int i4 = f391q[i][24];
            int i5 = ((short) (f298b[i][i4] & 65535)) << 11;
            i2 = i5 - ((short) (a[2] & 65535));
            i3 = (((short) ((f298b[i][i4] & -65536) >> 16)) << 11) - ((short) ((a[2] & -65536) >> 16));
        }
        int i6 = f391q[i][4];
        int i7 = f391q[i][5];
        if ((f391q[i][13] & 64) != 0 || C0001a.m99a(i6, i7, i2, i3, 4128, f331e) == -2) {
            int i8 = a[9];
            f410v[0] = i6;
            f410v[1] = i7;
            f422y[0] = i2 - i6;
            f422y[1] = i3 - i7;
            f390q[0] = i2;
            f390q[1] = i3;
            if (m235a(f410v, f390q) <= ((long) (i8 * i8))) {
                C0001a.m104a(f391q[i], i2, i3, 0);
                if ((f391q[i][13] & 64) != 0) {
                    int i9 = ((short) (f391q[i][0] & 65535)) * 2;
                    int i10 = ((short) ((f391q[i][0] & -65536) >> 16)) * 2;
                    int i11 = i9 + ((((short) (a[3] & 65535)) - ((short) (a[2] & 65535))) >> 11);
                    int i12 = i10 + ((((short) ((a[3] & -65536) >> 16)) - ((short) ((a[2] & -65536) >> 16))) >> 11);
                    for (int i13 = i10; i13 <= i12; i13++) {
                        for (int i14 = i9; i14 <= i11; i14++) {
                            if (m222a(0, C0001a.f94F * 2, i13) && m222a(0, C0001a.f154r * 2, i14) && ((byte) ((f217S[((((C0001a.f154r * i13) * 2) * 3) + (i14 * 3)) + 2] >> 16) & 255)) == i) {
                                int[] iArr = f217S;
                                int i15 = (C0001a.f154r * i13 * 2 * 3) + (i14 * 3) + 2;
                                iArr[i15] = iArr[i15] & 65535;
                                int[] iArr2 = f217S;
                                int i16 = (C0001a.f154r * i13 * 2 * 3) + (i14 * 3) + 2;
                                iArr2[i16] = iArr2[i16] | -65536;
                            }
                        }
                    }
                    int[] iArr3 = f391q[i];
                    iArr3[24] = iArr3[24] + 1;
                    if (f391q[i][24] >= f298b[i].length) {
                        f391q[i][22] = -1;
                        int[] iArr4 = f391q[i];
                        iArr4[13] = iArr4[13] & -65;
                        m307b(i);
                        if ((f391q[i][13] & 65536) != 0) {
                            int[] iArr5 = f391q[i];
                            iArr5[13] = iArr5[13] & -65537;
                            int[] iArr6 = f391q[i];
                            iArr6[13] = iArr6[13] & -131073;
                            m285a(14, i, (int) (short) (f391q[i][0] & 65535), (int) (short) ((f391q[i][0] & -65536) >> 16), 0, false);
                            return;
                        }
                        return;
                    }
                    short s = (short) (f298b[i][f391q[i][24]] & 65535);
                    short s2 = (short) ((f298b[i][f391q[i][24]] & -65536) >> 16);
                    m330b(f391q[i], true);
                    if (!m286a(i, 1, (int) s, (int) s2, true, false)) {
                        f391q[i][22] = f298b[i][f298b[i].length - 1];
                        mo11g(i);
                    }
                    m330b(f391q[i], false);
                    return;
                }
                f391q[i][22] = -1;
                if ((f391q[i][13] & 65536) != 0) {
                    int[] iArr7 = f391q[i];
                    iArr7[13] = iArr7[13] & -65537;
                    int[] iArr8 = f391q[i];
                    iArr8[13] = iArr8[13] & -131073;
                    m285a(14, i, (int) (short) (f391q[i][0] & 65535), (int) (short) ((f391q[i][0] & -65536) >> 16), 0, false);
                    return;
                }
                return;
            }
            if ((f391q[i][3] & 2) != 0) {
                C0001a.m135b(f391q[i]);
            }
            m272a(f422y, i8, f390q);
            int[] iArr9 = f391q[i];
            iArr9[4] = iArr9[4] + f390q[0];
            int[] iArr10 = f391q[i];
            iArr10[5] = iArr10[5] + f390q[1];
            int b = m311b(f391q[i]);
            short s3 = (short) (b & 65535);
            short s4 = (short) ((b & -65536) >> 16);
            f391q[i][0] = (((short) (f391q[i][4] >> 12)) & 65535) | ((((short) (f391q[i][5] >> 12)) << 16) & -65536);
            if ((f391q[i][13] & 64) != 0 || m286a(i, 0, (int) s3, (int) s4, true, false)) {
                C0001a.m102a(f391q[i]);
                int b2 = m308b(f422y[0], f422y[1]);
                if (((short) ((f391q[i][27] & -65536) >> 16)) == b2) {
                    int[] iArr11 = f391q[i];
                    iArr11[27] = iArr11[27] & -65536;
                    int[] iArr12 = f391q[i];
                    iArr12[27] = iArr12[27] | (((short) b2) & 65535);
                }
                int[] iArr13 = f391q[i];
                iArr13[27] = iArr13[27] & 65535;
                int[] iArr14 = f391q[i];
                iArr14[27] = ((((short) b2) << 16) & -65536) | iArr14[27];
                m393f(f391q[i], ((short) (f391q[i][27] & 65535)) + 4);
                return;
            }
            int[] iArr15 = f391q[i];
            iArr15[4] = iArr15[4] - f390q[0];
            int[] iArr16 = f391q[i];
            iArr16[5] = iArr16[5] - f390q[1];
            f391q[i][0] = (((short) (f391q[i][4] >> 12)) & 65535) | ((((short) (f391q[i][5] >> 12)) << 16) & -65536);
            m330b(f391q[i], false);
            C0001a.m102a(f391q[i]);
            m393f(f391q[i], ((short) (f391q[i][27] & 65535)) + 0);
            mo11g(i);
            return;
        }
        mo11g(i);
    }

    /* renamed from: e */
    public static final void m382e(int i, int i2) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = (C0000HG.m58e(8192) + i) - 4096;
        f383o[f412w][5] = (C0000HG.m58e(8192) + i2) - 4096;
        f383o[f412w][6] = 16384;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 40;
        f383o[f412w][11] = 10;
        f383o[f412w][12] = 0;
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: e */
    public static final void m383e(int i, int i2, int i3) {
        if (i >= 0 && i2 >= 0 && i2 < C0001a.f94F * 2 && i < C0001a.f154r * 2) {
            int[] iArr = f217S;
            int i4 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 1;
            iArr[i4] = iArr[i4] & 65535;
            int[] iArr2 = f217S;
            int i5 = (C0001a.f154r * i2 * 2 * 3) + (i * 3) + 1;
            iArr2[i5] = iArr2[i5] | ((((short) i3) << 16) & -65536);
        }
    }

    /* renamed from: e */
    public static final void m384e(Graphics graphics) {
        if (f265ae != -1) {
            int i = (f391q[f265ae][4] * C0001a.f136i) >> 12;
            int i2 = (f391q[f265ae][5] * C0001a.f136i) >> 12;
            int i3 = f345g ? 1 : 0;
            short[] a = m274a(f391q[f265ae], true);
            m319b(a[0] + i, a[1] + i2, 151, 0, i3, 0, graphics);
            m319b(a[2] + i, a[1] + i2, 151, 0, i3, 2, graphics);
            m319b(a[2] + i, a[3] + i2, 151, 0, i3, 3, graphics);
            m319b(a[0] + i, a[3] + i2, 151, 0, i3, 1, graphics);
        }
    }

    /* renamed from: e */
    public static final void m385e(int[] iArr) {
        short s = (short) ((iArr[2] & -65536) >> 16);
        switch (f407u[(byte) (iArr[6] & 255)][0]) {
            case 448:
                m350c((int) s, f418x);
                return;
            case 452:
                m350c((int) s, f211P);
                return;
            case 458:
                m350c((int) s, f211P);
                return;
            default:
                return;
        }
    }

    /* renamed from: e */
    public static final void m386e(int[] iArr, int i) {
        if ((iArr[3] & 4) != 0) {
            iArr[8] = iArr[8] & -65536;
            iArr[8] = iArr[8] | (((short) i) & 65535);
            m428i(iArr, 0);
            m231a(iArr, 0);
            m342c(iArr, 0);
        }
    }

    /* renamed from: e */
    public static final void m387e(int[] iArr, Graphics graphics) {
        int i;
        int i2;
        int i3;
        boolean z;
        short s = (short) ((iArr[2] & -65536) >> 16);
        switch (f407u[(byte) (iArr[6] & 255)][0]) {
            case 448:
                i = -1;
                i2 = -1;
                i3 = -1;
                z = false;
                break;
            case 452:
                i3 = 173;
                i = 4096;
                i2 = 0;
                z = true;
                break;
            case 458:
                i = -1;
                i2 = -1;
                i3 = -1;
                z = false;
                break;
            default:
                return;
        }
        if (!z) {
            i3 = 180;
            i = 4096;
            i2 = 0;
            z = true;
        }
        if (!z) {
            i3 = 181;
            i = 4096;
            i2 = 0;
        }
        if (((byte) ((iArr[6] >> 16) & 255)) == 2) {
            if (f375m[s] != null) {
                C0001a.m155c(f375m[s], f203L);
            } else {
                f203L[0] = iArr[9];
                f203L[1] = iArr[10];
            }
            int i4 = f203L[0] - iArr[4];
            int i5 = f203L[1] - iArr[5];
            int i6 = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
            int i7 = (((iArr[5] * C0001a.f136i) >> 12) - f303c) - ((i * C0001a.f136i) >> 12);
            if (m339c(i3, i2)) {
                m246a(i6, i7, i3, i2, 0, i4, i5, graphics);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v57, types: [int] */
    /* JADX WARNING: type inference failed for: r6v23 */
    /* JADX WARNING: type inference failed for: r0v71, types: [int] */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m388e() {
        /*
            r5 = -2
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r3 = 1
            r4 = 2
            r1 = 0
            int[] r0 = f414w
            r2 = 11
            r0 = r0[r2]
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            return r1
        L_0x000f:
            int r0 = p000.C0001a.f102N
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            short r0 = (short) r0
            if (r0 != r3) goto L_0x000e
            int r0 = p000.C0001a.f102N
            r0 = r0 & r12
            int r0 = r0 >> 16
            short r0 = (short) r0
            if (r0 != r4) goto L_0x000e
            r0 = 10
            int r0 = p000.C0000HG.m58e(r0)
            if (r0 != 0) goto L_0x000e
            int[] r0 = f414w
            r0 = r0[r1]
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            short r7 = (short) r0
            int[] r0 = f414w
            r0 = r0[r1]
            r0 = r0 & r12
            int r0 = r0 >> 16
            short r8 = (short) r0
            int[][] r0 = p000.C0001a.f115b
            r0 = r0[r8]
            r0 = r0[r7]
            r0 = r0 & r12
            int r0 = r0 >> 16
            short r0 = (short) r0
            r9 = r0 & 255(0xff, float:3.57E-43)
            r6 = r5
        L_0x0046:
            if (r6 > r4) goto L_0x0086
            r2 = r5
        L_0x0049:
            if (r2 > r4) goto L_0x0082
            int r0 = r7 + r6
            if (r0 >= 0) goto L_0x0053
        L_0x004f:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0049
        L_0x0053:
            int r0 = r7 + r6
            int r10 = p000.C0001a.f154r
            if (r0 >= r10) goto L_0x004f
            int r0 = r8 + r2
            if (r0 < 0) goto L_0x004f
            int r0 = r8 + r2
            int r10 = p000.C0001a.f94F
            if (r0 >= r10) goto L_0x004f
            int[][] r0 = p000.C0001a.f115b
            int r10 = r8 + r2
            r0 = r0[r10]
            int r10 = r7 + r6
            r0 = r0[r10]
            r0 = r0 & r12
            int r0 = r0 >> 16
            short r0 = (short) r0
            r10 = r0 & 255(0xff, float:3.57E-43)
            r0 = r1
        L_0x0074:
            int[] r11 = f180A
            int r11 = r11.length
            if (r0 >= r11) goto L_0x004f
            int[] r11 = f180A
            r11 = r11[r0]
            if (r10 == r11) goto L_0x000e
            int r0 = r0 + 1
            goto L_0x0074
        L_0x0082:
            int r0 = r6 + 1
            r6 = r0
            goto L_0x0046
        L_0x0086:
            r6 = 4
            r0 = r1
            r2 = r1
        L_0x0089:
            int[] r5 = f382o
            int r5 = r5.length
            if (r0 >= r5) goto L_0x0098
            int[] r5 = f382o
            r5 = r5[r0]
            if (r9 != r5) goto L_0x0095
            r2 = r3
        L_0x0095:
            int r0 = r0 + 1
            goto L_0x0089
        L_0x0098:
            int r0 = p000.C0000HG.m58e(r4)
            if (r0 != 0) goto L_0x00ae
            r0 = r1
        L_0x009f:
            int[] r5 = f197I
            int r5 = r5.length
            if (r0 >= r5) goto L_0x00ae
            int[] r5 = f197I
            r5 = r5[r0]
            if (r9 != r5) goto L_0x00ab
            r2 = r4
        L_0x00ab:
            int r0 = r0 + 1
            goto L_0x009f
        L_0x00ae:
            r0 = r1
            r5 = r1
        L_0x00b0:
            int[] r7 = f185C
            int r7 = r7.length
            if (r0 >= r7) goto L_0x00bf
            int[] r7 = f185C
            r7 = r7[r0]
            if (r9 != r7) goto L_0x00bc
            r5 = r4
        L_0x00bc:
            int r0 = r0 + 1
            goto L_0x00b0
        L_0x00bf:
            r0 = r1
        L_0x00c0:
            int[] r7 = f219T
            int r7 = r7.length
            if (r0 >= r7) goto L_0x00cf
            int[] r7 = f219T
            r7 = r7[r0]
            if (r9 != r7) goto L_0x00cc
            r5 = r3
        L_0x00cc:
            int r0 = r0 + 1
            goto L_0x00c0
        L_0x00cf:
            r0 = r1
        L_0x00d0:
            int[] r7 = f370l
            int r7 = r7.length
            if (r0 >= r7) goto L_0x00df
            int[] r7 = f370l
            r7 = r7[r0]
            if (r9 != r7) goto L_0x00dc
            r5 = r3
        L_0x00dc:
            int r0 = r0 + 1
            goto L_0x00d0
        L_0x00df:
            int[] r0 = f414w
            r7 = 30
            r0 = r0[r7]
            switch(r0) {
                case 0: goto L_0x00e9;
                case 1: goto L_0x013c;
                case 2: goto L_0x013e;
                case 3: goto L_0x0140;
                default: goto L_0x00e8;
            }
        L_0x00e8:
            r4 = r6
        L_0x00e9:
            p000.C0001a.m180m()
            r0 = 432(0x1b0, float:6.05E-43)
            java.lang.String r0 = p000.C0000HG.m0a(r0)
        L_0x00f2:
            int r6 = p000.C0001a.f104a
            if (r1 >= r6) goto L_0x016c
            java.lang.String r6 = ""
            int[] r7 = p000.C0001a.f139j
            r7 = r7[r1]
            switch(r7) {
                case 0: goto L_0x0142;
                case 1: goto L_0x0149;
                case 2: goto L_0x0150;
                case 3: goto L_0x0157;
                case 4: goto L_0x0165;
                case 5: goto L_0x015e;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            java.lang.StringBuffer r0 = r7.append(r0)
            java.lang.String r7 = " "
            java.lang.StringBuffer r0 = r0.append(r7)
            java.lang.StringBuffer r0 = r0.append(r6)
            java.lang.String r6 = " "
            java.lang.StringBuffer r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            int r6 = r1 + 1
            int r7 = p000.C0001a.f104a
            if (r6 >= r7) goto L_0x0139
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            java.lang.StringBuffer r0 = r6.append(r0)
            r6 = 433(0x1b1, float:6.07E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            java.lang.StringBuffer r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
        L_0x0139:
            int r1 = r1 + 1
            goto L_0x00f2
        L_0x013c:
            r4 = 3
            goto L_0x00e9
        L_0x013e:
            r4 = r1
            goto L_0x00e9
        L_0x0140:
            r4 = r3
            goto L_0x00e9
        L_0x0142:
            r6 = 175(0xaf, float:2.45E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            goto L_0x00ff
        L_0x0149:
            r6 = 176(0xb0, float:2.47E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            goto L_0x00ff
        L_0x0150:
            r6 = 177(0xb1, float:2.48E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            goto L_0x00ff
        L_0x0157:
            r6 = 178(0xb2, float:2.5E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            goto L_0x00ff
        L_0x015e:
            r6 = 179(0xb3, float:2.51E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            goto L_0x00ff
        L_0x0165:
            r6 = 180(0xb4, float:2.52E-43)
            java.lang.String r6 = p000.C0000HG.m0a(r6)
            goto L_0x00ff
        L_0x016c:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.StringBuffer r0 = r1.append(r0)
            r1 = 434(0x1b2, float:6.08E-43)
            java.lang.String r1 = p000.C0000HG.m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            m340c(r2, r5, r4)
            r1 = 314(0x13a, float:4.4E-43)
            java.lang.String r1 = p000.C0000HG.m0a(r1)
            r2 = 102(0x66, float:1.43E-43)
            r4 = 101(0x65, float:1.42E-43)
            m261a(r0, r1, r2, r4)
            r1 = r3
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m388e():boolean");
    }

    /* renamed from: e */
    public static final boolean m389e(int i) {
        try {
            C0000HG.m80m();
            if (i == 3) {
                f317d = System.currentTimeMillis();
                C0000HG.f16a.writeLong(f317d);
            } else {
                f231a = System.currentTimeMillis();
                C0000HG.f16a.writeLong(f231a);
            }
            if (f414w[11] == -1) {
                f414w[11] = 0;
                f414w[0] = (((short) f297b[0][3]) & 65535) | ((((short) f297b[0][4]) << 16) & -65536);
            }
            C0000HG.m27a(f414w);
            C0000HG.m27a(f187D);
            C0000HG.m27a(f378n);
            C0000HG.m27a(f209O);
            C0000HG.m27a(f201K);
            C0000HG.m27a(f398s);
            C0000HG.m27a(f402t);
            C0000HG.m27a(f205M);
            C0000HG.m27a(f199J);
            C0000HG.m27a(f386p);
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 15; i3++) {
                    C0000HG.m27a(f253a[i2][i3]);
                }
            }
            for (int i4 = 0; i4 < 19; i4++) {
                C0000HG.m27a(f399s[i4]);
            }
            C0000HG.m58e(i);
            C0000HG.f14a = null;
            C0000HG.f16a = null;
            C0000HG.f13a = null;
            C0000HG.f15a = null;
            return true;
        } catch (Exception e) {
            C0000HG.f14a = null;
            C0000HG.f16a = null;
            C0000HG.f13a = null;
            C0000HG.f15a = null;
            return false;
        }
    }

    /* renamed from: e */
    private static final boolean m390e(int i, int i2) {
        short s = f251a[i][(i2 * 6) + 0];
        short s2 = f251a[i][(i2 * 6) + 1];
        for (int i3 = 0; i3 < 8; i3++) {
            if (!(i3 == i || f302b[i3] == null)) {
                for (int i4 = 0; i4 < f254a[i3].length; i4++) {
                    if (s == f251a[i3][(i4 * 6) + 0] && f251a[i3][(i4 * 6) + 1] == -1 && s2 == -1) {
                        f254a[i][i2] = new Image[1];
                        f254a[i][i2][0] = f254a[i3][i4][0];
                        f252a[i][i2] = f252a[i3][i4];
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static final int m391f(int i) {
        if (i >= 30) {
            return -1;
        }
        return i * i * 60;
    }

    /* renamed from: f */
    public static final int m392f(int[] iArr) {
        if ((iArr[3] & 16) != 0) {
            return (short) (f414w[14] & 65535);
        }
        if ((iArr[3] & 32) == 0) {
            return 0;
        }
        return f249a[iArr[11]][7];
    }

    /* renamed from: f */
    public static final int m393f(int[] iArr, int i) {
        int q = m463q(iArr);
        if (q != -1 && i >= 0 && i < f312c[q].length) {
            return f312c[q][i];
        }
        return -1;
    }

    /* renamed from: f */
    public static final void m394f() {
        int i;
        int i2;
        int[][] iArr;
        int i3 = f414w[40];
        if ((f414w[39] & (1 << i3)) == 0) {
            f235a = C0000HG.m0a(429);
            return;
        }
        short s = (short) (f414w[i3 + 31] & 65535);
        short s2 = (short) ((f414w[i3 + 31] & -65536) >> 16);
        int[][] iArr2 = f253a[s];
        int[][] iArr3 = null;
        switch (s) {
            case 0:
                iArr = f333e;
                int i4 = -1;
                i2 = -1;
                for (int i5 = 6; i5 <= 7; i5++) {
                    if (iArr2[s2][i5] > 0) {
                        if (f349g[(short) ((iArr2[s2][i5] & -65536) >> 16)][1] == 0) {
                            i2 = f349g[(short) ((iArr2[s2][i5] & -65536) >> 16)][0];
                        } else {
                            i4 = f349g[(short) ((iArr2[s2][i5] & -65536) >> 16)][0];
                        }
                    }
                }
                i = i4;
                break;
            case 1:
                i = -1;
                i2 = -1;
                iArr = f387p;
                break;
            case 2:
                i = -1;
                i2 = -1;
                iArr = f395r;
                break;
            case 3:
                i = -1;
                i2 = -1;
                iArr = f354h;
                break;
            case 4:
                i = -1;
                i2 = -1;
                iArr = f407u;
                break;
            default:
                i = -1;
                i2 = -1;
                iArr = iArr3;
                break;
        }
        f235a = "";
        if (i2 >= 0) {
            f235a = new StringBuffer().append(f235a).append(C0000HG.m0a(i2)).append(" ").toString();
        }
        f235a = new StringBuffer().append(f235a).append(C0000HG.m0a(iArr[iArr2[s2][4]][0])).toString();
        if (i >= 0) {
            f235a = new StringBuffer().append(f235a).append(" ").append(C0000HG.m0a(i)).toString();
        }
    }

    /* renamed from: f */
    public static final void m395f(int i) {
        m258a(m220a(i));
    }

    /* renamed from: f */
    public static final void m396f(int i, int i2) {
        f414w[4] = (i << 12) + 2048;
        f414w[5] = (i2 << 12) + 2048;
        if (C0001a.f125e >= 0) {
            f414w[30] = C0001a.f125e;
            C0001a.f125e = -1;
        }
        f265ae = -1;
        f184C = -1;
        f316d = -1;
        f373m = true;
        m364d(f414w, 0);
        m379e(f414w, 0);
        m428i(f414w, 0);
        for (int i3 = 0; i3 < m415h(f414w); i3++) {
            m328b(f414w, i3, 0);
        }
        for (int i4 = 0; i4 < m431j(f414w); i4++) {
            m372d(f414w, i4, 0);
        }
        for (int i5 = 0; i5 < m230a(f414w); i5++) {
            m271a(f414w, i5, 0);
        }
        m393f(f414w, 0);
        C0001a.m119a(f414w, i, i2);
    }

    /* renamed from: f */
    public static final void m397f(int i, int i2, int i3) {
        f348g[(i * 3) + 0] = (short) i2;
        f348g[(i * 3) + 1] = (short) i3;
        f348g[(i * 3) + 2] = 0;
    }

    /* renamed from: f */
    public static final void m398f(Graphics graphics) {
        int i;
        int i2 = 100;
        if (f421y) {
            m453n(graphics);
            return;
        }
        graphics.setClip(0, 0, f260aC, f368l);
        graphics.setColor(0);
        graphics.fillRect(0, 0, f260aC, f368l);
        switch (f196I) {
            case 1:
            case 3:
                if (f233a != null) {
                    int i3 = f260aC >> 1;
                    byte b = (byte) ((f339f[1] >> 16) & 255);
                    int i4 = C0002b.f170a;
                    if (i4 <= 100) {
                        i2 = i4;
                    }
                    graphics.setFont(f246a[1]);
                    graphics.setClip(0, 0, f260aC, f368l);
                    try {
                        if (f290b != null) {
                            graphics.setColor(f191F[27]);
                        } else {
                            graphics.setColor(f191F[8]);
                        }
                    } catch (Exception e) {
                        graphics.setColor(16777215);
                    }
                    graphics.fillRect(0, 0, f260aC, f368l);
                    if (f290b != null) {
                        graphics.drawImage(f290b, f260aC / 2, f368l / 2, 3);
                        graphics.setColor(f191F[3]);
                        i = ((f368l - b) - 20) + 0;
                    } else {
                        graphics.setColor(f191F[5]);
                        i = f368l >> 1;
                    }
                    try {
                        graphics.drawString(f328e, ((byte) (f339f[1] & 255)) + i3, (i - b) + ((byte) ((f339f[1] >> 8) & 255)), 17);
                    } catch (Exception e2) {
                    }
                    int i5 = i + 5;
                    graphics.drawRect(i3 - ((f260aC >> 1) / 2), i5, f260aC >> 1, 10);
                    graphics.fillRect((i3 + 2) - ((f260aC >> 1) / 2), i5 + 2, (i2 * ((f260aC >> 1) - 3)) / 100, 7);
                    return;
                } else if (f196I == 1) {
                    m419h(graphics);
                    return;
                } else {
                    return;
                }
            case 2:
                m419h(graphics);
                return;
            case 6:
                synchronized (f233a.f172a) {
                    if (f414w[11] != 0) {
                        m369d(graphics);
                    } else {
                        m465q(graphics);
                    }
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: f */
    public static final void m399f(int[] iArr) {
        if (iArr[12] != -1) {
            C0001a.m155c(C0001a.f124d[iArr[12]], f223V);
            f223V[1] = C0001a.m147c(C0001a.f124d[iArr[12]]) + 1;
            iArr[4] = f223V[0];
            iArr[5] = f223V[1] + 1;
        }
    }

    /* renamed from: f */
    public static final void m400f(int[] iArr, int i) {
        if ((iArr[3] & 4) != 0 && m459p(iArr) != i) {
            m231a(iArr, 0);
            m342c(iArr, 0);
            m312b(iArr, i);
        }
    }

    /* renamed from: f */
    public static final void m401f(int[] iArr, Graphics graphics) {
        int i = (((iArr[4] * C0001a.f136i) >> 12) + ((iArr[7] * C0001a.f136i) >> 12)) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        if (m446l(178)) {
            m249a(i, i2, 178, 0, graphics);
        }
    }

    /* renamed from: f */
    public static final boolean m402f(int i) {
        int i2;
        int i3;
        int i4;
        long j;
        short s;
        short s2 = (short) (f391q[i][20] & 65535);
        int i5 = f391q[i][29];
        int i6 = i5 >> 11;
        int i7 = i5 * i5;
        long j2 = -1;
        if (s2 >= 0) {
            int b = m311b(f391q[i]);
            int b2 = m311b(C0001a.f124d[s2]);
            f410v[0] = ((short) (65535 & b)) << 11;
            f410v[1] = ((short) ((b & -65536) >> 16)) << 11;
            if ((C0001a.f124d[s2][3] & 16) != 0) {
                i3 = 1;
                i4 = 1;
            } else {
                int[] a = m230a(C0001a.f124d[s2]);
                i3 = (((short) ((a[3] & -65536) >> 16)) - ((short) ((a[2] & -65536) >> 16))) >> 11;
                i4 = (((short) (a[3] & 65535)) - ((short) (a[2] & 65535))) >> 11;
            }
            f390q[0] = ((short) (65535 & b2)) << 11;
            f390q[1] = ((short) ((-65536 & b2) >> 16)) << 11;
            int i8 = -i6;
            i2 = -1;
            while (i8 <= i6 + i4) {
                int i9 = -i6;
                int i10 = i2;
                while (i9 <= i6 + i3) {
                    if (i9 == 0 && i8 == 0) {
                        j = j2;
                        s = i10;
                    } else {
                        int i11 = ((short) (65535 & b2)) + i8;
                        int i12 = ((short) ((-65536 & b2) >> 16)) + i9;
                        f422y[0] = i11 << 11;
                        f422y[1] = i12 << 11;
                        long a2 = m235a(f422y, f410v);
                        if (m235a(f422y, f390q) > ((long) i7) || !m286a(i, 1, i11, i12, true, false) || (a2 >= j2 && j2 != -1)) {
                            j = j2;
                            s = i10;
                        } else {
                            s = (((short) i11) & 65535) | ((((short) i12) << 16) & -65536);
                            j = a2;
                        }
                    }
                    i9++;
                    j2 = j;
                    i10 = s;
                }
                i8++;
                i2 = i10;
            }
        } else {
            i2 = -1;
        }
        if (i2 < 0) {
            return false;
        }
        f391q[i][22] = i2;
        return true;
    }

    /* renamed from: f */
    public static final boolean m403f(int i, int i2) {
        return i >= 0 && i2 >= 0 && i2 < C0001a.f115b.length && i < C0001a.f115b[i2].length && (C0001a.f115b[i2][i] & 32768) != 0 && (C0001a.f115b[i2][i] & 255) != 255;
    }

    /* renamed from: g */
    public static final int mo11g(int i) {
        if (i >= 65536) {
            if (i >= 16777216) {
                int i2 = i >= 268435456 ? i >= 1073741824 ? f183B[i >> 24] << 8 : f183B[i >> 22] << 7 : i >= 67108864 ? f183B[i >> 20] << 6 : f183B[i >> 18] << 5;
                int i3 = ((i / i2) + (i2 + 1)) >> 1;
                int i4 = ((i / i3) + (i3 + 1)) >> 1;
                return i4 * i4 > i ? i4 - 1 : i4;
            }
            int i5 = i >= 1048576 ? i >= 4194304 ? f183B[i >> 16] << 4 : f183B[i >> 14] << 3 : i >= 262144 ? f183B[i >> 12] << 2 : f183B[i >> 10] << 1;
            int i6 = ((i / i5) + (i5 + 1)) >> 1;
            return i6 * i6 > i ? i6 - 1 : i6;
        } else if (i >= 256) {
            int i7 = i >= 4096 ? i >= 16384 ? f183B[i >> 8] + 1 : (f183B[i >> 6] >> 1) + 1 : i >= 1024 ? (f183B[i >> 4] >> 2) + 1 : (f183B[i >> 2] >> 3) + 1;
            return i7 * i7 > i ? i7 - 1 : i7;
        } else if (i >= 0) {
            return f183B[i] >> 4;
        } else {
            return -1;
        }
    }

    /* renamed from: g */
    public static final int m405g(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        return (short) ((iArr[6] & -65536) >> 16);
    }

    /* renamed from: g */
    public static final int m406g(int[] iArr, int i) {
        if (m463q(iArr) == -1) {
            return -1;
        }
        int a = m230a(iArr);
        if (i < 0 && i >= a) {
            return -1;
        }
        int d = m364d(iArr, m415h(iArr) + m431j(iArr) + i);
        if (d < 0 || d >= m231a(iArr, i)) {
            return -1;
        }
        return d;
    }

    /* renamed from: g */
    public static final void m407g(int i, int i2) {
        if (i >= 0 || i < 273) {
            int[] iArr = f362j;
            iArr[i] = iArr[i] | 1;
            if (i2 < 15) {
                int[] iArr2 = f362j;
                iArr2[i] = iArr2[i] | (1 << (i2 + 1));
            }
        }
    }

    /* renamed from: g */
    public static final void m408g(int i, int i2, int i3) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = 0;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 20;
        f383o[f412w][11] = 13;
        f383o[f412w][12] = i3;
        for (int i4 = 0; i4 < 60; i4 += 6) {
            f299b[f412w][i4 + 0] = (short) (C0000HG.m58e(4096) - 2048);
            f299b[f412w][i4 + 1] = (short) (C0000HG.m58e(4096) - 2048);
            f299b[f412w][i4 + 2] = (short) (C0000HG.m58e(12288) + 0);
            f299b[f412w][i4 + 3] = 0;
            f299b[f412w][i4 + 4] = 0;
            f299b[f412w][i4 + 5] = 0;
        }
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: g */
    public static final void m409g(Graphics graphics) {
        int i = f296b[1486] + 5;
        int i2 = ((byte) ((f339f[2] >> 16) & 255)) + 3;
        graphics.setColor(f191F[6]);
        graphics.fillRect(0, f360j, f260aC, f230a);
        graphics.setColor(f191F[3]);
        graphics.fillRect(3, f360j + i2 + 2, f260aC - 6, (f230a - (i + i2)) - 2);
        graphics.fillRect(3, ((f360j + f230a) + 2) - i, f260aC - 6, i - 5);
        graphics.setColor(f191F[8]);
        graphics.fillRect(3, f360j + 3, f260aC - 6, i2 - 3);
        graphics.setColor(f191F[5]);
        graphics.drawRect(1, f360j + 1, f260aC - 3, f230a - 3);
        graphics.drawRect(1, f360j + i2, f260aC - 3, f230a - (i2 + i));
        m249a(1, f360j + 1, 152, 0, graphics);
        m247a(f260aC - 1, f360j + 1, 152, 0, 0, 2, graphics);
        if (f179A) {
            m249a((f260aC >> 1) - (f296b[1639] / f296b[1644]), ((f360j + f230a) - i) + 4, 149, 0, graphics);
            m249a(f260aC >> 1, ((f360j + f230a) - i) + 4, 149, 1, graphics);
        }
        int i3 = f296b[1485] / f296b[1490];
        if (f202L != 106) {
            m249a((i3 >> 1) + 4, (f360j + f230a) - 3, 135, 0, graphics);
        }
        if (f259aB != 106) {
            m249a((f260aC - 2) - (i3 >> 1), (f360j + f230a) - 3, 135, 1, graphics);
        }
    }

    /* renamed from: g */
    public static final void m410g(int[] iArr) {
        if ((iArr[10] & 65536) != 0) {
            byte b = (byte) ((iArr[10] >> 24) & 255);
            if (b >= 2) {
                int i = ((short) (iArr[10] & 65535)) + 1;
                if (i < f296b[(f415w[iArr[4]][1] * 11) + 5]) {
                    iArr[10] = iArr[10] & -65536;
                    iArr[10] = (((short) i) & 65535) | iArr[10];
                } else if ((iArr[10] & 131072) != 0) {
                    iArr[10] = iArr[10] & -65536;
                    iArr[10] = iArr[10] | 0;
                } else {
                    iArr[10] = iArr[10] & -65537;
                }
                iArr[10] = iArr[10] & 16777215;
                iArr[10] = iArr[10] | 16777216;
                return;
            }
            int i2 = b + 1;
            iArr[10] = iArr[10] & 16777215;
            iArr[10] = ((((byte) i2) << 24) & -16777216) | iArr[10];
        }
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [byte[][]] */
    /* JADX WARNING: type inference failed for: r21v0, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r13v0 */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r15v1 */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r12v1 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r12v2, types: [int] */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r6v77 */
    /* JADX WARNING: type inference failed for: r15v4 */
    /* JADX WARNING: type inference failed for: r15v5 */
    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: type inference failed for: r15v6, types: [byte] */
    /* JADX WARNING: type inference failed for: r3v324, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v204, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v206, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v329, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v209, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v333, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v3 */
    /* JADX WARNING: type inference failed for: r14v85, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v213, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v337, types: [byte] */
    /* JADX WARNING: type inference failed for: r7v120, types: [byte] */
    /* JADX WARNING: type inference failed for: r6v78, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v4 */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r17v5 */
    /* JADX WARNING: type inference failed for: r14v86, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v217, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v342, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v200, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v220, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v348, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v204, types: [byte] */
    /* JADX WARNING: type inference failed for: r6v83, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v5 */
    /* JADX WARNING: type inference failed for: r17v6 */
    /* JADX WARNING: type inference failed for: r14v87, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v224, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v354, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v208, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v6 */
    /* JADX WARNING: type inference failed for: r17v7 */
    /* JADX WARNING: type inference failed for: r14v88, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v108, types: [byte] */
    /* JADX WARNING: type inference failed for: r7v122, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v7 */
    /* JADX WARNING: type inference failed for: r13v7 */
    /* JADX WARNING: type inference failed for: r18v7 */
    /* JADX WARNING: type inference failed for: r17v8 */
    /* JADX WARNING: type inference failed for: r14v89, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v109, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r18v8 */
    /* JADX WARNING: type inference failed for: r17v9 */
    /* JADX WARNING: type inference failed for: r14v90, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v230, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v361, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v9 */
    /* JADX WARNING: type inference failed for: r17v10 */
    /* JADX WARNING: type inference failed for: r14v91, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v111, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v10 */
    /* JADX WARNING: type inference failed for: r18v10 */
    /* JADX WARNING: type inference failed for: r17v11 */
    /* JADX WARNING: type inference failed for: r14v92, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v112, types: [byte] */
    /* JADX WARNING: type inference failed for: r7v123, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v11 */
    /* JADX WARNING: type inference failed for: r13v11 */
    /* JADX WARNING: type inference failed for: r18v11 */
    /* JADX WARNING: type inference failed for: r17v12 */
    /* JADX WARNING: type inference failed for: r14v93, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v113, types: [byte] */
    /* JADX WARNING: type inference failed for: r7v124, types: [byte] */
    /* JADX WARNING: type inference failed for: r6v84, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v12 */
    /* JADX WARNING: type inference failed for: r13v12 */
    /* JADX WARNING: type inference failed for: r18v12 */
    /* JADX WARNING: type inference failed for: r17v13 */
    /* JADX WARNING: type inference failed for: r3v366, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v238, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v213, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v14 */
    /* JADX WARNING: type inference failed for: r3v369, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v244, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v246, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v374, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v219, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v15 */
    /* JADX WARNING: type inference failed for: r3v379, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v250, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v223, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v17 */
    /* JADX WARNING: type inference failed for: r3v382, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v256, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v116, types: [byte] */
    /* JADX WARNING: type inference failed for: r7v125, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v18 */
    /* JADX WARNING: type inference failed for: r13v16 */
    /* JADX WARNING: type inference failed for: r18v16 */
    /* JADX WARNING: type inference failed for: r14v98, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v117, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v19 */
    /* JADX WARNING: type inference failed for: r18v17 */
    /* JADX WARNING: type inference failed for: r17v18 */
    /* JADX WARNING: type inference failed for: r14v99, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v118, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v20 */
    /* JADX WARNING: type inference failed for: r18v18 */
    /* JADX WARNING: type inference failed for: r17v19 */
    /* JADX WARNING: type inference failed for: r14v100, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v261, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v388, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v21 */
    /* JADX WARNING: type inference failed for: r17v20 */
    /* JADX WARNING: type inference failed for: r14v101, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v266, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v392, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v269, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v396, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v22 */
    /* JADX WARNING: type inference failed for: r17v21 */
    /* JADX WARNING: type inference failed for: r14v102, types: [byte] */
    /* JADX WARNING: type inference failed for: r8v121, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v23 */
    /* JADX WARNING: type inference failed for: r18v21 */
    /* JADX WARNING: type inference failed for: r17v22 */
    /* JADX WARNING: type inference failed for: r3v399, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v274, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v233, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v279, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v403, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r5v237, types: [byte] */
    /* JADX WARNING: type inference failed for: r7v131, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v24 */
    /* JADX WARNING: type inference failed for: r13v22 */
    /* JADX WARNING: type inference failed for: r3v408, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v283, types: [byte] */
    /* JADX WARNING: type inference failed for: r4v285, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r3v413, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v25 */
    /* JADX WARNING: type inference failed for: r14v105, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v26 */
    /* JADX WARNING: type inference failed for: r17v25 */
    /* JADX WARNING: type inference failed for: r3v416, types: [byte, int] */
    /* JADX WARNING: type inference failed for: r4v289, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v27 */
    /* JADX WARNING: type inference failed for: r14v107, types: [byte] */
    /* JADX WARNING: type inference failed for: r12v28 */
    /* JADX WARNING: type inference failed for: r17v27 */
    /* JADX WARNING: type inference failed for: r12v29 */
    /* JADX WARNING: type inference failed for: r6v85 */
    /* JADX WARNING: type inference failed for: r15v7 */
    /* JADX WARNING: type inference failed for: r15v8 */
    /* JADX WARNING: type inference failed for: r15v9 */
    /* JADX WARNING: type inference failed for: r15v10 */
    /* JADX WARNING: type inference failed for: r15v11 */
    /* JADX WARNING: type inference failed for: r15v12 */
    /* JADX WARNING: type inference failed for: r15v13 */
    /* JADX WARNING: type inference failed for: r15v14 */
    /* JADX WARNING: type inference failed for: r15v15 */
    /* JADX WARNING: type inference failed for: r15v16 */
    /* JADX WARNING: type inference failed for: r15v17 */
    /* JADX WARNING: type inference failed for: r15v18 */
    /* JADX WARNING: type inference failed for: r15v19 */
    /* JADX WARNING: type inference failed for: r15v20 */
    /* JADX WARNING: type inference failed for: r15v21 */
    /* JADX WARNING: type inference failed for: r15v22 */
    /* JADX WARNING: type inference failed for: r15v23 */
    /* JADX WARNING: type inference failed for: r15v24 */
    /* JADX WARNING: type inference failed for: r15v25 */
    /* JADX WARNING: type inference failed for: r15v26 */
    /* JADX WARNING: type inference failed for: r15v27 */
    /* JADX WARNING: type inference failed for: r15v28 */
    /* JADX WARNING: type inference failed for: r15v29 */
    /* JADX WARNING: type inference failed for: r15v30 */
    /* JADX WARNING: type inference failed for: r15v31 */
    /* JADX WARNING: type inference failed for: r15v32 */
    /* JADX WARNING: type inference failed for: r15v33 */
    /* JADX WARNING: type inference failed for: r15v34 */
    /* JADX WARNING: type inference failed for: r15v35 */
    /* JADX WARNING: type inference failed for: r15v36 */
    /* JADX WARNING: type inference failed for: r15v37 */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r7 == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006c, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r3 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0813, code lost:
        if (f217S == null) goto L_0x0859;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0815, code lost:
        f391q[r17][22] = (((short) (r18 * 2)) & 65535) | ((((short) (r13 * 2)) << 16) & -65536);
        r3 = f391q[r17];
        r3[13] = r3[13] | 65536;
        r7 = true;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r8 = r18;
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r4 != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0859, code lost:
        m309b(r17, r18, r13);
        m285a(14, r17, r18, r13, 0, false);
        r7 = true;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r8 = r18;
        r14 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        r9 = r3;
        r10 = r4;
        r11 = r5;
        r6 = r12;
        r7 = r13;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x003d, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x003d, code lost:
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0443, code lost:
        r4 = r11 - 1;
        r18 = r24[r4];
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x044a, code lost:
        if (r18 <= r6) goto L_0x045b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x044c, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x044d, code lost:
        r11 = r4 + 1;
        r24[r4] = r3;
        r7 = true;
        r3 = r9;
        r4 = r10;
        r5 = r11;
        r8 = r18;
        r14 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x045d, code lost:
        if (r18 >= r6) goto L_0x044d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x045f, code lost:
        r3 = -1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v100, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v101, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v102, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v105, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v107, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v85, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v86, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v87, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v88, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v89, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v90, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v91, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v92, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v93, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v98, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r14v99, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r15v6, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v324, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v329, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v333, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v337, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v342, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v348, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v354, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v361, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v366, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v369, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v374, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v379, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v382, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v388, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v392, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v396, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v399, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v403, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v408, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v413, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r3v416, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v204, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v206, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v209, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v213, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v217, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v220, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v224, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v230, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v238, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v244, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v246, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v250, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v256, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v261, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v266, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v269, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v274, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v279, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v283, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v285, types: [byte, int] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r4v289, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v200, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v204, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v208, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v213, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v219, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v223, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v233, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r5v237, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r6v78, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r6v83, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r6v84, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r7v120, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r7v122, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r7v123, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r7v124, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r7v125, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r7v131, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v108, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v109, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v111, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v112, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v113, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v116, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v117, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v118, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=null, for r8v121, types: [byte] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r15v3
      assigns: []
      uses: []
      mth insns count: 1620
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0559  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x056c  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x057f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x05b0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x05dd  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x065d  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0696  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x06e7  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x07c0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x07cd  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0877  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0889  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x08e0  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0908  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x091d  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0934  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x094a  */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0960  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0975  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x09d9  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x09fd  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0a23  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0a49  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0a67  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0a91  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0aaf  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0abd  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0b23  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x0b60  */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0b80  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0c22  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0d88  */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x0d9d  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0dbe  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x03c4  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0401  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0416  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x042b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0461  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0497  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x04e5  */
    /* JADX WARNING: Unknown variable types count: 96 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m411g(int[] r24, int r25) {
        /*
            int[][] r3 = f403t
            r4 = 1
            r4 = r24[r4]
            r20 = r3[r4]
            byte[][] r3 = f297b
            r4 = 2
            r4 = r24[r4]
            r21 = r3[r4]
            r3 = 3
            r16 = r24[r3]
            r3 = 4
            r13 = r24[r3]
            r3 = 5
            r12 = r24[r3]
            r3 = 6
            r8 = r24[r3]
            r3 = 7
            r7 = r24[r3]
            r3 = 8
            r6 = r24[r3]
            r3 = 9
            r5 = r24[r3]
            r4 = 0
            r3 = 0
            r9 = r3
            r10 = r4
            r11 = r5
            r14 = r12
            r15 = r13
        L_0x002c:
            r3 = 0
            r3 = r24[r3]
            r4 = 2
            if (r3 != r4) goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            if (r15 != 0) goto L_0x0dc2
            r0 = r21
            int r3 = r0.length
            r0 = r16
            if (r0 < r3) goto L_0x004d
            r4 = 1
        L_0x003d:
            if (r4 == 0) goto L_0x0db0
            r3 = 0
            r4 = 0
            r24[r3] = r4
            r3 = -1
            f376n = r3
            r3 = 1
            f381o = r3
            r3 = 0
            f385p = r3
            goto L_0x0032
        L_0x004d:
            int r3 = r16 + 1
            byte r15 = r21[r16]
            switch(r15) {
                case 1: goto L_0x0077;
                case 2: goto L_0x00d1;
                case 3: goto L_0x0054;
                case 4: goto L_0x0077;
                case 5: goto L_0x0077;
                case 6: goto L_0x0054;
                case 7: goto L_0x0054;
                case 8: goto L_0x0054;
                case 9: goto L_0x0054;
                case 10: goto L_0x0054;
                case 11: goto L_0x0054;
                case 12: goto L_0x0054;
                case 13: goto L_0x0054;
                case 14: goto L_0x0054;
                case 15: goto L_0x0054;
                case 16: goto L_0x0054;
                case 17: goto L_0x0082;
                case 18: goto L_0x0082;
                case 19: goto L_0x0082;
                case 20: goto L_0x00a6;
                case 21: goto L_0x00a6;
                case 22: goto L_0x00a6;
                case 23: goto L_0x0054;
                case 24: goto L_0x0054;
                case 25: goto L_0x0054;
                case 26: goto L_0x0054;
                case 27: goto L_0x0082;
                case 28: goto L_0x0054;
                case 29: goto L_0x0054;
                case 30: goto L_0x0054;
                case 31: goto L_0x0054;
                case 32: goto L_0x0054;
                case 33: goto L_0x0077;
                case 34: goto L_0x0117;
                case 35: goto L_0x0117;
                case 36: goto L_0x0268;
                case 37: goto L_0x0268;
                case 38: goto L_0x0268;
                case 39: goto L_0x0189;
                case 40: goto L_0x0179;
                case 41: goto L_0x0199;
                case 42: goto L_0x0254;
                case 43: goto L_0x0254;
                case 44: goto L_0x023c;
                case 45: goto L_0x0199;
                case 46: goto L_0x0077;
                case 47: goto L_0x0296;
                case 48: goto L_0x009b;
                case 49: goto L_0x01bb;
                case 50: goto L_0x01e0;
                case 51: goto L_0x015b;
                case 52: goto L_0x0054;
                case 53: goto L_0x0217;
                case 54: goto L_0x0127;
                case 55: goto L_0x0353;
                case 56: goto L_0x0054;
                case 57: goto L_0x0054;
                case 58: goto L_0x0054;
                case 59: goto L_0x0054;
                case 60: goto L_0x0054;
                case 61: goto L_0x0054;
                case 62: goto L_0x0054;
                case 63: goto L_0x0054;
                case 64: goto L_0x0278;
                case 65: goto L_0x0278;
                case 66: goto L_0x0296;
                case 67: goto L_0x0296;
                case 68: goto L_0x02a6;
                case 69: goto L_0x02a6;
                case 70: goto L_0x0054;
                case 71: goto L_0x0054;
                case 72: goto L_0x0077;
                case 73: goto L_0x0077;
                case 74: goto L_0x0254;
                case 75: goto L_0x032d;
                case 76: goto L_0x0054;
                case 77: goto L_0x0054;
                case 78: goto L_0x0054;
                case 79: goto L_0x0054;
                case 80: goto L_0x02e3;
                case 81: goto L_0x02ba;
                default: goto L_0x0054;
            }
        L_0x0054:
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            r16 = r3
        L_0x005c:
            r19 = 1
            switch(r15) {
                case 1: goto L_0x0391;
                case 2: goto L_0x057f;
                case 3: goto L_0x054a;
                case 4: goto L_0x0559;
                case 5: goto L_0x056c;
                case 6: goto L_0x0061;
                case 7: goto L_0x0061;
                case 8: goto L_0x0061;
                case 9: goto L_0x0061;
                case 10: goto L_0x0061;
                case 11: goto L_0x0061;
                case 12: goto L_0x0061;
                case 13: goto L_0x0061;
                case 14: goto L_0x0061;
                case 15: goto L_0x0061;
                case 16: goto L_0x0061;
                case 17: goto L_0x03a4;
                case 18: goto L_0x03b1;
                case 19: goto L_0x03c4;
                case 20: goto L_0x03d7;
                case 21: goto L_0x03ec;
                case 22: goto L_0x0401;
                case 23: goto L_0x0416;
                case 24: goto L_0x0061;
                case 25: goto L_0x0061;
                case 26: goto L_0x043e;
                case 27: goto L_0x0dbe;
                case 28: goto L_0x0061;
                case 29: goto L_0x0061;
                case 30: goto L_0x0061;
                case 31: goto L_0x0061;
                case 32: goto L_0x0061;
                case 33: goto L_0x0461;
                case 34: goto L_0x0497;
                case 35: goto L_0x04b4;
                case 36: goto L_0x08e0;
                case 37: goto L_0x0908;
                case 38: goto L_0x091d;
                case 39: goto L_0x06e7;
                case 40: goto L_0x0696;
                case 41: goto L_0x05dd;
                case 42: goto L_0x0811;
                case 43: goto L_0x0877;
                case 44: goto L_0x0889;
                case 45: goto L_0x05b0;
                case 46: goto L_0x065d;
                case 47: goto L_0x04e5;
                case 48: goto L_0x0670;
                case 49: goto L_0x07b2;
                case 50: goto L_0x07cd;
                case 51: goto L_0x042b;
                case 52: goto L_0x0a91;
                case 53: goto L_0x07c0;
                case 54: goto L_0x0c22;
                case 55: goto L_0x0b80;
                case 56: goto L_0x0061;
                case 57: goto L_0x0061;
                case 58: goto L_0x0061;
                case 59: goto L_0x0061;
                case 60: goto L_0x0061;
                case 61: goto L_0x0061;
                case 62: goto L_0x0061;
                case 63: goto L_0x0061;
                case 64: goto L_0x0934;
                case 65: goto L_0x094a;
                case 66: goto L_0x0975;
                case 67: goto L_0x0a67;
                case 68: goto L_0x09d9;
                case 69: goto L_0x0a49;
                case 70: goto L_0x09fd;
                case 71: goto L_0x0a23;
                case 72: goto L_0x0960;
                case 73: goto L_0x0aaf;
                case 74: goto L_0x07e5;
                case 75: goto L_0x0b60;
                case 76: goto L_0x0d9d;
                case 77: goto L_0x0061;
                case 78: goto L_0x0061;
                case 79: goto L_0x0061;
                case 80: goto L_0x0abd;
                case 81: goto L_0x0b23;
                default: goto L_0x0061;
            }
        L_0x0061:
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
        L_0x006a:
            if (r7 == 0) goto L_0x006d
            r15 = 0
        L_0x006d:
            if (r3 != 0) goto L_0x003d
            if (r4 != 0) goto L_0x003d
            r9 = r3
            r10 = r4
            r11 = r5
            r6 = r12
            r7 = r13
            goto L_0x002c
        L_0x0077:
            int r16 = r3 + 1
            byte r14 = r21[r3]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0082:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r5
            int r16 = r4 + 1
            byte r4 = r21[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r14 = (short) r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x009b:
            int r16 = r3 + 1
            byte r14 = r21[r3]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x00a6:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r14 = (short) r3
            int r3 = r5 + 1
            byte r4 = r21[r5]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r16 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r8 = (short) r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x00d1:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r7 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r7
            int r7 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            short r4 = (short) r4
            r14 = r3 | r4
            int r3 = r7 + 1
            byte r4 = r21[r7]
            int r4 = r4 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r7 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r7
            int r7 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            short r3 = (short) r3
            r8 = r4 | r3
            int r16 = r7 + 1
            byte r7 = r21[r7]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0117:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r16 = r4 + 1
            byte r8 = r21[r4]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0127:
            int r4 = r3 + -1
            f268ah = r4
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r8 = (short) r3
            int r3 = r5 + 1
            byte r4 = r21[r5]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r16 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r7 = (short) r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x015b:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r16 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r8 = (short) r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0179:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r16 = r4 + 1
            byte r8 = r21[r4]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0189:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r16 = r4 + 1
            byte r8 = r21[r4]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0199:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r14 = (short) r3
            int r3 = r5 + 1
            byte r8 = r21[r5]
            int r16 = r3 + 1
            byte r7 = r21[r3]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x01bb:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r12 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r12
            int r16 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            short r4 = (short) r4
            r14 = r3 | r4
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x01e0:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r14 = (short) r3
            int r3 = r5 + 1
            byte r4 = r21[r5]
            int r4 = r4 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r8 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r8
            int r16 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            short r3 = (short) r3
            r8 = r4 | r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0217:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r12 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r12
            int r16 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            short r4 = (short) r4
            r14 = r3 | r4
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x023c:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r8 = r21[r4]
            int r4 = r3 + 1
            byte r7 = r21[r3]
            int r16 = r4 + 1
            byte r6 = r21[r4]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0254:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r8 = r21[r4]
            int r16 = r3 + 1
            byte r7 = r21[r3]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0268:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r16 = r4 + 1
            byte r8 = r21[r4]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0278:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r16 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r8 = (short) r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0296:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r16 = r4 + 1
            byte r8 = r21[r4]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x02a6:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r8 = r21[r4]
            int r16 = r3 + 1
            byte r7 = r21[r3]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x02ba:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r8 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r8
            int r16 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            short r3 = (short) r3
            r8 = r4 | r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x02e3:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r6 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r6
            int r6 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            short r3 = (short) r3
            r8 = r4 | r3
            int r3 = r6 + 1
            byte r4 = r21[r6]
            int r4 = r4 << 16
            r5 = 16711680(0xff0000, float:2.3418052E-38)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r6 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r6
            int r6 = r5 + 1
            byte r5 = r21[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3 = r3 | r5
            short r3 = (short) r3
            r7 = r4 | r3
            int r16 = r6 + 1
            byte r6 = r21[r6]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x032d:
            int r4 = r3 + 1
            byte r14 = r21[r3]
            int r3 = r4 + 1
            byte r4 = r21[r4]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r8 = (short) r3
            int r3 = r5 + 1
            byte r7 = r21[r5]
            int r16 = r3 + 1
            byte r6 = r21[r3]
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0353:
            int r4 = r3 + 1
            byte r3 = r21[r3]
            int r3 = r3 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r3 = r3 & r5
            int r5 = r4 + 1
            byte r4 = r21[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r14 = (short) r3
            int r3 = r5 + 1
            byte r4 = r21[r5]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r5 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r8 = (short) r3
            int r3 = r5 + 1
            byte r4 = r21[r5]
            int r4 = r4 << 8
            r5 = 65280(0xff00, float:9.1477E-41)
            r4 = r4 & r5
            int r16 = r3 + 1
            byte r3 = r21[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r3 = r3 | r4
            short r7 = (short) r3
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        L_0x0391:
            int r17 = r17 + -1
            if (r17 < 0) goto L_0x0061
            r6 = 0
            r9 = 1
            r3 = 1
            f381o = r3
            r7 = r6
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x03a4:
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r17
            goto L_0x006a
        L_0x03b1:
            int r11 = r11 + -1
            r3 = r24[r11]
            if (r3 == 0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r17
            goto L_0x006a
        L_0x03c4:
            int r11 = r11 + -1
            r3 = r24[r11]
            if (r3 != 0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r17
            goto L_0x006a
        L_0x03d7:
            int r11 = r11 + -1
            r3 = r24[r11]
            r0 = r17
            if (r3 >= r0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r18
            goto L_0x006a
        L_0x03ec:
            int r11 = r11 + -1
            r3 = r24[r11]
            r0 = r17
            if (r3 <= r0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r18
            goto L_0x006a
        L_0x0401:
            int r11 = r11 + -1
            r3 = r24[r11]
            r0 = r17
            if (r3 != r0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r18
            goto L_0x006a
        L_0x0416:
            int r11 = r11 + -1
            r3 = r24[r11]
            r0 = r17
            if (r3 == r0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r18
            goto L_0x006a
        L_0x042b:
            int r3 = f286az
            r0 = r17
            if (r3 != r0) goto L_0x0061
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r18
            goto L_0x006a
        L_0x043e:
            int r11 = r11 + -1
            r3 = r24[r11]
            r6 = r3
        L_0x0443:
            int r4 = r11 + -1
            r18 = r24[r4]
            r3 = 0
            r0 = r18
            if (r0 <= r6) goto L_0x045b
            r3 = 1
        L_0x044d:
            int r11 = r4 + 1
            r24[r4] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r6
            goto L_0x006a
        L_0x045b:
            r0 = r18
            if (r0 >= r6) goto L_0x044d
            r3 = -1
            goto L_0x044d
        L_0x0461:
            switch(r17) {
                case 0: goto L_0x046f;
                case 1: goto L_0x0477;
                case 2: goto L_0x047f;
                case 3: goto L_0x0487;
                case 4: goto L_0x048f;
                default: goto L_0x0464;
            }
        L_0x0464:
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x046f:
            int r3 = r11 + 1
            int r4 = f350h
            r24[r11] = r4
            r11 = r3
            goto L_0x0464
        L_0x0477:
            int r3 = r11 + 1
            int r4 = f181B
            r24[r11] = r4
            r11 = r3
            goto L_0x0464
        L_0x047f:
            int r3 = r11 + 1
            int r4 = f206N
            r24[r11] = r4
            r11 = r3
            goto L_0x0464
        L_0x0487:
            int r3 = r11 + 1
            int r4 = f271ak
            r24[r11] = r4
            r11 = r3
            goto L_0x0464
        L_0x048f:
            int r3 = r11 + 1
            int r4 = f178A
            r24[r11] = r4
            r11 = r3
            goto L_0x0464
        L_0x0497:
            switch(r17) {
                case 0: goto L_0x04a5;
                case 1: goto L_0x04a8;
                case 2: goto L_0x04ab;
                case 3: goto L_0x04ae;
                case 4: goto L_0x04b1;
                default: goto L_0x049a;
            }
        L_0x049a:
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x04a5:
            f350h = r18
            goto L_0x049a
        L_0x04a8:
            f181B = r18
            goto L_0x049a
        L_0x04ab:
            f206N = r18
            goto L_0x049a
        L_0x04ae:
            f271ak = r18
            goto L_0x049a
        L_0x04b1:
            f178A = r18
            goto L_0x049a
        L_0x04b4:
            switch(r17) {
                case 0: goto L_0x04c2;
                case 1: goto L_0x04c9;
                case 2: goto L_0x04d0;
                case 3: goto L_0x04d7;
                case 4: goto L_0x04de;
                default: goto L_0x04b7;
            }
        L_0x04b7:
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x04c2:
            int r3 = f350h
            int r3 = r3 + r18
            f350h = r3
            goto L_0x04b7
        L_0x04c9:
            int r3 = f181B
            int r3 = r3 + r18
            f181B = r3
            goto L_0x04b7
        L_0x04d0:
            int r3 = f206N
            int r3 = r3 + r18
            f206N = r3
            goto L_0x04b7
        L_0x04d7:
            int r3 = f271ak
            int r3 = r3 + r18
            f271ak = r3
            goto L_0x04b7
        L_0x04de:
            int r3 = f178A
            int r3 = r3 + r18
            f178A = r3
            goto L_0x04b7
        L_0x04e5:
            int[] r3 = m308b(r17, r18)
            r4 = 3
            r4 = r3[r4]
            r4 = r4 & 4096(0x1000, float:5.74E-42)
            if (r4 == 0) goto L_0x0061
            r4 = 8
            r4 = r3[r4]
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r5 = 5
            if (r4 != r5) goto L_0x0061
            int r4 = p000.C0001a.m131b()
            r5 = 8
            r5 = r3[r5]
            int r5 = r5 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r6 = 1
            int r6 = r6 << r5
            r4 = r4 | r6
            r6 = 1
            int r5 = r5 + 1
            int r5 = r6 << r5
            r4 = r4 | r5
            r5 = 0
            m274a(r3, r5)
            r5 = 3
            r6 = r3[r5]
            r7 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r7
            r3[r5] = r6
            r5 = 1
            m330b(r3, r5)
            r3 = 1
            f377n = r3
            p000.C0001a.m95a(r4)
            int[] r3 = f414w
            r4 = 0
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            int[] r4 = f414w
            r5 = 0
            r4 = r4[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            int r4 = r4 >> 16
            short r4 = (short) r4
            m339c(r3, r4)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x054a:
            r3 = 1
            r4 = 0
            r20[r3] = r4
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0559:
            int[][] r3 = f403t
            r3 = r3[r17]
            r4 = 1
            r5 = 0
            r3[r4] = r5
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x056c:
            int[][] r3 = f403t
            r3 = r3[r17]
            r4 = 1
            r5 = 1
            r3[r4] = r5
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x057f:
            r3 = 0
            r4 = 0
            r0 = r25
            m340c(r0, r3, r4)
            r3 = 0
            r4 = 2
            r24[r3] = r4
            r3 = 1
            if (r13 != r3) goto L_0x05a4
            r3 = 103(0x67, float:1.44E-43)
            r4 = 104(0x68, float:1.46E-43)
            r0 = r17
            r1 = r18
            m317b(r0, r1, r3, r4)
        L_0x0598:
            r9 = 1
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x05a4:
            r3 = 105(0x69, float:1.47E-43)
            r4 = 105(0x69, float:1.47E-43)
            r0 = r17
            r1 = r18
            m317b(r0, r1, r3, r4)
            goto L_0x0598
        L_0x05b0:
            r3 = 10
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 1
            m285a(r3, r4, r5, r6, r7, r8)
            b r3 = f233a
            c r4 = p000.C0000HG.f11a
            r8 = 0
            r5 = r17
            r6 = r18
            r7 = r13
            r3.mo7a(r4, r5, r6, r7, r8)
            java.lang.Thread r3 = new java.lang.Thread
            b r4 = f233a
            r3.<init>(r4)
            r3.start()
            r10 = 1
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x05dd:
            r0 = r17
            r1 = r18
            m340c(r0, r1, r13)
            int[] r3 = f414w
            r4 = 11
            r3 = r3[r4]
            r4 = -1
            if (r3 != r4) goto L_0x0639
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            r4 = 85
            java.lang.String r4 = p000.C0000HG.m0a(r4)
            java.lang.StringBuffer r3 = r3.append(r4)
            java.lang.String r4 = " "
            java.lang.StringBuffer r3 = r3.append(r4)
            r4 = 86
            java.lang.String r4 = p000.C0000HG.m0a(r4)
            java.lang.StringBuffer r3 = r3.append(r4)
            java.lang.String r4 = r3.toString()
            int r3 = p000.C0001a.f156s
            r5 = 2
            if (r3 != r5) goto L_0x0636
            r3 = 435(0x1b3, float:6.1E-43)
        L_0x0617:
            java.lang.String r3 = p000.C0000HG.m0a(r3)
            r5 = 100
            r6 = 101(0x65, float:1.42E-43)
            m261a(r4, r3, r5, r6)
            r3 = 0
            r4 = 2
            r24[r3] = r4
            f426z = r24
            f342g = r25
            r9 = 1
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0636:
            r3 = 436(0x1b4, float:6.11E-43)
            goto L_0x0617
        L_0x0639:
            int[] r3 = f414w
            r4 = 11
            r3 = r3[r4]
            r0 = r17
            if (r3 > r0) goto L_0x064e
            r3 = 84
            java.lang.String r4 = p000.C0000HG.m0a(r3)
            r0 = r17
            int r3 = r0 + 315
            goto L_0x0617
        L_0x064e:
            r3 = 85
            java.lang.String r4 = p000.C0000HG.m0a(r3)
            int[] r3 = f414w
            r5 = 11
            r3 = r3[r5]
            int r3 = r3 + 315
            goto L_0x0617
        L_0x065d:
            int[] r3 = f414w
            r4 = 30
            r3[r4] = r17
            p000.C0001a.f125e = r17
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0670:
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 12
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 12
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 | r6
            r3[r4] = r5
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0696:
            int[] r3 = m308b(r17, r18)
            r4 = 3
            r5 = r3[r4]
            r6 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r6
            r3[r4] = r5
            r4 = 3
            r4 = r3[r4]
            r4 = r4 & 2
            if (r4 == 0) goto L_0x06ac
            p000.C0001a.m135b(r3)
        L_0x06ac:
            r4 = 3
            r4 = r3[r4]
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0061
            r4 = 2
            r3 = r3[r4]
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r4
            int r3 = r3 >> 16
            short r3 = (short) r3
            boolean r3 = m433j(r3)
            if (r3 != 0) goto L_0x0061
            int r3 = f326e
            int r3 = r3 + -1
            f326e = r3
            int r3 = f326e
            if (r3 > 0) goto L_0x0061
            int r3 = f264ad
            int r3 = p000.C0000HG.m39b(r3)
            if (r3 == 0) goto L_0x0061
            p000.C0000HG.m76k()
            int r3 = f264ad
            p000.C0000HG.m81m(r3)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x06e7:
            int[] r4 = m308b(r17, r18)
            int[] r5 = m230a(r4)
            r3 = 1
            if (r5 == 0) goto L_0x0768
            int[] r5 = f414w
            r6 = 11
            r5 = r5[r6]
            if (r5 < 0) goto L_0x0768
            r5 = 3
            r5 = r4[r5]
            int[] r6 = f414w
            r7 = 11
            r6 = r6[r7]
            r7 = 2
            r7 = r4[r7]
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            int r7 = r7 >> 16
            short r7 = (short) r7
            r8 = r5 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0719
            int[] r8 = f205M
            r8 = r8[r6]
            r14 = 1
            int r14 = r14 << r7
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0767
        L_0x0719:
            r8 = r5 & 64
            if (r8 == 0) goto L_0x0726
            int[] r8 = f402t
            r8 = r8[r6]
            r14 = 1
            int r14 = r14 << r7
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0767
        L_0x0726:
            r8 = r5 & 32
            if (r8 == 0) goto L_0x0733
            int[] r8 = f398s
            r8 = r8[r6]
            r14 = 1
            int r14 = r14 << r7
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0767
        L_0x0733:
            r8 = r5 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0740
            int[] r8 = f209O
            r8 = r8[r6]
            r14 = 1
            int r14 = r14 << r7
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0767
        L_0x0740:
            r8 = r5 & 512(0x200, float:7.175E-43)
            if (r8 == 0) goto L_0x074d
            int[] r8 = f201K
            r8 = r8[r6]
            r14 = 1
            int r14 = r14 << r7
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0767
        L_0x074d:
            r8 = r5 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L_0x075a
            int[] r8 = f386p
            r8 = r8[r6]
            r14 = 1
            int r14 = r14 << r7
            r8 = r8 & r14
            if (r8 != 0) goto L_0x0767
        L_0x075a:
            r5 = r5 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0768
            int[] r5 = f199J
            r5 = r5[r6]
            r6 = 1
            int r6 = r6 << r7
            r5 = r5 & r6
            if (r5 == 0) goto L_0x0768
        L_0x0767:
            r3 = 0
        L_0x0768:
            if (r3 == 0) goto L_0x077d
            r3 = 3
            r5 = r4[r3]
            r6 = -65537(0xfffffffffffeffff, float:NaN)
            r5 = r5 & r6
            r4[r3] = r5
            r3 = 3
            r3 = r4[r3]
            r3 = r3 & 2
            if (r3 != 0) goto L_0x077d
            p000.C0001a.m102a(r4)
        L_0x077d:
            r3 = 3
            r3 = r4[r3]
            r3 = r3 & 32
            if (r3 == 0) goto L_0x0061
            r3 = 2
            r3 = r4[r3]
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r4
            int r3 = r3 >> 16
            short r3 = (short) r3
            boolean r3 = m433j(r3)
            if (r3 != 0) goto L_0x0061
            int r3 = f326e
            int r3 = r3 + 1
            f326e = r3
            r3 = 2
            int r3 = p000.C0000HG.m39b(r3)
            if (r3 == 0) goto L_0x0061
            p000.C0000HG.m76k()
            r3 = 2
            p000.C0000HG.m81m(r3)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x07b2:
            m391f(r17)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x07c0:
            f376n = r17
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x07cd:
            r0 = r17
            r1 = r18
            r2 = r24
            m254a(r0, r1, r2)
            r3 = 0
            f381o = r3
            r9 = 1
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x07e5:
            int[] r3 = f217S
            if (r3 == 0) goto L_0x0845
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 13
            r5 = r3[r4]
            r6 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 20
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 20
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 | r6
            r3[r4] = r5
        L_0x0811:
            int[] r3 = f217S
            if (r3 == 0) goto L_0x0859
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 22
            int r5 = r18 * 2
            short r5 = (short) r5
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            int r6 = r13 * 2
            short r6 = (short) r6
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r17]
            r4 = 13
            r5 = r3[r4]
            r6 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r6
            r3[r4] = r5
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0845:
            r0 = r17
            r1 = r18
            m309b(r0, r1, r13)
            r3 = 14
            r7 = 0
            r8 = 0
            r4 = r17
            r5 = r18
            r6 = r13
            m285a(r3, r4, r5, r6, r7, r8)
            goto L_0x0811
        L_0x0859:
            r0 = r17
            r1 = r18
            m309b(r0, r1, r13)
            r3 = 14
            r7 = 0
            r8 = 0
            r4 = r17
            r5 = r18
            r6 = r13
            m285a(r3, r4, r5, r6, r7, r8)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0877:
            r0 = r17
            r1 = r18
            m309b(r0, r1, r13)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0889:
            int[] r3 = m308b(r13, r12)
            int[] r4 = m308b(r17, r18)
            r5 = 3
            r5 = r4[r5]
            r5 = r5 & 2
            if (r5 == 0) goto L_0x08b7
            r5 = 0
            r5 = r3[r5]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            short r5 = (short) r5
            r6 = 0
            r3 = r3[r6]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r6
            int r3 = r3 >> 16
            short r3 = (short) r3
            p000.C0001a.m119a(r4, r5, r3)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x08b7:
            r5 = 0
            r6 = 0
            r6 = r3[r6]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            short r6 = (short) r6
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r7 = 0
            r3 = r3[r7]
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r7
            int r3 = r3 >> 16
            short r3 = (short) r3
            int r3 = r3 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r7
            r3 = r3 | r6
            r4[r5] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x08e0:
            int[] r3 = f187D
            r3 = r3[r17]
            r4 = 1
            int r4 = r4 << r18
            r3 = r3 & r4
            if (r3 == 0) goto L_0x08f9
            int r5 = r11 + 1
            r3 = 1
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x08f9:
            int r5 = r11 + 1
            r3 = 0
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0908:
            int[] r3 = f187D
            r4 = r3[r17]
            r5 = 1
            int r5 = r5 << r18
            r4 = r4 | r5
            r3[r17] = r4
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x091d:
            int[] r3 = f187D
            r4 = r3[r17]
            r5 = 1
            int r5 = r5 << r18
            r5 = r5 ^ -1
            r4 = r4 & r5
            r3[r17] = r4
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0934:
            r3 = 1
            r4 = 0
            int[] r5 = f414w
            r0 = r17
            r1 = r18
            m253a(r0, r1, r3, r4, r5)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x094a:
            r3 = 0
            r4 = 0
            int[] r5 = f414w
            r0 = r17
            r1 = r18
            m253a(r0, r1, r3, r4, r5)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0960:
            int r5 = r11 + 1
            r3 = 0
            r0 = r17
            int r3 = m227a(r0, r3)
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0975:
            int[] r3 = m308b(r17, r18)
            r0 = r17
            boolean r4 = m310b(r0, r3)
            if (r4 == 0) goto L_0x099a
            r4 = 3
            r5 = r3[r4]
            r6 = -65537(0xfffffffffffeffff, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            r0 = r17
            m350c(r0, r3)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x099a:
            r4 = 227(0xe3, float:3.18E-43)
            java.lang.String r4 = p000.C0000HG.m0a(r4)
            r5 = 230(0xe6, float:3.22E-43)
            java.lang.String r5 = p000.C0000HG.m0a(r5)
            r6 = 101(0x65, float:1.42E-43)
            r7 = 106(0x6a, float:1.49E-43)
            m261a(r4, r5, r6, r7)
            r4 = 3
            r5 = r3[r4]
            r6 = -65537(0xfffffffffffeffff, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[] r4 = f414w
            r5 = 0
            r4 = r4[r5]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r4 = (short) r4
            int[] r5 = f414w
            r6 = 0
            r5 = r5[r6]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            int r5 = r5 >> 16
            short r5 = (short) r5
            p000.C0001a.m119a(r3, r4, r5)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x09d9:
            int r3 = m221a(r17, r18)
            if (r3 < r13) goto L_0x09ee
            int r5 = r11 + 1
            r3 = 1
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x09ee:
            int r5 = r11 + 1
            r3 = 0
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x09fd:
            int[] r3 = f414w
            r4 = 42
            r3 = r3[r4]
            if (r3 < 0) goto L_0x0a14
            int r5 = r11 + 1
            r3 = 1
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a14:
            int r5 = r11 + 1
            r3 = 0
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a23:
            int[] r3 = f414w
            r4 = 41
            r3 = r3[r4]
            if (r3 < 0) goto L_0x0a3a
            int r5 = r11 + 1
            r3 = 1
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a3a:
            int r5 = r11 + 1
            r3 = 0
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a49:
            r0 = r18
            short r3 = (short) r0
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            r0 = r17
            short r4 = (short) r0
            int r4 = r4 << 16
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            r3 = r3 | r4
            m221a(r3, r13)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a67:
            int[] r3 = m308b(r17, r18)
            r0 = r17
            boolean r3 = m310b(r0, r3)
            if (r3 == 0) goto L_0x0a82
            int r5 = r11 + 1
            r3 = 1
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a82:
            int r5 = r11 + 1
            r3 = 0
            r24[r11] = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0a91:
            int r3 = p000.C0001a.m94a()
            p000.C0000HG.f6G = r3
            java.util.Stack r3 = p000.C0000HG.f19a
            r3.removeAllElements()
            r3 = 21
            p000.C0000HG.m64g(r3)
            r3 = 1
            p000.C0000HG.f70l = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0aaf:
            p000.C0000HG.m81m(r17)
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0abd:
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 1
            r3[r4] = r18
            int r3 = r13 - r18
            int[][] r4 = f399s
            r4 = r4[r17]
            r5 = 2
            r4 = r4[r5]
            if (r3 <= r4) goto L_0x0ad6
            int[][] r4 = f399s
            r4 = r4[r17]
            r5 = 2
            r4[r5] = r3
        L_0x0ad6:
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            if (r3 != 0) goto L_0x0afb
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r5 = r3[r4]
            r5 = r5 | 1
            r3[r4] = r5
        L_0x0afb:
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r5 = r3[r4]
            r6 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r5 = r3[r4]
            short r6 = (short) r12
            int r6 = r6 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r5 = r5 | r6
            r3[r4] = r5
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0b23:
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r5 = r3[r4]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r6
            r3[r4] = r5
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 0
            r5 = r3[r4]
            r5 = r5 | 2
            r3[r4] = r5
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 2
            r3 = r3[r4]
            r0 = r18
            if (r0 <= r3) goto L_0x0061
            int[][] r3 = f399s
            r3 = r3[r17]
            r4 = 2
            int[][] r5 = f399s
            r5 = r5[r17]
            r6 = 1
            r5 = r5[r6]
            int r5 = r18 - r5
            r3[r4] = r5
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0b60:
            int r3 = f212Q
            r0 = r17
            if (r3 == r0) goto L_0x0b6d
            r3 = 10
            r4 = -2
            r5 = 0
            m397f(r3, r4, r5)
        L_0x0b6d:
            f212Q = r17
            f284ax = r18
            f227Y = r13
            f283aw = r12
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0b80:
            int r3 = f286az
            int r4 = f372m
            if (r3 >= r4) goto L_0x0bdc
            int r3 = f280at
            r4 = -1
            if (r3 != r4) goto L_0x0bdc
            r3 = 1
            int r4 = f282av
            r5 = 2
            if (r4 == r5) goto L_0x0b96
            int r4 = f282av
            r5 = 3
            if (r4 != r5) goto L_0x0b97
        L_0x0b96:
            r3 = 2
        L_0x0b97:
            r5 = 1
            r4 = 0
        L_0x0b99:
            int r6 = f286az
            if (r4 >= r6) goto L_0x0ba7
            r6 = 1
            if (r5 != r6) goto L_0x0ba4
            r5 = 5
        L_0x0ba1:
            int r4 = r4 + 1
            goto L_0x0b99
        L_0x0ba4:
            int r5 = r5 + 5
            goto L_0x0ba1
        L_0x0ba7:
            int r4 = f263ac
            int r4 = r4 * r5
            int r6 = f277aq
            int r6 = r6 * r5
            int r7 = f263ac
            int r6 = r6 * r7
            int r7 = f282av
            int r3 = r3 * r5
            r5 = 1
            r8 = 0
            int[] r14 = f414w
            m253a(r7, r3, r5, r8, r14)
            r3 = 24
            int r4 = -r4
            r5 = 1
            r7 = 0
            int[] r8 = f414w
            m253a(r3, r4, r5, r7, r8)
            int r3 = f277aq
            if (r3 <= 0) goto L_0x0bd9
            int r3 = f408v
            if (r3 <= 0) goto L_0x0bff
            int r3 = f408v
            short r3 = (short) r3
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            r4 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 | r4
            m221a(r3, r6)
        L_0x0bd9:
            r3 = 1
            f413w = r3
        L_0x0bdc:
            int r3 = f280at
            r4 = 1
            if (r3 != r4) goto L_0x0c04
            r3 = 0
            f413w = r3
            r6 = r18
        L_0x0be6:
            r3 = -1
            f280at = r3
            r3 = -1
            f282av = r3
            r3 = -1
            f408v = r3
            r3 = 0
            f277aq = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            r16 = r6
            goto L_0x006a
        L_0x0bff:
            int r3 = -r6
            m441k(r3)
            goto L_0x0bd9
        L_0x0c04:
            int r3 = f280at
            r4 = 2
            if (r3 != r4) goto L_0x0c0e
            r3 = 0
            f413w = r3
            r6 = r13
            goto L_0x0be6
        L_0x0c0e:
            int r3 = f286az
            int r4 = f372m
            if (r3 >= r4) goto L_0x0c18
            int r3 = f280at
            if (r3 != 0) goto L_0x0c1e
        L_0x0c18:
            r3 = 0
            f413w = r3
            r6 = r17
            goto L_0x0be6
        L_0x0c1e:
            int r3 = f268ah
            r6 = r3
            goto L_0x0be6
        L_0x0c22:
            f282av = r17
            f408v = r18
            f277aq = r13
            int r3 = f282av
            r4 = 1
            int r6 = m227a(r3, r4)
            r4 = 1
            r3 = 1
            int r5 = f282av
            r7 = 2
            if (r5 == r7) goto L_0x0c3b
            int r5 = f282av
            r7 = 3
            if (r5 != r7) goto L_0x0c3c
        L_0x0c3b:
            r3 = 2
        L_0x0c3c:
            r5 = 0
            int r7 = f282av
            r8 = 2
            if (r7 != r8) goto L_0x0c4c
            int[] r5 = f414w
            r7 = 18
            r5 = r5[r7]
            int r5 = r5 * 10
            int r5 = r5 + 50
        L_0x0c4c:
            int r7 = r6 - r5
            int r8 = r3 * 80
            if (r7 < r8) goto L_0x0c6f
            r4 = 4
        L_0x0c53:
            f263ac = r4
            int[] r5 = f414w
            r6 = 19
            r5 = r5[r6]
            if (r5 >= r4) goto L_0x0c8d
            boolean r3 = f413w
            if (r3 == 0) goto L_0x0c7f
            r3 = 0
            f280at = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0c6f:
            int r7 = r6 - r5
            int r8 = r3 * 65
            if (r7 < r8) goto L_0x0c77
            r4 = 3
            goto L_0x0c53
        L_0x0c77:
            int r5 = r6 - r5
            int r6 = r3 * 50
            if (r5 < r6) goto L_0x0c53
            r4 = 2
            goto L_0x0c53
        L_0x0c7f:
            r3 = 1
            f280at = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0c8d:
            r5 = 0
            int r6 = f277aq
            if (r6 <= 0) goto L_0x0cc8
            int r5 = f408v
            if (r5 <= 0) goto L_0x0cb3
            r5 = 2
            int r6 = f408v
            int r5 = m221a(r5, r6)
        L_0x0c9d:
            int r6 = f277aq
            if (r5 >= r6) goto L_0x0cc8
            boolean r3 = f413w
            if (r3 == 0) goto L_0x0cba
            r3 = 0
            f280at = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0cb3:
            int[] r5 = f414w
            r6 = 46
            r5 = r5[r6]
            goto L_0x0c9d
        L_0x0cba:
            r3 = 2
            f280at = r3
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0cc8:
            java.lang.String r6 = ""
            int r7 = f277aq
            if (r7 <= 0) goto L_0x0cdb
            int[][] r6 = f395r
            int r7 = f408v
            r6 = r6[r7]
            r7 = 0
            r6 = r6[r7]
            java.lang.String r6 = p000.C0000HG.m0a(r6)
        L_0x0cdb:
            r9 = 1
            r7 = 0
            f372m = r7
            r7 = 0
            r8 = r7
        L_0x0ce1:
            r7 = 3
            if (r8 >= r7) goto L_0x0d76
            int r7 = r9 * r4
            int r14 = f277aq
            int r14 = r14 * r9
            int r14 = r14 * r4
            int[] r22 = f414w
            r23 = 19
            r22 = r22[r23]
            r0 = r22
            if (r0 < r7) goto L_0x0d76
            if (r5 < r14) goto L_0x0d76
            java.lang.StringBuffer r22 = new java.lang.StringBuffer
            r22.<init>()
            int r23 = f282av
            int r23 = r23 + 29
            java.lang.String r23 = p000.C0000HG.m0a(r23)
            java.lang.StringBuffer r22 = r22.append(r23)
            java.lang.String r23 = " +"
            java.lang.StringBuffer r22 = r22.append(r23)
            int r23 = r9 * r3
            java.lang.StringBuffer r22 = r22.append(r23)
            java.lang.String r23 = "\n(LP: "
            java.lang.StringBuffer r22 = r22.append(r23)
            r0 = r22
            java.lang.StringBuffer r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            int r22 = f277aq
            if (r22 <= 0) goto L_0x0d4e
            java.lang.StringBuffer r22 = new java.lang.StringBuffer
            r22.<init>()
            r0 = r22
            java.lang.StringBuffer r7 = r0.append(r7)
            java.lang.String r22 = " "
            r0 = r22
            java.lang.StringBuffer r7 = r7.append(r0)
            java.lang.StringBuffer r7 = r7.append(r6)
            java.lang.String r22 = ": "
            r0 = r22
            java.lang.StringBuffer r7 = r7.append(r0)
            java.lang.StringBuffer r7 = r7.append(r14)
            java.lang.String r7 = r7.toString()
        L_0x0d4e:
            java.lang.StringBuffer r14 = new java.lang.StringBuffer
            r14.<init>()
            java.lang.StringBuffer r7 = r14.append(r7)
            java.lang.String r14 = " )"
            java.lang.StringBuffer r7 = r7.append(r14)
            java.lang.String r7 = r7.toString()
            m258a(r7)
            int r7 = f372m
            int r7 = r7 + 1
            f372m = r7
            r7 = 1
            if (r9 != r7) goto L_0x0d73
            r7 = 5
        L_0x0d6e:
            int r8 = r8 + 1
            r9 = r7
            goto L_0x0ce1
        L_0x0d73:
            int r7 = r9 + 5
            goto L_0x0d6e
        L_0x0d76:
            r3 = 83
            m391f(r3)
            int r3 = f274an
            r4 = 471(0x1d7, float:6.6E-43)
            r0 = r24
            m254a(r3, r4, r0)
            boolean r3 = f413w
            if (r3 == 0) goto L_0x0d91
            int r3 = f274an
            r4 = 472(0x1d8, float:6.61E-43)
            r0 = r24
            m254a(r3, r4, r0)
        L_0x0d91:
            r9 = 1
            r7 = r19
            r3 = r9
            r4 = r10
            r5 = r11
            r8 = r18
            r14 = r17
            goto L_0x006a
        L_0x0d9d:
            r3 = 1
            f385p = r3
            java.util.Stack r3 = p000.C0000HG.f19a
            r3.removeAllElements()
            r3 = 0
            p000.C0000HG.f70l = r3
            r3 = 0
            p000.C0000HG.f84v = r3
            r3 = -1
            p000.C0000HG.f65j = r3
            goto L_0x0061
        L_0x0db0:
            r3 = 3
            r24[r3] = r16
            r3 = 4
            r24[r3] = r15
            r3 = 5
            r24[r3] = r14
            r3 = 6
            r24[r3] = r8
            goto L_0x0032
        L_0x0dbe:
            r6 = r17
            goto L_0x0443
        L_0x0dc2:
            r12 = r6
            r13 = r7
            r18 = r8
            r17 = r14
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m411g(int[], int):void");
    }

    /* renamed from: g */
    public static final void m412g(int[] iArr, Graphics graphics) {
        int i = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        if (m339c(174, 0)) {
            int i3 = 24 - iArr[10];
            if (i3 < f296b[1916]) {
                m247a(i, i2, 174, 0, i3, 0, graphics);
            }
        }
    }

    /* renamed from: g */
    public static final boolean m413g(int i) {
        int i2;
        short s;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        for (int i8 = 0; i8 < C0001a.f94F * 2; i8++) {
            for (int i9 = 0; i9 < C0001a.f154r * 2; i9++) {
                int[] iArr = f217S;
                int i10 = (C0001a.f154r * i8 * 2 * 3) + (i9 * 3) + 1;
                iArr[i10] = iArr[i10] & 65535;
                int[] iArr2 = f217S;
                int i11 = (C0001a.f154r * i8 * 2 * 3) + (i9 * 3) + 1;
                iArr2[i11] = iArr2[i11] | 0;
            }
        }
        m330b(f391q[i], true);
        if (((short) (f391q[i][20] & 65535)) == 0) {
            m330b(f414w, true);
        }
        int b = m311b(f391q[i]);
        int i12 = (short) (65535 & b);
        int i13 = (short) ((b & -65536) >> 16);
        int i14 = (short) (f391q[i][22] & 65535);
        int i15 = (short) ((f391q[i][22] & -65536) >> 16);
        if (m286a(i, 1, i14, i15, true, false)) {
            i2 = i15;
            s = i14;
        } else if (((short) (f391q[i][20] & 65535)) < 0) {
            if ((f391q[i][13] & 65536) != 0) {
                int[] iArr3 = f391q[i];
                iArr3[13] = iArr3[13] & -65537;
                int[] iArr4 = f391q[i];
                iArr4[13] = iArr4[13] & -131073;
                m285a(14, i, i14 / 2, i15 / 2, 0, false);
            }
            f391q[i][22] = -1;
            return false;
        } else if (!m391f(i)) {
            m330b(f391q[i], false);
            m330b(f414w, false);
            f391q[i][22] = -1;
            f391q[i][20] = -1;
            return false;
        } else {
            i2 = (short) ((f391q[i][22] & -65536) >> 16);
            s = (short) (f391q[i][22] & 65535);
        }
        int abs = (Math.abs(s - i12) + Math.abs(i2 - i13)) * 10;
        int i16 = abs + 0;
        int i17 = C0001a.f154r;
        int i18 = C0001a.f94F;
        int i19 = -1;
        boolean z = false;
        m244a(i12, i13, i16, 0, abs, 2, -1, -1);
        if (i12 == s && i13 == i2) {
            if ((f391q[i][13] & 65536) != 0) {
                int[] iArr5 = f391q[i];
                iArr5[13] = iArr5[13] & -65537;
                int[] iArr6 = f391q[i];
                iArr6[13] = iArr6[13] & -131073;
                m285a(14, i, s / 2, i2 / 2, 0, false);
            }
            f391q[i][22] = -1;
            return false;
        }
        int i20 = 0;
        int i21 = -1;
        int i22 = i18;
        int i23 = 0;
        while (!z) {
            int i24 = -1;
            while (i24 < 2) {
                int i25 = -1;
                int i26 = i22;
                while (i25 < 2) {
                    int i27 = i12 + i24;
                    int i28 = i13 + i25;
                    if (!m286a(i, (i23 / 6) + 1, i27, i28, true, true) || ((short) ((f217S[((((C0001a.f154r * i28) * 2) * 3) + (i27 * 3)) + 1] & -65536) >> 16)) == 2) {
                        i3 = i19;
                        i4 = i17;
                        i5 = i23;
                    } else {
                        i5 = (i24 == 0 || i25 == 0) ? ((short) ((f217S[((((C0001a.f154r * i13) * 2) * 3) + (i12 * 3)) + 0] & -65536) >> 16)) + 5 : ((short) ((f217S[((((C0001a.f154r * i13) * 2) * 3) + (i12 * 3)) + 0] & -65536) >> 16)) + 7;
                        if (((short) ((f217S[((((C0001a.f154r * i28) * 2) * 3) + (i27 * 3)) + 1] & -65536) >> 16)) != 1 || i5 <= ((short) ((f217S[((((C0001a.f154r * i28) * 2) * 3) + (i27 * 3)) + 0] & -65536) >> 16))) {
                            int abs2 = (Math.abs(s - i27) + Math.abs(i2 - i28)) * 10;
                            int i29 = i5 + abs2;
                            if (i27 < i17) {
                                i17 = i27;
                            } else if (i27 > i19) {
                                i19 = i27;
                            }
                            if (i28 < i26) {
                                i6 = i21;
                                i7 = i28;
                            } else if (i28 > i21) {
                                i6 = i28;
                                i7 = i26;
                            } else {
                                i6 = i21;
                                i7 = i26;
                            }
                            m244a(i27, i28, i29, i5, abs2, 1, i12, i13);
                            i21 = i6;
                            i3 = i19;
                            i26 = i7;
                            i4 = i17;
                        } else {
                            i3 = i19;
                            i4 = i17;
                        }
                    }
                    i25++;
                    i19 = i3;
                    i17 = i4;
                    i23 = i5;
                }
                i24++;
                i22 = i26;
            }
            short s2 = -1;
            int i30 = i13;
            int i31 = i12;
            for (int i32 = i17; i32 <= i19; i32++) {
                for (int i33 = i22; i33 <= i21; i33++) {
                    if (((short) ((f217S[((((C0001a.f154r * i33) * 2) * 3) + (i32 * 3)) + 1] & -65536) >> 16)) == 1 && (s2 > ((short) (f217S[(C0001a.f154r * i33 * 2 * 3) + (i32 * 3) + 0] & 65535)) || s2 < 0)) {
                        s2 = (short) (f217S[(C0001a.f154r * i33 * 2 * 3) + (i32 * 3) + 0] & 65535);
                        i30 = i33;
                        i31 = i32;
                    }
                }
            }
            if (s2 == -1 || i20 > 250) {
                int[] iArr7 = f391q[i];
                iArr7[13] = iArr7[13] & -257;
                int[] iArr8 = f391q[i];
                iArr8[13] = iArr8[13] | 512;
                f391q[i][30] = 20;
                m330b(f391q[i], false);
                m330b(f414w, false);
                if ((f391q[i][13] & 65536) != 0) {
                    int[] iArr9 = f391q[i];
                    iArr9[13] = iArr9[13] & -65537;
                    int[] iArr10 = f391q[i];
                    iArr10[13] = iArr10[13] & -131073;
                    m285a(14, i, s / 2, i2 / 2, 0, false);
                }
                return false;
            }
            m383e(i31, i30, 2);
            i20++;
            z = (i31 == s && i30 == i2) ? true : z;
            i13 = i30;
            i12 = i31;
        }
        int i34 = 0;
        int i35 = 0;
        while (i34 < 8323199) {
            i34 = C0001a.m132b(i12, i13);
            i12 = (short) (65535 & i34);
            i13 = (short) ((-65536 & i34) >> 16);
            i35++;
        }
        m307b(i);
        if (f298b[i] == null || f298b[i].length != i35 - 1) {
            if (i35 > 1) {
                f298b[i] = new int[(i35 - 1)];
            } else {
                m330b(f391q[i], false);
                m330b(f414w, false);
                if ((f391q[i][13] & 65536) != 0) {
                    int[] iArr11 = f391q[i];
                    iArr11[13] = iArr11[13] & -65537;
                    int[] iArr12 = f391q[i];
                    iArr12[13] = iArr12[13] & -131073;
                    m285a(14, i, s / 2, i2 / 2, 0, false);
                }
                f391q[i][22] = -1;
                return false;
            }
        }
        int[] a = m230a(f391q[i]);
        int i36 = (((short) (a[3] & 65535)) - ((short) (a[2] & 65535))) >> 11;
        int i37 = (((short) ((a[3] & -65536) >> 16)) - ((short) ((a[2] & -65536) >> 16))) >> 11;
        int i38 = i2;
        int i39 = s;
        for (int i40 = i35; i40 > 1; i40--) {
            f298b[i][i40 - 2] = (((short) i39) & 65535) | ((((short) i38) << 16) & -65536);
            for (int i41 = i38; i41 <= i38 + i37; i41++) {
                for (int i42 = i39; i42 <= i39 + i36; i42++) {
                    int[] iArr13 = f217S;
                    int i43 = (C0001a.f154r * i41 * 2 * 3) + (i42 * 3) + 2;
                    iArr13[i43] = iArr13[i43] & -16711681;
                    int[] iArr14 = f217S;
                    int i44 = (C0001a.f154r * i41 * 2 * 3) + (i42 * 3) + 2;
                    iArr14[i44] = iArr14[i44] | ((((byte) i) << 16) & 16711680);
                    int[] iArr15 = f217S;
                    int i45 = (C0001a.f154r * i41 * 2 * 3) + (i42 * 3) + 2;
                    iArr15[i45] = iArr15[i45] & 16777215;
                    int[] iArr16 = f217S;
                    int i46 = (C0001a.f154r * i41 * 2 * 3) + (i42 * 3) + 2;
                    iArr16[i46] = iArr16[i46] | ((((byte) (i40 - 2)) << 24) & -16777216);
                }
            }
            int b2 = C0001a.m132b(i39, i38);
            i39 = (short) (65535 & b2);
            i38 = (short) ((b2 & -65536) >> 16);
        }
        f391q[i][24] = 0;
        int[] iArr17 = f391q[i];
        iArr17[13] = iArr17[13] | 64;
        if (f391q[i][22] == -1) {
            f391q[i][22] = f298b[i][0];
        }
        m330b(f391q[i], false);
        return true;
    }

    /* renamed from: h */
    public static final int m414h(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (C0000HG.m58e(2) == 1) {
                i2 |= 1 << i3;
            }
        }
        return i2;
    }

    /* renamed from: h */
    public static final int m415h(int[] iArr) {
        int q = m463q(iArr);
        if (q == -1) {
            return -1;
        }
        return f256a[q].length;
    }

    /* renamed from: h */
    public static final void m416h() {
        if (f234a == null) {
            m475u();
        }
    }

    /* renamed from: h */
    public static final void m417h(int i) {
        f364k = 0;
        for (int i2 = 0; i2 < f253a[2].length; i2++) {
            int i3 = f253a[2][i2][4];
            if (i3 >= 0 && f395r[i3][6] == 20) {
                f364k += f253a[2][i2][6];
            }
        }
        if (f364k > 0) {
            f198J = f364k;
            f186D = (byte) ((C0001a.f124d[i][8] >> 24) & 255);
            f276ap = (((short) ((short) ((C0001a.f124d[i][9] & -65536) >> 16))) & 65535) | ((((short) i) << 16) & -65536);
            f210P = 0;
            f361j = true;
            f336f = new StringBuffer().append(" x ").append(f364k).toString();
            return;
        }
        m317b(239, 230, 101, 106);
    }

    /* renamed from: h */
    public static final void m418h(int i, int i2, int i3) {
        int[] iArr = f383o[f412w];
        iArr[3] = iArr[3] & -65537;
        f383o[f412w][4] = i;
        f383o[f412w][5] = i2;
        f383o[f412w][6] = 0;
        f383o[f412w][7] = 0;
        f383o[f412w][8] = 0;
        f383o[f412w][9] = 0;
        f383o[f412w][10] = 24;
        f383o[f412w][11] = 9;
        f383o[f412w][12] = i3;
        for (int i4 = 0; i4 < 60; i4 += 6) {
            f299b[f412w][i4 + 0] = (short) (C0000HG.m58e(4096) - 2048);
            f299b[f412w][i4 + 1] = (short) (C0000HG.m58e(4096) - 2048);
            f299b[f412w][i4 + 2] = (short) (C0000HG.m58e(8192) + 0);
            f299b[f412w][i4 + 3] = 0;
            f299b[f412w][i4 + 4] = 0;
            f299b[f412w][i4 + 5] = 0;
        }
        C0001a.m119a(f383o[f412w], i >> 12, i2 >> 12);
        f412w++;
        f412w %= 8;
    }

    /* renamed from: h */
    public static final void m419h(Graphics graphics) {
        try {
            graphics.setColor(f191F[(f279as + 27) - 1]);
        } catch (Exception e) {
            graphics.setColor(16777215);
        }
        graphics.fillRect(0, 0, f260aC, f368l);
        if (f290b != null) {
            graphics.drawImage(f290b, f260aC / 2, f368l / 2, 3);
        }
    }

    /* renamed from: h */
    public static final void m420h(int[] iArr) {
        short s = (short) ((iArr[2] & -65536) >> 16);
        for (int i = 0; i < 60; i += 6) {
            short[] sArr = f299b[s];
            int i2 = i + 2;
            sArr[i2] = (short) (sArr[i2] + 1024);
            if (f299b[s][i + 2] > 12288) {
                f299b[s][i + 2] = (short) (C0000HG.m58e(256) + 0);
            }
        }
        if (iArr[12] != -1) {
            C0001a.m155c(C0001a.f124d[iArr[12]], f406u);
            f406u[1] = C0001a.m147c(C0001a.f124d[iArr[12]]) + 1;
            iArr[4] = f406u[0];
            iArr[5] = f406u[1] + 1;
        }
    }

    /* renamed from: h */
    private static final void m421h(int[] iArr, int i) {
        int[] iArr2;
        int[] iArr3 = C0001a.f124d[(short) (iArr[11] & 65535)];
        if (i == -1) {
            C0000HG.m81m(21);
        } else {
            if ((iArr3[3] & 16) != 0) {
                if (((short) ((iArr[12] & -65536) >> 16)) > 0) {
                    C0000HG.m81m(20);
                } else {
                    C0000HG.m81m(21);
                }
            } else if ((C0001a.f124d[i][3] & 16) != 0 && ((short) ((iArr[12] & -65536) >> 16)) > 0) {
                C0000HG.m81m(22);
            }
            if ((C0001a.f124d[i][3] & 32) != 0 && (((short) (C0001a.f124d[i][20] & 65535)) == -1 || ((short) (C0001a.f124d[i][26] & 65535)) < 3)) {
                short s = (short) (iArr3[2] & 65535);
                int[] iArr4 = C0001a.f124d[i];
                iArr4[20] = iArr4[20] & -65536;
                int[] iArr5 = C0001a.f124d[i];
                iArr5[20] = (((short) s) & 65535) | iArr5[20];
                C0001a.f124d[i][22] = m311b(iArr3);
                C0001a.f124d[i][26] = 10;
                if ((f249a[C0001a.f124d[i][11]][13] & 128) != 0) {
                    m227a((int) (short) ((C0001a.f124d[i][2] & -65536) >> 16), true);
                }
            }
        }
        if (i == -1 || ((C0001a.f124d[i][3] & 16) == 0 && (C0001a.f124d[i][3] & 32) == 0)) {
            iArr2 = null;
        } else {
            int[] iArr6 = C0001a.f124d[i];
            C0001a.m144b(iArr6, f193G);
            int i2 = iArr[4] - iArr[6];
            int i3 = iArr[5] - iArr[7];
            iArr[6] = f193G[0];
            iArr[7] = f193G[1];
            iArr[4] = i2 + iArr[6];
            iArr[5] = i3 + iArr[7];
            iArr2 = iArr6;
        }
        boolean z = false;
        if (iArr2 != null) {
            z = m257a((int) (short) ((iArr[12] & -65536) >> 16), iArr2, iArr3);
        }
        if ((iArr3[3] & 16) != 0) {
            m362d(f265ae);
        }
        int i4 = ((short) (iArr[8] & 65535)) - ((short) ((iArr[8] & -65536) >> 16));
        if (z || ((short) ((iArr[12] & -65536) >> 16)) == 0) {
            iArr[8] = (((short) i4) & 65535) | 0;
        }
        iArr[3] = iArr[3] | 65536;
        C0001a.m135b(iArr);
    }

    /* renamed from: h */
    public static final void m422h(int[] iArr, Graphics graphics) {
        int i = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        short s = (short) ((iArr[2] & -65536) >> 16);
        for (int i3 = 0; i3 < 60; i3 += 6) {
            int i4 = ((8192 - f299b[s][i3 + 2]) + 0) * iArr[10];
            graphics.setColor(((((196608 - i4) * 140) + (i4 * 253)) / 196608) | ((((i4 * 210) + ((196608 - i4) * 113)) / 196608) << 16) | ((((i4 * 255) + ((196608 - i4) * 141)) / 196608) << 8));
            graphics.fillRect(((f299b[s][i3 + 0] * C0001a.f136i) >> 12) + i, (((f299b[s][i3 + 1] * C0001a.f136i) >> 12) + i2) - ((f299b[s][i3 + 2] * C0001a.f136i) >> 12), 1, 8);
        }
    }

    /* renamed from: h */
    public static final boolean m423h(int i) {
        int i2;
        int i3;
        int i4 = f411v[i][4];
        int i5 = f411v[i][5];
        if (f375m[i] != null) {
            i2 = f375m[i][4];
            i3 = f375m[i][5];
        } else {
            i2 = f411v[i][9];
            i3 = f411v[i][10];
        }
        f422y[0] = i2 - i4;
        f422y[1] = i3 - i5;
        if (m466r(f422y) <= 2048) {
            return false;
        }
        m272a(f422y, 2048, f390q);
        int a = C0001a.m100a(i4, i5, f390q[0] + i4, f390q[1] + i5, 4128, f207N, true);
        f411v[i][4] = f207N[0];
        f411v[i][5] = f207N[1];
        int i6 = f207N[0] >> 12;
        if (f207N[0] < 0) {
            i6--;
        }
        int i7 = f207N[1] >> 12;
        if (f207N[1] < 0) {
            i7--;
        }
        C0001a.m119a(f411v[i], i6, i7);
        int i8 = (i6 < 0 || i6 >= C0001a.f154r || i7 < 0 || i7 >= C0001a.f94F) ? -1 : a;
        if (i8 != -2) {
            if (i8 == -1) {
                f375m[i] = null;
            } else if ((C0001a.f124d[i8][3] & 32) != 0) {
                f375m[i] = C0001a.f124d[i8];
            } else {
                f375m[i] = null;
            }
            return false;
        }
        m378e(f411v[i]);
        return true;
    }

    /* renamed from: i */
    public static final int m424i(int[] iArr) {
        if ((iArr[3] & 16) != 0) {
            return (short) (f414w[26] & 65535);
        }
        if ((iArr[3] & 32) != 0) {
        }
        return 0;
    }

    /* renamed from: i */
    public static final void m425i() {
        for (int i = 0; i < f383o.length; i++) {
            if ((f383o[i][3] & 65536) == 0) {
                int[] iArr = f383o[i];
                iArr[10] = iArr[10] - 1;
                if (f383o[i][10] > 0) {
                    switch (f383o[i][11]) {
                        case 8:
                            m392f(f383o[i]);
                            break;
                        case 9:
                            m424i(f383o[i]);
                            break;
                        case 10:
                            m341c(f383o[i]);
                            break;
                        case 11:
                            m311b(f383o[i]);
                            break;
                        case 13:
                            m415h(f383o[i]);
                            break;
                        case 14:
                            m230a(f383o[i]);
                            break;
                    }
                } else {
                    int[] iArr2 = f383o[i];
                    iArr2[3] = iArr2[3] | 65536;
                    C0001a.m119a(f383o[i], -1, -1);
                }
            }
        }
    }

    /* renamed from: i */
    public static final void m426i(Graphics graphics) {
        int i = f414w[40];
        for (int i2 = 0; i2 < 8; i2++) {
            short s = (short) (f414w[i2 + 31] & 65535);
            short s2 = (short) ((f414w[i2 + 31] & -65536) >> 16);
            if (s == -1 || s2 == -1 || (f414w[39] & (1 << i2)) == 0 || f253a[s][s2][4] == -1) {
                m249a((int) f332e[(i2 << 1) + 0], (int) f332e[(i2 << 1) + 1], 150, 49, graphics);
            } else {
                m249a((int) f332e[(i2 << 1) + 0], (int) f332e[(i2 << 1) + 1], 150, m230a(f253a[s][s2])[2], graphics);
            }
        }
        m249a((int) f332e[(i << 1) + 0], (int) f332e[(i << 1) + 1], 150, 59, graphics);
        m468r(graphics);
    }

    /* renamed from: i */
    public static final void m427i(int[] iArr) {
        short s = (short) ((iArr[2] & -65536) >> 16);
        for (int i = 0; i < 60; i += 6) {
            short[] sArr = f299b[s];
            int i2 = i + 2;
            sArr[i2] = (short) (sArr[i2] + 256);
            if (f299b[s][i + 2] > 8192) {
                f299b[s][i + 2] = (short) (C0000HG.m58e(256) + 0);
            }
        }
        if (iArr[12] != -1) {
            C0001a.m155c(C0001a.f124d[iArr[12]], f244a);
            f244a[1] = C0001a.m147c(C0001a.f124d[iArr[12]]) + 1;
            iArr[4] = f244a[0];
            iArr[5] = f244a[1] + 1;
        }
    }

    /* renamed from: i */
    public static final void m428i(int[] iArr, int i) {
        if ((iArr[3] & 4) != 0) {
            iArr[8] = iArr[8] & 65535;
            iArr[8] = iArr[8] | ((((short) i) << 16) & -65536);
        }
    }

    /* renamed from: i */
    public static final void m429i(int[] iArr, Graphics graphics) {
        int i = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        short s = (short) ((iArr[2] & -65536) >> 16);
        for (int i3 = 0; i3 < 60; i3 += 6) {
            int i4 = ((12288 - f299b[s][i3 + 2]) + 0) * iArr[10];
            graphics.setColor(((((245760 - i4) * 0) + (i4 * 0)) / 245760) | ((((i4 * 255) + ((245760 - i4) * 128)) / 245760) << 16) | ((((i4 * 255) + ((245760 - i4) * 128)) / 245760) << 8));
            graphics.fillRect(((f299b[s][i3 + 0] * C0001a.f136i) >> 12) + i, (((f299b[s][i3 + 1] * C0001a.f136i) >> 12) + i2) - ((f299b[s][i3 + 2] * C0001a.f136i) >> 12), 1, 8);
        }
    }

    /* renamed from: i */
    public static final boolean mo13i(int i) {
        if ((C0001a.f124d[i][3] & 64) != 0 && m350c(0, C0001a.f124d[i])) {
            short s = (short) ((C0001a.f124d[i][2] & -65536) >> 16);
            if (f414w[11] < 0) {
                return true;
            }
            int[] iArr = f402t;
            int i2 = f414w[11];
            iArr[i2] = (1 << s) | iArr[i2];
            return true;
        } else if ((C0001a.f124d[i][3] & 128) != 0 && m350c(1, C0001a.f124d[i])) {
            short s2 = (short) ((C0001a.f124d[i][2] & -65536) >> 16);
            if (f414w[11] < 0) {
                return true;
            }
            int[] iArr2 = f205M;
            int i3 = f414w[11];
            iArr2[i3] = (1 << s2) | iArr2[i3];
            return true;
        } else if ((C0001a.f124d[i][3] & 256) != 0 && m350c(2, C0001a.f124d[i])) {
            short s3 = (short) ((C0001a.f124d[i][2] & -65536) >> 16);
            if (f414w[11] < 0) {
                return true;
            }
            int[] iArr3 = f209O;
            int i4 = f414w[11];
            iArr3[i4] = (1 << s3) | iArr3[i4];
            return true;
        } else if ((C0001a.f124d[i][3] & 8192) != 0 && m350c(3, C0001a.f124d[i])) {
            short s4 = (short) ((C0001a.f124d[i][2] & -65536) >> 16);
            if (f414w[11] < 0) {
                return true;
            }
            int[] iArr4 = f199J;
            int i5 = f414w[11];
            iArr4[i5] = (1 << s4) | iArr4[i5];
            return true;
        } else if ((C0001a.f124d[i][3] & 512) != 0 && m350c(5, C0001a.f124d[i])) {
            short s5 = (short) ((C0001a.f124d[i][2] & -65536) >> 16);
            if (f414w[11] < 0) {
                return true;
            }
            int[] iArr5 = f201K;
            int i6 = f414w[11];
            iArr5[i6] = (1 << s5) | iArr5[i6];
            return true;
        } else if ((C0001a.f124d[i][3] & 1024) == 0 || !m350c(4, C0001a.f124d[i])) {
            m317b(241, 230, 101, 106);
            return false;
        } else {
            short s6 = (short) ((C0001a.f124d[i][2] & -65536) >> 16);
            if (f414w[11] < 0) {
                return true;
            }
            int[] iArr6 = f386p;
            int i7 = f414w[11];
            iArr6[i7] = (1 << s6) | iArr6[i7];
            return true;
        }
    }

    /* renamed from: j */
    public static final int m431j(int[] iArr) {
        int q = m463q(iArr);
        if (q == -1) {
            return -1;
        }
        return f312c[q].length;
    }

    /* renamed from: j */
    public static final void m432j() {
        if (f411v == null) {
            f411v = (int[][]) Array.newInstance(Integer.TYPE, new int[]{10, 11});
            f375m = new int[10][];
        }
        for (int i = 0; i < f411v.length; i++) {
            f411v[i][6] = -1;
            f411v[i][0] = -1;
            f411v[i][4] = -1;
            f411v[i][5] = -1;
            f411v[i][3] = 0;
        }
    }

    /* renamed from: j */
    public static final void m433j(int i) {
        if (!f397s) {
            int a = m219a();
            if (a >= 0) {
                int i2 = f253a[4][i][4];
                int[] iArr = f407u[i2];
                if ((iArr[4] * ((short) ((f414w[13] & -65536) >> 16))) / 100 <= ((short) (f414w[13] & 65535))) {
                    if (((short) ((iArr[6] & -65536) >> 16)) <= 0) {
                        if (((short) (iArr[6] & 65535)) != 0) {
                            if (f265ae < 0) {
                                f375m[a] = null;
                                int i3 = (iArr[7] * 4096) / 10;
                                switch (f414w[30]) {
                                    case 0:
                                        f411v[a][9] = f414w[4];
                                        f411v[a][10] = f414w[5] - i3;
                                        break;
                                    case 1:
                                        f411v[a][9] = i3 + f414w[4];
                                        f411v[a][10] = f414w[5];
                                        break;
                                    case 2:
                                        f411v[a][9] = f414w[4];
                                        f411v[a][10] = i3 + f414w[5];
                                        break;
                                    case 3:
                                        f411v[a][9] = f414w[4] - i3;
                                        f411v[a][10] = f414w[5];
                                        break;
                                }
                            } else {
                                f375m[a] = f391q[f265ae];
                            }
                        } else {
                            f375m[a] = f414w;
                        }
                    } else {
                        f375m[a] = null;
                    }
                    int[] iArr2 = f411v[a];
                    iArr2[6] = iArr2[6] & -256;
                    int[] iArr3 = f411v[a];
                    iArr3[6] = (((byte) i2) & 255) | iArr3[6];
                    int[] iArr4 = f411v[a];
                    iArr4[6] = iArr4[6] & -65281;
                    int[] iArr5 = f411v[a];
                    iArr5[6] = iArr5[6] | 256;
                    int[] iArr6 = f411v[a];
                    iArr6[6] = iArr6[6] & -16711681;
                    int[] iArr7 = f411v[a];
                    iArr7[6] = iArr7[6] | 0;
                    int[] iArr8 = f411v[a];
                    iArr8[6] = iArr8[6] & 16777215;
                    int[] iArr9 = f411v[a];
                    iArr9[6] = iArr9[6] | 33554432;
                    if (iArr[5] == -1 && !f397s) {
                        C0000HG.m81m(iArr[9]);
                    }
                    f411v[a][7] = 0;
                    f411v[a][8] = 655360;
                    f411v[a][4] = f414w[4];
                    f411v[a][5] = f414w[5];
                    f397s = true;
                    m193A();
                    m195C();
                    return;
                }
                return;
            }
            return;
        }
        f397s = false;
        m193A();
        m195C();
    }

    /* renamed from: j */
    public static final void m434j(Graphics graphics) {
        if (f287b >= 0 && f356i.length() > 0) {
            graphics.setClip(0, 0, f260aC, f368l);
            int i = f296b[1518] + f296b[1386] + 5;
            int i2 = ((((byte) ((f339f[1] >> 16) & 255)) + 4) + 5) - 1;
            int i3 = f368l - ((f296b[1387] + f296b[1607]) - 7);
            int i4 = (f260aC - (i * 2)) - 1;
            int i5 = f368l - (i2 + 5);
            if (i3 <= i5) {
                i5 = i3;
            }
            graphics.setColor(f191F[8]);
            graphics.fillRect(i, i5, i4, i2);
            graphics.setColor(f191F[5]);
            graphics.drawLine(i, i5, i + i4, i5);
            graphics.drawLine(i, i5, i, i5 + i2);
            graphics.setColor(f191F[6]);
            graphics.drawLine(i + 1, i5 + 1, i + i4, i5 + 1);
            graphics.drawLine(i + 1, i5 + 1, i + 1, (i5 + i2) - 1);
            graphics.drawLine(i + i4 + 1, i5, i + i4 + 1, i5 + i2 + 1);
            graphics.drawLine(i, i5 + i2 + 1, i + i4 + 1, i5 + i2 + 1);
            graphics.setColor(f191F[7]);
            graphics.drawLine(i + 1, i5 + i2, i + i4, i5 + i2);
            graphics.drawLine(i + i4, i5 + 1, i + i4, i5 + i2);
            graphics.setColor(f191F[5]);
            m260a(f356i, 6, 1, graphics);
        }
    }

    /* renamed from: j */
    public static final void m435j(int[] iArr, Graphics graphics) {
        int i = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
        int i2 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        if (m339c(182, 0)) {
            int i3 = 15 - iArr[10];
            if (i3 < f296b[2004]) {
                m247a(i, i2, 182, 0, i3, 0, graphics);
            }
        }
    }

    /* renamed from: j */
    public static final boolean m436j(int i) {
        int i2 = f249a[f391q[i][11]][27];
        return f391q[i][11] >= 0 && (i2 == 6 || i2 == 7 || i2 == 8 || i2 == 9);
    }

    /* renamed from: k */
    public static final int m437k(int[] iArr) {
        if (iArr == null) {
            return 1024;
        }
        return f333e[iArr[4]][13];
    }

    /* renamed from: k */
    public static final void m438k() {
        boolean z = true;
        if (f265ae != -1) {
            int i = f414w[5] - f391q[f265ae][5];
            if ((m220a(f414w[4] - f391q[f265ae][4]) * 4) / 3 < (f260aC << 12) / C0001a.f136i && (m220a(i) * 4) / 3 < (f368l << 12) / C0001a.f136i) {
                z = false;
                int i2 = (f414w[5] + f391q[f265ae][5]) >> 1;
                f190F = ((((f414w[4] + f391q[f265ae][4]) >> 1) * C0001a.f136i) >> 12) - (f260aC >> 1);
                f334f = ((C0001a.f136i * i2) >> 12) - (f368l >> 1);
            }
        }
        if (z) {
            f190F = ((f414w[4] * C0001a.f136i) >> 12) - (f260aC >> 1);
            f334f = ((f414w[5] * C0001a.f136i) >> 12) - (f368l >> 1);
            switch (f414w[30]) {
                case 0:
                    f334f -= C0001a.f150p * 1;
                    break;
                case 1:
                    f190F += C0001a.f136i * 1;
                    break;
                case 2:
                    f334f += C0001a.f150p * 1;
                    break;
                case 3:
                    f190F -= C0001a.f136i * 1;
                    break;
            }
        }
        f388q = ((f388q * 100) + (f190F * 28)) >> 7;
        f303c = ((f303c * 100) + (f334f * 28)) >> 7;
        if (f414w[11] != 0) {
            if (f388q < (-(C0001a.f150p * 0))) {
                f388q = -(C0001a.f150p * 0);
            }
            if (f303c < (-(C0001a.f150p * 3))) {
                f303c = -(C0001a.f150p * 3);
            }
            if (f388q > ((C0001a.f154r + 0) * C0001a.f136i) - f260aC) {
                f388q = ((C0001a.f154r + 0) * C0001a.f136i) - f260aC;
            }
            if (f303c > ((C0001a.f94F + 3) * C0001a.f150p) - f368l) {
                f303c = ((C0001a.f94F + 3) * C0001a.f150p) - f368l;
            }
            if ((C0001a.f154r + 0) * C0001a.f136i < f260aC) {
                f388q = ((C0001a.f154r * C0001a.f136i) >> 1) - (f260aC >> 1);
            }
            if ((C0001a.f94F + 6) * C0001a.f150p < f368l) {
                f303c = ((C0001a.f94F * C0001a.f150p) >> 1) - (f368l >> 1);
                return;
            }
            return;
        }
        if (f388q < (-(C0001a.f150p * 0))) {
            f388q = -(C0001a.f150p * 0);
        }
        if (f303c < (-(C0001a.f150p * 0)) - f404u) {
            f303c = (-(C0001a.f150p * 0)) - f404u;
        }
        if (f388q > ((C0001a.f154r + 0) * C0001a.f136i) - f260aC) {
            f388q = ((C0001a.f154r + 0) * C0001a.f136i) - f260aC;
        }
        if (f303c > ((C0001a.f94F + 5) * C0001a.f150p) - f368l) {
            f303c = ((C0001a.f94F + 5) * C0001a.f150p) - f368l;
        }
        if ((C0001a.f154r + 0) * C0001a.f136i < f260aC) {
            f388q = ((C0001a.f154r * C0001a.f136i) >> 1) - (f260aC >> 1);
        }
        if ((C0001a.f94F + 5) * C0001a.f150p < f368l) {
            f303c = ((C0001a.f94F * C0001a.f150p) >> 1) - (f368l >> 1);
        }
    }

    /* renamed from: k */
    public static final void m439k(Graphics graphics) {
        if (f305c != null) {
            graphics.setClip(0, 0, f260aC, f368l);
            graphics.setColor(f191F[15]);
            graphics.drawRect(f384p - 1, 3, f261aa + 2, f275ao + 2);
            graphics.setColor(f191F[14]);
            graphics.drawRect(f384p - 2, 2, f261aa + 2, f275ao + 2);
            graphics.setColor(f191F[17]);
            graphics.fillRect(f384p, 4, f261aa, f275ao);
            graphics.setColor(f191F[16]);
            graphics.fillRect(f384p, 4, f228Z, f275ao);
            graphics.setColor(f191F[18]);
            m260a(f305c, 4, 2, graphics);
        }
    }

    /* renamed from: k */
    public static final void m440k(int[] iArr, Graphics graphics) {
        int i = 5;
        int i2 = ((iArr[4] * C0001a.f136i) >> 12) - f388q;
        int i3 = (((iArr[5] * C0001a.f136i) >> 12) - ((iArr[6] * C0001a.f136i) >> 12)) - f303c;
        switch ((f420y >> 1) & 3) {
            case 0:
                i = 0;
                break;
            case 1:
                break;
            case 2:
                i = 3;
                break;
            default:
                i = 6;
                break;
        }
        if (m446l(184)) {
            m247a(i2, i3, 184, 0, 0, i, graphics);
        }
    }

    /* renamed from: k */
    public static final boolean m441k(int i) {
        if (f414w[46] + i < 0) {
            return false;
        }
        int[] iArr = f414w;
        iArr[46] = iArr[46] + i;
        return true;
    }

    /* renamed from: l */
    public static final int m442l(int[] iArr) {
        if (iArr == null) {
            return 5;
        }
        return f333e[iArr[4]][15];
    }

    /* renamed from: l */
    public static final void m443l() {
        for (int i = 0; i < f414w.length; i++) {
            f414w[i] = -1;
        }
        f414w[4] = 2048;
        f414w[5] = 2048;
        f414w[12] = 3276850;
        f414w[13] = 1310740;
        f414w[16] = 1024;
        f414w[30] = 2;
        f414w[14] = 1310740;
        f414w[15] = 983055;
        f414w[27] = 0;
        f414w[28] = 0;
        f414w[27] = 0;
        f414w[17] = 0;
        f414w[19] = 0;
        f414w[20] = 327685;
        f414w[21] = 327685;
        f414w[22] = 327685;
        f414w[23] = 327685;
        f414w[24] = 0;
        f414w[25] = 327685;
        f414w[26] = 327685;
        f414w[46] = 50;
        f414w[40] = 0;
        f414w[47] = 0;
        f414w[48] = 0;
        f414w[49] = 0;
        f414w[50] = 0;
        f414w[51] = 0;
        f414w[53] = 0;
        f414w[54] = 1310770;
        f414w[41] = -1;
        f414w[42] = -1;
        f414w[43] = -1;
        f414w[44] = -1;
        f414w[45] = -1;
        f414w[18] = 1;
        f414w[11] = 13;
        f414w[39] = 0;
        for (int i2 = 0; i2 < f253a.length; i2++) {
            for (int i3 = 0; i3 < f253a[i2].length; i3++) {
                for (int i4 = 0; i4 < f253a[i2][i3].length; i4++) {
                    f253a[i2][i3][i4] = -1;
                }
            }
        }
    }

    /* renamed from: l */
    public static final void m444l(Graphics graphics) {
        graphics.setClip(0, 0, f260aC, f368l);
        m409g(graphics);
        m260a(f351h, 8, 2, graphics);
        if (f179A) {
            String str = "";
            String str2 = "";
            if (f218T >= 0) {
                String str3 = f310c[f218T];
                int indexOf = str3.indexOf("@1");
                int lastIndexOf = str3.lastIndexOf(64);
                if (lastIndexOf <= indexOf) {
                    lastIndexOf = indexOf + 1;
                }
                f310c[f218T] = new StringBuffer().append(str3.substring(0, indexOf)).append(f224W * f208O).append(str3.substring(lastIndexOf + 1)).toString();
                str = str3;
            }
            if (f285ay >= 0) {
                str2 = f310c[f285ay];
                int indexOf2 = str2.indexOf("@x");
                int lastIndexOf2 = str2.lastIndexOf(64);
                if (lastIndexOf2 <= indexOf2) {
                    lastIndexOf2 = indexOf2 + 1;
                }
                f310c[f285ay] = new StringBuffer().append(str2.substring(0, indexOf2)).append(f208O).append(str2.substring(lastIndexOf2 + 1)).toString();
            }
            String str4 = str2;
            m278a(f310c, 7, 2, graphics);
            if (f285ay >= 0) {
                f310c[f285ay] = str4;
            }
            if (f218T >= 0) {
                f310c[f218T] = str;
                return;
            }
            return;
        }
        m278a(f310c, 7, 2, graphics);
    }

    /* renamed from: l */
    public static final void m445l(int[] iArr, Graphics graphics) {
        switch (iArr[11]) {
            case 4:
                m435j(iArr, graphics);
                return;
            case 6:
                m412g(iArr, graphics);
                return;
            case 8:
                m329b(iArr, graphics);
                return;
            case 9:
                m422h(iArr, graphics);
                return;
            case 10:
                m273a(iArr, graphics);
                return;
            case 11:
                m401f(iArr, graphics);
                return;
            case 13:
                m429i(iArr, graphics);
                return;
            case 14:
                m440k(iArr, graphics);
                return;
            default:
                return;
        }
    }

    /* renamed from: l */
    public static final boolean m446l(int i) {
        return m339c(i, 0);
    }

    /* renamed from: m */
    public static final int m447m(int[] iArr) {
        if ((iArr[3] & 16) != 0) {
            return (short) (f414w[15] & 65535);
        }
        if ((iArr[3] & 32) == 0) {
            return 0;
        }
        return f249a[iArr[11]][8];
    }

    /* renamed from: m */
    public static final void m448m() {
        short s;
        short s2;
        short s3;
        int i;
        int i2;
        f318d = C0000HG.m0a(315);
        if (!m446l(155) || !m446l(152)) {
            s = 0;
            s2 = 0;
            s3 = 0;
        } else {
            s3 = f296b[1705];
            s2 = f296b[1672];
            s = f296b[1673];
        }
        if (s3 <= s2) {
            s3 = s2;
        }
        short s4 = (byte) ((f339f[2] >> 16) & 255);
        if (f246a[2].stringWidth(f318d) >= f260aC - ((s3 + 4) << 1)) {
            i2 = s + 4;
            f404u = (s << 1) + s4 + 8;
            i = 4;
        } else {
            i = s3 + 4;
            if (s4 >= s) {
                s = s4;
            }
            f404u = s + 8;
            s4 = s;
            i2 = 4;
        }
        m348c(11, i, i2, f260aC - (i << 1), s4, 156);
        m397f(11, -2, 0);
    }

    /* renamed from: m */
    public static final void m449m(Graphics graphics) {
        int i = f368l;
        if (m446l(146) && m446l(139)) {
            int i2 = (i - f314c[146][4]) - f314c[139][4];
            short s = (short) ((f414w[12] & -65536) >> 16);
            int i3 = s == 0 ? 32 : (((short) (f414w[12] & 65535)) * 32) / s;
            graphics.setColor(16711680);
            graphics.fillRect(33, ((i2 + 2) + 32) - i3, 5, i3);
        }
    }

    /* renamed from: m */
    public static final boolean m450m(int i) {
        if ((f391q[i][13] & 16) == 0) {
            return false;
        }
        if (!m274a(f391q[i], true)) {
            return true;
        }
        int[] iArr = null;
        int i2 = (f391q[i][13] & 8192) == 0 ? f391q[i][14] : f391q[i][15];
        if (i2 >= 0) {
            iArr = f359i[i2];
        }
        f391q[i][21] = m233a(f391q[i], C0001a.f124d[(short) (f391q[i][20] & 65535)], iArr);
        int[] iArr2 = f391q[i];
        iArr2[13] = iArr2[13] & -17;
        return false;
    }

    /* renamed from: n */
    public static final int m451n(int[] iArr) {
        if (iArr == null) {
            return 2;
        }
        return f333e[iArr[4]][11];
    }

    /* renamed from: n */
    public static final void m452n() {
        f363j = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f391q.length + 1, 15});
        for (int i = 0; i < f363j.length; i++) {
            for (int i2 = 0; i2 < f363j[i].length; i2++) {
                f363j[i][i2] = -1;
            }
            f363j[i][0] = -1;
            f363j[i][4] = -1;
            f363j[i][5] = -1;
            f363j[i][3] = 65536;
        }
    }

    /* renamed from: n */
    public static final void m453n(Graphics graphics) {
        graphics.setClip(0, 0, f260aC, f368l);
        graphics.setColor(f191F[3]);
        graphics.fillRect(0, 0, f260aC, f368l);
        graphics.setColor(f191F[0]);
        m348c(3, 0, 0, f260aC, f368l, 44);
        m260a(f344g, 3, 1, graphics);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010e, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0118, code lost:
        r0 = true;
        r3 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9 A[SYNTHETIC, Splitter:B:46:0x00f9] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0102 A[SYNTHETIC, Splitter:B:51:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x010d A[ExcHandler: all (th java.lang.Throwable), Splitter:B:18:0x0085] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m454n(int r8) {
        /*
            r1 = 1
            r2 = 0
            r3 = 0
            r4 = 0
            f338f = r3
            f293b = r3
            java.lang.System.gc()
            r0 = -1
            boolean r0 = m308b(r0, r8)
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            return r1
        L_0x0013:
            java.lang.String r0 = "/"
            r5 = 10
            if (r8 >= r5) goto L_0x002c
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.StringBuffer r0 = r5.append(r0)
            java.lang.String r5 = "0"
            java.lang.StringBuffer r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x002c:
            r5 = 100
            if (r8 >= r5) goto L_0x0043
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.StringBuffer r0 = r5.append(r0)
            java.lang.String r5 = "0"
            java.lang.StringBuffer r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x0043:
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            java.lang.StringBuffer r0 = r5.append(r0)
            java.lang.String r5 = ""
            java.lang.StringBuffer r0 = r0.append(r5)
            java.lang.StringBuffer r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            HG r5 = p000.C0000HG.f10a     // Catch:{ Exception -> 0x00ec }
            java.lang.Class r5 = r5.getClass()     // Catch:{ Exception -> 0x00ec }
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00ec }
            r6.<init>()     // Catch:{ Exception -> 0x00ec }
            java.lang.StringBuffer r6 = r6.append(r0)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r7 = ".png"
            java.lang.StringBuffer r6 = r6.append(r7)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00ec }
            java.io.InputStream r5 = r5.getResourceAsStream(r6)     // Catch:{ Exception -> 0x00ec }
            if (r5 != 0) goto L_0x0080
            if (r3 == 0) goto L_0x007e
            r4.close()     // Catch:{ Exception -> 0x0106 }
        L_0x007e:
            r1 = r2
            goto L_0x0012
        L_0x0080:
            java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00ec }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00ec }
            int r5 = r4.available()     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            f338f = r5     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            byte[] r5 = f338f     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            r6 = 0
            byte[] r7 = f338f     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            int r7 = r7.length     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            r4.read(r5, r6, r7)     // Catch:{ Exception -> 0x0113, all -> 0x010d }
            r4.close()     // Catch:{ Exception -> 0x0117, all -> 0x010d }
            r2 = 0
            HG r4 = p000.C0000HG.f10a     // Catch:{ Exception -> 0x011b }
            java.lang.Class r4 = r4.getClass()     // Catch:{ Exception -> 0x011b }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x011b }
            r5.<init>()     // Catch:{ Exception -> 0x011b }
            java.lang.StringBuffer r0 = r5.append(r0)     // Catch:{ Exception -> 0x011b }
            java.lang.String r5 = ".off"
            java.lang.StringBuffer r0 = r0.append(r5)     // Catch:{ Exception -> 0x011b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011b }
            java.io.InputStream r0 = r4.getResourceAsStream(r0)     // Catch:{ Exception -> 0x011b }
            if (r0 != 0) goto L_0x00c3
            if (r3 == 0) goto L_0x0012
            r2.close()     // Catch:{ Exception -> 0x00c0 }
            goto L_0x0012
        L_0x00c0:
            r0 = move-exception
            goto L_0x0012
        L_0x00c3:
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x011b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x011b }
            r2.readByte()     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            int r0 = r2.available()     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            byte[] r0 = new byte[r0]     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            f293b = r0     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            byte[] r0 = f293b     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            r4 = 0
            byte[] r5 = f293b     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            int r5 = r5.length     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            r2.read(r0, r4, r5)     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            r2.close()     // Catch:{ Exception -> 0x011e, all -> 0x0110 }
            r0 = 0
            if (r3 == 0) goto L_0x00e5
            r0.close()     // Catch:{ Exception -> 0x0109 }
        L_0x00e5:
            r0 = r1
        L_0x00e6:
            java.lang.System.gc()
            r1 = r0
            goto L_0x0012
        L_0x00ec:
            r0 = move-exception
            r0 = r2
        L_0x00ee:
            r1 = 0
            f338f = r1     // Catch:{ all -> 0x00ff }
            r1 = 0
            f293b = r1     // Catch:{ all -> 0x00ff }
            java.lang.System.gc()     // Catch:{ all -> 0x00ff }
            if (r3 == 0) goto L_0x00e6
            r3.close()     // Catch:{ Exception -> 0x00fd }
            goto L_0x00e6
        L_0x00fd:
            r1 = move-exception
            goto L_0x00e6
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r3 == 0) goto L_0x0105
            r3.close()     // Catch:{ Exception -> 0x010b }
        L_0x0105:
            throw r0
        L_0x0106:
            r0 = move-exception
            goto L_0x007e
        L_0x0109:
            r0 = move-exception
            goto L_0x00e5
        L_0x010b:
            r1 = move-exception
            goto L_0x0105
        L_0x010d:
            r0 = move-exception
            r3 = r4
            goto L_0x0100
        L_0x0110:
            r0 = move-exception
            r3 = r2
            goto L_0x0100
        L_0x0113:
            r0 = move-exception
            r0 = r2
            r3 = r4
            goto L_0x00ee
        L_0x0117:
            r0 = move-exception
            r0 = r1
            r3 = r4
            goto L_0x00ee
        L_0x011b:
            r0 = move-exception
            r0 = r1
            goto L_0x00ee
        L_0x011e:
            r0 = move-exception
            r0 = r1
            r3 = r2
            goto L_0x00ee
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m454n(int):boolean");
    }

    /* renamed from: o */
    public static final int m455o(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        return f333e[iArr[4]][14];
    }

    /* renamed from: o */
    public static final void m456o() {
        int i;
        System.gc();
        if (f297b != null) {
            f237a.clear();
            Vector vector = new Vector();
            for (byte[] bArr : f297b) {
                int i2 = 0;
                while (i2 < bArr.length) {
                    int i3 = i2 + 1;
                    switch (bArr[i2]) {
                        case 1:
                        case 4:
                        case 5:
                        case 33:
                        case 46:
                        case 72:
                        case 73:
                            i2 = i3 + 1;
                            break;
                        case 2:
                            int i4 = i3 + 1;
                            int i5 = i4 + 1;
                            int i6 = i5 + 1;
                            vector.addElement(new Integer(((bArr[i3] << 16) & 16711680) | ((short) (((bArr[i4] << 8) & 65280) | (bArr[i5] & 255)))));
                            int i7 = i6 + 1;
                            short s = (bArr[i6] << 16) & 16711680;
                            int i8 = i7 + 1;
                            int i9 = i8 + 1;
                            vector.addElement(new Integer(((short) (((bArr[i7] << 8) & 65280) | (bArr[i8] & 255))) | s));
                            i2 = i9 + 1;
                            break;
                        case 17:
                        case 18:
                        case 19:
                        case 27:
                            i2 = i3 + 1 + 1;
                            break;
                        case 20:
                        case 21:
                        case 22:
                            i2 = i3 + 1 + 1 + 1 + 1;
                            break;
                        case 34:
                        case 35:
                            i2 = i3 + 1 + 1;
                            break;
                        case 36:
                        case 37:
                        case 38:
                            i2 = i3 + 1 + 1;
                            break;
                        case 39:
                            i2 = i3 + 1 + 1;
                            break;
                        case 40:
                            i2 = i3 + 1 + 1;
                            break;
                        case 41:
                        case 45:
                            i2 = i3 + 1 + 1 + 1 + 1;
                            break;
                        case 42:
                        case 43:
                        case 74:
                            i2 = i3 + 1 + 1 + 1;
                            break;
                        case 44:
                            i2 = i3 + 1 + 1 + 1 + 1;
                            break;
                        case 47:
                        case 66:
                        case 67:
                            i2 = i3 + 1 + 1;
                            break;
                        case 48:
                            i2 = i3 + 1;
                            break;
                        case 49:
                            int i10 = i3 + 1;
                            int i11 = i10 + 1;
                            byte b = (bArr[i10] << 8) & 65280;
                            i2 = i11 + 1;
                            vector.addElement(new Integer(((bArr[i3] << 16) & 16711680) | ((short) ((bArr[i11] & 255) | b))));
                            break;
                        case 50:
                            int i12 = i3 + 1 + 1;
                            int i13 = i12 + 1;
                            int i14 = i13 + 1;
                            i2 = i14 + 1;
                            vector.addElement(new Integer(((short) (((bArr[i13] << 8) & 65280) | (bArr[i14] & 255))) | ((bArr[i12] << 16) & 16711680)));
                            break;
                        case 51:
                            i2 = i3 + 1 + 1 + 1;
                            break;
                        case 53:
                            int i15 = i3 + 1;
                            int i16 = i15 + 1;
                            byte b2 = (bArr[i15] << 8) & 65280;
                            i2 = i16 + 1;
                            vector.addElement(new Integer(((bArr[i3] << 16) & 16711680) | ((short) ((bArr[i16] & 255) | b2))));
                            break;
                        case 54:
                            i2 = i3 + 1 + 1 + 1 + 1 + 1;
                            break;
                        case 55:
                            i2 = i3 + 1 + 1 + 1 + 1 + 1 + 1;
                            break;
                        case 64:
                        case 65:
                            i2 = i3 + 1 + 1 + 1;
                            break;
                        case 68:
                        case 69:
                            i2 = i3 + 1 + 1 + 1;
                            break;
                        case 75:
                            i2 = i3 + 1 + 1 + 1 + 1 + 1;
                            break;
                        case 80:
                            i2 = i3 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
                            break;
                        case 81:
                            i2 = i3 + 1 + 1 + 1 + 1;
                            break;
                        default:
                            i2 = i3;
                            break;
                    }
                }
            }
            int i17 = 1;
            while (true) {
                if (i17 == 0) {
                    i17++;
                } else if (i17 >= vector.size()) {
                    for (int i18 = 0; i18 < 3; i18++) {
                        try {
                            InputStream resourceAsStream = C0000HG.f10a.getClass().getResourceAsStream(new StringBuffer().append("/").append(C0000HG.f43c).append(".").append(C0000HG.f53d[i18 + 1]).append(".").append("lng").toString());
                            if (resourceAsStream == null) {
                                System.err.println("couldn't open lang file");
                            } else {
                                int available = resourceAsStream.available();
                                byte[] bArr2 = new byte[5];
                                resourceAsStream.read(bArr2, 0, 5);
                                f229a = bArr2[2];
                                byte b3 = ((bArr2[4] & 255) << 8) | (bArr2[3] & 255);
                                int[] iArr = new int[(b3 + 1)];
                                for (int i19 = 0; i19 < b3 + 1; i19++) {
                                    resourceAsStream.read(bArr2, 0, 2);
                                    iArr[i19] = (((bArr2[1] & 255) << 8) | (bArr2[0] & 255)) + 2;
                                }
                                int i20 = ((b3 + 1) * 2) + 5;
                                int i21 = 0;
                                while (i21 < vector.size()) {
                                    int intValue = ((Integer) vector.elementAt(i21)).intValue();
                                    byte b4 = intValue & 65535;
                                    if (((intValue & 16711680) >> 16) - 1 != i18) {
                                        i = i20;
                                    } else {
                                        if (b4 >= 0) {
                                            if (b4 >= b3) {
                                                i = i20;
                                            } else {
                                                int i22 = iArr[b4];
                                                i = iArr[b4 + 1];
                                                if (i22 < i20) {
                                                    i = i20;
                                                } else if (i >= i22 && i22 >= 0) {
                                                    if (i > available) {
                                                        i = i20;
                                                    } else {
                                                        byte[] bArr3 = new byte[(i - i22)];
                                                        resourceAsStream.skip((long) (i22 - i20));
                                                        resourceAsStream.read(bArr3, 0, bArr3.length);
                                                        f237a.put(vector.elementAt(i21), bArr3);
                                                    }
                                                }
                                            }
                                        }
                                        i = i20;
                                    }
                                    i21++;
                                    i20 = i;
                                }
                                resourceAsStream.close();
                                System.gc();
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    System.gc();
                    Thread.yield();
                    System.gc();
                    Thread.yield();
                    System.gc();
                    return;
                } else {
                    Integer num = (Integer) vector.elementAt(i17);
                    Integer num2 = (Integer) vector.elementAt(i17 - 1);
                    if ((num.intValue() & 65535) < (num2.intValue() & 65535)) {
                        vector.setElementAt(num, i17 - 1);
                        vector.setElementAt(num2, i17);
                        i17--;
                    } else {
                        i17++;
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public static final void m457o(Graphics graphics) {
        if (f287b >= 0) {
            int[] iArr = C0001a.f124d[f269ai];
            if ((iArr[3] & 4) != 0) {
                m249a(((iArr[4] * C0001a.f136i) >> 12) - f388q, (m274a(iArr, true)[1] - 5) + (((iArr[5] * C0001a.f136i) >> 12) - f303c), 137, f222V, graphics);
                return;
            }
            C0001a.m120a(iArr, f189E);
            int i = (f189E[0] * C0001a.f136i) >> 12;
            int i2 = ((f189E[1] - f189E[2]) * C0001a.f136i) >> 12;
            int i3 = f296b[(((short) (m230a(iArr)[1] & 65535)) * 11) + 1] + 5;
            if ((iArr[3] & 4096) == 0) {
                i3 += (short) ((iArr[5] & -65536) >> 16);
                i += (short) (iArr[5] & 65535);
            }
            m321b(i, i2 - i3, 137, f222V, graphics);
        }
    }

    /* renamed from: o */
    public static final boolean m458o(int i) {
        return C0000HG.m49c(i);
    }

    /* renamed from: p */
    public static final int m459p(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        short s = (short) (iArr[6] & 65535);
        if (s < 0 || s > 17) {
            return -1;
        }
        return s;
    }

    /* renamed from: p */
    public static final void m460p() {
        for (int i = 0; i < f411v.length; i++) {
            if (f411v[i][6] != -1) {
                int[] iArr = f407u[(byte) (f411v[i][6] & 255)];
                int i2 = (iArr[4] * ((short) ((f414w[13] & -65536) >> 16))) / 100;
                if (i2 < 1) {
                    i2 = 1;
                }
                if (((byte) ((f411v[i][6] >> 16) & 255)) == 0) {
                    if (((short) (iArr[6] & 65535)) == 0 || f265ae < 0 || C0001a.m127a(f414w, f391q[f265ae], (iArr[7] * 4096) / 10)) {
                        byte b = (byte) ((f411v[i][6] >> 8) & 255);
                        int i3 = iArr[5];
                        byte b2 = (byte) ((f411v[i][6] >> 24) & 255);
                        if (b2 >= 0 && f397s) {
                            if (f265ae != -1) {
                                f414w[30] = m308b(f391q[f265ae][4] - f414w[4], f391q[f265ae][5] - f414w[5]);
                                m393f(f414w, f414w[30] + 12);
                            }
                            int i4 = b2 - 1;
                            int[] iArr2 = f411v[i];
                            iArr2[6] = iArr2[6] & 16777215;
                            int[] iArr3 = f411v[i];
                            iArr3[6] = ((((byte) i4) << 24) & -16777216) | iArr3[6];
                        } else if (((short) (f414w[13] & 65535)) - i2 < 0 || !f397s) {
                            if (((short) ((iArr[6] & -65536) >> 16)) > 0) {
                                if (((short) (iArr[6] & 65535)) == 0) {
                                    f411v[i][0] = (((short) ((short) (f414w[0] & 65535))) & 65535) | ((((short) ((short) ((f414w[0] & -65536) >> 16))) << 16) & -65536);
                                    f411v[i][4] = f414w[4];
                                    f411v[i][5] = f414w[5];
                                    f411v[i][9] = f414w[4];
                                    f411v[i][10] = f414w[5];
                                } else if (f265ae < 0 || f375m[i] != null) {
                                    f411v[i][4] = f414w[4];
                                    f411v[i][5] = f414w[5];
                                    f411v[i][9] = f414w[4];
                                    f411v[i][10] = f414w[5];
                                } else {
                                    f411v[i][0] = (((short) ((short) (f391q[f265ae][0] & 65535))) & 65535) | ((((short) ((short) ((f391q[f265ae][0] & -65536) >> 16))) << 16) & -65536);
                                    f411v[i][4] = f391q[f265ae][4];
                                    f411v[i][5] = f391q[f265ae][5];
                                    f411v[i][9] = f391q[f265ae][4];
                                    f411v[i][10] = f391q[f265ae][5];
                                }
                            }
                            if (i3 != -1) {
                                m253a(1, -i2, true, false, f414w);
                                m393f(f414w, f414w[30] + 8);
                                int[] iArr4 = f411v[i];
                                iArr4[6] = iArr4[6] & -16711681;
                                int[] iArr5 = f411v[i];
                                iArr5[6] = iArr5[6] | 131072;
                                C0000HG.m81m(iArr[9]);
                                C0001a.m119a(f411v[i], (int) (short) (f414w[0] & 65535), (int) (short) ((f414w[0] & -65536) >> 16));
                            } else {
                                f411v[i][6] = -1;
                                m393f(f414w, f414w[30] + 0);
                            }
                            f397s = false;
                            f316d = 10;
                        } else {
                            if (i3 == -1) {
                                if (!m254a(i, (int) b, f375m[i])) {
                                    m253a(1, -i2, true, false, f414w);
                                    f316d = 10;
                                    f411v[i][6] = -1;
                                    f397s = false;
                                } else {
                                    b = 0;
                                }
                            }
                            m253a(1, -i2, true, false, f414w);
                            int i5 = b + 1;
                            int[] iArr6 = f411v[i];
                            iArr6[6] = iArr6[6] & -65281;
                            int[] iArr7 = f411v[i];
                            iArr7[6] = ((((byte) i5) << 8) & 65280) | iArr7[6];
                            int[] iArr8 = f411v[i];
                            iArr8[6] = iArr8[6] & 16777215;
                            int[] iArr9 = f411v[i];
                            iArr9[6] = iArr9[6] | 33554432;
                        }
                    } else {
                        m253a(1, i2 * (((byte) ((f411v[i][6] >> 8) & 255)) - 1), true, false, f414w);
                        f411v[i][6] = -1;
                        f397s = false;
                    }
                } else if (((byte) ((f411v[i][6] >> 16) & 255)) == 3) {
                    byte b3 = (byte) ((f411v[i][6] >> 8) & 255);
                    int i6 = iArr[5];
                    int i7 = iArr[3] > 0 ? i6 * (b3 >> 1) : i6 * b3;
                    if (i7 <= 0) {
                        int[] iArr10 = f411v[i];
                        iArr10[6] = iArr10[6] & -16711681;
                        int[] iArr11 = f411v[i];
                        iArr11[6] = iArr11[6] | 262144;
                    } else {
                        byte b4 = (byte) ((f411v[i][6] >> 24) & 255);
                        if (b4 < 0) {
                            int[] iArr12 = f411v[i];
                            iArr12[6] = iArr12[6] & 16777215;
                            int[] iArr13 = f411v[i];
                            iArr13[6] = iArr13[6] | 167772160;
                            m254a(i, (int) b3, f375m[i]);
                            int[] iArr14 = f411v[i];
                            iArr14[7] = iArr14[7] + 10;
                            if (f411v[i][7] >= i2 * i7) {
                                if (iArr[8] == 3) {
                                    m254a(i, (int) b3, f375m[i]);
                                }
                                int[] iArr15 = f411v[i];
                                iArr15[6] = iArr15[6] & -16711681;
                                int[] iArr16 = f411v[i];
                                iArr16[6] = iArr16[6] | 262144;
                            }
                        } else {
                            int i8 = b4 - 1;
                            int[] iArr17 = f411v[i];
                            iArr17[6] = iArr17[6] & 16777215;
                            int[] iArr18 = f411v[i];
                            iArr18[6] = ((((byte) i8) << 24) & -16777216) | iArr18[6];
                        }
                        m227a(i, true);
                    }
                } else if (((byte) ((f411v[i][6] >> 16) & 255)) == 2) {
                    if (!m414h(i)) {
                        int[] iArr19 = f411v[i];
                        iArr19[6] = iArr19[6] & -16711681;
                        int[] iArr20 = f411v[i];
                        iArr20[6] = iArr20[6] | 196608;
                        int[] iArr21 = f411v[i];
                        iArr21[6] = iArr21[6] & 16777215;
                        int[] iArr22 = f411v[i];
                        iArr22[6] = iArr22[6] | 167772160;
                        m254a(i, (int) (byte) ((f411v[i][6] >> 8) & 255), f375m[i]);
                    }
                } else if (((byte) ((f411v[i][6] >> 16) & 255)) == 4 && !m227a(i, false)) {
                    f411v[i][6] = -1;
                    C0001a.m119a(f411v[i], -1, -1);
                }
            }
        }
    }

    /* renamed from: p */
    public static final void m461p(Graphics graphics) {
        m197E();
        int i = ((-f194H) % f226X) * C0001a.f136i;
        int i2 = ((-f266af) % f396s) * C0001a.f150p;
        int i3 = f388q >= 0 ? f388q % C0001a.f136i : C0001a.f136i + (f388q % C0001a.f136i);
        int i4 = f303c >= 0 ? f303c % C0001a.f150p : C0001a.f150p + (f303c % C0001a.f150p);
        DirectGraphics directGraphics = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
        int clipX = graphics.getClipX();
        int clipY = graphics.getClipY();
        int clipWidth = graphics.getClipWidth();
        int clipHeight = graphics.getClipHeight();
        int i5 = i - i3;
        int i6 = i2 - i4;
        f240a.getWidth();
        f240a.getHeight();
        graphics.clipRect(i5, i6, f240a.getWidth(), f240a.getHeight());
        directGraphics.drawImage(f240a, (i - i3) + 0, (i2 - i4) + 0, 20, 0);
        graphics.setClip(clipX, clipY, clipWidth, clipHeight);
        DirectGraphics directGraphics2 = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
        int clipX2 = graphics.getClipX();
        int clipY2 = graphics.getClipY();
        int clipWidth2 = graphics.getClipWidth();
        int clipHeight2 = graphics.getClipHeight();
        int i7 = (i - i3) + (f226X * C0001a.f136i);
        int i8 = i2 - i4;
        f240a.getWidth();
        f240a.getHeight();
        graphics.clipRect(i7, i8, f240a.getWidth(), f240a.getHeight());
        directGraphics2.drawImage(f240a, (i - i3) + (f226X * C0001a.f136i) + 0, (i2 - i4) + 0, 20, 0);
        graphics.setClip(clipX2, clipY2, clipWidth2, clipHeight2);
        DirectGraphics directGraphics3 = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
        int clipX3 = graphics.getClipX();
        int clipY3 = graphics.getClipY();
        int clipWidth3 = graphics.getClipWidth();
        int clipHeight3 = graphics.getClipHeight();
        int i9 = i - i3;
        int i10 = (i2 - i4) + (f396s * C0001a.f150p);
        f240a.getWidth();
        f240a.getHeight();
        graphics.clipRect(i9, i10, f240a.getWidth(), f240a.getHeight());
        directGraphics3.drawImage(f240a, (i - i3) + 0, (i2 - i4) + (f396s * C0001a.f150p) + 0, 20, 0);
        graphics.setClip(clipX3, clipY3, clipWidth3, clipHeight3);
        DirectGraphics directGraphics4 = graphics instanceof DirectGraphics ? (DirectGraphics) graphics : DirectUtils.getDirectGraphics(graphics);
        int clipX4 = graphics.getClipX();
        int clipY4 = graphics.getClipY();
        int clipWidth4 = graphics.getClipWidth();
        int clipHeight4 = graphics.getClipHeight();
        int i11 = (i - i3) + (f226X * C0001a.f136i);
        int i12 = (i2 - i4) + (f396s * C0001a.f150p);
        f240a.getWidth();
        f240a.getHeight();
        graphics.clipRect(i11, i12, f240a.getWidth(), f240a.getHeight());
        directGraphics4.drawImage(f240a, (i - i3) + (f226X * C0001a.f136i) + 0, (i2 - i4) + (f396s * C0001a.f150p) + 0, 20, 0);
        graphics.setClip(clipX4, clipY4, clipWidth4, clipHeight4);
    }

    /* renamed from: p */
    public static final boolean m462p(int i) {
        if (i < 0 || i > f391q.length) {
            return false;
        }
        int k = m437k(m219a());
        if (!(f414w[45] == -1 || f253a[4][f414w[45]][4] == -1)) {
            int[] iArr = f407u[f253a[4][f414w[45]][4]];
            if (iArr[6] > 0) {
                k = (iArr[7] * 4096) / 10;
            }
        }
        return C0001a.m127a(f414w, f391q[i], k) && C0001a.m144b(f414w, f391q[i]);
    }

    /* renamed from: q */
    public static final int m463q(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        short s = (short) ((iArr[7] & -65536) >> 16);
        if (s < 0 || s >= f302b.length) {
            return -1;
        }
        return (short) ((iArr[7] & -65536) >> 16);
    }

    /* renamed from: q */
    public static final void m464q() {
        m306b();
    }

    /* renamed from: q */
    public static final void m465q(Graphics graphics) {
        m461p(graphics);
        C0001a.m155c(f414w, f374m);
        int i = (f374m[0] * C0001a.f136i) >> 12;
        int i2 = (f374m[1] * C0001a.f136i) >> 12;
        if (m446l(134)) {
            m319b(i, i2, 134, 0, 0, 0, graphics);
        }
        m263a(graphics);
        if (!C0000HG.f70l) {
            if (f352h || f393r) {
                m325b(graphics, 0);
                m426i(graphics);
            }
            if (f401t) {
                m444l(graphics);
            }
        }
        graphics.setClip(0, 0, f260aC, f368l);
    }

    /* renamed from: r */
    public static final int m466r(int[] iArr) {
        boolean z = true;
        if (iArr.length > 2) {
            return m472t(iArr);
        }
        long j = (long) iArr[0];
        long j2 = (long) iArr[1];
        long j3 = (j2 * j2) + (j * j);
        int i = (int) j3;
        if (j3 != ((long) i)) {
            i = (int) ((128 + j3) >> 8);
        } else {
            z = false;
        }
        int g = mo11g(i);
        return z ? g << 4 : g;
    }

    /* renamed from: r */
    public static final void m467r() {
        f270aj = (f296b[1617] / f296b[1622]) >> 1;
        f281au = f296b[1618] / f296b[1623];
        f392r = f260aC - (((f270aj * 2) + 8) + 8);
        f424z = f368l - ((((f296b[1607] + f296b[1387]) + (f281au * 2)) + 5) + 4);
        f270aj += 8;
        f281au += 5;
        f376n = -1;
    }

    /* renamed from: r */
    public static final void m468r(Graphics graphics) {
        graphics.setColor(f191F[22]);
        graphics.drawRect(f319d - 1, f291b - 1, f306c + 2, f241a + 2);
        graphics.setColor(f191F[23]);
        graphics.drawRect(f319d - 2, f291b - 2, f306c + 2, f241a + 2);
        graphics.setColor(f191F[24]);
        graphics.fillRect(f319d, f291b, f306c, f241a);
        graphics.setColor(f191F[25]);
        m260a(f235a, 5, 1, graphics);
    }

    /* renamed from: s */
    public static final int m469s(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        return (short) ((iArr[8] & -65536) >> 16);
    }

    /* renamed from: s */
    public static final void m470s() {
        f302b = new byte[8][][][];
        f254a = new Image[8][][];
        f315c = new byte[8][][];
        f255a = new byte[8][][][];
        f252a = new byte[8][][];
        f251a = new short[8][];
        f256a = new int[8][][][];
        f312c = new byte[8][];
        f300b = new byte[8][][];
        f257a = new short[8][][][][];
    }

    /* renamed from: s */
    public static final void m471s(Graphics graphics) {
        m242a(10, f270aj, f281au, f392r, f424z);
        byte b = (byte) ((f339f[2] >> 16) & 255);
        int i = f296b[1683] + 16;
        int i2 = ((b - f296b[1684]) >> 1) + 5;
        int i3 = 0;
        int i4 = f355i;
        while (i3 < f238a.size()) {
            m348c(10, f270aj + i, f281au + i4 + 5, f392r - i, (f424z - i4) + 5, 305);
            String[] strArr = (String[]) f238a.elementAt(i3);
            graphics.setClip(f270aj, f281au, f392r, f424z - 1);
            if (i3 == f286az) {
                graphics.setColor(f191F[13]);
                graphics.fillRect(f270aj, f281au + i4, f392r, (strArr.length * b) + 10);
                graphics.setColor(f191F[5]);
            }
            m249a(f270aj + 8, f281au + i4 + i2, 153, 0, graphics);
            int length = (strArr.length * b) + 10 + i4;
            m278a(strArr, 10, 2, graphics);
            i3++;
            i4 = length;
        }
        graphics.setClip(f270aj, f281au, f392r, f424z - 1);
        m249a(f260aC >> 1, f281au + i4 + 5, 154, 0, graphics);
        m247a(f260aC >> 1, f281au + i4 + 5, 154, 0, 0, 2, graphics);
    }

    /* renamed from: t */
    public static final int m472t(int[] iArr) {
        boolean z = true;
        if (iArr.length <= 2) {
            return m466r(iArr);
        }
        long j = (long) iArr[0];
        long j2 = (long) iArr[1];
        long j3 = (long) iArr[2];
        long j4 = (j * j) + (j2 * j2) + (j3 * j3);
        int i = (int) j4;
        if (j4 != ((long) i)) {
            i = (int) ((512 + j4) >> 10);
        } else {
            z = false;
        }
        int g = mo11g(i);
        return z ? g << 5 : g;
    }

    /* renamed from: t */
    public static final void m473t(Graphics graphics) {
        m242a(9, f270aj, f281au, f392r, f424z);
        m278a(f295b, 9, 2, graphics);
        int length = f348g[29] + f281au + (((byte) ((f339f[2] >> 16) & 255)) * f295b.length) + 10;
        graphics.setClip(f270aj, f281au, f392r, f424z - 1);
        m249a(f260aC >> 1, length, 154, 0, graphics);
        m247a(f260aC >> 1, length, 154, 0, 0, 2, graphics);
    }

    /* renamed from: u */
    public static final int m474u(int[] iArr) {
        if ((iArr[3] & 4) == 0) {
            return -1;
        }
        return (short) (iArr[7] & 65535);
    }

    /* renamed from: u */
    private static final void m475u() {
        if (f234a != null) {
            try {
                if (f234a.markSupported()) {
                    f234a.reset();
                    f234a.readShort();
                    short readShort = f234a.readShort();
                    for (int i = 0; i < readShort; i++) {
                        f234a.readShort();
                    }
                    return;
                }
                f234a.close();
                f234a = null;
            } catch (Exception e) {
            }
        }
        f234a = null;
        InputStream resourceAsStream = C0000HG.f10a.getClass().getResourceAsStream("/i");
        if (resourceAsStream != null) {
            try {
                f234a = new DataInputStream(resourceAsStream);
                f234a.readShort();
                short readShort2 = f234a.readShort();
                for (int i2 = 0; i2 < readShort2; i2++) {
                    f234a.readShort();
                }
            } catch (Exception e2) {
                try {
                    f234a.close();
                } catch (Exception e3) {
                }
                f234a = null;
            }
        }
    }

    /* renamed from: u */
    public static final void m476u(Graphics graphics) {
        boolean z;
        boolean z2;
        graphics.setClip(0, 0, f260aC, f368l);
        if (f182B) {
            m266a(graphics, false, false, false, 126);
        } else {
            m266a(graphics, false, false, false, f274an);
        }
        graphics.setClip(f270aj, f281au, f392r, f424z - 1);
        graphics.setColor(f191F[5]);
        int i = f296b[1639] / f296b[1644];
        short s = f296b[1640];
        int i2 = f281au + f424z + 3;
        if (f182B) {
            m471s(graphics);
            boolean z3 = f355i > f424z - f192G;
            z2 = f355i < 0;
            graphics.setClip(0, 0, f260aC, f368l);
            m249a(f270aj, i2, 160, 1, graphics);
            m249a(f296b[1606] >> 1, f368l, 136, 3, graphics);
            m265a(graphics, 126, C0000HG.m0a(174));
            z = z3;
        } else {
            m473t(graphics);
            int length = (f295b.length * ((byte) ((f339f[2] >> 16) & 255))) + f340f[109];
            short s2 = f348g[29];
            z = s2 > f424z - length;
            boolean z4 = s2 < 0;
            graphics.setClip(0, 0, f260aC, f368l);
            if (!f238a.isEmpty()) {
                m249a((f270aj + f392r) - s, i2, 160, 0, graphics);
            }
            m249a(f296b[1606] >> 1, f368l, 136, 3, graphics);
            m265a(graphics, f274an, C0000HG.m0a(f376n));
            z2 = z4;
        }
        graphics.setClip(0, 0, f260aC, f368l);
        int i3 = ((i - s) >> 1) + i2;
        if (z2) {
            m249a((f260aC >> 1) - i, i3, 149, 0, graphics);
        }
        if (z) {
            m249a(f260aC >> 1, i3, 149, 1, graphics);
        }
    }

    /* renamed from: v */
    public static final int m477v(int[] iArr) {
        if (iArr == null) {
            return 100;
        }
        return f333e[iArr[4]][12];
    }

    /* renamed from: v */
    public static final void m478v() {
        f269ai = -1;
        f287b = -1;
        f356i = "";
        int i = f296b[1518] + f296b[1386] + 5;
        int i2 = ((byte) ((f339f[1] >> 16) & 255)) + 4 + 5;
        int i3 = f368l - ((f296b[1387] + f296b[1607]) - 7);
        int i4 = f368l - (i2 + 5);
        m348c(6, i + 4, (i3 > i4 ? i4 : i3) + 4, ((f260aC - (i * 2)) - 1) - 8, i2, 532);
    }

    /* JADX WARNING: Removed duplicated region for block: B:150:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x069f  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m479w() {
        /*
            r2 = 0
        L_0x0001:
            int[][] r3 = f391q
            int r3 = r3.length
            if (r2 >= r3) goto L_0x0972
            int[][] r3 = f391q
            r14 = r3[r2]
            int[][] r3 = f249a
            r4 = 11
            r4 = r14[r4]
            r15 = r3[r4]
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 13
            r16 = r3[r4]
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 3
            r3 = r3[r4]
            r4 = 65536(0x10000, float:9.18355E-41)
            r3 = r3 & r4
            if (r3 != 0) goto L_0x002c
            boolean r3 = m338c(r2)
            if (r3 == 0) goto L_0x002f
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x002f:
            boolean r17 = m433j(r2)
            r0 = r16
            r3 = r0 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x0196
            r3 = 1
            r13 = r3
        L_0x003b:
            r3 = r16 & 8
            if (r3 == 0) goto L_0x019a
            r3 = 1
        L_0x0040:
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 20
            r4 = r4[r5]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r4 = (short) r4
            if (r4 < 0) goto L_0x019d
            r4 = 1
        L_0x0050:
            int[][] r5 = f391q
            r5 = r5[r2]
            r6 = 22
            r5 = r5[r6]
            if (r5 >= 0) goto L_0x005e
            r5 = r16 & 64
            if (r5 == 0) goto L_0x01a0
        L_0x005e:
            r5 = 1
        L_0x005f:
            r6 = 13
            r6 = r15[r6]
            r6 = r6 & 1
            if (r6 != 0) goto L_0x0077
            r6 = 13
            r6 = r15[r6]
            r6 = r6 & 2
            if (r6 != 0) goto L_0x0077
            r6 = 13
            r6 = r15[r6]
            r6 = r6 & 4
            if (r6 == 0) goto L_0x01a3
        L_0x0077:
            r6 = 27
            r6 = r15[r6]
            if (r6 != 0) goto L_0x01a3
            r6 = 1
        L_0x007e:
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 12
            r7 = r7[r8]
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            int r7 = r7 >> 16
            short r7 = (short) r7
            if (r7 <= 0) goto L_0x01a6
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 12
            r7 = r7[r8]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            short r7 = (short) r7
            int r7 = r7 * 100
            int[][] r8 = f391q
            r8 = r8[r2]
            r9 = 12
            r8 = r8[r9]
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r9
            int r8 = r8 >> 16
            short r8 = (short) r8
            int r7 = r7 / r8
            r8 = 50
            if (r7 >= r8) goto L_0x01a6
            r7 = 1
        L_0x00b1:
            int[][] r8 = f391q
            r8 = r8[r2]
            r9 = 12
            r8 = r8[r9]
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r9
            int r8 = r8 >> 16
            short r8 = (short) r8
            if (r8 <= 0) goto L_0x01a9
            int[][] r8 = f391q
            r8 = r8[r2]
            r9 = 12
            r8 = r8[r9]
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r9
            short r8 = (short) r8
            int r8 = r8 * 100
            int[][] r9 = f391q
            r9 = r9[r2]
            r10 = 12
            r9 = r9[r10]
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r10
            int r9 = r9 >> 16
            short r9 = (short) r9
            int r8 = r8 / r9
            r9 = 20
            if (r8 >= r9) goto L_0x01a9
            r8 = 1
        L_0x00e4:
            r12 = 0
            r9 = 13
            r9 = r15[r9]
            r9 = r9 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x01ac
            r9 = 1
        L_0x00ee:
            int[][] r10 = f391q
            r10 = r10[r2]
            r11 = 21
            r10 = r10[r11]
            if (r10 < 0) goto L_0x0104
            int[][] r10 = f391q
            r10 = r10[r2]
            r11 = 21
            r18 = r10[r11]
            int r18 = r18 + -1
            r10[r11] = r18
        L_0x0104:
            int[][] r10 = f391q
            r10 = r10[r2]
            r11 = 26
            r10 = r10[r11]
            r11 = -65536(0xffffffffffff0000, float:NaN)
            r10 = r10 & r11
            int r10 = r10 >> 16
            short r11 = (short) r10
            int[][] r10 = f391q
            r10 = r10[r2]
            r18 = 26
            r10 = r10[r18]
            r18 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r18
            short r10 = (short) r10
            if (r11 < 0) goto L_0x0145
            if (r4 == 0) goto L_0x0145
            int r11 = r11 + -1
            if (r11 >= 0) goto L_0x012c
            r11 = 20
            int r10 = r10 + 1
        L_0x012c:
            int[][] r18 = f391q
            r18 = r18[r2]
            r19 = 26
            short r0 = (short) r10
            r20 = r0
            r21 = 65535(0xffff, float:9.1834E-41)
            r20 = r20 & r21
            short r11 = (short) r11
            int r11 = r11 << 16
            r21 = -65536(0xffffffffffff0000, float:NaN)
            r11 = r11 & r21
            r11 = r11 | r20
            r18[r19] = r11
        L_0x0145:
            if (r13 == 0) goto L_0x01bb
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 25
            r11 = r11[r13]
            if (r11 > 0) goto L_0x01af
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 13
            r18 = r11[r13]
            r0 = r18
            r0 = r0 & -129(0xffffffffffffff7f, float:NaN)
            r18 = r0
            r11[r13] = r18
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 20
            r11 = r11[r13]
            r13 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r13
            short r11 = (short) r11
            if (r11 < 0) goto L_0x01af
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r11]
            r4 = 20
            r5 = -1
            r3[r4] = r5
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r11]
            r4 = 22
            r5 = -1
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 20
            r5 = -1
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 22
            r5 = -1
            r3[r4] = r5
            goto L_0x002c
        L_0x0196:
            r3 = 0
            r13 = r3
            goto L_0x003b
        L_0x019a:
            r3 = 0
            goto L_0x0040
        L_0x019d:
            r4 = 0
            goto L_0x0050
        L_0x01a0:
            r5 = 0
            goto L_0x005f
        L_0x01a3:
            r6 = 0
            goto L_0x007e
        L_0x01a6:
            r7 = 0
            goto L_0x00b1
        L_0x01a9:
            r8 = 0
            goto L_0x00e4
        L_0x01ac:
            r9 = 0
            goto L_0x00ee
        L_0x01af:
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 25
            r18 = r11[r13]
            int r18 = r18 + -1
            r11[r13] = r18
        L_0x01bb:
            r0 = r16
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0212
            boolean r11 = f377n
            if (r11 != 0) goto L_0x01cf
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 30
            r11 = r11[r13]
            if (r11 <= 0) goto L_0x0212
        L_0x01cf:
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 30
            r16 = r11[r13]
            int r16 = r16 + -1
            r11[r13] = r16
            boolean r11 = f377n
            if (r11 != 0) goto L_0x01e9
            int[][] r11 = f391q
            r11 = r11[r2]
            r13 = 30
            r11 = r11[r13]
            if (r11 > 0) goto L_0x0212
        L_0x01e9:
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 13
            r5 = r3[r4]
            r5 = r5 & -513(0xfffffffffffffdff, float:NaN)
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 20
            r5 = -1
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 22
            r5 = -1
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 30
            r5 = 0
            r3[r4] = r5
            goto L_0x002c
        L_0x0212:
            if (r3 != 0) goto L_0x002c
            r3 = 13
            r3 = r15[r3]
            r3 = r3 & 512(0x200, float:7.175E-43)
            if (r3 == 0) goto L_0x02a9
            if (r8 == 0) goto L_0x0412
            r3 = 100
            int r3 = p000.C0000HG.m58e(r3)
            r8 = 60
            if (r3 >= r8) goto L_0x0412
            r3 = 1
        L_0x0229:
            if (r3 == 0) goto L_0x02a9
            r3 = 0
            r7 = 0
        L_0x022d:
            r8 = 2
            if (r7 >= r8) goto L_0x02a7
            int[][] r8 = f391q
            r8 = r8[r2]
            int r11 = r7 + 17
            r8 = r8[r11]
            r11 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r11
            int r8 = r8 >> 16
            short r8 = (short) r8
            int[][] r11 = f391q
            r11 = r11[r2]
            int r12 = r7 + 17
            r11 = r11[r12]
            r12 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r12
            short r11 = (short) r11
            r12 = 2
            if (r11 != r12) goto L_0x0421
            if (r8 < 0) goto L_0x0421
            int[][] r11 = f371l
            r8 = r11[r8]
            int[] r8 = m230a(r8)
            r11 = 6
            r11 = r8[r11]
            if (r11 != 0) goto L_0x0421
            r11 = 3
            r11 = r8[r11]
            if (r11 <= 0) goto L_0x0421
            r3 = 6
            r3 = r8[r3]
            r11 = 3
            r8 = r8[r11]
            r11 = 1
            r12 = 0
            int[][] r13 = f391q
            r13 = r13[r2]
            m253a(r3, r8, r11, r12, r13)
            int[][] r3 = f391q
            r3 = r3[r2]
            int r7 = r7 + 17
            r8 = -1
            r3[r7] = r8
            r3 = 1
            int r7 = f265ae
            m362d(r7)
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 4
            r7 = r7[r8]
            int[][] r8 = f391q
            r8 = r8[r2]
            r11 = 5
            r8 = r8[r11]
            int[][] r11 = f391q
            r11 = r11[r2]
            r12 = 2
            r11 = r11[r12]
            r12 = 65535(0xffff, float:9.1834E-41)
            r11 = r11 & r12
            short r11 = (short) r11
            m418h(r7, r8, r11)
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 21
            r11 = 20
            r7[r8] = r11
        L_0x02a7:
            if (r3 != 0) goto L_0x002c
        L_0x02a9:
            if (r4 == 0) goto L_0x096f
            r3 = 20
            r3 = r14[r3]
            r7 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r7
            short r11 = (short) r3
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r11]
            boolean r3 = m228a(r2, r3)
            if (r3 == 0) goto L_0x092d
            int r3 = m311b(r14)
            int[][] r7 = p000.C0001a.f124d
            r7 = r7[r11]
            int r7 = m311b(r7)
            int[] r8 = f410v
            r12 = 0
            r13 = 65535(0xffff, float:9.1834E-41)
            r13 = r13 & r3
            short r13 = (short) r13
            int r13 = r13 << 11
            r8[r12] = r13
            int[] r8 = f410v
            r12 = 1
            r13 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r13
            int r3 = r3 >> 16
            short r3 = (short) r3
            int r3 = r3 << 11
            r8[r12] = r3
            int[] r3 = f422y
            r8 = 0
            r12 = 65535(0xffff, float:9.1834E-41)
            r12 = r12 & r7
            short r12 = (short) r12
            int r12 = r12 << 11
            r3[r8] = r12
            int[] r3 = f422y
            r8 = 1
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r12
            int r7 = r7 >> 16
            short r7 = (short) r7
            int r7 = r7 << 11
            r3[r8] = r7
            r3 = 29
            r7 = r15[r3]
            r3 = 29
            r3 = r15[r3]
            r8 = 29
            r8 = r15[r8]
            int r3 = r3 * r8
            r8 = 14
            r8 = r14[r8]
            if (r8 < 0) goto L_0x032e
            int[][] r7 = f359i
            r8 = 14
            r8 = r14[r8]
            r7 = r7[r8]
            int r7 = m437k(r7)
            int[][] r8 = f359i
            r12 = 14
            r12 = r14[r12]
            r8 = r8[r12]
            int r8 = m442l(r8)
            if (r8 == 0) goto L_0x032c
            r12 = 1
            if (r8 != r12) goto L_0x032e
        L_0x032c:
            int r3 = r7 * r7
        L_0x032e:
            r8 = 15
            r8 = r14[r8]
            if (r8 < 0) goto L_0x0356
            int[][] r8 = f359i
            r12 = 15
            r12 = r14[r12]
            r8 = r8[r12]
            int r8 = m437k(r8)
            int[][] r12 = f359i
            r13 = 15
            r13 = r14[r13]
            r12 = r12[r13]
            int r12 = m442l(r12)
            if (r12 == 0) goto L_0x0351
            r13 = 1
            if (r12 != r13) goto L_0x0353
        L_0x0351:
            int r3 = r8 * r8
        L_0x0353:
            if (r8 <= r7) goto L_0x0356
            r7 = r8
        L_0x0356:
            int[] r8 = f410v
            int[] r12 = f422y
            long r12 = m235a(r8, r12)
            long r0 = (long) r3
            r18 = r0
            int r3 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r3 > 0) goto L_0x0425
            r3 = 1
        L_0x0366:
            r8 = 0
            r16 = 13
            r16 = r15[r16]
            r16 = r16 & 1
            if (r16 != 0) goto L_0x0377
            r16 = 13
            r16 = r15[r16]
            r16 = r16 & 2
            if (r16 == 0) goto L_0x0379
        L_0x0377:
            r10 = 10
        L_0x0379:
            if (r3 != 0) goto L_0x0386
            int r7 = r7 * r7
            long r0 = (long) r7
            r18 = r0
            int r7 = (r12 > r18 ? 1 : (r12 == r18 ? 0 : -1))
            if (r7 > 0) goto L_0x0976
            r7 = 3
            if (r10 <= r7) goto L_0x0976
        L_0x0386:
            int[][] r7 = f391q
            r7 = r7[r2]
            r10 = 26
            r12 = 10
            r7[r10] = r12
            boolean r7 = m450m(r2)
            if (r7 != 0) goto L_0x002c
            int[][] r7 = f391q
            r7 = r7[r2]
            r10 = 21
            r7 = r7[r10]
            if (r7 >= 0) goto L_0x0428
            int r3 = m226a(r2, r11, r3)
            r7 = -1
            if (r3 == r7) goto L_0x0976
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r11]
            r4 = 4
            r3 = r3[r4]
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 4
            r4 = r4[r5]
            int r3 = r3 - r4
            int[][] r4 = p000.C0001a.f124d
            r4 = r4[r11]
            r5 = 5
            r4 = r4[r5]
            int[][] r5 = f391q
            r5 = r5[r2]
            r6 = 5
            r5 = r5[r6]
            int r4 = r4 - r5
            int r3 = m308b(r3, r4)
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 27
            short r6 = (short) r3
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            short r7 = (short) r3
            int r7 = r7 << 16
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            r6 = r6 | r7
            r4[r5] = r6
            int[][] r4 = f391q
            r4 = r4[r2]
            int r3 = r3 + 8
            m393f(r4, r3)
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 13
            r5 = r3[r4]
            r5 = r5 | 16
            r3[r4] = r5
            if (r9 == 0) goto L_0x03f8
            r3 = 1
            m227a(r2, r3)
        L_0x03f8:
            m307b(r2)
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 13
            r5 = r3[r4]
            r5 = r5 & -65
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 22
            r5 = -1
            r3[r4] = r5
            goto L_0x002c
        L_0x0412:
            if (r7 == 0) goto L_0x097a
            r3 = 100
            int r3 = p000.C0000HG.m58e(r3)
            r7 = 25
            if (r3 >= r7) goto L_0x097a
            r3 = 1
            goto L_0x0229
        L_0x0421:
            int r7 = r7 + 1
            goto L_0x022d
        L_0x0425:
            r3 = 0
            goto L_0x0366
        L_0x0428:
            int[][] r3 = f391q
            r3 = r3[r2]
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 27
            r5 = r5[r7]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            short r5 = (short) r5
            int r5 = r5 + 0
            m393f(r3, r5)
            r3 = 0
            r5 = 1
            r7 = r5
        L_0x0441:
            if (r7 != 0) goto L_0x0547
            r5 = 11
            r5 = r15[r5]
            int r5 = r5 * 4096
            int[][] r7 = f391q
            r7 = r7[r2]
            int[][] r8 = p000.C0001a.f124d
            r8 = r8[r11]
            boolean r7 = p000.C0001a.m127a(r7, r8, r5)
            if (r7 == 0) goto L_0x0773
            r5 = 13
            r5 = r15[r5]
            r5 = r5 & 1
            if (r5 != 0) goto L_0x0534
            r5 = 13
            r5 = r15[r5]
            r5 = r5 & 2
            if (r5 != 0) goto L_0x0534
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 != 0) goto L_0x0534
            if (r17 != 0) goto L_0x0534
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r5 = r5[r7]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            short r5 = (short) r5
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 20
            r7 = r7[r8]
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            int r7 = r7 >> 16
            short r7 = (short) r7
            if (r5 != r7) goto L_0x049d
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r5 = r5[r7]
            r7 = -1
            if (r5 != r7) goto L_0x0534
        L_0x049d:
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 26
            r5 = r5[r7]
            r7 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r7
            short r5 = (short) r5
            r7 = 3
            if (r5 >= r7) goto L_0x0534
            if (r9 == 0) goto L_0x04b3
            r3 = 0
            m227a(r2, r3)
        L_0x04b3:
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 26
            r3 = r3[r4]
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r4
            int r3 = r3 >> 16
            short r3 = (short) r3
            r4 = 20
            if (r3 != r4) goto L_0x0511
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r11]
            r4 = 4
            r3 = r3[r4]
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 4
            r4 = r4[r5]
            int r3 = r3 - r4
            int[][] r4 = p000.C0001a.f124d
            r4 = r4[r11]
            r5 = 5
            r4 = r4[r5]
            int[][] r5 = f391q
            r5 = r5[r2]
            r6 = 5
            r5 = r5[r6]
            int r4 = r4 - r5
            int r3 = m308b(r3, r4)
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 27
            short r6 = (short) r3
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            short r3 = (short) r3
            int r3 = r3 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r7
            r3 = r3 | r6
            r4[r5] = r3
            int[][] r3 = f391q
            r3 = r3[r2]
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 27
            r4 = r4[r5]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r4 = (short) r4
            int r4 = r4 + 12
            m393f(r3, r4)
        L_0x0511:
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 1
            boolean r3 = m274a(r3, r4)
            if (r3 == 0) goto L_0x002c
            int[][] r3 = f391q
            r3 = r3[r2]
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 27
            r4 = r4[r5]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r4 = (short) r4
            int r4 = r4 + 0
            m393f(r3, r4)
            goto L_0x002c
        L_0x0534:
            if (r3 != 0) goto L_0x0547
            int[][] r3 = f391q
            r3 = r3[r2]
            r5 = 22
            int[][] r7 = p000.C0001a.f124d
            r7 = r7[r11]
            int r7 = m311b(r7)
            r3[r5] = r7
            r3 = 1
        L_0x0547:
            if (r3 == 0) goto L_0x069d
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r5 = r5 & 512(0x200, float:7.175E-43)
            if (r5 != 0) goto L_0x069d
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x069a
            int r5 = f420y
            int[][] r7 = f391q
            int r7 = r7.length
            int r5 = r5 % r7
            if (r5 != r2) goto L_0x069a
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 29
            r5 = r5[r7]
            r7 = 20
            r7 = r14[r7]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            short r7 = (short) r7
            if (r7 < 0) goto L_0x069a
            int[] r8 = f410v
            r9 = 0
            int[][] r10 = f391q
            r10 = r10[r2]
            r11 = 0
            r10 = r10[r11]
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r11
            short r10 = (short) r10
            int r10 = r10 << 12
            int r10 = r10 + 2048
            r8[r9] = r10
            int[] r8 = f410v
            r9 = 1
            int[][] r10 = f391q
            r10 = r10[r2]
            r11 = 0
            r10 = r10[r11]
            r11 = -65536(0xffffffffffff0000, float:NaN)
            r10 = r10 & r11
            int r10 = r10 >> 16
            short r10 = (short) r10
            int r10 = r10 << 12
            int r10 = r10 + 2048
            r8[r9] = r10
            int[] r8 = f422y
            r9 = 0
            int[][] r10 = p000.C0001a.f124d
            r10 = r10[r7]
            r11 = 0
            r10 = r10[r11]
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r11
            short r10 = (short) r10
            int r10 = r10 << 12
            int r10 = r10 + 2048
            r8[r9] = r10
            int[] r8 = f422y
            r9 = 1
            int[][] r10 = p000.C0001a.f124d
            r10 = r10[r7]
            r11 = 0
            r10 = r10[r11]
            r11 = -65536(0xffffffffffff0000, float:NaN)
            r10 = r10 & r11
            int r10 = r10 >> 16
            short r10 = (short) r10
            int r10 = r10 << 12
            int r10 = r10 + 2048
            r8[r9] = r10
            int[] r8 = f410v
            int[] r9 = f422y
            long r8 = m235a(r8, r9)
            int[] r10 = f422y
            r11 = 0
            int[][] r12 = f391q
            r12 = r12[r2]
            r13 = 22
            r12 = r12[r13]
            r13 = 65535(0xffff, float:9.1834E-41)
            r12 = r12 & r13
            short r12 = (short) r12
            int r12 = r12 / 2
            int r12 = r12 << 12
            int r12 = r12 + 2048
            r10[r11] = r12
            int[] r10 = f422y
            r11 = 1
            int[][] r12 = f391q
            r12 = r12[r2]
            r13 = 22
            r12 = r12[r13]
            r13 = -65536(0xffffffffffff0000, float:NaN)
            r12 = r12 & r13
            int r12 = r12 >> 16
            short r12 = (short) r12
            int r12 = r12 / 2
            int r12 = r12 << 12
            int r12 = r12 + 2048
            r10[r11] = r12
            int[] r10 = f410v
            int[] r11 = f422y
            long r10 = m235a(r10, r11)
            int[] r12 = f410v
            r13 = 0
            int[][] r14 = p000.C0001a.f124d
            r14 = r14[r7]
            r16 = 0
            r14 = r14[r16]
            r16 = 65535(0xffff, float:9.1834E-41)
            r14 = r14 & r16
            short r14 = (short) r14
            int r14 = r14 << 12
            int r14 = r14 + 2048
            r12[r13] = r14
            int[] r12 = f410v
            r13 = 1
            int[][] r14 = p000.C0001a.f124d
            r14 = r14[r7]
            r16 = 0
            r14 = r14[r16]
            r16 = -65536(0xffffffffffff0000, float:NaN)
            r14 = r14 & r16
            int r14 = r14 >> 16
            short r14 = (short) r14
            int r14 = r14 << 12
            int r14 = r14 + 2048
            r12[r13] = r14
            int[] r12 = f410v
            int[] r13 = f422y
            long r12 = m235a(r12, r13)
            int r14 = r5 * r5
            long r0 = (long) r14
            r16 = r0
            long r12 = r12 - r16
            long r10 = r10 + r12
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x065c
            int r5 = r5 * r5
            long r8 = (long) r5
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x066e
        L_0x065c:
            int[][] r5 = f391q
            r5 = r5[r2]
            int r5 = m311b(r5)
            int[][] r8 = f391q
            r8 = r8[r2]
            r9 = 22
            r8 = r8[r9]
            if (r5 != r8) goto L_0x069a
        L_0x066e:
            int[][] r3 = f391q
            r3 = r3[r2]
            r5 = 22
            int[][] r8 = p000.C0001a.f124d
            r7 = r8[r7]
            int r7 = m311b(r7)
            r3[r5] = r7
            int[][] r3 = f391q
            r3 = r3[r2]
            r5 = 13
            r7 = r3[r5]
            r7 = r7 & -65
            r3[r5] = r7
            int[][] r3 = f391q
            r3 = r3[r2]
            r5 = 13
            r7 = r3[r5]
            r7 = r7 & -513(0xfffffffffffffdff, float:NaN)
            r3[r5] = r7
            m307b(r2)
            r3 = 1
        L_0x069a:
            m377e(r2)
        L_0x069d:
            if (r4 != 0) goto L_0x0769
            int[][] r4 = f249a
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 11
            r5 = r5[r7]
            r4 = r4[r5]
            r5 = 13
            r4 = r4[r5]
            r4 = r4 & 8
            if (r4 != 0) goto L_0x06c3
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 13
            r4 = r4[r5]
            r5 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r5
            if (r4 != 0) goto L_0x06c3
            m322b(r2, r6)
        L_0x06c3:
            if (r3 != 0) goto L_0x0769
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 20
            r3 = r3[r4]
            r4 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r4
            short r3 = (short) r3
            r4 = -1
            if (r3 != r4) goto L_0x0769
            int[][] r3 = f391q
            r3 = r3[r2]
            int[][] r4 = f391q
            r4 = r4[r2]
            r5 = 27
            r4 = r4[r5]
            r5 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r5
            short r4 = (short) r4
            int r4 = r4 + 0
            m393f(r3, r4)
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 13
            r5 = r3[r4]
            r5 = r5 & -16385(0xffffffffffffbfff, float:NaN)
            r3[r4] = r5
            r3 = 27
            r3 = r15[r3]
            if (r3 == 0) goto L_0x0705
            r3 = 27
            r3 = r15[r3]
            r4 = 9
            if (r3 != r4) goto L_0x0769
        L_0x0705:
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 31
            r5 = r3[r4]
            int r5 = r5 + -1
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 31
            r3 = r3[r4]
            if (r3 > 0) goto L_0x0769
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 31
            r5 = 20
            r6 = 50
            int r5 = p000.C0000HG.m40b(r5, r6)
            r3[r4] = r5
            int[][] r3 = f391q
            r3 = r3[r2]
            int r3 = m311b(r3)
            r4 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r3
            short r4 = (short) r4
            r5 = -5
            r6 = 5
            int r5 = p000.C0000HG.m40b(r5, r6)
            int r4 = r4 + r5
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r5
            int r3 = r3 >> 16
            short r3 = (short) r3
            r5 = -5
            r6 = 5
            int r5 = p000.C0000HG.m40b(r5, r6)
            int r5 = r5 + r3
            r3 = 0
            r6 = 1
            r7 = 0
            boolean r3 = m286a(r2, r3, r4, r5, r6, r7)
            if (r3 == 0) goto L_0x0769
            int[][] r3 = f391q
            r3 = r3[r2]
            r6 = 22
            short r4 = (short) r4
            r7 = 65535(0xffff, float:9.1834E-41)
            r4 = r4 & r7
            short r5 = (short) r5
            int r5 = r5 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r5 = r5 & r7
            r4 = r4 | r5
            r3[r6] = r4
        L_0x0769:
            int[][] r3 = f391q
            r3 = r3[r2]
            r4 = 1
            m274a(r3, r4)
            goto L_0x002c
        L_0x0773:
            r7 = 13
            r7 = r15[r7]
            r7 = r7 & 1
            if (r7 != 0) goto L_0x07d8
            r7 = 13
            r7 = r15[r7]
            r7 = r7 & 2
            if (r7 != 0) goto L_0x07d8
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 26
            r7 = r7[r8]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            short r7 = (short) r7
            r8 = 3
            if (r7 > r8) goto L_0x07d8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r7
            if (r5 != 0) goto L_0x0547
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r8 = r5[r7]
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r9
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r8 = r5[r7]
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 | r9
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 22
            int[][] r8 = f391q
            r8 = r8[r2]
            r9 = 23
            r8 = r8[r9]
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 26
            r8 = 1376256(0x150000, float:1.928545E-39)
            r5[r7] = r8
            goto L_0x0547
        L_0x07d8:
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 22
            r7 = r7[r8]
            r8 = -1
            if (r7 != r8) goto L_0x080d
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 22
            int[][] r8 = p000.C0001a.f124d
            r8 = r8[r11]
            int r8 = m311b(r8)
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r8 = r5[r7]
            r8 = r8 & -65
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r8 = r5[r7]
            r8 = r8 & -513(0xfffffffffffffdff, float:NaN)
            r5[r7] = r8
            goto L_0x0547
        L_0x080d:
            int[] r7 = f410v
            r8 = 0
            int[][] r9 = f391q
            r9 = r9[r2]
            r10 = 4
            r9 = r9[r10]
            r7[r8] = r9
            int[] r7 = f410v
            r8 = 1
            int[][] r9 = f391q
            r9 = r9[r2]
            r10 = 5
            r9 = r9[r10]
            r7[r8] = r9
            long r8 = (long) r5
            r5 = 13
            r5 = r15[r5]
            r5 = r5 & 1
            if (r5 != 0) goto L_0x0547
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r7 = 32768(0x8000, float:4.5918E-41)
            r5 = r5 & r7
            if (r5 != 0) goto L_0x0547
            r5 = 13
            r5 = r15[r5]
            r5 = r5 & 2
            if (r5 == 0) goto L_0x0913
            r12 = 4
            long r8 = r8 * r12
        L_0x0847:
            int[] r5 = f422y
            r7 = 0
            int[][] r10 = f391q
            r10 = r10[r2]
            r12 = 23
            r10 = r10[r12]
            r12 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r12
            short r10 = (short) r10
            int r10 = r10 << 11
            int r10 = r10 + 2048
            r5[r7] = r10
            int[] r5 = f422y
            r7 = 1
            int[][] r10 = f391q
            r10 = r10[r2]
            r12 = 23
            r10 = r10[r12]
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r10 = r10 & r12
            int r10 = r10 >> 16
            short r10 = (short) r10
            int r10 = r10 << 11
            int r10 = r10 + 2048
            r5[r7] = r10
            int[] r5 = f410v
            int[] r7 = f422y
            long r12 = m235a(r5, r7)
            long r8 = r8 * r8
            int r5 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x088d
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r5 = r5 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x0547
        L_0x088d:
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r5 = r5[r7]
            r5 = r5 & 64
            if (r5 == 0) goto L_0x08a8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r8 = r5[r7]
            r8 = r8 & -65
            r5[r7] = r8
            m307b(r2)
        L_0x08a8:
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 13
            r8 = r5[r7]
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            int r5 = m311b(r5)
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 23
            r7 = r7[r8]
            if (r5 == r7) goto L_0x08d7
            int[][] r3 = f391q
            r3 = r3[r2]
            r5 = 22
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 23
            r7 = r7[r8]
            r3[r5] = r7
            r3 = 1
        L_0x08d7:
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r8 = r5[r7]
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r9
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r8 = r5[r7]
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 | r9
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r8 = r5[r7]
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 & r9
            r5[r7] = r8
            int[][] r5 = f391q
            r5 = r5[r2]
            r7 = 20
            r8 = r5[r7]
            short r9 = (short) r11
            int r9 = r9 << 16
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r10
            r8 = r8 | r9
            r5[r7] = r8
            goto L_0x0547
        L_0x0913:
            r5 = 13
            r5 = r15[r5]
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0920
            r12 = 3
            long r8 = r8 * r12
            goto L_0x0847
        L_0x0920:
            r5 = 13
            r5 = r15[r5]
            r5 = r5 & 8
            if (r5 == 0) goto L_0x0847
            r12 = 2
            long r8 = r8 * r12
            goto L_0x0847
        L_0x092d:
            int[][] r3 = f249a
            int[][] r7 = f391q
            r7 = r7[r2]
            r8 = 11
            r7 = r7[r8]
            r3 = r3[r7]
            r7 = 13
            r3 = r3[r7]
            r3 = r3 & 8
            if (r3 != 0) goto L_0x0954
            int[][] r3 = f391q
            r3 = r3[r2]
            r7 = 13
            r3 = r3[r7]
            r7 = 131072(0x20000, float:1.83671E-40)
            r3 = r3 & r7
            if (r3 != 0) goto L_0x096f
            m322b(r2, r6)
            r3 = r5
            goto L_0x0547
        L_0x0954:
            int[][] r3 = f391q
            r3 = r3[r2]
            r7 = 20
            r8 = r3[r7]
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r9
            r3[r7] = r8
            int[][] r3 = f391q
            r3 = r3[r2]
            r7 = 20
            r8 = r3[r7]
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = r8 | r9
            r3[r7] = r8
        L_0x096f:
            r3 = r5
            goto L_0x0547
        L_0x0972:
            r2 = 0
            f377n = r2
            return
        L_0x0976:
            r7 = r8
            r3 = r5
            goto L_0x0441
        L_0x097a:
            r3 = r12
            goto L_0x0229
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003c.m479w():void");
    }

    /* renamed from: x */
    public static final void m480x() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < f363j.length) {
                if ((f363j[i2][3] & 65536) == 0) {
                    short s = (short) (f363j[i2][14] & 65535);
                    int[] iArr = C0001a.f124d[(short) ((f363j[i2][11] & -65536) >> 16)];
                    short s2 = (short) ((f363j[i2][13] & -65536) >> 16);
                    int i3 = ((short) (f363j[i2][13] & 65535)) - 1;
                    if (i3 == 0) {
                        m421h(f363j[i2], (int) (short) ((f363j[i2][11] & -65536) >> 16));
                    } else {
                        int[] iArr2 = f363j[i2];
                        iArr2[13] = iArr2[13] & -65536;
                        int[] iArr3 = f363j[i2];
                        iArr3[13] = iArr3[13] | (((short) i3) & 65535);
                        int i4 = f363j[i2][9] - iArr[4];
                        int i5 = f363j[i2][10] - iArr[5];
                        int g = mo11g((i4 * i4) + (i5 * i5));
                        if (g == 0) {
                            int[] iArr4 = f363j[i2];
                            iArr4[3] = iArr4[3] | 65536;
                            C0001a.m135b(f363j[i2]);
                        } else {
                            int i6 = f363j[i2][6];
                            int i7 = f363j[i2][7];
                            f363j[i2][6] = ((i4 * i3) / s2) + iArr[4];
                            f363j[i2][7] = iArr[5] + ((i5 * i3) / s2);
                            int a = C0001a.m100a(i6, i7, f363j[i2][6], f363j[i2][7], 4144, f347g, true);
                            if (a == -2 || a == ((short) (f363j[i2][11] & 65535))) {
                                f363j[i2][4] = f363j[i2][6] + ((f225W[(s * 7) + 4] * i4) / g);
                                f363j[i2][5] = f363j[i2][7] + ((f225W[(s * 7) + 4] * i5) / g);
                                short s3 = (short) ((f363j[i2][8] & -65536) >> 16);
                                f363j[i2][8] = (((short) s3) & 65535) | ((((short) ((f225W[(s * 7) + 6] * (i3 - (s2 >> 1))) + s3)) << 16) & -65536);
                                C0001a.m135b(f363j[i2]);
                                f363j[i2][0] = (((short) (f363j[i2][4] >> 12)) & 65535) | ((((short) (f363j[i2][5] >> 12)) << 16) & -65536);
                                C0001a.m102a(f363j[i2]);
                            } else if (a == -1) {
                                m421h(f363j[i2], -1);
                            } else {
                                m421h(f363j[i2], a);
                            }
                        }
                    }
                }
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: y */
    public static final void m481y() {
        boolean z;
        int d = m362d(f414w[40]);
        if (m220a(65) || f425z) {
            int i = ((((short) C0000HG.f42c) << 16) & -65536) | (((short) C0000HG.f8a) & 65535);
            f414w[d + 31] = i;
            int[] iArr = f414w;
            iArr[39] = iArr[39] | (1 << d);
            for (int i2 = 0; i2 < 8; i2++) {
                if (i2 != d && i == f414w[i2 + 31]) {
                    f414w[i2 + 31] = -1;
                    int[] iArr2 = f414w;
                    iArr2[39] = iArr2[39] & ((1 << i2) ^ -1);
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (m220a(95) || m220a(85) || z) {
            f393r = false;
            m193A();
            if (C0000HG.f21a == 19 || C0000HG.f21a == 21) {
                C0000HG.m26a(C0000HG.f21a);
            } else {
                C0000HG.m82n();
            }
            C0000HG.f70l = true;
        }
        f414w[40] = d;
        m394f();
    }

    /* renamed from: z */
    public static final void m482z() {
        f414w = new int[55];
        f253a = (int[][][]) Array.newInstance(int[].class, new int[]{6, 15});
        for (int i = 0; i < 15; i++) {
            f253a[0][i] = new int[9];
            f253a[1][i] = new int[9];
            f253a[2][i] = new int[7];
            f253a[3][i] = new int[8];
            f253a[4][i] = new int[6];
            f253a[5][i] = new int[6];
        }
        f187D = new int[23];
        f399s = (int[][]) Array.newInstance(Integer.TYPE, new int[]{19, 4});
        f378n = null;
        f209O = null;
        f398s = null;
        f201K = null;
        f402t = null;
        f205M = null;
        f199J = null;
        f386p = null;
    }

    /* renamed from: ag */
    public final void mo9ag() {
        switch (f196I) {
            case 1:
                if ((System.currentTimeMillis() >= f335f + 3000 || f335f == 0) && f279as < 2) {
                    f335f = System.currentTimeMillis();
                    try {
                        f290b = Image.createImage(new StringBuffer().append("/s0").append(f279as).append(".").append("png").toString());
                    } catch (Exception e) {
                    }
                    f279as++;
                    if (f279as == 2) {
                        f335f = 0;
                        f233a = new C0002b();
                        f233a.mo6a(C0000HG.f11a, 1);
                        new Thread(f233a).start();
                        f304c = -1;
                    }
                }
                if (f233a != null && C0002b.f170a >= 100) {
                    if (f304c < 0) {
                        f304c = System.currentTimeMillis() + 1000;
                    }
                    if (f304c < System.currentTimeMillis()) {
                        mo11g(5);
                        C0000HG.f70l = true;
                        C0000HG.m64g(17);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (System.currentTimeMillis() >= f335f + 3000 || f335f == 0) {
                    f335f = System.currentTimeMillis();
                    try {
                        if (f279as < 10) {
                            f290b = Image.createImage(new StringBuffer().append("/s0").append(f279as).append(".").append("png").toString());
                        } else {
                            f290b = Image.createImage(new StringBuffer().append("/s").append(f279as).append(".").append("png").toString());
                        }
                        f279as++;
                        return;
                    } catch (Exception e2) {
                        if (!f417x) {
                            m446l(159);
                            f290b = f250a[159][0];
                            f417x = true;
                            f279as++;
                            return;
                        }
                        f290b = null;
                        mo11g(5);
                        C0000HG.m64g(0);
                        C0000HG.f70l = true;
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                C0000HG.f10a.destroyApp(false);
                return;
            case 6:
                synchronized (f233a.f172a) {
                    if (!C0000HG.f70l || C0000HG.f21a > 17) {
                        m204L();
                        if (!f401t && !f389q) {
                            m479w();
                        }
                        m218Z();
                        m438k();
                        m480x();
                        m425i();
                        m460p();
                    }
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public final void mo10g() {
        switch (f196I) {
            case 1:
                m306b();
                return;
            case 2:
                f290b = null;
                C0000HG.f70l = false;
                C0000HG.f84v = 0;
                C0000HG.f65j = -1;
                m193A();
                C0000HG.m81m(0);
                return;
            case 5:
                C0000HG.m64g(0);
                m446l(159);
                return;
            default:
                return;
        }
    }

    /* renamed from: g */
    public final void m485g(int i) {
        f196I = i;
        mo10g();
    }

    public final void hideNotify() {
        m201I();
    }

    /* renamed from: i */
    public final void m486i(int i) {
        Runtime.getRuntime();
        C0000HG.m38b();
        C0000HG.f29a[4] = true;
        String property = System.getProperty("microedition.locale");
        if (property != null) {
            property = property.toUpperCase();
        }
        C0000HG.m5a(property);
        f328e = C0000HG.m0a(396);
        f344g = C0000HG.m0a(407);
        f344g = new StringBuffer().append(f344g).append("\n").append(C0000HG.m0a(408)).toString();
        f344g = new StringBuffer().append(f344g).append(" ").append(C0000HG.m0a(298)).toString();
        C0000HG.m65g();
        m302ac();
        switch (i) {
            case 1:
                m211S();
                m470s();
                C0000HG.m78l();
                m446l(159);
                return;
            default:
                return;
        }
    }

    public final void keyPressed(int i) {
        m193A();
        m208P();
        char c = 65535;
        switch (i) {
            case -7:
                c = 17;
                break;
            case -6:
                c = 18;
                break;
            case -5:
                c = 4;
                break;
            case -4:
                c = 2;
                break;
            case -3:
                c = 1;
                break;
            case -2:
                c = 3;
                break;
            case -1:
                c = 0;
                break;
            case 35:
                c = 15;
                break;
            case 42:
                c = 16;
                break;
            case 48:
                c = 5;
                break;
            case 49:
                c = 6;
                break;
            case 50:
                c = 7;
                break;
            case 51:
                c = 8;
                break;
            case 52:
                c = 9;
                break;
            case 53:
                c = 10;
                break;
            case 54:
                c = 11;
                break;
            case 55:
                c = 12;
                break;
            case 56:
                c = 13;
                break;
            case 57:
                c = 14;
                break;
        }
        if (c < 0) {
            return;
        }
        if (f196I == 2 || f196I == 1) {
            f335f = 0;
        } else if (f196I != 3) {
            f321d[c] = 20;
            f308c[c] = 0;
        }
    }

    public final void keyReleased(int i) {
        switch (i) {
            case -7:
                f308c[17] = 10;
                return;
            case -6:
                f308c[18] = 10;
                return;
            case -5:
                f308c[4] = 10;
                return;
            case -4:
                f308c[2] = 10;
                return;
            case -3:
                f308c[1] = 10;
                return;
            case -2:
                f308c[3] = 10;
                return;
            case -1:
                f308c[0] = 10;
                return;
            case 35:
                f308c[15] = 10;
                return;
            case 42:
                f308c[16] = 10;
                return;
            case 48:
                f308c[5] = 10;
                return;
            case 49:
                f308c[6] = 10;
                return;
            case 50:
                f308c[7] = 10;
                return;
            case 51:
                f308c[8] = 10;
                return;
            case 52:
                f308c[9] = 10;
                return;
            case 53:
                f308c[10] = 10;
                return;
            case 54:
                f308c[11] = 10;
                return;
            case 55:
                f308c[12] = 10;
                return;
            case 56:
                f308c[13] = 10;
                return;
            case 57:
                f308c[14] = 10;
                return;
            default:
                return;
        }
    }

    public final void keyRepeated(int i) {
    }

    public final void paint(Graphics graphics) {
        m398f(graphics);
        if (C0000HG.f70l) {
            C0000HG.m6a(graphics);
            if (!f421y) {
                if (f389q) {
                    m476u(graphics);
                }
                if (f401t) {
                    m444l(graphics);
                }
            }
        }
    }

    public final void run() {
        while (f365k) {
            m217Y();
            if (!f421y) {
                mo9ag();
            }
            if (C0000HG.f36b) {
                C0000HG.m1a();
            }
            repaint();
            serviceRepaints();
            long currentTimeMillis = System.currentTimeMillis() - f343g;
            f420y++;
            if (f420y == 100000) {
                f420y = 0;
            }
            if (currentTimeMillis < 110) {
                try {
                    Thread.sleep(110 - currentTimeMillis);
                } catch (Exception e) {
                }
            }
            f343g = System.currentTimeMillis();
        }
        for (int i = 0; i < f272al; i++) {
            int b = m307b((int) f324d[i][0]);
            if (f330e[b] == 5) {
                f330e[b] = 10;
            }
        }
    }

    public final void showNotify() {
    }

    public final void sizeChanged(int i, int i2) {
        f260aC = i;
        f368l = i2;
    }

    /* renamed from: t */
    public final void mo21t() {
        int i;
        short s = (short) (f414w[53] & 65535);
        short s2 = (short) ((f414w[53] & -65536) >> 16);
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < 15; i2++) {
            if (f253a[2][i2][4] >= 0) {
                int[] a = m230a(f253a[2][i2]);
                if (a[6] == 26) {
                    i = f253a[2][i2][6] - s;
                    if (i < 0) {
                        int i3 = s + i;
                        int[] iArr = f414w;
                        iArr[53] = iArr[53] & -65536;
                        int[] iArr2 = f414w;
                        iArr2[53] = (((short) i3) & 65535) | iArr2[53];
                    }
                    z = true;
                    s = 0;
                } else if (a[6] == 27) {
                    i = f253a[2][i2][6] - s2;
                    if (i < 0) {
                        int i4 = s2 + i;
                        int[] iArr3 = f414w;
                        iArr3[53] = iArr3[53] & 65535;
                        int[] iArr4 = f414w;
                        iArr4[53] = ((((short) i4) << 16) & -65536) | iArr4[53];
                    }
                    z2 = true;
                    s2 = 0;
                } else {
                    i = 0;
                }
                if (i > 0) {
                    m221a((int) (((short) f253a[2][i2][4]) & 65535) | 131072, i);
                }
            }
        }
        if (!z2) {
            int[] iArr5 = f414w;
            iArr5[53] = iArr5[53] & 65535;
            int[] iArr6 = f414w;
            iArr6[53] = iArr6[53] | 0;
        }
        if (!z) {
            int[] iArr7 = f414w;
            iArr7[53] = iArr7[53] & -65536;
            int[] iArr8 = f414w;
            iArr8[53] = iArr8[53] | 0;
        }
    }
}
