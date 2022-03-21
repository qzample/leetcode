package com.jiqiyi;

class MinStack {
    private ListNode head;
    public MinStack() {
        head = new ListNode(Integer.MAX_VALUE);
    }
    
    public void push(int val) {
        ListNode node = new ListNode(val);
        ListNode ptr = head;
        head.val = head.val > node.val ? node.val : head.val;
        while (ptr.next!=null) {
    		ptr = ptr.next;
		}
    	ptr.next = node;
    	node.next = null;
    }
    
    public void pop() {
        if(isEmpty()) {
        	throw new NullPointerException("stack is empty...");
        }
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        int min = Integer.MAX_VALUE;
        while (ptr2!=null && ptr2.next!=null) {
			ptr1 = ptr1.next;
			min = min > ptr1.val ? ptr1.val : min;
			ptr2 = ptr2.next;
		}
        ptr1.next = null;
        head.val = min;
    }
    
    public int top() {
    	if(isEmpty()) {
    		throw new NullPointerException("stack is empty...");
    	}
    	ListNode ptr = head;
    	while (ptr.next!=null) {
    		ptr = ptr.next;
		}
    	return ptr.val;
    }
    
    public int getMin() {
    	if(isEmpty()) {
    		throw new NullPointerException("stack is empty...");
    	}
        return head.val;
    }
    
    public boolean isEmpty() {
    	return head.next==null;
    }
}
