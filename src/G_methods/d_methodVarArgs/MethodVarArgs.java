package G_methods.d_methodVarArgs;

import java.util.Arrays;

public class MethodVarArgs {

    // Variable arguments can be null

    public void jump1(int... numbers) {

    }

    public void jump2(int start, int... numbers) {

    }

//    public void jump3(int... numbers, int start) { // varargs must be the last parameter
//
//    }

//    public void jump4(int... start, int... numbers) { // only one varargs param is allowed
//
//    }

    public void jump5(int[] start, int[] numbers) {

    }

    public static void jump6(int start, int... numbers) {
        System.out.println("start = " + start + ", numbers.length = " + numbers.length);
    }

    public static void run(int... numbers) {
        for (int number : numbers) {
            System.out.println("number = " + number);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void main(String[] args) {
        jump6(1);
        jump6(2, 3);
        jump6(3, 5, 6, 7);
        jump6(1, new int[]{4, 5, 6});
//        jump6(1, null); // NullPointerException > to avoid this just pass an empty array or nothing
        run(new int[]{1, 2, 3, 4});
    }
}
