package src.JavaBasics.CollectionFramework;

import java.util.ArrayList;

/**
 * Created by jaydatta on 9/7/16.
 */
public class SubArrayZeroSum {


    public static void main(String[] args) {

        SubArrayZeroSum subArray = new SubArrayZeroSum();
        int[] array = {6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7};
        subArray.findSumArrayZero(array);

    }


    public void findSumArrayZero(int[] arr) {

        int sumElements = 0;
        ArrayList<Integer> sumArrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            sumElements += arr[i];


            if (sumElements == 0) {
                System.out.println("Between 0 and " + i + "th element");
                sumArrayList.add(i,sumElements);
            }

            if (sumArrayList.contains(sumElements)) {
                System.out.println("Between " + sumArrayList.indexOf(sumElements) + " and " + i + "th element");

            }

            sumArrayList.add(i,sumElements);
        }
    }

}
