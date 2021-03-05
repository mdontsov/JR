package H_oop.o_creatingInterface;

public interface Herbivore {

//    void eatPlants();

    default void eatPlants() {
        System.out.println("Eats plants");
    }
}
