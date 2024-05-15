package Exercise3;

import java.util.ArrayList;

public class BDRepository {

    public static ArrayList<Employee> getEmployees(){
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Pedro Perez",2000000,120000));
        employees.add(new Employee("Maria Gonzalez",3700000,270000));
        employees.add(new Employee("Juan Gomez",5000000,1100000));
        return employees;
    }
}
