package H_oop.l_overloadingVsOverriding;

public class Eagle extends Bird {

    public int fly(int height) {
        System.out.println("Eagle is flying at " + height + " high");
        return height;
    }

    @Override
    public void eat(int amount) {
        super.eat(amount);
    }
}
