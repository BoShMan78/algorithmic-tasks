// https://leetcode.com/problems/number-of-1-bits/submissions/1395328008/

class Solution {
    public int hammingWeight(int n) {
        String binaryString = Integer.toBinaryString(n);
        long count = binaryString.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> c != '0')
                .count();
        return (int) count;
    }
}
