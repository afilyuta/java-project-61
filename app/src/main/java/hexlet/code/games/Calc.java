package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getSingleDigitNumber;
import static hexlet.code.Engine.getTwoDigitNumber;

public class Calc {

    public static void calc() {
        getGreetingAndRules("What is the result of the expression?");
        String[][] expressionsAndRightAnswers = getExpressionsAndRightAnswers();
        runGame(expressionsAndRightAnswers);
    }

    public static String[][] getExpressionsAndRightAnswers() {
        String[][] expressionsAndRightAnswers = new String[3][2];
        int length = expressionsAndRightAnswers.length;

        for (int i = 0; i < length; i++) {
            int a = getTwoDigitNumber();
            int b = getSingleDigitNumber();
            int c = getSingleDigitNumber();

            String sign = switch (c) {
                case 1, 4, 7 -> "+";
                case 2, 5, 8 -> "-";
                default -> "*";
            };

            int intRightAnswer = switch (c) {
                case 1, 4, 7 -> a + b; // +
                case 2, 5, 8 -> a - b; // -
                default -> a * b;
            };

            String expression = a + " " + sign + " " + b;
            String rightAnswer = "" + intRightAnswer;

            String[] expressionAndRightAnswer = {expression, rightAnswer};
            expressionsAndRightAnswers[i] = expressionAndRightAnswer;
        }

        return expressionsAndRightAnswers;
    }
}
