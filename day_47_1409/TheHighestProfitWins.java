// https://www.codewars.com/kata/559590633066759614000063/train/java

import java.util.Arrays;

class MinMax {
    public static int[] minMax(int[] arr) {
      if (arr.length == 1) {
            return new int[]{arr[0], arr[0]};
        }
        int[] sortedArr = Arrays.stream(arr)
                .sorted()
                .toArray();
        return new int[]{sortedArr[0], sortedArr[sortedArr.length - 1]};
    }
}
