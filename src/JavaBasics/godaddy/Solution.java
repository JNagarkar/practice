package src.JavaBasics.godaddy;

import java.util.HashMap;

/**
 * Created by jaydatta on 10/17/16.
 */
public class Solution {

    public static void main(String[] args) {

        int[] arr ={8,1,3,1,4,5,6,3,2};


        HashMap<Integer,Integer> hmap = new HashMap<>();

        int numberNonDuplicates = 0;

        for(int i=0; i < arr.length;i++){
           if(hmap.containsKey(arr[i]) && hmap.get(arr[i])==1){
               hmap.put(arr[i],hmap.get(arr[i])+1);
               numberNonDuplicates++;
           }
           else if(hmap.containsKey(arr[i]) && hmap.get(arr[i])> 1){
               hmap.put(arr[i],hmap.get(arr[i])+1);
           }
           else{
               hmap.put(arr[i],1);
           }
        }

        System.out.println(numberNonDuplicates);





    }

}
