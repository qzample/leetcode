package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku118 {

	static List<List<Integer>> res = new ArrayList<List<Integer>>();
	static List<Integer> list = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generate(5);
	}
	
	public static List<List<Integer>> generate(int numRows) {
		dfs(numRows);
		return res;
    }
	
	public static void dfs(int n) {
		if(n==1) {
			list.clear();
			list.add(1);
			res.add(new ArrayList<Integer>(list));
			return;
		}
		if(n==2) {
			list.add(1);
			res.add(new ArrayList<Integer>(list));
			list.clear();
			list.add(1);
			list.add(1);
			res.add(new ArrayList<Integer>(list));
			return;
		}
		else {
			dfs(n-1);
			list.clear();
			for(int i=0;i<n;i++) {
				if(i==0 || i==n-1) {
					list.add(1);
				}
				else {
					list.add(res.get(n-2).get(i-1)+res.get(n-2).get(i));
				}
			}
			res.add(new ArrayList<Integer>(list));
		}
	}

}
