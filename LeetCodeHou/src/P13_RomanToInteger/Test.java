package P13_RomanToInteger;

public class Test {

	public static void main(String[] args) {
		
		Solution solve = new Solution();
		
		String s1 = "I";
		String s2 = "III";
		String s3 = "V";
		String s4 = "X";
		String s5 = "XX";
		String s6 = "XC";
		String s7 = "XIX";
		
		System.out.println(solve.romanToInt(s1));
		System.out.println(solve.romanToInt(s2));
		System.out.println(solve.romanToInt(s3));
		System.out.println(solve.romanToInt(s4));
		System.out.println(solve.romanToInt(s5));
		System.out.println(solve.romanToInt(s6));
		System.out.println(solve.romanToInt(s7));

	}

}
