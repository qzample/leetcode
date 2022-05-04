package com.jiqiyi;

class Tiku6052 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] preSum = new long[n];
        preSum[0] = nums[0];
        for(int i=1;i<n;i++){
            preSum[i] = preSum[i-1]+nums[i];
        }
        long min = Long.MAX_VALUE;
        int minIndex=-1;
        for(int i=0;i<n;i++){
            long sum;
            if(i==n-1) sum = preSum[i]/n; 
            else sum = Math.abs((preSum[i]/(i+1)-((preSum[n-1]-preSum[i])/(n-i-1))));
            if(sum<min){
                min = sum;
                minIndex = i;
            }
        }
        return minIndex;
    }
}
