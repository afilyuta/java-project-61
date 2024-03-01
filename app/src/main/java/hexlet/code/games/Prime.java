package hexlet.code.games;

import static hexlet.code.Engine.*;

public class Prime {
    public static void prime() {
        getGreetingAndRules("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        String[][] gamePack = getGamePack();
        runGame(gamePack);
    }

    public static String[] getRoundPack() {
        int number = getTwoDigitNumber();
        int sqrtOfNumber = (int) Math.sqrt(number);
        int counter = 0;

        for (int i = 2; i <= sqrtOfNumber; ++i) {
            counter = number % i == 0 ? ++counter : counter;
        }

        String expression = "" + number;
        String rightAnswer = counter == 0 ? "yes" : "no";

        return new String[] {expression, rightAnswer};
    }

    public static String[][] getGamePack() {
        String[][] gamePack = new String[3][2];
        int length = gamePack.length;

        for (int i = 0; i < length; i++) {
            gamePack[i] = getRoundPack();
        }

        return gamePack;
    }

    public static void main(String[] args) {
        prime();
    }
}
