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
public class LengthofLongestFibonacciSubsequence_NO_873_Tests {
	private long timer = 0l;
	
	public LengthofLongestFibonacciSubsequence_NO_873 solution = new LengthofLongestFibonacciSubsequence_NO_873();
	
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
			int[] arr = new int[] {1,2,3,4,5,6,7,8};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(5, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,3,7,11,12,14,18};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(3, solution.lenLongestFibSubseq(arr), explanation);
		}


	}
	
	/**
	 * Tests added by the developer
	 */
	@Test
	public void test_added() {
		{
			int[] arr = new int[] {10,11,12,13,14,15};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(0, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,3,4,7,11,18};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(6, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {0,3,4,7,11,18};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(5, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,3,4,7,11,20};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(5, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,3,4,7,20,30,50,80,130};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(5, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,3,4,7,11,30,50,80,130};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(5, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,2,3,4,5,30,50,80,130,500,501,502,503};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(4, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,2,3};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(3, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {1,4,6};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(0, solution.lenLongestFibSubseq(arr), explanation);
		}
	}
	
	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void test_negative() {
		{
			int[] arr = new int[] {1,3};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(0, solution.lenLongestFibSubseq(arr), explanation);
		}

		{
			int[] arr = new int[] {};

			String explanation = "Result did not match for the following input: " + Arrays.toString(arr);
			Assertions.assertEquals(0, solution.lenLongestFibSubseq(arr), explanation);
		}
	}
	
	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void test_reruns() {
		
	}
}
