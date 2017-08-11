package P20_Valid_Parentheses;

public class Test {

	public static void main(String[] args) {
		Solution solve = new Solution();
		
		String s1 = "(){}[]";
		String s2 = "({[}])";
		String s3 = "}{{}()";
		String s4 = "{([)}]";
		String s5 = "([{}])";
		
		System.out.printf("String: %s is %b\n", s1, solve.isValid(s1));
		System.out.printf("String: %s is %b\n", s2, solve.isValid(s2));
		System.out.printf("String: %s is %b\n", s3, solve.isValid(s3));
		System.out.printf("String: %s is %b\n", s4, solve.isValid(s4));
		System.out.printf("String: %s is %b\n", s5, solve.isValid(s5));
	}

}
