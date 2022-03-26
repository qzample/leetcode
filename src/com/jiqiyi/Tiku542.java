package com.jiqiyi;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Tiku542 {
	public int[][] updateMatrix(int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;
		int[][] dic = {{0,1},{0,-1},{1,0},{-1,0}};
		Queue<int[]> queue = new LinkedList<int[]>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==0) {
					queue.offer(new int[]{i,j});
				}
				else {
					mat[i][j] = -1;
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] pos = queue.poll();
			for(int i=0;i<4;i++) {
				int x = pos[0]+dic[i][0],y=pos[1]+dic[i][1];
				if(x>=0 && x<m && y>=0 && y<n && mat[x][y]==-1) {
					mat[x][y] = mat[pos[0]][pos[1]]+1;
					queue.offer(new int[] {x,y});
				}
			}
		}
		return mat;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// the second time to practice
	public int[][] updateMatrix2(int[][] mat) {
		int[][] dic = {{0,1},{0,-1},{1,0},{-1,0}};
		int m = mat.length;
		int n = mat[0].length;
		Queue<int[]> queue = new LinkedList<int[]>();
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(mat[i][j]==0) {
					queue.offer(new int[] {i,j});
				}
				else if (mat[i][j]==1) {
					mat[i][j] = -1;
				}
			}
		}
		
		while(!queue.isEmpty()) {
			int[] pos = queue.poll();
			for(int i=0;i<4;i++) {
				int x = pos[0]+dic[i][0],y = pos[1]+dic[i][1];
				if(x>=0 && x<m && y>=0 && y<n && mat[x][y]==-1) {
					mat[x][y] = mat[pos[0]][pos[1]] + 1;
					queue.offer(new int[] {x,y});
				}
			}
		}
		return mat;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
