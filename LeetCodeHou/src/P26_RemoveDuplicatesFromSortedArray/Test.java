package P26_RemoveDuplicatesFromSortedArray;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Solution solve = new Solution();
		
		int[] nums1 = {1, 2, 3, 3, 4, 4};
		int[] nums2 = {};
		int[] nums3 = {1, 1, 1, 1};
		int[] nums4 = {1, 1, 2};
		
		System.out.printf("nums : %s \nnumber of dinstinct elements: %d\n\n", Arrays.toString(nums1),solve.removeDuplicates(nums1));
		System.out.printf("nums : %s \nnumber of dinstinct elements: %d\n\n", Arrays.toString(nums2),solve.removeDuplicates(nums2));
		System.out.printf("nums : %s \nnumber of dinstinct elements: %d\n\n", Arrays.toString(nums3),solve.removeDuplicates(nums3));
		System.out.printf("nums : %s \nnumber of dinstinct elements: %d\n\n", Arrays.toString(nums4),solve.removeDuplicates(nums4));
	}

}
