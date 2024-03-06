package hexlet.code;

import java.util.Random;

public class Utils {
    private static Random random = new Random();

    public static int generateRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
        System.out.println(generateRandomInt(5, 15));
    }
}
