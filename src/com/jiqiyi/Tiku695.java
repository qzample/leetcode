package com.jiqiyi;

public class Tiku695 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int maxAreaOfIsland(int[][] grid) {
		int[][] visited = new int[grid.length][grid[0].length];
		int max = 0;
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				if(grid[i][j]==1 && visited[i][j]==0) {
					int sum = dfs(grid, visited, i, j, 0);
					max = sum > max ? sum : max;
				}
			}
		}
		return max;
    }
	
	public int dfs(int[][] grid,int[][] visited,int x,int y,int sum) {
		if(x<0||x>=grid.length || y<0||y>=grid[0].length || visited[x][y]==1) return sum;
		visited[x][y]=1;
		if(grid[x][y]==1) {
			sum = 1+dfs(grid, visited, x+1, y, sum) + dfs(grid, visited, x-1, y, sum) + dfs(grid, visited, x, y+1, sum) + dfs(grid, visited, x, y-1, sum);
		}
		return sum;
	}

}
