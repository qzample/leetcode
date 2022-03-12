package com.jiqiyi;

public class Tiku242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nl";
		String t ="cx";
		isAnagram(s, t);
	}
	
	public static boolean isAnagram(String s, String t) {
		char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
		int len = sChars.length;
        if(len!=tChars.length) return false;
		int[] alpha = new int[26];        
        for(int i=0;i<len;i++) {
        	alpha[sChars[i]-'a']++;
        	alpha[tChars[i]-'a']--;
        }
        for(int i=0;i<26;i++) {
        	if(alpha[i]!=0) return false;
        }
        return true;
    }

}
