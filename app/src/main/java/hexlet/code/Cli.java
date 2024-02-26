package hexlet.code;

import java.util.Scanner;

public class Cli {

    static Cli cli = new Cli();
    public String userName;

    public static void greetingUser() {
        System.out.println("\nWelcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("May I have your name? ");

        cli.userName = scanner.next();
        System.out.println("Hello, " + cli.userName + "!");
    }
}
