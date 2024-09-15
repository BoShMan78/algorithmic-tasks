// https://www.codewars.com/kata/5813d19765d81c592200001a/train/java

public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int counter = 0;
    for (int i = start; i <= end; i++) {
        if (!String.valueOf(i).contains("5")) {
            counter++;
        }
    }
    return counter;
  }
}
