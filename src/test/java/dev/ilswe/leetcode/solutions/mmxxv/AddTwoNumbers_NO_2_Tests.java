package dev.ilswe.leetcode.solutions.mmxxv;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddTwoNumbers_NO_2_Tests {
	private long timer = 0l;

	public AddTwoNumbers_NO_2 solution = new AddTwoNumbers_NO_2();

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
	public void test_given() {
		{
			String value1 = "342";
			String value2 = "465";
			String result = "807";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "0";
			String value2 = "0";
			String result = "0";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "9999999";
			String value2 = "9999";
			String result = "10009998";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}
	}

	/**
	 * Tests added by the developer
	 */
	@Test
	public void test_added() {
		{
			String value1 = "0";
			String value2 = "9999999999";
			String result = "9999999999";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "9999999999";
			String value2 = "0";
			String result = "9999999999";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "9999999999";
			String value2 = "9999999999";
			String result = "19999999998";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "1111";
			String value2 = "2222";
			String result = "3333";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "111";
			String value2 = "222222";
			String result = "222333";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "222";
			String value2 = "111111";
			String result = "111333";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}

		{
			String value1 = "5";
			String value2 = "5";
			String result = "10";

			assertEquals(listNode2Array(string2ListNode(result)),
					listNode2Array(solution.addTwoNumbers(string2ListNode(value1), string2ListNode(value2))));
		}
	}

	/**
	 * Tests added by the developer to test unlikely scenarios
	 */
	@Test
	public void test_negative() {

	}

	/**
	 * Tests from failed LeetCode run debugs (except performance)
	 */
	@Test
	public void test_reruns() {

	}

	// Utility functions below

	private String listNode2Array(ListNode ln) {
		StringBuilder result = new StringBuilder();

		do {
			result.append(ln.val).append("_");
			ln = ln.next;
		} while (ln != null);

		return result.toString();
	}

	private ListNode string2ListNode(String number) {

		ListNode end = null;

		for (int i = 0; i < number.length(); i++) {
			int intValue = Character.getNumericValue(number.charAt(i));

			ListNode ln = new ListNode(intValue, end);

			end = ln;
		}

		return end;

	}

//	public static void main(String[] args) {
//		//testing utils
//		AddTwoNumbers_NO_2_Tests t = new AddTwoNumbers_NO_2_Tests();
//		
//		System.out.println(t.listNode2Array(t.string2ListNode("1234567")));
//		
//		
//	}
}
