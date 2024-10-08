// https://www.codewars.com/kata/58b8c94b7df3f116eb00005b/train/java

public class Kata {
    public static String reverseLetter(final String str) {
       String cleanString = str.replaceAll("[^a-zA-Z]", "");
        char[] charArray = cleanString.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            builder.append(String.valueOf(charArray[i]));
        }
        return builder.toString();
    }
}
