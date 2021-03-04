package F_arrayList.d_arrayListAndArrayConversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAndArrayConversions {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        Object[] namesArray = names.toArray(); // converts to Array of type Object
        System.out.println(namesArray.length);
        System.out.println(names.size());

//        String[] stringArray = names.toArray(new String[0]); // String array resizing
//        for (String str : stringArray) {
//            System.out.println(str);
//        }

        String[] anotherArray = names.toArray(new String[names.size()]); // converts ArrayList to Array with the same size
        for (String str : anotherArray) {
            System.out.println(str);
        }

        String[] petsArray = {"Dog", "Cat", "Parrot"};

        List<String> petsFixedList = Arrays.asList(petsArray); // fixed size linked to Array list, NOT possible to add or remove element(s)
        List<String> petsList = Arrays.asList("Dog", "Cat", "Fish"); // also fixed size but unlinked List, NOT possible to add or remove element(s)
        System.out.println(petsFixedList.size());

        petsFixedList.set(0, "Bird"); // replace the value of element at index 0
        petsList.set(0, "Lizard");

        // Changing the linked fixed List will also affect the Array it was created from

        System.out.println(petsFixedList);
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        petsArray[0] = "Fish";
        System.out.println(petsFixedList);
        System.out.println(Arrays.toString(petsArray));

//        petsFixedList.remove(1); // NOT possible for fixed size List
//        petsList.remove(1); // NOT possible for fixed size List
        System.out.println(petsFixedList);
        System.out.println(petsList);
        System.out.println(Arrays.toString(petsArray));

        List<String> list = Arrays.asList("one", "two", "three"); // still fixed size but unlinked List
        System.out.println(list);
//        list.add("four"); // NOT possible
        list.remove("two"); // NOT possible

    }
}
