package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku17 {
	String[] keyBoard = {
		"",
		"abc",
		"def",
		"ghi",
		"jkl",
		"mno",
		"pqrs",
		"tuv",
		"wxyz"
	};
	StringBuilder sb = new StringBuilder();
	List<String> res = new ArrayList<String>();
	public List<String> letterCombinations(String digits) {		
		if(digits==null || digits.length()==0) return res;
		dfs(digits, 0);
		return res;
    }
	
	public void dfs(String digits,int index) {
		if(sb.length()==digits.length()) {
			res.add(sb.toString());
			return;
		}
		char[] chars = keyBoard[digits.charAt(index)-'1'].toCharArray();
		for(char ch:chars) {
			sb.append(ch);
			dfs(digits, index+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}
