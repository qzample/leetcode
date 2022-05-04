package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Tiku47 {
    static private List<List<Integer>> res = new ArrayList<>();
    static private LinkedList<Integer> list = new LinkedList<>();
    static private boolean[] visited;
    static private int[] nums1;
    static private int n1;
    public static List<List<Integer>> permuteUnique(int[] nums) {
        nums1 = nums;
        n1 = nums.length;
        visited = new boolean[n1];
        Arrays.sort(nums);
        backtrack();
        return res;
    }
    public static void backtrack(){
        if(list.size()==n1){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<n1;i++){
            if(visited[i]) continue;
            if(i>0 && nums1[i]==nums1[i-1] && !visited[i-1]) continue;
            visited[i] = true;
            list.add(nums1[i]);
            backtrack();
            list.removeLast();
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        permuteUnique(nums);
    }
}
