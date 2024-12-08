// https://www.codewars.com/kata/55960bbb182094bc4800007b/train/java

public class Solution {  
  public static String insertDash(int num) {
        char[] charArray = String.valueOf(num).toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < charArray.length; i++) {
            if (Integer.valueOf(charArray[i - 1]) % 2 != 0 &&
                    Integer.valueOf(charArray[i]) % 2 != 0) {
                builder.append(charArray[i - 1]).append("-");
            } else {
                builder.append(charArray[i - 1]);
            }
        }
        builder.append(charArray[charArray.length - 1]);
        return builder.toString();
  }
}
