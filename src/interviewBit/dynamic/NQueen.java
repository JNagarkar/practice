package src.interviewBit.dynamic;
import java.io.*;
import java.util.*;

/**
 * Created by jaydatta on 10/30/16.
 */
public class NQueen {
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
    static int[] xOffset = {0, 1, -1, 0, 1, -1, 1, -1};
    static int[] yOffset = {1, 0, 0, -1, 1, 1, -1, -1};
    //static int alternativeCount = N;
    static int expectedX = 3;
    static int expectedY = 3;
    static int N = 8;
    static int count = 0;

    static boolean visited[][] = new boolean[N][N];

    public static void main(String[] args) {

        boolean answer = placeQueen(0);
        System.out.println(count);
        System.out.println(answer);
    }

    static boolean  placeQueen(int row){

        //Before all, check if you reached the end state
        if(row == N){
            count++;
            return false;
        }

        //Find out number of alternatives
        for(int col = 0; col < N; col++){

            if(isValid(row, col)){
                visited[row][col] = true;
                if(placeQueen(row + 1)){
                    //System.out.println(row + ":" + col) ;
                    return true;
                }
                visited[row][col] = false;
            }

        }

        return false;
    }

    static boolean  isValid(int row, int col){
        for(int x=0; x < row; x++){
            for(int y=0; y < N; y++){
                if(visited[x][y]){
                    if(x == row || y == col || Math.abs(x - row) == Math.abs(y - col)){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}


