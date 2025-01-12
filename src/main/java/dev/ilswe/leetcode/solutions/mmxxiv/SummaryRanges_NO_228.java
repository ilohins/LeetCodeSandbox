package dev.ilswe.leetcode.solutions.mmxxiv;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_NO_228 {
    public List<String> summaryRanges(int[] nums) {
    	
    	List<String> result = new ArrayList<String>();
    	
    	if(nums == null || nums.length < 1) {
    		return result;
    	}
     	
    	
    	int current = 0;
    	while (current < nums.length) {
    		
    		int sequenceEnd = chaseSequence(nums, current);
    		
    		if(sequenceEnd == current) {
    			result.add(String.valueOf(nums[current])); 
    		} else {
    			result.add(String.valueOf(nums[current]) + "->" + String.valueOf(nums[sequenceEnd]));
    		}
			
    		current = sequenceEnd + 1;
		}
 
    	
    	
		return result;
        
    }

	private int chaseSequence(int[] nums, int current) {
		
		if((nums.length > current + 1) && (nums[current] == (nums[current+1] - 1))) {
			return chaseSequence(nums, current+1);
		} else {
			return current;
		}
	}
}
