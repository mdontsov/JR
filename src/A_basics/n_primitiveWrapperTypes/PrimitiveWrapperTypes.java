package A_basics.n_primitiveWrapperTypes;

public class PrimitiveWrapperTypes {
    /**
     * null = None
     * @param args
     */

    /**
     * Boxing - converting primitive into Wrapper
     * Unboxing - converting Wrapper into primitive
     */

    public static void main(String[] args) {

        int myInt = 10;
        Integer myInteger = new Integer(20); // Integer is wrapper class for int
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(20);
        Integer myInteger4 = Integer.valueOf("20");
        Integer myInteger5 = null; // Wrapper classes can be null while primitives can NOT

        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println("myInteger5 = " + myInteger5);

        int myInt3 = myInteger3; // Wrapper(myInteger3) > primitive(myInt3) = unboxing
        Integer myInteger6 = myInt; // primitive(myInt) > Wrapper(myInteger6) = boxing

        System.out.println("myInt3 = " + myInt3);
        System.out.println("myInteger6 = " + myInteger6);

//        int myInt4 = myInteger5; // myInteger5 is null > primitives(int) cannot hold null values = NullPointerException
//        System.out.println("myInt4 = " + myInt4);

        sum(5, 3); // autoboxing to Integer types
        sum(myInteger, myInteger);
    }

    private static void sum(Integer... integers) {
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum += integers[i];
            System.out.println(sum);
        }
    }
}
