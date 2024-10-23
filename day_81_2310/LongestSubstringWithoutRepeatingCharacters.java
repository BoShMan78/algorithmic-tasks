// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int comparatorInt = 0;
                if (o1.length() > o2.length()) {
                    comparatorInt = -1;
                }
                if (o1.length() < o2.length()) {
                    comparatorInt = 1;
                }
                return comparatorInt;
            }
        };
        List<String> substringList = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        builder.append(s.substring(0, 1));
        for (int i = 1; i < s.length(); i++) {
            String substring = s.substring(i, i + 1);
            if (!builder.toString().contains(substring)) {
                builder.append(substring);
            } else {
                substringList.add(builder.toString());
                builder = new StringBuilder().append(substring);
            }
        }
        substringList.add(builder.toString());
        String s1 = substringList.stream()
                .sorted(comparator)
                .findFirst()
                .get();
        return s1.length();
    }
}
