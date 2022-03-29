package com.jiqiyi;

import java.util.List;

public class Tiku120 {
	public int minimumTotal(List<List<Integer>> triangle) {
		int m = triangle.size();
		if(m<=2) return triangle.get(0).get(0);
		int[][] dp = new int[m][m];
		dp[0][0] = 0;
		dp[1][0] = triangle.get(0).get(0);
		dp[1][1] = dp[1][0];
		for(int i=2;i<m;i++) {
			for(int j=0;j<triangle.get(i).size();j++) {
				if(j==0) {
					dp[i][j] = dp[i-1][0] + triangle.get(i-1).get(0);
				}
				else if(j==triangle.get(i).size()-1) {
					dp[i][j] = dp[i-1][triangle.get(i-1).size()-1] + triangle.get(i-1).get(triangle.get(i-1).size()-1);
				}
				else {
					dp[i][j] = Math.min(dp[i-1][j]+triangle.get(i-1).get(j), dp[i-1][j-1]+triangle.get(i-1).get(j-1));
				}
			}
		}
		int min = Integer.MAX_VALUE;
		for(int j=0;j<triangle.get(m-1).size();j++) {
			int temp = dp[m-1][j] + triangle.get(m-1).get(j);
			min = min > temp?temp:min;
		}
		return min;
    }
}
