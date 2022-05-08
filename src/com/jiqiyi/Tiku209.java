package com.jiqiyi;

class Tiku209 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,2,4,3};
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int ans = 0;
        int n = nums.length;
        if(target<1) return 0;
        boolean work = false;
        for(int i=0,j=0,sum=0;j<n;j++){
            sum += nums[j];
            while(sum>=target){
                work = true;
                sum -= nums[i++];
            }
            if(work) ans = ans==0?j-i+2:Math.min(ans, j-i+2);
            work = false;
        }
        return ans;
    }
}
