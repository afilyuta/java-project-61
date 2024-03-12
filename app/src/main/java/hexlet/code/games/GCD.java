package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class GCD {

    private static final int COUNT_OF_QUESTIONS = 3;

    public static void runGcdGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("Find the greatest common divisor of given numbers.", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int a = generateRandomInt(99);
            int b = generateRandomInt(99);

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
