package com.jiqiyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tiku46 {
	private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> list = new LinkedList<>();
    private int[] nums;
    private int n;
	public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
		n = nums.length;
		dfs();
		return res;
    }
	public void dfs(){
		if(list.size()==n){
			res.add(new ArrayList<>(list));
			return;
		}
		for(int i=0;i<n;i++){
			if(!list.contains(nums[i])){
				list.add(nums[i]);
				dfs();
				list.removeLast();
			}
		}
	}


	/**
	 * use the visited array to mark
	 */
	private boolean[] visited;
	public List<List<Integer>> permute1(int[] nums) {
		this.nums = nums;
		n = nums.length;
		visited = new boolean[n];
		backtrack();
		return res;
    }
    public void backtrack(){
		if(list.size()==n){
			res.add(new ArrayList<>(list));
			return;
		}
		for(int i=0;i<n;i++){
			if(!visited[i]){
				visited[i] = true;
				list.add(nums[i]);
				backtrack();
				list.removeLast();
				visited[i] = false;
			}
		}
	}
}
