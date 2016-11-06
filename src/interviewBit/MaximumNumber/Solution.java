package src.interviewBit.MaximumNumber;

import JavaBasics.Questions.basic.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 * Created by jaydatta on 11/2/16.
 */
class Solution{

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList<>();

        arrList.add(3);
        arrList.add(30);
        arrList.add(34);

        arrList.add(5);
        arrList.add(9);

        //  arrList.add(9);
        //  arrList.add(99);
        //       arrList.add(999);
        //      arrList.add(9999);
        //     arrList.add(9998);
        //  arrList.add(4);
        //  arrList.add(3453);
        //      arrList.add(643);

        // 9 30 34 1 56
//    95634301


        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> a = arrList;
  /*  System.out.println(99999999 > 99999998);

    boolean contains  = false;


    for(int i=0; i < arrList.size();i++){
    if(!(arrList.get(i)==0)){
        contains = true;
          break;}
    }

    if(contains){
    }


    int temp;
    boolean flag=true;
     while ( flag )
     {
            flag= false;
            for(int j=0;  j < arrList.size() -1;  j++ )
            {
                   if ( compareT(arrList.get(j), arrList.get(j+1) ) )
                   {
                           temp = arrList.get(j);
                          arrList.set(j,arrList.get(j+1));
                          arrList.set(j+1,temp);
                          flag = true;
                  }
            }
      }

    */

        Collections.sort(arrList,new interviewBit.MaximumNumber.Demo());
        StringBuffer sb = new StringBuffer();
        for(int i=0; i < arrList.size();i++){
            sb.append(arrList.get(i));
        }
        System.out.println(sb.toString());
    }
}
