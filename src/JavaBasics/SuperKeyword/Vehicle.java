package src.JavaBasics.SuperKeyword;

/**
 * Created by jaydatta on 8/24/16.
 */
public class Vehicle {

    int speed = 100;

    public Vehicle() {

        System.out.println("Speed of vehicle initialized at:"+speed);
        speed = 90;
        System.out.println("Invoked parent constructor");
    }
}
