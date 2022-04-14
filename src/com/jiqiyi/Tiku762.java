package com.jiqiyi;

import java.util.Arrays;

public class Tiku762 {
	
	public static void main(String[] args) {
		countPrimeSetBits(6,10);
	}
	
	static boolean[] isPrime = new boolean[33];
	public static int countPrimeSetBits(int left, int right) {
			Arrays.fill(isPrime, true);
			sieve();
			int ans=0;
			for(int i=left;i<=right;i++) {
				int num=i,cnt=0;
				while(num!=0) {
					num&=num-1;
					cnt++;
				}
				if(isPrime[cnt]) ans++;
			}
			return ans;
    }
	
	/*
	 * sieve of Eratosthenes
	 * **/
	public static void sieve() {
		isPrime[1] = false;
		for(int i=2,j=isPrime.length;i<j;i++) {
			if(isPrime[i]) {
				int num=i;
				while (num+i<j) {
					num+=i;
					isPrime[num] = false;
				}
			}
		}
	}
}
