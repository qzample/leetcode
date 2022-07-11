package com.jiqiyi;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * 前k个高频元素
 */
public class Tiku347 {
    /**
     * 
     * @param nums
     * @param k
     * @return
     */
    public static int[] topKFrequent(int[] nums, int k) {
        // key is the number 
        // value is the frequency of the key 
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey(), value = entry.getValue();
            if(minHeap.size()<k){
                minHeap.offer(new int[]{key,value});
            }
            else if(minHeap.size()==k && minHeap.peek()[1]<value){
                minHeap.poll();
                minHeap.offer(new int[]{key,value});
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = minHeap.poll()[0];
        }
        return res;
    }
    
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,-1,2,-1,2,3,-1,-1,2};
        int k = 2;
        topKFrequent(nums, k);
    }
}
