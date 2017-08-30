package P35_SearchInsertPosition;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Solution solve = new Solution();
		
		int[] nums1 = {1,3,5,6}; 
		int[] nums2 = {1};
		int[] nums3 = {};
		
		int target1 = 5;
		int target2 = 2;
		int target3 = 1;
		int target4 = 7;
		int target5 = 6;
		int target6 = 0;
		
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums1), target1, solve.searchInsert(nums1, target1));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums1), target2, solve.searchInsert(nums1, target2));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums1), target3, solve.searchInsert(nums1, target3));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums1), target4, solve.searchInsert(nums1, target4));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums1), target5, solve.searchInsert(nums1, target5));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums2), target2, solve.searchInsert(nums2, target2));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums2), target3, solve.searchInsert(nums2, target3));
		System.out.printf("nums: %s\ntarget = %d\nsearchInsert: %d\n\n", Arrays.toString(nums2), target6, solve.searchInsert(nums2, target6));
	}

}
