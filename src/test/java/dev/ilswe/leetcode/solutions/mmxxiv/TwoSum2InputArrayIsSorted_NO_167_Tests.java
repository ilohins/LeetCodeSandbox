package dev.ilswe.leetcode.solutions.mmxxiv;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ilswe.leetcode.solutions.mmxxiv.TwoSum2InputArrayIsSorted_NO_167;

public class TwoSum2InputArrayIsSorted_NO_167_Tests {
	private long timer = 0l;

	public TwoSum2InputArrayIsSorted_NO_167 solution = new TwoSum2InputArrayIsSorted_NO_167();

	@BeforeEach
	public void init() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " started");
		timer = System.nanoTime();
	}

	@AfterEach
	public void finalize() {
		System.out.println(
				"JUNIT for " + this.getClass().getSimpleName() + " completed in " + (System.nanoTime() - timer) + "ns");
	}

	@Test
	public void testCanCompleteCircuit_given() {
		{
			int[] numbers = new int[] { 2, 7, 11, 15 };
			int target = 9;
			int[] expected = new int[] { 1, 2 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}

		{
			int[] numbers = new int[] { 2, 3, 4 };
			int target = 6;
			int[] expected = new int[] { 1, 3 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}

		{
			int[] numbers = new int[] { -1, 0 };
			int target = -1;
			int[] expected = new int[] { 1, 2 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}
	}

	@Test
	public void testCanCompleteCircuit_added() {

		{
			int[] numbers = new int[] { 1, 2, 3, 4, 8 };
			int target = 9;
			int[] expected = new int[] { 1, 5 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}

		{
			int[] numbers = new int[] { 1, 2, 3, 4, 8 };
			int target = 4;
			int[] expected = new int[] { 1, 3 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}

		{
			int[] numbers = new int[] { 1, 2, 3, 4, 8 };
			int target = 6;
			int[] expected = new int[] { 2, 4 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}
		
		{
			int[] numbers = new int[] { 1, 2, 3, 4, 8 };
			int target = 10;
			int[] expected = new int[] { 2, 5 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}
		
		{
			int[] numbers = new int[] { -33, -11, 0, 21, 45 };
			int target = 10;
			int[] expected = new int[] { 2, 4 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}
		
		{
			int[] numbers = new int[] {-999, -500, -100, 1, 2, 3, 4, 8 };
			int target = -600;
			int[] expected = new int[] { 2, 3 };
			String message = "Numbers: " + Arrays.toString(numbers) + "; target: " + target + "; Expected: "
					+ Arrays.toString(expected);
			assertTrue(message, Arrays.equals(solution.twoSum(numbers, target), expected));
		}		

	}

	@Test
	public void testCanCompleteCircuit_negative() {

	}

	@Test
	public void testCanCompleteCircuit_reruns() {

	}
}
