package interviewBit;

import java.util.ArrayList;

/**
 * Created by jaydatta on 10/30/16.
 */
public class MaxNonNegativeSubArray {


    public static void main(String[] args) {

    }


    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        long maxSum = 0;
        long newSum = 0;
        ArrayList<Integer> maxArray = new ArrayList<Integer>();
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (Integer i : a) {
            if (i >= 0) {
                newSum += i;
                newArray.add(i);
            } else {
                newSum = 0;
                newArray = new ArrayList<Integer>();
            }
            if ((maxSum < newSum) || (     (maxSum == newSum) && (newArray.size() > maxArray.size())       )) {
                maxSum = newSum;
                maxArray = newArray;
            }
        }
        return maxArray;
    }
}

/*
    public ArrayList<Integer> maxset(ArrayList<Integer> initial) {

        ArrayList<Integer> sums = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int sum=0;
        int locationMax = -1;

        int maxSum=0;
        for(int i=0 ;i < initial.size();i++){
            if(initial.get(i) >= 0){
                sums.add(i,initial.get(i)+sum);
                sum = sum + initial.get(i);
                if(sum > maxSum){
                    maxSum = sum;
                    locationMax = i;
                }
            }
            else if(initial.get(i) < 0){
                sum = 0;
                sums.add(i,0);
            }
        }

        //Searching for Zero's
        ArrayList<Integer> zeroLocations = new ArrayList<>();
        zeroLocations.add(0,-1);
        int zeroCounter = 0;
        for(int i=0; i < sums.size();i++){
            if(sums.get(i)==0){
                zeroLocations.add(zeroCounter,i);
                zeroCounter++;
            }
        }


        int lessThan = -1;
        int greaterThan = -1;
        boolean enterBit = true;
        //Choose a location from between
        for(int i=0 ;i < zeroLocations.size();i++){
            if(zeroLocations.get(i) < locationMax && zeroLocations.get(i) > lessThan){
                lessThan = zeroLocations.get(i);
            }
            if(zeroLocations.get(i) > locationMax && enterBit){
                greaterThan = zeroLocations.get(i);
                enterBit = false;
            }
        }

        lessThan = lessThan < 0 ? 0: lessThan;
        greaterThan = greaterThan -1;
        enterBit = true;
        int counter = 0;
        while(lessThan <= greaterThan){
            result.add(initial.get(lessThan));
            lessThan++;
        }



        return result;
*/
