// https://leetcode.com/problems/find-the-difference/submissions/1373173009/

class Solution {
    public char findTheDifference(String s, String t) {
        List<String> charListT = t.chars()
                .mapToObj(c -> (char) c)
                .map(c -> c.toString())
                .collect(Collectors.toList());
        for (char oneTchar : s.toCharArray()) {
            String oneCharString = String.valueOf(oneTchar);
            charListT.remove(oneCharString);
        }
        char[] charArray = charListT.get(0).toCharArray();
        return charArray[0];
    }
}
