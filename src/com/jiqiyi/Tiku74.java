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
}
