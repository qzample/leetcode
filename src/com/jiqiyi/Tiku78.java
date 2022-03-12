package com.jiqiyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tiku78 {

	static LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
	static LinkedList<Integer> sub = new LinkedList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
		subsets(nums);
		System.out.println();
	}
	
	public static List<List<Integer>> subsets1(int[] nums) {
		
		int len = nums.length;
		for(int i=0;i<(1<<len);i++) {
			sub.clear();
			for(int j=0;j<len;j++) {
				if((i & (1<<j)) != 0 ) {
					sub.add(nums[j]);
				}
			}
			res.add(new ArrayList<Integer>(sub));
		}
		return res;
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
		dfs(0, nums);
		return res;
	}
	
	public static void dfs(int index,int[] nums){
		res.add(new LinkedList<Integer>(sub));
		for(int i=index;i<nums.length;i++) {
			sub.add(nums[i]);
			dfs(i+1, nums);
			sub.removeLast();
		}
	}

}
