package dev.ilswe.leetcode.solutions.mmxxiv;

import java.util.HashSet;
import java.util.Set;

public class InsertDeleteGetRandom_NO_380 {

	public static void main(String[] args) {		
		RandomizedSet s = new RandomizedSet();
		
		s.insert(10);
		
		System.out.println(s.getRandom());
		
		s.insert(30);
		s.remove(2);
		s.insert(2);
		
		System.out.println(s.getRandom());

	}
}

class RandomizedSet {

	Set<Integer> values;
	
    public RandomizedSet() {
        values = new HashSet<Integer>(50000);
    }
    
    public boolean insert(int val) {
    	boolean ret = values.add(val);
    	isDirty = true;
        return ret;
    }
    
    public boolean remove(int val) {
    	boolean ret = values.remove(val);
    	isDirty = true;
        return ret;
    }
    
    
    Integer[] arr;
    boolean isDirty = false;
    public int getRandom() {
    	if (isDirty) {
    		arr = values.toArray(Integer[]::new);
    		isDirty = false;
    	}
    	
    	int randPointer = (int)(Math.random() * arr.length);
    	
        return arr[randPointer];
    }
}

