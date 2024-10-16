// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/train/java

import java.util.Arrays;

public class Kata {

	public static int[] flattenAndSort(int[][] array) {		
		    int totalLength = 0;
        for (int[] subArray : array) {
            totalLength += subArray.length;
        }
        int[] result = new int[totalLength];
        int k = 0;
        for (int[] subArray : array) {
            for (int num : subArray) {
                result[k] = num;
                k++;
            }
        }
        Arrays.sort(result);
        return result;
	}
}
