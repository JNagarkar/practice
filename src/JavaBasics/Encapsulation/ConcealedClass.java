package JavaBasics.Encapsulation;

/**
 * Created by jaydatta on 8/24/16.
 */
public class ConcealedClass {


    // Class can have multiple constructors
    public ConcealedClass(){

    }

    private ConcealedClass(String name){

    }




    private int hiddenVariable = 50;

    public int getHiddenVariable() {
        return hiddenVariable;
    }

}
