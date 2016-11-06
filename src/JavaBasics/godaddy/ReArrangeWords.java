package JavaBasics.godaddy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by jaydatta on 10/17/16.
 */
public class ReArrangeWords {
    public static void main(String[] args) throws IOException {
       /*

        //INPUT
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
*/
       String abc= reArrangeWord("hefg");
        System.out.println(abc);
    }

    public static String reArrangeWord(String word){

        final StringBuffer sb = new StringBuffer();
        String br = word;

        final char[] Words = br.toCharArray();
        final int wordLength = Words.length;
         int i;
        for(i = wordLength - 2; i >= 0 && Words[i] >= Words[i+1]; --i){}

        //Return if no such index
        if (i < 0){
            return "no answer";
        }
        int minimumIndex = i+1;
        for(int j = i+2; j < wordLength; ++j){
            if (Words[j] > Words[i] && Words[j] < Words[minimumIndex]){
                minimumIndex = j;
            }
        }
        char t = Words[minimumIndex];
        Words[minimumIndex] = Words[i];
        Words[i] = t;
        Arrays.sort(Words, i+1, wordLength);
        sb.append(Words).append("\n");

        return sb.toString();

    }
}
