// https://www.codewars.com/kata/55f2b110f61eb01779000053/train/java

  public class Sum {
     public int GetSum(int a, int b) {
       if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum +=i;
        }
        return sum;
     }
  }
