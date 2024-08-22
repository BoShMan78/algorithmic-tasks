// https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {
    
    public static String longest (String s1, String s2) {HashSet<Character> characterHashSet = new HashSet<>();
        characterHashSet.addAll(stringToCharList(s1));
        characterHashSet.addAll(stringToCharList(s2));
        return characterHashSet.stream()
                .map(String::valueOf)
                .sorted()
                .collect(Collectors.joining());
    }

    public static List<Character> stringToCharList(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }
}
