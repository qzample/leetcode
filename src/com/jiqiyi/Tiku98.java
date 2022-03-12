package com.jiqiyi;

public class Tiku98 {
	
	TreeNode prev = null;
	
	public boolean isValidBST1(TreeNode root) {
		return dfs(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
	
	// dfs with range
	public boolean dfs(TreeNode root,long min,long max) {
		if(root!=null) {
			if(root.left != null && (root.val<=root.left.val || root.left.val>=max)) return false;
			if(root.right != null && (root.val>=root.right.val || root.right.val<=min)) return false;
			return dfs(root.left,min,root.val) && dfs(root.right,root.val,max);
		}
		return true;
	}
	
	// medium order search
	public boolean isValidBST(TreeNode root) {		
		if(root==null) {
			return true;
		}
		if(!isValidBST(root.left)) {
			return false;
		}
		if(prev!=null && prev.val>=root.val) {
			return false;
		}
		prev = root;	
		if(!isValidBST(root.right)) {
			return false;
		}
		return true;
	}
}
