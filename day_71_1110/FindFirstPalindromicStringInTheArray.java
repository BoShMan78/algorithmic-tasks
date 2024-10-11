// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/submissions/1418932884/

class Solution {
    public String firstPalindrome(String[] words) {
         for (String word : words) {
            char[] charArray = word.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (int i = charArray.length - 1; i >= 0; i--) {
                builder.append(charArray[i]);
            }
            if (builder.toString().equals(word)) {
                return word;
            }
        }
        return "";
    }
}
