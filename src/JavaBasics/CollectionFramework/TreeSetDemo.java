package src.JavaBasics.CollectionFramework;

import java.util.TreeSet;

/**
 * Created by jaydatta on 8/24/16.
 */
public class TreeSetDemo extends printingJob {
    public static void main(String[] args) {

        // Objects can be added only of the same type
        // Naturally sorts items added to it
        //
        TreeSet stringObject= new TreeSet();
        stringObject.add("L");
        stringObject.add("X");
        stringObject.add("M");
        new TreeSetDemo().printing(stringObject);
        stringObject.remove("L");
        new TreeSetDemo().printing(stringObject);


        // Naturally sorts items added to it
        TreeSet<Integer> intObject = new TreeSet<>();
        intObject.add(2);
        intObject.add(5);
        intObject.add(1);
        new TreeSetDemo().printing(intObject);
    }
}
