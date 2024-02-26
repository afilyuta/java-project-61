package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "0 - Exit"
        );

        int gameNumber = scanner.nextInt();
        System.out.println("Your choice: " + gameNumber + "\n");

        if (gameNumber == 1) {
            System.out.println("Welcome to the Brain Games!");
            greetingUser();
        }
    }
}
