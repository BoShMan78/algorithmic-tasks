// https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String collect = String.valueOf(num).chars()
                .mapToObj(i -> (char) i)
                .map(c -> Integer.parseInt(c.toString()))
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .collect(Collectors.joining());
        return Integer.parseInt(collect);
  }
}
