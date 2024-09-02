// https://leetcode.com/problems/verifying-an-alien-dictionary/submissions/1376551731/

class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> alphabetMap = new HashMap<>();
        int i = 0;
        for (Character oneChar : order.toCharArray()) {
            alphabetMap.put(oneChar, i);
            i++;
        }
        for (int j = 0; j < words.length - 1; j++) { //array of words
            for (int k = 0; k < words[j].length(); k++) { // array of char in words step by step
                if (k >= words[j + 1].length()) {
                    return false;
                }
                if (words[j].charAt(k) != words[j + 1].charAt(k) ) {
                    int currentWordChar = alphabetMap.get(words[j].charAt(k));
                    int nextWordChar = alphabetMap.get(words[j + 1].charAt(k));
                    if (currentWordChar > nextWordChar) {
                        return false;
                    } else {
                        break;
                    }
                }
            }
        }
        return true;
    }
}
