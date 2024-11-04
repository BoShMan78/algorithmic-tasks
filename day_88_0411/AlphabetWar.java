// https://www.codewars.com/kata/59377c53e66267c8f6000027/train/java

import java.util.HashMap;

public class Kata{
    public static String alphabetWar(String fight){
        HashMap<Character, Integer> leftSide = new HashMap<>();
        HashMap<Character, Integer> rightSide = new HashMap<>();
        leftSide.put('w', 4);
        leftSide.put('p', 3);
        leftSide.put('b', 2);
        leftSide.put('s', 1);

        rightSide.put('m', 4);
        rightSide.put('q', 3);
        rightSide.put('d', 2);
        rightSide.put('z', 1);

        int leftPoint = 0;
        int rightPoint = 0;

        for (Character c : fight.toCharArray()) {
            if (leftSide.containsKey(c)) {
                leftPoint += leftSide.get(c);
            } else if (rightSide.containsKey(c)) {
                rightPoint += rightSide.get(c);
            }
        }
        if (leftPoint > rightPoint) {
            return "Left side wins!";
        } else if (rightPoint > leftPoint) {
            return "Right side wins!";
        }
        return "Let's fight again!";
    }
}
