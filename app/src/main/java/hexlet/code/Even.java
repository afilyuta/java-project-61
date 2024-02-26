package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.cli;
import static hexlet.code.Cli.greetingUser;

public class Even {

    public static void even() {
        greetingUser();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        Scanner scanner = new Scanner(System.in);
        String userName = cli.userName;
        int counter = 0;

        while (counter < 3) {
            int randomNumber = (int) (Math.random() * 1000);
            String rightAnswer = randomNumber % 2 == 0 ? "yes" : "no";

            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase(rightAnswer)) {
                System.out.println("Correct!");
                counter++;
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.", answer, rightAnswer);
                System.out.printf("Let's try again, %s\n", userName);
                break;
            }
        }

        if (counter == 3) {
            System.out.printf("Congratulations, %s!\n", userName);
        }

        scanner.close();
    }
}
