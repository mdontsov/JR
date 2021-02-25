package B_operators.b_numericPromotionAndCasting;

public class NumericPromotionAndCasting {

    public static void main(String[] args) {

        /**
         * Promotion is auto-converting smaller primitive types into larger primitive ones
         */

        int x = 5;
        double y = 10.55;
        Object result = x + y; // x is promoted into y so both x and y are now doubles
        System.out.println("x+y = " + result);

        byte b = 10;
        int c = 5;
        double d = 4.5;

        result = b + c + d; // b is promoted into c first then both b and c are promoted into d
        System.out.println("b+c+d = " + result);

        /**
         * Casting is an opposite to promotion when larger primitive types are MANUALLY converted to smaller ones
         */

        double dd = 5.55;
        int cc = 4 + (int) dd; // cc is a type of int so dd must be casted to int as well, losing its decimal part > 5+4
        System.out.println("4+dd = " + cc);

        int i = 125;
        byte bb = 15;
        int ii = i + bb;
        byte s = (byte) (i + bb); // byte can hold the values from -128 to 128
        System.out.println("ii = " + ii + ", s = " + s);

        /**
         * proper float variable must have F(f) at the end
         */
    }
}
