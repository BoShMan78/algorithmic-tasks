// https://leetcode.com/problems/defuse-the-bomb/?envType=daily-question&envId=2024-11-18

class Solution {
        public static int[] decrypt(int[] code, int k) {
        int[] result = new int[code.length];
        int length = code.length;
        for (int i = 0; i < length; i++) {
            if (k == 0) {
                result[i] = 0;
            }
            if (k > 0) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % length];
                }
                result[i] = sum;
            }
            if (k < 0) {
                int sum = 0;
                for (int j = 1; j <= - k; j++) {
                    sum += code[(i - j + length) % length];
                }
                result[i] = sum;
            }
        }
        return result;
    }
}
