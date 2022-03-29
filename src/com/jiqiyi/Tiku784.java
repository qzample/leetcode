package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku784 {
	List<String> res = new ArrayList<String>();
	public List<String> letterCasePermutation(String s) {
		char[] sChars = s.toCharArray();
		dfs(sChars, sChars.length, 0,"");
		return res;
    }
	
	public void dfs(char[] sChars,int length,int start,String str) {
		if(start>=length || str.length() == length) {
			res.add(str);
			return;
		}
		if(Character.isDigit(sChars[start])) {
			dfs(sChars, length, start+1, str+sChars[start]);
		}
		else {
			dfs(sChars, length, start+1, str+sChars[start]);
			dfs(sChars, length, start+1, str+((char)(sChars[start]^32)));
		}
	}
}
