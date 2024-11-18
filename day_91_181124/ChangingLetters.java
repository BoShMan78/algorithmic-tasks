// https://www.codewars.com/kata/5831c204a31721e2ae000294/train/java

public class Kata {
    public static String swap(String st) {
        char[] charArray = st.toCharArray();
        String vowels = "aeiou";
        for (int i = 0; i < charArray.length; i++) {
            if (vowels.contains(String.valueOf(charArray[i]))) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
}
