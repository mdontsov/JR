package B_operators.d_assignmentOperators;

public class AssignmentOperators {

    public static void main(String[] args) {

//        int x = 1.0; wrong type
//        short y = 16854634; too large value
//        int z = 9f; long value cannot be assigned to integer type
//        long t = 12684687446944967727;

        int x = (int)1.0;
        short y = (short)16854634; // the largest number short can hold is 32767
        int z = (int)9f;
        long t = 1268468744694496772L;
        System.out.println("x = " + x + ", y = " + y + ", z = " + z + ", t = " + t);

        // overflow and underflow with byte (-128 to +127)
        byte b = 127;
        byte bb = -128;
        System.out.println("b = " + b + ", bb = " + bb);
        b++; // overflow here resulting reset to lowest value byte holds eg -128
        bb--; // underflow here resulting reset to highest value byte holds eg 127
        System.out.println("b = " + b + ", bb = " + bb);

        short a = 10;
        short c = 20;
        short d = (short)(a*c);
        System.out.println("d = " + d);
    }
}
