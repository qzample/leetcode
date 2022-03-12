package com.jiqiyi;

public class Tiku70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	// TOL
	public int climbStairs1(int n) {
		if(n==1) return 1;
		if(n==2) return 2;
		return climbStairs(n-1) + climbStairs(n-2);
    }
	
	public int climbStairs(int n) {
		if(n<3) return n;
		int[] dp = new int[n];
		dp[1] = 1;
		dp[2] = 2;
		for(int i=3;i<n;i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		return dp[n-1] + dp[n-2];
	}

}
