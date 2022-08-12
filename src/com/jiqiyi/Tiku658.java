package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku658 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
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
