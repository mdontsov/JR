package C_controlFlow.e_doWhileLoop;

public class DoWhileLoop {

    public static void main(String[] args) {
        /**
         * do {...} while (EXPLICIT false) > will execute ONLY ONCE
         */

        int a = 10;
        do {
            a++;
            System.out.println("a = " + a);
        } while (false);
        System.out.println("a = " + a);

        int x = 20;
        while (x > 10) {
            x--;
            System.out.println("x = " + x); // the result will also include the first value that evaluates to false
        }

        int x2 = 20;
        do {
            x2--;
            System.out.println("x = " + x2); // the result will also include the first value that evaluates to false
        } while (x2 > 10);

        int y = 10;
        int z = 5;
        while (y < 20) {
            y++;
        }
        z += 2;
        y += 10;
        System.out.println("y = " + y + ", z = " + z);

        int num = 10;
        while (num > 10) { // false > never executes
            num--;
        }
        do {
            num--; // 9 | 7
            while (num > 5) { // 9>5 | 7>5
                num -= 2; // 9-2=7 | 7-2=5
            }
        } while (num > 10); // until 10 < 10 > endless loop
        System.out.println("num = " + num);

    }
}
