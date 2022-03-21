package com.jiqiyi;

public class Tiku606 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static String tree2str(TreeNode root) {
		dfs(root);
		return sb.toString();
    }
	
	public static void dfs(TreeNode node) {
		if(node==null) {
			return;
		}
		// do something with the node
		sb.append(node.val);
		if(node.left==null) {
			if(node.right!=null) {
				sb.append("(");
				dfs(node.right);
				sb.append(")");
			}
		}
		else {
			sb.append("(");
			dfs(node.left);
			sb.append(")");
		}
		if(node.right!=null) {
			sb.append("(");
			dfs(node.right);
			sb.append(")");
		}
	}

}
