// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/submissions/1387418195/

class Solution {
    public int maxDepth(String s) {
        char[] charArray = s.toCharArray();
        int maxLength = 0;
        int length = 0;
        for (char c : charArray) {
            if (c == '(') {
                length++;
                if (maxLength < length) {
                    maxLength = length;
                }
            }
            if (c == ')') {
                length--;
            }
        }
        return maxLength;        
    }
}
