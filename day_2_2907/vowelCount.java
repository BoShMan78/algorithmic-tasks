// https://www.codewars.com/kata/54ff3102c1bad923760001f3/java

public class Vowels {

  public static int getCount(String str) {
    String vowelsString = "aeiou";
    char[] strCharArray = str.toCharArray();
    int counter = 0;
    for (char oneChar : strCharArray) {
        if (vowelsString.contains(String.valueOf(oneChar))) {
            counter++;
        }
    }
    return counter;
  }
}
