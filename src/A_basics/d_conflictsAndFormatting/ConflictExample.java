package A_basics.d_conflictsAndFormatting;

import java.util.ArrayList;
import java.util.List;

public class ConflictExample {

    public static void main(String[] args) {
        java.util.Date date;
        java.sql.Date sqlDate;

        List list = new ArrayList();

        ConflictExample cf = new ConflictExample();

        cf.checkList(list);
    }

    public void checkList(List list) {
        if (list.isEmpty()) {
            System.out.println("Is empty");
        } else {
            System.out.println("Not empty");
        }
    }
}
