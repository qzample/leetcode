package com.jiqiyi;

public class Tiku334 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean increasingTriplet(int[] nums) {
		int len = nums.length;
		int min = Integer.MAX_VALUE,subMin = Integer.MAX_VALUE;
		for(int i=0;i<len;i++) {
			if(nums[i]<min) {
				min = nums[i];
			}
			else if(nums[i]<subMin) {
				subMin = nums[i];
			}
			else {
				return true;
			}
		}
		return false;
    }

}
