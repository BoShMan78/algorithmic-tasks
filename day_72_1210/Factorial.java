// https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc/train/java

public class Factorial {

  public int factorial(int n) {
    if (n < 0 || n > 12) {
        throw new IllegalArgumentException(
                "Input argument should be equal or more than 0 and equal or less than 12");
    }
    if (n == 0) {
        return 1;
    }
    int factorial = 1;
    for (int i = 1; i <= n ; i++) {
        factorial *= i;
    }
    return factorial;
  }
}
