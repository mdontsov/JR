package E_arrays.c_commonArrayProblems;

public class CommonArrayProblems {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 1; i < numbers.length; i++) {
            System.out.println(i + "-" + numbers[i]); // 1-2 | 2-3 | 3-4 | 4-5
        }

        for (int i = 1; i <= numbers.length - 1; i++) {
            System.out.println(i + "-" + numbers[i]); // ArrayIndexOutOfBoundsException
        }

        int size = numbers.length;

        // once set the length of array CANNOT be changed

    }
}
