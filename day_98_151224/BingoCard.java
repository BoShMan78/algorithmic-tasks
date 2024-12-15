// https://www.codewars.com/kata/566d5e2e57d8fae53c00000c/train/java

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class BingoCard {
    public static String[] getCard() {
        String[] result = new String[24];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= 24; i++) {
            StringBuilder builder = new StringBuilder();
            int k = 0;
            String letter = "B";

            if (i > 5 && i <= 10) {
                k = 15;
                letter = "I";
            }
            if (i > 10 && i <= 14) {
                k = 30;
                letter = "N";
            }
            if (i > 14 && i <= 19) {
                k = 45;
                letter = "G";
            }
            if (i > 19 && i <= 24) {
                k = 60;
                letter = "O";
            }

            int random;
            do {
                random = getRandom() + k;
            } while (set.contains(random));
            set.add(random);
            builder.append(letter).append(String.valueOf(random));
            result[i - 1] = builder.toString();
        }
        return result;
    }

    private static int getRandom() {
        Random random = new Random();
        int n = random.nextInt(15);
        n += 1;
        return n;
    }
}
