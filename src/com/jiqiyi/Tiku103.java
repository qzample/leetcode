package com.jiqiyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Tiku103 {
	List<List<Integer>> list = new ArrayList<List<Integer>>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		bfs(root);
		return list;
    }
	
	public void bfs(TreeNode root) {
		if(root==null) return;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int flag = 1;
		while (!queue.isEmpty()) {
			int n = queue.size();
			List<Integer> tmp = new ArrayList<Integer>();
			for(int i=0;i<n;i++) {
				TreeNode node = queue.poll();
				if(flag==1) {
					tmp.add(node.val);
				}
				else {
					tmp.add(0,node.val);
				}
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
			}
			list.add(tmp);
			flag = -flag;
		}
	}

}
