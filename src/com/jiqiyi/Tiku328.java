package com.jiqiyi;

public class Tiku328 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode oddEvenList(ListNode head) {
		if(head==null || head.next==null) return head;
		ListNode oddHead = head;
		ListNode oddCur = oddHead;
		ListNode evenHead = head.next;
		ListNode evenCur = evenHead;
		while (evenCur!=null && evenCur.next!=null) {
			oddCur.next = oddCur.next.next;
			evenCur.next = evenCur.next.next;
			oddCur = oddCur.next;
			evenCur = evenCur.next;
		}
		oddCur.next = evenHead;
		return oddHead;
    }

}
