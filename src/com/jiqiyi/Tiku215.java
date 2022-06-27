package com.jiqiyi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Tiku215 {
    public int findKthLargest(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }            
        });
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey(), value = entry.getValue();
            if(minHeap.size()<k){
                minHeap.offer(new int[]{key,value});
            }
            else if(minHeap.size()==k && minHeap.peek()[1] < value){
                minHeap.poll();
                minHeap.offer(new int[]{key,value});
            }
        }
        int res = -1;
        while(!minHeap.isEmpty()){
            res = minHeap.poll()[0];
        }
        return res;
    }
}
