package B_operators.i_equalsAndEquality;

public class EqualsAndEquality {

    public static void main(String[] args) {

        /**
         * equals() compares the actual value while == compares hash and value
         * ANY Integer object which value is in range from -128 to +127 and not instantiated with new operator
         * will have the same hash and the same value, eg both == and equals() will be true
         */

        Integer intA = 127;
        Integer intB = 127;
        Integer intC = intA;
        Integer intD = intB;
        System.out.println("equality: " + (intA == intB) + ", equals: " + intA.equals(intB));
        System.out.println("equality: " + (intB == intC) + ", equals: " + intB.equals(intC));
        System.out.println("equality: " + (intC == intD) + ", equals: " + intC.equals(intD));
        System.out.println("equality: " + (intD == intA) + ", equals: " + intD.equals(intA));
        System.out.println("Hash: " + System.identityHashCode(intA));
        System.out.println("Hash: " + System.identityHashCode(intB));
        System.out.println("Hash: " + System.identityHashCode(intC));
        System.out.println("Hash: " + System.identityHashCode(intD));

        intA = 128; //
        intB = 128;
        System.out.println("equality: " + (intA == intB) + ", equals: " + intA.equals(intB));
        System.out.println("Hash: " + System.identityHashCode(intA));
        System.out.println("Hash: " + System.identityHashCode(intB));

        Integer int1 = new Integer(1);
        Integer int2 = new Integer(1);
        Integer int3 = 1;
        System.out.println("equality: " + (int1 == int2) + ", equals: " + int1.equals(int2));
        System.out.println("equality: " + (int2 == int3) + ", equals: " + int2.equals(int3));
        System.out.println("equality: " + (int3 == int1) + ", equals: " + int3.equals(int1));
        System.out.println("Hash: " + System.identityHashCode(int1));
        System.out.println("Hash: " + System.identityHashCode(int2));
        System.out.println("Hash: " + System.identityHashCode(int3 ));
    }
}
