// https://www.codewars.com/kata/526c7363236867513f0005ca/train/java

public class LeapYears {

  public static boolean isLeapYear(int year) {
    if (year % 4 == 0 && year % 100 != 0) {
          return true;
    }
    if (year % 400 == 0) {
          return true;
    }
    return false;
  }
}
