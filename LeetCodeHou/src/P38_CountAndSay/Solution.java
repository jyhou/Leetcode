package P38_CountAndSay;


/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 
 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * 
 * Given an integer n, generate the nth term of the count-and-say sequence.
 * Note: Each term of the sequence of integers will be represented as a string.
 *
 * Example 1:
 * Input: 1
 * Output: "1"
 * 
 * Example 2:
 * Input: 4
 * Output: "1211"
 * 
 */

public class Solution {
	public String countAndSay(int n) {
		if (n == 1) return "1";
		if (n == 2) return "11";
		
		String res = "11";
		for (int i = 3; i <= n; i++) {
			res = countAndSayStr(res);
		}
		return res;
	}
	
	public String countAndSayStr(String str) {
		String res = "";
		int i = 0;
		int duplicateTimes = 1;
		char duplicateChar = str.charAt(0);
		for (; i < str.length() - 1; i ++) {
			if (str.charAt(i) == str.charAt(i+1)) {
				duplicateChar = str.charAt(i + 1);
				duplicateTimes++;
			} else {
				res = res + duplicateTimes + duplicateChar;
				duplicateTimes = 1;
				duplicateChar = str.charAt(i+1);
			}
		}
		if (i == str.length() - 1) {
			res = res + duplicateTimes + duplicateChar;
		}
		
		return res;
	}

}
