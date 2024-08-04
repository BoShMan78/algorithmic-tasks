// https://leetcode.com/problems/backspace-string-compare/description/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        return editString(s).equals(editString(t));
    }

     public String editString(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char oneChar : inputString.toCharArray()) {
            if (oneChar == '#') {
                if (stringBuilder.length() > 0) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
            } else {
                stringBuilder.append(oneChar);
            }
        }
        return stringBuilder.toString();
    }
}
