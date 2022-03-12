package com.jiqiyi;

import java.util.HashMap;

public class Tiku1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public int[] twoSum(int[] nums, int target) {
		// hashmap
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int len = nums.length;
		int[] res = new int[2];
		for(int i=0;i<len;i++) {			
			if(map.containsKey(target-nums[i])) {
				res[0] = map.get(target-nums[i]);
				res[1] = i;
				break;
			}
			map.put(nums[i], i);
		}		
		return res;
    }

}
