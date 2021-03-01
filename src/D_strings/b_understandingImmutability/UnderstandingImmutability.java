package D_strings.b_understandingImmutability;

import java.util.Locale;

public class UnderstandingImmutability {
    /**
     * String class is IMMUTABLE. It is impossible to change the existing String without creating the NEW instance of it
     * @param args
     */

    public static void main(String[] args) {
        String hello = "hello";
        String hi = hello + "world";
        hi = hello; // hi = hello = "hello"
        System.out.println(hi + hello); // hellohello

        hello = hello.toUpperCase(); // without reassigning the result will still be lowercase "hello"
        System.out.println(hello);

        // concatenation
        String s1 = "1";
        String s2 = s1.concat("2");
        s2.concat("3"); // this is ignored because s2 is not reassigned otherwise it is immutable

        System.out.println("s1 = " + s1 + ", s2 = " + s2);
    }
}
