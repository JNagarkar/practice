package JavaBasics.CollectionFramework;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by jaydatta on 8/24/16.
 */
public class ArrayListDemo extends printingJob{


    public static void main(String[] args){

        ArrayListDemo myDemo= new ArrayListDemo();

        ArrayList<String> stringArrayDemo = new ArrayList<String>();
        stringArrayDemo.add("A");
        stringArrayDemo.add("B");
        stringArrayDemo.add("C");
        myDemo.printing(stringArrayDemo);

        myDemo.printing(stringArrayDemo.get(1));
        stringArrayDemo.remove(2);
        myDemo.printing(stringArrayDemo);

        ArrayList abstractArrayList = new ArrayList();
        abstractArrayList.add(2);
        abstractArrayList.add("a");
        abstractArrayList.add(stringArrayDemo);
        abstractArrayList.add(00.00);
        myDemo.printing(abstractArrayList);


        Vector abstractVector= new Vector();
        abstractVector.add(0,"5");
        abstractVector.add(1,"L");
        abstractVector.add(2,"A");
        //Will give error if uncommented. Vectors accept only homogenous elements
        //       abstractVector.add("L",3);
        myDemo.printing(abstractVector);


    }
}
