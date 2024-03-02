package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getTwoDigitNumber;

public class Prime {
    public static void prime() {
        getGreetingAndRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[][] gamePack = getGamePack();
        runGame(gamePack);
    }

    public static String[] getRoundPack() {
        int number = getTwoDigitNumber();
        int sqrtOfNumber = (int) Math.sqrt(number);

        String expression = "" + number;
        String rightAnswer = "";

        for (int i = 2; i <= sqrtOfNumber; ++i) {
            if (number % i == 0) {
                rightAnswer = "no";
                return new String[] {expression, rightAnswer};
            }

            rightAnswer = "yes";
        }

        return new String[] {expression, rightAnswer};
    }

    public static String[][] getGamePack() {
        int countOfRounds = 3;
        int countOfVariables = 2;

        String[][] gamePack = new String[countOfRounds][countOfVariables];
        int length = gamePack.length;

        for (int i = 0; i < length; i++) {
            gamePack[i] = getRoundPack();
        }

        return gamePack;
    }
}
