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
		int len = nums.length;
		k = k%len;
		int head = 0,tail = len-1;		
		// reverse the entire array
		while(head<tail) {
			nums[head] = nums[head] + nums[tail];
			nums[tail] = nums[head] - nums[tail];
			nums[head] = nums[head] - nums[tail];
			head++;
			tail--;
		}
		// reverse the front k's item
		head = 0;
		tail = k-1;
		while(head < tail) {
			nums[head] = nums[head] + nums[tail];
			nums[tail] = nums[head] - nums[tail];
			nums[head] = nums[head] - nums[tail];
			head++;
			tail--;
		}
		//reverse the back item
		head = k;
		tail = nums.length-1;
		while(head < tail) {
			nums[head] = nums[head] + nums[tail];
			nums[tail] = nums[head] - nums[tail];
			nums[head] = nums[head] - nums[tail];
			head++;
			tail--;
		}
	}

}
