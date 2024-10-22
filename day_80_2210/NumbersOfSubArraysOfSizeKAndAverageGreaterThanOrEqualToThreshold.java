// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/submissions/1430294124/

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int counter = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            if ((double) sum / k >= threshold) {
                counter++;
            }
        }
        return counter;
    }
}
