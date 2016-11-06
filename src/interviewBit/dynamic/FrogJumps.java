package interviewBit.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by jaydatta on 10/30/16.
 */
public class FrogJumps {
        public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String s;
            ArrayList<Integer> canyonArray  =new ArrayList<>();
            while((s= in.readLine()) !=null && ! s.isEmpty()){
                canyonArray.add(Integer.parseInt(s));
            }

            Integer[] newArray = canyonArray.toArray(new Integer[canyonArray.size()]);
            minimumJumps(newArray);
        }


        private static void minimumJumps(Integer[] arr) {
            int[] jumps = new int[arr.length + 1];
            int[] previous = new int[arr.length + 1];
            int n = arr.length;

            // initialize first jump to zero because the hero needs no change to position to be on the same position
            jumps[0] = 0;

            for (int i = 1; i <= n; i++) {

                // Pessimistically initialize that hero requires MAXIMUM POSSIBLE values to go from zero'th location to ith
                jumps[i] = Integer.MAX_VALUE;
                for (int j = 0; j < i; j++) {

                    // (i-j) refers to
                    if ((i - j) <= +arr[j] && jumps[j] != Integer.MAX_VALUE) {


                        if (jumps[i] > jumps[j] + 1) {
                            jumps[i] = jumps[j] + 1;
                            previous[i] = j;
                        }
                    }
                }
            }

            // Put the values in previous array onto a stack for printing
            Stack<String> stackResult = new Stack<>();

            if (jumps[n] != Integer.MAX_VALUE) {
                int i = n;
                while (i != 0) {
                    //System.out.print(i == n ? "out" : i+",");

                    stackResult.push(i == n ? "out" : i+", ");
                    i = previous[i];
                }
//            System.out.print("0,");
                stackResult.push("0, ");
                StringBuffer sb = new StringBuffer();
                while(!stackResult.isEmpty()){
                    sb.append(stackResult.pop());
                }

                System.out.println(sb.toString());

            } else {
                System.out.println("failure");
            }




        }

    }

