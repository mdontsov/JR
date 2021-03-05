package H_oop.u_polymorphicParameters;

import H_oop.h_classInheritance1.Animal;
import H_oop.h_classInheritance1.Cat;
import H_oop.h_classInheritance1.Husky;
import H_oop.k_superVsSuper.Rabbit;

public class PolymorphicParameters {

    public static void main(String[] args) {

//        Husky husky = new Husky(3);
//        husky.setName("Mike");
//        printDetails(husky);
//
//        Rabbit rabbit = new Rabbit();
//        rabbit.setName("Bugs");
//        printDetails(rabbit);
//
//        Cat cat = new Cat(4);
//        cat.setName("Peach");
//        printDetails(cat);

        Animal rex = createAnimal("Rex", 4);
        printDetails(rex);

        Animal peach = createAnimal("Peach", 3);
        printDetails(peach);

        Animal bugs = createAnimal("Bugs", 1);
        printDetails(bugs);
    }

    static void printDetails(Animal animal) {
        animal.printDetails();
    }

    static Animal createAnimal(String name, int age) {
        if (name.equalsIgnoreCase("rex")) {
            Animal animal = new Husky(age);
            animal.setName(name);
            return animal;
        } else if (name.equalsIgnoreCase("peach")) {
            Animal animal = new Cat(age);
            animal.setName(name);
            return animal;
        }
        Animal animal = new Rabbit();
        animal.setName("Bugs");
        return animal;
    }

}
