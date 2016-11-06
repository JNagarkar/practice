package src.JavaBasics.SuperKeyword;

/**
 * Created by jaydatta on 8/24/16.
 */
public class Car extends Vehicle {
    int speed = 77;


    public Car() {
        super();
        System.out.println("Invoked car constructor");
    }

    public static void main(String[] args) {
        Car carObject = new Car();
        carObject.display();

    }

    void display() {
        System.out.println("Speed of car:" + speed);
        System.out.println("Speed of Vehicle:" + super.speed);
    }
}
