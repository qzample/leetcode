package com.jiqiyi;

public class Tiku6129 {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0;
        int begin=0,end=0,n=nums.length;
        while(end<n){
            if(nums[end]==0){
                cnt += end - begin + 1;
                end++;
            }
            else{
                while(end<n && nums[end]!=0) end++;
                if(end<n) begin = end;
            }
        }
        return cnt;
    }
}
