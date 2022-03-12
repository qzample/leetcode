package com.jiqiyi;

import java.util.Arrays;

public class Tiku917 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "ab-cd";
		System.out.println(reverseOnlyLetters(string));
	}
	
	public static String reverseOnlyLetters(String s) {
        char[] charArr = s.toCharArray();
        int head = 0,tail = charArr.length-1;
        while(head<tail) {        	
        	if(Character.isLetter(charArr[head])) {
        		if(Character.isLetter(charArr[tail])){
        			char temp = charArr[head];
        			charArr[head] = charArr[tail];
        			charArr[tail] = temp;
        			head++;
        			tail--;
        		}
        		else {
        			tail--;
        		}
        	}
        	else {
        		head++;
        	}
        }
        return String.valueOf(charArr);
    }

}
