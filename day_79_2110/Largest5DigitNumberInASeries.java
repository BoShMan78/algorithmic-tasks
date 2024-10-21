// https://www.codewars.com/kata/51675d17e0c1bed195000001/train/java

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        if (digits.length() <= 5) {
            return Integer.parseInt(digits);
        }
        int largest = Integer.parseInt(digits.substring(0, 5));
        int i = 1;
        do {
            int currentDigit = Integer.parseInt(digits.substring(i, i + 5));
            if (currentDigit > largest ) {
                largest = currentDigit;
            }
            i++;
        } while (i <= digits.length() - 5);
        return largest;
    }
}
