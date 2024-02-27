package hexlet.code.games;

import static hexlet.code.Engine.getGreetingAndRules;

import static hexlet.code.Engine.runGame;

public class Even {

    public static void even() {
        getGreetingAndRules("Answer 'yes' if the number is even, otherwise answer 'no'.");
        runGame(getExpressionsAndRightAnswers());
    }

    public static String[][] getExpressionsAndRightAnswers() {
        String[][] expressionsAndRightAnswers = new String[3][2];
        int length = expressionsAndRightAnswers.length;

        for (int i = 0; i < length; i++) {
            String expression = "" + (int) (Math.random() * 100);
            String rightAnswer = Integer.parseInt(expression) % 2 == 0 ? "yes" : "no";
            String[] expressionAndRightAnswer = {expression, rightAnswer};

            expressionsAndRightAnswers[i] = expressionAndRightAnswer;
        }

        return expressionsAndRightAnswers;
    }

    public static void main(String[] args) {
        even();
    }
}
