package dev.ilswe.leetcode.solutions.mmxxiv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ilswe.leetcode.solutions.mmxxiv.RomanToInteger_NO_13;

public class RomanToInteger_NO_13_Tests {

	private long timer = 0l;

	public RomanToInteger_NO_13 solution = new RomanToInteger_NO_13();

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
	public void testRomanToInt_given() {
		assertEquals(solution.romanToInt("III"), 3);

		assertEquals(solution.romanToInt("LVIII"), 58);

		assertEquals(solution.romanToInt("MCMXCIV"), 1994);
	}

	/**
	 * Tests added by the developer
	 */
	@Test
	public void testRomanToInt_added() {
		assertEquals(solution.romanToInt("I"), 1);
		
		assertEquals(solution.romanToInt("C"), 100);

		
		assertEquals(solution.romanToInt("XCIX"), 99);

		
		assertEquals(solution.romanToInt("XCIV"), 94);

		
		assertEquals(solution.romanToInt("LXI"), 61);

		
		assertEquals(solution.romanToInt("LIX"), 59);

		
		assertEquals(solution.romanToInt("XLIII"), 43);

		
		assertEquals(solution.romanToInt("XXIX"), 29);

		
		assertEquals(solution.romanToInt("LXXXVIII"), 88);
		
		
		assertEquals(solution.romanToInt("MMMCMXCIX"), 3999);
		

		assertEquals(solution.romanToInt("MMMDCCCLXXXVIII"), 3888);

	}

	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void testRomanToInt_negative() {

	}

	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void testRomanToInt_reruns() {

	}

}
