package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class Prime {

    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY = 99;

    public static void runPrimeGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {

        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int number = generateRandomInt(TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY);
            int sqrtOfNumber = (int) Math.sqrt(number);

            String question = "" + number;
            String answer = "";

            for (int j = 2; j <= sqrtOfNumber; ++j) {
                if (number % j == 0) {
                    answer = "no";
                    break;
                } else {
                    answer = "yes";
                }
            }

            questionsAndAnswers[0][i] = question;
            questionsAndAnswers[1][i] = answer;
        }

        return questionsAndAnswers;
    }
}
