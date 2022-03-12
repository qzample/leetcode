package com.jiqiyi;

public class Tiku2055 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "***|**|*****|**||**|*";
		int[][] queries = {{1,17},{4,5},{14,17},{5,11},{15,16}};
		platesBetweenCandles(s, queries);
	}
	
	public static int[] platesBetweenCandles(String s, int[][] queries) {
		char[] sChars = s.toCharArray();
		int len = sChars.length;
		int qLen = queries.length;
		int[] preSum = new int[len];
		for(int i=0,sum=0;i<len;i++) {
			if(sChars[i] == '*') {
				sum++;
			}
			preSum[i] = sum;
		}
		
		int[] left = new int[len];
		int[] right = new int[len];
		for(int i=0,l=-1;i<len;i++) {
			if(sChars[i] == '|') {
				l = i;
			}
			left[i] = l;
		}
		
		for(int i=len-1,r=-1;i>=0;i--) {
			if(sChars[i] == '|') {
				r = i;
			}
			right[i] = r;
		}
		
		int[] res = new int[qLen];
		// left - right
		for(int i=0;i<qLen;i++) {
			int l = right[queries[i][0]], r = left[queries[i][1]];
			res[i] = l==-1 || r==-1 || l>=r ? 0 : preSum[r] - preSum[l]; 
		}
		return res;
    }
	
}
