package com.jiqiyi;

import java.util.Arrays;

public class Tiku300 {
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, nums[i]);
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,3,6,7,9,4,10,5,6};
        lengthOfLIS(nums);
    }
}
