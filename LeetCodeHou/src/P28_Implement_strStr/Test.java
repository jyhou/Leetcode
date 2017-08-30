package P28_Implement_strStr;

public class Test {

	public static void main(String[] args) {
		Solution solve = new Solution();
		
		String haystack1 = "abcde";
		String needle1 = "bc";
		String needle2 = "";
		String needle3 = "cde";
		
		System.out.printf("haystack: %s\nneedle: %s\nstrStr = %d\n\n", haystack1, needle1, solve.strStr(haystack1, needle1));
		System.out.printf("haystack: %s\nneedle: %s\nstrStr = %d\n\n", haystack1, needle2, solve.strStr(haystack1, needle2));
		System.out.printf("haystack: %s\nneedle: %s\nstrStr = %d\n\n", haystack1, needle3, solve.strStr(haystack1, needle3));
	}

}
