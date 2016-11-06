package src.geeksforgeeks;


/**
 * Created by jaydatta on 8/23/16.
 * Given an array, reverse every sub-array formed by consecutive k elements.
 * Input:
 * arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
 * k = 3
 * Output:
 * [3, 2, 1, 6, 5, 4, 9, 8, 7]
 */
public class reverseArray implements useFullUtilities{

    private static reverseArray instance = new reverseArray();

    private reverseArray() {
    }

    public static reverseArray getInstance() {
        return instance;
    }

    public static void reversedArray(int arr[], int intervalElement) {


        for (int i = 0; i < arr.length; i += intervalElement - 1) {
            int left = i;
            int right = Math.min(left + intervalElement - 1, arr.length - 1);
            while (left < right)
                swap(arr, left++, right--);
        }


        for (int i : arr) {
            System.out.println(i);
        }


    }


    public static void reverseArrayInterval(int arr[], int intervalElement, int leaveInterval){

        for(int i=0 ; i < arr.length; i = i + intervalElement+leaveInterval){
            int left = i;
            int right = Math.min(i+intervalElement-1,arr.length-1);
            while(left < right){
                swap(arr,left++,right--);
            }
        }

        for(int i: arr){
            System.out.println(i);
        }

    }


    public static void reverseDoubleGroupSize(int arr[],int intervalElement){


        for(int i=0 ; i < arr.length; i = i + intervalElement/2){
            int left = i;
            int right = Math.min(i+intervalElement-1,arr.length-1);
            while(left < right){
                swap(arr,left++,right--);
            }

            intervalElement=2*intervalElement;
        }

        for(int i: arr){
            System.out.println(i);
        }
    }



    public static int[] swap(int[] arr, int left, int right) {


        int temp = arr[right];
        arr[right] = arr[left];
        arr[left] = temp;
        return arr;
    }


}

