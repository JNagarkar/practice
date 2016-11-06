package src.JavaBasics.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Created by jaydatta on 9/17/16.
 */
public class FirstNonRepeatedCharacet {

    public static void main(String[] args) {
        FirstNonRepeatedCharacet object = new FirstNonRepeatedCharacet();
        object.getChar("STRESS");

        String original = "OLD";
        object.print(original);

        System.out.println(original);


    }

    public void print(String arg1){
       arg1 = "new";

        short i=0;
        int l=34;
        i+=l;
        System.out.println(""+l+90);

    }

    public static String getChar(String word) {
        int length = word.length();

        Character c = null;
        HashMap<Character,Integer> charList = new HashMap<>();

        for(int i=0;i < length;i++){
        if(charList.containsKey(word.charAt(i))){
            charList.put(word.charAt(i),charList.get(word.charAt(i))+1);
        }
        else{
            charList.put(word.charAt(i),1);
        }
        }

for(int i=0 ;i < length;i++){
   if(charList.get(word.charAt(i))==1){
       System.out.println(word.charAt(i));
       break;
   }


}



        return "r";
    }
}
