package com.jiqiyi;

import java.util.HashMap;
import java.util.HashSet;

public class Tiku1994 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int numberOfGoodSubsets(int[] nums) {
		// prime number < 30
		HashMap<Integer, Integer> primeHashMap = new HashMap<Integer, Integer>();
		HashSet<Integer> primeHashSet = new HashSet<Integer>();		
		for(int i=1;i<=30;i++) {
			if(isPrime(i)) primeHashSet.add(i);
		}
		return 0;
		
    }
	
	public boolean isPrime(int num) {
		if(num==1) return false;
		for(int i=2;i<num;i++) {
			if(num%i==0) return false;
		}
		return true;
	}

}
