package com.jiqiyi;

import java.util.HashSet;

public class Tiku217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> hashSet = new HashSet<Integer>();
		for(Integer item:nums) {
			if(hashSet.contains(item)) {
				return true;
			}
			hashSet.add(item);
		}
		return false;
    }

}
