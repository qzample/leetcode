package com.jiqiyi;

import java.util.HashSet;
import java.util.Set;

public class Tiku141 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	// fast and slow pointer's solution
	public boolean hasCycle1(ListNode head) {
		if(head == null) return false;
		ListNode fast = head.next,slow = head;
		while (fast!=null && fast.next != null) {
			if(fast == slow) return true;
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
    }
	
	// hashset's solution
	public boolean hasCycle(ListNode head) {
		Set<ListNode> set = new HashSet<ListNode>();
		int length = 0;
		while (head!=null) {
			set.add(head);
			if(length == set.size()) {
				return true;
			}
			length = set.size();
			head = head.next;
		}
		return false;
	}

}
