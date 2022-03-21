package com.jiqiyi;

public class Tiku35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3};
		int target = 2;
		System.out.println(searchInsert(nums,target));
	}
	
	public static int searchInsert(int[] nums, int target) {
		return binarySearch(0, nums.length-1, nums, target);
    }
	
	public static int binarySearch(int left,int right,int[] nums,int target) {
		if(left>=right) {
			if(nums[left]>=target) {
				if(left<=0) return 0;
				else {
					if(nums[left-1]>target) return left-1;
					return left;
				}
			}
			return left+1;
		}
		int mid = left + (right - left)/2;
		if(nums[mid]>target) return binarySearch(left, mid-1, nums, target);
		else if(nums[mid]==target) return mid;
		else return binarySearch(mid+1, right, nums, target);
	}
}
