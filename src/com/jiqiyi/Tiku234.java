package com.jiqiyi;

import java.util.Stack;

public class Tiku234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(3);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(1);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = null;
		isPalindrome(l1);
	}
	
	// memory out of limit
	public boolean isPalindrome1(ListNode head) {
		if(head==null) return true;
		Stack<ListNode> stack = new Stack<ListNode>();
		ListNode node = head;
		while(node!=null) {
			stack.push(node);
		}
		while (!stack.isEmpty()) {
			if(head.val!=stack.pop().val) {
				return false;
			}
			head = head.next;
		}
		return true;
    }
	
	// reverse the last half of linklist
	public static boolean isPalindrome(ListNode head) {
		if(head==null || head.next==null) return true;
		ListNode slow = head,fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast!=null) {
			slow = slow.next;
		}
		slow = reverse(slow);
		fast = head;		
		while (slow!=null) {
			if(slow.val!=fast.val) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	
	public static ListNode reverse(ListNode head) {
		ListNode pre = null;		
		ListNode next = null;
		while (head!=null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}

}
