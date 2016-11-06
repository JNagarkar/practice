package src.JavaBasics.AmazonSolution;

import java.util.Stack;

/**
 * Created by jaydatta on 9/17/16.
 */
public class PossibleDiscount {

    public static void main(String[] args) {
        int[] arra = {6, 5, 1, 3, 4, 6, 5,10,12,4,16};

        PossibleDiscount discountObject = new PossibleDiscount();
        discountObject.returnValue(arra);

    }

    public static int returnValue(int[] prices) {

        int[] discount = new int[prices.length];
        Stack<Integer> nextPriceStack = new Stack<Integer>();


        for (int index = prices.length - 1; index > 0; index--) {
            System.out.println("\n current:"+prices[index]);

            //operation 1:
            while (!nextPriceStack.isEmpty() && nextPriceStack.peek() > prices[index]) {
                nextPriceStack.pop();
            }

            if (nextPriceStack.isEmpty()) {
                discount[index] = 0;
            } else {
                // Very important that the current peek should be obtained
                discount[index] = nextPriceStack.peek();
            }


            System.out.print("\n discount array :");

            for(int k=0; k < discount.length;k++){
                System.out.print(discount[k]+"<-->");
            }
            System.out.println("\n -->");
            nextPriceStack.push(prices[index]);
            for(Integer stackElement: nextPriceStack){
                System.out.print(stackElement+":");
            }

        }

    long sum=0;
        for(int k=0; k < discount.length;k++){
 sum+=discount[k];
        }

        System.out.println("--<"+sum+">---");

        return 1;
    }

}
