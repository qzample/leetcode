package com.jiqiyi;

public class Tiku13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int romanToInt(String s) {
		char[] arr = s.toCharArray();
		int len = arr.length;
		int value = 0;
		for(int i=0;i<len;i++) {
			switch (arr[i]) {
			case 'I':
				if(i+1<len) {
					switch (arr[i+1]) {
					case 'V':
						value += 4;
						i++;
						break;
					case 'X':
						value += 9;
						i++;
						break;
					default:
						value++;
						break;
					}
				}
				else {
					value++;
				}
				break;
			case 'V':
				value+=5;
				break;
			case 'X':
				if(i+1<len) {
					switch (arr[i+1]) {
					case 'L':
						value += 40;
						i++;
						break;
					case 'C':
						value += 90;
						i++;
						break;
					default:
						value+=10;
						break;
					}
				}
				else {
					value+=10;
				}
				break;
			case 'L':
				value+=50;
				break;
			case 'C':
				if(i+1<len) {
					switch (arr[i+1]) {
					case 'D':
						value += 400;
						i++;
						break;
					case 'M':
						value += 900;
						i++;
						break;
					default:
						value+=100;
						break;
					}
				}
				else {
					value+=100;
				}
				break;
			case 'D':
				value+=500;
				break;
			case 'M':
				value+=1000;
				break;
			default:
				break;
			}
		}
		return value;
    }

}
