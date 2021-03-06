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
        return Math.max(myRob2(Arrays.copyOfRange(nums, 0, n-1)), myRob2(Arrays.copyOfRange(nums, 1, n)));
    }

    public int myRob2(int[] nums){
        int pre=0,cur=0;
        for(int i:nums){
            int tmp = cur;
            cur = Math.max(pre+i, cur);
            pre = tmp;
        }
        return cur;
    }
}
