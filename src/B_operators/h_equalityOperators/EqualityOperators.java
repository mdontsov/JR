package B_operators.h_equalityOperators;

public class EqualityOperators {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;
        boolean c = a == b; // == or != always return either true or false eg boolean
        boolean d = a != b; // true
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

//        boolean z = true == 0; wrong assignment

        boolean x = true;
        boolean y = false;
        boolean z = (y != true) && (x = false); // true && false > false
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }
}
