// https://www.codewars.com/kata/578553c3a1b8d5c40300037c/train/java

import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
       StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : binary) {
            stringBuilder.append(integer);
        }
        return Integer.parseInt(stringBuilder.toString(), 2);
    }
}
