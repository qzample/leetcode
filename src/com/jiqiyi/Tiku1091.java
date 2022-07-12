package com.jiqiyi;

import java.util.LinkedList;
import java.util.Queue;

class Tiku1091 {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0},{1,1},{1,-1},{-1,1},{-1,-1}};
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        if(grid[0][0]==1 || grid[m-1][n-1]==1) return -1;
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});
        int path = 0;
        while(!queue.isEmpty()){
            path++;
            for(int i=0,j=queue.size();i<j;i++){
                int[] loc = queue.poll();
                int x = loc[0];
                int y = loc[1];
                if(x==m-1 && y==n-1) return path;
                for(int k=0;k<8;k++){
                    int ax = x+dir[k][0];
                    int ay = y+dir[k][1];
                    if(ax<0 || ax>=n || ay<0 || ay>=m) continue;
                    if(visited[ax][ay] || grid[ax][ay]==1) continue;
                    visited[ax][ay] = true;
                    queue.offer(new int[]{ax,ay});
                }
            }
        }
        return -1;
    }


    /**
     * the second time practice
     * @param grid
     * @return
     */
    public int shortestPathBinaryMatrix2(int[][] grid) {
        int[][] dict = new int[][]{{1,0},{-1,0},{0,1},{0,-1},{1,-1},{1,1},{-1,1},{-1,-1}};
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){

                }
            }
        }
        return -1;
    }

    boolean[][] visited = new boolean[][];

    public void dfs(int[][] grid, int x, int y, int cnt){
        if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]>0) return;
        grid[x][y] -= 1;
        cnt++;
        if(x==grid.length-1 && y==grid[0].length-1) return;
    }
}
