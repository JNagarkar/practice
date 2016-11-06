package interviewBit.MaximumNumber;

import java.util.Comparator;

/**
 * Created by jaydatta on 11/2/16.
 */
class Demo implements Comparator<Integer> {




    @Override
    public int compare(Integer firstInt,Integer secondInt){
        String num1 = (""+firstInt+""+secondInt).trim();
        String num2 = (""+secondInt+""+firstInt).trim();

        int nameComp = num2.compareTo(num1);
  //      System.out.println(num1+":"+num2+":"+nameComp);
        return nameComp;
    }
}
