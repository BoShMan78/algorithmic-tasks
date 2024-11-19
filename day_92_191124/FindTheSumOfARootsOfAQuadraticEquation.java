// https://www.codewars.com/kata/57d448c6ba30875437000138/train/java

import java.util.OptionalDouble; 

public class Solution{
  public static OptionalDouble roots(double a, double  b, double c){
    double discremenant = Math.pow(b, 2) - 4 * a * c;
        if (discremenant >= 0) {
            double x1 = (- b + Math.sqrt(discremenant)) / (2 * a);
            double x2 = (- b - Math.sqrt(discremenant)) / (2 * a);
            return OptionalDouble.of(x1 + x2);
        }
        return OptionalDouble.empty();
  }
}
