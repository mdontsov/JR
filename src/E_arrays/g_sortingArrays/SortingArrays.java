package E_arrays.g_sortingArrays;

import java.util.Arrays;

public class SortingArrays {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 2};

        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(numbers));

        String[] strings = {"50", "9", "500"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings)); // sorting strings takes into consideration their alphabetical order
    }
}
