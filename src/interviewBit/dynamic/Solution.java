package interviewBit.dynamic;

/**
 * Created by jaydatta on 10/30/16.
 */



public class Solution {

    static int[] xOffset = {0, 1, -1, 0};
    static int[] yOffset = {1, 0, 0, -1};
    static int alternativeCount = 4;
    static int expectedX = 3;
    static int expectedY = 3;
    static int N = 4;
    static int count = 0;

    static int matrix[][] = {{1,1,1,1},
                             {1,1,0,1},
                             {0,1,1,1},
                             {0,0,1,1}};
    static boolean visited[][] = new boolean[N][N];

    public static void main(String[] args) {

        boolean answer = explore(0,0);
        System.out.println(count);
        System.out.println(answer);
    }

    static boolean  explore(int x, int y){

        visited[x][y] = true;

        //Before all, check if you reached the end state
        if(x == expectedX && y == expectedY){
            count++;
            visited[x][y] = false;
            return false;
        }



        //Find out number of alternatives
        for(int i = 0; i < alternativeCount; i++){
            int newX = x + xOffset[i];
            int newY = y + yOffset[i];

            if(isValid(newX, newY)){
                if(explore(newX, newY)){
                    System.out.println(newX + ":" + newY);
                    return true;
                }
            }
        }

        //visited[x][y] = false;
        return false;
    }

    static boolean  isValid(int x, int y){
        if(x < N && x >= 0 && y < N && y >=0 && matrix[x][y] == 1 && visited[x][y] == false){
            return true;
        }
        return false;
    }
}


