package F_arrayList.a_understandingArrayList;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingArrayList {

    public static void main(String[] args) {

        ArrayList myList = new ArrayList(); // array of objects or dynamic array
        ArrayList<Object> myList2 = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>(); // using List interface as type because ArrayList implements List
//        ArrayList<String> list3 = new List<String>(); invalid declaration
        List<String> list4 = new ArrayList<>(20);
    }
}
