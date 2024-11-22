// https://www.codewars.com/kata/5a63948acadebff56f000018/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static long maxProduct(int[] numbers, int sub_size) {
      List<Integer> collect = Arrays.stream(numbers)
                .boxed()
                .sorted(Collections.reverseOrder())
                .limit(sub_size)
                .toList();
        long result = 1;
        for (Integer i : collect) {
            result *= i;
        }
        return result;
    }
}
