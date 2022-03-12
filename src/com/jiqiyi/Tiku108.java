package com.jiqiyi;

public class Tiku108 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-10,-3,0,5,9};
		sortedArrayToBST(nums);
	}
	
	
	/**
	 * to the BST binary search Tree
	 * inOrder output the ordered nums
	 * */
	public static TreeNode sortedArrayToBST(int[] nums) {
		return sortedArrayToBST(nums, 0, nums.length-1);
    }
	
	public static TreeNode sortedArrayToBST(int[] nums,int left,int right) {
		if(left>right) {
			return null;
		}
		int mid = (left+right)/2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = sortedArrayToBST(nums,left,mid-1);
		node.right = sortedArrayToBST(nums,mid+1,right);
		return node;
	}
}
