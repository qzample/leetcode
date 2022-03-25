package com.jiqiyi;

import java.util.List;

public class Tiku559 {
	int max=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// N-Tree's depth
	public int maxDepth(Node root) {
        dfs(root, 0);
        return max;
    }
	
	public void dfs(Node root,int cur) {
		if(root==null) return;
		cur++;
		max = cur>max?cur:max;
		List<Node> children = root.children;
		for(Node child:children) {
			dfs(child, cur);
		}
	}

}
