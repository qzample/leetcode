package com.jiqiyi;

public class Tiku36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][]{{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		isValidSudoku(board);
	}
	
	// valid sudoku
	public static boolean isValidSudoku1(char[][] board) {
		int[][] row = new int[9][9];
		int[][] col = new int[9][9];
		int[][] ninePatch = new int[9][9];		
		for(int i = 0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j] == '.') {
					continue;
				}
				int num = board[i][j] - '0'-1;
				if(row[i][num]!=0 || col[num][j]!=0 || ninePatch[(i/3)*3+j/3][num]!=0) {
					return false;
				}
				row[i][num] = 1;
				col[num][j] = 1;
				ninePatch[(i/3)*3+j/3][num] = 1;
			}
		}
		return true;
    }
	
	// bit method
	public static boolean isValidSudoku(char[][] board) {
		int[] row = new int[9];
		int[] col = new int[9];
		int[] ninePatch = new int[9];
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(board[i][j] == '.') {
					continue;
				}
				int num = board[i][j] - '0';
				int shift = 1<<num;
				if((row[i] & shift) != 0 || (col[j] & shift) != 0 || (ninePatch[(i/3)*3+j/3] & shift) !=0) {
					return false;
				}
				row[i] |= 1<<num;
				col[j] |= 1<<num;
				ninePatch[(i/3)*3+j/3] |= 1<<num;
			}
		}
		return true;
	}

}
