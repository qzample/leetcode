package com.jiqiyi;

import java.util.HashMap;

public class Tiku798 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,1,4,0};
		System.out.println(bestRotation(nums));
	}
	
	public static int bestRotation(int[] nums) {
		int res = -1;
		int max = -1;
		int len = nums.length;
		for(int k=0;k<len;k++) {
			int temp = count(nums, k);
			if(temp > max) {
				res = k;
				max = temp;
			}
		}
		return res;
    }
	
	public static int count(int[] nums,int k) {
		int count = 0;
		int len = nums.length;
		for(int i=0;i<len;i++) {
			count += nums[i] > (len+i-k)%len ? 0 : 1;
		}
		return count;
	}

}
