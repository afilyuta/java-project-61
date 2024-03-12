package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class Calc {

    private static final int COUNT_OF_QUESTIONS = 3;

    public static void runCalcGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("What is the result of the expression?", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            String[] signs = {"+", "-", "*"};
            int randomIndex = generateRandomInt(0, signs.length - 1);

            int a = generateRandomInt(1, 99);
            int b = generateRandomInt(1, 10);

            String question = a + " " + signs[randomIndex] + " " + b;
            String answer = getAnswer(a, b, randomIndex);

            questionsAndAnswers[0][i] = question;
            questionsAndAnswers[1][i] = answer;
        }

        return questionsAndAnswers;
    }

    public static String getAnswer(int a, int b, int randomIndex) {
        int answer = switch (randomIndex) {
            case 0 -> a + b;
            case 1 -> a - b;
            case 2 -> a * b;
            default -> throw new IllegalStateException("Unexpected value: " + randomIndex);
        };

        return String.valueOf(answer);
    }
}
