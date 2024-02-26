package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;

import static hexlet.code.Even.even;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "0 - Exit"
        );

        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 1) {
            greetingUser();
        } else if (gameNumber == 2) {
            even();
        }
    }
}
