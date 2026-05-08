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
        int guesNum = guess(n);
        while (guesNum != 0) {
            if (guesNum == 0)
                return n;
            else if (guesNum > -1)
                n = n + 1;
            else
                n = n /2;
            guesNum = guess(n);
        }

        return n;
    }
}