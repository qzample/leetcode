package com.jiqiyi;

public class Tiku48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		rotate(matrix);
	}
	
	public static void rotate(int[][] matrix) {
		int len = matrix.length;
		// digonal reverse
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				matrix[i][j] = matrix[j][i] + matrix[i][j];
				matrix[j][i] = matrix[i][j] - matrix[j][i];
				matrix[i][j] = matrix[i][j] - matrix[j][i];
			}
		}
		
		// each row reverse
		int head,tail;
		for(int i=0;i<len;i++) {
			head = 0;
			tail = len-1;
			while (head<tail) {
				matrix[i][head] = matrix[i][head] + matrix[i][tail];
				matrix[i][tail] = matrix[i][head] - matrix[i][tail];
				matrix[i][head] = matrix[i][head] - matrix[i][tail];
				head++;
				tail--;
			}
		}
    }

}
