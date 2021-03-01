package D_strings.d_stringMethods;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Java is fun";
        System.out.println("length = " + str.length()); // length > indexes from 0 to 10

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(9));

        System.out.println(str.indexOf("r")); // returns the first index of letter or whole word if found else -1
        System.out.println(str.indexOf("a", 2)); // returns the first index of letter starting from index, if not found then -1
        System.out.println(str.indexOf("fun"));
        System.out.println(str.indexOf("fun", 10));

        // if NOT reassigned then substring() does NOT change the string
        // non existing indexes will throw IndexOutOfBoundException
        System.out.println(str.substring(8)); // returns the letter or whole word starting from index, if not found then -1
        System.out.println(str.substring(0, 5)); // returns the letter or whole word between indexes (both are inclusive), if not found then -1
        System.out.println(str.substring(4, 4)); // the same start and end index return an empty string
//        System.out.println(str.substring(4, 2)); // start index cannot be less than end index

        // toUpperCase() and toLowerCase() do NOT change the string
        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
//        dog.toUpperCase(); // NOT reassigned so still "Lucky"
        dog = dog.toUpperCase();
        System.out.println(dog);

        String str1 = "java";
        String str2 = "Java";
        String str3 = "ja";

        System.out.println(str1.equals(str2)); // compare value with case-sensitive > false
        System.out.println(str1.equalsIgnoreCase(str2)); // compare value ignoring case-sensitive > true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        // startsWith() | endsWith() > are case-sensitive and return boolean if criteria does not match
        System.out.println(str1.startsWith("j")); // true
        System.out.println(str1.startsWith(str3)); // true
        System.out.println(str1.startsWith("J")); // false
        System.out.println(str1.endsWith("un")); // false

        // contains > is case-sensitive and look for matches
        System.out.println(str1.contains(str3)); // true
        System.out.println(str1.contains("av")); // true
        System.out.println("Java".contains("j")); // false

        // replace > replaces letters, words or special character in String. if not not reassigned then initial String is NOT changed
        String myString = "Java" + " " + "is" + " " + "cool";
        System.out.println(myString.replace("a", "A"));
        System.out.println(myString.replace(" ", "_"));
        System.out.println(myString.replace("is", "_"));
        System.out.println(myString);

        // trim > removes whitespaces from start and end of the String
        System.out.println("Java".trim()); // no whitespaces > no changes
        System.out.println(" Java is cool  "); // no trim() > no changes
        System.out.println(" Java is cool  ".trim()); // trim() > no spaces in beginning and ending of String
    }
}
