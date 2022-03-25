package com.jiqiyi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Tiku3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abba";
		System.out.println(lengthOfLongestSubstring22(s));
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
	
	
	
	
	
	
	
	
	
	
	
	
	// twice practice
	public static int lengthOfLongestSubstring21(String s) {
		Queue<Character> queue = new LinkedList<Character>();
		char[] arr = s.toCharArray();
		int max = 0;
		for(Character ch:arr) {
			while (queue.contains(ch)) {
				queue.poll();
			}
			queue.offer(ch);
			max = queue.size()>max?queue.size():max;
		}
		return max;
    }
	
	public static int lengthOfLongestSubstring22(String s) {
		int[] freq = new int[128];
		Arrays.fill(freq, -1);
		char[] chars = s.toCharArray();
		int len = chars.length;
		int l=0,r=0,max=0,length=0;
		while (r<len) {
			if(r<len && freq[chars[r]]<l) {
				freq[chars[r]]=r;
			}
			else {
				l=freq[chars[r]]+1;
				freq[chars[r]]=r;
			}
			length = r-l+1;
			max = length>max?length:max;
			r++;
		}
		return max;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
