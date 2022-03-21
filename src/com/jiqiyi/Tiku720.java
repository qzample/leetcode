package com.jiqiyi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Tiku720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
		System.out.println(longestWord(words));
	}
	
	public static String longestWord(String[] words) {
		Arrays.sort(words, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				if(o1.length()!=o2.length()) {
					return o1.length() - o2.length();
				}
				else {
					return o1.compareTo(o2);
				}
			}
		});
		Set<String> set = new HashSet<String>();
		set.add("");
		String res = "";
		int n = words.length;
		for(int i=0;i<n;i++) {
			String word = words[i];
			if(set.contains(word.substring(0, word.length()-1))){
				res = word;
			}
			set.add(word);
		}
		return res;
    }

}
