package designPattern.singleton;

/**
 * Created by jaydatta on 8/23/16.
 */
public class singletondemo {

    public static void main(String[] args){

        // Commented out, made constructor private, no access
        //concealedClass instance1 = new concealedClass();



        concealedClass instance = concealedClass.getInstance();
        instance.showMessage();

    }

    }
