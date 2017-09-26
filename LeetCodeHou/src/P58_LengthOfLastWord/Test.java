package P58_LengthOfLastWord;

public class Test {
    public static void main(String[] args) {
        Solution solve = new Solution();

        // Test cases
        String[] s = new String[7];
        String s0 = null;
        String s1 = "";
        String s2 = " ";
        String s3 = "hello";
        String s4 = "hello world";
        String s5 = "hello world ";
        String s6 = " hello world i";

        System.out.printf("String %s, the length of the last word is %d\n", s0, solve.lengthOfLastWord(s0));
        System.out.printf("String %s, the length of the last word is %d\n", s1, solve.lengthOfLastWord(s1));
        System.out.printf("String %s, the length of the last word is %d\n", s2, solve.lengthOfLastWord(s2));
        System.out.printf("String %s, the length of the last word is %d\n", s3, solve.lengthOfLastWord(s3));
        System.out.printf("String %s, the length of the last word is %d\n", s4, solve.lengthOfLastWord(s4));
        System.out.printf("String %s, the length of the last word is %d\n", s5, solve.lengthOfLastWord(s5));
        System.out.printf("String %s, the length of the last word is %d\n", s6, solve.lengthOfLastWord(s6));
    }

}
