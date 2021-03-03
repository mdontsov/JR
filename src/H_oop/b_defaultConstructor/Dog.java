package H_oop.b_defaultConstructor;

public class Dog {

    private String name;
    private String breed;

    private String setName() {
        return this.name = "Jim";
    }

    public String  getName() {
        return this.setName();
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.getName());
    }
}
