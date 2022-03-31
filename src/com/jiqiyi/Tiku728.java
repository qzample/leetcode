package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku728 {
	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> res = new ArrayList<Integer>();
		for(int i=left;i<=right;i++) {
			if(isSelfDividing(i)) res.add(i);
		}
		return res;
    }
	
	public boolean isSelfDividing(int num) {
		if(num==0 || num%10==0) return false;
		int origin = num,k;
		while (num>0) {
			k = num%10;
			if(k==0 || origin%k!=0) return false;
			num = num/10;
		}
		return true;
	}
}
