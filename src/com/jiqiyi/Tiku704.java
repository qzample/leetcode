package com.jiqiyi;

public class Tiku704 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int search(int[] nums, int target) {
		return binarySearch(0, nums.length-1, nums, target);
    }
	
	public int binarySearch(int left,int right,int[] nums,int val) {
		if(left>=right) {
			if(nums[left]==val) return left;
			return -1;
		}
		int mid = left + (right-left)/2;
		if(nums[mid]>val) return binarySearch(left, mid, nums, val);
		else if(nums[mid]==val) return mid;
		else return binarySearch(mid, right, nums, val);
	}

}
