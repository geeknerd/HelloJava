package move.zeroes;

import org.junit.Test;

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
