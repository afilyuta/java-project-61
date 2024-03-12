package hexlet.code.games;

import static hexlet.code.Engine.startGame;
import static hexlet.code.Utils.generateRandomInt;

public class Progression {

    private static final int COUNT_OF_QUESTIONS = 3;
    private static final int COUNT_OF_ELEMENTS_IN_PROGRESSION = 10;
    private static final int TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY = 99;
    private static final int SINGLE_DIGIT_NUMBER_GENERATOR_BOUNDARY = 9;

    public static void runProgressionGame() {
        String[][] questionsAndAnswers = getQuestionsAndAnswers();
        startGame("What number is missing in the progression?", questionsAndAnswers);
    }

    public static String[][] getQuestionsAndAnswers() {
        String[][] questionsAndAnswers = new String[2][COUNT_OF_QUESTIONS];

        for (int i = 0; i < COUNT_OF_QUESTIONS; i++) {
            int numberToSkip = generateRandomInt(1, SINGLE_DIGIT_NUMBER_GENERATOR_BOUNDARY);

            int initialValue = generateRandomInt(1, TWO_DIGIT_NUMBER_GENERATOR_BOUNDARY);
            int addNumber = generateRandomInt(1, SINGLE_DIGIT_NUMBER_GENERATOR_BOUNDARY);
            int currentNumber = initialValue;

            String answer = "";
            StringBuilder progression = new StringBuilder(initialValue);

            for (int j = 0; j < COUNT_OF_ELEMENTS_IN_PROGRESSION; j++) {
                currentNumber += addNumber;

                if (j != numberToSkip) {
                    progression.append(" ");
                    progression.append(currentNumber);
                } else {
                    progression.append(" ..");
                    answer = String.valueOf(currentNumber);
                }
            }

            String question = progression.toString().trim();

            questionsAndAnswers[0][i] = question;
            questionsAndAnswers[1][i] = answer;
        }

        return questionsAndAnswers;
    }

    public static void main(String[] args) {
        runProgressionGame();
    }
}
