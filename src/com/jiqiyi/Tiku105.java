package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku105 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};
		buildTree(preorder, inorder);
	}
	
	public static TreeNode buildTree(int[] preorder, int[] inorder) {
		List<Integer> preOrdList = new ArrayList<Integer>();
		List<Integer> inOrdList = new ArrayList<Integer>();
		int n = preorder.length;
		for(int i=0;i<n;i++) {
			preOrdList.add(preorder[i]);
			inOrdList.add(inorder[i]);
		}
		return dfs(preOrdList, inOrdList);
    }
	
	public static TreeNode dfs(List<Integer> preOrdList,List<Integer> inOrdList) {
		if(preOrdList.size()==0 || inOrdList.size()==0) return null;
		TreeNode root = new TreeNode(preOrdList.get(0));
		preOrdList.remove(0);
		int mid = inOrdList.indexOf(root.val);
		root.left = dfs(preOrdList, inOrdList.subList(0, mid));
		root.right = dfs(preOrdList, inOrdList.subList(mid+1, inOrdList.size()));
		return root;
	}

}
