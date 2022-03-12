package com.jiqiyi;

public class Tiku121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxProfit(int[] prices) {
		int len = prices.length;
		int min = 10000;
		int maxProfix = 0;
		for(int i=0;i<len;i++) {
			min = prices[i] <= min ? prices[i] : min;
			maxProfix = maxProfix > prices[i] - min ? maxProfix : prices[i] - min;
		}
		return maxProfix;
    }

}
