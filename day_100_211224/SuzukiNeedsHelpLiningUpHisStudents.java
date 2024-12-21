// https://www.codewars.com/kata/5701800886306a876a001031/train/java

import java.util.Arrays;

public class Kata {
  public static String[] lineupStudents(String students) {     
      String[] s = Arrays.stream(students.split(" "))
                .sorted((a, b) -> {
                    int lengthComparator = Integer.compare(b.length(), a.length());
                    return lengthComparator == 0 ? b.compareTo(a) : lengthComparator;
                })
                .toArray(String[]::new);
        return s;
    }
}
