// https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import java.util.ArrayList;
import java.util.List;

public class Kata {
  public static boolean isAnagram(String a, String b) {
        char[] charArray = a.toLowerCase().toCharArray();
        List<Character> list = b.toLowerCase().chars()
                .mapToObj(i -> (char) i)
                .toList();
        List<Character> listB = new ArrayList<>(list);
        for (char c: charArray) {
            if (!listB.remove((Character) c)) {
                return false;
            }
        }
        return listB.isEmpty();
  }
}
