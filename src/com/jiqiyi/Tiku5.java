package com.jiqiyi;

public class Tiku5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome2_2("aba"));
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
	
	/**
	 * the second time to practice
	 * @param s
	 * @return
	 */
	public String longestPalindrome2(String s) {
		char[] sChars = s.toCharArray();
		int n = sChars.length;
		int left=0,right=0;
		int maxLen=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(j-i+1>maxLen && isPalindrome(sChars, i, j)){
					maxLen = j - i + 1;
					left = i;
					right = j;
				}
			}
		}
		return s.substring(left, right+1);
    }

	public boolean isPalindrome(char[] sChars,int left, int right){
		while(left<right){
			if(sChars[left]!=sChars[right]){
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	/**
	 * the second time to practice 
	 * dynamic plan's solution
	 * @param s
	 * @return
	 */
	public String longestPalindrome2_1(String s) {
		char[] sChars = s.toCharArray();
		int n = sChars.length;
		if(n<2) return s;
		int left=0;
		int maxLen=1;
		boolean[][] dp = new boolean[n][n];
		for(int j=0;j<n;j++){
			for(int i=0;i<j;i++){
				if(sChars[i]!=sChars[j]) dp[i][j]=false;
				else{
					if(j-i<3) dp[i][j] = true;
					else{
						dp[i][j] = dp[i+1][j-1];
					}
				}
				if(dp[i][j] && j-i+1>maxLen){
					left = i;
					maxLen = j-i+1;
				}
			}
		}
		return s.substring(left, left + maxLen);
	}


	/**
	 * expand around center
	 * @param s
	 * @return
	 */
	public static String longestPalindrome2_2(String s) {
		if(s==null||s.length()==0) return s;
		int maxLen = 0;
		int begin = 0;
		for(int i=0;i<s.length();i++){
			int len1 = expandAroundCenter(i, i, s);
			int len2 = expandAroundCenter(i, i+1, s);
			int len = Math.max(len1, len2);
			if(len>maxLen){
				begin = i - (len-1)/2;
				maxLen = len;
			}
		}
		return s.substring(begin, begin + maxLen);
	}

	public static int expandAroundCenter(int left, int right, String s){
		while(left>=0 && right<s.length()){
			if(s.charAt(left)==s.charAt(right)){
				left--;
				right++;
			}
			else break;
		}
		return right - left - 1;
	}
}
