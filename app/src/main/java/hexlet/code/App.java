package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.games.Even.even;
import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.GCD.gcd;
import static hexlet.code.games.Progression.progression;
import static hexlet.code.games.Prime.prime;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit"
        );

        System.out.print("Your choice: ");
        chooseGame(scanner);
    }

    private static void chooseGame(Scanner scanner) {
        int playerChoice = scanner.nextInt();

        int greet = 1;
        int even = 2;
        int calc = 3;
        int gcd = 4;
        int progression = 5;
        int prime = 6;

        if (playerChoice == greet) {
            greetingUser();
        } else if (playerChoice == even) {
            even();
        } else if (playerChoice == calc) {
            calc();
        } else if (playerChoice == gcd) {
            gcd();
        } else if (playerChoice == progression) {
            progression();
        } else if (playerChoice == prime) {
            prime();
        }

        System.exit(0);
    }
}
