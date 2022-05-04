package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Tiku39 {
    private List<List<Integer>> res = new ArrayList<>();
    private LinkedList<Integer> list = new LinkedList<>();
    private int[] nums;
    private int n;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.nums = candidates;
        this.n = candidates.length;
        Arrays.sort(nums);
        backtrack(0,target,0);
        return res;
    }
    public void backtrack(int sum,int target,int cur){
        if(sum>target) return;
        if(sum==target){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=cur;i<n;i++){
            if(target-nums[i]<0) break;
            list.add(nums[i]);
            sum += nums[i];
            backtrack(sum, target, i);
            sum -= nums[i];
            list.removeLast();
        }
    }
}
