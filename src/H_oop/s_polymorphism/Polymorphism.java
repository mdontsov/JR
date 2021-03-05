package H_oop.s_polymorphism;

import H_oop.h_classInheritance1.Animal;
import H_oop.h_classInheritance1.Cat;
import H_oop.h_classInheritance1.Dog;
import H_oop.h_classInheritance1.Husky;
import H_oop.k_superVsSuper.Rabbit;
import H_oop.l_overloadingVsOverriding.Bird;
import H_oop.l_overloadingVsOverriding.Eagle;
import H_oop.o_creatingInterface.Bear;
import H_oop.o_creatingInterface.CanRun;
import H_oop.o_creatingInterface.HasTail;
import H_oop.p_defaultInterfaceMethods.Run;

/**
 * Polymorphism - ability of the object to take many different forms
 */

public class Polymorphism {

    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("Mike");

        Dog dog = husky; // another reference to Husky object in memory
        dog.printDetails();

        HasTail hasTail = husky; // another reference to the same husky object
        System.out.println("Tail length = " + hasTail.getDefaultTailLength());

        CanRun canRun = husky; // another reference to the same husky object
        canRun.run(20);

        Animal animal = husky; // another reference to the same husky object
        animal.printDetails();

        Object obj = husky; // another reference to the same husky object

        Husky myDog = (Husky) animal; // reference to the same object via (Down)casting
        myDog.printName();

        Husky newHusky = (Husky) dog;

        Animal cat = new Cat(2); // Now Cat instance can call members from its abstract superclass Animal
        Cat myCat = (Cat) cat; // myCat is Cat while cat is Animal
        System.out.println(((Cat) cat).getSpeed()); // Animal does NOT implement Run while Cat does
        System.out.println(myCat.getSpeed());

//        Dog newDog = (Dog) cat; // Unrelated classes

        // Bird is NOT polymorphic
        Bird bird = new Bird();
        Object birdObject = bird;

        // Eagle IS polymorphic
        Eagle eagle = new Eagle();
        eagle.fly(500);
        Bird eagleBird = eagle;
        eagleBird.fly();
        Object eagleObject = eagle;

        Animal rabbitAnimal = new Rabbit();
        rabbitAnimal.printDetails(); // Animal prints the output from the reference at RUNTIME
    }
}
