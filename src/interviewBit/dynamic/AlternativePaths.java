package interviewBit.dynamic;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

/**
 * Created by jaydatta on 10/30/16.
 */
public class AlternativePaths {

    static int[] xOffset = {0, 1, -1, 0};
    static int[] yOffset = {1, 0, 0, -1};
    static int alternativeCount = 4;
    static int expectedX = 3;
    static int expectedY = 3;
    static int N = 4;
    static int count = 0;

    static int matrix[][] = {{1,1,1,1}
                            ,{1,1,0,1},
                             {0,1,1,1},
                             {0,0,1,1}};


    static boolean visited[][] = new boolean[N][N];

    public static void main(String[] args) {

        Queue<State> queue = new LinkedList<>();
        queue.add(new State(0,0));
        explore(queue);

        //System.out.println(count);

        //System.out.println(answer);
    }


    static void  explore(Queue<State> queue){

        int gen = 1;
        boolean found = false;

        while(!found && !queue.isEmpty()){

            int queueCount = queue.size();

            for(int c = 0 ; c < queueCount; c++){

                State state = queue.remove();

                int x = state.x;
                int y = state.y;

                //Find out number of alternatives
                for(int i = 0; !found && i < alternativeCount; i++){
                    int newX = x + xOffset[i];
                    int newY = y + yOffset[i];

                    if(isValid(newX, newY)){
                        //Before all, check if you reached the end state
                        if(newX == expectedX && newY == expectedY){
                            System.out.println("Found: " + gen);
                            found = true;
                            break;
                        }

                        queue.add(new State(newX, newY));
                    }
                }
            }

            gen++;
        }
    }

    static boolean  isValid(int x, int y){
        if(x < N && x >= 0 && y < N && y >=0 && matrix[x][y] == 1 && visited[x][y] == false){
            return true;
        }
        return false;
    }
}

class State {
    int x, y;

    public State(int x, int y) {
        this.x = x;
        this.y = y;
    }

}