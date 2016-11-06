package JavaBasics.MultiThreading;

/**
 * Created by jaydatta on 8/24/16.
 */
public class TestThread {

    public static void main(String[] args){
        RunnableDemo run1= new RunnableDemo("Thread1",1);
        RunnableDemo run2= new RunnableDemo("Thread2",5);
        RunnableDemo run3= new RunnableDemo("Thread3",10);

        run3.start();
        run1.start();
        run2.start();

    }
}
