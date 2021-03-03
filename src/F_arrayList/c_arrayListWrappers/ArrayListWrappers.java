package F_arrayList.c_arrayListWrappers;

import java.util.ArrayList;
import java.util.List;

public class ArrayListWrappers {

    // primitives cannot be added to List, only their Wrapper classes

    public static void main(String[] args) {
//        List<double> list = new ArrayList<>(); incorrect

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(10.5); // adding value is NOT primitive due to autoboxing
        doubleList.add(Double.valueOf(5));
        doubleList.add(new Double(4.9));
        doubleList.remove(4.9); // again autoboxing
        double first = doubleList.get(0);
        System.out.println(first);
        doubleList.remove(first);
        System.out.println(doubleList);

        List<Integer> intList = new ArrayList<>();
        intList.add(null);
        System.out.println(intList);
//        int number = intList.get(0); // primitive types can NOT hold null value(s) > NullPointerException
//        System.out.println(number);

        List<Integer> nums = new ArrayList<>();
        nums.add(1); // autoboxing to Integer, index 0
        nums.add(2); // index 1

        nums.remove(1); // by default removes by index, to remove the specific object use .remove(Object)
        nums.remove(Integer.valueOf(1));
        System.out.println(nums);
    }
}
