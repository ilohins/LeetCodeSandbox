package leetcode.solutions;

import java.util.Arrays;

public class HIndex_NO_274 {
    public int hIndex3(int[] citations) {
        Arrays.parallelSort(citations);
        
        return hIndexRec(citations, 1);
    }
    
    public int hIndexRec(int[] citations, int h) {
    	if((citations.length > h-1) && citations[citations.length-h] >= h) {
    		return hIndexRec(citations, h + 1);
    	} else {
    		return h -1;
    	}
    }
    
    //this sort is pretty quick, the best result so far
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        
        int h = citations.length;
        
        for(int value : citations) {
        	if(value < h) {
        		h --;
        	} else {
        		return h;
        	}
        }
        
    	return 0;
    }
    
    public int hIndex2(int[] citations) {
        
    	int h = 1;
    	while (true) {
    		int count = 0;
    		for(int i : citations) {
    			if(i >= h) {
    				count++;
    			}
    			if(count >= h) {
    				break;
    			}
    		}
    		
    		if(count < h) {
    			return h -1;
    		} else {
    			h++;
    		}
    	}
    }
	
	public static void main(String[] args) {
		HIndex_NO_274 s = new HIndex_NO_274();
		
		System.out.println(s.hIndex(new int[] {3,0,6,1,5}));
		
		System.out.println(s.hIndex(new int[] {0,1}));
		
		System.out.println(s.hIndex(new int[] {5}));
		
		System.out.println(s.hIndex(new int[] {}));
		
		System.out.println(s.hIndex(new int[] {1,2,3,4,5,6,7}));
		
		System.out.println(s.hIndex(new int[] {1,2,1}));
		
	}
}
