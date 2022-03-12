package com.jiqiyi;

import java.util.HashSet;

public class Tiku1763 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "YazaAay";
		System.out.println(longestNiceSubstring(s));
	}
	
	public static String longestNiceSubstring(String s) {
		String ans = "";
		int len = s.length();
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(j-i+1>ans.length() && check(s.substring(i,j+1))) ans = s.substring(i,j+1);
			}
		}
		return ans;
    }
	
	public static boolean check(String str) {
		HashSet<Character> hashSet = new HashSet<Character>();
		char[] chars = str.toCharArray();
		for(Character ch:chars)
		{
			hashSet.add(ch);
		}
		for(Character ch:hashSet)
		{
			char upper = Character.toUpperCase(ch);
			char lower = Character.toLowerCase(ch);
			if(!hashSet.contains(upper) || !hashSet.contains(lower)) return false;
		}
		return true;
	}

}
