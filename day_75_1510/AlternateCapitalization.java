// https://www.codewars.com/kata/59cfc000aeb2844d16000075/train/java

class Solution{
    public static String[] capitalize(String s){
      char[] charArray = s.toCharArray();
      StringBuilder builder1 = new StringBuilder();
      StringBuilder builder2 = new StringBuilder();
      for (int i = 0; i < charArray.length; i++) {
            if (i % 2 == 0) {
                builder1.append(String.valueOf(charArray[i]).toUpperCase());
                builder2.append(String.valueOf(charArray[i]));
            } else {
                builder1.append(String.valueOf(charArray[i]));
                builder2.append(String.valueOf(charArray[i]).toUpperCase());
            }
      }
      return new String[]{builder1.toString(), builder2.toString()};
    }
}
