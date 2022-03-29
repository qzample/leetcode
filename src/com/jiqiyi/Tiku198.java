package com.jiqiyi;

public class Tiku198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,1,2};
		System.out.println(rob(nums));
	}
	
	public static int rob(int[] nums) {
		int len = nums.length;
		int unrob = 0; // didn't rob the first's home
		int rob = nums[0]; // rob the first's home
		for(int i=1;i<len;i++) {
			int temp = unrob;
			unrob = Math.max(unrob, rob);
			rob = temp+nums[i];
		}
		return Math.max(rob, unrob);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * the second time to practice
	 * **/
	public int rob2(int[] nums) {
		int n = nums.length;
		if(n==1) return nums[0];
		if(n==2) return Math.max(nums[0], nums[1]);
		int[] dp = new int[n];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for(int i=2;i<n;i++) {
			dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);
		}
		return dp[n-1];
    }
	
	
	
	
	
	
	
	
	
	
	
	
	

}
