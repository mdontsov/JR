package H_oop.a_classConstructors;

/*
 * One Java file may contain multiple classes but only ONE of them can be public
 * */

class Dog { // constructor
    private String color;

    public Dog(String color) {
        System.out.println("Constructor");
        this.color = color; // .this is a pointer to class variable that must be reassigned in constructor
    }

    public void printColor() {
        System.out.println("Dog color: " + color);
    }
}

class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int height, int length) {
        this.color = "black"; // color = this.color will compile but return null because class variable color is not assigned
        this.height = height;
        this.length = length;
    }

    public void printInfo() {
        System.out.println("Cat color: " + color + ", cat height = " + height + ", cat length = " + length);
    }
}

public class ClassConstructors {

    public static void main(String[] args) {
        Dog dog = new Dog("red");
        dog.printColor();

        Cat cat = new Cat(10, 30);
        cat.printInfo();
    }
}
