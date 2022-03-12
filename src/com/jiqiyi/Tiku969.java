package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiku969 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,3};
		System.out.println(pancakeSort(arr));
	}
	
	public static List<Integer> pancakeSort(int[] arr) {
		int len = arr.length;
		int times = len;
		int revIndex = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (times>0) {
			revIndex = 0;
			for(int i=0;i<times;i++) {
				revIndex = arr[i] > arr[revIndex] ? i : revIndex;  
			}
			// reverse [0-revIndex]
			if(revIndex != times-1) {
				reverse(arr, 0, revIndex);
				list.add(revIndex+1);
				//reverse [0-times-1]
				reverse(arr, 0, times-1);
				list.add(times);
			}
			times--;
		}
		return list;
    }
	
	public static boolean reverse(int[] arr, int begin, int end) {		
		boolean work = false;
		while(begin<end) {
			work = true;
			arr[begin] = arr[begin] + arr[end];
			arr[end] = arr[begin] - arr[end];
			arr[begin] = arr[begin] - arr[end];
			begin++;
			end--;
		}
		return work;
	}

}
