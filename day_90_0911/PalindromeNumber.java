// https://leetcode.com/problems/palindrome-number/submissions/1447554550/

class Solution {
    public boolean isPalindrome(int x) {
        char[] charArrayX = String.valueOf(x).toCharArray();
        for (int i = 0; i <= charArrayX.length / 2; i++) {
            if (charArrayX[i] != charArrayX[charArrayX.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
