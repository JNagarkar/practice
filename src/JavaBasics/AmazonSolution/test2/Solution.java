package JavaBasics.AmazonSolution.test2;

/**
 * Created by jaydatta on 9/26/16.
 */
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        //String data = "77-END;BEGIN-8;8-11;11-77";

        // to determine "GOOD"/"BAD" string
        boolean isValid = false;

        // split each link and put in hashmap as key-value pair
        StringTokenizer st = new StringTokenizer(data, ";");
        HashMap<String,String> linkMap = new HashMap<String,String>();

        // visited set to avoid duplicate call
        HashSet<String> visited = new HashSet<String>();

        // count number of available links
        int linkCount = 0;

        // put links in hashmap
        while(st.hasMoreTokens()) {
            String[] link = st.nextToken().split("-");
            linkMap.put(link[0], link[1]);
            linkCount++;
        }

        // start from BEGIN, read till END
        int validLinkCount = 0;
        if(linkMap.get("BEGIN") != null) {
            String key = linkMap.get("BEGIN");
            validLinkCount++;
            visited.add("BEGIN");

            // loop from current key to next key in hashmap
            while(key != null && !visited.contains(key)) {
                key = linkMap.get(key);
                validLinkCount++;

                // visit final link
                if(validLinkCount == linkCount) {
                    if("END".equalsIgnoreCase(key)) {
                        isValid = true;
                    }
                    break;
                }
            }
        }

        if(isValid) {
            System.out.println("GOOD");
        } else {
            System.out.println("BAD");
        }

    }

}
