package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l = 0, r = arr.length - k;
        List<Integer> res = new ArrayList<>();
        while(l < r){
            int c = l + (r - l) / 2;
            if(x - arr[c] > arr[c + k] - x) l = c + 1;
            else r = c;
        } // 循环结束后 l = r为所求k个元素的第一个的下标。
        for(int i = 0; i < k; i++){
            res.add(arr[i + r]);
        }
        return res;
    }

    /**
     * the second time to practice
     * @param arr
     * @param k
     * @param x
     * @return
     */
    public List<Integer> findClosestElements2(int[] arr, int k, int x) {
        int n = arr.length;
        int start = 0,end = n-1;
        while(end-start+1>k){
            int dif = Math.abs(arr[start]-x) - Math.abs(arr[end]-x);
            if(dif<0) end--;
            else if(dif>0) start++;
            else end--;
        }
        List<Integer> res = new ArrayList<>();
        for(int i=start;i<=end;i++) res.add(arr[i]);
        return res;
    }
}
