package com.jiqiyi;

public class Tiku200 {
	public int numIslands(char[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int count = 0;
		boolean[][] visited = new boolean[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(!visited[i][j] && grid[i][j]=='1') {
					dfs(grid,visited, i, j);
					count++;
				}
			}
		}
		return count;
    }
	
	public void dfs(char[][] grid,boolean[][] visited,int x,int y) {
		if(x<0 || x>grid.length || y<0 || y>grid[0].length || visited[x][y]) return;
		visited[x][y]=true;
		dfs(grid, visited, x-1, y);
		dfs(grid, visited, x+1, y);
		dfs(grid, visited, x, y-1);
		dfs(grid, visited, x, y+1);
	}




	/**
	 * the second time to practice
	 */	
	int m = 0;
	int n = 0;
	char[][] grid;
	boolean[][] visited;
	public int numIslands2(char[][] grid) {
		m = grid.length;
		n = grid[0].length;
		this.grid = grid;
		int cnt = 0;
		visited = new boolean[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(!visited[i][j] && grid[i][j]=='1'){
					dfs(i,j);
					cnt++;
				}
			}
		}
		return cnt;
    }

	public void dfs(int x,int y){
		if(x<0 || x>=m || y<0 || y>=n || visited[x][y]) return;
		if(grid[x][y]!='1') return;
		visited[x][y] = true;
		dfs(x+1,y);
		dfs(x-1,y);
		dfs(x,y+1);
		dfs(x,y-1);
	}



	/**
	 * the third time to practice
	 * @param grid
	 * @return
	 */
	public int numIslands3(char[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int cnt = 0;
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(grid[i][j]=='1'){
					cnt++;
					dfs(grid, i, j);
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(grid[i][j]=='-') grid[i][j]='1';
			}
		}
		return cnt;
    }

	public void dfs(char[][] grid,int x,int y){
		if(x<0 || x>=grid.length || y<0 || y>=grid[0].length || grid[x][y]!='1') return;
		grid[x][y] = '-';
		dfs(grid, x+1, y);
		dfs(grid, x-1, y);
		dfs(grid, x, y+1);
		dfs(grid, x, y-1);
	}
}
