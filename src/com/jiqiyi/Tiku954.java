package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tiku954 {
	
	public static void main(String[] args) {
		int[] arr = {2,1,2,1,1,1,2,2};
		canReorderDoubled(arr);
	}
	
	public static boolean canReorderDoubled(int[] arr) {
		Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (i < 0) {
            if (map.containsKey(2 * i) && map.get(2 * i) != 0) {
                map.put(2 * i, map.get(2 * i) - 1);
            } else {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            }
            else {
                if (map.containsKey(i) && map.get(i) != 0) {
                    map.put(i, map.get(i) - 1);
                } else {
                    map.put(2 * i, map.getOrDefault(2 * i, 0) + 1);
                }
            }
        }
        for (int i : map.values()) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
