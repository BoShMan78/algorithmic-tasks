// https://leetcode.com/problems/excel-sheet-column-title/submissions/1388816778/

class Solution {
    public String convertToTitle(int columnNumber) {
         HashMap<Integer, Character> mapNumberChar = new HashMap<>();
        Integer j = 0;
        for (char i = 'A'; i <='Z'; i++) {
            mapNumberChar.put(j, i);
            j++;
        }
        StringBuilder builder = new StringBuilder();
        int numberOfChar;
        do {
            numberOfChar = (columnNumber - 1) % 26;
            builder.append(mapNumberChar.get(numberOfChar));
            columnNumber = (columnNumber - 1) / 26;
        } while (columnNumber > 0);
        return builder.reverse().toString();
    }
}
