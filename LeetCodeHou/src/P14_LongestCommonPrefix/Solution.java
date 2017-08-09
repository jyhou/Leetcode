package P14_LongestCommonPrefix;

import java.util.Arrays;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 */
public class Solution {
	
	public String LongestCommonPrefix(String[] strs) {
		
//		if (strs.length < 1) return "";
//		String prefix = strs[0];
//		String res = "";
//		if (strs.length < 2) return prefix;
//		int indx = 0;
//		int tempLength;
//		for (int i = 1; i < strs.length; i++) {
//			tempLength = Math.min(prefix.length(), strs[i].length());
//			for (int j = 0; j < tempLength; j++) {
//				if (prefix.charAt(j) == strs[i].charAt(j)) {
//					res = res + prefix.charAt(j);
//				} else {
//					break;
//				}
//			}
//			prefix = res;
//			res = "";
//		}
/////////////////////////////////////////////////////////////////////////
		
		if (strs == null || strs.length < 1) return "";
		if (strs.length < 2) return strs[0];
		Arrays.sort(strs);
		String prefix = "";
		
		for (int i = 0; i < Math.min(strs[0].length(), strs[strs.length - 1].length()); i++) {
			if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
				prefix = prefix + strs[0].charAt(i);
			} else {
				break;
			}
		}
		
		return prefix;
	}
}
