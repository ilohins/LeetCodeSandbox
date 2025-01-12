package dev.ilswe.leetcode.solutions.mmxxiv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals_NO_56 {
    public int[][] merge(int[][] intervals) {    	
    	List<int[]> resultSet = new ArrayList<int[]>();
    	
    	Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] < o2[0] ? -1 : o1[0] == o2[0] ? 0 : 1;
			}
    		
		});
    	
    	int[] currentPair = intervals[0].clone();
    	for(int[] pair : intervals) {
    		boolean overlapDetected = 
    				(currentPair[0] <= pair[0] && currentPair[1]>=pair[0])
    				|| (currentPair[0] <= pair[1] && currentPair[1]>=pair[1])
    				|| (currentPair[0] >= pair[0] && currentPair[1]<=pair[1])
    				;
    		
    		if(overlapDetected) {
    			currentPair[0] = (pair[0] < currentPair[0]) ? pair[0] : currentPair[0];
    			currentPair[1] = (pair[1] > currentPair[1]) ? pair[1] : currentPair[1];
    		} else {
    			resultSet.add(currentPair);
    			currentPair = pair.clone();
    		}
    	}
    	
    	resultSet.add(currentPair);
    	
    	int [][] result = new int[resultSet.size()][2];
    	for (int i = 0; i < resultSet.size(); i++) {
    		result[i] = resultSet.get(i);
		}
    	
    	return result;
    }
}