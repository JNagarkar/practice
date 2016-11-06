package src.JavaBasics.Questions.basic;

import java.io.UncheckedIOException;

/**
 * Created by jaydatta on 9/18/16.
 */
public class SuperDemo extends Demo{


    // Whether it is there or not, parent constructor is invoked bydefault
    SuperDemo(){
        super();

        // uncommenting will give error , since this and super should always be first statement in the class
//        this();

        super.display();
    }


    SuperDemo returnDemo() throws UncheckedIOException{
        System.out.println("in child returnDemo");

        return this;
    }



    int speed = 32;
    public void display(){



        System.out.println("child method");
        System.out.println(super.speed);
        System.out.println(speed);
//        System.out.println(super.wrong);

// super is required if invoking a method in the parent class having the same name
        super.display();

        // super is not required if the method being invoked is different
        message();

    }
    public static final void main(String[] args) {

        SuperDemo demo = new SuperDemo();
        demo.display();

        demo.returnDemo();
        demo.returnDemo().message();

        demo.returnDemo().display();
        System.out.println("<---------->");

    }


    // will give error
    /*public final void cantOverride(){

    }*/


}

