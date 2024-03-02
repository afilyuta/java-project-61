package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getTwoDigitNumber;

public class Even {

    public static void even() {
        getGreetingAndRules("Answer 'yes' if the number is even, otherwise answer 'no'.");

        String[][] gamePack = getGamePack();
        runGame(gamePack);
    }

    public static String[] getRoundPack() {
        int a = getTwoDigitNumber();

        String expression = "" + a;
        String rightAnswer = Integer.parseInt(expression) % 2 == 0 ? "yes" : "no";

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
