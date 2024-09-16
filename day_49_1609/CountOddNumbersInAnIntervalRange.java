// https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/submissions/1391871217/

class Solution {
    public int countOdds(int low, int high) {
        int subtraction = high - low;
        int counter = 0;
        if ((low % 2 == 0 && high % 2 != 0) || (low % 2 != 0 && high % 2 == 0) || (low % 2 != 0 && high % 2 != 0)) {
            counter = subtraction / 2 + 1;
        }
        if (low % 2 == 0 && high % 2 == 0) {
            counter = subtraction / 2;
        }
        return counter;
    }
}
