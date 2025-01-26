package dev.ilswe.leetcode.solutions.mmxxiv;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ilswe.leetcode.solutions.mmxxiv.MergeIntervals_NO_56;

/**
 * Template class for testing, could be added as "Live Templates" to IDE
 * 
 * Includes performance testing in nano seconds
 */
public class MergeIntervals_NO_56_Tests {
	private long timer = 0l;

	public MergeIntervals_NO_56 solution = new MergeIntervals_NO_56();

	@BeforeEach
	public void init() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " started");
		timer = System.nanoTime();
	}

	@AfterEach
	public void afterEach() {
		System.out.println(
				"JUNIT for " + this.getClass().getSimpleName() + " completed in " + (System.nanoTime() - timer) + "ns");
	}

	/**
	 * Tests provided by LeetCode
	 */
	@Test
	public void testCanCompleteCircuit_given() {
		{
			int[][] input = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}

		{
			int[][] input = new int[][] { { 1, 4 }, { 4, 5 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 5 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}
	}

	/**
	 * Tests added by the developer
	 */
	@Test
	public void testCanCompleteCircuit_added() {
		{
			int[][] input = new int[][] { { 1, 3 }, { 3, 6 }, { 6, 15 }, { 15, 18 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 18 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}

		{
			int[][] input = new int[][] { { 1, 4 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 4 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}

		{
			int[][] input = new int[][] { { 1, 4 }, { 5, 11 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 4 }, { 5, 11 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}

		{
			int[][] input = new int[][] { { 1, 4 }, { 4, 12 }, { 5, 11 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 12 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}

		{
			int[][] input = new int[][] { { 1, 4 }, { 4, 12 }, { 15, 21 }, { 24, 30 }, { 25, 40 } };
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 12 }, { 15, 21 }, { 24, 40 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}
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
		{
			int[][] input = new int[][] { { 1, 4 }, { 0, 4 }};
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 0, 4 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}
		
		{
			int[][] input = new int[][] { { 1, 4 }, { 0, 5 }};
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 0, 5 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}
		
		{
			int[][] input = new int[][] { { 2, 3 }, { 4, 5 }, { 6, 7}, {1, 10}};
			int[][] output = solution.merge(input);
			int[][] expected = new int[][] { { 1, 10 } };

			String message = "Numbers: " + Arrays.deepToString(input) + "; result: " + Arrays.deepToString(output)
					+ "; expected: " + Arrays.deepToString(expected);

			assertTrue(quickCompare(output, expected), message);
		}
	}

	private boolean quickCompare(int[][] a, int[][] b) {
		try {
			for (int i = 0; i < b.length; i++) {
				if ((a[i][0] != b[i][0]) || a[i][1] != b[i][1]) {
					return false;
				}
			}
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}
