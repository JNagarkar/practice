package src.JavaBasics.CollectionFramework;

import java.util.*;
import java.util.Iterator;

/**
 * Created by jaydatta on 8/24/16.
 */
public class HashMapDemo extends printingJob {

    public static void main(String[] args) {


        Object obj = new Object();
//        obj.hashCode();

        System.out.println(obj.hashCode());

        HashMap abstractHm = new HashMap();
        abstractHm.put("L", "A");
        abstractHm.put("P", 0);
        abstractHm.put(9, "Q");
        abstractHm.put(new HashSetDemo(), 8);
        abstractHm.put("X",new LinkedHashSetDemo());
        abstractHm.put(null,"P");
        abstractHm.put(4,"A");
        System.out.println(abstractHm.put(4,"B")+":");
        new HashMapDemo().printing(abstractHm);


        System.out.println("<<<<<<<<<<<<<<"+"a".compareTo("b"));


        System.out.println(Integer.MAX_VALUE);






        System.out.println("jk dkd :d43".matches("[a-zA-Z ]+\\w\\s*\\:\\d+"));

        Iterator myIterator= abstractHm.entrySet().iterator();
        while(myIterator.hasNext()){
            Map.Entry me = (Map.Entry)myIterator.next();
            System.out.println(me.getKey()+"<-->"+me.getValue());
        }

        // If same key for 2 values, former is overriden by later
        HashMap<String,Integer> kvHmap= new HashMap<>();
        kvHmap.put("L",2);
        kvHmap.put("L",4);
        new HashMapDemo().printing(kvHmap);


        Hashtable abstractHashTable = new Hashtable();
        abstractHashTable.put("T",6);
        abstractHashTable.put(8,"Y");
        abstractHashTable.put("V",5);
        abstractHashTable.put(2,"R");
        new HashMapDemo().printing(abstractHashTable);



    }
}
