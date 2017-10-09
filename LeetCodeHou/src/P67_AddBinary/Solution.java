package P67_AddBinary;

/**
 * Given two binary strings, return their sum (also a binary string).
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 */

public class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length();
        int n2 = b.length();
        String res = "";
        int abit = 0;
        int bbit = 0;
        int carry = 0;
        for (int i = 0; i < Math.max(n1, n2); i++) {
            if (n1 <= i) {
                abit = 0;
            } else {
                abit = Character.getNumericValue(a.charAt(n1 - 1 - i));
            }
            if (n2 <= i) {
                bbit = 0;
            } else {
                bbit = Character.getNumericValue(b.charAt(n2 - 1 - i));
            }
            res = (abit + bbit + carry) % 2 + res;
            carry = (abit + bbit + carry) / 2;
        }
        if (carry > 0) res = "1" + res;
        return res;
    }
//    public String addBinary(String a, String b) {
//        int n1 = a.length();
//        int n2 = b.length();
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < n1; i++) {
//            sum1 = sum1*2 + Character.getNumericValue(a.charAt(i));
//        }
//
//        for (int i = 0; i < n2; i++) {
//            sum2 = sum2 * 2 + Character.getNumericValue(b.charAt(i));
//        }
//
//        return Integer.toBinaryString(sum1 + sum2);
//    }
}
