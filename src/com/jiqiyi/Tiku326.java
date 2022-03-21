package com.jiqiyi;

public class Tiku326 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isPowerOfThree(int n) {
		if(n==0) return false;
		if(n==1) return true;
		n = Math.abs(n);
		int pre;
		while (n>=3) {
			pre = n;
			n /= 3;
			if(pre!=n*3) return false;
		}
		if(n==1) return true;
		return false;
    }

}
