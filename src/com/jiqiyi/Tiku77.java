package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku77 {
	List<Integer> temp = new ArrayList<Integer>();
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	public List<List<Integer>> combine(int n, int k) {
        dfs(1, n, k);
        return res;
    }
	
	public void dfs(int cur,int n,int k) {
		if(temp.size()==k) {
			res.add(new ArrayList<Integer>(temp));
			return;
		}
		temp.add(cur);
		// pick current num
		dfs(cur+1, n-1, k);
		temp.remove(temp.size()-1);
		// don's pick cur
		dfs(cur+1, n-1, k);
	}
}
