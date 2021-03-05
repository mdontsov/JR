package H_oop.o_creatingInterface;

import H_oop.h_classInheritance1.Animal;

public class Bear extends Animal implements Omnivore {

    @Override
    public int getWeight() {
        return 100;
    }

    @Override
    protected void printName() {
        System.out.println("Bear");
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eats meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Beat eats plants");
    }
}
