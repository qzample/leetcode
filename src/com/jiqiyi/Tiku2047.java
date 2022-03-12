package com.jiqiyi;

public class Tiku2047 {
	public static void main(String[] args) {
		String sentence = "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.";
		System.out.println(countValidWords(sentence));
	}
	
	public static int countValidWords(String sentence) {
		String[] strs = sentence.trim().split("\\s+");
		int count = 0;
		for(int i=0;i<strs.length;i++)
		{
			if(isToken(strs[i].trim()))
			{
				count++;
			}
			
		}
		return count;
    }
	
	public static boolean isToken(String str)
	{
		if(Character.isLowerCase(str.charAt(0)))
		{
			return recurJudge(str,0,0,0);
		}
		else if(str.charAt(0) == '!' || str.charAt(0) == '.' || str.charAt(0) == ',')
		{
			if(str.length()==1) return true;
			else return false;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean recurJudge(String str,int cur,int pTime,int hTime)
	{
		if(cur == str.length()) return true;
		else if(Character.isDigit(str.charAt(cur))) return false;
		else if(str.charAt(cur) == '!' || str.charAt(cur) == ',' || str.charAt(cur) == '.')
		{
			pTime++;
			if(pTime >= 2) return false;
			if(cur != str.length()-1) return false;
		}
		else if(str.charAt(cur) == '-')
		{
			hTime++;
			if(hTime >= 2) return false;
			if(cur == str.length()-1 || !Character.isLowerCase(str.charAt(cur+1))) return false;
		}		
		return recurJudge(str, cur+1, pTime, hTime);
	}
}
