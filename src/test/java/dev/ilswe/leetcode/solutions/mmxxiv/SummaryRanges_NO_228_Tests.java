package dev.ilswe.leetcode.solutions.mmxxiv;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ilswe.leetcode.solutions.mmxxiv.SummaryRanges_NO_228;

/**
 * Template class for testing, could be added as "Live Templates" to IDE
 * 
 * Includes performance testing in nano seconds
 */
public class SummaryRanges_NO_228_Tests {
	private long timer = 0l;

	public SummaryRanges_NO_228 solution = new SummaryRanges_NO_228();

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
			int[] input = new int[] { 0, 1, 2, 4, 5, 7 };
			List<String> result = solution.summaryRanges(input);
			List<String> expected = Arrays.asList("0->2", "4->5", "7");
			
			String message = "Numbers: " + Arrays.toString(input) + "; result: " + Arrays.toString(result.toArray()) + "; expected: "
					+ Arrays.toString(expected.toArray());

			assertTrue((expected.containsAll(result) && result.containsAll(expected)), message);
		}

		{
			int[] input = new int[] { 0, 2, 3, 4, 6, 8, 9 };
			List<String> result = solution.summaryRanges(input);
			List<String> expected = Arrays.asList("0", "2->4", "6", "8->9");

			String message = "Numbers: " + Arrays.toString(input) + "; result: " + Arrays.toString(result.toArray()) + "; expected: "
					+ Arrays.toString(expected.toArray());

			assertTrue((expected.containsAll(result) && result.containsAll(expected)), message);
		}
	}

	/**
	 * Tests added by the developer
	 */
	@Test
	public void testCanCompleteCircuit_added() {
		{
			int[] input = new int[] { 0, 1, 2, 3, 4};
			List<String> result = solution.summaryRanges(input);
			List<String> expected = Arrays.asList("0->4");

			String message = "Numbers: " + Arrays.toString(input) + "; result: " + Arrays.toString(result.toArray()) + "; expected: "
					+ Arrays.toString(expected.toArray());

			assertTrue((expected.containsAll(result) && result.containsAll(expected)), message);
		}


		{
			int[] input = new int[] { 0, 2, 4, 6, 8, 10 };
			List<String> result = solution.summaryRanges(input);
			List<String> expected = Arrays.asList("0", "2", "4", "6", "8", "10");

			String message = "Numbers: " + Arrays.toString(input) + "; result: " + Arrays.toString(result.toArray()) + "; expected: "
					+ Arrays.toString(expected.toArray());

			assertTrue((expected.containsAll(result) && result.containsAll(expected)), message);
		}
		
		{
			int[] input = new int[] { 1, 2, 3, 4, 6, 7, 8, 9 };
			List<String> result = solution.summaryRanges(input);
			List<String> expected = Arrays.asList("1->4", "6->9");

			String message = "Numbers: " + Arrays.toString(input) + "; result: " + Arrays.toString(result.toArray()) + "; expected: "
					+ Arrays.toString(expected.toArray());

			assertTrue((expected.containsAll(result) && result.containsAll(expected)), message);
		}
	}

	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void testCanCompleteCircuit_negative() {
		{
			int[] input = new int[] { };
			List<String> result = solution.summaryRanges(input);

			assertTrue((result.isEmpty()), "Result not empty");
		}
		
		{
			int[] input = new int[] {1};
			List<String> result = solution.summaryRanges(input);

			assertTrue(result.size() == 1 && "1".equals(result.get(0)), "Single element test");
		}
	}

	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void testCanCompleteCircuit_reruns() {

	}
}
