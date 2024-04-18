package leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement_NO_169 {
	
	//slow and simple approach
    public int majorityElement2(int[] nums) {
    	
    	Map<Integer, Integer> counter = new HashMap<Integer, Integer>(nums.length/3*2);
    	
    	for(int i : nums) {
    		Integer count = counter.get(i);
    		
    		if(count == null) {
    			count = 0;
    		}
    		
    		count++;
    		
			counter.put(i, count);
    		
    		if(count > (nums.length /2)) {
    			return i;
    		}
    	}
    	
    	return 0;
    }
    
    //
    public int majorityElement(int[] nums) {
    	
    	Map<Integer, Integer> counter = new HashMap<Integer, Integer>(nums.length/3*2);
    	int halfSize = nums.length /2;
    	
    	int i = 0;
    	while(i < nums.length) {
    		int val = nums[i];
    		
    		Integer count = counter.get(val);
    		if(count == null) {
    			//new elements after half of the array does not have a chance to be a major, skip
    			if(i > halfSize) {
    				i++;
    				continue;
    			}
    			
    			count = 0;
    		}
    		
    		//due to density of the major number, this could reduce number of counter updates in the map
    		int j = i + 1;
    		while (j < nums.length) {
    			if(val == nums[j]) {
    			
    				j++;
    			} else {
    				break;
    			}
    		}
    		
    		j = j - i; //at least 1
    		
    		
    		count= count + j;
    		
			counter.put(val, count);
    		
    		if(count > halfSize) {
    			return val;
    		}
    		
    		i = i + j;
    	}
    	
    	return 0;
    }
	
	public static void main(String[] args) {
		MajorityElement_NO_169 s = new MajorityElement_NO_169();
		
		long timer = System.currentTimeMillis();
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2,1,1}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2}));
		System.out.println(s.majorityElement(new int[] {2,1,2}));
		System.out.println(s.majorityElement(new int[] {3}));
		System.out.println(s.majorityElement(new int[] {2,2,1,1,1,2,2,1}));
		System.out.println(s.majorityElement(new int[] {-1,1,1,1,2,1}));		
		
		System.out.println("time:" + (System.currentTimeMillis() - timer));

	}
}
