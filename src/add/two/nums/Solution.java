package add.two.nums;

import java.util.Stack;


//  Definition for singly-linked list.

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 
 * @author Yi Xia
 * @date Oct 22, 2015
 *
 */
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
