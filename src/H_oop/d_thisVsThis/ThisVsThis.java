package H_oop.d_thisVsThis;

/*
 * this. - reference/pointer to class variable
 * this() - used ONLY inside constructors
 * */

class Person {

    private String firstName;
    private String lastName;

    public Person() {
        this("John", "Dow"); // constructor chaining
    }

    public Person(String firstName, String last) {
        this.firstName = firstName;
//        String lastName = "lastName";
        lastName = last; // this. can be skipped if class variable and constructor param have different names
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getFullName() {
//        return this.firstName + " " + this.lastName; // too long
        return firstName + lastName;
    }

    public static void main(String[] args) {

    }
}

public class ThisVsThis {
}
