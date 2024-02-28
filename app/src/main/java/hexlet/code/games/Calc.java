package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;

public class Calc {

    public static void calc() {
        getGreetingAndRules("What is the result of the expression?");
        runGame(getExpressionsAndRightAnswers());
    }

    public static String[][] getExpressionsAndRightAnswers() {
        String[][] expressionsAndRightAnswers = new String[3][2];
        int length = expressionsAndRightAnswers.length;

        for (int i = 0; i < length; i++) {
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 10 + 1);
            int c = (int) (Math.random() * 10);

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
