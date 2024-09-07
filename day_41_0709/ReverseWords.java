// https://www.codewars.com/kata/5259b20d6021e9e14c0010d4/train/java

public class Kata
{
  public static String reverseWords(final String original){
    String[] strings = original.split(" ");
    if (original.length() > 0 && strings.length == 0) {
        return original;
    }
    StringBuilder builder = new StringBuilder();
    for (String string : strings) {
        char[] charArray = string.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            builder.append(charArray[i]);
        }
        builder.append(" ");
    }
    return builder.toString().trim();
  }
}
