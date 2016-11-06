package src.geeksforgeeks;

/**
 * Created by jaydatta on 9/8/16.
 */
public class RemoveDuplicates {


    public static void main(String[] args) {

    RemoveDuplicates duplicateObject = new RemoveDuplicates();
    int[] originalArray = {1,3,5,7,9,2,3,5,7,9};
        int[] result = removeDuplicates(originalArray);

        for(int element: result){
        System.out.println(element);}
    }

    public static int[] removeDuplicates(int[] originalArray) {

        int[] resultArray = new int[originalArray.length];
        int counter = 0;

        for (int originalElement : originalArray) {
            if(!ifExists(resultArray,originalElement)){
                resultArray[counter++]=originalElement;
            }
        }
        return resultArray;
    }

    public static boolean ifExists(int[] resultArray, int number) {

        for(int i=0; i < resultArray.length;i++){

        if(resultArray[i]==number){
            return true;
        }
        }
        return false;
    }
}
