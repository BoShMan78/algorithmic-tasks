// https://www.codewars.com/kata/57f609022f4d534f05000024/train/java

class Solution {
  static int stray(int[] numbers) {
    for (int i = 2; i < numbers.length; i++) {
        if (numbers[i - 2] != numbers[i - 1] && numbers[i] == numbers[i - 1]) {
            return numbers[i - 2];
        }
        if (numbers[i - 2] == numbers[i - 1] && numbers[i] != numbers[i - 1]) {
            return numbers[i];
        }
        if (numbers[i - 2] != numbers[i - 1] && numbers[i] == numbers[i - 2]) {
            return numbers[i - 1];
        }
    }
    return 0;
  }
}
