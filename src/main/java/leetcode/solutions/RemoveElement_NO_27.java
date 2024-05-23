package leetcode.solutions;

import java.util.Arrays;

public class RemoveElement_NO_27 {
    public int removeElement(int[] nums, int val) {
        
    	int notMatched = nums.length -1;
    	int i = 0;
    	while (i <= notMatched) {
			if(nums[i] == val) {
				nums[i] = nums[notMatched];
				notMatched--;
			} else {
				i++;
			}
		}
    	
    	//compensate 1, transform index -> number of elements
    	return notMatched + 1;
    }
    
    public static void main(String[] args) {
    	RemoveElement_NO_27 s = new RemoveElement_NO_27();
    	
    	{
    		int[] arr = new int[] {0,1,2,2,3,0,4,2};
    		int val = 2;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
    	
    	{
    		int[] arr = new int[] {3,2,2,3};
    		int val = 3;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
    	
    	{
    		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
    		int val = 1;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
    	
    	{
    		int[] arr = new int[] {1,2,3,4,5,6,7,8,9};
    		int val = 9;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
    	
    	{
    		int[] arr = new int[] {};
    		int val = 3;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
    	
    	{
    		int[] arr = new int[] {1};
    		int val = 1;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
    	
    	{
    		int[] arr = new int[] {1};
    		int val = 2;
    		
    		System.out.println(s.removeElement(arr, val) + ":" + Arrays.toString(arr));
    	}
	}
}
