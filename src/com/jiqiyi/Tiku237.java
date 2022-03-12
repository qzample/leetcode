package com.jiqiyi;

public class Tiku237 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * kill A
	 * means kill A'next B
	 * let A to be B
	 * kill B
	 * */
	public void deleteNode(ListNode node) {        
		node.val = node.next.val;
		node.next = node.next.next;
    }
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	
	 public class ListNode {
		 int val;
		 ListNode next;
		 ListNode(int x) { val = x; }
	 }
}
