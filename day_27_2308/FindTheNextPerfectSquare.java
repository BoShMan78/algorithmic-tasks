// https://www.codewars.com/kata/56269eb78ad2e4ced1000013/train/java

public class NumberFun {
  public static long findNextSquare(long sq) {
    double sqrt = Math.sqrt(sq);
        if (sqrt % 1 == 0) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
  }
}
