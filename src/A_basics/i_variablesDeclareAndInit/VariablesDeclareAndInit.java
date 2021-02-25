package A_basics.i_variablesDeclareAndInit;

public class VariablesDeclareAndInit {

    public static void main(String[] args) {
        int myInt;
//        System.out.println("myInt = " + myInt); // variable declared but not initialized

        myInt = 5; // variable initialized
        System.out.println("myInt = " + myInt);

        double myDouble = 7.2;
        System.out.println("myDouble = " + myDouble);

        float myFloat1, myFloat2, myFloat3;
        float myFloat4; double myDouble2;
        double myDouble3, myDouble4 = 4, myDouble5;
//        int myInt1, int myInt2; // does not compile
//        int myInt3; myInt4; // does not Compile

        float okFloat;
        double $okDouble;
        double _okDouble;
        float __okFloat$_123;

        double _3dPoint;
//        String my@street; // does not compile
//        String *coffee; // does not compile;
    }
}
