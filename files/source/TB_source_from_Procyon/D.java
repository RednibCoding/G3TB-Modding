import java.util.Vector;

// 
// Decompiled by Procyon v0.5.36
// 

public class D extends Thread
{
    static Vector a;
    static boolean b;
    static boolean c;
    static int d;
    
    public static void A(final int value) {
        if (D.a == null) {
            D.a = new Vector(1, 1);
        }
        if (D.c) {}
        D.a.addElement(new Integer(value));
    }
    
    public static void B(final int n) {
        if (n >= 0) {
            HG.L(n);
        }
    }
    
    public void run() {
        while (true) {
            try {
                while (true) {
                    ++D.d;
                    D.c = false;
                    D.b = true;
                    int size = 0;
                    if (D.a != null) {
                        size = D.a.size();
                    }
                    if (size > 0 && !HG.ka) {
                        for (int i = 0; i < size; ++i) {
                            final int intValue = D.a.elementAt(0);
                            HG.Q(intValue);
                            HG.R(intValue);
                            D.a.removeElementAt(0);
                        }
                    }
                    if (HG.ka) {
                        HG.M();
                    }
                    D.c = true;
                    Thread.sleep(80L);
                }
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    static {
        D.b = false;
        D.c = false;
        D.d = 0;
    }
}
