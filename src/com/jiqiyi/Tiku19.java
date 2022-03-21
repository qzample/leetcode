package com.jiqiyi;

public class Tiku19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode removeNthFromEnd1(ListNode head, int n) {
		ListNode fast = head;
		ListNode slow = head;
		if(n==1) {
			if(head.next == null) return null;
			fast = slow.next;
			while(fast.next!=null) {
				fast = fast.next;
				slow = slow.next;
			}
			slow.next = null;
		}
		else {
			while (n>1) {
				fast = fast.next;
				n--;
			}
			while (fast.next!=null) {
				fast = fast.next;
				slow = slow.next;
			}			
			slow.val = slow.next.val;
			slow.next = slow.next.next;
		}
		return head;
    }
	
	
	
	
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode fast = head,slow = head;
        while(n>0){
            fast = fast.next;
            n--;
        }
        while(fast!=null && fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        if(fast==null) {
        	return head.next;
        }
        else {
        	// prepare to remove slow.next
            slow.next = slow.next.next;
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
