// https://leetcode.com/problems/counting-bits/submissions/1397630959/

class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 0; i <=n ; i++) {
            String binaryString = Integer.toBinaryString(i);
            long count = binaryString.chars()
                    .filter(c -> c == '1')
                    .count();
            result[i] = (int) count;
        }
        return result;
    }
}
