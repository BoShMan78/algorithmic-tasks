// https://leetcode.com/problems/merge-strings-alternately/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        int i = 0;
        int j = 0;
        StringBuilder builder = new StringBuilder();
        while (i < charArray1.length && j < charArray2.length) {
            builder.append(String.valueOf(charArray1[i])).append(String.valueOf(charArray2[j]));
            i++;
            j++;
        }
        if (i < charArray1.length) {
            builder.append(word1.substring(i));
        }
        if (j < charArray2.length) {
            builder.append(word2.substring(j));
        }
        return builder.toString();
    }
}
