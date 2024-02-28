package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;

public class GCD {
    public static void gsd() {
        getGreetingAndRules("Find the greatest common divisor of given numbers.");
        String[][] expressionsAndRightAnswers = getExpressionsAndRightAnswers();
        runGame(expressionsAndRightAnswers);
    }

    public static String[][] getExpressionsAndRightAnswers() {
        String[][] expressionsAndRightAnswers = new String[3][2];
        int length = expressionsAndRightAnswers.length;

        for (int i = 0; i < length; i++) {
            int a = (int) (Math.random() * 100 + 1);
            int b = (int) (Math.random() * 100 + 1);
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
            String[] expressionAndRightAnswer = {expression, rightAnswer};

            expressionsAndRightAnswers[i] = expressionAndRightAnswer;
        }

        return expressionsAndRightAnswers;
    }
}
