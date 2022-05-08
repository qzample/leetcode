package com.jiqiyi;

import java.util.Arrays;

public class Tiku79 {
	static int m;
	static int n;
	static String _word;
	static char[][] _board;
	static boolean[][] _visited;
	public static void main(String[] args) {
		char[][] board = {{'C','A','A'},{'A','A','A'},{'B','C','D'}};
		String word = "AAB";
		System.out.println(exist(board, word));
	}
	public static boolean exist(char[][] board, String word) {
		m = board.length;
		n = board[0].length;
		_word = word;
		_board = board;
		_visited = new boolean[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(board[i][j]==word.charAt(0) && bfs(i, j, 0)) return true;
			}
		}
		return false;
    }
	
	public static boolean bfs(int x,int y,int index) {
		if(x<0 || x>=m || y<0 || y>=n || _visited[x][y] || _board[x][y]!=_word.charAt(index)) return false;
		if(index==_word.length()-1) return true;
		char tmp = _board[x][y];
		_board[x][y] = '.';
		boolean res =  bfs(x+1, y, index+1) ||
				bfs(x-1, y, index+1) ||
				bfs(x, y+1, index+1) ||				
				bfs(x, y-1, index+1);
		_board[x][y] = tmp;
		return res;
	}


	/**
	 * the second time to practice
	 */
	public boolean exist2(char[][] board, String word) {
		m = board.length;
		n = board[0].length;
		_word = word;
		_board = board;
		_visited = new boolean[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(board[i][j]==word.charAt(0)){
					if(backtrack(i, j, 0)) return true;
				}
			}
		}
		return false;
    }
	public boolean backtrack(int i,int j, int index){
		if(i<0 || i>=m || j<0 || j>=n || _visited[i][j] || _board[i][j]!=_word.charAt(index)) return false;
		if(index == _word.length()-1) return true;
		char tmp = _board[i][j];
		_board[i][j] = '.';
		boolean res = backtrack(i+1, j, index+1) || backtrack(i-1, j, index+1) || backtrack(i, j-1, index+1) || backtrack(i, j+1, index+1);
		_board[i][j] = tmp;
		return res;
	}
}
