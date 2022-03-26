package com.jiqiyi;

public class Tiku617 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,3,2,5]
		//[2,1,3,null,4,null,7]
		TreeNode root1 = new TreeNode(1);
		TreeNode tmp = new TreeNode(3);
		root1.left = tmp;
		tmp.left = new TreeNode(5);
		root1.right = new TreeNode(2);
		
		TreeNode root2 = new TreeNode(2);
		tmp = new TreeNode(1);
		root2.left = tmp;
		tmp.right = new TreeNode(4);
		tmp = new TreeNode(3);
		root2.right = tmp;
		tmp.right = new TreeNode(7);
		mergeTrees(root1, root2);
	}
	
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		return dfs(root1, root2);
    }
	
	public static TreeNode dfs(TreeNode root1,TreeNode root2) {
		if(root1==null && root2==null) return null;
		TreeNode node;
		if(root1!=null) {
			if(root2!=null) {
				node = new TreeNode(root1.val+root2.val);
				node.left = dfs(root1.left, root2.left);
				node.right = dfs(root1.right, root2.right);
			}
			else {
				node = new TreeNode(root1.val);
				node.left = dfs(root1.left, null);
				node.right = dfs(root1.right, null);
			}
		}
		else {
			node = new TreeNode(root2.val);
			node.left = dfs(null, root2.left);
			node.right = dfs(null, root2.right);
		}
		return node;
	}
	
	public static TreeNode mergeTrees1(TreeNode root1, TreeNode root2) {
		if(root1==null) return root2;
		if(root2==null) return root1;
		TreeNode node = new TreeNode();
		node.val = root1.val+root2.val;
		node.left = mergeTrees(root1.left, root2.left);
		node.right = mergeTrees(root1.right, root2.right);
		return node;
	}
	
	
	
	
	
	
	
	
	
	// the second round
	// practice the bfs's solution
	public TreeNode mergeTrees2(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
		TreeNode node = new TreeNode(root1.val+root2.val);
        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);
        return node;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
