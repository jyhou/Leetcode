package P53_MaximumSubarray;

/**
 * 
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 * 
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */


public class Solution {
	public int maxSubArray(int[] nums) {
		int max = 0;
		int sum = 0;
		if (nums.length < 1) return max;
		max = nums[0];
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
			if (sum >= 0) {
				max = (max < sum) ? sum : max;
			} else {			
				max = (max < sum) ? sum : max;
				sum = 0;
			}
		}
		
		return max;
	}
}
