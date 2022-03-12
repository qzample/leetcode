package com.jiqiyi;

public class Tiku1688 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numberOfMatches(14));
	}
	
	public static int numberOfMatches(int n) {
		if(n==1) return 0; 
		if(n%2==0) return n/2 + numberOfMatches(n/2);
		else return ((n-1)/2) + numberOfMatches((n+1)/2);  
    }

}
