package dev.ilswe.leetcode.solutions.mmxxv;

/*
 * 
 * LC Results: 100% runtime, 25% memory. 
 * Future improvements: Nodes could be reused to preserve memory 
 */
public class AddTwoNumbers_NO_2 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		return addTwoNumbers(null, l1, l2, false);
	}
	
	public ListNode addTwoNumbers(ListNode result, ListNode l1, ListNode l2, boolean carryOver) {
		
		if(l1 == null && l2 == null) {
			if(carryOver) {
				result.next = new ListNode(1);
			}
			
			return result;
		}
		
		if(result == null) {
			result = new ListNode(sumTwoListNodes(l1, l2));
		} else {
			result.next = new ListNode(sumTwoListNodes(l1, l2));
			result = result.next;
		}
		
		if(carryOver) {
			result.val = result.val + 1;
		}
		
		carryOver = false;
		if(result.val > 9) {
			result.val = result.val % 10;
			carryOver = true;
		}
		
		addTwoNumbers(result, l1 == null ? null : l1.next, l2 == null ? null : l2.next, carryOver);

		return result;
	}

	private int sumTwoListNodes(ListNode l1, ListNode l2) {
		return (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val);
	}
	
	
}

//provided class structure
class ListNode {
	int val;
	ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}