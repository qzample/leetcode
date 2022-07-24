package com.jiqiyi;

import java.util.Arrays;

public class Tiku673 {
    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int[] times = new int[n];
        Arrays.fill(dp, 1);
        Arrays.fill(times, 1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) {
                    if(dp[i]<dp[j]+1){
                        dp[i] = dp[j]+1;
                        times[i] = times[j];
                    }
                    else if(dp[i]==dp[j]+1){
                        times[i] += times[j];
                    }
                }
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max, dp[i]);
        }
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(dp[i]==max) {
                cnt += times[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(dp[i]+"\t"+times[i]);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,1,2,3,1,2,3};
        findNumberOfLIS(nums);
    }
}
