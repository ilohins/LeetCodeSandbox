package dev.ilswe.leetcode.solutions.mmxxv;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Template class for testing, could be added as "Live Templates" to IDE
 * 
 * Includes performance testing in nano seconds
 */
public class MedianOfTwoSortedArrays_NO_4_Tests {
	private long timer = 0l;
	
	public MedianOfTwoSortedArrays_NO_4 solution = new MedianOfTwoSortedArrays_NO_4();
	
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
			int[]
					aArr = {1,3},
					bArr = {2};
			double result = 2.0;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}

		{
			int[]
					aArr = {1,2},
					bArr = {3,4};
			double result = 2.5;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}
	}
	
	/**
	 * Tests added by the developer
	 */
	@Test
	public void test_added() {
		{
			int[]
					aArr = {},
					bArr = {1};
			double result = 1;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}

		{
			int[]
					aArr = {1,2,3},
					bArr = {};
			double result = 2;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}

		{
			int[]
					aArr = {-999,-55, 0, 123},
					bArr = {-555};
			double result = -55;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}

		{
			int[]
					aArr = {-999,-55, 0, 123},
					bArr = {-555, -200};
			double result = -127.5;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}
	}
	
	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void test_negative() {
		{
			int[]
					aArr = {},
					bArr = {};
			double result = 0.0;
			assertEquals(result, solution.findMedianSortedArrays(aArr,bArr));
		}
	}
	
	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void test_reruns() {
		
	}

	@Test
	public void test_misc() {
		int[] a = {1,2,4,5,10};
		int[] b = {0,3,4,5,6,7,8,9};

		TwoSortedArraysIterator it = new TwoSortedArraysIterator(a,b);


		List<Integer> collection = new ArrayList<>();
		it.forEachRemaining(collection::add);

		assertEquals(a.length + b.length, collection.size());
		assertArrayEquals(new int[]{0, 1, 2, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10},
				collection.stream().mapToInt(Integer::intValue).toArray());
	}
}
