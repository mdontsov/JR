package A_basics.b_mainMethod;

public class Main {

    /**
     *
     * @param ints
     * @return int sum
     */

    public static int sum(int... ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i]; // first iteration: sum = 0 + ints[i], then sum = sum + ints[i]
        }
        return sum;
    }

    /**
     *
     * @param args
     */

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        System.out.println("args-size: " + args.length);

        System.out.println(sum(5, 2));
    }
}
