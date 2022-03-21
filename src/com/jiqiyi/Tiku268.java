package com.jiqiyi;

public class Tiku268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int sum = (1+n)*n/2;
		for(int i=0;i<n;i++) {
			sum -= nums[i];
		}
		return sum;
    }

}
