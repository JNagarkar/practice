package JavaBasics.Questions;

/**
 * Created by jaydatta  Nagarkar on 9/23/16.
 * ID: 1209337385
 *
 * References: https://en.wikipedia.org/wiki/Monty_Hall_problem
 * https://betterexplained.com/articles/understanding-the-monty-hall-problem/
 *
 */

import java.util.Random;

public class MyMontyHall {

    public static int total_games = 1000;
    public static int number_hats = 3;

    public static void main(String[] args) {

        int wins = 0;
        int loses = 0;

        int wins_not_changing = 0;
        int lose_not_changing = 0;


        Random random = new Random();
        for (int i = 0; i < total_games; i++) {


            //random hat chosen
            int initiallyChosenHat = new Random().nextInt(number_hats);

            // random prize chosen
            int hatHavingPrize = new Random().nextInt(number_hats);

            // some hat opened
            int hatOpenedByMonte = new Random().nextInt(number_hats);
            // ensuring that hat opened does not have prize and hat opened is not the one chosen by user
            while (hatOpenedByMonte == initiallyChosenHat || (hatOpenedByMonte == hatHavingPrize)) {
                hatOpenedByMonte = new Random().nextInt(number_hats);
            }

            // Now player choses another hat other than the one he had chosen earlier
            int secondTimeChosenHat = new Random().nextInt(number_hats);

            while (secondTimeChosenHat == hatOpenedByMonte || secondTimeChosenHat == initiallyChosenHat) {
                secondTimeChosenHat = new Random().nextInt(number_hats);
            }


            if (secondTimeChosenHat == hatHavingPrize) {
                wins++;
            } else {
                loses++;
            }

            if (initiallyChosenHat == hatHavingPrize) {
                wins_not_changing++;
            } else {
                lose_not_changing++;
            }

        }


        float winPer = (float) (wins) / total_games * 100;
        float losePer = (float) (loses) / total_games * 100;

        System.out.println("Stats after switching");
        System.out.println(wins + " wins " + winPer + "%");
        System.out.println(loses + " loss " + losePer + " %");

        System.out.println("-----------------------------\n Stats without shuffling");
        System.out.println(wins_not_changing + " wins " + (float) (wins_not_changing) / total_games * 100 + "%");
        System.out.println(lose_not_changing + " loss " + (float) (lose_not_changing) / total_games * 100 + "%");

int m=0;
        for( m=0; m < 10; m++){}
        System.out.println(m);



    }
}

