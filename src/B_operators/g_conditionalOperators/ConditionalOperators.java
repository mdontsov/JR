package B_operators.g_conditionalOperators;

public class ConditionalOperators {

    public static void main(String[] args) {

        /**
         * && - BOTH have to be true. If left side is already false then right side is NEVER executed
         * || - ONE or BOTH have to be true
         * ^ - ONLY ONE has to be true
         */

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b; // false
        boolean e = a || b; // true
        System.out.println("d =  " + d + ", e = " + e);

        int f = 4;
        boolean g = false && (f++ < 4); // false && skipped part > false
        boolean h = (f-- == 4) && !g; // (4-- == 4) && true > true && true > true
        System.out.println("f = " + f + ", g = " + g + ", h = " + h);

        int i = 3;
        int ii = 4;
        boolean bb = (i <= 3) && (ii-- ==4) || (i++ == 4); // (3 <= 3) && (4-- ==4) || (3++ == 4) > true && true || false > true
        System.out.println("i = " + i + ", ii = " + ii + ", bb = " + bb);

        boolean x = true, z = false; // initial values are actually never used
        int y = 20;
        x = (y != 10) ^ (z = false); // true ^ false > true
        System.out.println("x = " + x + ", z = " + z + ", y = " + y);
    }
}
