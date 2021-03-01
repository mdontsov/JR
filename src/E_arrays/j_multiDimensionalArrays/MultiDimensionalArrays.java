package E_arrays.j_multiDimensionalArrays;

public class MultiDimensionalArrays {

    // Java is row-natured so rows are first in multidimensional arrays

    public static void main(String[] args) {
        // 1D array
        int[] my1dArray = {0, 1};

        // symmetrical 2D array
        int[][] my2dArray = new int[2][4]; // 2 rows and 4 columns
        int anotherArray[][] = new int[2][4];
        int[] myArray[] = new int[3][3]; // actually it's 2d array with confusing declaration

        // asymmetrical 2D array;
        String[][] myAssymetricalArray = new String[][]{
                {"one", "two"}, // 1st row with 2 elements
                {"three", "four", "five"}, // 2nd row with 3 elements
                {"six", "seven", "eight", "nine"}, // 3rd row with 4 elements
                null
        };

        int[][] numberTable = new int[2][3];
        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;

        // 3D array: pages | rows | columns
        int[][][] my3dArray = new int[3][3][3];
        int[][][] myNext3dArray = new int[][][]{
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, // outer curly braces representing page(s)
                {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}
        };
    }
}
