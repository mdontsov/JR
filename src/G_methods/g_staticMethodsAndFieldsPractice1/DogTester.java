package G_methods.g_staticMethodsAndFieldsPractice1;

public class DogTester {

    public static void main(String[] args) {
        Dog husky = new Dog();

        System.out.println(husky.count); // count 0 and here is a warning about accessing static parameter via instance reference
        System.out.println(Dog.count); // count 0

        Dog anotherDog = new Dog();
        anotherDog.incrementCounter(); // count++ > 1 but again a warning

        Dog.incrementCounter(); // count++ > 2
        System.out.println(Dog.count); // count 2

        // static variable or instance is shared across ANY instance even if it's null
        husky = null;
        anotherDog = null;

        System.out.println(Dog.count); // count 2
        System.out.println(husky.count); // count 2
        System.out.println(anotherDog.count); // count 2

        // instance reference objects can reassign the static field value
        Dog.count = 10;
        Dog newDog = new Dog();
        Dog dog2 = new Dog();

        newDog.count = 5;
        // static field latest value > 5
        System.out.println(Dog.count);
        System.out.println(newDog.count);
        System.out.println(dog2.count);

        dog2.count = 11;
        // static field latest value > 11
        System.out.println(Dog.count);
        System.out.println(newDog.count);
        System.out.println(dog2.count);
    }
}
