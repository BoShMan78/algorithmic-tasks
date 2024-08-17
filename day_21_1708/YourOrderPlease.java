// https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

public class Order {
  public static String order(String words) {
    if (words.isEmpty()) {
            return "";
        }
    String[] strings = words.split(" ");
        String[] changedOrderWords = new String[strings.length];
        for (String word : strings) {
            String digit = word.replaceAll("\\D", "");
            changedOrderWords[Integer.parseInt(digit) - 1] = word;
        }
        return String.join(" ", changedOrderWords);
  }
}
