package P27_RemoveElement;

import java.util.Arrays;

/**
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * Example:
 * Given input array nums = [3,2,2,3], val = 3
 * Your function should return length = 2, with the first two elements of nums being 2.
 *
 */

public class Solution {
	public int removeElement(int[] nums, int val) {
		
		if (nums == null) return 0;
		if (nums.length < 1) return 0;
		if (nums.length == 1 && nums[0] == val) return 0;
		
		Arrays.sort(nums);
		int res = 0;
		int swapIndex = nums.length - 1;
		int temp;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				res++;
			} else {
				if (nums[swapIndex] != val && swapIndex > i) {
					temp = nums[i];
					nums[i] = nums[swapIndex];
					nums[swapIndex] = temp;
					swapIndex--;
					res++;
				} else {
					break;
				}
			}
		}
		return res;
	}
}
