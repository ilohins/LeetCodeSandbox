package dev.ilswe.leetcode.solutions.mmxxiv;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.ilswe.leetcode.solutions.mmxxiv.ValidPalindrome_NO_125;

public class ValidPalindrome_NO_125_Tests {
	private long timer = 0l;
	
	public ValidPalindrome_NO_125 solution = new ValidPalindrome_NO_125();
	
	@BeforeEach
	public void init() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " started");
		timer = System.currentTimeMillis();
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("JUNIT for " + this.getClass().getSimpleName() + " completed in " + (System.currentTimeMillis() - timer) + "ms");
	}
	
	@Test
	public void testCanCompleteCircuit_given() {
		assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
		assertFalse(solution.isPalindrome("race a car"));
		assertTrue(solution.isPalindrome(" "));
	}
	
	@Test
	public void testCanCompleteCircuit_added() {
		
	}
	 
	@Test
	public void testCanCompleteCircuit_negative() {
		
	}
	
	@Test
	public void testCanCompleteCircuit_reruns() {
		
	}
}
