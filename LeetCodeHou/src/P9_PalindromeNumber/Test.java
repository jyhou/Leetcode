package P9_PalindromeNumber;

public class Test {

	public static void main(String[] args) {
		Solution solve = new Solution();
		
		int x1 = 123;
		int x2 = 313;
		int x3 = -323323;
		int x4 = -2147483648; // Integer.MIN_VALUE
		int x5 = 1000021;
		
		System.out.println(solve.isPalindrome(x1));
		System.out.println(solve.isPalindrome(x2));
		System.out.println(solve.isPalindrome(x3));
		System.out.println(solve.isPalindrome(x4));
		System.out.println(solve.isPalindrome(x5));
	}

}
