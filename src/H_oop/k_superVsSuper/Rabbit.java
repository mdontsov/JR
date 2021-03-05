package H_oop.k_superVsSuper;

import H_oop.h_classInheritance1.Animal;
import H_oop.o_creatingInterface.Herbivore;
import H_oop.q_staticInterfaceMethods.Hop;

public class Rabbit extends Animal implements Herbivore, Hop {
    // Animal does NOT have default constructor so it must be EXPLICITLY declared
    public Rabbit() {
//        super();

        // ALL 3 below are VALID while inheriting
        super.setAge(3);
        this.setAge(3);
        setAge(3);
    }

    public Rabbit(int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 2;
    }

    @Override
    public void printName() {

    }

//    @Override
//    public void eatPlants() {
//
//    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit jumps " + Hop.getAverageJumpHeight() + " meters high");
    }
}
