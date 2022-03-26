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
    
    
    
    
    
    
    
    
    
    /*
     * the second time to practice
     * **/
    public ListNode reverseList2(ListNode head) {
    	Stack<ListNode> stack = new Stack<ListNode>();
    	while (head!=null) {
			stack.push(head);
			head = head.next;
		}
    	ListNode dummy = new ListNode();
    	ListNode ptr = dummy;
    	while (!stack.isEmpty()) {
    		ptr.next = stack.pop();
			ptr = ptr.next;
		}
    	ptr.next = null;
    	return dummy.next;
    }
    
    /*
     * the second time to practice 
     * three pointer's solution
     * **/
    public ListNode reverseList21(ListNode head) {
    	ListNode pre = null,cur=head,next;
    	while (cur!=null && cur.next!=null) {
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
			next =next.next;
		}
    	return cur;
    }
    
    
    
    
    
    
    
    
    
    
}
