// https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java

public class Solution {
    public static String solve(final String str) {
      char[] charArray = str.toCharArray();
        int upperCaseCounter = 0;
        for (char c : charArray) {
            if (Character.isUpperCase(c)) {
                upperCaseCounter++;
            }
        }
        return upperCaseCounter > str.length() / 2 ? str.toUpperCase() : str.toLowerCase();
    }
}
