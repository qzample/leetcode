package com.jiqiyi;

public class Tiku33 {
	
	public int search(int[] nums, int target) {
		int n = nums.length;
		int left=0,right=n-1;
		while(left<right) {
			int mid = left+(right-left)/2;
			// 左边有序
			if(nums[0]<nums[mid]){
				if(target>nums[0] && target<nums[mid]){
					right = mid;
				}
				else{
					left = mid+1;
				}
			}
			// 右边有序
			else{
				if(target>nums[mid] && target<nums[n-1]){
					left = mid + 1;
				}
				else{
					right = mid;
				}
			}
		}
		return nums[left]==target?left:-1;
    }


	/**
	 * the second time to practice
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int search2(int[] nums, int target) {
		int n = nums.length;
		if(n==0) return -1;
		int left=0,right=n-1,mid;
		while(left<right){
			mid = left + (right-left)/2;
			if(nums[0]<=nums[mid]){
				// [0,mid] is ascending
				if(target>=nums[0] && nums[mid]>=target){
					right = mid;
				}
				else{
					left = mid + 1;
				}
			}
			else{
				// [mid,n-1] is ascending
				if(target<nums[n-1] && nums[mid]<target){
					left = mid + 1;
				}
				else{
					right = mid;
				}
			}
		}
		return nums[left] == target ? left : -1;
    }

	public static void main(String[] args) {
		int[] nums = new int[]{1,3};
		int target = 3;
		search2(nums, target);
	}
    
}
