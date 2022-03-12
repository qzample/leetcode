package com.jiqiyi;

public class Tiku101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSymmetric(TreeNode root) {
		if(root==null) return true;
		return isSymmetric(root.left, root.right);
    }
	
	public boolean isSymmetric(TreeNode left,TreeNode right) {		
		if(left!=null && right!=null && left.val==right.val) {
			return isSymmetric(left.left, right.right) && isSymmetric(left.right,right.left);
		}
		else if(left==null && right==null) {
			return true;
		}
		return false;
	}
}
