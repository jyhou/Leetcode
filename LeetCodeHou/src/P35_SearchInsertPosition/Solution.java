package P35_SearchInsertPosition;


/**
 * Given a sorted array and a target value, return the index if the target is found. 
 * If not, return the index where it would be if it were inserted in order.
 * You may assume no duplicates in the array.
 * Here are few examples.
 * [1,3,5,6], 5 -> 2
 * [1,3,5,6], 2 -> 1
 * [1,3,5,6], 7 -> 4
 * [1,3,5,6], 0 -> 0
 *
 */

public class Solution {
	public int searchInsert(int[] nums, int target) {
		
		if (nums.length < 1) return 0;
		if (nums[nums.length - 1] < target) return nums.length;
		if (nums[0] > target) return 0;
		int beginIndex = 0;
		int endIndex = nums.length - 1;
		int mindex = (beginIndex + endIndex) / 2;

		while (mindex > beginIndex && mindex < endIndex) {
			if (nums[mindex] == target) {
				return mindex;
			} else if (nums[mindex] > target) {
				endIndex = mindex;
			} else {
				beginIndex = mindex;
			}
			mindex = (beginIndex + endIndex) / 2;
		}
		
		if (mindex == beginIndex) {
			
		}
		if (nums[mindex] == target) {
			return mindex;
		} else {
			return mindex + 1;
		}
	}
	
}
