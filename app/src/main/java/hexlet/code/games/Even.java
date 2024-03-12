package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class Even {

    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY = 99;

    public static void runEvenGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int a = generateRandomInt(1, TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY);

            String question = "" + a;
            String answer = Integer.parseInt(question) % 2 == 0 ? "yes" : "no";

            questionsAndAnswers[0][i] = question;
            questionsAndAnswers[1][i] = answer;
        }

        return questionsAndAnswers;
    }
}
