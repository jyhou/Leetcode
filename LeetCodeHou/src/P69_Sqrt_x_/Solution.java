package P69_Sqrt_x_;

/**
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 *
 */

public class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int i = x/2;
        int j = 0;
        int k = (i + j) / 2 + 1;
        while (i != k && j != k) {
            if (k <= x/k) {
                j = k;
                k = (i + j) / 2;
            } else {
                i = k;
                k = (i + j) / 2;
            }
        }
        return k;
    }
}
