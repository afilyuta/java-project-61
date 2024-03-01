package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.games.Even.even;
import static hexlet.code.games.Calc.calc;
import static hexlet.code.games.GCD.gsd;
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
            case 4:
                gsd();
                break;
            case 5:
                progression();
                break;
            case 6:
                prime();
                break;
            default:
                System.exit(0);
        }
    }
}
