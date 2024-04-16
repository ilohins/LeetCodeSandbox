package leetcode.solutions;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray_NO_27 {
    public int removeDuplicates(int[] nums) {

    	int i = 0;
    	int shift = 0;
    	while(i <= nums.length -2) {
    		
    		nums[i - shift] = nums[i];
    		
    		if(nums[i] == nums[i + 1]) {
    			shift = shift +1;
    		}
    		
    		i++;
    		
    	}
    	
    	if(shift > 0) {
    		nums[nums.length-1 - shift] = nums[nums.length-1];
    	}
        
        return nums.length - shift;
    }
    
    
    
    public static void main(String[] args) {
		RemoveDuplicatesfromSortedArray_NO_27 s = new RemoveDuplicatesfromSortedArray_NO_27();
    	
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
	}
}
