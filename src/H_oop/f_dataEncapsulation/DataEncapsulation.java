package H_oop.f_dataEncapsulation;

public class DataEncapsulation {

    public static void main(String[] args) {

        Company company = new Company();
        company.setName("MyCompany");
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.printSorted();

        company.addEmployee(null);
        company.setName(null);
//        company.employees = null;
//        company.employees.add("Jimmy"); // try to call method on null object > NullPointerException
        company.printSorted(); // try to sort null object > NullPointerException
    }
}
