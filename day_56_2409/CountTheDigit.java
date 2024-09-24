// https://www.codewars.com/kata/566fc12495810954b1000030/train/java

public class CountDig {
    
    public static int nbDig(int n, int d) {
      int counter = 0;
      for (int i = 0; i <= n; i++) {
          int number = i * i;
          char[] charArray = String.valueOf(number).toCharArray();
          for (char c : charArray) {
              if (String.valueOf(c).equals(String.valueOf(d))) {
                  counter++;
              }
          }
        }
        return counter;
    }
}
