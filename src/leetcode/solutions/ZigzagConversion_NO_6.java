package leetcode.solutions;

public class ZigzagConversion_NO_6 {
	
    public String convert(String s, int numRows) {
    	
    	if(numRows < 2) {
    		return s;
    	}
    	
    	char[] chars = s.toCharArray();
		int step = numRows + numRows -2;
		int end = chars.length;
    	
		StringBuilder result = new StringBuilder();
        
		{
			for (int j = 0; j < numRows; j++) {
				int p = j;
				while (p < end) {
					result.append(chars[p]);
					
					if(j != 0 && j!= numRows-1) {
						int zigzagChar = (numRows-j-1)*2 + p;
						if(zigzagChar < end) {
							result.append(chars[zigzagChar]);
						}
					}
					
					p = p + step;
				}
			}
		}
		
		return result.toString();
    }
    
    
    public static void main(String[] args) {
    	
    	ZigzagConversion_NO_6 s = new ZigzagConversion_NO_6();
    	
    	System.out.println(s.convert("HelloThere!", 4));
    	System.out.println(s.convert("hi", 4));
    	System.out.println(s.convert("A", 1));

	}
	
}
