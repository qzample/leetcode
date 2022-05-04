package com.jiqiyi;

class Tiku153{
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.println(findMin(nums));
    }

    /**
     * O(log(n)) 
     * */
    public static int findMin(int[] nums) {
        int n = nums.length;
        int left=0,right=n-1,mid;
        while(left<right){
            mid = left + (right-left)/2;
            if(nums[mid]>nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }


    /**
     * the second time to practice
     */
    public int findMin2(int[] nums) {
        int n = nums.length;
        int l=0,r=n-1,m;
        while(l<r){
            m = l + (r-l)/2;
            if(nums[m]<=nums[r]){
                r = m;
            }
            else{
                l = m + 1;
            }
        }
        return nums[l];
    }
}