package G_methods.k_passingDataBetweenMethods;

public class PassingDataBetweenMethods {

    /*
    * Java is PASS-BY-VALUE language which means a COPY of variable is made and method receives that COPY
    * */

    public static void main(String[] args) {
        int number = 4;
        System.out.println("number = " + number);
        newNumber(5);
        System.out.println("number = " + number);

        String name = "Jimmy";
        System.out.println("name = " + name);
        newName(name);
        System.out.println("name = " + name);

        StringBuilder sb = new StringBuilder();
        build(sb);
        System.out.println("StringBuilder content = " + sb);

//        StringBuilder sb2 = sb; // one reference for 2 objects
//        sb2.append("Anthony"); // both objects changed
//        System.out.println(sb2);
        System.out.println(sb);
    }


    // number param here is a COPY
    public static void newNumber(int number) {
        System.out.println("In newNumber() number = " + number);
        number = 10; // setting a COPY = 10 actually does NOT change initial number = 4, because a POINTER to initial values is required
        System.out.println("In newNumber() number = " + number);
    }

    public static void newName(String name) {
        System.out.println("In newName() name = " + name);
        name = "Timmy";
        System.out.println("In newName() name = " + name);
    }

    public static void build(StringBuilder sb) {
//        sb = new StringBuilder(); // sb reassigned > new reference > wrong result
        sb.append("Tom"); // proper result is returned because we do NOT reassign a COPY, just call a method for that COPY
    }
}
