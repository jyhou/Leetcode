package P1_TwoSum;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Solution solution = new Solution();
		
		//test
		int[] nums = {2, 2, 7, 11, 15};
		int target = 9;
		int target2 = 4;
		System.out.println(Arrays.toString(solution.twoSum(nums, target)));
		OnePassHashmap solution2 = new OnePassHashmap();
		System.out.println(Arrays.toString(solution2.twoSum(nums, target2)));

	}

}
