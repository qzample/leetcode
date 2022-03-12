package com.jiqiyi;

public class Tiku5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("babad"));
	} 
	
	public static String longestPalindrome(String s) {
		int sLen = s.length();
		int head = 0;
		int tail = sLen-1;
		String res = s.charAt(0)+"";
		
		for(int i=0;i<sLen;i++)
		{
			for(int j=i+1;j<sLen;j++)
			{
				head = i;
				tail = j;
				while (head < tail) {
					if(s.charAt(head) != s.charAt(tail))
					{
						break;
					}			
					head++;
					tail--;
				}
				if(head >= tail) 
				{
					res = res.length()>j-i+1 ? res : s.substring(i, j+1);
				}
			}			
		}		
		return res;
    }
	
	public static String longestPalindrome1(String s) {
		//dp dynamic plan solution
		int sLen = s.length();		
		boolean[][] dp = new boolean[sLen][sLen];
		if(sLen < 2) return s;
		for(int len = 2;len<sLen;len++)
		{
			for(int i = 0;i<sLen;i++)
			{
				int j = i + len;
			}
		}
		return "";
		
	}
	
}
