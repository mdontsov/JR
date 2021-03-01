package E_arrays.e_breakStatementAndLabels;

public class BreakStatementAndLabels {

    public static void main(String[] args) {

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        myLabel:
        {
            int[] myArray = {1, 2, 3};
        }

        for (String animal : animals) {
            if (animal.contains("zard")) {
                break; // breaks the loop if matches
            }
            System.out.println(animal); // only matches BEFORE break will be displayed
        }

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                break MY_LOOP;
            }
            System.out.println(animal);
        }

        animal:
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                break animal;
            }
            System.out.println(animal);
        }

        for (String animal : animals) {
            if (animal.equals("Lizard")) {
                break;
            }
            System.out.println(animal);
        }

        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];
            if (animal.equals("Lizard")) {
                break;
            }
            System.out.println(animal);
            index++;
            System.out.println(index);
        }

    }
}
