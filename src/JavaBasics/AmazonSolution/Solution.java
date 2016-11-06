package JavaBasics.AmazonSolution;

import java.util.Map;
import java.util.*;
/**
 * Created by jaydatta on 9/16/16.
 */
public class Solution {


    /*
 * Complete the function below.
 */

    /*
 * Complete the function below.
 */

    public static void main(String[] args){
        Solution solution = new Solution();
    int[] arra = {6, 5,1,3,4,6,2};

        solution.finalPrice(arra);
    }


    public static void finalPrice(int[] prices) {
        int length =  prices.length;
        int[] discount = new int[length];

        if (length==0){
            return ;
        }

        Stack<Integer> stack = new Stack<Integer>();

        for(int index=length-1; index >=0; index--) {

            while(!stack.isEmpty() && stack.peek()> prices[index]) {
                stack.pop();
            }

            if(stack.isEmpty()) {
                discount[index] = 0;
            } else {
                discount[index] = stack.peek();
            }

            stack.push(prices[index]);
        }

        int totalPrice = 0;

        for(int index = 0; index < length; index++) {
            totalPrice += (prices[index] - discount[index]);
        }

        System.out.println(totalPrice);
        for(int index = 0; index < length; index++) {
            if(discount[index] == 0) {
                System.out.print(index + " ");
            }
        }


/*
        select temp.id, temp.type from (
                select id, "root" as type from Tree where p_id is null
        union
        select id, "leaf" as type from Tree where p_id is not null and id not in (select distinct p_id from Tree)
        union
        select id, "inner" as type from Tree where p_id is not null and id in (select distinct p_id from tree)) as temp order by temp.id
*/


    }






    static int verifyItems(String[] origItems, float[] origPrices, String[] items, float[] prices) {



        Map<String, String> itemOrigPrizeMap = new HashMap<String, String>();
        for(int i = 0; i < origItems.length; i++){
            itemOrigPrizeMap.put(origItems[i], String.valueOf(origPrices[i]));
        }

        int faults = 0;
        for(int i = 0; i < items.length; i++){
            if(!itemOrigPrizeMap.get(items[i]).equals(String.valueOf(prices[i]))){
                faults++;
            }
        }
        return faults;

        }







    }





