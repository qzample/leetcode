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



	/**
	 * the second time to practice
	 */
	public List<String> generateParenthesis2(int n) {
		backtrack(0, 0, n);
		return res;
    }
	public void backtrack(int l,int r,int n){
		if(l==n && r==n){
			res.add(sb.toString());
			return;
		}
		if(r==l){
			sb.append('(');
			backtrack(l+1, r, n);
			sb.deleteCharAt(sb.length()-1);
		}
		else if(l>r){
			if(l==n){
				sb.append(')');
				backtrack(l, r+1, n);
				sb.deleteCharAt(sb.length()-1);
			}
			else{
				sb.append('(');
				backtrack(l+1, r, n);
				sb.deleteCharAt(sb.length()-1);
				sb.append(')');
				backtrack(l, r+1, n);
				sb.deleteCharAt(sb.length()-1);
			}
		}
	}

	
	/**
	 * the third time to practice
	 * @param n
	 * @return
	 */
	public List<String> generateParenthesis3(int n) {
		dfs3(0,0,n);
		return res;
    }

	public void dfs3(int left,int right,int n){
		if(left>n || right>n || left<right) return;
		if(left==n && right==n){
			res.add(sb.toString());
			return;
		}
		if(left>right){
			sb.append("(");
			dfs3(left+1, right, n);
			sb.deleteCharAt(sb.length()-1);
			sb.append(")");
			dfs3(left, right+1, n);
			sb.deleteCharAt(sb.length()-1);
		}
		else{
			sb.append("(");
			dfs3(left+1, right, n);
			sb.deleteCharAt(sb.length()-1);
		}
	}
}
