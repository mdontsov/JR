package G_methods.e_accessModifiers.common;

public class Common {

    public int publicNum = 10;
    protected int protectedNum = 100;
    int defaultNum = 1000;
    private int privateNum = 10000;

    public void publicPrint() {
        System.out.println("Public print");
    }

    protected void protectedPrint() {
        System.out.println("Protected print");
    }

    void defaultPrint() {
        System.out.println("Default print");
    }

    private void privatePrint() {
        System.out.println("Private print");
    }

    public static void main(String[] args) {
        Common common = new Common(); // Class instance is required when methods or variables are NOT static

        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();

        System.out.println("Public = " + common.publicNum);
        System.out.println("Protected = " + common.protectedNum);
        System.out.println("Default = " + common.defaultNum);
        System.out.println("Private = " + common.privateNum);
    }
}
