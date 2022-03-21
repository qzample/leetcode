package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Tiku49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		groupAnagrams(strs);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for(String str:strs) {
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			String key = String.valueOf(arr);
			if(map.containsKey(key)) {
				map.get(key).add(str);
			}
			else {
				List<String> list = new ArrayList<String>();
				list.add(str);
				map.put(key, list);
			}
		}
		List<List<String>> res = new ArrayList<List<String>>();
		for(List<String> list:map.values()) {
			res.add(list);
		}
		return res;
    }

}
