package com.jiqiyi;

public class Tiku204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(10));
	}
	
	public static int countPrimes(int n) {
		// sieve of Eratosthenes
		int cnt = 0;
		boolean[] arr = new boolean[n];
		for(int i=2;i<n;i++) {
			if(arr[i]) continue;
			cnt++;
			for(int j=i;j<n;j+=i) {
				arr[j] = true;
			}
		}
		return cnt;
    }	

}
