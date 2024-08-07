// https://www.codewars.com/kata/56747fd5cb988479af000028/solutions/java

class Kata {
  public static String getMiddle(String word) {
     char[] charArray = word.toCharArray();
        String result;
        if (charArray.length % 2 == 0) {
            result = String.valueOf(charArray[charArray.length / 2 - 1]) + String.valueOf(charArray[charArray.length / 2]);
        } else {
            result = String.valueOf(charArray[charArray.length / 2]);
        }
        return result;
  }
}
