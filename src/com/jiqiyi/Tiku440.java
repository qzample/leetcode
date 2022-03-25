package com.jiqiyi;

import java.util.Arrays;
import java.util.Comparator;

public class Tiku440 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	public static int findKthNumber(int n, int k) {
		String[] strs = new String[n];
		for(int i=1;i<=n;i++) {
			strs[i-1] = String.valueOf(i);
		}
		Arrays.sort(strs,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
			
		});
		return Integer.parseInt(strs[k-1]);
    }

}
