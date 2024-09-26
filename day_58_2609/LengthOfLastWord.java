// https://leetcode.com/problems/length-of-last-word/submissions/1402851937/

class Solution {
    public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        return strings[strings.length - 1].length();
    }
}
