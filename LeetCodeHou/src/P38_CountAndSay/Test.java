package P38_CountAndSay;

public class Test {

	public static void main(String[] args) {
		Solution solve = new Solution();
		System.out.printf("n = %d,    countAndSay: %s\n", 1, solve.countAndSay(1));
		System.out.printf("n = %d,    countAndSay: %s\n", 2, solve.countAndSay(2));
		System.out.printf("n = %d,    countAndSay: %s\n", 3, solve.countAndSay(3));
		System.out.printf("n = %d,    countAndSay: %s\n", 4, solve.countAndSay(4));
		System.out.printf("n = %d,    countAndSay: %s\n", 5, solve.countAndSay(5));
		System.out.printf("n = %d,    countAndSay: %s\n", 6, solve.countAndSay(6));
		System.out.printf("n = %d,    countAndSay: %s\n", 10, solve.countAndSay(10));
	}

}
