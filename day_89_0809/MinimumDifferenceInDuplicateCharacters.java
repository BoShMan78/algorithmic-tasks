// https://www.codewars.com/kata/6574d1bde7484b5a56ec8f29/train/java

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static Object[] minRepeatingCharacterDifference(String text) {
        Map<Character, Integer> lastSeen = new HashMap<>();
        Map<Character, Integer> minDistance = new HashMap<>();
        int minDiff = Integer.MAX_VALUE;
        char minChar = 0;
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (lastSeen.containsKey(currentChar)) {
                int distance = i - lastSeen.get(currentChar);
                if (distance < minDiff) {
                    minDiff = distance; minChar = currentChar;
                }
                if (distance == minDiff && minChar == 0) {
                    minChar = currentChar;
                }
                if (!minDistance.containsKey(currentChar) || minDistance.get(currentChar) > distance) {
                    minDistance.put(currentChar, distance);
                }
            }
            lastSeen.put(currentChar, i);
        }
        return minChar == 0 ? null : new Object[]{minDistance.get(minChar), String.valueOf(minChar)};
    }
}
