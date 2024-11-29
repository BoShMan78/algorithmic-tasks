// https://www.codewars.com/kata/52de553ebb55d1fca3000371/train/java

public class Solution {
	public static int findMissing(int[] numbers){
        int difference = (numbers[numbers.length - 1] - numbers[0]) / numbers.length;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1] + difference) {
                return numbers[i - 1] + difference;
            }
        }
        if (difference == 0) {
            return numbers[0];
        }
        return 0; 
	}
}
