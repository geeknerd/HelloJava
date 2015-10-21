package add.two.nums;

public class TestSolution {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9);
		ListNode l2 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next.next.next.next = new ListNode(9);
		
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);
		l2.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next = new ListNode(9);
		l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
		
		Solution s = new Solution();
		ListNode result = s.addTwoNumbers(l1, l2);
		System.out.println(result.val);
	}

}
