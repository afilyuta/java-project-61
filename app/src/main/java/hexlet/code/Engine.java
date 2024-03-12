package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.Cli.getUserName;

public class Engine {

    private static final int COUNT_OF_ROUNDS = 3;

    public static void startGame(String rules, String[][] questionsAndAnswers) {
        greetingUser();

        System.out.println(rules);

        Scanner scanner = new Scanner(System.in);
        String userName = getUserName();

        for (int i = 0; i < COUNT_OF_ROUNDS; i++) {
            String expression = questionsAndAnswers[0][i];
            String rightAnswer = questionsAndAnswers[1][i];

            System.out.println("Question: " + expression);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", answer, rightAnswer);
                System.out.printf("Let's try again, %s!\n", userName);
                System.exit(0);
            }
        }

        System.out.printf("Congratulations, %s!\n", userName);
    }

    public static int getSingleDigitNumber() {
        int singleDigitConverter = 10;
        return (int) (Math.random() * singleDigitConverter + 1);
    }

    public static int getTwoDigitNumber() {
        int twoDigitConverter = 100;
        return (int) (Math.random() * twoDigitConverter + 1);
    }
}
