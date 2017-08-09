package P7_ReverseInteger;

/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 */

public class Solution {
    public int reverse(int x) {
        if (x == 0) return 0;
        final long limit = Integer.MAX_VALUE;
        long x_abs = Math.abs((long)x);
        long reverse = reverseAbs(x_abs, 0);
        if (x > 0 && reverse <= limit) {
            return (int) reverse;
        } else if (x < 0 && reverse <= limit + 1){
            reverse = - reverse;
        	return (int) reverse;
        } else {
        	return 0;
        }

    }
    
    public long reverseAbs(long x_abs, long res) {
        if (x_abs < 10) return res*10 + x_abs;
        res = res*10 + x_abs%10;
        return reverseAbs(x_abs/10, res);
    }
}