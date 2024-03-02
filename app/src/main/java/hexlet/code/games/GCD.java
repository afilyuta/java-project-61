package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getTwoDigitNumber;

public class GCD {
    public static void gcd() {
        getGreetingAndRules("Find the greatest common divisor of given numbers.");

        String[][] gamePack = getGamePack();
        runGame(gamePack);
    }

    public static String[] getRoundPack() {
        int a = getTwoDigitNumber();
        int b = getTwoDigitNumber();
        int c = a;
        int d = b;

        while (d != 0) {
            int temp = c % d;
            c = d;
            d = temp;
        }

        int gsd = c + d;

        String expression = a + " " + b;
        String rightAnswer = "" + gsd;

        return new String[]{expression, rightAnswer};
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
