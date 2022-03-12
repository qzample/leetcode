package com.jiqiyi;

import java.util.Arrays;

public class Tiku2049 {

	static int N = 10000,M=N-1;
	static int[] he = new int[N];
	static int[] e = new int[M];
	static int[] ne = new int[M];
	static int[] f = new int[N];
	static int idx = 0;
	public static int countHighestScoreNodes(int[] parents) {
		Arrays.fill(he, -1);
		int n = parents.length;
		for(int i=1;i<n;i++) {
			add(parents[i], i);
		}
		dfs(0);
		long max = 0;
		int ans = 0;
		for(int node=0;node<n;node++) {
			long cur = 1;
			int i=he[node];
			while (i!=-1) {
				cur *= f[e[i]];
				i = ne[i];
			}
			if(node!=0) {
				cur *= n-f[node];
			}
			if(cur > max) {
				ans = 1;
				max = cur;
			}
			else if(cur == max) {
				ans++;
			}
		}
		return ans;
    }
	// -1 2 0 2 0
	public static void add(int a,int b) {
		e[idx] =  b;
		ne[idx] = he[a];
		he[a] = idx++;
	}
	
	public static int dfs(int node) {
		int ans = 1;
		int x = he[node];
		while(x!=-1) {
			ans += dfs(e[x]);
			x = ne[x];
		}
		f[node] = ans;
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,2,0};
		countHighestScoreNodes(nums);
	}
}
