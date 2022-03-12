package com.jiqiyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Tiku589 {
	
	List<Integer> res = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// recursion's solution
	public List<Integer> preorder1(Node root) {
		dfs(root);
		return res;
    }
	
	public void dfs(Node node) {
		if(node==null) {
			return;
		}
		res.add(node.val);
		List<Node> childNodes = node.children;
		for (Node child : childNodes) {
			dfs(child);
		}
	}
	
	
	// iterate's solution
	public List<Integer> preorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		if(root == null) return res;
		stack.add(root);
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			res.add(node.val);
			List<Node> childNodes = node.children;
			for(int i=childNodes.size()-1;i>=0;i--) {
				stack.add(childNodes.get(i));
			}
		}
		return res;
    }

}