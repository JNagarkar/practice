package JavaBasics.AmazonSolution;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jaydatta on 9/17/16.
 */
public class IncorrectItems {
    public static void main(String[] args){

        IncorrectItems itemsObject = new IncorrectItems();
        String[] items = {"A","B","C","D","E","F"};
        float[] prices = {16.8f,13.4f,12.6f,33f,55f,99f};

        String[] incorrectItems = {"E","F"};
        float[] incorrectPrice ={44f,299f};

        itemsObject.verifyItems(items,prices,incorrectItems,incorrectPrice);
    }


    public static void verifyItems(String[] origItems,float[] origPrices,String[] items, float[] prices){

        HashMap<String,Float> itemsPrices = new HashMap<String, Float>();
        for(int i=0; i < origItems.length;i++){
            itemsPrices.put(origItems[i],origPrices[i]);
        }

        for(int i=0; i < items.length;i++){
            float originalPrice = itemsPrices.get(items[i]);
            if(originalPrice != prices[i]){
                System.out.println("Wrong item:"+items[i]);
            }
        }

    }
}
