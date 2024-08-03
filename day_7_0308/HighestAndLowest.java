// https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java

import java.util.Arrays;
import java.util.List;

public class Kata {
  public static String highAndLow(String numbers) {
    String[] numberArray = numbers.split(" ");
    StringBuilder stringBuilder = new StringBuilder();
    List<Integer> sortedIntList = Arrays.stream(numberArray)
                .map(Integer::valueOf)
                .sorted()
                .toList();
    stringBuilder.append(String.valueOf(sortedIntList.get(sortedIntList.size() - 1)))
                .append(" ")
                .append(sortedIntList.get(0));
    return stringBuilder.toString();
