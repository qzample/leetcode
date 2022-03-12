package com.jiqiyi;

import java.util.Arrays;

public class Tiku136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int singleNumber(int[] nums) {
		int res = 0;
		for(int item:nums) {
			res = res ^ item;
		}
		return res;
    }

}
