package leetcode.solutions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GasStation_NO_134_Tests {
	private long timer = 0l;
	
	public GasStation_NO_134 solution = new GasStation_NO_134();
	
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
		{
			int[] gas = {1,2,3,4,5};
			int[] cost = {3,4,5,1,2};
			assertEquals(3, solution.canCompleteCircuit(gas, cost));
		}
		{
			int[] gas = {2,3,4};
			int[] cost = {3,4,3};
			assertEquals(-1, solution.canCompleteCircuit(gas, cost));
		}
	}
	
	@Test
	public void testCanCompleteCircuit_added() {
		{
			int[] gas = {1,2,3};
			int[] cost = {3,4,5};
			assertEquals(-1, solution.canCompleteCircuit(gas, cost));
		}
		{
			int[] gas = {1,2,3};
			int[] cost = {1,2,3};
			assertEquals(0, solution.canCompleteCircuit(gas, cost));
		}
		{
			int[] gas = {1,3,2};
			int[] cost = {1,2,3};
			assertEquals(0, solution.canCompleteCircuit(gas, cost));
		}
		{
			int[] gas = {5,8,1,2,3,2,8};
			int[] cost = {6,5,1,3,3,6,6};
			assertEquals(-1, solution.canCompleteCircuit(gas, cost));
		}
	}
	 
	@Test
	public void testCanCompleteCircuit_negative() {
		{
			int[] gas = {};
			int[] cost = {};
			assertEquals(-1, solution.canCompleteCircuit(gas, cost));
		}
	}
	
	@Test
	public void testCanCompleteCircuit_reruns() {
		{
			int[] gas = {5,8,2,8};
			int[] cost = {6,5,6,6};
			assertEquals(3, solution.canCompleteCircuit(gas, cost));
		}
		{
			int[] gas = {0,0,0,0};
			int[] cost = {0,0,0,0};
			assertEquals(0, solution.canCompleteCircuit(gas, cost));
		}
	}
}
