package com.jiqiyi;

public class Tiku2016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,5,2,10};
		System.out.println(maximumDifference(nums));
	}
	
	public static int maximumDifference1(int[] nums) {
		int max = -1;
		int len = nums.length;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(nums[j]>nums[i]) max = (nums[j] - nums[i]) > max ? nums[j] - nums[i] : max;
				else continue;
			}
		}
		return max;
    }
	
	public static int maximumDifference(int[] nums) {
		int len = nums.length;
		int min = nums[0];
		int res = -1;
		for(int i=0;i<len;i++) {
			if(nums[i]>min) {
				res = Math.max(res, nums[i]-min);
			}
			else {
				min = nums[i];
			}
		}
		return res;
	}

}
