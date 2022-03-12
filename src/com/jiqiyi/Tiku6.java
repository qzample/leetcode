package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convert("PAYPALISHIRING",3));
	}
	
	public static String convert(String s, int numRows) {
		if(s.length()==1) return s;
		List<StringBuilder> res = new ArrayList<StringBuilder>();
		for(int i=0;i<numRows;i++) res.add(new StringBuilder(""));
		int n = 0,flag = -1;
		for(char ch:s.toCharArray())
		{			
			if(n==0 || n==numRows-1) flag = -flag;
			res.get(n).append(ch);
			n += flag;
		}
		StringBuilder sb = new StringBuilder("");
		for(StringBuilder item : res)
		{
			sb.append(item);
		}
		return sb.toString();
    }
}
