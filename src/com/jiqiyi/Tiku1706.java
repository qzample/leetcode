package com.jiqiyi;

import java.util.Arrays;

public class Tiku1706 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{1,1,1,-1,-1},{1,1,1,-1,-1},{-1,-1,-1,1,1},{1,1,1,1,-1},{-1,-1,-1,-1,-1}};
		int[] res = findBall(grid);
		System.err.println();
	}
	
	public static int[] findBall(int[][] grid) {
		if(grid==null || grid[0].length==0) return null;
		int[] res = new int[grid[0].length];
		for(int j=0;j<grid[0].length;j++) {
			int ballLoc = j;
			for(int i=0;i<grid.length;i++) {
				if(grid[i][ballLoc] == -1) {
					if(ballLoc == 0 || grid[i][ballLoc-1] == 1) {
						res[j] = -1;
						break;
					}
					else {
						ballLoc -= 1;					
					}
				}
				else {
					if(ballLoc == grid[0].length-1 || grid[i][ballLoc+1] == -1) {
						res[j] = -1;
						break;
					}
					else {
						ballLoc += 1;
					}
				}
				if(i==grid.length-1) res[j] = ballLoc;
			}
		}
		return res;
    }
}
