// https://leetcode.com/problems/merge-sorted-array/submissions/1420838684/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int[] firstArray = Arrays.copyOfRange(nums1, 0, m);
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < firstArray.length && j < nums2.length) {
            if (firstArray[i] < nums2[j]) {
                nums1[k] = firstArray[i];
                i++;
            } else {
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < firstArray.length) {
            nums1[k] = firstArray[i];
            i++;
            k++;
        }
        while (j < nums2.length) {
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}
