package H_oop.b_defaultConstructor;

/*
 * Default constructor is auto (implicitly) created when class constructor is not manually (explicitly) defined
 * When constructor is Private then it can be used only within specific class
 * Constructor can NOT be static
 * */

public class DefaultConstructor {

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getName());
    }
}
