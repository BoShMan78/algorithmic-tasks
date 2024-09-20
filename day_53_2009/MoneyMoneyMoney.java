// https://www.codewars.com/kata/563f037412e5ada593000114/train/csharp

using System;

public class Kata
{
  public static int CalculateYears(double principal, double interest,  double tax, double desiredPrincipal){
      int counter = 0;
      while (principal < desiredPrincipal) {
            double earnedCurrentYear = principal * interest * (1 - tax);
            principal += earnedCurrentYear;
            counter++;
      }
      return counter;
  }
}
