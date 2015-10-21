package add.two.nums;

import java.util.Stack;


//  Definition for singly-linked list.

 
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	Stack<ListNode> s1 = new Stack<ListNode>();
        Stack<ListNode> s2 = new Stack<ListNode>();
        long num1 = 0;
        long num2 = 0;
        ListNode temp = l1;
        int order = 0;
        while(temp != null){
            num1 += Math.pow(10, order) * temp.val;
            order++;
            temp = temp.next;
        }
        temp = l2;
        order = 0;
        while(temp != null){
            num2 += Math.pow(10, order) * temp.val;
            order++;
            temp = temp.next;
        }
        
        long sum = num1 + num2;
        String sumStr = String.valueOf(sum);
        int n = sumStr.length();
        ListNode start = new ListNode(Integer.parseInt(String.valueOf(sumStr.charAt(n-1))));
        temp = start;
        for ( int i = n-2; i >= 0; i--){
            ListNode next = new ListNode(Integer.parseInt(String.valueOf(sumStr.charAt(i))));
            temp.next = next;
            temp = next;
        }
        return start;
    }
}
