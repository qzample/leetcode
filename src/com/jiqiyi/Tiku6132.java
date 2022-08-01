package com.jiqiyi;

public class Tiku6132 {
    public int minimumOperations(int[] nums) {
        int[] dict = new int[101];
        for(int i=0;i<nums.length;i++){
            dict[nums[i]]++;
        }
        int cnt = 0;
        for(int i=1;i<=100;i++){
            if(dict[i]!=0) cnt++;
        }
        return cnt;
    }
}
