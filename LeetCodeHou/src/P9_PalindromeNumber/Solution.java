package P9_PalindromeNumber;
/**
 * Determine whether an integer is a palindrome. Do this without extra space.
*/
//public class Solution {
//	public boolean isPalindrome(int x) {
//		if (x < 0) return false;
//		if (x == 0) return true;
//		for (int i = 0; i < Math.floor(Math.log10(x)) + 1; i++) {
//			if (!((x / (int) Math.pow(10, i)) % 10 == (x / (int) Math.pow(10, Math.floor(Math.log10(x)) - i)) % 10)) {
//				return false;
//			}
//		}
//		return true;
//	}
//}

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		int y = 0;
		int x0 = x;
		while (x >= 10) {
			y = y * 10 + x % 10;
			x = x / 10;
		}
		
		return y == x0 / 10 && x0 % 10 == x;
	}
}
