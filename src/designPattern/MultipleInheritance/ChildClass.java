package designPattern.MultipleInheritance;
import java.io.ObjectOutputStream;

import static java.lang.System.out;
/**
 * Created by jaydatta on 9/18/16.
 */
public class ChildClass extends RuntimeException implements Showable,Printable {
    @Override
    public void show() {
        System.out.println("showing");
    }

    @Override
    public void nonConflicting(String s, int i) {

    }

    @Override
    public void printInt(long i) {

    }


    @Override
    public void print() {
        System.out.println("printing");
    }

    @Override
    public void nonConflicting(String s) {

    }

    @Override
    public void printInt(int i) {

    }


    public static void main(String[] args) {

        // using static import
        out.print("static import");


        ChildClass object = new ChildClass();
        object.show();
        object.print();



        try{
            System.out.println("trying");
        }
        finally {
            System.out.println("try and finally without catch, still works");
        }


    }
}
