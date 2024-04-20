package leetcode.solutions;

public class BestTimetoBuyandSellStockll_NO_122 {
    public int maxProfit(int[] prices) {
       	if(prices == null || prices.length < 2) {
    		return 0;
    	}
    	
    	int i = 1;
    	int min = prices[0], totalRevenue = 0;
    	while (i < prices.length) {
    		if(min < prices[i]) {
    			
    			totalRevenue = totalRevenue + (prices[i] - min);
    			
    		}
    		
    		min = prices[i];
    		
    		i++;
    	}
    	
    	return totalRevenue;
    }
    
    public static void main(String[] args) {
    	BestTimetoBuyandSellStockll_NO_122 s = new BestTimetoBuyandSellStockll_NO_122();
		
		System.out.println(s.maxProfit(new int[] {1,23,4,5,6,7,8,53}));
		System.out.println(s.maxProfit(new int[] {1,2,3,4,5}));
		System.out.println(s.maxProfit(new int[] {7,6,5,4,3,2,1}));
		System.out.println(s.maxProfit(new int[] {7,6,5,4,2,3,1}));
		System.out.println(s.maxProfit(new int[] {1}));
		System.out.println(s.maxProfit(new int[] {1,1}));
		System.out.println(s.maxProfit(new int[] {2,2}));
		System.out.println(s.maxProfit(new int[] {}));
		System.out.println(s.maxProfit(new int[] {3,3,5,0,0,3,1,4}));
	}
}
