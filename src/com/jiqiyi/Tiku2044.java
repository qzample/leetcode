package com.jiqiyi;

public class Tiku2044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,1};
		System.out.println(countMaxOrSubsets(nums));
	}
	
	public static int countMaxOrSubsets(int[] nums) {
		int max = 0;
		int cnt = 0;
		int len = nums.length;
		for(int i=0;i<(1<<len);i++) {
			int cur = 0;
			for(int j=0;j<len;j++) {
				if((i&(1<<j))!=0) {
					cur |= nums[j];
				}
			}
			if(cur>max) {
				max = cur;
				cnt = 1;
			}
			else if(cur==max) {
				cnt++;
			}			
		}
		return cnt;
    }

}
