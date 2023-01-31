package p000;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

/* renamed from: HG */
public class C0000HG extends MIDlet implements CommandListener, PlayerListener {

    /* renamed from: A */
    public static int f0A = 0;

    /* renamed from: B */
    public static int f1B = 0;

    /* renamed from: C */
    public static int f2C = 0;

    /* renamed from: D */
    public static int f3D = -1;

    /* renamed from: E */
    public static int f4E = -1;

    /* renamed from: F */
    public static int f5F = 0;

    /* renamed from: G */
    public static int f6G = 0;

    /* renamed from: a */
    public static byte f7a = 0;

    /* renamed from: a */
    public static int f8a = 0;

    /* renamed from: a */
    public static long f9a = 0;

    /* renamed from: a */
    public static C0000HG f10a = null;

    /* renamed from: a */
    public static C0003c f11a = null;

    /* renamed from: a */
    public static C0004d f12a;

    /* renamed from: a */
    public static ByteArrayInputStream f13a;

    /* renamed from: a */
    public static ByteArrayOutputStream f14a;

    /* renamed from: a */
    public static DataInputStream f15a;

    /* renamed from: a */
    public static DataOutputStream f16a;

    /* renamed from: a */
    public static String f17a = "";

    /* renamed from: a */
    public static final Random f18a = new Random();

    /* renamed from: a */
    public static Stack f19a = new Stack();

    /* renamed from: a */
    public static Vector f20a = new Vector();

    /* renamed from: a */
    public static short f21a = -1;

    /* renamed from: a */
    public static boolean f22a = false;

    /* renamed from: a */
    public static byte[] f23a;

    /* renamed from: a */
    public static char[] f24a = {10, ' ', ',', '?', '-', ':', ';', '/', '.', '!'};

    /* renamed from: a */
    public static int[] f25a;

    /* renamed from: a */
    public static long[] f26a;

    /* renamed from: a */
    public static Object[] f27a;

    /* renamed from: a */
    public static final String[] f28a = {"audio/midi", "audio/amr", "audio/x-wav", "audio/mpeg", "", "audio/mmf", "", "audio/x-wav"};

    /* renamed from: a */
    public static boolean[] f29a = new boolean[f53d.length];

    /* renamed from: a */
    public static int[][] f30a;

    /* renamed from: a */
    public static String[][] f31a = null;

    /* renamed from: a */
    public static short[][] f32a = null;

    /* renamed from: b */
    public static int f33b = -1;

    /* renamed from: b */
    public static String f34b;

    /* renamed from: b */
    public static Vector f35b = new Vector();

    /* renamed from: b */
    public static boolean f36b = false;

    /* renamed from: b */
    public static byte[] f37b;

    /* renamed from: b */
    public static int[] f38b = null;

    /* renamed from: b */
    public static String[] f39b = null;

    /* renamed from: b */
    public static int[][] f40b = null;

    /* renamed from: b */
    public static String[][] f41b = new String[f53d.length][];

    /* renamed from: c */
    public static int f42c = 0;

    /* renamed from: c */
    public static String f43c = "";

    /* renamed from: c */
    public static boolean f44c = false;

    /* renamed from: c */
    public static byte[] f45c = {1, 2, 2, 2, 2};

    /* renamed from: c */
    public static int[] f46c = new int[7];

    /* renamed from: c */
    public static final String[] f47c = {".mid", ".amr", ".wav", ".mp3", ".ott", ".mmf", ".spf", ".wav"};

    /* renamed from: c */
    public static String[][] f48c = null;

    /* renamed from: d */
    public static int f49d = 0;

    /* renamed from: d */
    public static String f50d = "";

    /* renamed from: d */
    public static boolean f51d = true;

    /* renamed from: d */
    public static byte[] f52d;

    /* renamed from: d */
    public static String[] f53d = {"MAIN", "DIALOGUE_INITRIA", "DIALOGUE_KHORINIS", "DIALOGUE_MISC", "QUESTS"};

    /* renamed from: e */
    public static int f54e = 0;

    /* renamed from: e */
    public static boolean f55e = false;

    /* renamed from: e */
    private static byte[] f56e = new byte[7];

    /* renamed from: f */
    public static int f57f = 0;

    /* renamed from: f */
    public static boolean f58f = false;

    /* renamed from: g */
    public static int f59g = -1;

    /* renamed from: g */
    public static boolean f60g = false;

    /* renamed from: h */
    public static int f61h = 1;

    /* renamed from: h */
    public static boolean f62h = false;

    /* renamed from: i */
    public static int f63i = 0;

    /* renamed from: i */
    public static boolean f64i = false;

    /* renamed from: j */
    public static int f65j = 0;

    /* renamed from: j */
    public static boolean f66j = false;

    /* renamed from: k */
    public static int f67k = 0;

    /* renamed from: k */
    public static boolean f68k = false;

    /* renamed from: l */
    public static int f69l = 0;

    /* renamed from: l */
    public static boolean f70l = true;

    /* renamed from: m */
    public static int f71m = 0;

    /* renamed from: m */
    public static boolean f72m = false;

    /* renamed from: n */
    public static int f73n = 0;

    /* renamed from: n */
    public static boolean f74n = false;

    /* renamed from: o */
    public static int f75o = -1;

    /* renamed from: o */
    public static boolean f76o = false;

    /* renamed from: p */
    public static int f77p = 0;

    /* renamed from: p */
    public static boolean f78p = false;

    /* renamed from: q */
    public static int f79q = 0;

    /* renamed from: r */
    public static int f80r = -1;

    /* renamed from: s */
    public static int f81s = -1;

    /* renamed from: t */
    public static int f82t = -1;

    /* renamed from: u */
    public static int f83u = 0;

    /* renamed from: v */
    public static int f84v = 0;

    /* renamed from: w */
    public static int f85w = 0;

    /* renamed from: x */
    public static int f86x = -1;

    /* renamed from: y */
    public static int f87y = -1;

    /* renamed from: z */
    public static int f88z = -1;

    public C0000HG() {
        f10a = this;
        if (f11a == null) {
            f11a = new C0003c(this);
            C0003c.f191F = m1a();
            C0003c.f246a = m1a();
            m56d();
            Display.getDisplay(this).setCurrent(f11a);
            C0003c.f236a = new Thread(f11a);
            C0003c.f236a.start();
            m88q();
            f11a.mo11g(1);
        }
    }

    /* renamed from: a */
    public static final byte m0a(int i) {
        switch (i) {
            case 0:
                if (m39b(0)) {
                    return 1;
                }
                break;
            case 1:
                if (m39b(1)) {
                    return 1;
                }
                break;
            case 2:
                if (m39b(2)) {
                    return 1;
                }
                break;
            case 7:
                if (m39b(5)) {
                    return 1;
                }
                break;
            case 8:
                if (m39b(6)) {
                    return 1;
                }
                break;
            case 9:
                if (!m39b(6)) {
                    return 1;
                }
                break;
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m1a() {
        for (int i = 0; i < f53d.length; i++) {
            if (f41b[i] == null) {
                if ((f45c[i] == 1 || (f45c[i] != 0 && f29a[i])) && m0a(i) == -1) {
                    return -1;
                }
            } else if (f45c[i] != 1 && !f29a[i]) {
                f41b[i] = null;
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m2a(int i) {
        InputStream inputStream;
        InputStream inputStream2;
        try {
            if (f43c == null) {
                f43c = f17a;
            }
            inputStream = f10a.getClass().getResourceAsStream(new StringBuffer().append("/").append(f43c).append(".").append(f53d[i]).append(".").append("lng").toString());
            if (inputStream == null) {
                try {
                    inputStream.close();
                } catch (Exception e) {
                }
                f52d = null;
                return -1;
            }
            try {
                byte[] bArr = new byte[2];
                inputStream.read(bArr, 0, 2);
                int i2 = ((bArr[0] & 255) | ((bArr[1] & 255) << 8)) - 2;
                if (i2 < 0) {
                    try {
                        inputStream.close();
                    } catch (Exception e2) {
                    }
                    f52d = null;
                    return -1;
                }
                byte[] bArr2 = new byte[i2];
                if (inputStream.read(bArr2, 0, i2) != i2) {
                    f41b[i] = new String[0];
                    try {
                        inputStream.close();
                    } catch (Exception e3) {
                    }
                    f52d = null;
                    return -1;
                }
                byte b = (bArr2[1] & 255) | ((bArr2[2] & 255) << 8);
                f52d = bArr2;
                f41b[i] = new String[b];
                for (int i3 = 0; i3 < b; i3++) {
                    f41b[i][i3] = m49c(i3);
                }
                try {
                    inputStream.close();
                } catch (Exception e4) {
                }
                f52d = null;
                return 0;
            } catch (Exception e5) {
                inputStream2 = inputStream;
                try {
                    inputStream2.close();
                } catch (Exception e6) {
                }
                f52d = null;
                return 0;
            } catch (Throwable th) {
                th = th;
                try {
                    inputStream.close();
                } catch (Exception e7) {
                }
                f52d = null;
                throw th;
            }
        } catch (Exception e8) {
            inputStream2 = null;
            inputStream2.close();
            f52d = null;
            return 0;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            inputStream.close();
            f52d = null;
            throw th;
        }
    }

    /* renamed from: a */
    public static final int m3a(int i, int i2) {
        if (i < 0 || i >= f32a.length) {
            return -1;
        }
        short[] sArr = f32a[i];
        for (int i3 = 0; i3 < sArr.length; i3 += 4) {
            if (sArr[i3 + 0] == i2) {
                return i3 / 4;
            }
        }
        return -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[SYNTHETIC, Splitter:B:14:0x0039] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m4a(int r7, byte[] r8) {
        /*
            r6 = -2
            r3 = 1
            r1 = 0
            f63i = r1
            r0 = 0
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch:{ RecordStoreNotFoundException -> 0x004c, Exception -> 0x0051 }
            r2.<init>()     // Catch:{ RecordStoreNotFoundException -> 0x004c, Exception -> 0x0051 }
            java.lang.String r4 = "RECSTR"
            java.lang.StringBuffer r2 = r2.append(r4)     // Catch:{ RecordStoreNotFoundException -> 0x004c, Exception -> 0x0051 }
            java.lang.StringBuffer r2 = r2.append(r7)     // Catch:{ RecordStoreNotFoundException -> 0x004c, Exception -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ RecordStoreNotFoundException -> 0x004c, Exception -> 0x0051 }
            r4 = 1
            javax.microedition.rms.RecordStore r2 = javax.microedition.rms.RecordStore.openRecordStore(r2, r4)     // Catch:{ RecordStoreNotFoundException -> 0x004c, Exception -> 0x0051 }
            int r0 = r2.getNumRecords()     // Catch:{ RecordStoreNotFoundException -> 0x005e, Exception -> 0x0059 }
            if (r0 >= r3) goto L_0x0063
            r0 = 0
            r4 = 1
            r2.addRecord(r8, r0, r4)     // Catch:{ RecordStoreNotFoundException -> 0x005e, Exception -> 0x0059 }
            r0 = r3
        L_0x002a:
            int r3 = r2.getSizeAvailable()     // Catch:{ RecordStoreNotFoundException -> 0x0060, Exception -> 0x005b }
            int r4 = r8.length     // Catch:{ RecordStoreNotFoundException -> 0x0060, Exception -> 0x005b }
            int r4 = r4 * 2
            if (r3 >= r4) goto L_0x0044
            r1 = -2
            f63i = r1     // Catch:{ RecordStoreNotFoundException -> 0x0060, Exception -> 0x005b }
        L_0x0036:
            r1 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x0041
            r2.closeRecordStore()     // Catch:{ Exception -> 0x0057 }
            if (r1 == 0) goto L_0x0041
            m55d(r7)     // Catch:{ Exception -> 0x0057 }
        L_0x0041:
            int r0 = f63i
            return r0
        L_0x0044:
            r3 = 1
            r4 = 0
            int r5 = r8.length     // Catch:{ RecordStoreNotFoundException -> 0x0060, Exception -> 0x005b }
            r2.setRecord(r3, r8, r4, r5)     // Catch:{ RecordStoreNotFoundException -> 0x0060, Exception -> 0x005b }
            r0 = r1
            goto L_0x0036
        L_0x004c:
            r2 = move-exception
            r2 = r0
        L_0x004e:
            f63i = r6
            goto L_0x0037
        L_0x0051:
            r2 = move-exception
            r2 = r0
        L_0x0053:
            r0 = -1
            f63i = r0
            goto L_0x0037
        L_0x0057:
            r0 = move-exception
            goto L_0x0041
        L_0x0059:
            r0 = move-exception
            goto L_0x0053
        L_0x005b:
            r1 = move-exception
            r1 = r0
            goto L_0x0053
        L_0x005e:
            r0 = move-exception
            goto L_0x004e
        L_0x0060:
            r1 = move-exception
            r1 = r0
            goto L_0x004e
        L_0x0063:
            r0 = r1
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m4a(int, byte[]):int");
    }

    /* renamed from: a */
    public static final int m5a(String str) {
        int i;
        switch (f7a) {
            case 0:
                i = -1;
                break;
            case 1:
                f43c = f17a;
                i = 0;
                break;
            case 2:
                f43c = str;
                i = 0;
                break;
            case 3:
                boolean z = true;
                for (int i2 = 0; i2 < f31a.length && z; i2++) {
                    if (f31a[i2][0].compareTo(str) == 0) {
                        f43c = f31a[i2][1];
                        z = false;
                    }
                }
                break;
        }
        i = 0;
        return i != -1 ? m1a() : i;
    }

    /* renamed from: a */
    public static final int m6a(Graphics graphics) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7 = 135;
        graphics.setClip(0, 0, C0003c.f260aC, C0003c.f368l);
        if (graphics != null) {
            if (f70l) {
                int i8 = f65j;
                short[] sArr = f32a[f21a];
                if (i8 >= 0) {
                    short s = sArr[(i8 << 2) + 2];
                    z3 = (s == 103 || s == 104 || s == 108) ? false : true;
                } else {
                    z3 = false;
                }
                z = f19a.size() > 0;
                if (f88z >= 0) {
                    i4 = f88z;
                    i2 = f87y;
                    z2 = true;
                } else {
                    i2 = 135;
                    i4 = 0;
                    z2 = z3;
                }
                if (f80r >= 0) {
                    i3 = f80r;
                    i7 = f82t;
                    z = true;
                } else {
                    i3 = 2;
                }
                if (f81s == 35) {
                    z = false;
                }
                if (f4E == 35) {
                    i = i7;
                    z2 = false;
                } else {
                    i = i7;
                }
            } else {
                i = 135;
                i2 = 135;
                i3 = 2;
                i4 = 0;
                z = false;
                z2 = false;
            }
            if (f21a <= 17) {
                i6 = ((C0003c.f296b[(i2 * 11) + 0] / C0003c.f296b[(i2 * 11) + 5]) >> 1) + 10;
                i5 = C0003c.f368l - 10;
            } else {
                i5 = C0003c.f368l;
                i6 = C0003c.f296b[1606] >> 1;
            }
            if (z2) {
                C0003c.m249a(i6, i5, i2, i4, graphics);
            }
            if (z) {
                C0003c.m249a(C0003c.f260aC - i6, i5, i, i3, graphics);
            }
            int i9 = f0A + f57f + 2;
            int i10 = C0003c.f296b[1639] / C0003c.f296b[1644];
            int i11 = f69l - f0A;
            if (i11 < 0) {
                C0003c.m249a((C0003c.f260aC >> 1) - i10, i9, 149, 0, graphics);
            }
            if (i11 > f57f - f79q) {
                C0003c.m249a(C0003c.f260aC >> 1, i9, 149, 1, graphics);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m7a(Graphics graphics, int i) {
        int size = f20a.size();
        byte b = (byte) ((C0003c.f339f[2] >> 16) & 255);
        if (graphics != null) {
            int i2 = i + 5;
            graphics.setClip(f5F, f0A, f73n, f57f - 2);
            graphics.setFont(C0003c.f246a[2]);
            for (int i3 = 0; i3 < size; i3++) {
                if (i2 >= f0A + 5 && i2 + b <= f0A + f57f) {
                    graphics.drawString((String) f20a.elementAt(i3), f5F + 8 + ((byte) (C0003c.f339f[2] & 255)), ((byte) ((C0003c.f339f[2] >> 8) & 255)) + i2, 20);
                    if (f33b == i3) {
                        graphics.setColor(C0003c.f191F[16]);
                    } else {
                        graphics.setColor(C0003c.f191F[5]);
                    }
                    graphics.drawString((String) f35b.elementAt(i3), ((f5F + f73n) - 8) + ((byte) (C0003c.f339f[2] & 255)), ((byte) ((C0003c.f339f[2] >> 8) & 255)) + i2, 24);
                }
                i2 += b;
            }
        }
        return (b * size) + 5 + 10;
    }

    /* renamed from: a */
    public static final int m8a(Graphics graphics, String str, int i, int i2, int i3, boolean z) {
        if (graphics != null) {
            int i4 = C0003c.f296b[1650] / C0003c.f296b[1655];
            int i5 = ((C0003c.f260aC - ((C0003c.f296b[1386] + C0003c.f296b[1529]) + (C0003c.f296b[1518] * 2))) - (f54e * i4)) / (f54e + 1);
            int i6 = i4 + i5;
            int i7 = ((C0003c.f260aC - ((f54e * i6) + i5)) >> 1) + i5 + (i6 * i3);
            int i8 = C0003c.f368l - ((C0003c.f296b[1387] + C0003c.f296b[1607]) - 7);
            int i9 = C0003c.f368l - ((C0003c.f296b[1651] / C0003c.f296b[1656]) + 5);
            if (i8 <= i9) {
                i9 = i8;
            }
            graphics.setClip(0, 0, C0003c.f260aC, C0003c.f368l);
            C0003c.m249a(i7, i9, 150, i2, graphics);
            if (z) {
                C0003c.m249a(i7, i9, 150, 59, graphics);
                C0003c.f235a = str;
                C0003c.m468r(graphics);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m9a(Graphics graphics, String str, int i, int i2, boolean z) {
        byte b = (byte) ((C0003c.f339f[1] >> 16) & 255);
        int i3 = b + 5;
        if (!(graphics == null || str == null)) {
            graphics.setClip(f5F, f0A + 1, f73n, f57f - 2);
            int i4 = C0003c.f296b[1650] / C0003c.f296b[1655];
            int i5 = (((b + 5) - (C0003c.f296b[1651] / C0003c.f296b[1656])) >> 1) + 1;
            graphics.setFont(C0003c.f246a[1]);
            if (z) {
                graphics.setColor(C0003c.f191F[10]);
                graphics.fillRect(f5F, i2, f73n, b + 5);
                graphics.setColor(C0003c.f191F[5]);
                graphics.drawRect(f5F, i2, f73n - 1, b + 5);
                C0003c.m249a(f5F + 3, i5 + i2, 150, i, graphics);
                C0003c.m348c(1, f5F + 2 + i4 + 5, i2 + 1, ((f73n - i4) - 5) - 6, b + 5, 409);
                C0003c.m260a(str, 1, 1, graphics);
                m21a(i2, i3, f65j);
            } else if (i2 > (-i3) && i2 <= C0003c.f368l) {
                graphics.setColor(C0003c.f191F[9]);
                graphics.fillRect(f5F, i2, f73n, b + 5);
                graphics.setColor(C0003c.f191F[5]);
                graphics.drawRect(f5F, i2, f73n - 1, b + 5);
                C0003c.m249a(f5F + 3, i5 + i2, 150, i, graphics);
                C0003c.m348c(0, f5F + 2 + i4 + 5, i2 + 1, ((f73n - i4) - 5) - 6, b + 5, 281);
                C0003c.m260a(str, 0, 1, graphics);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static final int m10a(Graphics graphics, String str, int i, boolean z) {
        byte b = (byte) ((C0003c.f339f[2] >> 16) & 255);
        int i2 = b + 5;
        if (!(graphics == null || str == null)) {
            graphics.setFont(C0003c.f246a[2]);
            if (z) {
                graphics.setColor(C0003c.f191F[10]);
                graphics.fillRect(f5F, i, f73n, b + 2);
                graphics.setColor(C0003c.f191F[5]);
                C0003c.m348c(1, f5F, i, f73n, b, 284);
                C0003c.m260a(str, 1, 2, graphics);
                m21a(i, i2, f65j);
            } else if (i > (-i2) && i <= C0003c.f368l) {
                graphics.setColor(C0003c.f191F[5]);
                C0003c.m348c(0, f5F, i, f73n, b, 284);
                C0003c.m260a(str, 0, 2, graphics);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m11a(Graphics graphics, String str, int i, boolean z, int i2) {
        byte b = (byte) ((C0003c.f339f[2] >> 16) & 255);
        int i3 = b + 5;
        if (!(graphics == null || str == null)) {
            int i4 = f5F + 5;
            int i5 = (i3 >> 1) - 1;
            int i6 = (C0003c.f296b[1717] / C0003c.f296b[1721]) + 10 + 0;
            if (z) {
                graphics.setColor(C0003c.f191F[10]);
                graphics.fillRect(f5F, i, f73n, b + 2);
                graphics.setColor(C0003c.f191F[5]);
                C0003c.m348c(1, f5F + i6, i, f73n - i6, b, 281);
                C0003c.m260a(str, 1, 2, graphics);
                m21a(i, i3, f65j);
            } else if (i > (-i3) && i <= C0003c.f368l) {
                graphics.setColor(C0003c.f191F[5]);
                C0003c.m348c(0, f5F + i6, i, f73n - i6, b, 281);
                C0003c.m260a(str, 0, 2, graphics);
            }
            if (i > (-i3) && i <= C0003c.f368l) {
                graphics.setClip(f5F, f0A, f73n, f57f);
                C0003c.m249a(i4, i + i5, 156, (int) f23a[i2], graphics);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static final int m12a(Graphics graphics, String str, boolean z, int i, int i2) {
        byte b = (byte) ((C0003c.f339f[1] >> 16) & 255);
        int i3 = b + 5;
        if (!(graphics == null || str == null)) {
            boolean z2 = (32768 & i2) != 0;
            short s = i2 & Short.MAX_VALUE;
            int i4 = C0003c.f191F[9];
            int i5 = C0003c.f191F[10];
            int i6 = 0;
            int i7 = C0003c.f296b[1650] / C0003c.f296b[1655];
            int i8 = C0003c.f296b[1651] / C0003c.f296b[1656];
            if (f21a == 19) {
                str = C0001a.m102a(C0003c.f253a[f8a][s]);
                int[] a = C0003c.m230a(C0003c.f253a[f8a][s]);
                i6 = a[2];
                if (f8a == 0 && s == C0003c.f414w[42]) {
                    i4 = C0003c.f191F[11];
                    i5 = C0003c.f191F[12];
                } else if (f8a == 2 && C0003c.f253a[f8a][s][6] > 1) {
                    str = new StringBuffer().append(C0003c.f253a[f8a][s][6]).append("x ").append(str).toString();
                } else if (f8a == 1 && s == C0003c.f414w[41]) {
                    i4 = C0003c.f191F[11];
                    i5 = C0003c.f191F[12];
                } else if (f8a == 4 && s == C0003c.f414w[45]) {
                    i4 = C0003c.f191F[11];
                    i5 = C0003c.f191F[12];
                } else if (f8a == 3) {
                    if (a[10] == 1 && C0003c.f414w[44] == s) {
                        i4 = C0003c.f191F[11];
                        i5 = C0003c.f191F[12];
                    } else if (a[10] == 0 && (((short) (C0003c.f414w[43] & 65535)) == s || ((short) ((C0003c.f414w[43] & -65536) >> 16)) == s)) {
                        i4 = C0003c.f191F[11];
                        i5 = C0003c.f191F[12];
                    }
                }
            } else if (f21a == 21) {
                str = C0001a.m102a(C0001a.f124d[s]);
                i6 = C0003c.m230a(C0001a.f124d[s])[2];
                if ((C0001a.f124d[s][3] & 256) != 0 && C0001a.f124d[s][6] > 1) {
                    str = new StringBuffer().append(C0001a.f124d[s][6]).append("x ").append(str).toString();
                }
            }
            graphics.setFont(C0003c.f246a[1]);
            if (z) {
                graphics.setColor(i5);
                graphics.fillRect(f5F, i, f73n, b + 5);
                graphics.setColor(C0003c.f191F[5]);
                graphics.drawRect(f5F, i, f73n - 1, b + 5);
                C0003c.m249a(f5F + 3, (((b + 5) - i8) >> 1) + 1 + i, 150, i6, graphics);
                C0003c.m348c(1, f5F + 2 + i7 + 5, i + 1, ((f73n - i7) - 5) - 4, b + 5, 409);
                if (z2) {
                    graphics.setColor(C0003c.f191F[16]);
                }
                C0003c.m260a(str, 1, 1, graphics);
                m21a(i, i3, f65j);
            } else if (i > (-i3) && i <= C0003c.f368l) {
                graphics.setColor(i4);
                graphics.fillRect(f5F, i, f73n, b + 5);
                graphics.setColor(C0003c.f191F[5]);
                graphics.drawRect(f5F, i, f73n - 1, b + 5);
                C0003c.m249a(f5F + 3, (((b + 5) - i8) >> 1) + 1 + i, 150, i6, graphics);
                C0003c.m348c(0, f5F + 2 + i7 + 5, i + 1, ((f73n - i7) - 5) - 4, b + 5, 281);
                if (z2) {
                    graphics.setColor(C0003c.f191F[16]);
                }
                C0003c.m260a(str, 0, 1, graphics);
            }
        }
        return i3;
    }

    /* renamed from: a */
    public static final int m13a(Graphics graphics, String[] strArr, int i) {
        byte b = (byte) ((C0003c.f339f[2] >> 16) & 255);
        int length = strArr.length;
        if (graphics != null) {
            int i2 = C0003c.f260aC >> 1;
            graphics.setColor(C0003c.f191F[26]);
            graphics.setFont(C0003c.f246a[2]);
            for (int i3 = 0; i3 < length; i3++) {
                if (i >= f0A && i + b <= f0A + f57f) {
                    graphics.drawString(strArr[i3], ((byte) (C0003c.f339f[2] & 255)) + i2, ((byte) ((C0003c.f339f[2] >> 8) & 255)) + i, 17);
                }
                i += b;
            }
        }
        return b * length;
    }

    /* renamed from: a */
    public static final int m14a(Graphics graphics, String[] strArr, int i, int i2, int i3) {
        int i4;
        int i5;
        if (strArr == null) {
            return 0;
        }
        byte b = (byte) ((C0003c.f339f[2] >> 16) & 255);
        int length = strArr.length;
        int i6 = b * length;
        if (graphics != null) {
            int i7 = f5F;
            if (f21a > 17) {
                i5 = i + 5;
                i4 = i7 + 8;
            } else {
                i4 = i7 + 3;
                i5 = i;
            }
            if (i2 <= 0) {
                graphics.setColor(C0003c.f191F[5]);
            } else {
                graphics.setColor(C0003c.f191F[i2]);
            }
            graphics.setFont(C0003c.f246a[2]);
            for (int i8 = 0; i8 < length; i8++) {
                if (i5 >= f0A && i5 + b <= f0A + f57f) {
                    graphics.drawString(strArr[i8], ((byte) (C0003c.f339f[2] & 255)) + i4, ((byte) ((C0003c.f339f[2] >> 8) & 255)) + i5, 20);
                }
                i5 += b;
            }
        }
        return f21a > 17 ? i6 + i3 + 5 : i6 + i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0014  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.io.DataInputStream m15a(java.lang.String r3) throws java.lang.NullPointerException {
        /*
            r1 = 0
            HG r0 = f10a     // Catch:{ Exception -> 0x001a }
            java.lang.Class r0 = r0.getClass()     // Catch:{ Exception -> 0x001a }
            java.io.InputStream r2 = r0.getResourceAsStream(r3)     // Catch:{ Exception -> 0x001a }
            if (r2 == 0) goto L_0x001b
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch:{ Exception -> 0x001a }
            r0.<init>(r2)     // Catch:{ Exception -> 0x001a }
        L_0x0012:
            if (r0 != 0) goto L_0x001d
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>()
            throw r0
        L_0x001a:
            r0 = move-exception
        L_0x001b:
            r0 = r1
            goto L_0x0012
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m15a(java.lang.String):java.io.DataInputStream");
    }

    /* renamed from: a */
    public static final String m16a(int i) {
        String str = "";
        int i2 = 65535 & i;
        int i3 = (16711680 & i) >> 16;
        if (f41b == null || i3 < 0 || i3 >= f41b.length) {
            return str;
        }
        if (f41b[i3] != null) {
            return (i2 < 0 || i2 >= f41b[i3].length || f41b[i3][i2] == null) ? str : f41b[i3][i2];
        }
        if (f45c[i3] != 4) {
            return str;
        }
        m0a(i3);
        return f41b[i3] != null ? m0a(i) : str;
    }

    /* renamed from: a */
    public static final String m17a(short s, short s2) {
        String str = "";
        short s3 = f32a[s][(s2 << 2) + 0];
        if (s3 < 0) {
            return str;
        }
        if (s == 25) {
            s3 |= 262144;
        }
        return m0a((int) s3);
    }

    /* renamed from: a */
    public static final void m18a() {
        if (f86x >= 0) {
            m79l(f86x);
            f86x = -1;
        }
    }

    /* renamed from: a */
    public static final void m19a(int i) {
        short[] sArr = f32a[i];
        if (C0003c.f414w[11] == -1 || ((short) (C0003c.f414w[12] & 65535)) <= 0) {
            sArr[12] = -1;
            sArr[13] = -1;
            sArr[14] = 4;
            sArr[15] = -1;
        } else {
            sArr[12] = 247;
            sArr[13] = 37;
            sArr[14] = 101;
            sArr[15] = -1;
        }
        m29a(sArr, 16, 36, 38);
        f32a[i] = sArr;
    }

    /* renamed from: a */
    public static final void m20a(int i, int i2) {
        if (i >= -1 && i < f56e.length) {
            if (i2 != 0 && i2 != 1) {
                return;
            }
            if (i == 1 && i2 == 1) {
                f56e[1] = 1;
                f56e[2] = 0;
                f56e[5] = 0;
            } else if (i == 2 && i2 == 1) {
                f56e[1] = 0;
                f56e[2] = 1;
                f56e[5] = 0;
            } else if (i == 0 && i2 == 1) {
                f56e[1] = 0;
                f56e[2] = 0;
                f56e[5] = 0;
            } else if (i == 5 && i2 == 1) {
                f56e[1] = 0;
                f56e[2] = 0;
                f56e[5] = 1;
            } else {
                f56e[i] = (byte) i2;
            }
        }
    }

    /* renamed from: a */
    public static final void m21a(int i, int i2, int i3) {
        int i4 = i + i2;
        int i5 = f0A + f57f;
        if (i4 > i5) {
            f69l -= i4 - i5;
        } else if (i < f0A) {
            f69l = (f0A - i) + f69l;
        }
        if (i3 == m55d((int) f21a)) {
            f69l = f0A;
        }
    }

    /* renamed from: a */
    public static final void m22a(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i >= 0 && i < f32a.length) {
            short[] sArr = f32a[i];
            int i7 = i2 * 4;
            if (i7 >= 0 && i7 <= sArr.length) {
                short[] sArr2 = new short[(sArr.length + 4)];
                if (i7 == 0) {
                    System.arraycopy(sArr, 0, sArr2, 4, sArr.length);
                } else if (i7 == sArr.length) {
                    System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
                } else {
                    System.arraycopy(sArr, 0, sArr2, 0, i7);
                    System.arraycopy(sArr, i7, sArr2, i7 + 4, sArr.length - i7);
                }
                sArr2[i7 + 0] = (short) i3;
                sArr2[i7 + 1] = (short) i4;
                sArr2[i7 + 2] = (short) i5;
                sArr2[i7 + 3] = (short) i6;
                f32a[i] = sArr2;
            }
        }
    }

    /* renamed from: a */
    public static final void m23a(String str, String str2, boolean z) {
        int i = f73n - 16;
        Font font = C0003c.f246a[2];
        String[] a = str2.length() > 0 ? m36a(new StringBuffer().append(str).append(" ").append(str2).toString(), font, i, 0) : m36a(str, font, i, 0);
        int length = a.length;
        if (a.length > 1) {
            String[] a2 = m36a(str, font, i, 0);
            for (int i2 = 0; i2 < a2.length; i2++) {
                f20a.addElement(a2[i2]);
                if (i2 < length - 1) {
                    f35b.addElement("");
                } else {
                    f35b.addElement(str2);
                }
            }
            if (length > a2.length) {
                f20a.addElement("");
                f35b.addElement(str2);
            }
        } else {
            f20a.addElement(str);
            f35b.addElement(str2);
        }
        if (z) {
            f33b = f35b.size() - 1;
        }
    }

    /* renamed from: a */
    public static final void m24a(Graphics graphics) {
        if (C0003c.f421y) {
            C0003c.m453n(graphics);
        } else if (f21a != -1) {
            if (f21a <= 17) {
                m45b(graphics);
            }
            short[] sArr = f32a[f21a];
            int i = f69l;
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            f64i = false;
            f74n = false;
            boolean z = false;
            f60g = false;
            f75o = -1;
            f3D = -1;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                boolean z2 = z;
                int i7 = i3;
                int i8 = i2;
                if (i6 < f77p) {
                    short s = sArr[(i6 << 2) + 2];
                    if (s >= 0) {
                        String str = (f39b == null || f39b[i6] == null) ? "null" : f39b[i6];
                        graphics.setClip(f5F, f0A, f73n, f57f);
                        switch (s) {
                            case 1:
                                m25a(graphics, str);
                                break;
                            case 2:
                            case 3:
                            case 4:
                                break;
                            case 5:
                                C0003c.m325b(graphics, (int) sArr[(i6 << 2) + 3]);
                                break;
                            case 6:
                                short s2 = sArr[(i6 << 2) + 3];
                                boolean z3 = (s2 & 2) == 2 || (s2 & 1) == 1;
                                boolean z4 = (s2 & 4) == 4 || (s2 & 1) == 1;
                                boolean z5 = (s2 & 8) == 8 || (s2 & 1) == 1;
                                if (!z3) {
                                    break;
                                } else {
                                    C0003c.m266a(graphics, z4, z5, true, C0003c.f273am);
                                    if ((f84v & 1) == 0) {
                                        break;
                                    } else {
                                        graphics.setClip(0, 0, C0003c.f260aC, C0003c.f368l);
                                        graphics.setColor(C0003c.f191F[5]);
                                        int i9 = ((C0003c.f296b[1518] + C0003c.f296b[1386]) - 1) + 7;
                                        int i10 = ((byte) ((C0003c.f339f[2] >> 16) & 255)) + 5 + 5;
                                        C0003c.m348c(10, i9 + 4, (((C0003c.f368l - i10) - ((C0003c.f296b[1387] - i10) >> 1)) - C0003c.f296b[1607]) + 4, (((C0003c.f260aC - i9) - 1) - 7) - 8, i10 - 8, 156);
                                        C0003c.m260a(new StringBuffer().append(m0a(406)).append(m0a(309)).toString(), 10, 2, graphics);
                                        break;
                                    }
                                }
                            case 50:
                                String[] strArr = f48c[i8];
                                i8++;
                                i += m13a(graphics, strArr, i);
                                break;
                            case 103:
                            case 104:
                                String[] strArr2 = f48c[i8];
                                i8++;
                                byte b = (byte) (sArr[(i6 << 2) + 3] & 255);
                                int a = m14a((Graphics) null, strArr2, i, -1, (int) b);
                                int i11 = f0A + f57f;
                                if (i + a > f0A && i < i11) {
                                    m14a(graphics, strArr2, i, (int) (byte) ((sArr[(i6 << 2) + 3] >> 8) & 255), (int) b);
                                    z2 = true;
                                    if (f60g && f49d < f65j) {
                                        f74n = true;
                                        f3D = i6;
                                    }
                                }
                                i += a;
                                break;
                            case 105:
                                i += m12a(graphics, str, i6 == f65j, i, (int) sArr[(i6 << 2) + 3]);
                                break;
                            case 106:
                            case 107:
                                i += m8a(graphics, str, i, (int) sArr[(i6 << 2) + 3], i4, i6 == f65j);
                                i4++;
                                break;
                            case 108:
                                i += m7a(graphics, i);
                                break;
                            case 109:
                                i += m9a(graphics, str, (int) sArr[(i6 << 2) + 3], i, i6 == f65j);
                                break;
                            default:
                                boolean z6 = i6 == f65j;
                                int a2 = s == 102 ? m11a((Graphics) null, str, i, z6, i7) : m10a((Graphics) null, str, i, z6);
                                f60g = true;
                                int i12 = f0A + f57f;
                                if ((i + a2 > f0A && i < i12) || z6) {
                                    if (s == 102) {
                                        m11a(graphics, str, i, z6, i7);
                                        i7++;
                                    } else {
                                        m10a(graphics, str, i, z6);
                                    }
                                    if (z2 && i6 > f65j) {
                                        f64i = true;
                                        if (f75o < 0) {
                                            f75o = i6;
                                        }
                                    }
                                    f60g = true;
                                    f49d = i6;
                                } else if (s == 102) {
                                    i7++;
                                }
                                i += a2;
                                break;
                        }
                    }
                    z = z2;
                    i3 = i7;
                    i2 = i8;
                    i5 = i6 + 1;
                } else {
                    if (f21a == 19 || f21a == 21) {
                        graphics.setColor(C0003c.f191F[5]);
                        graphics.drawLine(f5F, f0A, (f5F + f73n) - 1, f0A);
                    }
                    m6a(graphics);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m25a(Graphics graphics, String str) {
        graphics.setColor(C0003c.f191F[5]);
        C0003c.m260a(str, 2, 2, graphics);
    }

    /* renamed from: a */
    public static final void m26a(short s) {
        boolean a = m26a(s);
        f69l = f0A;
        short[] sArr = f32a[f21a];
        f77p = m73j((int) s);
        if (f39b == null || f39b.length != f77p) {
            f39b = new String[f77p];
        }
        f54e = 0;
        f4E = -1;
        f81s = -1;
        f88z = -1;
        f80r = -1;
        f87y = -1;
        f82t = -1;
        int i = 0;
        int i2 = 0;
        for (short s2 = 0; s2 < f77p; s2 = (short) (s2 + 1)) {
            switch (sArr[(s2 << 2) + 2]) {
                case 2:
                    f81s = sArr[(s2 << 2) + 1];
                    f80r = sArr[(s2 << 2) + 3];
                    f82t = sArr[(s2 << 2) + 0];
                    continue;
                case 3:
                    f4E = sArr[(s2 << 2) + 1];
                    f88z = sArr[(s2 << 2) + 3];
                    f87y = sArr[(s2 << 2) + 0];
                    continue;
                case 4:
                case 5:
                case 6:
                    break;
                case 50:
                case 103:
                case 104:
                    i2++;
                    continue;
                case 102:
                    i++;
                    break;
                case 106:
                case 107:
                    f54e++;
                    f39b[s2] = m17a(s, s2);
                    continue;
            }
            f39b[s2] = m17a(s, s2);
        }
        if (i > 0) {
            if (f23a == null || f23a.length != i) {
                f23a = new byte[i];
            }
            int i3 = 0;
            for (int i4 = 0; i4 < f77p; i4++) {
                if (sArr[(i4 << 2) + 2] == 102) {
                    f23a[i3] = m0a((int) sArr[(i4 << 2) + 1]);
                    i3++;
                }
            }
        }
        if (i2 > 0) {
            f48c = new String[i2][];
            int i5 = 0;
            for (short s3 = 0; s3 < f77p; s3 = (short) (s3 + 1)) {
                short s4 = sArr[(s3 << 2) + 2];
                if (s4 == 103 || s4 == 50) {
                    f48c[i5] = m36a(m17a(s, s3), C0003c.f246a[2], f73n - 6, 0);
                    i5++;
                } else if (s4 == 104) {
                    f48c[i5] = m35a((int) sArr[(s3 << 2) + 1], C0003c.f246a[2], (f73n - 8) - 8);
                    i5++;
                }
            }
        }
        f79q = m64g((int) s);
        if (!a) {
            f65j = m55d((int) s);
        }
        if (f65j < 0 || (f65j * 4) + 2 >= f32a[s].length || f32a[s][(f65j * 4) + 2] <= 99 || f32a[s][(f65j * 4) + 2] >= 200) {
            f65j = m55d((int) s);
        }
    }

    /* renamed from: a */
    public static final void m27a(int[] iArr) throws IOException {
        f16a.writeShort(iArr.length);
        for (int writeInt : iArr) {
            f16a.writeInt(writeInt);
        }
    }

    /* renamed from: a */
    public static final void m28a(int[] iArr, int[] iArr2) {
        boolean z = true;
        if (!((iArr[3] & 64) == 0 && (iArr[3] & 128) == 0)) {
            z = C0003c.m230a(iArr);
            if (!z) {
                m23a(new StringBuffer().append("\n").append(m0a(292)).toString(), "", false);
                m23a(m0a(((short) (iArr2[10] & 65535)) + 64), new StringBuffer().append("").append((short) ((iArr2[10] & -65536) >> 16)).toString(), true);
            }
        }
        for (int i = 0; i < f46c.length; i++) {
            f46c[i] = -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            if (iArr[i3 + 6] != -1) {
                f46c[i3] = (((short) C0003c.f349g[(short) ((iArr[i3 + 6] & -65536) >> 16)][3]) & 65535) | ((((short) (iArr[i3 + 6] & 65535)) << 16) & -65536);
                i2++;
            }
        }
        for (int i4 = 0; i4 < 5; i4++) {
            if (iArr2[i4 + 5] != -1) {
                f46c[i4 + 2] = iArr2[i4 + 5];
                i2++;
            }
        }
        if (i2 != 0) {
            m23a(new StringBuffer().append("\n").append(m0a(60)).toString(), "", false);
            for (int i5 = 0; i5 < f46c.length; i5++) {
                if (f46c[i5] != -1) {
                    short s = (short) (f46c[i5] & 65535);
                    short s2 = (short) ((f46c[i5] & -65536) >> 16);
                    if (s2 < 0) {
                        m23a(m0a(s + 29), new StringBuffer().append("").append(s2).toString(), false);
                    } else {
                        m23a(m0a(s + 29), new StringBuffer().append("+").append(s2).toString(), false);
                    }
                }
            }
        }
        if ((iArr[3] & 64) != 0) {
            C0003c.m226a(0, C0003c.f414w[42], false);
            C0003c.m356c(iArr, true);
            int l = C0003c.m442l(iArr);
            int a = C0003c.m228a(l, C0003c.f414w);
            int c = C0003c.m340c((int) (short) (C0003c.f414w[14] & 65535), C0003c.m228a(l, C0003c.f414w), C0003c.m451n(iArr));
            int a2 = C0003c.m222a((int) (short) (C0003c.f414w[14] & 65535), C0003c.m228a(l, C0003c.f414w), C0003c.m451n(iArr));
            int v = C0003c.m477v(iArr);
            int c2 = C0003c.m339c(a, (int) (short) (C0003c.f414w[15] & 65535));
            int a3 = C0003c.m223a(C0003c.m455o(iArr) + ((short) (C0003c.f414w[26] & 65535)), (int) (short) (C0003c.f414w[14] & 65535), (int) (short) (C0003c.f414w[15] & 65535), a);
            int k = (C0003c.m437k(iArr) * 10) / 4096;
            C0003c.m356c(iArr, false);
            C0003c.m226a(0, C0003c.f414w[42], true);
            int a4 = C0003c.m228a(C0003c.m442l(C0003c.m219a()), C0003c.f414w);
            int c3 = C0003c.m340c((int) (short) (C0003c.f414w[14] & 65535), C0003c.m228a(l, C0003c.f414w), C0003c.m451n(C0003c.m219a()));
            int a5 = C0003c.m222a((int) (short) (C0003c.f414w[14] & 65535), C0003c.m228a(l, C0003c.f414w), C0003c.m451n(C0003c.m219a()));
            int v2 = C0003c.m477v(C0003c.m219a());
            int c4 = C0003c.m339c(a4, (int) (short) (C0003c.f414w[15] & 65535));
            int a6 = C0003c.m223a(C0003c.m455o(C0003c.m219a()) + ((short) (C0003c.f414w[26] & 65535)), (int) (short) (C0003c.f414w[14] & 65535), (int) (short) (C0003c.f414w[15] & 65535), a4);
            int k2 = (C0003c.m437k(C0003c.m219a()) * 10) / 4096;
            m23a(new StringBuffer().append("\n").append(m0a(290)).toString(), new StringBuffer().append("").append(c).append(m39b(c - c3)).toString(), false);
            m23a(m0a(291), new StringBuffer().append("").append(a2).append(m39b(a2 - a5)).toString(), false);
            m23a(m0a(289), new StringBuffer().append("").append(c2).append(m39b(c2 - c4)).toString(), false);
            m23a(m0a(287), new StringBuffer().append("").append(v).append(m39b(v - v2)).toString(), false);
            m23a(m0a(69), new StringBuffer().append("").append(k).append(m39b(k - k2)).toString(), false);
            m23a(m0a(288), new StringBuffer().append("").append(a3).append(m39b(a3 - a6)).toString(), false);
            if (z) {
                m23a(new StringBuffer().append("\n").append(m0a(((short) (iArr2[10] & 65535)) + 64)).toString(), new StringBuffer().append("").append((short) ((iArr2[10] & -65536) >> 16)).toString(), false);
            }
        }
        if ((iArr[3] & 128) != 0) {
            C0003c.m226a(1, C0003c.f414w[41], false);
            C0003c.m356c(iArr, true);
            int i6 = C0003c.f414w[27];
            int i7 = C0003c.f414w[28];
            C0003c.m356c(iArr, false);
            C0003c.m226a(1, C0003c.f414w[41], true);
            int i8 = C0003c.f414w[27];
            int i9 = C0003c.f414w[28];
            m23a(new StringBuffer().append("\n").append(m0a(68)).toString(), "", false);
            m23a(m0a(47), new StringBuffer().append("").append(i6).append(m39b(i6 - i8)).toString(), false);
            m23a(m0a(70), new StringBuffer().append("").append(i7).append(m39b(i7 - i9)).toString(), false);
            if (z) {
                m23a(new StringBuffer().append("\n").append(m0a(((short) (iArr2[10] & 65535)) + 64)).toString(), new StringBuffer().append("").append((short) ((iArr2[10] & -65536) >> 16)).toString(), false);
            }
        }
    }

    /* renamed from: a */
    public static final void m29a(short[] sArr, int i, short s, short s2) {
        if (C0003c.f317d < 0 || C0003c.f231a < 0) {
            if (C0003c.f231a >= 0) {
                sArr[i + 0] = 374;
                sArr[i + 1] = s;
                sArr[i + 2] = 101;
            } else if (C0003c.f317d >= 0) {
                sArr[i + 0] = 373;
                sArr[i + 1] = s2;
                sArr[i + 2] = 101;
            } else {
                sArr[i + 0] = -1;
                sArr[i + 1] = -1;
                sArr[i + 2] = 4;
            }
            sArr[i + 3] = -1;
            int i2 = i + 4;
            sArr[i2 + 0] = -1;
            sArr[i2 + 1] = -1;
            sArr[i2 + 2] = 4;
            sArr[i2 + 3] = -1;
            return;
        }
        if (C0003c.f317d > C0003c.f231a) {
            sArr[i + 0] = 373;
            sArr[i + 1] = s2;
        } else {
            sArr[i + 0] = 374;
            sArr[i + 1] = s;
        }
        sArr[i + 2] = 101;
        sArr[i + 3] = -1;
        int i3 = i + 4;
        if (C0003c.f317d > C0003c.f231a) {
            sArr[i3 + 0] = 374;
            sArr[i3 + 1] = s;
        } else {
            sArr[i3 + 0] = 373;
            sArr[i3 + 1] = s2;
        }
        sArr[i3 + 2] = 101;
        sArr[i3 + 3] = -1;
    }

    /* renamed from: a */
    public static final boolean m30a() {
        boolean z = false;
        if (f34b == null) {
            return z;
        }
        try {
            return f10a.platformRequest(f34b);
        } catch (Exception e) {
            return z;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m31a(int r10) {
        /*
            r6 = 6
            r9 = 2
            r8 = 5
            r1 = 1
            r2 = 0
            int[][] r0 = f30a
            r0 = r0[r10]
            r4 = r0[r2]
            if (r10 < 0) goto L_0x00aa
            int[][] r0 = f40b
            r0 = r0[r10]
            r3 = 4
            r0 = r0[r3]
            int r0 = r0 >> 3
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0038
            r0 = r1
        L_0x001b:
            byte[] r3 = f37b
            byte r3 = r3[r10]
            if (r3 != r9) goto L_0x003a
            r3 = r1
        L_0x0022:
            int[][] r5 = f40b
            r5 = r5[r10]
            r5 = r5[r6]
            if (r5 <= 0) goto L_0x003c
            byte[] r0 = f37b
            r0[r10] = r9
            int[][] r0 = f40b
            r0 = r0[r10]
            r0 = r0[r6]
            m81m(r0)
        L_0x0037:
            return r1
        L_0x0038:
            r0 = r2
            goto L_0x001b
        L_0x003a:
            r3 = r2
            goto L_0x0022
        L_0x003c:
            if (r0 == 0) goto L_0x00aa
            if (r3 == 0) goto L_0x00aa
            int[][] r0 = f40b
            r0 = r0[r10]
            r0 = r0[r8]
            if (r0 < 0) goto L_0x0099
            int[][] r0 = f40b
            r0 = r0[r10]
            r3 = r0[r8]
            java.util.Vector r5 = new java.util.Vector
            r5.<init>(r1, r1)
            r0 = r2
        L_0x0054:
            int r6 = f83u
            if (r0 >= r6) goto L_0x0081
            int[][] r6 = f40b
            r6 = r6[r10]
            r6 = r6[r8]
            if (r6 < 0) goto L_0x007e
            int[][] r6 = f40b
            r6 = r6[r0]
            r6 = r6[r8]
            if (r6 != r3) goto L_0x007e
            int[][] r6 = f40b
            r6 = r6[r0]
            r6 = r6[r2]
            if (r4 == r6) goto L_0x007e
            java.lang.Integer r6 = new java.lang.Integer
            int[][] r7 = f40b
            r7 = r7[r0]
            r7 = r7[r2]
            r6.<init>(r7)
            r5.addElement(r6)
        L_0x007e:
            int r0 = r0 + 1
            goto L_0x0054
        L_0x0081:
            int r3 = r5.size()
            if (r3 <= r1) goto L_0x0099
            r0 = r4
        L_0x0088:
            if (r0 != r4) goto L_0x009a
            int r0 = m58e(r3)
            java.lang.Object r0 = r5.elementAt(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            goto L_0x0088
        L_0x0099:
            r0 = r4
        L_0x009a:
            if (r0 >= 0) goto L_0x00a2
            int[][] r0 = f40b
            r0 = r0[r10]
            r0 = r0[r2]
        L_0x00a2:
            byte[] r2 = f37b
            r2[r10] = r9
            m81m(r0)
            r2 = r1
        L_0x00aa:
            r1 = r2
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m31a(int):boolean");
    }

    /* renamed from: a */
    public static final boolean m32a(short s) {
        boolean z;
        short[] sArr = f32a[s];
        short s2 = sArr[3];
        if (sArr[2] == 6 && s2 == 1) {
            f5F = C0003c.f296b[1617] / C0003c.f296b[1622];
            f0A = C0003c.m229a(true) + 3;
            f73n = C0003c.f260aC - ((C0003c.f296b[1617] / C0003c.f296b[1622]) + (C0003c.f296b[1617] / C0003c.f296b[1622]));
            f57f = C0003c.f368l - ((C0003c.m229a(true) + 3) + ((((C0003c.f296b[1607] + C0003c.f296b[1387]) + (C0003c.f296b[1617] / C0003c.f296b[1622])) + C0003c.f296b[1640]) + 5));
            int i = (C0003c.f296b[1650] / C0003c.f296b[1655]) + 5;
            C0003c.m242a(0, f5F + i, f0A, f73n, f57f);
            C0003c.m242a(1, i + f5F, f0A, f73n, f57f);
        } else if (f21a == 0) {
            f5F = 17;
            f0A = C0003c.f296b[1750] + 20 + C0003c.f296b[1486];
            f73n = C0003c.f260aC - (f5F * 2);
            f57f = ((((C0003c.f368l - 10) - 5) - C0003c.f296b[1486]) - f0A) - (C0003c.f296b[1640] + 5);
            C0003c.m242a(0, f5F, f0A, f73n, f57f);
            C0003c.m242a(1, f5F, f0A, f73n, f57f);
        } else {
            int i2 = ((byte) ((C0003c.f339f[2] >> 16) & 255)) + 5;
            f5F = 17;
            f0A = C0003c.f296b[1728] + 8 + i2 + C0003c.f296b[1486];
            f73n = C0003c.f260aC - (f5F * 2);
            f57f = ((C0003c.f368l - 10) - ((f0A + C0003c.f296b[1486]) + 4)) - (C0003c.f296b[1640] + 5);
            C0003c.m348c(2, f5F + 2, C0003c.f296b[1728] + 6, f73n - 4, i2, 28);
            C0003c.m242a(0, f5F, f0A, f73n, f57f);
            C0003c.m242a(1, f5F, f0A, f73n, f57f);
        }
        switch (s) {
            case 1:
                m39b((int) s);
                z = false;
                break;
            case 14:
                m0a((int) s);
                z = false;
                break;
            case 18:
                f84v = 0;
                break;
            case 19:
                m38b();
                z = true;
                break;
            case 20:
                m87p(s);
                z = false;
                break;
            case 21:
                m61f((int) s);
                z = true;
                break;
            case 22:
                m83n(s);
                z = false;
                break;
            case 23:
                f84v |= 8;
                m70i((int) s);
                z = false;
                break;
            case 24:
                m61f((int) s);
                z = false;
                break;
            case 25:
                f84v |= 4;
                m77k(s);
                z = false;
                break;
            case 26:
                m85o(s);
                z = false;
                break;
        }
        z = false;
        m74j();
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027 A[SYNTHETIC, Splitter:B:8:0x0027] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m33a(int r5) {
        /*
            r1 = 0
            r4 = -1
            f63i = r4
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x002b }
            r0.<init>()     // Catch:{ Exception -> 0x002b }
            java.lang.String r2 = "RECSTR"
            java.lang.StringBuffer r0 = r0.append(r2)     // Catch:{ Exception -> 0x002b }
            java.lang.StringBuffer r0 = r0.append(r5)     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x002b }
            r2 = 0
            javax.microedition.rms.RecordStore r0 = javax.microedition.rms.RecordStore.openRecordStore(r0, r2)     // Catch:{ Exception -> 0x002b }
            r2 = 1
            byte[] r2 = r0.getRecord(r2)     // Catch:{ Exception -> 0x0032 }
            r3 = 0
            f63i = r3     // Catch:{ Exception -> 0x0032 }
            r1 = r2
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.closeRecordStore()     // Catch:{ Exception -> 0x0030 }
        L_0x002a:
            return r1
        L_0x002b:
            r0 = move-exception
            r0 = r1
        L_0x002d:
            f63i = r4
            goto L_0x0025
        L_0x0030:
            r0 = move-exception
            goto L_0x002a
        L_0x0032:
            r2 = move-exception
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m33a(int):byte[]");
    }

    /* renamed from: a */
    public static final int[] m34a() {
        int[] iArr = null;
        try {
            DataInputStream dataInputStream = new DataInputStream(m5a("c"));
            f59g = dataInputStream.readInt();
            iArr = new int[f59g];
            for (int i = 0; i < f59g; i++) {
                iArr[i] = dataInputStream.readInt();
            }
        } catch (Exception e) {
        }
        return iArr;
    }

    /* renamed from: a */
    public static final String[] m35a(int i, Font font, int i2) {
        switch (i) {
            case 1:
                char[] charArray = new String("11-01-2008").toCharArray();
                return m36a(new StringBuffer().append("(c) 20").append(charArray[8]).append(charArray[9]).append(",\n").append(m0a(473)).append("\n").append(m0a(13)).append("\nv ").append(f10a.getAppProperty("MIDlet-Version")).toString(), font, i2, 0);
            case 2:
                return m36a(new StringBuffer().append(m0a(303)).append(", ").append(m0a(293)).append(":\n").append(m0a(201)).append("\n\n").append(m0a(300)).append(", ").append(m0a(297)).append(":\n").append(m0a(195)).append("\n\n").append(m0a(302)).append(", ").append(m0a(295)).append(":\n").append(m0a(199)).append("\n\n").append(m0a(304)).append(", ").append(m0a(296)).append(":\n").append(m0a(203)).append("\n\n").append(m0a(306)).append(", ").append(m0a(294)).append(":\n").append(m0a(207)).append("\n\n").append(m0a(299)).append(":\n").append(m0a(193)).append("\n\n").append(m0a(301)).append(":\n").append(m0a(197)).append("\n\n").append(m0a(305)).append(":\n").append(m0a(205)).append("\n\n").append(m0a(307)).append(":\n").append(m0a(209)).append("\n\n").append(m0a(309)).append(":\n").append(m0a(213)).append("\n\n").append(m0a(308)).append(":\n").append(m0a(189)).append("\n\n").append(m0a(310)).append(":\n").append(m0a(191)).append("\n\n").append(m0a(311)).append(":\n").append(m0a(211)).toString(), font, i2, 0);
            case 3:
                return m36a(new StringBuffer().append(m0a(303)).append(", ").append(m0a(293)).append(":\n").append(m0a(200)).append("\n\n").append(m0a(300)).append(", ").append(m0a(297)).append(":\n").append(m0a(194)).append("\n\n").append(m0a(302)).append(", ").append(m0a(295)).append(":\n").append(m0a(198)).append("\n\n").append(m0a(304)).append(", ").append(m0a(296)).append(":\n").append(m0a(202)).append("\n\n").append(m0a(306)).append(", ").append(m0a(294)).append(":\n").append(m0a(206)).append("\n\n").append(m0a(309)).append(":\n").append(m0a(212)).append("\n\n").append(m0a(310)).append(":\n").append(m0a(190)).append("\n\n").append(m0a(311)).append(":\n").append(m0a(210)).append("\n\n\n").append(m0a(298)).append(":\n").append(m0a(407)).toString(), font, i2, 0);
            case 4:
                if (((short) (C0003c.f399s[f2C][0] & 65535)) == 1) {
                    return m36a(m0a(C0003c.f399s[f2C][1] + C0003c.f399s[f2C][2]), font, i2, 0);
                }
                break;
            case 5:
                int i3 = C0003c.f399s[f2C][1];
                int i4 = C0003c.f399s[f2C][2] + i3;
                if (((short) (C0003c.f399s[f2C][0] & 65535)) == 1) {
                    i4--;
                }
                String str = "";
                int i5 = i4;
                while (i5 > i3) {
                    str = (((short) (C0003c.f399s[f2C][0] & 65535)) == 1 || i5 != i4) ? new StringBuffer().append(str).append("\n").append(m0a(i5)).toString() : new StringBuffer().append(str).append(m0a(i5)).toString();
                    if (i5 > i3 + 1) {
                        str = new StringBuffer().append(str).append("\n").toString();
                    }
                    i5--;
                }
                if (str.length() > 0) {
                    return m36a(str, font, i2, 0);
                }
                break;
            case 6:
                return m36a(new StringBuffer().append(m0a(299)).append(":\n").append(m0a(192)).append("\n\n").append(m0a(301)).append(":\n").append(m0a(196)).append("\n\n").append(m0a(305)).append(":\n").append(m0a(204)).append("\n\n").append(m0a(307)).append(":\n").append(m0a(208)).append("\n\n").append(m0a(308)).append(":\n").append(m0a(188)).toString(), font, i2, 0);
        }
        return null;
    }

    /* renamed from: a */
    public static final String[] m36a(String str, Font font, int i, int i2) {
        int i3;
        String str2;
        String substring;
        String str3;
        String str4;
        String str5;
        str.length();
        int i4 = 0;
        int i5 = 0;
        String str6 = "";
        String str7 = "";
        if (i2 > 0) {
            i -= font.charWidth(' ') * i2;
        }
        while (true) {
            i3 = i5;
            if (str.length() <= 0) {
                break;
            }
            int length = str.length();
            for (char indexOf : f24a) {
                int indexOf2 = str.indexOf(indexOf);
                if (indexOf2 < length && indexOf2 != -1) {
                    length = indexOf2;
                }
            }
            if (length == str.length()) {
                substring = str.substring(0, length);
                str = "";
            } else {
                substring = str.substring(0, length + 1);
                str = str.substring(length + 1, str.length());
            }
            int charsWidth = substring.length() <= 1 ? font.charsWidth(substring.toCharArray(), 0, substring.length()) : font.charsWidth(substring.trim().toCharArray(), 0, substring.trim().length());
            int i6 = substring.trim().length() != substring.length() ? font.charWidth(' ') : 0;
            if (i4 + charsWidth >= i || str6.indexOf(10) != -1) {
                int i7 = 0;
                if (charsWidth > i) {
                    str4 = substring;
                    int i8 = charsWidth;
                    int i9 = i3;
                    while (true) {
                        if (i7 >= str4.length()) {
                            i5 = i9;
                            break;
                        } else if (font.charWidth(str4.charAt(i7)) + i4 < i) {
                            i4 += font.charWidth(str4.charAt(i7));
                            i7++;
                        } else {
                            if (i7 > 1) {
                                str6 = new StringBuffer().append(str6).append(str4.substring(0, i7 - 1)).toString();
                                str5 = str4.substring(i7 - 1, str4.length());
                                i8 = font.charsWidth(str5.trim().toCharArray(), 0, str5.trim().length());
                            } else {
                                str5 = str4;
                            }
                            if (i8 < i) {
                                if (str6.indexOf(10) == 0) {
                                    i9++;
                                }
                                String stringBuffer = new StringBuffer().append(str7).append(str6).toString();
                                if (str6.indexOf(10) == -1 || str6.indexOf(10) == 0) {
                                    stringBuffer = new StringBuffer().append(stringBuffer).append(10).toString();
                                }
                                i4 = i8 + i6;
                                str7 = stringBuffer;
                                str4 = str5;
                                str6 = str5;
                                i5 = i9 + 1;
                            } else {
                                if (str6.indexOf(10) == 0) {
                                    i9++;
                                }
                                String stringBuffer2 = new StringBuffer().append(str7).append(str6).toString();
                                if (str6.indexOf("\n") == -1 || str6.indexOf(10) == 0) {
                                    stringBuffer2 = new StringBuffer().append(stringBuffer2).append(10).toString();
                                }
                                str6 = "";
                                i9++;
                                i4 = 0;
                                i7 = 0;
                                str7 = stringBuffer2;
                                str4 = str5;
                            }
                        }
                    }
                } else {
                    if (str6.length() > 0) {
                        if (str6.indexOf(10) == -1 && substring.indexOf(10) != 0) {
                            str6 = new StringBuffer().append(str6).append(10).toString();
                        }
                        str3 = new StringBuffer().append(str7).append(str6).toString();
                        if (substring.indexOf(10) != 0 || ((str.indexOf(10) == 0 && substring.indexOf(10) == 0) || str6.indexOf(10) != -1)) {
                            if (substring.indexOf(10) != -1 && str6.indexOf(10) == -1) {
                                i3--;
                            }
                            i3++;
                        }
                    } else {
                        str3 = str7;
                    }
                    i4 = charsWidth + i6;
                    str7 = str3;
                    str4 = substring;
                    str6 = substring;
                    i5 = i3;
                }
            } else {
                i4 += charsWidth + i6;
                str4 = substring;
                str6 = new StringBuffer().append(str6).append(substring).toString();
                i5 = i3;
            }
            if (str.length() == 0 && str4.length() > 0) {
                str7 = new StringBuffer().append(str7).append(str6).toString();
            }
        }
        String[] strArr = new String[(i3 + 1)];
        String str8 = "";
        if (i2 > 0) {
            for (int i10 = 0; i10 < i2; i10++) {
                str8 = new StringBuffer().append(str8).append(' ').toString();
            }
        }
        int i11 = 0;
        int i12 = 0;
        String str9 = str7;
        while (true) {
            if (i11 == -1) {
                str2 = str9;
                break;
            } else if (i3 + 1 == i12) {
                str2 = str9;
                break;
            } else {
                i11 = str9.indexOf("\n");
                strArr[i12] = (i11 == -1 ? str9.substring(0, str9.length()) : str9.substring(0, i11)).trim();
                if (i2 > 0) {
                    strArr[i12] = new StringBuffer().append(str8).append(strArr[i12]).toString();
                }
                if (i11 >= str9.length() || i11 == -1) {
                    str2 = "";
                } else {
                    str9 = str9.substring(i11 + 1, str9.length());
                    i12++;
                }
            }
        }
        if (i3 > 0 && str2.length() > 0) {
            if (i2 > 0) {
                strArr[i12] = new StringBuffer().append(str8).append(str2).toString();
            } else {
                strArr[i12] = str2;
            }
        }
        return strArr;
    }

    /* JADX WARNING: type inference failed for: r0v22, types: [int] */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final javax.microedition.lcdui.Font[] m37a() {
        /*
            r4 = 3
            r2 = 0
            r1 = 1
            javax.microedition.lcdui.Font[] r6 = new javax.microedition.lcdui.Font[r4]
            r0 = r2
        L_0x0006:
            if (r0 >= r4) goto L_0x0011
            javax.microedition.lcdui.Font r3 = javax.microedition.lcdui.Font.getDefaultFont()
            r6[r0] = r3
            int r0 = r0 + 1
            goto L_0x0006
        L_0x0011:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch:{ Exception -> 0x006e }
            java.lang.String r0 = "f"
            java.io.DataInputStream r0 = m5a(r0)     // Catch:{ Exception -> 0x006e }
            r7.<init>(r0)     // Catch:{ Exception -> 0x006e }
            short r8 = r7.readShort()     // Catch:{ Exception -> 0x006e }
            r5 = r2
        L_0x0021:
            if (r5 >= r8) goto L_0x006f
            short r9 = r7.readShort()     // Catch:{ Exception -> 0x006e }
            int r0 = r9 >> 0
            r0 = r0 & 1
            if (r0 != r1) goto L_0x005a
            r0 = 32
            r4 = r0
        L_0x0030:
            int r0 = r9 >> 4
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0064
            r0 = 8
            r3 = r0
        L_0x0039:
            int r0 = r9 >> 6
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0070
            r0 = r1
        L_0x0040:
            int r10 = r9 >> 7
            r10 = r10 & 1
            if (r10 != r1) goto L_0x0048
            r0 = r0 | 2
        L_0x0048:
            int r9 = r9 >> 8
            r9 = r9 & 1
            if (r9 != r1) goto L_0x0050
            r0 = r0 | 4
        L_0x0050:
            javax.microedition.lcdui.Font r0 = javax.microedition.lcdui.Font.getFont(r4, r0, r3)     // Catch:{ Exception -> 0x006e }
            r6[r5] = r0     // Catch:{ Exception -> 0x006e }
            int r0 = r5 + 1
            r5 = r0
            goto L_0x0021
        L_0x005a:
            int r0 = r9 >> 2
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0074
            r0 = 64
            r4 = r0
            goto L_0x0030
        L_0x0064:
            int r0 = r9 >> 5
            r0 = r0 & 1
            if (r0 != r1) goto L_0x0072
            r0 = 16
            r3 = r0
            goto L_0x0039
        L_0x006e:
            r0 = move-exception
        L_0x006f:
            return r6
        L_0x0070:
            r0 = r2
            goto L_0x0040
        L_0x0072:
            r3 = r2
            goto L_0x0039
        L_0x0074:
            r4 = r2
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m37a():javax.microedition.lcdui.Font[]");
    }

    /* renamed from: b */
    public static final int m38b() {
        try {
            InputStream resourceAsStream = f10a.getClass().getResourceAsStream("/ldf");
            if (resourceAsStream == null) {
                return -1;
            }
            try {
                resourceAsStream.read();
                f7a = (byte) resourceAsStream.read();
                byte[] bArr = new byte[((byte) resourceAsStream.read())];
                resourceAsStream.read(bArr);
                f17a = new String(bArr);
                if (f7a == 3) {
                    byte read = (byte) resourceAsStream.read();
                    f31a = (String[][]) Array.newInstance(String.class, new int[]{read, 2});
                    for (int i = 0; i < read; i++) {
                        byte[] bArr2 = new byte[((byte) resourceAsStream.read())];
                        resourceAsStream.read(bArr2);
                        f31a[i][0] = new String(bArr2);
                        byte[] bArr3 = new byte[((byte) resourceAsStream.read())];
                        resourceAsStream.read(bArr3);
                        f31a[i][1] = new String(bArr3);
                    }
                }
                try {
                    return 0;
                } catch (Exception e) {
                    return -1;
                }
            } catch (Exception e2) {
                try {
                    return -1;
                } catch (Exception e3) {
                    return -1;
                }
            } finally {
                try {
                    resourceAsStream.close();
                } catch (Exception e4) {
                    return -1;
                }
            }
        } catch (Exception e5) {
            return -1;
        }
    }

    /* renamed from: b */
    public static final int m39b(int i) {
        int h = m67h(i);
        if (h >= 0) {
            return f37b[h];
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m40b(int i, int i2) {
        int i3;
        int i4;
        if (i2 == i) {
            return i;
        }
        if (i2 < i) {
            i3 = i;
            i4 = i2;
        } else {
            i3 = i2;
            i4 = i;
        }
        return i4 + ((f18a.nextInt() & Integer.MAX_VALUE) % ((i3 - i4) + 1));
    }

    /* renamed from: b */
    public static final String m41b(int i) {
        return i < 0 ? new StringBuffer().append(" (").append(i).append(")").toString() : new StringBuffer().append(" (+").append(i).append(")").toString();
    }

    /* renamed from: b */
    public static final void m42b() {
        f84v |= 2;
        short[] sArr = f32a[19];
        int[][] iArr = C0003c.f253a[f8a];
        int[][] iArr2 = null;
        f50d = m0a(f8a + 232);
        f51d = true;
        C0003c.f273am = 126;
        switch (f8a) {
            case 0:
                iArr2 = C0003c.f333e;
                break;
            case 1:
                iArr2 = C0003c.f387p;
                break;
            case 2:
                f11a.mo21t();
                iArr2 = C0003c.f395r;
                break;
            case 3:
                iArr2 = C0003c.f354h;
                break;
            case 4:
                iArr2 = C0003c.f407u;
                break;
            case 5:
                iArr2 = C0003c.f313c;
                break;
        }
        int i = 0;
        int i2 = 4;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (iArr[i3][4] != -1) {
                short s = (short) i3;
                if ((f8a == 0 || f8a == 1) && !C0003c.m230a(iArr[i3])) {
                    s = (short) (s | 32768);
                }
                sArr[i2 + 0] = (short) iArr2[iArr[i3][4]][0];
                sArr[i2 + 1] = 12;
                sArr[i2 + 2] = 105;
                sArr[i2 + 3] = s;
                i = i3 + 1;
                if (f65j == -1) {
                    f65j = i3 + 1;
                }
            } else {
                sArr[i2 + 0] = -1;
                sArr[i2 + 1] = -1;
                sArr[i2 + 2] = 4;
                sArr[i2 + 3] = -1;
                if (f65j == i3 + 1) {
                    f65j = -1;
                }
            }
            i2 += 4;
        }
        int i4 = i2 + 4;
        if ((f84v & 1) != 0) {
            sArr[i4 + 1] = 11;
        } else {
            sArr[i4 + 1] = 6;
        }
        f32a[19] = sArr;
        if (f65j == -1) {
            f65j = i;
        }
    }

    /* renamed from: b */
    public static final void m43b(int i) {
        m29a(f32a[i], 4, 30, 39);
    }

    /* renamed from: b */
    public static final void m44b(int i, int i2) {
        int h = m67h(i);
        if (h > 0) {
            boolean z = (f68k && i == i2 && (f37b[h] == 0 || f37b[h] == 4)) ? false : true;
            if (f72m) {
                int i3 = f40b[h][2];
                int i4 = f40b[m67h(i2)][2];
                if (i3 == 0 && i4 == 7) {
                    z = false;
                }
            }
            if (!z) {
                return;
            }
            if (f36b) {
                m76k();
                return;
            }
            f37b[h] = 1;
            m91s(i);
        }
    }

    /* renamed from: b */
    public static final void m45b(Graphics graphics) {
        int i;
        int i2;
        int i3;
        graphics.setClip(0, 0, C0003c.f260aC, C0003c.f368l);
        graphics.setColor(C0003c.f191F[8]);
        graphics.fillRect(0, 0, C0003c.f260aC, C0003c.f368l);
        int i4 = C0003c.f296b[1738] / C0003c.f296b[1743];
        int i5 = C0003c.f260aC - 10;
        int i6 = C0003c.f368l - 10;
        if (f21a != 0) {
            i = C0003c.f296b[1728] >> 1;
            i2 = (C0003c.f368l - i) - 5;
        } else {
            i = 5;
            i2 = i6;
        }
        graphics.setColor(C0003c.f191F[3]);
        graphics.drawRect(7, i + 2, i5 - 3, i2 - 3);
        graphics.setColor(C0003c.f191F[6]);
        graphics.drawRect(6, i + 1, i5 - 3, i2 - 3);
        graphics.setColor(C0003c.f191F[5]);
        graphics.drawRect(5, i, i5 - 3, i2 - 3);
        C0003c.m249a(5, i, 158, 0, graphics);
        C0003c.m249a((i5 + 5) - i4, i, 158, 1, graphics);
        int i7 = i + 3;
        if (f21a == 0) {
            int i8 = i7 + 5;
            C0003c.m249a(C0003c.f260aC >> 1, i8, 159, 0, graphics);
            i3 = C0003c.f296b[1750] + 5 + i8;
        } else {
            int i9 = C0003c.f296b[1728] + 6;
            i2 = C0003c.f368l - 10;
            int i10 = C0003c.f260aC - 26;
            C0003c.m249a(C0003c.f260aC >> 1, 3, 157, 0, graphics);
            graphics.setColor(C0003c.f191F[4]);
            int i11 = ((byte) ((C0003c.f339f[2] >> 16) & 255)) + 5;
            graphics.fillRect(13, i9, i10, i11);
            graphics.setColor(C0003c.f191F[6]);
            graphics.drawRect(13, i9, i10, i11);
            graphics.drawRect(14, i9 + 1, i10 - 1, i11 - 1);
            graphics.setColor(C0003c.f191F[5]);
            graphics.drawRect(13, i9, i10 - 1, i11 - 1);
            i3 = (i11 - 1) + i9;
        }
        int i12 = C0003c.f260aC - 26;
        int i13 = i2 - ((C0003c.f296b[1486] + i3) + 3);
        graphics.setColor(C0003c.f191F[3]);
        graphics.fillRect(13, i3, i12, i13);
        graphics.setColor(C0003c.f191F[6]);
        graphics.drawRect(13, i3, i12, i13);
        graphics.drawRect(14, i3 + 1, i12 - 1, i13 - 1);
        graphics.setColor(C0003c.f191F[5]);
        graphics.drawRect(13, i3, i12 - 1, i13 - 1);
        C0003c.m249a(13, i3, 152, 0, graphics);
        C0003c.m247a(i12 + 13, i3, 152, 0, 0, 2, graphics);
        int i14 = i3 + i13;
        int i15 = C0003c.f260aC >> 1;
        C0003c.m249a(i15, i14, 152, 0, graphics);
        C0003c.m247a(i15, i14, 152, 0, 0, 2, graphics);
    }

    /* renamed from: b */
    public static final boolean m46b(int i) {
        if (i < -1 || i >= f56e.length) {
            return false;
        }
        return i == 0 ? f56e[1] == 0 && f56e[2] == 0 && f56e[5] == 0 : f56e[i] == 1;
    }

    /* renamed from: b */
    public static final int[] m47b() throws IOException {
        int[] iArr = new int[f15a.readShort()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = f15a.readInt();
        }
        return iArr;
    }

    /* renamed from: c */
    public static final int m48c() {
        return f18a.nextInt() & Integer.MAX_VALUE;
    }

    /* renamed from: c */
    public static final int m49c(int i) {
        short[] sArr = f32a[i];
        for (int length = (sArr.length / 4) - 1; length >= 0; length--) {
            short s = sArr[(length << 2) + 2];
            if (s > 99 && s < 200) {
                return length;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final String m50c(int i) {
        String str = "";
        if (f7a == 0) {
            return "null_3";
        }
        int i2 = (i + 1) * 2;
        if (i2 < 0 || i2 >= f52d.length) {
            return "";
        }
        byte b = ((f52d[i2 + 4] & 255) << 8) | (f52d[i2 + 3] & 255);
        byte b2 = (f52d[i2 + 1] & 255) | ((f52d[i2 + 2] & 255) << 8);
        if (b2 >= f52d.length) {
            return "";
        }
        byte[] bArr = new byte[(b - b2)];
        System.arraycopy(f52d, b2, bArr, 0, bArr.length);
        switch (f52d[0]) {
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
        return str;
    }

    /* renamed from: c */
    public static final void m51c() {
        m4a(0, f56e);
    }

    /* renamed from: c */
    public static final void m52c(int i) {
        int h = m67h(i);
        if (h >= 0) {
            int i2 = f40b[h][3];
            boolean z = ((f40b[h][4] >> 3) & 1) == 1;
            for (int i3 = 0; i3 < f83u; i3++) {
                boolean z2 = f62h ? f40b[i3][3] <= i2 : f40b[i3][3] < i2;
                if (!(f37b[i3] == 0 || f37b[i3] == 4)) {
                    z2 = false;
                }
                if (f37b[i3] == 2) {
                    z2 = true;
                }
                if (z2) {
                    int i4 = f30a[i3][0];
                    int i5 = f40b[i3][4];
                    boolean z3 = ((i5 >> 3) & 1) == 1;
                    boolean z4 = ((i5 >> 4) & 1) == 1 ? (z3 && z) || (!z3 && !z) : true;
                    if (z4) {
                        m40b(i4, i);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static final void m53c(int i, int i2) {
        switch (i) {
            case 0:
                if (i2 == 1) {
                    m3a(0, 1);
                    return;
                }
                return;
            case 1:
                if (i2 == 1) {
                    m3a(1, 1);
                    return;
                }
                return;
            case 2:
                if (i2 == 1) {
                    m3a(2, 1);
                    return;
                }
                return;
            case 8:
                if (i2 == 1) {
                    m3a(6, 1);
                    return;
                }
                return;
            case 9:
                if (i2 == 1) {
                    m3a(6, 0);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public static final boolean m54c(int i) {
        boolean z = false;
        try {
            RecordStore openRecordStore = RecordStore.openRecordStore(new StringBuffer().append("RECSTR").append(i).toString(), false);
            if (openRecordStore != null) {
                try {
                    openRecordStore.closeRecordStore();
                } catch (Exception e) {
                }
            }
            return true;
        } catch (Exception e2) {
            return z;
        }
    }

    /* renamed from: d */
    public static final int m55d(int i) {
        int i2 = -1;
        short[] sArr = f32a[i];
        int i3 = 0;
        boolean z = false;
        while (!z) {
            int i4 = (i3 << 2) + 2;
            if (i4 <= sArr.length) {
                short s = sArr[i4];
                if (s > 99 && s < 200) {
                    z = true;
                    i2 = i3;
                }
            } else {
                z = true;
            }
            i3++;
        }
        return i2;
    }

    /* renamed from: d */
    public static final void m56d() {
        C0003c.f339f = new int[3];
        int height = C0003c.f246a[0].getHeight() + 14;
        int stringWidth = C0003c.f246a[0].stringWidth("(Fg)") + 14;
        int[] iArr = new int[(height * stringWidth)];
        Image createImage = Image.createImage(stringWidth, height);
        Graphics graphics = createImage.getGraphics();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 3) {
                graphics.setColor(C0003c.f191F[0]);
                graphics.fillRect(0, 0, stringWidth, height);
                graphics.setFont(C0003c.f246a[i2]);
                graphics.setColor(C0003c.f191F[3]);
                graphics.drawString("(Fg)", 7, 7, 20);
                createImage.getRGB(iArr, 0, stringWidth, 0, 0, stringWidth, height);
                int i3 = iArr[0] & 16777215;
                int i4 = -1;
                int i5 = -1;
                int i6 = -1;
                for (int i7 = 1; i7 < iArr.length; i7++) {
                    int i8 = i7 / stringWidth;
                    int i9 = i7 % stringWidth;
                    if ((iArr[i7] & 16777215) != i3) {
                        if (i9 < i6 || i6 == -1) {
                            i6 = i9;
                        }
                        if (i8 < i5 || i5 == -1) {
                            i5 = i8;
                        }
                        if (i8 > i4 || i4 == -1) {
                            i4 = i8;
                        }
                    }
                }
                int i10 = i4 - i5;
                int i11 = 0;
                if (i10 < C0003c.f246a[i2].getHeight()) {
                    i11 = ((C0003c.f246a[i2].getHeight() - i10) / 2) + 0;
                    i10 += i11 * 2;
                }
                int i12 = 7 - i6;
                int i13 = i11 + (7 - i5);
                int[] iArr2 = C0003c.f339f;
                iArr2[i2] = iArr2[i2] & -256;
                int[] iArr3 = C0003c.f339f;
                iArr3[i2] = (((byte) i12) & 255) | iArr3[i2];
                int[] iArr4 = C0003c.f339f;
                iArr4[i2] = iArr4[i2] & -65281;
                int[] iArr5 = C0003c.f339f;
                iArr5[i2] = ((((byte) i13) << 8) & 65280) | iArr5[i2];
                int[] iArr6 = C0003c.f339f;
                iArr6[i2] = iArr6[i2] & -16711681;
                int[] iArr7 = C0003c.f339f;
                iArr7[i2] = ((((byte) i10) << 16) & 16711680) | iArr7[i2];
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    public static final void m57d(int i) {
        if (m49c(i)) {
            try {
                RecordStore openRecordStore = RecordStore.openRecordStore(new StringBuffer().append("RECSTR").append(i).toString(), false);
                if (openRecordStore.getNumRecords() == 1) {
                    openRecordStore.deleteRecord(1);
                }
                openRecordStore.closeRecordStore();
                RecordStore.deleteRecordStore(new StringBuffer().append("RECSTR").append(i).toString());
            } catch (Exception e) {
            }
        }
    }

    /* renamed from: e */
    public static final int m58e(int i) {
        if (i <= 0) {
            return 0;
        }
        return (f18a.nextInt() & Integer.MAX_VALUE) % i;
    }

    /* renamed from: e */
    public static final void m59e() {
        if (m70i((int) f21a) > 0) {
            short[] sArr = f32a[f21a];
            short s = sArr[(f65j * 4) + 2];
            int length = sArr.length / 4;
            if (s == 103 || s == 104 || s == 108) {
                if ((-f69l) < (f79q - f0A) - f57f) {
                    f69l -= (byte) ((C0003c.f339f[2] >> 16) & 255);
                }
                if (!f64i) {
                    return;
                }
                if (f75o >= 0) {
                    f65j = f75o;
                    return;
                } else {
                    f65j++;
                    return;
                }
            } else {
                f65j++;
                if (f65j >= length) {
                    f65j = 0;
                    f69l = f0A;
                }
                short s2 = sArr[(f65j * 4) + 2];
                if (s2 <= 99 || s2 >= 200) {
                    m59e();
                }
            }
        }
        m74j();
    }

    /* renamed from: e */
    public static final void m60e(int i) {
        if (f14a != null) {
            byte[] byteArray = f14a.toByteArray();
            if (byteArray.length > 0) {
                m4a(i, byteArray);
            }
        }
    }

    /* renamed from: f */
    public static final int m61f(int i) {
        int i2;
        int i3 = 4;
        f84v |= 1;
        short[] sArr = f32a[i];
        int i4 = C0001a.f124d[C0003c.f269ai][3];
        if ((i4 & 32) == 0 && (i4 & 4096) == 0) {
            i2 = C0001a.f109a[(short) ((C0001a.f124d[C0003c.f269ai][0] & -65536) >> 16)][(short) (C0001a.f124d[C0003c.f269ai][0] & 65535)];
            while (i2 >= 0 && (C0001a.f124d[i2][3] & 10176) <= 0) {
                i2 = (short) (C0001a.f124d[i2][1] & 65535);
            }
        } else {
            i2 = (short) (C0003c.f213Q[C0001a.m101a(C0003c.f269ai, (int[]) null) + f6G] & 65535);
        }
        boolean z = (i4 & 32) != 0 && (C0001a.f124d[C0003c.f269ai][13] & 2) == 0;
        boolean z2 = ((i4 & 32) == 0 || (C0001a.f124d[C0003c.f269ai][13] & 2) == 0) ? false : true;
        C0003c.f273am = 126;
        if (z) {
            f51d = true;
            f50d = m0a(f6G + 232);
            C0003c.f273am = 113;
        } else if (z2) {
            f51d = false;
            f50d = C0001a.m102a(C0001a.f124d[C0003c.f269ai]);
        } else {
            f51d = false;
            f50d = m0a(221);
        }
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < 30; i7++) {
            if (i2 >= 0) {
                int[] a = C0003c.m230a(C0001a.f124d[i2]);
                short s = (short) i2;
                if (!((C0001a.f124d[i2][3] & 64) == 0 && (C0001a.f124d[i2][3] & 128) == 0) && !C0003c.m230a(C0001a.f124d[i2])) {
                    s = (short) (s | 32768);
                }
                sArr[i3 + 0] = (short) a[0];
                sArr[i3 + 1] = 21;
                sArr[i3 + 2] = 105;
                sArr[i3 + 3] = s;
                int i8 = (short) (C0001a.f124d[i2][1] & 65535);
                while (i2 >= 0 && (C0001a.f124d[i2][3] & 10176) <= 0) {
                    i8 = (short) (C0001a.f124d[i2][1] & 65535);
                }
                i6++;
                i5 = i7 + 1;
                if (f65j == -1) {
                    f65j = i7 + 1;
                }
            } else {
                sArr[i3 + 0] = -1;
                sArr[i3 + 1] = -1;
                sArr[i3 + 2] = 4;
                sArr[i3 + 3] = -1;
                if (f65j == i7 + 1) {
                    f65j = -1;
                }
            }
            i3 += 4;
        }
        f32a[i] = sArr;
        if (i6 == 0 && (C0001a.f124d[C0003c.f269ai][3] & 4096) != 0) {
            f50d = m0a(228);
            f51d = false;
        }
        if (f65j == -1) {
            f65j = i5;
        }
        return i6;
    }

    /* renamed from: f */
    public static final void m62f() {
        f44c = false;
        for (int i = 0; i < f83u; i++) {
            if (f37b[i] == 3) {
                int i2 = f25a[i];
                if (f66j) {
                    long currentTimeMillis = System.currentTimeMillis() - f9a;
                    if (f26a[i] > 0) {
                        long[] jArr = f26a;
                        jArr[i] = currentTimeMillis + jArr[i];
                    }
                }
                m81m(i2);
            }
        }
    }

    /* renamed from: f */
    public static final void m63f(int i) {
        f20a.removeAllElements();
        f35b.removeAllElements();
        f50d = C0001a.m102a(f38b);
        f33b = -1;
        f51d = false;
        int[] a = C0003c.m230a(f38b);
        if ((f38b[3] & 64) != 0) {
            m23a(m0a(a[15] + 73), "", false);
            m23a(m0a(252), new StringBuffer().append("").append(C0001a.m102a(f38b)).toString(), false);
            m28a(f38b, a);
        } else if ((f38b[3] & 128) != 0) {
            m23a(m0a(252), new StringBuffer().append("").append(C0001a.m102a(f38b)).toString(), false);
            m28a(f38b, a);
        } else if ((f38b[3] & 8192) != 0) {
            m23a(m0a(a[10] + 77), "", false);
            m23a(m0a(252), new StringBuffer().append("").append(C0001a.m102a(f38b)).toString(), false);
            m28a(f38b, a);
        } else if ((f38b[3] & 256) != 0) {
            m23a(m0a(a[0] + 1), "", false);
            if (a[3] != 0) {
                if (a[3] > 0) {
                    m23a(m0a(a[6] + 29), new StringBuffer().append("+").append(a[3]).toString(), false);
                } else {
                    m23a(m0a(a[6] + 29), new StringBuffer().append("").append(a[3]).toString(), false);
                }
            }
            m23a(m0a(252), new StringBuffer().append("").append(C0001a.m102a(f38b)).toString(), false);
        } else if ((f38b[3] & 1024) != 0) {
            m23a(m0a(a[10]), "", false);
        } else if ((f38b[3] & 512) != 0) {
            m23a(m0a(a[3]), "", false);
        }
    }

    /* renamed from: g */
    public static final int m64g(int i) {
        short[] sArr = f32a[i];
        f77p = m73j(i);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < f77p; i4++) {
            switch (sArr[(i4 << 2) + 2]) {
                case 50:
                    i3 += m13a((Graphics) null, f48c[i2], 0);
                    i2++;
                    break;
                case 100:
                case 101:
                    i3 += m10a((Graphics) null, (String) null, 0, false);
                    break;
                case 102:
                    i3 += m11a((Graphics) null, (String) null, 0, false, 0);
                    break;
                case 103:
                case 104:
                    i3 += m14a((Graphics) null, f48c[i2], 0, -1, (int) (byte) (sArr[(i4 << 2) + 3] & 255));
                    i2++;
                    break;
                case 105:
                    i3 += m12a((Graphics) null, (String) null, false, 0, 0);
                    break;
                case 108:
                    i3 += m7a((Graphics) null, 0);
                    break;
                case 109:
                    i3 += m9a((Graphics) null, (String) null, 0, 0, false);
                    break;
            }
        }
        return i3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.String, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0, types: [java.lang.String, java.io.InputStream]
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY]]
      uses: [java.lang.String, java.io.InputStream]
      mth insns count: 42
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
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m65g() {
        /*
            r1 = 0
            r5 = -1
            r0 = 0
            f34b = r1
            HG r2 = f10a     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            java.lang.String r3 = "/mi"
            java.io.InputStream r1 = r2.getResourceAsStream(r3)     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r2 = 2
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r3 = 0
            r4 = 2
            r1.read(r2, r3, r4)     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r3 = 0
            byte r3 = r2[r3]     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 8
            r4 = 1
            byte r2 = r2[r4]     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r3
            if (r2 <= 0) goto L_0x0038
            byte[] r3 = new byte[r2]     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r4 = 0
            int r4 = r1.read(r3, r4, r2)     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            if (r4 != r2) goto L_0x0038
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
            f34b = r2     // Catch:{ Exception -> 0x005b, all -> 0x0062 }
        L_0x0038:
            r1.close()     // Catch:{ Exception -> 0x0067 }
        L_0x003b:
            java.lang.String r1 = f34b
            if (r1 == 0) goto L_0x005a
            r1 = 383(0x17f, float:5.37E-43)
            int r1 = m3a(r0, r1)
            if (r1 != r5) goto L_0x0050
            short[][] r1 = f32a
            r1 = r1[r0]
            int r1 = r1.length
            int r1 = r1 / 4
            int r1 = r1 + -1
        L_0x0050:
            int r1 = r1 + 1
            r2 = 388(0x184, float:5.44E-43)
            r3 = 5
            r4 = 101(0x65, float:1.42E-43)
            m22a(r0, r1, r2, r3, r4, r5)
        L_0x005a:
            return
        L_0x005b:
            r2 = move-exception
            r1.close()     // Catch:{ Exception -> 0x0060 }
            goto L_0x003b
        L_0x0060:
            r1 = move-exception
            goto L_0x003b
        L_0x0062:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x0069 }
        L_0x0066:
            throw r0
        L_0x0067:
            r1 = move-exception
            goto L_0x003b
        L_0x0069:
            r1 = move-exception
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m65g():void");
    }

    /* renamed from: g */
    public static final void m66g(int i) {
        short s = (short) i;
        m73j((int) f21a);
        f21a = s;
        m26a(s);
    }

    /* renamed from: h */
    public static final int m67h(int i) {
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= f83u) {
                i2 = -1;
                break;
            } else if (f30a[i3][0] == i) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        if (i2 == -1) {
            for (int i4 = 0; i4 < f83u; i4++) {
                if (f40b[i4][0] == i) {
                    return i4;
                }
            }
        }
        return i2;
    }

    /* renamed from: h */
    private static final void m68h() {
        int[][] iArr = {new int[]{0, 0, 0, 0, 4, -1, 1, 19814}, new int[]{1, 1, 0, 0, 8, -1, -1, 48410}, new int[]{2, 2, 0, 0, 8, -1, -1, 66431}, new int[]{3, 3, 0, 0, 8, -1, -1, 145382}, new int[]{4, 4, 0, 0, 8, -1, -1, 99005}, new int[]{5, 5, 0, 0, 8, -1, -1, 37399}, new int[]{6, 6, 0, 0, 8, -1, -1, 58859}, new int[]{7, 10, 0, 6, 4, -1, -1, 2116}, new int[]{8, 11, 0, 6, 4, -1, -1, 3749}, new int[]{9, 20, 0, 0, 4, -1, -1, 906}, new int[]{10, 21, 0, 0, 4, -1, -1, 699}, new int[]{11, 22, 0, 0, 4, -1, -1, 1247}, new int[]{12, 23, 0, 0, 4, -1, -1, 1247}, new int[]{13, 24, 0, 0, 4, -1, -1, 1871}, new int[]{14, 25, 0, 0, 4, -1, -1, 1410}, new int[]{15, 26, 0, 0, 4, -1, -1, 2139}, new int[]{16, 27, 0, 0, 4, -1, -1, 1410}, new int[]{17, 28, 0, 0, 4, -1, -1, 2139}, new int[]{18, 30, 0, 0, 4, -1, -1, 1087}, new int[]{19, 31, 0, 0, 4, -1, -1, 518}, new int[]{20, 32, 0, 0, 4, -1, -1, 1087}, new int[]{21, 33, 0, 0, 4, -1, -1, 647}, new int[]{22, 34, 0, 1, 4, -1, -1, 831}, new int[]{23, 35, 0, 5, 4, -1, -1, 1088}, new int[]{24, 35, 0, 5, 4, -1, -1, 1088}, new int[]{25, 35, 0, 5, 4, -1, -1, 1088}, new int[]{26, 35, 0, 5, 4, -1, -1, 1088}, new int[]{27, 35, 0, 5, 4, -1, -1, 1088}, new int[]{28, 35, 0, 5, 4, -1, -1, 1088}, new int[]{29, 35, 0, 5, 4, -1, -1, 1088}, new int[]{30, 43, 0, 9, 4, -1, -1, 4747}, new int[]{31, 50, 0, 0, 4, -1, -1, 704}, new int[]{32, 51, 0, 0, 4, -1, -1, 862}, new int[]{33, 52, 0, 0, 4, -1, -1, 702}};
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if ("".getClass().getResourceAsStream(iArr[i2][1] < 10 ? new StringBuffer().append("/0").append(iArr[i2][1]).append(f47c[iArr[i2][2]]).toString() : new StringBuffer().append("/").append(iArr[i2][1]).append(f47c[iArr[i2][2]]).toString()) == null) {
                iArr2[i2] = 0;
            } else {
                iArr2[i2] = 1;
                i++;
            }
        }
        f40b = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i, 8});
        int i3 = 0;
        for (int i4 = 0; i4 < iArr.length; i4++) {
            if (iArr2[i4] == 1) {
                System.arraycopy(iArr[i4], 0, f40b[i3], 0, iArr[i4].length);
                i3++;
            }
        }
    }

    /* renamed from: h */
    public static final void m69h(int i) {
        m80m();
        byte[] a = m0a(i);
        if (a != null) {
            f13a = new ByteArrayInputStream(a);
            f15a = new DataInputStream(f13a);
        }
    }

    /* renamed from: i */
    public static final int m70i(int i) {
        short[] sArr = f32a[i];
        int length = sArr.length / 4;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < length) {
            short s = sArr[i3 + 2];
            int i5 = i3 + 4;
            if (s > 99 && s < 200) {
                i4 = (short) (i4 + 1);
            }
            i2++;
            i3 = i5;
        }
        return i4;
    }

    /* renamed from: i */
    public static final void m71i() {
        int length = f32a[f21a].length / 4;
        if (f65j >= 0 && f65j < length) {
            short[] sArr = f32a[f21a];
            int i = f65j * 4;
            short s = sArr[i + 1];
            short s2 = sArr[i + 3];
            switch (sArr[i + 2]) {
                case 100:
                case 107:
                    f19a.push(new Integer(f21a));
                    f19a.push(new Integer(f65j));
                    m64g((int) s);
                    return;
                case 101:
                case 105:
                case 106:
                case 109:
                    m89q(s);
                    return;
                case 102:
                    int i2 = -1;
                    for (int i3 = 0; i3 <= f65j; i3++) {
                        if (f32a[f21a][(i3 << 2) + 2] == 102) {
                            i2++;
                        }
                    }
                    int j = m73j((int) f21a);
                    if (s2 >= 0) {
                        int i4 = 0;
                        for (int i5 = 0; i5 < j; i5++) {
                            short[] sArr2 = f32a[f21a];
                            if (sArr2[(i5 << 2) + 2] == 102) {
                                if (sArr2[(i5 << 2) + 3] == s2) {
                                    f23a[i4] = 0;
                                }
                                i4++;
                            }
                        }
                    }
                    f23a[i2] = 1;
                    m53c(s, 1);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: i */
    public static final void m72i(int i) {
        f33b = -1;
        f51d = true;
        f20a.removeAllElements();
        f35b.removeAllElements();
        f50d = m0a(f71m + 51);
        C0003c.f273am = 126;
        switch (f71m) {
            case 0:
                m23a(m0a(58), new StringBuffer().append("").append(C0003c.f414w[18]).toString(), false);
                m23a(m0a(51), new StringBuffer().append("").append(C0003c.f414w[17]).toString(), false);
                int f = C0003c.m391f(C0003c.f414w[18]);
                if (f >= 0) {
                    m23a(m0a(66), new StringBuffer().append("").append(f).toString(), false);
                } else {
                    m23a(m0a(63), "", false);
                }
                m23a(m0a(57), new StringBuffer().append("").append(C0003c.f414w[19]).toString(), false);
                return;
            case 1:
                m23a(m0a(55), new StringBuffer().append((short) (C0003c.f414w[12] & 65535)).append("/").append((short) ((C0003c.f414w[12] & -65536) >> 16)).append(m39b(((short) ((C0003c.f414w[12] & -65536) >> 16)) - ((short) (C0003c.f414w[54] & 65535)))).toString(), false);
                m23a(m0a(61), new StringBuffer().append((short) (C0003c.f414w[13] & 65535)).append("/").append((short) ((C0003c.f414w[13] & -65536) >> 16)).append(m39b(((short) ((C0003c.f414w[13] & -65536) >> 16)) - ((short) ((C0003c.f414w[54] & -65536) >> 16)))).toString(), false);
                m23a(m0a(33), new StringBuffer().append("").append((short) (C0003c.f414w[14] & 65535)).append(m39b(((short) (C0003c.f414w[14] & 65535)) - ((short) ((C0003c.f414w[14] & -65536) >> 16)))).toString(), false);
                m23a(m0a(34), new StringBuffer().append("").append((short) (C0003c.f414w[15] & 65535)).append(m39b(((short) (C0003c.f414w[15] & 65535)) - ((short) ((C0003c.f414w[15] & -65536) >> 16)))).toString(), false);
                return;
            case 2:
                int i2 = ((short) (C0003c.f414w[20] & 65535)) - ((short) ((C0003c.f414w[20] & -65536) >> 16));
                int i3 = ((short) (C0003c.f414w[21] & 65535)) - ((short) ((C0003c.f414w[21] & -65536) >> 16));
                int i4 = ((short) (C0003c.f414w[22] & 65535)) - ((short) ((C0003c.f414w[22] & -65536) >> 16));
                int i5 = ((short) (C0003c.f414w[23] & 65535)) - ((short) ((C0003c.f414w[23] & -65536) >> 16));
                switch (C0003c.m442l(C0003c.m219a())) {
                    case 0:
                        i2 += C0003c.f414w[51];
                        break;
                    case 1:
                        i3 += C0003c.f414w[51];
                        break;
                    case 2:
                        i4 += C0003c.f414w[51];
                        break;
                    case 3:
                        i5 += C0003c.f414w[51];
                        break;
                }
                m23a(m0a(67), new StringBuffer().append("").append((short) (C0003c.f414w[20] & 65535)).append(m39b(i2)).toString(), false);
                m23a(m0a(72), new StringBuffer().append("").append((short) (C0003c.f414w[21] & 65535)).append(m39b(i3)).toString(), false);
                m23a(m0a(43), new StringBuffer().append("").append((short) (C0003c.f414w[22] & 65535)).append(m39b(i4)).toString(), false);
                m23a(m0a(44), new StringBuffer().append("").append((short) (C0003c.f414w[23] & 65535)).append(m39b(i5)).toString(), false);
                m23a(m0a(46), new StringBuffer().append("").append((short) (C0003c.f414w[25] & 65535)).append(m39b(((short) (C0003c.f414w[25] & 65535)) - ((short) ((C0003c.f414w[25] & -65536) >> 16)))).toString(), false);
                return;
            case 3:
                m23a(m0a(68), "", false);
                m23a(new StringBuffer().append("  ").append(m0a(47)).toString(), new StringBuffer().append("").append(C0003c.f414w[27]).toString(), false);
                m23a(new StringBuffer().append("  ").append(m0a(70)).toString(), new StringBuffer().append("").append(C0003c.f414w[28]).toString(), false);
                return;
            default:
                return;
        }
    }

    /* renamed from: j */
    public static final int m73j(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < f32a[i].length / 4) {
            i2++;
            i3 = (short) (i3 + 1);
        }
        return i3;
    }

    /* renamed from: j */
    public static final void m74j() {
        C0003c.m397f(0, 0, 0);
        C0003c.m397f(1, -2, 0);
        C0003c.m397f(2, -2, 0);
    }

    /* renamed from: j */
    public static final void m75j(int i) {
        f39b = null;
        f48c = null;
        f77p = 0;
    }

    /* renamed from: k */
    public static final void m76k() {
        for (int i = 0; i < f83u; i++) {
            m91s(f30a[i][0]);
        }
    }

    /* renamed from: k */
    public static final void m77k(int i) {
        short[] sArr = f32a[i];
        f50d = m0a((f61h - 1) + 244);
        C0003c.f273am = 126;
        f51d = true;
        int i2 = 3;
        for (int i3 = 0; i3 < C0003c.f399s.length; i3++) {
            C0003c.f399s[i3][3] = -1;
            if (((short) (C0003c.f399s[i3][0] & 65535)) == f61h) {
                i2++;
            }
        }
        short[] sArr2 = sArr.length != i2 * 4 ? new short[(i2 * 4)] : sArr;
        sArr2[0] = -1;
        sArr2[1] = -1;
        sArr2[2] = 6;
        sArr2[3] = 1;
        int i4 = 4;
        int i5 = 1;
        for (int i6 = 0; i6 < C0003c.f399s.length; i6++) {
            if (((short) (C0003c.f399s[i6][0] & 65535)) == f61h && ((short) ((C0003c.f399s[i6][0] & -65536) >> 16)) == 1) {
                sArr2[i4 + 0] = (short) C0003c.f399s[i6][1];
                sArr2[i4 + 1] = 28;
                sArr2[i4 + 2] = 109;
                sArr2[i4 + 3] = 37;
                i4 += 4;
                C0003c.f399s[i6][3] = i5;
                i5++;
            }
        }
        for (int i7 = 0; i7 < C0003c.f399s.length; i7++) {
            if (((short) (C0003c.f399s[i7][0] & 65535)) == f61h && ((short) ((C0003c.f399s[i7][0] & -65536) >> 16)) == 0) {
                sArr2[i4 + 0] = (short) C0003c.f399s[i7][1];
                sArr2[i4 + 1] = 28;
                sArr2[i4 + 2] = 109;
                sArr2[i4 + 3] = 37;
                i4 += 4;
                C0003c.f399s[i7][3] = i5;
                i5++;
            }
        }
        sArr2[i4 + 0] = 136;
        sArr2[i4 + 1] = 11;
        sArr2[i4 + 2] = 3;
        sArr2[i4 + 3] = 1;
        int i8 = i4 + 4;
        sArr2[i8 + 0] = 136;
        sArr2[i8 + 1] = 6;
        sArr2[i8 + 2] = 2;
        sArr2[i8 + 3] = 0;
        f32a[i] = sArr2;
    }

    /* renamed from: l */
    public static final void m78l() {
        m68h();
        f83u = f40b.length;
        if (f27a == null) {
            f27a = new Object[f83u];
            f30a = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f83u, 4});
            f37b = new byte[f83u];
            f25a = new int[f83u];
            f26a = new long[f83u];
        }
        for (int i = 0; i < f83u; i++) {
            f30a[i][0] = -1;
            f30a[i][1] = -1;
            f30a[i][2] = -1;
            f37b[i] = -1;
            f25a[i] = -1;
            f26a[i] = -1;
            f27a[i] = null;
        }
        System.gc();
        boolean z = false;
        for (int i2 = 0; i2 < f83u; i2++) {
            int i3 = f40b[i2][4];
            boolean z2 = ((i3 >> 2) & 1) == 1;
            if ((((i3 >> 0) & 1) == 1) && f27a[i2] == null) {
                m90r(i2);
            }
            if (z2 || f66j) {
                z = true;
            }
            C0002b.f170a = ((i2 * 25) / f83u) + 75;
        }
        if (z && f12a == null) {
            f12a = new C0004d();
            f12a.start();
        }
        f58f = true;
    }

    /* renamed from: l */
    public static final void m79l(int i) {
        boolean z;
        boolean z2;
        int h = m67h(i);
        int i2 = Integer.MIN_VALUE;
        if (h >= 0) {
            for (int i3 = 0; i3 < f83u; i3++) {
                if (f37b[i3] == 0) {
                    int i4 = f40b[i3][3];
                    if (i2 < i4) {
                        i2 = i4;
                    }
                }
            }
            if (h >= 0) {
                int i5 = f40b[h][3];
                z = f62h ? i5 >= i2 : i5 > i2;
            } else {
                z = false;
            }
            if (z) {
                m49c(i);
                int i6 = f30a[h][2];
                boolean z3 = false;
                Player player = null;
                while (!z3 && f67k < 3) {
                    if (i6 < 0) {
                        m90r(h);
                        i6 = f30a[h][2];
                    }
                    if (i6 < 0 || f27a[i6] == null) {
                        z2 = z3;
                    } else {
                        Player player2 = (Player) f27a[i6];
                        z2 = f22a ? player2.getState() == 200 || player2.getState() == 300 : player2.getState() == 300;
                        if (!z2) {
                            player = player2;
                            m76k();
                        } else {
                            player = player2;
                        }
                    }
                    f67k++;
                    z3 = z2;
                }
                f67k = 0;
                if (z3) {
                    try {
                        int state = player.getState();
                        if (!(state == 300 || state == 0)) {
                            player.prefetch();
                        }
                        try {
                            if (f76o) {
                                player.setMediaTime(0);
                            }
                        } catch (Exception e) {
                        }
                        try {
                            player.setLoopCount(1);
                            player.start();
                            f37b[h] = 0;
                        } catch (Exception e2) {
                        }
                        try {
                            if (f78p) {
                                player.setMediaTime(0);
                            }
                        } catch (Exception e3) {
                        }
                        if (f66j) {
                            int i7 = f40b[h][7];
                            if (i7 > 0) {
                                f26a[h] = System.currentTimeMillis() + ((long) i7);
                            } else {
                                f26a[h] = (player.getDuration() / 1000) + System.currentTimeMillis();
                            }
                        }
                    } catch (Exception e4) {
                    }
                }
            }
        }
    }

    /* renamed from: m */
    public static final void m80m() {
        if (f14a == null) {
            f14a = new ByteArrayOutputStream();
        } else {
            f14a.reset();
        }
        if (f16a == null) {
            f16a = new DataOutputStream(f14a);
        }
    }

    /* renamed from: m */
    public static final void m81m(int i) {
        boolean z = true;
        if (i >= 0) {
            int h = m67h(i);
            if (h >= 0) {
                int i2 = f40b[h][4];
                if (((i2 >> 3) & 1) == 1 && !m39b(1) && !m39b(5)) {
                    return;
                }
                if ((((i2 >> 3) & 1) == 1 || m39b(2) || f40b[h][1] == 0 || m39b(5)) && !m39b(0)) {
                    boolean z2 = ((i2 >> 2) & 1) == 1 || f66j;
                    if (f40b[h][5] >= 0) {
                        Vector vector = new Vector(1, 1);
                        int i3 = f40b[h][5];
                        for (int i4 = 0; i4 < f83u; i4++) {
                            if (f40b[h][5] >= 0 && f40b[i4][5] == i3) {
                                vector.addElement(new Integer(f40b[i4][0]));
                            }
                        }
                        int size = vector.size();
                        if (size > 1) {
                            i = ((Integer) vector.elementAt(m58e(size))).intValue();
                        }
                    }
                    if (f68k && f37b[h] == 0) {
                        z = false;
                    }
                    if (z) {
                        if (z2) {
                            if (!C0004d.f430b) {
                                f12a = new C0004d();
                                f12a.start();
                            }
                            C0004d.m488a(i);
                        } else {
                            m93u(i);
                        }
                        if (f37b[h] != 0) {
                            f37b[h] = 4;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public static final void m82n() {
        if (!f19a.empty()) {
            int intValue = ((Integer) f19a.pop()).intValue();
            int intValue2 = ((Integer) f19a.pop()).intValue();
            f65j = intValue;
            m64g(intValue2);
            if (f32a[f21a][(intValue * 4) + 2] > 99 && f32a[f21a][(intValue * 4) + 2] < 200) {
                f65j = intValue;
            }
        }
    }

    /* renamed from: n */
    public static final void m83n(int i) {
        short[] sArr = f32a[i];
        f50d = C0001a.m102a(f38b);
        f51d = false;
        if ((C0001a.f124d[C0003c.f269ai][3] & 32) == 0 || (C0001a.f124d[C0003c.f269ai][13] & 2) != 0) {
            sArr[4] = 250;
            sArr[7] = 43;
            return;
        }
        sArr[4] = 218;
        sArr[7] = 45;
    }

    /* renamed from: o */
    public static final void m84o() {
        boolean z = m70i((int) f21a) > 0;
        int i = f65j;
        if (z) {
            short[] sArr = f32a[f21a];
            short s = sArr[(f65j * 4) + 2];
            if (s == 103 || s == 104 || s == 108) {
                if (f69l < f0A) {
                    f69l += (byte) ((C0003c.f339f[2] >> 16) & 255);
                } else {
                    f65j--;
                }
                if (f74n && i == f65j) {
                    f65j--;
                }
            } else if (f3D < 0 || f3D >= f65j) {
                f65j--;
            } else {
                f65j = f3D;
            }
            int d = m55d((int) f21a);
            int c = m49c((int) f21a);
            if (f65j < d) {
                f65j = c;
            }
            short s2 = sArr[(f65j * 4) + 2];
            if (s2 <= 99 || s2 >= 200) {
                m84o();
            }
        }
    }

    /* renamed from: o */
    public static final void m85o(int i) {
        f50d = m0a(C0003c.f399s[f2C][1]);
        f51d = false;
    }

    /* renamed from: p */
    public static final void m86p() {
        if (!f44c) {
            f9a = System.currentTimeMillis();
        }
        f44c = true;
        for (int i = 0; i < f83u; i++) {
            if (f37b[i] == 0 || f37b[i] == 4) {
                int i2 = f30a[i][0];
                f25a[i] = i2;
                m91s(i2);
                f37b[i] = 3;
            }
        }
    }

    /* renamed from: p */
    public static final void m87p(int i) {
        short[] sArr = f32a[i];
        f50d = C0001a.m102a(f38b);
        f51d = false;
        sArr[4] = 217;
        sArr[5] = 14;
        sArr[6] = 109;
        sArr[7] = 40;
        if ((f8a == 0 && f42c == C0003c.f414w[42]) || ((f8a == 1 && f42c == C0003c.f414w[41]) || ((f8a == 3 && (f42c == ((short) (C0003c.f414w[43] & 65535)) || f42c == ((short) ((C0003c.f414w[43] & -65536) >> 16)) || f42c == C0003c.f414w[44])) || (f8a == 4 && f42c == C0003c.f414w[45])))) {
            sArr[4] = 222;
        } else if (f8a != 2 && f8a != 5) {
            sArr[4] = 217;
        } else if (f8a == 2 || f8a == 5) {
            if (f8a == 5 || C0003c.f395r[f38b[4]][3] == 0) {
                sArr[4] = -1;
                sArr[5] = -1;
                sArr[6] = 4;
                sArr[7] = -1;
            } else {
                sArr[4] = 251;
            }
        }
        if (f8a == 5 || f8a == 4 || C0003c.f414w[11] == 0) {
            sArr[12] = -1;
            sArr[13] = -1;
            sArr[14] = 4;
            sArr[15] = -1;
        } else if ((f84v & 1) != 0) {
            if ((C0001a.f124d[C0003c.f269ai][3] & 32) == 0 || (C0001a.f124d[C0003c.f269ai][13] & 2) != 0) {
                sArr[12] = 223;
            } else {
                sArr[12] = 248;
            }
            sArr[13] = 22;
            sArr[14] = 109;
            sArr[15] = 44;
        } else {
            sArr[12] = 226;
            sArr[13] = 13;
            sArr[14] = 109;
            sArr[15] = 44;
        }
        if (f8a == 1 || f8a == 5 || (f84v & 1) != 0 || (f8a == 2 && C0003c.f395r[f38b[4]][3] == 0)) {
            sArr[16] = -1;
            sArr[17] = -1;
            sArr[18] = 4;
            sArr[19] = -1;
            return;
        }
        sArr[16] = 246;
        sArr[17] = 15;
        sArr[18] = 109;
        sArr[19] = 47;
    }

    /* renamed from: q */
    public static final void m88q() {
        if (m49c(0)) {
            f56e = m0a(0);
            if (f56e.length != 7) {
                f56e = new byte[7];
                return;
            }
            return;
        }
        f56e[0] = 0;
        f56e[1] = 0;
        f56e[2] = 0;
        f56e[5] = 0;
        f56e[6] = 0;
        f56e[3] = 0;
        f56e[4] = 0;
        m48c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x05c2, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x05c7, code lost:
        if (r1 >= p000.C0003c.f399s.length) goto L_0x05d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x05d1, code lost:
        if (p000.C0003c.f399s[r1][3] != f65j) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x05d3, code lost:
        f2C = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x05d5, code lost:
        f19a.push(new java.lang.Integer(f21a));
        f19a.push(new java.lang.Integer(f65j));
        m64g(26);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:?, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m89q(int r13) {
        /*
            r2 = -1
            r8 = 65535(0xffff, float:9.1834E-41)
            r6 = 3
            r5 = 1
            r1 = 0
            switch(r13) {
                case 1: goto L_0x06c2;
                case 2: goto L_0x06ea;
                case 3: goto L_0x06f7;
                case 4: goto L_0x0746;
                case 5: goto L_0x07f6;
                case 6: goto L_0x000b;
                case 7: goto L_0x0791;
                case 8: goto L_0x07ee;
                case 9: goto L_0x05f4;
                case 10: goto L_0x0608;
                case 11: goto L_0x00c9;
                case 12: goto L_0x0135;
                case 13: goto L_0x0172;
                case 14: goto L_0x0596;
                case 15: goto L_0x05b5;
                case 19: goto L_0x03db;
                case 21: goto L_0x00fa;
                case 22: goto L_0x0265;
                case 23: goto L_0x03d1;
                case 24: goto L_0x03d6;
                case 25: goto L_0x0260;
                case 26: goto L_0x023f;
                case 27: goto L_0x00db;
                case 28: goto L_0x05c4;
                case 29: goto L_0x01dc;
                case 30: goto L_0x0645;
                case 31: goto L_0x0616;
                case 32: goto L_0x078b;
                case 33: goto L_0x0707;
                case 34: goto L_0x074a;
                case 35: goto L_0x000a;
                case 36: goto L_0x0773;
                case 37: goto L_0x077f;
                case 38: goto L_0x0767;
                case 39: goto L_0x0684;
                case 40: goto L_0x00d4;
                case 100: goto L_0x0086;
                case 101: goto L_0x00b8;
                case 102: goto L_0x0066;
                case 103: goto L_0x000f;
                case 104: goto L_0x0036;
                case 105: goto L_0x005d;
                default: goto L_0x000a;
            }
        L_0x000a:
            return
        L_0x000b:
            m82n()
            goto L_0x000a
        L_0x000f:
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r2 = 9
            r0 = r0[r2]
            int[][] r2 = p000.C0003c.f367k
            int r3 = p000.C0003c.f204M
            r2 = r2[r3]
            int r3 = r0 + 1
            r2[r0] = r5
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r2 = 9
            r0[r2] = r3
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r0[r1] = r5
            goto L_0x000a
        L_0x0036:
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r2 = 9
            r0 = r0[r2]
            int[][] r2 = p000.C0003c.f367k
            int r3 = p000.C0003c.f204M
            r2 = r2[r3]
            int r3 = r0 + 1
            r2[r0] = r1
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r2 = 9
            r0[r2] = r3
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r0[r1] = r5
            goto L_0x000a
        L_0x005d:
            int[][] r0 = p000.C0003c.f367k
            int r2 = p000.C0003c.f204M
            r0 = r0[r2]
            r0[r1] = r5
            goto L_0x000a
        L_0x0066:
            r0 = 10
            r2 = r1
            r3 = r1
            r4 = r1
            p000.C0003c.m285a(r0, r1, r2, r3, r4, r5)
            b r0 = p000.C0003c.f233a
            c r1 = f11a
            int r2 = p000.C0003c.f204M
            int r3 = p000.C0003c.f214R
            int r4 = p000.C0003c.f267ag
            r0.mo7a(r1, r2, r3, r4, r5)
            java.lang.Thread r0 = new java.lang.Thread
            b r1 = p000.C0003c.f233a
            r0.<init>(r1)
            r0.start()
            goto L_0x000a
        L_0x0086:
            int[] r0 = p000.C0003c.f426z
            r0[r1] = r5
            int[] r0 = p000.C0003c.f426z
            int r3 = p000.C0003c.f342g
            p000.C0003c.m406g(r0, r3)
            r0 = 0
            p000.C0003c.f426z = r0
            p000.C0003c.f342g = r2
            r0 = 10
            r2 = r1
            r3 = r1
            r4 = r1
            p000.C0003c.m285a(r0, r1, r2, r3, r4, r5)
            b r2 = p000.C0003c.f233a
            c r3 = f11a
            int r4 = p000.C0003c.f204M
            int r5 = p000.C0003c.f214R
            int r6 = p000.C0003c.f267ag
            r7 = r1
            r2.mo7a(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            b r1 = p000.C0003c.f233a
            r0.<init>(r1)
            r0.start()
            goto L_0x000a
        L_0x00b8:
            int[] r0 = p000.C0003c.f426z
            if (r0 == 0) goto L_0x00c5
            int[] r0 = p000.C0003c.f426z
            r0[r1] = r1
            r0 = 0
            p000.C0003c.f426z = r0
            p000.C0003c.f342g = r2
        L_0x00c5:
            p000.C0003c.f401t = r1
            goto L_0x000a
        L_0x00c9:
            f70l = r1
            f84v = r1
            f65j = r2
            p000.C0003c.m193A()
            goto L_0x000a
        L_0x00d4:
            r0 = 15
            m64g(r0)
            goto L_0x000a
        L_0x00db:
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            short r2 = f21a
            r1.<init>(r2)
            r0.push(r1)
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            int r2 = f65j
            r1.<init>(r2)
            r0.push(r1)
            r0 = 24
            m64g(r0)
            goto L_0x000a
        L_0x00fa:
            short[][] r0 = f32a
            short r1 = f21a
            r0 = r0[r1]
            int r1 = f65j
            int r1 = r1 * 4
            int r1 = r1 + 3
            short r0 = r0[r1]
            r0 = r0 & 32767(0x7fff, float:4.5916E-41)
            int[][] r1 = p000.C0001a.f124d
            r0 = r1[r0]
            f38b = r0
            int r0 = f65j
            int r0 = r0 + -1
            f1B = r0
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            short r2 = f21a
            r1.<init>(r2)
            r0.push(r1)
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            int r2 = f65j
            r1.<init>(r2)
            r0.push(r1)
            r0 = 22
            m64g(r0)
            goto L_0x000a
        L_0x0135:
            short[][] r0 = f32a
            short r1 = f21a
            r0 = r0[r1]
            int r1 = f65j
            int r1 = r1 * 4
            int r1 = r1 + 3
            short r0 = r0[r1]
            r0 = r0 & 32767(0x7fff, float:4.5916E-41)
            f42c = r0
            int[][][] r0 = p000.C0003c.f253a
            int r1 = f8a
            r0 = r0[r1]
            int r1 = f42c
            r0 = r0[r1]
            f38b = r0
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            short r2 = f21a
            r1.<init>(r2)
            r0.push(r1)
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            int r2 = f65j
            r1.<init>(r2)
            r0.push(r1)
            r0 = 20
            m64g(r0)
            goto L_0x000a
        L_0x0172:
            int[][][] r0 = p000.C0003c.f253a
            int r2 = f8a
            r0 = r0[r2]
            int r2 = f42c
            r0 = r0[r2]
            r2 = r0[r6]
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x01bd
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r3 = 224(0xe0, float:3.14E-43)
            java.lang.String r3 = m0a(r3)
            java.lang.StringBuffer r2 = r2.append(r3)
            java.lang.String r3 = "\n"
            java.lang.StringBuffer r2 = r2.append(r3)
            r3 = 242(0xf2, float:3.39E-43)
            java.lang.String r3 = m0a(r3)
            java.lang.StringBuffer r2 = r2.append(r3)
            java.lang.String r3 = ": @x@@"
            java.lang.StringBuffer r2 = r2.append(r3)
            java.lang.String r6 = r2.toString()
            java.lang.String r7 = p000.C0001a.m102a(r0)
            r8 = 26
            r9 = 101(0x65, float:1.42E-43)
            r2 = 6
            r11 = r0[r2]
            r10 = r5
            r12 = r1
            p000.C0003c.m262a(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x000a
        L_0x01bd:
            int r0 = f8a
            int r2 = f42c
            p000.C0003c.m225a(r0, r2, r5, r1, r5)
            short r0 = f21a
            r1 = 19
            if (r0 == r1) goto L_0x01d5
            short r0 = f21a
            r1 = 21
            if (r0 == r1) goto L_0x01d5
            m82n()
            goto L_0x000a
        L_0x01d5:
            short r0 = f21a
            m26a(r0)
            goto L_0x000a
        L_0x01dc:
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r1]
            r0 = r0 & r8
            short r0 = (short) r0
            int[] r2 = p000.C0003c.f414w
            r2 = r2[r1]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r2 = (short) r2
            int[][] r3 = p000.C0001a.f124d
            int r4 = p000.C0003c.f269ai
            r3 = r3[r4]
            r3 = r3[r1]
            r3 = r3 & r8
            short r3 = (short) r3
            int[][] r4 = p000.C0001a.f124d
            int r6 = p000.C0003c.f269ai
            r4 = r4[r6]
            r4 = r4[r1]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r6
            int r4 = r4 >> 16
            short r4 = (short) r4
            int[] r6 = p000.C0003c.f414w
            short r3 = (short) r3
            r3 = r3 & r8
            short r4 = (short) r4
            int r4 = r4 << 16
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r7
            r3 = r3 | r4
            r6[r1] = r3
            int r3 = f8a
            int r4 = f42c
            int r6 = p000.C0003c.f208O
            p000.C0003c.m225a(r3, r4, r6, r1, r5)
            int[] r3 = p000.C0003c.f414w
            short r0 = (short) r0
            r0 = r0 & r8
            short r2 = (short) r2
            int r2 = r2 << 16
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r4
            r0 = r0 | r2
            r3[r1] = r0
            short r0 = f21a
            r1 = 19
            if (r0 == r1) goto L_0x0238
            short r0 = f21a
            r1 = 21
            if (r0 == r1) goto L_0x0238
            m82n()
            goto L_0x000a
        L_0x0238:
            short r0 = f21a
            m26a(r0)
            goto L_0x000a
        L_0x023f:
            int r0 = f8a
            int r2 = f42c
            int r3 = p000.C0003c.f208O
            p000.C0003c.m225a(r0, r2, r3, r1, r5)
            short r0 = f21a
            r1 = 19
            if (r0 == r1) goto L_0x0259
            short r0 = f21a
            r1 = 21
            if (r0 == r1) goto L_0x0259
            m82n()
            goto L_0x000a
        L_0x0259:
            short r0 = f21a
            m26a(r0)
            goto L_0x000a
        L_0x0260:
            p000.C0003c.m229a(r1)
            goto L_0x000a
        L_0x0265:
            int[][][] r0 = p000.C0003c.f253a
            int r2 = f8a
            r0 = r0[r2]
            int r2 = f42c
            r10 = r0[r2]
            int[][] r0 = p000.C0001a.f124d
            int r2 = p000.C0003c.f269ai
            r0 = r0[r2]
            r0 = r0[r6]
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0325
            int[][] r0 = p000.C0001a.f124d
            int r2 = p000.C0003c.f269ai
            r0 = r0[r2]
            r2 = 13
            r0 = r0[r2]
            r0 = r0 & 2
            if (r0 != 0) goto L_0x0325
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 249(0xf9, float:3.49E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 252(0xfc, float:3.53E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            int r0 = p000.C0001a.m102a(r10)
            int r2 = r0 % 2
            if (r2 == 0) goto L_0x02bc
            int r0 = r0 + 1
        L_0x02bc:
            int r0 = r0 * 40
            int r7 = r0 / 100
            r0 = r10[r6]
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0308
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "@1@@\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 242(0xf2, float:3.39E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ": @x@@"
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = p000.C0001a.m102a(r10)
            r3 = 23
            r4 = 101(0x65, float:1.42E-43)
            r0 = 6
            r6 = r10[r0]
            p000.C0003c.m262a(r1, r2, r3, r4, r5, r6, r7)
        L_0x02f7:
            short r0 = f21a
            r1 = 19
            if (r0 == r1) goto L_0x000a
            short r0 = f21a
            r1 = 21
            if (r0 == r1) goto L_0x000a
            m82n()
            goto L_0x000a
        L_0x0308:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.StringBuffer r0 = r0.append(r7)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = p000.C0001a.m102a(r10)
            r2 = 23
            r3 = 101(0x65, float:1.42E-43)
            p000.C0003c.m261a(r0, r1, r2, r3)
            goto L_0x02f7
        L_0x0325:
            int[][] r0 = p000.C0001a.f124d
            int r2 = p000.C0003c.f269ai
            r0 = r0[r2]
            r0 = r0[r6]
            r0 = r0 & 10176(0x27c0, float:1.426E-41)
            if (r0 <= 0) goto L_0x037a
            r0 = r10[r6]
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0371
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r2 = 224(0xe0, float:3.14E-43)
            java.lang.String r2 = m0a(r2)
            java.lang.StringBuffer r0 = r0.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuffer r0 = r0.append(r2)
            r2 = 242(0xf2, float:3.39E-43)
            java.lang.String r2 = m0a(r2)
            java.lang.StringBuffer r0 = r0.append(r2)
            java.lang.String r2 = ": @x@@"
            java.lang.StringBuffer r0 = r0.append(r2)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = p000.C0001a.m102a(r10)
            r8 = 29
            r9 = 101(0x65, float:1.42E-43)
            r0 = 6
            r11 = r10[r0]
            r10 = r5
            r12 = r1
            p000.C0003c.m262a(r6, r7, r8, r9, r10, r11, r12)
            goto L_0x02f7
        L_0x0371:
            p000.C0003c.f208O = r5
            r0 = 29
            m89q(r0)
            goto L_0x000a
        L_0x037a:
            r0 = r10[r6]
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x03bd
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 224(0xe0, float:3.14E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 242(0xf2, float:3.39E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ": @x@@"
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = p000.C0001a.m102a(r10)
            r3 = 25
            r4 = 101(0x65, float:1.42E-43)
            r0 = 6
            r6 = r10[r0]
            int r7 = p000.C0001a.m102a(r10)
            p000.C0003c.m262a(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x02f7
        L_0x03bd:
            short r0 = f21a
            r2 = 19
            if (r0 == r2) goto L_0x03cc
            short r0 = f21a
            r2 = 21
            if (r0 == r2) goto L_0x03cc
            m82n()
        L_0x03cc:
            p000.C0003c.m229a(r1)
            goto L_0x000a
        L_0x03d1:
            p000.C0003c.m229a(r5)
            goto L_0x000a
        L_0x03d6:
            p000.C0003c.m229a(r5)
            goto L_0x000a
        L_0x03db:
            int[][] r0 = p000.C0001a.f124d
            int r3 = p000.C0003c.f269ai
            r0 = r0[r3]
            r0 = r0[r6]
            r3 = r0 & 32
            if (r3 != 0) goto L_0x03eb
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x04ac
        L_0x03eb:
            int r0 = p000.C0003c.f269ai
            r3 = 0
            int r0 = p000.C0001a.m101a(r0, r3)
            int r3 = f6G
            int r0 = r0 + r3
            int[] r3 = p000.C0003c.f213Q
            r0 = r3[r0]
            r0 = r0 & r8
            short r0 = (short) r0
        L_0x03fb:
            r4 = r1
            r3 = r0
        L_0x03fd:
            if (r3 == r2) goto L_0x0814
            int r7 = f1B
            if (r7 != r4) goto L_0x04df
            int[][] r2 = p000.C0001a.f124d
            r2 = r2[r3]
            r3 = 2
            r2 = r2[r3]
            r2 = r2 & r8
            short r2 = (short) r2
            r7 = r2
        L_0x040d:
            int[][] r2 = p000.C0001a.f124d
            int r3 = p000.C0003c.f269ai
            r2 = r2[r3]
            r2 = r2[r6]
            r2 = r2 & 32
            if (r2 == 0) goto L_0x0528
            int[][] r2 = p000.C0001a.f124d
            int r3 = p000.C0003c.f269ai
            r2 = r2[r3]
            r3 = 13
            r2 = r2[r3]
            r2 = r2 & 2
            if (r2 != 0) goto L_0x0528
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 219(0xdb, float:3.07E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 252(0xfc, float:3.53E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r7]
            r1 = r1[r6]
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x04fe
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.StringBuffer r0 = r1.append(r0)
            java.lang.String r1 = "@1@@\n"
            java.lang.StringBuffer r0 = r0.append(r1)
            r1 = 242(0xf2, float:3.39E-43)
            java.lang.String r1 = m0a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = ": @x@@"
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            int[][] r0 = p000.C0001a.f124d
            r0 = r0[r7]
            java.lang.String r2 = p000.C0001a.m102a(r0)
            r3 = 24
            r4 = 101(0x65, float:1.42E-43)
            int[][] r0 = p000.C0001a.f124d
            r0 = r0[r7]
            r6 = 6
            r6 = r0[r6]
            int[][] r0 = p000.C0001a.f124d
            r0 = r0[r7]
            int r7 = p000.C0001a.m102a(r0)
            p000.C0003c.m262a(r1, r2, r3, r4, r5, r6, r7)
        L_0x049b:
            short r0 = f21a
            r1 = 19
            if (r0 == r1) goto L_0x000a
            short r0 = f21a
            r1 = 21
            if (r0 == r1) goto L_0x000a
            m82n()
            goto L_0x000a
        L_0x04ac:
            int[][] r0 = p000.C0001a.f124d
            int r3 = p000.C0003c.f269ai
            r0 = r0[r3]
            r0 = r0[r1]
            r0 = r0 & r8
            short r0 = (short) r0
            int[][] r3 = p000.C0001a.f124d
            int r4 = p000.C0003c.f269ai
            r3 = r3[r4]
            r3 = r3[r1]
            r4 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r4
            int r3 = r3 >> 16
            short r3 = (short) r3
            int[][] r4 = p000.C0001a.f109a
            r3 = r4[r3]
            r0 = r3[r0]
        L_0x04ca:
            if (r0 < 0) goto L_0x03fb
            int[][] r3 = p000.C0001a.f124d
            r3 = r3[r0]
            r3 = r3[r6]
            r3 = r3 & 10176(0x27c0, float:1.426E-41)
            if (r3 > 0) goto L_0x03fb
            int[][] r3 = p000.C0001a.f124d
            r0 = r3[r0]
            r0 = r0[r5]
            r0 = r0 & r8
            short r0 = (short) r0
            goto L_0x04ca
        L_0x04df:
            int r4 = r4 + 1
            int[][] r7 = p000.C0001a.f124d
            r3 = r7[r3]
            r3 = r3[r5]
            r3 = r3 & r8
            short r3 = (short) r3
        L_0x04e9:
            if (r3 < 0) goto L_0x03fd
            int[][] r7 = p000.C0001a.f124d
            r7 = r7[r3]
            r7 = r7[r6]
            r7 = r7 & 10176(0x27c0, float:1.426E-41)
            if (r7 > 0) goto L_0x03fd
            int[][] r7 = p000.C0001a.f124d
            r3 = r7[r3]
            r3 = r3[r5]
            r3 = r3 & r8
            short r3 = (short) r3
            goto L_0x04e9
        L_0x04fe:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            java.lang.StringBuffer r0 = r1.append(r0)
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r7]
            int r1 = p000.C0001a.m102a(r1)
            java.lang.StringBuffer r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int[][] r1 = p000.C0001a.f124d
            r1 = r1[r7]
            java.lang.String r1 = p000.C0001a.m102a(r1)
            r2 = 24
            r3 = 101(0x65, float:1.42E-43)
            p000.C0003c.m261a(r0, r1, r2, r3)
            goto L_0x049b
        L_0x0528:
            int[][] r2 = p000.C0001a.f124d
            int r3 = p000.C0003c.f269ai
            r2 = r2[r3]
            r2 = r2[r6]
            r2 = r2 & 10176(0x27c0, float:1.426E-41)
            if (r2 <= 0) goto L_0x0584
            p000.C0003c.mo13i(r7)
            r2 = 21
            int r2 = m61f(r2)
            if (r2 != 0) goto L_0x0546
            r0 = 11
            m89q(r0)
            goto L_0x000a
        L_0x0546:
            if (r2 != r5) goto L_0x0560
            int[][] r2 = p000.C0001a.f124d
            r2 = r2[r0]
            r3 = r2[r6]
            r4 = -524289(0xfffffffffff7ffff, float:NaN)
            r3 = r3 & r4
            r2[r6] = r3
            int[][] r2 = p000.C0001a.f124d
            r0 = r2[r0]
            r2 = r0[r6]
            r3 = -1048577(0xffffffffffefffff, float:NaN)
            r2 = r2 & r3
            r0[r6] = r2
        L_0x0560:
            short r0 = f21a
            r2 = 19
            if (r0 == r2) goto L_0x000a
            short r0 = f21a
            r2 = 21
            if (r0 == r2) goto L_0x000a
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r1]
            r0 = r0 & r8
            short r0 = (short) r0
            int[] r2 = p000.C0003c.f414w
            r1 = r2[r1]
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r2
            int r1 = r1 >> 16
            short r1 = (short) r1
            p000.C0003c.m339c(r0, r1)
            m82n()
            goto L_0x000a
        L_0x0584:
            boolean r0 = p000.C0003c.m229a(r1)
            if (r0 == 0) goto L_0x058f
            m82n()
            goto L_0x000a
        L_0x058f:
            r0 = 11
            m89q(r0)
            goto L_0x000a
        L_0x0596:
            int r0 = f8a
            int r1 = f42c
            p000.C0003c.m367d(r0, r1)
            short r0 = f21a
            r1 = 19
            if (r0 == r1) goto L_0x05ae
            short r0 = f21a
            r1 = 21
            if (r0 == r1) goto L_0x05ae
            m82n()
            goto L_0x000a
        L_0x05ae:
            short r0 = f21a
            m26a(r0)
            goto L_0x000a
        L_0x05b5:
            f70l = r1
            f84v = r1
            f65j = r2
            p000.C0003c.m394f()
            p000.C0003c.f393r = r5
            goto L_0x000a
        L_0x05c2:
            int r1 = r1 + 1
        L_0x05c4:
            int[][] r0 = p000.C0003c.f399s
            int r0 = r0.length
            if (r1 >= r0) goto L_0x05d5
            int[][] r0 = p000.C0003c.f399s
            r0 = r0[r1]
            r0 = r0[r6]
            int r2 = f65j
            if (r0 != r2) goto L_0x05c2
            f2C = r1
        L_0x05d5:
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            short r2 = f21a
            r1.<init>(r2)
            r0.push(r1)
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            int r2 = f65j
            r1.<init>(r2)
            r0.push(r1)
            r0 = 26
            m64g(r0)
            goto L_0x000a
        L_0x05f4:
            boolean r0 = m39b(r1)
            if (r0 == 0) goto L_0x0600
            m3a(r5, r5)
            m48c()
        L_0x0600:
            c r0 = f11a
            r1 = 2
            r0.mo11g(r1)
            goto L_0x000a
        L_0x0608:
            m3a(r1, r5)
            m48c()
            c r0 = f11a
            r1 = 2
            r0.mo11g(r1)
            goto L_0x000a
        L_0x0616:
            r0 = 2
            boolean r0 = p000.C0003c.m458o(r0)
            if (r0 != 0) goto L_0x0623
            boolean r0 = p000.C0003c.m458o(r6)
            if (r0 == 0) goto L_0x0640
        L_0x0623:
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            short r2 = f21a
            r1.<init>(r2)
            r0.push(r1)
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            int r2 = f65j
            r1.<init>(r2)
            r0.push(r1)
            m64g(r5)
            goto L_0x000a
        L_0x0640:
            m89q(r5)
            goto L_0x000a
        L_0x0645:
            f55e = r5
            f70l = r1
            f84v = r1
            f65j = r2
            r0 = 5
            p000.C0003c.f196I = r0
            p000.C0003c.m482z()
            p000.C0003c.m443l()
            r0 = 2
            p000.C0003c.m362d(r0)
            b r2 = p000.C0003c.f233a
            c r3 = f11a
            int[] r0 = p000.C0003c.f414w
            r4 = 11
            r4 = r0[r4]
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r1]
            r0 = r0 & r8
            short r5 = (short) r0
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r1]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r6
            int r0 = r0 >> 16
            short r6 = (short) r0
            r7 = r1
            r2.mo7a(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            b r1 = p000.C0003c.f233a
            r0.<init>(r1)
            r0.start()
            goto L_0x000a
        L_0x0684:
            f55e = r5
            f70l = r1
            f84v = r1
            f65j = r2
            r0 = 5
            p000.C0003c.f196I = r0
            p000.C0003c.m482z()
            p000.C0003c.m443l()
            p000.C0003c.m362d(r6)
            b r2 = p000.C0003c.f233a
            c r3 = f11a
            int[] r0 = p000.C0003c.f414w
            r4 = 11
            r4 = r0[r4]
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r1]
            r0 = r0 & r8
            short r5 = (short) r0
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r1]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r6
            int r0 = r0 >> 16
            short r6 = (short) r0
            r7 = r1
            r2.mo7a(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            b r1 = p000.C0003c.f233a
            r0.<init>(r1)
            r0.start()
            goto L_0x000a
        L_0x06c2:
            f55e = r5
            f70l = r1
            f84v = r1
            f65j = r2
            p000.C0003c.m193A()
            p000.C0003c.m482z()
            p000.C0003c.m443l()
            b r2 = p000.C0003c.f233a
            c r3 = f11a
            r4 = 13
            r5 = 7
            r7 = r1
            r2.mo7a(r3, r4, r5, r6, r7)
            java.lang.Thread r0 = new java.lang.Thread
            b r1 = p000.C0003c.f233a
            r0.<init>(r1)
            r0.start()
            goto L_0x000a
        L_0x06ea:
            c r0 = f11a
            r2 = 4
            r0.mo11g(r2)
            HG r0 = f10a
            r0.destroyApp(r1)
            goto L_0x000a
        L_0x06f7:
            java.util.Stack r0 = f19a
            r0.removeAllElements()
            f70l = r1
            f84v = r1
            f65j = r2
            p000.C0003c.m193A()
            goto L_0x000a
        L_0x0707:
            int[] r0 = p000.C0003c.f414w
            r1 = 12
            r0 = r0[r1]
            r0 = r0 & r8
            short r0 = (short) r0
            if (r0 > 0) goto L_0x0718
            r0 = 34
            m89q(r0)
            goto L_0x000a
        L_0x0718:
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            short r3 = f21a
            r1.<init>(r3)
            r0.push(r1)
            java.util.Stack r0 = f19a
            java.lang.Integer r1 = new java.lang.Integer
            int r3 = f65j
            r1.<init>(r3)
            r0.push(r1)
            int[] r0 = p000.C0003c.f414w
            r1 = 11
            r0 = r0[r1]
            if (r0 != r2) goto L_0x073f
            r0 = 16
            m64g(r0)
            goto L_0x000a
        L_0x073f:
            r0 = 15
            m64g(r0)
            goto L_0x000a
        L_0x0746:
            r0 = 2
            p000.C0003c.m377e(r0)
        L_0x074a:
            f55e = r1
            java.util.Stack r0 = f19a
            r0.removeAllElements()
            p000.C0001a.m188q()
            c r0 = f11a
            r2 = 5
            r0.mo11g(r2)
            m64g(r1)
            m76k()
            m81m(r5)
            f70l = r5
            goto L_0x000a
        L_0x0767:
            r0 = 313(0x139, float:4.39E-43)
            r1 = 238(0xee, float:3.34E-43)
            r2 = 39
            r3 = 6
            p000.C0003c.m317b(r0, r1, r2, r3)
            goto L_0x000a
        L_0x0773:
            r0 = 312(0x138, float:4.37E-43)
            r1 = 238(0xee, float:3.34E-43)
            r2 = 30
            r3 = 6
            p000.C0003c.m317b(r0, r1, r2, r3)
            goto L_0x000a
        L_0x077f:
            r0 = 462(0x1ce, float:6.47E-43)
            r1 = 247(0xf7, float:3.46E-43)
            r2 = 32
            r3 = 6
            p000.C0003c.m317b(r0, r1, r2, r3)
            goto L_0x000a
        L_0x078b:
            r0 = 2
            p000.C0003c.m377e(r0)
            goto L_0x000a
        L_0x0791:
            m48c()
            boolean r0 = m39b(r1)
            if (r0 == 0) goto L_0x07a2
            m76k()
        L_0x079d:
            m82n()
            goto L_0x000a
        L_0x07a2:
            r0 = 2
            boolean r0 = m39b(r0)
            if (r0 == 0) goto L_0x07b3
            int r0 = m39b(r1)
            if (r0 == 0) goto L_0x079d
            m76k()
            goto L_0x079d
        L_0x07b3:
            boolean r0 = f55e
            if (r0 == 0) goto L_0x07db
            int r0 = p000.C0003c.f326e
            if (r0 <= 0) goto L_0x07ca
            r0 = 2
            int r0 = m39b(r0)
            if (r0 == 0) goto L_0x079d
            m76k()
            r0 = 2
            m81m(r0)
            goto L_0x079d
        L_0x07ca:
            int r0 = p000.C0003c.f264ad
            int r0 = m39b(r0)
            if (r0 == 0) goto L_0x079d
            m76k()
            int r0 = p000.C0003c.f264ad
            m81m(r0)
            goto L_0x079d
        L_0x07db:
            int r0 = m39b(r5)
            if (r0 == 0) goto L_0x079d
            int r0 = m39b(r1)
            if (r0 == 0) goto L_0x079d
            m76k()
            m81m(r5)
            goto L_0x079d
        L_0x07ee:
            m88q()
            m82n()
            goto L_0x000a
        L_0x07f6:
            java.lang.String r0 = f34b
            if (r0 == 0) goto L_0x080d
            boolean r0 = m1a()
            if (r0 != r5) goto L_0x0808
            c r0 = f11a
            r1 = 4
            r0.mo11g(r1)
            goto L_0x000a
        L_0x0808:
            m64g(r1)
            goto L_0x000a
        L_0x080d:
            r0 = 13
            m64g(r0)
            goto L_0x000a
        L_0x0814:
            r7 = r2
            goto L_0x040d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m89q(int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m90r(int r10) {
        /*
            r9 = -1
            r8 = 2
            r1 = 0
            r3 = 1
            if (r10 < 0) goto L_0x0111
            int[][] r0 = f40b
            r0 = r0[r10]
            r4 = r0[r1]
            int[][] r0 = f40b
            r0 = r0[r10]
            r5 = r0[r3]
            int[][] r0 = f40b
            r0 = r0[r10]
            r6 = r0[r8]
            int[][] r0 = f30a
            r0 = r0[r10]
            r0 = r0[r3]
            if (r0 == r9) goto L_0x0122
            r2 = r1
        L_0x0021:
            if (r2 == 0) goto L_0x011f
            r0 = r1
        L_0x0024:
            int r7 = f83u
            if (r0 >= r7) goto L_0x011f
            int[][] r7 = f30a
            r7 = r7[r0]
            r7 = r7[r3]
            if (r7 != r5) goto L_0x0100
            int[][] r2 = f30a
            r2 = r2[r10]
            r2[r1] = r4
            int[][] r2 = f30a
            r2 = r2[r10]
            int[][] r7 = f30a
            r7 = r7[r0]
            r7 = r7[r3]
            r2[r3] = r7
            int[][] r2 = f30a
            r2 = r2[r10]
            r2[r8] = r0
            r0 = r1
        L_0x0049:
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = ""
            r2 = 10
            if (r5 >= r2) goto L_0x0053
            java.lang.String r0 = "0"
        L_0x0053:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.lang.String r7 = "/"
            java.lang.StringBuffer r2 = r2.append(r7)
            java.lang.StringBuffer r0 = r2.append(r0)
            java.lang.StringBuffer r0 = r0.append(r5)
            java.lang.String[] r2 = f47c
            r2 = r2[r6]
            java.lang.StringBuffer r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String[] r2 = f28a
            r6 = r2[r6]
            r2 = 0
            HG r7 = f10a     // Catch:{ Exception -> 0x011c }
            java.lang.Class r7 = r7.getClass()     // Catch:{ Exception -> 0x011c }
            java.io.InputStream r0 = r7.getResourceAsStream(r0)     // Catch:{ Exception -> 0x011c }
            int r7 = r0.available()     // Catch:{ Exception -> 0x011c }
            byte[] r7 = new byte[r7]     // Catch:{ Exception -> 0x011c }
            r0.read(r7)     // Catch:{ Exception -> 0x011c }
            r0.close()     // Catch:{ Exception -> 0x011c }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x011c }
            r0.<init>(r7)     // Catch:{ Exception -> 0x011c }
            r2 = r0
        L_0x0093:
            r2.available()     // Catch:{ Exception -> 0x011a }
            java.lang.Object[] r0 = f27a     // Catch:{ Exception -> 0x011a }
            javax.microedition.media.Player r6 = javax.microedition.media.Manager.createPlayer(r2, r6)     // Catch:{ Exception -> 0x011a }
            r0[r10] = r6     // Catch:{ Exception -> 0x011a }
        L_0x009e:
            java.lang.Object[] r0 = f27a
            r0 = r0[r10]
            javax.microedition.media.Player r0 = (javax.microedition.media.Player) r0
            r0.realize()     // Catch:{ Exception -> 0x0112 }
        L_0x00a7:
            r0.prefetch()     // Catch:{ Exception -> 0x0114 }
        L_0x00aa:
            boolean r6 = f66j
            if (r6 != 0) goto L_0x00b3
            HG r6 = f10a     // Catch:{ Exception -> 0x0118 }
            r0.addPlayerListener(r6)     // Catch:{ Exception -> 0x0118 }
        L_0x00b3:
            java.lang.Object[] r6 = f27a
            r6[r10] = r0
            int[][] r0 = f30a
            r0 = r0[r10]
            r0[r1] = r4
            int[][] r0 = f30a
            r0 = r0[r10]
            r0[r8] = r10
            int[][] r0 = f30a
            r0 = r0[r10]
            r0[r3] = r5
            r2.close()     // Catch:{ Exception -> 0x0116 }
        L_0x00cc:
            java.lang.Object[] r0 = f27a
            int[][] r2 = f30a
            r2 = r2[r10]
            r2 = r2[r8]
            r0 = r0[r2]
            if (r0 != 0) goto L_0x0111
            r0 = r1
        L_0x00d9:
            int r2 = f83u
            if (r0 >= r2) goto L_0x0104
            int[][] r2 = f30a
            r2 = r2[r0]
            r2 = r2[r3]
            int[][] r4 = f30a
            r4 = r4[r10]
            r4 = r4[r3]
            if (r2 != r4) goto L_0x00fd
            int[][] r2 = f30a
            r2 = r2[r0]
            r2[r8] = r9
            int[][] r2 = f30a
            r2 = r2[r0]
            r2[r3] = r9
            int[][] r2 = f30a
            r2 = r2[r0]
            r2[r1] = r9
        L_0x00fd:
            int r0 = r0 + 1
            goto L_0x00d9
        L_0x0100:
            int r0 = r0 + 1
            goto L_0x0024
        L_0x0104:
            int r0 = f85w
            int r0 = r0 + 1
            f85w = r0
            int r0 = f85w
            if (r0 > r8) goto L_0x0111
            m90r(r10)
        L_0x0111:
            return
        L_0x0112:
            r6 = move-exception
            goto L_0x00a7
        L_0x0114:
            r6 = move-exception
            goto L_0x00aa
        L_0x0116:
            r0 = move-exception
            goto L_0x00cc
        L_0x0118:
            r6 = move-exception
            goto L_0x00b3
        L_0x011a:
            r0 = move-exception
            goto L_0x009e
        L_0x011c:
            r0 = move-exception
            goto L_0x0093
        L_0x011f:
            r0 = r2
            goto L_0x0049
        L_0x0122:
            r2 = r3
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0000HG.m90r(int):void");
    }

    /* renamed from: s */
    public static final void m91s(int i) {
        boolean z = true;
        if (i >= 0) {
            if (((f40b[m67h(i)][4] >> 2) & 1) != 1) {
                z = false;
            }
            if (z || f66j) {
                C0004d.m489b(i);
            } else {
                m92t(i);
            }
        }
    }

    /* renamed from: t */
    public static final void m92t(int i) {
        if (i >= 0) {
            int h = m67h(i);
            int i2 = f30a[h][2];
            if (i2 >= 0) {
                Player player = (Player) f27a[i2];
                try {
                    if (player.getState() != 0) {
                        player.stop();
                    }
                } catch (Exception e) {
                }
                f37b[h] = 1;
                if (f22a) {
                    try {
                        if (player.getState() != 0) {
                            player.deallocate();
                        }
                    } catch (Exception e2) {
                    }
                }
                if (((f40b[h][4] >> 1) & 1) != 1) {
                    try {
                        if (player.getState() == 300) {
                            player.deallocate();
                        }
                        if (player.getState() == 200 || player.getState() == 100) {
                            player.close();
                        }
                    } catch (Exception e3) {
                    }
                    f27a[h] = null;
                    f30a[h][0] = -1;
                    f30a[h][1] = -1;
                    f30a[h][2] = -1;
                    f37b[h] = -1;
                }
            }
        }
    }

    /* renamed from: u */
    public static final void m93u(int i) {
        boolean z = true;
        if (f44c) {
            return;
        }
        if (f36b) {
            if (f86x >= 0) {
                int h = m67h(f86x);
                int h2 = m67h(i);
                int i2 = f40b[h][3];
                int i3 = f40b[h2][3];
                boolean z2 = f62h ? i3 < i2 : i3 <= i2;
                if (z2) {
                    z = false;
                }
            }
            if (z) {
                f86x = i;
                return;
            }
            return;
        }
        m79l(i);
    }

    public final void commandAction(Command command, Displayable displayable) {
    }

    public final void destroyApp(boolean z) {
        notifyDestroyed();
    }

    public final void pauseApp() {
        if (f11a != null) {
            C0003c.m201I();
        }
    }

    public final void playerUpdate(Player player, String str, Object obj) {
        int i;
        int i2;
        if (!f66j && !f44c) {
            int i3 = 0;
            while (true) {
                if (i3 >= f83u) {
                    i3 = -1;
                    break;
                } else if (player == ((Player) f27a[i3])) {
                    break;
                } else {
                    i3++;
                }
            }
            int i4 = 0;
            while (true) {
                if (i4 < f83u) {
                    if (i3 == f30a[i4][2] && f37b[i4] == 0) {
                        i2 = f30a[i4][0];
                        i = m67h(i2);
                        break;
                    }
                    i4++;
                } else {
                    i = -1;
                    i2 = -1;
                    break;
                }
            }
            if (i < 0) {
                return;
            }
            if (str == "stopped") {
                m91s(i2);
            } else if (str == "endOfMedia") {
                m91s(i2);
                f37b[i] = 2;
                m0a(i);
            }
        }
    }

    public final void startApp() {
    }
}
