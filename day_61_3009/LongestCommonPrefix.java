// https://leetcode.com/problems/longest-common-prefix/submissions/1407076634/

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = 0; j < strs[0].length(); j++) {
            stringBuilder.append(strs[0].substring(j, j + 1));
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() < stringBuilder.length() || !strs[i].substring(0, j + 1).equals(stringBuilder.toString())) {
                    return stringBuilder.toString().substring(0, j);
                }
            }
        }
        return stringBuilder.toString();
    }
}
