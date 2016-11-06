package geeksforgeeks;

/**
 * Created by jaydatta on 9/6/16.
 */
public class MaximumSumOfRotations {

    public static void main(String[] args) {

        int[] sampleArray = {8, 3, 1, 2};
        int result = rotateArray(sampleArray);
        System.out.println(result);

    }

    public static int rotateArray(int[] sampleArray) {

        int cumulative_addition = 0;
        for (int i = 0; i < sampleArray.length; i++) {
            cumulative_addition = cumulative_addition + 1;
        }

        int max_product = 0;
        int current_product = 0;
        int next_product = 0;

        for (int i = 0; i < sampleArray.length; i++) {
            current_product += i * sampleArray[i];
        }


        for (int i = 1; i < sampleArray.length; i++) {

            next_product = current_product - (cumulative_addition - sampleArray[i-1]) + (sampleArray.length - 1) * sampleArray[i - 1];

            current_product = next_product;
            if (next_product > max_product) {
                max_product = next_product;
            }
        }


        return max_product;
    }
}
