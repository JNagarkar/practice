package src.JavaBasics.CollectionFramework;

import java.util.LinkedHashMap;

/**
 * Created by jaydatta on 8/24/16.
 */
public class LinkedHashMapDemo extends printingJob {

    public static void main(String[] args){

        //Simulates linkedList
        LinkedHashMap heterogenousMap = new LinkedHashMap();
        heterogenousMap.put(8,5);
        heterogenousMap.put("L",2);
        heterogenousMap.put(2,6);
        heterogenousMap.put(8,2);

        new LinkedHashMapDemo().printing(heterogenousMap);




    }
}
