package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku412 {

	static String[] fizzzBuzz = new String[10000];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static {
		for(int i=0;i<10000;i++) {
			if((i+1)%3==0) {
				if((i+1)%5==0) {
					fizzzBuzz[i] = "FizzBuzz";
				}
				else {
					fizzzBuzz[i] = "Fizz";
				}
			}
			else if((i+1)%5==0){
				fizzzBuzz[i] = "Buzz";
			}
			else {
				fizzzBuzz[i] = String.valueOf(i+1);
			}
		}
	}
	
	public List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<String>(n);
		for(int i=0;i<n;i++) {
			res.add(fizzzBuzz[i]);
		}
		return res;
    }

}
