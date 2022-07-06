package com.jiqiyi;

class Tiku162 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        findPeakElement(nums);
    }

    /**
     * O(log(n))
     */
    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int left=0,right=n-1,mid;
        while(left<right){
            mid = left + (right-left)/2;
            if(nums[mid+1]>nums[mid]){
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
    public int findPeakElement2(int[] nums) {
        int n = nums.length;
        int l=0,r=n-1,m;
        while(l<r){
            m = l + (r-l)/2;
            if(m<n && nums[m+1]>nums[m]){
                l = m + 1;
            }
            else{
                r = m;
            }
        }
        return l;
    }



    /**
     * the third time to practice
     * @param nums
     * @return
     */
    public int findPeakElement3(int[] nums) {
        int n = nums.length;
        int left=0,right=n-1,center;
        while(left<right){
            center = left + (right - left)/2;
            if(nums[center]<nums[center+1]){
                left = center + 1;
            }
            else{
                right = center;
            }
        }
        return left;
    }
}
