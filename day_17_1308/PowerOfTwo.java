// https://leetcode.com/problems/power-of-two/submissions/1354334917/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n > 1 && n % 2 != 0) {
            return false;
        }
        int x = 0;
        double result;
        do {
            result = Math.pow(2, x);
            if (result % 1 == 0 && (int) result == n) {
                return true;
            }
            x++;
        } while (result < n);
        return false;
    }
}
