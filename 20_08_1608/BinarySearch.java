// https://leetcode.com/problems/binary-search/submissions/1357760770/

class Solution {
    public int search(int[] nums, int target) {
         int leftIndex = 0;
        int rightIndex = nums.length - 1;
        while(leftIndex <= rightIndex) {
            int mid = leftIndex + (rightIndex - leftIndex) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                rightIndex = mid - 1;
            } else {
                leftIndex = mid + 1;
            }
        }
        return -1;
    }
}
