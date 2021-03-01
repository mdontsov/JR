package B_operators.j_characterArithmetic;

public class CharacterArithmetic {

    public static void main(String[] args) {

        /**
         * char is represented as integer between 0 and 65535
         */

        char charA = 'A';
        char charInt = '1';
        System.out.println("charA = " + charA + ", charInt = " + charInt);
        System.out.println("charA is letter = " + Character.isLetter(charA) + ", charA is digit = " + Character.isDigit(charA));
        System.out.println("charInt is digit = " + Character.isDigit(charInt) + ", charInt is letter = " + Character.isLetter(charInt));

        char letter = 65; // returns A
        int myInt = letter + 3; // chars are auto converted to ints > 65+3 > 68
        char newLetter = (char)myInt; // return D
        System.out.println("letter = " + letter + ", myInt = " + myInt + ", newLetter = " + newLetter);

        char myChar = 65; // A
        char newChar = (char)(myChar + 1); // 65+1 > 66 or B
        boolean b = newChar == 'B';
        boolean c = newChar++ < 'C'; // newChar here is actually checked BEFORE its post incremental so yet 66
        System.out.println("myChar = " + myChar + ", newChar = " + newChar + ", b = " + b + ", c = " + c);
    }
}
