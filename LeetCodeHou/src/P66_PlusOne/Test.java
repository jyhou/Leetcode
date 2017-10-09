package P66_PlusOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solve = new Solution();

        // test cases
        List<int[]> cases = new ArrayList<int[]>();
        cases.add(new int[]{0});
        cases.add(new int[]{1, 2, 3});
        cases.add(new int[] {1, 0});
        cases.add(new int[]{1, 9});
        cases.add(new int[]{1, 9, 9});
        cases.add(new int[]{9, 9, 9, 9});

        Iterator<int[]> it = cases.iterator();
        while(it.hasNext()) {
            int[] next = it.next();
            System.out.printf("Input int[] : %s; plus one result is : %s\n",
                    Arrays.toString(next), Arrays.toString(solve.plusOne(next)));
        }
    }
}
