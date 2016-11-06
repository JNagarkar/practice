package src.JavaBasics.IntuitSolution.Third;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jaydatta on 9/16/16.
 */
public class Employee {
    String name;
    String department;
    int employee_id;
    List<Employee> friends;

    public Employee(int employee_id,String name, String department ) {

        this.name = name;
        this.department = department;
        this.employee_id = employee_id;
        this.friends = new ArrayList<Employee>();
    }
}