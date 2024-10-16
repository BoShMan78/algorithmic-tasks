// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/submissions/1424054229/

class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDif = nums[k - 1] - nums[0];
        int startIndexMinDif = 0;
        for (int i = 1; i <= nums.length - k; i++) {
            int currentDif = nums[i + k - 1] - nums[i];
            if (currentDif < minDif) {
                minDif = currentDif;
            }    
        }
        return minDif;
    }
}
