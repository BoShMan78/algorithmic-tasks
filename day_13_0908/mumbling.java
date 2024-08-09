// https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java

public class Accumul {
    
    public static String accum(String s) {
        char[] charArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(charArray[0]).toUpperCase());
        for (int i = 1; i < charArray.length; i++) {
            stringBuilder.append("-").append(String.valueOf(charArray[i]).toUpperCase());
            for (int j = 0; j < i; j++) {
                stringBuilder.append(String.valueOf(charArray[i]).toLowerCase());
            }
        }
        return stringBuilder.toString();
    }
}
