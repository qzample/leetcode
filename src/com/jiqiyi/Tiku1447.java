package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku1447 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println(simplifiedFractions(10));
	}
	
	public static List<String> simplifiedFractions(int n) {
		List<String> list = new ArrayList<String>();
		for(int i=1;i<n;i++)
		{
			for(int j=i+1;j<=n;j++)
			{
//				if(!haveCommonDivisor(i,j)) list.add(i+"/"+j);
//				if(gcd(i, j) == 1) list.add(i+"/"+j);
				if(gcf(j, i) == 1) list.add(i+"/"+j);
			}
		}
		return list;
    }
	
	public static boolean haveCommonDivisor(int a,int b)
	{
		if(a==1) return false;
		else {
			for(int i=2;i<=a;i++)
			{
				if(a%i == 0 && b%i == 0) return true;
			}			
		}
		return false;
	}
	
//	欧几里得算法（辗转相除法）
	
	public static int gcd(int a,int b)
	{
		return b==0?a:gcd(b,a%b);
	}
	
//	更相减损法
	public static int gcf(int a,int b)
	{
		if(a==a-b) return a;
		return b>a-b?gcf(b, a-b):gcf(a-b, b);
	}

}
