package com.jiqiyi;

public class Tiku06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AB";
		int numRows = 1;
		convert(s, numRows);
		
	}
	
	public static String convert(String s, int numRows) {
		if(s.length()<numRows || numRows==1) return s;
		StringBuilder[] sbArray = new StringBuilder[numRows];
		int flag = -1;
		int row = 0;
		char[] sChars = s.toCharArray();
		int len = sChars.length;
		for(int i=0;i<numRows;i++) {
			sbArray[i] = new StringBuilder();
		}
		for(int i=0;i<len;i++) {
			sbArray[row].append(String.valueOf(sChars[i]));
			if(row==0 || row==numRows-1) flag = -flag;
			row += flag;
		}
		StringBuilder res = new StringBuilder();
		for(StringBuilder item:sbArray) {
			res.append(item);
		}
		return res.toString();
    }

}
