package com.jiqiyi;

import java.util.Arrays;

class Tiku213 {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, n-1)), myRob(Arrays.copyOfRange(nums, 1, n)));
    }
    public int myRob(int[] nums){
        int pre=0,cur=0;
        for(int num:nums){
            int tmp = cur;
            cur = Math.max(pre+num, cur);
            pre = tmp; 
        }
        return cur;
    }


    /**
     * the second time to practice
     * @param nums
     * @return
     */
    public int rob2(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        if(n==2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[n-1];
    }
}
