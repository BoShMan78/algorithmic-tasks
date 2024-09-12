// https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        if (lines.isEmpty()) {
            return lines;
        }
        List<String> outputLines = new ArrayList<>();

        for (int i = 1; i <= lines.size(); i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(String.valueOf(i)).append(": ").append(lines.get(i - 1));
            outputLines.add(builder.toString());
        }
        return outputLines;
    }
}
