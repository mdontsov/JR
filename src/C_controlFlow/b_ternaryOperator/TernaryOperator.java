package C_controlFlow.b_ternaryOperator;

public class TernaryOperator {

    public static void main(String[] args) {
        /**
         * ternary operator accepts only 1 true or false result
         */

        int x = 10;
        int y;

        if (x > 5) {
            y = 2 * x;
        } else {
            y = 4 * x;
        }
        System.out.println("y = " + y);

        y = (x > 5) ? (2 * x) : (4 * x);
        System.out.println("y = " + y);

        // not same data type example
        y = 1;
        System.out.println((y > 5) ? 10 : "Test");

        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++; // currently both a and b = 1 but as soon as c is calculated one of them will be = 2
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        int d = 1;
        int e = 2;
        int f = 3;
        if (d < 10) {
            f = d++ < 1 ? e++ : f++;
        } else {
            f = (d + e) < 2 ? d++ : e++;
        }
        System.out.println("d = " + d + ", e = " + e + ", f = " + f);
    }
}
