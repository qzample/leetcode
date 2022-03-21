package com.jiqiyi;

public class Tiku557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
		char[] arr = s.toCharArray();
		int len = arr.length;
		int head = 0,tail = head;
		while (tail<len) {
			while(tail<len && arr[tail]!=' ') tail++;
			reverse(head, tail-1, arr);
			tail++;
			head = tail;
		}
		StringBuilder sb = new StringBuilder();
		for(char item:arr) {
			sb.append(item);
		}
		return sb.toString();
    }
	
	public static void reverse(int head,int tail,char[] arr) {
		char temp;
		while (head<tail) {
			temp = arr[head];
			arr[head] = arr[tail];
			arr[tail] = temp;
			head++;
			tail--;
		}
	}

}
