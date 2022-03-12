package com.jiqiyi;

public class Tiku88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {0};
		int m=0;
		int[] nums2 = {0};
		int n=1;
		merge(nums1, m, nums2, n);
	}
	
	public static void merge1(int[] nums1, int m, int[] nums2, int n) {		
		int[] res = new int[m+n];
		int ptr1=0,ptr2=0,index=0;
		while(ptr1<m && ptr2<n) {
			if(nums1[ptr1] < nums2[ptr2]) {
				res[index++] = nums1[ptr1++];
			}
			else {
				res[index++] = nums2[ptr2++];
			}
		}
		while (ptr1<m) {
			res[index++] = nums1[ptr1++];
		}
		while (ptr2<n) {
			res[index++] = nums2[ptr2++];
			
		}
		for(int i=0;i<m+n;i++) {
			nums1[i] = res[i];
		}
    }
	
	// from the behind
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int ptr1 = m-1,ptr2 = n-1,ptr3 = m+n-1;
		while (ptr2>=0) {			
			nums1[ptr3--] = ptr1>=0 && nums1[ptr1]>nums2[ptr2] ? nums1[ptr1--] : nums2[ptr2--];			
		}
	}

}
