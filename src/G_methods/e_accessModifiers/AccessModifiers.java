package G_methods.e_accessModifiers;

import G_methods.e_accessModifiers.common.Common;

public class AccessModifiers {

    /**
     * Public: class - YES, package - YES, subclass - YES, world - YES
     * Protected: class - YES, package - YES, subclass - YES, world - NO
     * No modifier (default): class - YES, package - YES, subclass - NO, world - NO
     * Private: class - YES, package - NO, subclass - NO, world - NO
     */

    public static void main(String[] args) {
        Common common = new Common();

        common.publicPrint();
        // other methods are not available due to different packages
        System.out.println("Public = " + common.publicNum);
    }
}
