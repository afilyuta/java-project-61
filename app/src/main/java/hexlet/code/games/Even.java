package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class Even {

    private static final int COUNT_OF_QUESTIONS = 3;

    public static void runEvenGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("Answer 'yes' if the number is even, otherwise answer 'no'.", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int a = generateRandomInt(1,99);

            String question = "" + a;
            String answer = Integer.parseInt(question) % 2 == 0 ? "yes" : "no";

            questionsAndAnswers[0][i] = question;
            questionsAndAnswers[1][i] = answer;
        }

        return questionsAndAnswers;
    }
}
