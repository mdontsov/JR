package E_arrays.i_variableArguments;

import java.util.Arrays;

public class VariableArguments {

//    public static void main(String[] args) {
//        System.out.println(args.length);
//        System.out.println(Arrays.toString(args));
//
//    }

    public static void main(String... args) {

        System.out.println(args.length);
        System.out.println(Arrays.toString(args));
        print("Java");
        print("this", "is", "string", "array");
        print("variable", "arguments", "are", "nice", "and", "useful");
    }

    private static void print(String... args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }
}
