package H_oop.i_classInheritance2;

import H_oop.h_classInheritance1.Cat;
import H_oop.h_classInheritance1.Dog;
import H_oop.h_classInheritance1.Husky;
import H_oop.k_superVsSuper.Rabbit;
import H_oop.o_creatingInterface.Bear;

public class Main {

    public static void main(String[] args) {
        Husky husky = new Husky(4);
        husky.setName("Mike");
        husky.printDetails();
        husky.setAge(5);
        husky.printDetails();
        husky.eat();
        System.out.println("Husky weight = " + husky.getWeight());
        System.out.println("Tail length = " + husky.getDefaultTailLength());
        husky.run(30);

//        Dog dog = new Dog(2);
//        dog.setName("Rex");
//        dog.printDetails();
//        dog.eat();
//        System.out.println(dog.getAverageWeight());

        Bear bear = new Bear();
        bear.setName("Jimmy");
        bear.setAge(15);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();

        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.eatPlants();
        rabbit.printDetails();

        Cat cat = new Cat(4);
        System.out.println(cat.getWeight());
        cat.printName();
        System.out.println(cat.getSpeed());
    }
}
