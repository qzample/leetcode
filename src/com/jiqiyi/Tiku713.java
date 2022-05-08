package com.jiqiyi;

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
}
