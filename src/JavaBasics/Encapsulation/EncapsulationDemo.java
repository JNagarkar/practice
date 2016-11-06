package JavaBasics.Encapsulation;

/**
 * Created by jaydatta on 8/24/16.
 */
public class EncapsulationDemo {

    public static void main(String[] args) {
        ConcealedClass concealedObject = new ConcealedClass();
        int hiddenVariable = concealedObject.getHiddenVariable();
        System.out.println(hiddenVariable);
    }
}
