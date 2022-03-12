package com.jiqiyi;

public class Tiku8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi("2147483646"));
	}
	
	public static int myAtoi1(String s) {
		// 48 - 57
		if(null==s || "".equals(s)) return 0;
		char[] input = s.toCharArray();
		int index = 0;
		int sign = 1;
		while(input[index]==' ')
		{
			index++;
			if(index>=s.length()) return 0;
		}		
		if(input[index] == '+')
		{
			sign = 1; index++;
		}
		else if(input[index] == '-') 
		{
			sign = -1; index++;
		}
		if(index > s.length() || input[index]<'0' || input[index]>'9')
		{
			return 0;
		}
		int prev = input[index] - '0',next = prev,item;index++;
		while (index < s.length() && input[index]>='0' && input[index]<='9') {
			item = input[index] - '0';
			prev = next;
			next = prev*10 + item;
			if(prev != next/10)
			{
				return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			index++;
		}
		return sign*next;
    }
	
	
	
	public static int myAtoi(String s) {
		if(s==null || s.length()==0) return 0;
		char[] input = s.toCharArray();
		int index = 0,len = input.length,sign=1;
		int res = 0;
		while (index < len && input[index]==' ') {
			index++;
		}
		if(index==len) return 0;
		if(input[index]=='-') {
			sign=-1;
			index++;
		}
		else if(input[index]=='+') {
			index++;
		}
		int temp;
		while (index<len && Character.isDigit(input[index])) {
			temp = res;			
			res = res*10 + input[index] - '0';
			if(temp != res/10) {
				if(sign==1) return Integer.MAX_VALUE;
				else return Integer.MIN_VALUE;
			}
			index++;
		}
		return sign*res;
	}
	
	
	
	

}
