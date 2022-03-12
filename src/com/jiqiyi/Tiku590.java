package com.jiqiyi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Tiku590 {

	List<Integer> res = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// recursion's solution
	public List<Integer> postorder1(Node root) {
        dfs(root);
        return res;
    }
	
	public void dfs(Node node) {
		if(node==null) return;
		List<Node> childList = node.children;
		for(Node child:childList) {
			dfs(child);
		}
		res.add(node.val);
	}
	
	// stack's solution
	public List<Integer> postorder(Node root) {
		Stack<Node> stack = new Stack<Node>();
		int n = 0;
		if(root==null) return res;
		stack.add(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			res.add(node.val);
			List<Node> childList = node.children;
			for(int i=0,j=childList.size();i<j-1;i++) {
				stack.add(childList.get(i));
			}
		}
		Collections.reverse(res);
		return res;
	}

}
