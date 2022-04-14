package com.jiqiyi;

public class Tiku34 {
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int target = 2;
		System.out.println(searchRange(nums, target)[0]);
	}
	public static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        if(n==0) return new int[]{-1,-1};
		int left=0,right=n-1,mid=0;
		while (left<right) {
			mid = left+(right-left)/2;
			if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
        if(nums[left]!=target) return new int[]{-1,-1};
		int index=left;
		int[] res = new int[2];
		while (index>=0 && nums[index]==nums[left]) {
			res[0] = index;
			index--;
		}
        index = left;
		while (index<n && nums[index]==nums[left]) {
			res[1] = index;
			index++;
		}
		return res;
    }
}
