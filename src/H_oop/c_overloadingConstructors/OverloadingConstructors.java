package H_oop.c_overloadingConstructors;

/*
 * Constructor must have different parameters in order to be overloaded
 * */

class Dog {

    private String name;
    private String breed;
    private double weight;

    public Dog(String name) {
//        this.name = name;
//        this.breed = "Husky";
//        this.weight = 20.0;
        this(name, "Husky", 20); // constructor chaining with this() and it must be the 1st statement
        System.out.println("Constructor 1");
    }

    public Dog(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//        this.weight = 30.0;
        this(name, breed, 30); // constructor chaining with this() and it must be the 1st statement
        System.out.println("Constructor 2");
    }

    /*
     *Constructor chaining - 1 fully declared constructor with all params and other constructors have partial arguments
     * that refer to each other
     * */
    public Dog(String name, String breed, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("Constructor 3");
    }

    public void print() {
        System.out.println("Name: " + name + ", breed: " + breed + ", weight: " + weight);
    }
}

public class OverloadingConstructors {

    public static void main(String[] args) {
        Dog dog = new Dog("Jim");
        dog.print();

        dog = new Dog("Butch", "Boxer");
        dog.print();

        dog = new Dog("Mike", "Mops", 10);
        dog.print();
    }
}
