package com.jiqiyi;

import java.util.Stack;

public class Tiku206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = head;
		while(cur != null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
	
	// stack solution
    public ListNode reverseList1(ListNode head) {
    	if(head==null) return null;
    	Stack<ListNode> stack = new Stack<ListNode>();
    	while(head!=null) {
    		stack.push(head);
    		head = head.next;
    	}
    	head = stack.pop();
    	head.next = null;
    	ListNode ptr = head;    	
    	while (!stack.isEmpty()) {
			ListNode item = stack.pop();
			ptr.next = item;
			ptr = item;
			ptr.next = null;
		}
    	return head;
    }
    
    class ListNode {
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
		ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

}
