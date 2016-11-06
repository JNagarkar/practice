package JavaBasics.Questions;

import java.util.Stack;

/**
 * Created by jaydatta on 9/21/16.
 */
public class BracesMatching {

    public static void main(String[] args) {

        String sample = "{({[]))}]";

        boolean result = isStringBalanced(sample);

        System.out.println(result);
    }

    public static boolean isStringBalanced(String sample) {
        boolean result = true;
        if (sample == null) {
            return result;
        }

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < sample.length(); i++) {
            char currentChar = sample.charAt(i);


            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            }
            else if (currentChar == ')') {
                char topCharacter = stack.pop();
                if (topCharacter != '(') {
                    System.out.println(topCharacter+":"+currentChar);
                    return false;
                }
            }
            else if (currentChar == '}') {
                char topCharacter = stack.pop();
                if (topCharacter != '{') {
                    return false;
                }
            }
            else if (currentChar == ']') {
                char topCharacter = stack.pop();
                if (topCharacter != '[') {
                    return false;
                }
            }

        }

        if(!stack.isEmpty()){
            return false;
        }


        return result;
    }
}
