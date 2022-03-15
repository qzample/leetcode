package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tiku599 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String[] findRestaurant(String[] list1, String[] list2) {
    	Map<String,Integer> map = new HashMap<String, Integer>();
    	int len1 = list1.length;
    	int len2 = list2.length;
    	for(int i=0;i<len1;i++) {
    		map.put(list1[i], i);
    	}
    	int min = 2000;
    	List<String> res = new ArrayList<String>();
    	for(int i=0;i<len2;i++) {
    		if(map.containsKey(list2[i])) {
    			int cur = i+map.get(list2[i]);;
    			if(cur < min) {
    				res.clear();
    				res.add(list2[i]);
    				min = cur;
    			}
    			else if(cur == min) {
    				res.add(list2[i]);
    			}
    		}
    	}
    	return res.toArray(new String[res.size()]);
    }

}
