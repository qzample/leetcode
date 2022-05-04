package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class Tiku986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n1 = firstList.length;
        int n2 = secondList.length;
        int i=0,j=0;
        List<int[]> res = new ArrayList<>();
        while(i<n1 && j<n2){
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if(start<=end){
                res.add(new int[]{start, end});
            }
            if(firstList[i][0]<secondList[j][0]){
                i++;
            }
            else{
                j++;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }

    /**
     * the second time to practice
     */
    public int[][] intervalIntersection2(int[][] firstList, int[][] secondList) {
        int n1 = firstList.length;
        int n2 = secondList.length;
        int i=0,j=0;
        List<int[]> res = new ArrayList<>();
        while(i<n1 && j<n2){
            int start = Math.max(firstList[i][0], secondList[j][0]);
            int end = Math.min(firstList[i][1], secondList[j][1]);
            if(start<=end){
                res.add(new int[]{start,end});
            }
            if(firstList[i][1]<=secondList[j][1]){
                i++;
            }
            else{
                j++;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
