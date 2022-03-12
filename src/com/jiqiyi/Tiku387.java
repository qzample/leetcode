package com.jiqiyi;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class Tiku387 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int firstUniqChar(String s) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] chars = s.toCharArray();
		for(int i=0;i<s.length();i++) {
			map.put(chars[i],map.getOrDefault(chars[i], 0)+1);
		}
		Iterator<Character> it = map.keySet().iterator();
		while (it.hasNext()) {
			Character ch = it.next();
			if(map.get(ch)==1) {
				return s.indexOf(ch);
			}			
		}
		return 0;
    }

}
