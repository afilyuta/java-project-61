package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;

import static hexlet.code.games.Even.even;

import static hexlet.code.games.Calc.calc;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "0 - Exit"
        );

        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        switch (gameNumber) {
            case 1:
                greetingUser();
                break;
            case 2:
                even();
                break;
            case 3:
                calc();
                break;
            default:
                System.exit(0);
        }
    }
}
