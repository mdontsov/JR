package E_arrays.d_forEachLoop;

public class ForEachLoop {

    // for (dataType variableName : collection) { for each loop body }

    public static void main(String[] args) {

        String[] names = {"Jimmy", "John", "Tom", "Anthony"};
        for (int i = 0; i < names.length; i++) {
            System.out.println("name = " + names[i]);
        }

        for (String name : names) {
            System.out.println("name = " + name);
        }

        StringBuilder[] builders = {new StringBuilder("For"), new StringBuilder("loop")};

        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        for (StringBuilder builder : builders) {
            builder.append("123");
        }

        for (StringBuilder builder : builders) {
            System.out.println(builder);
        }

        String pets = "Parrot";
        for (char c : pets.toCharArray()) {
            System.out.println(c);
        }
    }
}
