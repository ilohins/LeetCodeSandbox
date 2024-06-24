package leetcode.solutions;

public class Candy_NO_135 {
    public int candy(int[] r) {
    	
    	int[] ca = new int[r.length];
    
    	/**
    	 * pass one, accounts only for increasing values
    	 * 
    	 * use this after each iteration to see the code in action:
    	 * System.out.println(Arrays.toString(ca));
    	 */
    	int rank = 1;
    	for (int i = 0; i < r.length-1; i++) {
    		
    		ca[i] = rank;
    		if(r[i] < r[i+1]) {
    			rank = rank +1;
    		} else {
    			rank = 1;
    		}
		}
    	
    	
    	/**
    	 * pass two, accounts for decreasing and similar values
    	 */
    	int sum = 0;
    	for (int i = ca.length-1; i > 0; i--) {
    		//this prevents resetting rank on the reverse pass if higher value was already assigned
    		if(ca[i] > rank) {
    			rank = ca[i];
    		}
    		
    		sum += rank;
    		
    		if(r[i] < r[i -1]) {
    			rank = rank + 1;
    		} else {
    			rank = ca[i-1];
    		}

		}
    	
    	//dont forget about the first element
    	sum += rank;    
    	
    	return sum;
    }
}
