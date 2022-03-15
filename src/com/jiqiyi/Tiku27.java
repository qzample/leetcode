package com.jiqiyi;

public class Tiku27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int removeElement(int[] nums, int val) {
		int len = nums.length;
		int start = 0;
		int end = len - 1;
		while (start<end) {
			while(start<len &&  nums[start]!=val) start++;
			while(end>=0 && nums[end]==val) end--;
			if(start<end) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
			}
		}
		return end+1;
    }

}
