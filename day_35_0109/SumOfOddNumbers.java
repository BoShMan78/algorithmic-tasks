// https://www.codewars.com/kata/55fd2d567d94ac3bc9000064/train/java

class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
       int startNumberInRow = n * (n - 1) + 1;
        int currentNumber = startNumberInRow;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += currentNumber;
            currentNumber += 2;
        }
        return sum;
    }
}
