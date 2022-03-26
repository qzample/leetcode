package com.jiqiyi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tiku116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node1 root = new Node1();
		root.val = 1;
		Node1 node2 = new Node1();
		node2.val = 2;
		Node1 node3 = new Node1();
		node3.val = 3;
		Node1 node4 = new Node1();
		node4.val = 4;
		Node1 node5 = new Node1();
		node5.val = 5;
		Node1 node6 = new Node1();
		node6.val = 6;
		Node1 node7 = new Node1();
		node7.val = 7;
		root.left = node2;
		root.right = node3;
		node2.left = node4;
		node2.right = node5;
		node3.left = node6;
		node3.right = node7;
		connect(root);
	}
	
	public static Node1 connect(Node1 root) {
        if(root==null || root.left==null) return null;
        root.left.next = root.right;
        if(root.next!=null) {
        	root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// the second time to practice
	public Node1 connect2(Node1 root) {
		if(root==null || root.left==null) return root;
        root.left.next = root.right;
        if(root.next!=null) {
        	root.right.next = root.next.left;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
	
	
	
	
	

}

class Node1 {
	int val;
	Node1 left;
	Node1 right;
	Node1 next;
}
