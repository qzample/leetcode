package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku2100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] security = {5,3,3,3,5,6,2};
		int time = 2;
		goodDaysToRobBank(security, time);
	}
	
	public static List<Integer> goodDaysToRobBank1(int[] security, int time) {
		int len = security.length;
		List<Integer> res = new ArrayList<Integer>();
		if(time==0) {
			for(int i=0;i<len;i++) {
				res.add(security[i]);
			}
			return res;
		}
		for(int i=time;i<=len-time-1;i++) {
			boolean flag = true;
			for(int j=0;j<time;j++) {
				if(security[i-j] > security[i-j-1] || security[i+j] > security[i+j+1]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				res.add(i);
			}
		}
		return res;
    }
	
	
	public static List<Integer> goodDaysToRobBank(int[] security, int time) {
		int len = security.length;
		List<Integer> res = new ArrayList<Integer>(); 
		if(time==0) {
			for(int i=0;i<len;i++) {
				res.add(i);
			}
			return res;
		}
		int[] left = new int[len];
		int[] right = new int[len];
		for(int i=1;i<len;i++) {			
			if(security[i] <= security[i-1]) {
				left[i] = left[i-1] + 1;
			}				
			if(security[len-i-1] <= security[len-i]) {
				right[len-i-1] = right[len-i] + 1;
			}
		}
		
		for(int i=time;i<len-time;i++) {
			if(left[i]>=time && right[i]>=time) res.add(i);
		}
		return res;
	}

}
