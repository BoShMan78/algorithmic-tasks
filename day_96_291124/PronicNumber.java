// https://www.codewars.com/kata/55b1e5c4cbe09e46b3000034/train/java

public class Pronic {

	public static boolean isPronic(int n) {
        int mult = 0;
        for (int i = 0; mult <= n; i++) {
            mult = i * (i + 1);
            if (mult == n) {
                return true;
            }
        }
        return false;
	}
}
