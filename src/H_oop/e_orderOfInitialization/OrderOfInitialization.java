package H_oop.e_orderOfInitialization;

/*
 * Order of initialization:
 * 1. Superclass
 * 2. Static variables and static initializers
 * 3. Instance (class) variables and instance initializers
 * 4. Constructor
 * Declaration order is not important
 * */

import H_oop.b_defaultConstructor.Dog;

class Example {

    private String name = "dog";

    // instance
    {
        System.out.println("instance " + name);
    }

    private static int count = 0;

    // static
    static {
        System.out.println("static " + count);
    }

    // instance
    {
        count += 10;
        System.out.println("instance " + count);
    }

    // constructor
    public Example() {
        System.out.println("constructor");
    }
}

class Demo {
    static {
        add(2); // 1st
    }

    static void add(int number) {
        System.out.print(number + " ");
    }

    Demo() {
        add(5); // 5th
    }

    static {
        add(4); // 2nd
    }

    {
        add(6); // 3rd
    }

    static {
        new Demo();
    }

    {
        add(8); // 4th
    }

}

public class OrderOfInitialization {

    public static void main(String[] args) {
        new Example();
        new Demo(); // static blocks are called only once > 2, 4, 6, 8, 5, 6, 8, 5
    }
}
