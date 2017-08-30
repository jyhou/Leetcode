package P26_RemoveDuplicatesFromSortedArray;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example,
 * Given input array nums = [1,1,2],
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. 
 * It doesn't matter what you leave beyond the new length.
 *
 */

public class Solution {
	public int removeDuplicates(int[] nums) {
		if (nums.length < 1) return 0;
		int res = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != nums[i+1]) {
				nums[res] = nums[i+1];
				res++;
			}
		}
		return res;
	}
}
