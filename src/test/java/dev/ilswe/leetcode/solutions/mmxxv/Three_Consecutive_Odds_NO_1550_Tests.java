package dev.ilswe.leetcode.solutions.mmxxv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * Template class for testing, could be added as "Live Templates" to IDE
 * 
 * Includes performance testing in nano seconds
 */
public class Three_Consecutive_Odds_NO_1550_Tests {
	private long timer = 0l;
	
	public Three_Consecutive_Odds_NO_1550 solution = new Three_Consecutive_Odds_NO_1550();
	
	@BeforeEach
	public void init() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " started");
		timer = System.nanoTime();
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " completed in " + (System.nanoTime() - timer) + "ns");
	}
	
	/**
	 * Tests provided by LeetCode
	 */
	@Test
	public void test_given() {
		{
			int[] input = new int[]{2,6,4,1};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
            Assertions.assertFalse(solution.threeConsecutiveOdds(input), explanation);
		}

		{
			int[] input = new int[]{1,2,34,3,4,5,7,23,12};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
            Assertions.assertTrue(solution.threeConsecutiveOdds(input), explanation);
		}
	}
	
	/**
	 * Tests added by the developer
	 */
	@Test
	public void test_added() {
		{
			int[] input = new int[]{1,2,3};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
			Assertions.assertFalse(solution.threeConsecutiveOdds(input), explanation);
		}

		{
			int[] input = new int[]{1,2,3,900,901,902};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
			Assertions.assertFalse(solution.threeConsecutiveOdds(input), explanation);
		}

		{
			int[] input = new int[]{1,2,3,900,901,903,905};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
			Assertions.assertTrue(solution.threeConsecutiveOdds(input), explanation);
		}

		{
			int[] input = new int[]{1,2,3,51,53,55,900,901,903,908};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
			Assertions.assertTrue(solution.threeConsecutiveOdds(input), explanation);
		}


	}
	
	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void test_negative() {
		{
			int[] input = new int[]{1};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
			Assertions.assertFalse(solution.threeConsecutiveOdds(input), explanation);
		}

		{
			int[] input = new int[]{1,2};

			String explanation = "Result did not match for the following input: " + Arrays.toString(input);
			Assertions.assertFalse(solution.threeConsecutiveOdds(input), explanation);
		}
	}
	
	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void test_reruns() {
		
	}
}
