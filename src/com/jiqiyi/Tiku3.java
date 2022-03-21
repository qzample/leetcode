package com.jiqiyi;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Tiku3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "dvdf";
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring1(String s) {
		int i=0,j=0;
		char[] arr = s.toCharArray();
		int len = arr.length;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		while(j<len) {
			if(map.getOrDefault(arr[j], -1)>=i) {
				i=map.get(arr[j])+1;
				map.put(arr[j], j);
			}
			else {
				map.put(arr[j], j);
				max = Math.max(max, j-i+1);
			}
			j++;
		}
		return max;
    }

	// queue's solution
	public static int lengthOfLongestSubstring(String s) {
		Queue<Character> queue = new LinkedList<Character>();
		int max = 0;
		char[] arr = s.toCharArray();
		for(char ch:arr) {
			while (queue.contains(ch)) {
				queue.poll();
			}
			queue.offer(ch);
			max = Math.max(max, queue.size());
		}
		return max;
	}
}
