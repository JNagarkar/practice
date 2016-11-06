package geeksforgeeks;

/**
 * Created by jaydatta on 8/23/16.
 */
public class driver {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,9,10,11,12,13,14,15};
        int intervalElement=10;
        reverseArray reverseArrayObject = reverseArray.getInstance();
//        reverseArrayObject.reversedArray(arr,intervalElement);

//    reverseArrayObject.reverseArrayInterval(arr,3,2);
    reverseArrayObject.reverseDoubleGroupSize(arr,1);

    }
}
