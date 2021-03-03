package F_arrayList.f_searchingArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingArrayList {

    public static void main(String[] args) {

        // List search works the similar or same way as Array searching
        List<String> numsList = new ArrayList<>();

        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");
        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "10");
        System.out.println(index); // currently -1 as List isn't sorted yet

        Collections.sort(numsList);
        index = Collections.binarySearch(numsList, "10");
        System.out.println(index);

        List<Integer> intList = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(intList);

        index = Collections.binarySearch(intList, 7); // returns the index if value key is found
        System.out.println(index); // -3

        Collections.sort(intList);
        System.out.println(intList);
        index = Collections.binarySearch(intList, 7);
        System.out.println(index); // 3
    }
}
