// https://leetcode.com/problems/find-the-town-judge/

class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCounts = new int[n + 1];
        for (int[] t : trust) {
            trustCounts[t[0]]--;
            trustCounts[t[1]]++;
        }
        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}
