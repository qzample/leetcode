package com.jiqiyi;

public class Tiku6055 {
	public int convertTime(String current, String correct) {
		String[] strings = current.split(":");
		int curMinutes = Integer.parseInt(strings[0])*60 + Integer.parseInt(strings[1]);
		strings = correct.split(":");
		int corMinutes = Integer.parseInt(strings[0])*60 + Integer.parseInt(strings[1]);
		int diff = corMinutes - curMinutes;
		int count=0;
		count += diff/60;
		diff = diff%60;
		count += diff/15;
		diff = diff%15;
		count += diff/5;
		diff = diff%5;
		count += diff;
		return count;
    }
}
