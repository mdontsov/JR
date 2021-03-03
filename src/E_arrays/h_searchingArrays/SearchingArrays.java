package E_arrays.h_searchingArrays;

import java.util.Arrays;

public class SearchingArrays {

    /**
     * 1. Element found in sorted array > index of element is returned
     * 2. Element not found in sorted array > -numeric element position
     * 3. Unsorted array > result not predictable
     */

    public static void main(String[] args) {

        int[] numbers = {1, 3, 5, 6, 7};
        System.out.println(Arrays.binarySearch(numbers, 2)); // -2
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4)); // -3
        System.out.println(Arrays.binarySearch(numbers, 8)); // -6

        int[] unsortedNumbers = {5, 4, 10, 8, 6};
        Arrays.sort(unsortedNumbers);
        System.out.println(Arrays.toString(unsortedNumbers));
        System.out.println(Arrays.binarySearch(unsortedNumbers, 5));
        System.out.println(Arrays.binarySearch(unsortedNumbers, 4));
        System.out.println(Arrays.binarySearch(unsortedNumbers, 3)); // -1
        System.out.println(Arrays.binarySearch(unsortedNumbers, 10));
        System.out.println(Arrays.binarySearch(unsortedNumbers, 8));
        System.out.println(Arrays.binarySearch(unsortedNumbers, 6));
        System.out.println(Arrays.binarySearch(unsortedNumbers, 7));

    }
}
