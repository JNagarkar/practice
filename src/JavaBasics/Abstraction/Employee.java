package JavaBasics.Abstraction;


/**
 * Created by jaydatta on 8/24/16.
 */
public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String newName, String newAddress, int newNumber) {
        this.name = newName;
        this.address = newAddress;
        this.number = newNumber;
    }

    public double computePay() {
        return 100.0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void mailCheck() {
    System.out.println("Mailed checked");
    }

    public String toString() {
        return name + "" + address + "" + number;
    }


    public String getName() {
        return name;
    }


    public int getNumber() {
        return number;
    }

}
