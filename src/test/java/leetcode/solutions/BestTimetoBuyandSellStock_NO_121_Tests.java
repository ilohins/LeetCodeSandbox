package leetcode.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestTimetoBuyandSellStock_NO_121_Tests {
	
	private long timer = 0l;
	
	BestTimetoBuyandSellStock_NO_121 solution = new BestTimetoBuyandSellStock_NO_121();
	
	@BeforeEach
	public void init() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " started");
		timer = System.currentTimeMillis();
	}
	
	@AfterEach
	public void finalize() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " completed in " + (System.currentTimeMillis() - timer) + "ms");
	}
	
	
	 @Test
	public void testMaxProfit() {
			assertEquals(solution.maxProfit(new int[] {1,23,4,5,6,7,8,53}), 52);
			assertEquals(solution.maxProfit(new int[] {1,2,3,4,5}), 4);
			assertEquals(solution.maxProfit(new int[] {7,6,5,4,3,2,1}), 0);
			assertEquals(solution.maxProfit(new int[] {7,6,5,4,2,3,1}), 1);
			assertEquals(solution.maxProfit(new int[] {1}), 0);
			assertEquals(solution.maxProfit(new int[] {1,1}), 0);
			assertEquals(solution.maxProfit(new int[] {2,2}), 0);
			assertEquals(solution.maxProfit(new int[] {}), 0);
			assertEquals(solution.maxProfit(new int[] {3,3,5,0,0,3,1,4}), 4);
	}
}
