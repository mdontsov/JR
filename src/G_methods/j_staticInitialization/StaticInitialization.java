package G_methods.j_staticInitialization;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {
    /*
     * STATIC initializer runs when the class is first-used. Usually try to avoid using them
     * if FINAL member is not immediately assigned then later it can be assigned ONLY in static initializer block
     * */
    private static final int SIZE;

    private static int one;
    private static final int TWO;
    private static final int THREE = 3;
    private static final List<String> NAMES;
//    private static final int FOUR; // un-initialized FINAL won't allow the code to compile

    static {
        System.out.println("First static init:");
        SIZE = 10;
        NAMES = new ArrayList<>();
    }

    static {
        System.out.println("Second static init:");
        one = 1;
        TWO = 2;
        one = THREE; // one is not final so it can be reassigned multiple times
        one = 2;
        one = THREE;
    }

    static {
        System.out.println("Third static init:");
        NAMES.add("Jimmy");
        NAMES.add("Timmy");
    }

    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
