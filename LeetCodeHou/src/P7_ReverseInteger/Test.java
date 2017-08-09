package P7_ReverseInteger;

public class Test {

	public static void main(String[] args) {
		int x1 = 123;
		int x2 = -123;
		int x3 = Integer.MAX_VALUE;//2147483647
		int x4 = Integer.MIN_VALUE;//-2147483648
		int x5 = 2000000007;
		
		Solution solve = new Solution();
		System.out.println(x1 + "    " + solve.reverse(x1));
		System.out.println(x2 + "    " + solve.reverse(x2));
		System.out.println(x3 + "    " + solve.reverse(x3));
		System.out.println(x4 + "    " + solve.reverse(x4));
		System.out.println(x5 + "    " + solve.reverse(x5));
		
	}

}
