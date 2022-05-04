package com.jiqiyi;

import java.util.Arrays;
import java.util.Comparator;

class Tiku6060 {
    public static void main(String[] args) {
        int[] nums = {-4,-2,1,4,8};
        System.out.println(findClosestNumber(nums));
    }
    public static int findClosestNumber(int[] nums) {
        int n = nums.length;
		Integer[] arr = new Integer[n];
		int index=0;
		for(int i:nums) {
			arr[index++] = i;
		}
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1,Integer o2){
                if(Math.abs((int)o1)!=Math.abs((int)o2)) return Math.abs((int)o1)-Math.abs((int)o2);
                return (int)o1>0?-1:0;
            }
        });
        return arr[0];
    }
}
