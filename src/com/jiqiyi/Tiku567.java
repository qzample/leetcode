package com.jiqiyi;

import java.util.Arrays;

public class Tiku567 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc" ;
		String s2 = "ccccbbbbaaaa";
		System.out.println(checkInclusion(s1, s2));
	}
	
	public static boolean checkInclusion(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		for(int i=0;i<len1;i++) {
			cnt1[s1.charAt(i)-'a']++;
		}
		for(int i=0;i+len1-1<len2;i++) {
			int start = i,end=start+len1-1;
			if(i==0) {
				while (start<=end) {
					cnt2[s2.charAt(start++)-'a']++;
				}
			}
			else {
				cnt2[s2.charAt(end)-'a']++;
				cnt2[s2.charAt(start-1)-'a']--;
			}
			if(Arrays.equals(cnt1, cnt2)) return true;
		}
		return false;
    }

}
