package G_methods.a_designingMethods;

public class DesigningMethods {

    /* (access modifier) (optional specifier) return type name() {
        body
        (return if return type is NOT void)
    } */

    // method return type can be either void or primitive or Wrapper

    /* Access modifiers:
        Public - method can be called in any class
        Private - method can be called only within the same class
        Protected - method can be called within the same package or subclasses
        Default or without explicit access modifier - method can be called only within the same package */

    /* Optional specifiers:
        Static - variable or method or object can called globally
        Final - variable or method or object can not be reassigned/reused, overloaded/overridden or inherited
        Abstract - variable or method or object can be declared without body or assignment but later must invoked in subclass
        Native - variable or method or object can interact with the code written in another language */


    public static void main(String[] args) {

    }

    public void jump() {

    }

    void jump2() { // default access modifier

    }

    public final void jump3() { // final means this method can NOT be overridden or overloaded

    }

    public static final void jump4() {

    }

    public final static void jump5() {

    }

    final static public void jump6() {

    }

    final public void jump7() {

    }

}
