// https://www.codewars.com/kata/577bd8d4ae2807c64b00045b/train/java

public class Kata {
  public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
     if (firstAttacker.equals(fighter2.name)) {
            Fighter temp = fighter1;
            fighter1 = fighter2;
            fighter2 = temp;
        }
        do {
            oneHit(fighter1,fighter2);
            if (fighter2.health > 0) {
                oneHit(fighter2, fighter1);
            } else {
                return fighter1.name;
            }
            if (fighter1.health <= 0) {
                return fighter2.name;
            }
        } while (true);
  }
  
  private static void oneHit(Fighter fighterKick, Fighter fighterReceived) {
        fighterReceived.health -= fighterKick.damagePerAttack;
    }
}
