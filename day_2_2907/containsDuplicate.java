// https://leetcode.com/problems/contains-duplicate/

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numsHashSet = new HashSet<>();
        for (int num : nums) {
            if (!numsHashSet.add(num)) {
                return true;
            }
        }
        return false;
    }
}
