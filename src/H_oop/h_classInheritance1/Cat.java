package H_oop.h_classInheritance1;

import H_oop.p_defaultInterfaceMethods.Run;
import H_oop.p_defaultInterfaceMethods.Walk;

public class Cat extends Animal implements Run {

    public Cat(int age) {
        super(age);
    }

    @Override
    public int getWeight() {
        return 7;
    }

    @Override
    public void printName() {
        System.out.println("Peach");
    }

    @Override
    public int getSpeed() {
        return 20; // override Run interface that overrides Walk interface
    }
}
