package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiku28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "sipp";
		strStr(haystack,needle);
	}
	
	public static int strStr(String haystack, String needle) {
		char[] haystacks = haystack.toCharArray();
		char[] needles = needle.toCharArray();
		int hLen = haystacks.length;
		int nLen = needles.length;		
		if(nLen==0) return 0;
		if(nLen > hLen) return -1;
		for(int i=0;i<hLen;i++) {
			if(haystacks[i] == needles[0]) {
				for (int j = 0; j < nLen; j++) {
					if(i+j < hLen && haystacks[i+j]==needles[j]) {
						if(j==nLen-1) return i;
					}
					else {
						break;
					}
				}
			}			
		}
		return -1;
    }

}
