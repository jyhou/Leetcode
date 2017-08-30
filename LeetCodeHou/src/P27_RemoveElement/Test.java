package P27_RemoveElement;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		Solution solve = new Solution();
		
		int[] num1 = {};
		int[] num2 = null;
		int[] num3 = {3, 2, 2, 3};
		int[] num4 = {2, 2, 2, 2};
		int[] num5 = {1, 2, 3, 4, 5};
		int[] num6 = {4, 5};
		int[] num7 = {2};
		
		int val1 = 3;
		int val2 = 2;
		int val3 = 4;
		
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num1), val1, solve.removeElement(num1, val1), Arrays.toString(num1));
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num2), val1, solve.removeElement(num2, val1), Arrays.toString(num2));
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num3), val1, solve.removeElement(num3, val1), Arrays.toString(num3));		
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num4), val2, solve.removeElement(num4, val2), Arrays.toString(num4));
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num4), val1, solve.removeElement(num4, val1), Arrays.toString(num4));
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num5), val2, solve.removeElement(num5, val2), Arrays.toString(num5));
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num6), val3, solve.removeElement(num6, val3), Arrays.toString(num6));
		System.out.printf("Input array: %s, remove val = %d, result length: %d, output array: %s\n", 
				Arrays.toString(num7), val1, solve.removeElement(num7, val1), Arrays.toString(num7));		

	}

}
