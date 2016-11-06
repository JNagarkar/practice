package src.geeksforgeeks;
import src.geeksforgeeks.mergersort;
/**
 * Created by jaydatta on 9/8/16.
 */
public class MinimumSumOfNumbers extends mergersort{

    public static void main(String[] args){
   MinimumSumOfNumbers minObject = new MinimumSumOfNumbers();

   int[] originalArray = {6,8,4,5,2,3};
   minObject.sort(originalArray);

        int first=0,second=0;
   for(int i=0; i < originalArray.length;i++){
       if(i % 2 ==0){
           second = second*10 + originalArray[i];
       }
       else{
           first = first *10 +originalArray[i];
       }

   }

   System.out.println(first+second);

    }

}
