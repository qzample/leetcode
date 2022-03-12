package com.jiqiyi;

public class Tiku14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public String longestCommonPrefix(String[] strs) {
    	if(strs==null || strs.length==0) return "";
    	StringBuilder sb = new StringBuilder(strs[0]);
    	for(int i=0;i<strs.length;i++) {
    		while(strs[i].indexOf(sb.toString())!=0) {
    			sb.deleteCharAt(sb.length()-1);
    		}
    	}
    	return sb.toString();
    }
}
