package src.JavaBasics.Abstraction;

/**
 * Created by jaydatta on 8/24/16.
 */
public class AbstractionDemo {

    public static void main(String[] args){
//        Employee employeeObject= new Employee();

    Salary salaryObject= new Salary("Jaydatta Nagarkar","Tempe",12345,00.00);
    Employee employeeObject = new Salary("Ramesh Hj","Arizona Tempe",1234545,100.00);

    System.out.println(salaryObject.getAddress());
        System.out.println(salaryObject.getName());
        System.out.println(salaryObject.getNumber());
        salaryObject.mailCheck();
        System.out.println("\n <----------> \n "+employeeObject.getNumber());
        System.out.println(salaryObject.getNumber());
        System.out.println(employeeObject.getName());
        System.out.println(employeeObject.getAddress());
    }
}
