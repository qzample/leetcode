package com.jiqiyi;

import java.util.Arrays;

public class Tiku1984 {
	public static void main(String[] args) {
		
	}
	
	public int minimumDifference(int[] nums, int k) {
		int ans = 100000;
		int len = nums.length;
		Arrays.sort(nums);
		for(int i=0;i+k-1<len;i++)
		{
			ans = (nums[i+k-1]-nums[i]) < ans ? (nums[i+k-1]-nums[i]) : ans; 
		}
		return ans;
    }
}
