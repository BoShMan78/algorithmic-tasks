// https://www.codewars.com/kata/57fafd0ed80daac48800019f/train/java

public class Kata {
   public static String remove(String s) {
        char[] charArray = s.toCharArray();
        int counter = 0;
        StringBuilder builder = new StringBuilder();
        for (char c : charArray) {
            if (c != '!') {
                builder.append(c);
            } else {
                counter++;
            }
        }
        for (int i = 0; i < counter; i++) {
            builder.append('!');
        }
        return builder.toString();
   }
}
