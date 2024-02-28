package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;
import static hexlet.code.Engine.runGame;
import static hexlet.code.Engine.getSingleDigitNumber;
import static hexlet.code.Engine.getTwoDigitNumber;

public class Progression {

    public static void progression() {
        getGreetingAndRules("What number is missing in the progression?");
        String[][] expressionsAndRightAnswers = getExpressionsAndRightAnswers();
        runGame(expressionsAndRightAnswers);
    }

    public static String[][] getExpressionsAndRightAnswers() {
        String[][] expressionsAndRightAnswers = new String[3][2];
        int length = expressionsAndRightAnswers.length;

        for (int i = 0; i < length; i++) {
            int numberToSkip = getSingleDigitNumber();
            int initialValue = getTwoDigitNumber();
            int addNumber = getSingleDigitNumber();

            int currentNumber = initialValue;
            String rightAnswer = "";
            StringBuilder progression = new StringBuilder(initialValue);

            for (int j = 1; j < 10; j++) {
                currentNumber += addNumber;

                if (j != numberToSkip) {
                    progression.append(" ");
                    progression.append(currentNumber);
                } else {
                    progression.append(" ..");
                    rightAnswer = "" + currentNumber;
                }
            }

            String expression = progression.toString();

            String[] expressionAndRightAnswer = {expression, rightAnswer};
            expressionsAndRightAnswers[i] = expressionAndRightAnswer;
        }

        return expressionsAndRightAnswers;
    }
}
