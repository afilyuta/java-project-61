package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getSingleDigitNumber;
import static hexlet.code.Engine.getTwoDigitNumber;

public class Progression {

    public static void progression() {
        getGreetingAndRules("What number is missing in the progression?");

        String[][] gamePack = getGamePack();
        runGame(gamePack);
    }

    public static String[] getRoundPack() {
        int numberToSkip = getSingleDigitNumber();
        int invalidValue = 10;
        numberToSkip = numberToSkip == invalidValue ? invalidValue - 1 : numberToSkip;

        int initialValue = getTwoDigitNumber();
        int addNumber = getSingleDigitNumber();
        int currentNumber = initialValue;

        String rightAnswer = "";
        StringBuilder progression = new StringBuilder(initialValue);

        for (int j = 0; j < invalidValue; j++) {
            currentNumber += addNumber;

            if (j != numberToSkip) {
                progression.append(" ");
                progression.append(currentNumber);
            } else {
                progression.append(" ..");
                rightAnswer = String.valueOf(currentNumber);
            }
        }

        String expression = progression.toString().trim();

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
