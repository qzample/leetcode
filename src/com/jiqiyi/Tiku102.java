package com.jiqiyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Tiku102 {

	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);		
		TreeNode l1 = new TreeNode(9);
		l1.left = null;
		l1.right = null;
		TreeNode l2 = new TreeNode(20);
		root.left = l1;
		root.right = l2;
		TreeNode l3 = new TreeNode(15);
		TreeNode l4 = new TreeNode(7);
		l2.left = l3;
		l2.right = l4;
		levelOrder(root);
	}
	
	public static List<List<Integer>> levelOrder(TreeNode root) {		
		if(root==null) return new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		TreeNode node;
		int num = 0;
		while (!queue.isEmpty()) {
			num = queue.size();
			while (num-->0) {
				node = queue.poll();
				list.add(node.val);
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
			}
			res.add(new ArrayList<Integer>(list));
			list.clear();
			
		}
		return res;
    }
	
	public static void bfs(TreeNode node) {
		if(node == null) return;		
		list.add(node.val);
		bfs(node.left);
		bfs(node.right);		
		res.add(new ArrayList<Integer>(list));
		list.clear();
	}

}
