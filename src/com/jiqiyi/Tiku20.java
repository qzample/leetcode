package com.jiqiyi;

import java.util.Stack;

public class Tiku20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isValid("({[})");
	}
	
	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();
		char tc = ' ';
		for(Character ch:arr) {
			if(ch=='{' || ch=='[' || ch =='(') {
				tc = ch;
				stack.add(ch);
			}
			else {
				if((ch=='}' && tc !='{') || (ch==']' && tc !='[') || (ch==')' && tc !='(') ) {
					return false;
				}
				else {
					stack.pop();
					if(stack.isEmpty()) {
						tc = ' ';
						continue;
					}
					tc = stack.peek();
				}
			}
		}
		return tc==' ';
    }

}
