package com.jiqiyi;

import java.util.HashSet;
import java.util.Set;

public class Tiku564 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n = "123";
		nearestPalindromic(n);
	}
	
	public static String nearestPalindromic(String n) {
		long num = Long.parseLong(n);
		Set<Long> resSet = new HashSet<Long>();
		int len = n.length();
		resSet.add((long)Math.pow(10, len)-1);
		resSet.add((long)Math.pow(10, len-1)+1);
		long pre = Long.parseLong(n.substring(0,(len+1)/2));
		for(long i=pre-1;i<=pre+1;i++) {
			long temp = -1;
			if(len%2==0) temp = getPalindrome(i, true);
			else temp = getPalindrome(i, false);
			if(temp!=num) resSet.add(temp);
		}
		long diff = Long.MAX_VALUE;
		long res = -1;
		for(long item:resSet) {
			diff = Math.abs(num-item);
			res = Math.abs(num-item) < diff ? item : res;
		}
		return String.valueOf(res);
    }
	
	public static long getPalindrome(long value,boolean isEven) {
		StringBuilder sb = new StringBuilder(String.valueOf(value));
		if(isEven) sb.append(sb.reverse());
		else sb.append(sb.toString().substring(0, sb.length()));
		return Long.parseLong(sb.toString());
	}
}
