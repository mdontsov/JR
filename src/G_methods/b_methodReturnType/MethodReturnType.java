package G_methods.b_methodReturnType;

public class MethodReturnType {
    public void jump() {

    }

    public void jump2() {
        return; // return is possible in void but redundant
    }

    public String jump3() {
        return "";
    }

//    public String jump4() {
//
//    }

//    public jump5() {
//
//    }

    String jump6(int n) {
        if (n == 5) {
            return "True";
        }
        return "False";
    }

    int getInt() {
        return 9;
    }

    int getLong() {
        return (int) 9L;
    }

    int expanded() {
        return 10;
    }

    boolean isTrue() {
//        return 5 < 10;
        return 5 == 5;
    }

    public void test() {

    }

    public void _2test() {

    }
}
