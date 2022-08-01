package com.jiqiyi;

import java.util.List;

public class Tiku658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // firstly, we try to find the x
        int n = arr.length;
        int left=0,right=n-1,mid;
        while(left<right){
            mid = left + (right-left)/2;
            if(arr[mid]<x) left = mid + 1;
            else right = mid;
        }
        // 我们这里找的是大于等于x的第一个值
        int min = Math.max(0, left-k-1);
        int max = Math.min(n-1, left+k-1);
    }
}
