package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku145 {
	List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Integer> postorderTraversal(TreeNode root) {
		postOrder(root);
		return list;
    }
	
	public void postOrder(TreeNode node) {
		if(node==null) return;
		postOrder(node.left);
		postOrder(node.right);
		list.add(node.val);
	}

}
