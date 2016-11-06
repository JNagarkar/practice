package JavaBasics.Questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by jaydatta on 9/24/16.
 */
public class InPlaceMerge {

    public static void main(String[] args) {



        Integer arr1[] = {2,4,7,8,10};
        Integer arr2[] = {1,3,12};
        LinkedList<Integer> firstList = new LinkedList<Integer>(Arrays.asList(arr1));
        LinkedList<Integer> secondList = new LinkedList<Integer>(Arrays.asList(arr2));

        mergeLists(firstList,secondList);
    }

    public static void mergeLists(LinkedList<Integer> firstList,LinkedList<Integer> secondList){

        int maxSize = Math.max(firstList.size(),secondList.size());

        Collections.sort(firstList);
        Collections.sort(secondList);

        for(int i=0 ; i < maxSize;i++){


        }


    }

}
