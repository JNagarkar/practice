package geeksforgeeks;

import java.util.ArrayList;

/**
 * Created by jaydatta on 8/28/16.
 */
public class MergeStrings {


    public static void main(String[] args) {

        String a = "ABCDEF QWERTY";
        String b = "ABCDEF QWERTY";

        ArrayList mergedList = null;
        String merged = null;

        int i = 0;
        int j = 0;
        int k = 0;
        StringBuilder sb = new StringBuilder();
        while(i < a.length() && j < b.length()){
            sb.append(String.valueOf(a.charAt(i++)));
            sb.append(String.valueOf(b.charAt(j++)));
        }


        while(i < a.length()){
            sb.append(String.valueOf(a.charAt(i++)));
        }


        while(j < b.length()){
            sb.append(String.valueOf(b.charAt(j++)));
        }

        System.out.println(sb.toString());


    }

}
