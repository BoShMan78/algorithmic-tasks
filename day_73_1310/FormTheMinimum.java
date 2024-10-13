// https://www.codewars.com/kata/5ac6932b2f317b96980000ca/train/java

import java.util.TreeSet;

public class Minimum{

	public static int minValue(int[] values){
    TreeSet<Integer> integerTreeSet = new TreeSet<>();
    for (int v : values) {
        integerTreeSet.add(v);
    }
    StringBuilder builder = new StringBuilder();
    for (Integer i : integerTreeSet) {
        builder.append(i);
    }
    return Integer.parseInt(builder.toString());
	}
}
