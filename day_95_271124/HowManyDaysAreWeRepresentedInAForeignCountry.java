// https://www.codewars.com/kata/58e93b4706db4d24ee000096/train/java

import java.util.Arrays;

public class Representation {
	public static int daysRepresented (int [][] trips){
        int[] dates = new int[365];
        for (int i = 0; i < trips.length; i++) {
            for (int j = trips[i][0]; j <= trips[i][1]; j++) {
                dates[j] = 1;
            }
        }
        long count = Arrays.stream(dates)
                .filter(d -> d == 1)
                .count();
        return (int) count;
  }
}
