package B_operators.e_compoundAssignmentOperators;

public class CompoundAssignmentOperators {

    public static void main(String[] args) {

        int x = 2;
        int z = 3;

        x = x*z; // 2*3=6
        x*=z; // 6*=3 > 6*3 > 18
        System.out.println("x = " + x + ", z = " + z);

        long a = 10;
        int b = 4;
        b = (int)(b*a); // OR b*=a > b = (int)(b*a)
        System.out.println("b = " + b);

        long c = 4;
        long d = (c = 2); // c equals 2 for now
        System.out.println("c = " + c + ", d = " + d); // 2, 2

        long e = 3;
        long f = 2; // actual value is never used due to reassignment
        long h = 1;
        long i = e+3*(f=3)-(h-=2); // 3+3*3-(h=1-2) 3+3*3-(-1) > 3+9+1 > 13
        System.out.println("e = " + e + ", f = " + f + ", h = " + h + ", i = " + i);
    }
}
