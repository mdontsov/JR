package F_arrayList.e_sortingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

    public static void main(String[] args) {

        List<String> numsList = new ArrayList<>();

        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);
        Collections.sort(numsList); // helper class call to sort the List
        System.out.println(numsList); // Strings are alphabetically sorted but not 100% accurate

        List<Integer> numbers = Arrays.asList(5, 4, 6, 10, 11, 7, 3); // fixed size unlinked List
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
