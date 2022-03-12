package com.jiqiyi;

import java.util.Arrays;
import java.util.Comparator;

public class Tiku1996 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 弱いキャラクター
		int[][] properties = {{1,1},{2,1},{2,2},{1,2}};
		System.out.println(numberOfWeakCharacters(properties));
	}
	
	public static int numberOfWeakCharacters(int[][] properties) {
		int len = properties.length;
		int count = 0;
		Arrays.sort(properties, new Comparator<int[]>() {
			@Override
			public int compare(int[] nums1, int[] nums2) {
				if(nums1[0]>nums2[0]) return 1;
				else if(nums1[0]==nums2[0]) return 0;
				else return -1;
			}			
		});
		int max = -1;
		for(int i=len-1;i>=0;i--)
		{
			if(max>properties[i][1]) count++;
            max = Math.max(max,properties[i][1]);
		}
		return count;
    }
	
	

}
