package com.jiqiyi;

public class Tiku104 {

	public static int count;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		TreeNode t1 = new TreeNode(9);
		root.left = t1;
		TreeNode t2 = new TreeNode(20);
		root.right = t2;
		t1.left = null;
		t2.right = null;
		TreeNode t3 = new TreeNode(15);
		t2.left = t3;
		TreeNode t4 = new TreeNode(7);
		t2.right = t4;
		maxDepth(root);
	}
	
	
	public static int maxDepth(TreeNode root) {
		dfs(root, 0);
		return count;
    }
	
	public static void dfs(TreeNode node, int depth) {
		if(node != null) {
			TreeNode left = node.left;
			TreeNode right = node.right;
			dfs(left,depth+1);
			dfs(right,depth+1);
		}
		count = count > depth ? count : depth;
	}

}
