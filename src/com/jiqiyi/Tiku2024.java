package com.jiqiyi;

public class Tiku2024 {
	public int maxConsecutiveAnswers(String answerKey, int k) {
		char[] ansChars = answerKey.toCharArray();
		return Math.max(getCnt(ansChars, 'T', k), getCnt(ansChars, 'F', k));
    }
	
	public int getCnt(char[] ansChars,char c,int k) {
		int i=0,len=ansChars.length,max=0,cnt=0;
		for(int j=0;j<len;j++) {
			if(ansChars[j]==c) cnt++;
			while (cnt>k) {
				if(ansChars[i]==c) cnt--;
				i++;
			}
			max = Math.max(max, i-j+1);
		}
		return max;
	}
}
