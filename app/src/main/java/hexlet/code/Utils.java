package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int generateRandomInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static int generateRandomInt(int min, int max) {
        return RANDOM.nextInt(max - min + 1) + min;
    }
}
