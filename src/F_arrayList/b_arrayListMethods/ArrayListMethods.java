package F_arrayList.b_arrayListMethods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods {

    public static void main(String[] args) {

//        List list = new ArrayList();
        List<Object> list = new ArrayList<>(); // Using generic Object will allow the list to hold any object type(s)
        list.add("Dog");
        list.add(5);
        System.out.println(list);

        List<String> pets = new ArrayList<>();
        pets.add("Dog");
        System.out.println(pets);

        pets.add(0, "Cat"); // New value will be stored at index 0, the previous is now at index 1
        System.out.println(pets);

        pets.add(2, "Snake");
        System.out.println(pets);

        pets.add(3, "Hamster");
        System.out.println(pets);

        pets.add(1, "Parrot");
        System.out.println(pets);

        pets.remove("Dog");
        System.out.println(pets);

        pets.remove(1);
        System.out.println(pets);

        pets.remove("Cat");
        System.out.println(pets);

        pets.set(0, "Fish"); // set() does not change list size but updates the value(s)
        System.out.println(pets);

        System.out.println(pets.isEmpty()); // boolean
        System.out.println(pets.size()); // total num of elements

        if (pets.isEmpty()) {
            System.out.println("No pets");
        }

        if (pets.size() == 0) {
            System.out.println("No pets");
        }

        pets.clear(); // removes all the elements from the list
        System.out.println(pets.isEmpty()); // boolean
        System.out.println(pets.size()); // total num of elements

        pets.add("Dog");
        System.out.println(pets.contains("Cat") ^ pets.contains("Dog"));
        pets.add("Dog");
        pets.set(1, "Cat");
        System.out.println(pets);

        List<String> newPets = new ArrayList<>();
        newPets.add("Dog");
        System.out.println(pets.equals(newPets)); // case-sensitive equality check, eg each list must contain the same data in the same order
        newPets.add("Cat");
        System.out.println(newPets);
        System.out.println(pets.equals(newPets));
    }
}
