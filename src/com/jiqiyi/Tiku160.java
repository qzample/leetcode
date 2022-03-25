package com.jiqiyi;

import java.util.HashSet;
import java.util.Set;

public class Tiku160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(6);
		ListNode l3 = new ListNode(4);
		l1.next = l2;
		l2.next = l3;
		
		ListNode l4 = new ListNode(1);
		ListNode l5 = new ListNode(5);
		l4.next = l5;
		getIntersectionNode(l1, l4);
	}
	
	public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<ListNode>();
		while (headA!=null) {
			set.add(headA);
			headA = headA.next;
		}
		while (headB!=null) {
			if(set.contains(headB)) return headB;
			set.add(headB);
			headB = headB.next;
		}
		return null;
    }
	
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		ListNode ptrA=headA,ptrB=headB;
		while (ptrA!=ptrB) {
			ptrA = ptrA==null?headB:ptrA.next;
			ptrB = ptrB==null?headA:ptrB.next;
		}
		return ptrA;
	}

}
