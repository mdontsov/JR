package H_oop.h_classInheritance1;

public abstract class Animal {

    private int age;
    private String name;

    public Animal() {

    }

    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public double getAverageWeight() {
        return 10D;
    }

    public void printDetails() {
        printName();
        System.out.println("age = " + age);
    }

    public abstract int getWeight();

    protected abstract void printName();
}
