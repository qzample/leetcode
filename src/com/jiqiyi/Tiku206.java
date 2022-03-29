package com.jiqiyi;

import java.util.Stack;

public class Tiku206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		reverseList3(node1);
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
    
    
    
    
    
    
    
    
    
    /*
     * the third time to practice
     * recursion's solution
     * **/
    public static ListNode reverseList3(ListNode head) {
    	if(head==null || head.next==null) return head;
    	ListNode tail = head;
        while (tail!=null && tail.next!=null) {
			tail = tail.next;
		}
        reverse(head);
        head.next = null;
        return tail;
    }
    
    public static ListNode reverse(ListNode head) {
    	if(head==null || head.next==null) return head;
        reverse(head.next).next = head;
        return head;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
