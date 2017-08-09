package P13_RomanToInteger;

import java.util.Arrays;

/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 */

public class Solution {
	public int romanToInt(String s) {
		char c;
		int res = 0;
		int[] romanNum = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			switch (c) {
			case 'I': romanNum[i] = 1; continue;
			case 'V': romanNum[i] = 5; continue;
			case 'X': romanNum[i] = 10; continue;
			case 'L': romanNum[i] = 50; continue;
			case 'C': romanNum[i] = 100; continue;
			case 'D': romanNum[i] = 500; continue;
			case 'M': romanNum[i] = 1000; continue;
			}
		}
		int i = 0;
		for (; i < romanNum.length - 1; i++) {
			if (romanNum[i+1] > romanNum[i]) {
				res = res - romanNum[i] + romanNum[i+1];
				i++;
			} else {
				res = res + romanNum[i];
			}
		}
		if (i == romanNum.length - 1) {
			res = res + romanNum[romanNum.length - 1];
		}
//		System.out.println(Arrays.toString(romanNum));
		return res;
	}
}
