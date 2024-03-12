package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random random = new Random();

    public static int generateRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int generateRandomInt(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
