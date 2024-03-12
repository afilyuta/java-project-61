package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.greetingUser;
import static hexlet.code.games.Even.runEvenGame;
import static hexlet.code.games.Calc.runCalcGame;
import static hexlet.code.games.GCD.runGcdGame;
import static hexlet.code.games.Progression.runProgressionGame;
import static hexlet.code.games.Prime.runPrimeGame;

public class App {

    public static final int GREET_GAME = 1;
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GSD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(
                """
                        Please enter the game number and press Enter.
                        1 - Greet
                        2 - Even
                        3 - Calc
                        4 - GCD
                        5 - Progression
                        6 - Prime
                        0 - Exit"""
        );

        System.out.print("Your choice: ");
        int numberEnteredByPlayer = scanner.nextInt();

        switch (numberEnteredByPlayer) {
            case GREET_GAME -> greetingUser();
            case EVEN_GAME -> runEvenGame();
            case CALC_GAME -> runCalcGame();
            case GSD_GAME -> runGcdGame();
            case PROGRESSION_GAME -> runProgressionGame();
            case PRIME_GAME -> runPrimeGame();
            default -> System.exit(0);
        }
    }
}
