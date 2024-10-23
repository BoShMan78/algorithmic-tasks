// https://www.codewars.com/kata/5b39e3772ae7545f650000fc/train/java

class Solution{
    public static String removeDuplicateWords(String s){
      String[] strings = s.split(" ");
      StringBuilder builder = new StringBuilder(strings[0]);
      for (int i = 1; i < strings.length; i++) {
            if (!builder.toString().contains(strings[i])) {
                builder.append(" ").append(strings[i]);
            }
      }
      return builder.toString();
    }
}
