package H_oop.h_classInheritance1;

import H_oop.o_creatingInterface.CanRun;
import H_oop.o_creatingInterface.HasTail;

public abstract class Dog extends Animal implements HasTail, CanRun {

    public Dog(int age) {
        super(age);
        System.out.println("Dog");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName() + " eating");
    }

    @Override
    public double getAverageWeight() {
        return super.getAverageWeight() + 20;
    }

    @Override
    public int getDefaultTailLength() {
        return 10;
    }
}
