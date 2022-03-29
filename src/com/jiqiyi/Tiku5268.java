package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tiku5268 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,3};
		int[] nums2 = {1,1,2,2};
		findDifference1(nums1, nums2);
	}
	
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for(int item:nums1) {
			set1.add(item);
		}
		for(int item:nums2) {
			set2.add(item);
		}
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for(int item:set1) {
			if(!set2.contains(item)) list1.add(item);
		}
		for(int item:set2) {
			if(!set1.contains(item)) list2.add(item);
		}
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(list1);
		res.add(list2);
		return res;
    }
	
	
	public static List<List<Integer>> findDifference1(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int n1 = nums1.length;
		int n2 = nums2.length;
		int index1=0,index2=0;
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		while (index1<n1 && index2<n2) {
			if(nums1[index1]<nums2[index2]) set1.add(nums1[index1++]);
			else if(nums1[index1] > nums2[index2]) set2.add(nums2[index2++]);
			else {
				int temp = nums1[index1];
				while (index1<n1 && nums1[index1]==temp) index1++;
				while (index2<n2 && nums2[index2]==temp) index2++;
			}
		}
		while (index1<n1) set1.add(nums1[index1++]);
		while (index2<n2) set2.add(nums2[index2++]);
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		res.add(new ArrayList<Integer>(set1));
		res.add(new ArrayList<Integer>(set2));
		return res;
	}

}
