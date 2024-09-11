// https://www.codewars.com/kata/563cf89eb4747c5fb100001b/train/java

public class Remover {
  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length == 0) {
            return numbers;
        }
        int minNumber = numbers[0];
        int minIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
                minIndex = i;
            }
        }
        int[] returnArray = new int[numbers.length - 1];
        System.arraycopy(numbers, 0, returnArray, 0, minIndex);
        System.arraycopy(numbers, minIndex + 1, returnArray, minIndex, numbers.length - minIndex - 1);
        return returnArray;
  }
}
