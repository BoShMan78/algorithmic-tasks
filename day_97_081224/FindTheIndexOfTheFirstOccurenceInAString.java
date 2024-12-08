// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/submissions/1473461867/

class Solution {
    public int strStr(String haystack, String needle) {
        int length = needle.length();
        for (int i = 0; i <= haystack.length() - length; i++) {
            String substring = haystack.substring(i, i + length);
            if (substring.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
