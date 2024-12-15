// https://www.codewars.com/kata/5939ab6eed348a945f0007b2/train/java

public class Kata {
  public static String longestWord(String wordString) {
        int length = 0;
        String[] strings = wordString.split(" ");
        String longestWord = null;
        for (String word:strings) {
            if (word.length() >= length) {
                length = word.length();
                longestWord = word;
            }
        }
        return longestWord;
  }
}
