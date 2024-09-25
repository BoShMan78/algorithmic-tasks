// https://leetcode.com/problems/is-subsequence/submissions/1401715950/

class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }
        Queue<Character> characterQueue = new ArrayDeque<>(s.chars()
                .mapToObj(i -> (char) i)
                .toList()) {
        };
        char[] charArray = t.toCharArray();
        for (char c : charArray) {
            if (characterQueue.peek() == c) {
                characterQueue.poll();
            }
            if (characterQueue.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
