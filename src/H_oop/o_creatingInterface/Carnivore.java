package H_oop.o_creatingInterface;

public interface Carnivore {

//    void eatMeat();

    default void eatMeat() {
        System.out.println("Eats meat");
    }
}
