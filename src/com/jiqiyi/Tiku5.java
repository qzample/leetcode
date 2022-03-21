package com.jiqiyi;

public class Tiku5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("baabaad"));
	} 
	
	public static String longestPalindrome1(String s) {
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
	
	public static String longestPalindrome(String s) {
		//dp dynamic plan solution
		int sLen = s.length();		
		boolean[][] dp = new boolean[sLen][sLen];
		char[] arr = s.toCharArray();
		if(sLen < 2) return s;
		for(int i=0;i<sLen;i++) {
			// if length = 1 that's palindrome
			dp[i][i] = true;
		}
		int begin=0,maxLen=1;
		for(int len=2;len<=sLen;len++) {
			for(int left=0;left+len-1<sLen;left++) {
				int right = left+len-1;
				if(arr[left]!=arr[right]) {
					dp[left][right]=false;
				}
				else {
					if(right-left<3) {
						dp[left][right]=true;
					}
					else {
						dp[left][right] = dp[left+1][right-1];
					}
				}
				if(dp[left][right] && right-left+1>maxLen) {
					begin = left;
					maxLen = right-left+1;
				}
			}
		}
		return s.substring(begin,begin+maxLen);
	}
	
}
