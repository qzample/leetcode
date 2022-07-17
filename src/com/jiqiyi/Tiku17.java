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


	/**
	 * the second time to practice
	 */
	char[] digitChars;
	public List<String> letterCombinations2(String digits) {
		if(digits==null || digits.length()==0) return res;
		digitChars = digits.toCharArray();
		backtrack(0);
		return res;
    }

	public void backtrack(int cur){
		if(sb.length()==digitChars.length){
			res.add(sb.toString());
			return;
		}
		for(int i=cur;i<digitChars.length;i++){
			for(char ch : keyBoard[digitChars[i]-'0'].toCharArray()){
				sb.append(ch);
				backtrack(i+1);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}


	/**
	 * the third time to practice
	 * @param digits
	 * @return
	 */
	public List<String> letterCombinations3(String digits) {
		if(digits==null || digits.length()==0) return res;
		this.digitChars = digits.toCharArray();
		return res;
    }

	public void dfs(int cur){
		if(cur>digitChars.length) return;
		if(sb.length()==digitChars.length){
			res.add(sb.toString());
			return;
		}
		for(char c:keyBoard[digitChars[cur]-'0'].toCharArray()){
			sb.append(c);
			dfs(cur+1);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}
