package com.jiqiyi;

public class Tiku198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,1,1,2};
		System.out.println(rob(nums));
	}
	
	public static int rob(int[] nums) {
		int len = nums.length;
		int unrob = 0; // didn't rob the first's home
		int rob = nums[0]; // rob the first's home
		for(int i=1;i<len;i++) {
			int temp = unrob;
			unrob = Math.max(unrob, rob);
			rob = temp+nums[i];
		}
		return Math.max(rob, unrob);
    }

}
