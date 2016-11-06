package JavaBasics.CollectionFramework;

import java.util.LinkedHashSet;

/**
 * Created by jaydatta on 8/24/16.
 */
public class LinkedHashSetDemo extends printingJob {

public static void main(String[] args){


    // you can only add sequentially in the linkedHashset, cannot add at a certain position
    LinkedHashSet hset= new LinkedHashSet();
    hset.add("C");
    hset.add(2);
    hset.add(8);


    new LinkedListDemo().printing(hset);
}
}
