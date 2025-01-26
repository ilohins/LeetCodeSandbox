package dev.ilswe.leetcode.solutions.mmxxv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Template class for testing, could be added as "Live Templates" to IDE
 * 
 * Includes performance testing in nano seconds
 */
public class LongestSubstringWithoutRepeatingCharacters_NO_3_Tests {
	private long timer = 0l;

	public LongestSubstringWithoutRepeatingCharacters_NO_3 solution = new LongestSubstringWithoutRepeatingCharacters_NO_3();

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
			String input = "abcabcbb";
			int result = 3;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}

		{
			String input = "bbbbb";
			int result = 1;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}

		{
			String input = "pwwkew";
			int result = 3;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}
	}

	/**
	 * Tests added by the developer
	 */
	@Test
	public void testCanCompleteCircuit_added() {
		{
			String input = "abcde12345^&*()aqwerty";
			int result = 17;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}

		{
			String input = "abcde12345^&*()5qwerty";
			int result = 15;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}

		{
			String input = "";
			int result = 0;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}

		{
			String input = "*****";
			int result = 1;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}

		{
			String input = "123456";
			int result = 6;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
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
			String input = " ";
			int result = 1;

			assertEquals(result, solution.lengthOfLongestSubstring(input));
		}
	}
}
