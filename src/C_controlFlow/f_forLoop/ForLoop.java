package C_controlFlow.f_forLoop;

public class ForLoop {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int j;
        for (j = 0; j < 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("j = " + j);

        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) { // y = 0 |
            System.out.println("y = " + y);
        }
        System.out.println("x = " + x);

//        int d = 10;
//        for (int i = 0, d = 0; i < 10| d < 10; i++, d--) { // does not even compile as d already defined
//
//        }

//        for (long z = 0, int d = 4; z < 10; z++, d++) { // does not compile as different variables types are used
//
//        }

        for (long z = 0; z < 10; z++) {
        }
        for (double d = 0.0; d < 10.5; d += 0.5) {
        }
    }
}
