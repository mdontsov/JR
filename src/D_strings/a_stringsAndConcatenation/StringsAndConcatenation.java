package D_strings.a_stringsAndConcatenation;

public class StringsAndConcatenation {

    public static void main(String[] args) {

        String text = "Hello";
        String newText = new String("Hello");

        System.out.println(2 + 3); // 5
        System.out.println("a" + "b"); // ab
        System.out.println(1 + 2 + "d"); //3d
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four); // 64

        int number = 10;
        int anotherInt = 20;
        System.out.println("result = " + number + anotherInt); // must use parenthesis to get the right result otherwise the concatenation

        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i + " ";
            System.out.println("i = " + i);
        }
        System.out.println("str = " + str);

        String hello = "hello";
        String world = "world";
        String helloWorld = hello + world;

        System.out.println(hello);
    }
}
