package A_basics.k_variableScope;

public class VariableScope {

    static int myStaticInt = 5; // static fields and methods have global scope

    public static void main(String[] args) {
        int myPublicInt = 10;

        {
            {
                int innerInt = 10; // this variable becomes available to any inner blocks of code
                System.out.println("innerInt outside before = " + innerInt);
                {
                    innerInt = 3;
                    System.out.println("innerInt inside = " + innerInt);
                }
                System.out.println("innerInt outside after = " + innerInt); // variable was redirected in inner block so 3 and NOT 10
            }
            int myOtherInt = 20;
            System.out.println("myStaticInt inside = " + myStaticInt); // myStaticInt does exist everywhere
            System.out.println("myPublicInt inside = " + myPublicInt); // myPublicInt however exists within the whole main() method
            System.out.println("myOtherInt inside = " + myOtherInt); // myOtherInt does exist in this specific code block only
            int anotherInt = 45; // anotherInt is declared and initialized but never accessed in this code block
        }
        System.out.println("myStaticInt outside = " + myStaticInt);
        System.out.println("myPublicInt outside = " + myPublicInt);

        int myOtherInt = 8; // this myOtherInt is declared AFTER the block of code so it knows nothing about myOtherInt inside this block
        System.out.println("myOtherInt outside = " + myOtherInt);
        int anotherInt = 75; // this anotherInt is declared AFTER the block of code so it knows nothing about anotherInt inside this block
        System.out.println("anotherInt = " + anotherInt);

    }
}
