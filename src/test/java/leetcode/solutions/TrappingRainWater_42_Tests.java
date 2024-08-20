package leetcode.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrappingRainWater_42_Tests {
	private long timer = 0l;
	
	public TrappingRainWater_42 solution = new TrappingRainWater_42();
	
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
	public void testTrap_simple() {
		assertEquals(2, solution.trap(new int[]{0,1,0,2,1,3,0}));

	}
	
	@Test
	public void testTrap_given() {
		assertEquals(6, solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
		assertEquals(9, solution.trap(new int[]{4,2,0,3,2,5}));

	}
	
	@Test
	public void testTrap_added() {
		//hill
		assertEquals(0, solution.trap(new int[]{1,2,3,4,3,2,1}));
		assertEquals(1, solution.trap(new int[]{1,2,3,4,3,4,1}));

		//ridge
		assertEquals(10, solution.trap(new int[]{1,2,3,4,3,2,1,2,3,4,3,4,5,1}));
		
		
		//ridge no top point
		assertEquals(10, solution.trap(new int[]{1,2,3,4,3,2,1,2,3,4,3,4,4,1}));

		//canyon
		assertEquals(16, solution.trap(new int[]{5,4,3,2,1,2,3,4,5}));
		assertEquals(9, solution.trap(new int[]{5,4,3,2,1,2,3,4}));
		assertEquals(9, solution.trap(new int[]{4,3,2,1,2,3,4,5}));
		assertEquals(9, solution.trap(new int[]{5,5,4,3,2,1,2,3,4,4}));
		
		//flat
		assertEquals(0, solution.trap(new int[]{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2}));

	}
	 
	@Test
	public void testTrap_negative() {
		assertEquals(0, solution.trap(new int[]{}));
		assertEquals(0, solution.trap(new int[]{4}));
		assertEquals(0, solution.trap(new int[]{4,2}));
	}
	
	@Test
	public void testTrap_reruns() {
		assertEquals(23, solution.trap(new int[]{5,5,1,7,1,1,5,2,7,6}));
	}
}
