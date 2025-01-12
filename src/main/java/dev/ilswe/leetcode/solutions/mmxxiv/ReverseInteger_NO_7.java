package dev.ilswe.leetcode.solutions.mmxxiv;

public class ReverseInteger_NO_7 {
    public int reverse(int x) {
    	boolean isNegative = x < 0;
        long reversed = 0;
        
        //corner case
        if(x == Integer.MIN_VALUE) {
        	return 0;
        }
        
        if(isNegative) {
        	x = x * -1;
        }

        try {
        	
        	do {
        		int lastDigit = x % 10;
        		reversed = reversed * 10 + lastDigit;
        	}
        	while((x = x / 10) != 0);
        	
        } catch (NumberFormatException e) {
			return 0;
		}
        
        if(reversed > Integer.MAX_VALUE) {
        	return 0;
        }
        
        if(isNegative) {
        	reversed = reversed * -1;
        }
        
        return (int)reversed;
    }
    
    public static void main(String[] args) {
		ReverseInteger_NO_7 s = new ReverseInteger_NO_7();
		
		System.out.println(s.reverse(1234));
		System.out.println(s.reverse(-1234));
		System.out.println(s.reverse(1));
		System.out.println(s.reverse(0));
		System.out.println(s.reverse(120));
		System.out.println(s.reverse(12344556));
		System.out.println(s.reverse(123477700));
		System.out.println(s.reverse(1234567788));
		System.out.println(s.reverse(-2147483648));

		
		
	}
}
