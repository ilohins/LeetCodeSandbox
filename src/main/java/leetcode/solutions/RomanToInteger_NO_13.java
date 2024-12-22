package leetcode.solutions;

public class RomanToInteger_NO_13 {
	
    public int romanToInt(String s) {
    	int result = 0;
    	
    	int maxCharValue = 0;
    	for(int i = s.length() -1; i >=0; i--) {
    		int val = translate(s.charAt(i));
    		
    		if(val >= maxCharValue) {
    			maxCharValue = val;
    			result = result + val;
    		} else {
    			result = result - val;
    		}
    	}
    	
        return result;
    }
    
    
    private int translate(char ch) {
    	return switch (ch) {
    		case 'I' -> 1;
    		case 'V' -> 5;
    		case 'X' -> 10;
    		case 'L' -> 50;
    		case 'C' -> 100;
    		case 'D' -> 500;
    		case 'M' -> 1000;

    		default -> 0;
    	};
    }
}
