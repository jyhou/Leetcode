package P67_AddBinary;

public class Test {
    public static void main(String[] args) {
        Solution solve = new Solution();

        // test cases
        String a1 = "111";
        String a2 = "1";
        String a3 = "10101";
        String a4 = "100";
        String b1 = "10";
        String a5 = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String a6 = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        System.out.printf("Input: %s,   %s; result: %s\n", a1, a2, solve.addBinary(a1, a2));
        System.out.printf("Input: %s,   %s; result: %s\n", a1, a3, solve.addBinary(a1, a3));
        System.out.printf("Input: %s,   %s; result: %s\n", a1, a4, solve.addBinary(a1, a4));
        System.out.printf("Input: %s,   %s; result: %s\n", a2, a3, solve.addBinary(a2, a3));
        System.out.printf("Input: %s,   %s; result: %s\n", a2, a4, solve.addBinary(a2, a4));
        System.out.printf("Input: %s,   %s; result: %s\n", a3, a4, solve.addBinary(a3, a4));
        System.out.printf("Input: %s,   %s; result: %s\n", a5, a6, solve.addBinary(a5, a6));
    }
}
