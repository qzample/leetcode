package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tiku90 {
	
	static List<List<Integer>> ans = new ArrayList<List<Integer>>();
	static List<Integer> sub = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2};
		System.out.println(subsetsWithDup(nums));
	}
	
	public static List<List<Integer>> subsetsWithDup1(int[] nums) {
		Arrays.sort(nums);
		List<Integer> temp = new ArrayList<Integer>();
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		int len = nums.length;
		for(int mask=0;mask<(1<<len);mask++) {
			temp.clear();
			for(int i=0;i<len;i++) {
				if((mask & (1<<i)) != 0) {
					temp.add(nums[i]);
				}
			}
			res.add(new ArrayList<Integer>(temp));
		}
		return new ArrayList<>(res);
    }
	
	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		dfs(0, nums);
		return ans;
	}
	
	public static void dfs(int index,int[] nums) {
		ans.add(new ArrayList<Integer>(sub));
		for(int i=index;i<nums.length;i++) {
			if(i > index && nums[i] == nums[i-1]) {
				 continue;
			}
			sub.add(nums[i]);
			dfs(i+1, nums);
			sub.remove(sub.size()-1);
		}
		
	}
}
