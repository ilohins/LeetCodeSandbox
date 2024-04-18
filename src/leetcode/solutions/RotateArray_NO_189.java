package leetcode.solutions;

import java.util.Arrays;

public class RotateArray_NO_189 {

    public void rotate(int[] nums, int k) {
    	
    	if (k == nums.length) {
    		return;
    	}
    	
    	while(k > nums.length) {
    		k = k - nums.length;
    	}

    	int[] buff = new int[k];
    	
    	for(int i = 0; i < k; i++) {
    		buff[k-1-i] = nums[nums.length-i-1];
    	}
    	
    	for(int i = nums.length-k-1; i >= 0; i--) {
    		nums[i+k] = nums[i];
    	}
        
    	for(int i = 0; i < k; i++) {
    		nums[i] = buff[i];
    	}
    }
    
    
	public static void main(String[] args) {
		RotateArray_NO_189 s = new RotateArray_NO_189();
		
		{
			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
			s.rotate(arr, 3);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
			s.rotate(arr, 10);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
			s.rotate(arr, 0);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
			s.rotate(arr, 9);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
			s.rotate(arr, 1);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1};
			s.rotate(arr, 1);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1, 2};
			s.rotate(arr, 3);
			System.out.println(Arrays.toString(arr));
		}
		
		{
			int[] arr = new int[] { 1, 2};
			s.rotate(arr, 5);
			System.out.println(Arrays.toString(arr));
		}
	}
}
