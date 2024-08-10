// https://www.codewars.com/kata/54c27a33fb7da0db0100040e/train/java

public class Square {    
    public static boolean isSquare(int n) { 
      double sqrt = Math.sqrt(n);
      return sqrt * 10 % 10 == 0;
    }
}
