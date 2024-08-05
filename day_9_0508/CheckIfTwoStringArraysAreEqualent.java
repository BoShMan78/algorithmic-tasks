// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/submissions/1345373521/

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        return arrayToString(word1).equals(arrayToString(word2));
    }

     public String arrayToString(String[] strings) {
        return Arrays.stream(strings)
                .collect(Collectors.joining());
    }
}
