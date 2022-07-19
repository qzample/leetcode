package com.jiqiyi;

class Tiku55 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int pre = nums[0];
        for(int i=1;i<n-1;i++){
            if(pre<i) return false;
            pre = Math.max(nums[i] + i, pre);
        }
        return pre>=n-1;
    }


    /**
     * the second time to practice
     * @param nums
     * @return
     */
    public boolean canJump2(int[] nums) {
        int n = nums.length;
        int pre = 0;
        for(int i=0;i<n;i++){
            if(pre<i) break;
            pre = Math.max(pre, i+nums[i]);
        }
        return pre>=n-1;
    }
}
