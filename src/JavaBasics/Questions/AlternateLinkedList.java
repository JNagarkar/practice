package src.JavaBasics.Questions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by jaydatta on 9/24/16.
 */
public class AlternateLinkedList {

    public static void main(String[] args) {

        Integer arr[] = {1, 3, 8, 2, 7, 5, 6, 4};

        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(arr));

        alternateSort(linkedList);


    }

    private static void alternateSort(LinkedList<Integer> linkedList) {

        Collections.sort(linkedList);

/*
        for(int i=1 ;i < (linkedList.size()+1)/2 ; i++){

            Integer x = linkedList.getLast();

            linkedList.removeLast();
            linkedList.add(2*i-1,x);
        }
*/



for(int i=0 ; i < linkedList.size();i=i+2){

    Integer x = linkedList.getLast();
    linkedList.removeLast();
    linkedList.add(i+1,x);


}

        System.out.println(linkedList);

    }

}
