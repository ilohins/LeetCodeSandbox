package leetcode.solutions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Template class for testing, could be added as "Live Templates" to IDE
 * 
 * Includes performance testing in nano seconds
 */
public class Template_Tests {
	private long timer = 0l;
	
	public Object solution = new Object();
	
	@BeforeEach
	public void init() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " started");
		timer = System.nanoTime();
	}
	
	@AfterEach
	public void finalize() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " completed in " + (System.nanoTime() - timer) + "ns");
	}
	
	/**
	 * Tests provided by LeetCode
	 */
	@Test
	public void testCanCompleteCircuit_given() {
	}
	
	/**
	 * Tests added by the developer
	 */
	@Test
	public void testCanCompleteCircuit_added() {
		
	}
	
	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void testCanCompleteCircuit_negative() {
		
	}
	
	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void testCanCompleteCircuit_reruns() {
		
	}
}
