package com.jiqiyi;

import java.util.ArrayList;

class Tiku713 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length;
        if(k<=1) return 0;
        int ans = 0;
        for(int i=0,j=0,cur=1;j<n;j++){
            cur *= nums[i];
            while(cur>=k) cur /= nums[i++];
            ans += j-i+1;
        }
        return ans;
    }


    /**
     * the second time to practice
     * @param nums
     * @param k
     * @return
     */
    public int numSubarrayProductLessThanK2(int[] nums, int k) {
        if(k<1) return 0;
        int n = nums.length;
        int ans = 0;
        for(int i=0,j=0,cur=1;j<n;j++){
            cur *= nums[j];
            while(cur>=k) cur/=nums[i++];
            ans += j - i + 1;
        }
        return ans;
    }
}
