package leetcode.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Candy_NO_135_Tests {
	private long timer = 0l;
	
	public Candy_NO_135 solution = new Candy_NO_135();
	
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
	public void testCanCompleteCircuit_given() {
		assertEquals(5, solution.candy(new int[]{1,0,2}));
		
		assertEquals(4, solution.candy(new int[]{1,2,2}));
	}
	
	@Test
	public void testCanCompleteCircuit_added() {
		assertEquals(25, solution.candy(new int[]{1,2,3,4,4,3,2,3,4,5}));
											   //1,2,3,4,3,2,1,2,3,4
		

		assertEquals(6, solution.candy(new int[]{1,2,3}));
		assertEquals(6, solution.candy(new int[]{3,2,1}));
		assertEquals(3, solution.candy(new int[]{2,1}));
	}
	 
	@Test
	public void testCanCompleteCircuit_negative() {
		assertEquals(1, solution.candy(new int[]{1}));
		assertEquals(3, solution.candy(new int[]{1,2}));
		assertEquals(2, solution.candy(new int[]{1,1}));

	}
	
	@Test
	public void testCanCompleteCircuit_reruns() {
		assertEquals(11, solution.candy(new int[]{1,3,4,5,2}));
	}
}
