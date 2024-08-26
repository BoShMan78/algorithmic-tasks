// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d/train/java

public class Kata {
  public static boolean solution(String str, String ending) {
     if (ending.length() > str.length()) {
            return false;
        }
    String strEnding = str.substring(str.length() - ending.length());
    return strEnding.equals(ending);
  }
}
