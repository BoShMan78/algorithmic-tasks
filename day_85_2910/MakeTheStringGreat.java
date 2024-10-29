// https://leetcode.com/problems/make-the-string-great/submissions/1437097850/

class Solution {
    public String makeGood(String s) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            int len = builder.length();
            if (len > 0 && Math.abs(builder.charAt(len - 1) - c) == 32) {
                builder.deleteCharAt(len - 1);
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
