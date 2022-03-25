package com.jiqiyi;

public class Tiku83 {
	
	public ListNode deleteDuplicates(ListNode head) {
		if(head==null) return head;
		ListNode ptr1 = head;
		ListNode ptr2 = head.next;
		while (ptr2!=null) {
			if(ptr1.val==ptr2.val) {
				ptr1.next = ptr2.next;
			}
			else {
				ptr1 = ptr1.next;
			}
			ptr2 = ptr2.next;
		}
		return head;
    }
	
}
