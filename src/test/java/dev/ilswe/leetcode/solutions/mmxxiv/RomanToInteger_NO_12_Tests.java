package dev.ilswe.leetcode.solutions.mmxxiv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ilswe.leetcode.solutions.mmxxiv.IntegerToRoman_NO_12;

public class RomanToInteger_NO_12_Tests {

	private long timer = 0l;

	public IntegerToRoman_NO_12 solution = new IntegerToRoman_NO_12();

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

	/**
	 * Tests provided by LeetCode
	 */
	@Test
	public void testRomanToInt_given() {
		assertEquals(solution.intToRoman(3749), "MMMDCCXLIX");

		assertEquals(solution.intToRoman(58), "LVIII");

		assertEquals(solution.intToRoman(1994), "MCMXCIV");
	}

	/**
	 * Tests added by the developer
	 */
	@Test
	public void testRomanToInt_added() {
		assertEquals(solution.intToRoman(1), "I");
		assertEquals(solution.intToRoman(100), "C");
		assertEquals(solution.intToRoman(99), "XCIX");
		assertEquals(solution.intToRoman(94), "XCIV");
		assertEquals(solution.intToRoman(61), "LXI");
		assertEquals(solution.intToRoman(59), "LIX");
		assertEquals(solution.intToRoman(43), "XLIII");
		assertEquals(solution.intToRoman(29), "XXIX");
		assertEquals(solution.intToRoman(88), "LXXXVIII");
		assertEquals(solution.intToRoman(3999), "MMMCMXCIX");
		assertEquals(solution.intToRoman(3888), "MMMDCCCLXXXVIII");

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
