package H_oop.l_overloadingVsOverriding;

import H_oop.h_classInheritance1.Animal;

public class Bird {

    public void fly() {
        System.out.println("Bird is flying");
    }

    public void eat(int amount) {
        System.out.println("Bird is eating " + amount + " units of food");
    }
}
