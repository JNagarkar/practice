package src.geeksforgeeks;

/**
 * Created by jaydatta on 9/6/16.
 */
public class MaximumProductSubarray {

    public static void main(String[] args) {

        int[] sampleArray = {6, -3, -10, 0, 2};
        maximumSubProduct(sampleArray);

    }

    public static int maximumSubProduct(int[] sampleArray) {

        int maximum_forward_product = 1;
        int maximum_backward_product = 1;
        int maximum_overall_product = 1;

        for (int i = 0; i < sampleArray.length; i++) {

            maximum_overall_product = maximum_overall_product * sampleArray[i];
            if (maximum_overall_product > maximum_backward_product) {
                maximum_backward_product = maximum_overall_product;
            }

            if (sampleArray[i] == 0) {
                maximum_overall_product = 1;
                continue;
            }
        }

        maximum_overall_product = 1;


        for (int i = sampleArray.length - 1; i > 0; i--) {

            maximum_overall_product = maximum_overall_product * sampleArray[i];
            if (maximum_overall_product > maximum_forward_product) {
                maximum_forward_product = maximum_overall_product;
            }

            if (sampleArray[i] == 0) {
                maximum_overall_product = 1;
                continue;
            }
        }

        maximum_overall_product = Math.max(maximum_backward_product, maximum_forward_product);
        System.out.println(maximum_overall_product);


        return 1;
    }
}
