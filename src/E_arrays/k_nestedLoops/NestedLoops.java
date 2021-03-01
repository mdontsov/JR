package E_arrays.k_nestedLoops;

import java.util.Arrays;

public class NestedLoops {

    public static void main(String[] args) {

//        for (int hours = 1; hours <= 6; hours++) {
//            for (int minutes = 0; minutes < 60; minutes++) {
//                System.out.println(hours + ":" + minutes);
//            }
//        }

        int[][] myArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(myArray));
//        OUTER:
//        for (int i = 0; i < myArray.length; i++) {
//            INNER:
//            for (int j = 0; j < myArray[i].length; j++) {
//                System.out.print(myArray[i][j] + " ");
//            }
//            System.out.println();
//        }

        OUTER:
        for (int[] rowArray : myArray) {
            INNER:
            for (int i = 0; i < myArray.length; i++) {
                if (rowArray[i] % 2 == 0) {
//                    break INNER; // as soon as match found the inner loop breaks and proceeds to next row
//                    break OUTER; // as soon as match found the outer loop breaks and loop ends
//                    continue INNER; // as soon as match found the inner loop skip it and continues running
//                    continue OUTER; // as soon as match found the outer loop skips the whole row and proceeds to next row
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }

        int x = 10;
        while (x > 0) {
            do {
                x -= 1; // 4-1>3 | 2-1>1
            } while (x > 5); // 9-1>8 | 8-1>7 | 7-1>6 | 6-1>5
            x--; // 5-- >4 | 3-- >2  | 1-- >0
            System.out.println(x); // 4, 2, 0
        }
    }
}
