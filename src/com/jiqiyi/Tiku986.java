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


    /**
     * the third time to practice
     * @param firstList
     * @param secondList
     * @return
     */
    public int[][] intervalIntersection3(int[][] firstList, int[][] secondList) {
        List<int[]> res = new ArrayList<>();
        int ptr1 = 0,ptr2=0;
        int len1 = firstList.length,len2 = secondList.length;
        while(ptr1<len1 && ptr2<len2){
            int lower_bound = Math.max(firstList[ptr1][0], secondList[ptr2][0]);
            int upper_bound = Math.min(firstList[ptr1][1],secondList[ptr2][1]);
            if(lower_bound<=upper_bound){
                res.add(new int[]{lower_bound,upper_bound});
            }
            if(firstList[ptr1][1]<secondList[ptr2][1]){
                ptr1++;
            }
            else{
                ptr2++;
            }
        }
        return res.toArray(new int[res.size()][2]);
    }
}
