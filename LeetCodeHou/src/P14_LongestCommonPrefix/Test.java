package P14_LongestCommonPrefix;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Solution solve = new Solution();
		
		String str1 = "abcdefg";
		String str2 = "abcde";
		String str3 = "abcfged";
		String str4 = "a";
		String str5 = "";
		
		String[] strs1 = {str1, str2, str3};
		String[] strs2 = {str2, str3, str4, str5};
		String[] strs3 = {str5};
		
		System.out.printf("Input string array %s,\n longest common prefix: %s\n\n", Arrays.toString(strs1), solve.LongestCommonPrefix(strs1));
		System.out.printf("Input string array %s,\n longest common prefix: %s\n\n", Arrays.toString(strs2), solve.LongestCommonPrefix(strs2));
		System.out.printf("Input string array %s,\n longest common prefix: %s\n\n", Arrays.toString(strs3), solve.LongestCommonPrefix(strs3));
	}

}
