package A_basics.f_wholeNumericPrimitives;

public class WholeNumericPrimitives {

    public static void main(String[] args) {
        long max = 3846872185L;
        long n = 2_300; // same as 2300

        // octal number (0-7)
        int oct = 07;
        int firstOct = 010;
        int secondOct = 022;
        int sumOct = firstOct + secondOct;

        System.out.println("firstOct = " + firstOct + " secondOct = " + secondOct);
        System.out.println("sumOct = " + sumOct + ", sumOctAsOct = " + Integer.toOctalString(sumOct));

        // hex number (0x...)
        int firstHex = 0xF; // 15
        int secondHex = 0x1E; // 30
        int sumHex = firstHex + secondHex;
        System.out.println("firstHex = " + firstHex + ", secondHex = " + secondHex);
        System.out.println("sumHex = " + sumHex + ", subHexAsHex = " + Integer.toHexString(sumHex));

        // binary number (0b...)
        int firstBin = 0b1001;
        int secondBin = 0b0111;
        int sumBin = firstBin + secondBin;
        System.out.println("firstBin = " + firstBin + ", secondBin = " + secondBin);
        System.out.println("sumBin = " + sumBin + ", subBinAsBin = " + Integer.toBinaryString(sumBin));
    }
}
