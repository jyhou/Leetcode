package P21_MergeTwoSortedList;

public class Test {

	public static void main(String[] args) {
		Solution solve = new Solution();
		
		// test case 1
		ListNode l1 = new ListNode(6);
		ListNode l1t = l1;
		ListNode l2 = new ListNode(0);
		ListNode l2t = l2;
		ListNode temp;
		for (int i = 1; i <= 5; i++) {
			l1t.next = new ListNode(6+i);
			l1t = l1t.next;
			l2t.next = new ListNode(i);
			l2t = l2t.next;
		}
		
		ListNode l1p = l1;
		System.out.println("ListNode l1: ");
		while (l1p.next != null) {
			
			System.out.printf("%d\t", l1p.val);
			l1p = l1p.next;
		}
		System.out.printf("%d\t", l1p.val);
		
		ListNode l2p = l2;
		System.out.println("\nListNode l2: ");
		while (l2p.next != null) {
			
			System.out.printf("%d\t", l2p.val);
			l2p = l2p.next;
		}
		System.out.printf("%d\t", l2p.val);
		
		ListNode res = solve.mergeTwoLists(l1, l2);
		ListNode resp = res;
		System.out.println("\nMerged ListNode of l1 and l2: ");
		while (resp.next != null) {
			
			System.out.printf("%d\t", resp.val);
			resp = resp.next;
		}
		System.out.printf("%d\t", resp.val);
		
		// test case 2
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(30);
		l4.next = new ListNode(31);
		ListNode res2 = solve.mergeTwoLists(l3, l4);
		ListNode resp2 = res2;
		System.out.println("\nMerged ListNode of l3 and l4: ");
		while (resp2.next != null) {
			
			System.out.printf("%d\t", resp2.val);
			resp2 = resp2.next;
		}
		System.out.printf("%d\t", resp2.val);
	}

}
