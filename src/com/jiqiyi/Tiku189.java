package com.jiqiyi;

import java.util.Arrays;

public class Tiku189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1,-100,3,99};
		int k = 2;
		rotate(nums, k);
	}
	
	public static void rotate1(int[] nums, int k) {
        int len = nums.length;
		int[] ans = new int[len];
		for(int i=0;i<len;i++) {
			ans[(i+k)%len] = nums[i];
		}
		for(int i=0;i<len;i++) {
			nums[i] = ans[i];
		}
    }
	
	public static void rotate(int[] nums, int k) {	
		if(k==0) return;
		k = k%nums.length;
		reverse(0, nums.length-1, nums);
		reverse(0, k-1, nums);
		reverse(k, nums.length-1, nums);
	}
	
	public static void reverse(int start,int end,int[] nums) {
		int temp;
		while (start < end) {
			temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
		}
		start++;
		end--;
	}

}
