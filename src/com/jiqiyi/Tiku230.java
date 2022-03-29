package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku230 {
	int count=0;
	int res;
    public int kthSmallest(TreeNode root, int k) {
        dfs(root, k);
		return res;
    }
	
	public void dfs(TreeNode root,int k) {
		if(root==null) return;
		dfs(root.left,k);
		// do something with root
		if(++count==k) {
			res=root.val;
			return;
		}
		dfs(root.right,k);
	}
}
