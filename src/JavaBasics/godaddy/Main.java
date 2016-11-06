package JavaBasics.godaddy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by jaydatta on 10/28/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int count=0;

        int number=0;
        int firstNumber=0 ;
        int secondNumber=0;

                int ny = 0;

                while ((s = in.readLine()) != null &&  !s.isEmpty()) {
                    System.out.println(s);
                    String[] numbers = s.split(" ");
                    number = Integer.parseInt(numbers[0]);
                    firstNumber = Integer.parseInt(numbers[1]);
                    secondNumber = Integer.parseInt(numbers[2]);
                }





        StringBuffer sb = new StringBuffer();

        for(int i=1 ; i <= number ; i++){
            boolean results = false;

            if((i % firstNumber ==0) || (i % secondNumber ==0)){
                sb.append("OUT");
                results = true;
            }
            if(containsDigit(i,firstNumber,secondNumber)){
                sb.append("THINK");
                results =true;
            }
            if(results ==false){
                sb.append(i);
            }
            sb.append(",");
        }

        System.out.println(sb.toString().substring(0,sb.toString().length()-1));

    }

    public static boolean containsDigit(int number,int firstNumber,int secondNumber){
        int dummyNumber = number;
        HashMap<Integer,Integer> digits = new HashMap<>();

        while(dummyNumber > 0){
            digits.put(dummyNumber % 10 ,dummyNumber %10);
            dummyNumber  = dummyNumber % 10;
        }
        if(digits.containsKey(firstNumber) || digits.containsKey(secondNumber)){
            return true;
        }
        return false;

    }


}
