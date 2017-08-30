package P28_Implement_strStr;


/**
 * 
 * Implement strStr().
 * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 */

public class Solution {
	public int strStr(String haystack, String needle) {
		if (needle == null) return 0;
		int nlen = needle.length();
		int hlen = haystack.length();
		if (hlen < nlen) return -1;
		boolean charEqual = true;
		
		for (int i = 0; i < hlen - nlen + 1; i++) {
//			if (needle.equals(haystack.substring(i, i + nlen))) return i;
			charEqual = true;
			for (int j = 0; j < nlen; j++) {
				if (needle.charAt(j) != haystack.charAt(i + j)) {
					charEqual = false;
					break;
				}
			}
			if (charEqual == true) return i;
		}
		
		return -1;
		
	}
}
