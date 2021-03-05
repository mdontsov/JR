package H_oop.h_classInheritance1;

public class Husky extends Dog {

    public Husky(int age) {
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
//        super.eat();
        System.out.println(getName() + " eating");
    }

    @Override
    public void printName() {
        System.out.println("Husky name: " + getName());
    }

    @Override
    public int getWeight() {
        return 25;
    }

    @Override
    public int getDefaultTailLength() {
        return 30;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky running at speed = " + speed);
    }
}
