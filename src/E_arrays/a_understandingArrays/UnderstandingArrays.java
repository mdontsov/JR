package E_arrays.a_understandingArrays;

import java.util.Arrays;

public class UnderstandingArrays {
    public static void main(String[] args) {

        /**
         * Array initial length means an amount of indexes
         * Arrays have fixed sizes upon initialization
         * Strings and StringBuilders are arrays by default
         */

        int[] one = new int[3]; // array with 3 elements that initially hold 0
        int[] two = new int[]{10, 11, 12}; // array with 3 elements that already hold their initial values
        double[] three = new double[]{};
        double[] four = new double[]{2.55, 0, 1.6};
        double[] five = new double[5*4/2];
        int x = 4;
        int y = 4;
        double[] six = new double[x*y];

        // anonymous array
        int[] seven = {10, 11, 12}; // array initialized without explicitly specifying its type
        int[] eight = {};
        int nine[] = {}; // also valid

        int[] arr1, arr2 = {}; // valid but not a good practice
        int arr4[], myInt; // creates 1 integer array and 1 integer variable

        String[] animals = {"Parrot", "Dog", "Cat"};
        String[] new_animals = animals;
        String[] otherAnimals = {"Parrot", "Dog", "Cat"};
        System.out.println(animals.equals(new_animals)); // same values and reference > true
        System.out.println(animals == new_animals); // same values and reference > true
        System.out.println(Arrays.equals(animals, new_animals)); // same array contents > true

        // Arrays.equals() checks ONLY the values matching without checking the arrays references
        System.out.println(animals.equals(otherAnimals)); // same values and but other reference > false
        System.out.println(animals == otherAnimals); // same values but other reference > false
        System.out.println(Arrays.equals(animals, otherAnimals)); // same array values > true

        System.out.println(animals); // prints out only the type of array and its hash number
        System.out.println(Arrays.toString(animals));
    }
}
