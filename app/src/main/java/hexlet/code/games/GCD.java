package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class GCD {

    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY = 99;

    public static void runGcdGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int a = generateRandomInt(TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY);
            int b = generateRandomInt(TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY);

            String question = a + " " + b;

            while (b != 0) {
                int temp = a % b;
                a = b;
                b = temp;
            }

            int gsd = a + b;

            String answer = "" + gsd;

            questionsAndAnswers[0][i] = question;
            questionsAndAnswers[1][i] = answer;
        }

        return questionsAndAnswers;
    }
}
