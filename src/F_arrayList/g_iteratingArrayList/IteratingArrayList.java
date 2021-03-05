package F_arrayList.g_iteratingArrayList;

import java.util.*;

public class IteratingArrayList {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        // for or foreach loops do NOT allow to modify the List while iterating it
        // ONLY Iterator or ListIterator allow to do that
        // Iterator instance have only 3 methods: hasNext(), next() and remove()
        // ListIterator instance additionally have: hasPrevious()

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("index " + i + " with " + numbers.get(i));
//            numbers.remove(i); IndexOutOfBoundsException
        }

        for (int i : numbers) {
            System.out.println("number " + i);
//            numbers.remove(2); ConcurrentModificationException
        }

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) { // hasNext > boolean
//            Integer number = iterator.next();
            System.out.println(iterator.next());
            iterator.remove(); // remove the current value while iterating the List
        }

        System.out.println(numbers);

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)); // easy way to add a bunch of fixed values. The List itself is normal
        numbers.add(7);
        System.out.println(numbers);

        ListIterator<Integer> listIterator = numbers.listIterator(3); // ListIterator starts from index 3
        while (listIterator.hasPrevious()) { // iterating backwards
//            Integer number = listIterator.previous();
            System.out.println(listIterator.previous()); // 3, 2, 1
            listIterator.remove();
        }
        System.out.println(numbers); // 4, 5, 6, 7

        // For loop vs Foreach loop vs Iterator vs ListIterator
        // For loop is suitable when using indexes but most likely the slowest
        // Foreach is the easiest
        // Iterator is good when iterating and removing at the same time
        // ListIterator is good when iterating to set, get or iterate backwards and most likely the fastest

        List<String> stringList = Arrays.asList(createArray());
        long startTime;
        long totalTime;
        String _temp;

        // For loop
        startTime = System.currentTimeMillis();
        for (int i = 0; i < stringList.size(); i++) {
            _temp = stringList.get(i);
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("For loop Run time: " + totalTime + "ms");

        // Foreach loop
        startTime = System.currentTimeMillis();
        for (String str : stringList) { }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Foreach loop Run time: " + totalTime + "ms");

        // Iterator
        startTime = System.currentTimeMillis();
        Iterator<String> stringIterator = stringList.iterator();
        while (stringIterator.hasNext()) {
            _temp = stringIterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("Iterator Run time: " + totalTime + "ms");

        // ListIterator
        startTime = System.currentTimeMillis();
        ListIterator<String> stringListIterator = stringList.listIterator();
        while (stringListIterator.hasNext()) {
            _temp = stringListIterator.next();
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println("ListIterator Run time: " + totalTime + "ms");
    }

    private static String[] createArray() {
        String[] stringArray = new String[60_000_000];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }
}
