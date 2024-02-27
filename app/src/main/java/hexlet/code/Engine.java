package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;

public class Engine {

    public static void runGame(String[][] expressionsAndRightAnswers) {
        Scanner scanner = new Scanner(System.in);

        for (String[] part : expressionsAndRightAnswers) {
            String expression = part[0];
            String rightAnswer = part[1];

            System.out.println("Question: " + expression);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", answer, rightAnswer);
                System.out.printf("Let's try again, %s\n", Cli.userName);
                System.exit(0);
            }
        }

        System.out.printf("Congratulations, %s!\n", Cli.userName);
    }

    public static void getGreetingAndRules(String rules) {
        greetingUser();
        System.out.println(rules);
    }
}
