package com.jiqiyi;

public class Tiku733 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
		int sr = 1, sc = 1, newColor = 2;
		floodFill(image, sr, sc, newColor);
	}
	
	public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
		int[][] visited = new int[image.length][image[0].length];
		dfs(image,visited, sr, sc, image[sr][sc], newColor);
		return image;
    }
	
	public static void dfs(int[][] image,int[][] visited,int sr,int sc,int oldColor,int newColor) {
		if(sr>=image.length || sr<0 || sc>=image[0].length || sc<0 || visited[sr][sc]==1) return;
		visited[sr][sc] = 1;
		if(image[sr][sc]==oldColor) {
			image[sr][sc] = newColor;
			dfs(image,visited, sr-1, sc, oldColor, newColor);
			dfs(image,visited, sr+1, sc, oldColor, newColor);
			dfs(image,visited, sr, sc-1, oldColor, newColor);
			dfs(image,visited, sr, sc+1, oldColor, newColor);
		}
	}

}
