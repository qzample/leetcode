package com.jiqiyi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tiku73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
		setZeroes(matrix);
	}
	
	public void setZeroes1(int[][] matrix) {
		// directly use another two dimension matrix to store the infomation of 0's location
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				if(matrix[i][j]==0) list.add(Arrays.asList(i,j));
			}
		}
		for(int i=0;i<list.size();i++) {
			fillZero(matrix, list.get(i).get(0), list.get(i).get(1));
		}
    }
	
	public void fillZero(int[][] matrix, int x,int y) {
		for(int i=0;i<matrix.length;i++) {
			matrix[i][y]=0;
		}
		for(int j=0;j<matrix[x].length;j++) {
			matrix[x][j]=0;
		}
	}
	
	public static void setZeroes(int[][] matrix) {
		// use the first row and first column to store the 0's location
		int m = matrix.length;
		int n = matrix[0].length;
		boolean flag_col0=false;
		boolean flag_row0=false;
		for(int j=0;j<n;j++) {
			if(matrix[0][j]==0) {
				flag_row0 = true;
				break;
			}
		}
		for(int i=0;i<m;i++) {
			if(matrix[i][0]==0) {
				flag_col0 = true;
				break;
			}
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(matrix[i][j]==0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(matrix[i][0]==0 || matrix[0][j]==0) {
					matrix[i][j]=0;
				}
			}
		}
		
		if(flag_col0) {
			for(int i=0;i<m;i++) {
				matrix[i][0]=0;
			}
		}
		
		if(flag_row0) {
			for(int j=0;j<n;j++) {
				matrix[0][j]=0;
			}
		}
	}

}
