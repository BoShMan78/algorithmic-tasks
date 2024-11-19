// https://www.codewars.com/kata/671bd5419ea261fbb8d0a0ca/train/java

public class ForemanPig{
  public static String decipher(String[] code){
      int codeLength = code.length;
        int oneStringLength = code[0].length();
        StringBuilder builder = new StringBuilder();
        if (codeLength == 1) {
            return code[0];
        }
        for (int i = 0; i < oneStringLength; i++) {
            int sum = 0;
            for (int j = 0; j < codeLength; j++) {
                char ch = code[j].charAt(i);
                if (ch == ' ') {
                    sum += 0;
                } else {
                    sum += (ch - 'a' + 1);
                }
            }
            int average = sum / codeLength;
            if (average == 0) {
                builder.append(" ");
            } else {
                builder.append((char) ('a' + average - 1));
            }
        }
        return builder.toString();
    }
}
