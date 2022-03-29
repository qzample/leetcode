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
	
	
	
	
	
	
	
	
	
	
	/*
	 * the third time to practice
	 * use the recursion's solution
	 * **/
	public ListNode mergeTwoLists3(ListNode list1, ListNode list2) {
		if(list1==null) return list2;
        if(list2==null) return list1;
        if(list1.val<list2.val) {
        	list1.next = mergeTwoLists3(list1.next, list2);
        	return list1;
        }
        else {
        	list2.next = mergeTwoLists3(list1, list2.next);
        	return list2;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
