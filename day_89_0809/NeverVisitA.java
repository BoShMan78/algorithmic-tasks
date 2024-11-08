// https://www.codewars.com/kata/56c5847f27be2c3db20009c3/train/java

import java.util.HashMap;

public class Kata {
  public static String subtractSum (int n) {
        String[] fruits = {
                "kiwi", "pear", "kiwi", "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple",
                "cucumber", "pineapple", "cucumber", "orange", "grape", "orange", "grape", "apple", "grape", "cherry",
                "pear", "cherry", "pear", "kiwi", "banana", "kiwi", "apple", "melon", "banana", "melon", "pineapple",
                "melon", "pineapple", "cucumber", "orange", "apple", "orange", "grape", "orange", "grape", "cherry",
                "pear", "cherry", "pear", "apple", "pear", "kiwi", "banana", "kiwi", "banana", "melon", "pineapple",
                "melon", "apple", "cucumber", "pineapple", "cucumber", "orange", "cucumber", "orange", "grape", "cherry",
                "apple", "cherry", "pear", "cherry", "pear", "kiwi", "pear", "kiwi", "banana", "apple", "banana",
                "melon", "pineapple", "melon", "pineapple", "cucumber", "pineapple", "cucumber", "apple", "grape",
                "orange", "grape", "cherry", "grape", "cherry", "pear", "cherry", "apple", "kiwi", "banana", "kiwi",
                "banana", "melon", "banana", "melon", "pineapple", "apple", "pineapple"
        };
        HashMap<Integer, String> fruitMap = new HashMap<>();
        for (int i = 1; i <= fruits.length; i++) {
            fruitMap.put(i, fruits[i - 1]);
        }
        String nString = String.valueOf(n);
        do {
            int sum = 0;
            for (Character c : nString.toCharArray()) {
                sum += Integer.valueOf(String.valueOf(c));
            }
            n = n - sum;
            nString = String.valueOf(n);
        } while (n > fruits.length);
        return fruitMap.get(n);
  }
}
