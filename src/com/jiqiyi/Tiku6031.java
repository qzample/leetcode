package com.jiqiyi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Tiku6031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,4,9,1,3,9,5};
		int key = 9;
		int k = 1;
		System.out.println(findKDistantIndices(nums, key, k));
	}
	
	public static List<Integer> findKDistantIndices1(int[] nums, int key, int k) {
		int len = nums.length;
		List<Integer> keyList = new ArrayList<Integer>();
		for(int i=0;i<len;i++) {
			if(nums[i]==key) {
				keyList.add(i);
			}
		}
		List<Integer> res = new ArrayList<Integer>();
		for(int keyIndex:keyList) {
			for(int i=keyIndex-k;i<=keyIndex+k;i++) {
				if(i>=0 && i<len) {
					res.add(i);
				}
			}
		}
		
		return res;
    }
	
	public static List<Integer> findKDistantIndices(int[] nums, int key, int k) {
		int len = nums.length;
		int[] left = new int[len];
		int[] right = new int[len];
		List<Integer> res = new ArrayList<Integer>();
		if(nums[0]==key) left[0]=1;
		if(nums[len-1]==key) right[len-1]=1;
		for(int i=1;i<len;i++) {			
			if(nums[i]==key) {
				left[i] = 1;
			}
			else {
				left[i] = left[i-1]==0 ? left[i-1] : left[i-1]+1;
			}
		}
		for(int i=len-2;i>=0;i--) {			
			if(nums[i]==key) {
				right[i] = 1;
			}
			else {
				right[i] = right[i+1]==0 ? right[i+1] : right[i+1]+1;
			}
		}
		for(int i=0;i<len;i++) {
			if(((left[i]<=k+1)&&(left[i]>=1)) || ((right[i]<=k+1)&&(right[i]>=1))) {
				res.add(i);
			}
		}
		return res;
	}

}
