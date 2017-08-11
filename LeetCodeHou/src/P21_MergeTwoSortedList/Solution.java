package P21_MergeTwoSortedList;

/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 */


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
//	1st wrong understanding of the problem -- Reverse a ListNode
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if (l1 == null) return l2;
//		if (l2 == null) return l1;
//		ListNode cursor = l1;
//		ListNode temp;
//		while (l1.next != null) {
//			temp = l1;
//			cursor = l1.next;
//			temp.next = l2;
//			l2 = temp;
//			l1 = cursor;
//		}
//		l1.next = l2;
//		return l1;
//	}

// 	2nd wrong understanding of the problem -- simply splicing two ListNode without sorting
//	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		if (l1 == null) return l2;
//		if (l2 == null) return l1;
//		ListNode head = l1;
//		ListNode cursor = l1;
//		ListNode temp1;
//		ListNode temp2;
//		while (l1 != null && l2 != null && l1.next != null && l2.next != null) {
//			temp1 = l1.next;
//			temp2 = l2.next;
//			l1.next = l2;
//			l2.next = temp1;
//			l1 = temp1.next;
//			temp1.next = temp2;
//			cursor = temp2;
//			l2 = temp2.next;
//			cursor.next = l1;
//		}
//		if (l1 != null) cursor.next = l1;
//		if (l2 != null) cursor.next = l2;
//		return head;
//	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;
		ListNode head;
		
		if (l1.val <= l2.val) {
			head = l1;
			l1 = l1.next;
		} else {
			head = l2;
			l2 = l2.next;
		}
		ListNode cursor = head;

		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				cursor.next = l1;
				l1 = l1.next;
				cursor = cursor.next;
			} else {
				cursor.next = l2;
				l2 = l2.next;
				cursor = cursor.next;
			}
		}
		if (l1 != null) cursor.next = l1;
		if (l2 != null) cursor.next = l2;
		return head;
	}
}
