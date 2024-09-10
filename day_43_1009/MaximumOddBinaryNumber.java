// https://leetcode.com/problems/maximum-odd-binary-number/

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] charArray = s.toCharArray();
        int counterOne = 0;
        for (char c : charArray) {
            if (c == '1') {
                counterOne++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {
            if (i < counterOne - 1) {
                builder.append("1");
            } else {
                builder.append("0");
            }
        }
        builder.append("1");
        return builder.toString();
    }
}
