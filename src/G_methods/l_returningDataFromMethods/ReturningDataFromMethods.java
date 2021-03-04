package G_methods.l_returningDataFromMethods;

public class ReturningDataFromMethods {

    public static void main(String[] args) {
        int number = 2;
        String word = "xyz";
        number(number); // initial number variable not reassigned > result ignored
        word = word(word); // initial word variable is reassigned > result changed
//        word(word);
        System.out.println("number = " + number); // a
        System.out.println("word = " + word); // xyza
    }

    public static int number(int number) {
        number++;
        return number;
    }

    public static String word(String word) {
        word += "a";
        return word;
    }
}
