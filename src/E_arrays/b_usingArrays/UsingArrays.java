package E_arrays.b_usingArrays;

import java.util.Arrays;

public class UsingArrays {

    public static void main(String[] args) {
        String[] pets = {"Parrot", "Cat", "Dog"}; // length = 3
        System.out.println(Arrays.toString(pets));
        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
//        System.out.println(pets[3]); // ArrayIndexOutOfBoundsException
        System.out.println(Arrays.toString(pets)); // uses StringBuilder to display the values

        // length = 3 but latest index is 2 so i <= array.length will cause ArrayIndexOutOfBoundsException
        // in case when using i <= array.length-1
        for (int i = 0; i <= pets.length - 1; i++) {
            System.out.println(pets[i]);
        }

        for (String str : pets) {
            System.out.println(str);
        }

        int[] numbers = new int[5];
        System.out.println(Arrays.toString(numbers));

        String[] newPets = new String[5];
        System.out.println(Arrays.toString(newPets));

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 10; // 0 + 10 | 1 + 10 | 2 + 10 | 3 + 10 | 4 + 10
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        Integer[] nums = new Integer[4];
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 3; // every index number % 3 > 0%3=0 | 1%3=1 | 2%3=2 | 3%3=0
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
