package G_methods.f_staticMethodsAndFields;

public class StaticMethodsAndFields {

    // Static member (method or field) is for helper purposes as it does not require objects instantiation
    // Static member can't call instance member HOWEVER instance member can call the static member

    public static int myNum = 10; // static = global = direct access

    public static void main(String[] args) {
        System.out.println(myNum);
    }
}
