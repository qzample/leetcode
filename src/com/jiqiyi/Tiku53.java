package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,4,-1,7,8};
		System.out.println(maxSubArray(nums));
	}
	
	public static int maxSubArray(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		dp[0] = nums[0];
		int max = dp[0];
		for(int i=1;i<len;i++) {
			dp[i] = Math.max(dp[i-1], 0) + nums[i];
			max = dp[i] > max ? dp[i] : max;
		}
		return max;
    }

}
