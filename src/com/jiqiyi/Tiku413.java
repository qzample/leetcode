package com.jiqiyi;

public class Tiku413 {

    public static void main(String[] args) {
        numberOfArithmeticSlices(new int[]{1,2,3,4});
    }

    /**
     * the first time to practice
     * tow pointer's solution
     * @param nums
     * @return
     */
    public static int numberOfArithmeticSlices(int[] nums) {
        if(nums==null || nums.length<3) return 0;
        int n = nums.length;
        int begin = 0,end=2,diff=nums[1]-nums[0];
        int cnt = 0;
        while(end<n){
            if(nums[end]-nums[end-1]==diff){
                end++;
            }
            else{
                cnt += (end-begin-2)*(end-begin-1)/2;
                begin = end - 1;
                diff = nums[end] - nums[end-1];
                end++;
            }
        }
        if(nums[end-1]-nums[end-2]==diff){
            cnt += (end-begin-2)*(end-begin-1)/2;
        }
        return cnt;
    }
}
