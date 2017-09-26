package P66_PlusOne;

import com.sun.org.apache.xml.internal.utils.IntVector;

import java.util.Vector;

/**
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */

public class Solution {
    public int[] plusOne(int[] digits) {
        int[] res =  new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
            }
            res[i + 1] = digits[i];
        }
        res[0] = 1;
        return res;
    }
}
