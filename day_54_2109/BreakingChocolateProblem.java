// https://www.codewars.com/kata/534ea96ebb17181947000ada/train/csharp

public class Kata 
{
  public static int BreakChocolate(int n, int m) {
    if (n < 1 || m < 1) {
        return 0;
    }
    return (n * m - 1);
  }
}
