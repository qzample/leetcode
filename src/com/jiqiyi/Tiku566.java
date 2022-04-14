package com.jiqiyi;

public class Tiku566 {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int m = mat.length;
		int n = mat[0].length;
		if(m*n!=r*c) return mat;
		int[][] res = new int[r][c];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				int temp = i*n+j;
				int nj = temp%c;
				int ni = temp/c;
				res[ni][nj] = mat[i][j];
			}
		}
		return res;
    }
}
