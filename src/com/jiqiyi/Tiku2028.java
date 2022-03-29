package com.jiqiyi;

import java.util.Arrays;

public class Tiku2028 {
	public int[] missingRolls(int[] rolls, int mean, int n) {
		int m = rolls.length;
		int sum = mean*(m+n);
		int rollsSum = 0;
		for(int i=0;i<m;i++) {
			rollsSum+=rolls[i];
		}
		sum -= rollsSum;
		if(sum<n || sum>6*n) return new int[] {};
		int[] nrolls = new int[n];
		Arrays.fill(nrolls, sum/n);
		if(sum/n*n<sum) {
			int diff = sum - sum/n*n,index=0;
			while (diff-->0) nrolls[index++]++;
		}
		return nrolls;
    }
}
