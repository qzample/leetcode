package com.jiqiyi;

public class Tiku21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode ptr = dummy;
		while(list1!=null && list2!=null) {
			if(list1.val<=list2.val) {
				ptr.next = list1;
				list1 = list1.next;				
			}
			else {
				ptr.next = list2;
				list2 = list2.next;				
			}
            ptr = ptr.next;
		}
		ptr.next = list1 != null ? list1 : list2;
		return dummy.next;
    }
	
	
	
	
	
	
	/*
	 * the second time to practice 
	 * **/
	public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode ptr = dummy;
		while (list1!=null && list2!=null) {
			if(list1.val<list2.val) {
				ptr.next = list1;
				ptr = ptr.next;
				list1 = list1.next;
			}
			else {
				ptr.next = list2;
				ptr = ptr.next;
				list2 = list2.next;
			}
		}
		ptr.next = list1!=null ? list1 : list2;
		return dummy.next;
    }
	
	
	
	
	
	
	
}
