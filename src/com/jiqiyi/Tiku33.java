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
    
}
