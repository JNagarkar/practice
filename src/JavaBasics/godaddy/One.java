package JavaBasics.godaddy;

import java.util.HashMap;

/**
 * Created by jaydatta on 10/20/16.
 */
public class One {

    public static void main(String[] args) {


        String s = "20 3 4";
        String[] numbers = s.split(" ");
        for(int i=0; i < numbers.length;i++){
            System.out.println(numbers[i]);
        }

        int number = 20;
        int firstNumber = 3;
        int secondNumber = 4;

        StringBuffer sb = new StringBuffer();


        for (int i = 1; i <= number; i++) {
            boolean results = false;
            if ((i % firstNumber == 0) || (i % secondNumber == 0)) {
                sb.append("OUT");
                results = true;
            }
            if (containsDigit(i, firstNumber, secondNumber)) {
                sb.append("THINK");
                results = true;
            }
            if (results == false) {
                sb.append(i);
            }
            sb.append(",");

        }

        System.out.println(sb.toString().substring(0, sb.toString().length() - 1));

    }

    public static boolean containsDigit(int number, int firstNumber, int secondNumber) {
        int dummyNumber = number;
        HashMap<Integer, Integer> digits = new HashMap<>();
        //    System.out.println("IN containsdigit:"+number);
//
        while (dummyNumber > 0) {
            digits.put(dummyNumber % 10, dummyNumber % 10);
            dummyNumber = dummyNumber / 10;
        }

//        System.out.println(number);

        if (digits.containsKey(firstNumber) || digits.containsKey(secondNumber)) {
            return true;
        }

        return false;
    }


}
