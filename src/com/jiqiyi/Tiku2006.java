package com.jiqiyi;

import java.util.HashMap;

public class Tiku2006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int countKDifference(int[] nums, int k) {
        int ans = 0;
		for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(Math.abs(nums[i]-nums[j])==k) ans++; 
            }
        }
		return ans;
    }
	
	// hashmap's solution
	public static int countKDifference1(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> cnt = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++)
        {
            ans += cnt.getOrDefault(nums[i]+k, 0) + cnt.getOrDefault(nums[i]-k, 0);
            cnt.put(nums[i], cnt.getOrDefault(nums[i], 0) + 1);
        }
		return ans;
    }

}
