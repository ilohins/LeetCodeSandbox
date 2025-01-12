package dev.ilswe.leetcode.solutions.mmxxiv;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII_NO_80 {
    public int removeDuplicatesSlow(int[] nums) {

    	int i = 0;
    	int shift = 0;
    	int dupBuffer = Integer.MAX_VALUE;
    	while(i <= nums.length -2) {
    		
    		nums[i - shift] = nums[i];
    		
    		if(nums[i] == nums[i + 1]) {
    			if(nums[i] == dupBuffer) {
    				shift = shift +1;
    			} else {
    				dupBuffer = nums[i];
    			}
    		} else {
    			dupBuffer = Integer.MAX_VALUE;
    		}
    		
    		i++;
    		
    	}
    	
    	if(shift > 0) {
    		nums[nums.length-1 - shift] = nums[nums.length-1];
    	}
        
        return nums.length - shift;
    }
    
    public int removeDuplicates(int[] nums) {
    	//TODO: currently, it iterates one after another.
    	//Instead, evaluate dups right away in a while, adjust shift.
    	int i = 0;
    	int shift = 0;
    	int dupBuffer = Integer.MAX_VALUE;
    	while(i <= nums.length -2) {
    		
    		nums[i - shift] = nums[i];
    		
    		if(nums[i] == nums[i + 1]) {
    			if(nums[i] == dupBuffer) {
    				shift = shift +1;
    			} else {
    				dupBuffer = nums[i];
    			}
    		} else {
    			dupBuffer = Integer.MAX_VALUE;
    		}
    		
    		i++;
    		
    	}
    	
    	if(shift > 0) {
    		nums[nums.length-1 - shift] = nums[nums.length-1];
    	}
        
        return nums.length - shift;
    }
    
    
    public static void main(String[] args) {
		RemoveDuplicatesfromSortedArrayII_NO_80 s = new RemoveDuplicatesfromSortedArrayII_NO_80();
    	
    	{
    		int[] arr = new int[] {1,2,3,4,4,5,6};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	
    	{
    		int[] arr = new int[] {};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	
    	{
    		int[] arr = new int[] {1};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	
    	{
    		int[] arr = new int[] {1,1};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	
    	{
    		int[] arr = new int[] {1,2};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	
    	{
    		int[] arr = new int[] {1,2,2};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	
    	{
    		int[] arr = new int[] {1,1,2,2};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	{
    		int[] arr = new int[] {1,1,1,1};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	{
    		int[] arr = new int[] {1,1,1,2,2,2};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	{
    		int[] arr = new int[] {1,1,1,1,4};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
    	{
    		int[] arr = new int[] {1,1,4,1,1};
    		System.out.println(s.removeDuplicates(arr) + ":" + Arrays.toString(arr));;
    	}
	}
}
