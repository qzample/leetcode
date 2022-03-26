package com.jiqiyi;

import java.util.ArrayList;
import java.util.List;

public class Tiku682 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int calPoints(String[] ops) {
		List<Integer> list  = new ArrayList<Integer>();
		for(String op:ops) {
			switch (op) {
			case "+":
				list.add(list.get(list.size()-1)+list.get(list.size()-2));
				break;
			case "D":
				list.add(list.get(list.size()-1)*2);
				break;
			case "C":
				list.remove(list.size()-1);
				break;
			default:
				list.add(Integer.parseInt(op));
			}
		}
		int sum=0;
		for(Integer item:list) {
			sum+=item;
		}
		return sum;
    }

}
