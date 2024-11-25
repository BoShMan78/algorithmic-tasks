// https://www.codewars.com/kata/5417423f9e2e6c2f040002ae/train/java

public class Solution{
  public static int[] digitize(int n){
        char[] charArray = String.valueOf(n).toCharArray();
        int[] resultArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            resultArray[i] = Integer.valueOf(String.valueOf(charArray[i]));
        }
        return resultArray;
  }
}
