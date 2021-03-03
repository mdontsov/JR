package H_oop.f_dataEncapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// POJO - Plain Old Java Object
public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Null/empty company name not possible");
            return;
        }
        this.name = name;
    }

    public void addEmployee(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Null/empty employee name not possible");
            return;
        }
        employees.add(name);
    }

    public void printSorted() {
        System.out.println("Company name: " + name);
        Collections.sort(employees);
        System.out.println("Company employees: " + employees);
    }
}
