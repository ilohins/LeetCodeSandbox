package dev.ilswe.leetcode.solutions.mmxxiv;

import java.util.Arrays;

public class MergeSortedArray_NO_88 {
    public void merge1(int[] nums1, int m, int[] nums2, int n) {
        
    	if(nums1.length < (m + n)) {
    		return;
    	} else if (n <=0) {
    		return;
    	}
    	
    	for (int j = 0; j < n; j++) {
			nums1[m + j] = nums2[j];
		}
    	
    	Arrays.sort(nums1);
    	    	
    }
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
    	if(nums1.length < (m + n)) {
    		return;
    	} else if (n <=0) {
    		return;
    	} else if (m <= 0) {
    		int pos = 0;
    		for(int i : nums2) {
    			nums1[pos] = i;
    			pos ++;
    		}
    		return;
    	}
    	
    	int i = m+n -1;
    	int maxA = m-1, maxB=n-1;
    	
    	while (i >= 0) {
    		
    		int n1 =0,n2 =0;
    		if(maxA < 0) {
    			n1 = Integer.MIN_VALUE;
    		} else {
    			n1 = nums1[maxA];
    		}
    		if(maxB < 0) {
    			n2 = Integer.MIN_VALUE;
    		} else {
    			n2 = nums2[maxB];
    		}
    		    		
    		if (n1 > n2) {
    			nums1[i] = n1;
    			
    			maxA --;
    			
    		} else {
    			nums1[i] = n2;

    			maxB --;
    		}
    		
    		i--;
    	}
    	    	
    	//find max, place it to the end of array 1
    }
    
    public static void main(String[] args) {
		MergeSortedArray_NO_88 s = new MergeSortedArray_NO_88();
		
		{
			int[] arr1 = new int[] {1,2,3,0,0,0};
			int[] arr2 = new int[] {2,5,6};
			
			s.merge(arr1, 3, arr2, 3);
			System.out.println(Arrays.toString(arr1));
		}
		
		{
			int[] arr1 = new int[] {1,2,9,0,0,0};
			int[] arr2 = new int[] {2,5,6};
			
			s.merge(arr1, 3, arr2, 3);
			System.out.println(Arrays.toString(arr1));
		}
		
		{
			int[] arr1 = new int[] {1};
			int[] arr2 = new int[] {};
			
			s.merge(arr1, 1, arr2, 0);
			System.out.println(Arrays.toString(arr1));
		}
		
		{
			int[] arr1 = new int[] {0};
			int[] arr2 = new int[] {1};
			
			s.merge(arr1, 0, arr2, 1);
			System.out.println(Arrays.toString(arr1));
		}
		
		{
			int[] arr1 = new int[] {-1,0,0,3,3,3,0,0,0};
			int[] arr2 = new int[] {1,2,2};
			
			s.merge(arr1, 6, arr2, 3);
			System.out.println(Arrays.toString(arr1));
		}

	}
}
