// https://leetcode.com/problems/greatest-common-divisor-of-strings/submissions/1390867808/

class Solution {
    public String gcdOfStrings(String str1, String str2) {
         StringBuilder builder = new StringBuilder(str2);
        String gcdString = "";
        while (builder.length() > 0 && gcdString.length() == 0) {
            boolean gcdString1 = isGcdString(str1, builder.toString());
            boolean gcdString2 = isGcdString(str2, builder.toString());
            if (gcdString1 && gcdString2) {
                return builder.toString();
            }
            builder = builder.deleteCharAt(builder.length() - 1);
        }
        return "";
    }

    private boolean isGcdString(String fullString, String dividerString) {
        StringBuilder builder = new StringBuilder(dividerString);
        while (builder.length() <= fullString.length()) {
            if (builder.toString().equals(fullString)) {
                return true;
            }
            builder.append(dividerString);
        }
        return false;
    }
}
