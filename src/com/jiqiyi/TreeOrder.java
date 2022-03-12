package com.jiqiyi;

public class TreeOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// preOrder
	public static void dlr(TreeNode node) {
		if(node == null) return;
		// visit the parent node
		System.out.println(node.val);
		dlr(node.left);
		dlr(node.right);
	}
	
	// inOrder
	public static void ldr(TreeNode node) {
		if(node==null) return;
		ldr(node.left);
		// visit the left child node
		System.out.println(node.val);
		ldr(node.right);
	}
	
	// postOrder
	public static void lrd(TreeNode node) {
		if(node==null) return;
		ldr(node.left);
		ldr(node.right);
		// visit the right node
		System.out.println(node.val);
	}

}
