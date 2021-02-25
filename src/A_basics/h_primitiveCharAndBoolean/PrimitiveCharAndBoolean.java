package A_basics.h_primitiveCharAndBoolean;

public class PrimitiveCharAndBoolean {

    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = '1';
        char uniChar = '\u03a9'; // upper case greek omega character
        char romanChar = '\u216c'; // roman 50 number

        System.out.println("ch = " + ch + ", ch2 = " + ch2 + ", uniChar = " + uniChar + ", romanChar = " + romanChar);

        boolean myTrueBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myTrueBoolean = " + myTrueBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);
    }
}
