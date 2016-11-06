package JavaBasics.Questions.basic;

/**
 * Created by jaydatta on 9/18/16.
 */
public class Demo {


    Demo returnDemo(){

        System.out.println("In parent returnDemo");
        return this;
    }



int speed = 100;
    Demo(){
        speed=233;
        System.out.println("parent constructor");
    }

    public final void cantOverride(){

    }


    public void display(){
        System.out.println("parent display invoked");

    }

    public void message(){
        System.out.println("message invoked");
    }
}
