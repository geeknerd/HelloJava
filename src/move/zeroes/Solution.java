package move.zeroes;

import org.junit.Test;

/**
 * 
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * 
 * @author Yi Xia
 *
 */
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s = new Solution();
		int[] nums = new int[]{2,1};
		s.moveZeroes(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	
	public void moveZeroes(int[] nums) {
        int i = 0;
        int j = 0;
        for(i = 0; i < nums.length; i ++){
        	if(nums[i] != 0){
        		swap(i, j, nums);
        		j++;
        	}
        }
    }
	
	public void swap(int i, int j, int[] nums){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
	
	/*@Test
	public void testSolution(){
		int[] nums = new int[]{0,1,4,0,12,0};
		moveZeroes(nums);
		
	}*/

}
