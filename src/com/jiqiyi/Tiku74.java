package com.jiqiyi;

public class Tiku74 {
	public static void main(String[] args) {
		int[][] matrix = {{1,3,5}};
		System.out.println(searchMatrix(matrix, 5));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int row=0;
		// confirm that the number is in which row
		for(int i=0;i<m;i++) {
			if(matrix[i][0]<=target) row=i;
			else break;
		}
		// traverse the row use binary search
		int[] nums = matrix[row];
		int left=0,right=n-1;
		while (left<right) {
			int mid = left+(right-left)/2;
			if(nums[mid]==target) {
				return true;
			}
			else if(nums[mid]<target) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return false;
    }

	/**
	 * the second time to practice
	 * @param matrix
	 * @param target
	 * @return
	 */
	public boolean searchMatrix2(int[][] matrix, int target) {
		if(matrix==null) return false;
		int m = matrix.length;
		int n = matrix[0].length;
		if(m==0 || n==0) return false;
		int row=0,col=n-1;
		while(row<=m-1 && col>=0){
			if(matrix[row][col]<target){
				row++;
			}
			else if(matrix[row][col]>target){
				col--;
			}
			else return true;
		}
		return false;
    }
}
