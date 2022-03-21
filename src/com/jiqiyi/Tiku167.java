package com.jiqiyi;

import java.util.HashMap;

public class Tiku167 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] twoSum1(int[] numbers, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] res = new int[2];
		int n = numbers.length;
		for(int i=0;i<n;i++) {
			if(map.containsKey(target-numbers[i])) {
				res[0] = map.get(target-numbers[i]);
				res[1] = i+1;
				return res;
			}
			map.put(numbers[i], i+1);
		}
		return null;
    }
	
	// two pointer's solution
	public int[] twoSum(int[] numbers, int target) {
		int len = numbers.length;
		int head = 0, tail = len-1,sum;
		int[] res = new int[2];
		while(head<tail) {
			sum = numbers[head]+numbers[tail];
			if(sum==target) {
				res[0] = head+1;
				res[1] = tail+1;
				break;
			}
			else if(sum<target) {
				head++;
			}
			else {
				tail--;
			}
		}
		return res;
	}

}
