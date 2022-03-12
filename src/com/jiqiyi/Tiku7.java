package com.jiqiyi;

public class Tiku7 {
	public static void main(String[] args) {
		int a = 1534236469;
		System.out.println(reverse(a));
	}
	
	public static int reverse1(int x) {
		char[] num = String.valueOf(x).toCharArray();
		int head = 0,tail=num.length-1;
		if(num[head]=='-') head++;
		char temp;
		while (head<tail) {
			temp = num[head];
			num[head] = num[tail];
			num[tail] = temp;
			head++;
			tail--;
		}
		try {
			return Integer.valueOf(String.valueOf(num));
		} catch (Exception e) {
			return 0;
		}
    }
	
	public static int reverse(int x) {		
		int res = 0;
		while (x!=0) {
			if(x>(Integer.MAX_VALUE/10) || x<(Integer.MIN_VALUE/10)) {
				return 0;
			}
			res = res*10 + x%10;
			x /= 10;			
		}
		return res;
	}
}
