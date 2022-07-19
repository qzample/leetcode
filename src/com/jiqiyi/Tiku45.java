package com.jiqiyi;

import java.util.LinkedList;
import java.util.Queue;

class Tiku45 {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int n = nums.length;
        int start = 0;
        int end = 0;
        int step = 0;
        while(end<n){
            step++;
            int furthest = 0;
            for(int i=start;i<=end;i++){
                furthest = Math.max(furthest, i+nums[i]);
            }
            if(furthest>=n-1) break;
            start = end + 1;
            end = furthest;
        }
        return step;
    }
}
