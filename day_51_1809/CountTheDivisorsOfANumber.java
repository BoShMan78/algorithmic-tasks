// https://www.codewars.com/kata/542c0f198e077084c0000c2e/train/java

public class FindDivisor {

  public long numberOfDivisors(int n) {
    int counter = 1;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
      return counter;
  }
}
