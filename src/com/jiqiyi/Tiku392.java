package com.jiqiyi;

public class Tiku392 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isSubsequence(String s, String t) {
		char[] sChars = s.toCharArray();
		char[] tChars = t.toCharArray();
		int ptr1=0,ptr2=0;
		int len1=sChars.length,len2=tChars.length;
		while (ptr1<len1 && ptr2<len2) {
			if(sChars[ptr1]==tChars[ptr2]) {
				ptr1++;
			}
			ptr2++;
		}
		return ptr1==len1;
    }

}
