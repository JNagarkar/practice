    package designPattern.singleton;

import JavaBasics.Encapsulation.ConcealedClass;

import java.util.concurrent.atomic.AtomicLong;

    /**
 * Created by jaydatta on 8/23/16.
 */
public class concealedClass {


    // Create an object of concealedClass
    private static volatile concealedClass instance;



    // Class should not be instantiated
    private concealedClass(){}


    public void showMessage(){
    System.out.println("Hello World!");
}

    public static synchronized concealedClass getInstance(){



        if(instance ==null){
            synchronized (concealedClass.class){
                if(instance==null){
                    instance = new concealedClass();
                }
            }
        }

        return instance;
}


}
