package G_methods.e_accessModifiers.common;

public class NextCommon {

    public static void main(String[] args) {
        Common common = new Common();

        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        // privatePrint() is not available

        System.out.println("Public = " + common.publicNum);
        System.out.println("Protected = " + common.protectedNum);
        System.out.println("Default = " + common.defaultNum);
    }
}
