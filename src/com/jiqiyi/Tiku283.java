package com.jiqiyi;

import java.util.Arrays;

public class Tiku283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void moveZeroes1(int[] nums) {
		int len = nums.length;
		int[] res = new int[len];
		int ptr = 0;
		int index = 0;
		while (ptr<len) {
			while (ptr<len && nums[ptr]==0) ptr++;
			if(ptr<len) res[index++] = nums[ptr++];
		}
		for(int i=0;i<len;i++) {
			nums[i] = res[i];
		}
    }
	
	
	// O(N)
	public void moveZeroes(int[] nums) {
		int j=0,n=nums.length;
		for(int i=0;i<n;i++) {
			if(nums[i]!=0) {
				nums[j++] = nums[i];
			}
		}
		while (j<n) nums[j++] = 0;
	}

}
