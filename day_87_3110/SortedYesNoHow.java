// https://www.codewars.com/kata/580a4734d6df748060000045/train/java

class Solution {
  
  public static String isSortedAndHow(int[] array) {
        int maximum = array[0];
        boolean wasInterrupted = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < maximum) {
                wasInterrupted = true;
                break;
            } else {
                maximum = array[i];
            }
        }
        if (wasInterrupted == false) {
            return "yes, ascending";
        }
        maximum = array[array.length - 1];
        wasInterrupted = false;
        for (int i = array.length - 2; i >= 0; i--) {
            if (array[i] < maximum) {
                wasInterrupted = true;
                break;
            } else {
                maximum = array[i];
            }
        }
        if (wasInterrupted == false) {
            return "yes, descending";
        }
        return "no";
  } 
}
