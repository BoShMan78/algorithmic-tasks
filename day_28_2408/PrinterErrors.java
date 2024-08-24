// https://www.codewars.com/kata/56541980fa08ab47a0000040/train/java

public class Printer {
    
    public static String printerError(String s) {
      StringBuilder stringBuilder = new StringBuilder();
        long count = s.chars()
                .filter(c -> c > 'm')
                .count();
        stringBuilder.append(count).append('/').append(s.toCharArray().length);
        return stringBuilder.toString();
    }
}
