package G_methods.i_finalVariables;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class FinalVariables {

    // FINAL - constant eg never changes
    // FINAL can be created either inside or outside public methods

    private static final int SIZE = 10;
    private static final List<String> VALUES = new ArrayList<>();

    public static void main(String[] args) {

        int[] myInt = new int[SIZE]; // ALWAYS 10 and never changes unless the constant is manually changed
        int doubleSize = SIZE * 2; // valid as SIZE not changing
//        SIZE++; // now SIZE = 11

        /*
        * At the moment of array declaration its size was 10
        * and later has been incremented > IndexOutOfBoundsException
        * */
        for (int i = 0; i < SIZE; i++) {
            System.out.println(myInt[i]);
        }

        VALUES.add("changed"); // methods can be called upon FINAL members BUT reassigning isn't possible
        final int myNumber = 10;
    }
}
