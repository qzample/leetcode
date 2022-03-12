package com.jiqiyi;

public class Tiku375 {

	static int N = 201;
	static int[][] cache = new int[N][N];
	static int[][] dp = new int[N+2][N+2];
	
	public static void main(String[] args) {
		System.out.println(getMoneyAmount(10));
	}

	public static int getMoneyAmount1(int n) {
		return dfs(1, n);
    }
	
	public static int dfs(int left,int right) {
		if(left >= right) return 0;
		if(cache[left][right]!=0) return cache[left][right];
		int min = Integer.MAX_VALUE;
		for(int k=left;k<right;k++) {
			int res = k + Math.max(dfs(left, k-1), dfs(k+1, right));
			min = min > res ? res : min;
		}
		cache[left][right] = min;
		return min;
	}

	
	static {
		for(int len=2;len<=N;len++) {
			for(int l=1;l+len-1<=N;l++) {
				int r = l+len-1;
				dp[l][r] = Integer.MAX_VALUE;
				for(int k=l;k<=r;k++) {
					int cur = Math.max(dp[l][k-1], dp[k+1][r]) + k;
					dp[l][r] = Math.min(cur, dp[l][r]);
				}
			}
		}
	}
	
	// dp's solution
	public static int getMoneyAmount(int n) {
		return dp[1][n];
	}
}
