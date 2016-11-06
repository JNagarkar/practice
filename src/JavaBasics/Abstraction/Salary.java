package src.JavaBasics.Abstraction;

/**
 * Created by jaydatta on 8/24/16.
 */
public class Salary extends Employee {


    private double salary;
    public Salary(String newName, String newAddress, int newNumber,double salary) {
        super(newName, newAddress, newNumber);
        setSalary(salary);
    }

    private void setSalary(double newsalary) {
    salary=newsalary;
    }

}
