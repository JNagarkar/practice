package src.JavaBasics.Questions;

import JavaBasics.IntuitSolution.Employee;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by jaydatta on 9/17/16.
 */
public class RemoveCharacters {

    
    public static void main(String[] args){



    RemoveCharacters object = new RemoveCharacters();
        object.returnString("Alive is awesome","alwsr");

    }
    public static String returnString(String input,String removeChars){

        ArrayList<Character> ommitedChar = new ArrayList<Character>();

        for(int i=0; i < removeChars.length();i++){
        Character c = removeChars.charAt(i);
        c=c.toLowerCase(c);
            if(!ommitedChar.contains(removeChars.charAt(i))){
        ommitedChar.add(c);
        }

        }

        StringBuffer sb = new StringBuffer();
        for(int i=0 ; i < input.length();i++){
            Character current = input.charAt(i);
            current = current.toLowerCase(current);

            if(!ommitedChar.contains(current)){
                sb.append(current);
            }
        }
        System.out.println(sb.toString());

return sb.toString();
    }


}
