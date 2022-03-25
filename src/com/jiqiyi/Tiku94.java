package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Tiku94 {

	List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<Integer> inorderTraversal1(TreeNode root) {
		dfs(root);
		return list;
    }
	
	public void dfs(TreeNode node) {
		if(node==null) return;
		dfs(node.left);
		list.add(node.val);
		dfs(node.right);
	}
	
	// iteration's solution
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		while (!stack.isEmpty() || root!=null) {
			if(root!=null) {
				stack.add(root);
				root = root.left;
			}
			else {
				TreeNode node = stack.pop();
				res.add(node.val);
				root = node.right;
			}
		}
		return res;
	}

}
