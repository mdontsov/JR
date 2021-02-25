package B_operators.c_unaryOperators;

public class UnaryOperators {

    public static void main(String[] args) {

        int x = 3;
        System.out.println("x = " + x);

        double y = -x; // negative operand
        System.out.println("x = " + x + ", y = " + y);

        y = -y; // -(-3.0) > 3.0
        System.out.println("y = " + y);

        boolean a = true;
        boolean b = !a; // opposite to true is false
        System.out.println("a = " + a + ", b = " + b);

        b = !b; // negative false is true
        System.out.println("a = " + a + ", b = " + b);

        // increment and decrement have higher priority than any arithmetical operator

        int a1 = 5;
        int a2 = ++a1; // pre-increment immediately increases value by 1 and return it
        System.out.println("a1 = " + a1 + ", a2 = " + a2);

        int a3 = 5;
        int a4 = a3++; // post-increment first uses original value and then increments it by 1
        System.out.println("a3 = " + a3 + ", a4 = " + a4);

        int count = 0;
        System.out.println("count = " + count); // no changes eg 0
        System.out.println("count = " + ++count); // gets pre-incremented first by 1
        System.out.println("count = " + count--); // no changes eg still 1
        System.out.println("count = " + count); // gets post-decremented by 1 eg 0

        int e = 3;
        int f = ++e*5/(e--)+(--e); // ++3*5/(4--)+(--4) > 4*5/4+2 > 20/4+2 > 7
        System.out.println("e = " + e + ", f = " + f);

        int g = 6;
        int h = 2;
        int i = (++h)+(--g)*3+2*(g++)-(h--)%(--g); // (++h)+(--g)*3+2*(g++)-(h--)%(--g) > 3+5*3+2*(5--)-(3--)%3 >

    }
}
