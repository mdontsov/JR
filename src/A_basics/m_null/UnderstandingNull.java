package A_basics.m_null;

public class UnderstandingNull {

    static Object myObj = new Object();
    static Object myObj2; // any STATIC variable is implicitly initialized as null
    static String myString = "JAVA";

    public static void main(String[] args) {
        Object mylocalObj = new Object();
        Object myLocalObj2;

        String name = "java";
        String newName = null;

        System.out.println("myObj = " + myObj);
        System.out.println("myObj2 = " + myObj2);
        System.out.println("myLocalObj = " + mylocalObj);
//        System.out.println("myLocalObj2 = " + myLocalObj2); // any LOCAL variable must be initialized after declaration
        System.out.println("name = " + name);
        System.out.println("newName = " + newName);
        System.out.println("myString = " + myString);
        myString.toLowerCase(); // myString does not have any assigned value except null, so methods cannot be called upon null or empty objects
    }
}
