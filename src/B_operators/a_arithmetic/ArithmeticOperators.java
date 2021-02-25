package B_operators.a_arithmetic;

public class ArithmeticOperators {
    /**
     * --var > decrement first then calculate the result
     * var-- > first calculate the result then decrement
     * ++var > increment first then calculate the result
     * var++ > first calculate the result then increment
     */

    public static void main(String[] args) {

        int result; // created but not initialized yet

        result = 3-2+2*2+3; // 3-2+2*2+3 > 3-2+4+3 > 1+4+3 > 8
        System.out.println("result = " + result);

        result = 4/2+1-4*2+10; // 4/2+1-4*2+10 > 4/2+1-8+10 > 2+1-8+10 > 3-8+10 > 5
        System.out.println("result = " + result);

        int a = 4;
        int b = 3-2*--a; // 3-2*--a > 3-2*3 > 3-6 > -3 // Pre increment/decrement WILL affect the calculated result.
        System.out.println("a = " + a + ", b = " + b);

        a = 4;
        b = 3-2*a--; // Post increment/decrement WON'T affect the calculated result. Only single variable gets changed afterwards
        System.out.println("a = " + a + ", b = " + b);

        long cc = 2;
        long dd = 4+3*cc++; // Post increment/decrement WON'T affect the calculated result. Only single variable gets changed afterwards
        System.out.println("cc = " + cc + ", dd = " + dd);

        result = 10-3*(2+1)-4/(1+3); // 10-3*(2+1)-4/(1+3) > 10-3*3-4/4 > 10-9-1 > 0
        System.out.println("result = " + result);

        int i = 10;
        int j = 3;
        int k = i%j; // 10%3 > 10-3*number where result is closest or equal to 10 > 10-3*3 > 1
        int l = 10%2; // 10%2 > 10-2*number where result is closest or equal to 10 > 10-2*5 > 0
        System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", l = " + l); // % operator shows the division remainder and NOT the closest to 0 value

        int f = 12;
        int g = 5;
        int h = 2;
        int m = f/2-10%(4+3)-2*f%g-h*3; // 12/2-10%(4+3)-2*12%5-2*3 > 12/2-10%7-2*12%5-2*3 > 6-3-4-6 > -7
        System.out.println("m = " + m);
    }
}
