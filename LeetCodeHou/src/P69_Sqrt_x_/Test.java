package P69_Sqrt_x_;

public class Test {
    public static void main(String[] args) {
        Solution solve = new Solution();
        // test cases
        int[] x = {0, 1, 2, 3, 4, 6, 99, Integer.MAX_VALUE};

        for (int i = 0; i < x.length; i++) {
            System.out.printf("Sqrt(%d) = %d\n", x[i], solve.mySqrt(x[i]));
        }
    }
}
