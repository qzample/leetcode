package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiku119 {
	static List<List<Integer>> list = new ArrayList<List<Integer>>(33);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	static {
		list.add(Arrays.asList(1));
		list.add(Arrays.asList(1,1));
		for(int i=2;i<33;i++) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(1);
			for(int j=1;j<i;j++) {
				temp.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
			}
			temp.add(1);
			list.add(temp);
		}
	}
	
	public List<Integer> getRow(int rowIndex) {
		return list.get(rowIndex);
    }

}
