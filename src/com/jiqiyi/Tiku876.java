package com.jiqiyi;

public class Tiku876 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode middleNode(ListNode head) {
		ListNode fast = head,slow = head;
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
    }

}
