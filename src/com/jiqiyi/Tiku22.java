package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku22 {
	List<String> res = new ArrayList<String>();
	StringBuilder sb = new StringBuilder();
	public List<String> generateParenthesis(int n) {
		dfs(n, 0, 0);
		return res;
    }
	
	public void dfs(int n,int left,int right) {
		if(left==n && right==n) {
			res.add(sb.toString());
			return;
		}
		if(left==n) {
			sb.append(")");
			dfs(n, left,right+1);
			sb.deleteCharAt(sb.length()-1);
		}
		else if(right==n) {
			sb.append("(");
			dfs(n, left+1, right);
			sb.deleteCharAt(sb.length()-1);
		}
		else if(left>=right) {
			if(right==left) {
				sb.append("(");
				dfs(n, left+1, right);
				sb.deleteCharAt(sb.length()-1);
			}
			else {
				sb.append("(");
				dfs(n, left+1, right);
				sb.deleteCharAt(sb.length()-1);
				sb.append(")");
				dfs(n, left,right+1);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}
}
