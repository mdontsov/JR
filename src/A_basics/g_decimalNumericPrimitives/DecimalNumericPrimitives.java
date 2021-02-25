package A_basics.g_decimalNumericPrimitives;

public class DecimalNumericPrimitives {

    public static void main(String[] args) {
        float myNum = 2_5.4F; // same as 25.4, illegal underscore placing: before, after or in the middle right before or after .
        double myDouble = 2.54;
        double myDoubleAsFloat = 2.54F; // F(f) = Float
        double myExplicitDouble = 2.54D; // D(d) = Double
        double scientificDouble = 5.89468276E5; // E(e) + (0)number = how far we can move the dot/comma to the right
        double scientificDoubleAsRegularDouble = 589468.276; // same as 5.89468276E5
        System.out.println(scientificDouble + ", " + scientificDoubleAsRegularDouble);

        double Pi = java.lang.Math.PI;
        String hexPi = Double.toHexString(Pi);

        System.out.println("double PI = " + Pi + ", double HEX PI = " + hexPi);
    }
}
