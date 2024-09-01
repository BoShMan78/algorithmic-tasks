//https://www.codewars.com/kata/66cdc6ab9e7a9f009e0ca8f6/train/java

public class Snail {
    public static boolean canSnailReachEnd(double length, double speed, double lengthIncreases) {
      if (speed < lengthIncreases) {
            return false;
        }
        double currentPosition = 0;
        int timeInMin = 0;
        final int yearInMin = 525600;
        do {
            currentPosition += speed;
            length += lengthIncreases;
            timeInMin++;
        } while (length > currentPosition && timeInMin < yearInMin);
        if (currentPosition >= length && timeInMin < yearInMin) {
            return true;
        }
        return false;
    }
}
