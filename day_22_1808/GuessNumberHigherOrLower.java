// https://leetcode.com/problems/guess-number-higher-or-lower/submissions/1360093972/

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int leftIndex = 1;
        int rightIndex = n;
        int num;
        num = (rightIndex - leftIndex) / 2;
        do {
            if (guess(num) == 0) {
                return num;
            }
            if (guess(num) > 0) {
                leftIndex = num + 1;
                num = (rightIndex - leftIndex) / 2 + leftIndex;
            }
            if (guess(num) < 0) {
                rightIndex = num - 1;
                num = (rightIndex - leftIndex) / 2;
            }
        } while (guess(num) != 0 );
        return num;
    }
}
