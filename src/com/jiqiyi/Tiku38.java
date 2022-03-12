package com.jiqiyi;

public class Tiku38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countAndSay(5));
	}
	
    public static String countAndSay(int n) {
    	if(n==1) return "1";
    	char[] chars = countAndSay(n-1).toCharArray();
    	StringBuilder res = new StringBuilder();
    	int start = 0,end = 0,len = chars.length;
    	while(start<len) {
    		while (end<len && chars[start] == chars[end]) {
				end++;
			}
    		res.append(end-start).append(chars[start]);
    		start = end;
    	}
    	return res.toString();
    }

}
