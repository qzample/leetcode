package com.jiqiyi;

public class Tiku58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int lengthOfLastWord(String s) {
		char[] chars = s.toCharArray();
		int index = chars.length-1;
		int cnt=0;
		if(chars[index]==' ') {
			while (chars[index]==' ') {
				index--;
			}
		}
		while (index>=0 && chars[index]!=' ') {
			index--;
			cnt++;
		}
		return cnt;
    }

}
