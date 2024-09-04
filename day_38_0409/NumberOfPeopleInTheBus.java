// https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java

import java.util.ArrayList;

class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    int numberOfPeople = 0;
        for (var oneStop : stops) {
            numberOfPeople += oneStop[0];
            numberOfPeople -= oneStop[1];
        }
        return numberOfPeople;
  }
}
