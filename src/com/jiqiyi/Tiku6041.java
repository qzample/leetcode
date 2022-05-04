package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Tiku6041 {
    public List<Integer> intersection(int[][] nums) {
        int m = nums.length;
        Arrays.sort(nums[0]);
        if(m==1) return IntStream.of(nums[0]).boxed().collect(Collectors.toList());
        int[] dict = new int[1010];
        for(int i=0;i<m;i++){
            for(int j=0,n=nums[i].length;j<n;j++){
                dict[nums[i][j]]++;
            }
        }
        List<Integer> res = new ArrayList<>();
        for(int j=0,n=nums[0].length;j<n;j++){
            if(dict[nums[0][j]]==m) res.add(nums[0][j]);
        }
        return res;
    }
}
