package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Array;

/* renamed from: a */
public final class C0001a {

    /* renamed from: A */
    public static int f89A;

    /* renamed from: B */
    public static int f90B = 0;

    /* renamed from: C */
    public static int f91C;

    /* renamed from: D */
    public static int f92D;

    /* renamed from: E */
    public static int f93E = 0;

    /* renamed from: F */
    public static int f94F = -1;

    /* renamed from: G */
    public static int f95G;

    /* renamed from: H */
    public static int f96H;

    /* renamed from: I */
    public static int f97I;

    /* renamed from: J */
    public static int f98J = 0;

    /* renamed from: K */
    public static int f99K = 0;

    /* renamed from: L */
    public static int f100L;

    /* renamed from: M */
    public static int f101M;

    /* renamed from: N */
    public static int f102N = 0;

    /* renamed from: O */
    public static int f103O;

    /* renamed from: a */
    public static int f104a;

    /* renamed from: a */
    public static boolean f105a = true;

    /* renamed from: a */
    public static byte[] f106a = {-1, -1, -1, -1, 0, 0, -1, -1, -1, -1, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 23, 23, 24, 1, 1, 0, 9, 10, 11, 23, 2, 0, 2, 2, 2, 2, 3, 0, 2, 2, 2, 2, 3, 0, 17, 15, 16, 2, 0, 1, 12, 12, 12, 12, 0, 1, 4, 2, 3, 0, 0, 1, 1, 1, 1, 1, 0, 1, 33, 31, 32, 33, 0, 1, 6, 6, 6, 6, 0, 1};

    /* renamed from: a */
    public static int[] f107a = new int[4];

    /* renamed from: a */
    public static byte[][] f108a;

    /* renamed from: a */
    public static int[][] f109a;

    /* renamed from: a */
    public static int[][][] f110a;

    /* renamed from: b */
    public static int f111b = 0;

    /* renamed from: b */
    public static byte[] f112b = {0, 3, 1, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    public static int[] f113b = new int[2];

    /* renamed from: b */
    public static byte[][] f114b;

    /* renamed from: b */
    public static int[][] f115b = null;

    /* renamed from: b */
    public static int[][][] f116b;

    /* renamed from: c */
    public static int f117c = 0;

    /* renamed from: c */
    private static int[] f118c = new int[2];

    /* renamed from: c */
    public static byte[][] f119c = {new byte[]{0, 3, 0, 3, 0, 3, 1, 2, 0, 3, 0, 3, 3, 2, 5, 1, 0, 3, 0, 2, 0, 3, 0, 1, 2, 2, 6, 1, 2, 1, 0, 0}, new byte[]{0, 3, 0, 3, 0, 3, 1, 2, 0, 3, 0, 3, 3, 2, 0, 0, 0, 3, 0, 2, 0, 3, 0, 0, 2, 2, 0, 0, 0, 0, 0, 0}, new byte[]{0, 3, 0, 1, 0, 3, 0, 1, 2, 1, 0, 0, 2, 1, 0, 0, 0, 3, 0, 1, 0, 3, 0, 1, 2, 1, 0, 0, 2, 1, 0, 0}, new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

    /* renamed from: c */
    public static int[][] f120c = {new int[]{0, 0}, new int[]{0, 0}, new int[]{11, 15, 8}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 2}, new int[]{0, 0}, new int[]{10, 9, 13}, new int[]{0, 0}, new int[]{1, 6, 5, 6}, new int[]{0, 0}, new int[]{0, 0}, new int[]{0, 5}};

    /* renamed from: c */
    private static int[][][] f121c = new int[6][][];

    /* renamed from: d */
    public static int f122d;

    /* renamed from: d */
    public static int[] f123d = new int[2];

    /* renamed from: d */
    public static int[][] f124d = null;

    /* renamed from: e */
    public static int f125e = -1;

    /* renamed from: e */
    public static int[] f126e = new int[4];

    /* renamed from: e */
    public static int[][] f127e;

    /* renamed from: f */
    public static int f128f;

    /* renamed from: f */
    private static int[] f129f = new int[4];

    /* renamed from: f */
    public static int[][] f130f;

    /* renamed from: g */
    public static int f131g;

    /* renamed from: g */
    private static int[] f132g = new int[2];

    /* renamed from: g */
    public static int[][] f133g;

    /* renamed from: h */
    public static int f134h;

    /* renamed from: h */
    public static int[] f135h = new int[2];

    /* renamed from: i */
    public static int f136i = 16;

    /* renamed from: i */
    public static int[] f137i;

    /* renamed from: j */
    public static int f138j = 0;

    /* renamed from: j */
    public static int[] f139j;

    /* renamed from: k */
    public static int f140k;

    /* renamed from: k */
    public static int[] f141k = new int[4];

    /* renamed from: l */
    public static int f142l = 0;

    /* renamed from: l */
    private static int[] f143l = new int[4];

    /* renamed from: m */
    public static int f144m;

    /* renamed from: m */
    public static int[] f145m;

    /* renamed from: n */
    public static int f146n = 0;

    /* renamed from: n */
    private static int[] f147n = new int[2];

    /* renamed from: o */
    public static int f148o;

    /* renamed from: o */
    public static int[] f149o = new int[4];

    /* renamed from: p */
    public static int f150p = 16;

    /* renamed from: p */
    public static int[] f151p = new int[4];

    /* renamed from: q */
    public static int f152q;

    /* renamed from: q */
    public static int[] f153q = new int[2];

    /* renamed from: r */
    public static int f154r = -1;

    /* renamed from: r */
    private static int[] f155r = new int[4];

    /* renamed from: s */
    public static int f156s;

    /* renamed from: s */
    public static int[] f157s = new int[4];

    /* renamed from: t */
    public static int f158t;

    /* renamed from: t */
    private static int[] f159t = new int[2];

    /* renamed from: u */
    public static int f160u;

    /* renamed from: u */
    private static int[] f161u = new int[2];

    /* renamed from: v */
    public static int f162v;

    /* renamed from: v */
    private static int[] f163v = new int[4];

    /* renamed from: w */
    public static int f164w;

    /* renamed from: w */
    public static int[] f165w;

    /* renamed from: x */
    public static int f166x;

    /* renamed from: x */
    public static int[] f167x = new int[2];

    /* renamed from: y */
    public static int f168y;

    /* renamed from: z */
    public static int f169z;

    /* renamed from: a */
    public static final int m94a() {
        int a = m101a(C0003c.f269ai, (int[]) null);
        for (int i = 0; i < 4; i++) {
            if (((short) ((C0003c.f213Q[a + i] & -65536) >> 16)) > 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final int m95a(int i) {
        while (true) {
            int i2 = 0;
            while (i2 < i) {
                f165w[f92D + i2] = m96a(C0000HG.m58e(f100L >> 1) + (f100L >> 2), C0000HG.m58e(f97I >> 1) + (f97I >> 2));
                if (f165w[f92D + i2] == -1) {
                    break;
                }
                int[] iArr = f127e[(short) ((f165w[f92D + i2] & -65536) >> 16)];
                short s = (short) (f165w[f92D + i2] & 65535);
                iArr[s] = iArr[s] & -32769;
                i2++;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int[] iArr2 = f127e[(short) ((f165w[f92D + i3] & -65536) >> 16)];
                short s2 = (short) (f165w[f92D + i3] & 65535);
                iArr2[s2] = iArr2[s2] | 32768;
            }
            if (i2 == i) {
                break;
            }
            i--;
        }
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr3 = f127e[(short) ((f165w[f92D + i4] & -65536) >> 16)];
            short s3 = (short) (f165w[f92D + i4] & 65535);
            iArr3[s3] = iArr3[s3] | Integer.MIN_VALUE;
        }
        return i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r2 = r2 + 1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m96a(int r6, int r7) {
        /*
            r3 = 0
            r2 = r3
        L_0x0002:
            r0 = 15
            if (r2 >= r0) goto L_0x0052
            int r0 = r7 - r2
            r1 = r0
        L_0x0009:
            int r0 = r7 + r2
            if (r1 > r0) goto L_0x004e
            int r0 = r6 - r2
        L_0x000f:
            int r4 = r6 + r2
            if (r0 > r4) goto L_0x004a
            if (r0 >= 0) goto L_0x0018
        L_0x0015:
            int r0 = r0 + 1
            goto L_0x000f
        L_0x0018:
            int[][] r4 = f127e
            r4 = r4[r3]
            int r4 = r4.length
            if (r0 >= r4) goto L_0x0015
            if (r1 < 0) goto L_0x0015
            int[][] r4 = f127e
            int r4 = r4.length
            if (r1 >= r4) goto L_0x0015
            int[][] r4 = f127e
            r4 = r4[r1]
            r4 = r4[r0]
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0015
            int[][] r4 = f127e
            r4 = r4[r1]
            r4 = r4[r0]
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 & r5
            if (r4 != 0) goto L_0x0015
            short r0 = (short) r0
            r2 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            short r1 = (short) r1
            int r1 = r1 << 16
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r1 = r1 & r2
            r0 = r0 | r1
        L_0x0049:
            return r0
        L_0x004a:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0009
        L_0x004e:
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0002
        L_0x0052:
            r0 = -1
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m96a(int, int):int");
    }

    /* renamed from: a */
    public static final int m97a(int i, int i2, int i3) {
        int i4 = 1;
        if (!(i == 0 || m146c(i - 1, i2) == i3 || (m146c(i - 1, i2) & -2) == i3)) {
            i4 = 0;
        }
        if (i2 == 0) {
            i4 |= 2;
        } else if (m146c(i, i2 - 1) == i3 || (m146c(i, i2 - 1) & -2) == i3) {
            i4 |= 2;
        }
        if (i == f108a[0].length - 1) {
            i4 |= 4;
        } else if (m146c(i + 1, i2) == i3 || (m146c(i + 1, i2) & -2) == i3) {
            i4 |= 4;
        }
        return i2 == f108a.length + -1 ? i4 | 8 : (m146c(i, i2 + 1) == i3 || (m146c(i, i2 + 1) & -2) == i3) ? i4 | 8 : i4;
    }

    /* renamed from: a */
    public static final int m98a(int i, int i2, int i3, int i4) {
        int i5;
        int i6 = (i - (i4 >> 1)) - 1;
        int i7 = (i2 - (i4 >> 1)) - 1;
        int i8 = (i4 >> 1) + i + 1;
        int i9 = (i4 >> 1) + i2 + 1;
        int i10 = 0;
        while (i6 <= i8) {
            int i11 = i7;
            while (i11 <= i9) {
                if ((i4 & 1) != 0 || i6 == i || i11 == i2) {
                    int i12 = i6 < 0 ? 0 : i6;
                    int i13 = i12 >= f108a[0].length ? f108a[0].length - 1 : i12;
                    int i14 = i11 < 0 ? 0 : i11;
                    if (i14 >= f108a.length) {
                        i14 = f108a.length - 1;
                    }
                    i5 = f108a[i14][i13] == i3 ? i10 + 1 : i10;
                } else {
                    i5 = i10;
                }
                i11++;
                i10 = i5;
            }
            i6++;
        }
        return i10;
    }

    /* renamed from: a */
    public static final int m99a(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        return m100a(i, i2, i3, i4, i5, iArr, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m100a(int r16, int r17, int r18, int r19, int r20, int[] r21, boolean r22) {
        /*
            r2 = 0
            r10 = 0
            r9 = -2
            int r3 = r19 - r17
            if (r3 <= 0) goto L_0x0184
            r0 = r17
            int r3 = r0 % 4096
            int r3 = 4096 - r3
            int r4 = r17 + r3
        L_0x000f:
            r0 = r19
            if (r4 >= r0) goto L_0x0184
            int r3 = r18 - r16
            long r6 = (long) r3
            int r3 = r4 - r17
            long r12 = (long) r3
            long r6 = r6 * r12
            int r3 = r19 - r17
            long r12 = (long) r3
            long r6 = r6 / r12
            int r3 = (int) r6
            int r6 = r16 + r3
            int r3 = r6 >> 12
            int r5 = r4 >> 12
            boolean r3 = p000.C0003c.m396f(r3, r5)
            if (r3 != 0) goto L_0x00ea
            r2 = 1
        L_0x002c:
            int r3 = r4 - r17
            if (r3 >= 0) goto L_0x0180
            r0 = r17
            int r3 = r0 % 4096
            int r3 = r17 - r3
            int r3 = r3 + -1
        L_0x0038:
            if (r3 <= r4) goto L_0x0180
            int r5 = r6 - r16
            long r12 = (long) r5
            int r5 = r3 - r17
            long r14 = (long) r5
            long r12 = r12 * r14
            int r5 = r4 - r17
            long r14 = (long) r5
            long r12 = r12 / r14
            int r5 = (int) r12
            int r5 = r5 + r16
            int r7 = r5 >> 12
            int r8 = r3 >> 12
            boolean r7 = p000.C0003c.m396f(r7, r8)
            if (r7 != 0) goto L_0x00ee
            r2 = 1
        L_0x0053:
            int r4 = r5 - r16
            if (r4 <= 0) goto L_0x017c
            r0 = r16
            int r4 = r0 % 4096
            int r4 = 4096 - r4
            int r6 = r16 + r4
        L_0x005f:
            if (r6 >= r5) goto L_0x017c
            int r4 = r3 - r17
            long r12 = (long) r4
            int r4 = r6 - r16
            long r14 = (long) r4
            long r12 = r12 * r14
            int r4 = r5 - r16
            long r14 = (long) r4
            long r12 = r12 / r14
            int r4 = (int) r12
            int r4 = r4 + r17
            int r7 = r6 >> 12
            int r8 = r4 >> 12
            boolean r7 = p000.C0003c.m396f(r7, r8)
            if (r7 != 0) goto L_0x00f2
            r2 = 1
        L_0x007a:
            int r3 = r6 - r16
            if (r3 >= 0) goto L_0x0177
            r0 = r16
            int r3 = r0 % 4096
            int r3 = r16 - r3
            int r5 = r3 + -1
        L_0x0086:
            if (r5 <= r6) goto L_0x0177
            int r3 = r4 - r17
            long r12 = (long) r3
            int r3 = r5 - r16
            long r14 = (long) r3
            long r12 = r12 * r14
            int r3 = r6 - r16
            long r14 = (long) r3
            long r12 = r12 / r14
            int r3 = (int) r12
            int r3 = r3 + r17
            int r7 = r5 >> 12
            int r8 = r3 >> 12
            boolean r7 = p000.C0003c.m396f(r7, r8)
            if (r7 != 0) goto L_0x00f6
            r2 = 1
            r11 = r2
        L_0x00a2:
            r0 = r16
            if (r0 >= r5) goto L_0x00f9
            int[] r2 = f129f
            r4 = 0
            r2[r4] = r16
            int[] r2 = f129f
            r4 = 2
            r2[r4] = r5
        L_0x00b0:
            r0 = r17
            if (r0 >= r3) goto L_0x0104
            int[] r2 = f129f
            r4 = 1
            r2[r4] = r17
            int[] r2 = f129f
            r4 = 3
            r2[r4] = r3
        L_0x00be:
            int[] r2 = f129f
            r0 = r20
            int r8 = m103a(r2, r0)
            r2 = 0
            r21[r2] = r5
            r2 = 1
            r21[r2] = r3
        L_0x00cc:
            r2 = -1
            if (r8 == r2) goto L_0x016a
            int[][] r2 = f124d
            r2 = r2[r8]
            r3 = 3
            r2 = r2[r3]
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x010f
            int[][] r2 = f124d
            r2 = r2[r8]
            r3 = 1
            r2 = r2[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r8 = (short) r2
            goto L_0x00cc
        L_0x00ea:
            int r4 = r4 + 4096
            goto L_0x000f
        L_0x00ee:
            int r3 = r3 + -4096
            goto L_0x0038
        L_0x00f2:
            int r6 = r6 + 4096
            goto L_0x005f
        L_0x00f6:
            int r5 = r5 + -4096
            goto L_0x0086
        L_0x00f9:
            int[] r2 = f129f
            r4 = 0
            r2[r4] = r5
            int[] r2 = f129f
            r4 = 2
            r2[r4] = r16
            goto L_0x00b0
        L_0x0104:
            int[] r2 = f129f
            r4 = 1
            r2[r4] = r3
            int[] r2 = f129f
            r4 = 3
            r2[r4] = r17
            goto L_0x00be
        L_0x010f:
            if (r22 == 0) goto L_0x013a
            int[][] r2 = f124d
            r2 = r2[r8]
            r3 = 3
            r2 = r2[r3]
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x013a
            int[][] r2 = p000.C0003c.f415w
            int[][] r3 = f124d
            r3 = r3[r8]
            r4 = 4
            r3 = r3[r4]
            r2 = r2[r3]
            r3 = 5
            r2 = r2[r3]
            if (r2 == 0) goto L_0x013a
            int[][] r2 = f124d
            r2 = r2[r8]
            r3 = 1
            r2 = r2[r3]
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r2 = r2 & r3
            int r2 = r2 >> 16
            short r8 = (short) r2
            goto L_0x00cc
        L_0x013a:
            int[][] r2 = f124d
            r2 = r2[r8]
            int[] r3 = f129f
            m161d(r2, r3)
            r2 = 0
            r4 = r21[r2]
            r2 = 1
            r5 = r21[r2]
            int[] r6 = f129f
            r2 = r16
            r3 = r17
            r7 = r21
            boolean r2 = m124a(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0174
            r3 = 1
            r2 = r8
        L_0x0159:
            int[][] r4 = f124d
            r4 = r4[r8]
            r5 = 1
            r4 = r4[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r5
            int r4 = r4 >> 16
            short r8 = (short) r4
            r9 = r2
            r10 = r3
            goto L_0x00cc
        L_0x016a:
            if (r11 != 0) goto L_0x0170
            if (r10 != 0) goto L_0x0170
            r9 = -2
        L_0x016f:
            return r9
        L_0x0170:
            if (r11 == 0) goto L_0x016f
            r9 = -1
            goto L_0x016f
        L_0x0174:
            r2 = r9
            r3 = r10
            goto L_0x0159
        L_0x0177:
            r11 = r2
            r3 = r4
            r5 = r6
            goto L_0x00a2
        L_0x017c:
            r4 = r3
            r6 = r5
            goto L_0x007a
        L_0x0180:
            r3 = r4
            r5 = r6
            goto L_0x0053
        L_0x0184:
            r4 = r19
            r6 = r18
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m100a(int, int, int, int, int, int[], boolean):int");
    }

    /* renamed from: a */
    public static final int m101a(int i, int[] iArr) {
        short s = (short) ((f124d[i][2] & -65536) >> 16);
        if ((f124d[i][3] & 4096) != 0) {
            return (short) (C0003c.f419x[s][9] & 65535);
        }
        if ((f124d[i][3] & 32) == 0) {
            return -1;
        }
        short s2 = (short) (C0003c.f391q[s][17] & 65535);
        return iArr != null ? (iArr[3] & 128) != 0 ? s2 + 1 : (iArr[3] & 256) != 0 ? s2 + 2 : (iArr[3] & 8192) != 0 ? s2 + 3 : s2 : s2;
    }

    /* renamed from: a */
    public static final int m102a(int[] iArr) {
        int i = C0003c.m230a(iArr)[4];
        if ((iArr[3] & 131072) == 0) {
            return i;
        }
        int i2 = 0;
        if (iArr[6] > 0) {
            i2 = ((short) (iArr[6] & 65535)) + 0;
        }
        if (iArr[7] > 0) {
            i2 += (short) (iArr[7] & 65535);
        }
        return ((i2 >> 2) * ((i * 150) / 100)) + i;
    }

    /* renamed from: a */
    public static final int m103a(int[] iArr, int i) {
        int i2 = 0;
        if (i == 0) {
            return -1;
        }
        int i3 = (iArr[0] >> 12) - 6;
        int i4 = (iArr[1] >> 12) - 6;
        int i5 = (iArr[2] >> 12) + 6;
        int i6 = (iArr[3] >> 12) + 6;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 >= 0) {
            i2 = i4;
        }
        int i7 = i5 > f154r ? f154r : i5;
        int i8 = i6 > f94F ? f94F : i6;
        int i9 = -1;
        for (int i10 = i2; i10 < i8; i10++) {
            int i11 = i3;
            while (i11 < i7) {
                int i12 = f109a[i10][i11];
                int i13 = i9;
                while (i12 != -1) {
                    m161d(f124d[i12], f107a);
                    if ((f124d[i12][3] & i) == 0) {
                        i12 = (short) (f124d[i12][1] & 65535);
                    } else if (!m120a(iArr, f107a)) {
                        i12 = (short) (f124d[i12][1] & 65535);
                    } else {
                        int[] iArr2 = f124d[i12];
                        iArr2[1] = iArr2[1] & 65535;
                        int[] iArr3 = f124d[i12];
                        iArr3[1] = ((((short) i13) << 16) & -65536) | iArr3[1];
                        i13 = i12;
                        i12 = (short) (f124d[i12][1] & 65535);
                    }
                }
                i11++;
                i9 = i13;
            }
        }
        return i9;
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x024b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m104a(int[] r17, int r18, int r19, int r20) {
        /*
            r3 = 3
            r3 = r17[r3]
            r3 = r3 & 8
            if (r3 != 0) goto L_0x0009
            r3 = -2
        L_0x0008:
            return r3
        L_0x0009:
            r3 = 4
            r12 = r17[r3]
            r3 = 5
            r11 = r17[r3]
            r0 = r18
            if (r12 != r0) goto L_0x0019
            r0 = r19
            if (r11 != r0) goto L_0x0019
            r3 = -2
            goto L_0x0008
        L_0x0019:
            r8 = 0
            r7 = -1
            m135b(r17)
            r10 = 0
            r9 = 0
            r0 = r18
            if (r12 == r0) goto L_0x0044
            r0 = r19
            if (r11 == r0) goto L_0x0044
            r5 = 1
            r3 = 1
            r4 = r3
        L_0x002b:
            if (r18 < 0) goto L_0x003f
            if (r19 < 0) goto L_0x003f
            int r3 = f154r
            int r3 = r3 * 4096
            r0 = r18
            if (r0 >= r3) goto L_0x003f
            int r3 = f94F
            int r3 = r3 * 4096
            r0 = r19
            if (r0 < r3) goto L_0x0206
        L_0x003f:
            m102a(r17)
            r3 = -1
            goto L_0x0008
        L_0x0044:
            r6 = 1
            r5 = 1
            r4 = 0
            int[] r3 = f157s
            r0 = r17
            m161d(r0, r3)
            int[] r3 = f157s
            r0 = r20
            int r3 = m103a(r3, r0)
        L_0x0056:
            r13 = -1
            if (r3 == r13) goto L_0x0074
            int[][] r13 = f124d
            r13 = r13[r3]
            r14 = 3
            r15 = r13[r14]
            r16 = 2097152(0x200000, float:2.938736E-39)
            r15 = r15 | r16
            r13[r14] = r15
            int[][] r13 = f124d
            r3 = r13[r3]
            r13 = 1
            r3 = r3[r13]
            r13 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r13
            int r3 = r3 >> 16
            short r3 = (short) r3
            goto L_0x0056
        L_0x0074:
            int[] r3 = f167x
            r13 = 0
            int[] r14 = f157s
            r15 = 0
            r14 = r14[r15]
            int[] r15 = f157s
            r16 = 2
            r15 = r15[r16]
            int r14 = r14 + r15
            int r14 = r14 >> 1
            r3[r13] = r14
            int[] r3 = f167x
            r13 = 1
            int[] r14 = f157s
            r15 = 1
            r14 = r14[r15]
            int[] r15 = f157s
            r16 = 3
            r15 = r15[r16]
            int r14 = r14 + r15
            int r14 = r14 >> 1
            r3[r13] = r14
            r0 = r18
            if (r0 == r12) goto L_0x0108
            r0 = r18
            if (r0 >= r12) goto L_0x00f5
            int[] r3 = f157s
            r10 = 0
            r13 = r3[r10]
            int r14 = r18 - r12
            int r13 = r13 + r14
            r3[r10] = r13
            int[] r3 = f157s
            r10 = 1
            r13 = 0
            int r3 = m106a(r3, r10, r13)
        L_0x00b4:
            r10 = 1
        L_0x00b5:
            switch(r3) {
                case 0: goto L_0x0133;
                case 1: goto L_0x0135;
                case 2: goto L_0x0139;
                default: goto L_0x00b8;
            }
        L_0x00b8:
            r3 = 1
            r6 = 0
            r4 = 0
            r5 = r4
        L_0x00bc:
            int[] r4 = f157s
            r0 = r20
            int r14 = m103a(r4, r0)
            r4 = -1
            if (r14 == r4) goto L_0x0269
            r13 = r3
            r4 = r5
        L_0x00c9:
            r3 = -1
            if (r14 == r3) goto L_0x01c4
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 3
            r3 = r3[r5]
            r5 = 2097152(0x200000, float:2.938736E-39)
            r3 = r3 & r5
            if (r3 == 0) goto L_0x013d
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 3
            r15 = r3[r5]
            r16 = -2097153(0xffffffffffdfffff, float:NaN)
            r15 = r15 & r16
            r3[r5] = r15
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 1
            r3 = r3[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r5
            int r3 = r3 >> 16
            short r3 = (short) r3
            r14 = r3
            goto L_0x00c9
        L_0x00f5:
            int[] r3 = f157s
            r10 = 2
            r13 = r3[r10]
            int r14 = r18 - r12
            int r13 = r13 + r14
            r3[r10] = r13
            int[] r3 = f157s
            r10 = 1
            r13 = 1
            int r3 = m106a(r3, r10, r13)
            goto L_0x00b4
        L_0x0108:
            r0 = r19
            if (r0 >= r11) goto L_0x0120
            int[] r3 = f157s
            r9 = 1
            r13 = r3[r9]
            int r14 = r19 - r11
            int r13 = r13 + r14
            r3[r9] = r13
            int[] r3 = f157s
            r9 = 0
            r13 = 0
            int r3 = m106a(r3, r9, r13)
        L_0x011e:
            r9 = 1
            goto L_0x00b5
        L_0x0120:
            int[] r3 = f157s
            r9 = 3
            r13 = r3[r9]
            int r14 = r19 - r11
            int r13 = r13 + r14
            r3[r9] = r13
            int[] r3 = f157s
            r9 = 0
            r13 = 1
            int r3 = m106a(r3, r9, r13)
            goto L_0x011e
        L_0x0133:
            r3 = r4
            goto L_0x00bc
        L_0x0135:
            r3 = 1
            r4 = 0
            r6 = r4
            goto L_0x00bc
        L_0x0139:
            r3 = 1
            r4 = 0
            r5 = r4
            goto L_0x00bc
        L_0x013d:
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 3
            r3 = r3[r5]
            r5 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r5
            if (r3 == 0) goto L_0x015a
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 1
            r3 = r3[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r5
            int r3 = r3 >> 16
            short r3 = (short) r3
            r14 = r3
            goto L_0x00c9
        L_0x015a:
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 3
            r3 = r3[r5]
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L_0x0184
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 8
            r3 = r3[r5]
            r5 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r5
            short r3 = (short) r3
            if (r3 <= 0) goto L_0x0184
            int[][] r3 = f124d
            r3 = r3[r14]
            r5 = 1
            r3 = r3[r5]
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r3 = r3 & r5
            int r3 = r3 >> 16
            short r3 = (short) r3
            r14 = r3
            goto L_0x00c9
        L_0x0184:
            r13 = 1
            int[][] r3 = f124d
            r3 = r3[r14]
            int[] r5 = f123d
            m144b(r3, r5)
            if (r10 == 0) goto L_0x01b2
            int[] r3 = f123d
            r5 = 1
            r3 = r3[r5]
            int[] r5 = f167x
            r15 = 1
            r5 = r5[r15]
            if (r3 <= r5) goto L_0x01af
            r5 = 0
            r3 = r4
        L_0x019e:
            int[][] r4 = f124d
            r4 = r4[r14]
            r6 = 1
            r4 = r4[r6]
            r6 = -65536(0xffffffffffff0000, float:NaN)
            r4 = r4 & r6
            int r4 = r4 >> 16
            short r14 = (short) r4
            r4 = r3
            r6 = r5
            goto L_0x00c9
        L_0x01af:
            r3 = 0
            r5 = r6
            goto L_0x019e
        L_0x01b2:
            int[] r3 = f123d
            r5 = 0
            r3 = r3[r5]
            int[] r5 = f167x
            r15 = 0
            r5 = r5[r15]
            if (r3 <= r5) goto L_0x01c1
            r5 = 0
            r3 = r4
            goto L_0x019e
        L_0x01c1:
            r3 = 0
            r5 = r6
            goto L_0x019e
        L_0x01c4:
            r3 = r13
        L_0x01c5:
            if (r3 == 0) goto L_0x0265
            if (r6 == 0) goto L_0x0261
            if (r10 == 0) goto L_0x01ea
            r5 = 0
            r3 = 1
            int r6 = r18 - r12
            int r6 = java.lang.Math.abs(r6)
            int r19 = r19 + r6
            r18 = r12
        L_0x01d7:
            if (r4 == 0) goto L_0x025e
            if (r5 == 0) goto L_0x01f7
            r5 = 0
            r3 = 1
            int r4 = r18 - r12
            int r4 = java.lang.Math.abs(r4)
            int r19 = r19 - r4
            r4 = r3
            r18 = r12
            goto L_0x002b
        L_0x01ea:
            r5 = 1
            r3 = 0
            int r6 = r19 - r11
            int r6 = java.lang.Math.abs(r6)
            int r18 = r18 + r6
            r19 = r11
            goto L_0x01d7
        L_0x01f7:
            r5 = 1
            r3 = 0
            int r4 = r19 - r11
            int r4 = java.lang.Math.abs(r4)
            int r18 = r18 - r4
            r4 = r3
            r19 = r11
            goto L_0x002b
        L_0x0206:
            if (r5 == 0) goto L_0x025b
            r3 = 4
            r5 = 0
            r0 = r17
            r1 = r18
            r2 = r20
            int r3 = m105a(r0, r1, r3, r2, r5)
            r5 = -1
            if (r3 != r5) goto L_0x0250
            r5 = 1
            r3 = r7
        L_0x0219:
            if (r4 == 0) goto L_0x022c
            r4 = 5
            r6 = 1
            r0 = r17
            r1 = r19
            r2 = r20
            int r4 = m105a(r0, r1, r4, r2, r6)
            r6 = -1
            if (r4 != r6) goto L_0x0254
            r4 = 1
            r5 = r4
        L_0x022c:
            r4 = 0
            r6 = 4
            r6 = r17[r6]
            int r6 = r6 >> 12
            short r6 = (short) r6
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            r7 = 5
            r7 = r17[r7]
            int r7 = r7 >> 12
            short r7 = (short) r7
            int r7 = r7 << 16
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            r6 = r6 | r7
            r17[r4] = r6
            m102a(r17)
            r4 = -1
            if (r3 != r4) goto L_0x0008
            if (r5 == 0) goto L_0x0258
            r3 = -1
            goto L_0x0008
        L_0x0250:
            if (r3 < 0) goto L_0x025b
            r5 = r8
            goto L_0x0219
        L_0x0254:
            if (r4 < 0) goto L_0x022c
            r3 = r4
            goto L_0x022c
        L_0x0258:
            r3 = -2
            goto L_0x0008
        L_0x025b:
            r3 = r7
            r5 = r8
            goto L_0x0219
        L_0x025e:
            r4 = r3
            goto L_0x002b
        L_0x0261:
            r3 = r9
            r5 = r10
            goto L_0x01d7
        L_0x0265:
            r4 = r9
            r5 = r10
            goto L_0x002b
        L_0x0269:
            r4 = r5
            goto L_0x01c5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m104a(int[], int, int, int):int");
    }

    /* renamed from: a */
    public static final int m105a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i2];
        m161d(iArr, f149o);
        f135h[0] = (f151p[0] + f151p[2]) >> 1;
        f135h[1] = (f151p[1] + f151p[3]) >> 1;
        iArr[i2] = i;
        m161d(iArr, f151p);
        if (f151p[0] < 0 || f151p[1] < 0 || f151p[2] >= f154r * 4096 || f151p[3] >= f94F * 4096) {
            iArr[i2] = i5;
            return -1;
        }
        int i6 = f151p[1] >> 12;
        int i7 = f151p[2] >> 12;
        int i8 = f151p[3] >> 12;
        for (int i9 = f151p[0] >> 12; i9 <= i7; i9++) {
            for (int i10 = i6; i10 <= i8; i10++) {
                if (!C0003c.m396f(i9, i10)) {
                    iArr[i2] = i5;
                    return -1;
                }
            }
        }
        for (int a = m103a(f149o, i3); a != -1; a = (short) ((f124d[a][1] & -65536) >> 16)) {
            m144b(f124d[a], f113b);
            if ((i5 < i && f113b[i4] <= f135h[i4]) || (i5 > i && f113b[i4] >= f135h[i4])) {
                int[] iArr2 = f124d[a];
                iArr2[3] = iArr2[3] | 2097152;
            }
        }
        int a2 = m103a(f151p, i3);
        while (a2 != -1 && ((f124d[a2][3] & 32768) != 0 || (f124d[a2][3] & 2097152) != 0)) {
            a2 = (short) ((f124d[a2][1] & -65536) >> 16);
        }
        if (a2 != -1) {
            iArr[i2] = i5;
        } else {
            a2 = -2;
        }
        for (int a3 = m103a(f149o, i3); a3 != -1; a3 = (short) ((f124d[a3][1] & -65536) >> 16)) {
            int[] iArr3 = f124d[a3];
            iArr3[3] = iArr3[3] & -2097153;
        }
        return a2;
    }

    /* renamed from: a */
    public static final int m106a(int[] iArr, boolean z, boolean z2) {
        int i;
        int i2 = 0;
        int i3 = (iArr[0] + iArr[2]) >> 1;
        int i4 = (iArr[1] + iArr[3]) >> 1;
        int i5 = iArr[0] >> 12;
        int i6 = iArr[1] >> 12;
        int i7 = iArr[2] >> 12;
        int i8 = iArr[3] >> 12;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i6 < 0) {
            i6 = 0;
        }
        if (i7 >= f154r) {
            i7 = f154r - 1;
        }
        if (i8 >= f94F) {
            i8 = f94F - 1;
        }
        if (z) {
            if (!z2) {
                i7 = i5;
            }
            int i9 = i6;
            while (i9 <= i8) {
                if (!C0003c.m396f(i7, i9)) {
                    if (i4 < (i9 * 4096) + 2048) {
                        if (C0003c.m396f(i7, i9 - 1)) {
                            i = i2 | 1;
                            i9++;
                            i2 = i;
                        }
                    } else if (C0003c.m396f(i7, i9 + 1)) {
                        i = i2 | 2;
                        i9++;
                        i2 = i;
                    }
                }
                i = i2;
                i9++;
                i2 = i;
            }
        } else {
            if (z2) {
                i6 = i8;
            }
            while (i5 <= i7) {
                if (!C0003c.m396f(i5, i6)) {
                    if (i3 < (i5 * 4096) + 2048) {
                        if (C0003c.m396f(i5 - 1, i6)) {
                            i2 |= 1;
                        }
                    } else if (C0003c.m396f(i5 + 1, i6)) {
                        i2 |= 2;
                    }
                }
                i5++;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public static final String m107a(int[] iArr) {
        int[] a = C0003c.m230a(iArr);
        if (a == null) {
            return null;
        }
        String a2 = C0000HG.m0a(a[0]);
        if ((iArr[3] & 131072) == 0) {
            return a2;
        }
        if (iArr[7] >= 0) {
            a2 = new StringBuffer().append(C0000HG.m0a(C0003c.f349g[(short) ((iArr[7] & -65536) >> 16)][0])).append(" ").append(a2).toString();
        }
        return iArr[6] >= 0 ? new StringBuffer().append(a2).append(" ").append(C0000HG.m0a(C0003c.f349g[(short) ((iArr[6] & -65536) >> 16)][0])).toString() : a2;
    }

    /* renamed from: a */
    public static final void m108a() {
        f108a = null;
        f114b = null;
        f127e = null;
        f165w = null;
        f110a = null;
        f116b = null;
        f139j = null;
        f137i = null;
        f145m = null;
        f133g = null;
        System.gc();
    }

    /* renamed from: a */
    public static final void m109a(int i) {
        if (C0003c.f414w[11] == -1) {
            f122d = i;
        } else {
            C0003c.f378n[C0003c.f414w[11]] = i;
        }
    }

    /* renamed from: a */
    public static final void m110a(int i, int i2) {
        for (int i3 = 0; i3 < f108a.length; i3++) {
            for (int i4 = 0; i4 < f108a[0].length; i4++) {
                if (f108a[i3][i4] == i2) {
                    f108a[i3][i4] = (byte) i;
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m111a(int i, int i2, int i3) {
        int i4;
        int e = C0000HG.m58e(((f108a.length + f108a[0].length) >> 1) >> 4) + 1;
        if (i3 != 0) {
            if (i3 == 1) {
                int length = f108a[0].length >> 4;
                m153c(true);
                i4 = length;
            } else {
                int length2 = f108a.length >> 4;
                m153c(false);
                i4 = length2;
            }
            m113a(0, 4, 4, 0, 1, 0, 1, 1, 0);
            m113a(0, 4, 2, 0, 1, 0, 1, 2, i4);
        } else {
            if (i2 == 0) {
                m162e(6, C0000HG.m58e((f108a.length * f108a[0].length) >> 7) + 1);
                m113a(0, 6, 6, 0, 1, 0, 1, 2, e);
                m162e(2, C0000HG.m58e((f108a.length * f108a[0].length) >> 7) + 1);
                m113a(0, 2, 2, 0, 1, 0, 1, 2, e);
            }
            if (C0000HG.m58e(6) == 0) {
                if (i == 0 || i == 2) {
                    m117a(true);
                } else {
                    m117a(false);
                }
            }
        }
        switch (i2) {
            case 0:
                m96a(2, 0);
                break;
            case 1:
                m96a(8, 0);
                break;
        }
        m156d(2, 8);
        m156d(2, 4);
    }

    /* renamed from: a */
    public static final void m112a(int i, int i2, int i3, int i4) {
        int i5 = (i3 & 127) | ((i4 & 127) << 7);
        int i6 = (f154r * i2 * 2 * 3) + (i * 3);
        int[] iArr = C0003c.f217S;
        int i7 = i6 + 2;
        iArr[i7] = iArr[i7] & -16384;
        int[] iArr2 = C0003c.f217S;
        int i8 = i6 + 2;
        iArr2[i8] = (i5 & 16383) | iArr2[i8];
    }

    /* renamed from: a */
    public static final void m113a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        for (int i10 = 0; i10 < f108a.length; i10++) {
            for (int i11 = 0; i11 < f108a[0].length; i11++) {
                if (f108a[i10][i11] != i) {
                    f114b[i10][i11] = f108a[i10][i11];
                } else if (m98a(i11, i10, i2, i4) >= i5) {
                    f114b[i10][i11] = (byte) i3;
                }
            }
        }
        byte[][] bArr = f108a;
        f108a = f114b;
        f114b = bArr;
        for (int i12 = 0; i12 < i9; i12++) {
            for (int i13 = 0; i13 < f108a.length; i13++) {
                for (int i14 = 0; i14 < f108a[0].length; i14++) {
                    if (f108a[i13][i14] != i) {
                        f114b[i13][i14] = f108a[i13][i14];
                    } else if (m98a(i14, i13, i3, i6) >= i7 && C0000HG.m58e(i8) == 0) {
                        f114b[i13][i14] = (byte) i3;
                    }
                }
            }
            byte[][] bArr2 = f108a;
            f108a = f114b;
            f114b = bArr2;
        }
    }

    /* renamed from: a */
    public static final void m114a(int i, boolean z, int[] iArr) {
        iArr[4] = i;
        iArr[6] = -1;
        iArr[7] = -1;
        if (!((iArr[3] & 64) == 0 && (iArr[3] & 128) == 0)) {
            iArr[8] = C0003c.m230a(iArr)[10];
        }
        if (z) {
            m147c(iArr);
        }
    }

    /* renamed from: a */
    public static final void m115a(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        f138j = readByte;
        C0003c.f325d = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f146n + readByte, 6});
        C0003c.m234a(C0003c.f325d);
        for (int i = 0; i < readByte; i++) {
            C0003c.f325d[i][4] = dataInputStream.readByte();
            C0003c.f325d[i][0] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            C0003c.f325d[i][5] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            if (C0003c.f414w[11] >= 0 && (C0003c.f201K[C0003c.f414w[11]] & (1 << i)) != 0) {
                int[] iArr = C0003c.f325d[i];
                iArr[3] = iArr[3] | 65536;
            }
        }
    }

    /* renamed from: a */
    public static final void m116a(DataInputStream dataInputStream, int i) throws IOException {
        int[][] iArr;
        int i2;
        byte readByte = dataInputStream.readByte();
        int[][] iArr2 = null;
        int[] iArr3 = null;
        switch (i) {
            case 0:
                C0003c.f359i = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f90B + readByte + 15, 9});
                iArr = C0003c.f359i;
                iArr3 = C0003c.f402t;
                i2 = 6;
                break;
            case 1:
                C0003c.f379n = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f142l + readByte + 15, 9});
                iArr = C0003c.f379n;
                iArr3 = C0003c.f205M;
                i2 = 7;
                break;
            case 2:
                C0003c.f423y = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f99K + readByte + 15, 8});
                iArr = C0003c.f423y;
                iArr3 = C0003c.f199J;
                i2 = 13;
                break;
            default:
                i2 = 0;
                iArr = iArr2;
                break;
        }
        C0003c.m234a(iArr);
        for (int i3 = 0; i3 < readByte; i3++) {
            iArr[i3][4] = dataInputStream.readByte();
            iArr[i3][0] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            iArr[i3][5] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            if (dataInputStream.readByte() == 1) {
                int[] iArr4 = iArr[i3];
                iArr4[3] = iArr4[3] | 131072;
            }
            int[] iArr5 = iArr[i3];
            iArr5[3] = iArr5[3] | (1 << i2);
            m114a(iArr[i3][4], (iArr[i3][3] & 131072) != 0, iArr[i3]);
            if (C0003c.f414w[11] >= 0 && (iArr3[C0003c.f414w[11]] & (1 << i3)) != 0) {
                int[] iArr6 = iArr[i3];
                iArr6[3] = iArr6[3] | 65536;
            }
        }
    }

    /* renamed from: a */
    public static final void m117a(boolean z) {
        int length;
        int length2;
        int i;
        int i2;
        if (z) {
            length = f108a.length;
            length2 = f108a[0].length;
        } else {
            length = f108a[0].length;
            length2 = f108a.length;
        }
        int e = C0000HG.m58e(length >> 1) + (length >> 2);
        if (z) {
            f89A = 1;
            f152q = e;
        } else {
            f169z = e;
            f168y = 1;
        }
        int i3 = 0;
        int i4 = e;
        int i5 = e;
        int i6 = 3;
        while (i3 < length2) {
            if (z) {
                for (int i7 = 0; i7 < i6; i7++) {
                    f108a[(i5 - 1) + i7][i3] = 12;
                }
                f108a[i4 - 1][i3] = 12;
                f108a[((i4 - 1) + i6) - 1][i3] = 12;
            } else {
                for (int i8 = 0; i8 < i6; i8++) {
                    f108a[i3][(i5 - 1) + i8] = 12;
                }
                f108a[i3][i4 - 1] = 12;
                f108a[i3][((i4 - 1) + i6) - 1] = 12;
            }
            if ((i3 & 1) != 0) {
                i = i4;
                i2 = i5;
            } else if ((i3 & 2) == 0) {
                int e2 = 1 - C0000HG.m58e(3);
                int i9 = (i5 + e2 < (length >> 2) || i5 + e2 >= length - (length >> 2)) ? i5 : e2 + i5;
                int e3 = 1 - C0000HG.m58e(3);
                if (i6 + e3 < 3 || i6 + e3 > 4) {
                    i = i5;
                    i2 = i9;
                } else {
                    i6 += e3;
                    i = i5;
                    i2 = i9;
                }
            } else {
                i = i5;
                i2 = i5;
            }
            i3++;
            i4 = i;
            i5 = i2;
        }
    }

    /* renamed from: a */
    public static final void m118a(int[] iArr) {
        int i = iArr[0];
        short s = (short) (i & 65535);
        short s2 = (short) ((i & -65536) >> 16);
        iArr[3] = iArr[3] | 2;
        iArr[1] = iArr[1] & -65536;
        iArr[1] = iArr[1] | (((short) f109a[s2][s]) & 65535);
        f109a[s2][s] = (short) (iArr[2] & 65535);
        C0003c.m330b(iArr, false);
    }

    /* renamed from: a */
    public static final void m119a(int[] iArr, int i, int i2) {
        if ((iArr[3] & 2) != 0) {
            m135b(iArr);
        }
        iArr[0] = (((short) i) & 65535) | ((((short) i2) << 16) & -65536);
        if (i >= 0 && i < f154r && i2 >= 0 && i2 < f94F) {
            m102a(iArr);
        }
    }

    /* renamed from: a */
    public static final void m120a(int[] iArr, int[] iArr2) {
        m155c(iArr, iArr2);
        iArr2[2] = 0;
        if ((iArr[3] & 4096) != 0) {
            iArr2[2] = iArr[6] * 4096;
        }
    }

    /* renamed from: a */
    public static final boolean m121a(int i) {
        DataInputStream dataInputStream;
        boolean z;
        try {
            dataInputStream = new DataInputStream(C0000HG.f10a.getClass().getResourceAsStream("d"));
            try {
                m185o(dataInputStream);
                dataInputStream.readShort();
                short readShort = dataInputStream.readShort();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= readShort) {
                        z = false;
                        break;
                    }
                    short readShort2 = dataInputStream.readShort();
                    if (i2 < 53) {
                        dataInputStream.skip((long) readShort2);
                    } else {
                        f110a[i3] = m130a(dataInputStream, false);
                        m141b(dataInputStream);
                        f116b[i3] = C0003c.f419x;
                        m188q();
                        i3++;
                        C0002b.f170a = ((i3 * 15) / i) + 0;
                        if (i3 == i) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                try {
                    dataInputStream.close();
                } catch (Exception e) {
                }
            } catch (Exception e2) {
                e = e2;
                try {
                    e.printStackTrace();
                    try {
                        dataInputStream.close();
                        z = false;
                    } catch (Exception e3) {
                        z = false;
                    }
                    System.gc();
                    return z;
                } catch (Throwable th) {
                    th = th;
                    try {
                        dataInputStream.close();
                    } catch (Exception e4) {
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            e = e5;
            dataInputStream = null;
            e.printStackTrace();
            dataInputStream.close();
            z = false;
            System.gc();
            return z;
        } catch (Throwable th2) {
            th = th2;
            dataInputStream = null;
            dataInputStream.close();
            throw th;
        }
        System.gc();
        return z;
    }

    /* renamed from: a */
    public static final boolean m122a(int i, int i2) {
        System.gc();
        int i3 = 0;
        for (int i4 = 0; i4 < f120c.length; i4++) {
            for (int i5 : f120c[i4]) {
                i3 += i5;
            }
        }
        if (f110a == null || f116b == null) {
            f110a = new int[i3][][];
            f116b = new int[i3][][];
            if (!m95a(i3)) {
                f110a = null;
                f116b = null;
                return false;
            }
        }
        int i6 = 0;
        for (int i7 = 0; i7 < f120c.length; i7++) {
            for (int i8 = 0; i8 < f120c[i7].length; i8++) {
                if (f120c[i7][i8] != 0) {
                    if (f110a[i6] == null) {
                        return false;
                    }
                    int length = f110a[i6][0].length;
                    int length2 = f110a[i6].length;
                    for (int i9 = 0; i9 < f120c[i7][i8]; i9++) {
                        int i10 = i6 + i9;
                        if (f110a[i10] == null) {
                            return false;
                        }
                        int length3 = f110a[i10][0].length;
                        int length4 = f110a[i10].length;
                        if (length3 != length || length4 != length2) {
                            return false;
                        }
                    }
                    i6 += f120c[i7][i8];
                }
            }
        }
        f108a = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{i2, i});
        f114b = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{i2, i});
        f127e = (int[][]) Array.newInstance(Integer.TYPE, new int[]{i2, i});
        f165w = new int[(i * i2)];
        f166x = i >> 1;
        f148o = i2 >> 1;
        f169z = i >> 1;
        f168y = 0;
        f103O = i - 1;
        f95G = i2 >> 1;
        f128f = i >> 1;
        f96H = i2 - 1;
        f89A = 0;
        f152q = i2 >> 1;
        f144m = 0;
        f140k = 0;
        f131g = 0;
        f160u = 0;
        f158t = 0;
        f130f = (int[][]) Array.newInstance(Integer.TYPE, new int[]{64, 11});
        return true;
    }

    /* renamed from: a */
    public static final boolean m123a(int i, int i2, int i3) {
        try {
            C0003c.m377e(3);
            System.currentTimeMillis();
            if (C0003c.f414w == null) {
                return false;
            }
            C0002b.f170a = 0;
            if (i == 2) {
                i = 0;
            }
            f156s = i;
            short s = (short) (C0003c.f414w[0] & 65535);
            short s2 = (short) ((C0003c.f414w[0] & -65536) >> 16);
            m188q();
            f100L = 32;
            f97I = 32;
            if (i == 2) {
                C0003c.m446l(7);
                f102N = 458759;
            } else {
                C0003c.m446l(0);
                C0003c.m446l(3);
                f102N = 196608;
            }
            f136i = C0003c.f296b[(((short) (f102N & 65535)) * 11) + 0] / C0003c.f296b[(((short) (f102N & 65535)) * 11) + 5];
            f150p = C0003c.f296b[(((short) (f102N & 65535)) * 11) + 1] / C0003c.f296b[(((short) (f102N & 65535)) * 11) + 6];
            if (!m96a(f100L, f97I)) {
                return false;
            }
            C0002b.f170a = 15;
            C0002b.f170a = 15;
            System.currentTimeMillis();
            if (i == 2) {
                C0003c.m446l(7);
                f102N = 458759;
            } else {
                C0003c.m446l(0);
                C0003c.m446l(3);
                f102N = 196608;
            }
            m97a(i3, i, i2);
            System.currentTimeMillis();
            m148c();
            C0002b.f170a = 20;
            C0002b.f170a = 20;
            m174j();
            System.currentTimeMillis();
            m158d(i);
            m176k();
            System.currentTimeMillis();
            m149c(i3);
            System.currentTimeMillis();
            m182n();
            System.currentTimeMillis();
            f154r = f100L;
            f94F = f97I;
            C0003c.f414w[11] = -1;
            f115b = f127e;
            m94a();
            C0003c.f217S = new int[(f94F * 2 * f154r * 2 * 3)];
            C0003c.f298b = new int[C0003c.f391q.length][];
            C0003c.f359i = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f140k + 15, 9});
            C0003c.f379n = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f131g + 15, 9});
            C0003c.f371l = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f160u + 15, 7});
            C0003c.f325d = (int[][]) Array.newInstance(Integer.TYPE, new int[]{0, 0});
            C0003c.f341f = (int[][]) Array.newInstance(Integer.TYPE, new int[]{0, 0});
            C0003c.f423y = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f158t + 15, 8});
            C0003c.m234a(C0003c.f359i);
            C0003c.m234a(C0003c.f379n);
            C0003c.m234a(C0003c.f371l);
            C0003c.m234a(C0003c.f423y);
            m170h();
            System.currentTimeMillis();
            m132b((int) s, (int) s2);
            C0002b.f170a = 25;
            m146c(f162v, f101M);
            System.currentTimeMillis();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m124a(int r10, int r11, int r12, int r13, int[] r14, int[] r15) {
        /*
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r0 = 0
            int r5 = r12 - r10
            if (r5 >= 0) goto L_0x0019
            r6 = 2
            r6 = r14[r6]
            if (r6 > r10) goto L_0x0019
            r6 = 2
            r6 = r14[r6]
            if (r6 < r12) goto L_0x0019
            r1 = 2
            r1 = r14[r1]
            int r3 = r1 - r10
            r1 = 1
        L_0x0019:
            if (r5 <= 0) goto L_0x002b
            r5 = 0
            r5 = r14[r5]
            if (r5 < r10) goto L_0x002b
            r5 = 0
            r5 = r14[r5]
            if (r5 > r12) goto L_0x002b
            r1 = 0
            r1 = r14[r1]
            int r3 = r1 - r10
            r1 = 1
        L_0x002b:
            if (r1 == 0) goto L_0x008f
            int r1 = r13 - r11
            long r6 = (long) r1
            long r8 = (long) r3
            long r6 = r6 * r8
            int r1 = r12 - r10
            long r8 = (long) r1
            long r6 = r6 / r8
            int r1 = (int) r6
            int r1 = r1 + r11
            r5 = 1
            r5 = r14[r5]
            if (r1 < r5) goto L_0x008f
            r5 = 3
            r5 = r14[r5]
            if (r1 > r5) goto L_0x008f
            int r12 = r10 + r3
            r0 = 1
            r3 = r12
        L_0x0046:
            int r5 = r1 - r11
            if (r5 >= 0) goto L_0x005a
            r6 = 3
            r6 = r14[r6]
            if (r6 > r11) goto L_0x005a
            r6 = 3
            r6 = r14[r6]
            if (r6 < r1) goto L_0x005a
            r2 = 3
            r2 = r14[r2]
            int r4 = r2 - r11
            r2 = 1
        L_0x005a:
            if (r5 <= 0) goto L_0x006c
            r5 = 1
            r5 = r14[r5]
            if (r5 < r11) goto L_0x006c
            r5 = 1
            r5 = r14[r5]
            if (r5 > r1) goto L_0x006c
            r2 = 1
            r2 = r14[r2]
            int r4 = r2 - r11
            r2 = 1
        L_0x006c:
            if (r2 == 0) goto L_0x008d
            int r2 = r3 - r10
            long r6 = (long) r2
            long r8 = (long) r4
            long r6 = r6 * r8
            int r2 = r1 - r11
            long r8 = (long) r2
            long r6 = r6 / r8
            int r2 = (int) r6
            int r2 = r2 + r10
            r5 = 0
            r5 = r14[r5]
            if (r2 < r5) goto L_0x008d
            r5 = 2
            r5 = r14[r5]
            if (r2 > r5) goto L_0x008d
            int r1 = r11 + r4
            r0 = 1
        L_0x0086:
            r3 = 0
            r15[r3] = r2
            r2 = 1
            r15[r2] = r1
            return r0
        L_0x008d:
            r2 = r3
            goto L_0x0086
        L_0x008f:
            r1 = r13
            r3 = r12
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m124a(int, int, int, int, int[], int[]):boolean");
    }

    /* renamed from: a */
    public static final boolean m125a(int i, int i2, boolean z, int i3) {
        if (i2 < 0) {
            return false;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < C0003c.f333e.length; i5++) {
            boolean z2 = (C0003c.f333e[i5][3] & 1) != 0 ? false : ((short) (C0003c.f333e[i5][10] & 65535)) == 0 ? C0003c.f249a[C0003c.f391q[i][11]][7] >= ((short) ((C0003c.f333e[i5][10] & -65536) >> 16)) : ((short) (C0003c.f333e[i5][10] & 65535)) == 1 ? C0003c.f249a[C0003c.f391q[i][11]][8] >= ((short) ((C0003c.f333e[i5][10] & -65536) >> 16)) : false;
            if (C0003c.f333e[i5][15] == i2 && z2) {
                i4++;
            }
        }
        if (i4 <= 0) {
            return false;
        }
        int b = C0000HG.m40b(1, i4);
        int i6 = 1;
        for (int i7 = 0; i7 < C0003c.f333e.length; i7++) {
            boolean z3 = (C0003c.f333e[i7][3] & 1) != 0 ? false : ((short) (C0003c.f333e[i7][10] & 65535)) == 0 ? C0003c.f249a[C0003c.f391q[i][11]][7] >= ((short) ((C0003c.f333e[i7][10] & -65536) >> 16)) : ((short) (C0003c.f333e[i7][10] & 65535)) == 1 ? C0003c.f249a[C0003c.f391q[i][11]][8] >= ((short) ((C0003c.f333e[i7][10] & -65536) >> 16)) : false;
            if (C0003c.f333e[i7][15] == i2 && z3) {
                if (i6 == b) {
                    C0003c.f359i[i3][4] = i7;
                    C0003c.f359i[i3][6] = -1;
                    C0003c.f359i[i3][7] = -1;
                    C0003c.f359i[i3][8] = C0003c.f333e[i7][10];
                    if (z) {
                        m147c(C0003c.f359i[i3]);
                    }
                }
                i6++;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m126a(int[] iArr, int[] iArr2) {
        return iArr[0] <= iArr2[2] && iArr[1] <= iArr2[3] && iArr[2] >= iArr2[0] && iArr[3] >= iArr2[1];
    }

    /* renamed from: a */
    public static final boolean m127a(int[] iArr, int[] iArr2, int i) {
        m161d(iArr, f155r);
        m161d(iArr2, f143l);
        int[] iArr3 = f155r;
        iArr3[0] = iArr3[0] - i;
        int[] iArr4 = f155r;
        iArr4[1] = iArr4[1] - i;
        int[] iArr5 = f155r;
        iArr5[2] = iArr5[2] + i;
        int[] iArr6 = f155r;
        iArr6[3] = iArr6[3] + i;
        return m120a(f155r, f143l);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=short, code=int, for r1v4, types: [short, int] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[][] m128a(int r5, java.io.DataInputStream r6) throws java.io.IOException {
        /*
            r3 = 4
            r2 = 3
            r4 = 1
            r0 = 0
            f111b = r0
            if (r5 == r3) goto L_0x000c
            r1 = 15
            if (r5 != r1) goto L_0x000e
        L_0x000c:
            f111b = r4
        L_0x000e:
            r1 = 5
            if (r5 == r1) goto L_0x0015
            r1 = 16
            if (r5 != r1) goto L_0x0017
        L_0x0015:
            f111b = r0
        L_0x0017:
            r1 = 6
            if (r5 == r1) goto L_0x001e
            r1 = 17
            if (r5 != r1) goto L_0x0021
        L_0x001e:
            r1 = 2
            f111b = r1
        L_0x0021:
            r1 = 7
            if (r5 == r1) goto L_0x0028
            r1 = 18
            if (r5 != r1) goto L_0x002a
        L_0x0028:
            f111b = r2
        L_0x002a:
            r1 = 12
            if (r5 == r1) goto L_0x0032
            r1 = 48
            if (r5 != r1) goto L_0x0034
        L_0x0032:
            f111b = r3
        L_0x0034:
            if (r5 == r2) goto L_0x003a
            r1 = 24
            if (r5 != r1) goto L_0x003c
        L_0x003a:
            f111b = r0
        L_0x003c:
            f90B = r0
            f98J = r0
            f142l = r0
            f99K = r0
            f146n = r0
            f93E = r0
            f117c = r0
            r6.readShort()
            short r1 = r6.readShort()
            int[] r2 = p000.C0003c.f378n
            if (r2 != 0) goto L_0x0075
            int[] r2 = new int[r1]
            p000.C0003c.f378n = r2
            int[] r2 = new int[r1]
            p000.C0003c.f209O = r2
            int[] r2 = new int[r1]
            p000.C0003c.f398s = r2
            int[] r2 = new int[r1]
            p000.C0003c.f201K = r2
            int[] r2 = new int[r1]
            p000.C0003c.f402t = r2
            int[] r2 = new int[r1]
            p000.C0003c.f205M = r2
            int[] r2 = new int[r1]
            p000.C0003c.f199J = r2
            int[] r2 = new int[r1]
            p000.C0003c.f386p = r2
        L_0x0075:
            if (r0 >= r1) goto L_0x008c
            short r2 = r6.readShort()
            if (r0 == r5) goto L_0x0084
            long r2 = (long) r2
            r6.skip(r2)
            int r0 = r0 + 1
            goto L_0x0075
        L_0x0084:
            int[][] r0 = m130a(r6, r4)
            m141b(r6)
        L_0x008b:
            return r0
        L_0x008c:
            r0 = 0
            int[][] r0 = (int[][]) r0
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m128a(int, java.io.DataInputStream):int[][]");
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4, types: [int] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6, types: [int] */
    /* JADX WARNING: type inference failed for: r2v7, types: [int] */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9, types: [int] */
    /* JADX WARNING: type inference failed for: r1v10, types: [int] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r2v21 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v3
      assigns: []
      uses: []
      mth insns count: 114
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
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[][] m129a(java.io.DataInputStream r12, int r13, int[][] r14, boolean r15) throws java.io.IOException {
        /*
            r8 = 16
            r7 = 8
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r11 = 65535(0xffff, float:9.1834E-41)
            r4 = 0
            short r5 = r12.readShort()
            short r6 = r12.readShort()
            byte r0 = r12.readByte()
            int[] r1 = p000.C0003c.f414w
            r2 = 11
            r1 = r1[r2]
            if (r1 != 0) goto L_0x003f
            f136i = r7
            f150p = r7
        L_0x0022:
            if (r15 == 0) goto L_0x0032
            if (r13 != 0) goto L_0x0044
            int r1 = f102N
            r1 = r1 & r3
            f102N = r1
            int r1 = f102N
            short r0 = (short) r0
            r0 = r0 & r11
            r0 = r0 | r1
            f102N = r0
        L_0x0032:
            byte r0 = r12.readByte()
            switch(r0) {
                case 0: goto L_0x0053;
                case 1: goto L_0x0088;
                default: goto L_0x0039;
            }
        L_0x0039:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
        L_0x003f:
            f136i = r8
            f150p = r8
            goto L_0x0022
        L_0x0044:
            int r1 = f102N
            r1 = r1 & r11
            f102N = r1
            int r1 = f102N
            short r0 = (short) r0
            int r0 = r0 << 16
            r0 = r0 & r3
            r0 = r0 | r1
            f102N = r0
            goto L_0x0032
        L_0x0053:
            if (r14 != 0) goto L_0x00e5
            int[] r0 = new int[]{r6, r5}
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
        L_0x0061:
            r2 = r4
        L_0x0062:
            if (r2 >= r6) goto L_0x00e2
            r1 = r4
        L_0x0065:
            if (r1 >= r5) goto L_0x0084
            byte r3 = r12.readByte()
            byte r7 = r12.readByte()
            int r7 = r7 << 8
            r3 = r3 | r7
            int r7 = r13 * 16
            int r3 = r3 << r7
            r7 = r0[r2]
            r8 = r7[r1]
            int r9 = r13 * 16
            int r9 = r11 << r9
            r3 = r3 & r9
            r3 = r3 | r8
            r7[r1] = r3
            int r1 = r1 + 1
            goto L_0x0065
        L_0x0084:
            int r1 = r2 + 1
            r2 = r1
            goto L_0x0062
        L_0x0088:
            if (r14 != 0) goto L_0x00e3
            int[] r0 = new int[]{r6, r5}
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
        L_0x0096:
            r2 = r4
            r3 = r4
        L_0x0098:
            if (r2 >= r6) goto L_0x00e2
            byte r1 = r12.readByte()
            if (r1 >= 0) goto L_0x00bc
        L_0x00a0:
            int r1 = r1 + 1
            if (r1 > 0) goto L_0x0098
            r7 = -1
            int r8 = r13 * 16
            int r7 = r7 << r8
            r8 = r0[r2]
            r9 = r8[r3]
            int r10 = r13 * 16
            int r10 = r11 << r10
            r7 = r7 & r10
            r7 = r7 | r9
            r8[r3] = r7
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x00a0
            int r2 = r2 + 1
            r3 = r4
            goto L_0x00a0
        L_0x00bc:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0098
            byte r7 = r12.readByte()
            byte r8 = r12.readByte()
            int r8 = r8 << 8
            r7 = r7 | r8
            int r8 = r13 * 16
            int r7 = r7 << r8
            r8 = r0[r2]
            r9 = r8[r3]
            int r10 = r13 * 16
            int r10 = r11 << r10
            r7 = r7 & r10
            r7 = r7 | r9
            r8[r3] = r7
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x00bc
            int r2 = r2 + 1
            r3 = r4
            goto L_0x00bc
        L_0x00e2:
            return r0
        L_0x00e3:
            r0 = r14
            goto L_0x0096
        L_0x00e5:
            r0 = r14
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m129a(java.io.DataInputStream, int, int[][], boolean):int[][]");
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int[][] m130a(java.io.DataInputStream r4, boolean r5) throws java.io.IOException {
        /*
            short r0 = r4.readShort()
            f154r = r0
            short r0 = r4.readShort()
            f94F = r0
            byte r3 = r4.readByte()
            r0 = 0
            int[][] r0 = (int[][]) r0
            r1 = 0
            r2 = r0
        L_0x0015:
            if (r1 >= r3) goto L_0x001f
            int[][] r2 = m129a(r4, r1, r2, r5)
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0015
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m130a(java.io.DataInputStream, boolean):int[][]");
    }

    /* renamed from: b */
    public static final int m131b() {
        return C0003c.f414w[11] == -1 ? f122d : C0003c.f378n[C0003c.f414w[11]];
    }

    /* renamed from: b */
    public static final int m132b(int i, int i2) {
        int i3 = C0003c.f217S[(f154r * i2 * 2 * 3) + (i * 3) + 2];
        int i4 = i3 & 127;
        return ((((short) ((i3 >> 7) & 127)) << 16) & -65536) | (((short) i4) & 65535);
    }

    /* renamed from: b */
    public static final int m133b(int i, int i2, int i3) {
        int i4 = 1;
        if (i == 0) {
            i4 = 9;
        } else {
            if (!(i2 == 0 || m146c(i - 1, i2 - 1) == i3 || (m146c(i - 1, i2 - 1) & -2) == i3)) {
                i4 = 0;
            }
            if (i2 == f108a.length - 1) {
                i4 |= 8;
            } else if (m146c(i - 1, i2 + 1) == i3 || (m146c(i - 1, i2 + 1) & -2) == i3) {
                i4 |= 8;
            }
        }
        if (i == f108a[0].length - 1) {
            return i4 | 2 | 4;
        }
        if (i2 == 0) {
            i4 |= 2;
        } else if (m146c(i + 1, i2 - 1) == i3 || (m146c(i + 1, i2 - 1) & -2) == i3) {
            i4 |= 2;
        }
        return i2 == f108a.length + -1 ? i4 | 4 : (m146c(i + 1, i2 + 1) == i3 || (m146c(i + 1, i2 + 1) & -2) == i3) ? i4 | 4 : i4;
    }

    /* renamed from: b */
    public static final int m134b(int i, int i2, int i3, int i4) {
        int a = C0003c.m234a(C0003c.f371l);
        C0003c.f371l[a][4] = i3;
        C0003c.f371l[a][6] = i4;
        int[] iArr = C0003c.f391q[i];
        iArr[i2] = iArr[i2] & 65535;
        int[] iArr2 = C0003c.f391q[i];
        iArr2[i2] = iArr2[i2] | ((((short) a) << 16) & -65536);
        int[] iArr3 = C0003c.f391q[i];
        iArr3[i2] = iArr3[i2] & -65536;
        int[] iArr4 = C0003c.f391q[i];
        iArr4[i2] = iArr4[i2] | 2;
        return a;
    }

    /* renamed from: b */
    public static final int m135b(int[] iArr) {
        if ((iArr[3] & 8) == 0) {
            return iArr[0];
        }
        m155c(iArr, f161u);
        if (f161u[0] < 0) {
            int[] iArr2 = f161u;
            iArr2[0] = iArr2[0] - 4096;
        }
        if (f161u[1] < 0) {
            int[] iArr3 = f161u;
            iArr3[1] = iArr3[1] - 4096;
        }
        return (((short) (f161u[0] >> 12)) & 65535) | ((((short) (f161u[1] >> 12)) << 16) & -65536);
    }

    /* renamed from: b */
    public static final int m136b(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = 10;
        if (i <= 10) {
            if (i <= 0) {
                return 0;
            }
            i5 = i;
        }
        int i6 = 0;
        for (int i7 = 0; i7 < C0003c.f349g.length; i7++) {
            if ((C0003c.f349g[i7][4] & (1 << i3)) != 0 && C0003c.f349g[i7][1] == i2) {
                i6++;
            }
        }
        if (i6 <= 0) {
            return 0;
        }
        int b = C0000HG.m40b(1, i6);
        int i8 = 0;
        for (int i9 = 0; i9 < C0003c.f349g.length; i9++) {
            if ((C0003c.f349g[i9][4] & (1 << i3)) != 0 && C0003c.f349g[i9][1] == i2) {
                i8++;
                if (i8 == b) {
                    int b2 = C0000HG.m40b(1, i5) * C0003c.f349g[i9][2];
                    iArr[i4] = ((((short) i9) << 16) & -65536) | (((short) b2) & 65535);
                    return i - b2;
                }
            }
        }
        return 0;
    }

    /* renamed from: b */
    public static final void m137b() {
        if (C0003c.f213Q == null) {
            C0003c.f213Q = new int[f117c];
            f117c = 0;
        }
        for (int i = 0; i < C0003c.f419x.length; i++) {
            byte b = (byte) (C0003c.f419x[i][8] & 255);
            if (b == 4 || b == 8) {
                int[] iArr = C0003c.f419x[i];
                iArr[9] = iArr[9] & -65536;
                int[] iArr2 = C0003c.f419x[i];
                iArr2[9] = iArr2[9] | (((short) f117c) & 65535);
                short s = (short) (C0003c.f419x[i][9] & 65535);
                int[] iArr3 = C0003c.f213Q;
                iArr3[s] = iArr3[s] & -65536;
                int[] iArr4 = C0003c.f213Q;
                iArr4[s] = iArr4[s] | 65535;
                f117c++;
                short s2 = (short) (C0003c.f419x[i][0] & 65535);
                int i2 = f109a[(short) ((C0003c.f419x[i][0] & -65536) >> 16)][s2];
                int i3 = 0;
                while (i2 != -1) {
                    int i4 = (short) (f124d[i2][1] & 65535);
                    if ((f124d[i2][3] & 256) != 0 || (f124d[i2][3] & 512) != 0 || (f124d[i2][3] & 64) != 0 || (f124d[i2][3] & 128) != 0 || (f124d[i2][3] & 1024) != 0 || (f124d[i2][3] & 8192) != 0) {
                        int[] iArr5 = f124d[i2];
                        iArr5[3] = iArr5[3] | 65536;
                        if ((f124d[i2][3] & 2) != 0) {
                            m135b(f124d[i2]);
                        }
                        short s3 = (short) (C0003c.f419x[i][9] & 65535);
                        short s4 = (short) (C0003c.f213Q[s3] & 65535);
                        int[] iArr6 = f124d[i2];
                        iArr6[1] = iArr6[1] & -65536;
                        int[] iArr7 = f124d[i2];
                        iArr7[1] = (((short) s4) & 65535) | iArr7[1];
                        int[] iArr8 = C0003c.f213Q;
                        iArr8[s3] = iArr8[s3] & -65536;
                        int[] iArr9 = C0003c.f213Q;
                        iArr9[s3] = (((short) i2) & 65535) | iArr9[s3];
                        i3++;
                    }
                    i2 = i4;
                }
                int[] iArr10 = C0003c.f213Q;
                iArr10[s] = iArr10[s] & 65535;
                int[] iArr11 = C0003c.f213Q;
                iArr11[s] = ((((short) i3) << 16) & -65536) | iArr11[s];
            }
        }
    }

    /* renamed from: b */
    public static final void m138b(int i) {
        int i2;
        int[] iArr = C0003c.f391q[i];
        int[] iArr2 = C0003c.f249a[iArr[11]];
        if (((short) (iArr[12] & 65535)) > 0) {
            for (int i3 = 0; i3 < 2; i3++) {
                int a = C0003c.m234a(C0003c.f359i);
                if (iArr[i3 + 14] >= 0) {
                    m114a(iArr[i3 + 14], (iArr[13] & (1 << (i3 + 10))) != 0, C0003c.f359i[a]);
                    i2 = a;
                } else if (iArr2[i3 + 23] < 0 || iArr[i3 + 14] == -2) {
                    i2 = -1;
                } else {
                    i2 = !m125a(i, iArr2[i3 + 23], (iArr[13] & (1 << (i3 + 10))) != 0, a) ? -1 : a;
                }
                if (i2 >= 0 && (C0003c.f333e[C0003c.f359i[i2][4]][15] == 2 || C0003c.f333e[C0003c.f359i[i2][4]][15] == 3)) {
                    iArr[28] = 20;
                }
                iArr[i3 + 14] = i2;
            }
            if (iArr2[26] >= 0) {
                int a2 = C0003c.m234a(C0003c.f379n);
                m114a(iArr2[26], (iArr[13] & 4096) != 0, C0003c.f379n[a2]);
                iArr[16] = a2;
            }
        }
        for (int i4 = 0; i4 < 2; i4++) {
            if (iArr[i4 + 17] >= 0) {
                short s = (short) (iArr[i4 + 17] & 65535);
                int i5 = (short) ((iArr[i4 + 17] & -65536) >> 16);
                if (s == 3) {
                    m133b(i, i4 + 17, i5);
                } else if (s == 2) {
                    m134b(i, i4 + 17, i5, 1);
                } else if (s == 5) {
                    int a3 = C0003c.m234a(C0003c.f325d);
                    C0003c.f325d[a3][4] = i5;
                    int i6 = i4 + 17;
                    iArr[i6] = iArr[i6] & 65535;
                    int i7 = i4 + 17;
                    iArr[i7] = ((((short) a3) << 16) & -65536) | iArr[i7];
                }
            } else if (((short) (iArr[12] & 65535)) > 0 && iArr[i4 + 17] != -2) {
                if (iArr2[i4 + 21] >= 0) {
                    m134b(i, i4 + 17, iArr2[i4 + 21], 1);
                } else if (iArr2[i4 + 21] == -2) {
                    boolean z = (iArr2[13] & 1024) != 0;
                    boolean z2 = (iArr2[13] & 512) != 0;
                    if (z2 && z) {
                        int e = C0000HG.m58e(100);
                        if (e >= 70) {
                            m133b(i, i4 + 17, C0000HG.m58e(C0003c.f354h.length - 1));
                        } else if (e >= 40) {
                            m134b(i, i4 + 17, C0000HG.m40b(3, C0003c.f395r.length - 1), 1);
                        } else {
                            iArr[i4 + 17] = -1;
                        }
                    } else if (z2) {
                        m134b(i, i4 + 17, C0000HG.m40b(3, C0003c.f395r.length - 1), 1);
                    } else if (z) {
                        int length = C0003c.f354h.length - 1;
                        while (true) {
                            if (length < 0) {
                                length = 0;
                                break;
                            } else if ((C0003c.f354h[length][3] & 1) == 0) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        m133b(i, i4 + 17, C0000HG.m58e(length));
                    }
                }
            }
        }
        if (C0003c.f391q[i][19] > 0 && ((short) (iArr[12] & 65535)) > 0) {
            C0003c.f391q[i][19] = m134b(i, 19, 0, C0003c.f391q[i][19]);
        }
    }

    /* renamed from: b */
    public static final void m139b(int i, int i2) {
        C0003c.f403t = (int[][]) Array.newInstance(Integer.TYPE, new int[]{4, 7});
        C0003c.f403t[0][0] = 8;
        C0003c.f403t[0][1] = 1;
        C0003c.f403t[0][2] = 0;
        C0003c.f403t[0][3] = f100L - 1;
        C0003c.f403t[0][4] = 0;
        C0003c.f403t[0][5] = 1;
        C0003c.f403t[0][6] = 0;
        C0003c.f403t[1][0] = 8;
        C0003c.f403t[1][1] = 1;
        C0003c.f403t[1][2] = 0;
        C0003c.f403t[1][3] = f100L - 1;
        C0003c.f403t[1][4] = f97I - 2;
        C0003c.f403t[1][5] = f97I - 1;
        C0003c.f403t[1][6] = 0;
        C0003c.f403t[2][0] = 8;
        C0003c.f403t[2][1] = 1;
        C0003c.f403t[2][2] = 0;
        C0003c.f403t[2][3] = 1;
        C0003c.f403t[2][4] = 0;
        C0003c.f403t[2][5] = f97I - 1;
        C0003c.f403t[2][6] = 0;
        C0003c.f403t[3][0] = 8;
        C0003c.f403t[3][1] = 1;
        C0003c.f403t[3][2] = f100L - 2;
        C0003c.f403t[3][3] = f100L - 1;
        C0003c.f403t[3][4] = 0;
        C0003c.f403t[3][5] = f97I - 1;
        C0003c.f403t[3][6] = 0;
        C0003c.f297b = (byte[][]) Array.newInstance(Byte.TYPE, new int[]{1, 5});
        C0003c.f297b[0][0] = 41;
        C0003c.f297b[0][1] = 0;
        C0003c.f297b[0][2] = 0;
        C0003c.f297b[0][3] = (byte) i;
        C0003c.f297b[0][4] = (byte) i2;
    }

    /* renamed from: b */
    public static final void m140b(int i, int i2, int i3) {
        int a = C0003c.m234a(C0003c.f423y);
        C0003c.f423y[a][4] = i3;
        C0003c.f423y[a][6] = -1;
        C0003c.f423y[a][7] = -1;
        int[] iArr = C0003c.f391q[i];
        iArr[i2] = iArr[i2] & 65535;
        int[] iArr2 = C0003c.f391q[i];
        iArr2[i2] = iArr2[i2] | ((((short) a) << 16) & -65536);
        if (C0000HG.m58e(100) <= C0003c.f249a[C0003c.f391q[i][11]][25]) {
            m147c(C0003c.f423y[a]);
        }
    }

    /* renamed from: b */
    public static final void m141b(DataInputStream dataInputStream) throws IOException {
        m167f(dataInputStream);
        m169g(dataInputStream);
        m115a(dataInputStream);
        m116a(dataInputStream, 0);
        m116a(dataInputStream, 1);
        m171h(dataInputStream);
        m116a(dataInputStream, 2);
        m183n(dataInputStream);
        m177k(dataInputStream);
        m175j(dataInputStream);
    }

    /* renamed from: b */
    public static final void m142b(boolean z) {
        if (C0003c.f249a.length == 0) {
            C0003c.f391q = (int[][]) Array.newInstance(Integer.TYPE, new int[]{0, 0});
            return;
        }
        f92D = 0;
        for (int i = 0; i < f104a; i++) {
            f137i[i] = m95a(f137i[i]);
            f92D += f137i[i];
        }
        C0003c.f391q = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f92D, 32});
        f92D = 0;
        for (int i2 = 0; i2 < f104a; i2++) {
            for (int i3 = 0; i3 < f137i[i2]; i3++) {
                int i4 = f133g[i2][C0000HG.m58e(f145m[i2])];
                int i5 = f92D;
                int[] iArr = f165w;
                int i6 = f92D;
                f92D = i6 + 1;
                int i7 = iArr[i6];
                int[] iArr2 = C0003c.f391q[i5];
                iArr2[0] = i7;
                iArr2[1] = -1;
                iArr2[2] = -1;
                iArr2[3] = 0;
                iArr2[4] = (((short) (i7 & 65535)) << 12) + 2048;
                iArr2[5] = (((short) ((i7 & -65536) >> 16)) << 12) + 2048;
                iArr2[6] = 0;
                iArr2[7] = 0;
                iArr2[8] = 0;
                iArr2[9] = 0;
                iArr2[10] = 0;
                iArr2[11] = i4;
                iArr2[12] = ((((short) C0003c.f249a[i4][6]) << 16) & -65536) | (((short) C0003c.f249a[i4][6]) & 65535);
                iArr2[13] = 0;
                iArr2[14] = -1;
                iArr2[15] = -1;
                iArr2[17] = -1;
                iArr2[18] = -1;
                iArr2[20] = -1;
                iArr2[21] = -1;
                iArr2[22] = -1;
                iArr2[24] = -1;
                iArr2[19] = C0003c.m338c(i5);
                f140k += 2;
                f131g += 2;
                f160u += 4;
                f158t += 2;
                f117c++;
            }
        }
    }

    /* renamed from: b */
    public static final void m143b(int[] iArr) {
        int i = iArr[0];
        short s = (short) (i & 65535);
        short s2 = (short) ((i & -65536) >> 16);
        iArr[3] = iArr[3] & -3;
        int i2 = f109a[s2][s];
        int i3 = -1;
        while (i2 != -1 && f124d[i2] != iArr) {
            i3 = i2;
            i2 = (short) (f124d[i2][1] & 65535);
        }
        int i4 = (short) (iArr[1] & 65535);
        if (i3 != -1) {
            int[] iArr2 = f124d[i3];
            iArr2[1] = iArr2[1] & -65536;
            int[] iArr3 = f124d[i3];
            iArr3[1] = iArr3[1] | (((short) i4) & 65535);
        } else {
            f109a[s2][s] = i4;
        }
        iArr[1] = iArr[1] & -65536;
        iArr[1] = iArr[1] | 65535;
        C0003c.m330b(iArr, true);
    }

    /* renamed from: b */
    public static final void m144b(int[] iArr, int[] iArr2) {
        m161d(iArr, f141k);
        iArr2[0] = (f141k[2] + f141k[0]) >> 1;
        iArr2[1] = (f141k[3] + f141k[1]) >> 1;
    }

    /* renamed from: b */
    public static final boolean m145b(int[] iArr, int[] iArr2) {
        m155c(iArr, f147n);
        m155c(iArr2, f132g);
        int a = m100a(f147n[0], f147n[1], f132g[0], f132g[1], 4144, f118c, true);
        return a == -2 || a == ((short) (iArr2[2] & 65535));
    }

    /* renamed from: c */
    public static final int m146c(int i, int i2) {
        byte b = f108a[i2][i];
        return m98a(i, i2, (int) b, 1) == 9 ? b + 1 : b;
    }

    /* renamed from: c */
    public static final int m147c(int[] iArr) {
        if ((iArr[3] & 4096) != 0) {
            m155c(iArr, f159t);
            return f159t[1] + C0003c.m230a(iArr)[4];
        }
        m161d(iArr, f163v);
        return f163v[3];
    }

    /* renamed from: c */
    public static final void m148c() {
        byte b;
        for (int i = 0; i < f108a[0].length; i++) {
            for (int i2 = 0; i2 < f108a.length; i2++) {
                int c = m146c(i, i2);
                int d = m156d(i, i2);
                byte b2 = f106a[(c * 6) + 4];
                if (d != 15 || f106a[(c * 6) + 5] == 0) {
                    b = f119c[b2][(d << 1) + 0];
                } else {
                    b = f112b[m162e(i, i2) ^ 15];
                }
                int i3 = b << 8;
                f127e[i2][i] = (((short) (i3 | f106a[f119c[b2][(d << 1) + 1] + (c * 6)])) & 65535) | -65536;
                if (c == 0 || c == 1) {
                    int[] iArr = f127e[i2];
                    iArr[i] = iArr[i] & -32769;
                    int[] iArr2 = f127e[i2];
                    iArr2[i] = iArr2[i] | Integer.MIN_VALUE;
                } else {
                    int[] iArr3 = f127e[i2];
                    iArr3[i] = iArr3[i] | 32768;
                    int[] iArr4 = f127e[i2];
                    iArr4[i] = iArr4[i] & Integer.MAX_VALUE;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m149c(int r10) {
        /*
            r9 = 32768(0x8000, float:4.5918E-41)
            r4 = 1
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            switch(r10) {
                case 0: goto L_0x0042;
                case 1: goto L_0x004e;
                case 2: goto L_0x005a;
                case 3: goto L_0x000c;
                case 4: goto L_0x0038;
                default: goto L_0x000c;
            }
        L_0x000c:
            int r0 = f89A
            int r0 = r0 + 2
            int r2 = f152q
            int r0 = m96a(r0, r2)
            r5 = r1
        L_0x0017:
            r2 = -1
            if (r0 == r2) goto L_0x0066
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            short r1 = (short) r1
            f162v = r1
            r0 = r0 & r8
            int r0 = r0 >> 16
            short r0 = (short) r0
            f101M = r0
        L_0x0027:
            int[][] r0 = f127e
            int r1 = f101M
            r0 = r0[r1]
            int r1 = f162v
            r2 = r0[r1]
            r2 = r2 | r7
            r0[r1] = r2
            m142b(r5)
            return
        L_0x0038:
            int r0 = f166x
            int r2 = f148o
            int r0 = m96a(r0, r2)
            r5 = r4
            goto L_0x0017
        L_0x0042:
            int r0 = f169z
            int r2 = f168y
            int r2 = r2 + 2
            int r0 = m96a(r0, r2)
            r5 = r1
            goto L_0x0017
        L_0x004e:
            int r0 = f103O
            int r0 = r0 + -2
            int r2 = f95G
            int r0 = m96a(r0, r2)
            r5 = r1
            goto L_0x0017
        L_0x005a:
            int r0 = f128f
            int r2 = f96H
            int r2 = r2 + -2
            int r0 = m96a(r0, r2)
            r5 = r1
            goto L_0x0017
        L_0x0066:
            r0 = r1
            r2 = r1
        L_0x0068:
            int[][] r3 = f127e
            int r3 = r3.length
            if (r0 >= r3) goto L_0x008e
            r3 = r1
        L_0x006e:
            int[][] r6 = f127e
            r6 = r6[r1]
            int r6 = r6.length
            if (r3 >= r6) goto L_0x008c
            int[][] r6 = f127e
            r6 = r6[r0]
            r6 = r6[r3]
            r6 = r6 & r9
            if (r6 == 0) goto L_0x00bc
            int[][] r6 = f127e
            r6 = r6[r0]
            r6 = r6[r3]
            r6 = r6 & r7
            if (r6 != 0) goto L_0x00bc
            f162v = r3
            f101M = r0
            r2 = r4
        L_0x008c:
            if (r2 == 0) goto L_0x00bf
        L_0x008e:
            if (r2 != 0) goto L_0x0027
            r0 = r1
        L_0x0091:
            int[][] r2 = f127e
            int r2 = r2.length
            if (r0 >= r2) goto L_0x00c5
            r2 = r1
        L_0x0097:
            int[][] r3 = f127e
            r3 = r3[r1]
            int r3 = r3.length
            if (r2 >= r3) goto L_0x00c2
            int[][] r3 = f127e
            r3 = r3[r0]
            r3[r2] = r8
            int[][] r3 = f127e
            r3 = r3[r0]
            r4 = r3[r2]
            r4 = r4 | r9
            r3[r2] = r4
            int[][] r3 = f127e
            r3 = r3[r0]
            r4 = r3[r2]
            r6 = 2147483647(0x7fffffff, float:NaN)
            r4 = r4 & r6
            r3[r2] = r4
            int r2 = r2 + 1
            goto L_0x0097
        L_0x00bc:
            int r3 = r3 + 1
            goto L_0x006e
        L_0x00bf:
            int r0 = r0 + 1
            goto L_0x0068
        L_0x00c2:
            int r0 = r0 + 1
            goto L_0x0091
        L_0x00c5:
            int[][] r0 = f127e
            r0 = r0[r1]
            int r0 = r0.length
            int r0 = r0 >> 1
            f162v = r0
            int[][] r0 = f127e
            int r0 = r0.length
            int r0 = r0 >> 1
            f101M = r0
            int[] r0 = new int[]{r1, r1}
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            p000.C0003c.f419x = r0
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m149c(int):void");
    }

    /* renamed from: c */
    public static final void m150c(int i, int i2) {
        C0002b.f170a = 25;
        if (f105a) {
            C0003c.f217S = new int[(f94F * 2 * f154r * 2 * 3)];
            for (int i3 = 0; i3 < C0003c.f217S.length; i3 += 3) {
                int[] iArr = C0003c.f217S;
                iArr[i3] = iArr[i3] & -65536;
                int[] iArr2 = C0003c.f217S;
                iArr2[i3] = iArr2[i3] | 65535;
            }
        }
        C0003c.m214V();
        C0003c.m203K();
        C0003c.m452n();
        C0003c.m212T();
        C0003c.m432j();
        m166f();
        m184o();
        C0002b.f170a = 50;
        C0002b.f170a = 50;
        C0003c.m396f(i, i2);
        C0003c.m380e();
        m178l();
        C0003c.m268a(true, 50, 75);
        C0002b.f170a = 75;
        C0002b.f170a = 75;
        C0002b.f170a = 77;
        C0003c.m448m();
        C0002b.f170a = 79;
        C0003c.m210R();
        C0002b.f170a = 81;
        C0003c.m478v();
        C0002b.f170a = 84;
        C0003c.m464q();
        C0002b.f170a = 86;
        C0003c.m467r();
        C0002b.f170a = 88;
        C0003c.m303ad();
        C0002b.f170a = 90;
        m131b();
        C0002b.f170a = 93;
        m186p();
        C0002b.f170a = 95;
        C0003c.m250a(0, 0, f115b[0].length * 2, f115b.length * 2, true);
        C0002b.f170a = 97;
        C0002b.f170a = 100;
        switch ((short) ((f102N & -65536) >> 16)) {
            case 3:
            case 5:
                C0003c.f264ad = 4;
                break;
            case 4:
            case 6:
                C0003c.f264ad = 5;
                break;
            case 7:
                C0003c.f264ad = 6;
                break;
            default:
                C0003c.f264ad = 3;
                break;
        }
        C0003c.f212Q = -1;
        C0003c.f421y = false;
        System.gc();
    }

    /* renamed from: c */
    public static final void m151c(int i, int i2, int i3) {
        Throwable th;
        DataInputStream dataInputStream;
        if (((short) (C0003c.f414w[12] & 65535)) > 0) {
            if (C0003c.f414w[11] != i) {
                if (i == 14) {
                    C0003c.f414w[0] = 2031633;
                }
                C0003c.m377e(3);
            }
            m94a();
            m188q();
            C0002b.f170a = 0;
            C0003c.f414w[11] = i;
            DataInputStream dataInputStream2 = null;
            try {
                dataInputStream = new DataInputStream(C0000HG.f10a.getClass().getResourceAsStream("d"));
                try {
                    m185o(dataInputStream);
                    f115b = m128a(i, dataInputStream);
                    try {
                        dataInputStream.close();
                    } catch (Exception e) {
                    }
                    System.gc();
                    C0002b.f170a = 25;
                    C0003c.m456o();
                    m146c(i2, i3);
                    C0003c.m285a(2, 0, 0, 0, 0, true);
                    C0003c.m285a(18, i2, i3, 0, 0, false);
                } catch (Exception e2) {
                    try {
                        dataInputStream.close();
                    } catch (Exception e3) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream;
                    try {
                        dataInputStream2.close();
                    } catch (Exception e4) {
                    }
                    throw th;
                }
            } catch (Exception e5) {
                dataInputStream = null;
                dataInputStream.close();
            } catch (Throwable th3) {
                th = th3;
                dataInputStream2.close();
                throw th;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [int] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m152c(java.io.DataInputStream r12) throws java.io.IOException {
        /*
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = 1
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r1 = 0
            short r0 = r12.readShort()
            short r3 = r12.readShort()
            int[][] r2 = p000.C0003c.f333e
            if (r2 != 0) goto L_0x010a
            r0 = 17
            int[] r0 = new int[]{r3, r0}
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            p000.C0003c.f333e = r0
            r2 = r1
        L_0x0024:
            if (r2 >= r3) goto L_0x0110
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            byte r4 = r12.readByte()
            int r4 = r4 << 16
            short r5 = r12.readShort()
            r4 = r4 | r5
            r0[r1] = r4
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 15
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 11
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 10
            byte r5 = r12.readByte()
            short r5 = (short) r5
            r5 = r5 & r11
            byte r6 = r12.readByte()
            short r6 = (short) r6
            int r6 = r6 << 16
            r6 = r6 & r9
            r5 = r5 | r6
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 13
            byte r5 = r12.readByte()
            int r5 = r5 * 4096
            int r5 = r5 / 10
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 12
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 4
            short r5 = r12.readShort()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 14
            byte r5 = r12.readByte()
            r0[r4] = r5
            r0 = r1
        L_0x009a:
            r4 = 5
            if (r0 >= r4) goto L_0x00a9
            int[][] r4 = p000.C0003c.f333e
            r4 = r4[r2]
            int r5 = r0 + 5
            r6 = -1
            r4[r5] = r6
            int r0 = r0 + 1
            goto L_0x009a
        L_0x00a9:
            byte r4 = r12.readByte()
            if (r4 < r10) goto L_0x00d7
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r5 = 3
            r6 = r0[r5]
            r6 = r6 | 1
            r0[r5] = r6
            r0 = r1
        L_0x00bb:
            if (r0 >= r4) goto L_0x00d7
            int[][] r5 = p000.C0003c.f333e
            r5 = r5[r2]
            int r6 = r0 + 5
            byte r7 = r12.readByte()
            short r7 = (short) r7
            r7 = r7 & r11
            byte r8 = r12.readByte()
            short r8 = (short) r8
            int r8 = r8 << 16
            r8 = r8 & r9
            r7 = r7 | r8
            r5[r6] = r7
            int r0 = r0 + 1
            goto L_0x00bb
        L_0x00d7:
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = r0[r10]
            r4 = r4 & r9
            r0[r10] = r4
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = r0[r10]
            short r5 = r12.readShort()
            r5 = r5 & r11
            r4 = r4 | r5
            r0[r10] = r4
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 2
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f333e
            r0 = r0[r2]
            r4 = 16
            byte r5 = r12.readByte()
            r0[r4] = r5
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0024
        L_0x010a:
            int r0 = r0 + -2
            long r0 = (long) r0
            r12.skip(r0)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m152c(java.io.DataInputStream):void");
    }

    /* renamed from: c */
    public static final void m153c(boolean z) {
        int length;
        int length2;
        if (z) {
            length = f108a.length;
            length2 = f108a[0].length;
        } else {
            length = f108a[0].length;
            length2 = f108a.length;
        }
        int e = C0000HG.m58e(3) + 1;
        int e2 = C0000HG.m58e(length >> 1) + (length >> 2);
        if (z) {
            f89A = 1;
            f152q = e2;
        } else {
            f169z = e2;
            f168y = 1;
        }
        for (int i = 0; i < length2; i++) {
            if (i == (length2 >> 1)) {
                if (z) {
                    f166x = i;
                    f148o = e2;
                } else {
                    f166x = e2;
                    f148o = i;
                }
            }
            if (z) {
                for (int i2 = 0; i2 < e; i2++) {
                    f108a[(e2 - 1) + i2][i] = 4;
                }
            } else {
                for (int i3 = 0; i3 < e; i3++) {
                    f108a[i][(e2 - 1) + i3] = 4;
                }
            }
            int e3 = 1 - C0000HG.m58e(3);
            if (e2 + e3 >= (length >> 2) && e2 + e3 < length - (length >> 2)) {
                e2 += e3;
            }
            int e4 = 1 - C0000HG.m58e(3);
            if (e + e4 >= 1 && e + e4 <= 3) {
                e += e4;
            }
        }
        if (z) {
            f103O = f108a[0].length - 2;
            f95G = e2;
            return;
        }
        f128f = e2;
        f96H = f108a.length - 2;
    }

    /* renamed from: c */
    public static final void m154c(int[] iArr) {
        int i = 5;
        int i2 = C0003c.f414w[18];
        if (i2 >= 5) {
            i = i2;
        }
        int i3 = (iArr[3] & 64) != 0 ? 0 : (iArr[3] & 128) != 0 ? 1 : (iArr[3] & 8192) != 0 ? 2 : 0;
        int b = C0000HG.m40b(0, 100);
        if (b < 50) {
            m136b(iArr, i, 1, i3, 6);
        } else if (b < 75) {
            m136b(iArr, i, 0, i3, 7);
        } else {
            m136b(iArr, m136b(iArr, i, 1, i3, 6), 0, i3, 7);
        }
        iArr[3] = iArr[3] | 131072;
    }

    /* renamed from: c */
    public static final void m155c(int[] iArr, int[] iArr2) {
        if ((iArr[3] & 2048) != 0) {
            iArr2[0] = (iArr[4] + iArr[6]) >> 1;
            iArr2[1] = (iArr[5] + iArr[7]) >> 1;
        } else if ((iArr[3] & 8) != 0) {
            iArr2[0] = iArr[4];
            iArr2[1] = iArr[5];
        } else {
            iArr2[0] = ((short) (iArr[0] & 65535)) << 12;
            iArr2[1] = ((short) ((iArr[0] & -65536) >> 16)) << 12;
            if ((iArr[3] & 4096) != 0) {
                iArr2[0] = iArr2[0] + ((short) (iArr[5] & 65535));
                iArr2[1] = iArr2[1] + ((short) ((iArr[5] & -65536) >> 16));
                return;
            }
            iArr2[0] = iArr2[0] + 2048;
            iArr2[1] = iArr2[1] + 2048;
        }
    }

    /* renamed from: d */
    public static final int m156d(int i, int i2) {
        return m97a(i, i2, m146c(i, i2));
    }

    /* renamed from: d */
    public static final void m157d() {
        int a = m101a(C0003c.f269ai, (int[]) null);
        C0000HG.f6G--;
        if (C0000HG.f6G < 0) {
            C0000HG.f6G = 3;
        }
        if (((short) ((C0003c.f213Q[a + C0000HG.f6G] & -65536) >> 16)) > 0) {
            return;
        }
        if (m94a() >= 0) {
            m157d();
        } else {
            C0000HG.f6G = 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m158d(int r15) {
        /*
            r14 = 65535(0xffff, float:9.1834E-41)
            r13 = 10
            r0 = -1
            r12 = -65536(0xffffffffffff0000, float:NaN)
            r2 = 0
            f164w = r0
            f134h = r0
            switch(r15) {
                case 0: goto L_0x0011;
                case 1: goto L_0x006d;
                case 2: goto L_0x0072;
                default: goto L_0x0010;
            }
        L_0x0010:
            return
        L_0x0011:
            r0 = 3
            f91C = r0
        L_0x0014:
            byte[][] r0 = f108a
            r0 = r0[r2]
            int r0 = r0.length
            int r0 = r0 >> 2
            byte[][] r1 = f108a
            r1 = r1[r2]
            int r1 = r1.length
            byte[][] r3 = f108a
            r3 = r3[r2]
            int r3 = r3.length
            int r3 = r3 >> 2
            int r8 = r1 - r3
            byte[][] r1 = f108a
            int r1 = r1.length
            int r6 = r1 >> 2
            byte[][] r1 = f108a
            int r1 = r1.length
            byte[][] r3 = f108a
            int r3 = r3.length
            int r3 = r3 >> 2
            int r9 = r1 - r3
            r7 = r0
            r1 = r2
        L_0x003a:
            int r0 = r8 + -10
            if (r7 >= r0) goto L_0x0082
            r5 = r6
        L_0x003f:
            int r0 = r9 + -10
            if (r5 >= r0) goto L_0x007e
            r0 = 1
            r4 = r2
        L_0x0045:
            if (r4 >= r13) goto L_0x0059
            r3 = r2
        L_0x0048:
            if (r3 >= r13) goto L_0x0057
            int r10 = r7 + r4
            int r11 = r5 + r3
            int r10 = m146c(r10, r11)
            int r11 = f91C
            if (r10 == r11) goto L_0x0077
            r0 = r2
        L_0x0057:
            if (r0 != 0) goto L_0x007a
        L_0x0059:
            if (r0 == 0) goto L_0x00b8
            int[] r3 = f165w
            int r0 = r1 + 1
            short r4 = (short) r7
            r4 = r4 & r14
            short r10 = (short) r5
            int r10 = r10 << 16
            r10 = r10 & r12
            r4 = r4 | r10
            r3[r1] = r4
        L_0x0068:
            int r3 = r5 + 1
            r5 = r3
            r1 = r0
            goto L_0x003f
        L_0x006d:
            r0 = 9
            f91C = r0
            goto L_0x0014
        L_0x0072:
            r0 = 11
            f91C = r0
            goto L_0x0014
        L_0x0077:
            int r3 = r3 + 1
            goto L_0x0048
        L_0x007a:
            int r3 = r4 + 1
            r4 = r3
            goto L_0x0045
        L_0x007e:
            int r0 = r7 + 1
            r7 = r0
            goto L_0x003a
        L_0x0082:
            if (r1 == 0) goto L_0x0010
            int r0 = p000.C0000HG.m58e(r1)
            int[] r1 = f165w
            r1 = r1[r0]
            r1 = r1 & r14
            short r1 = (short) r1
            f164w = r1
            int[] r1 = f165w
            r0 = r1[r0]
            r0 = r0 & r12
            int r0 = r0 >> 16
            short r0 = (short) r0
            f134h = r0
            int r0 = f164w
        L_0x009c:
            int r1 = f164w
            int r1 = r1 + 10
            if (r0 >= r1) goto L_0x0010
            int r1 = f134h
        L_0x00a4:
            int r2 = f134h
            int r2 = r2 + 10
            if (r1 >= r2) goto L_0x00b5
            byte[][] r2 = f108a
            r2 = r2[r0]
            r3 = 14
            r2[r1] = r3
            int r1 = r1 + 1
            goto L_0x00a4
        L_0x00b5:
            int r0 = r0 + 1
            goto L_0x009c
        L_0x00b8:
            r0 = r1
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m158d(int):void");
    }

    /* renamed from: d */
    public static final void m159d(int i, int i2) {
        boolean z = true;
        while (z) {
            z = false;
            for (int i3 = 0; i3 < f108a.length; i3++) {
                for (int i4 = 0; i4 < f108a[0].length; i4++) {
                    int c = m146c(i4, i3);
                    if (c == i2) {
                        int d = m156d(i4, i3);
                        if (f119c[f106a[(c * 6) + 4]][(d << 1) + 1] == 3) {
                            f108a[i3][i4] = (byte) i;
                            z = true;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public static final void m160d(DataInputStream dataInputStream) throws IOException {
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        if (C0003c.f313c == null) {
            C0003c.f313c = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readShort2, 5});
            for (int i = 0; i < readShort2; i++) {
                C0003c.f313c[i][0] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f313c[i][3] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f313c[i][4] = dataInputStream.readByte();
                int[] iArr = C0003c.f313c[i];
                iArr[1] = iArr[1] & -65536;
                int[] iArr2 = C0003c.f313c[i];
                iArr2[1] = iArr2[1] | (dataInputStream.readShort() & 65535);
                C0003c.f313c[i][2] = dataInputStream.readByte();
            }
            return;
        }
        dataInputStream.skip((long) (readShort - 2));
    }

    /* renamed from: d */
    public static final void m161d(int[] iArr, int[] iArr2) {
        int i;
        int i2;
        int i3;
        int i4;
        m155c(iArr, f153q);
        if ((iArr[3] & 16) != 0) {
            i4 = -1024;
            i3 = 1024;
            i2 = -2048;
            i = 256;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if ((iArr[3] & 32) != 0) {
            int[] iArr3 = C0003c.f249a[iArr[11]];
            i4 = (short) (iArr3[2] & 65535);
            i2 = (short) ((iArr3[2] & -65536) >> 16);
            i3 = (short) (iArr3[3] & 65535);
            i = (short) ((iArr3[3] & -65536) >> 16);
        }
        if ((iArr[3] & 4096) != 0) {
            int[] iArr4 = C0003c.f415w[iArr[4]];
            i4 = (short) (iArr4[2] & 65535);
            i2 = (short) ((iArr4[2] & -65536) >> 16);
            i3 = (short) (iArr4[3] & 65535);
            i = (short) ((iArr4[3] & -65536) >> 16);
        }
        iArr2[0] = i4 + f153q[0];
        iArr2[1] = i2 + f153q[1];
        iArr2[2] = f153q[0] + i3;
        iArr2[3] = i + f153q[1];
    }

    /* renamed from: e */
    public static final int m162e(int i, int i2) {
        return m133b(i, i2, m146c(i, i2));
    }

    /* renamed from: e */
    public static final void m163e() {
        f124d = null;
    }

    /* renamed from: e */
    public static final void m164e(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            f108a[C0000HG.m58e(f108a.length)][C0000HG.m58e(f108a[0].length)] = (byte) i;
        }
    }

    /* renamed from: e */
    public static final void m165e(DataInputStream dataInputStream) throws IOException {
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        if (C0003c.f407u == null) {
            C0003c.f407u = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readShort2, 11});
            for (int i = 0; i < readShort2; i++) {
                C0003c.f407u[i][0] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f407u[i][10] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f407u[i][8] = dataInputStream.readByte();
                C0003c.f407u[i][3] = dataInputStream.readByte();
                C0003c.f407u[i][4] = dataInputStream.readByte();
                C0003c.f407u[i][5] = dataInputStream.readByte();
                C0003c.f407u[i][6] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
                C0003c.f407u[i][7] = dataInputStream.readByte();
                C0003c.f407u[i][9] = dataInputStream.readByte();
                C0003c.f407u[i][1] = (dataInputStream.readShort() & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
                C0003c.f407u[i][2] = dataInputStream.readByte();
            }
            return;
        }
        dataInputStream.skip((long) (readShort - 2));
    }

    /* renamed from: f */
    public static final void m166f() {
        f109a = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f94F, f154r});
        for (int i = 0; i < f109a.length; i++) {
            for (int i2 = 0; i2 < f109a[i].length; i2++) {
                f109a[i][i2] = -1;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v51, types: [int] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m167f(java.io.DataInputStream r15) throws java.io.IOException {
        /*
            r14 = 2
            r13 = 65535(0xffff, float:9.1834E-41)
            r12 = 15
            r1 = -1
            r11 = 11
            byte r4 = r15.readByte()
            r0 = 32
            int[] r0 = new int[]{r4, r0}
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            p000.C0003c.f391q = r0
            int[][] r0 = new int[r4][]
            p000.C0003c.f298b = r0
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r11]
            if (r0 > r14) goto L_0x002a
            r0 = 0
            f105a = r0
        L_0x002a:
            r0 = 0
            r3 = r0
        L_0x002c:
            if (r3 >= r4) goto L_0x037d
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            byte r2 = r15.readByte()
            r0[r11] = r2
            int[][] r0 = p000.C0003c.f249a
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r11]
            r0 = r0[r2]
            r2 = 27
            r5 = r0[r2]
            r0 = 9
            if (r5 == r0) goto L_0x0054
            r0 = 6
            if (r5 < r0) goto L_0x0051
            r0 = 8
            if (r5 <= r0) goto L_0x0054
        L_0x0051:
            r0 = 1
            f105a = r0
        L_0x0054:
            byte r0 = r15.readByte()
            byte r2 = r15.readByte()
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            r7 = 4
            int r0 = r0 * 4096
            int r0 = r0 + 2048
            r6[r7] = r0
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r6 = 5
            int r2 = r2 * 4096
            int r2 = r2 + 4095
            r0[r6] = r2
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 12
            int[][] r6 = p000.C0003c.f249a
            int[][] r7 = p000.C0003c.f391q
            r7 = r7[r3]
            r7 = r7[r11]
            r6 = r6[r7]
            r7 = 6
            r6 = r6[r7]
            short r6 = (short) r6
            r6 = r6 & r13
            int[][] r7 = p000.C0003c.f249a
            int[][] r8 = p000.C0003c.f391q
            r8 = r8[r3]
            r8 = r8[r11]
            r7 = r7[r8]
            r8 = 6
            r7 = r7[r8]
            short r7 = (short) r7
            int r7 = r7 << 16
            r8 = -65536(0xffffffffffff0000, float:NaN)
            r7 = r7 & r8
            r6 = r6 | r7
            r0[r2] = r6
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 14
            byte r6 = r15.readByte()
            r0[r2] = r6
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            byte r2 = r15.readByte()
            r0[r12] = r2
            byte r0 = r15.readByte()
            r2 = r0 & 1
            if (r2 == 0) goto L_0x00c7
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r6 = 13
            r7 = r2[r6]
            r7 = r7 | 1024(0x400, float:1.435E-42)
            r2[r6] = r7
        L_0x00c7:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x00d7
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r6 = 13
            r7 = r2[r6]
            r7 = r7 | 2048(0x800, float:2.87E-42)
            r2[r6] = r7
        L_0x00d7:
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00e7
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 13
            r6 = r0[r2]
            r6 = r6 | 4096(0x1000, float:5.74E-42)
            r0[r2] = r6
        L_0x00e7:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 14
            r0 = r0[r2]
            if (r0 >= 0) goto L_0x010c
            int[][] r0 = p000.C0003c.f249a
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r11]
            r0 = r0[r2]
            r2 = 23
            r0 = r0[r2]
            if (r0 < 0) goto L_0x0112
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 14
            r0 = r0[r2]
            r2 = -2
            if (r0 == r2) goto L_0x0112
        L_0x010c:
            int r0 = f90B
            int r0 = r0 + 1
            f90B = r0
        L_0x0112:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r0 = r0[r12]
            if (r0 >= 0) goto L_0x0133
            int[][] r0 = p000.C0003c.f249a
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r11]
            r0 = r0[r2]
            r2 = 24
            r0 = r0[r2]
            if (r0 < 0) goto L_0x0139
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r0 = r0[r12]
            r2 = -2
            if (r0 == r2) goto L_0x0139
        L_0x0133:
            int r0 = f90B
            int r0 = r0 + 1
            f90B = r0
        L_0x0139:
            int[][] r0 = p000.C0003c.f249a
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r11]
            r0 = r0[r2]
            r2 = 26
            r0 = r0[r2]
            if (r0 < 0) goto L_0x014f
            int r0 = f142l
            int r0 = r0 + 1
            f142l = r0
        L_0x014f:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 14
            r0 = r0[r2]
            if (r0 < 0) goto L_0x037e
            int[][] r0 = p000.C0003c.f333e
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r6 = 14
            r2 = r2[r6]
            r0 = r0[r2]
            r0 = r0[r12]
        L_0x0167:
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r12]
            if (r2 < 0) goto L_0x0180
            if (r0 == r14) goto L_0x0180
            r2 = 3
            if (r0 == r2) goto L_0x0180
            int[][] r0 = p000.C0003c.f333e
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r12]
            r0 = r0[r2]
            r0 = r0[r12]
        L_0x0180:
            int[][] r2 = p000.C0003c.f249a
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            r6 = r6[r11]
            r2 = r2[r6]
            r6 = 23
            r2 = r2[r6]
            if (r2 < 0) goto L_0x01a3
            if (r0 == r14) goto L_0x01a3
            r2 = 3
            if (r0 == r2) goto L_0x01a3
            int[][] r0 = p000.C0003c.f249a
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r11]
            r0 = r0[r2]
            r2 = 23
            r0 = r0[r2]
        L_0x01a3:
            int[][] r2 = p000.C0003c.f249a
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            r6 = r6[r11]
            r2 = r2[r6]
            r6 = 24
            r2 = r2[r6]
            if (r2 < 0) goto L_0x01c6
            if (r0 == r14) goto L_0x01c6
            r2 = 3
            if (r0 == r2) goto L_0x01c6
            int[][] r0 = p000.C0003c.f249a
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r2 = r2[r11]
            r0 = r0[r2]
            r2 = 24
            r0 = r0[r2]
        L_0x01c6:
            if (r0 == r14) goto L_0x01cb
            r2 = 3
            if (r0 != r2) goto L_0x01d1
        L_0x01cb:
            int r0 = f98J
            int r0 = r0 + 1
            f98J = r0
        L_0x01d1:
            r0 = 0
            r2 = 0
        L_0x01d3:
            if (r2 >= r14) goto L_0x025c
            byte r6 = r15.readByte()
            switch(r6) {
                case 2: goto L_0x0207;
                case 3: goto L_0x0223;
                case 4: goto L_0x01dc;
                case 5: goto L_0x023f;
                default: goto L_0x01dc;
            }
        L_0x01dc:
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            int r7 = r2 + 17
            r6[r7] = r1
        L_0x01e4:
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            int r7 = r2 + 17
            r6 = r6[r7]
            if (r6 != r1) goto L_0x0204
            int[][] r6 = p000.C0003c.f249a
            int[][] r7 = p000.C0003c.f391q
            r7 = r7[r3]
            r7 = r7[r11]
            r6 = r6[r7]
            int r7 = r2 + 21
            r6 = r6[r7]
            if (r6 == r1) goto L_0x0204
            int r6 = f98J
            int r6 = r6 + 1
            f98J = r6
        L_0x0204:
            int r2 = r2 + 1
            goto L_0x01d3
        L_0x0207:
            int[][] r7 = p000.C0003c.f391q
            r7 = r7[r3]
            int r8 = r2 + 17
            short r6 = (short) r6
            r6 = r6 & r13
            byte r9 = r15.readByte()
            short r9 = (short) r9
            int r9 = r9 << 16
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r10
            r6 = r6 | r9
            r7[r8] = r6
            int r6 = f98J
            int r6 = r6 + 1
            f98J = r6
            goto L_0x01e4
        L_0x0223:
            int[][] r7 = p000.C0003c.f391q
            r7 = r7[r3]
            int r8 = r2 + 17
            short r6 = (short) r6
            r6 = r6 & r13
            byte r9 = r15.readByte()
            short r9 = (short) r9
            int r9 = r9 << 16
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r9 = r9 & r10
            r6 = r6 | r9
            r7[r8] = r6
            int r6 = f99K
            int r6 = r6 + 1
            f99K = r6
            goto L_0x01e4
        L_0x023f:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            int r7 = r2 + 17
            short r6 = (short) r6
            r6 = r6 & r13
            byte r8 = r15.readByte()
            short r8 = (short) r8
            int r8 = r8 << 16
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r9
            r6 = r6 | r8
            r0[r7] = r6
            r0 = 1
            int r6 = f146n
            int r6 = r6 + 1
            f146n = r6
            goto L_0x01e4
        L_0x025c:
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r6 = 19
            int r7 = p000.C0003c.m338c(r3)
            r2[r6] = r7
            int[][] r2 = p000.C0003c.f391q
            r2 = r2[r3]
            r6 = 21
            r2[r6] = r1
            int[][] r2 = p000.C0003c.f249a
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            r6 = r6[r11]
            r2 = r2[r6]
            r6 = 27
            r2 = r2[r6]
            r6 = 7
            if (r2 == r6) goto L_0x0293
            int[][] r2 = p000.C0003c.f249a
            int[][] r6 = p000.C0003c.f391q
            r6 = r6[r3]
            r6 = r6[r11]
            r2 = r2[r6]
            r6 = 27
            r2 = r2[r6]
            r6 = 8
            if (r2 != r6) goto L_0x0361
        L_0x0293:
            int r2 = f90B
            int r2 = r2 + 25
            f90B = r2
            int r2 = f98J
            int r2 = r2 + 25
            f98J = r2
            int r2 = f142l
            int r2 = r2 + 25
            f142l = r2
            int r2 = f99K
            int r2 = r2 + 25
            f99K = r2
            int r2 = f117c
            int r2 = r2 + 4
            f117c = r2
        L_0x02b1:
            int[] r2 = p000.C0003c.f398s
            int[] r6 = p000.C0003c.f414w
            r6 = r6[r11]
            r2 = r2[r6]
            r6 = 1
            int r6 = r6 << r3
            r2 = r2 & r6
            if (r2 == 0) goto L_0x0328
            if (r0 == 0) goto L_0x0369
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 14
            r0[r2] = r1
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r0[r12] = r1
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 19
            r6 = 0
            r0[r2] = r6
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 17
            r0 = r0[r2]
            r0 = r0 & r13
            short r0 = (short) r0
            r2 = 5
            if (r0 == r2) goto L_0x02ec
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 17
            r0[r2] = r1
        L_0x02ec:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 18
            r0 = r0[r2]
            r0 = r0 & r13
            short r0 = (short) r0
            r2 = 5
            if (r0 == r2) goto L_0x0301
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 18
            r0[r2] = r1
        L_0x0301:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 12
            r6 = r0[r2]
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r0[r2] = r6
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 12
            r6 = r0[r2]
            r6 = r6 | r13
            r0[r2] = r6
            int[] r0 = p000.C0003c.f398s
            int[] r2 = p000.C0003c.f414w
            r2 = r2[r11]
            r6 = r0[r2]
            r7 = 1
            int r7 = r7 << r3
            r7 = r7 ^ -1
            r6 = r6 & r7
            r0[r2] = r6
        L_0x0328:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 27
            r6 = r0[r2]
            r7 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r6 & r7
            r0[r2] = r6
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 27
            r6 = r0[r2]
            byte r7 = r15.readByte()
            short r7 = (short) r7
            r7 = r7 & r13
            r6 = r6 | r7
            r0[r2] = r6
            int[] r0 = p000.C0003c.f414w
            r0 = r0[r11]
            if (r0 > r14) goto L_0x035c
            r0 = 9
            if (r5 != r0) goto L_0x035c
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 3
            r5 = r0[r2]
            r6 = 65536(0x10000, float:9.18355E-41)
            r5 = r5 | r6
            r0[r2] = r5
        L_0x035c:
            int r0 = r3 + 1
            r3 = r0
            goto L_0x002c
        L_0x0361:
            int r2 = f117c
            int r2 = r2 + 1
            f117c = r2
            goto L_0x02b1
        L_0x0369:
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 3
            r6 = r0[r2]
            r7 = 65536(0x10000, float:9.18355E-41)
            r6 = r6 | r7
            r0[r2] = r6
            int[][] r0 = p000.C0003c.f391q
            r0 = r0[r3]
            r2 = 0
            r0[r2] = r1
            goto L_0x0328
        L_0x037d:
            return
        L_0x037e:
            r0 = r1
            goto L_0x0167
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m167f(java.io.DataInputStream):void");
    }

    /* renamed from: g */
    public static final void m168g() {
        int a = m101a(C0003c.f269ai, (int[]) null);
        C0000HG.f6G++;
        if (C0000HG.f6G >= 4) {
            C0000HG.f6G = 0;
        }
        if (((short) ((C0003c.f213Q[a + C0000HG.f6G] & -65536) >> 16)) > 0) {
            return;
        }
        if (m94a() >= 0) {
            m168g();
        } else {
            C0000HG.f6G = 0;
        }
    }

    /* renamed from: g */
    public static final void m169g(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        C0003c.f371l = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f98J + readByte + 15, 7});
        C0003c.m234a(C0003c.f371l);
        for (int i = 0; i < readByte; i++) {
            C0003c.f371l[i][4] = dataInputStream.readByte();
            C0003c.f371l[i][0] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            C0003c.f371l[i][5] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            C0003c.f371l[i][6] = dataInputStream.readByte();
            if (C0003c.f414w[11] >= 0 && (C0003c.f209O[C0003c.f414w[11]] & (1 << i)) != 0) {
                int[] iArr = C0003c.f371l[i];
                iArr[3] = iArr[3] | 65536;
            }
        }
    }

    /* renamed from: h */
    public static final void m170h() {
        int[][] iArr;
        int[][] iArr2;
        boolean z;
        int i;
        f122d = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < C0003c.f419x.length) {
                byte b = (byte) (C0003c.f419x[i3][8] & 255);
                if (b > 0) {
                    if (f93E >= 30) {
                        C0003c.f419x[i3][8] = 0;
                    } else {
                        switch (b) {
                            case 4:
                                int[] iArr3 = C0003c.f419x[i3];
                                iArr3[8] = iArr3[8] & -16711681;
                                int[] iArr4 = C0003c.f419x[i3];
                                iArr4[8] = iArr4[8] | 16711680;
                                int e = C0000HG.m58e(6);
                                int[] iArr5 = C0003c.f419x[i3];
                                iArr5[8] = iArr5[8] & 16777215;
                                int[] iArr6 = C0003c.f419x[i3];
                                iArr6[8] = iArr6[8] | ((((byte) e) << 24) & -16777216);
                                int h = C0003c.m414h(e);
                                int[] iArr7 = C0003c.f419x[i3];
                                iArr7[9] = iArr7[9] & 65535;
                                int[] iArr8 = C0003c.f419x[i3];
                                iArr8[9] = ((((short) h) << 16) & -65536) | iArr8[9];
                                int[] iArr9 = C0003c.f419x[i3];
                                iArr9[8] = iArr9[8] & -65281;
                                int[] iArr10 = C0003c.f419x[i3];
                                iArr10[8] = iArr10[8] | ((((byte) f93E) << 8) & 65280);
                                f93E += 2;
                                break;
                            case 8:
                                break;
                        }
                        if (b != 8 || C0000HG.m58e(2) == 0) {
                            f117c++;
                            int i4 = (C0003c.f414w[17] / 5) + C0003c.f395r[0][4];
                            int i5 = i4 > 2500 ? 2500 : i4;
                            int i6 = 0;
                            while (true) {
                                int i7 = i6;
                                if (i7 < 4) {
                                    int[][] iArr11 = null;
                                    int[][] iArr12 = null;
                                    int i8 = -1;
                                    int i9 = -1;
                                    int i10 = -1;
                                    int i11 = -1;
                                    int i12 = -1;
                                    int i13 = -1;
                                    char c = 65535;
                                    char c2 = 65535;
                                    int i14 = 0;
                                    boolean z2 = false;
                                    switch (i7) {
                                        case 0:
                                            iArr = C0003c.f359i;
                                            iArr2 = C0003c.f333e;
                                            i8 = 10;
                                            i9 = 10;
                                            i10 = 12;
                                            i11 = 0;
                                            i12 = 2;
                                            c = 4;
                                            z2 = true;
                                            i14 = 64;
                                            break;
                                        case 1:
                                            iArr = C0003c.f379n;
                                            iArr2 = C0003c.f387p;
                                            i8 = 10;
                                            i9 = 10;
                                            i10 = 12;
                                            i11 = 0;
                                            i12 = 2;
                                            c = 4;
                                            z2 = true;
                                            i14 = 128;
                                            break;
                                        case 2:
                                            iArr = C0003c.f423y;
                                            iArr2 = C0003c.f354h;
                                            i8 = 10;
                                            i9 = 10;
                                            i10 = 12;
                                            i11 = 0;
                                            i12 = 2;
                                            c = 4;
                                            z2 = true;
                                            i14 = 8192;
                                            break;
                                        case 3:
                                            iArr = C0003c.f371l;
                                            iArr2 = C0003c.f395r;
                                            i8 = 10;
                                            i11 = 1;
                                            i12 = 5;
                                            c = 4;
                                            c2 = 6;
                                            i13 = 0;
                                            z2 = false;
                                            i14 = 256;
                                            break;
                                        default:
                                            iArr = iArr12;
                                            iArr2 = iArr11;
                                            break;
                                    }
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = i15;
                                        if (i16 < i12) {
                                            if (i16 < i11 || C0000HG.m58e(i8) == 0) {
                                                boolean z3 = false;
                                                if (i9 != -1) {
                                                    z3 = C0000HG.m58e(i9) == 0;
                                                }
                                                boolean z4 = (i10 == -1 || !z3) ? false : C0000HG.m58e(i10) == 0;
                                                int i17 = -1;
                                                int i18 = -1;
                                                int i19 = 0;
                                                int i20 = 0;
                                                for (int i21 = 0; i21 < iArr2.length; i21++) {
                                                    if (iArr2[i21][c] <= i5) {
                                                        if (i9 == -1 || i10 == -1) {
                                                            i19++;
                                                        } else if ((iArr2[i21][3] & 1) != 0) {
                                                            i20++;
                                                        } else {
                                                            i19++;
                                                        }
                                                    }
                                                }
                                                if (i19 != 0) {
                                                    int e2 = C0000HG.m58e(i20);
                                                    int e3 = C0000HG.m58e(i19);
                                                    int i22 = 0;
                                                    int i23 = 0;
                                                    for (int i24 = 0; i24 < iArr2.length; i24++) {
                                                        if (iArr2[i24][c] <= i5) {
                                                            if (i9 == -1 || i10 == -1) {
                                                                if (e3 == i23) {
                                                                    i17 = i24;
                                                                }
                                                                i23++;
                                                            } else if ((iArr2[i24][3] & 1) != 0) {
                                                                if (e2 == i22) {
                                                                    i18 = i24;
                                                                }
                                                                i22++;
                                                            } else {
                                                                if (e3 == i23) {
                                                                    i17 = i24;
                                                                }
                                                                i23++;
                                                            }
                                                        }
                                                    }
                                                    if (!z4 || i18 == -1) {
                                                        z = z3;
                                                    } else {
                                                        z = false;
                                                        i17 = i18;
                                                    }
                                                    int a = C0003c.m234a(iArr);
                                                    if (a != -1) {
                                                        if (i16 == 0 && i13 != -1) {
                                                            i17 = i13;
                                                        }
                                                        iArr[a][0] = C0003c.f419x[i3][0];
                                                        iArr[a][3] = i14;
                                                        if (z2) {
                                                            m114a(i17, z, iArr[a]);
                                                            i = a;
                                                        } else {
                                                            i = 0;
                                                            while (true) {
                                                                if (i >= iArr.length) {
                                                                    i = -1;
                                                                } else if (iArr[i][4] != i17 || iArr[i][0] != iArr[a][0]) {
                                                                    i++;
                                                                }
                                                            }
                                                            if (i < 0) {
                                                                iArr[a][4] = i17;
                                                                iArr[a][5] = 0;
                                                                iArr[a][c2] = 0;
                                                                i = a;
                                                            }
                                                        }
                                                        if (!z2 && i17 == 0 && c2 != 65535) {
                                                            int i25 = i5 / 20;
                                                            int e4 = (C0000HG.m58e(i25) >> 2) + C0000HG.m58e(2) + (C0000HG.m58e(i25) >> 2) + C0000HG.m58e(2) + (C0000HG.m58e(i25) >> 2) + C0000HG.m58e(2);
                                                            int i26 = (i25 >> 2) + 2;
                                                            int[] iArr13 = iArr[i];
                                                            iArr13[c2] = i26 + e4 + iArr13[c2];
                                                        } else if (c2 != 65535) {
                                                            int[] iArr14 = iArr[i];
                                                            iArr14[c2] = iArr14[c2] + C0000HG.m58e(8) + 1;
                                                        }
                                                    }
                                                }
                                            }
                                            i15 = i16 + 1;
                                        }
                                    }
                                    i6 = i7 + 1;
                                }
                            }
                        } else {
                            C0003c.f419x[i3][8] = 0;
                        }
                    }
                }
                i2 = i3 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static final void m171h(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        C0003c.f419x = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readByte, 11});
        for (int i = 0; i < readByte; i++) {
            C0003c.f419x[i][4] = dataInputStream.readByte();
            byte readByte2 = dataInputStream.readByte();
            byte readByte3 = dataInputStream.readByte();
            byte readByte4 = dataInputStream.readByte();
            byte readByte5 = dataInputStream.readByte();
            C0003c.f419x[i][6] = dataInputStream.readByte();
            C0003c.f419x[i][7] = dataInputStream.readByte();
            byte readByte6 = dataInputStream.readByte();
            C0003c.f419x[i][8] = ((((short) dataInputStream.readByte()) << 16) & -65536) | (((short) readByte6) & 65535);
            if (readByte6 <= 0) {
                short s = C0003c.f296b[(C0003c.f415w[C0003c.f419x[i][4]][1] * 11) + 5];
                if (s > 1) {
                    int[] iArr = C0003c.f419x[i];
                    iArr[10] = iArr[10] & -65536;
                    int[] iArr2 = C0003c.f419x[i];
                    iArr2[10] = (((short) C0000HG.m58e((int) s)) & 65535) | iArr2[10];
                    C0003c.m274a(C0003c.f419x[i], true);
                }
            } else if (readByte6 == 4 || readByte6 == 5) {
                int i2 = C0003c.f419x[i][6];
                int[] iArr3 = C0003c.f419x[i];
                iArr3[8] = iArr3[8] & 16777215;
                int[] iArr4 = C0003c.f419x[i];
                iArr4[8] = iArr4[8] | ((((byte) i2) << 24) & -16777216);
                C0003c.f419x[i][6] = 0;
                f117c++;
                int h = C0003c.m414h(i2);
                int[] iArr5 = C0003c.f419x[i];
                iArr5[9] = iArr5[9] & 65535;
                int[] iArr6 = C0003c.f419x[i];
                iArr6[9] = ((((short) h) << 16) & -65536) | iArr6[9];
                if (C0003c.f414w[11] >= 0 && (C0003c.f378n[C0003c.f414w[11]] & (1 << f93E)) != 0) {
                    int i3 = C0003c.f296b[(C0003c.f415w[C0003c.f419x[i][4]][1] * 11) + 5] - 1;
                    int[] iArr7 = C0003c.f419x[i];
                    iArr7[10] = iArr7[10] & -65536;
                    int[] iArr8 = C0003c.f419x[i];
                    iArr8[10] = (((short) i3) & 65535) | iArr8[10];
                    if (readByte6 == 5) {
                        int[] iArr9 = C0003c.f419x[i];
                        iArr9[3] = iArr9[3] | 32768;
                        C0003c.f377n = true;
                    }
                }
                int[] iArr10 = C0003c.f419x[i];
                iArr10[8] = iArr10[8] & -65281;
                int[] iArr11 = C0003c.f419x[i];
                iArr11[8] = iArr11[8] | ((((byte) f93E) << 8) & 65280);
                f93E += 2;
            } else if (readByte6 == 8) {
                f117c++;
            }
            int[] iArr12 = C0003c.f419x[i];
            iArr12[10] = iArr12[10] & 16777215;
            int[] iArr13 = C0003c.f419x[i];
            iArr13[10] = iArr13[10] | 16777216;
            int i4 = (readByte2 << 12) + ((readByte4 << 12) / f136i) + 2048;
            int i5 = ((((readByte3 << 12) - ((readByte5 << 12) / f136i)) + 4096) + (C0003c.f419x[i][6] * 4096)) - 1;
            C0003c.f419x[i][0] = (((short) (i4 >> 12)) & 65535) | ((((short) (i5 >> 12)) << 16) & -65536);
            C0003c.f419x[i][5] = (((short) (i4 % 4096)) & 65535) | ((((short) (i5 % 4096)) << 16) & -65536);
            if (C0003c.f415w[C0003c.f419x[i][4]][2] == C0003c.f415w[C0003c.f419x[i][4]][3]) {
                int[] iArr14 = C0003c.f419x[i];
                iArr14[3] = iArr14[3] | 32768;
            }
        }
    }

    /* renamed from: i */
    public static final void m172i() {
        f109a = null;
    }

    /* renamed from: i */
    public static final void m173i(DataInputStream dataInputStream) throws IOException {
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        if (C0003c.f249a == null) {
            C0003c.f249a = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readShort2, 30});
            for (int i = 0; i < readShort2; i++) {
                C0003c.f249a[i][13] = 0;
                C0003c.f249a[i][0] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f249a[i][6] = dataInputStream.readShort();
                C0003c.f249a[i][12] = dataInputStream.readShort();
                C0003c.f249a[i][5] = dataInputStream.readByte();
                C0003c.f249a[i][7] = dataInputStream.readByte();
                C0003c.f249a[i][8] = dataInputStream.readByte();
                C0003c.f249a[i][10] = dataInputStream.readByte();
                C0003c.f249a[i][17] = dataInputStream.readByte();
                C0003c.f249a[i][18] = dataInputStream.readByte();
                C0003c.f249a[i][19] = dataInputStream.readByte();
                C0003c.f249a[i][20] = dataInputStream.readByte();
                C0003c.f249a[i][11] = dataInputStream.readByte();
                C0003c.f249a[i][14] = dataInputStream.readByte();
                C0003c.f249a[i][15] = dataInputStream.readByte();
                C0003c.f249a[i][16] = dataInputStream.readByte();
                C0003c.f249a[i][25] = dataInputStream.readByte();
                C0003c.f249a[i][27] = dataInputStream.readByte();
                C0003c.f249a[i][23] = dataInputStream.readByte();
                C0003c.f249a[i][24] = dataInputStream.readByte();
                C0003c.f249a[i][26] = dataInputStream.readByte();
                C0003c.f249a[i][21] = dataInputStream.readByte();
                C0003c.f249a[i][22] = dataInputStream.readByte();
                C0003c.f249a[i][28] = dataInputStream.readByte();
                C0003c.f249a[i][9] = 4096 / dataInputStream.readByte();
                C0003c.f249a[i][29] = (dataInputStream.readByte() * 4096) / 10;
                int[] iArr = C0003c.f249a[i];
                iArr[13] = iArr[13] | (1 << dataInputStream.readByte());
                byte readByte = dataInputStream.readByte();
                if ((readByte & 1) != 0) {
                    int[] iArr2 = C0003c.f249a[i];
                    iArr2[13] = iArr2[13] | 512;
                }
                if ((readByte & 2) != 0) {
                    int[] iArr3 = C0003c.f249a[i];
                    iArr3[13] = iArr3[13] | 1024;
                }
                if ((readByte & 4) != 0) {
                    int[] iArr4 = C0003c.f249a[i];
                    iArr4[13] = iArr4[13] | 2048;
                }
                if ((readByte & 8) != 0) {
                    int[] iArr5 = C0003c.f249a[i];
                    iArr5[13] = iArr5[13] | 128;
                }
                int readInt = dataInputStream.readInt();
                C0003c.f249a[i][2] = (((short) ((((byte) ((readInt >> 24) & 255)) << 12) / f136i)) & 65535) | ((((short) ((((byte) ((readInt >> 8) & 255)) << 12) / f136i)) << 16) & -65536);
                C0003c.f249a[i][3] = ((((short) ((((byte) (readInt & 255)) << 12) / f136i)) << 16) & -65536) | (((short) ((((byte) ((readInt >> 16) & 255)) << 12) / f136i)) & 65535);
                C0003c.f249a[i][1] = (dataInputStream.readShort() & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
                C0003c.f249a[i][4] = -1;
                if (dataInputStream.readByte() == 1) {
                    int[] iArr6 = C0003c.f249a[i];
                    iArr6[4] = iArr6[4] & -256;
                    int[] iArr7 = C0003c.f249a[i];
                    iArr7[4] = iArr7[4] | (dataInputStream.readByte() & 255);
                    int[] iArr8 = C0003c.f249a[i];
                    iArr8[4] = iArr8[4] & -65281;
                    int[] iArr9 = C0003c.f249a[i];
                    iArr9[4] = iArr9[4] | ((dataInputStream.readByte() << 8) & 65280);
                    int[] iArr10 = C0003c.f249a[i];
                    iArr10[4] = iArr10[4] & -16711681;
                    int[] iArr11 = C0003c.f249a[i];
                    iArr11[4] = iArr11[4] | ((dataInputStream.readByte() << 16) & 16711680);
                }
                if (C0003c.f249a[i][27] == 9) {
                    int[] iArr12 = C0003c.f249a[i];
                    iArr12[4] = iArr12[4] & -256;
                    int[] iArr13 = C0003c.f249a[i];
                    iArr13[4] = iArr13[4] | 0;
                    int[] iArr14 = C0003c.f249a[i];
                    iArr14[4] = iArr14[4] & -65281;
                    int[] iArr15 = C0003c.f249a[i];
                    iArr15[4] = iArr15[4] | 0;
                    int[] iArr16 = C0003c.f249a[i];
                    iArr16[4] = iArr16[4] & -16711681;
                    int[] iArr17 = C0003c.f249a[i];
                    iArr17[4] = iArr17[4] | 0;
                    int[] iArr18 = C0003c.f249a[i];
                    iArr18[4] = iArr18[4] & 65535;
                    int[] iArr19 = C0003c.f249a[i];
                    iArr19[4] = iArr19[4] | 0;
                }
            }
            return;
        }
        dataInputStream.skip((long) (readShort - 2));
    }

    /* renamed from: j */
    private static final void m174j() {
        for (int i = 0; i < f108a.length; i++) {
            f108a[i][0] = 14;
            f108a[i][f108a[0].length - 1] = 14;
        }
        for (int i2 = 0; i2 < f108a[0].length; i2++) {
            f108a[0][i2] = 14;
            f108a[f108a.length - 1][i2] = 14;
        }
    }

    /* renamed from: j */
    public static final void m175j(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        C0003c.f297b = new byte[readByte][];
        for (int i = 0; i < readByte; i++) {
            short readShort = dataInputStream.readShort();
            C0003c.f297b[i] = new byte[readShort];
            dataInputStream.read(C0003c.f297b[i], 0, readShort);
        }
    }

    /* renamed from: k */
    public static final void m176k() {
        boolean z;
        if (f110a == null || f116b == null) {
            C0003c.f419x = (int[][]) Array.newInstance(Integer.TYPE, new int[]{0, 0});
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < f120c.length; i2++) {
            for (int i3 = 0; i3 < f120c[i2].length; i3++) {
                if (i3 == 0 && (i2 ^ 1) != f91C) {
                    i += f120c[i2][i3];
                } else if (f120c[i2][i3] != 0) {
                    do {
                        int e = i + C0000HG.m58e(f120c[i2][i3]);
                        if (e < 0 || e >= f110a.length) {
                            break;
                        }
                        int length = f110a[e][0].length;
                        int length2 = f110a[e].length;
                        int e2 = C0000HG.m58e(f108a[0].length - length);
                        int e3 = C0000HG.m58e(f108a.length - length2);
                        int i4 = 0;
                        if (i3 != 0) {
                            i4 = 0;
                            for (int i5 = 0; i5 < f108a[0].length - length; i5++) {
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= f108a.length - length2) {
                                        break;
                                    }
                                    boolean z2 = true;
                                    for (int i7 = 0; i7 < length; i7++) {
                                        int i8 = 0;
                                        while (true) {
                                            if (i8 >= length2) {
                                                break;
                                            }
                                            int c = m146c(e2 + i7, e3 + i8);
                                            if ((((i2 ^ 1) & 1) == 0 || c == (i2 ^ 1)) && (((i2 ^ 1) & 1) != 0 || (c & -2) == (i2 ^ 1))) {
                                                i8++;
                                            }
                                        }
                                        z2 = false;
                                        if (!z2) {
                                            break;
                                        }
                                    }
                                    if (z2) {
                                        f165w[i4] = (((short) e2) & 65535) | ((((short) e3) << 16) & -65536);
                                        i4++;
                                        break;
                                    }
                                    e3 = (e3 + 1) % (f108a.length - length2);
                                    i6++;
                                }
                                if (i4 != 0) {
                                    break;
                                }
                                e2 = (e2 + 1) % (f108a[0].length - length);
                            }
                        } else if (!(f164w == -1 || f134h == -1)) {
                            f165w[0] = (((short) f164w) & 65535) | ((((short) f134h) << 16) & -65536);
                            i4 = 1;
                        }
                        if (i4 == 0) {
                            break;
                        }
                        int e4 = C0000HG.m58e(i4);
                        short s = (short) (f165w[e4] & 65535);
                        short s2 = (short) ((f165w[e4] & -65536) >> 16);
                        for (int i9 = 0; i9 < length; i9++) {
                            for (int i10 = 0; i10 < length2; i10++) {
                                int i11 = s + i9;
                                int i12 = s2 + i10;
                                if ((f110a[e][i10][i9] & 32768) == 0) {
                                    int[] iArr = f127e[i12];
                                    iArr[i11] = iArr[i11] & -32769;
                                }
                                boolean z3 = false;
                                short s3 = (short) (f127e[i12][i11] & 65535);
                                int i13 = (short) ((f127e[i12][i11] & -65536) >> 16);
                                if (((byte) (f110a[e][i10][i9] & 255)) != -1) {
                                    s3 = f110a[e][i10][i9] & 65535;
                                    z3 = true;
                                }
                                if (((byte) ((f110a[e][i10][i9] >> 16) & 255)) != -1) {
                                    z = true;
                                    i13 = f110a[e][i10][i9] >> 16;
                                } else {
                                    z = z3;
                                }
                                if (z) {
                                    f127e[i12][i11] = (((short) s3) & 65535) | ((((short) i13) << 16) & -65536);
                                    int[] iArr2 = f127e[i12];
                                    iArr2[i11] = iArr2[i11] | Integer.MIN_VALUE;
                                }
                                f108a[i12][i11] = 14;
                            }
                        }
                        for (int i14 = 0; i14 < f116b[e].length && f144m != f130f.length; i14++) {
                            for (int i15 = 0; i15 < f116b[e][i14].length; i15++) {
                                f130f[f144m][i15] = f116b[e][i14][i15];
                            }
                            f130f[f144m][0] = (((short) (((short) (f116b[e][i14][0] & 65535)) + s)) & 65535) | ((((short) (((short) ((f116b[e][i14][0] & -65536) >> 16)) + s2)) << 16) & -65536);
                            if (((byte) (f130f[f144m][8] & 255)) == 4 || ((byte) (f130f[f144m][8] & 255)) == 8) {
                                f140k += 2;
                                f131g += 2;
                                f160u += 5;
                                f158t += 2;
                            }
                            f144m++;
                        }
                    } while (i3 != 0);
                    i += f120c[i2][i3];
                }
            }
        }
        C0003c.f419x = (int[][]) Array.newInstance(Integer.TYPE, new int[]{f144m, 11});
        for (int i16 = 0; i16 < f144m; i16++) {
            for (int i17 = 0; i17 < 11; i17++) {
                C0003c.f419x[i16][i17] = f130f[i16][i17];
            }
        }
        f130f = null;
    }

    /* renamed from: k */
    public static final void m177k(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        C0003c.f403t = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readByte, 7});
        for (int i = 0; i < readByte; i++) {
            C0003c.f403t[i][0] = dataInputStream.readByte();
            C0003c.f403t[i][1] = 1;
            switch (C0003c.f403t[i][0]) {
                case 3:
                case 11:
                    C0003c.f403t[i][2] = dataInputStream.readByte();
                    C0003c.f403t[i][3] = dataInputStream.readShort();
                    break;
                case 4:
                case 9:
                    C0003c.f403t[i][2] = dataInputStream.readShort();
                    break;
                case 8:
                case 13:
                case 18:
                    C0003c.f403t[i][2] = dataInputStream.readByte();
                    C0003c.f403t[i][3] = dataInputStream.readByte();
                    C0003c.f403t[i][4] = dataInputStream.readByte();
                    C0003c.f403t[i][5] = dataInputStream.readByte();
                    break;
                case 12:
                    C0003c.f403t[i][2] = dataInputStream.readByte();
                    C0003c.f403t[i][3] = dataInputStream.readShort();
                    C0003c.f403t[i][4] = dataInputStream.readByte();
                    break;
                case 14:
                    C0003c.f403t[i][2] = dataInputStream.readShort();
                    C0003c.f403t[i][3] = dataInputStream.readByte();
                    C0003c.f403t[i][4] = dataInputStream.readByte();
                    break;
            }
            C0003c.f403t[i][6] = dataInputStream.readByte();
        }
    }

    /* renamed from: l */
    public static final void m178l() {
        C0003c.m407g((int) (short) (f102N & 65535), 0);
        C0003c.m407g((int) (short) ((f102N & -65536) >> 16), 0);
        for (int i = 0; i < C0003c.f419x.length; i++) {
            C0003c.m407g(C0003c.f415w[C0003c.f419x[i][4]][1], 0);
            C0003c.m407g((C0003c.f415w[C0003c.f419x[i][4]][1] - 8) + 185, 0);
        }
        f121c[0] = C0003c.f333e;
        f121c[1] = C0003c.f387p;
        f121c[2] = C0003c.f354h;
        f121c[3] = C0003c.f395r;
        f121c[4] = C0003c.f407u;
        f121c[5] = C0003c.f313c;
        for (int i2 = 0; i2 < 6; i2++) {
            for (int i3 = 0; i3 < f121c[i2].length; i3++) {
                C0003c.m407g((int) (short) (f121c[i2][i3][1] & 65535), (int) (short) ((f121c[i2][i3][1] & -65536) >> 16));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [int] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m179l(java.io.DataInputStream r12) throws java.io.IOException {
        /*
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = 1
            r9 = -65536(0xffffffffffff0000, float:NaN)
            r1 = 0
            short r0 = r12.readShort()
            short r3 = r12.readShort()
            int[][] r2 = p000.C0003c.f387p
            if (r2 != 0) goto L_0x00e2
            r0 = 14
            int[] r0 = new int[]{r3, r0}
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            p000.C0003c.f387p = r0
            r2 = r1
        L_0x0024:
            if (r2 >= r3) goto L_0x00e8
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            byte r4 = r12.readByte()
            int r4 = r4 << 16
            short r5 = r12.readShort()
            r4 = r4 | r5
            r0[r1] = r4
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = 10
            byte r5 = r12.readByte()
            short r5 = (short) r5
            r5 = r5 & r11
            byte r6 = r12.readByte()
            short r6 = (short) r6
            int r6 = r6 << 16
            r6 = r6 & r9
            r5 = r5 | r6
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = 11
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = 12
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = 13
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = 4
            short r5 = r12.readShort()
            r0[r4] = r5
            r0 = r1
        L_0x007e:
            r4 = 5
            if (r0 >= r4) goto L_0x008d
            int[][] r4 = p000.C0003c.f387p
            r4 = r4[r2]
            int r5 = r0 + 5
            r6 = -1
            r4[r5] = r6
            int r0 = r0 + 1
            goto L_0x007e
        L_0x008d:
            byte r4 = r12.readByte()
            if (r4 < r10) goto L_0x00bb
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r5 = 3
            r6 = r0[r5]
            r6 = r6 | 1
            r0[r5] = r6
            r0 = r1
        L_0x009f:
            if (r0 >= r4) goto L_0x00bb
            int[][] r5 = p000.C0003c.f387p
            r5 = r5[r2]
            int r6 = r0 + 5
            byte r7 = r12.readByte()
            short r7 = (short) r7
            r7 = r7 & r11
            byte r8 = r12.readByte()
            short r8 = (short) r8
            int r8 = r8 << 16
            r8 = r8 & r9
            r7 = r7 | r8
            r5[r6] = r7
            int r0 = r0 + 1
            goto L_0x009f
        L_0x00bb:
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = r0[r10]
            r4 = r4 & r9
            r0[r10] = r4
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = r0[r10]
            short r5 = r12.readShort()
            r5 = r5 & r11
            r4 = r4 | r5
            r0[r10] = r4
            int[][] r0 = p000.C0003c.f387p
            r0 = r0[r2]
            r4 = 2
            byte r5 = r12.readByte()
            r0[r4] = r5
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0024
        L_0x00e2:
            int r0 = r0 + -2
            long r0 = (long) r0
            r12.skip(r0)
        L_0x00e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m179l(java.io.DataInputStream):void");
    }

    /* renamed from: m */
    public static final void m180m() {
        System.gc();
        f139j = new int[C0003c.f249a.length];
        f137i = new int[C0003c.f249a.length];
        f145m = new int[C0003c.f249a.length];
        f133g = (int[][]) Array.newInstance(Integer.TYPE, new int[]{2, C0003c.f249a.length});
        int i = 0;
        int i2 = 0;
        while (i < C0003c.f249a.length) {
            if (C0003c.f249a[i][5] - 3 <= C0003c.f414w[18] && C0003c.f249a[i][27] < 5) {
                int i3 = 0;
                while (i3 < i2 && f139j[i3] != C0003c.f249a[i][27]) {
                    i3++;
                }
                if (i3 == i2) {
                    int i4 = i2 + 1;
                    f139j[i2] = C0003c.f249a[i][27];
                    i2 = i4;
                }
            }
            i++;
        }
        if (i2 == 0) {
            int i5 = i2 + 1;
            f139j[i2] = C0003c.f249a[0][27];
            i2 = i5;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            int e = C0000HG.m58e(i2);
            int e2 = C0000HG.m58e(i2);
            int i7 = f139j[e];
            f139j[e] = f139j[e2];
            f139j[e2] = i7;
        }
        f104a = 1;
        if (i2 > 1 && C0000HG.m58e(5) == 0) {
            f104a++;
        }
        if (f104a > 2) {
            f104a = 2;
        }
        for (int i8 = 0; i8 < f104a; i8++) {
            int i9 = f139j[i8];
            int i10 = 0;
            for (int i11 = 0; i11 < C0003c.f249a.length; i11++) {
                if (C0003c.f249a[i11][27] == i9 && C0003c.f249a[i11][5] - 3 <= C0003c.f414w[18]) {
                    int i12 = i10 + 1;
                    f133g[i8][i10] = i11;
                    i10 = i12;
                }
            }
            if (i10 == 0) {
                int i13 = i10 + 1;
                f133g[i8][i10] = 0;
                i10 = i13;
            }
            for (int i14 = 0; i14 < i10; i14++) {
                int e3 = C0000HG.m58e(i10);
                int e4 = C0000HG.m58e(i10);
                int i15 = f133g[i8][e3];
                f133g[i8][e3] = f133g[i8][e4];
                f133g[i8][e4] = i15;
            }
            if (i10 > 2) {
                i10 = 2;
            }
            f145m[i8] = i10;
            int i16 = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                i16 += C0003c.f249a[f133g[i8][i17]][5];
            }
            int i18 = ((C0003c.f414w[18] * 5) / ((i16 / i10) + 1)) + 1;
            if (i18 < 3) {
                i18 = 3;
            }
            if (i18 > 6) {
                i18 = 6;
            }
            f137i[i8] = i18;
        }
    }

    /* renamed from: m */
    public static final void m181m(DataInputStream dataInputStream) throws IOException {
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        if (C0003c.f349g == null) {
            C0003c.f349g = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readShort2, 5});
            for (int i = 0; i < readShort2; i++) {
                C0003c.f349g[i][0] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f349g[i][1] = dataInputStream.readByte();
                C0003c.f349g[i][3] = dataInputStream.readByte();
                C0003c.f349g[i][2] = dataInputStream.readByte();
                C0003c.f349g[i][4] = dataInputStream.readByte();
                if (C0003c.f349g[i][1] == 0) {
                    C0003c.f400t++;
                } else if (C0003c.f349g[i][1] == 1) {
                    C0003c.f262ab++;
                }
            }
            return;
        }
        dataInputStream.skip((long) (readShort - 2));
    }

    /* renamed from: n */
    public static final void m182n() {
        int[] iArr = f127e[f101M];
        int i = f162v;
        iArr[i] = iArr[i] | 32768;
        for (int i2 = 0; i2 < C0003c.f391q.length; i2++) {
            int[] iArr2 = f127e[(short) ((C0003c.f391q[i2][0] & -65536) >> 16)];
            short s = (short) (C0003c.f391q[i2][0] & 65535);
            iArr2[s] = iArr2[s] | 32768;
        }
    }

    /* renamed from: n */
    public static final void m183n(DataInputStream dataInputStream) throws IOException {
        byte readByte = dataInputStream.readByte();
        C0003c.f341f = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readByte, 6});
        C0003c.m234a(C0003c.f341f);
        for (int i = 0; i < readByte; i++) {
            C0003c.f341f[i][4] = dataInputStream.readByte();
            C0003c.f341f[i][0] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            C0003c.f341f[i][5] = (((short) dataInputStream.readByte()) & 65535) | ((((short) dataInputStream.readByte()) << 16) & -65536);
            if (C0003c.f414w[11] >= 0 && (C0003c.f386p[C0003c.f414w[11]] & (1 << i)) != 0) {
                int[] iArr = C0003c.f341f[i];
                iArr[3] = iArr[3] | 65536;
            }
        }
    }

    /* renamed from: o */
    public static final void m184o() {
        f124d = new int[(C0003c.f391q.length + 1 + C0003c.f419x.length + C0003c.f359i.length + C0003c.f379n.length + C0003c.f371l.length + C0003c.f325d.length + C0003c.f423y.length + C0003c.f341f.length + C0003c.f363j.length + C0003c.f383o.length + C0003c.f411v.length)][];
        f124d[0] = C0003c.f414w;
        int[] iArr = C0003c.f414w;
        iArr[2] = iArr[2] & -65536;
        int[] iArr2 = C0003c.f414w;
        iArr2[2] = iArr2[2] | 0;
        int[] iArr3 = C0003c.f414w;
        iArr3[2] = iArr3[2] & 65535;
        int[] iArr4 = C0003c.f414w;
        iArr4[2] = iArr4[2] | 0;
        C0003c.f414w[1] = -1;
        C0003c.f414w[3] = 0;
        int[] iArr5 = C0003c.f414w;
        iArr5[3] = iArr5[3] | 16;
        int[] iArr6 = C0003c.f414w;
        iArr6[3] = iArr6[3] | 4;
        int[] iArr7 = C0003c.f414w;
        iArr7[3] = iArr7[3] | 8;
        int i = 1;
        for (int i2 = 0; i2 < C0003c.f391q.length; i2++) {
            f124d[i] = C0003c.f391q[i2];
            int[] iArr8 = f124d[i];
            iArr8[2] = iArr8[2] & -65536;
            int[] iArr9 = f124d[i];
            iArr9[2] = iArr9[2] | (((short) i) & 65535);
            int[] iArr10 = f124d[i];
            iArr10[2] = iArr10[2] & 65535;
            int[] iArr11 = f124d[i];
            iArr11[2] = iArr11[2] | ((((short) i2) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr12 = f124d[i];
            iArr12[3] = iArr12[3] | 32;
            int[] iArr13 = f124d[i];
            iArr13[3] = iArr13[3] | 8;
            int[] iArr14 = f124d[i];
            iArr14[3] = iArr14[3] | 4;
            i++;
        }
        for (int i3 = 0; i3 < C0003c.f419x.length; i3++) {
            f124d[i] = C0003c.f419x[i3];
            int[] iArr15 = f124d[i];
            iArr15[2] = iArr15[2] & -65536;
            int[] iArr16 = f124d[i];
            iArr16[2] = iArr16[2] | (((short) i) & 65535);
            int[] iArr17 = f124d[i];
            iArr17[2] = iArr17[2] & 65535;
            int[] iArr18 = f124d[i];
            iArr18[2] = iArr18[2] | ((((short) i3) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr19 = f124d[i];
            iArr19[3] = iArr19[3] | 4096;
            i++;
        }
        for (int i4 = 0; i4 < C0003c.f359i.length; i4++) {
            f124d[i] = C0003c.f359i[i4];
            int[] iArr20 = f124d[i];
            iArr20[2] = iArr20[2] & -65536;
            int[] iArr21 = f124d[i];
            iArr21[2] = iArr21[2] | (((short) i) & 65535);
            int[] iArr22 = f124d[i];
            iArr22[2] = iArr22[2] & 65535;
            int[] iArr23 = f124d[i];
            iArr23[2] = iArr23[2] | ((((short) i4) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr24 = f124d[i];
            iArr24[3] = iArr24[3] | 64;
            i++;
        }
        for (int i5 = 0; i5 < C0003c.f379n.length; i5++) {
            f124d[i] = C0003c.f379n[i5];
            int[] iArr25 = f124d[i];
            iArr25[2] = iArr25[2] & -65536;
            int[] iArr26 = f124d[i];
            iArr26[2] = iArr26[2] | (((short) i) & 65535);
            int[] iArr27 = f124d[i];
            iArr27[2] = iArr27[2] & 65535;
            int[] iArr28 = f124d[i];
            iArr28[2] = iArr28[2] | ((((short) i5) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr29 = f124d[i];
            iArr29[3] = iArr29[3] | 128;
            i++;
        }
        for (int i6 = 0; i6 < C0003c.f371l.length; i6++) {
            f124d[i] = C0003c.f371l[i6];
            int[] iArr30 = f124d[i];
            iArr30[2] = iArr30[2] & -65536;
            int[] iArr31 = f124d[i];
            iArr31[2] = iArr31[2] | (((short) i) & 65535);
            int[] iArr32 = f124d[i];
            iArr32[2] = iArr32[2] & 65535;
            int[] iArr33 = f124d[i];
            iArr33[2] = iArr33[2] | ((((short) i6) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr34 = f124d[i];
            iArr34[3] = iArr34[3] | 256;
            i++;
        }
        for (int i7 = 0; i7 < C0003c.f325d.length; i7++) {
            f124d[i] = C0003c.f325d[i7];
            int[] iArr35 = f124d[i];
            iArr35[2] = iArr35[2] & -65536;
            int[] iArr36 = f124d[i];
            iArr36[2] = iArr36[2] | (((short) i) & 65535);
            int[] iArr37 = f124d[i];
            iArr37[2] = iArr37[2] & 65535;
            int[] iArr38 = f124d[i];
            iArr38[2] = iArr38[2] | ((((short) i7) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr39 = f124d[i];
            iArr39[3] = iArr39[3] | 512;
            i++;
        }
        for (int i8 = 0; i8 < C0003c.f423y.length; i8++) {
            f124d[i] = C0003c.f423y[i8];
            int[] iArr40 = f124d[i];
            iArr40[2] = iArr40[2] & -65536;
            int[] iArr41 = f124d[i];
            iArr41[2] = iArr41[2] | (((short) i) & 65535);
            int[] iArr42 = f124d[i];
            iArr42[2] = iArr42[2] & 65535;
            int[] iArr43 = f124d[i];
            iArr43[2] = iArr43[2] | ((((short) i8) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr44 = f124d[i];
            iArr44[3] = iArr44[3] | 8192;
            i++;
        }
        for (int i9 = 0; i9 < C0003c.f341f.length; i9++) {
            f124d[i] = C0003c.f341f[i9];
            int[] iArr45 = f124d[i];
            iArr45[2] = iArr45[2] & -65536;
            int[] iArr46 = f124d[i];
            iArr46[2] = iArr46[2] | (((short) i) & 65535);
            int[] iArr47 = f124d[i];
            iArr47[2] = iArr47[2] & 65535;
            int[] iArr48 = f124d[i];
            iArr48[2] = iArr48[2] | ((((short) i9) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr49 = f124d[i];
            iArr49[3] = iArr49[3] | 1024;
            i++;
        }
        for (int i10 = 0; i10 < C0003c.f363j.length; i10++) {
            f124d[i] = C0003c.f363j[i10];
            int[] iArr50 = f124d[i];
            iArr50[2] = iArr50[2] & -65536;
            int[] iArr51 = f124d[i];
            iArr51[2] = iArr51[2] | (((short) i) & 65535);
            int[] iArr52 = f124d[i];
            iArr52[2] = iArr52[2] & 65535;
            int[] iArr53 = f124d[i];
            iArr53[2] = iArr53[2] | ((((short) i10) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr54 = f124d[i];
            iArr54[3] = iArr54[3] | 2048;
            int[] iArr55 = f124d[i];
            iArr55[3] = iArr55[3] | 8;
            int[] iArr56 = f124d[i];
            iArr56[3] = iArr56[3] | 65536;
            i++;
        }
        for (int i11 = 0; i11 < C0003c.f383o.length; i11++) {
            f124d[i] = C0003c.f383o[i11];
            int[] iArr57 = f124d[i];
            iArr57[2] = iArr57[2] & -65536;
            int[] iArr58 = f124d[i];
            iArr58[2] = iArr58[2] | (((short) i) & 65535);
            int[] iArr59 = f124d[i];
            iArr59[2] = iArr59[2] & 65535;
            int[] iArr60 = f124d[i];
            iArr60[2] = iArr60[2] | ((((short) i11) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr61 = f124d[i];
            iArr61[3] = iArr61[3] | 262144;
            int[] iArr62 = f124d[i];
            iArr62[3] = iArr62[3] | 8;
            int[] iArr63 = f124d[i];
            iArr63[3] = iArr63[3] | 32768;
            int[] iArr64 = f124d[i];
            iArr64[3] = iArr64[3] | 65536;
            i++;
        }
        for (int i12 = 0; i12 < C0003c.f411v.length; i12++) {
            f124d[i] = C0003c.f411v[i12];
            int[] iArr65 = f124d[i];
            iArr65[2] = iArr65[2] & -65536;
            int[] iArr66 = f124d[i];
            iArr66[2] = iArr66[2] | (((short) i) & 65535);
            int[] iArr67 = f124d[i];
            iArr67[2] = iArr67[2] & 65535;
            int[] iArr68 = f124d[i];
            iArr68[2] = iArr68[2] | ((((short) i12) << 16) & -65536);
            f124d[i][1] = -1;
            int[] iArr69 = f124d[i];
            iArr69[3] = iArr69[3] | 16384;
            int[] iArr70 = f124d[i];
            iArr70[3] = iArr70[3] | 8;
            i++;
        }
        for (int i13 = 0; i13 < i; i13++) {
            if ((f124d[i13][3] & 65536) == 0) {
                int b = m135b(f124d[i13]);
                m119a(f124d[i13], (int) (short) (b & 65535), (int) (short) ((b & -65536) >> 16));
            }
        }
    }

    /* renamed from: o */
    public static final void m185o(DataInputStream dataInputStream) throws IOException {
        m173i(dataInputStream);
        m189q(dataInputStream);
        m160d(dataInputStream);
        m152c(dataInputStream);
        m179l(dataInputStream);
        m187p(dataInputStream);
        m190r(dataInputStream);
        m165e(dataInputStream);
        m181m(dataInputStream);
    }

    /* renamed from: p */
    public static final void m186p() {
        int i;
        int i2;
        int i3;
        if (C0003c.f213Q == null) {
            C0003c.f213Q = new int[f117c];
            f117c = 0;
        }
        for (int i4 = 0; i4 < C0003c.f391q.length; i4++) {
            if (C0003c.f249a[C0003c.f391q[i4][11]][27] == 7 || C0003c.f249a[C0003c.f391q[i4][11]][27] == 8) {
                int[] iArr = C0003c.f391q[i4];
                iArr[17] = iArr[17] & -65536;
                int[] iArr2 = C0003c.f391q[i4];
                iArr2[17] = iArr2[17] | (((short) f117c) & 65535);
                short s = (short) (C0003c.f391q[i4][17] & 65535);
                int[] iArr3 = C0003c.f213Q;
                iArr3[s] = iArr3[s] & -65536;
                int[] iArr4 = C0003c.f213Q;
                iArr4[s] = iArr4[s] | 65535;
                int[] iArr5 = C0003c.f213Q;
                iArr5[s] = iArr5[s] & 65535;
                int[] iArr6 = C0003c.f213Q;
                iArr6[s] = iArr6[s] | 0;
                f117c++;
                if (C0003c.f249a[C0003c.f391q[i4][11]][27] == 7) {
                    int i5 = C0003c.f249a[C0003c.f391q[i4][11]][25];
                    int b = C0000HG.m40b(5, 15);
                    int[] iArr7 = C0003c.f213Q;
                    iArr7[s] = iArr7[s] & 65535;
                    int[] iArr8 = C0003c.f213Q;
                    iArr8[s] = iArr8[s] | ((((short) b) << 16) & -65536);
                    int length = C0003c.f333e.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= C0003c.f333e.length) {
                            i3 = length;
                            break;
                        } else if ((C0003c.f333e[i6][3] & 1) != 0) {
                            i3 = i6 - 1;
                            break;
                        } else {
                            i6++;
                        }
                    }
                    for (int i7 = 0; i7 < b; i7++) {
                        int a = C0003c.m234a(C0003c.f359i);
                        if (a >= 0) {
                            short s2 = (short) (C0003c.f359i[a][2] & 65535);
                            m114a(C0000HG.m58e(i3), C0000HG.m58e(100) < i5, f124d[s2]);
                            int[] iArr9 = f124d[s2];
                            iArr9[3] = iArr9[3] | 65536;
                            if ((f124d[s2][3] & 2) != 0) {
                                m135b(f124d[s2]);
                            }
                            short s3 = (short) (C0003c.f213Q[s] & 65535);
                            boolean z = false;
                            short s4 = s3;
                            while (true) {
                                if (s4 != -1) {
                                    if (f124d[s4][4] == f124d[s2][4] && f124d[s4][6] == -1 && f124d[s4][7] == -1 && f124d[s2][6] == -1 && f124d[s2][7] == -1) {
                                        f124d[s2][4] = -1;
                                        z = true;
                                        break;
                                    }
                                    s4 = (short) (f124d[s4][1] & 65535);
                                } else {
                                    break;
                                }
                            }
                            if (!z) {
                                int[] iArr10 = f124d[s2];
                                iArr10[1] = iArr10[1] & -65536;
                                int[] iArr11 = f124d[s2];
                                iArr11[1] = (((short) s3) & 65535) | iArr11[1];
                                int[] iArr12 = C0003c.f213Q;
                                iArr12[s] = iArr12[s] & -65536;
                                int[] iArr13 = C0003c.f213Q;
                                iArr13[s] = iArr13[s] | (((short) s2) & 65535);
                            }
                        }
                    }
                }
                int i8 = s + 1;
                int[] iArr14 = C0003c.f213Q;
                iArr14[i8] = iArr14[i8] & -65536;
                int[] iArr15 = C0003c.f213Q;
                iArr15[i8] = iArr15[i8] | 65535;
                int[] iArr16 = C0003c.f213Q;
                iArr16[i8] = iArr16[i8] & 65535;
                int[] iArr17 = C0003c.f213Q;
                iArr17[i8] = iArr17[i8] | 0;
                f117c++;
                if (C0003c.f249a[C0003c.f391q[i4][11]][27] == 7) {
                    int i9 = C0003c.f249a[C0003c.f391q[i4][11]][25];
                    int b2 = C0000HG.m40b(5, 15);
                    int[] iArr18 = C0003c.f213Q;
                    iArr18[i8] = iArr18[i8] & 65535;
                    int[] iArr19 = C0003c.f213Q;
                    iArr19[i8] = iArr19[i8] | ((((short) b2) << 16) & -65536);
                    int length2 = C0003c.f387p.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= C0003c.f387p.length) {
                            i2 = length2;
                            break;
                        } else if ((C0003c.f387p[i10][3] & 1) != 0) {
                            i2 = i10 - 1;
                            break;
                        } else {
                            i10++;
                        }
                    }
                    for (int i11 = 0; i11 < b2; i11++) {
                        int a2 = C0003c.m234a(C0003c.f379n);
                        if (a2 >= 0) {
                            short s5 = (short) (C0003c.f379n[a2][2] & 65535);
                            m114a(C0000HG.m58e(i2), C0000HG.m58e(100) < i9, f124d[s5]);
                            int[] iArr20 = f124d[s5];
                            iArr20[3] = iArr20[3] | 65536;
                            if ((f124d[s5][3] & 2) != 0) {
                                m135b(f124d[s5]);
                            }
                            short s6 = (short) (C0003c.f213Q[i8] & 65535);
                            boolean z2 = false;
                            short s7 = s6;
                            while (true) {
                                if (s7 != -1) {
                                    if (f124d[s7][4] == f124d[s5][4] && f124d[s7][6] == -1 && f124d[s7][7] == -1 && f124d[s5][6] == -1 && f124d[s5][7] == -1) {
                                        f124d[s5][4] = -1;
                                        z2 = true;
                                        break;
                                    }
                                    s7 = (short) (f124d[s7][1] & 65535);
                                } else {
                                    break;
                                }
                            }
                            if (!z2) {
                                int[] iArr21 = f124d[s5];
                                iArr21[1] = iArr21[1] & -65536;
                                int[] iArr22 = f124d[s5];
                                iArr22[1] = (((short) s6) & 65535) | iArr22[1];
                                int[] iArr23 = C0003c.f213Q;
                                iArr23[i8] = iArr23[i8] & -65536;
                                int[] iArr24 = C0003c.f213Q;
                                iArr24[i8] = iArr24[i8] | (((short) s5) & 65535);
                            }
                        }
                    }
                }
                int i12 = i8 + 1;
                int[] iArr25 = C0003c.f213Q;
                iArr25[i12] = iArr25[i12] & -65536;
                int[] iArr26 = C0003c.f213Q;
                iArr26[i12] = iArr26[i12] | 65535;
                int[] iArr27 = C0003c.f213Q;
                iArr27[i12] = iArr27[i12] & 65535;
                int[] iArr28 = C0003c.f213Q;
                iArr28[i12] = iArr28[i12] | 0;
                f117c++;
                int i13 = 3;
                int length3 = C0003c.f395r.length - 1;
                if (C0003c.f249a[C0003c.f391q[i4][11]][27] == 7) {
                    i13 = 1;
                    length3 = 2;
                }
                int b3 = C0000HG.m40b(5, 15);
                int[] iArr29 = C0003c.f213Q;
                iArr29[i12] = iArr29[i12] & 65535;
                int[] iArr30 = C0003c.f213Q;
                iArr30[i12] = ((((short) b3) << 16) & -65536) | iArr30[i12];
                while (i13 <= length3) {
                    if (C0003c.f395r[i13][5] != 0 && C0003c.f414w[18] >= C0003c.f395r[i13][5]) {
                        int a3 = C0003c.m234a(C0003c.f371l);
                        if (a3 >= 0) {
                            short s8 = (short) (C0003c.f371l[a3][2] & 65535);
                            C0003c.f371l[a3][4] = i13;
                            if (C0003c.f249a[C0003c.f391q[i4][11]][27] == 7) {
                                C0003c.f371l[a3][6] = C0000HG.m40b(100, 300);
                            } else {
                                C0003c.f371l[a3][6] = C0000HG.m40b(5, 10);
                            }
                            int[] iArr31 = f124d[s8];
                            iArr31[3] = iArr31[3] | 65536;
                            if ((f124d[s8][3] & 2) != 0) {
                                m135b(f124d[s8]);
                            }
                            short s9 = (short) (C0003c.f213Q[i12] & 65535);
                            int[] iArr32 = f124d[s8];
                            iArr32[1] = iArr32[1] & -65536;
                            int[] iArr33 = f124d[s8];
                            iArr33[1] = (((short) s9) & 65535) | iArr33[1];
                            int[] iArr34 = C0003c.f213Q;
                            iArr34[i12] = iArr34[i12] & -65536;
                            int[] iArr35 = C0003c.f213Q;
                            iArr35[i12] = (((short) s8) & 65535) | iArr35[i12];
                        }
                    }
                    i13++;
                }
                int i14 = i12 + 1;
                int[] iArr36 = C0003c.f213Q;
                iArr36[i14] = iArr36[i14] & -65536;
                int[] iArr37 = C0003c.f213Q;
                iArr37[i14] = iArr37[i14] | 65535;
                int[] iArr38 = C0003c.f213Q;
                iArr38[i14] = iArr38[i14] & 65535;
                int[] iArr39 = C0003c.f213Q;
                iArr39[i14] = iArr39[i14] | 0;
                f117c++;
                if (C0003c.f249a[C0003c.f391q[i4][11]][27] == 8) {
                    int i15 = C0003c.f249a[C0003c.f391q[i4][11]][25];
                    int b4 = C0000HG.m40b(5, 15);
                    int[] iArr40 = C0003c.f213Q;
                    iArr40[i14] = iArr40[i14] & 65535;
                    int[] iArr41 = C0003c.f213Q;
                    iArr41[i14] = iArr41[i14] | ((((short) b4) << 16) & -65536);
                    int length4 = C0003c.f354h.length;
                    int i16 = 0;
                    while (true) {
                        if (i16 >= C0003c.f354h.length) {
                            i = length4;
                            break;
                        } else if ((C0003c.f354h[i16][3] & 1) != 0) {
                            i = i16 - 1;
                            break;
                        } else {
                            i16++;
                        }
                    }
                    for (int i17 = 0; i17 < b4; i17++) {
                        int a4 = C0003c.m234a(C0003c.f423y);
                        if (a4 >= 0) {
                            short s10 = (short) (C0003c.f423y[a4][2] & 65535);
                            m114a(C0000HG.m58e(i), C0000HG.m58e(100) < i15, f124d[s10]);
                            int[] iArr42 = f124d[s10];
                            iArr42[3] = iArr42[3] | 65536;
                            if ((f124d[s10][3] & 2) != 0) {
                                m135b(f124d[s10]);
                            }
                            short s11 = (short) (C0003c.f213Q[i14] & 65535);
                            boolean z3 = false;
                            short s12 = s11;
                            while (true) {
                                if (s12 != -1) {
                                    if (f124d[s12][4] == f124d[s10][4] && f124d[s12][6] == -1 && f124d[s12][7] == -1 && f124d[s10][6] == -1 && f124d[s10][7] == -1) {
                                        f124d[s10][4] = -1;
                                        z3 = true;
                                        break;
                                    }
                                    s12 = (short) (f124d[s12][1] & 65535);
                                } else {
                                    break;
                                }
                            }
                            if (!z3) {
                                int[] iArr43 = f124d[s10];
                                iArr43[1] = iArr43[1] & -65536;
                                int[] iArr44 = f124d[s10];
                                iArr44[1] = (((short) s11) & 65535) | iArr44[1];
                                int[] iArr45 = C0003c.f213Q;
                                iArr45[i14] = iArr45[i14] & -65536;
                                int[] iArr46 = C0003c.f213Q;
                                iArr46[i14] = iArr46[i14] | (((short) s10) & 65535);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m187p(java.io.DataInputStream r11) throws java.io.IOException {
        /*
            r10 = 1
            r9 = 65535(0xffff, float:9.1834E-41)
            r8 = -65536(0xffffffffffff0000, float:NaN)
            short r0 = r11.readShort()
            short r2 = r11.readShort()
            int[][] r1 = p000.C0003c.f415w
            if (r1 != 0) goto L_0x00a4
            r0 = 6
            int[] r0 = new int[]{r2, r0}
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            int[][] r0 = (int[][]) r0
            p000.C0003c.f415w = r0
            r0 = 0
            r1 = r0
        L_0x0023:
            if (r1 >= r2) goto L_0x00aa
            int r0 = r11.readInt()
            int[][] r3 = p000.C0003c.f415w
            r3 = r3[r1]
            r4 = 2
            int r5 = r0 >> 24
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            int r5 = r5 << 12
            int r6 = f136i
            int r5 = r5 / r6
            short r5 = (short) r5
            r5 = r5 & r9
            int r6 = r0 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            int r6 = r6 << 12
            int r7 = f136i
            int r6 = r6 / r7
            short r6 = (short) r6
            int r6 = r6 << 16
            r6 = r6 & r8
            r5 = r5 | r6
            r3[r4] = r5
            int[][] r3 = p000.C0003c.f415w
            r3 = r3[r1]
            r4 = 3
            int r5 = r0 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            int r5 = r5 << 12
            int r6 = f136i
            int r5 = r5 / r6
            short r5 = (short) r5
            r5 = r5 & r9
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            int r0 = r0 << 12
            int r6 = f136i
            int r0 = r0 / r6
            short r0 = (short) r0
            int r0 = r0 << 16
            r0 = r0 & r8
            r0 = r0 | r5
            r3[r4] = r0
            int[][] r0 = p000.C0003c.f415w
            r0 = r0[r1]
            r3 = 4
            byte r4 = r11.readByte()
            int r4 = r4 << 12
            int r5 = f136i
            int r4 = r4 / r5
            r0[r3] = r4
            short r3 = r11.readShort()
            byte r0 = r11.readByte()
            r4 = r0 & 128(0x80, float:1.794E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r4 != r5) goto L_0x0093
            int[][] r4 = p000.C0003c.f415w
            r4 = r4[r1]
            r5 = 5
            r4[r5] = r10
            r0 = r0 & 127(0x7f, float:1.78E-43)
            byte r0 = (byte) r0
        L_0x0093:
            int[][] r4 = p000.C0003c.f415w
            r4 = r4[r1]
            short r3 = (short) r3
            r3 = r3 & r9
            short r0 = (short) r0
            int r0 = r0 << 16
            r0 = r0 & r8
            r0 = r0 | r3
            r4[r10] = r0
            int r0 = r1 + 1
            r1 = r0
            goto L_0x0023
        L_0x00a4:
            int r0 = r0 + -2
            long r0 = (long) r0
            r11.skip(r0)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m187p(java.io.DataInputStream):void");
    }

    /* renamed from: q */
    public static final void m188q() {
        C0003c.m202J();
        C0003c.m337c();
        C0003c.m198F();
        C0003c.m215W();
        m172i();
        m163e();
        C0003c.m199G();
        C0003c.m301ab();
        C0003c.m207O();
        C0003c.m196D();
        C0003c.m300aa();
        f154r = -1;
        f94F = -1;
        f115b = null;
        C0003c.f217S = null;
        C0003c.f298b = null;
        C0003c.f391q = null;
        C0003c.f359i = null;
        C0003c.f379n = null;
        C0003c.f371l = null;
        C0003c.f325d = null;
        C0003c.f419x = null;
        C0003c.f423y = null;
        C0003c.f341f = null;
        C0003c.f213Q = null;
        f117c = 0;
        f93E = 0;
        C0003c.f297b = null;
        C0003c.f403t = null;
        C0003c.f414w[11] = -1;
        C0003c.f264ad = 3;
        C0003c.f389q = false;
        C0003c.f401t = false;
        for (int[] iArr : C0003c.f367k) {
            iArr[0] = 0;
        }
        f138j = 0;
        C0003c.f397s = false;
        C0003c.f385p = false;
        System.gc();
    }

    /* renamed from: q */
    public static final void m189q(DataInputStream dataInputStream) throws IOException {
        short readShort = dataInputStream.readShort();
        short readShort2 = dataInputStream.readShort();
        if (C0003c.f395r == null) {
            C0003c.f395r = (int[][]) Array.newInstance(Integer.TYPE, new int[]{readShort2, 7});
            for (int i = 0; i < readShort2; i++) {
                C0003c.f395r[i][0] = (dataInputStream.readByte() << 16) | dataInputStream.readShort();
                C0003c.f395r[i][5] = dataInputStream.readByte();
                C0003c.f395r[i][3] = dataInputStream.readByte();
                C0003c.f395r[i][6] = dataInputStream.readByte();
                C0003c.f395r[i][4] = dataInputStream.readShort();
                int[] iArr = C0003c.f395r[i];
                iArr[1] = iArr[1] & -65536;
                int[] iArr2 = C0003c.f395r[i];
                iArr2[1] = iArr2[1] | (dataInputStream.readShort() & 65535);
                C0003c.f395r[i][2] = dataInputStream.readByte();
            }
            return;
        }
        dataInputStream.skip((long) (readShort - 2));
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [int] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m190r(java.io.DataInputStream r12) throws java.io.IOException {
        /*
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = -65536(0xffffffffffff0000, float:NaN)
            r9 = 1
            r1 = 0
            short r0 = r12.readShort()
            short r3 = r12.readShort()
            int[][] r2 = p000.C0003c.f354h
            if (r2 != 0) goto L_0x00bf
            r0 = 12
            int[] r0 = new int[]{r3, r0}
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            p000.C0003c.f354h = r0
            r2 = r1
        L_0x0024:
            if (r2 >= r3) goto L_0x00c5
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            byte r4 = r12.readByte()
            int r4 = r4 << 16
            short r5 = r12.readShort()
            r4 = r4 | r5
            r0[r1] = r4
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r4 = 10
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r4 = 11
            byte r5 = r12.readByte()
            r0[r4] = r5
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r4 = 4
            short r5 = r12.readShort()
            r0[r4] = r5
            r0 = r1
        L_0x005b:
            r4 = 5
            if (r0 >= r4) goto L_0x006a
            int[][] r4 = p000.C0003c.f354h
            r4 = r4[r2]
            int r5 = r0 + 5
            r6 = -1
            r4[r5] = r6
            int r0 = r0 + 1
            goto L_0x005b
        L_0x006a:
            byte r4 = r12.readByte()
            if (r4 < r9) goto L_0x0098
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r5 = 3
            r6 = r0[r5]
            r6 = r6 | 1
            r0[r5] = r6
            r0 = r1
        L_0x007c:
            if (r0 >= r4) goto L_0x0098
            int[][] r5 = p000.C0003c.f354h
            r5 = r5[r2]
            int r6 = r0 + 5
            byte r7 = r12.readByte()
            short r7 = (short) r7
            r7 = r7 & r11
            byte r8 = r12.readByte()
            short r8 = (short) r8
            int r8 = r8 << 16
            r8 = r8 & r10
            r7 = r7 | r8
            r5[r6] = r7
            int r0 = r0 + 1
            goto L_0x007c
        L_0x0098:
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r4 = r0[r9]
            r4 = r4 & r10
            r0[r9] = r4
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r4 = r0[r9]
            short r5 = r12.readShort()
            r5 = r5 & r11
            r4 = r4 | r5
            r0[r9] = r4
            int[][] r0 = p000.C0003c.f354h
            r0 = r0[r2]
            r4 = 2
            byte r5 = r12.readByte()
            r0[r4] = r5
            int r0 = r2 + 1
            r2 = r0
            goto L_0x0024
        L_0x00bf:
            int r0 = r0 + -2
            long r0 = (long) r0
            r12.skip(r0)
        L_0x00c5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0001a.m190r(java.io.DataInputStream):void");
    }
}
