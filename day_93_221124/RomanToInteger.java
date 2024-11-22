// https://leetcode.com/problems/roman-to-integer/submissions/1459899011/

class Solution {
    public int romanToInt(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        char[] charArray = s.toCharArray();
        int result = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (i < charArray.length - 1 && map.containsKey(String.valueOf(charArray[i]) + String.valueOf(charArray[i + 1]))) {
                result += map.get(String.valueOf(charArray[i]) + String.valueOf(charArray[i + 1]));
                i++;
            } else {
                result += map.get(String.valueOf(charArray[i]));
            }
        }
        return result;
    }
}
