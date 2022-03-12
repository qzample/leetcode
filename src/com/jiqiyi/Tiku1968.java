package com.jiqiyi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Tiku1968 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5};
		rearrangeArray(nums);
	}
	
	public static int[] rearrangeArray(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int len1 = (len+1)/2;
		int len2 = len - len1;
		int[] nums1 = new int[len1];
		int[] nums2 = new int[len2];
		int index1 = 0;
		int index2 = 0;
		for(int i=0;i<len2;i++) {
			nums2[i] = nums[i];
		}
		for(int i=len2;i<len;i++) {
			nums1[i-len2] = nums[i];
		}
        for(int i=0;i<len;i++) {
        	if(i%2==0) {
        		nums[i] = nums1[index1];
        		index1++;
        	}
        	else {
        		nums[i] = nums2[index2];
        		index2++;
        	}
        }
		return null;
    }

}
