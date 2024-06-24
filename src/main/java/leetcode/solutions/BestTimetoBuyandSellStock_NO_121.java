package leetcode.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTimetoBuyandSellStock_NO_121 {

	//brute force approach cannot process large set even with array reduction.
	//since I like the reduction mechanism, will keep it for memories :D
    public int maxProfit2(int[] prices) {
    	if (prices == null || prices.length < 2) {
    		return 0;
    	}
    	
    	//reduce array: if values sequentially reducing, keep the lowest, and wise versa
    	List<Integer> reduced = new ArrayList<Integer>();
    	
    	reduced.add(prices[0]);
    	
    	int it = 0;
    	while (it < prices.length-2) {
    		
    		if(prices[it] > prices[it+1] && prices[it+1] <= prices[it+2]) {
    			reduced.add(prices[it+1]);
    		} else if (prices[it] < prices[it+1] && prices[it+1] >= prices[it+2]) {
    			reduced.add(prices[it+1]);
    		}
    		
    		it ++;
    	}
    	
    	reduced.add(prices[prices.length-1]);
    	
    	System.out.println(Arrays.toString(prices));
    	
    	Integer[] pricesReduced = new Integer[reduced.size()];
    	reduced.toArray(pricesReduced);

    	System.out.println(Arrays.toString(pricesReduced));
    	
    	int maxDiff = 0;
    	
    	int i = 0;
    	while (i < pricesReduced.length -1) {
    		
    		int j = i+1;
    		while(j < pricesReduced.length) {
    			int diff = (pricesReduced[j] - pricesReduced[i]);
    			if(diff > maxDiff) {
    				maxDiff = diff;
    			}
    			j++;
    		}
    		
    		i++;
    	}
        
    	
    	return maxDiff;
    }
    
    /**
     * so every time it hits low, it need to memorize it as potential new opportunity
     * to buy cheaper. By this time, delta for all previous high values should be calculated
     * 
     * 3,4,5,2,4
     * ^   ^ max diff 3
     *       ^ ^ max diff 2, so 3 preserved
     * 
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
    	if(prices == null || prices.length < 2) {
    		return 0;
    	}
    	
    	int i = 1;
    	int min = prices[0], maxKnownDif = 0;
    	while (i < prices.length) {
    		if(min > prices[i]) {
    			min = prices[i];
    		} else {
    			int minCandidate = prices[i] - min;
    			if (maxKnownDif < minCandidate) {
    				maxKnownDif = minCandidate;
    			}
    		}
    		
    		i++;
    	}
    	
    	return maxKnownDif;
    }
}
