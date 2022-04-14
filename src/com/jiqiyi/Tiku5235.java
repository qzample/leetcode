package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Tiku5235 {
	public static void main(String[] args) {
		int[][] matches = {{1,5},{2,5},{2,8},{2,9},{3,8},{4,7},{4,9},{5,7},{6,8}};
		findWinners(matches);
	}
	public static List<List<Integer>> findWinners(int[][] matches) {
		List<Integer> ans0 = new ArrayList<Integer>();
		List<Integer> ans1 = new ArrayList<Integer>();
		List<Integer> ans2 = new ArrayList<Integer>();
		int m = matches.length;
		for(int i=0;i<m;i++) {
			if(!ans0.contains(Integer.valueOf(matches[i][0])) && !ans1.contains(Integer.valueOf(matches[i][0])) && !ans2.contains(Integer.valueOf(matches[i][0]))) {
				ans0.add(matches[i][0]);
			}
			if(ans0.contains(Integer.valueOf(matches[i][1]))) {
				ans0.remove(Integer.valueOf(matches[i][1]));
			}
			
			if(!ans1.contains(Integer.valueOf(matches[i][1])) && !ans2.contains(Integer.valueOf(matches[i][1]))) {
				ans1.add(matches[i][1]);
			}
			else if(ans1.contains(Integer.valueOf(matches[i][1]))) {
				ans1.remove(Integer.valueOf(matches[i][1]));
				ans2.add(Integer.valueOf(matches[i][1]));
			}
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Collections.sort(ans0);
		Collections.sort(ans1);
		res.add(ans0);
		res.add(ans1);
		return res;
    }
	
	
	
	public static List<List<Integer>> findWinners1(int[][] matches) {
		int[] nums = new int[100010];
		HashSet<Integer> set = new HashSet<Integer>();
		int m = matches.length;
		for(int i=0;i<m;i++) {
			nums[matches[i][1]]++;
			set.add(matches[i][0]);
			set.add(matches[i][1]);
		}
		List<Integer> ans0 = new ArrayList<Integer>();
		List<Integer> ans1 = new ArrayList<Integer>();
		for(int i=1;i<=100000;i++) {
			if(set.contains(i)) {
				if(nums[i]==0) {
					ans0.add(i);
				}
				else if(nums[i]==1) {
					ans1.add(i);
				}
			}
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(ans0);
		res.add(ans1);
		return res;
	}
}
