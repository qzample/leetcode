package com.jiqiyi;

public class Tiku204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countPrimes(10));
	}
	
	public static int countPrimes(int n) {
        int cnt = 0;
        if(n==2) return 1; 
		for(int i=2;i<n;i++) {
        	if(isPrime(i)) cnt++;
        }
		return cnt;
    }
	
	public static boolean isPrime(int num){
        for(int i=2;i<=Math.sqrt(num);i++) {
        	if(num%i==0) return false;
        }
        return true;
    }

}
