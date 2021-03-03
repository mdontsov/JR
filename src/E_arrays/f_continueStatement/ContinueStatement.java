package E_arrays.f_continueStatement;

public class ContinueStatement {

    public static void main(String[] args) {

        String[] animals = {"Dog", "Cat", "Lizard", "Bird", "Snake"};

        MY_LOOP:
        for (String animal : animals) {
            if (animal.equals("Cat")) {
                continue MY_LOOP; // match excluded, loop continues
            }
            System.out.println(animal); // everything except criteria found
        }

        animal:
        for (String animal : animals) {
            if (animal.equals("Dog") || animal.equals("Bird")) {
                continue animal;
            }
            System.out.println(animal);
        }

        int index = 0;
        while (index < animals.length) {
            String animal = animals[index];
            index++;
            if (animal.equals("Bird")) {
                continue;
            }
            System.out.println(animal);
            System.out.println(index);
        }
    }
}
