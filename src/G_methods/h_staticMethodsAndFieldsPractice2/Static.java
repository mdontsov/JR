package G_methods.h_staticMethodsAndFieldsPractice2;

public class Static {

    private String name = "Static"; // NOT a static member > instance member

    public static void one() {
        two();
        three();
    }

    public static void two() {
        one();
        three();
    }

    public static void three() {
        one();
        two();
    }

    public void four() { // instance method(s) can DIRECTLY call ANY static or instance member(s) available
        one(); // static
        two(); // static
        three(); // static
        System.out.println(name); // instance
    }

    public static void main(String[] args) {
        /* static method(s) can DIRECTLY call ONLY static member(s) available
        * to call instance member(s) inside static method(s) an instance reference MUST be created
        * */
        one();
        two();
        three();

        Static staticClass = new Static(); // Instance reference is created
        staticClass.four();
        new Static().four(); // Alternative to instance reference creation
        System.out.println(staticClass.name);
    }
}
