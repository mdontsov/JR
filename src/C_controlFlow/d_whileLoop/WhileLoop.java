package C_controlFlow.d_whileLoop;

public class WhileLoop {

    public static void main(String[] args) {

        int spaceOnHdd = 5;

        while (spaceOnHdd > 0) {
            spaceOnHdd--;
            System.out.println("space on disk = " + spaceOnHdd);
        }

        int x = 2;
        int y = 5;
        while (x < 10) {
            ++y; // x will always = 2 and never reach 10 > y will run in an endless loop
            ++x;
        }
        System.out.println("x = " + x + ", y = " + y);

        int a = 5;
        int b = 7;
        while (a > 6) {
            b += 2;
            a++;
        }
        a = a > 6 ? a++ : b--; // a > 6 is false so a = b > a = 7 and b gets post decremented > b = 6
        System.out.println("a = " + a + ", b = " + b + ", a + b = " + (a + b));
    }
}
