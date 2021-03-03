package G_methods.m_overloadingMethods;

import java.util.Arrays;

public class OverloadingMethods {

    /*
     * SAME names but DIFFERENT params:
     * 1. EXACT match by type or signature or arguments
     * 2. LARGER primitive type
     * 3. AUTOBOXED type
     * 4. VARARGS
     * */

    public void walk(int miles) {
    }

    public void walk(short feet) {
    }

    public boolean walk() {
        return false;
    }

    void walk(int miles, short feet) {
    }

    public void walk(float miles) {
    }

    //    public int walk(float miles){} // different return type but the same name and signature > not valid
//    public static void walk(float miles){} // static but return type, name and signature are the same > not valid
    public void walk(int[] lengths) {
    }
//    public void walk(int... lengths){} // varargs are treated as array > same signature > not valid

    public static void run(int length) {

    }

    public static void run(Integer length) {

    }

    public static void run(double kilometers) { // float param will be auto-promoted to double

    }

    public static void jump(String s) {
        System.out.println("string = " + s);
    }

    public static void jump(Object o) {
        System.out.println("object = " + o);
    }

    public static int sum(int a, int b) {
        System.out.println("int sum: ");
        return a + b;
    }

    public static long sum(long a, long b) {
        System.out.println("long sum: ");
        return a + b;
    }

    public static Integer sum(Integer a, Integer b) {
        System.out.println("Integer sum: ");
        return a + b;
    }

    public static int sum(int... numbers) {
        System.out.println("Varargs sum: ");
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    // Auto-promotion: int > long > Integer > Varargs > not valid
    public static void main(String[] args) {
//        run(5L);
//        jump("Test");
//        jump(25); // Object is a super type for all objects
        sum(1, 2);
    }
}
