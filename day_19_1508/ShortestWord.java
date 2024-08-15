// https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java

import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
       String[] strings = s.split(" ");
        return Arrays.stream(strings)
                .mapToInt(String::length)
                .min()
                .orElseThrow();
    }
}
