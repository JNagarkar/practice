package JavaBasics.Questions;

/**
 * Created by jaydatta on 9/17/16.
 */
public class StringPermutations {

    public static void main(String[] args) {
        StringPermutations object = new StringPermutations();


        //object.swap("JAY",0,2);

         String currentStr = "JAY";
        object.printPermutations(currentStr,0,2);
    }




    public static String swap(String currentStr, int left, int right) {


        int temp;

if(left < right) {
    String s1 = currentStr.substring(0, left);
    String s2 = currentStr.substring(left + 1, right);
    String s3 = currentStr.substring(right + 1);
    currentStr = s1 + currentStr.charAt(right) + s2 + currentStr.charAt(left) + s3;
    System.out.println("lll");
}

return currentStr;
 //   System.out.println(currentStr);
    }

    public static void printPermutations(String currentStr, int left, int right) {

        if (left == right) {
            System.out.println(currentStr);
        } else {

            for (int i = 0; i < currentStr.length(); i++) {
                swap(currentStr, left, i);
                printPermutations(currentStr,left+1,right);
                swap(currentStr,left,i);

            }
        }

    }
}
