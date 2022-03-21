package com.jiqiyi;

public class Tiku977 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-4,-1,0,3,10};
		sortedSquares(nums);
	}
	
	public static int[] sortedSquares(int[] nums) {
		int len = nums.length;
		int[] res = new int[len];
		int index = 0;
		while (index<len && nums[index]<0) {
			index++;
		}
		int ptr1 = index-1;
		int ptr2 = index;
		index = 0;
		while (ptr1>=0 && ptr2<len) {
			int res1 = nums[ptr1]*nums[ptr1];
			int res2 = nums[ptr2]*nums[ptr2];
			if(res1 < res2) {
				res[index++] = res1;
				ptr1--;
			}
			else {
				res[index++] = res2;
				ptr2++;
			}
		}
		while (ptr1>=0) {
			res[index++] = nums[ptr1]*nums[ptr1];
			ptr1--;
		}
		while (ptr2<len) {
			res[index++] = nums[ptr2]*nums[ptr2];
			ptr2++;
		}
		return res;
		
    }

}
