package com.jiqiyi;

public class Tiku344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void reverseString(char[] s) {
		int head = 0,tail = s.length-1;
		char temp;
		while (head<tail) {
			temp = s[head];
			s[head] = s[tail];
			s[tail] = temp;
			head++;
			tail--;
		}
    }

}
