package leetcode.solutions;

import java.util.Arrays;

public class ProductofArrayExceptSelf_NO_238 {
	
	//n^2 approach, not allowed
	public int[] productExceptSelf_NotAllowed(int[] nums) {

		int retArr[] = Arrays.copyOf(nums, nums.length);
		
		for (int i = 0; i < retArr.length; i++) {
			
			int val = 1;
			for (int j = 0; j < retArr.length; j++) {
				if(i != j) {
					val = val * nums[j];
				}
			}
			retArr[i] = val;
		}
		
		
		return retArr;

	}
	
	//Accepted, but slow and use a lot of memory
	public int[] productExceptSelf_slow(int[] nums) {

		int[] prefix = new int[nums.length], postfix = new int[nums.length];
		
		prefix[0] = nums[0];
		postfix[nums.length-1] = nums[nums.length-1];
		
		for (int i = 1; i < nums.length; i++) {
			
			prefix[i] = prefix[i -1] * nums[i];
			
			int pfIIdx = (nums.length-1) - i;
			postfix[pfIIdx] = nums[pfIIdx] * postfix[pfIIdx + 1];
			
		}
		
		int[] retArr = new int[nums.length];
		
		retArr[0] = postfix[1];
		retArr[nums.length-1] = prefix[nums.length-2];
		
		for (int i = 1; i < nums.length-1; i++) {
			retArr[i] = prefix[i-1] * postfix[i+1];
		}
		
		return retArr;

	}
	
	public int[] productExceptSelf(int[] nums) {

		int[] prefix = new int[nums.length];
		prefix[0] = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			prefix[i] = prefix[i -1] * nums[i];
		}
		
		int[] retArr = new int[nums.length];
		retArr[nums.length-1] = prefix[nums.length-2];
		
		int postfixPointer = nums[nums.length - 1];
		for (int i = 1; i < nums.length-1; i++) {
			retArr[nums.length-1 - i] = prefix[nums.length - 2 - i] * postfixPointer;
			postfixPointer =postfixPointer * nums[nums.length - 1 - i];
		}
		
		retArr[0] = postfixPointer;
		
		return retArr;
	}
	
	public static void main(String[] args) {
		ProductofArrayExceptSelf_NO_238 s = new ProductofArrayExceptSelf_NO_238();
		
		System.out.println(Arrays.toString(s.productExceptSelf(new int[] {1,2,3,4})));
		
		System.out.println(Arrays.toString(s.productExceptSelf(new int[] {-1,1,0,-3,3})));

		System.out.println(Arrays.toString(s.productExceptSelf(new int[] {1,2})));

		System.out.println(Arrays.toString(s.productExceptSelf(new int[] {0,3})));

		System.out.println(Arrays.toString(s.productExceptSelf(new int[] {0,0})));

	}
}
