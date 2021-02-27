package C_controlFlow.c_switchCase;

import java.util.Random;

public class SwitchCase {

    public static void main(String[] args) {

        /**
         * as soon as switch finds the first brake statement it exits from execution
         */

        int dayOfWeek = 0;
        switch (dayOfWeek) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend");
        }

        Random r = new Random();
        int ch = r.nextInt(26 + 'a');
        System.out.println((char)ch + ", " + ch + ": ");

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("sometimes a vowel");
                break;
            default:
                System.out.println("consonant");
        }

        int x = 4;
        switch (x) {
            case 4:

        }
    }
}
