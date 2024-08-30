// https://www.codewars.com/kata/56606694ec01347ce800001b/train/java

class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
     if (a + b <= c || a + c <= b || b + c <= a || a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        return true;
  }
}
