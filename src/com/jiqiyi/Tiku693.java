package com.jiqiyi;

public class Tiku693 {
	public boolean hasAlternatingBits(int n) {
        int preRemainder = -1,remainder = 0;
		while(n!=0){
            remainder = n%2;
            if(remainder==preRemainder) return false;
            preRemainder = remainder;
            n = n/2;
        }
		return true;
    }
}
