package com.jiqiyi;

public class Tiku461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	public int hammingDistance(int x, int y) {
        int n = x^y;
        int cnt = 0;
        for(int i=0;i<32;i++) {
        	if(((1<<i)&n)!=0) {
        		cnt++;
        	}
        }
        return cnt;
    }
}
