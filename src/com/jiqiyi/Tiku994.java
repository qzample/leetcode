package com.jiqiyi;

import java.util.LinkedList;
import java.util.Queue;

public class Tiku994 {
	public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<int[]>();
        int[][] dic = {{1,0},{-1,0},{0,1},{0,-1}};
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		if(grid[i][j]==2) {
        			queue.offer(new int[] {i,j});
        		}
        		else if(grid[i][j]==1) count++; 
        	}
        }
        int round = 0;
        while(!queue.isEmpty()) {
        	round++;
        	int size = queue.size();
        	while (size>0) {
        		int[] pos = queue.poll();
            	for(int i=0;i<4;i++) {
            		int x = pos[0]+dic[i][0],y= pos[1]+dic[i][1];
            		if(x>=0&&x<m&&y>=0&&y<n&&grid[x][y]==1) {
            			grid[x][y]=2;
            			count--;
            			queue.offer(new int[] {x,y});
            		}
            	}
            	size--;
			}
        }
        if(count>0) return -1;
        return round;
    }
}
