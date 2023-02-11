package twoSum;

import java.util.Arrays;

/**
 * Example:
 * Input nums= [ 2,7,11,15 ] 
 * target = 9 
 * return [0,1] because nums[0] + nums[1] = 9
 * 
 *
 * Only one solution
 *
 */
public class Solution {
	public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i < nums.length; i++) {
        	for(int j=1; j<nums.length; j++) {
        		if ((nums[i] + nums[j]) == target && i != j) {
        			return new int[] { i, j};
        		}
        	}
        }
        return null;
    }
	
	public static void main(String args[]) {
		int[] a = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(a, target)));
	}
}
