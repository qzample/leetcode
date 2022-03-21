package com.jiqiyi;

public class Tiku2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry = 0;
		int sum = 0;
		ListNode res = new ListNode();
		ListNode ptr = res;
		while(l1!=null && l2!=null) {
			sum = l1.val+l2.val+carry;
			carry = sum/10;
			ListNode node = new ListNode(sum%10);
			ptr.next = node;
			ptr = ptr.next;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1!=null) {
			sum = l1.val+carry;
			carry = sum/10;
			ListNode node = new ListNode(sum%10);
			ptr.next = node;
			ptr = ptr.next;
			l1 = l1.next;
		}
		while (l2!=null) {
			sum = l2.val+carry;
			carry = sum/10;
			ListNode node = new ListNode(sum%10);
			ptr.next = node;
			ptr = ptr.next;
			l2 = l2.next;
		}
		if(carry!=0) {
			ListNode node = new ListNode(carry);
			ptr.next = node;
		}
		return res.next;
    }

}
