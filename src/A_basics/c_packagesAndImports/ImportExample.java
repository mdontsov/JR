package A_basics.c_packagesAndImports;
import java.util.Random;

public class ImportExample {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.println(r.nextInt(10 - 1));
    }
}
