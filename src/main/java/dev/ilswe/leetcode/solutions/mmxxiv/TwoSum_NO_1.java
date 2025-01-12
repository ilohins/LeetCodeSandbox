package dev.ilswe.leetcode.solutions.mmxxiv;


import java.util.Arrays;

public class TwoSum_NO_1 {

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 1;
        int count = nums.length;
        
        while (i <= count-2) {
            while (j <= count-1) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
                
                j++;
            }
            
            i++;
            j=i + 1;
        }
        
        return null;
    }
    
    public static void main(String[] args) {
    	
    	int[] t1 = new int[] {5,2,3,1,6,9};
    	
    	Solution  s = new Solution();
    	
    	System.out.println(Arrays.toString(s.twoSum(t1, 7))); 
    	System.out.println(Arrays.toString(s.twoSum(t1, 11))); 
    	System.out.println(Arrays.toString(s.twoSum(t1, 6)));
    	System.out.println(Arrays.toString(s.twoSum(t1, 1)));
    	System.out.println(Arrays.toString(s.twoSum(t1, 15)));
    	System.out.println(Arrays.toString(s.twoSum(t1, 14)));
    	System.out.println(Arrays.toString(s.twoSum(t1, 4)));

		
	}
}