package interviewBit.dynamic;

import java.util.ArrayList;

/**
 * Created by jaydatta on 10/30/16.
 */
public class MaxSumContigiousSubArray {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
  /* list.add(0);
   list.add(-1);
      list.add(-3);list.add(20);list.add(-1);list.add(-2);list.add(-1);list.add(-2);
    list.add(4);
    */
        list.add(-500);
        list.add(-200);
        list.add(-300);
        list.add(-100);

        int sum=Integer.MIN_VALUE;
        int last = 0;

        for(Integer current: list){

            last=last+current;
            sum = Math.max(sum,last);
            if(last < 0){
                last = 0;
            }

        }

        System.out.println(sum);
    }
}
