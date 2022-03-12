package com.jiqiyi;

import java.util.ArrayDeque;
import java.util.Deque;

public class Tiku838 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dominoes = ".L.R...LR..L..";
		pushDominoes(dominoes);
	}
	
	public static String pushDominoes(String dominoes) {
		char[] cs = dominoes.toCharArray();
        int n = cs.length;
        int[] g = new int[n];
        Deque<int[]> d = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (cs[i] == '.') continue;
            int dire = cs[i] == 'L' ? -1 : 1;
            d.add(new int[]{i, 1, dire});
            g[i] = 1;
        }
        while (!d.isEmpty()) {
            int[] info = d.pollFirst();
            int loc = info[0], time = info[1], dire = info[2];
            int ne = loc + dire;
            if (cs[loc] == '.' || (ne < 0 || ne >= n)) continue;
            if (g[ne] == 0) { // ŽñŽŸŽó—Í
                d.addLast(new int[]{ne, time + 1, dire});
                g[ne] = time + 1;
                cs[ne] = dire == -1 ? 'L' : 'R';
            } else if (g[ne] == time + 1) { // ‘½ŽŸŽó—Í
                cs[ne] = '.';
            }
        }
        return String.valueOf(cs);
    }
}
