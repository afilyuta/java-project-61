package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getSingleDigitNumber;
import static hexlet.code.Engine.getTwoDigitNumber;

public class Calc {

    public static void calc() {
        getGreetingAndRules("What is the result of the expression?");
        String[][] gamePack = getGamePack();
        runGame(gamePack);
    }

    public static String[] getRoundPack() {
        int a = getTwoDigitNumber();
        int b = getSingleDigitNumber();
        int c = getSingleDigitNumber();

        String sign;
        int intRightAnswer;

        int addCaseOne = 1;
        int addCaseTwo = 4;
        int addCaseThree = 7;

        int subCaseOne = 2;
        int subCaseTwo = 5;
        int subCaseThree = 8;

        if (c == addCaseOne || c == addCaseTwo || c == addCaseThree) {
            sign = "+";
            intRightAnswer = a + b;
        } else if (c == subCaseOne || c == subCaseTwo || c == subCaseThree) {
            sign = "-";
            intRightAnswer = a - b;
        } else {
            sign = "*";
            intRightAnswer = a * b;
        }

        String expression = a + " " + sign + " " + b;
        String rightAnswer = "" + intRightAnswer;

        return new String[]{expression, rightAnswer};
    }

    public static String[][] getGamePack() {
        String[][] gamePack = new String[3][2];
        int length = gamePack.length;

        for (int i = 0; i < length; i++) {
            gamePack[i] = getRoundPack();
        }

        return gamePack;
    }
}
