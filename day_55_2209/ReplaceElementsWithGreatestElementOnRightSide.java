// https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/1398459106/

class Solution {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        result[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int max = arr[i + 1];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        return result;
    }
}
