import javax.microedition.media.Controllable;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.media.Player;
import javax.microedition.media.Manager;
import java.io.OutputStream;
import javax.microedition.rms.RecordStoreNotFoundException;
import javax.microedition.rms.RecordStore;
import java.io.IOException;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import java.io.InputStream;
import java.util.Stack;
import java.util.Vector;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Random;
import javax.microedition.media.PlayerListener;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.midlet.MIDlet;

// 
// Decompiled by Procyon v0.5.36
// 

public class HG extends MIDlet implements CommandListener, PlayerListener
{
    public static char[] a;
    public static final Random b;
    public static String c;
    static boolean d;
    static int e;
    static int f;
    static int g;
    static ByteArrayOutputStream h;
    static DataOutputStream i;
    static ByteArrayInputStream j;
    static DataInputStream k;
    static String[] l;
    static byte[] m;
    static boolean[] n;
    static String[][] o;
    static byte[] p;
    static byte q;
    static String r;
    static String[][] s;
    static String t;
    public static int[][] u;
    public static Object[] v;
    public static int[][] w;
    public static byte[] x;
    public static int[] y;
    public static long[] z;
    public static short aa;
    public static short ba;
    public static final String[] ca;
    public static final String[] da;
    public static int ea;
    public static D fa;
    static int ga;
    public static int ha;
    static boolean ia;
    static int ja;
    static boolean ka;
    public static String la;
    public static boolean ma;
    public static int na;
    public static Vector oa;
    public static Vector pa;
    public static int qa;
    public static int[] ra;
    static int[] sa;
    static int ta;
    static int ua;
    static int va;
    static int wa;
    static int xa;
    static int ya;
    static int za;
    static int aA;
    static int bA;
    static int cA;
    static int dA;
    static int eA;
    static int fA;
    static boolean gA;
    static short[][] hA;
    static boolean iA;
    static short jA;
    static int kA;
    static Stack lA;
    static String[] mA;
    static String[][] nA;
    static int oA;
    static int pA;
    static byte[] qA;
    static int rA;
    static int sA;
    static int tA;
    static int uA;
    static int vA;
    static int wA;
    static boolean xA;
    static boolean yA;
    static boolean zA;
    static int ab;
    static int bb;
    static int cb;
    private static byte[] db;
    static A eb;
    static HG fb;
    
    public static DataInputStream A(final String name) throws NullPointerException {
        DataInputStream dataInputStream = null;
        try {
            final InputStream resourceAsStream = HG.fb.getClass().getResourceAsStream(name);
            if (resourceAsStream != null) {
                dataInputStream = new DataInputStream(resourceAsStream);
            }
        }
        catch (Exception ex) {}
        if (dataInputStream == null) {
            throw new NullPointerException();
        }
        return dataInputStream;
    }
    
    public static String[] A(String s, final Font font, int i, final int n) {
        s.length();
        int n2 = 0;
        int n3 = 0;
        String str = "";
        String str2 = "";
        if (n > 0) {
            i -= n * font.charWidth(' ');
        }
        while (s.length() > 0) {
            int length = s.length();
            for (int j = 0; j < HG.a.length; ++j) {
                final int index = s.indexOf(HG.a[j]);
                if (index < length && index != -1) {
                    length = index;
                }
            }
            String str3;
            if (length == s.length()) {
                str3 = s.substring(0, length);
                s = "";
            }
            else {
                str3 = s.substring(0, length + 1);
                s = s.substring(length + 1, s.length());
            }
            int n4;
            if (str3.length() <= 1) {
                n4 = font.charsWidth(str3.toCharArray(), 0, str3.length());
            }
            else {
                n4 = font.charsWidth(str3.trim().toCharArray(), 0, str3.trim().length());
            }
            int charWidth = 0;
            if (str3.trim().length() != str3.length()) {
                charWidth = font.charWidth(' ');
            }
            if (n2 + n4 < i && str.indexOf(10) == -1) {
                str += str3;
                n2 += n4 + charWidth;
            }
            else {
                int k = 0;
                if (n4 > i) {
                    while (k < str3.length()) {
                        if (n2 + font.charWidth(str3.charAt(k)) < i) {
                            n2 += font.charWidth(str3.charAt(k));
                            ++k;
                        }
                        else {
                            if (k > 1) {
                                str += str3.substring(0, k - 1);
                                str3 = str3.substring(k - 1, str3.length());
                                n4 = font.charsWidth(str3.trim().toCharArray(), 0, str3.trim().length());
                            }
                            if (n4 < i) {
                                if (str.indexOf(10) == 0) {
                                    ++n3;
                                }
                                str2 += str;
                                if (str.indexOf(10) == -1 || str.indexOf(10) == 0) {
                                    str2 += '\n';
                                }
                                str = str3;
                                n2 = n4 + charWidth;
                                ++n3;
                                break;
                            }
                            if (str.indexOf(10) == 0) {
                                ++n3;
                            }
                            str2 += str;
                            if (str.indexOf("\n") == -1 || str.indexOf(10) == 0) {
                                str2 += '\n';
                            }
                            str = "";
                            ++n3;
                            n2 = 0;
                            k = 0;
                        }
                    }
                }
                else {
                    if (str.length() > 0) {
                        if (str.indexOf(10) == -1 && str3.indexOf(10) != 0) {
                            str += '\n';
                        }
                        str2 += str;
                        if (str3.indexOf(10) != 0 || (s.indexOf(10) == 0 && str3.indexOf(10) == 0) || str.indexOf(10) != -1) {
                            if (str3.indexOf(10) != -1 && str.indexOf(10) == -1) {
                                --n3;
                            }
                            ++n3;
                        }
                    }
                    str = str3;
                    n2 = n4 + charWidth;
                }
            }
            if (s.length() == 0 && str3.length() > 0) {
                str2 += str;
            }
        }
        final String[] array = new String[n3 + 1];
        String string = "";
        if (n > 0) {
            for (int l = 0; l < n; ++l) {
                string += ' ';
            }
        }
        i = 0;
        int n5 = 0;
        while (i != -1) {
            if (n3 + 1 == n5) {
                break;
            }
            i = str2.indexOf("\n");
            if (i == -1) {
                s = str2.substring(0, str2.length());
            }
            else {
                s = str2.substring(0, i);
            }
            array[n5] = s.trim();
            if (n > 0) {
                array[n5] = string + array[n5];
            }
            if (i >= str2.length() || i == -1) {
                str2 = "";
                break;
            }
            str2 = str2.substring(i + 1, str2.length());
            ++n5;
        }
        if (n3 > 0 && str2.length() > 0) {
            if (n > 0) {
                array[n5] = string + str2;
            }
            else {
                array[n5] = str2;
            }
        }
        return array;
    }
    
    public static final int A(int n, int n2) {
        if (n2 == n) {
            return n;
        }
        if (n2 < n) {
            final int n3 = n;
            n = n2;
            n2 = n3;
        }
        n2 = n2 - n + 1;
        return n + (HG.b.nextInt() & Integer.MAX_VALUE) % n2;
    }
    
    public static final int A(final int n) {
        if (n <= 0) {
            return 0;
        }
        return (HG.b.nextInt() & Integer.MAX_VALUE) % n;
    }
    
    public static final int A() {
        return HG.b.nextInt() & Integer.MAX_VALUE;
    }
    
    public static void B() {
        InputStream resourceAsStream = null;
        HG.c = null;
        try {
            resourceAsStream = HG.fb.getClass().getResourceAsStream("/mi");
            final byte[] b = new byte[2];
            resourceAsStream.read(b, 0, 2);
            final int len = (b[0] & 0xFF) << 8 | (b[1] & 0xFF);
            if (len > 0) {
                final byte[] array = new byte[len];
                if (resourceAsStream.read(array, 0, len) == len) {
                    HG.c = new String(array);
                }
            }
        }
        catch (Exception ex) {
            try {
                resourceAsStream.close();
            }
            catch (Exception ex2) {}
        }
        finally {
            try {
                resourceAsStream.close();
            }
            catch (Exception ex3) {}
        }
        if (HG.c != null) {
            int d = D(0, 383);
            if (d == -1) {
                d = HG.hA[0].length / 4 - 1;
            }
            A(0, d + 1, 388, 5, 101, -1);
        }
    }
    
    public static boolean C() {
        boolean platformRequest = false;
        if (HG.c != null) {
            try {
                platformRequest = HG.fb.platformRequest(HG.c);
            }
            catch (Exception ex) {}
        }
        return platformRequest;
    }
    
    void D() {
        HG.e = Display.getDisplay((MIDlet)this).numAlphaLevels();
        if (HG.e > 2) {
            HG.d = true;
        }
        else {
            HG.d = false;
        }
    }
    
    public static int[] E() {
        int[] array = null;
        try {
            final DataInputStream dataInputStream = new DataInputStream(A("c"));
            HG.f = dataInputStream.readInt();
            array = new int[HG.f];
            for (int i = 0; i < HG.f; ++i) {
                array[i] = dataInputStream.readInt();
            }
        }
        catch (Exception ex) {}
        return array;
    }
    
    public static Font[] F() {
        final Font[] array = new Font[3];
        for (int i = 0; i < 3; ++i) {
            array[i] = Font.getDefaultFont();
        }
        try {
            final DataInputStream dataInputStream = new DataInputStream(A("f"));
            for (short short1 = dataInputStream.readShort(), n = 0; n < short1; ++n) {
                final short short2 = dataInputStream.readShort();
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                if ((short2 >> 0 & 0x1) == 0x1) {
                    n2 = 32;
                }
                else if ((short2 >> 2 & 0x1) == 0x1) {
                    n2 = 64;
                }
                if ((short2 >> 4 & 0x1) == 0x1) {
                    n3 = 8;
                }
                else if ((short2 >> 5 & 0x1) == 0x1) {
                    n3 = 16;
                }
                if ((short2 >> 6 & 0x1) == 0x1) {
                    n4 = 1;
                }
                if ((short2 >> 7 & 0x1) == 0x1) {
                    n4 |= 0x2;
                }
                if ((short2 >> 8 & 0x1) == 0x1) {
                    n4 |= 0x4;
                }
                array[n] = Font.getFont(n2, n4, n3);
            }
        }
        catch (Exception ex) {}
        return array;
    }
    
    public static final int[] G() throws IOException {
        final int[] array = new int[HG.k.readShort()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = HG.k.readInt();
        }
        return array;
    }
    
    public static final void A(final int[] array) throws IOException {
        HG.i.writeShort(array.length);
        for (int i = 0; i < array.length; ++i) {
            HG.i.writeInt(array[i]);
        }
    }
    
    public static final boolean B(final int i) {
        RecordStore openRecordStore;
        try {
            openRecordStore = RecordStore.openRecordStore("RECSTR" + i, false);
        }
        catch (Exception ex) {
            return false;
        }
        if (openRecordStore != null) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
        }
        return true;
    }
    
    public static final void C(final int n) {
        if (!B(n)) {
            return;
        }
        try {
            final RecordStore openRecordStore = RecordStore.openRecordStore("RECSTR" + n, false);
            if (openRecordStore.getNumRecords() == 1) {
                openRecordStore.deleteRecord(1);
            }
            openRecordStore.closeRecordStore();
            RecordStore.deleteRecordStore("RECSTR" + n);
        }
        catch (Exception ex) {}
    }
    
    public static final byte[] D(int record) {
        HG.g = -1;
        RecordStore openRecordStore = null;
        try {
            openRecordStore = RecordStore.openRecordStore("RECSTR" + i, false);
            record = (int)(Object)openRecordStore.getRecord(1);
            HG.g = 0;
        }
        catch (Exception ex) {
            record = (int)null;
            HG.g = -1;
        }
        if (openRecordStore != null) {
            try {
                openRecordStore.closeRecordStore();
            }
            catch (Exception ex2) {}
        }
        return (byte[])(Object)record;
    }
    
    public static final int A(final int i, final byte[] array) {
        HG.g = 0;
        RecordStore openRecordStore = null;
        boolean b = false;
        try {
            openRecordStore = RecordStore.openRecordStore("RECSTR" + i, true);
            if (openRecordStore.getNumRecords() < 1) {
                openRecordStore.addRecord(array, 0, 1);
                b = true;
            }
            if (openRecordStore.getSizeAvailable() < array.length * 2) {
                HG.g = -2;
            }
            else {
                openRecordStore.setRecord(1, array, 0, array.length);
                b = false;
            }
        }
        catch (RecordStoreNotFoundException ex) {
            HG.g = -2;
        }
        catch (Exception ex2) {
            HG.g = -1;
        }
        if (openRecordStore != null) {
            try {
                openRecordStore.closeRecordStore();
                if (b) {
                    C(i);
                }
            }
            catch (Exception ex3) {}
        }
        return HG.g;
    }
    
    public static void H() {
        if (HG.h == null) {
            HG.h = new ByteArrayOutputStream();
        }
        else {
            HG.h.reset();
        }
        if (HG.i == null) {
            HG.i = new DataOutputStream(HG.h);
        }
    }
    
    public static void E(final int n) {
        if (HG.h != null) {
            final byte[] byteArray = HG.h.toByteArray();
            if (byteArray.length > 0) {
                A(n, byteArray);
            }
        }
    }
    
    public static void F(final int n) {
        H();
        final byte[] d = D(n);
        if (d != null) {
            HG.j = new ByteArrayInputStream(d);
            HG.k = new DataInputStream(HG.j);
        }
    }
    
    public static int I() {
        InputStream resourceAsStream;
        try {
            resourceAsStream = HG.fb.getClass().getResourceAsStream("/ldf");
        }
        catch (Exception ex) {
            return -1;
        }
        if (resourceAsStream == null) {
            return -1;
        }
        try {
            resourceAsStream.read();
            HG.q = (byte)resourceAsStream.read();
            final byte[] array = new byte[(byte)resourceAsStream.read()];
            resourceAsStream.read(array);
            HG.r = new String(array);
            if (HG.q == 3) {
                final byte b = (byte)resourceAsStream.read();
                HG.s = new String[b][2];
                for (byte b2 = 0; b2 < b; ++b2) {
                    final byte[] array2 = new byte[(byte)resourceAsStream.read()];
                    resourceAsStream.read(array2);
                    HG.s[b2][0] = new String(array2);
                    final byte[] array3 = new byte[(byte)resourceAsStream.read()];
                    resourceAsStream.read(array3);
                    HG.s[b2][1] = new String(array3);
                }
            }
            try {
                resourceAsStream.close();
            }
            catch (Exception ex2) {
                return -1;
            }
        }
        catch (Exception ex3) {
            return -1;
        }
        finally {
            try {
                resourceAsStream.close();
            }
            catch (Exception ex4) {
                return -1;
            }
        }
        return 0;
    }
    
    public static int B(final String s) {
        int j = 0;
        switch (HG.q) {
            case 0: {
                j = -1;
                break;
            }
            case 1: {
                HG.t = HG.r;
                break;
            }
            case 2: {
                HG.t = s;
                break;
            }
            case 3: {
                for (int n = 0, n2 = 1; n < HG.s.length && n2 != 0; ++n) {
                    if (HG.s[n][0].compareTo(s) == 0) {
                        HG.t = HG.s[n][1];
                        n2 = 0;
                    }
                }
                break;
            }
        }
        if (j != -1) {
            j = J();
        }
        return j;
    }
    
    public static int J() {
        int n = 0;
        for (int i = 0; i < HG.l.length; ++i) {
            if (HG.o[i] == null) {
                if ((HG.m[i] == 1 || (HG.m[i] != 0 && HG.n[i])) && G(i) == -1) {
                    n = -1;
                    break;
                }
            }
            else if (HG.m[i] != 1 && !HG.n[i]) {
                HG.o[i] = null;
            }
        }
        return n;
    }
    
    public static int G(final int n) {
        InputStream resourceAsStream = null;
        try {
            if (HG.t == null) {
                HG.t = HG.r;
            }
            resourceAsStream = HG.fb.getClass().getResourceAsStream("/" + HG.t + "." + HG.l[n] + "." + "lng");
            if (resourceAsStream == null) {
                return -1;
            }
            final byte[] b = new byte[2];
            resourceAsStream.read(b, 0, 2);
            final int len = ((b[1] & 0xFF) << 8 | (b[0] & 0xFF)) - 2;
            if (len < 0) {
                return -1;
            }
            final byte[] array = new byte[len];
            if (resourceAsStream.read(array, 0, len) != len) {
                HG.o[n] = new String[0];
                return -1;
            }
            final int n2 = (array[2] & 0xFF) << 8 | (array[1] & 0xFF);
            HG.p = array;
            HG.o[n] = new String[n2];
            for (int i = 0; i < n2; ++i) {
                HG.o[n][i] = H(i);
            }
        }
        catch (Exception ex) {}
        finally {
            try {
                resourceAsStream.close();
            }
            catch (Exception ex2) {}
            HG.p = null;
        }
        return 0;
    }
    
    public static String H(int i) {
        String s = "";
        if (HG.q == 0) {
            return "null_3";
        }
        i = ++i * 2;
        if (i < 0 || i >= HG.p.length) {
            return "";
        }
        final int n = (HG.p[i + 4] & 0xFF) << 8 | (HG.p[i + 3] & 0xFF);
        i = ((HG.p[i + 2] & 0xFF) << 8 | (HG.p[i + 1] & 0xFF));
        if (i >= HG.p.length) {
            return "";
        }
        final byte[] bytes = new byte[n - i];
        System.arraycopy(HG.p, i, bytes, 0, bytes.length);
        switch (HG.p[0]) {
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
    
    public static String I(final int n) {
        String i = "";
        final int n2 = n & 0xFFFF;
        final int n3 = (n & 0xFF0000) >> 16;
        if (HG.o != null) {
            if (n3 >= 0) {
                if (n3 < HG.o.length) {
                    if (HG.o[n3] == null) {
                        if (HG.m[n3] == 4) {
                            G(n3);
                            if (HG.o[n3] != null) {
                                i = I(n);
                            }
                        }
                    }
                    else if (n2 >= 0) {
                        if (n2 < HG.o[n3].length) {
                            if (HG.o[n3][n2] != null) {
                                i = HG.o[n3][n2];
                            }
                        }
                    }
                }
            }
        }
        return i;
    }
    
    public static void J(final int n) {
        if (n >= 0) {
            final int n2 = HG.u[n][0];
            final int i = HG.u[n][1];
            final int n3 = HG.u[n][2];
            int n4 = 1;
            if (HG.w[n][1] != -1) {
                n4 = 0;
            }
            if (n4 != 0) {
                for (int j = 0; j < HG.ea; ++j) {
                    if (HG.w[j][1] == i) {
                        n4 = 0;
                        HG.w[n][0] = n2;
                        HG.w[n][1] = HG.w[j][1];
                        HG.w[n][2] = j;
                        break;
                    }
                }
            }
            if (n4 != 0) {
                String str = "";
                if (i < 10) {
                    str = "0";
                }
                final String string = "/" + str + i + HG.ca[n3];
                final String s = HG.da[n3];
                InputStream resourceAsStream = null;
                try {
                    resourceAsStream = HG.fb.getClass().getResourceAsStream(string);
                }
                catch (Exception ex) {}
                try {
                    resourceAsStream.available();
                    HG.v[n] = Manager.createPlayer(resourceAsStream, s);
                }
                catch (Exception ex2) {}
                final Player player = (Player)HG.v[n];
                try {
                    player.realize();
                }
                catch (Exception ex3) {}
                try {
                    player.prefetch();
                }
                catch (Exception ex4) {}
                try {
                    player.addPlayerListener((PlayerListener)HG.fb);
                }
                catch (Exception ex5) {}
                HG.v[n] = player;
                HG.w[n][0] = n2;
                HG.w[n][2] = n;
                HG.w[n][1] = i;
                try {
                    resourceAsStream.close();
                }
                catch (Exception ex6) {}
            }
            if (HG.v[HG.w[n][2]] == null) {
                for (int k = 0; k < HG.ea; ++k) {
                    if (HG.w[k][1] == HG.w[n][1]) {
                        HG.w[k][2] = -1;
                        HG.w[k][1] = -1;
                        HG.w[k][0] = -1;
                    }
                }
                ++HG.ga;
                if (HG.ga <= 2) {
                    J(n);
                }
            }
        }
    }
    
    public static void K(int state) {
        Object o = null;
        final int r = R(state);
        int n = Integer.MIN_VALUE;
        if (r >= 0) {
            for (int i = 0; i < HG.ea; ++i) {
                if (HG.x[i] == 0) {
                    final int n2 = HG.u[i][3];
                    if (n < n2) {
                        n = n2;
                    }
                }
            }
            int n3 = 0;
            if (r >= 0) {
                n3 = ((HG.u[r][3] > n) ? 1 : 0);
            }
            if (n3 != 0) {
                N(state);
                int n4 = HG.w[r][2];
                boolean b = false;
                while (!b && HG.ha < 3) {
                    if (n4 < 0) {
                        J(r);
                        n4 = HG.w[r][2];
                    }
                    if (n4 >= 0 && HG.v[n4] != null) {
                        o = HG.v[n4];
                        b = (((Player)o).getState() == 300);
                        if (!b) {
                            L();
                        }
                    }
                    ++HG.ha;
                }
                HG.ha = 0;
                if (b) {
                    try {
                        state = ((Player)o).getState();
                        if (state != 300 && state != 0) {
                            ((Player)o).prefetch();
                        }
                    }
                    catch (Exception ex) {
                        return;
                    }
                    try {
                        ((Player)o).setLoopCount(1);
                        ((Player)o).start();
                        HG.x[r] = 0;
                    }
                    catch (Exception ex2) {}
                    try {
                        final VolumeControl volumeControl = (VolumeControl)((Controllable)o).getControl("VolumeControl");
                        if ((HG.u[r][4] >> 5 & 0x1) == 0x1) {
                            volumeControl.setLevel(0 + 255 * HG.ba / 125);
                        }
                        else {
                            volumeControl.setLevel(0 + 255 * HG.aa / 125);
                        }
                    }
                    catch (Exception ex3) {}
                }
            }
        }
    }
    
    public static void L(int n) {
        if (n >= 0) {
            final int r = R(n);
            n = HG.w[r][2];
            if (n >= 0) {
                final Player player = (Player)HG.v[n];
                try {
                    if (player.getState() != 0) {
                        player.stop();
                    }
                }
                catch (Exception ex) {}
                HG.x[r] = 1;
                n = HG.u[r][4];
                n = (((n >> 1 & 0x1) != 0x1) ? 1 : 0);
                if (n != 0) {
                    try {
                        if (player.getState() == 300) {
                            player.deallocate();
                        }
                        if (player.getState() == 200 || player.getState() == 100) {
                            player.close();
                        }
                    }
                    catch (Exception ex2) {}
                    HG.v[r] = null;
                    HG.w[r][0] = -1;
                    HG.w[r][1] = -1;
                    HG.w[r][2] = -1;
                    HG.x[r] = -1;
                }
            }
        }
    }
    
    public void playerUpdate(final Player player, final String s, final Object o) {
        if (!HG.ka) {
            int n = -1;
            for (int i = 0; i < HG.ea; ++i) {
                if (player == HG.v[i]) {
                    n = i;
                    break;
                }
            }
            int n2 = -1;
            int r = -1;
            for (int j = 0; j < HG.ea; ++j) {
                if (n == HG.w[j][2] && HG.x[j] == 0) {
                    n2 = HG.w[j][0];
                    r = R(n2);
                    break;
                }
            }
            if (r >= 0) {
                if (s == "stopped") {
                    O(n2);
                }
                else if (s == "endOfMedia") {
                    O(n2);
                    HG.x[r] = 2;
                    P(r);
                }
            }
        }
    }
    
    public static void K() {
        O();
        HG.ea = HG.u.length;
        if (HG.v == null) {
            HG.v = new Object[HG.ea];
            HG.w = new int[HG.ea][4];
            HG.x = new byte[HG.ea];
            HG.y = new int[HG.ea];
            HG.z = new long[HG.ea];
        }
        for (int i = 0; i < HG.ea; ++i) {
            HG.w[i][0] = -1;
            HG.w[i][1] = -1;
            HG.w[i][2] = -1;
            HG.x[i] = -1;
            HG.y[i] = -1;
            HG.z[i] = -1L;
            HG.v[i] = null;
        }
        System.gc();
        boolean b = false;
        for (int j = 0; j < HG.ea; ++j) {
            final int n = HG.u[j][4];
            final boolean b2 = (n >> 2 & 0x1) == 0x1;
            if ((n >> 0 & 0x1) == 0x1 && HG.v[j] == null) {
                J(j);
            }
            if (b2) {
                b = true;
            }
            C.c = 25 * j / HG.ea + 75;
        }
        if (b && HG.fa == null) {
            (HG.fa = new D()).start();
        }
        HG.ia = true;
    }
    
    public static void M(int size) {
        if (size >= 0) {
            final int r = R(size);
            if (r >= 0) {
                final int n = HG.u[r][4];
                if (((n >> 3 & 0x1) == 0x1 && !MA(1) && !MA(5)) || ((n >> 3 & 0x1) != 0x1 && !MA(2) && HG.u[r][1] != 0 && !MA(5)) || MA(0)) {
                    return;
                }
                final boolean b = (n >> 2 & 0x1) == 0x1;
                int intValue = size;
                if (HG.u[r][5] >= 0) {
                    final Vector<Object> vector = new Vector<Object>(1, 1);
                    final int n2 = HG.u[r][5];
                    for (int i = 0; i < HG.ea; ++i) {
                        if (HG.u[r][5] >= 0) {
                            size = HG.u[i][5];
                            if (size == n2) {
                                vector.addElement(new Integer(HG.u[i][0]));
                            }
                        }
                    }
                    size = vector.size();
                    if (size > 1) {
                        intValue = (int)vector.elementAt(A(size));
                    }
                }
                final int n3 = intValue;
                if (b) {
                    if (!D.b) {
                        (HG.fa = new D()).start();
                    }
                    D.A(n3);
                }
                else {
                    Q(n3);
                }
                if (HG.x[r] != 0) {
                    HG.x[r] = 4;
                }
            }
        }
    }
    
    public static void N(final int n) {
        final int r = R(n);
        if (r >= 0) {
            final int n2 = HG.u[r][3];
            final boolean b = (HG.u[r][4] >> 3 & 0x1) == 0x1;
            for (int i = 0; i < HG.ea; ++i) {
                boolean b2 = HG.u[i][3] < n2;
                if (HG.x[i] != 0 && HG.x[i] != 4) {
                    b2 = false;
                }
                if (HG.x[i] == 2) {
                    b2 = true;
                }
                if (b2) {
                    final int n3 = HG.w[i][0];
                    final int n4 = HG.u[i][4];
                    final boolean b3 = (n4 >> 3 & 0x1) == 0x1;
                    final boolean b4 = (n4 >> 4 & 0x1) == 0x1;
                    boolean b5 = false;
                    if (b4) {
                        if ((b3 && b) || (!b3 && !b)) {
                            b5 = true;
                        }
                    }
                    else {
                        b5 = true;
                    }
                    if (b5) {
                        B(n3, n);
                    }
                }
            }
        }
    }
    
    public static void B(final int n, int r) {
        r = R(n);
        if (r > 0) {
            HG.x[r] = 1;
            O(n);
        }
    }
    
    public static void O(final int n) {
        if (n >= 0) {
            if ((HG.u[R(n)][4] >> 2 & 0x1) != 0x1) {
                L(n);
            }
            else {
                D.B(n);
            }
        }
    }
    
    public static boolean P(final int n) {
        boolean b = false;
        final int n2 = HG.w[n][0];
        if (n >= 0) {
            final boolean b2 = (HG.u[n][4] >> 3 & 0x1) == 0x1;
            final boolean b3 = HG.x[n] == 2;
            if (HG.u[n][6] > 0) {
                HG.x[n] = 2;
                M(HG.u[n][6]);
                return true;
            }
            if (b2 && b3) {
                int i = n2;
                if (HG.u[n][5] >= 0) {
                    final int n3 = HG.u[n][5];
                    final Vector vector = new Vector<Integer>(1, 1);
                    for (int j = 0; j < HG.ea; ++j) {
                        if (HG.u[n][5] >= 0 && HG.u[j][5] == n3 && n2 != HG.u[j][0]) {
                            vector.addElement(new Integer(HG.u[j][0]));
                        }
                    }
                    final int size = vector.size();
                    if (size > 1) {
                        while (i == n2) {
                            i = vector.elementAt(A(size));
                        }
                    }
                }
                if (i < 0) {
                    i = HG.u[n][0];
                }
                HG.x[n] = 2;
                M(i);
                b = true;
            }
        }
        return b;
    }
    
    public static void L() {
        for (int i = 0; i < HG.ea; ++i) {
            O(HG.w[i][0]);
        }
    }
    
    public static void Q(final int n) {
        if (!HG.ka) {
            K(n);
            R(HG.ja);
        }
    }
    
    public static void M() {
        if (!HG.ka) {
            System.currentTimeMillis();
        }
        HG.ka = true;
        for (int i = 0; i < HG.ea; ++i) {
            if (HG.x[i] == 0 || HG.x[i] == 4) {
                O(HG.y[i] = HG.w[i][0]);
                HG.x[i] = 3;
            }
        }
    }
    
    public static void N() {
        HG.ka = false;
        for (int i = 0; i < HG.ea; ++i) {
            if (HG.x[i] == 3) {
                M(HG.y[i]);
            }
        }
    }
    
    public static int R(final int n) {
        int n2 = -1;
        for (int i = 0; i < HG.ea; ++i) {
            if (HG.w[i][0] == n) {
                n2 = i;
                break;
            }
        }
        if (n2 == -1) {
            for (int j = 0; j < HG.ea; ++j) {
                if (HG.u[j][0] == n) {
                    n2 = j;
                    break;
                }
            }
        }
        return n2;
    }
    
    public static int S(int n) {
        final int r = R(n);
        n = -1;
        if (r >= 0) {
            n = HG.x[r];
        }
        return n;
    }
    
    private static void O() {
        int n = 0;
        final int[][] array = { { 0, 0, 0, 0, 0, -1, 1, 19814 }, { 1, 1, 0, 0, 8, -1, -1, 48410 }, { 2, 2, 0, 0, 8, -1, -1, 66031 }, { 3, 3, 0, 0, 8, -1, -1, 145382 }, { 4, 4, 0, 0, 8, -1, -1, 99005 }, { 5, 5, 0, 0, 8, -1, -1, 37399 }, { 6, 6, 0, 0, 8, -1, -1, 58859 }, { 7, 10, 0, 6, 0, -1, -1, 2116 }, { 8, 11, 0, 6, 0, -1, -1, 3749 }, { 9, 20, 1, 0, 0, -1, -1, 976 }, { 10, 21, 1, 0, 0, -1, -1, 644 }, { 11, 22, 1, 0, 0, -1, -1, 1044 }, { 12, 23, 1, 0, 0, -1, -1, 856 }, { 13, 24, 1, 0, 0, -1, -1, 3627 }, { 14, 25, 1, 0, 0, -1, -1, 1568 }, { 15, 26, 1, 0, 0, -1, -1, 1679 }, { 16, 27, 1, 0, 0, -1, -1, 1420 }, { 17, 28, 1, 0, 0, -1, -1, 3721 }, { 18, 30, 1, 0, 0, -1, -1, 655 }, { 19, 31, 1, 0, 0, -1, -1, 524 }, { 20, 32, 1, 0, 0, -1, -1, 987 }, { 21, 33, 1, 0, 0, -1, -1, 684 }, { 22, 34, 1, 1, 0, -1, -1, 939 }, { 23, 35, 1, 5, 0, -1, -1, 1449 }, { 24, 36, 1, 5, 0, -1, -1, 1239 }, { 25, 38, 1, 5, 0, -1, -1, 1547 }, { 26, 39, 1, 5, 0, -1, -1, 1117 }, { 27, 40, 1, 5, 0, -1, -1, 1428 }, { 28, 41, 1, 5, 0, -1, -1, 1801 }, { 29, 42, 1, 5, 0, -1, -1, 1652 }, { 30, 43, 1, 9, 0, -1, -1, 2176 }, { 31, 50, 1, 0, 0, -1, -1, 959 }, { 32, 51, 1, 0, 0, -1, -1, 864 }, { 33, 52, 1, 0, 0, -1, -1, 767 } };
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            String name;
            if (array[i][1] < 10) {
                name = "/0" + array[i][1] + HG.ca[array[i][2]];
            }
            else {
                name = "/" + array[i][1] + HG.ca[array[i][2]];
            }
            if ("".getClass().getResourceAsStream(name) == null) {
                array2[i] = 0;
            }
            else {
                array2[i] = 1;
                ++n;
            }
        }
        HG.u = new int[n][8];
        int n2 = 0;
        for (int j = 0; j < array.length; ++j) {
            if (array2[j] == 1) {
                System.arraycopy(array[j], 0, HG.u[n2], 0, array[j].length);
                ++n2;
            }
        }
    }
    
    static void A(final String s, final String s2, final boolean b) {
        final int n = HG.xa - 16;
        final Font font = A.j[2];
        String[] array;
        if (s2.length() > 0) {
            array = A(s + " " + s2, font, n, 0);
        }
        else {
            array = A(s, font, n, 0);
        }
        final int length = array.length;
        if (array.length > 1) {
            final String[] a = A(s, font, n, 0);
            for (int i = 0; i < a.length; ++i) {
                HG.oa.addElement(a[i]);
                if (i < length - 1) {
                    HG.pa.addElement("");
                }
                else {
                    HG.pa.addElement(s2);
                }
            }
            if (length > a.length) {
                HG.oa.addElement("");
                HG.pa.addElement(s2);
            }
        }
        else {
            HG.oa.addElement(s);
            HG.pa.addElement(s2);
        }
        if (b) {
            HG.qa = HG.pa.size() - 1;
        }
    }
    
    static String T(final int n) {
        String s;
        if (n < 0) {
            s = " (" + n + ")";
        }
        else {
            s = " (+" + n + ")";
        }
        return s;
    }
    
    static void U(int i) {
        HG.qa = -1;
        HG.ma = true;
        HG.oa.removeAllElements();
        HG.pa.removeAllElements();
        HG.la = I(51 + HG.na);
        A.yb = 126;
        switch (HG.na) {
            case 0: {
                A(I(58), "" + A.ca[18], false);
                A(I(51), "" + A.ca[17], false);
                i = A.J(A.ca[18]);
                if (i >= 0) {
                    A(I(66), "" + i, false);
                }
                else {
                    A(I(63), "", false);
                }
                A(I(57), "" + A.ca[19], false);
                break;
            }
            case 1: {
                A(I(55), (short)(A.ca[12] & 0xFFFF) + "/" + (short)((A.ca[12] & 0xFFFF0000) >> 16) + T((short)((A.ca[12] & 0xFFFF0000) >> 16) - (short)(A.ca[54] & 0xFFFF)), false);
                A(I(61), (short)(A.ca[13] & 0xFFFF) + "/" + (short)((A.ca[13] & 0xFFFF0000) >> 16) + T((short)((A.ca[13] & 0xFFFF0000) >> 16) - (short)((A.ca[54] & 0xFFFF0000) >> 16)), false);
                A(I(33), "" + (short)(A.ca[14] & 0xFFFF) + T((short)(A.ca[14] & 0xFFFF) - (short)((A.ca[14] & 0xFFFF0000) >> 16)), false);
                A(I(34), "" + (short)(A.ca[15] & 0xFFFF) + T((short)(A.ca[15] & 0xFFFF) - (short)((A.ca[15] & 0xFFFF0000) >> 16)), false);
                break;
            }
            case 2: {
                int n = (short)(A.ca[20] & 0xFFFF) - (short)((A.ca[20] & 0xFFFF0000) >> 16);
                int n2 = (short)(A.ca[21] & 0xFFFF) - (short)((A.ca[21] & 0xFFFF0000) >> 16);
                int n3 = (short)(A.ca[22] & 0xFFFF) - (short)((A.ca[22] & 0xFFFF0000) >> 16);
                int n4 = (short)(A.ca[23] & 0xFFFF) - (short)((A.ca[23] & 0xFFFF0000) >> 16);
                i = A.Z(A.BA());
                switch (i) {
                    case 0: {
                        n += A.ca[51];
                        break;
                    }
                    case 1: {
                        n2 += A.ca[51];
                        break;
                    }
                    case 2: {
                        n3 += A.ca[51];
                        break;
                    }
                    case 3: {
                        n4 += A.ca[51];
                        break;
                    }
                }
                A(I(67), "" + (short)(A.ca[20] & 0xFFFF) + T(n), false);
                A(I(72), "" + (short)(A.ca[21] & 0xFFFF) + T(n2), false);
                A(I(43), "" + (short)(A.ca[22] & 0xFFFF) + T(n3), false);
                A(I(44), "" + (short)(A.ca[23] & 0xFFFF) + T(n4), false);
                A(I(46), "" + (short)(A.ca[25] & 0xFFFF) + T((short)(A.ca[25] & 0xFFFF) - (short)((A.ca[25] & 0xFFFF0000) >> 16)), false);
                break;
            }
            case 3: {
                A(I(68), "", false);
                A("  " + I(47), "" + A.ca[27], false);
                A("  " + I(70), "" + A.ca[28], false);
                break;
            }
        }
    }
    
    static void A(final int[] array, final int[] array2) {
        boolean d = true;
        if ((array[3] & 0x40) != 0x0 || (array[3] & 0x80) != 0x0) {
            d = A.D(array);
            if (!d) {
                A("\n" + I(292), "", false);
                A(I(64 + (short)(array2[10] & 0xFFFF)), "" + (short)((array2[10] & 0xFFFF0000) >> 16), true);
            }
        }
        int n = 0;
        for (int i = 0; i < HG.sa.length; ++i) {
            HG.sa[i] = -1;
        }
        for (int j = 0; j < 2; ++j) {
            if (array[6 + j] != -1) {
                HG.sa[j] = (((short)A.ra[(short)((array[6 + j] & 0xFFFF0000) >> 16)][3] & 0xFFFF) | ((short)(array[6 + j] & 0xFFFF) << 16 & 0xFFFF0000));
                ++n;
            }
        }
        for (int k = 0; k < 5; ++k) {
            if (array2[5 + k] != -1) {
                HG.sa[2 + k] = array2[5 + k];
                ++n;
            }
        }
        if (n != 0) {
            A("\n" + I(60), "", false);
            for (int l = 0; l < HG.sa.length; ++l) {
                if (HG.sa[l] != -1) {
                    final short n2 = (short)(HG.sa[l] & 0xFFFF);
                    final short n3 = (short)((HG.sa[l] & 0xFFFF0000) >> 16);
                    if (n3 < 0) {
                        A(I(29 + n2), "" + n3, false);
                    }
                    else {
                        A(I(29 + n2), "+" + n3, false);
                    }
                }
            }
        }
        if ((array[3] & 0x40) != 0x0) {
            A.B(0, A.ca[42], false);
            A.B(array, true);
            final int z = A.Z(array);
            final int e = A.E(z, A.ca);
            final int f = A.F((short)(A.ca[14] & 0xFFFF), A.E(z, A.ca), A.W(array));
            final int g = A.G((short)(A.ca[14] & 0xFFFF), A.E(z, A.ca), A.W(array));
            final int y = A.Y(array);
            final int q = A.Q(e, (short)(A.ca[15] & 0xFFFF));
            final int b = A.B(A.X(array) + (short)(A.ca[26] & 0xFFFF), (short)(A.ca[14] & 0xFFFF), (short)(A.ca[15] & 0xFFFF), e);
            final int m = A.V(array) * 10 / 4096;
            A.B(array, false);
            A.B(0, A.ca[42], true);
            final int e2 = A.E(A.Z(A.BA()), A.ca);
            final int f2 = A.F((short)(A.ca[14] & 0xFFFF), A.E(z, A.ca), A.W(A.BA()));
            final int g2 = A.G((short)(A.ca[14] & 0xFFFF), A.E(z, A.ca), A.W(A.BA()));
            final int y2 = A.Y(A.BA());
            final int q2 = A.Q(e2, (short)(A.ca[15] & 0xFFFF));
            final int b2 = A.B(A.X(A.BA()) + (short)(A.ca[26] & 0xFFFF), (short)(A.ca[14] & 0xFFFF), (short)(A.ca[15] & 0xFFFF), e2);
            final int n4 = A.V(A.BA()) * 10 / 4096;
            A("\n" + I(290), "" + f + T(f - f2), false);
            A(I(291), "" + g + T(g - g2), false);
            A(I(289), "" + q + T(q - q2), false);
            A(I(287), "" + y + T(y - y2), false);
            A(I(69), "" + m + T(m - n4), false);
            A(I(288), "" + b + T(b - b2), false);
            if (d) {
                A("\n" + I(64 + (short)(array2[10] & 0xFFFF)), "" + (short)((array2[10] & 0xFFFF0000) >> 16), false);
            }
        }
        if ((array[3] & 0x80) != 0x0) {
            A.B(1, A.ca[41], false);
            A.B(array, true);
            final int i2 = A.ca[27];
            final int i3 = A.ca[28];
            A.B(array, false);
            A.B(1, A.ca[41], true);
            final int n5 = A.ca[27];
            final int n6 = A.ca[28];
            A("\n" + I(68), "", false);
            A(I(47), "" + i2 + T(i2 - n5), false);
            A(I(70), "" + i3 + T(i3 - n6), false);
            if (d) {
                A("\n" + I(64 + (short)(array2[10] & 0xFFFF)), "" + (short)((array2[10] & 0xFFFF0000) >> 16), false);
            }
        }
    }
    
    static void V(final int n) {
        HG.oa.removeAllElements();
        HG.pa.removeAllElements();
        HG.la = B.F(HG.ra);
        HG.qa = -1;
        HG.ma = false;
        final int[] a = A.A(HG.ra);
        if ((HG.ra[3] & 0x40) != 0x0) {
            A(I(a[15] + 73), "", false);
            A(I(252), "" + B.G(HG.ra), false);
            A(HG.ra, a);
        }
        else if ((HG.ra[3] & 0x80) != 0x0) {
            A(I(252), "" + B.G(HG.ra), false);
            A(HG.ra, a);
        }
        else if ((HG.ra[3] & 0x2000) != 0x0) {
            A(I(77 + a[10]), "", false);
            A(I(252), "" + B.G(HG.ra), false);
            A(HG.ra, a);
        }
        else if ((HG.ra[3] & 0x100) != 0x0) {
            A(I(a[0] + 1), "", false);
            if (a[3] != 0) {
                if (a[3] > 0) {
                    A(I(29 + a[6]), "+" + a[3], false);
                }
                else {
                    A(I(29 + a[6]), "" + a[3], false);
                }
            }
            A(I(252), "" + B.G(HG.ra), false);
        }
        else if ((HG.ra[3] & 0x400) != 0x0) {
            A(I(a[10]), "", false);
        }
        else if ((HG.ra[3] & 0x200) != 0x0) {
            A(I(a[3]), "", false);
        }
    }
    
    static int W(final int n) {
        int n2 = 0;
        int n3 = 4;
        HG.fA |= 0x1;
        final short[] array = HG.hA[n];
        final int n4 = B.a[A.tb][3];
        int n5;
        if ((n4 & 0x20) != 0x0 || (n4 & 0x1000) != 0x0) {
            n5 = (short)(A.hA[B.A(A.tb, (int[])null) + HG.bA] & 0xFFFF);
        }
        else {
            for (n5 = B.u[(short)((B.a[A.tb][0] & 0xFFFF0000) >> 16)][(short)(B.a[A.tb][0] & 0xFFFF)]; n5 >= 0 && (B.a[n5][3] & 0x27C0) <= 0; n5 = (short)(B.a[n5][1] & 0xFFFF)) {}
        }
        final boolean b = (n4 & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) == 0x0;
        final boolean b2 = (n4 & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) != 0x0;
        A.yb = 126;
        if (b) {
            HG.ma = true;
            HG.la = I(232 + HG.bA);
            A.yb = 113;
        }
        else if (b2) {
            HG.ma = false;
            HG.la = B.F(B.a[A.tb]);
        }
        else {
            HG.ma = false;
            HG.la = I(221);
        }
        int ka = 0;
        for (int i = 0; i < 30; ++i) {
            if (n5 >= 0) {
                final int[] a = A.A(B.a[n5]);
                short n6 = (short)n5;
                if (((B.a[n5][3] & 0x40) != 0x0 || (B.a[n5][3] & 0x80) != 0x0) && !A.D(B.a[n5])) {
                    n6 |= (short)32768;
                }
                array[n3 + 0] = (short)a[0];
                array[n3 + 1] = 21;
                array[n3 + 2] = 105;
                array[n3 + 3] = n6;
                for (n5 = (short)(B.a[n5][1] & 0xFFFF); n5 >= 0 && (B.a[n5][3] & 0x27C0) <= 0; n5 = (short)(B.a[n5][1] & 0xFFFF)) {}
                ++n2;
                ka = i + 1;
                if (HG.kA == -1) {
                    HG.kA = i + 1;
                }
            }
            else {
                array[n3 + 1] = (array[n3 + 0] = -1);
                array[n3 + 2] = 4;
                array[n3 + 3] = -1;
                if (HG.kA == i + 1) {
                    HG.kA = -1;
                }
            }
            n3 += 4;
        }
        HG.hA[n] = array;
        if (n2 == 0 && (B.a[A.tb][3] & 0x1000) != 0x0) {
            HG.la = I(228);
            HG.ma = false;
        }
        if (n2 > 1) {}
        if (HG.kA == -1) {
            HG.kA = ka;
        }
        return n2;
    }
    
    static void P() {
        HG.fA |= 0x2;
        final short[] array = HG.hA[19];
        final int[][] array2 = A.da[HG.za];
        int[][] array3 = null;
        HG.la = I(232 + HG.za);
        HG.ma = true;
        A.yb = 126;
        switch (HG.za) {
            case 0: {
                array3 = A.ha;
                break;
            }
            case 1: {
                array3 = A.ja;
                break;
            }
            case 2: {
                HG.eb.Z();
                array3 = A.la;
                break;
            }
            case 3: {
                array3 = A.ta;
                break;
            }
            case 5: {
                array3 = A.oa;
                break;
            }
            case 4: {
                array3 = A.va;
                break;
            }
        }
        int n = 4;
        int ka = 0;
        int n2 = 0;
        for (int i = 0; i < array2.length; ++i) {
            if (array2[i][4] != -1) {
                short n3 = (short)i;
                if ((HG.za == 0 || HG.za == 1) && !A.D(array2[i])) {
                    n3 |= (short)32768;
                }
                array[n + 0] = (short)array3[array2[i][4]][0];
                array[n + 1] = 12;
                array[n + 2] = 105;
                array[n + 3] = n3;
                ka = i + 1;
                ++n2;
                if (HG.kA == -1) {
                    HG.kA = i + 1;
                }
            }
            else {
                array[n + 1] = (array[n + 0] = -1);
                array[n + 2] = 4;
                array[n + 3] = -1;
                if (HG.kA == i + 1) {
                    HG.kA = -1;
                }
            }
            n += 4;
        }
        n += 4;
        if ((HG.fA & 0x1) != 0x0) {
            array[n + 1] = 11;
        }
        else {
            array[n + 1] = 6;
        }
        HG.hA[19] = array;
        if (HG.kA == -1) {
            HG.kA = ka;
        }
        if (n2 > 1) {}
    }
    
    static void X(final int n) {
        final short[] array = HG.hA[n];
        HG.la = B.F(HG.ra);
        HG.ma = false;
        if ((B.a[A.tb][3] & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) == 0x0) {
            array[4] = 218;
            array[7] = 45;
        }
        else {
            array[4] = 250;
            array[7] = 43;
        }
    }
    
    static void Y(int n) {
        final short[] array = HG.hA[n];
        HG.la = B.F(HG.ra);
        HG.ma = false;
        n = 4;
        array[4] = 217;
        array[5] = 14;
        array[6] = 109;
        array[7] = 40;
        if ((HG.za == 0 && HG.aA == A.ca[42]) || (HG.za == 1 && HG.aA == A.ca[41]) || (HG.za == 3 && (HG.aA == (short)(A.ca[43] & 0xFFFF) || HG.aA == (short)((A.ca[43] & 0xFFFF0000) >> 16) || HG.aA == A.ca[44])) || (HG.za == 4 && HG.aA == A.ca[45])) {
            array[4] = 222;
        }
        else if (HG.za != 2 && HG.za != 5) {
            array[4] = 217;
        }
        else if (HG.za == 2 || HG.za == 5) {
            if (HG.za == 5 || A.la[HG.ra[4]][3] == 0) {
                array[5] = (array[4] = -1);
                array[6] = 4;
                array[7] = -1;
            }
            else {
                array[4] = 251;
            }
        }
        n += 4;
        n += 4;
        if (HG.za == 5 || HG.za == 4 || A.ca[11] == 0) {
            array[13] = (array[12] = -1);
            array[14] = 4;
            array[15] = -1;
        }
        else if ((HG.fA & 0x1) != 0x0) {
            if ((B.a[A.tb][3] & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) == 0x0) {
                array[12] = 248;
            }
            else {
                array[12] = 223;
            }
            array[13] = 22;
            array[14] = 109;
            array[15] = 44;
        }
        else {
            array[12] = 226;
            array[13] = 13;
            array[14] = 109;
            array[15] = 44;
        }
        n += 4;
        if (HG.za == 1 || HG.za == 5 || (HG.fA & 0x1) != 0x0 || (HG.za == 2 && A.la[HG.ra[4]][3] == 0)) {
            array[17] = (array[16] = -1);
            array[18] = 4;
            array[19] = -1;
        }
        else {
            array[16] = 246;
            array[17] = 15;
            array[18] = 109;
            array[19] = 47;
        }
    }
    
    static void Z(final int n) {
        short[] array = HG.hA[n];
        HG.la = I(244 + (HG.dA - 1));
        A.yb = 126;
        HG.ma = true;
        int n2 = 3;
        for (int i = 0; i < A.ya.length; ++i) {
            A.ya[i][3] = -1;
            if ((short)(A.ya[i][0] & 0xFFFF) == HG.dA) {
                ++n2;
            }
        }
        if (array.length != n2 * 4) {
            array = new short[n2 * 4];
        }
        int n3 = 0;
        array[1] = (array[0] = -1);
        array[2] = 6;
        array[3] = 1;
        n3 += 4;
        int n4 = 1;
        for (int j = 0; j < A.ya.length; ++j) {
            if ((short)(A.ya[j][0] & 0xFFFF) == HG.dA && (short)((A.ya[j][0] & 0xFFFF0000) >> 16) == 1) {
                array[n3 + 0] = (short)A.ya[j][1];
                array[n3 + 1] = 28;
                array[n3 + 2] = 109;
                array[n3 + 3] = 37;
                n3 += 4;
                A.ya[j][3] = n4;
                ++n4;
            }
        }
        for (int k = 0; k < A.ya.length; ++k) {
            if ((short)(A.ya[k][0] & 0xFFFF) == HG.dA && (short)((A.ya[k][0] & 0xFFFF0000) >> 16) == 0) {
                array[n3 + 0] = (short)A.ya[k][1];
                array[n3 + 1] = 28;
                array[n3 + 2] = 109;
                array[n3 + 3] = 37;
                n3 += 4;
                A.ya[k][3] = n4;
                ++n4;
            }
        }
        array[n3 + 0] = 136;
        array[n3 + 1] = 11;
        array[n3 + 2] = 3;
        array[n3 + 3] = 1;
        n3 += 4;
        array[n3 + 0] = 136;
        array[n3 + 1] = 6;
        array[n3 + 2] = 2;
        array[n3 + 3] = 0;
        HG.hA[n] = array;
    }
    
    static void AA(final int n) {
        HG.la = I(A.ya[HG.eA][1]);
        HG.ma = false;
    }
    
    static void BA(final int n) {
        final short[] array = HG.hA[n];
        int n2 = 12;
        if (A.ca[11] == -1 || (short)(A.ca[12] & 0xFFFF) <= 0) {
            array[13] = (array[12] = -1);
            array[14] = 4;
            array[15] = -1;
        }
        else {
            array[12] = 247;
            array[13] = 37;
            array[14] = 101;
            array[15] = -1;
        }
        n2 += 4;
        A(array, 16, (short)36, (short)38);
        HG.hA[n] = array;
    }
    
    public static void A(final short[] array, int n, final short n2, final short n3) {
        if (A.tE >= 0L && A.uE >= 0L) {
            if (A.tE > A.uE) {
                array[n + 0] = 373;
                array[n + 1] = n3;
            }
            else {
                array[n + 0] = 374;
                array[n + 1] = n2;
            }
            array[n + 2] = 101;
            array[n + 3] = -1;
            n += 4;
            if (A.tE > A.uE) {
                array[n + 0] = 374;
                array[n + 1] = n2;
            }
            else {
                array[n + 0] = 373;
                array[n + 1] = n3;
            }
            array[n + 2] = 101;
            array[n + 3] = -1;
        }
        else {
            if (A.uE >= 0L) {
                array[n + 0] = 374;
                array[n + 1] = n2;
                array[n + 2] = 101;
            }
            else if (A.tE >= 0L) {
                array[n + 0] = 373;
                array[n + 1] = n3;
                array[n + 2] = 101;
            }
            else {
                array[n + 1] = (array[n + 0] = -1);
                array[n + 2] = 4;
            }
            array[n + 3] = -1;
            n += 4;
            array[n + 1] = (array[n + 0] = -1);
            array[n + 2] = 4;
            array[n + 3] = -1;
        }
    }
    
    public static void CA(final int n) {
        A(HG.hA[n], 4, (short)30, (short)39);
    }
    
    public static void A(final Graphics graphics, final String s) {
        graphics.setColor(A.i[5]);
        A.A(s, 2, 2, graphics);
    }
    
    public static int A(final Graphics graphics, final String s, final int n, final boolean b, final int n2) {
        final int height = A.j[2].getHeight();
        final int n3 = height + 5;
        if (graphics != null && s != null) {
            final int n4 = A.cc[1717] / A.cc[1721];
            final int n5 = 5 + HG.va;
            final int n6 = (n3 >> 1) - 1;
            final int n7 = n4 + 10 + 0;
            if (b) {
                graphics.setColor(A.i[10]);
                graphics.fillRect(HG.va, n, HG.xa, height + 2);
                graphics.setColor(A.i[5]);
                A.A(1, HG.va + n7, n, HG.xa - n7, height, 281);
                A.A(s, 1, 2, graphics);
                A(n, n3, HG.kA);
            }
            else if (n > -n3 && n <= A.g) {
                graphics.setColor(A.i[5]);
                A.A(0, HG.va + n7, n, HG.xa - n7, height, 281);
                A.A(s, 0, 2, graphics);
            }
            if (n > -n3 && n <= A.g) {
                graphics.setClip(HG.va, HG.wa, HG.xa, HG.ya);
                A.B(n5, n + n6, 156, HG.qA[n2], graphics);
            }
        }
        return n3;
    }
    
    public static int A(final Graphics graphics, final String nb, int n, final int n2, int n3, final boolean b) {
        if (graphics != null) {
            final int n4 = A.f - (A.cc[1386] + A.cc[1529] + 2 * A.cc[1518]);
            n = A.cc[1650] / A.cc[1655];
            final int n5 = A.cc[1651] / A.cc[1656];
            final int n6 = (n4 - n * HG.pA) / (HG.pA + 1);
            final int n7 = n + n6;
            n = n7 * HG.pA + n6;
            n = A.f - n >> 1;
            n3 = n + (n3 * n7 + n6);
            n = A.g - (A.cc[1387] + A.cc[1607] - 7);
            final int n8 = A.g - (n5 + 5);
            if (n > n8) {
                n = n8;
            }
            graphics.setClip(0, 0, A.f, A.g);
            A.B(n3, n, 150, n2, graphics);
            if (b) {
                A.B(n3, n, 150, 59, graphics);
                A.nb = nb;
                A.H(graphics);
            }
        }
        return 0;
    }
    
    public static int A(final Graphics graphics, final String[] array, int va, int i, final int n) {
        if (array == null) {
            return 0;
        }
        final int height = A.j[2].getHeight();
        final int length = array.length;
        final int n2 = height * length;
        if (graphics != null) {
            int n3 = va;
            va = HG.va;
            if (HG.jA > 17) {
                n3 += 5;
                va += 8;
            }
            else {
                va += 3;
            }
            if (i <= 0) {
                graphics.setColor(A.i[5]);
            }
            else {
                graphics.setColor(A.i[i]);
            }
            graphics.setFont(A.j[2]);
            for (i = 0; i < length; ++i) {
                if (n3 >= HG.wa && n3 + height <= HG.wa + HG.ya) {
                    graphics.drawString(array[i], va + 0, n3 + 0, 20);
                }
                n3 += height;
            }
        }
        if (HG.jA > 17) {
            return n2 + n + 5;
        }
        return n2 + n;
    }
    
    public static int A(final Graphics graphics, final String[] array, int i) {
        final int height = A.j[2].getHeight();
        final int length = array.length;
        if (graphics != null) {
            int n = i;
            final int n2 = A.f >> 1;
            graphics.setColor(A.i[26]);
            graphics.setFont(A.j[2]);
            for (i = 0; i < length; ++i) {
                if (n >= HG.wa && n + height <= HG.wa + HG.ya) {
                    graphics.drawString(array[i], n2 + 0, n + 0, 17);
                }
                n += height;
            }
        }
        return height * length;
    }
    
    public static int A(final Graphics graphics, int i) {
        final int size = HG.oa.size();
        final int height = A.j[2].getHeight();
        if (graphics != null) {
            int n = i + 5;
            graphics.setClip(HG.va, HG.wa, HG.xa, HG.ya - 2);
            graphics.setFont(A.j[2]);
            for (i = 0; i < size; ++i) {
                if (n >= HG.wa + 5 && n + height <= HG.wa + HG.ya) {
                    graphics.drawString((String)HG.oa.elementAt(i), HG.va + 8 + 0, n + 0, 20);
                    if (HG.qa == i) {
                        graphics.setColor(A.i[16]);
                    }
                    else {
                        graphics.setColor(A.i[5]);
                    }
                    graphics.drawString((String)HG.pa.elementAt(i), HG.va + HG.xa - 8 + 0, n + 0, 24);
                }
                n += height;
            }
        }
        return height * size + 5 + 10;
    }
    
    public static int A(final Graphics graphics, final String s, final int n, final int n2, final boolean b) {
        final int height = A.j[1].getHeight();
        final int n3 = height + 5;
        if (graphics != null && s != null) {
            graphics.setClip(HG.va, HG.wa + 1, HG.xa, HG.ya - 2);
            final int n4 = A.cc[1650] / A.cc[1655];
            final int n5 = (height + 5 - A.cc[1651] / A.cc[1656] >> 1) + 1;
            graphics.setFont(A.j[1]);
            if (b) {
                graphics.setColor(A.i[10]);
                graphics.fillRect(HG.va, n2, HG.xa, height + 5);
                graphics.setColor(A.i[5]);
                graphics.drawRect(HG.va, n2, HG.xa - 1, height + 5);
                A.B(HG.va + 3, n2 + n5, 150, n, graphics);
                A.A(1, HG.va + 2 + n4 + 5, n2 + 1, HG.xa - n4 - 5 - 6, height + 5, 409);
                A.A(s, 1, 1, graphics);
                A(n2, n3, HG.kA);
            }
            else if (n2 > -n3 && n2 <= A.g) {
                graphics.setColor(A.i[9]);
                graphics.fillRect(HG.va, n2, HG.xa, height + 5);
                graphics.setColor(A.i[5]);
                graphics.drawRect(HG.va, n2, HG.xa - 1, height + 5);
                A.B(HG.va + 3, n2 + n5, 150, n, graphics);
                A.A(0, HG.va + 2 + n4 + 5, n2 + 1, HG.xa - n4 - 5 - 6, height + 5, 281);
                A.A(s, 0, 1, graphics);
            }
        }
        return n3;
    }
    
    public static int A(final Graphics graphics, String s, final boolean b, final int n, final int n2) {
        final int height = A.j[1].getHeight();
        final int n3 = height + 5;
        if (graphics != null && s != null) {
            final boolean b2 = (n2 & 0x8000) != 0x0;
            final int n4 = n2 & 0x7FFF;
            int color = A.i[9];
            int color2 = A.i[10];
            int n5 = 0;
            final int n6 = A.cc[1650] / A.cc[1655];
            final int n7 = A.cc[1651] / A.cc[1656];
            if (HG.jA == 19) {
                s = B.F(A.da[HG.za][n4]);
                final int[] a = A.A(A.da[HG.za][n4]);
                n5 = a[2];
                if (HG.za == 0 && n4 == A.ca[42]) {
                    color = A.i[11];
                    color2 = A.i[12];
                }
                else if (HG.za == 2 && A.da[HG.za][n4][6] > 1) {
                    s = A.da[HG.za][n4][6] + "x " + s;
                }
                else if (HG.za == 1 && n4 == A.ca[41]) {
                    color = A.i[11];
                    color2 = A.i[12];
                }
                else if (HG.za == 4 && n4 == A.ca[45]) {
                    color = A.i[11];
                    color2 = A.i[12];
                }
                else if (HG.za == 3) {
                    if (a[10] == 1 && A.ca[44] == n4) {
                        color = A.i[11];
                        color2 = A.i[12];
                    }
                    else if (a[10] == 0 && ((short)(A.ca[43] & 0xFFFF) == n4 || (short)((A.ca[43] & 0xFFFF0000) >> 16) == n4)) {
                        color = A.i[11];
                        color2 = A.i[12];
                    }
                }
            }
            else if (HG.jA == 21) {
                s = B.F(B.a[n4]);
                n5 = A.A(B.a[n4])[2];
                if ((B.a[n4][3] & 0x100) != 0x0 && B.a[n4][6] > 1) {
                    s = B.a[n4][6] + "x " + s;
                }
            }
            graphics.setFont(A.j[1]);
            if (b) {
                graphics.setColor(color2);
                graphics.fillRect(HG.va, n, HG.xa, height + 5);
                graphics.setColor(A.i[5]);
                graphics.drawRect(HG.va, n, HG.xa - 1, height + 5);
                A.B(HG.va + 3, n + ((height + 5 - n7 >> 1) + 1), 150, n5, graphics);
                A.A(1, HG.va + 2 + n6 + 5, n + 1, HG.xa - n6 - 5 - 4, height + 5, 409);
                if (b2) {
                    graphics.setColor(A.i[16]);
                }
                A.A(s, 1, 1, graphics);
                A(n, n3, HG.kA);
            }
            else if (n > -n3 && n <= A.g) {
                graphics.setColor(color);
                graphics.fillRect(HG.va, n, HG.xa, height + 5);
                graphics.setColor(A.i[5]);
                graphics.drawRect(HG.va, n, HG.xa - 1, height + 5);
                A.B(HG.va + 3, n + ((height + 5 - n7 >> 1) + 1), 150, n5, graphics);
                A.A(0, HG.va + 2 + n6 + 5, n + 1, HG.xa - n6 - 5 - 4, height + 5, 281);
                if (b2) {
                    graphics.setColor(A.i[16]);
                }
                A.A(s, 0, 1, graphics);
            }
        }
        return n3;
    }
    
    public static int A(final Graphics graphics) {
        graphics.setClip(0, 0, A.f, A.g);
        if (graphics != null) {
            int n = 0;
            int n2 = 0;
            int ta = 0;
            int ua = 2;
            int va = 135;
            int wa = 135;
            if (HG.iA) {
                final int ka = HG.kA;
                final short[] array = HG.hA[HG.jA];
                if (ka >= 0) {
                    final short n3 = array[(ka << 2) + 2];
                    n = ((n3 != 103 && n3 != 104 && n3 != 108) ? 1 : 0);
                }
                n2 = ((HG.lA.size() > 0) ? 1 : 0);
                if (HG.tA >= 0) {
                    ta = HG.tA;
                    va = HG.vA;
                    n = 1;
                }
                if (HG.uA >= 0) {
                    ua = HG.uA;
                    wa = HG.wA;
                    n2 = 1;
                }
                if (HG.sA == 35) {
                    n2 = 0;
                }
                if (HG.rA == 35) {
                    n = 0;
                }
            }
            int n4;
            int g;
            if (HG.jA <= 17) {
                n4 = 10 + (A.cc[va * 11 + 0] / A.cc[va * 11 + 5] >> 1);
                g = A.g - 10;
            }
            else {
                g = A.g;
                n4 = A.cc[1606] >> 1;
            }
            if (n != 0) {
                A.B(n4, g, va, ta, graphics);
            }
            if (n2 != 0) {
                A.B(A.f - n4, g, wa, ua, graphics);
            }
            final int n5 = HG.wa + HG.ya + 2;
            final int n6 = A.cc[1639] / A.cc[1644];
            final int n7 = HG.ta - HG.wa;
            if (n7 < 0) {
                A.B((A.f >> 1) - n6, n5, 149, 0, graphics);
            }
            if (n7 > HG.ya - HG.ua) {
                A.B(A.f >> 1, n5, 149, 1, graphics);
            }
        }
        return 0;
    }
    
    public static void B(final Graphics graphics) {
        graphics.setClip(0, 0, A.f, A.g);
        graphics.setColor(A.i[8]);
        graphics.fillRect(0, 0, A.f, A.g);
        final int n = A.cc[1738] / A.cc[1743];
        final int n2 = A.f - 10;
        int n3 = A.g - 10;
        int n4 = 5;
        if (HG.jA != 0) {
            n4 = A.cc[1728] >> 1;
            n3 = A.g - n4 - 5;
        }
        graphics.setColor(A.i[3]);
        graphics.drawRect(7, n4 + 2, n2 - 3, n3 - 3);
        graphics.setColor(A.i[6]);
        graphics.drawRect(6, n4 + 1, n2 - 3, n3 - 3);
        graphics.setColor(A.i[5]);
        graphics.drawRect(5, n4, n2 - 3, n3 - 3);
        A.B(5, n4, 158, 0, graphics);
        A.B(5 + n2 - n, n4, 158, 1, graphics);
        n4 += 3;
        int n5;
        if (HG.jA == 0) {
            n4 += 5;
            A.B(A.f >> 1, n4, 159, 0, graphics);
            n5 = n4 + (A.cc[1750] + 5);
        }
        else {
            final int n6 = 6 + A.cc[1728];
            n3 = A.g - 10;
            final int n7 = A.f - 26;
            A.B(A.f >> 1, 3, 157, 0, graphics);
            graphics.setColor(A.i[4]);
            final int n8 = A.j[2].getHeight() + 5;
            graphics.fillRect(13, n6, n7, n8);
            graphics.setColor(A.i[6]);
            graphics.drawRect(13, n6, n7, n8);
            graphics.drawRect(14, n6 + 1, n7 - 1, n8 - 1);
            graphics.setColor(A.i[5]);
            graphics.drawRect(13, n6, n7 - 1, n8 - 1);
            n5 = n6 + (n8 - 1);
        }
        final int n9 = A.f - 26;
        final int n10 = n3 - (n5 + A.cc[1486] + 3);
        graphics.setColor(A.i[3]);
        graphics.fillRect(13, n5, n9, n10);
        graphics.setColor(A.i[6]);
        graphics.drawRect(13, n5, n9, n10);
        graphics.drawRect(14, n5 + 1, n9 - 1, n10 - 1);
        graphics.setColor(A.i[5]);
        graphics.drawRect(13, n5, n9 - 1, n10 - 1);
        A.B(13, n5, 152, 0, graphics);
        A.B(13 + n9, n5, 152, 0, 0, 2, graphics);
        final int n11 = n5 + n10;
        final int n12 = A.f >> 1;
        A.B(n12, n11, 152, 0, graphics);
        A.B(n12, n11, 152, 0, 0, 2, graphics);
    }
    
    public static int A(final Graphics graphics, final String s, final int n, final boolean b) {
        final int height = A.j[2].getHeight();
        final int n2 = height + 5;
        if (graphics != null && s != null) {
            graphics.setFont(A.j[2]);
            if (b) {
                graphics.setColor(A.i[10]);
                graphics.fillRect(HG.va, n, HG.xa, height + 2);
                graphics.setColor(A.i[5]);
                A.A(1, HG.va, n, HG.xa, height, 284);
                A.A(s, 1, 2, graphics);
                A(n, n2, HG.kA);
            }
            else if (n > -n2 && n <= A.g) {
                graphics.setColor(A.i[5]);
                A.A(0, HG.va, n, HG.xa, height, 284);
                A.A(s, 0, 2, graphics);
            }
        }
        return n2;
    }
    
    static void DA(int i) {
        switch (i) {
            case 6: {
                U();
                break;
            }
            case 103: {
                i = A.eC[A.tC][9];
                A.eC[A.tC][i++] = 1;
                A.eC[A.tC][9] = i;
                A.eC[A.tC][0] = 1;
                break;
            }
            case 104: {
                i = A.eC[A.tC][9];
                A.eC[A.tC][i++] = 0;
                A.eC[A.tC][9] = i;
                A.eC[A.tC][0] = 1;
                break;
            }
            case 105: {
                A.eC[A.tC][0] = 1;
                break;
            }
            case 102: {
                A.A(10, 0, 0, 0, 0, true);
                A.r.A(HG.eb, A.tC, A.uC, A.vC, true);
                new Thread(A.r).start();
                break;
            }
            case 100: {
                A.gd[0] = 1;
                A.O(A.gd, A.hd);
                A.gd = null;
                A.hd = -1;
                A.A(10, 0, 0, 0, 0, true);
                A.r.A(HG.eb, A.tC, A.uC, A.vC, false);
                new Thread(A.r).start();
                break;
            }
            case 101: {
                if (A.gd != null) {
                    A.gd[0] = 0;
                    A.gd = null;
                    A.hd = -1;
                }
                A.oC = false;
                break;
            }
            case 11: {
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                A.D();
                break;
            }
            case 40: {
                LA(15);
                break;
            }
            case 27: {
                HG.lA.push(new Integer(HG.jA));
                HG.lA.push(new Integer(HG.kA));
                LA(24);
                break;
            }
            case 21: {
                i = (HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF);
                HG.ra = B.a[i];
                HG.cA = HG.kA - 1;
                HG.lA.push(new Integer(HG.jA));
                HG.lA.push(new Integer(HG.kA));
                LA(22);
                break;
            }
            case 12: {
                HG.aA = (HG.hA[HG.jA][HG.kA * 4 + 3] & 0x7FFF);
                HG.ra = A.da[HG.za][HG.aA];
                HG.lA.push(new Integer(HG.jA));
                HG.lA.push(new Integer(HG.kA));
                LA(20);
                break;
            }
            case 13: {
                final int[] array = A.da[HG.za][HG.aA];
                if ((array[3] & 0x100) != 0x0) {
                    A.A(I(224) + "\n" + I(242) + ": @x@@", B.F(array), 26, 101, 1, array[6], 0);
                    break;
                }
                A.A(HG.za, HG.aA, 1, false, true);
                if (HG.jA != 19 && HG.jA != 21) {
                    U();
                    break;
                }
                B(HG.jA);
                break;
            }
            case 29: {
                final short n = (short)(A.ca[0] & 0xFFFF);
                final short n2 = (short)((A.ca[0] & 0xFFFF0000) >> 16);
                final short n3 = (short)(B.a[A.tb][0] & 0xFFFF);
                i = (short)((B.a[A.tb][0] & 0xFFFF0000) >> 16);
                A.ca[0] = ((n3 & 0xFFFF) | ((short)i << 16 & 0xFFFF0000));
                A.A(HG.za, HG.aA, A.cd, false, true);
                A.ca[0] = ((n & 0xFFFF) | (n2 << 16 & 0xFFFF0000));
                if (HG.jA != 19 && HG.jA != 21) {
                    U();
                    break;
                }
                B(HG.jA);
                break;
            }
            case 26: {
                A.A(HG.za, HG.aA, A.cd, false, true);
                if (HG.jA != 19 && HG.jA != 21) {
                    U();
                    break;
                }
                B(HG.jA);
                break;
            }
            case 25: {
                A.A(false);
                break;
            }
            case 22: {
                final int[] array2 = A.da[HG.za][HG.aA];
                if ((B.a[A.tb][3] & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) == 0x0) {
                    final String string = I(249) + "\n" + I(252) + ": ";
                    int g = B.G(array2);
                    if (g % 2 != 0) {
                        ++g;
                    }
                    final int j = g * 40 / 100;
                    if ((array2[3] & 0x100) != 0x0) {
                        A.A(string + "@1@@\n" + I(242) + ": @x@@", B.F(array2), 23, 101, 1, array2[6], j);
                    }
                    else {
                        A.A(string + j, B.F(array2), 23, 101);
                    }
                }
                else if ((0x27C0 & B.a[A.tb][3]) > 0) {
                    if ((array2[3] & 0x100) == 0x0) {
                        A.cd = 1;
                        DA(29);
                        break;
                    }
                    A.A(I(224) + "\n" + I(242) + ": @x@@", B.F(array2), 29, 101, 1, array2[6], 0);
                }
                else {
                    if ((array2[3] & 0x100) == 0x0) {
                        if (HG.jA != 19 && HG.jA != 21) {
                            U();
                        }
                        A.A(false);
                        break;
                    }
                    A.A(I(224) + "\n" + I(242) + ": @x@@", B.F(array2), 25, 101, 1, array2[6], B.G(array2));
                }
                if (HG.jA != 19 && HG.jA != 21) {
                    U();
                    break;
                }
                break;
            }
            case 23: {
                A.A(true);
                break;
            }
            case 24: {
                A.B(true);
                break;
            }
            case 19: {
                final int n4 = B.a[A.tb][3];
                int k;
                if ((n4 & 0x20) != 0x0 || (n4 & 0x1000) != 0x0) {
                    i = B.A(A.tb, (int[])null) + HG.bA;
                    k = (short)(A.hA[i] & 0xFFFF);
                }
                else {
                    final short n5 = (short)(B.a[A.tb][0] & 0xFFFF);
                    i = (short)((B.a[A.tb][0] & 0xFFFF0000) >> 16);
                    for (k = B.u[i][n5]; k >= 0 && (B.a[k][3] & 0x27C0) <= 0; k = (short)(B.a[k][1] & 0xFFFF)) {}
                }
                final int n6 = k;
                int n7 = 0;
                int n8 = -1;
                while (k != -1) {
                    if (HG.cA == n7) {
                        n8 = (short)(B.a[k][2] & 0xFFFF);
                        break;
                    }
                    ++n7;
                    for (k = (short)(B.a[k][1] & 0xFFFF); k >= 0 && (B.a[k][3] & 0x27C0) <= 0; k = (short)(B.a[k][1] & 0xFFFF)) {}
                }
                if ((B.a[A.tb][3] & 0x20) != 0x0 && (B.a[A.tb][13] & 0x2) == 0x0) {
                    final String string2 = I(219) + "\n" + I(252) + ": ";
                    if ((B.a[n8][3] & 0x100) != 0x0) {
                        A.A(string2 + "@1@@\n" + I(242) + ": @x@@", B.F(B.a[n8]), 24, 101, 1, B.a[n8][6], B.G(B.a[n8]));
                    }
                    else {
                        A.A(string2 + B.G(B.a[n8]), B.F(B.a[n8]), 24, 101);
                    }
                    if (HG.jA != 19 && HG.jA != 21) {
                        U();
                        break;
                    }
                    break;
                }
                else if ((0x27C0 & B.a[A.tb][3]) > 0) {
                    A.I(n8);
                    i = W(21);
                    if (i == 0) {
                        DA(11);
                        break;
                    }
                    if (i == 1) {
                        final int[] array3 = B.a[n6];
                        final int n9 = 3;
                        array3[n9] &= 0xFFF7FFFF;
                        final int[] array4 = B.a[n6];
                        final int n10 = 3;
                        array4[n10] &= 0xFFEFFFFF;
                    }
                    if (HG.jA != 19 && HG.jA != 21) {
                        A.F((short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16));
                        U();
                        break;
                    }
                    break;
                }
                else {
                    if (A.B(false)) {
                        U();
                        break;
                    }
                    DA(11);
                    break;
                }
                break;
            }
            case 14: {
                A.G(HG.za, HG.aA);
                if (HG.jA != 19 && HG.jA != 21) {
                    U();
                    break;
                }
                B(HG.jA);
                break;
            }
            case 15: {
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                A.Q();
                A.eb = true;
                break;
            }
            case 28: {
                for (i = 0; i < A.ya.length; ++i) {
                    if (A.ya[i][3] == HG.kA) {
                        HG.eA = i;
                        break;
                    }
                }
                HG.lA.push(new Integer(HG.jA));
                HG.lA.push(new Integer(HG.kA));
                LA(26);
                break;
            }
            case 9: {
                if (MA(0)) {
                    E(1, 1);
                    W();
                }
                HG.eb.A(2);
                break;
            }
            case 10: {
                E(0, 1);
                W();
                HG.eb.A(2);
                break;
            }
            case 31: {
                if (A.HA(2) || A.HA(3)) {
                    HG.lA.push(new Integer(HG.jA));
                    HG.lA.push(new Integer(HG.kA));
                    LA(1);
                    break;
                }
                DA(1);
                break;
            }
            case 30: {
                HG.gA = true;
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                A.s = 5;
                A.H();
                A.AA();
                A.GA(2);
                A.r.A(HG.eb, A.ca[11], (short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16), false);
                new Thread(A.r).start();
                break;
            }
            case 39: {
                HG.gA = true;
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                A.s = 5;
                A.H();
                A.AA();
                A.GA(3);
                A.r.A(HG.eb, A.ca[11], (short)(A.ca[0] & 0xFFFF), (short)((A.ca[0] & 0xFFFF0000) >> 16), false);
                new Thread(A.r).start();
                break;
            }
            case 1: {
                HG.gA = true;
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                A.D();
                A.H();
                A.AA();
                A.r.A(HG.eb, 13, 7, 3, false);
                new Thread(A.r).start();
                break;
            }
            case 2: {
                HG.eb.A(4);
                HG.fb.destroyApp(false);
                break;
            }
            case 3: {
                HG.lA.removeAllElements();
                HG.iA = false;
                HG.fA = 0;
                HG.kA = -1;
                A.D();
                break;
            }
            case 33: {
                if ((short)(A.ca[12] & 0xFFFF) <= 0) {
                    DA(34);
                    break;
                }
                HG.lA.push(new Integer(HG.jA));
                HG.lA.push(new Integer(HG.kA));
                if (A.ca[11] == -1) {
                    LA(16);
                    break;
                }
                LA(15);
                break;
            }
            case 4: {
                A.FA(2);
            }
            case 34: {
                HG.gA = false;
                HG.lA.removeAllElements();
                B.D();
                HG.eb.A(5);
                LA(0);
                L();
                M(1);
                HG.iA = true;
                break;
            }
            case 38: {
                A.D(313, 238, 39, 6);
                break;
            }
            case 36: {
                A.D(312, 238, 30, 6);
                break;
            }
            case 37: {
                A.D(462, 247, 32, 6);
                break;
            }
            case 32: {
                A.FA(2);
                break;
            }
            case 7: {
                W();
                if (MA(0)) {
                    L();
                }
                else if (MA(2)) {
                    if (S(0) != 0) {
                        L();
                    }
                }
                else if (HG.gA) {
                    if (A.nA > 0) {
                        if (S(2) != 0) {
                            L();
                            M(2);
                        }
                    }
                    else if (S(A.oA) != 0) {
                        L();
                        M(A.oA);
                    }
                }
                else if (S(1) != 0 && S(0) != 0) {
                    L();
                    M(1);
                }
                U();
                break;
            }
            case 8: {
                V();
                U();
            }
            case 5: {
                if (HG.c == null) {
                    LA(13);
                    break;
                }
                if (C()) {
                    HG.eb.A(4);
                    break;
                }
                LA(0);
                break;
            }
        }
    }
    
    static int EA(int n) {
        int n2 = 0;
        final short[] array = HG.hA[n];
        HG.oA = GA(n);
        int n3 = 0;
        for (int i = 0; i < HG.oA; ++i) {
            n = array[(i << 2) + 2];
            switch (n) {
                case 50: {
                    n2 += A(null, HG.nA[n3++], 0);
                    break;
                }
                case 105: {
                    n2 += A(null, null, false, 0, 0);
                    break;
                }
                case 103:
                case 104: {
                    n2 += A(null, HG.nA[n3++], 0, -1, (byte)(array[(i << 2) + 3] & 0xFF));
                    break;
                }
                case 102: {
                    n2 += A(null, null, 0, false, 0);
                    break;
                }
                case 108: {
                    n2 += A(null, 0);
                    break;
                }
                case 109: {
                    n2 += A(null, null, 0, 0, false);
                    break;
                }
                case 100:
                case 101: {
                    n2 += A(null, null, 0, false);
                    break;
                }
            }
        }
        return n2;
    }
    
    public static boolean A(final short n) {
        final short[] array = HG.hA[n];
        final short n2 = array[3];
        final short n3 = array[2];
        boolean b = false;
        if (n3 == 6 && n2 == 1) {
            HG.va = A.cc[1617] / A.cc[1622];
            HG.wa = A.C(true) + 3;
            HG.xa = A.f - (A.cc[1617] / A.cc[1622] + A.cc[1617] / A.cc[1622]);
            HG.ya = A.g - (A.C(true) + 3 + (A.cc[1607] + A.cc[1387] + A.cc[1617] / A.cc[1622] + A.cc[1640] + 5));
            final int n4 = A.cc[1650] / A.cc[1655] + 5;
            A.A(0, HG.va + n4, HG.wa, HG.xa, HG.ya);
            A.A(1, HG.va + n4, HG.wa, HG.xa, HG.ya);
        }
        else if (HG.jA == 0) {
            HG.va = 17;
            HG.wa = 20 + A.cc[1750] + A.cc[1486];
            HG.xa = A.f - 2 * HG.va;
            HG.ya = A.g - 10 - 5 - A.cc[1486] - HG.wa - (A.cc[1640] + 5);
            A.A(0, HG.va, HG.wa, HG.xa, HG.ya);
            A.A(1, HG.va, HG.wa, HG.xa, HG.ya);
        }
        else {
            final int n5 = A.j[2].getHeight() + 5;
            HG.va = 17;
            HG.wa = A.cc[1728] + 8 + n5 + A.cc[1486];
            HG.xa = A.f - 2 * HG.va;
            HG.ya = A.g - 10 - (HG.wa + A.cc[1486] + 4) - (A.cc[1640] + 5);
            A.A(2, HG.va + 2, A.cc[1728] + 6, HG.xa - 4, n5, 28);
            A.A(0, HG.va, HG.wa, HG.xa, HG.ya);
            A.A(1, HG.va, HG.wa, HG.xa, HG.ya);
        }
        switch (n) {
            case 1: {
                CA(n);
                break;
            }
            case 19: {
                P();
                b = true;
                break;
            }
            case 21: {
                W(n);
                b = true;
                break;
            }
            case 22: {
                X(n);
                break;
            }
            case 20: {
                Y(n);
                break;
            }
            case 23: {
                HG.fA |= 0x8;
                U(n);
                break;
            }
            case 24: {
                V(n);
                break;
            }
            case 25: {
                HG.fA |= 0x4;
                Z(n);
                break;
            }
            case 26: {
                AA(n);
                break;
            }
            case 14: {
                BA(n);
                break;
            }
            case 18: {
                HG.fA = 0;
                break;
            }
        }
        Q();
        return b;
    }
    
    public static void Q() {
        A.A(0, 0, 0);
        A.A(1, -2, 0);
        A.A(2, -2, 0);
    }
    
    public static String[] A(int i, final Font font, final int n) {
        String[] array = null;
        switch (i) {
            case 1: {
                final char[] charArray = new String("11-01-2008").toCharArray();
                array = A("(c) 20" + charArray[8] + charArray[9] + ",\n" + I(473) + "\n" + I(13) + "\nv " + HG.fb.getAppProperty("MIDlet-Version"), font, n, 0);
                break;
            }
            case 4: {
                if ((short)(A.ya[HG.eA][0] & 0xFFFF) == 1) {
                    i = A.ya[HG.eA][1] + A.ya[HG.eA][2];
                    array = A(I(i), font, n, 0);
                    break;
                }
                break;
            }
            case 5: {
                final int n2 = A.ya[HG.eA][1];
                int n3 = n2 + A.ya[HG.eA][2];
                if ((short)(A.ya[HG.eA][0] & 0xFFFF) == 1) {
                    --n3;
                }
                String str = "";
                for (i = n3; i > n2; --i) {
                    if ((short)(A.ya[HG.eA][0] & 0xFFFF) != 1 && i == n3) {
                        str += I(i);
                    }
                    else {
                        str = str + "\n" + I(i);
                    }
                    if (i > n2 + 1) {
                        str += "\n";
                    }
                }
                if (str.length() > 0) {
                    array = A(str, font, n, 0);
                    break;
                }
                break;
            }
            case 2: {
                array = A(I(303) + ", " + I(293) + ":\n" + I(201) + "\n\n" + I(300) + ", " + I(297) + ":\n" + I(195) + "\n\n" + I(302) + ", " + I(295) + ":\n" + I(199) + "\n\n" + I(304) + ", " + I(296) + ":\n" + I(203) + "\n\n" + I(306) + ", " + I(294) + ":\n" + I(207) + "\n\n" + I(299) + ":\n" + I(193) + "\n\n" + I(301) + ":\n" + I(197) + "\n\n" + I(305) + ":\n" + I(205) + "\n\n" + I(307) + ":\n" + I(209) + "\n\n" + I(309) + ":\n" + I(213) + "\n\n" + I(308) + ":\n" + I(189) + "\n\n" + I(310) + ":\n" + I(191) + "\n\n" + I(311) + ":\n" + I(211), font, n, 0);
                break;
            }
            case 3: {
                array = A(I(303) + ", " + I(293) + ":\n" + I(200) + "\n\n" + I(300) + ", " + I(297) + ":\n" + I(194) + "\n\n" + I(302) + ", " + I(295) + ":\n" + I(198) + "\n\n" + I(304) + ", " + I(296) + ":\n" + I(202) + "\n\n" + I(306) + ", " + I(294) + ":\n" + I(206) + "\n\n" + I(309) + ":\n" + I(212) + "\n\n" + I(310) + ":\n" + I(190) + "\n\n" + I(311) + ":\n" + I(210) + "\n\n\n" + I(298) + ":\n" + I(407), font, n, 0);
                break;
            }
            case 6: {
                array = A(I(299) + ":\n" + I(192) + "\n\n" + I(301) + ":\n" + I(196) + "\n\n" + I(305) + ":\n" + I(204) + "\n\n" + I(307) + ":\n" + I(208) + "\n\n" + I(308) + ":\n" + I(188), font, n, 0);
                break;
            }
        }
        return array;
    }
    
    public static void A(int ia, int n, final int n2) {
        final int n3 = ia + n;
        n = HG.wa + HG.ya;
        if (n3 > n) {
            ia = n3 - n;
            HG.ta -= ia;
        }
        else if (ia < HG.wa) {
            ia = HG.wa - ia;
            HG.ta += ia;
        }
        ia = IA(HG.jA);
        if (n2 == ia) {
            HG.ta = HG.wa;
        }
    }
    
    public static byte FA(final int n) {
        byte b = 0;
        switch (n) {
            case 0: {
                if (MA(0)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 1: {
                if (MA(1)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 2: {
                if (MA(2)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 7: {
                if (MA(5)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 3: {
                if (MA(3)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 4: {
                if (!MA(3)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 8: {
                if (MA(6)) {
                    b = 1;
                    break;
                }
                break;
            }
            case 9: {
                if (!MA(6)) {
                    b = 1;
                    break;
                }
                break;
            }
        }
        return b;
    }
    
    public static void C(final int n, final int n2) {
        switch (n) {
            case 0: {
                if (n2 == 1) {
                    E(0, 1);
                    break;
                }
                break;
            }
            case 1: {
                if (n2 == 1) {
                    E(1, 1);
                    break;
                }
                break;
            }
            case 2: {
                if (n2 == 1) {
                    E(2, 1);
                    break;
                }
                break;
            }
            case 3: {
                if (n2 == 1) {
                    E(3, 1);
                    break;
                }
                break;
            }
            case 4: {
                if (n2 == 1) {
                    E(3, 0);
                    break;
                }
                break;
            }
            case 8: {
                if (n2 == 1) {
                    E(6, 1);
                    break;
                }
                break;
            }
            case 9: {
                if (n2 == 1) {
                    E(6, 0);
                    break;
                }
                break;
            }
        }
    }
    
    static int GA(final int n) {
        int n2 = 0;
        final int n3 = HG.hA[n].length / 4;
        int n4 = 0;
        for (int i = 0; i < n3; ++i) {
            n4 += 4;
            n2 = (short)(n2 + 1);
        }
        return n2;
    }
    
    static int HA(int n) {
        int n2 = 0;
        final short[] array = HG.hA[n];
        final int n3 = array.length / 4;
        int n4 = 0;
        for (int i = 0; i < n3; ++i) {
            n = array[n4 + 2];
            n4 += 4;
            if (n > 99 && n < 200) {
                n2 = (short)(n2 + 1);
            }
        }
        return n2;
    }
    
    static String A(final short n, final short n2) {
        String i = "";
        int n3 = HG.hA[n][(n2 << 2) + 0];
        if (n3 >= 0) {
            if (n == 25) {
                n3 |= 0x40000;
            }
            i = I(n3);
        }
        return i;
    }
    
    static int IA(int n) {
        int n2 = -1;
        GA(n);
        final short[] array = HG.hA[n];
        int i = 0;
        int n3 = 0;
        while (i == 0) {
            n = (n3 << 2) + 2;
            if (n <= array.length) {
                n = array[n];
                if (n > 99 && n < 200) {
                    n2 = n3;
                    i = 1;
                }
            }
            else {
                i = 1;
            }
            ++n3;
        }
        return n2;
    }
    
    static int JA(int n) {
        int n2 = -1;
        final short[] array = HG.hA[n];
        n = array.length / 4;
        for (int i = n - 1; i >= 0; --i) {
            n = array[(i << 2) + 2];
            if (n > 99 && n < 200) {
                n2 = i;
                break;
            }
        }
        return n2;
    }
    
    static int D(int i, final int n) {
        if (i < 0 || i >= HG.hA.length) {
            return -1;
        }
        short[] array;
        for (array = HG.hA[i], i = 0; i < array.length; i += 4) {
            if (array[i + 0] == n) {
                return i / 4;
            }
        }
        return -1;
    }
    
    static void A(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n < 0 || n >= HG.hA.length) {
            return;
        }
        final short[] array = HG.hA[n];
        final int n7 = n2 * 4;
        if (n7 < 0 || n7 > array.length) {
            return;
        }
        final short[] array2 = new short[array.length + 4];
        if (n7 == 0) {
            System.arraycopy(array, 0, array2, 4, array.length);
        }
        else if (n7 == array.length) {
            System.arraycopy(array, 0, array2, 0, array.length);
        }
        else {
            System.arraycopy(array, 0, array2, 0, n7);
            System.arraycopy(array, n7, array2, n7 + 4, array.length - n7);
        }
        array2[n7 + 0] = (short)n3;
        array2[n7 + 1] = (short)n4;
        array2[n7 + 2] = (short)n5;
        array2[n7 + 3] = (short)n6;
        HG.hA[n] = array2;
    }
    
    static void R() {
        if (HA(HG.jA) > 0) {
            final short[] array = HG.hA[HG.jA];
            final short n = array[HG.kA * 4 + 2];
            final int n2 = array.length / 4;
            if (n == 103 || n == 104 || n == 108) {
                if (-HG.ta < HG.ua - HG.wa - HG.ya) {
                    HG.ta -= A.j[2].getHeight();
                }
                if (HG.xA) {
                    if (HG.bb >= 0) {
                        HG.kA = HG.bb;
                    }
                    else {
                        ++HG.kA;
                    }
                }
                return;
            }
            ++HG.kA;
            if (HG.kA >= n2) {
                HG.kA = 0;
                HG.ta = HG.wa;
            }
            final short n3 = array[HG.kA * 4 + 2];
            if (n3 <= 99 || n3 >= 200) {
                R();
            }
        }
        Q();
    }
    
    static void S() {
        final boolean b = HA(HG.jA) > 0;
        final int ka = HG.kA;
        if (b) {
            final short[] array = HG.hA[HG.jA];
            final short n = array[HG.kA * 4 + 2];
            if (n == 103 || n == 104 || n == 108) {
                if (HG.ta < HG.wa) {
                    HG.ta += A.j[2].getHeight();
                }
                else {
                    --HG.kA;
                }
                if (HG.yA && ka == HG.kA) {
                    --HG.kA;
                }
            }
            else if (HG.cb >= 0 && HG.cb < HG.kA) {
                HG.kA = HG.cb;
            }
            else {
                --HG.kA;
            }
            final int ia = IA(HG.jA);
            final int ja = JA(HG.jA);
            if (HG.kA < ia) {
                HG.kA = ja;
            }
            final short n2 = array[HG.kA * 4 + 2];
            if (n2 <= 99 || n2 >= 200) {
                S();
            }
        }
    }
    
    static void T() {
        final int n = HG.hA[HG.jA].length / 4;
        if (HG.kA >= 0 && HG.kA < n) {
            final short[] array = HG.hA[HG.jA];
            final int n2 = HG.kA * 4;
            final short n3 = array[n2 + 1];
            final short n4 = array[n2 + 3];
            switch (array[n2 + 2]) {
                case 100:
                case 107: {
                    HG.lA.push(new Integer(HG.jA));
                    HG.lA.push(new Integer(HG.kA));
                    LA(n3);
                    break;
                }
                case 101:
                case 105:
                case 106:
                case 109: {
                    DA(n3);
                    break;
                }
                case 102: {
                    int n5 = -1;
                    for (int i = 0; i <= HG.kA; ++i) {
                        if (HG.hA[HG.jA][(i << 2) + 2] == 102) {
                            ++n5;
                        }
                    }
                    final int ga = GA(HG.jA);
                    final short n6 = n4;
                    if (n6 >= 0) {
                        int n7 = 0;
                        for (int j = 0; j < ga; ++j) {
                            final short[] array2 = HG.hA[HG.jA];
                            if (array2[(j << 2) + 2] == 102) {
                                if (array2[(j << 2) + 3] == n6) {
                                    HG.qA[n7] = 0;
                                }
                                ++n7;
                            }
                        }
                    }
                    HG.qA[n5] = 1;
                    C(n3, 1);
                    break;
                }
            }
        }
    }
    
    static void B(final short n) {
        final boolean a = A(n);
        HG.ta = HG.wa;
        final short[] array = HG.hA[HG.jA];
        HG.oA = GA(n);
        if (HG.mA == null || HG.mA.length != HG.oA) {
            HG.mA = new String[HG.oA];
        }
        int n2 = 0;
        int n3 = 0;
        HG.pA = 0;
        HG.rA = -1;
        HG.sA = -1;
        HG.tA = -1;
        HG.uA = -1;
        HG.vA = -1;
        HG.wA = -1;
        for (short n4 = 0; n4 < HG.oA; ++n4) {
            switch (array[(n4 << 2) + 2]) {
                case 50:
                case 103:
                case 104: {
                    ++n2;
                    continue;
                }
                case 106:
                case 107: {
                    ++HG.pA;
                    HG.mA[n4] = A(n, n4);
                    continue;
                }
                case 3: {
                    HG.rA = array[(n4 << 2) + 1];
                    HG.tA = array[(n4 << 2) + 3];
                    HG.vA = array[(n4 << 2) + 0];
                    continue;
                }
                case 2: {
                    HG.sA = array[(n4 << 2) + 1];
                    HG.uA = array[(n4 << 2) + 3];
                    HG.wA = array[(n4 << 2) + 0];
                }
                case 4:
                case 5:
                case 6: {
                    continue;
                }
                case 102: {
                    ++n3;
                    break;
                }
            }
            HG.mA[n4] = A(n, n4);
        }
        if (n3 > 0) {
            if (HG.qA == null || HG.qA.length != n3) {
                HG.qA = new byte[n3];
            }
            int n5 = 0;
            for (int i = 0; i < HG.oA; ++i) {
                if (array[(i << 2) + 2] == 102) {
                    HG.qA[n5] = FA(array[(i << 2) + 1]);
                    ++n5;
                }
            }
        }
        if (n2 > 0) {
            HG.nA = new String[n2][];
            int n6 = 0;
            for (short n7 = 0; n7 < HG.oA; ++n7) {
                final short n8 = array[(n7 << 2) + 2];
                if (n8 == 103 || n8 == 50) {
                    HG.nA[n6] = A(A(n, n7), A.j[2], HG.xa - 6, 0);
                    ++n6;
                }
                else if (n8 == 104) {
                    HG.nA[n6] = A(array[(n7 << 2) + 1], A.j[2], HG.xa - 8 - 8);
                    ++n6;
                }
            }
        }
        HG.ua = EA(n);
        if (!a) {
            HG.kA = IA(n);
        }
        if (HG.kA < 0 || HG.kA * 4 + 2 >= HG.hA[n].length || HG.hA[n][HG.kA * 4 + 2] <= 99 || HG.hA[n][HG.kA * 4 + 2] >= 200) {
            HG.kA = IA(n);
        }
    }
    
    static void KA(final int n) {
        HG.mA = null;
        HG.nA = null;
        HG.oA = 0;
    }
    
    static void C(final Graphics graphics) {
        if (A.c) {
            A.A(graphics);
            return;
        }
        if (HG.jA == -1) {
            return;
        }
        if (HG.jA <= 17) {
            B(graphics);
        }
        final short[] array = HG.hA[HG.jA];
        int ta = HG.ta;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        HG.xA = false;
        HG.yA = false;
        boolean b = false;
        HG.zA = false;
        HG.bb = -1;
        HG.cb = -1;
        for (int i = 0; i < HG.oA; ++i) {
            final short n4 = array[(i << 2) + 2];
            if (n4 >= 0) {
                String s;
                if (HG.mA != null && HG.mA[i] != null) {
                    s = HG.mA[i];
                }
                else {
                    s = "null";
                }
                graphics.setClip(HG.va, HG.wa, HG.xa, HG.ya);
                switch (n4) {
                    default: {
                        final boolean b2 = i == HG.kA;
                        int n5;
                        if (n4 == 102) {
                            n5 = A(null, s, ta, b2, n2);
                        }
                        else {
                            n5 = A(null, s, ta, b2);
                        }
                        HG.zA = true;
                        final int n6 = ta + n5;
                        final int n7 = HG.wa + HG.ya;
                        if ((n6 > HG.wa && ta < n7) || b2) {
                            if (n4 == 102) {
                                A(graphics, s, ta, b2, n2);
                                ++n2;
                            }
                            else {
                                A(graphics, s, ta, b2);
                            }
                            if (b && i > HG.kA) {
                                HG.xA = true;
                                if (HG.bb < 0) {
                                    HG.bb = i;
                                }
                            }
                            HG.zA = true;
                            HG.ab = i;
                        }
                        else if (n4 == 102) {
                            ++n2;
                        }
                        ta += n5;
                        break;
                    }
                    case 6: {
                        final short n8 = array[(i << 2) + 3];
                        final boolean b3 = (n8 & 0x2) == 0x2 || (n8 & 0x1) == 0x1;
                        final boolean b4 = (n8 & 0x4) == 0x4 || (n8 & 0x1) == 0x1;
                        final boolean b5 = (n8 & 0x8) == 0x8 || (n8 & 0x1) == 0x1;
                        if (!b3) {
                            break;
                        }
                        A.A(graphics, b4, b5, true, A.yb);
                        if ((HG.fA & 0x1) != 0x0) {
                            graphics.setClip(0, 0, A.f, A.g);
                            graphics.setColor(A.i[5]);
                            final int n9 = A.cc[1518] + A.cc[1386] - 1 + 7;
                            final int n10 = A.f - n9 - 1 - 7;
                            final int n11 = A.j[2].getHeight() + 5 + 5;
                            A.A(10, n9 + 4, A.g - n11 - (A.cc[1387] - n11 >> 1) - A.cc[1607] + 4, n10 - 8, n11 - 8, 156);
                            A.A(I(406) + I(309), 10, 2, graphics);
                            break;
                        }
                        break;
                    }
                    case 2:
                    case 3:
                    case 4: {
                        break;
                    }
                    case 50: {
                        final String[] array2 = HG.nA[n];
                        ++n;
                        ta += A(graphics, array2, ta);
                        break;
                    }
                    case 105: {
                        ta += A(graphics, s, i == HG.kA, ta, array[(i << 2) + 3]);
                        break;
                    }
                    case 103:
                    case 104: {
                        final String[] array3 = HG.nA[n];
                        ++n;
                        final byte b6 = (byte)(array[(i << 2) + 3] & 0xFF);
                        final int a = A(null, array3, ta, -1, b6);
                        final int n12 = ta + a;
                        final int n13 = HG.wa + HG.ya;
                        if (n12 > n13) {}
                        if (n12 > HG.wa && ta < n13) {
                            A(graphics, array3, ta, (byte)(array[(i << 2) + 3] >> 8 & 0xFF), b6);
                            b = true;
                            if (HG.zA && HG.ab < HG.kA) {
                                HG.yA = true;
                                HG.cb = i;
                            }
                        }
                        ta += a;
                        break;
                    }
                    case 108: {
                        ta += A(graphics, ta);
                        break;
                    }
                    case 1: {
                        A(graphics, s);
                        break;
                    }
                    case 106:
                    case 107: {
                        ta += A(graphics, s, ta, array[(i << 2) + 3], n3, i == HG.kA);
                        ++n3;
                        break;
                    }
                    case 109: {
                        ta += A(graphics, s, array[(i << 2) + 3], ta, i == HG.kA);
                        break;
                    }
                    case 5: {
                        A.A(graphics, array[(i << 2) + 3]);
                        break;
                    }
                }
            }
        }
        if (HG.jA == 19 || HG.jA == 21) {
            graphics.setColor(A.i[5]);
            graphics.drawLine(HG.va, HG.wa, HG.va + HG.xa - 1, HG.wa);
        }
        A(graphics);
    }
    
    static void U() {
        if (!HG.lA.empty()) {
            final int intValue = HG.lA.pop();
            final int intValue2 = HG.lA.pop();
            HG.kA = intValue;
            LA(intValue2);
            if (HG.hA[HG.jA][intValue * 4 + 2] > 99 && HG.hA[HG.jA][intValue * 4 + 2] < 200) {
                HG.kA = intValue;
            }
        }
    }
    
    static void LA(int ja) {
        ja = (short)ja;
        KA(HG.jA);
        B(HG.jA = (short)ja);
    }
    
    public static void V() {
        if (B(0)) {
            HG.db = D(0);
            if (HG.db.length != 7) {
                HG.db = new byte[7];
            }
        }
        else {
            HG.db[0] = 0;
            HG.db[1] = 0;
            HG.db[2] = 0;
            HG.db[5] = 0;
            HG.db[6] = 0;
            HG.db[3] = 1;
            HG.db[4] = 0;
            W();
        }
    }
    
    public static void W() {
        A(0, HG.db);
    }
    
    public static void E(final int n, final int n2) {
        if (n < -1 || n >= HG.db.length || (n2 != 0 && n2 != 1)) {
            return;
        }
        if (n == 1 && n2 == 1) {
            HG.db[1] = 1;
            HG.db[2] = 0;
            HG.db[5] = 0;
        }
        else if (n == 2 && n2 == 1) {
            HG.db[1] = 0;
            HG.db[2] = 1;
            HG.db[5] = 0;
        }
        else if (n == 0 && n2 == 1) {
            HG.db[1] = 0;
            HG.db[2] = 0;
            HG.db[5] = 0;
        }
        else if (n == 5 && n2 == 1) {
            HG.db[1] = 0;
            HG.db[2] = 0;
            HG.db[5] = 1;
        }
        else {
            HG.db[n] = (byte)n2;
        }
    }
    
    public static boolean MA(final int n) {
        if (n < -1 || n >= HG.db.length) {
            return false;
        }
        if (n == 0) {
            return HG.db[1] == 0 && HG.db[2] == 0 && HG.db[5] == 0;
        }
        return HG.db[n] == 1;
    }
    
    public HG() {
        HG.fb = this;
        if (HG.eb == null) {
            HG.eb = new A(this);
            A.i = E();
            A.j = F();
            Display.getDisplay((MIDlet)this).setCurrent((Displayable)HG.eb);
            this.D();
            (A.e = new Thread(HG.eb)).start();
            V();
            HG.eb.A(1);
        }
    }
    
    public void destroyApp(final boolean b) {
        this.notifyDestroyed();
    }
    
    public void pauseApp() {
        if (HG.eb != null) {
            A.WB();
        }
    }
    
    protected void startApp() {
    }
    
    public void commandAction(final Command command, final Displayable displayable) {
    }
    
    static {
        HG.a = new char[] { '\n', ' ', ',', '?', '-', ':', ';', '/', '.', '!' };
        b = new Random();
        HG.d = false;
        HG.e = 2;
        HG.f = -1;
        HG.g = 0;
        HG.l = new String[] { "MAIN", "DIALOGUE_INITRIA", "DIALOGUE_KHORINIS", "DIALOGUE_MISC", "QUESTS" };
        HG.m = new byte[] { 1, 2, 2, 2, 2 };
        HG.n = new boolean[HG.l.length];
        HG.o = new String[HG.l.length][];
        HG.q = 0;
        HG.r = "";
        HG.s = null;
        HG.t = "";
        HG.u = null;
        HG.aa = 100;
        HG.ba = 100;
        ca = new String[] { ".mid", ".amr", ".wav", ".mp3", ".ott", ".mmf", ".spf", ".wav" };
        da = new String[] { "audio/midi", "audio/amr", "audio/x-wav", "audio/mpeg", "", "audio/mmf", "", "audio/x-wav" };
        HG.ea = 0;
        HG.ga = 0;
        HG.ha = 0;
        HG.ia = false;
        HG.ja = -1;
        HG.ka = false;
        HG.la = "";
        HG.ma = true;
        HG.na = 0;
        HG.oa = new Vector();
        HG.pa = new Vector();
        HG.qa = -1;
        HG.ra = null;
        HG.sa = new int[7];
        HG.ta = 0;
        HG.ua = 0;
        HG.va = 0;
        HG.wa = 0;
        HG.xa = 0;
        HG.ya = 0;
        HG.za = 0;
        HG.aA = 0;
        HG.bA = 0;
        HG.cA = 0;
        HG.dA = 1;
        HG.eA = 0;
        HG.fA = 0;
        HG.gA = false;
        HG.hA = null;
        HG.iA = true;
        HG.jA = -1;
        HG.kA = 0;
        HG.lA = new Stack();
        HG.mA = null;
        HG.nA = null;
        HG.oA = 0;
        HG.pA = 0;
        HG.rA = -1;
        HG.sA = -1;
        HG.tA = -1;
        HG.uA = -1;
        HG.vA = -1;
        HG.wA = -1;
        HG.xA = false;
        HG.yA = false;
        HG.zA = false;
        HG.ab = 0;
        HG.bb = -1;
        HG.cb = -1;
        HG.db = new byte[7];
        HG.eb = null;
        HG.fb = null;
    }
}
